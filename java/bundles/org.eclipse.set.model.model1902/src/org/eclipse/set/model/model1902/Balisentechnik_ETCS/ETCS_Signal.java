/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_Markanter_Punkt_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_RBC_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Signal_ohne_Proxy_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Technischer_Punkt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETCS Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zusatzangaben für Signale im Zusammenhang mit ETCS L2.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Signal#getETCSSignalAllg <em>ETCS Signal Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Signal#getETCSSignalDWeg <em>ETCS Signal DWeg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Signal#getETCSSignalTBV <em>ETCS Signal TBV</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Signal#getIDETCSGefahrpunkt <em>IDETCS Gefahrpunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Signal#getIDHOAFBOA <em>IDHOAFBOA</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Signal#getIDRBC <em>IDRBC</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Signal#getIDSignal <em>ID Signal</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal()
 * @model extendedMetaData="name='CETCS_Signal' kind='elementOnly'"
 * @generated
 */
public interface ETCS_Signal extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ETCS Signal Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ETCS Signal Allg</em>' containment reference.
	 * @see #setETCSSignalAllg(ETCS_Signal_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal_ETCSSignalAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ETCS_Signal_Allg'"
	 * @generated
	 */
	ETCS_Signal_Allg_AttributeGroup getETCSSignalAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Signal#getETCSSignalAllg <em>ETCS Signal Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ETCS Signal Allg</em>' containment reference.
	 * @see #getETCSSignalAllg()
	 * @generated
	 */
	void setETCSSignalAllg(ETCS_Signal_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ETCS Signal DWeg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ETCS Signal DWeg</em>' containment reference.
	 * @see #setETCSSignalDWeg(ETCS_Signal_DWeg_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal_ETCSSignalDWeg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ETCS_Signal_DWeg'"
	 * @generated
	 */
	ETCS_Signal_DWeg_AttributeGroup getETCSSignalDWeg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Signal#getETCSSignalDWeg <em>ETCS Signal DWeg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ETCS Signal DWeg</em>' containment reference.
	 * @see #getETCSSignalDWeg()
	 * @generated
	 */
	void setETCSSignalDWeg(ETCS_Signal_DWeg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ETCS Signal TBV</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ETCS Signal TBV</em>' containment reference.
	 * @see #setETCSSignalTBV(ETCS_Signal_TBV_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal_ETCSSignalTBV()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ETCS_Signal_TBV'"
	 * @generated
	 */
	ETCS_Signal_TBV_AttributeGroup getETCSSignalTBV();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Signal#getETCSSignalTBV <em>ETCS Signal TBV</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ETCS Signal TBV</em>' containment reference.
	 * @see #getETCSSignalTBV()
	 * @generated
	 */
	void setETCSSignalTBV(ETCS_Signal_TBV_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDETCS Gefahrpunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe des ETCS-Gefahrpunkts (Danger Point).\nBei Einfahr-, Block- und Deckungssignalen ist der ETCS-Gefahrpunkt identisch mit dem Gefahrpunkt aus der Stellwerksplanung und somit hier nicht anzugeben.\nBei Ausfahr- und Zwischensignalen ist der ETCS-Gefahrpunkt zu planen (bei vorhandener INA-Berechnung entspricht er meist der maßgebenden Gefahrstelle).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDETCS Gefahrpunkt</em>' containment reference.
	 * @see #setIDETCSGefahrpunkt(ID_Markanter_Punkt_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal_IDETCSGefahrpunkt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_ETCS_Gefahrpunkt'"
	 * @generated
	 */
	ID_Markanter_Punkt_TypeClass getIDETCSGefahrpunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Signal#getIDETCSGefahrpunkt <em>IDETCS Gefahrpunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDETCS Gefahrpunkt</em>' containment reference.
	 * @see #getIDETCSGefahrpunkt()
	 * @generated
	 */
	void setIDETCSGefahrpunkt(ID_Markanter_Punkt_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDHOAFBOA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Heißläuferortungs- oder Festbremsortungsanlage, wenn dieses Signal als HOA/FBOA-Stellort definiert wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDHOAFBOA</em>' containment reference.
	 * @see #setIDHOAFBOA(ID_Technischer_Punkt_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal_IDHOAFBOA()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_HOA_FBOA'"
	 * @generated
	 */
	ID_Technischer_Punkt_TypeClass getIDHOAFBOA();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Signal#getIDHOAFBOA <em>IDHOAFBOA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDHOAFBOA</em>' containment reference.
	 * @see #getIDHOAFBOA()
	 * @generated
	 */
	void setIDHOAFBOA(ID_Technischer_Punkt_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDRBC</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Verweise.ID_RBC_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das RBC, dem das Signal zugeordnet ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDRBC</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal_IDRBC()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_RBC'"
	 * @generated
	 */
	EList<ID_RBC_TypeClass> getIDRBC();

	/**
	 * Returns the value of the '<em><b>ID Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das zugehörige Signal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal</em>' containment reference.
	 * @see #setIDSignal(ID_Signal_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal_IDSignal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Signal'"
	 * @generated
	 */
	ID_Signal_ohne_Proxy_TypeClass getIDSignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Signal#getIDSignal <em>ID Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Signal</em>' containment reference.
	 * @see #getIDSignal()
	 * @generated
	 */
	void setIDSignal(ID_Signal_ohne_Proxy_TypeClass value);

} // ETCS_Signal
