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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NB Zone Element Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Element_Allg_AttributeGroup#getFreieStellbarkeit <em>Freie Stellbarkeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Element_Allg_AttributeGroup#getNBRueckgabevoraussetzung <em>NB Rueckgabevoraussetzung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Element_Allg_AttributeGroup#getWGspLage <em>WGsp Lage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage#getNB_Zone_Element_Allg_AttributeGroup()
 * @model extendedMetaData="name='CNB_Zone_Element_Allg' kind='elementOnly'"
 * @generated
 */
public interface NB_Zone_Element_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Freie Stellbarkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das betreffende Element (Signal, Weiche oder Gleissperre) ist innerhalb des Nahstellbereiches frei stellbar. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Freie Stellbarkeit</em>' containment reference.
	 * @see #setFreieStellbarkeit(Freie_Stellbarkeit_TypeClass)
	 * @see org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage#getNB_Zone_Element_Allg_AttributeGroup_FreieStellbarkeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Freie_Stellbarkeit'"
	 * @generated
	 */
	Freie_Stellbarkeit_TypeClass getFreieStellbarkeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Element_Allg_AttributeGroup#getFreieStellbarkeit <em>Freie Stellbarkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Freie Stellbarkeit</em>' containment reference.
	 * @see #getFreieStellbarkeit()
	 * @generated
	 */
	void setFreieStellbarkeit(Freie_Stellbarkeit_TypeClass value);

	/**
	 * Returns the value of the '<em><b>NB Rueckgabevoraussetzung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Voraussetzung, die für ein stellbares Element (Signal, Weiche, Gleissperre, Schlüsselsperre) innerhalb eines Nahstellbereiches erfüllt sein muss, bevor die Nahbedienung zurückgegeben werden kann. Kann der örtliche Bediener bei abgegebener Nahbedienung in Abhängigkeit der vorgesehenen NB Art Weichen und Gleissperren um- bzw. Signale stellen, müssen diese vor Rückgabe der Nahbedienung ggf. wieder in eine bestimmte Lage / Stellung gebracht werden. Daher ist für jedes NB Zone Element festzulegen, welche Rückgabevoraussetzung besteht. DB-Regelwerk Für die Planung von Nahstellbereichen existiert bei der DB AG kein Regelwerk. Das Planungsdatum findet sich in der Nahbedienungstabelle. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NB Rueckgabevoraussetzung</em>' containment reference.
	 * @see #setNBRueckgabevoraussetzung(NB_Rueckgabevoraussetzung_TypeClass)
	 * @see org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage#getNB_Zone_Element_Allg_AttributeGroup_NBRueckgabevoraussetzung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NB_Rueckgabevoraussetzung'"
	 * @generated
	 */
	NB_Rueckgabevoraussetzung_TypeClass getNBRueckgabevoraussetzung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Element_Allg_AttributeGroup#getNBRueckgabevoraussetzung <em>NB Rueckgabevoraussetzung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NB Rueckgabevoraussetzung</em>' containment reference.
	 * @see #getNBRueckgabevoraussetzung()
	 * @generated
	 */
	void setNBRueckgabevoraussetzung(NB_Rueckgabevoraussetzung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>WGsp Lage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lage der W/Gsp, sofern diese unabhängig von der Flankenschutzbetrachtung innerhalb des NB in einer Lage verschlossen werden soll. DB-Regelwerk Ril 819.0512
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>WGsp Lage</em>' containment reference.
	 * @see #setWGspLage(W_Gsp_Lage_TypeClass)
	 * @see org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage#getNB_Zone_Element_Allg_AttributeGroup_WGspLage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='W_Gsp_Lage'"
	 * @generated
	 */
	W_Gsp_Lage_TypeClass getWGspLage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Element_Allg_AttributeGroup#getWGspLage <em>WGsp Lage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WGsp Lage</em>' containment reference.
	 * @see #getWGspLage()
	 * @generated
	 */
	void setWGspLage(W_Gsp_Lage_TypeClass value);

} // NB_Zone_Element_Allg_AttributeGroup
