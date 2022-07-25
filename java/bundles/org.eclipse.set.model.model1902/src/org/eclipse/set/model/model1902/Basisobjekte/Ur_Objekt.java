/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Basisobjekte;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ur Objekt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Allen Objekten zugrundeliegender Objekttyp, durch die jede Instanz eines Objektes einen eindeutigen Identifikator in Form einer GUID erhält.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Basisobjekte.Ur_Objekt#getIdentitaet <em>Identitaet</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Basisobjekte.BasisobjektePackage#getUr_Objekt()
 * @model abstract="true"
 *        extendedMetaData="name='CUr_Objekt' kind='elementOnly'"
 * @generated
 */
public interface Ur_Objekt extends EObject {
	/**
	 * Returns the value of the '<em><b>Identitaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eindeutige Identifizierung des Objektes mit Hilfe der GUID. Bei Verlinkungen auf ein Objekt wird eine entsprechende Referenz angegeben. Verlinkungsattribute setzen sich aus dem Präfix „ID_“ und in der Regel dem entsprechenden Objektnamen zusammen („ID_[Objekt]“). Die Eindeutigkeit der Verlinkung ergibt sich aus der Spezifikation der GUID, siehe hierfür RFC 4122: http://tools.ietf.org/html/rfc4122. Zu weiteren Vorgaben und Empfehlungen für die GUID-Erzeugung siehe Goldene Regeln Schnittstelle. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identitaet</em>' containment reference.
	 * @see #setIdentitaet(Identitaet_TypeClass)
	 * @see org.eclipse.set.model.model1902.Basisobjekte.BasisobjektePackage#getUr_Objekt_Identitaet()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Identitaet'"
	 * @generated
	 */
	Identitaet_TypeClass getIdentitaet();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Basisobjekte.Ur_Objekt#getIdentitaet <em>Identitaet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identitaet</em>' containment reference.
	 * @see #getIdentitaet()
	 * @generated
	 */
	void setIdentitaet(Identitaet_TypeClass value);

} // Ur_Objekt
