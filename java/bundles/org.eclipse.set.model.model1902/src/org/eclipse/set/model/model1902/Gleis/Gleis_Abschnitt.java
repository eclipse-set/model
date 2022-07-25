/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Gleis;

import org.eclipse.set.model.model1902.BasisTypen.Bezeichnung_Element_AttributeGroup;

import org.eclipse.set.model.model1902.Basisobjekte.Bereich_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gleis Abschnitt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abschnitt eines Gleises, welcher als kleinste Einheit betrieblich und technisch verwendet wird. Der Gleisabschnitt wird im Allgemeinen durch zwei Enden begrenzt. Wenn in diesem Gleisabschnitt Weichen, Kreuzungen oder Kreuzungsweichen enthalten sind, entstehen weitere Enden. Diese werden in der Regel nur dann definiert, wenn technische Anlagen zur Gleisfreimeldung vorhanden sind. Der Begriff Weichenabschnitt wird wegen Mehrdeutigkeit im Modell nicht verwendet. Ein Gleisabschnitt kann mittels technischer Anlagen (abgebildet im Objekt FMA Anlage) auf Freisein überwacht werden. Der Gleisabschnitt als Bereich_Objekt muss an seinen Grenzen genau mit dem Punkt_Objekt FMA Element übereinstimmen. Rundungsfehler bei der Berechnung sind zu beachten! 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Gleis.Gleis_Abschnitt#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Gleis.Gleis_Abschnitt#getGeschwindigkeit <em>Geschwindigkeit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Gleis.GleisPackage#getGleis_Abschnitt()
 * @model extendedMetaData="name='CGleis_Abschnitt' kind='elementOnly'"
 * @generated
 */
public interface Gleis_Abschnitt extends Bereich_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle über Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht möglich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es möglich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und Übersichtsplan, BÜ-Lageplan Planungstabellen 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Bezeichnung_Element_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Gleis.GleisPackage#getGleis_Abschnitt_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Bezeichnung_Element_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Gleis.Gleis_Abschnitt#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Bezeichnung_Element_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Geschwindigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Geschwindigkeit, die für einen Gleisabschnitt festgelegt wird, um die Signalisierung für Zugfahrten zu beeinflussen. Das Attribut wird nur dann verwendet, wenn die zu signalisierende Geschwindigkeit nicht über andere Objekte (z. B. Weichen) abgebildet werden kann. Die Geschwindigkeit ist nicht richtungsabhängig und nicht die VzG-Geschwindigkeit. Siehe auch Bildung der Signalbegriffe. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geschwindigkeit</em>' containment reference.
	 * @see #setGeschwindigkeit(Geschwindigkeit_TypeClass)
	 * @see org.eclipse.set.model.model1902.Gleis.GleisPackage#getGleis_Abschnitt_Geschwindigkeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Geschwindigkeit'"
	 * @generated
	 */
	Geschwindigkeit_TypeClass getGeschwindigkeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Gleis.Gleis_Abschnitt#getGeschwindigkeit <em>Geschwindigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geschwindigkeit</em>' containment reference.
	 * @see #getGeschwindigkeit()
	 * @generated
	 */
	void setGeschwindigkeit(Geschwindigkeit_TypeClass value);

} // Gleis_Abschnitt
