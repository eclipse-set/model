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
 * A representation of the model object '<em><b>NB Zone Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Allg_AttributeGroup#getNBVerhaeltnisBesonders <em>NB Verhaeltnis Besonders</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Allg_AttributeGroup#getRang <em>Rang</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage#getNB_Zone_Allg_AttributeGroup()
 * @model extendedMetaData="name='CNB_Zone_Allg' kind='elementOnly'"
 * @generated
 */
public interface NB_Zone_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>NB Verhaeltnis Besonders</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Besonderes Verhältnis der betrachteten NB-Zone in Bezug auf die unter ID_NB_Zone angegebene. überlappend: zwei Zonen überlappen sich, das heißt einige Elemente gehören sowohl zur einen als auch zur anderen Zone. vereinigt: zwei nebeneinander liegende Zonen werden zu einer großen Zone zusammengeführt. Die Über- bzw. Unterordnung ergibt sich aus dem Verweis ID_NB_Zone. DB-Regelwerk Für die Planung von Nahstellbereichen exisitert bei der DB AG kein Regelwerk. Dieses Planungsdatum findet sich in der Nahbedienungstabelle.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>NB Verhaeltnis Besonders</em>' containment reference.
	 * @see #setNBVerhaeltnisBesonders(NB_Verhaeltnis_Besonders_TypeClass)
	 * @see org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage#getNB_Zone_Allg_AttributeGroup_NBVerhaeltnisBesonders()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='NB_Verhaeltnis_Besonders'"
	 * @generated
	 */
	NB_Verhaeltnis_Besonders_TypeClass getNBVerhaeltnisBesonders();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Allg_AttributeGroup#getNBVerhaeltnisBesonders <em>NB Verhaeltnis Besonders</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>NB Verhaeltnis Besonders</em>' containment reference.
	 * @see #getNBVerhaeltnisBesonders()
	 * @generated
	 */
	void setNBVerhaeltnisBesonders(NB_Verhaeltnis_Besonders_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Rang</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Festlegung, an welcher Stelle die NB_Zone in der Reihe(nfolge) steht. Ist bei mehreren Zonen, die einer \"Haupt\"zone untergeordnet sind, eine Reihenfolge der Zonen für die Ein- bzw. Ausschaltung als notwendig festgelegt worden, muss für jede Zone ein Rang in dieser Reihe festgelegt werden. DB-Regelwerk Für die Planung von Nahstellbereichen existiert bei der DB AG kein Regelwerk. Dieses Planungsdatum findet sich nur im Lastenheft, das dem LST-Fachplaner nicht zur Verfügung steht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rang</em>' containment reference.
	 * @see #setRang(Rang_TypeClass)
	 * @see org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage#getNB_Zone_Allg_AttributeGroup_Rang()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Rang'"
	 * @generated
	 */
	Rang_TypeClass getRang();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Allg_AttributeGroup#getRang <em>Rang</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rang</em>' containment reference.
	 * @see #getRang()
	 * @generated
	 */
	void setRang(Rang_TypeClass value);

} // NB_Zone_Allg_AttributeGroup
