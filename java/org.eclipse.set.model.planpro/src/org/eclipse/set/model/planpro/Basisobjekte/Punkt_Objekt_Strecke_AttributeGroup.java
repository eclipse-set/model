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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.planpro.Verweise.ID_Strecke_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Punkt Objekt Strecke Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup#getIDStrecke <em>ID Strecke</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup#getKmMassgebend <em>Km Massgebend</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup#getStreckeKm <em>Strecke Km</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage#getPunkt_Objekt_Strecke_AttributeGroup()
 * @model extendedMetaData="name='CPunkt_Objekt_Strecke' kind='elementOnly'"
 * @generated
 */
public interface Punkt_Objekt_Strecke_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Strecke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung eines Punktobjektes zu einer Streckennummer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Strecke</em>' containment reference.
	 * @see #setIDStrecke(ID_Strecke_TypeClass)
	 * @see org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage#getPunkt_Objekt_Strecke_AttributeGroup_IDStrecke()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Strecke'"
	 * @generated
	 */
	ID_Strecke_TypeClass getIDStrecke();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup#getIDStrecke <em>ID Strecke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Strecke</em>' containment reference.
	 * @see #getIDStrecke()
	 * @generated
	 */
	void setIDStrecke(ID_Strecke_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Km Massgebend</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kennzeichnung der maßgebenden Kilometrierung (\"true\") bei Referenz zu mehreren Strecken.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Km Massgebend</em>' containment reference.
	 * @see #setKmMassgebend(Km_Massgebend_TypeClass)
	 * @see org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage#getPunkt_Objekt_Strecke_AttributeGroup_KmMassgebend()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Km_Massgebend'"
	 * @generated
	 */
	Km_Massgebend_TypeClass getKmMassgebend();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup#getKmMassgebend <em>Km Massgebend</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Km Massgebend</em>' containment reference.
	 * @see #getKmMassgebend()
	 * @generated
	 */
	void setKmMassgebend(Km_Massgebend_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Strecke Km</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kilometer des Punktobjekts an der Strecke.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strecke Km</em>' containment reference.
	 * @see #setStreckeKm(Strecke_Km_TypeClass)
	 * @see org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage#getPunkt_Objekt_Strecke_AttributeGroup_StreckeKm()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Strecke_Km'"
	 * @generated
	 */
	Strecke_Km_TypeClass getStreckeKm();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup#getStreckeKm <em>Strecke Km</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strecke Km</em>' containment reference.
	 * @see #getStreckeKm()
	 * @generated
	 */
	void setStreckeKm(Strecke_Km_TypeClass value);

} // Punkt_Objekt_Strecke_AttributeGroup
