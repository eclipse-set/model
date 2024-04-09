/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.BasisTypen;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ID Bearbeitungsvermerk Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.BasisTypen.ID_Bearbeitungsvermerk_TypeClass#getWert <em>Wert</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.BasisTypen.ID_Bearbeitungsvermerk_TypeClass#getValue <em>Value</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.BasisTypen.ID_Bearbeitungsvermerk_TypeClass#isInvalidReference <em>Invalid Reference</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.BasisTypen.BasisTypenPackage#getID_Bearbeitungsvermerk_TypeClass()
 * @model extendedMetaData="name='TCID_Bearbeitungsvermerk' kind='elementOnly'"
 * @generated
 */
public interface ID_Bearbeitungsvermerk_TypeClass extends EObject {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #setWert(String)
	 * @see org.eclipse.set.model.planpro.BasisTypen.BasisTypenPackage#getID_Bearbeitungsvermerk_TypeClass_Wert()
	 * @model unsettable="true" dataType="org.eclipse.set.model.planpro.BasisTypen.GUID_Type" required="true"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	String getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.BasisTypen.ID_Bearbeitungsvermerk_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #getWert()
	 * @generated
	 */
	void setWert(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.model.planpro.BasisTypen.ID_Bearbeitungsvermerk_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWert()
	 * @see #getWert()
	 * @see #setWert(String)
	 * @generated
	 */
	void unsetWert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.model.planpro.BasisTypen.ID_Bearbeitungsvermerk_TypeClass#getWert <em>Wert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wert</em>' attribute is set.
	 * @see #unsetWert()
	 * @see #getWert()
	 * @see #setWert(String)
	 * @generated
	 */
	boolean isSetWert();

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference.
	 * @see #setValue(Bearbeitungsvermerk)
	 * @see org.eclipse.set.model.planpro.BasisTypen.BasisTypenPackage#getID_Bearbeitungsvermerk_TypeClass_Value()
	 * @model transient="true"
	 * @generated
	 */
	Bearbeitungsvermerk getValue();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.BasisTypen.ID_Bearbeitungsvermerk_TypeClass#getValue <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' reference.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(Bearbeitungsvermerk value);

	/**
	 * Returns the value of the '<em><b>Invalid Reference</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invalid Reference</em>' attribute.
	 * @see #setInvalidReference(boolean)
	 * @see org.eclipse.set.model.planpro.BasisTypen.BasisTypenPackage#getID_Bearbeitungsvermerk_TypeClass_InvalidReference()
	 * @model default="false" dataType="org.eclipse.emf.ecore.xml.type.Boolean" transient="true"
	 * @generated
	 */
	boolean isInvalidReference();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.BasisTypen.ID_Bearbeitungsvermerk_TypeClass#isInvalidReference <em>Invalid Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invalid Reference</em>' attribute.
	 * @see #isInvalidReference()
	 * @generated
	 */
	void setInvalidReference(boolean value);

} // ID_Bearbeitungsvermerk_TypeClass
