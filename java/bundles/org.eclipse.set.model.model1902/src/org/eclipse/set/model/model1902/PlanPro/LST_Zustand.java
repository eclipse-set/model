/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.PlanPro;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.model1902.Basisobjekte.Anhang;
import org.eclipse.set.model.model1902.Basisobjekte.Ur_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LST Zustand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Konkreter Zustand der LST-Anlage.\nBei der Verwendung des LST-Zustands wird unterschieden in:\n* Einzelner LST_Zustand: für Bestandsdaten oder einzelne Zustände der Gleislage (Geodaten);\n* Kombination von LST_Zustand_Start und LST_Zustand_Ziel innerhalb einer Planung_Einzel zur Abbildung der durch eine Planung verursachten Änderung des Zustands der Gleislage bzw. LST-Anlage.\nEs erfolgt eine alphabetische Auflistung der Objektinstanzen in der Attributgruppe „Container“.\n\nDB Regelwerk\nBisher keine Abbildung, da Neuerung mit PlanPro.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.LST_Zustand#getAnhangLSTZustand <em>Anhang LST Zustand</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.LST_Zustand#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getLST_Zustand()
 * @model extendedMetaData="name='CLST_Zustand' kind='elementOnly'"
 * @generated
 */
public interface LST_Zustand extends Ur_Objekt {
	/**
	 * Returns the value of the '<em><b>Anhang LST Zustand</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Basisobjekte.Anhang}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ergänzender pdf-Anhang zu einem LST_Zustand. \r\nDB-Regelwerk\r\nBisher ohne eindeutige Darstellung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anhang LST Zustand</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getLST_Zustand_AnhangLSTZustand()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Anhang_LST_Zustand'"
	 * @generated
	 */
	EList<Anhang> getAnhangLSTZustand();

	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur alphabetischen Auflistung aller Objektinstanzen eines LST-Zustands.\r\nAlle Objekte des LST-Datenmodells werden in die Attributgruppe eingebunden.\r\nDB Regelwerk\r\nBisher keine Abbildung, da Neuerung mit PlanPro.\r\n
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Container</em>' containment reference.
	 * @see #setContainer(Container_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getLST_Zustand_Container()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Container'"
	 * @generated
	 */
	Container_AttributeGroup getContainer();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PlanPro.LST_Zustand#getContainer <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' containment reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(Container_AttributeGroup value);

} // LST_Zustand
