/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Zugnummernmeldeanlage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_ZLV_Bus_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZLV Bus Besondere Anlage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Besondere Anlage, die an einen ZLV-Bus angeschlossen ist.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Besondere_Anlage#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Besondere_Anlage#getIDZLVBus <em>IDZLV Bus</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Besondere_Anlage#getUnterstationNr <em>Unterstation Nr</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZLV_Bus_Besondere_Anlage()
 * @model extendedMetaData="name='CZLV_Bus_Besondere_Anlage' kind='elementOnly'"
 * @generated
 */
public interface ZLV_Bus_Besondere_Anlage extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZLV_Bus_Besondere_Anlage_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Besondere_Anlage#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDZLV Bus</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Verweise.ID_ZLV_Bus_ohne_Proxy_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den ZLV-Bus, an den die Besondere Anlage angeschlossen ist. Mehrere Anschlüsse sind möglich, z. B. für Zugnummern-Dekoder.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZLV Bus</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZLV_Bus_Besondere_Anlage_IDZLVBus()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_ZLV_Bus'"
	 * @generated
	 */
	EList<ID_ZLV_Bus_ohne_Proxy_TypeClass> getIDZLVBus();

	/**
	 * Returns the value of the '<em><b>Unterstation Nr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der Unterstationsnummer auf diesem ZLV-Bus. Es wird empfohlen, auf einem ZLV-Bus nur gerade Nummern im Bereich 02..20 oder ungerade Nummern im Bereich 01..19 zu verwenden. DB-Regelwerk 819.0731 5 (12)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unterstation Nr</em>' containment reference.
	 * @see #setUnterstationNr(Unterstation_Nr_TypeClass)
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZLV_Bus_Besondere_Anlage_UnterstationNr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Unterstation_Nr'"
	 * @generated
	 */
	Unterstation_Nr_TypeClass getUnterstationNr();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Besondere_Anlage#getUnterstationNr <em>Unterstation Nr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unterstation Nr</em>' containment reference.
	 * @see #getUnterstationNr()
	 * @generated
	 */
	void setUnterstationNr(Unterstation_Nr_TypeClass value);

} // ZLV_Bus_Besondere_Anlage
