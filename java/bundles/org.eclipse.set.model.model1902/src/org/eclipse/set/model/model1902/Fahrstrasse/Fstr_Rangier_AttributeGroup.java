/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Fahrstrasse;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model1902.Verweise.ID_FMA_Anlage_Rangier_Frei_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fstr Rangier Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Rangier_AttributeGroup#getAutomatischeEinstellung <em>Automatische Einstellung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Rangier_AttributeGroup#getIDFMAAnlageRangierFrei <em>IDFMA Anlage Rangier Frei</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Rangier_AttributeGroup#getRangierGegenfahrtausschluss <em>Rangier Gegenfahrtausschluss</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_Rangier_AttributeGroup()
 * @model extendedMetaData="name='CFstr_Rangier' kind='elementOnly'"
 * @generated
 */
public interface Fstr_Rangier_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Automatische Einstellung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Möglichkeit des Fahrstraßenanstoßes über die manuelle Bedienung hinaus. Die Angabe für eine Zugstraße gilt auch für eventuell zugehörige (davorliegende) Mittelweichenteilfahrstraßen. DB-Regelwerk Zugstraßentabelle, Spalte 9 \"Selbststellbetrieb/Zuglenkung\" 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Automatische Einstellung</em>' containment reference.
	 * @see #setAutomatischeEinstellung(Automatische_Einstellung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_Rangier_AttributeGroup_AutomatischeEinstellung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Automatische_Einstellung'"
	 * @generated
	 */
	Automatische_Einstellung_TypeClass getAutomatischeEinstellung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Rangier_AttributeGroup#getAutomatischeEinstellung <em>Automatische Einstellung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatische Einstellung</em>' containment reference.
	 * @see #getAutomatischeEinstellung()
	 * @generated
	 */
	void setAutomatischeEinstellung(Automatische_Einstellung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDFMA Anlage Rangier Frei</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Verweise.ID_FMA_Anlage_Rangier_Frei_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den/die Freimeldeabschnitt(e), für die eine positive Gleisfreimeldung vor Sh 1/Ra 12-Stellung für die Rangierstraße notwendig ist. DB-Regelwerk Rangierstraßentabelle, Spalte 10 \"Punktförmige Gleisfreimeldeprüfung erforderlich\" und Spalte 13 \"Verzicht auf Zielgleisfreiprüfung\"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDFMA Anlage Rangier Frei</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_Rangier_AttributeGroup_IDFMAAnlageRangierFrei()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_FMA_Anlage_Rangier_Frei'"
	 * @generated
	 */
	EList<ID_FMA_Anlage_Rangier_Frei_TypeClass> getIDFMAAnlageRangierFrei();

	/**
	 * Returns the value of the '<em><b>Rangier Gegenfahrtausschluss</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gegenfahrtausschluss von Rangierstraßen in ein Inselgleis. Die Funktion entspricht Lastenheft ESTW R2.2.14. ja: Gegenfahrtausschluss besteht (Standardfunktion); Inselgleis_frei: Gegenfahrtausschluss besteht, wenn die Gegenrangierfahrt das Inselgleis noch nicht belegt hat;
	 * nein: Gegenfahrtausschluss besteht nicht. Gibt es keine Gegenrangierstraße (das Ziel der Rangierstraße liegt nicht in einem Inselgleis), ist das Attribut nicht sinnvoll füllbar und somit im XML-Export nicht enthalten. DB-Regelwerk Rangierstraßentabelle, Spalte 9 \"Ausschluss von Gegenfahrten\"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rangier Gegenfahrtausschluss</em>' containment reference.
	 * @see #setRangierGegenfahrtausschluss(Rangier_Gegenfahrtausschluss_TypeClass)
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_Rangier_AttributeGroup_RangierGegenfahrtausschluss()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Rangier_Gegenfahrtausschluss'"
	 * @generated
	 */
	Rangier_Gegenfahrtausschluss_TypeClass getRangierGegenfahrtausschluss();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Rangier_AttributeGroup#getRangierGegenfahrtausschluss <em>Rangier Gegenfahrtausschluss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rangier Gegenfahrtausschluss</em>' containment reference.
	 * @see #getRangierGegenfahrtausschluss()
	 * @generated
	 */
	void setRangierGegenfahrtausschluss(Rangier_Gegenfahrtausschluss_TypeClass value);

} // Fstr_Rangier_AttributeGroup
