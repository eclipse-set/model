/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Flankenschutz;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.planpro.Verweise.ID_Fla_Schutz_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fla Schutz Weitergabe Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_Weitergabe_AttributeGroup#getIDFlaWeitergabeL <em>ID Fla Weitergabe L</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_Weitergabe_AttributeGroup#getIDFlaWeitergabeR <em>ID Fla Weitergabe R</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Flankenschutz.FlankenschutzPackage#getFla_Schutz_Weitergabe_AttributeGroup()
 * @model extendedMetaData="name='CFla_Schutz_Weitergabe' kind='elementOnly'"
 * @generated
 */
public interface Fla_Schutz_Weitergabe_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Fla Weitergabe L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Flankenschutzmaßnahme bei Weitergabe der Flankenschutzanforderung wie bei Fahrt über den linken Strang der Flankenschutztransportweiche. DB-Regelwerk Flankenschutztabelle, Spalten 6 \"Weitergabe über Weiche, Kreuzung\" und 7 \"wie Fahrt über deren Strang\" mit Ausfüllung \"L\" (Links)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fla Weitergabe L</em>' containment reference.
	 * @see #setIDFlaWeitergabeL(ID_Fla_Schutz_TypeClass)
	 * @see org.eclipse.set.model.planpro.Flankenschutz.FlankenschutzPackage#getFla_Schutz_Weitergabe_AttributeGroup_IDFlaWeitergabeL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Fla_Weitergabe_L'"
	 * @generated
	 */
	ID_Fla_Schutz_TypeClass getIDFlaWeitergabeL();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_Weitergabe_AttributeGroup#getIDFlaWeitergabeL <em>ID Fla Weitergabe L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fla Weitergabe L</em>' containment reference.
	 * @see #getIDFlaWeitergabeL()
	 * @generated
	 */
	void setIDFlaWeitergabeL(ID_Fla_Schutz_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Fla Weitergabe R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Flankenschutzmaßnahme bei Weitergabe der Flankenschutzanforderung wie bei Fahrt über den rechten Strang der Flankenschutztransportweiche. DB-Regelwerk Flankenschutztabelle, Spalten 6 \"Weitergabe über Weiche, Kreuzung\" und 7 \"wie Fahrt über deren Strang\" mit Ausfüllung \"R\" (Rechts)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fla Weitergabe R</em>' containment reference.
	 * @see #setIDFlaWeitergabeR(ID_Fla_Schutz_TypeClass)
	 * @see org.eclipse.set.model.planpro.Flankenschutz.FlankenschutzPackage#getFla_Schutz_Weitergabe_AttributeGroup_IDFlaWeitergabeR()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Fla_Weitergabe_R'"
	 * @generated
	 */
	ID_Fla_Schutz_TypeClass getIDFlaWeitergabeR();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_Weitergabe_AttributeGroup#getIDFlaWeitergabeR <em>ID Fla Weitergabe R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fla Weitergabe R</em>' containment reference.
	 * @see #getIDFlaWeitergabeR()
	 * @generated
	 */
	void setIDFlaWeitergabeR(ID_Fla_Schutz_TypeClass value);

} // Fla_Schutz_Weitergabe_AttributeGroup
