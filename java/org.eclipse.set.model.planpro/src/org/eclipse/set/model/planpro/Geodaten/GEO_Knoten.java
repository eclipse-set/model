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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GEO Knoten</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Knoten des topografischen Knoten-Kanten-Modells. Die Anzahl der anschließenden topografischen Kanten (Gleislinie oder Kilometrierungslinie) ist je nach Art des GEO Knoten bzw. Art des zugehörigen TOP Knoten unterschiedlich: Für die Gleislinie gilt: Eine GEO-Kante: Der GEO_Knoten ist gleichzeitig auch ein TOP Knoten, an dem die Topografie und Topologie endet (z. B. Gleisende, Betrachtungsende oder Digitalisierungsende). Zwei GEO-Kanten: Der GEO_Knoten verweist nicht auf einen TOP Knoten: Änderung der Geometrie des Gleises oder Vermessungspunkt. Drei GEO-Kanten: Der GEO_Knoten ist gleichzeitig auch ein Knoten, an dem eine Verzweigung der Gleis- oder Kilometrierungslinie vorhanden ist. Über einen Verweis von GEO Punkt zu GEO_Knoten werden die realen Koordinaten (ggf. auch von mehreren Koordinatensystemen) dieses Knotens zugeordnet. Weitere Fälle mit 0..1 anschließenden GEO-Kanten treten an GEO_Knoten auf, an deren Stelle sich auch ein TOP Knoten der Art Verbindungsknoten befindet (siehe Beschreibung Verbindungsknoten). 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.GEO_Knoten#getGEOPAD <em>GEOPAD</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getGEO_Knoten()
 * @model extendedMetaData="name='CGEO_Knoten' kind='elementOnly'"
 * @generated
 */
public interface GEO_Knoten extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>GEOPAD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung der topografischen Punktadresse. Die Punktadresse wird aus AVANI für jeden Vermessungspunkt bereitgestellt. Führende Leerzeichen sind bei der Datenübernahme zu erhalten. Eine PAD kann in verschiedenen Koordinatensystemen liegen (GEO_Punkt). Die Verwendung ist zum Abgleich mit dem GIS-System der DB InfraGO AG erforderlich. Bei Neutrassierungen existiert noch keine PAD-Angabe. Dann wird hier die Bezeichnung des Knotens aus dieser Neutrassierung eingetragen. Wenn Daten händisch (z.B. von Ivl-Plänen nachgezeichnet) erstellt wurden, wird das Attribut nicht befüllt. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GEOPAD</em>' containment reference.
	 * @see #setGEOPAD(GEO_PAD_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getGEO_Knoten_GEOPAD()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GEO_PAD'"
	 * @generated
	 */
	GEO_PAD_TypeClass getGEOPAD();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.GEO_Knoten#getGEOPAD <em>GEOPAD</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GEOPAD</em>' containment reference.
	 * @see #getGEOPAD()
	 * @generated
	 */
	void setGEOPAD(GEO_PAD_TypeClass value);

} // GEO_Knoten
