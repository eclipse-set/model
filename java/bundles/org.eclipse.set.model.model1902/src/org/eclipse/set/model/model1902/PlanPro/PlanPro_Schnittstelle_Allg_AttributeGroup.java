/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.PlanPro;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan Pro Schnittstelle Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.PlanPro_Schnittstelle_Allg_AttributeGroup#getBemerkung <em>Bemerkung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.PlanPro_Schnittstelle_Allg_AttributeGroup#getErzeugungZeitstempel <em>Erzeugung Zeitstempel</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.PlanPro_Schnittstelle_Allg_AttributeGroup#getWerkzeugName <em>Werkzeug Name</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.PlanPro_Schnittstelle_Allg_AttributeGroup#getWerkzeugVersion <em>Werkzeug Version</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getPlanPro_Schnittstelle_Allg_AttributeGroup()
 * @model extendedMetaData="name='CPlanPro_Schnittstelle_Allg' kind='elementOnly'"
 * @generated
 */
public interface PlanPro_Schnittstelle_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bemerkung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Dokumentation von Besonderheiten im Zuge der Geodaten-Aufbereitung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bemerkung</em>' containment reference.
	 * @see #setBemerkung(Bemerkung_TypeClass)
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getPlanPro_Schnittstelle_Allg_AttributeGroup_Bemerkung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bemerkung'"
	 * @generated
	 */
	Bemerkung_TypeClass getBemerkung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PlanPro.PlanPro_Schnittstelle_Allg_AttributeGroup#getBemerkung <em>Bemerkung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bemerkung</em>' containment reference.
	 * @see #getBemerkung()
	 * @generated
	 */
	void setBemerkung(Bemerkung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Erzeugung Zeitstempel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitstempel der PlanPro-XML-Erzeugung.\r\n \r\nDB-Regelwerk\r\nBisher keine Abbildung, da Neuerung mit PlanPro-Planungsprozess.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Erzeugung Zeitstempel</em>' containment reference.
	 * @see #setErzeugungZeitstempel(Erzeugung_Zeitstempel_TypeClass)
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getPlanPro_Schnittstelle_Allg_AttributeGroup_ErzeugungZeitstempel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Erzeugung_Zeitstempel'"
	 * @generated
	 */
	Erzeugung_Zeitstempel_TypeClass getErzeugungZeitstempel();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PlanPro.PlanPro_Schnittstelle_Allg_AttributeGroup#getErzeugungZeitstempel <em>Erzeugung Zeitstempel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Erzeugung Zeitstempel</em>' containment reference.
	 * @see #getErzeugungZeitstempel()
	 * @generated
	 */
	void setErzeugungZeitstempel(Erzeugung_Zeitstempel_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Werkzeug Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name des Werkzeugs, mit dem die PlanPro-XML erzeugt wurde.\r\n \r\nDB-Regelwerk\r\n\rBisher keine Abbildung, da Neuerung mit PlanPro-Planungsprozess.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Werkzeug Name</em>' containment reference.
	 * @see #setWerkzeugName(Werkzeug_Name_TypeClass)
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getPlanPro_Schnittstelle_Allg_AttributeGroup_WerkzeugName()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Werkzeug_Name'"
	 * @generated
	 */
	Werkzeug_Name_TypeClass getWerkzeugName();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PlanPro.PlanPro_Schnittstelle_Allg_AttributeGroup#getWerkzeugName <em>Werkzeug Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Werkzeug Name</em>' containment reference.
	 * @see #getWerkzeugName()
	 * @generated
	 */
	void setWerkzeugName(Werkzeug_Name_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Werkzeug Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version des Werkzeugs, mit der die PlanPro-XML erzeugt wurde.\r\n \r\nDB-Regelwerk\r\n\rBisher keine Abbildung, da Neuerung mit PlanPro-Planungsprozess.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Werkzeug Version</em>' containment reference.
	 * @see #setWerkzeugVersion(Werkzeug_Version_TypeClass)
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getPlanPro_Schnittstelle_Allg_AttributeGroup_WerkzeugVersion()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Werkzeug_Version'"
	 * @generated
	 */
	Werkzeug_Version_TypeClass getWerkzeugVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PlanPro.PlanPro_Schnittstelle_Allg_AttributeGroup#getWerkzeugVersion <em>Werkzeug Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Werkzeug Version</em>' containment reference.
	 * @see #getWerkzeugVersion()
	 * @generated
	 */
	void setWerkzeugVersion(Werkzeug_Version_TypeClass value);

} // PlanPro_Schnittstelle_Allg_AttributeGroup
