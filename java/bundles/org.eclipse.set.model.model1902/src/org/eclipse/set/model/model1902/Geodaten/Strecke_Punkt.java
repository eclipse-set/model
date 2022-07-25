/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Geodaten;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_GEO_Knoten_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Strecke_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strecke Punkt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Topologischer Punkt auf der zugehörigen Streckenlinie mit dem Wert der Streckenkilometrierung in Meterschreibweise. Der Streckenpunkt kann auf einen GEO Knoten verweisen, der über einen (oder mehrere) GEO_Punkte geografisch referenziert wird. Ohne diesen Verweis wird der Streckenpunkt nur auf eine Strecke mit Streckenkilometer referenziert. Die GEO Knoten sind über GEO_Kanten untereinander verbunden und beschreiben in ihrer Gesamtheit eine Streckenlinie. Jede Strecke hat mindestens zwei Streckenpunkte als Anfang und Ende der Strecke. Der GEO Knoten am Anfang bzw. am Ende einer Streckenlinie hat nur eine GEO Kante, ansonsten sind es zwei. An einem Kilometersprung werden zwei Streckenpunkte (ggf. mit identischen GEO-Koordinaten) gebildet. Die Länge der verbindende GEO_Kante (- oder +) beinhaltet den Wert des Kilometersprunges. Eine Überlänge ist negativ, eine Fehllänge ist positiv.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.Strecke_Punkt#getIDGEOKnoten <em>IDGEO Knoten</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.Strecke_Punkt#getIDStrecke <em>ID Strecke</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.Strecke_Punkt#getStreckeMeter <em>Strecke Meter</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage#getStrecke_Punkt()
 * @model extendedMetaData="name='CStrecke_Punkt' kind='elementOnly'"
 * @generated
 */
public interface Strecke_Punkt extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDGEO Knoten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ID des GEO_Knoten, auf den der Strecke_Punkt verweist. Der Verweis ist nur zu befüllen, wenn auch eine Streckenlinie mit GEO-Daten vorhanden ist. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDGEO Knoten</em>' containment reference.
	 * @see #setIDGEOKnoten(ID_GEO_Knoten_TypeClass)
	 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage#getStrecke_Punkt_IDGEOKnoten()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_GEO_Knoten'"
	 * @generated
	 */
	ID_GEO_Knoten_TypeClass getIDGEOKnoten();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Geodaten.Strecke_Punkt#getIDGEOKnoten <em>IDGEO Knoten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDGEO Knoten</em>' containment reference.
	 * @see #getIDGEOKnoten()
	 * @generated
	 */
	void setIDGEOKnoten(ID_GEO_Knoten_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Strecke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung eines Streckenpunktes zu einer Streckennummer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Strecke</em>' containment reference.
	 * @see #setIDStrecke(ID_Strecke_TypeClass)
	 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage#getStrecke_Punkt_IDStrecke()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Strecke'"
	 * @generated
	 */
	ID_Strecke_TypeClass getIDStrecke();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Geodaten.Strecke_Punkt#getIDStrecke <em>ID Strecke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Strecke</em>' containment reference.
	 * @see #getIDStrecke()
	 * @generated
	 */
	void setIDStrecke(ID_Strecke_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Strecke Meter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kilometer an einem Knoten der Streckenlinie in Meterschreibweise. Dieses Attribut ist für jeden Streckenpunkt zu befüllen. Im Datenmodell sind die Werte als TMeter mit 3 Nachkommastellen abgespeichert (Genauigkeit für Darstellung in CAD-Systemen: Tausendstel m = 1 mm).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strecke Meter</em>' containment reference.
	 * @see #setStreckeMeter(Strecke_Meter_TypeClass)
	 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage#getStrecke_Punkt_StreckeMeter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Strecke_Meter'"
	 * @generated
	 */
	Strecke_Meter_TypeClass getStreckeMeter();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Geodaten.Strecke_Punkt#getStreckeMeter <em>Strecke Meter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strecke Meter</em>' containment reference.
	 * @see #getStreckeMeter()
	 * @generated
	 */
	void setStreckeMeter(Strecke_Meter_TypeClass value);

} // Strecke_Punkt
