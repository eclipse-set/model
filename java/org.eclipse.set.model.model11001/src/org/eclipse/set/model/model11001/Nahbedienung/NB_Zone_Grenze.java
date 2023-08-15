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

import org.eclipse.set.model.model11001.Verweise.ID_Markanter_Punkt_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_NB_Zone_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NB Zone Grenze</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Grenze der NB Zone gegenüber dem der Zone angrenzenden Bereich. Die NB Zone wird mittels (technischem) Flankenschutz gegenüber dem benachbarten Bereich (ESTW oder einer weiteren Zone) abgegrenzt. Grenzelemente bilden Signale, Weichen oder Gleissperren, welche in jeweiliger Flankenschutzlage verschlossen werden. Auch die Angabe eines Achzählpunkts ist möglich. Bei an die NB Zone angrenzendem Ortstellbereich ist die TM 2010-388 I.NVT 3 \"Planungsregeln Bedienbereiche - Schnittstellen Stellwerksbereiche\" zu beachten. DB-Regelwerk TM 2010-388 I.NVT 3 Die Angabe von Grenzelementen außerhalb der NB-Zone finden sich in der Nahbedienungstabelle, Spalte 7.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Grenze#getIDMarkanterPunkt <em>ID Markanter Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Grenze#getIDNBZone <em>IDNB Zone</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Grenze#getNBGrenzeArt <em>NB Grenze Art</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage#getNB_Zone_Grenze()
 * @model extendedMetaData="name='CNB_Zone_Grenze' kind='elementOnly'"
 * @generated
 */
public interface NB_Zone_Grenze extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Markanter Punkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf einen Markanten Punkt (Signal, Weichen- bzw. Gleissperrenkomponente, Azp), der die Grenze der NB_Zone darstellt. DB-Regelwerk Zur Planung von Nahstellbereichen gibt es bei der DB AG kein Regelwerk. Dieses Planungsdatum findet sich in der Nahbedienungstabelle Flankenschutztabelle 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Markanter Punkt</em>' containment reference.
	 * @see #setIDMarkanterPunkt(ID_Markanter_Punkt_TypeClass)
	 * @see org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage#getNB_Zone_Grenze_IDMarkanterPunkt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Markanter_Punkt'"
	 * @generated
	 */
	ID_Markanter_Punkt_TypeClass getIDMarkanterPunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Grenze#getIDMarkanterPunkt <em>ID Markanter Punkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Markanter Punkt</em>' containment reference.
	 * @see #getIDMarkanterPunkt()
	 * @generated
	 */
	void setIDMarkanterPunkt(ID_Markanter_Punkt_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDNB Zone</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die NB_Zone, für die die Grenze festgelegt wird. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDNB Zone</em>' containment reference.
	 * @see #setIDNBZone(ID_NB_Zone_TypeClass)
	 * @see org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage#getNB_Zone_Grenze_IDNBZone()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_NB_Zone'"
	 * @generated
	 */
	ID_NB_Zone_TypeClass getIDNBZone();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Grenze#getIDNBZone <em>IDNB Zone</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDNB Zone</em>' containment reference.
	 * @see #getIDNBZone()
	 * @generated
	 */
	void setIDNBZone(ID_NB_Zone_TypeClass value);

	/**
	 * Returns the value of the '<em><b>NB Grenze Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angrenzender Nachbar der NB Zone. Von der Art des angrenzenden Bereiches hängt der zu planende (technische) Flankenschutz ab. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NB Grenze Art</em>' containment reference.
	 * @see #setNBGrenzeArt(NB_Grenze_Art_TypeClass)
	 * @see org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage#getNB_Zone_Grenze_NBGrenzeArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NB_Grenze_Art'"
	 * @generated
	 */
	NB_Grenze_Art_TypeClass getNBGrenzeArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Grenze#getNBGrenzeArt <em>NB Grenze Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NB Grenze Art</em>' containment reference.
	 * @see #getNBGrenzeArt()
	 * @generated
	 */
	void setNBGrenzeArt(NB_Grenze_Art_TypeClass value);

} // NB_Zone_Grenze
