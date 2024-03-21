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
 * A representation of the model object '<em><b>Bereich Objekt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Objekt, das einen Bereich über eine oder mehrere Gleiskanten ganz oder teilweise umfasst. Ein Bereich Objekt repräsentiert einen Bereich der Topologie, der sowohl zusammenhängend als auch nicht zusammenhängend sein kann. Ein Bereich Objekt wird über ein oder mehrere Teilbereiche (Bereich_Objekt_Teilbereich) beschrieben, die jeweils einen Abschnitt auf einer topologischen Kante darstellen. Ein Teilbereich definiert sich über die Referenz auf eine TOP Kante sowie den Abstand der beiden Teilbereichsgrenzen A und B zum Anfang der TOP Kante. Das Bereich Objekt kann in drei Arten eingeteilt werden: unverzweigt (z. B. Bahnsteig Kante, Fstr Fahrweg, BUE Gleisbezogener Gefahrraum) verzweigt (z. B. Gleis Schaltgruppe) verteilt (z. B. Gleis Baubereich) Unverzweigte und verzweigte Bereichsobjekte sind immer zusammenhängend. Verteilte Bereichsobjekte können in ihren Teilen verzweigt oder unverzweigt sein; hier gibt es keine Notwendigkeit der Unterscheidung. Zusätzlich kann ein Bereich Objekt gerichtet sein. Dies wird durch die Ausrichtung der Teilbereiche in Bezug auf die jeweilige TOP Kante erreicht. Die Konsistenz der Richtung des Bereich Objekt wird nicht durch das Modell sichergestellt. Die Teilbereiche müssen überschneidungsfrei definiert sein. Es ist möglich Teilbereiche der Länge 0 anzugeben. Ist es für ein Objekt notwendig, direkt auf eine Bereichsgrenze zu verweisen, dann muss dieses Problem im jeweiligen Arbeitspaket gelöst werden, in dem in diesem Arbeitspaket ein eigenes Punktobjekt erzeugt wird. Der Teilbereich endet dann unmittelbar vor dem TOP_Knoten. Speziell bei Weichenanfängen auf die Weichenspitze gesehen endet der Teilbereich am TOP Anschluss A = Spitze oder TOP Anschluss B = Spitze. Die Weiche selbst ist nicht Bestandteil des Bereichsobjektes. In den Bereichsobjekten sind Objekte zusammengefasst, die eine Quer- und/oder Längsausdehnung haben können.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt#getBereichObjektTeilbereich <em>Bereich Objekt Teilbereich</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage#getBereich_Objekt()
 * @model abstract="true"
 *        extendedMetaData="name='CBereich_Objekt' kind='elementOnly'"
 * @generated
 */
public interface Bereich_Objekt extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bereich Objekt Teilbereich</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt_Teilbereich_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bereich Objekt Teilbereich</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage#getBereich_Objekt_BereichObjektTeilbereich()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bereich_Objekt_Teilbereich'"
	 * @generated
	 */
	EList<Bereich_Objekt_Teilbereich_AttributeGroup> getBereichObjektTeilbereich();

} // Bereich_Objekt
