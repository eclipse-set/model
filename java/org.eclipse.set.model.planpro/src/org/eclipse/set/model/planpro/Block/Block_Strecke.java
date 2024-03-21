/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Block;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Strecke_Bremsweg_ohne_Proxy_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Strecke_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Strecke</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Speicherung der betrieblich relevanter Streckendaten einer Blockstrecke. Das Objekt enthält die zwischen zwei Zugmeldestellen typischen betrieblichen Informationen (Streckendaten) zur Information. Es wird dem Blockelement der zugehörigen Blockstelle zugeordnet.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Block.Block_Strecke#getBlockStreckeAllg <em>Block Strecke Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Block.Block_Strecke#getIDBetriebsstelleNachbar <em>ID Betriebsstelle Nachbar</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Block.Block_Strecke#getIDKnotenbahnhof <em>ID Knotenbahnhof</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Block.Block_Strecke#getIDStrecke <em>ID Strecke</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Block.Block_Strecke#getIDStreckeBremsweg <em>ID Strecke Bremsweg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Block.BlockPackage#getBlock_Strecke()
 * @model extendedMetaData="name='CBlock_Strecke' kind='elementOnly'"
 * @generated
 */
public interface Block_Strecke extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Block Strecke Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block Strecke Allg</em>' containment reference.
	 * @see #setBlockStreckeAllg(Block_Strecke_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Block.BlockPackage#getBlock_Strecke_BlockStreckeAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Block_Strecke_Allg'"
	 * @generated
	 */
	Block_Strecke_Allg_AttributeGroup getBlockStreckeAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Block.Block_Strecke#getBlockStreckeAllg <em>Block Strecke Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block Strecke Allg</em>' containment reference.
	 * @see #getBlockStreckeAllg()
	 * @generated
	 */
	void setBlockStreckeAllg(Block_Strecke_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Betriebsstelle Nachbar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Örtlichkeit der nächsten Zugmeldestelle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Betriebsstelle Nachbar</em>' containment reference.
	 * @see #setIDBetriebsstelleNachbar(ID_Oertlichkeit_Proxy_TypeClass)
	 * @see org.eclipse.set.model.planpro.Block.BlockPackage#getBlock_Strecke_IDBetriebsstelleNachbar()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Betriebsstelle_Nachbar'"
	 * @generated
	 */
	ID_Oertlichkeit_Proxy_TypeClass getIDBetriebsstelleNachbar();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Block.Block_Strecke#getIDBetriebsstelleNachbar <em>ID Betriebsstelle Nachbar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Betriebsstelle Nachbar</em>' containment reference.
	 * @see #getIDBetriebsstelleNachbar()
	 * @generated
	 */
	void setIDBetriebsstelleNachbar(ID_Oertlichkeit_Proxy_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Knotenbahnhof</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Örtlichkeit des nächsten Knotenbahnhofs oder am Streckenende zur besseren Orientierung. Das Attribut ist nicht zu befüllen, wenn ID_Betriebsstelle_Nachbar bereits auf einen Knotenbahnhof oder die Örtlichkeit am Streckenende verweist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Knotenbahnhof</em>' containment reference.
	 * @see #setIDKnotenbahnhof(ID_Oertlichkeit_Proxy_TypeClass)
	 * @see org.eclipse.set.model.planpro.Block.BlockPackage#getBlock_Strecke_IDKnotenbahnhof()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Knotenbahnhof'"
	 * @generated
	 */
	ID_Oertlichkeit_Proxy_TypeClass getIDKnotenbahnhof();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Block.Block_Strecke#getIDKnotenbahnhof <em>ID Knotenbahnhof</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Knotenbahnhof</em>' containment reference.
	 * @see #getIDKnotenbahnhof()
	 * @generated
	 */
	void setIDKnotenbahnhof(ID_Oertlichkeit_Proxy_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Strecke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung auf die Strecke. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Strecke</em>' containment reference.
	 * @see #setIDStrecke(ID_Strecke_TypeClass)
	 * @see org.eclipse.set.model.planpro.Block.BlockPackage#getBlock_Strecke_IDStrecke()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Strecke'"
	 * @generated
	 */
	ID_Strecke_TypeClass getIDStrecke();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Block.Block_Strecke#getIDStrecke <em>ID Strecke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Strecke</em>' containment reference.
	 * @see #getIDStrecke()
	 * @generated
	 */
	void setIDStrecke(ID_Strecke_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Strecke Bremsweg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Bereichsobjekt Strecke_Bremsweg zur Angabe des Bremswegs der Strecke. Es besteht übergangsweise noch die Möglichkeit, das Attribut Bremsweg zu befüllen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Strecke Bremsweg</em>' containment reference.
	 * @see #setIDStreckeBremsweg(ID_Strecke_Bremsweg_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.planpro.Block.BlockPackage#getBlock_Strecke_IDStreckeBremsweg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Strecke_Bremsweg'"
	 * @generated
	 */
	ID_Strecke_Bremsweg_ohne_Proxy_TypeClass getIDStreckeBremsweg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Block.Block_Strecke#getIDStreckeBremsweg <em>ID Strecke Bremsweg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Strecke Bremsweg</em>' containment reference.
	 * @see #getIDStreckeBremsweg()
	 * @generated
	 */
	void setIDStreckeBremsweg(ID_Strecke_Bremsweg_ohne_Proxy_TypeClass value);

} // Block_Strecke
