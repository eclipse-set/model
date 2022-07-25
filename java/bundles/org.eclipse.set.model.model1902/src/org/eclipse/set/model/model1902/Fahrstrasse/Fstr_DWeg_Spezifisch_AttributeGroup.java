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

import org.eclipse.set.model.model1902.Verweise.ID_FMA_Anlage_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fstr DWeg Spezifisch Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_Spezifisch_AttributeGroup#getAufloesungVerzoegerung <em>Aufloesung Verzoegerung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_Spezifisch_AttributeGroup#getDWegReihenfolge <em>DWeg Reihenfolge</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_Spezifisch_AttributeGroup#getDWegV <em>DWeg V</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_Spezifisch_AttributeGroup#getDWegVAufwertungVerzicht <em>DWeg VAufwertung Verzicht</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_Spezifisch_AttributeGroup#getIDFMAAnlageZielgleis <em>IDFMA Anlage Zielgleis</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_DWeg_Spezifisch_AttributeGroup()
 * @model extendedMetaData="name='CFstr_DWeg_Spezifisch' kind='elementOnly'"
 * @generated
 */
public interface Fstr_DWeg_Spezifisch_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Aufloesung Verzoegerung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verzögerungszeit der Durchrutschwegauflösung bei zeitgesteuerter Auflösung. Befüllung bei Durchrutschwegen der Länge \"Null\": Ziel ist ein Zugdeckungssignal: Kennlichtverzögerungszeit, In allen anderen Fällen: 0 (Null). DB-Regelwerk Durchrutschwegtabelle, Spalte 17: \"verzögert\"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aufloesung Verzoegerung</em>' containment reference.
	 * @see #setAufloesungVerzoegerung(Aufloesung_Verzoegerung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_DWeg_Spezifisch_AttributeGroup_AufloesungVerzoegerung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Aufloesung_Verzoegerung'"
	 * @generated
	 */
	Aufloesung_Verzoegerung_TypeClass getAufloesungVerzoegerung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_Spezifisch_AttributeGroup#getAufloesungVerzoegerung <em>Aufloesung Verzoegerung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aufloesung Verzoegerung</em>' containment reference.
	 * @see #getAufloesungVerzoegerung()
	 * @generated
	 */
	void setAufloesungVerzoegerung(Aufloesung_Verzoegerung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>DWeg Reihenfolge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reihenfolge des Erscheinens von DWegen auf der Bedienoberfläche. Die Angabe wird ausschließlich im Untergewerk \"Bedienung Fdl\" benötigt und ist für das Untergewerk \"ESTW\" nicht relevant. Die Auflistung von D-Wegen in der D-Weg-Tabelle erfolgt rein auf Basis alphanumerischer Sortierung. DB-Regelwerk Durchrutschwegtabelle: Reihenfolge des Eintrags von Durchrutschwegen eines Signals
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DWeg Reihenfolge</em>' containment reference.
	 * @see #setDWegReihenfolge(DWeg_Reihenfolge_TypeClass)
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_DWeg_Spezifisch_AttributeGroup_DWegReihenfolge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DWeg_Reihenfolge'"
	 * @generated
	 */
	DWeg_Reihenfolge_TypeClass getDWegReihenfolge();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_Spezifisch_AttributeGroup#getDWegReihenfolge <em>DWeg Reihenfolge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DWeg Reihenfolge</em>' containment reference.
	 * @see #getDWegReihenfolge()
	 * @generated
	 */
	void setDWegReihenfolge(DWeg_Reihenfolge_TypeClass value);

	/**
	 * Returns the value of the '<em><b>DWeg V</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Geschwindigkeitseinschränkung, die sich allein aufgrund der Länge des DWeges ergibt. Die tatsächlich gefahrene Geschwindigkeit kann aus anderen Gründen (Weichen, Gleislage etc.) geringer sein. Die Geschwindigkeitsrestriktion gilt nur für signalgeführte Züge, bei ETCS L2oS erfolgt keine Angabe. DB-Regelwerk Durchrutschwegtabelle, Spalte 4: \"[Geschwindigkeit] möglich\" (außer v max)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DWeg V</em>' containment reference.
	 * @see #setDWegV(DWeg_V_TypeClass)
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_DWeg_Spezifisch_AttributeGroup_DWegV()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DWeg_V'"
	 * @generated
	 */
	DWeg_V_TypeClass getDWegV();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_Spezifisch_AttributeGroup#getDWegV <em>DWeg V</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DWeg V</em>' containment reference.
	 * @see #getDWegV()
	 * @generated
	 */
	void setDWegV(DWeg_V_TypeClass value);

	/**
	 * Returns the value of the '<em><b>DWeg VAufwertung Verzicht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei Überstellung des DWeges durch die anschließende Fahrstraße wird auf eine Aufwertung der Geschwindigkeitseinschränkung aufgrund des DWeges verzichtet. In der Regel führt die Überstellung eines DWeges zum Wegfall der durch den DWeg verursachten Geschwindigkeitsrestriktion. War die DWeg-Geschwindigkeit maßgebend, so kann die erste Fahrstraße mit einer entsprechend höheren Geschwindigkeit signalisiert werden (Geschwindigkeitsaufwertung). In Ausnahmefällen soll die Aufwertung nicht stattfinden, insbesondere dann, wenn die folgende Fahrstraße kürzer ist, als der aufgewertete DWeg. Damit wird auf die \"Aufwertung verzichtet\". Das Attribut ist nur bei folgenden DWegen sinnvoll füllbar: am Beginn des DWeges beginnt eine Zugstraße UND es handelt sich um einen verkürzten DWeg, aufgrund dessen die Einfahrgeschwindigkeit vermindert wird. DB-Regelwerk Durchrutschwegtabelle, Spalte 14: \"zulässige D-Weg Expansion\", allerdings in negierter Bedeutung zum jetzigen Attribut
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DWeg VAufwertung Verzicht</em>' containment reference.
	 * @see #setDWegVAufwertungVerzicht(DWeg_V_Aufwertung_Verzicht_TypeClass)
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_DWeg_Spezifisch_AttributeGroup_DWegVAufwertungVerzicht()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DWeg_V_Aufwertung_Verzicht'"
	 * @generated
	 */
	DWeg_V_Aufwertung_Verzicht_TypeClass getDWegVAufwertungVerzicht();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_Spezifisch_AttributeGroup#getDWegVAufwertungVerzicht <em>DWeg VAufwertung Verzicht</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DWeg VAufwertung Verzicht</em>' containment reference.
	 * @see #getDWegVAufwertungVerzicht()
	 * @generated
	 */
	void setDWegVAufwertungVerzicht(DWeg_V_Aufwertung_Verzicht_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDFMA Anlage Zielgleis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Freimeldeabschnitt, bei dessen Belegung die zeitgesteuerte Durchrutschwegauflösung beginnt. DB-Regelwerk Durchrutschwegtabelle, Spalte 16: \"Zielgleisabschnitt\"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDFMA Anlage Zielgleis</em>' containment reference.
	 * @see #setIDFMAAnlageZielgleis(ID_FMA_Anlage_TypeClass)
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_DWeg_Spezifisch_AttributeGroup_IDFMAAnlageZielgleis()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_FMA_Anlage_Zielgleis'"
	 * @generated
	 */
	ID_FMA_Anlage_TypeClass getIDFMAAnlageZielgleis();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_Spezifisch_AttributeGroup#getIDFMAAnlageZielgleis <em>IDFMA Anlage Zielgleis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDFMA Anlage Zielgleis</em>' containment reference.
	 * @see #getIDFMAAnlageZielgleis()
	 * @generated
	 */
	void setIDFMAAnlageZielgleis(ID_FMA_Anlage_TypeClass value);

} // Fstr_DWeg_Spezifisch_AttributeGroup
