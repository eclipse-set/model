/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Weichen_und_Gleissperren;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model1902.Verweise.ID_Element_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GZ Freimeldung RAttribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.GZ_Freimeldung_R_AttributeGroup#getElementLage <em>Element Lage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.GZ_Freimeldung_R_AttributeGroup#getIDElement <em>ID Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getGZ_Freimeldung_R_AttributeGroup()
 * @model extendedMetaData="name='CGZ_Freimeldung_R' kind='elementOnly'"
 * @generated
 */
public interface GZ_Freimeldung_R_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Element Lage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe bei nicht grenzzeichenfreier Freimeldung eines Weichenschenkels, in welcher Lage das angrenzende Fahrwegelement (Gleis oder Weiche) zur Freiprüfung herangezogen wird. Wenn die Grenzzeichenfreiheit durch die Freiprüfung eines angrenzenden Fahrwegelementes erkannt wird, das ein Gleisabschnitt ist, wird Abschnitt, eine Weiche ist, die unabhängig von ihrer Lage herangezogen wird, wird Weiche, eine Weiche ist, die nur in Linkslage herangezogen wird, wird WeicheL, eine Weiche ist, die nur in Rechtslage herangezogen wird, wird WeicheR als ENUM-Wert verwendet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Element Lage</em>' containment reference.
	 * @see #setElementLage(Element_Lage_TypeClass)
	 * @see org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getGZ_Freimeldung_R_AttributeGroup_ElementLage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Element_Lage'"
	 * @generated
	 */
	Element_Lage_TypeClass getElementLage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.GZ_Freimeldung_R_AttributeGroup#getElementLage <em>Element Lage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Lage</em>' containment reference.
	 * @see #getElementLage()
	 * @generated
	 */
	void setElementLage(Element_Lage_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das angrenzende W_Kr_Gsp_Element bzw. den angrenzenden Gleis_Abschnitt, das/der zum Prüfen der Grenzzeichenfreiheit des rechten bzw. linken Weichenschenkels herangezogen wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Element</em>' containment reference.
	 * @see #setIDElement(ID_Element_TypeClass)
	 * @see org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getGZ_Freimeldung_R_AttributeGroup_IDElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Element'"
	 * @generated
	 */
	ID_Element_TypeClass getIDElement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.GZ_Freimeldung_R_AttributeGroup#getIDElement <em>ID Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Element</em>' containment reference.
	 * @see #getIDElement()
	 * @generated
	 */
	void setIDElement(ID_Element_TypeClass value);

} // GZ_Freimeldung_R_AttributeGroup
