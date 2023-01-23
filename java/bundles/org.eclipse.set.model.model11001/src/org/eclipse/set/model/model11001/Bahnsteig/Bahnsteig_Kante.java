/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bahnsteig;

import org.eclipse.set.model.model11001.Basisobjekte.Bereich_Objekt;

import org.eclipse.set.model.model11001.Verweise.ID_Bahnsteig_Anlage_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bahnsteig Kante</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Parallel zum Gleis verlaufende Kante eines Bahnsteigs, die für den Fahrgastwechsel nutzbar ist (Nettobaulänge). Für die LST-Planung sind Beginn und Ende z. B. für die Zugbeeinflussung (PZB 90) sowie die Festlegung von Signalstandorten und Gefahrpunkten maßgebend. Die Nettobaulänge der Bahnsteigkante wird im Datenmodell durch die Länge des Bereichsobjekts Bahnsteig_Kante abgebildet. Eventuell daran anschließende Tiefbauobjekte (auch stillgelegte Bahnsteigbereiche) können als Ingenieurbauwerke (Technischer_Bereich) abgebildet werden. DB-Regelwerk Darstellung einer Doppellinie im sicherungstechnischen Lageplan, Ril 413.0507
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Kante#getBahnsteigKanteAllg <em>Bahnsteig Kante Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Kante#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Kante#getIDBahnsteigAnlage <em>ID Bahnsteig Anlage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Bahnsteig.BahnsteigPackage#getBahnsteig_Kante()
 * @model extendedMetaData="name='CBahnsteig_Kante' kind='elementOnly'"
 * @generated
 */
public interface Bahnsteig_Kante extends Bereich_Objekt {
	/**
	 * Returns the value of the '<em><b>Bahnsteig Kante Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bahnsteig Kante Allg</em>' containment reference.
	 * @see #setBahnsteigKanteAllg(Bahnsteig_Kante_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Bahnsteig.BahnsteigPackage#getBahnsteig_Kante_BahnsteigKanteAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bahnsteig_Kante_Allg'"
	 * @generated
	 */
	Bahnsteig_Kante_Allg_AttributeGroup getBahnsteigKanteAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Kante#getBahnsteigKanteAllg <em>Bahnsteig Kante Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bahnsteig Kante Allg</em>' containment reference.
	 * @see #getBahnsteigKanteAllg()
	 * @generated
	 */
	void setBahnsteigKanteAllg(Bahnsteig_Kante_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle über Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht möglich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es möglich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und Übersichtsplan, BÜ-Lageplan Planungstabellen 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Bahnsteig_Kante_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Bahnsteig.BahnsteigPackage#getBahnsteig_Kante_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Bahnsteig_Kante_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Kante#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Bahnsteig_Kante_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Bahnsteig Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung einer Bahnsteigkante oder eines Bahnsteigzugangs zu einer Bahnsteiganlage. DB-Regelwerk Zusammenhang wird aus der Darstellung im sicherungstechnischen Lageplan ersichtlich
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Bahnsteig Anlage</em>' containment reference.
	 * @see #setIDBahnsteigAnlage(ID_Bahnsteig_Anlage_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bahnsteig.BahnsteigPackage#getBahnsteig_Kante_IDBahnsteigAnlage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Bahnsteig_Anlage'"
	 * @generated
	 */
	ID_Bahnsteig_Anlage_TypeClass getIDBahnsteigAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Kante#getIDBahnsteigAnlage <em>ID Bahnsteig Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Bahnsteig Anlage</em>' containment reference.
	 * @see #getIDBahnsteigAnlage()
	 * @generated
	 */
	void setIDBahnsteigAnlage(ID_Bahnsteig_Anlage_TypeClass value);

} // Bahnsteig_Kante
