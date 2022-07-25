/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Fahrstrasse;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_Fstr_Zug_Rangier_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Signal_Signalbegriff_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fstr Signalisierung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Je Fahrstraße zu zeigende Signalisierung, die sich nicht eindeutig aus den Stellwerksfunktionen ergibt. Siehe auch Bildung der Signalbegriffe. DB-Regelwerk Signaltabelle 2, jedoch sind hier alle Signalisierungen angegeben.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Signalisierung#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Signalisierung#getIDSignalSignalbegriff <em>ID Signal Signalbegriff</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Signalisierung#getIDSignalSignalbegriffZiel <em>ID Signal Signalbegriff Ziel</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_Signalisierung()
 * @model extendedMetaData="name='CFstr_Signalisierung' kind='elementOnly'"
 * @generated
 */
public interface Fstr_Signalisierung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Fstr Zug Rangier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung des Signalbildes zur jeweiligen Fahrstraße. DB-Regelwerk Signaltabelle 2, Spalte 1: \"Signalisierungsabschnitt/Zugstraße\" 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr Zug Rangier</em>' containment reference.
	 * @see #setIDFstrZugRangier(ID_Fstr_Zug_Rangier_TypeClass)
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_Signalisierung_IDFstrZugRangier()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fstr_Zug_Rangier'"
	 * @generated
	 */
	ID_Fstr_Zug_Rangier_TypeClass getIDFstrZugRangier();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Signalisierung#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fstr Zug Rangier</em>' containment reference.
	 * @see #getIDFstrZugRangier()
	 * @generated
	 */
	void setIDFstrZugRangier(ID_Fstr_Zug_Rangier_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Signal Signalbegriff</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung des Signalbegriffs zur jeweiligen Fahrstraße, u. U. in Abhängigkeit von ID Signal Signalbegriff Ziel. DB-Regelwerk Signaltabelle 2: Eintrag der jeweiligen Signalbegriffe
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal Signalbegriff</em>' containment reference.
	 * @see #setIDSignalSignalbegriff(ID_Signal_Signalbegriff_TypeClass)
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_Signalisierung_IDSignalSignalbegriff()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Signal_Signalbegriff'"
	 * @generated
	 */
	ID_Signal_Signalbegriff_TypeClass getIDSignalSignalbegriff();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Signalisierung#getIDSignalSignalbegriff <em>ID Signal Signalbegriff</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Signal Signalbegriff</em>' containment reference.
	 * @see #getIDSignalSignalbegriff()
	 * @generated
	 */
	void setIDSignalSignalbegriff(ID_Signal_Signalbegriff_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Signal Signalbegriff Ziel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Optionale Bedingung für die Anzeige von Fstr_Signalisierung_Besonders.ID Signal Signalbegriff. Das Zielsignal ist meist das Signal am Fahrstraßenziel, kann aber auch davor (z. B. gestufte Geschwindigkeitssignalisierung) oder dahinter (z. B. nach dem Ende des Weichenbereiches bei Ausfahrten) liegen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal Signalbegriff Ziel</em>' containment reference.
	 * @see #setIDSignalSignalbegriffZiel(ID_Signal_Signalbegriff_TypeClass)
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_Signalisierung_IDSignalSignalbegriffZiel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Signal_Signalbegriff_Ziel'"
	 * @generated
	 */
	ID_Signal_Signalbegriff_TypeClass getIDSignalSignalbegriffZiel();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Signalisierung#getIDSignalSignalbegriffZiel <em>ID Signal Signalbegriff Ziel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Signal Signalbegriff Ziel</em>' containment reference.
	 * @see #getIDSignalSignalbegriffZiel()
	 * @generated
	 */
	void setIDSignalSignalbegriffZiel(ID_Signal_Signalbegriff_TypeClass value);

} // Fstr_Signalisierung
