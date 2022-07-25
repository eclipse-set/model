/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_TOP_Knoten_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETCS Knoten</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abbildung des Knotens des ETCS-spezifischen Knoten-Kanten-Modells auf das topologische PlanPro-Knoten-Kanten-Modell. Bei Kreuzungsweichen erfolgt die Verortung zweifach, sonst einfach.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Knoten#getIDTOPKnoten <em>IDTOP Knoten</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Knoten#getKnotenAufTOPKante <em>Knoten Auf TOP Kante</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Knoten()
 * @model extendedMetaData="name='CETCS_Knoten' kind='elementOnly'"
 * @generated
 */
public interface ETCS_Knoten extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDTOP Knoten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den TOP-Knoten, mit dem der ETCS-Knoten identisch ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDTOP Knoten</em>' containment reference.
	 * @see #setIDTOPKnoten(ID_TOP_Knoten_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Knoten_IDTOPKnoten()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_TOP_Knoten'"
	 * @generated
	 */
	ID_TOP_Knoten_TypeClass getIDTOPKnoten();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Knoten#getIDTOPKnoten <em>IDTOP Knoten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDTOP Knoten</em>' containment reference.
	 * @see #getIDTOPKnoten()
	 * @generated
	 */
	void setIDTOPKnoten(ID_TOP_Knoten_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Knoten Auf TOP Kante</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Knoten Auf TOP Kante</em>' containment reference.
	 * @see #setKnotenAufTOPKante(Knoten_Auf_TOP_Kante_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Knoten_KnotenAufTOPKante()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Knoten_Auf_TOP_Kante'"
	 * @generated
	 */
	Knoten_Auf_TOP_Kante_AttributeGroup getKnotenAufTOPKante();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Knoten#getKnotenAufTOPKante <em>Knoten Auf TOP Kante</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Knoten Auf TOP Kante</em>' containment reference.
	 * @see #getKnotenAufTOPKante()
	 * @generated
	 */
	void setKnotenAufTOPKante(Knoten_Auf_TOP_Kante_AttributeGroup value);

} // ETCS_Knoten
