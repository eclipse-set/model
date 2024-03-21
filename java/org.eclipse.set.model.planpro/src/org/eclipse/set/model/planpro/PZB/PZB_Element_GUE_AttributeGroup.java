/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.PZB;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.planpro.Verweise.ID_PZB_Element_Mitnutzung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PZB Element GUE Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getGUEAbstandAbweichend <em>GUE Abstand Abweichend</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getGUEAnordnung <em>GUE Anordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getGUEBauart <em>GUE Bauart</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getGUEEnergieversorgung <em>GUE Energieversorgung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getGUEMessstrecke <em>GUE Messstrecke</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getIDPZBElementMitnutzung <em>IDPZB Element Mitnutzung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getMessfehler <em>Messfehler</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getPruefgeschwindigkeit <em>Pruefgeschwindigkeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getPruefzeit <em>Pruefzeit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.PZB.PZBPackage#getPZB_Element_GUE_AttributeGroup()
 * @model extendedMetaData="name='CPZB_Element_GUE' kind='elementOnly'"
 * @generated
 */
public interface PZB_Element_GUE_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>GUE Abstand Abweichend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe des von der Regelanordnung abweichenden Abstandes einer GÜ zum Signal. Das Attribut wird nur befüllt, wenn der Abstand der GUE zum Signal gemäß Ril 819.1310 Anhang 01 aus baulichen Gründen nicht realisiert werden kann. Es ist dann der Abstand zwischen GUE und Signal anzugeben. Dann sind die Toleranzen gemäß Ril 819.1310 Abschnitt 9, Absatz (4) einzuhalten. DB-Regelwerk 819.1310A01 in Verbindung mit 819.1310 9 (4) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GUE Abstand Abweichend</em>' containment reference.
	 * @see #setGUEAbstandAbweichend(GUE_Abstand_Abweichend_TypeClass)
	 * @see org.eclipse.set.model.planpro.PZB.PZBPackage#getPZB_Element_GUE_AttributeGroup_GUEAbstandAbweichend()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GUE_Abstand_Abweichend'"
	 * @generated
	 */
	GUE_Abstand_Abweichend_TypeClass getGUEAbstandAbweichend();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getGUEAbstandAbweichend <em>GUE Abstand Abweichend</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GUE Abstand Abweichend</em>' containment reference.
	 * @see #getGUEAbstandAbweichend()
	 * @generated
	 */
	void setGUEAbstandAbweichend(GUE_Abstand_Abweichend_TypeClass value);

	/**
	 * Returns the value of the '<em><b>GUE Anordnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe des Anordnungsfalles des Prüf- und der Prüfmagneten einer GÜ. Fall 1 (EA): in Fahrtrichtung zuerst Einschaltmagnet (GSE), dann Wirkmagnet, dann Ausschaltmagnet (GSA). Fall 2 (AE): in Fahrtrichtung zuerst Ausschaltmagnet (GSA) dann Einschaltmagnet (GSE), dann Wirkmagnet. Nach Ril 819.1310 ist im Regelfall die Variante gemäß Fall 1 anzuwenden. DB-Regelwerk 819.1310 9 819.1310A01 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GUE Anordnung</em>' containment reference.
	 * @see #setGUEAnordnung(GUE_Anordnung_TypeClass)
	 * @see org.eclipse.set.model.planpro.PZB.PZBPackage#getPZB_Element_GUE_AttributeGroup_GUEAnordnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GUE_Anordnung'"
	 * @generated
	 */
	GUE_Anordnung_TypeClass getGUEAnordnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getGUEAnordnung <em>GUE Anordnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GUE Anordnung</em>' containment reference.
	 * @see #getGUEAnordnung()
	 * @generated
	 */
	void setGUEAnordnung(GUE_Anordnung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>GUE Bauart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bauart der GÜ, von der weitere Planungsparameter wie Messfehler oder Pruefzeit abhängen. DB-Regelwerk Ril 819.1310A01
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GUE Bauart</em>' containment reference.
	 * @see #setGUEBauart(GUE_Bauart_TypeClass)
	 * @see org.eclipse.set.model.planpro.PZB.PZBPackage#getPZB_Element_GUE_AttributeGroup_GUEBauart()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GUE_Bauart'"
	 * @generated
	 */
	GUE_Bauart_TypeClass getGUEBauart();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getGUEBauart <em>GUE Bauart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GUE Bauart</em>' containment reference.
	 * @see #getGUEBauart()
	 * @generated
	 */
	void setGUEBauart(GUE_Bauart_TypeClass value);

	/**
	 * Returns the value of the '<em><b>GUE Energieversorgung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, wie die Energieversorgung der GÜ erfolgt. Bei GÜ, die zur Überwachung restriktiver Geschwindigkeiten an Signalen bzw. für Weichen geplant werden, erfolgt die Stromversorgung im Regelfall aus dem zugehörigen Stellwerk. Bei Lf-Signalen der freien Strecke, die einer GÜ-Sicherung bedürfen, ist im Regelfall die Solarspeisung vorzusehen, da sich keine geeignete Stromversorgung in der Nähe befindet. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es ergibt sich aus dem konkreten Anwendungsfall.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GUE Energieversorgung</em>' containment reference.
	 * @see #setGUEEnergieversorgung(GUE_Energieversorgung_TypeClass)
	 * @see org.eclipse.set.model.planpro.PZB.PZBPackage#getPZB_Element_GUE_AttributeGroup_GUEEnergieversorgung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GUE_Energieversorgung'"
	 * @generated
	 */
	GUE_Energieversorgung_TypeClass getGUEEnergieversorgung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getGUEEnergieversorgung <em>GUE Energieversorgung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GUE Energieversorgung</em>' containment reference.
	 * @see #getGUEEnergieversorgung()
	 * @generated
	 */
	void setGUEEnergieversorgung(GUE_Energieversorgung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>GUE Messstrecke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe über die Länge der Messstrecke der GÜ in [m]. Aus Sicht des LST-Planers ist die Messstrecke das maßgebende Planungskriterium, die aufgrund der örtlichen Verhältnisse (z. B. Weichenlage, Schweißstelle, andere sicherungstechnischen Elemente) festzulegen ist. Daraus ergibt sich die dann zu realisierende Bauform der GÜ. DB-Regelwerk 819.1310A01 7 819.1310A01 8 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GUE Messstrecke</em>' containment reference.
	 * @see #setGUEMessstrecke(GUE_Messstrecke_TypeClass)
	 * @see org.eclipse.set.model.planpro.PZB.PZBPackage#getPZB_Element_GUE_AttributeGroup_GUEMessstrecke()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GUE_Messstrecke'"
	 * @generated
	 */
	GUE_Messstrecke_TypeClass getGUEMessstrecke();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getGUEMessstrecke <em>GUE Messstrecke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GUE Messstrecke</em>' containment reference.
	 * @see #getGUEMessstrecke()
	 * @generated
	 */
	void setGUEMessstrecke(GUE_Messstrecke_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDPZB Element Mitnutzung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Mit Ausnahme von GÜ bei Lf-Signalisierung werden bei der Anordnung von GÜ unmittelbar am Signal (meist im Zusammenhang mit geschwindigkeitsmindernden Zusatzanzeigern) der Wirkmagnet der GÜ und der PZB-Magnet des Signals zu einem PZB-Magneten zusammengefasst. DB-Regelwerk Der Sachverhalt ist in der Ril 819.1310 zwar nicht eindeutig beschrieben, geht jedoch aus den Tabelleneinträgen im Anhang 01 hervor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDPZB Element Mitnutzung</em>' containment reference.
	 * @see #setIDPZBElementMitnutzung(ID_PZB_Element_Mitnutzung_TypeClass)
	 * @see org.eclipse.set.model.planpro.PZB.PZBPackage#getPZB_Element_GUE_AttributeGroup_IDPZBElementMitnutzung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_PZB_Element_Mitnutzung'"
	 * @generated
	 */
	ID_PZB_Element_Mitnutzung_TypeClass getIDPZBElementMitnutzung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getIDPZBElementMitnutzung <em>IDPZB Element Mitnutzung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDPZB Element Mitnutzung</em>' containment reference.
	 * @see #getIDPZBElementMitnutzung()
	 * @generated
	 */
	void setIDPZBElementMitnutzung(ID_PZB_Element_Mitnutzung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Messfehler</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Messfehlerbereich der GÜ in Abhängigkeit von der Bauart DB-Regelwerk Ril 819.1310A01
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Messfehler</em>' containment reference.
	 * @see #setMessfehler(Messfehler_TypeClass)
	 * @see org.eclipse.set.model.planpro.PZB.PZBPackage#getPZB_Element_GUE_AttributeGroup_Messfehler()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Messfehler'"
	 * @generated
	 */
	Messfehler_TypeClass getMessfehler();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getMessfehler <em>Messfehler</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Messfehler</em>' containment reference.
	 * @see #getMessfehler()
	 * @generated
	 */
	void setMessfehler(Messfehler_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Pruefgeschwindigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der an der GÜ eingestellten Überwachungsgeschwindigkeit in [km/h]. Bis auf die Überwachungsgeschwindigkeiten 95 und 105 erhalten die GÜ eine Wirkmagnet mit 2000 Hz; für GÜ 95 und 105 einen Wirkmagneten mit 1000 Hz. Eine explizite Angabe der Wirkfrequenz bei der GÜ ist daher nicht vorgesehen. DB-Regelwerk 819.1310A01 3 819.1310A01 5 819.1310A01 6 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pruefgeschwindigkeit</em>' containment reference.
	 * @see #setPruefgeschwindigkeit(Pruefgeschwindigkeit_TypeClass)
	 * @see org.eclipse.set.model.planpro.PZB.PZBPackage#getPZB_Element_GUE_AttributeGroup_Pruefgeschwindigkeit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Pruefgeschwindigkeit'"
	 * @generated
	 */
	Pruefgeschwindigkeit_TypeClass getPruefgeschwindigkeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getPruefgeschwindigkeit <em>Pruefgeschwindigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pruefgeschwindigkeit</em>' containment reference.
	 * @see #getPruefgeschwindigkeit()
	 * @generated
	 */
	void setPruefgeschwindigkeit(Pruefgeschwindigkeit_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Pruefzeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prüfzeit der GÜ in Abhängigkeit von der Bauart. DB-Regelwerk Ril 819.1310A01
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pruefzeit</em>' containment reference.
	 * @see #setPruefzeit(Pruefzeit_TypeClass)
	 * @see org.eclipse.set.model.planpro.PZB.PZBPackage#getPZB_Element_GUE_AttributeGroup_Pruefzeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Pruefzeit'"
	 * @generated
	 */
	Pruefzeit_TypeClass getPruefzeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup#getPruefzeit <em>Pruefzeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pruefzeit</em>' containment reference.
	 * @see #getPruefzeit()
	 * @generated
	 */
	void setPruefzeit(Pruefzeit_TypeClass value);

} // PZB_Element_GUE_AttributeGroup
