/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Basisobjekte;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Punkt Objekt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Objekt der Außenanlage, das bezogen auf seine Funktion keine Ausdehnung entlang der Gleise aufweist. Punktförmige Objekte sind diejenigen real vorhandenen Objekte, die mindestens einer TOP Kante mit je genau einem Punkt zugeordnet werden können. Durch die Verwendung der TOP Kante und des Abstands zum Knoten A der TOP Kante kann die physische Lage eines punktförmigen Objektes eindeutig beschrieben werden. Beispiele für punktförmige Objekte sind Signal, Signal Befestigung und W Kr Gsp Komponente. Durch die mögliche Mehrfacheinbindung der Attributgruppe Punkt Objekt TOP Kante ist es möglich, Punktobjekte mehreren TOP-Kanten zuzuordnen, z.B: Grenzzeichen (Zuordnung zu zwei TOP_Kanten), Signal zwischen Weichenanfang und Herzstückspitze (Zuordnung zu zwei TOP_Kanten), Kreuzung als Kreuzungseite - Weichenkomponente (Zuordnung zu zwei sich schneidende oder am gleichen TOP-Knoten endende TOP-Kanten), Weichensignal (Zuordnung zu zwei (W), drei (EKW) oder vier (DKW) TOP_Kanten). Die Verortung des Punktobjekts erfolgt über die Angabe einer TOP Kante und des Abstands zum Knoten A der Kante. Zusätzlich kann für ein Punkt_Objekt eine Strecke und ein Streckenkilometer angegeben werden. Diese km-Angabe ist dabei nur nachrichtlich zu verstehen. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt#getPunktObjektStrecke <em>Punkt Objekt Strecke</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt#getPunktObjektTOPKante <em>Punkt Objekt TOP Kante</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage#getPunkt_Objekt()
 * @model abstract="true"
 *        extendedMetaData="name='CPunkt_Objekt' kind='elementOnly'"
 * @generated
 */
public interface Punkt_Objekt extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Punkt Objekt Strecke</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Zuordnung eines Objektes zu einer Strecke. Zur vererbungsspezifischen Befüllung der Attributgruppe siehe Modellierung Basisobjekte.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Punkt Objekt Strecke</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage#getPunkt_Objekt_PunktObjektStrecke()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Punkt_Objekt_Strecke'"
	 * @generated
	 */
	EList<Punkt_Objekt_Strecke_AttributeGroup> getPunktObjektStrecke();

	/**
	 * Returns the value of the '<em><b>Punkt Objekt TOP Kante</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Verortung eines Objektes an der Topologie. Die vererbungsspezifische Befüllung der zugehörigen Attribute wird auf der Seite Modellierung Basisobjekte beschrieben. Durch die mögliche Mehrfacheinbindung der Attributgruppe ist es möglich, ein Objekt (z. B. Grenzzeichen) mehreren topologischen Kanten zuzuordnen. DB-Regelwerk Darstellung im sicherungstechnischen Lageplan
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Punkt Objekt TOP Kante</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage#getPunkt_Objekt_PunktObjektTOPKante()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Punkt_Objekt_TOP_Kante'"
	 * @generated
	 */
	EList<Punkt_Objekt_TOP_Kante_AttributeGroup> getPunktObjektTOPKante();

} // Punkt_Objekt
