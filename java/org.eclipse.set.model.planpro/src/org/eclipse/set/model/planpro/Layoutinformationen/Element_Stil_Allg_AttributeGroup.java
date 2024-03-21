/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Layoutinformationen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Stil Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil_Allg_AttributeGroup#getFuellung <em>Fuellung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil_Allg_AttributeGroup#getLinieArt <em>Linie Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil_Allg_AttributeGroup#getLinieFarbwert <em>Linie Farbwert</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil_Allg_AttributeGroup#getLinieSubart <em>Linie Subart</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage#getElement_Stil_Allg_AttributeGroup()
 * @model extendedMetaData="name='CElement_Stil_Allg' kind='elementOnly'"
 * @generated
 */
public interface Element_Stil_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Fuellung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Füllung der mittels Darstellung_Polygonzug beschriebenen Fläche. Ist keine Füllung vorgesehen, entfällt das Attribut.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fuellung</em>' containment reference.
	 * @see #setFuellung(Fuellung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage#getElement_Stil_Allg_AttributeGroup_Fuellung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fuellung'"
	 * @generated
	 */
	Fuellung_TypeClass getFuellung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil_Allg_AttributeGroup#getFuellung <em>Fuellung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuellung</em>' containment reference.
	 * @see #getFuellung()
	 * @generated
	 */
	void setFuellung(Fuellung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Linie Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art bzw. Ausführungform der Linie gemäß DIN EN ISO 128-2.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linie Art</em>' containment reference.
	 * @see #setLinieArt(Linie_Art_TypeClass)
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage#getElement_Stil_Allg_AttributeGroup_LinieArt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Linie_Art'"
	 * @generated
	 */
	Linie_Art_TypeClass getLinieArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil_Allg_AttributeGroup#getLinieArt <em>Linie Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linie Art</em>' containment reference.
	 * @see #getLinieArt()
	 * @generated
	 */
	void setLinieArt(Linie_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Linie Farbwert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RGB-Kodierung (hexadezimal) für den Farbton, in dem die Linie dargestellt werden soll.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linie Farbwert</em>' containment reference.
	 * @see #setLinieFarbwert(Linie_Farbwert_TypeClass)
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage#getElement_Stil_Allg_AttributeGroup_LinieFarbwert()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Linie_Farbwert'"
	 * @generated
	 */
	Linie_Farbwert_TypeClass getLinieFarbwert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil_Allg_AttributeGroup#getLinieFarbwert <em>Linie Farbwert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linie Farbwert</em>' containment reference.
	 * @see #getLinieFarbwert()
	 * @generated
	 */
	void setLinieFarbwert(Linie_Farbwert_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Linie Subart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Subart bzw. Breite der Linie gemäß DIN EN ISO 128-2.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Linie Subart</em>' containment reference.
	 * @see #setLinieSubart(Linie_Subart_TypeClass)
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage#getElement_Stil_Allg_AttributeGroup_LinieSubart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Linie_Subart'"
	 * @generated
	 */
	Linie_Subart_TypeClass getLinieSubart();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil_Allg_AttributeGroup#getLinieSubart <em>Linie Subart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Linie Subart</em>' containment reference.
	 * @see #getLinieSubart()
	 * @generated
	 */
	void setLinieSubart(Linie_Subart_TypeClass value);

} // Element_Stil_Allg_AttributeGroup
