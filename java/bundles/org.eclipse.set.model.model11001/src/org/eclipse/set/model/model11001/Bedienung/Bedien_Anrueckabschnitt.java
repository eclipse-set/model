/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bedienung;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model11001.Verweise.ID_Gleis_Abschnitt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedien Anrueckabschnitt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Darstellung der Anrückmeldung Auf der Bedienoberfläche wird bei in den Steuerbereich einfahrenden Zügen die Zugnummer oder, wenn diese nicht vorhanden ist, der vom anrückenden Zug belegte Gleisabschnitt angezeigt. Die Anrückmeldung wird aus der ZL generiert. Es wird festgelegt, in der Nähe welchen Gleisabschnittes auf der Bedienoberfläche die Zugnummer bzw. der Gleisabschnitt angezeigt werden soll. Der Gleisabschnitt kann außerhalb des Planungsbereiches liegen. Es muss nicht der direkte Nachbarabschnitt sein, denn z.B. bei Strecken mit hoher Geschwindigkeit wird als Anrückabschnitt auch ein weiter entfernter Gleisabschnitt des Nachbarstellwerks genommen. DB-Regelwerk 819.0603 A2, Tabelle 3, Seite 208 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Anrueckabschnitt#getIDGleisAbschnittPosition <em>ID Gleis Abschnitt Position</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Anrueckabschnitt#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Anrueckabschnitt#getIDGleisAbschnittDarstellen <em>ID Gleis Abschnitt Darstellen</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_Anrueckabschnitt()
 * @model extendedMetaData="name='CBedien_Anrueckabschnitt' kind='elementOnly'"
 * @generated
 */
public interface Bedien_Anrueckabschnitt extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Gleis Abschnitt Position</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe des Gleisabschnitts, in dessen Nähe auf der Bedienoberfläche die Anzeige des darzustellenden Gleisabschnitts (Anrückabschnitt) positioniert werden soll. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Gleis Abschnitt Position</em>' containment reference.
	 * @see #setIDGleisAbschnittPosition(ID_Gleis_Abschnitt_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_Anrueckabschnitt_IDGleisAbschnittPosition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Gleis_Abschnitt_Position'"
	 * @generated
	 */
	ID_Gleis_Abschnitt_TypeClass getIDGleisAbschnittPosition();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Anrueckabschnitt#getIDGleisAbschnittPosition <em>ID Gleis Abschnitt Position</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Gleis Abschnitt Position</em>' containment reference.
	 * @see #getIDGleisAbschnittPosition()
	 * @generated
	 */
	void setIDGleisAbschnittPosition(ID_Gleis_Abschnitt_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle über Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht möglich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es möglich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und Übersichtsplan, BÜ-Lageplan Planungstabellen 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_Anrueckabschnitt_Bezeichnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Anrueckabschnitt#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Bedien_Anrueckabschnitt_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Gleis Abschnitt Darstellen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gleisabschnitt, dessen Belegung auf der Bedien Oberflaeche als Anrückabschnitt dargestellt werden soll. Liegt dieser außerhalb des Planungsbereichs, wird statt des Verweises das Attribut Bez Bed Anrueckabschnitt gefüllt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Gleis Abschnitt Darstellen</em>' containment reference.
	 * @see #setIDGleisAbschnittDarstellen(ID_Gleis_Abschnitt_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_Anrueckabschnitt_IDGleisAbschnittDarstellen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Gleis_Abschnitt_Darstellen'"
	 * @generated
	 */
	ID_Gleis_Abschnitt_TypeClass getIDGleisAbschnittDarstellen();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Anrueckabschnitt#getIDGleisAbschnittDarstellen <em>ID Gleis Abschnitt Darstellen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Gleis Abschnitt Darstellen</em>' containment reference.
	 * @see #getIDGleisAbschnittDarstellen()
	 * @generated
	 */
	void setIDGleisAbschnittDarstellen(ID_Gleis_Abschnitt_TypeClass value);

} // Bedien_Anrueckabschnitt
