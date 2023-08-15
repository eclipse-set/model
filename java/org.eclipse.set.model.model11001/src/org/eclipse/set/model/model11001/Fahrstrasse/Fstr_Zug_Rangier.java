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

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model11001.Verweise.ID_Fstr_Ausschluss_Besonders_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Fstr_Fahrweg_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fstr Zug Rangier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zug- oder Rangierstraße. Jeder Zugstraße ist ein Durchrutschweg (modelliert in Fstr DWeg) zugeordnet. Gibt es Fahrstraßen mit mehreren Durchrutschwegen, so werden dafür mehrere Zugstraßen angelegt, die auf dem gleichen befahrenen Teil (modelliert in Fstr Fahrweg) basieren. Mit dem Datenmodell werden auch Zentralblockfahrstraßen geplant. Der hiermit verknüpfte Gefahrpunktabstand wird in Fstr DWeg abgebildet. Eine Zentralblockfahrstraße (Fstr_Zug_Art==ZB) über die ESTW-Zentraleinheit-Grenze wird in zwei Teilblockfahrstraßen (Fstr_Zug_Art==ZB) im Bereich der jeweiligen ESTW-Zentraleinheit geplant. Dabei kann ein befahrener Teil der Länge Null entstehen, wenn die zweite Teilblockfahrstraße nur aus dem Durchrutschweg besteht. Zielsignal der ersten ist Startsignal der zweiten Teilblockfahrstraße. Fahrstraßen über eine ESTW-Zentraleinheit-Grenze (FAP) werden als zwei Teilfahrstraßen (Fstr_Zug_Art==ZT/ZTU; Fstr_Rangier_Art==RT/RTU) geplant. Kann die erste Teilfahrstraße mit mehreren weiteren Teilfahrstraßen fortgesetzt werden, so muss für jede geplante Kombination eine eigene Instanz der ersten Teilfahrstraße angelegt werden (analog der Zuordnung mehrerer Durchrutschwege). Eine Mittelweichenteilfahrstraße besitzt keinen Durchrutschweg. Eine explizite Verknüpfung von Mittelweichenteilfahrstraßen untereinander und mit der Zugstraße erfolgt nicht, da sich diese über die Topologie und insbesondere über Start und Ziel ergeben. Eine Rangierstraße besitzt ebenfalls keinen Durchrutschweg. Die speziellen Attribute von Zug-/Rangier-/Mittelweichenteilfahrstraße werden in eigenen Attributgruppen gespeichert, die sich gegenseitig ausschließen. Gruppenausfahrten werden als Zugstraßen ohne besondere Eigenschaft abgebildet. Das Gruppenausfahrsignal wird unter ID Signal Gruppenausfahrt explizit angegeben, die Gruppenausfahrstraße ist somit eindeutig erkennbar. DB-Regelwerk Zugstraßentabelle (eine Zeile), Rangierstraßentabelle (eine Zeile), Mittelweichenteilfahrstraßentabelle (eine Zeile).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Zug_Rangier#getFstrZugRangierAllg <em>Fstr Zug Rangier Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Zug_Rangier#getIDFstrAusschlussBesonders <em>ID Fstr Ausschluss Besonders</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Zug_Rangier#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Zug_Rangier#getFstrMittel <em>Fstr Mittel</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Zug_Rangier#getFstrRangier <em>Fstr Rangier</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Zug_Rangier#getFstrZug <em>Fstr Zug</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage#getFstr_Zug_Rangier()
 * @model extendedMetaData="name='CFstr_Zug_Rangier' kind='elementOnly'"
 * @generated
 */
public interface Fstr_Zug_Rangier extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Fstr Zug Rangier Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fstr Zug Rangier Allg</em>' containment reference.
	 * @see #setFstrZugRangierAllg(Fstr_Zug_Rangier_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage#getFstr_Zug_Rangier_FstrZugRangierAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Fstr_Zug_Rangier_Allg'"
	 * @generated
	 */
	Fstr_Zug_Rangier_Allg_AttributeGroup getFstrZugRangierAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Zug_Rangier#getFstrZugRangierAllg <em>Fstr Zug Rangier Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fstr Zug Rangier Allg</em>' containment reference.
	 * @see #getFstrZugRangierAllg()
	 * @generated
	 */
	void setFstrZugRangierAllg(Fstr_Zug_Rangier_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Fstr Ausschluss Besonders</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.Verweise.ID_Fstr_Ausschluss_Besonders_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Besonderer Fahrstraßenausschluss, der in Sonderfällen geplant werden muss, z. B. Rangierstraße mit paralleler Gruppenausfahrt. Der Ausschluss von Durchfahrten ist hier nicht anzugeben (siehe Signal).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr Ausschluss Besonders</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage#getFstr_Zug_Rangier_IDFstrAusschlussBesonders()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Fstr_Ausschluss_Besonders'"
	 * @generated
	 */
	EList<ID_Fstr_Ausschluss_Besonders_TypeClass> getIDFstrAusschlussBesonders();

	/**
	 * Returns the value of the '<em><b>ID Fstr Fahrweg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung des Fahrwegs zur Fahrstraße als befahrener Teil. DB-Regelwerk Zugstraßentabelle, Bezeichnung der Fstr (Start und Ziel) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr Fahrweg</em>' containment reference.
	 * @see #setIDFstrFahrweg(ID_Fstr_Fahrweg_TypeClass)
	 * @see org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage#getFstr_Zug_Rangier_IDFstrFahrweg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fstr_Fahrweg'"
	 * @generated
	 */
	ID_Fstr_Fahrweg_TypeClass getIDFstrFahrweg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Zug_Rangier#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fstr Fahrweg</em>' containment reference.
	 * @see #getIDFstrFahrweg()
	 * @generated
	 */
	void setIDFstrFahrweg(ID_Fstr_Fahrweg_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Fstr Mittel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fstr Mittel</em>' containment reference.
	 * @see #setFstrMittel(Fstr_Mittel_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage#getFstr_Zug_Rangier_FstrMittel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fstr_Mittel'"
	 * @generated
	 */
	Fstr_Mittel_AttributeGroup getFstrMittel();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Zug_Rangier#getFstrMittel <em>Fstr Mittel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fstr Mittel</em>' containment reference.
	 * @see #getFstrMittel()
	 * @generated
	 */
	void setFstrMittel(Fstr_Mittel_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Fstr Rangier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fstr Rangier</em>' containment reference.
	 * @see #setFstrRangier(Fstr_Rangier_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage#getFstr_Zug_Rangier_FstrRangier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fstr_Rangier'"
	 * @generated
	 */
	Fstr_Rangier_AttributeGroup getFstrRangier();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Zug_Rangier#getFstrRangier <em>Fstr Rangier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fstr Rangier</em>' containment reference.
	 * @see #getFstrRangier()
	 * @generated
	 */
	void setFstrRangier(Fstr_Rangier_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Fstr Zug</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fstr Zug</em>' containment reference.
	 * @see #setFstrZug(Fstr_Zug_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage#getFstr_Zug_Rangier_FstrZug()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fstr_Zug'"
	 * @generated
	 */
	Fstr_Zug_AttributeGroup getFstrZug();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_Zug_Rangier#getFstrZug <em>Fstr Zug</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fstr Zug</em>' containment reference.
	 * @see #getFstrZug()
	 * @generated
	 */
	void setFstrZug(Fstr_Zug_AttributeGroup value);

} // Fstr_Zug_Rangier
