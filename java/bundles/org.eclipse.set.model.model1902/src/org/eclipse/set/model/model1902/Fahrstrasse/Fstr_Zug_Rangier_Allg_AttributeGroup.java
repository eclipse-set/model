/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Fahrstrasse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fstr Zug Rangier Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Zug_Rangier_Allg_AttributeGroup#getFBedienung <em>FBedienung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Zug_Rangier_Allg_AttributeGroup#getFstrArt <em>Fstr Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Zug_Rangier_Allg_AttributeGroup#getFstrBedienstring <em>Fstr Bedienstring</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Zug_Rangier_Allg_AttributeGroup#getFstrBildezeit <em>Fstr Bildezeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Zug_Rangier_Allg_AttributeGroup#getFstrReihenfolge <em>Fstr Reihenfolge</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Zug_Rangier_Allg_AttributeGroup#getFstrV <em>Fstr V</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_Zug_Rangier_Allg_AttributeGroup()
 * @model extendedMetaData="name='CFstr_Zug_Rangier_Allg' kind='elementOnly'"
 * @generated
 */
public interface Fstr_Zug_Rangier_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>FBedienung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Während das Gleis vor dem Startsignal mit Fahrleitung ausgerüstet ist, ist der befahrene Teil der Fahrstraße nicht oder nur teilweise damit ausgerüstet. Der Durchrutschweg bleibt in der Regel unberücksichtigt. Die Angabe erfolgt nur, sofern eine F-Bedienung erforderlich ist (true). Bei Rangierstraßen kann auf das Setzen des Attributs verzichtet werden, wenn das Ziel der üblicherweise durchgeführten Rangierfahrten noch im mit Fahrleitung ausgerüsteten Bereich liegt. DB-Regelwerk Zugstraßentabelle, Spalte 7 \"Zugstraße in nichtüberspannte Bereiche\"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FBedienung</em>' containment reference.
	 * @see #setFBedienung(F_Bedienung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_Zug_Rangier_Allg_AttributeGroup_FBedienung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='F_Bedienung'"
	 * @generated
	 */
	F_Bedienung_TypeClass getFBedienung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Zug_Rangier_Allg_AttributeGroup#getFBedienung <em>FBedienung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FBedienung</em>' containment reference.
	 * @see #getFBedienung()
	 * @generated
	 */
	void setFBedienung(F_Bedienung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Fstr Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der Fahrstraße. RR – RangierRegel-, RT - RangierTeil-, RTU - RangierTeilUmfahr-, RU – RangierUmfahr-, ZH – ZugHilfs-, ZM – ZugMittelweichenteil-, ZR – ZugRegel-, ZU – ZugUmfahr-, ZUH – ZugUmfahrhilfs-, ZUM – ZugUmfahrMittelweichenteil-, ZB – ZugZentralblock-, ZT - ZugTeil-, ZTU - ZugTeilUmfahr-. ZB: Anwendung im Zentralblock oder an Schnittstellen zu anderen Stellwerkstechniken bei Mehrabschnittssignalisierung, Signalabhängigkeiten von Fahrwegelementen auf der freien Strecke oder bei Bedienung einer Awanst. DB-Regelwerk Zug-/Rangierstraßentabelle, Spalte 2 \"Art\"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fstr Art</em>' containment reference.
	 * @see #setFstrArt(Fstr_Art_TypeClass)
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_Zug_Rangier_Allg_AttributeGroup_FstrArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Fstr_Art'"
	 * @generated
	 */
	Fstr_Art_TypeClass getFstrArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Zug_Rangier_Allg_AttributeGroup#getFstrArt <em>Fstr Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fstr Art</em>' containment reference.
	 * @see #getFstrArt()
	 * @generated
	 */
	void setFstrArt(Fstr_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Fstr Bedienstring</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bedienstring der Fahrstraße. Der Bedienstring wird automatisch aus Start, Ziel und ggf. Umfahrpunkt(en) gefüllt, kann aber bei Besonderheiten auch abweichend geplant werden. Das Attribut ist Bestandteil des Untergewerks \"Bedienung Fdl\". DB-Regelwerk Zug-/Rangierstraßentabelle, Spalte 1 \"Start/Ziel\"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fstr Bedienstring</em>' containment reference.
	 * @see #setFstrBedienstring(Fstr_Bedienstring_TypeClass)
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_Zug_Rangier_Allg_AttributeGroup_FstrBedienstring()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fstr_Bedienstring'"
	 * @generated
	 */
	Fstr_Bedienstring_TypeClass getFstrBedienstring();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Zug_Rangier_Allg_AttributeGroup#getFstrBedienstring <em>Fstr Bedienstring</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fstr Bedienstring</em>' containment reference.
	 * @see #getFstrBedienstring()
	 * @generated
	 */
	void setFstrBedienstring(Fstr_Bedienstring_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Fstr Bildezeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Für die ZL notwendige Fahrstraßenbildezeit. Das Attribut ist Bestandteil des Untergewerks \"Zuglenkung\". DB-Regelwerk ZL-Planung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fstr Bildezeit</em>' containment reference.
	 * @see #setFstrBildezeit(Fstr_Bildezeit_TypeClass)
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_Zug_Rangier_Allg_AttributeGroup_FstrBildezeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fstr_Bildezeit'"
	 * @generated
	 */
	Fstr_Bildezeit_TypeClass getFstrBildezeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Zug_Rangier_Allg_AttributeGroup#getFstrBildezeit <em>Fstr Bildezeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fstr Bildezeit</em>' containment reference.
	 * @see #getFstrBildezeit()
	 * @generated
	 */
	void setFstrBildezeit(Fstr_Bildezeit_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Fstr Reihenfolge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nummerierung des Umfahrwegs, wenn mehrere Fahrstraßen mit gleichem Start- und Zielpunkt existieren. Beim Regelweg wird das Attribut mit \"0\" befüllt. Das Datum wird zur Kennzeichnung des Fahrwegs in der Fahrstraßenbezeichnung genutzt und für die Reihenfolge des Erscheinens von Fahrstraßen in der Tabelle. Es kann auch für die Reihenfolge im Bedienmenü genutzt werden. DB-Regelwerk Die Reihenfolge wurde bisher geplant durch die Reihenfolge des Erscheinens in der Zug-/Rangierstraßentabelle (implizit) oder die Bezeichnung der Fahrstraßenart (z. B. U1, U2, ...) oder eine Beschreibung im Erläuterungsbericht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fstr Reihenfolge</em>' containment reference.
	 * @see #setFstrReihenfolge(Fstr_Reihenfolge_TypeClass)
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_Zug_Rangier_Allg_AttributeGroup_FstrReihenfolge()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Fstr_Reihenfolge'"
	 * @generated
	 */
	Fstr_Reihenfolge_TypeClass getFstrReihenfolge();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Zug_Rangier_Allg_AttributeGroup#getFstrReihenfolge <em>Fstr Reihenfolge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fstr Reihenfolge</em>' containment reference.
	 * @see #getFstrReihenfolge()
	 * @generated
	 */
	void setFstrReihenfolge(Fstr_Reihenfolge_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Fstr V</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ausnahmsweise geplante Geschwindigkeit der Fahrstraße am Start, die sich nicht aus den Elementen der Fahrstraße ergibt. In der Regel wird die Geschwindigkeit aus den Daten der Fahrstraße errechnet und deshalb hier nicht angegeben. Im Ausnahmefall (z. B. bei Resi) kann der Planer eine geringere Geschwindigkeit vorgeben. Ausgeschlossen von diesem Ausnahmefall ist eine geringere Geschwindigkeitssignalisierung aufgrund eines verkürzten Bremswegs oder nicht vorhandener Kennzahlen am Zs 3-Anzeiger. Dies wird in Fstr Signalisierung geplant. Siehe auch Bildung der Signalbegriffe. DB-Regelwerk Signaltabelle 2, hier wird jedoch schon das Ergebnis als Zs 3 am Startsignal gespeichert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fstr V</em>' containment reference.
	 * @see #setFstrV(Fstr_V_TypeClass)
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_Zug_Rangier_Allg_AttributeGroup_FstrV()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fstr_V'"
	 * @generated
	 */
	Fstr_V_TypeClass getFstrV();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Zug_Rangier_Allg_AttributeGroup#getFstrV <em>Fstr V</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fstr V</em>' containment reference.
	 * @see #getFstrV()
	 * @generated
	 */
	void setFstrV(Fstr_V_TypeClass value);

} // Fstr_Zug_Rangier_Allg_AttributeGroup
