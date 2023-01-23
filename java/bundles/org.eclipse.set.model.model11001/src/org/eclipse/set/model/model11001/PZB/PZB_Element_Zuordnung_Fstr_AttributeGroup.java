/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.PZB;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model11001.Verweise.ID_Fstr_Zug_Rangier_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PZB Element Zuordnung Fstr Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.PZB.PZB_Element_Zuordnung_Fstr_AttributeGroup#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.PZB.PZB_Element_Zuordnung_Fstr_AttributeGroup#getWirksamkeitFstr <em>Wirksamkeit Fstr</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.PZB.PZBPackage#getPZB_Element_Zuordnung_Fstr_AttributeGroup()
 * @model extendedMetaData="name='CPZB_Element_Zuordnung_Fstr' kind='elementOnly'"
 * @generated
 */
public interface PZB_Element_Zuordnung_Fstr_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Fstr Zug Rangier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verlinkung, zu welcher Fahrstraße der PZB-Gleismagnet gehört (wird nur angegeben, wenn Ziel der Fahrstraße nicht identisch mit zugeordneten Signal ist oder Umfahrwege existieren). Dabei ist festgelegt, dass der Fahrweg der Fahrstraße über den PZB-Gleismagneten führt. Gleismagnete ohne Zuordnung zu einem Signal oder einer Fahrstraße sind ständig wirksam. Zur Verdeutlichung dienen die folgenden Beispiele: Media:Skizze PZB.pdf, Media:Tabellen PZB.pdf. In den Beipielen ist das PZB Element ein Gleismagnet 500 Hz; diese Verfahrensweise kann analog auch für alle anderen PZB_Elemente, z.B. GÜ, angewandt werden. DB-Regelwerk Gleismagnettabelle 1 mittels Fußnote 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr Zug Rangier</em>' containment reference.
	 * @see #setIDFstrZugRangier(ID_Fstr_Zug_Rangier_TypeClass)
	 * @see org.eclipse.set.model.model11001.PZB.PZBPackage#getPZB_Element_Zuordnung_Fstr_AttributeGroup_IDFstrZugRangier()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fstr_Zug_Rangier'"
	 * @generated
	 */
	ID_Fstr_Zug_Rangier_TypeClass getIDFstrZugRangier();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.PZB.PZB_Element_Zuordnung_Fstr_AttributeGroup#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fstr Zug Rangier</em>' containment reference.
	 * @see #getIDFstrZugRangier()
	 * @generated
	 */
	void setIDFstrZugRangier(ID_Fstr_Zug_Rangier_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Wirksamkeit Fstr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob der Gleismagnet/ die GÜ bei Einstellung der referenzierten Fahrstraße wirksam ist oder nicht. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen. DB-Regelwerk Gleismagnettabelle
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wirksamkeit Fstr</em>' containment reference.
	 * @see #setWirksamkeitFstr(Wirksamkeit_Fstr_TypeClass)
	 * @see org.eclipse.set.model.model11001.PZB.PZBPackage#getPZB_Element_Zuordnung_Fstr_AttributeGroup_WirksamkeitFstr()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Wirksamkeit_Fstr'"
	 * @generated
	 */
	Wirksamkeit_Fstr_TypeClass getWirksamkeitFstr();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.PZB.PZB_Element_Zuordnung_Fstr_AttributeGroup#getWirksamkeitFstr <em>Wirksamkeit Fstr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wirksamkeit Fstr</em>' containment reference.
	 * @see #getWirksamkeitFstr()
	 * @generated
	 */
	void setWirksamkeitFstr(Wirksamkeit_Fstr_TypeClass value);

} // PZB_Element_Zuordnung_Fstr_AttributeGroup
