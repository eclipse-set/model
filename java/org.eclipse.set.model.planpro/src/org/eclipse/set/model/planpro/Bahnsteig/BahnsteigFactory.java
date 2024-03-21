/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnsteig;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.planpro.Bahnsteig.BahnsteigPackage
 * @generated
 */
public interface BahnsteigFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BahnsteigFactory eINSTANCE = org.eclipse.set.model.planpro.Bahnsteig.impl.BahnsteigFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bahnsteig Anlage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bahnsteig Anlage</em>'.
	 * @generated
	 */
	Bahnsteig_Anlage createBahnsteig_Anlage();

	/**
	 * Returns a new object of class '<em>Bahnsteig Anlage Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bahnsteig Anlage Bezeichnung Attribute Group</em>'.
	 * @generated
	 */
	Bahnsteig_Anlage_Bezeichnung_AttributeGroup createBahnsteig_Anlage_Bezeichnung_AttributeGroup();

	/**
	 * Returns a new object of class '<em>Bahnsteig Dach</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bahnsteig Dach</em>'.
	 * @generated
	 */
	Bahnsteig_Dach createBahnsteig_Dach();

	/**
	 * Returns a new object of class '<em>Bahnsteig Kante</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bahnsteig Kante</em>'.
	 * @generated
	 */
	Bahnsteig_Kante createBahnsteig_Kante();

	/**
	 * Returns a new object of class '<em>Bahnsteig Kante Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bahnsteig Kante Allg Attribute Group</em>'.
	 * @generated
	 */
	Bahnsteig_Kante_Allg_AttributeGroup createBahnsteig_Kante_Allg_AttributeGroup();

	/**
	 * Returns a new object of class '<em>Bahnsteig Kante Bezeichnung Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bahnsteig Kante Bezeichnung Attribute Group</em>'.
	 * @generated
	 */
	Bahnsteig_Kante_Bezeichnung_AttributeGroup createBahnsteig_Kante_Bezeichnung_AttributeGroup();

	/**
	 * Returns a new object of class '<em>Bahnsteig Zugang</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bahnsteig Zugang</em>'.
	 * @generated
	 */
	Bahnsteig_Zugang createBahnsteig_Zugang();

	/**
	 * Returns a new object of class '<em>Bahnsteig Zugang Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bahnsteig Zugang Allg Attribute Group</em>'.
	 * @generated
	 */
	Bahnsteig_Zugang_Allg_AttributeGroup createBahnsteig_Zugang_Allg_AttributeGroup();

	/**
	 * Returns a new object of class '<em>Bahnsteig Zugang Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bahnsteig Zugang Art Type Class</em>'.
	 * @generated
	 */
	Bahnsteig_Zugang_Art_TypeClass createBahnsteig_Zugang_Art_TypeClass();

	/**
	 * Returns a new object of class '<em>Bezeichnung Bahnsteig Anlage Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bezeichnung Bahnsteig Anlage Type Class</em>'.
	 * @generated
	 */
	Bezeichnung_Bahnsteig_Anlage_TypeClass createBezeichnung_Bahnsteig_Anlage_TypeClass();

	/**
	 * Returns a new object of class '<em>Bezeichnung Bahnsteig Kante Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bezeichnung Bahnsteig Kante Type Class</em>'.
	 * @generated
	 */
	Bezeichnung_Bahnsteig_Kante_TypeClass createBezeichnung_Bahnsteig_Kante_TypeClass();

	/**
	 * Returns a new object of class '<em>Hauptzugang Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hauptzugang Type Class</em>'.
	 * @generated
	 */
	Hauptzugang_TypeClass createHauptzugang_TypeClass();

	/**
	 * Returns a new object of class '<em>Lage Zum Gleis Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lage Zum Gleis Type Class</em>'.
	 * @generated
	 */
	Lage_Zum_Gleis_TypeClass createLage_Zum_Gleis_TypeClass();

	/**
	 * Returns a new object of class '<em>Systemhoehe Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Systemhoehe Type Class</em>'.
	 * @generated
	 */
	Systemhoehe_TypeClass createSystemhoehe_TypeClass();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	BahnsteigPackage getBahnsteigPackage();

} //BahnsteigFactory
