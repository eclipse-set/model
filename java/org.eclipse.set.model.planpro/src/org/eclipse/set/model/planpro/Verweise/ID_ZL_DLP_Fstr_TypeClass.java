/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Verweise;

import org.eclipse.set.model.planpro.BasisTypen.Zeiger_TypeClass;
import org.eclipse.set.model.planpro.Zuglenkung.ZL_DLP_Fstr;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ID ZL DLP Fstr Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Verweise.ID_ZL_DLP_Fstr_TypeClass#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Verweise.ID_ZL_DLP_Fstr_TypeClass#isInvalidReference <em>Invalid Reference</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Verweise.VerweisePackage#getID_ZL_DLP_Fstr_TypeClass()
 * @model extendedMetaData="name='TCID_ZL_DLP_Fstr' kind='elementOnly'"
 * @generated
 */
public interface ID_ZL_DLP_Fstr_TypeClass extends Zeiger_TypeClass {

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(ZL_DLP_Fstr)
	 * @see org.eclipse.set.model.planpro.Verweise.VerweisePackage#getID_ZL_DLP_Fstr_TypeClass_Value()
	 * @model transient="true"
	 * @generated
	 */
	ZL_DLP_Fstr getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Verweise.ID_ZL_DLP_Fstr_TypeClass#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(ZL_DLP_Fstr value);

	/**
	 * Returns the value of the '<em><b>Invalid Reference</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invalid Reference</em>' attribute.
	 * @see #setInvalidReference(boolean)
	 * @see org.eclipse.set.model.planpro.Verweise.VerweisePackage#getID_ZL_DLP_Fstr_TypeClass_InvalidReference()
	 * @model default="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" transient="true"
	 * @generated
	 */
	boolean isInvalidReference();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Verweise.ID_ZL_DLP_Fstr_TypeClass#isInvalidReference <em>Invalid Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invalid Reference</em>' attribute.
	 * @see #isInvalidReference()
	 * @generated
	 */
	void setInvalidReference(boolean value);
} // ID_ZL_DLP_Fstr_TypeClass
