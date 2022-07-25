/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Signale;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model1902.Verweise.ID_Signal_Gleisbezechnung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Fstr Aus Inselgleis Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal_Fstr_Aus_Inselgleis_AttributeGroup#getIDRaFahrtGleichzeitigVerbot <em>ID Ra Fahrt Gleichzeitig Verbot</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal_Fstr_Aus_Inselgleis_AttributeGroup#getIDZgFahrtGleichzeitigVerbot <em>ID Zg Fahrt Gleichzeitig Verbot</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Fstr_Aus_Inselgleis_AttributeGroup()
 * @model extendedMetaData="name='CSignal_Fstr_Aus_Inselgleis' kind='elementOnly'"
 * @generated
 */
public interface Signal_Fstr_Aus_Inselgleis_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Ra Fahrt Gleichzeitig Verbot</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Verweise.ID_Signal_Gleisbezechnung_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Gleis_Bezeichnung des Inselgleises, von dem aus eine gleichzeitige Rangierfahrt aus dem Inselgleis untersagt ist. Das Attribut ist für beide Signale erforderlich, die das Inselgleis begrenzen. Bei Inselgleisen mit mehreren Signalen (z. B. bei Kurz-Lang-Einfahrten) sind alle relevanten Gleisbezeichnungen anzugeben. DB-Regelwerk Im bisherigen PT1 ohne eindeutige Darstellung. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Ra Fahrt Gleichzeitig Verbot</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Fstr_Aus_Inselgleis_AttributeGroup_IDRaFahrtGleichzeitigVerbot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_RaFahrt_Gleichzeitig_Verbot'"
	 * @generated
	 */
	EList<ID_Signal_Gleisbezechnung_TypeClass> getIDRaFahrtGleichzeitigVerbot();

	/**
	 * Returns the value of the '<em><b>ID Zg Fahrt Gleichzeitig Verbot</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Verweise.ID_Signal_Gleisbezechnung_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Gleis_Bezeichnung des Inselgleises, von dem aus eine gleichzeitige Zugfahrt aus dem Inselgleis untersagt ist. Das Attribut ist für beide Signale erforderlich, die das Inselgleis begrenzen. Bei Inselgleisen mit mehreren Signalen (z. B. bei Kurz-Lang-Einfahrten) sind alle relevanten Gleisbezeichnungen anzugeben. DB-Regelwerk Im bisherigen PT1 ohne eindeutige Darstellung. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Zg Fahrt Gleichzeitig Verbot</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Fstr_Aus_Inselgleis_AttributeGroup_IDZgFahrtGleichzeitigVerbot()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_ZgFahrt_Gleichzeitig_Verbot'"
	 * @generated
	 */
	EList<ID_Signal_Gleisbezechnung_TypeClass> getIDZgFahrtGleichzeitigVerbot();

} // Signal_Fstr_Aus_Inselgleis_AttributeGroup
