/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Ansteuerung_Element;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model11001.Verweise.ID_Energie_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ESTW ZE Energieversorgung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Ansteuerung_Element.ESTW_ZE_Energieversorgung_AttributeGroup#getEnergieversorgungArtErsatz2 <em>Energieversorgung Art Ersatz2</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ansteuerung_Element.ESTW_ZE_Energieversorgung_AttributeGroup#getEnergieversorgungArt <em>Energieversorgung Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ansteuerung_Element.ESTW_ZE_Energieversorgung_AttributeGroup#getIDEnergiePrimaer <em>ID Energie Primaer</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ansteuerung_Element.ESTW_ZE_Energieversorgung_AttributeGroup#getEnergieversorgungArtErsatz <em>Energieversorgung Art Ersatz</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ansteuerung_Element.ESTW_ZE_Energieversorgung_AttributeGroup#getIDEnergieSekundaer <em>ID Energie Sekundaer</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_ZE_Energieversorgung_AttributeGroup()
 * @model extendedMetaData="name='CESTW_ZE_Energieversorgung' kind='elementOnly'"
 * @generated
 */
public interface ESTW_ZE_Energieversorgung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Energieversorgung Art Ersatz2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der zweiten Ersatz-Energieversorgung (bei DSTW: 1. Ersatz Fahrleitung, 2. Ersatz NEA).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Energieversorgung Art Ersatz2</em>' containment reference.
	 * @see #setEnergieversorgungArtErsatz2(Energieversorgung_Art_Ersatz_TypeClass)
	 * @see org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_ZE_Energieversorgung_AttributeGroup_EnergieversorgungArtErsatz2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Energieversorgung_Art_Ersatz_2'"
	 * @generated
	 */
	Energieversorgung_Art_Ersatz_TypeClass getEnergieversorgungArtErsatz2();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ansteuerung_Element.ESTW_ZE_Energieversorgung_AttributeGroup#getEnergieversorgungArtErsatz2 <em>Energieversorgung Art Ersatz2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energieversorgung Art Ersatz2</em>' containment reference.
	 * @see #getEnergieversorgungArtErsatz2()
	 * @generated
	 */
	void setEnergieversorgungArtErsatz2(Energieversorgung_Art_Ersatz_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Energieversorgung Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Grundsätzliche Art der Energieversorgung. Wird für die Energieversorgung eine ESTW_Zentraleinheit, eine andere Aussenelementansteuerung oder ein BÜ verwendet, so kann dies in frühen Planungsphasen unspezifisch mit diesem Attribut angegeben werden. In späteren Planungsphasen wird dann alternativ die spezifische Quelle der Energie mit ID Energie Primaer angegeben. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk notwendig. DB-Regelwerk Beschreibung im Erläuterungsbericht
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Energieversorgung Art</em>' containment reference.
	 * @see #setEnergieversorgungArt(Energieversorgung_Art_TypeClass)
	 * @see org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_ZE_Energieversorgung_AttributeGroup_EnergieversorgungArt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Energieversorgung_Art'"
	 * @generated
	 */
	Energieversorgung_Art_TypeClass getEnergieversorgungArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ansteuerung_Element.ESTW_ZE_Energieversorgung_AttributeGroup#getEnergieversorgungArt <em>Energieversorgung Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energieversorgung Art</em>' containment reference.
	 * @see #getEnergieversorgungArt()
	 * @generated
	 */
	void setEnergieversorgungArt(Energieversorgung_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Energie Primaer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID Energie Primaer</em>' containment reference.
	 * @see #setIDEnergiePrimaer(ID_Energie_TypeClass)
	 * @see org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_ZE_Energieversorgung_AttributeGroup_IDEnergiePrimaer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Energie_Primaer'"
	 * @generated
	 */
	ID_Energie_TypeClass getIDEnergiePrimaer();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ansteuerung_Element.ESTW_ZE_Energieversorgung_AttributeGroup#getIDEnergiePrimaer <em>ID Energie Primaer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Energie Primaer</em>' containment reference.
	 * @see #getIDEnergiePrimaer()
	 * @generated
	 */
	void setIDEnergiePrimaer(ID_Energie_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Energieversorgung Art Ersatz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Grundsätzliche Art der Ersatz-Energieversorgung. Wird für die Ersatz-Energieversorgung eine ESTW_Zentraleinheit, eine andere Aussenelementansteuerung oder ein BÜ verwendet, so kann dies in frühen Planungsphasen unspezifisch mit diesem Attribut angegeben werden. In späteren Planungsphasen wird dann alternativ die spezifische Quelle der Energie mit ID Energie Sekundaer angegeben. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk notwendig. DB-Regelwerk Beschreibung im Erläuterungsbericht
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Energieversorgung Art Ersatz</em>' containment reference.
	 * @see #setEnergieversorgungArtErsatz(Energieversorgung_Art_Ersatz_TypeClass)
	 * @see org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_ZE_Energieversorgung_AttributeGroup_EnergieversorgungArtErsatz()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Energieversorgung_Art_Ersatz'"
	 * @generated
	 */
	Energieversorgung_Art_Ersatz_TypeClass getEnergieversorgungArtErsatz();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ansteuerung_Element.ESTW_ZE_Energieversorgung_AttributeGroup#getEnergieversorgungArtErsatz <em>Energieversorgung Art Ersatz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Energieversorgung Art Ersatz</em>' containment reference.
	 * @see #getEnergieversorgungArtErsatz()
	 * @generated
	 */
	void setEnergieversorgungArtErsatz(Energieversorgung_Art_Ersatz_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Energie Sekundaer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID Energie Sekundaer</em>' containment reference.
	 * @see #setIDEnergieSekundaer(ID_Energie_TypeClass)
	 * @see org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage#getESTW_ZE_Energieversorgung_AttributeGroup_IDEnergieSekundaer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Energie_Sekundaer'"
	 * @generated
	 */
	ID_Energie_TypeClass getIDEnergieSekundaer();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ansteuerung_Element.ESTW_ZE_Energieversorgung_AttributeGroup#getIDEnergieSekundaer <em>ID Energie Sekundaer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Energie Sekundaer</em>' containment reference.
	 * @see #getIDEnergieSekundaer()
	 * @generated
	 */
	void setIDEnergieSekundaer(ID_Energie_TypeClass value);

} // ESTW_ZE_Energieversorgung_AttributeGroup
