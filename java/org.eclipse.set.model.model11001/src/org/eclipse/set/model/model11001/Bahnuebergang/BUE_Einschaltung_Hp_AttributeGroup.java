/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bahnuebergang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUE Einschaltung Hp Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Einschaltung_Hp_AttributeGroup#getEinschaltverzErrechnet <em>Einschaltverz Errechnet</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Einschaltung_Hp_AttributeGroup#getEinschaltverzGewaehlt <em>Einschaltverz Gewaehlt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Einschaltung_Hp_AttributeGroup#getHaltezeit <em>Haltezeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Einschaltung_Hp_AttributeGroup#getKurzzugschaltung <em>Kurzzugschaltung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Einschaltung_Hp_AttributeGroup#getSignalverzErrechnet <em>Signalverz Errechnet</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Einschaltung_Hp_AttributeGroup#getSignalverzGewaehlt <em>Signalverz Gewaehlt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Einschaltung_Hp_AttributeGroup#getTeilvorgabezeit <em>Teilvorgabezeit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getBUE_Einschaltung_Hp_AttributeGroup()
 * @model extendedMetaData="name='CBUE_Einschaltung_Hp' kind='elementOnly'"
 * @generated
 */
public interface BUE_Einschaltung_Hp_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Einschaltverz Errechnet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Errechnete Einschaltverzögerungszeit aus der Einschaltstreckenberechnung. Die Einschaltverzögerungszeit (Angabe in vollen Sekunden) dient der Optimierung der zugbewirkten Einschaltung. Zur Auswertung werden Gleisfreimeldeabschnitte verwendet, wobei der Beginn der Besetzung den Einschaltimpuls bewirkt. Da der Beginn eines Gleisfreimeldeabschnitte selten am Ort des optimalen, errechneten Einschaltpunktes des BÜ liegt, wird eine Verzögerungszeit vorgesehen, die zunächst vergehen muss, bis der Einschaltimpuls nach Befahren der Gleisfreimeldeabschnittsgrenze vom ESTW an den BÜ weitergegeben wird. DB-Regelwerk Einschaltstreckenberechnung Datenblatt für die Abhängigkeiten BÜ - Stw 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einschaltverz Errechnet</em>' containment reference.
	 * @see #setEinschaltverzErrechnet(Einschaltverz_Errechnet_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getBUE_Einschaltung_Hp_AttributeGroup_EinschaltverzErrechnet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Einschaltverz_Errechnet'"
	 * @generated
	 */
	Einschaltverz_Errechnet_TypeClass getEinschaltverzErrechnet();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Einschaltung_Hp_AttributeGroup#getEinschaltverzErrechnet <em>Einschaltverz Errechnet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einschaltverz Errechnet</em>' containment reference.
	 * @see #getEinschaltverzErrechnet()
	 * @generated
	 */
	void setEinschaltverzErrechnet(Einschaltverz_Errechnet_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Einschaltverz Gewaehlt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Auf der Grundlage der errechneten Einschaltverzögerung (siehe dazu Definition unter Einschaltverz Errechnet) wird in Abhängigkeit des ESTW-Herstellers eine firmenspezifische Einschaltverzögerungszeit ausgerechnet. Das gegenwärtig gültige \"Datenblatt für die Abhängigkeiten BÜ - Stw\" sieht eine firmenspezifisch errechnete Einschaltverzögerung (Spalte \"Faktor beim ESTW\") mit Hilfe eines \"ESTW-Faktors\" vor. Auf diese Berechnung wird im Modell verzichtet. DB-Regelwerk Einschaltstreckenberechnung Datenblatt für die Abhängigkeiten BÜ - Stw 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einschaltverz Gewaehlt</em>' containment reference.
	 * @see #setEinschaltverzGewaehlt(Einschaltverz_Gewaehlt_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getBUE_Einschaltung_Hp_AttributeGroup_EinschaltverzGewaehlt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Einschaltverz_Gewaehlt'"
	 * @generated
	 */
	Einschaltverz_Gewaehlt_TypeClass getEinschaltverzGewaehlt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Einschaltung_Hp_AttributeGroup#getEinschaltverzGewaehlt <em>Einschaltverz Gewaehlt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einschaltverz Gewaehlt</em>' containment reference.
	 * @see #getEinschaltverzGewaehlt()
	 * @generated
	 */
	void setEinschaltverzGewaehlt(Einschaltverz_Gewaehlt_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Haltezeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Haltezeit der haltenden Züge am Haltepunkt in der Einschaltstrecke inklusive der Brems- und Anfahrbeschleunigung (tZH)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Haltezeit</em>' containment reference.
	 * @see #setHaltezeit(Haltezeit_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getBUE_Einschaltung_Hp_AttributeGroup_Haltezeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Haltezeit'"
	 * @generated
	 */
	Haltezeit_TypeClass getHaltezeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Einschaltung_Hp_AttributeGroup#getHaltezeit <em>Haltezeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Haltezeit</em>' containment reference.
	 * @see #getHaltezeit()
	 * @generated
	 */
	void setHaltezeit(Haltezeit_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Kurzzugschaltung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eine Kurzzugschaltung ist zu berücksichtigen. Dies wäre der Fall, wenn sich der Bahnübergang in einem Bahnhofsgleis befindet und nach Einfahrt des Zuges durch diesen nicht mehr besetzt ist. DB-Regelwerk Datenblatt für die Abhängigkeiten BÜ - Stw 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kurzzugschaltung</em>' containment reference.
	 * @see #setKurzzugschaltung(Kurzzugschaltung_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getBUE_Einschaltung_Hp_AttributeGroup_Kurzzugschaltung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Kurzzugschaltung'"
	 * @generated
	 */
	Kurzzugschaltung_TypeClass getKurzzugschaltung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Einschaltung_Hp_AttributeGroup#getKurzzugschaltung <em>Kurzzugschaltung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kurzzugschaltung</em>' containment reference.
	 * @see #getKurzzugschaltung()
	 * @generated
	 */
	void setKurzzugschaltung(Kurzzugschaltung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Signalverz Errechnet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Errechnete Signalverzögerungszeit aus der Einschaltstreckenberechnung. Bei abhängigen Signalen vor BÜ mit Halbschranken wird die Signalfahrtstellung so lange verzögert, dass am Signal anfahrende Züge den vom BÜ abfließenden Straßenverkehr nicht mehr gefährden können. In den Planungsdaten wird dieser Wert je Signal festgelegt. DB-Regelwerk Einschaltstreckenberechnung Datenblatt für die Abhängigkeiten BÜ - Stw 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signalverz Errechnet</em>' containment reference.
	 * @see #setSignalverzErrechnet(Signalverz_Errechnet_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getBUE_Einschaltung_Hp_AttributeGroup_SignalverzErrechnet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Signalverz_Errechnet'"
	 * @generated
	 */
	Signalverz_Errechnet_TypeClass getSignalverzErrechnet();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Einschaltung_Hp_AttributeGroup#getSignalverzErrechnet <em>Signalverz Errechnet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signalverz Errechnet</em>' containment reference.
	 * @see #getSignalverzErrechnet()
	 * @generated
	 */
	void setSignalverzErrechnet(Signalverz_Errechnet_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Signalverz Gewaehlt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Firmenspezifische Signalverzögerungszeit, die auf Basis der errechneten Signalverzögerungszeit (Definition siehe Signalverz Errechnet) in Abhängigkeit des ESTW-Herstellers errechnet wird. Das gegenwärtig gültige \"Datenblatt für die Abhängigkeiten BÜ - Stw\" sieht eine firmenspezifisch errechnete Signalverzögerungszeit (Spalte \"Faktor beim ESTW\") mit Hilfe eines \"ESTW-Faktors\" vor. Auf diese Berechnung wird im Modell verzichtet. DB-Regelwerk Datenblatt für die Abhängigkeiten BÜ - Stw 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signalverz Gewaehlt</em>' containment reference.
	 * @see #setSignalverzGewaehlt(Signalverz_Gewaehlt_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getBUE_Einschaltung_Hp_AttributeGroup_SignalverzGewaehlt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Signalverz_Gewaehlt'"
	 * @generated
	 */
	Signalverz_Gewaehlt_TypeClass getSignalverzGewaehlt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Einschaltung_Hp_AttributeGroup#getSignalverzGewaehlt <em>Signalverz Gewaehlt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signalverz Gewaehlt</em>' containment reference.
	 * @see #getSignalverzGewaehlt()
	 * @generated
	 */
	void setSignalverzGewaehlt(Signalverz_Gewaehlt_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Teilvorgabezeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe des Wertes tvg1 aus der Einschaltstreckenberechnung in ganzzahligen Sekunden.
	 * Die Teilvorgabezeit ist die Summe aus Nachlaufzeit, erforderlicher Vorleuchtzeit, Schrankenschließzeit, Maßgebender Räumzeit, Bedienzeit/GFR-Freigabezeit und Teilzeitkonstante bei vorgeschalteten Lichtzeichen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Teilvorgabezeit</em>' containment reference.
	 * @see #setTeilvorgabezeit(Teilvorgabezeit_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getBUE_Einschaltung_Hp_AttributeGroup_Teilvorgabezeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Teilvorgabezeit'"
	 * @generated
	 */
	Teilvorgabezeit_TypeClass getTeilvorgabezeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Einschaltung_Hp_AttributeGroup#getTeilvorgabezeit <em>Teilvorgabezeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teilvorgabezeit</em>' containment reference.
	 * @see #getTeilvorgabezeit()
	 * @generated
	 */
	void setTeilvorgabezeit(Teilvorgabezeit_TypeClass value);

} // BUE_Einschaltung_Hp_AttributeGroup
