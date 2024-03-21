/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FT Anschaltbedingung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Beschreibung der Bedingungen, die zur Auswahl eines Fachtelegramms erfüllt sein müssen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Anschaltbedingung#getBedingungBesondere <em>Bedingung Besondere</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Anschaltbedingung#getBedingungPZB <em>Bedingung PZB</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Anschaltbedingung#getBedingungSignal <em>Bedingung Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Anschaltbedingung#getBedingungSonstige <em>Bedingung Sonstige</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Anschaltbedingung#getBedingungWeiche <em>Bedingung Weiche</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_Anschaltbedingung()
 * @model extendedMetaData="name='CFT_Anschaltbedingung' kind='elementOnly'"
 * @generated
 */
public interface FT_Anschaltbedingung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bedingung Besondere</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bedingung Besondere</em>' containment reference.
	 * @see #setBedingungBesondere(Bedingung_Besondere_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_Anschaltbedingung_BedingungBesondere()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bedingung_Besondere'"
	 * @generated
	 */
	Bedingung_Besondere_AttributeGroup getBedingungBesondere();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Anschaltbedingung#getBedingungBesondere <em>Bedingung Besondere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bedingung Besondere</em>' containment reference.
	 * @see #getBedingungBesondere()
	 * @generated
	 */
	void setBedingungBesondere(Bedingung_Besondere_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Bedingung PZB</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bedingung PZB</em>' containment reference.
	 * @see #setBedingungPZB(Bedingung_PZB_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_Anschaltbedingung_BedingungPZB()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bedingung_PZB'"
	 * @generated
	 */
	Bedingung_PZB_AttributeGroup getBedingungPZB();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Anschaltbedingung#getBedingungPZB <em>Bedingung PZB</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bedingung PZB</em>' containment reference.
	 * @see #getBedingungPZB()
	 * @generated
	 */
	void setBedingungPZB(Bedingung_PZB_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Bedingung Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bedingung Signal</em>' containment reference.
	 * @see #setBedingungSignal(Bedingung_Signal_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_Anschaltbedingung_BedingungSignal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bedingung_Signal'"
	 * @generated
	 */
	Bedingung_Signal_AttributeGroup getBedingungSignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Anschaltbedingung#getBedingungSignal <em>Bedingung Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bedingung Signal</em>' containment reference.
	 * @see #getBedingungSignal()
	 * @generated
	 */
	void setBedingungSignal(Bedingung_Signal_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Bedingung Sonstige</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bedingung Sonstige</em>' containment reference.
	 * @see #setBedingungSonstige(Bedingung_Sonstige_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_Anschaltbedingung_BedingungSonstige()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bedingung_Sonstige'"
	 * @generated
	 */
	Bedingung_Sonstige_AttributeGroup getBedingungSonstige();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Anschaltbedingung#getBedingungSonstige <em>Bedingung Sonstige</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bedingung Sonstige</em>' containment reference.
	 * @see #getBedingungSonstige()
	 * @generated
	 */
	void setBedingungSonstige(Bedingung_Sonstige_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Bedingung Weiche</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bedingung Weiche</em>' containment reference.
	 * @see #setBedingungWeiche(Bedingung_Weiche_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_Anschaltbedingung_BedingungWeiche()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bedingung_Weiche'"
	 * @generated
	 */
	Bedingung_Weiche_AttributeGroup getBedingungWeiche();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.FT_Anschaltbedingung#getBedingungWeiche <em>Bedingung Weiche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bedingung Weiche</em>' containment reference.
	 * @see #getBedingungWeiche()
	 * @generated
	 */
	void setBedingungWeiche(Bedingung_Weiche_AttributeGroup value);

} // FT_Anschaltbedingung
