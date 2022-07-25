/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bahnuebergang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUE Anlage Fuss Rad Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Fuss_Rad_AttributeGroup#getFussRadwegArt <em>Fuss Radweg Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Fuss_Rad_AttributeGroup#getFussRadwegSeite <em>Fuss Radweg Seite</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_Fuss_Rad_AttributeGroup()
 * @model extendedMetaData="name='CBUE_Anlage_Fuss_Rad' kind='elementOnly'"
 * @generated
 */
public interface BUE_Anlage_Fuss_Rad_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Fuss Radweg Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art zu berücksichtigender Fuß- und Radwege.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fuss Radweg Art</em>' containment reference.
	 * @see #setFussRadwegArt(Fuss_Radweg_Art_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_Fuss_Rad_AttributeGroup_FussRadwegArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Fuss_Radweg_Art'"
	 * @generated
	 */
	Fuss_Radweg_Art_TypeClass getFussRadwegArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Fuss_Rad_AttributeGroup#getFussRadwegArt <em>Fuss Radweg Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuss Radweg Art</em>' containment reference.
	 * @see #getFussRadwegArt()
	 * @generated
	 */
	void setFussRadwegArt(Fuss_Radweg_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Fuss Radweg Seite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Seite, auf der sich der Fuß- bzw. Radweg befindet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fuss Radweg Seite</em>' containment reference.
	 * @see #setFussRadwegSeite(Fuss_Radweg_Seite_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_Fuss_Rad_AttributeGroup_FussRadwegSeite()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Fuss_Radweg_Seite'"
	 * @generated
	 */
	Fuss_Radweg_Seite_TypeClass getFussRadwegSeite();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Fuss_Rad_AttributeGroup#getFussRadwegSeite <em>Fuss Radweg Seite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuss Radweg Seite</em>' containment reference.
	 * @see #getFussRadwegSeite()
	 * @generated
	 */
	void setFussRadwegSeite(Fuss_Radweg_Seite_TypeClass value);

} // BUE_Anlage_Fuss_Rad_AttributeGroup
