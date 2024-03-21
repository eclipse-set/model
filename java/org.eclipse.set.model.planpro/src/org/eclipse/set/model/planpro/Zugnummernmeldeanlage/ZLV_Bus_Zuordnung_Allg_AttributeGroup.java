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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZLV Bus Zuordnung Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Zuordnung_Allg_AttributeGroup#getAnschlussnummer <em>Anschlussnummer</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Zuordnung_Allg_AttributeGroup#getUnterstationNr <em>Unterstation Nr</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZLV_Bus_Zuordnung_Allg_AttributeGroup()
 * @model extendedMetaData="name='CZLV_Bus_Zuordnung_Allg' kind='elementOnly'"
 * @generated
 */
public interface ZLV_Bus_Zuordnung_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Anschlussnummer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anschlussnummer der (K/M)Unterstation auf dem ZLV-Bus. Jede Unterstation einer Kus hat für jeden angeschlossenen ZLV-Bus eine eigene und einmalige Anschlussnummer. Das Attribut wird nur gefüllt, wenn die Unterstation an mehr als einem ZLV-Bus angeschlossen wird. DB-Regelwerk Allgemeine Angaben finden sich in Ril 819.0731 5 (12).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anschlussnummer</em>' containment reference.
	 * @see #setAnschlussnummer(Anschlussnummer_TypeClass)
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZLV_Bus_Zuordnung_Allg_AttributeGroup_Anschlussnummer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Anschlussnummer'"
	 * @generated
	 */
	Anschlussnummer_TypeClass getAnschlussnummer();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Zuordnung_Allg_AttributeGroup#getAnschlussnummer <em>Anschlussnummer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschlussnummer</em>' containment reference.
	 * @see #getAnschlussnummer()
	 * @generated
	 */
	void setAnschlussnummer(Anschlussnummer_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Unterstation Nr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der Unterstationsnummer auf diesem ZLV-Bus. Es wird empfohlen, auf einem ZLV-Bus nur gerade Nummern im Bereich 02..20 oder ungerade Nummern im Bereich 01..19 zu verwenden. DB-Regelwerk 819.0731 5 (12)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unterstation Nr</em>' containment reference.
	 * @see #setUnterstationNr(Unterstation_Nr_TypeClass)
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZLV_Bus_Zuordnung_Allg_AttributeGroup_UnterstationNr()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Unterstation_Nr'"
	 * @generated
	 */
	Unterstation_Nr_TypeClass getUnterstationNr();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZLV_Bus_Zuordnung_Allg_AttributeGroup#getUnterstationNr <em>Unterstation Nr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unterstation Nr</em>' containment reference.
	 * @see #getUnterstationNr()
	 * @generated
	 */
	void setUnterstationNr(Unterstation_Nr_TypeClass value);

} // ZLV_Bus_Zuordnung_Allg_AttributeGroup
