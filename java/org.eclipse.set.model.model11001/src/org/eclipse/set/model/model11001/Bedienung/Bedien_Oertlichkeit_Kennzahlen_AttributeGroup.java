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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedien Oertlichkeit Kennzahlen Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Oertlichkeit_Kennzahlen_AttributeGroup#getBetriebsstellenbezeichner <em>Betriebsstellenbezeichner</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Oertlichkeit_Kennzahlen_AttributeGroup#getKennzahl <em>Kennzahl</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_Oertlichkeit_Kennzahlen_AttributeGroup()
 * @model extendedMetaData="name='CBedien_Oertlichkeit_Kennzahlen' kind='elementOnly'"
 * @generated
 */
public interface Bedien_Oertlichkeit_Kennzahlen_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Betriebsstellenbezeichner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung der Betriebsstellenbezeichner und somit der Ausfahrziele, die vom Nutzer vorzugeben ist. Da eine ESTW Zentraleinheit mehrere Örtlichkeiten bedienen kann (siehe Kennzahl), ist es möglich, dass eine Kennzahl unterschiedliche Betriebsstellen als Ausfahrziele anfahren kann. Daher muss hier der Betriebsstellenbezeichner extra erfasst werden. DB-Regelwerk 819.0603 Anhang 3 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Betriebsstellenbezeichner</em>' containment reference.
	 * @see #setBetriebsstellenbezeichner(Betriebsstellenbezeichner_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_Oertlichkeit_Kennzahlen_AttributeGroup_Betriebsstellenbezeichner()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Betriebsstellenbezeichner'"
	 * @generated
	 */
	Betriebsstellenbezeichner_TypeClass getBetriebsstellenbezeichner();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Oertlichkeit_Kennzahlen_AttributeGroup#getBetriebsstellenbezeichner <em>Betriebsstellenbezeichner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Betriebsstellenbezeichner</em>' containment reference.
	 * @see #getBetriebsstellenbezeichner()
	 * @generated
	 */
	void setBetriebsstellenbezeichner(Betriebsstellenbezeichner_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Kennzahl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eindeutige Kennzahl der Sicherungstechnik bzw. operativen Leittechnik innerhalb eines Bedienbezirks für eine Betriebsstelle. Die ESTW-Kennzahl kennzeichnet eine Betriebsstelle oder einen Betriebsstellenteil. Sie darf nicht mit der Bahnhofsnummer der Zugnummernmeldeanlage (Ril 819.0731) verwechselt werden. Die Kennzahl wird im Elementnamen verwendet. Zuteilung Eine Betriebsstelle kann mehrere Kennzahlen erhalten; vor allem dann, wenn es sich um eine Betriebsstelle mit vielen Elementen handelt. Durch den LST-Planer werden die Gebiete der Kennzahlen sinnvoll aufgeteilt. Eine weitere Möglichkeit besteht darin, dass in einem Gebäude zwei ESTW-Zentraleinheiten untergebracht sind (Beispiel: Hannover Hbf mit den ESTW-Zentraleinheiten „HH Kennzahl 06“ und „HHZX Kennzahl 30“). Eine Kennzahl kann aber auch mehrere Betriebsstellen beinhalten, insbesondere bei Betriebsstellen mit wenigen Elementen. Dies kommt zur Anwendung, wenn eine ESTW-Zentraleinheit zwei Überleitstellen steuert (Beispiel: ESTW-Zentraleinheit Giften HGIF Kennzahl 71 mit „Üst Giften HGIF“ und „Üst Ritterkamp HRIT“. In Stellbereichen von Bedienbezirken werden für Betriebsstellen (z. B. Bahnhöfe, Abzweigstellen, Anschlussstellen) Kennzahlen von 01 bis 99 vergeben. Diese Kennzahl muss im Bedienbezirk eindeutig sein. Eindeutigkeit der Kennzahlen bei angrenzenden Bedienbezirken entlang einer Strecke Innerhalb eines Bedienbezirks und für benachbarte Betriebsstellen eines angrenzenden Bedienbezirks entlang einer Strecke darf eine Kennzahl nur einmal verwendet werden. Beispiel: Media:Bedien Oertlichkeit Kennzahl 131121.pdf Für alle im jeweiligen Bereich befindlichen Stellelemente der Betriebsstellen und Strecken wird die Kennzahl Bestandteil der ausführlichen Elementbezeichnung. Hierdurch erübrigt sich in einem größeren Bereich der Infrastruktur die Mitführung eines Ortsbezeichners. Zentrale Vergabe von Kennzahlen auch ohne Anbindung an Bedien_Zentralen Unabnhängig ob eine ESTW-Zentraleinheit aus einer Bedien_Zentrale gesteuert wird oder nur örtlich eingerichtet ist, soll die Kennzahlenvergabe zentral im Sinne einer möglichen Konzentration von ESTW-Zentraleinheiten in Bedienbezirken geplant und vergeben werden. DB-Regelwerk Kennzahltabelle oder Kennzahelnübersichtsplan im PT 1, 819.0603 2, 819.9001 1 (5). 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kennzahl</em>' containment reference.
	 * @see #setKennzahl(Kennzahl_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_Oertlichkeit_Kennzahlen_AttributeGroup_Kennzahl()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Kennzahl'"
	 * @generated
	 */
	Kennzahl_TypeClass getKennzahl();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Oertlichkeit_Kennzahlen_AttributeGroup#getKennzahl <em>Kennzahl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kennzahl</em>' containment reference.
	 * @see #getKennzahl()
	 * @generated
	 */
	void setKennzahl(Kennzahl_TypeClass value);

} // Bedien_Oertlichkeit_Kennzahlen_AttributeGroup
