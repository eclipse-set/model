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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZUB Bereichsgrenze Nach LZB Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_LZB_AttributeGroup#getBgrenzeNachLZBBedEinstieg <em>Bgrenze Nach LZB Bed Einstieg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_LZB_AttributeGroup#getHarterAusstiegAusL2 <em>Harter Ausstieg Aus L2</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_LZB_AttributeGroup#getPrioritaet <em>Prioritaet</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Nach_LZB_AttributeGroup()
 * @model extendedMetaData="name='CZUB_Bereichsgrenze_Nach_LZB' kind='elementOnly'"
 * @generated
 */
public interface ZUB_Bereichsgrenze_Nach_LZB_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bgrenze Nach LZB Bed Einstieg</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_Nach_LZB_Bed_Einstieg_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bgrenze Nach LZB Bed Einstieg</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Nach_LZB_AttributeGroup_BgrenzeNachLZBBedEinstieg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bgrenze_Nach_LZB_Bed_Einstieg'"
	 * @generated
	 */
	EList<Bgrenze_Nach_LZB_Bed_Einstieg_AttributeGroup> getBgrenzeNachLZBBedEinstieg();

	/**
	 * Returns the value of the '<em><b>Harter Ausstieg Aus L2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei Übergang von L2: Angabe, ob es sich um einen harten Ausstieg handelt (true). Bei einem harten Ausstieg erfolgt keine Ankündigung durch das RBC.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Harter Ausstieg Aus L2</em>' containment reference.
	 * @see #setHarterAusstiegAusL2(Harter_Ausstieg_Aus_L2_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Nach_LZB_AttributeGroup_HarterAusstiegAusL2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Harter_Ausstieg_Aus_L2'"
	 * @generated
	 */
	Harter_Ausstieg_Aus_L2_TypeClass getHarterAusstiegAusL2();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_LZB_AttributeGroup#getHarterAusstiegAusL2 <em>Harter Ausstieg Aus L2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Harter Ausstieg Aus L2</em>' containment reference.
	 * @see #getHarterAusstiegAusL2()
	 * @generated
	 */
	void setHarterAusstiegAusL2(Harter_Ausstieg_Aus_L2_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Prioritaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei mehreren Anwendungssystemen in Sonderfällen (z. B. ausländische Anwendungssysteme): Priorität für die Nutzung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prioritaet</em>' containment reference.
	 * @see #setPrioritaet(Prioritaet_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Nach_LZB_AttributeGroup_Prioritaet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Prioritaet'"
	 * @generated
	 */
	Prioritaet_TypeClass getPrioritaet();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_LZB_AttributeGroup#getPrioritaet <em>Prioritaet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prioritaet</em>' containment reference.
	 * @see #getPrioritaet()
	 * @generated
	 */
	void setPrioritaet(Prioritaet_TypeClass value);

} // ZUB_Bereichsgrenze_Nach_LZB_AttributeGroup
