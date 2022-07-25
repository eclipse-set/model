/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ESG Individuelle Merkmale Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ESG_Individuelle_Merkmale_AttributeGroup#getESGIndErlaeuterung <em>ESG Ind Erlaeuterung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ESG_Individuelle_Merkmale_AttributeGroup#getESGIndParameter <em>ESG Ind Parameter</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ESG_Individuelle_Merkmale_AttributeGroup#getESGIndParameterwert <em>ESG Ind Parameterwert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getESG_Individuelle_Merkmale_AttributeGroup()
 * @model extendedMetaData="name='CESG_Individuelle_Merkmale' kind='elementOnly'"
 * @generated
 */
public interface ESG_Individuelle_Merkmale_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ESG Ind Erlaeuterung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Erläuterung des unter ESG_Ind_Parameterwert modifizierten Parameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ESG Ind Erlaeuterung</em>' containment reference.
	 * @see #setESGIndErlaeuterung(ESG_Ind_Erlaeuterung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getESG_Individuelle_Merkmale_AttributeGroup_ESGIndErlaeuterung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ESG_Ind_Erlaeuterung'"
	 * @generated
	 */
	ESG_Ind_Erlaeuterung_TypeClass getESGIndErlaeuterung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ESG_Individuelle_Merkmale_AttributeGroup#getESGIndErlaeuterung <em>ESG Ind Erlaeuterung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ESG Ind Erlaeuterung</em>' containment reference.
	 * @see #getESGIndErlaeuterung()
	 * @generated
	 */
	void setESGIndErlaeuterung(ESG_Ind_Erlaeuterung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ESG Ind Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameter zur Auswahl der laufenden Nummer in der Telegramm-Spezifikation. Nach der Konsolidierung der Spezifikation ist zu prüfen, ob eine Vorgabe über ENUM-Werte oder Einschränkung auf xs:integer [3] möglich ist. Die Vorgabe zulässiger Werte soll im Planungswerkzeug erfolgen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ESG Ind Parameter</em>' containment reference.
	 * @see #setESGIndParameter(ESG_Ind_Parameter_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getESG_Individuelle_Merkmale_AttributeGroup_ESGIndParameter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ESG_Ind_Parameter'"
	 * @generated
	 */
	ESG_Ind_Parameter_TypeClass getESGIndParameter();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ESG_Individuelle_Merkmale_AttributeGroup#getESGIndParameter <em>ESG Ind Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ESG Ind Parameter</em>' containment reference.
	 * @see #getESGIndParameter()
	 * @generated
	 */
	void setESGIndParameter(ESG_Ind_Parameter_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ESG Ind Parameterwert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Wert des unter ESG_Ind_Parameter definierten Parameters.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ESG Ind Parameterwert</em>' containment reference.
	 * @see #setESGIndParameterwert(ESG_Ind_Parameterwert_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getESG_Individuelle_Merkmale_AttributeGroup_ESGIndParameterwert()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ESG_Ind_Parameterwert'"
	 * @generated
	 */
	ESG_Ind_Parameterwert_TypeClass getESGIndParameterwert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ESG_Individuelle_Merkmale_AttributeGroup#getESGIndParameterwert <em>ESG Ind Parameterwert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ESG Ind Parameterwert</em>' containment reference.
	 * @see #getESGIndParameterwert()
	 * @generated
	 */
	void setESGIndParameterwert(ESG_Ind_Parameterwert_TypeClass value);

} // ESG_Individuelle_Merkmale_AttributeGroup
