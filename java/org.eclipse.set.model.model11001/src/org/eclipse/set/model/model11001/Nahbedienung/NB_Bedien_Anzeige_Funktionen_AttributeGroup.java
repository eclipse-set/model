/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Nahbedienung;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NB Bedien Anzeige Funktionen Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Bedien_Anzeige_Funktionen_AttributeGroup#getTasteANF <em>Taste ANF</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Bedien_Anzeige_Funktionen_AttributeGroup#getTasteFGT <em>Taste FGT</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Bedien_Anzeige_Funktionen_AttributeGroup#getTasteWGT <em>Taste WGT</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage#getNB_Bedien_Anzeige_Funktionen_AttributeGroup()
 * @model extendedMetaData="name='CNB_Bedien_Anzeige_Funktionen' kind='elementOnly'"
 * @generated
 */
public interface NB_Bedien_Anzeige_Funktionen_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Taste ANF</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anforderungstaste. Eine Anforderungstaste ist vorzusehen, mit der der örtliche Bediener beim Fahrdienstleiter die Nahbedienung anfordert. DB-Regelwerk Für die Planung von Nahstellbereichen exisitert bei der DB AG kein Regelwerk. Es gibt ein Lastenheft sowie firmenspezifische Projektierungshinweise, die jedoch dem LST-Fachplaner nicht zur Verfügung stehen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Taste ANF</em>' containment reference.
	 * @see #setTasteANF(Taste_ANF_TypeClass)
	 * @see org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage#getNB_Bedien_Anzeige_Funktionen_AttributeGroup_TasteANF()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Taste_ANF'"
	 * @generated
	 */
	Taste_ANF_TypeClass getTasteANF();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Bedien_Anzeige_Funktionen_AttributeGroup#getTasteANF <em>Taste ANF</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taste ANF</em>' containment reference.
	 * @see #getTasteANF()
	 * @generated
	 */
	void setTasteANF(Taste_ANF_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Taste FGT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fertigmeldetaste. Eine Fertigmeldetaste ist vorzusehen, mit der der Bediener dem Fahrdienstleiter den NB fertig meldet, bevor die Nahbedienung zurückgenommen werden kann. DB-Regelwerk Für die Planung von Nahstellbereichen exisitert bei der DB AG kein Regelwerk. Es gibt ein Lastenheft sowie firmenspezifische Projektierungshinweise, die jedoch dem LST-Fachplaner nicht zur Verfügung stehen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Taste FGT</em>' containment reference.
	 * @see #setTasteFGT(Taste_FGT_TypeClass)
	 * @see org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage#getNB_Bedien_Anzeige_Funktionen_AttributeGroup_TasteFGT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Taste_FGT'"
	 * @generated
	 */
	Taste_FGT_TypeClass getTasteFGT();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Bedien_Anzeige_Funktionen_AttributeGroup#getTasteFGT <em>Taste FGT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taste FGT</em>' containment reference.
	 * @see #getTasteFGT()
	 * @generated
	 */
	void setTasteFGT(Taste_FGT_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Taste WGT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Weichengruppentaste. Eine Weichengruppentaste für die Zwei-Tasten-Bedienung ist vorzusehen. Damit können innerhalb eines Nahstellbereiches ferngestellte Weichen, die ans ESTW angebunden sind, während der abgegebenen Nahbedienung durch den örtlichen Bediener umgestellt werden. DB-Regelwerk Für die Planung von Nahstellbereichen exisitert bei der DB AG kein Regelwerk. Es gibt ein Lastenheft sowie firmenspezifische Projektierungshinweise, die jedoch dem LST-Fachplaner nicht zur Verfügung stehen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Taste WGT</em>' containment reference.
	 * @see #setTasteWGT(Taste_WGT_TypeClass)
	 * @see org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage#getNB_Bedien_Anzeige_Funktionen_AttributeGroup_TasteWGT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Taste_WGT'"
	 * @generated
	 */
	Taste_WGT_TypeClass getTasteWGT();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Bedien_Anzeige_Funktionen_AttributeGroup#getTasteWGT <em>Taste WGT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Taste WGT</em>' containment reference.
	 * @see #getTasteWGT()
	 * @generated
	 */
	void setTasteWGT(Taste_WGT_TypeClass value);

} // NB_Bedien_Anzeige_Funktionen_AttributeGroup
