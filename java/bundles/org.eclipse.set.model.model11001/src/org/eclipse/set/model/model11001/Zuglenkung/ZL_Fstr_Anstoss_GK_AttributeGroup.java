/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Zuglenkung;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZL Fstr Anstoss GK Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss_GK_AttributeGroup#getGK <em>GK</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss_GK_AttributeGroup#getTvGK <em>Tv GK</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Zuglenkung.ZuglenkungPackage#getZL_Fstr_Anstoss_GK_AttributeGroup()
 * @model extendedMetaData="name='CZL_Fstr_Anstoss_GK' kind='elementOnly'"
 * @generated
 */
public interface ZL_Fstr_Anstoss_GK_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>GK</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Geschwindigkeitsklasse, für die die in Tv GK angegebene Geschwindigkeit gilt. Für jede Geschwindigkeitsklasse (GK) ist eine Instanz der Attributgruppe ZL_Fstr_Anstoss_GK anzulegen. Bei der Festlegung von Geschwindigkeitsklassen sind herstellerspezifische Unterschiede zu beachten. DB-Regelwerk 819.0732 14 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GK</em>' containment reference.
	 * @see #setGK(GK_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZuglenkungPackage#getZL_Fstr_Anstoss_GK_AttributeGroup_GK()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GK'"
	 * @generated
	 */
	GK_TypeClass getGK();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss_GK_AttributeGroup#getGK <em>GK</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GK</em>' containment reference.
	 * @see #getGK()
	 * @generated
	 */
	void setGK(GK_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Tv GK</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verzögerungszeit für den ZL-Anstoß. Ist keine tv erforderlich, ist \"0\" anzugeben. DB-Regelwerk 819.0732 8 (3) 819.0732 11 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tv GK</em>' containment reference.
	 * @see #setTvGK(Tv_GK_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZuglenkungPackage#getZL_Fstr_Anstoss_GK_AttributeGroup_TvGK()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Tv_GK'"
	 * @generated
	 */
	Tv_GK_TypeClass getTvGK();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss_GK_AttributeGroup#getTvGK <em>Tv GK</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tv GK</em>' containment reference.
	 * @see #getTvGK()
	 * @generated
	 */
	void setTvGK(Tv_GK_TypeClass value);

} // ZL_Fstr_Anstoss_GK_AttributeGroup
