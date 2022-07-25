/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bahnuebergang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUE Anlage Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Allg_AttributeGroup#getBUEBauart <em>BUE Bauart</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Allg_AttributeGroup#getBUEBuestra <em>BUE Buestra</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Allg_AttributeGroup#getBUEMitGFR <em>BUE Mit GFR</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Allg_AttributeGroup#getBUESicherungsart <em>BUE Sicherungsart</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Allg_AttributeGroup#getBUEStrasse <em>BUE Strasse</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Allg_AttributeGroup#getBUETechnik <em>BUE Technik</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_Allg_AttributeGroup()
 * @model extendedMetaData="name='CBUE_Anlage_Allg' kind='elementOnly'"
 * @generated
 */
public interface BUE_Anlage_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>BUE Bauart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der Bauart des Bahnübergang (BÜ). Folgende Unterscheidungen werden vorgenommen: BÜ: BÜ nach Ril 815 mit oder ohne technische Sicherung; Bau-BÜ: zeitlich begrenzte Anordnung eines BÜ, meist zur Anbindung eines Baufeldes in Insellage; Resi: Übergang für die Sicherung von Bahnsteigzugängen für Reisende (Reisendensicherung), die höhengleich über das Gleis führen; im Zusammenhang mit der signaltechnischen Ausrüstung des Gleises, an dem die Resi angeordnet wird, gelten besondere Anforderungen. Nach EBO gelten Resi nicht als Bahnübergang, werden in PlanPro aber abweichend von der EBO als Bahnübergang modelliert. DB-Regelwerk Für BÜ und Resi gelten unterschiedliche Vorschriften zur Auslegung und Berechnung. BÜ: Ril 815 Resi: Ril 413 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BUE Bauart</em>' containment reference.
	 * @see #setBUEBauart(BUE_Bauart_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_Allg_AttributeGroup_BUEBauart()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='BUE_Bauart'"
	 * @generated
	 */
	BUE_Bauart_TypeClass getBUEBauart();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Allg_AttributeGroup#getBUEBauart <em>BUE Bauart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BUE Bauart</em>' containment reference.
	 * @see #getBUEBauart()
	 * @generated
	 */
	void setBUEBauart(BUE_Bauart_TypeClass value);

	/**
	 * Returns the value of the '<em><b>BUE Buestra</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Für die BÜ-Anlage besteht eine Abhängigkeit zur Lichtzeichenanlage einer benachbarten Straßenkreuzung/-einmündung. Das Attribut wird nur befüllt, wenn eine Abhängigkeit zu einer Lichtzeichenanlage besteht. DB-Regelwerk 815.0051 \"Richtlinien über Abhängigkeiten zwischen der technischen Sicherung von Bahnübergängen und der Verkehrsregelung an benachbarten Straßenkreuzungen und -einmündungen (BÜSTRA)\" 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BUE Buestra</em>' containment reference.
	 * @see #setBUEBuestra(BUE_Buestra_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_Allg_AttributeGroup_BUEBuestra()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BUE_Buestra'"
	 * @generated
	 */
	BUE_Buestra_TypeClass getBUEBuestra();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Allg_AttributeGroup#getBUEBuestra <em>BUE Buestra</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BUE Buestra</em>' containment reference.
	 * @see #getBUEBuestra()
	 * @generated
	 */
	void setBUEBuestra(BUE_Buestra_TypeClass value);

	/**
	 * Returns the value of the '<em><b>BUE Mit GFR</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Bahnübergang wird mit einer technischen Gefahrraumfreimeldeanlage (GFR) überwacht. Die GFR findet nur bei BÜ mit Vollschrankenabschuss (HH oder V) Anwendung. Planungsattribute zur GFR werden zu einem späteren Zeitpunkt in das Modell aufgenommen. Das Attribut wird nur befüllt, wenn eine GFR vorhanden ist. DB-Regelwerk 819.1210 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BUE Mit GFR</em>' containment reference.
	 * @see #setBUEMitGFR(BUE_Mit_GFR_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_Allg_AttributeGroup_BUEMitGFR()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BUE_Mit_GFR'"
	 * @generated
	 */
	BUE_Mit_GFR_TypeClass getBUEMitGFR();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Allg_AttributeGroup#getBUEMitGFR <em>BUE Mit GFR</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BUE Mit GFR</em>' containment reference.
	 * @see #getBUEMitGFR()
	 * @generated
	 */
	void setBUEMitGFR(BUE_Mit_GFR_TypeClass value);

	/**
	 * Returns the value of the '<em><b>BUE Sicherungsart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bauart der Bahnübergangs(BÜ)-Sicherung. A: Anrufschranke; F: abgesetzter Fuß-/Radweg mit eigener Halbschranke; Lf: Geschwindigkeitsreduzierung im BÜ-Bereich mittels Lf-Signalen; Lz: Lichtzeichen; H: Halbschranken; HH: zwei Halbschranken, die gemeinsam die gesamte Straßenbreite sichern; P: Pfeiftafel; Ue: Übersicht (Ermittlung durch Sichtdreieck); V: Vollschranke; bei abgesetzten Fuß-/Radwegen sichert die Vollschranke auch diese. Schlüsselabhängig sind z. B. Bau-BÜ. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen. DB-Regelwerk 815.0010 4 (7) Tabelle 1 in Verbindung mit 815.0031 oder 815.0032 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BUE Sicherungsart</em>' containment reference.
	 * @see #setBUESicherungsart(BUE_Sicherungsart_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_Allg_AttributeGroup_BUESicherungsart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BUE_Sicherungsart'"
	 * @generated
	 */
	BUE_Sicherungsart_TypeClass getBUESicherungsart();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Allg_AttributeGroup#getBUESicherungsart <em>BUE Sicherungsart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BUE Sicherungsart</em>' containment reference.
	 * @see #getBUESicherungsart()
	 * @generated
	 */
	void setBUESicherungsart(BUE_Sicherungsart_TypeClass value);

	/**
	 * Returns the value of the '<em><b>BUE Strasse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe des Namens der kreuzenden Straße bzw. des kreuzenden Weges. Zulässig ist auch eine prägnante Bezeichnung des Bahnübergangs anhand der Örtlichkeit oder Umgebung, in der dieser sich befindet. DB-Regelwerk \"Kennwort\" in der Einschaltstreckenberechnung 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BUE Strasse</em>' containment reference.
	 * @see #setBUEStrasse(BUE_Strasse_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_Allg_AttributeGroup_BUEStrasse()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='BUE_Strasse'"
	 * @generated
	 */
	BUE_Strasse_TypeClass getBUEStrasse();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Allg_AttributeGroup#getBUEStrasse <em>BUE Strasse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BUE Strasse</em>' containment reference.
	 * @see #getBUEStrasse()
	 * @generated
	 */
	void setBUEStrasse(BUE_Strasse_TypeClass value);

	/**
	 * Returns the value of the '<em><b>BUE Technik</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bauart der technischen BÜ-Sicherung. Ist der BÜ nichttechnisch gesichert, ist \"keine\" anzugeben. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Die Festlegung neu zu errichtender BÜ-Technik erfolgt projektbezogen durch Vorgabe des Bestellers. Allgemeine Angaben finden sich in der Ril 819.1203 2 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BUE Technik</em>' containment reference.
	 * @see #setBUETechnik(BUE_Technik_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_Allg_AttributeGroup_BUETechnik()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BUE_Technik'"
	 * @generated
	 */
	BUE_Technik_TypeClass getBUETechnik();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Allg_AttributeGroup#getBUETechnik <em>BUE Technik</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BUE Technik</em>' containment reference.
	 * @see #getBUETechnik()
	 * @generated
	 */
	void setBUETechnik(BUE_Technik_TypeClass value);

} // BUE_Anlage_Allg_AttributeGroup
