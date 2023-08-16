/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Balisentechnik_ETCS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZUB Bereichsgrenze Nach ESG Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_ESG_AttributeGroup#getBgrenzeNachESGBedAusstieg <em>Bgrenze Nach ESG Bed Ausstieg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_ESG_AttributeGroup#getHarterAusstiegAusL2 <em>Harter Ausstieg Aus L2</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_ESG_AttributeGroup#getPrioritaet <em>Prioritaet</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Nach_ESG_AttributeGroup()
 * @model extendedMetaData="name='CZUB_Bereichsgrenze_Nach_ESG' kind='elementOnly'"
 * @generated
 */
public interface ZUB_Bereichsgrenze_Nach_ESG_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bgrenze Nach ESG Bed Ausstieg</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.Bgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Entscheidungsweiche bei bedingten Ausstieg aus dem vorherigen System.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bgrenze Nach ESG Bed Ausstieg</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Nach_ESG_AttributeGroup_BgrenzeNachESGBedAusstieg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bgrenze_Nach_ESG_Bed_Ausstieg'"
	 * @generated
	 */
	EList<Bgrenze_Nach_ESG_Bed_Ausstieg_AttributeGroup> getBgrenzeNachESGBedAusstieg();

	/**
	 * Returns the value of the '<em><b>Harter Ausstieg Aus L2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei Übergang von L2: Angabe, ob es sich um einen harten Ausstieg handelt (true). Bei einem harten Ausstieg erfolgt keine Ankündigung durch das RBC.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Harter Ausstieg Aus L2</em>' containment reference.
	 * @see #setHarterAusstiegAusL2(Harter_Ausstieg_Aus_L2_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Nach_ESG_AttributeGroup_HarterAusstiegAusL2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Harter_Ausstieg_Aus_L2'"
	 * @generated
	 */
	Harter_Ausstieg_Aus_L2_TypeClass getHarterAusstiegAusL2();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_ESG_AttributeGroup#getHarterAusstiegAusL2 <em>Harter Ausstieg Aus L2</em>}' containment reference.
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
	 * Bei mehreren Anwendungssystemen in Sonderfällen (z. B. ausländische Anwendungssysteme): Priorität für die Nutzung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prioritaet</em>' containment reference.
	 * @see #setPrioritaet(Prioritaet_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Nach_ESG_AttributeGroup_Prioritaet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Prioritaet'"
	 * @generated
	 */
	Prioritaet_TypeClass getPrioritaet();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_ESG_AttributeGroup#getPrioritaet <em>Prioritaet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prioritaet</em>' containment reference.
	 * @see #getPrioritaet()
	 * @generated
	 */
	void setPrioritaet(Prioritaet_TypeClass value);

} // ZUB_Bereichsgrenze_Nach_ESG_AttributeGroup
