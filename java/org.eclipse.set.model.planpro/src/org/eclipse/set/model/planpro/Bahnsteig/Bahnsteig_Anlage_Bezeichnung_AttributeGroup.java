/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnsteig;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bahnsteig Anlage Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnsteig.Bahnsteig_Anlage_Bezeichnung_AttributeGroup#getBezeichnungBahnsteigAnlage <em>Bezeichnung Bahnsteig Anlage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Bahnsteig.BahnsteigPackage#getBahnsteig_Anlage_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CBahnsteig_Anlage_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface Bahnsteig_Anlage_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung Bahnsteig Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung der Bahnsteig_Anlage. Die Bezeichnung des Bahnsteigs muss nicht vergeben werden. Meist setzt sie sich aus dem Namen der beteiligten Bahnsteigkanten (z. B. \"Bahnsteig 3/4\") zusammen, gelegentlich kann sie aber auch einen eigenen Namen bekommen (z. B. \"Bahnsteig A\" mit den Gleisen 102 und 103). Die folgende Grafik zeigt beispielhaft die Bezeichnung eines Mitelbahnsteigs mit anschließendem Zungenbahnsteig (zwei Bahnsteig-Anlagen mit jeweils zwei Bahnsteig-Kanten). 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung Bahnsteig Anlage</em>' containment reference.
	 * @see #setBezeichnungBahnsteigAnlage(Bezeichnung_Bahnsteig_Anlage_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnsteig.BahnsteigPackage#getBahnsteig_Anlage_Bezeichnung_AttributeGroup_BezeichnungBahnsteigAnlage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_Bahnsteig_Anlage'"
	 * @generated
	 */
	Bezeichnung_Bahnsteig_Anlage_TypeClass getBezeichnungBahnsteigAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnsteig.Bahnsteig_Anlage_Bezeichnung_AttributeGroup#getBezeichnungBahnsteigAnlage <em>Bezeichnung Bahnsteig Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung Bahnsteig Anlage</em>' containment reference.
	 * @see #getBezeichnungBahnsteigAnlage()
	 * @generated
	 */
	void setBezeichnungBahnsteigAnlage(Bezeichnung_Bahnsteig_Anlage_TypeClass value);

} // Bahnsteig_Anlage_Bezeichnung_AttributeGroup
