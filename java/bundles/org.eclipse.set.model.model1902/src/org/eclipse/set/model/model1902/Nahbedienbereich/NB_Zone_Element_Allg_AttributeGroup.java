/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Nahbedienbereich;

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
 *   <li>{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Zone_Element_Allg_AttributeGroup#getFreieStellbarkeit <em>Freie Stellbarkeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Zone_Element_Allg_AttributeGroup#getNBRueckgabevoraussetzung <em>NB Rueckgabevoraussetzung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NahbedienbereichPackage#getNB_Zone_Element_Allg_AttributeGroup()
 * @model extendedMetaData="name='CNB_Zone_Element_Allg' kind='elementOnly'"
 * @generated
 */
public interface NB_Zone_Element_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Freie Stellbarkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das betreffende Element (Signal, Weiche oder Gleissperre) ist innerhalb des Nahbedienbereiches frei stellbar. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Freie Stellbarkeit</em>' containment reference.
	 * @see #setFreieStellbarkeit(Freie_Stellbarkeit_TypeClass)
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NahbedienbereichPackage#getNB_Zone_Element_Allg_AttributeGroup_FreieStellbarkeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Freie_Stellbarkeit'"
	 * @generated
	 */
	Freie_Stellbarkeit_TypeClass getFreieStellbarkeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Zone_Element_Allg_AttributeGroup#getFreieStellbarkeit <em>Freie Stellbarkeit</em>}' containment reference.
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
	 * Voraussetzung, die für ein stellbares Element (Signal, Weiche, Gleissperre, Schlüsselsperre) innerhalb eines Nahbedienbereiches erfüllt sein muss, bevor die Nahbedienung zurückgegeben werden kann. Kann der örtliche Bediener bei abgegebener Nachbedienung in Abhängigkeit der vorgesehenen NB Art Weichen und Gleissperren um- bzw. Signale stellen, müssen diese vor Rückgabe der Nahbedienung ggf. wieder in eine bestimmte Lage / Stellung gebracht werden. Daher ist für jedes NB Zone Element festzulegen, welche Rückgabevoraussetzung besteht. DB-Regelwerk Für die Planung von Nahbedienbereichen existiert bei der DB AG kein Regelwerk. Das Planungsdatum findet sich in der Nahbedienungstabelle. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NB Rueckgabevoraussetzung</em>' containment reference.
	 * @see #setNBRueckgabevoraussetzung(NB_Rueckgabevoraussetzung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NahbedienbereichPackage#getNB_Zone_Element_Allg_AttributeGroup_NBRueckgabevoraussetzung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NB_Rueckgabevoraussetzung'"
	 * @generated
	 */
	NB_Rueckgabevoraussetzung_TypeClass getNBRueckgabevoraussetzung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Zone_Element_Allg_AttributeGroup#getNBRueckgabevoraussetzung <em>NB Rueckgabevoraussetzung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NB Rueckgabevoraussetzung</em>' containment reference.
	 * @see #getNBRueckgabevoraussetzung()
	 * @generated
	 */
	void setNBRueckgabevoraussetzung(NB_Rueckgabevoraussetzung_TypeClass value);

} // NB_Zone_Element_Allg_AttributeGroup
