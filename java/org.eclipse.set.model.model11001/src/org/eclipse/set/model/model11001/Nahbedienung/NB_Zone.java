/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Nahbedienung;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model11001.Verweise.ID_NB_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_NB_Zone_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NB Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Nahstellbereichszone. Jeder Nahstellbereich hat mindestens eine Zone; es sind auch mehrere Zonen möglich. Die Zonen können voneinander unabhängig nebeneinander liegen, sich überlappen oder eine Zone kann eine kleinere \"Teilmenge\" einer größeren Zone sein. Als spezieller Fall ist auch die Vereinigung von zwei nebeneinander liegenden Zonen möglich. Für jede Zone werden eigene Grenzen zum angrenzenden Bereich (ESTW, NB, Ortstellbereich) festgelegt. DB-Regelwerk Für die Planung von Nahbedienzonen exisitert bei der DB AG kein Regelwerk. Die Angabe findet sich in der Nahbedienungstabelle, Spalte 1.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone#getIDNB <em>IDNB</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone#getIDNBZone <em>IDNB Zone</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone#getNBZoneAllg <em>NB Zone Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage#getNB_Zone()
 * @model extendedMetaData="name='CNB_Zone' kind='elementOnly'"
 * @generated
 */
public interface NB_Zone extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(NB_Zone_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage#getNB_Zone_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	NB_Zone_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(NB_Zone_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDNB</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis von der NB Zone auf den zugehörigen Nahstellbereich. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDNB</em>' containment reference.
	 * @see #setIDNB(ID_NB_TypeClass)
	 * @see org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage#getNB_Zone_IDNB()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_NB'"
	 * @generated
	 */
	ID_NB_TypeClass getIDNB();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone#getIDNB <em>IDNB</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDNB</em>' containment reference.
	 * @see #getIDNB()
	 * @generated
	 */
	void setIDNB(ID_NB_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDNB Zone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die übergeordnete NB_Zone (die betrachtete NB_Zone ist damit untergeordnet). In der untergeordneten Zone muss die Nahbedienung zuerst zurückgegeben werden, bevor die Nahbedienung in der übergeordneten Zone zurückgegeben werden kann.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDNB Zone</em>' containment reference.
	 * @see #setIDNBZone(ID_NB_Zone_TypeClass)
	 * @see org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage#getNB_Zone_IDNBZone()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_NB_Zone'"
	 * @generated
	 */
	ID_NB_Zone_TypeClass getIDNBZone();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone#getIDNBZone <em>IDNB Zone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDNB Zone</em>' containment reference.
	 * @see #getIDNBZone()
	 * @generated
	 */
	void setIDNBZone(ID_NB_Zone_TypeClass value);

	/**
	 * Returns the value of the '<em><b>NB Zone Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>NB Zone Allg</em>' containment reference.
	 * @see #setNBZoneAllg(NB_Zone_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage#getNB_Zone_NBZoneAllg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NB_Zone_Allg'"
	 * @generated
	 */
	NB_Zone_Allg_AttributeGroup getNBZoneAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone#getNBZoneAllg <em>NB Zone Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NB Zone Allg</em>' containment reference.
	 * @see #getNBZoneAllg()
	 * @generated
	 */
	void setNBZoneAllg(NB_Zone_Allg_AttributeGroup value);

} // NB_Zone
