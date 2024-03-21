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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Knoten Auf TOP Kante Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Knoten_Auf_TOP_Kante_AttributeGroup#getETCSKnotenArtSonstige <em>ETCS Knoten Art Sonstige</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Knoten_Auf_TOP_Kante_AttributeGroup#getPunktObjektTOPKante <em>Punkt Objekt TOP Kante</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getKnoten_Auf_TOP_Kante_AttributeGroup()
 * @model extendedMetaData="name='CKnoten_Auf_TOP_Kante' kind='elementOnly'"
 * @generated
 */
public interface Knoten_Auf_TOP_Kante_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ETCS Knoten Art Sonstige</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Besondere Art des ETCS-Knotens bei Verortung auf einer TOP-Kante. Für die Knotenart \"Streckenende\" ist derzeit kein konkreter Anwendungsfall bekannt. Der Wert wird aber zur Erhaltung der Modellflexibilität vorerst beibehalten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ETCS Knoten Art Sonstige</em>' containment reference.
	 * @see #setETCSKnotenArtSonstige(ETCS_Knoten_Art_Sonstige_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getKnoten_Auf_TOP_Kante_AttributeGroup_ETCSKnotenArtSonstige()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ETCS_Knoten_Art_Sonstige'"
	 * @generated
	 */
	ETCS_Knoten_Art_Sonstige_TypeClass getETCSKnotenArtSonstige();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Knoten_Auf_TOP_Kante_AttributeGroup#getETCSKnotenArtSonstige <em>ETCS Knoten Art Sonstige</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ETCS Knoten Art Sonstige</em>' containment reference.
	 * @see #getETCSKnotenArtSonstige()
	 * @generated
	 */
	void setETCSKnotenArtSonstige(ETCS_Knoten_Art_Sonstige_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Punkt Objekt TOP Kante</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Punkt Objekt TOP Kante</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getKnoten_Auf_TOP_Kante_AttributeGroup_PunktObjektTOPKante()
	 * @model containment="true" required="true" upper="2"
	 *        extendedMetaData="kind='element' name='Punkt_Objekt_TOP_Kante'"
	 * @generated
	 */
	EList<Punkt_Objekt_TOP_Kante_AttributeGroup> getPunktObjektTOPKante();

} // Knoten_Auf_TOP_Kante_AttributeGroup
