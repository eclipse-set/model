/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Ortung;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Zugeinwirkung Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Ortung.Zugeinwirkung_Allg_AttributeGroup#getZugeinwirkungArt <em>Zugeinwirkung Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ortung.Zugeinwirkung_Allg_AttributeGroup#getZugeinwirkungTyp <em>Zugeinwirkung Typ</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Ortung.OrtungPackage#getZugeinwirkung_Allg_AttributeGroup()
 * @model extendedMetaData="name='CZugeinwirkung_Allg' kind='elementOnly'"
 * @generated
 */
public interface Zugeinwirkung_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Zugeinwirkung Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art einer Zugeinwirkung. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen. DB-Regelwerk Planungsdaten: Lageplan, Kreuzungsplan, Gleisfreimeldeplan. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zugeinwirkung Art</em>' containment reference.
	 * @see #setZugeinwirkungArt(Zugeinwirkung_Art_TypeClass)
	 * @see org.eclipse.set.model.model11001.Ortung.OrtungPackage#getZugeinwirkung_Allg_AttributeGroup_ZugeinwirkungArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Zugeinwirkung_Art'"
	 * @generated
	 */
	Zugeinwirkung_Art_TypeClass getZugeinwirkungArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ortung.Zugeinwirkung_Allg_AttributeGroup#getZugeinwirkungArt <em>Zugeinwirkung Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zugeinwirkung Art</em>' containment reference.
	 * @see #getZugeinwirkungArt()
	 * @generated
	 */
	void setZugeinwirkungArt(Zugeinwirkung_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Zugeinwirkung Typ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vollständige Bezeichnung des technischen Typs der Zugeinwirkung. DB-Regelwerk Planungsdaten: Im bisherigen PT1 nicht angegeben. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zugeinwirkung Typ</em>' containment reference.
	 * @see #setZugeinwirkungTyp(Zugeinwirkung_Typ_TypeClass)
	 * @see org.eclipse.set.model.model11001.Ortung.OrtungPackage#getZugeinwirkung_Allg_AttributeGroup_ZugeinwirkungTyp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Zugeinwirkung_Typ'"
	 * @generated
	 */
	Zugeinwirkung_Typ_TypeClass getZugeinwirkungTyp();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ortung.Zugeinwirkung_Allg_AttributeGroup#getZugeinwirkungTyp <em>Zugeinwirkung Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zugeinwirkung Typ</em>' containment reference.
	 * @see #getZugeinwirkungTyp()
	 * @generated
	 */
	void setZugeinwirkungTyp(Zugeinwirkung_Typ_TypeClass value);

} // Zugeinwirkung_Allg_AttributeGroup
