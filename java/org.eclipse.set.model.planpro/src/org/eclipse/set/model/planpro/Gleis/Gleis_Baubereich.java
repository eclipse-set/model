/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Gleis;

import org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gleis Baubereich</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Markierung eines Gleisbereiches als Baubereich. Mit diesem Objekt wird der Bereich markiert, der während einer Planung als Baubereich verwendet wird. Die Topologie des Baubereiches und die verorteten Objekte bleiben erhalten.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Gleis.Gleis_Baubereich#getBaubereichArt <em>Baubereich Art</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Gleis.GleisPackage#getGleis_Baubereich()
 * @model extendedMetaData="name='CGleis_Baubereich' kind='elementOnly'"
 * @generated
 */
public interface Gleis_Baubereich extends Bereich_Objekt {
	/**
	 * Returns the value of the '<em><b>Baubereich Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kennzeichnung der Art des Baubereichs zur Darstellung in der Planung. ausgebaut: Temporär ausgebautes Gleis, das aus Zweckmäßigkeitsgründen (z. B. für Verortung von Objekten) noch in den Planungs- bzw. Bestandsdaten mitgeführt werden muss. Baugleis: Umsetzung der durch die Baubetriebsplanung vorgegebene besondere Eigenschaft eines Gleises oder Teil eines Gleises als Baugleis im PT 1. Die Eigenschaft ~ ist genau und nur dann anzuwenden, wenn daraus folgend oder in Zusammenhang damit stehend Maßnahmen resultieren, die in sicherungstechnischen Planungen dargestellt werden müssen. Die Erklärung zum Baugleis kann in diesem Fall auch nicht ohne Änderung des sicherungstechnischen Zustands zurückgenommen werden. Erklärung und Rücknahme der Erklärung zum Baugleis mit rein betrieblichen Konsequenzen, insbesondere in Zeiträumen kleiner als die zugehörigen sicherungstechnischen Bauzustände, sind hingegen in PlanPro nicht abzubilden. [gemäß Ril 408.0471, Ril 408.1471, Ril 408.1488] gesperrt: Sicherungstechnisch gesperrtes Gleis mit definierter Begrenzung. Ergänzende Beschreibung für PlanPro: Die betreffenden Gleise müssen im Rahmen der AP PT 1 (oder Bestandsdigitalisierung) als gesperrt markiert werden. Eine Aufhebung der Sperrung des Gleises kann nur mit einer neuen Planung (AP PT 1) erfolgen. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Baubereich Art</em>' containment reference.
	 * @see #setBaubereichArt(Baubereich_Art_TypeClass)
	 * @see org.eclipse.set.model.planpro.Gleis.GleisPackage#getGleis_Baubereich_BaubereichArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Baubereich_Art'"
	 * @generated
	 */
	Baubereich_Art_TypeClass getBaubereichArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Gleis.Gleis_Baubereich#getBaubereichArt <em>Baubereich Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baubereich Art</em>' containment reference.
	 * @see #getBaubereichArt()
	 * @generated
	 */
	void setBaubereichArt(Baubereich_Art_TypeClass value);

} // Gleis_Baubereich
