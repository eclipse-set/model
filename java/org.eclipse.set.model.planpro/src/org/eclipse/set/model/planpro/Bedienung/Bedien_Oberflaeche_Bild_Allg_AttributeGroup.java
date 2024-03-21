/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bedienung;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedien Oberflaeche Bild Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Bild_Allg_AttributeGroup#getOberflaecheBildart <em>Oberflaeche Bildart</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Bild_Allg_AttributeGroup#getOberflaecheZustaendigkeit <em>Oberflaeche Zustaendigkeit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Bedienung.BedienungPackage#getBedien_Oberflaeche_Bild_Allg_AttributeGroup()
 * @model extendedMetaData="name='CBedien_Oberflaeche_Bild_Allg' kind='elementOnly'"
 * @generated
 */
public interface Bedien_Oberflaeche_Bild_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Oberflaeche Bildart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bildart Berü oder Lupe. Mit dem Attribut Bildart wird zwischen Berü und Lupe unterschieden. Eine Beschreibung des Zuständigkeitsbereiches der einzelnen Bilder erfolgt im Rahmen eines anderen Attributs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Oberflaeche Bildart</em>' containment reference.
	 * @see #setOberflaecheBildart(Oberflaeche_Bildart_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bedienung.BedienungPackage#getBedien_Oberflaeche_Bild_Allg_AttributeGroup_OberflaecheBildart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Oberflaeche_Bildart'"
	 * @generated
	 */
	Oberflaeche_Bildart_TypeClass getOberflaecheBildart();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Bild_Allg_AttributeGroup#getOberflaecheBildart <em>Oberflaeche Bildart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oberflaeche Bildart</em>' containment reference.
	 * @see #getOberflaecheBildart()
	 * @generated
	 */
	void setOberflaecheBildart(Oberflaeche_Bildart_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Oberflaeche Zustaendigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verbale Beschreibung, welche zu steuernden Anteile des ESTW auf diesem Oberflächenbild dargestellt werden sollen. Beispiel aus herkömmlicher Planung (Für das Beispiel dieses Attributes ist nur die zweite Spalte der Tabelle relevant, die erste Spalte wird neu durch die Attribute Bildart und Bildbezeichnung ersetzt.): Media:Zustaendigkeit.pdf.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Oberflaeche Zustaendigkeit</em>' containment reference.
	 * @see #setOberflaecheZustaendigkeit(Oberflaeche_Zustaendigkeit_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bedienung.BedienungPackage#getBedien_Oberflaeche_Bild_Allg_AttributeGroup_OberflaecheZustaendigkeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Oberflaeche_Zustaendigkeit'"
	 * @generated
	 */
	Oberflaeche_Zustaendigkeit_TypeClass getOberflaecheZustaendigkeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Bild_Allg_AttributeGroup#getOberflaecheZustaendigkeit <em>Oberflaeche Zustaendigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oberflaeche Zustaendigkeit</em>' containment reference.
	 * @see #getOberflaecheZustaendigkeit()
	 * @generated
	 */
	void setOberflaecheZustaendigkeit(Oberflaeche_Zustaendigkeit_TypeClass value);

} // Bedien_Oberflaeche_Bild_Allg_AttributeGroup
