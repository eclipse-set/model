/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Zuglenkung;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_Fstr_Zug_Rangier_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_ZL_Fstr_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_ZL_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZL Fstr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Objekt zur Aufnahme verschiedener Anstosspunkte (mittels ZL Fstr Anstoss) abhängig von den zugehörigen Vorsignalen und den Geschwindigkeitsklassen für die ZL. Über den Verweis zur Fstr Zug Rangier ist die Verbindung zur Fstr des ESTW hergestellt. Für eine Fstr des ESTW kann es mehrere ZL_Fstr geben, umgekehrt gilt dies nicht. DB-Regelwerk 819.0732 6 (1)b In der Tabelle der Zuglenkanstöße entspricht eine Zeile einer ZL-Fahrstraße. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr#getIDZL <em>IDZL</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr#getIDZLFstr <em>IDZL Fstr</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr#getZLFstrAllg <em>ZL Fstr Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Zuglenkung.ZuglenkungPackage#getZL_Fstr()
 * @model extendedMetaData="name='CZL_Fstr' kind='elementOnly'"
 * @generated
 */
public interface ZL_Fstr extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Fstr Zug Rangier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verlinkung, zu welcher Fahrstraße die ZL-Fahrstraße gehört. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr Zug Rangier</em>' containment reference.
	 * @see #setIDFstrZugRangier(ID_Fstr_Zug_Rangier_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zuglenkung.ZuglenkungPackage#getZL_Fstr_IDFstrZugRangier()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Fstr_Zug_Rangier'"
	 * @generated
	 */
	ID_Fstr_Zug_Rangier_TypeClass getIDFstrZugRangier();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr#getIDFstrZugRangier <em>ID Fstr Zug Rangier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fstr Zug Rangier</em>' containment reference.
	 * @see #getIDFstrZugRangier()
	 * @generated
	 */
	void setIDFstrZugRangier(ID_Fstr_Zug_Rangier_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDZL</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die zugehörige ZL, dessen Bestandteil die ZL-Fahrstraße ist. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZL</em>' containment reference.
	 * @see #setIDZL(ID_ZL_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zuglenkung.ZuglenkungPackage#getZL_Fstr_IDZL()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_ZL'"
	 * @generated
	 */
	ID_ZL_TypeClass getIDZL();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr#getIDZL <em>IDZL</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZL</em>' containment reference.
	 * @see #getIDZL()
	 * @generated
	 */
	void setIDZL(ID_ZL_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDZL Fstr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf eine ZL_Fstr, die als Alternative für die ursprünglich vorgesehene ZL_Fstr verwendet werden kann (in Tabelle ZL „D-Weg_Prio“). 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZL Fstr</em>' containment reference.
	 * @see #setIDZLFstr(ID_ZL_Fstr_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zuglenkung.ZuglenkungPackage#getZL_Fstr_IDZLFstr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_ZL_Fstr'"
	 * @generated
	 */
	ID_ZL_Fstr_TypeClass getIDZLFstr();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr#getIDZLFstr <em>IDZL Fstr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZL Fstr</em>' containment reference.
	 * @see #getIDZLFstr()
	 * @generated
	 */
	void setIDZLFstr(ID_ZL_Fstr_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ZL Fstr Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZL Fstr Allg</em>' containment reference.
	 * @see #setZLFstrAllg(ZL_Fstr_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Zuglenkung.ZuglenkungPackage#getZL_Fstr_ZLFstrAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZL_Fstr_Allg'"
	 * @generated
	 */
	ZL_Fstr_Allg_AttributeGroup getZLFstrAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr#getZLFstrAllg <em>ZL Fstr Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZL Fstr Allg</em>' containment reference.
	 * @see #getZLFstrAllg()
	 * @generated
	 */
	void setZLFstrAllg(ZL_Fstr_Allg_AttributeGroup value);

} // ZL_Fstr
