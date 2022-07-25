/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Geodaten;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_GEO_Knoten_TypeClass;

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
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.GEO_Punkt#getGEOPunktAllg <em>GEO Punkt Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.GEO_Punkt#getIDGEOKnoten <em>IDGEO Knoten</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage#getGEO_Punkt()
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
	 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage#getGEO_Punkt_GEOPunktAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GEO_Punkt_Allg'"
	 * @generated
	 */
	GEO_Punkt_Allg_AttributeGroup getGEOPunktAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Punkt#getGEOPunktAllg <em>GEO Punkt Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GEO Punkt Allg</em>' containment reference.
	 * @see #getGEOPunktAllg()
	 * @generated
	 */
	void setGEOPunktAllg(GEO_Punkt_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDGEO Knoten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ID des GEO_Knoten, auf den dieser GEO Punkt verweist. Einem GEO Knoten können über diesen Verweis mehrere GEO_Punkte zugewiesen werden. Das ist erforderlich, wenn ein GEO_Knoten in unterschiedlichen Koordinatensystemen zugeordnet ist. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDGEO Knoten</em>' containment reference.
	 * @see #setIDGEOKnoten(ID_GEO_Knoten_TypeClass)
	 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage#getGEO_Punkt_IDGEOKnoten()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_GEO_Knoten'"
	 * @generated
	 */
	ID_GEO_Knoten_TypeClass getIDGEOKnoten();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Geodaten.GEO_Punkt#getIDGEOKnoten <em>IDGEO Knoten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDGEO Knoten</em>' containment reference.
	 * @see #getIDGEOKnoten()
	 * @generated
	 */
	void setIDGEOKnoten(ID_GEO_Knoten_TypeClass value);

} // GEO_Punkt
