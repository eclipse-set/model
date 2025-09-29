/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Geodaten;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_GEO_Kante_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_GEO_Knoten_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GEO Punkt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Topographischer Punkt im Koordinatensystem zur eindeutige Zuordnung im realen Gelände. Alle Objekte, die einen entsprechenden Bezug erfordern, werden über andere Objekte (z.B Verortung an der Topologie) oder auch direkt auf dieses Objekt abgebildet.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.GEO_Punkt#getGEOPunktAllg <em>GEO Punkt Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.GEO_Punkt#getIDGEOKante <em>IDGEO Kante</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.GEO_Punkt#getIDGEOKnoten <em>IDGEO Knoten</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getGEO_Punkt()
 * @model extendedMetaData="name='CGEO_Punkt' kind='elementOnly'"
 * @generated
 */
public interface GEO_Punkt extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>GEO Punkt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>GEO Punkt Allg</em>' containment reference.
	 * @see #setGEOPunktAllg(GEO_Punkt_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getGEO_Punkt_GEOPunktAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GEO_Punkt_Allg'"
	 * @generated
	 */
	GEO_Punkt_Allg_AttributeGroup getGEOPunktAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.GEO_Punkt#getGEOPunktAllg <em>GEO Punkt Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GEO Punkt Allg</em>' containment reference.
	 * @see #getGEOPunktAllg()
	 * @generated
	 */
	void setGEOPunktAllg(GEO_Punkt_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDGEO Kante</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf eine GEO_Kante, wenn der GEO_Punkt als Stützpunkt einer Polylinie fungiert. GEO_Punkte der begrenzenden GEO_Knoten erhaten keinen Verweis auf die GEO_Kante. Eine Polylinie kann durch bis zu 999 GEO_Punkte beschrieben werden. Es ist jedoch auch zulässig, eine virtuelle Polylinie ohne GEO_Punkte darzustellen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDGEO Kante</em>' containment reference.
	 * @see #setIDGEOKante(ID_GEO_Kante_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getGEO_Punkt_IDGEOKante()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_GEO_Kante'"
	 * @generated
	 */
	ID_GEO_Kante_TypeClass getIDGEOKante();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.GEO_Punkt#getIDGEOKante <em>IDGEO Kante</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDGEO Kante</em>' containment reference.
	 * @see #getIDGEOKante()
	 * @generated
	 */
	void setIDGEOKante(ID_GEO_Kante_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDGEO Knoten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ID des GEO_Knoten, auf den dieser GEO Punkt verweist. Einem GEO Knoten können über diesen Verweis mehrere GEO_Punkte zugewiesen werden. Das ist erforderlich, wenn ein GEO_Knoten in unterschiedlichen Koordinatensystemen zugeordnet ist. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDGEO Knoten</em>' containment reference.
	 * @see #setIDGEOKnoten(ID_GEO_Knoten_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getGEO_Punkt_IDGEOKnoten()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_GEO_Knoten'"
	 * @generated
	 */
	ID_GEO_Knoten_TypeClass getIDGEOKnoten();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.GEO_Punkt#getIDGEOKnoten <em>IDGEO Knoten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDGEO Knoten</em>' containment reference.
	 * @see #getIDGEOKnoten()
	 * @generated
	 */
	void setIDGEOKnoten(ID_GEO_Knoten_TypeClass value);

} // GEO_Punkt
