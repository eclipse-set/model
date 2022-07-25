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
 * A representation of the model object '<em><b>NB Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Allg_AttributeGroup#getNBArt <em>NB Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Allg_AttributeGroup#getNBBezeichnung <em>NB Bezeichnung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NahbedienbereichPackage#getNB_Allg_AttributeGroup()
 * @model extendedMetaData="name='CNB_Allg' kind='elementOnly'"
 * @generated
 */
public interface NB_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>NB Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Festlegung der innerhalb des Nahbedienbereiches möglichen Bedienhandlungen. Die Art des Nahbedienbereiches (NB) entscheidet über die innerhalb des NB möglichen Funktionalitäten: G: Signale zeigen Kl/Sh1; nur ortsbediente Weichen umstellbar; BÜ-Bedienung mit Rangierschalter; W: wie G, zusätzlich Umstellung von mit Antrieben ausgerüsteter Weichen möglich; R: wie W, zusätzlich Fahren mit Rangierstraßen innerhalb des NB. In Abhängigkeit der gewählten Art des Nahbedienbereiches werden Funktionalitäten und physische Ausbildung von NB Bedien Anzeige Element festgelegt. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es geht aus dem zugehörigen Lastenheft hervor, dass dem LST-Fachplaner jedoch nicht zur Verfügung steht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NB Art</em>' containment reference.
	 * @see #setNBArt(NB_Art_TypeClass)
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NahbedienbereichPackage#getNB_Allg_AttributeGroup_NBArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NB_Art'"
	 * @generated
	 */
	NB_Art_TypeClass getNBArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Allg_AttributeGroup#getNBArt <em>NB Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NB Art</em>' containment reference.
	 * @see #getNBArt()
	 * @generated
	 */
	void setNBArt(NB_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>NB Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Numerischen Bezeichnung des Nahbedienbereichs. Die Bezeichnung des Nahbedienbereichs gemäß Ril 819.9001 (z. B. 99NB1) wird aus der Kennzahl von Bezeichnung Element, dem Kürzel NB (generiert aus der Anlegung der Instanz „NB“) und der NB_Bezeichnung zusammengesetzt. Das Attribut NB_Bezeichnung wurde trotz Nutzung der Basisattributgruppe Bezeichnung geschaffen, da die numerische Bezeichnung des NB (z. B. \"1\") kein örtlicher Elementbezeichner ist. DB-Regelwerk 819.9001 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NB Bezeichnung</em>' containment reference.
	 * @see #setNBBezeichnung(NB_Bezeichnung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NahbedienbereichPackage#getNB_Allg_AttributeGroup_NBBezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='NB_Bezeichnung'"
	 * @generated
	 */
	NB_Bezeichnung_TypeClass getNBBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Allg_AttributeGroup#getNBBezeichnung <em>NB Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NB Bezeichnung</em>' containment reference.
	 * @see #getNBBezeichnung()
	 * @generated
	 */
	void setNBBezeichnung(NB_Bezeichnung_TypeClass value);

} // NB_Allg_AttributeGroup
