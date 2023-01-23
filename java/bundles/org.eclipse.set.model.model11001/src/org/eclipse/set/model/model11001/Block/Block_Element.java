/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Block;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model11001.Verweise.ID_Bedien_Anzeige_Element_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Block_Strecke_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Schaltmittel_Zuordnung_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Signal_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Element am Ende einer Blockstrecke/Blockanlage. Ein Streckengleis, welches mit einer Block Anlage ausgerüstet ist, besitzt zwei korrespondierende Blockelemente in den benachbarten Betriebsstellen. Eine Ausnahme bildet der Stichstreckenblock, der nur ein Block_Element besitzt. Das Block_Element verweist auch auf die zugehörige Blockstrecke, die die relevanten blocktechnischen und betrieblichen Daten der Strecke enthält. Bei zweigleisigen Strecken verweisen zwei Blockelemente auf die Blockstrecke. Das Block_Element verweist auf ein Signal in Form des Streckenziels (A-Feld) und auf ein Schaltmittel zur Räumungsprüfung (E-Feld). Wenn eine gesonderte Zugschlussmeldung verwendet wird, wird mit ID_Zugschlussmeldung auf eine entsprechende Bedieneinrichtung verwiesen. Aus der Blockbauform der jeweiligen Endstelle kann die Art der technischen Realisierung erkannt werden. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Block.Block_Element#getBlockElementAllg <em>Block Element Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Block.Block_Element#getBlockElementErlaubnis <em>Block Element Erlaubnis</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Block.Block_Element#getIDBlockStrecke <em>ID Block Strecke</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Block.Block_Element#getIDRaeumungspruefung <em>ID Raeumungspruefung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Block.Block_Element#getIDSignal <em>ID Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Block.Block_Element#getIDZugschlussmeldung <em>ID Zugschlussmeldung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Block.BlockPackage#getBlock_Element()
 * @model extendedMetaData="name='CBlock_Element' kind='elementOnly'"
 * @generated
 */
public interface Block_Element extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Block Element Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Element Allg</em>' containment reference.
	 * @see #setBlockElementAllg(Block_Element_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Block.BlockPackage#getBlock_Element_BlockElementAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Block_Element_Allg'"
	 * @generated
	 */
	Block_Element_Allg_AttributeGroup getBlockElementAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Block.Block_Element#getBlockElementAllg <em>Block Element Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Element Allg</em>' containment reference.
	 * @see #getBlockElementAllg()
	 * @generated
	 */
	void setBlockElementAllg(Block_Element_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Block Element Erlaubnis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Element Erlaubnis</em>' containment reference.
	 * @see #setBlockElementErlaubnis(Block_Element_Erlaubnis_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Block.BlockPackage#getBlock_Element_BlockElementErlaubnis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Block_Element_Erlaubnis'"
	 * @generated
	 */
	Block_Element_Erlaubnis_AttributeGroup getBlockElementErlaubnis();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Block.Block_Element#getBlockElementErlaubnis <em>Block Element Erlaubnis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Element Erlaubnis</em>' containment reference.
	 * @see #getBlockElementErlaubnis()
	 * @generated
	 */
	void setBlockElementErlaubnis(Block_Element_Erlaubnis_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Block Strecke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis vom Block Element auf die zugehörige Block Strecke. Bei zweigleisigen Strecken verweisen zwei Block_Elemente auf die Block_Strecke. Bei eingleisigen Strecken verweist nur ein Block_Element auf die Block_Strecke. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Block Strecke</em>' containment reference.
	 * @see #setIDBlockStrecke(ID_Block_Strecke_TypeClass)
	 * @see org.eclipse.set.model.model11001.Block.BlockPackage#getBlock_Element_IDBlockStrecke()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Block_Strecke'"
	 * @generated
	 */
	ID_Block_Strecke_TypeClass getIDBlockStrecke();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Block.Block_Element#getIDBlockStrecke <em>ID Block Strecke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Block Strecke</em>' containment reference.
	 * @see #getIDBlockStrecke()
	 * @generated
	 */
	void setIDBlockStrecke(ID_Block_Strecke_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Raeumungspruefung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis vom Block Element auf die zugehörge Räumungsprüfung. Das Blockelement verweist über Schaltmittel Zuordnung auf ein Schaltmittel, welches zur Räumungsprüfung befahren und freigefahren werden muss. Nach erfolgreicher Räumungsprüfung kann der (automatische) Rückblock erfolgen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Raeumungspruefung</em>' containment reference.
	 * @see #setIDRaeumungspruefung(ID_Schaltmittel_Zuordnung_TypeClass)
	 * @see org.eclipse.set.model.model11001.Block.BlockPackage#getBlock_Element_IDRaeumungspruefung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Raeumungspruefung'"
	 * @generated
	 */
	ID_Schaltmittel_Zuordnung_TypeClass getIDRaeumungspruefung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Block.Block_Element#getIDRaeumungspruefung <em>ID Raeumungspruefung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Raeumungspruefung</em>' containment reference.
	 * @see #getIDRaeumungspruefung()
	 * @generated
	 */
	void setIDRaeumungspruefung(ID_Schaltmittel_Zuordnung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein fiktives Signal (Ausfahrziel), über das die Abhängigkeit des zugehörigen A-Feldes beschrieben wird. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal</em>' containment reference.
	 * @see #setIDSignal(ID_Signal_TypeClass)
	 * @see org.eclipse.set.model.model11001.Block.BlockPackage#getBlock_Element_IDSignal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Signal'"
	 * @generated
	 */
	ID_Signal_TypeClass getIDSignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Block.Block_Element#getIDSignal <em>ID Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Signal</em>' containment reference.
	 * @see #getIDSignal()
	 * @generated
	 */
	void setIDSignal(ID_Signal_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Zugschlussmeldung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis vom Block Element auf die zugehörige Bedieneinrichtung zur Abgabe einer Zugschlussmeldung. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Zugschlussmeldung</em>' containment reference.
	 * @see #setIDZugschlussmeldung(ID_Bedien_Anzeige_Element_TypeClass)
	 * @see org.eclipse.set.model.model11001.Block.BlockPackage#getBlock_Element_IDZugschlussmeldung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Zugschlussmeldung'"
	 * @generated
	 */
	ID_Bedien_Anzeige_Element_TypeClass getIDZugschlussmeldung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Block.Block_Element#getIDZugschlussmeldung <em>ID Zugschlussmeldung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Zugschlussmeldung</em>' containment reference.
	 * @see #getIDZugschlussmeldung()
	 * @generated
	 */
	void setIDZugschlussmeldung(ID_Bedien_Anzeige_Element_TypeClass value);

} // Block_Element
