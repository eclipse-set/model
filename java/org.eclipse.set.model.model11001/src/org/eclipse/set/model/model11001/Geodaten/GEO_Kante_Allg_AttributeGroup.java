/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Geodaten;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GEO Kante Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Geodaten.GEO_Kante_Allg_AttributeGroup#getGEOForm <em>GEO Form</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Geodaten.GEO_Kante_Allg_AttributeGroup#getGEOKAD <em>GEOKAD</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Geodaten.GEO_Kante_Allg_AttributeGroup#getGEOLaenge <em>GEO Laenge</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Geodaten.GEO_Kante_Allg_AttributeGroup#getGEORadiusA <em>GEO Radius A</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Geodaten.GEO_Kante_Allg_AttributeGroup#getGEORadiusB <em>GEO Radius B</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Geodaten.GEO_Kante_Allg_AttributeGroup#getGEORichtungswinkel <em>GEO Richtungswinkel</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Geodaten.GEO_Kante_Allg_AttributeGroup#getPlanQuelle <em>Plan Quelle</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Geodaten.GeodatenPackage#getGEO_Kante_Allg_AttributeGroup()
 * @model extendedMetaData="name='CGEO_Kante_Allg' kind='elementOnly'"
 * @generated
 */
public interface GEO_Kante_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>GEO Form</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beschreibung der geometrischen Form der Gleis-Kante. In Abhängigkeit von der Geo_Form werden die Attribute GEO Radius A und GEO Radius B mit entsprechenden Werten befüllt oder bleiben LEER. Beispiel: GEO_Form: Gerade GEO_Radius_A = LEER GEO_Radius_B = LEER GEO_Form: BOGEN GEO_Radius_A = Radius GEO_Radius_B = LEER 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GEO Form</em>' containment reference.
	 * @see #setGEOForm(GEO_Form_TypeClass)
	 * @see org.eclipse.set.model.model11001.Geodaten.GeodatenPackage#getGEO_Kante_Allg_AttributeGroup_GEOForm()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GEO_Form'"
	 * @generated
	 */
	GEO_Form_TypeClass getGEOForm();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Geodaten.GEO_Kante_Allg_AttributeGroup#getGEOForm <em>GEO Form</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GEO Form</em>' containment reference.
	 * @see #getGEOForm()
	 * @generated
	 */
	void setGEOForm(GEO_Form_TypeClass value);

	/**
	 * Returns the value of the '<em><b>GEOKAD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung der topografischen Kantenadresse. Aktuell ist eine Verwendung bei der Übernahme von Trassierungsdaten (ASCIBAHN) vorgesehen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GEOKAD</em>' containment reference.
	 * @see #setGEOKAD(GEO_KAD_TypeClass)
	 * @see org.eclipse.set.model.model11001.Geodaten.GeodatenPackage#getGEO_Kante_Allg_AttributeGroup_GEOKAD()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GEO_KAD'"
	 * @generated
	 */
	GEO_KAD_TypeClass getGEOKAD();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Geodaten.GEO_Kante_Allg_AttributeGroup#getGEOKAD <em>GEOKAD</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GEOKAD</em>' containment reference.
	 * @see #getGEOKAD()
	 * @generated
	 */
	void setGEOKAD(GEO_KAD_TypeClass value);

	/**
	 * Returns the value of the '<em><b>GEO Laenge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Länge der GEO Kante. Die Länge wird aus den DB-GIS-Daten oder einem Trassierungsentwurf mit der dort vorhandenen Genauigkeit entnommen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GEO Laenge</em>' containment reference.
	 * @see #setGEOLaenge(GEO_Laenge_TypeClass)
	 * @see org.eclipse.set.model.model11001.Geodaten.GeodatenPackage#getGEO_Kante_Allg_AttributeGroup_GEOLaenge()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GEO_Laenge'"
	 * @generated
	 */
	GEO_Laenge_TypeClass getGEOLaenge();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Geodaten.GEO_Kante_Allg_AttributeGroup#getGEOLaenge <em>GEO Laenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GEO Laenge</em>' containment reference.
	 * @see #getGEOLaenge()
	 * @generated
	 */
	void setGEOLaenge(GEO_Laenge_TypeClass value);

	/**
	 * Returns the value of the '<em><b>GEO Radius A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zugehörige Parameter für die GEO_Form Gerade: kein zusätzlicher Parameter erforderlich oder 0.00000 angeben; Bogen: GEO_Radius_A enthält den Radius (Anfangsradius = Endradius) in [m]; Richtgerade Knick am Ende: GEO_Radius_A enthält den Brechungswinkel am Ende in [gon]; Alle anderen Kanten: GEO_Radius_A enthält den Anfangsradius in [m]. In Abhängigkeit der Bogenrichtung am GEO_Knoten_A wird der Radius bei einem Linksbogen negativ und bei einem Rechtsbogen positiv angegeben. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GEO Radius A</em>' containment reference.
	 * @see #setGEORadiusA(GEO_Radius_A_TypeClass)
	 * @see org.eclipse.set.model.model11001.Geodaten.GeodatenPackage#getGEO_Kante_Allg_AttributeGroup_GEORadiusA()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GEO_Radius_A'"
	 * @generated
	 */
	GEO_Radius_A_TypeClass getGEORadiusA();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Geodaten.GEO_Kante_Allg_AttributeGroup#getGEORadiusA <em>GEO Radius A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GEO Radius A</em>' containment reference.
	 * @see #getGEORadiusA()
	 * @generated
	 */
	void setGEORadiusA(GEO_Radius_A_TypeClass value);

	/**
	 * Returns the value of the '<em><b>GEO Radius B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zugehörige Parameter für die GEO_Form Gerade: kein zusätzlicher Parameter; Bogen: kein zusätzlicher Parameter; Richtgerade Knick am Ende: kein zusätzlicher Parameter; Alle anderen Kanten: GEO_Bogen_B enthält den Endradius in [m]. In Abhängigkeit der Bogenrichtung am GEO_Knoten_A wird der Radius bei einem Linksbogen negativ und bei einem Rechtsbogen positiv angegeben. Die Bogenrichtung ist immer identisch zum GEO_Radius_A. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GEO Radius B</em>' containment reference.
	 * @see #setGEORadiusB(GEO_Radius_B_TypeClass)
	 * @see org.eclipse.set.model.model11001.Geodaten.GeodatenPackage#getGEO_Kante_Allg_AttributeGroup_GEORadiusB()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GEO_Radius_B'"
	 * @generated
	 */
	GEO_Radius_B_TypeClass getGEORadiusB();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Geodaten.GEO_Kante_Allg_AttributeGroup#getGEORadiusB <em>GEO Radius B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GEO Radius B</em>' containment reference.
	 * @see #getGEORadiusB()
	 * @generated
	 */
	void setGEORadiusB(GEO_Radius_B_TypeClass value);

	/**
	 * Returns the value of the '<em><b>GEO Richtungswinkel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameter für eine GEO Kante, der den Bezugswinkel (Tangente) am Anfang einer GEO_Kante darstellt. Das Attribut GEO_Richtungswinkel enthält den Richtungswinkel der Geo-Kante am Anfang in [gon]. Es gilt nachfolgende Zuordnung der Richtung: Nord = 0,0 gon Ost = 100,0 gon Süd = 200,0 gon West = 300,0 gon originale negative Werte werden durch Addition von 400.0 gon normalisiert. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GEO Richtungswinkel</em>' containment reference.
	 * @see #setGEORichtungswinkel(GEO_Richtungswinkel_TypeClass)
	 * @see org.eclipse.set.model.model11001.Geodaten.GeodatenPackage#getGEO_Kante_Allg_AttributeGroup_GEORichtungswinkel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GEO_Richtungswinkel'"
	 * @generated
	 */
	GEO_Richtungswinkel_TypeClass getGEORichtungswinkel();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Geodaten.GEO_Kante_Allg_AttributeGroup#getGEORichtungswinkel <em>GEO Richtungswinkel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GEO Richtungswinkel</em>' containment reference.
	 * @see #getGEORichtungswinkel()
	 * @generated
	 */
	void setGEORichtungswinkel(GEO_Richtungswinkel_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Plan Quelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quelle der Geo-Kante, des Geo-Knotens, des Höhenpunkts, der Höhenlinie, der Überhöhung bzw. der Überhöhungslinie. Bei Auswahl von „sonstige“ ist zwingend ein Bearbeitungsvermerk anzugeben. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plan Quelle</em>' containment reference.
	 * @see #setPlanQuelle(Plan_Quelle_TypeClass)
	 * @see org.eclipse.set.model.model11001.Geodaten.GeodatenPackage#getGEO_Kante_Allg_AttributeGroup_PlanQuelle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Plan_Quelle'"
	 * @generated
	 */
	Plan_Quelle_TypeClass getPlanQuelle();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Geodaten.GEO_Kante_Allg_AttributeGroup#getPlanQuelle <em>Plan Quelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan Quelle</em>' containment reference.
	 * @see #getPlanQuelle()
	 * @generated
	 */
	void setPlanQuelle(Plan_Quelle_TypeClass value);

} // GEO_Kante_Allg_AttributeGroup
