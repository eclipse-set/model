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

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;

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
 *   <li>{@link org.eclipse.set.model.model11001.PZB.PZB_Element_Zuordnung#getPZBElementZuordnungBP <em>PZB Element Zuordnung BP</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.PZB.PZB_Element_Zuordnung#getPZBElementZuordnungFstr <em>PZB Element Zuordnung Fstr</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.PZB.PZBPackage#getPZB_Element_Zuordnung()
 * @model extendedMetaData="name='CPZB_Element_Zuordnung' kind='elementOnly'"
 * @generated
 */
public interface PZB_Element_Zuordnung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>PZB Element Zuordnung BP</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.PZB.PZB_Element_Zuordnung_BP_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PZB Element Zuordnung BP</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.PZB.PZBPackage#getPZB_Element_Zuordnung_PZBElementZuordnungBP()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PZB_Element_Zuordnung_BP'"
	 * @generated
	 */
	EList<PZB_Element_Zuordnung_BP_AttributeGroup> getPZBElementZuordnungBP();

	/**
	 * Returns the value of the '<em><b>PZB Element Zuordnung Fstr</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.PZB.PZB_Element_Zuordnung_Fstr_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>PZB Element Zuordnung Fstr</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.PZB.PZBPackage#getPZB_Element_Zuordnung_PZBElementZuordnungFstr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PZB_Element_Zuordnung_Fstr'"
	 * @generated
	 */
	EList<PZB_Element_Zuordnung_Fstr_AttributeGroup> getPZBElementZuordnungFstr();

} // PZB_Element_Zuordnung
