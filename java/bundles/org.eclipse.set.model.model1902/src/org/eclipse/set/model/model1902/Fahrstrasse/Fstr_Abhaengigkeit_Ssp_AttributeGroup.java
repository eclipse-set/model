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

import org.eclipse.set.model.model1902.Verweise.ID_Schluesselsperre_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fstr Abhaengigkeit Ssp Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Abhaengigkeit_Ssp_AttributeGroup#getAufloesungSspZielgeis <em>Aufloesung Ssp Zielgeis</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Abhaengigkeit_Ssp_AttributeGroup#getIDSchluesselsperre <em>ID Schluesselsperre</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_Abhaengigkeit_Ssp_AttributeGroup()
 * @model extendedMetaData="name='CFstr_Abhaengigkeit_Ssp' kind='elementOnly'"
 * @generated
 */
public interface Fstr_Abhaengigkeit_Ssp_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Aufloesung Ssp Zielgeis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kriterium für die Auflösung von überwachten Schlüsselsperren im Zielgleis von Rangierstraßen. DB-Regelwerk Lastenheft ESTW F1, Abschnitt 6.5 (Rangierstraßenauflösung)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aufloesung Ssp Zielgeis</em>' containment reference.
	 * @see #setAufloesungSspZielgeis(Aufloesung_Ssp_Zielgeis_TypeClass)
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_Abhaengigkeit_Ssp_AttributeGroup_AufloesungSspZielgeis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Aufloesung_Ssp_Zielgeis'"
	 * @generated
	 */
	Aufloesung_Ssp_Zielgeis_TypeClass getAufloesungSspZielgeis();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Abhaengigkeit_Ssp_AttributeGroup#getAufloesungSspZielgeis <em>Aufloesung Ssp Zielgeis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aufloesung Ssp Zielgeis</em>' containment reference.
	 * @see #getAufloesungSspZielgeis()
	 * @generated
	 */
	void setAufloesungSspZielgeis(Aufloesung_Ssp_Zielgeis_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Schluesselsperre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Schlüsselsperre, die überwacht sein muss, damit die Fstr gesichert ist. DB-Regelwerk Zugstraßentabelle, Spalte 5: \"Ssp in der Fahrstraße verschlossen und überwacht\"; Rangierstraßentabelle, Spalte 15: \"Ssp in der Rangierstraße verschlossen und überwacht\"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Schluesselsperre</em>' containment reference.
	 * @see #setIDSchluesselsperre(ID_Schluesselsperre_TypeClass)
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage#getFstr_Abhaengigkeit_Ssp_AttributeGroup_IDSchluesselsperre()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Schluesselsperre'"
	 * @generated
	 */
	ID_Schluesselsperre_TypeClass getIDSchluesselsperre();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Abhaengigkeit_Ssp_AttributeGroup#getIDSchluesselsperre <em>ID Schluesselsperre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Schluesselsperre</em>' containment reference.
	 * @see #getIDSchluesselsperre()
	 * @generated
	 */
	void setIDSchluesselsperre(ID_Schluesselsperre_TypeClass value);

} // Fstr_Abhaengigkeit_Ssp_AttributeGroup
