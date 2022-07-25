/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Schluesselabhaengigkeiten;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schluessel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Sicherungstechnisches Element zur Herstellung von Schlüsselabhängigkeiten über Schlösser an Elementen. Der Schlüssel im sicherungstechnischen Sinn ist ein repräsentativer und innerhalb einer Örtlichkeit einmaliger Gegenstand. Durch den Besitz des Schlüssels kann sicher und eindeutig auf einen bestimmten Anlagenzustand geschlossen werden. Somit können durch Verknüpfung mit weiteren Fahrwegelementen oder einer informationsverarbeitenden Einheit sichere Abhängigkeiten geschaffen werden. In der Regel gibt es örtlich immer zwei gleich schließende Schlösser, selten mehr. Wird eine Schlüsselsperre nur als Schalter benutzt (z. B. um Fahrstraßen zu sperren), gibt es zu einem Schlüssel nur ein Schloss. Um die örtliche Einmaligkeit herzustellen, darf eine Schlüsselform nur einmal innerhalb einer Betriebsstelle oder besser noch eines Streckenabschnitts verwendet werden. Dazu sind 24 verschiedene Schlüsselbartformen vorhanden, die mit sechs Schlüsselgruppen kombiniert werden können. Nicht jede Bartform wird mit jeder Gruppe kombiniert. So stehen insgesamt 92 verschiedene Schlüsselformen zur Verfügung. DB-Regelwerk Die Planung der Schlüsselformen ist bisher nicht Bestandteil des PT1. Für die Formen existieren Regelzeichnungen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schluessel#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schluessel#getSchluesselAllg <em>Schluessel Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchluessel()
 * @model extendedMetaData="name='CSchluessel' kind='elementOnly'"
 * @generated
 */
public interface Schluessel extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle über Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht möglich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es möglich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und Übersichtsplan, BÜ-Lageplan Planungstabellen 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Schluessel_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchluessel_Bezeichnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Schluessel_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schluessel#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Schluessel_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Schluessel Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schluessel Allg</em>' containment reference.
	 * @see #setSchluesselAllg(Schluessel_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchluessel_SchluesselAllg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Schluessel_Allg'"
	 * @generated
	 */
	Schluessel_Allg_AttributeGroup getSchluesselAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schluessel#getSchluesselAllg <em>Schluessel Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schluessel Allg</em>' containment reference.
	 * @see #getSchluesselAllg()
	 * @generated
	 */
	void setSchluesselAllg(Schluessel_Allg_AttributeGroup value);

} // Schluessel
