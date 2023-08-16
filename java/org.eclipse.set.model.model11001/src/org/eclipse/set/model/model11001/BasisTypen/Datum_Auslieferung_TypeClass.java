/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.BasisTypen;

import javax.xml.datatype.XMLGregorianCalendar;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datum Auslieferung Type Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.BasisTypen.Datum_Auslieferung_TypeClass#getWert <em>Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.BasisTypen.BasisTypenPackage#getDatum_Auslieferung_TypeClass()
 * @model extendedMetaData="name='TCDatum_Auslieferung' kind='elementOnly'"
 * @generated
 */
public interface Datum_Auslieferung_TypeClass extends BasisAttribut_AttributeGroup {
	/**
	 * Returns the value of the '<em><b>Wert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #setWert(XMLGregorianCalendar)
	 * @see org.eclipse.set.model.model11001.BasisTypen.BasisTypenPackage#getDatum_Auslieferung_TypeClass_Wert()
	 * @model unsettable="true" dataType="org.eclipse.set.model.model11001.BasisTypen.Datum_Auslieferung_Type" required="true"
	 *        extendedMetaData="kind='element' name='Wert'"
	 * @generated
	 */
	XMLGregorianCalendar getWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.BasisTypen.Datum_Auslieferung_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wert</em>' attribute.
	 * @see #isSetWert()
	 * @see #unsetWert()
	 * @see #getWert()
	 * @generated
	 */
	void setWert(XMLGregorianCalendar value);

	/**
	 * Unsets the value of the '{@link org.eclipse.set.model.model11001.BasisTypen.Datum_Auslieferung_TypeClass#getWert <em>Wert</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWert()
	 * @see #getWert()
	 * @see #setWert(XMLGregorianCalendar)
	 * @generated
	 */
	void unsetWert();

	/**
	 * Returns whether the value of the '{@link org.eclipse.set.model.model11001.BasisTypen.Datum_Auslieferung_TypeClass#getWert <em>Wert</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Wert</em>' attribute is set.
	 * @see #unsetWert()
	 * @see #getWert()
	 * @see #setWert(XMLGregorianCalendar)
	 * @generated
	 */
	boolean isSetWert();

} // Datum_Auslieferung_TypeClass
