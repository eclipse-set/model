/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.PZB;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_Fstr_Zug_Rangier_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_PZB_Element_Bezugspunkt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PZB Element Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zuordnung von PZB Element zu einem Signal, einer Fahrstraße oder auch anderen Objekten, die im Bezug zum PZB_Element stehen. Der Verweis von einem PZB Element über das Zuordnungsobjekt auf ein Signal ist dabei immer gefüllt. Die Verknüpfung mit einer Fahrstraße (nur Zugstraßen sind relevant) oder weiteren Objekten (INA-Berechnungsrelevante Objekte) ist fallbezogen notwendig. Beispiele für die Zuordnung sind unter ID Fstr Zug Rangier zu finden. DB-Regelwerk Eintrag in der Gleismagnettabelle; die Zuordnung zu einzelnen Fahrstraßen wird heute über Fußnoten gelöst. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.PZB.PZB_Element_Zuordnung#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PZB.PZB_Element_Zuordnung#getIDPZBElementBezugspunkt <em>IDPZB Element Bezugspunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PZB.PZB_Element_Zuordnung#getPZBElementZuordnungINA <em>PZB Element Zuordnung INA</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PZB.PZB_Element_Zuordnung#getWirksamkeit <em>Wirksamkeit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.PZB.PZBPackage#getPZB_Element_Zuordnung()
 * @model extendedMetaData="name='CPZB_Element_Zuordnung' kind='elementOnly'"
 * @generated
 */
public interface PZB_Element_Zuordnung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Fstr Zug Rangier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verlinkung, zu welcher Fahrstraße der PZB-Gleismagnet gehört (wird nur angegeben, wenn Ziel der Fahrstraße nicht identisch mit zugeordneten Signal ist oder Umfahrwege existieren). Dabei ist festgelegt, dass der Fahrweg der Fahrstraße über den PZB-Gleismagneten führt. Gleismagnete ohne Zuordnung zu einem Signal oder einer Fahrstraße sind ständig wirksam. Zur Verdeutlichung dienen die folgenden Beispiele: Media:Skizze PZB.pdf, Media:Tabellen PZB.pdf. In den Beipielen ist das PZB Element ein Gleismagnet 500 Hz; diese Verfahrensweise kann analog auch für alle anderen PZB_Elemente, z.B. GÜ, angewandt werden. DB-Regelwerk Gleismagnettabelle 1 mittels Fußnote 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr Zug Rangier</em>' containment reference.
	 * @see #setIDFstrZugRangier(ID_Fstr_Zug_Rangier_TypeClass)
	 * @see org.eclipse.set.model.model1902.PZB.PZBPackage#getPZB_Element_Zuordnung_IDFstrZugRangier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Fstr_Zug_Rangier'"
	 * @generated
	 */
	ID_Fstr_Zug_Rangier_TypeClass getIDFstrZugRangier();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PZB.PZB_Element_Zuordnung#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fstr Zug Rangier</em>' containment reference.
	 * @see #getIDFstrZugRangier()
	 * @generated
	 */
	void setIDFstrZugRangier(ID_Fstr_Zug_Rangier_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDPZB Element Bezugspunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Signal bzw. die Weiche, in dessen Abhängigkeit das PZB Element angeordnet werden muss. Während bei PZB-Element-GM im Regelfall das Signal anzugeben ist, können PZB-Element-GUE auch in Abhängigkeit einer Weiche angeordnet werden (z.B. Spätablenkung). DB-Regelwerk Gleismagnettabelle 1 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDPZB Element Bezugspunkt</em>' containment reference.
	 * @see #setIDPZBElementBezugspunkt(ID_PZB_Element_Bezugspunkt_TypeClass)
	 * @see org.eclipse.set.model.model1902.PZB.PZBPackage#getPZB_Element_Zuordnung_IDPZBElementBezugspunkt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_PZB_Element_Bezugspunkt'"
	 * @generated
	 */
	ID_PZB_Element_Bezugspunkt_TypeClass getIDPZBElementBezugspunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PZB.PZB_Element_Zuordnung#getIDPZBElementBezugspunkt <em>IDPZB Element Bezugspunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDPZB Element Bezugspunkt</em>' containment reference.
	 * @see #getIDPZBElementBezugspunkt()
	 * @generated
	 */
	void setIDPZBElementBezugspunkt(ID_PZB_Element_Bezugspunkt_TypeClass value);

	/**
	 * Returns the value of the '<em><b>PZB Element Zuordnung INA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PZB Element Zuordnung INA</em>' containment reference.
	 * @see #setPZBElementZuordnungINA(PZB_Element_Zuordnung_INA_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.PZB.PZBPackage#getPZB_Element_Zuordnung_PZBElementZuordnungINA()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PZB_Element_Zuordnung_INA'"
	 * @generated
	 */
	PZB_Element_Zuordnung_INA_AttributeGroup getPZBElementZuordnungINA();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PZB.PZB_Element_Zuordnung#getPZBElementZuordnungINA <em>PZB Element Zuordnung INA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PZB Element Zuordnung INA</em>' containment reference.
	 * @see #getPZBElementZuordnungINA()
	 * @generated
	 */
	void setPZBElementZuordnungINA(PZB_Element_Zuordnung_INA_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Wirksamkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob der Gleismagnet/ die GÜ schaltbar ist oder nicht bzw. wie die Anschaltung erfolgt. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen. DB-Regelwerk Gleismagnettabelle 1 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wirksamkeit</em>' containment reference.
	 * @see #setWirksamkeit(Wirksamkeit_TypeClass)
	 * @see org.eclipse.set.model.model1902.PZB.PZBPackage#getPZB_Element_Zuordnung_Wirksamkeit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Wirksamkeit'"
	 * @generated
	 */
	Wirksamkeit_TypeClass getWirksamkeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PZB.PZB_Element_Zuordnung#getWirksamkeit <em>Wirksamkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wirksamkeit</em>' containment reference.
	 * @see #getWirksamkeit()
	 * @generated
	 */
	void setWirksamkeit(Wirksamkeit_TypeClass value);

} // PZB_Element_Zuordnung
