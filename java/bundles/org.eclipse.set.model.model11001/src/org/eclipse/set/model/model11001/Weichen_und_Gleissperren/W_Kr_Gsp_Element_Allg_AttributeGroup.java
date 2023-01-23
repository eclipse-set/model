/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Weichen_und_Gleissperren;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WKr Gsp Element Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element_Allg_AttributeGroup#getKrKrWSeitenzuordnung <em>Kr Kr WSeitenzuordnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element_Allg_AttributeGroup#getVorzugslageAutomatik <em>Vorzugslage Automatik</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element_Allg_AttributeGroup#getWKrGspStellart <em>WKr Gsp Stellart</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getW_Kr_Gsp_Element_Allg_AttributeGroup()
 * @model extendedMetaData="name='CW_Kr_Gsp_Element_Allg' kind='elementOnly'"
 * @generated
 */
public interface W_Kr_Gsp_Element_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Kr Kr WSeitenzuordnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei unsymmetrischen Kreuzungen (Kr) und Kreuzungsweichen (KrW): Zuordnung der Seite Links/Rechts gemäß Ril 800.0120. Die Angabe wird nachfolgend für das korrekte Zeichnen der Weichendreiecke in maßstäblichen Lageplänen benötigt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kr Kr WSeitenzuordnung</em>' containment reference.
	 * @see #setKrKrWSeitenzuordnung(Kr_KrW_Seitenzuordnung_TypeClass)
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getW_Kr_Gsp_Element_Allg_AttributeGroup_KrKrWSeitenzuordnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Kr_KrW_Seitenzuordnung'"
	 * @generated
	 */
	Kr_KrW_Seitenzuordnung_TypeClass getKrKrWSeitenzuordnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element_Allg_AttributeGroup#getKrKrWSeitenzuordnung <em>Kr Kr WSeitenzuordnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kr Kr WSeitenzuordnung</em>' containment reference.
	 * @see #getKrKrWSeitenzuordnung()
	 * @generated
	 */
	void setKrKrWSeitenzuordnung(Kr_KrW_Seitenzuordnung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Vorzugslage Automatik</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Automatischer Rücklauf des Elements (Weiche oder Gleissperre) in seine Vorzugslage, sobald die Beanspruchung durch eine Fahrstraße endet. Zusätzlich muss auch das Attribut Weiche Vorzugslage oder Gleissperre Vorzugslage angegeben werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vorzugslage Automatik</em>' containment reference.
	 * @see #setVorzugslageAutomatik(Vorzugslage_Automatik_TypeClass)
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getW_Kr_Gsp_Element_Allg_AttributeGroup_VorzugslageAutomatik()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Vorzugslage_Automatik'"
	 * @generated
	 */
	Vorzugslage_Automatik_TypeClass getVorzugslageAutomatik();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element_Allg_AttributeGroup#getVorzugslageAutomatik <em>Vorzugslage Automatik</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vorzugslage Automatik</em>' containment reference.
	 * @see #getVorzugslageAutomatik()
	 * @generated
	 */
	void setVorzugslageAutomatik(Vorzugslage_Automatik_TypeClass value);

	/**
	 * Returns the value of the '<em><b>WKr Gsp Stellart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art, wie das W Kr Gsp Element zu stellen ist. Der ENUM-Wert \"nicht_stellbar\" wird für die Abbildung der Kreuzung verwendet. Für stillgelegte Weichen gemäß Iow wird die befahrbare Weichenlage angegeben. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>WKr Gsp Stellart</em>' containment reference.
	 * @see #setWKrGspStellart(W_Kr_Gsp_Stellart_TypeClass)
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getW_Kr_Gsp_Element_Allg_AttributeGroup_WKrGspStellart()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='W_Kr_Gsp_Stellart'"
	 * @generated
	 */
	W_Kr_Gsp_Stellart_TypeClass getWKrGspStellart();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Gsp_Element_Allg_AttributeGroup#getWKrGspStellart <em>WKr Gsp Stellart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WKr Gsp Stellart</em>' containment reference.
	 * @see #getWKrGspStellart()
	 * @generated
	 */
	void setWKrGspStellart(W_Kr_Gsp_Stellart_TypeClass value);

} // W_Kr_Gsp_Element_Allg_AttributeGroup
