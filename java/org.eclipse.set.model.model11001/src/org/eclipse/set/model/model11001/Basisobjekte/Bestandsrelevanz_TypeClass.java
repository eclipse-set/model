/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Basisobjekte;

import org.eclipse.set.model.model11001.BasisTypen.BasisAttribut_AttributeGroup;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bestandsrelevanz Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Basisobjekte.Bestandsrelevanz_TypeClass#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Basisobjekte.BasisobjektePackage#getBestandsrelevanz_TypeClass()
 * @model extendedMetaData="name='TCBestandsrelevanz' kind='elementOnly'"
 * @generated
 */
public interface Bestandsrelevanz_TypeClass extends BasisAttribut_AttributeGroup {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #setWert(ENUMBestandsrelevanz)
	 * @see org.eclipse.set.model.model11001.Basisobjekte.BasisobjektePackage#getBestandsrelevanz_TypeClass_Wert()
	 * @model unsettable="true" dataType="org.eclipse.set.model.model11001.Basisobjekte.ENUMBestandsrelevanzObject" required="true"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	ENUMBestandsrelevanz getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Basisobjekte.Bestandsrelevanz_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #getWert()
	 * @generated
	 */
	void setWert(ENUMBestandsrelevanz value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.model.model11001.Basisobjekte.Bestandsrelevanz_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMBestandsrelevanz)
	 * @generated
	 */
	void unsetWert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.model.model11001.Basisobjekte.Bestandsrelevanz_TypeClass#getWert <em>Wert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wert</em>' attribute is set.
	 * @see #unsetWert()
	 * @see #getWert()
	 * @see #setWert(ENUMBestandsrelevanz)
	 * @generated
	 */
	boolean isSetWert();

} // Bestandsrelevanz_TypeClass
