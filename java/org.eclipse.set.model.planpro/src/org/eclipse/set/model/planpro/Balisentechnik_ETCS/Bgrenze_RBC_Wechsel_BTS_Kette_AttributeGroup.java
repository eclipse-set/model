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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bgrenze RBC Wechsel BTS Kette Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup#getBezStreckeBTS1 <em>Bez Strecke BTS1</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup#getBezStreckeBTS2 <em>Bez Strecke BTS2</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup#getBezStreckeBTS3 <em>Bez Strecke BTS3</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup#getKmBTS1 <em>Km BTS1</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup#getKmBTS2 <em>Km BTS2</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup#getKmBTS3 <em>Km BTS3</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup()
 * @model extendedMetaData="name='CBgrenze_RBC_Wechsel_BTS_Kette' kind='elementOnly'"
 * @generated
 */
public interface Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bez Strecke BTS1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung der Strecke, an der die erste BTS, die an die Bereichsgrenze (RBC-Wechsel) angrenzt, positioniert ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bez Strecke BTS1</em>' containment reference.
	 * @see #setBezStreckeBTS1(Bez_Strecke_BTS_1_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup_BezStreckeBTS1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bez_Strecke_BTS_1'"
	 * @generated
	 */
	Bez_Strecke_BTS_1_TypeClass getBezStreckeBTS1();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup#getBezStreckeBTS1 <em>Bez Strecke BTS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bez Strecke BTS1</em>' containment reference.
	 * @see #getBezStreckeBTS1()
	 * @generated
	 */
	void setBezStreckeBTS1(Bez_Strecke_BTS_1_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Bez Strecke BTS2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung der Strecke, an der die zweite BTS, die an die Bereichsgrenze (RBC-Wechsel) angrenzt, positioniert ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bez Strecke BTS2</em>' containment reference.
	 * @see #setBezStreckeBTS2(Bez_Strecke_BTS_2_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup_BezStreckeBTS2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bez_Strecke_BTS_2'"
	 * @generated
	 */
	Bez_Strecke_BTS_2_TypeClass getBezStreckeBTS2();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup#getBezStreckeBTS2 <em>Bez Strecke BTS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bez Strecke BTS2</em>' containment reference.
	 * @see #getBezStreckeBTS2()
	 * @generated
	 */
	void setBezStreckeBTS2(Bez_Strecke_BTS_2_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Bez Strecke BTS3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung der Strecke, an der die dritte BTS, die an die Bereichsgrenze (RBC-Wechsel) angrenzt, positioniert ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bez Strecke BTS3</em>' containment reference.
	 * @see #setBezStreckeBTS3(Bez_Strecke_BTS_3_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup_BezStreckeBTS3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bez_Strecke_BTS_3'"
	 * @generated
	 */
	Bez_Strecke_BTS_3_TypeClass getBezStreckeBTS3();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup#getBezStreckeBTS3 <em>Bez Strecke BTS3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bez Strecke BTS3</em>' containment reference.
	 * @see #getBezStreckeBTS3()
	 * @generated
	 */
	void setBezStreckeBTS3(Bez_Strecke_BTS_3_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Km BTS1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Streckenkilometer der ersten BTS, die an die Bereichsgrenze (RBC-Wechsel) angrenzt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Km BTS1</em>' containment reference.
	 * @see #setKmBTS1(Km_BTS_1_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup_KmBTS1()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Km_BTS_1'"
	 * @generated
	 */
	Km_BTS_1_TypeClass getKmBTS1();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup#getKmBTS1 <em>Km BTS1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Km BTS1</em>' containment reference.
	 * @see #getKmBTS1()
	 * @generated
	 */
	void setKmBTS1(Km_BTS_1_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Km BTS2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Streckenkilometer der zweiten BTS, die an die Bereichsgrenze (RBC-Wechsel) angrenzt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Km BTS2</em>' containment reference.
	 * @see #setKmBTS2(Km_BTS_2_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup_KmBTS2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Km_BTS_2'"
	 * @generated
	 */
	Km_BTS_2_TypeClass getKmBTS2();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup#getKmBTS2 <em>Km BTS2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Km BTS2</em>' containment reference.
	 * @see #getKmBTS2()
	 * @generated
	 */
	void setKmBTS2(Km_BTS_2_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Km BTS3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Streckenkilometer der dritten BTS, die an die Bereichsgrenze (RBC-Wechsel) angrenzt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Km BTS3</em>' containment reference.
	 * @see #setKmBTS3(Km_BTS_3_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup_KmBTS3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Km_BTS_3'"
	 * @generated
	 */
	Km_BTS_3_TypeClass getKmBTS3();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup#getKmBTS3 <em>Km BTS3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Km BTS3</em>' containment reference.
	 * @see #getKmBTS3()
	 * @generated
	 */
	void setKmBTS3(Km_BTS_3_TypeClass value);

} // Bgrenze_RBC_Wechsel_BTS_Kette_AttributeGroup
