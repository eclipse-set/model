/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.planpro.Verweise.ID_Markanter_Punkt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datenpunkt Einmesspunkt Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt_Einmesspunkt_AttributeGroup#getAbstandEinmesspunkt <em>Abstand Einmesspunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt_Einmesspunkt_AttributeGroup#getIDEinmesspunkt <em>ID Einmesspunkt</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_Einmesspunkt_AttributeGroup()
 * @model extendedMetaData="name='CDatenpunkt_Einmesspunkt' kind='elementOnly'"
 * @generated
 */
public interface Datenpunkt_Einmesspunkt_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Abstand Einmesspunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Soll-Abstand zum unter ID_Einmesspunkt angegebenen Referenzpunkt für die Montage. Das Attribut darf nur in den XML-Dateien für die Balisen-Programmiergeräte gefüllt sein (Ersatz für die topologische Berechnung des Abstands). Die Umsetzung der Richtungsinformationen in den Planunterlagen muss entsprechend des Anwendungssystems festgelegt und im Werkzeug implementiert werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstand Einmesspunkt</em>' containment reference.
	 * @see #setAbstandEinmesspunkt(Abstand_Einmesspunkt_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_Einmesspunkt_AttributeGroup_AbstandEinmesspunkt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Abstand_Einmesspunkt'"
	 * @generated
	 */
	Abstand_Einmesspunkt_TypeClass getAbstandEinmesspunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt_Einmesspunkt_AttributeGroup#getAbstandEinmesspunkt <em>Abstand Einmesspunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstand Einmesspunkt</em>' containment reference.
	 * @see #getAbstandEinmesspunkt()
	 * @generated
	 */
	void setAbstandEinmesspunkt(Abstand_Einmesspunkt_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Einmesspunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den Referenzpunkt für die Montage. ETCS L2: Vorläufig wird dieser Verweis nicht verwendet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Einmesspunkt</em>' containment reference.
	 * @see #setIDEinmesspunkt(ID_Markanter_Punkt_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDatenpunkt_Einmesspunkt_AttributeGroup_IDEinmesspunkt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Einmesspunkt'"
	 * @generated
	 */
	ID_Markanter_Punkt_TypeClass getIDEinmesspunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Datenpunkt_Einmesspunkt_AttributeGroup#getIDEinmesspunkt <em>ID Einmesspunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Einmesspunkt</em>' containment reference.
	 * @see #getIDEinmesspunkt()
	 * @generated
	 */
	void setIDEinmesspunkt(ID_Markanter_Punkt_TypeClass value);

} // Datenpunkt_Einmesspunkt_AttributeGroup
