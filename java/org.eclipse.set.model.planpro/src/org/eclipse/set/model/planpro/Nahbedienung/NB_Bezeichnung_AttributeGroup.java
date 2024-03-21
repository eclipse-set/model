/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Nahbedienung;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NB Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Bezeichnung_AttributeGroup#getBezeichnungNB <em>Bezeichnung NB</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Bezeichnung_AttributeGroup#getKennzahl <em>Kennzahl</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Nahbedienung.NahbedienungPackage#getNB_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CNB_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface NB_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung NB</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Numerische Bezeichnung des Nahstellbereichs. Die Bezeichnung des Nahstellbereichs gemäß Ril 819.9001 (z. B. 99NB1) wird aus der Kennzahl von Bezeichnung Element, dem Kürzel NB (generiert aus der Anlegung der Instanz „NB“) und der NB_Bezeichnung zusammengesetzt. Das Attribut NB_Bezeichnung wurde trotz Nutzung der Basisattributgruppe Bezeichnung geschaffen, da die numerische Bezeichnung des NB (z. B. \"1\") kein örtlicher Elementbezeichner ist. DB-Regelwerk 819.9001 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung NB</em>' containment reference.
	 * @see #setBezeichnungNB(Bezeichnung_NB_TypeClass)
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NahbedienungPackage#getNB_Bezeichnung_AttributeGroup_BezeichnungNB()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_NB'"
	 * @generated
	 */
	Bezeichnung_NB_TypeClass getBezeichnungNB();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Bezeichnung_AttributeGroup#getBezeichnungNB <em>Bezeichnung NB</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung NB</em>' containment reference.
	 * @see #getBezeichnungNB()
	 * @generated
	 */
	void setBezeichnungNB(Bezeichnung_NB_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Kennzahl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eindeutige Kennzahl der operativen Sicherungstechnik innerhalb eines Bedienbezirks für eine Betriebsstelle.
	 * 
	 * Die ESTW-Kennzahl kennzeichnet eine Betriebsstelle oder einen Betriebsstellenteil. Es handelt sich nicht um die Bahnhofsnummer der Zugnummernmeldeanlage (Ril 819.0731)!
	 * 
	 * Eine Betriebsstelle kann mehrere Kennzahlen erhalten. Z.B. dann, wenn in einem Gebäude zwei ESTW-Zentraleinheiten untergebracht sind (Beispiel Hannover Hbf mit den ESTW-Zentraleinheiten „HH Kennzahl 06“ und „HHZX Kennzahl 30“).
	 * 
	 * Eine Kennzahl kann aber auch mehrere Betriebsstellen beinhalten. Z. B dann, wenn eine ESTW-Zentraleinheit zwei Überleitstellen steuert (Beispiel ESTW-Zentraleinheit Giften HGIF Kennzahl 71 mit „Üst Giften HGIF“ und „Üst Ritterkamp HRIT“.
	 * 
	 * In Stellbereichen von Bedienbezirken werden für Betriebsstellen (z. B. Bahnhöfe, Abzweigstellen, Anschlussstellen) Kennzahlen von 01 bis 99 vergeben. Diese Kennzahl muss im Bedienbezirk eindeutig sein.
	 * 
	 * Eindeutigkeit der Kennzahlen bei angrenzenden Bedienbezirken entlang einer Strecke:
	 * 
	 * Innerhalb eines Bedienbezirks und für benachbarte Betriebsstellen eines angrenzenden Bedienbezirks entlang einer Strecke darf eine Kennzahl nur einmal verwendet werden. Beispiel: Media:Bedien Oertlichkeit Kennzahl 131121.pdf
	 * 
	 * Für alle im jeweiligen Bereich befindlichen Stellelemente der Betriebsstellen und Strecken wird die Kennzahl Bestandteil der ausführlichen Elementbezeichnung. Hierdurch erübrigt sich in einem größeren Bereich der Infrastruktur die Mitführung eines Ortsbezeichners.
	 * 
	 * Zentrale Vergabe von Kennzahlen auch ohne Anbindung an Bedien_Zentralen:
	 * 
	 * Unabnhängig ob eine ESTW-Zentraleinheit aus einer Bedien_Zentrale gesteuert wird oder nur örtlich eingerichtet ist, soll die Kennzahlenvergabe zentral im Sinne einer möglichen Konzentration von ESTW-Zentraleinheiten in Bedienbezirken geplant und vergeben werden. 
	 * 
	 * DB-Regelwerk
	 * • Kennzahltabelle oder Kennzahelnübersichtsplan im PT 1, 
	 * • 819.0603 2, 
	 * • 819.9001 1 (5).
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kennzahl</em>' containment reference.
	 * @see #setKennzahl(Kennzahl_TypeClass)
	 * @see org.eclipse.set.model.planpro.Nahbedienung.NahbedienungPackage#getNB_Bezeichnung_AttributeGroup_Kennzahl()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Kennzahl'"
	 * @generated
	 */
	Kennzahl_TypeClass getKennzahl();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Nahbedienung.NB_Bezeichnung_AttributeGroup#getKennzahl <em>Kennzahl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kennzahl</em>' containment reference.
	 * @see #getKennzahl()
	 * @generated
	 */
	void setKennzahl(Kennzahl_TypeClass value);

} // NB_Bezeichnung_AttributeGroup
