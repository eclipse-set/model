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
 * A representation of the model object '<em><b>DP Typ GGNT Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Typ_GGNT_AttributeGroup#getTCDPTypGNT <em>TCDP Typ GNT</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Typ_GGNT_AttributeGroup()
 * @model extendedMetaData="name='CDP_Typ_GGNT' kind='elementOnly'"
 * @generated
 */
public interface DP_Typ_GGNT_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>TCDP Typ GNT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Durch das Anwendungssystem GNT definierter Datenpunkttyp.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TCDP Typ GNT</em>' containment reference.
	 * @see #setTCDPTypGNT(DP_Typ_GNT_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Typ_GGNT_AttributeGroup_TCDPTypGNT()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TCDP_Typ_GNT'"
	 * @generated
	 */
	DP_Typ_GNT_TypeClass getTCDPTypGNT();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Typ_GGNT_AttributeGroup#getTCDPTypGNT <em>TCDP Typ GNT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TCDP Typ GNT</em>' containment reference.
	 * @see #getTCDPTypGNT()
	 * @generated
	 */
	void setTCDPTypGNT(DP_Typ_GNT_TypeClass value);

} // DP_Typ_GGNT_AttributeGroup
