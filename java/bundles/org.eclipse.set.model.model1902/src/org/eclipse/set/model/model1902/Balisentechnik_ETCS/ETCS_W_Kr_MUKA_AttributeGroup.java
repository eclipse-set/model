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
 * A representation of the model object '<em><b>ETCS WKr MUKA Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_W_Kr_MUKA_AttributeGroup#getGruppenID <em>Gruppen ID</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_W_Kr_MUKA_AttributeGroup#getUntergruppenID <em>Untergruppen ID</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_W_Kr_MUKA_AttributeGroup()
 * @model extendedMetaData="name='CETCS_W_Kr_MUKA' kind='elementOnly'"
 * @generated
 */
public interface ETCS_W_Kr_MUKA_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Gruppen ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung zu einer Gruppe, um im Falle einer Rechnerstörung im ESTW dem RBC die gestörten Elemente einfach übertragen zu können. Siehe Ril 819.1344 4 (36). Die Angabe entfällt ggf. zu einem späteren Zeitpunkt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gruppen ID</em>' containment reference.
	 * @see #setGruppenID(Gruppen_ID_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_W_Kr_MUKA_AttributeGroup_GruppenID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Gruppen_ID'"
	 * @generated
	 */
	Gruppen_ID_TypeClass getGruppenID();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_W_Kr_MUKA_AttributeGroup#getGruppenID <em>Gruppen ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gruppen ID</em>' containment reference.
	 * @see #getGruppenID()
	 * @generated
	 */
	void setGruppenID(Gruppen_ID_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Untergruppen ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung zu einer Untergruppe, um im Falle einer Rechnerstörung im ESTW dem RBC die gestörten Elemente einfach übertragen zu können. Siehe Ril 819.1344 4 (36). Die Angabe entfällt ggf. zu einem späteren Zeitpunkt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Untergruppen ID</em>' containment reference.
	 * @see #setUntergruppenID(Untergruppen_ID_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_W_Kr_MUKA_AttributeGroup_UntergruppenID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Untergruppen_ID'"
	 * @generated
	 */
	Untergruppen_ID_TypeClass getUntergruppenID();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_W_Kr_MUKA_AttributeGroup#getUntergruppenID <em>Untergruppen ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Untergruppen ID</em>' containment reference.
	 * @see #getUntergruppenID()
	 * @generated
	 */
	void setUntergruppenID(Untergruppen_ID_TypeClass value);

} // ETCS_W_Kr_MUKA_AttributeGroup
