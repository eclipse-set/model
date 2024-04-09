/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.PlanPro;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planung EAusgabe Besonders Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Ausgabe_Besonders_AttributeGroup#getReferenzVergleichBesonders <em>Referenz Vergleich Besonders</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Ausgabe_Besonders_AttributeGroup#getVergleichAusgabestandBasis <em>Vergleich Ausgabestand Basis</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Ausgabe_Besonders_AttributeGroup#getVergleichstypBesonders <em>Vergleichstyp Besonders</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_E_Ausgabe_Besonders_AttributeGroup()
 * @model extendedMetaData="name='CPlanung_E_Ausgabe_Besonders' kind='elementOnly'"
 * @generated
 */
public interface Planung_E_Ausgabe_Besonders_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Referenz Vergleich Besonders</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Technische Grundlage des Vergleichs zwischen 2 Ausgaben einer Einzelplanung.
	 * Die GUID von derjenigen Ausgabe, die der aktuell erstellten Ausgabe zugrunde liegt, ist manuell anzugeben. Das Attribut wird nur bei einer Änderungsplanung benötigt.
	 * DB-Regelwerk
	 * Bisher keine Abbildung, da Neuerung mit PlanPro-Planungsprozess.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referenz Vergleich Besonders</em>' containment reference.
	 * @see #setReferenzVergleichBesonders(Referenz_Vergleich_Besonders_TypeClass)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_E_Ausgabe_Besonders_AttributeGroup_ReferenzVergleichBesonders()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Referenz_Vergleich_Besonders'"
	 * @generated
	 */
	Referenz_Vergleich_Besonders_TypeClass getReferenzVergleichBesonders();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Ausgabe_Besonders_AttributeGroup#getReferenzVergleichBesonders <em>Referenz Vergleich Besonders</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenz Vergleich Besonders</em>' containment reference.
	 * @see #getReferenzVergleichBesonders()
	 * @generated
	 */
	void setReferenzVergleichBesonders(Referenz_Vergleich_Besonders_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Vergleich Ausgabestand Basis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Informative menschenlesbare Grundlage des Vergleichs zwischen 2 Ausgaben einer Einzelplanung.
	 * Die Angabe setzt sich aus Ausgabedatum und Ausgabenummer zusammen, kann aber auch ergänzt werden.
	 * DB-Regelwerk
	 * Bisher keine Abbildung, da Neuerung mit PlanPro-Planungsprozess.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vergleich Ausgabestand Basis</em>' containment reference.
	 * @see #setVergleichAusgabestandBasis(Vergleich_Ausgabestand_Basis_TypeClass)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_E_Ausgabe_Besonders_AttributeGroup_VergleichAusgabestandBasis()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Vergleich_Ausgabestand_Basis'"
	 * @generated
	 */
	Vergleich_Ausgabestand_Basis_TypeClass getVergleichAusgabestandBasis();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Ausgabe_Besonders_AttributeGroup#getVergleichAusgabestandBasis <em>Vergleich Ausgabestand Basis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vergleich Ausgabestand Basis</em>' containment reference.
	 * @see #getVergleichAusgabestandBasis()
	 * @generated
	 */
	void setVergleichAusgabestandBasis(Vergleich_Ausgabestand_Basis_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Vergleichstyp Besonders</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Typ der Vergleichsoperation zwischen 2 Ausgaben einer Einzelplanung.
	 * DB-Regelwerk
	 * Bisher keine Abbildung, da Neuerung mit PlanPro-Planungsprozess.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vergleichstyp Besonders</em>' containment reference.
	 * @see #setVergleichstypBesonders(Vergleichstyp_Besonders_TypeClass)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_E_Ausgabe_Besonders_AttributeGroup_VergleichstypBesonders()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Vergleichstyp_Besonders'"
	 * @generated
	 */
	Vergleichstyp_Besonders_TypeClass getVergleichstypBesonders();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Ausgabe_Besonders_AttributeGroup#getVergleichstypBesonders <em>Vergleichstyp Besonders</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vergleichstyp Besonders</em>' containment reference.
	 * @see #getVergleichstypBesonders()
	 * @generated
	 */
	void setVergleichstypBesonders(Vergleichstyp_Besonders_TypeClass value);

} // Planung_E_Ausgabe_Besonders_AttributeGroup
