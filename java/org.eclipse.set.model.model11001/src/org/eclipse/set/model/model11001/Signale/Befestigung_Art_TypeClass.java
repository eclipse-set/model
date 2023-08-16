/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Signale;

import org.eclipse.set.model.model11001.BasisTypen.BasisAttribut_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Befestigung Art Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Signale.Befestigung_Art_TypeClass#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Signale.SignalePackage#getBefestigung_Art_TypeClass()
 * @model extendedMetaData="name='TCBefestigung_Art' kind='elementOnly'"
 * @generated
 */
public interface Befestigung_Art_TypeClass extends BasisAttribut_AttributeGroup {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #setWert(ENUMBefestigungArt)
	 * @see org.eclipse.set.model.model11001.Signale.SignalePackage#getBefestigung_Art_TypeClass_Wert()
	 * @model unsettable="true" dataType="org.eclipse.set.model.model11001.Signale.ENUMBefestigungArtObject" required="true"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	ENUMBefestigungArt getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Signale.Befestigung_Art_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #getWert()
	 * @generated
	 */
	void setWert(ENUMBefestigungArt value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.model.model11001.Signale.Befestigung_Art_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMBefestigungArt)
	 * @generated
	 */
	void unsetWert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.model.model11001.Signale.Befestigung_Art_TypeClass#getWert <em>Wert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wert</em>' attribute is set.
	 * @see #unsetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMBefestigungArt)
	 * @generated
	 */
	boolean isSetWert();

} // Befestigung_Art_TypeClass
