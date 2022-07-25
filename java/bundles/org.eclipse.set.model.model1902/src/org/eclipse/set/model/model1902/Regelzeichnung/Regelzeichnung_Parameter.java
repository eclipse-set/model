/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Regelzeichnung;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_Regelzeichnung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regelzeichnung Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Einer Regelzeichnung werden durch dieses Objekt weitere Parameter zugeordnet. Für eine Regelzeichnung können beliebig viele Parameter entsprechend der konkreten Anwendung angegeben werden. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Regelzeichnung.Regelzeichnung_Parameter#getIDRegelzeichnung <em>ID Regelzeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Regelzeichnung.Regelzeichnung_Parameter#getRegelzeichnungParameterAllg <em>Regelzeichnung Parameter Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Regelzeichnung.RegelzeichnungPackage#getRegelzeichnung_Parameter()
 * @model extendedMetaData="name='CRegelzeichnung_Parameter' kind='elementOnly'"
 * @generated
 */
public interface Regelzeichnung_Parameter extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Regelzeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuweisung des Parameters zur Regelzeichnung. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Regelzeichnung</em>' containment reference.
	 * @see #setIDRegelzeichnung(ID_Regelzeichnung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Regelzeichnung.RegelzeichnungPackage#getRegelzeichnung_Parameter_IDRegelzeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Regelzeichnung'"
	 * @generated
	 */
	ID_Regelzeichnung_TypeClass getIDRegelzeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Regelzeichnung.Regelzeichnung_Parameter#getIDRegelzeichnung <em>ID Regelzeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Regelzeichnung</em>' containment reference.
	 * @see #getIDRegelzeichnung()
	 * @generated
	 */
	void setIDRegelzeichnung(ID_Regelzeichnung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Regelzeichnung Parameter Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regelzeichnung Parameter Allg</em>' containment reference.
	 * @see #setRegelzeichnungParameterAllg(Regelzeichnung_Parameter_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Regelzeichnung.RegelzeichnungPackage#getRegelzeichnung_Parameter_RegelzeichnungParameterAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Regelzeichnung_Parameter_Allg'"
	 * @generated
	 */
	Regelzeichnung_Parameter_Allg_AttributeGroup getRegelzeichnungParameterAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Regelzeichnung.Regelzeichnung_Parameter#getRegelzeichnungParameterAllg <em>Regelzeichnung Parameter Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regelzeichnung Parameter Allg</em>' containment reference.
	 * @see #getRegelzeichnungParameterAllg()
	 * @generated
	 */
	void setRegelzeichnungParameterAllg(Regelzeichnung_Parameter_Allg_AttributeGroup value);

} // Regelzeichnung_Parameter
