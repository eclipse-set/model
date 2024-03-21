/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Geodaten;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Strecke Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Strecke_Bezeichnung_AttributeGroup#getBezeichnungStrecke <em>Bezeichnung Strecke</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getStrecke_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CStrecke_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface Strecke_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung Strecke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Streckenbezeichnung der DB AG. Streckenbezeichnungen sind i. d. R vierstellig. Ist aber z. B. der Verlauf der beiden Gleise einer zweigleisigen Strecke so unterschiedlich, dass eine getrennte Kilometrierung notwendig ist, wird der vierstelligen Bezeichnung noch eine Kennung (-1) angehängt. Beispiel: Stecke 6240 ist zweigleisig. Bedingt durch einen anderen Verlauf der linken und rechten Gleislage, bekommt z. B. das linke Gleis eine andere Kilometrierung. Strecke 6240 (Rechts); Strecke 6240-1 (Links). DB-Regelwerk 885.6002A03
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung Strecke</em>' containment reference.
	 * @see #setBezeichnungStrecke(Bezeichnung_Strecke_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getStrecke_Bezeichnung_AttributeGroup_BezeichnungStrecke()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_Strecke'"
	 * @generated
	 */
	Bezeichnung_Strecke_TypeClass getBezeichnungStrecke();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Strecke_Bezeichnung_AttributeGroup#getBezeichnungStrecke <em>Bezeichnung Strecke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung Strecke</em>' containment reference.
	 * @see #getBezeichnungStrecke()
	 * @generated
	 */
	void setBezeichnungStrecke(Bezeichnung_Strecke_TypeClass value);

} // Strecke_Bezeichnung_AttributeGroup
