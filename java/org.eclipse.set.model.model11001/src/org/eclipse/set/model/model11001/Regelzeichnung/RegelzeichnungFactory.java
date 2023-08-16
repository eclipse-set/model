/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Regelzeichnung;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Regelzeichnung.RegelzeichnungPackage
 * @generated
 */
public interface RegelzeichnungFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RegelzeichnungFactory eINSTANCE = org.eclipse.set.model.model11001.Regelzeichnung.impl.RegelzeichnungFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bild Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bild Type Class</em>'.
	 * @generated
	 */
	Bild_TypeClass createBild_TypeClass();

	/**
	 * Returns a new object of class '<em>Regelzeichnung</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regelzeichnung</em>'.
	 * @generated
	 */
	Regelzeichnung createRegelzeichnung();

	/**
	 * Returns a new object of class '<em>Regelzeichnung Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regelzeichnung Allg Attribute Group</em>'.
	 * @generated
	 */
	Regelzeichnung_Allg_AttributeGroup createRegelzeichnung_Allg_AttributeGroup();

	/**
	 * Returns a new object of class '<em>Regelzeichnung Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regelzeichnung Parameter</em>'.
	 * @generated
	 */
	Regelzeichnung_Parameter createRegelzeichnung_Parameter();

	/**
	 * Returns a new object of class '<em>Regelzeichnung Parameter Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regelzeichnung Parameter Allg Attribute Group</em>'.
	 * @generated
	 */
	Regelzeichnung_Parameter_Allg_AttributeGroup createRegelzeichnung_Parameter_Allg_AttributeGroup();

	/**
	 * Returns a new object of class '<em>RZ Nummer Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RZ Nummer Type Class</em>'.
	 * @generated
	 */
	RZ_Nummer_TypeClass createRZ_Nummer_TypeClass();

	/**
	 * Returns a new object of class '<em>RZ Parameter Name Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RZ Parameter Name Type Class</em>'.
	 * @generated
	 */
	RZ_Parameter_Name_TypeClass createRZ_Parameter_Name_TypeClass();

	/**
	 * Returns a new object of class '<em>RZ Parameter Wert Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>RZ Parameter Wert Type Class</em>'.
	 * @generated
	 */
	RZ_Parameter_Wert_TypeClass createRZ_Parameter_Wert_TypeClass();

	/**
	 * Returns a new object of class '<em>Titel Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Titel Type Class</em>'.
	 * @generated
	 */
	Titel_TypeClass createTitel_TypeClass();

	/**
	 * Returns a new object of class '<em>Untertitel Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Untertitel Type Class</em>'.
	 * @generated
	 */
	Untertitel_TypeClass createUntertitel_TypeClass();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RegelzeichnungPackage getRegelzeichnungPackage();

} //RegelzeichnungFactory
