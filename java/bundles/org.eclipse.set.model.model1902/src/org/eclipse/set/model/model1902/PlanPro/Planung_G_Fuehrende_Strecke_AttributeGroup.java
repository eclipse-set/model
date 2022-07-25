/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.PlanPro;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planung GFuehrende Strecke Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Planung_G_Fuehrende_Strecke_AttributeGroup#getStreckeAbschnitt <em>Strecke Abschnitt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Planung_G_Fuehrende_Strecke_AttributeGroup#getStreckeKm <em>Strecke Km</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Planung_G_Fuehrende_Strecke_AttributeGroup#getStreckeNummer <em>Strecke Nummer</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getPlanung_G_Fuehrende_Strecke_AttributeGroup()
 * @model extendedMetaData="name='CPlanung_G_Fuehrende_Strecke' kind='elementOnly'"
 * @generated
 */
public interface Planung_G_Fuehrende_Strecke_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Strecke Abschnitt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abschnitt der beplanten Strecke, z. B. \"km 123,120 - km 140,450\".\r\n\r\nDB-Regelwerk\r\n\rBisher keine eindeutige Abbildung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strecke Abschnitt</em>' containment reference.
	 * @see #setStreckeAbschnitt(Strecke_Abschnitt_TypeClass)
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getPlanung_G_Fuehrende_Strecke_AttributeGroup_StreckeAbschnitt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Strecke_Abschnitt'"
	 * @generated
	 */
	Strecke_Abschnitt_TypeClass getStreckeAbschnitt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PlanPro.Planung_G_Fuehrende_Strecke_AttributeGroup#getStreckeAbschnitt <em>Strecke Abschnitt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strecke Abschnitt</em>' containment reference.
	 * @see #getStreckeAbschnitt()
	 * @generated
	 */
	void setStreckeAbschnitt(Strecke_Abschnitt_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Strecke Km</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Orientierungskilometer (Schwerpunkt) der beplanten führenden Strecke, z. B. Mitte des größten im Planungsbereich liegenden Bahnhofs.\r\n \r\nDB-Regelwerk\r\n\rBisher keine eindeutige Abbildung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strecke Km</em>' containment reference.
	 * @see #setStreckeKm(Strecke_Km_TypeClass)
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getPlanung_G_Fuehrende_Strecke_AttributeGroup_StreckeKm()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Strecke_Km'"
	 * @generated
	 */
	Strecke_Km_TypeClass getStreckeKm();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PlanPro.Planung_G_Fuehrende_Strecke_AttributeGroup#getStreckeKm <em>Strecke Km</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strecke Km</em>' containment reference.
	 * @see #getStreckeKm()
	 * @generated
	 */
	void setStreckeKm(Strecke_Km_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Strecke Nummer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Streckennummer der beplanten Strecke.\n\nDB-Regelwerk\nBisher keine eindeutige Abbildung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strecke Nummer</em>' containment reference.
	 * @see #setStreckeNummer(Strecke_Nummer_TypeClass)
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getPlanung_G_Fuehrende_Strecke_AttributeGroup_StreckeNummer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Strecke_Nummer'"
	 * @generated
	 */
	Strecke_Nummer_TypeClass getStreckeNummer();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PlanPro.Planung_G_Fuehrende_Strecke_AttributeGroup#getStreckeNummer <em>Strecke Nummer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strecke Nummer</em>' containment reference.
	 * @see #getStreckeNummer()
	 * @generated
	 */
	void setStreckeNummer(Strecke_Nummer_TypeClass value);

} // Planung_G_Fuehrende_Strecke_AttributeGroup
