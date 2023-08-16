/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Balisentechnik_ETCS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metallteil Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.Metallteil_AttributeGroup#getMetallteilKategorie <em>Metallteil Kategorie</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.Metallteil_AttributeGroup#getMetallteilLaenge <em>Metallteil Laenge</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getMetallteil_AttributeGroup()
 * @model extendedMetaData="name='CMetallteil' kind='elementOnly'"
 * @generated
 */
public interface Metallteil_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Metallteil Kategorie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kategorie des Metallteils, sofern ein Metallwarnungs-Datenpunkt erforderlich ist. Gemäß Ril 819.1344 ist hierfür der Wert 0 zu verwenden. Andere Einträge sind nicht zulässig.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metallteil Kategorie</em>' containment reference.
	 * @see #setMetallteilKategorie(Metallteil_Kategorie_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getMetallteil_AttributeGroup_MetallteilKategorie()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Metallteil_Kategorie'"
	 * @generated
	 */
	Metallteil_Kategorie_TypeClass getMetallteilKategorie();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.Metallteil_AttributeGroup#getMetallteilKategorie <em>Metallteil Kategorie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metallteil Kategorie</em>' containment reference.
	 * @see #getMetallteilKategorie()
	 * @generated
	 */
	void setMetallteilKategorie(Metallteil_Kategorie_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Metallteil Laenge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Länge des Metallteils, sofern eine topologiebasierte Berechnung nicht möglich ist (Anwendungsfälle ohne Verwendung der Topologie).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Metallteil Laenge</em>' containment reference.
	 * @see #setMetallteilLaenge(Metallteil_Laenge_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getMetallteil_AttributeGroup_MetallteilLaenge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Metallteil_Laenge'"
	 * @generated
	 */
	Metallteil_Laenge_TypeClass getMetallteilLaenge();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.Metallteil_AttributeGroup#getMetallteilLaenge <em>Metallteil Laenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metallteil Laenge</em>' containment reference.
	 * @see #getMetallteilLaenge()
	 * @generated
	 */
	void setMetallteilLaenge(Metallteil_Laenge_TypeClass value);

} // Metallteil_AttributeGroup
