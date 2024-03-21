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

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_GEO_Art_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_GEO_Knoten_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GEO Kante</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Kante des topografischen Knoten-Kanten-Modells. Die GEO_Kante ist vom GEO_Knoten A zum GEO_Knoten B gerichtet (GEO Richtungswinkel) und muss immer an zwei GEO_Knoten enden. Die Länge einer GEO_Kante zwischen den GEO_Knoten A und B entspricht der realen Gleislänge zwischen diesen Knoten und wird im Attribut GEO Laenge gespeichert. Mit Bezug auf die Regeln zu den Gleisnetzdaten (GND) ist die Länge einer GEO_Kante stets kleiner 10 km. Eine GEO_Kante besitzt eine geometrische Form, die durch GEO Form beschrieben wird. GEO_Kanten werden für die Abbildung der Gleislinie und der Kilometrierungslinie verwendet. Eine Unterscheidung dieser Anwendung erfolgt durch den Verweis ID GEO Art. Der GEO_Radius (GEO Radius A und GEO Radius B) ist negativ, wenn die GEO_Kante vom GEO_Knoten_A in einem Linksbogen führt und ist positiv, wenn diese in einen Rechtsbogen führt. Die beiden Radien sind jeweils der Radius an der A- bzw. B-Seite der GEO_Kante. Bei einem Kreisbogen wird nur der GEO Radius A angegeben. Für eine Gerade wird dieser Radius mit 0.000 definiert. Ein Algorithmus zur Darstellung eines Punktes auf einem Übergangsbogen kann der folgenden Literaturquelle entnommen werden: Media:Literatur Uebergangsbogen.pdf. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.GEO_Kante#getGEOKanteAllg <em>GEO Kante Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.GEO_Kante#getIDGEOArt <em>IDGEO Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.GEO_Kante#getIDGEOKnotenA <em>IDGEO Knoten A</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.GEO_Kante#getIDGEOKnotenB <em>IDGEO Knoten B</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getGEO_Kante()
 * @model extendedMetaData="name='CGEO_Kante' kind='elementOnly'"
 * @generated
 */
public interface GEO_Kante extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>GEO Kante Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GEO Kante Allg</em>' containment reference.
	 * @see #setGEOKanteAllg(GEO_Kante_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getGEO_Kante_GEOKanteAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GEO_Kante_Allg'"
	 * @generated
	 */
	GEO_Kante_Allg_AttributeGroup getGEOKanteAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.GEO_Kante#getGEOKanteAllg <em>GEO Kante Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GEO Kante Allg</em>' containment reference.
	 * @see #getGEOKanteAllg()
	 * @generated
	 */
	void setGEOKanteAllg(GEO_Kante_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDGEO Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Durch den Verweis auf eine TOP_Kante wird die GEO_Kante als Gleislinie, beim Verweis auf eine Strecke als Kilometrierungslinie und beim Verweis auf eine Trasse_Kante als Kabel- bzw. Medientrassenlinie definiert. Der Startpunkt einer TOP-Kante ist über die Verweise auf einen TOP-Knoten A und anschließend auf einen GEO-Knoten A oder GEO-Knoten B identifizierbar. Wenn der Verweis auf GEO-Knoten A fällt, liegt der Verlauf der GEO-Kante in Richtung der TOP-Kante, andernfalls in Gegenrichtung. Weitere GEO-Kanten werden mit End- und Anfangs-Knoten verbunden, bis auf den End-Knoten einer GEO-Kante wiederum von einem TOP-Knoten B verwiesen wird. DIe Verfahrensweise ist bei Trassen-Kanten analog.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDGEO Art</em>' containment reference.
	 * @see #setIDGEOArt(ID_GEO_Art_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getGEO_Kante_IDGEOArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_GEO_Art'"
	 * @generated
	 */
	ID_GEO_Art_TypeClass getIDGEOArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.GEO_Kante#getIDGEOArt <em>IDGEO Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDGEO Art</em>' containment reference.
	 * @see #getIDGEOArt()
	 * @generated
	 */
	void setIDGEOArt(ID_GEO_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDGEO Knoten A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den GEO Knoten am Anfang der GEO Kante. Durch die Angabe des Anfangs- sowie des Endknotens wird die Richtung der GEO Kante definiert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDGEO Knoten A</em>' containment reference.
	 * @see #setIDGEOKnotenA(ID_GEO_Knoten_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getGEO_Kante_IDGEOKnotenA()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_GEO_Knoten_A'"
	 * @generated
	 */
	ID_GEO_Knoten_TypeClass getIDGEOKnotenA();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.GEO_Kante#getIDGEOKnotenA <em>IDGEO Knoten A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDGEO Knoten A</em>' containment reference.
	 * @see #getIDGEOKnotenA()
	 * @generated
	 */
	void setIDGEOKnotenA(ID_GEO_Knoten_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDGEO Knoten B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den GEO Knoten am Ende der GEO Kante. Durch die Angabe des Anfangs- sowie des Endknotens wird die Richtung der GEO Kante definiert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDGEO Knoten B</em>' containment reference.
	 * @see #setIDGEOKnotenB(ID_GEO_Knoten_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getGEO_Kante_IDGEOKnotenB()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_GEO_Knoten_B'"
	 * @generated
	 */
	ID_GEO_Knoten_TypeClass getIDGEOKnotenB();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.GEO_Kante#getIDGEOKnotenB <em>IDGEO Knoten B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDGEO Knoten B</em>' containment reference.
	 * @see #getIDGEOKnotenB()
	 * @generated
	 */
	void setIDGEOKnotenB(ID_GEO_Knoten_TypeClass value);

} // GEO_Kante
