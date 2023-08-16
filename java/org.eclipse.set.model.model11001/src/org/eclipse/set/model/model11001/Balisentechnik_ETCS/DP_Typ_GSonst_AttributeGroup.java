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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DP Typ GSonst Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.DP_Typ_GSonst_AttributeGroup#getAnwendungSonst <em>Anwendung Sonst</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.DP_Typ_GSonst_AttributeGroup#getDPTypSonst <em>DP Typ Sonst</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Typ_GSonst_AttributeGroup()
 * @model extendedMetaData="name='CDP_Typ_GSonst' kind='elementOnly'"
 * @generated
 */
public interface DP_Typ_GSonst_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Anwendung Sonst</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung des sonstigen Anwendungssystems.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anwendung Sonst</em>' containment reference.
	 * @see #setAnwendungSonst(Anwendung_Sonst_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Typ_GSonst_AttributeGroup_AnwendungSonst()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Anwendung_Sonst'"
	 * @generated
	 */
	Anwendung_Sonst_TypeClass getAnwendungSonst();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.DP_Typ_GSonst_AttributeGroup#getAnwendungSonst <em>Anwendung Sonst</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anwendung Sonst</em>' containment reference.
	 * @see #getAnwendungSonst()
	 * @generated
	 */
	void setAnwendungSonst(Anwendung_Sonst_TypeClass value);

	/**
	 * Returns the value of the '<em><b>DP Typ Sonst</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Durch sonstige Anwendungssysteme definierter Datenpunkttyp.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DP Typ Sonst</em>' containment reference.
	 * @see #setDPTypSonst(DP_Typ_Sonst_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Typ_GSonst_AttributeGroup_DPTypSonst()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DP_Typ_Sonst'"
	 * @generated
	 */
	DP_Typ_Sonst_TypeClass getDPTypSonst();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.DP_Typ_GSonst_AttributeGroup#getDPTypSonst <em>DP Typ Sonst</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DP Typ Sonst</em>' containment reference.
	 * @see #getDPTypSonst()
	 * @generated
	 */
	void setDPTypSonst(DP_Typ_Sonst_TypeClass value);

} // DP_Typ_GSonst_AttributeGroup
