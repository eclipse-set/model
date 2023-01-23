/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bedienung;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedien Zentrale Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Zentrale_Bezeichnung_AttributeGroup#getBezBedZentrale <em>Bez Bed Zentrale</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_Zentrale_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CBedien_Zentrale_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface Bedien_Zentrale_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bez Bed Zentrale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung einer Betriebszentrale, die nicht gemäß Richtlinie 100 bezeichnet ist (z. B. eine regionale Bedienzentrale) und deren Name somit nicht über den Verweis auf eine Örtlichkeit ermittelt werden kann. Derzeit wird noch geprüft, ob auch regionale Bedienzentralen gemäß Ril 100 bezeichnet werden müssen. Entsprechend kann dieses Attribut ggf. entfallen oder als \"nicht Pflicht\" anderweitig verwendet werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bez Bed Zentrale</em>' containment reference.
	 * @see #setBezBedZentrale(Bez_Bed_Zentrale_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_Zentrale_Bezeichnung_AttributeGroup_BezBedZentrale()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bez_Bed_Zentrale'"
	 * @generated
	 */
	Bez_Bed_Zentrale_TypeClass getBezBedZentrale();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Zentrale_Bezeichnung_AttributeGroup#getBezBedZentrale <em>Bez Bed Zentrale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bez Bed Zentrale</em>' containment reference.
	 * @see #getBezBedZentrale()
	 * @generated
	 */
	void setBezBedZentrale(Bez_Bed_Zentrale_TypeClass value);

} // Bedien_Zentrale_Bezeichnung_AttributeGroup
