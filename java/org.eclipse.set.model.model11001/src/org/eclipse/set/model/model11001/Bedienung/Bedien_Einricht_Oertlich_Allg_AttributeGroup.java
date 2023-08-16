/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bedienung;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedien Einricht Oertlich Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Einricht_Oertlich_Allg_AttributeGroup#getBedienEinrichtBauart <em>Bedien Einricht Bauart</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Einricht_Oertlich_Allg_AttributeGroup#getHupeAnschaltzeit <em>Hupe Anschaltzeit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_Einricht_Oertlich_Allg_AttributeGroup()
 * @model extendedMetaData="name='CBedien_Einricht_Oertlich_Allg' kind='elementOnly'"
 * @generated
 */
public interface Bedien_Einricht_Oertlich_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bedien Einricht Bauart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bauart der Bedieneinrichtung. Je nach Art und Anzahl der bedienbaren Elemente werden die erforderlichen Bedieneinrichtungen ausgebildet. Für Nahbedienungen gilt außerdem: NB_Art W: Bedienpult oder Bediensäule; NB_Art R: Bedientablett, Stelltisch- oder -pult. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bedien Einricht Bauart</em>' containment reference.
	 * @see #setBedienEinrichtBauart(Bedien_Einricht_Bauart_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_Einricht_Oertlich_Allg_AttributeGroup_BedienEinrichtBauart()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bedien_Einricht_Bauart'"
	 * @generated
	 */
	Bedien_Einricht_Bauart_TypeClass getBedienEinrichtBauart();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Einricht_Oertlich_Allg_AttributeGroup#getBedienEinrichtBauart <em>Bedien Einricht Bauart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bedien Einricht Bauart</em>' containment reference.
	 * @see #getBedienEinrichtBauart()
	 * @generated
	 */
	void setBedienEinrichtBauart(Bedien_Einricht_Bauart_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Hupe Anschaltzeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der Hupdauer in Sekunden. Das Attribut wird nur gefüllt, wenn es sich um eine Bedieneinrichtung für die Nahbedienung handelt. Wird auf die Hupe einer NB-Bedieneinrichtung verzichtet, ist eine Anschaltdauer von Null Sekunden zu planen. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es findet sich im zugehörigen Lastenheft sowie in firmenspezifischen Projektierungsunterlagen, die jedoch dem LST-Fachplaner nicht zur Verfügung stehen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hupe Anschaltzeit</em>' containment reference.
	 * @see #setHupeAnschaltzeit(Hupe_Anschaltzeit_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_Einricht_Oertlich_Allg_AttributeGroup_HupeAnschaltzeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Hupe_Anschaltzeit'"
	 * @generated
	 */
	Hupe_Anschaltzeit_TypeClass getHupeAnschaltzeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Einricht_Oertlich_Allg_AttributeGroup#getHupeAnschaltzeit <em>Hupe Anschaltzeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hupe Anschaltzeit</em>' containment reference.
	 * @see #getHupeAnschaltzeit()
	 * @generated
	 */
	void setHupeAnschaltzeit(Hupe_Anschaltzeit_TypeClass value);

} // Bedien_Einricht_Oertlich_Allg_AttributeGroup
