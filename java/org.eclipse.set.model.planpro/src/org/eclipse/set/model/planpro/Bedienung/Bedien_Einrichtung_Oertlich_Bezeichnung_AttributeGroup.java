/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bedienung;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedien Einrichtung Oertlich Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup#getBedienEinrichtOertlBez <em>Bedien Einricht Oertl Bez</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Bedienung.BedienungPackage#getBedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CBedien_Einrichtung_Oertlich_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bedien Einricht Oertl Bez</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung der örtlichen Bedieneinrichtung. Örtliche Bedieneinrichtungen haben in der Regel keine eigene Bezeichnung in der Außenanlage. Das Attribut wird daher nur gefüllt, wenn davon abweichend die Bedieneinrichtung eine Bezeichnung erhalten soll. Die Bezeichnung der jeweils zu bedienenden Elemente für die Beschriftung auf der örtlichen Bedieneinrichtung ist den Elementen oder dem Anhang Benutzeroberfläche zu entnehmen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bedien Einricht Oertl Bez</em>' containment reference.
	 * @see #setBedienEinrichtOertlBez(Bedien_Einricht_Oertl_Bez_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bedienung.BedienungPackage#getBedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup_BedienEinrichtOertlBez()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bedien_Einricht_Oertl_Bez'"
	 * @generated
	 */
	Bedien_Einricht_Oertl_Bez_TypeClass getBedienEinrichtOertlBez();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup#getBedienEinrichtOertlBez <em>Bedien Einricht Oertl Bez</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bedien Einricht Oertl Bez</em>' containment reference.
	 * @see #getBedienEinrichtOertlBez()
	 * @generated
	 */
	void setBedienEinrichtOertlBez(Bedien_Einricht_Oertl_Bez_TypeClass value);

} // Bedien_Einrichtung_Oertlich_Bezeichnung_AttributeGroup
