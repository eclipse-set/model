/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Block;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Element Erlaubnis Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Block.Block_Element_Erlaubnis_AttributeGroup#getAutoErlaubnisholen <em>Auto Erlaubnisholen</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Block.Block_Element_Erlaubnis_AttributeGroup#getAutoErlaubnisruecklauf <em>Auto Erlaubnisruecklauf</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Block.Block_Element_Erlaubnis_AttributeGroup#getErlaubnisStaendigVorhanden <em>Erlaubnis Staendig Vorhanden</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Block.Block_Element_Erlaubnis_AttributeGroup#getErlaubnisabgabespeicherung <em>Erlaubnisabgabespeicherung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Block.Block_Element_Erlaubnis_AttributeGroup#getErlaubnisholen <em>Erlaubnisholen</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Block.BlockPackage#getBlock_Element_Erlaubnis_AttributeGroup()
 * @model extendedMetaData="name='CBlock_Element_Erlaubnis' kind='elementOnly'"
 * @generated
 */
public interface Block_Element_Erlaubnis_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Auto Erlaubnisholen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das zugehörige Block Element kann sich die Erlaubnis von der Gegenstelle automatisch holen. Dass Attribut kann für die zu einer Block Anlage zugehörigen Block_Elementen unabhängig voneinander verwendet werden. Nur die Blockendstelle kann die Erlaubnis automatisch holen, bei der dieses Attribut auf wahr gesetzt ist. Siehe dazu auch Erlaubnisholen als Alternative. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Erlaubnisholen</em>' containment reference.
	 * @see #setAutoErlaubnisholen(Auto_Erlaubnisholen_TypeClass)
	 * @see org.eclipse.set.model.model1902.Block.BlockPackage#getBlock_Element_Erlaubnis_AttributeGroup_AutoErlaubnisholen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Auto_Erlaubnisholen'"
	 * @generated
	 */
	Auto_Erlaubnisholen_TypeClass getAutoErlaubnisholen();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Block.Block_Element_Erlaubnis_AttributeGroup#getAutoErlaubnisholen <em>Auto Erlaubnisholen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Erlaubnisholen</em>' containment reference.
	 * @see #getAutoErlaubnisholen()
	 * @generated
	 */
	void setAutoErlaubnisholen(Auto_Erlaubnisholen_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Auto Erlaubnisruecklauf</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Automatischer Erlaubnisrücklauf für die Block Anlage. Das Attribut ist auf beiden Block_Elementen der Blockanlage anzugeben, wobei eines mit wahr und das andere mit falsch zu befüllen ist. Die Erlaubnis läuft zu dem mit wahr gekennzeichneten Block Element zurück. Wenn kein automatischer Erlaubnisruecklauf eingerichtet ist, entfällt das Attribut. DB-Regelwerk [Ril 819.0102A04] Streckenblocktabelle. [482.9014, Abschnitt 3 (4)] Selbsttätige Erlaubnisrückgabe: Ist eine Fahrtrichtung für die Erlaubnis bevorrechtigt geschaltet, wird die Erlaubnis nach einer Zugfahrt gegen die bevorrechtigte Fahrtrichtung selbsttätig an die bevorrechtigte Betriebsstelle zurückgegeben. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auto Erlaubnisruecklauf</em>' containment reference.
	 * @see #setAutoErlaubnisruecklauf(Auto_Erlaubnisruecklauf_TypeClass)
	 * @see org.eclipse.set.model.model1902.Block.BlockPackage#getBlock_Element_Erlaubnis_AttributeGroup_AutoErlaubnisruecklauf()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Auto_Erlaubnisruecklauf'"
	 * @generated
	 */
	Auto_Erlaubnisruecklauf_TypeClass getAutoErlaubnisruecklauf();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Block.Block_Element_Erlaubnis_AttributeGroup#getAutoErlaubnisruecklauf <em>Auto Erlaubnisruecklauf</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Erlaubnisruecklauf</em>' containment reference.
	 * @see #getAutoErlaubnisruecklauf()
	 * @generated
	 */
	void setAutoErlaubnisruecklauf(Auto_Erlaubnisruecklauf_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Erlaubnis Staendig Vorhanden</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Erlaubnis befindet sind ständig im zugehörigen Block Element einer Block Anlage. Die Erlaubnis kann nicht abgegeben werden. Die Anwendung ist typisch für zweigleisige Strecken im Richtungsbetrieb ohne signalisiertem Gleiswechelbetrieb. Die anderen Funktionen des Erlaubniswechsels sind dann nicht möglich.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Erlaubnis Staendig Vorhanden</em>' containment reference.
	 * @see #setErlaubnisStaendigVorhanden(Erlaubnis_Staendig_Vorhanden_TypeClass)
	 * @see org.eclipse.set.model.model1902.Block.BlockPackage#getBlock_Element_Erlaubnis_AttributeGroup_ErlaubnisStaendigVorhanden()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Erlaubnis_Staendig_Vorhanden'"
	 * @generated
	 */
	Erlaubnis_Staendig_Vorhanden_TypeClass getErlaubnisStaendigVorhanden();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Block.Block_Element_Erlaubnis_AttributeGroup#getErlaubnisStaendigVorhanden <em>Erlaubnis Staendig Vorhanden</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erlaubnis Staendig Vorhanden</em>' containment reference.
	 * @see #getErlaubnisStaendigVorhanden()
	 * @generated
	 */
	void setErlaubnisStaendigVorhanden(Erlaubnis_Staendig_Vorhanden_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Erlaubnisabgabespeicherung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Block Element kann die Abgabe der Erlaubnis speichern, wenn die Bedingungen zum Erlaubniswechsel noch nicht erfüllt sind. DB-Regelwerk [Ril 482.9014, Abschnitt 3 (3), Abschnitt 7 (3), Abschnitt 11 (3)]. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Erlaubnisabgabespeicherung</em>' containment reference.
	 * @see #setErlaubnisabgabespeicherung(Erlaubnisabgabespeicherung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Block.BlockPackage#getBlock_Element_Erlaubnis_AttributeGroup_Erlaubnisabgabespeicherung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Erlaubnisabgabespeicherung'"
	 * @generated
	 */
	Erlaubnisabgabespeicherung_TypeClass getErlaubnisabgabespeicherung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Block.Block_Element_Erlaubnis_AttributeGroup#getErlaubnisabgabespeicherung <em>Erlaubnisabgabespeicherung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erlaubnisabgabespeicherung</em>' containment reference.
	 * @see #getErlaubnisabgabespeicherung()
	 * @generated
	 */
	void setErlaubnisabgabespeicherung(Erlaubnisabgabespeicherung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Erlaubnisholen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Block Element kann die Erlaubnis durch manuelle Bedienung von der Gegenstelle holen. Dass Attribut kann für die zu einer Block Anlage zugehörigen Block_Elemente unabhängig voneinander verwendet werden. Nur die Blockendstelle kann die Erlaubnis holen, bei der dieses Attribut auf true gesetzt ist. Siehe dazu auch Automatisches Erlaubnisholen als Alternative. DB Regelwerk Ril 482.9090 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Erlaubnisholen</em>' containment reference.
	 * @see #setErlaubnisholen(Erlaubnisholen_TypeClass)
	 * @see org.eclipse.set.model.model1902.Block.BlockPackage#getBlock_Element_Erlaubnis_AttributeGroup_Erlaubnisholen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Erlaubnisholen'"
	 * @generated
	 */
	Erlaubnisholen_TypeClass getErlaubnisholen();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Block.Block_Element_Erlaubnis_AttributeGroup#getErlaubnisholen <em>Erlaubnisholen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erlaubnisholen</em>' containment reference.
	 * @see #getErlaubnisholen()
	 * @generated
	 */
	void setErlaubnisholen(Erlaubnisholen_TypeClass value);

} // Block_Element_Erlaubnis_AttributeGroup
