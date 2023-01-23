/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Balisentechnik_ETCS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FT ZBS Merkmale La Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_ZBS_Merkmale_La_AttributeGroup#getZBSLaBereichDistanz <em>ZBS La Bereich Distanz</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_ZBS_Merkmale_La_AttributeGroup#getZBSLaBereichGeschwindigkeit <em>ZBS La Bereich Geschwindigkeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_ZBS_Merkmale_La_AttributeGroup#getZBSLaBereichLaenge <em>ZBS La Bereich Laenge</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_ZBS_Merkmale_La_AttributeGroup#getZBSLaBereichNeigung <em>ZBS La Bereich Neigung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ZBS_Merkmale_La_AttributeGroup()
 * @model extendedMetaData="name='CFT_ZBS_Merkmale_La' kind='elementOnly'"
 * @generated
 */
public interface FT_ZBS_Merkmale_La_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ZBS La Bereich Distanz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Distanz zwischen Datenpunkt und Beginn der Geschwindigkeitseinschränkung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZBS La Bereich Distanz</em>' containment reference.
	 * @see #setZBSLaBereichDistanz(ZBS_La_Bereich_Distanz_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ZBS_Merkmale_La_AttributeGroup_ZBSLaBereichDistanz()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZBS_La_Bereich_Distanz'"
	 * @generated
	 */
	ZBS_La_Bereich_Distanz_TypeClass getZBSLaBereichDistanz();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_ZBS_Merkmale_La_AttributeGroup#getZBSLaBereichDistanz <em>ZBS La Bereich Distanz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZBS La Bereich Distanz</em>' containment reference.
	 * @see #getZBSLaBereichDistanz()
	 * @generated
	 */
	void setZBSLaBereichDistanz(ZBS_La_Bereich_Distanz_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ZBS La Bereich Geschwindigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eingeschränkte Geschwindigkeit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZBS La Bereich Geschwindigkeit</em>' containment reference.
	 * @see #setZBSLaBereichGeschwindigkeit(ZBS_La_Bereich_Geschwindigkeit_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ZBS_Merkmale_La_AttributeGroup_ZBSLaBereichGeschwindigkeit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZBS_La_Bereich_Geschwindigkeit'"
	 * @generated
	 */
	ZBS_La_Bereich_Geschwindigkeit_TypeClass getZBSLaBereichGeschwindigkeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_ZBS_Merkmale_La_AttributeGroup#getZBSLaBereichGeschwindigkeit <em>ZBS La Bereich Geschwindigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZBS La Bereich Geschwindigkeit</em>' containment reference.
	 * @see #getZBSLaBereichGeschwindigkeit()
	 * @generated
	 */
	void setZBSLaBereichGeschwindigkeit(ZBS_La_Bereich_Geschwindigkeit_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ZBS La Bereich Laenge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Länge des Bereichs der Geschwindigkeitseinschränkung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZBS La Bereich Laenge</em>' containment reference.
	 * @see #setZBSLaBereichLaenge(ZBS_La_Bereich_Laenge_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ZBS_Merkmale_La_AttributeGroup_ZBSLaBereichLaenge()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZBS_La_Bereich_Laenge'"
	 * @generated
	 */
	ZBS_La_Bereich_Laenge_TypeClass getZBSLaBereichLaenge();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_ZBS_Merkmale_La_AttributeGroup#getZBSLaBereichLaenge <em>ZBS La Bereich Laenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZBS La Bereich Laenge</em>' containment reference.
	 * @see #getZBSLaBereichLaenge()
	 * @generated
	 */
	void setZBSLaBereichLaenge(ZBS_La_Bereich_Laenge_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ZBS La Bereich Neigung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maßgebende Neigung im Bereich der Bremskurve vor der Geschwindigkeitseinschränkung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZBS La Bereich Neigung</em>' containment reference.
	 * @see #setZBSLaBereichNeigung(ZBS_La_Bereich_Neigung_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ZBS_Merkmale_La_AttributeGroup_ZBSLaBereichNeigung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZBS_La_Bereich_Neigung'"
	 * @generated
	 */
	ZBS_La_Bereich_Neigung_TypeClass getZBSLaBereichNeigung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_ZBS_Merkmale_La_AttributeGroup#getZBSLaBereichNeigung <em>ZBS La Bereich Neigung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZBS La Bereich Neigung</em>' containment reference.
	 * @see #getZBSLaBereichNeigung()
	 * @generated
	 */
	void setZBSLaBereichNeigung(ZBS_La_Bereich_Neigung_TypeClass value);

} // FT_ZBS_Merkmale_La_AttributeGroup
