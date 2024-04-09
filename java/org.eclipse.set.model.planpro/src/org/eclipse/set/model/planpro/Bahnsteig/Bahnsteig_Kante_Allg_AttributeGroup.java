/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnsteig;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bahnsteig Kante Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnsteig.Bahnsteig_Kante_Allg_AttributeGroup#getLageZumGleis <em>Lage Zum Gleis</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnsteig.Bahnsteig_Kante_Allg_AttributeGroup#getSystemhoehe <em>Systemhoehe</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Bahnsteig.BahnsteigPackage#getBahnsteig_Kante_Allg_AttributeGroup()
 * @model extendedMetaData="name='CBahnsteig_Kante_Allg' kind='elementOnly'"
 * @generated
 */
public interface Bahnsteig_Kante_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Lage Zum Gleis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lage der Bahnsteig Kante zur Gleisachse bezogen auf die Richtung des Bereich Objekt. Siehe auch Modellierung Richtung. DB-Regelwerk Darstellung im sicherungstechnischen Lageplan
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lage Zum Gleis</em>' containment reference.
	 * @see #setLageZumGleis(Lage_Zum_Gleis_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnsteig.BahnsteigPackage#getBahnsteig_Kante_Allg_AttributeGroup_LageZumGleis()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Lage_Zum_Gleis'"
	 * @generated
	 */
	Lage_Zum_Gleis_TypeClass getLageZumGleis();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnsteig.Bahnsteig_Kante_Allg_AttributeGroup#getLageZumGleis <em>Lage Zum Gleis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lage Zum Gleis</em>' containment reference.
	 * @see #getLageZumGleis()
	 * @generated
	 */
	void setLageZumGleis(Lage_Zum_Gleis_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Systemhoehe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Höhe der Bahnsteigoberkante am Gleis, gemessen ab Schienenoberkante. Bahnsteige werden in folgenden Systemhöhen (in cm) errichtet: 38 cm: niedrigste zulässige Höhe; 55 cm: Zwischenhöhe; 76 cm: Regelhöhe; 96 cm: größte zulässige Höhe (nur für ausschließlich dafür vorgesehene S-Bahnfahrzeuge); Sonderhoehe: Abweichende Höhen sind möglich, vor allem ältere Bahnsteigkanten können auch andere Höhen aufweisen. Bei Bahnsteigkanten mit mehreren Höhen wird die Höhe angegeben, an der der Schwerpunkt des Reisendenzustiegs liegt. DB-Regelwerk Bestandteil der betrieblichen Aufgabenstellung, ggf. Erwähnung im Erläuterungsbericht
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Systemhoehe</em>' containment reference.
	 * @see #setSystemhoehe(Systemhoehe_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnsteig.BahnsteigPackage#getBahnsteig_Kante_Allg_AttributeGroup_Systemhoehe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Systemhoehe'"
	 * @generated
	 */
	Systemhoehe_TypeClass getSystemhoehe();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnsteig.Bahnsteig_Kante_Allg_AttributeGroup#getSystemhoehe <em>Systemhoehe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Systemhoehe</em>' containment reference.
	 * @see #getSystemhoehe()
	 * @generated
	 */
	void setSystemhoehe(Systemhoehe_TypeClass value);

} // Bahnsteig_Kante_Allg_AttributeGroup
