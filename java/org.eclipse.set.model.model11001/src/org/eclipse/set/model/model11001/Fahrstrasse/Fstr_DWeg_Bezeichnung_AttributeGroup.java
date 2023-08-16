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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fstr DWeg Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_DWeg_Bezeichnung_AttributeGroup#getBezeichnungFstrDWeg <em>Bezeichnung Fstr DWeg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage#getFstr_DWeg_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CFstr_DWeg_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface Fstr_DWeg_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung Fstr DWeg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung des Durchrutschwegs. Der erste Durchrutschweg hinter jedem Zugziel wird mit \"D1\" bezeichnet, alle weiteren Durchrutschwege erhalten eine fortlaufende Nummerierung (D2, D3, ...). Von der Bezeichnung unabhängig ist der Vorzugs-DWeg. H-Fahrstraßen werden über Fahrstraßen mit D-Wegen abgebildet, deren Bezeichnung um den Zusatz „H“ erweitert wird (z. B. D1H). DB-Regelwerk Durchrutschwegtabelle, Spalte 3: \"Bezeichnung\"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung Fstr DWeg</em>' containment reference.
	 * @see #setBezeichnungFstrDWeg(Bezeichnung_Fstr_DWeg_TypeClass)
	 * @see org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage#getFstr_DWeg_Bezeichnung_AttributeGroup_BezeichnungFstrDWeg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_Fstr_DWeg'"
	 * @generated
	 */
	Bezeichnung_Fstr_DWeg_TypeClass getBezeichnungFstrDWeg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_DWeg_Bezeichnung_AttributeGroup#getBezeichnungFstrDWeg <em>Bezeichnung Fstr DWeg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung Fstr DWeg</em>' containment reference.
	 * @see #getBezeichnungFstrDWeg()
	 * @generated
	 */
	void setBezeichnungFstrDWeg(Bezeichnung_Fstr_DWeg_TypeClass value);

} // Fstr_DWeg_Bezeichnung_AttributeGroup
