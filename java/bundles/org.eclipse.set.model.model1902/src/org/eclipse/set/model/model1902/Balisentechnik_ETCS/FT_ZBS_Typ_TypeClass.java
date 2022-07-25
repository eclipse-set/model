/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS;

import org.eclipse.set.model.model1902.BasisTypen.BasisAttribut_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FT ZBS Typ Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Typ_TypeClass#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ZBS_Typ_TypeClass()
 * @model extendedMetaData="name='TCFT_ZBS_Typ' kind='elementOnly'"
 * @generated
 */
public interface FT_ZBS_Typ_TypeClass extends BasisAttribut_AttributeGroup {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #setWert(ENUMFTZBSTyp)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ZBS_Typ_TypeClass_Wert()
	 * @model unsettable="true" dataType="org.eclipse.set.model.model1902.Balisentechnik_ETCS.ENUMFTZBSTypObject" required="true"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	ENUMFTZBSTyp getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Typ_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #getWert()
	 * @generated
	 */
	void setWert(ENUMFTZBSTyp value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Typ_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMFTZBSTyp)
	 * @generated
	 */
	void unsetWert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Typ_TypeClass#getWert <em>Wert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wert</em>' attribute is set.
	 * @see #unsetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMFTZBSTyp)
	 * @generated
	 */
	boolean isSetWert();

} // FT_ZBS_Typ_TypeClass
