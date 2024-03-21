/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Weichen_und_Gleissperren;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entgleisungsschuh Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Entgleisungsschuh_AttributeGroup#getAuswurfrichtung <em>Auswurfrichtung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Entgleisungsschuh_AttributeGroup#getGleissperrensignal <em>Gleissperrensignal</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Entgleisungsschuh_AttributeGroup#getSchutzschiene <em>Schutzschiene</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getEntgleisungsschuh_AttributeGroup()
 * @model extendedMetaData="name='CEntgleisungsschuh' kind='elementOnly'"
 * @generated
 */
public interface Entgleisungsschuh_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Auswurfrichtung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entgleisungsrichtung eines Fahrzeugs, das über den Entgleisungsschuh fährt. Die Entgleisungsrichtung ist in Bewegungsrichtung des Fahrzeuges auf den Entgleisungsschuhs zu sehen und ist nicht auf die Wirkrichtung der topologischen Kante bezogen. Da das zugehörige Objekt (W_Kr_Gsp_Komponente) als Punktobjekt auf eine Fahrschiene des Gleises (Topologiekante) verortet ist, kann daraus ebenfalls die Auswurfrichtung ermittelt werden. Achtung: Die Angabe ist redundant zu den Angaben im Punktobjekt bezüglich der Attribute Seitliche Lage und Wirkrichtung und soll daher zukünftig entfallen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auswurfrichtung</em>' containment reference.
	 * @see #setAuswurfrichtung(Auswurfrichtung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getEntgleisungsschuh_AttributeGroup_Auswurfrichtung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Auswurfrichtung'"
	 * @generated
	 */
	Auswurfrichtung_TypeClass getAuswurfrichtung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Entgleisungsschuh_AttributeGroup#getAuswurfrichtung <em>Auswurfrichtung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auswurfrichtung</em>' containment reference.
	 * @see #getAuswurfrichtung()
	 * @generated
	 */
	void setAuswurfrichtung(Auswurfrichtung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Gleissperrensignal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob und in welcher Ausprägung ein Gleissperrensignal vorzusehen ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gleissperrensignal</em>' containment reference.
	 * @see #setGleissperrensignal(Gleissperrensignal_TypeClass)
	 * @see org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getEntgleisungsschuh_AttributeGroup_Gleissperrensignal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Gleissperrensignal'"
	 * @generated
	 */
	Gleissperrensignal_TypeClass getGleissperrensignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Entgleisungsschuh_AttributeGroup#getGleissperrensignal <em>Gleissperrensignal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gleissperrensignal</em>' containment reference.
	 * @see #getGleissperrensignal()
	 * @generated
	 */
	void setGleissperrensignal(Gleissperrensignal_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Schutzschiene</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Für die Gleissperre ist eine Schutzschiene vorgesehen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schutzschiene</em>' containment reference.
	 * @see #setSchutzschiene(Schutzschiene_TypeClass)
	 * @see org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getEntgleisungsschuh_AttributeGroup_Schutzschiene()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Schutzschiene'"
	 * @generated
	 */
	Schutzschiene_TypeClass getSchutzschiene();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Entgleisungsschuh_AttributeGroup#getSchutzschiene <em>Schutzschiene</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schutzschiene</em>' containment reference.
	 * @see #getSchutzschiene()
	 * @generated
	 */
	void setSchutzschiene(Schutzschiene_TypeClass value);

} // Entgleisungsschuh_AttributeGroup
