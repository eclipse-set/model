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

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_Fstr_Fahrweg_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETCS Richtungsanzeige</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abbildung der Vorgaben zur Richtungsanzeige bei ETCS L2. DB-Regelwerk Ril 819.1344, 4.3.3 (74)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Richtungsanzeige#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Richtungsanzeige#getIDOertlichkeitInRichtung <em>ID Oertlichkeit In Richtung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Richtungsanzeige#getTextmeldung <em>Textmeldung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Richtungsanzeige()
 * @model extendedMetaData="name='CETCS_Richtungsanzeige' kind='elementOnly'"
 * @generated
 */
public interface ETCS_Richtungsanzeige extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Fstr Fahrweg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den Fahrweg, für den die Richtungsanzeige erfolgen soll.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr Fahrweg</em>' containment reference.
	 * @see #setIDFstrFahrweg(ID_Fstr_Fahrweg_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Richtungsanzeige_IDFstrFahrweg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fstr_Fahrweg'"
	 * @generated
	 */
	ID_Fstr_Fahrweg_ohne_Proxy_TypeClass getIDFstrFahrweg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Richtungsanzeige#getIDFstrFahrweg <em>ID Fstr Fahrweg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fstr Fahrweg</em>' containment reference.
	 * @see #getIDFstrFahrweg()
	 * @generated
	 */
	void setIDFstrFahrweg(ID_Fstr_Fahrweg_ohne_Proxy_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Oertlichkeit In Richtung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die nächste Zugmeldestelle, die bei Nutzung des angegebenen Fahrwegs zu erreichen ist. DB-Regelwerk Ril 819.1344, 4.3.3 (74)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Oertlichkeit In Richtung</em>' containment reference.
	 * @see #setIDOertlichkeitInRichtung(ID_Oertlichkeit_Proxy_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Richtungsanzeige_IDOertlichkeitInRichtung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Oertlichkeit_In_Richtung'"
	 * @generated
	 */
	ID_Oertlichkeit_Proxy_TypeClass getIDOertlichkeitInRichtung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Richtungsanzeige#getIDOertlichkeitInRichtung <em>ID Oertlichkeit In Richtung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Oertlichkeit In Richtung</em>' containment reference.
	 * @see #getIDOertlichkeitInRichtung()
	 * @generated
	 */
	void setIDOertlichkeitInRichtung(ID_Oertlichkeit_Proxy_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Textmeldung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Textmeldung, die dem Tf angezeigt wird. Der Inhalt muss in der BAST enthalten sein oder vom Auftraggeber bereitgestellt werden. DB-Regelwerk Ril 819.1344, 4.3.3 (74)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Textmeldung</em>' containment reference.
	 * @see #setTextmeldung(Textmeldung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Richtungsanzeige_Textmeldung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Textmeldung'"
	 * @generated
	 */
	Textmeldung_TypeClass getTextmeldung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ETCS_Richtungsanzeige#getTextmeldung <em>Textmeldung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Textmeldung</em>' containment reference.
	 * @see #getTextmeldung()
	 * @generated
	 */
	void setTextmeldung(Textmeldung_TypeClass value);

} // ETCS_Richtungsanzeige
