/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Zuglenkung;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_ESTW_Zentraleinheit_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ZN_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Anlage zur automatischen Einstellung von Fahrstraßen aufgrund von Zuglaufinformationen. Die Zuglenkung ist eine Anlage, die der Unterstützung des Betriebsablaufes dient. Aufgabe der Zuglenkung ist es, auf der Basis von Zuglaufinformationen und zugbezogenen Vorgaben für die Benutzung von Strecken- und Bahnhofsgleisen ohne unmittelbare Mitwirkung des Bedieners Stellkommandos an das zuständige Stellwerk auszugeben, ihre Ausführung zu überwachen und sich aus Meldungen des Stellwerkes ergebenden Handlungsbedarf an den Bediener weiterzugeben. Zuglaufinformationen erhält die Zuglenkung von der Zuglaufverfolgung (ZLV), die vorgesehene Benutzung der Strecken- und Bahnhofsgleise sowie Wartebedingungen einschließlich besonderer Bedingungen für die Regelung der Reihenfolge der Züge aus einem sogenannten Lenkplan, der in Form einer Gleisbenutzungstabelle (GBT) darstellbar ist. DB-Regelwerk 819.0732 Gleisbenutzungstabelle Weitere Angaben finden sich im Lastenheft, das dem LST-Fachplaner nicht zur Verfügung steht.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Zuglenkung.ZL#getIDESTWZentraleinheit <em>IDESTW Zentraleinheit</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zuglenkung.ZL#getIDZN <em>IDZN</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zuglenkung.ZL#getZLAllg <em>ZL Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zuglenkung.ZL#getZLZN <em>ZLZN</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage#getZL()
 * @model extendedMetaData="name='CZL' kind='elementOnly'"
 * @generated
 */
public interface ZL extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDESTW Zentraleinheit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die ESTW-Zentraleinheit, zu der diese ZL geplant wurde. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDESTW Zentraleinheit</em>' containment reference.
	 * @see #setIDESTWZentraleinheit(ID_ESTW_Zentraleinheit_TypeClass)
	 * @see org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage#getZL_IDESTWZentraleinheit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_ESTW_Zentraleinheit'"
	 * @generated
	 */
	ID_ESTW_Zentraleinheit_TypeClass getIDESTWZentraleinheit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zuglenkung.ZL#getIDESTWZentraleinheit <em>IDESTW Zentraleinheit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDESTW Zentraleinheit</em>' containment reference.
	 * @see #getIDESTWZentraleinheit()
	 * @generated
	 */
	void setIDESTWZentraleinheit(ID_ESTW_Zentraleinheit_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDZN</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die ZN, die zu dieser ZL gehört. ZL und ZN müssen planerisch eine Einheit bilden, da die ZN-Anzeigefelder immer definierte Einschaltpunkte für die ZL sind. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZN</em>' containment reference.
	 * @see #setIDZN(ID_ZN_TypeClass)
	 * @see org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage#getZL_IDZN()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_ZN'"
	 * @generated
	 */
	ID_ZN_TypeClass getIDZN();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zuglenkung.ZL#getIDZN <em>IDZN</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZN</em>' containment reference.
	 * @see #getIDZN()
	 * @generated
	 */
	void setIDZN(ID_ZN_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ZL Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZL Allg</em>' containment reference.
	 * @see #setZLAllg(ZL_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage#getZL_ZLAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZL_Allg'"
	 * @generated
	 */
	ZL_Allg_AttributeGroup getZLAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zuglenkung.ZL#getZLAllg <em>ZL Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZL Allg</em>' containment reference.
	 * @see #getZLAllg()
	 * @generated
	 */
	void setZLAllg(ZL_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ZLZN</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZLZN</em>' containment reference.
	 * @see #setZLZN(ZL_ZN_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage#getZL_ZLZN()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZL_ZN'"
	 * @generated
	 */
	ZL_ZN_AttributeGroup getZLZN();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zuglenkung.ZL#getZLZN <em>ZLZN</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZLZN</em>' containment reference.
	 * @see #getZLZN()
	 * @generated
	 */
	void setZLZN(ZL_ZN_AttributeGroup value);

} // ZL
