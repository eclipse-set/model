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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PZB Element GM Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.PZB.PZB_Element_GM_AttributeGroup#getPZBAbstandGM <em>PZB Abstand GM</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.PZB.PZB_Element_GM_AttributeGroup#getPZBINA <em>PZBINA</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.PZB.PZBPackage#getPZB_Element_GM_AttributeGroup()
 * @model extendedMetaData="name='CPZB_Element_GM' kind='elementOnly'"
 * @generated
 */
public interface PZB_Element_GM_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>PZB Abstand GM</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abstand des PZB-Magneten zum Signal, für den eine INA-Berechnung durchgeführt wurde. Der aktuelle Abstand wird über die Verortung der beiden Punktobjekte ermittelt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PZB Abstand GM</em>' containment reference.
	 * @see #setPZBAbstandGM(PZB_Abstand_GM_TypeClass)
	 * @see org.eclipse.set.model.model11001.PZB.PZBPackage#getPZB_Element_GM_AttributeGroup_PZBAbstandGM()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PZB_Abstand_GM'"
	 * @generated
	 */
	PZB_Abstand_GM_TypeClass getPZBAbstandGM();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.PZB.PZB_Element_GM_AttributeGroup#getPZBAbstandGM <em>PZB Abstand GM</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PZB Abstand GM</em>' containment reference.
	 * @see #getPZBAbstandGM()
	 * @generated
	 */
	void setPZBAbstandGM(PZB_Abstand_GM_TypeClass value);

	/**
	 * Returns the value of the '<em><b>PZBINA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der PZB-Magnet deckt gemäß Wirkbereichsbogen Bereiche ab (\"true\"). Liegt ein Bahnsteig zwischen den PZB-Magneten von Vor- und nachfolgendem Hauptsignal, wird eine INA-Berechnung durchgeführt. Das Ergebnis wird in einem Wirkbereichsbogen dokumentiert. Daraus geht die Relevanz des PZB-Magneten für die Überwachung gegen Halt anfahrender Züge hervor: Z. B. \"Der GM 1000 Hz deckt bei bei einer Beschleunigung von 0,3 m/s² die Bereiche von ... bis ... m ab.\" oder \"Der GM 2000 Hz deckt keine Bereiche ab\". 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PZBINA</em>' containment reference.
	 * @see #setPZBINA(PZB_INA_TypeClass)
	 * @see org.eclipse.set.model.model11001.PZB.PZBPackage#getPZB_Element_GM_AttributeGroup_PZBINA()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PZB_INA'"
	 * @generated
	 */
	PZB_INA_TypeClass getPZBINA();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.PZB.PZB_Element_GM_AttributeGroup#getPZBINA <em>PZBINA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PZBINA</em>' containment reference.
	 * @see #getPZBINA()
	 * @generated
	 */
	void setPZBINA(PZB_INA_TypeClass value);

} // PZB_Element_GM_AttributeGroup
