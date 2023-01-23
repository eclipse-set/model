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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model11001.Verweise.ID_PZB_Element_Bezugspunkt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PZB Element Zuordnung BP Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.PZB.PZB_Element_Zuordnung_BP_AttributeGroup#getIDPZBElementBezugspunkt <em>IDPZB Element Bezugspunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.PZB.PZB_Element_Zuordnung_BP_AttributeGroup#getINAGefahrstelle <em>INA Gefahrstelle</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.PZB.PZB_Element_Zuordnung_BP_AttributeGroup#getPZBElementZuordnungINA <em>PZB Element Zuordnung INA</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.PZB.PZB_Element_Zuordnung_BP_AttributeGroup#getWirksamkeit <em>Wirksamkeit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.PZB.PZBPackage#getPZB_Element_Zuordnung_BP_AttributeGroup()
 * @model extendedMetaData="name='CPZB_Element_Zuordnung_BP' kind='elementOnly'"
 * @generated
 */
public interface PZB_Element_Zuordnung_BP_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>IDPZB Element Bezugspunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Signal bzw. die Weiche, in dessen Abhängigkeit das PZB Element angeordnet werden muss. Während bei PZB-Element-GM im Regelfall das Signal anzugeben ist, können PZB-Element-GUE auch in Abhängigkeit einer Weiche angeordnet werden (z.B. Spätablenkung). DB-Regelwerk Gleismagnettabelle 1 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDPZB Element Bezugspunkt</em>' containment reference.
	 * @see #setIDPZBElementBezugspunkt(ID_PZB_Element_Bezugspunkt_TypeClass)
	 * @see org.eclipse.set.model.model11001.PZB.PZBPackage#getPZB_Element_Zuordnung_BP_AttributeGroup_IDPZBElementBezugspunkt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_PZB_Element_Bezugspunkt'"
	 * @generated
	 */
	ID_PZB_Element_Bezugspunkt_TypeClass getIDPZBElementBezugspunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.PZB.PZB_Element_Zuordnung_BP_AttributeGroup#getIDPZBElementBezugspunkt <em>IDPZB Element Bezugspunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDPZB Element Bezugspunkt</em>' containment reference.
	 * @see #getIDPZBElementBezugspunkt()
	 * @generated
	 */
	void setIDPZBElementBezugspunkt(ID_PZB_Element_Bezugspunkt_TypeClass value);

	/**
	 * Returns the value of the '<em><b>INA Gefahrstelle</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.PZB.INA_Gefahrstelle_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>INA Gefahrstelle</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.PZB.PZBPackage#getPZB_Element_Zuordnung_BP_AttributeGroup_INAGefahrstelle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='INA_Gefahrstelle'"
	 * @generated
	 */
	EList<INA_Gefahrstelle_AttributeGroup> getINAGefahrstelle();

	/**
	 * Returns the value of the '<em><b>PZB Element Zuordnung INA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PZB Element Zuordnung INA</em>' containment reference.
	 * @see #setPZBElementZuordnungINA(PZB_Element_Zuordnung_INA_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.PZB.PZBPackage#getPZB_Element_Zuordnung_BP_AttributeGroup_PZBElementZuordnungINA()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PZB_Element_Zuordnung_INA'"
	 * @generated
	 */
	PZB_Element_Zuordnung_INA_AttributeGroup getPZBElementZuordnungINA();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.PZB.PZB_Element_Zuordnung_BP_AttributeGroup#getPZBElementZuordnungINA <em>PZB Element Zuordnung INA</em>}' containment reference.
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
	 * Angabe, ob der Gleismagnet/ die GÜ schaltbar ist oder nicht bzw. wie die Anschaltung erfolgt. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen. DB-Regelwerk Gleismagnettabelle
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wirksamkeit</em>' containment reference.
	 * @see #setWirksamkeit(Wirksamkeit_TypeClass)
	 * @see org.eclipse.set.model.model11001.PZB.PZBPackage#getPZB_Element_Zuordnung_BP_AttributeGroup_Wirksamkeit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Wirksamkeit'"
	 * @generated
	 */
	Wirksamkeit_TypeClass getWirksamkeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.PZB.PZB_Element_Zuordnung_BP_AttributeGroup#getWirksamkeit <em>Wirksamkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wirksamkeit</em>' containment reference.
	 * @see #getWirksamkeit()
	 * @generated
	 */
	void setWirksamkeit(Wirksamkeit_TypeClass value);

} // PZB_Element_Zuordnung_BP_AttributeGroup
