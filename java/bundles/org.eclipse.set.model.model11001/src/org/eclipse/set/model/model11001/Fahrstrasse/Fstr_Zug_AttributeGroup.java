/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Fahrstrasse;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model11001.Verweise.ID_BUE_Einschaltung_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Signal_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fstr Zug Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Zug_AttributeGroup#getAutomatischeEinstellung <em>Automatische Einstellung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Zug_AttributeGroup#getFstrVsigabstandVerkuerzt <em>Fstr Vsigabstand Verkuerzt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Zug_AttributeGroup#getFstrZugArt <em>Fstr Zug Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Zug_AttributeGroup#getFstrZugDWeg <em>Fstr Zug DWeg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Zug_AttributeGroup#getIDBUEEinschaltung <em>IDBUE Einschaltung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Zug_AttributeGroup#getIDSignalGruppenausfahrt <em>ID Signal Gruppenausfahrt</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage#getFstr_Zug_AttributeGroup()
 * @model extendedMetaData="name='CFstr_Zug' kind='elementOnly'"
 * @generated
 */
public interface Fstr_Zug_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Automatische Einstellung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Möglichkeit des Fahrstraßenanstoßes über die manuelle Bedienung hinaus. Die Angabe für eine Zugstraße gilt auch für eventuell zugehörige (davorliegende) Mittelweichenteilfahrstraßen. DB-Regelwerk Zugstraßentabelle, Spalte 9 \"Selbststellbetrieb/Zuglenkung\" 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Automatische Einstellung</em>' containment reference.
	 * @see #setAutomatischeEinstellung(Automatische_Einstellung_TypeClass)
	 * @see org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage#getFstr_Zug_AttributeGroup_AutomatischeEinstellung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Automatische_Einstellung'"
	 * @generated
	 */
	Automatische_Einstellung_TypeClass getAutomatischeEinstellung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Zug_AttributeGroup#getAutomatischeEinstellung <em>Automatische Einstellung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatische Einstellung</em>' containment reference.
	 * @see #getAutomatischeEinstellung()
	 * @generated
	 */
	void setAutomatischeEinstellung(Automatische_Einstellung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Fstr Vsigabstand Verkuerzt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Abstand vom Start zum Ziel der Fahrstraße ist kürzer als der zulässige Vorsignalabstand. DB-Regelwerk Ein expliziter Vermerk dazu kann als Fußnote in der Signaltabelle 2 oder Beschreibung im Erläuterungsbericht erscheinen. Ansonsten ist ein Zusatzlicht am Startsignal und die Geschwindigkeitseinschränkung bei Fahrt auf Halt oder eine eingeschränkte Geschwindigkeit ein Indiz.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fstr Vsigabstand Verkuerzt</em>' containment reference.
	 * @see #setFstrVsigabstandVerkuerzt(Fstr_Vsigabstand_Verkuerzt_TypeClass)
	 * @see org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage#getFstr_Zug_AttributeGroup_FstrVsigabstandVerkuerzt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Fstr_Vsigabstand_Verkuerzt'"
	 * @generated
	 */
	Fstr_Vsigabstand_Verkuerzt_TypeClass getFstrVsigabstandVerkuerzt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Zug_AttributeGroup#getFstrVsigabstandVerkuerzt <em>Fstr Vsigabstand Verkuerzt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fstr Vsigabstand Verkuerzt</em>' containment reference.
	 * @see #getFstrVsigabstandVerkuerzt()
	 * @generated
	 */
	void setFstrVsigabstandVerkuerzt(Fstr_Vsigabstand_Verkuerzt_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Fstr Zug Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der Zugstraße. ZH – ZugHilfs-, ZR – ZugRegel-, ZU – ZugUmfahr-, ZUH – ZugUmfahrhilfs-, ZZ – ZugZentralblock-, ZT - ZugTeil-, ZTU - ZugTeilUmfahr-. ZZ: Anwendung im Zentralblock oder an Schnittstellen zu anderen Stellwerkstechniken bei Mehrabschnittssignalisierung, Signalabhängigkeiten von Fahrwegelementen auf der freien Strecke oder bei Bedienung einer Awanst. DB-Regelwerk Zugstraßentabelle, Spalte 2 \"Art\"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fstr Zug Art</em>' containment reference.
	 * @see #setFstrZugArt(Fstr_Zug_Art_TypeClass)
	 * @see org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage#getFstr_Zug_AttributeGroup_FstrZugArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Fstr_Zug_Art'"
	 * @generated
	 */
	Fstr_Zug_Art_TypeClass getFstrZugArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Zug_AttributeGroup#getFstrZugArt <em>Fstr Zug Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fstr Zug Art</em>' containment reference.
	 * @see #getFstrZugArt()
	 * @generated
	 */
	void setFstrZugArt(Fstr_Zug_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Fstr Zug DWeg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fstr Zug DWeg</em>' containment reference.
	 * @see #setFstrZugDWeg(Fstr_Zug_DWeg_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage#getFstr_Zug_AttributeGroup_FstrZugDWeg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fstr_Zug_DWeg'"
	 * @generated
	 */
	Fstr_Zug_DWeg_AttributeGroup getFstrZugDWeg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Zug_AttributeGroup#getFstrZugDWeg <em>Fstr Zug DWeg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fstr Zug DWeg</em>' containment reference.
	 * @see #getFstrZugDWeg()
	 * @generated
	 */
	void setFstrZugDWeg(Fstr_Zug_DWeg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDBUE Einschaltung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.Verweise.ID_BUE_Einschaltung_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BÜ im Durchrutschweg, der im Sicherheitsabstand liegt und daher für die Fahrstraße zu sichern ist oder BÜ auf der freien Strecke, dessen Sicherung durch die Ausfahrzugstraße angestoßen werden muss. DB-Regelwerk Zugstraßentabelle: Fußnote. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDBUE Einschaltung</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage#getFstr_Zug_AttributeGroup_IDBUEEinschaltung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_BUE_Einschaltung'"
	 * @generated
	 */
	EList<ID_BUE_Einschaltung_TypeClass> getIDBUEEinschaltung();

	/**
	 * Returns the value of the '<em><b>ID Signal Gruppenausfahrt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Gruppenausfahr- oder -zwischensignal einer Fahrstraße. Ist das Attribut gefüllt, handelt es sich um eine Fahrstraße mit Gruppensignal. Start der Fahrstraße und damit Beginn des Bereichsobjektes Fstr Fahrweg für den befahrenen Teil ist nicht das Gruppensignal, sondern das Signal am tatsächlichen Beginn der Fahrstraße (meist Sperrsignal). DB-Regelwerk Sicherungstechnischer Lageplan: Darstellung des Gruppensignals nach dem Fahrstraßenstart; Zugstraßentabelle, Spalte 1 \"Start/Ziel\": Besondere Bezeichnung des Signals. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal Gruppenausfahrt</em>' containment reference.
	 * @see #setIDSignalGruppenausfahrt(ID_Signal_TypeClass)
	 * @see org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage#getFstr_Zug_AttributeGroup_IDSignalGruppenausfahrt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Signal_Gruppenausfahrt'"
	 * @generated
	 */
	ID_Signal_TypeClass getIDSignalGruppenausfahrt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Zug_AttributeGroup#getIDSignalGruppenausfahrt <em>ID Signal Gruppenausfahrt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Signal Gruppenausfahrt</em>' containment reference.
	 * @see #getIDSignalGruppenausfahrt()
	 * @generated
	 */
	void setIDSignalGruppenausfahrt(ID_Signal_TypeClass value);

} // Fstr_Zug_AttributeGroup
