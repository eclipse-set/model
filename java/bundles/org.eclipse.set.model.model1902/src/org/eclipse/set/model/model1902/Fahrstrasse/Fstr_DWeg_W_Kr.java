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

import org.eclipse.set.model.model1902.Verweise.ID_Fstr_DWeg_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_W_Kr_Gsp_Element_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fstr DWeg WKr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zuordnung von Weichen und Kreuzungen zum in Fstr DWeg geplanten Durchrutschweg. Eine Zuordnung von Weichen und Kreuzungen über den zugrunde liegenden Fstr Fahrweg ist nicht möglich, da das Ende des Durchrutschweges in einer Weiche liegen kann, deren Sicherung explizit geplant werden muss. Außerdem muss für Weichen im Durchrutschweg angegeben werden, ob sie verschlossen werden und ob sie Flankenschutz anfordern sollen. Eine Angabe der Lage der Weiche ist nicht notwendig, da sich diese über Fstr Fahrweg (Bereich Objekt) ergibt. Obwohl die Spaltenüberschrift in der Durchrutschwegtabelle auch von Gleissperren spricht, werden Gleissperren nicht vorgesehen. DB-Regelwerk Durchrutschwegtabelle, Spalten 9 - 12: \"Weichen, Kreuzungen, Gleissperren\"
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_W_Kr#getElementVerschluss <em>Element Verschluss</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_W_Kr#getIDFstrDWeg <em>ID Fstr DWeg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_W_Kr#getIDWKrGspElement <em>IDW Kr Gsp Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_DWeg_W_Kr()
 * @model extendedMetaData="name='CFstr_DWeg_W_Kr' kind='elementOnly'"
 * @generated
 */
public interface Fstr_DWeg_W_Kr extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Element Verschluss</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verschluss der Weiche im Durchrutschweg. Stumpf berutschte, auffahrbare Weichen im Durchrutschweg können unverschlossen bleiben.\n\nDas Attribut ist herstellerneutralitätskritisch.\n \nDB-Regelwerk Durchrutschwegtabelle, Spalten 9 - 12: \"Weichen, Kreuzungen, Gleissperren\"\n
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Verschluss</em>' containment reference.
	 * @see #setElementVerschluss(Element_Verschluss_TypeClass)
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_DWeg_W_Kr_ElementVerschluss()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Element_Verschluss'"
	 * @generated
	 */
	Element_Verschluss_TypeClass getElementVerschluss();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_W_Kr#getElementVerschluss <em>Element Verschluss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Verschluss</em>' containment reference.
	 * @see #getElementVerschluss()
	 * @generated
	 */
	void setElementVerschluss(Element_Verschluss_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Fstr DWeg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung von Weichen und Kreuzungen zum DWeg. DB-Regelwerk Durchrutschwegtabelle (gleiche Zeile) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr DWeg</em>' containment reference.
	 * @see #setIDFstrDWeg(ID_Fstr_DWeg_TypeClass)
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_DWeg_W_Kr_IDFstrDWeg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fstr_DWeg'"
	 * @generated
	 */
	ID_Fstr_DWeg_TypeClass getIDFstrDWeg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_W_Kr#getIDFstrDWeg <em>ID Fstr DWeg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fstr DWeg</em>' containment reference.
	 * @see #getIDFstrDWeg()
	 * @generated
	 */
	void setIDFstrDWeg(ID_Fstr_DWeg_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDW Kr Gsp Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung von Weichen und Kreuzungen zum DWeg. DB-Regelwerk Durchrutschwegtabelle, Spalten 9 - 12: \"Weichen, Kreuzungen, Gleissperren - verschließen/nicht verschließen\" 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDW Kr Gsp Element</em>' containment reference.
	 * @see #setIDWKrGspElement(ID_W_Kr_Gsp_Element_TypeClass)
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_DWeg_W_Kr_IDWKrGspElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_W_Kr_Gsp_Element'"
	 * @generated
	 */
	ID_W_Kr_Gsp_Element_TypeClass getIDWKrGspElement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_W_Kr#getIDWKrGspElement <em>IDW Kr Gsp Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDW Kr Gsp Element</em>' containment reference.
	 * @see #getIDWKrGspElement()
	 * @generated
	 */
	void setIDWKrGspElement(ID_W_Kr_Gsp_Element_TypeClass value);

} // Fstr_DWeg_W_Kr
