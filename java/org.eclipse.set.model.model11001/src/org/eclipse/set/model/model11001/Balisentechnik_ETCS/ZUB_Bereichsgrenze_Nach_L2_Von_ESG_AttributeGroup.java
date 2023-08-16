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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model11001.Verweise.ID_Fachtelegramm_ohne_Proxy_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Signal_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZUB Bereichsgrenze Nach L2 Von ESG Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup#getAbstandDatenpunktEHEMFolgesignal <em>Abstand Datenpunkt EHEM Folgesignal</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup#getAbstandDatenpunktEPTPI <em>Abstand Datenpunkt EPTPI</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup#getAbstandDatenpunktTPIFolgesignal <em>Abstand Datenpunkt TPI Folgesignal</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup#getIDFachtelegramm <em>ID Fachtelegramm</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup#getIDFolgesignal <em>ID Folgesignal</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup()
 * @model extendedMetaData="name='CZUB_Bereichsgrenze_Nach_L2_Von_ESG' kind='elementOnly'"
 * @generated
 */
public interface ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Abstand Datenpunkt EHEM Folgesignal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abstand des Datenpunkts EH bzw. EM zum Folgesignal in m. Das Folgesignal kann eine ETCS-Haltetafel (Ne 14) sein. DB-Regelwerk  ESG-Datenpunkttabelle 3, Spalte 5
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstand Datenpunkt EHEM Folgesignal</em>' containment reference.
	 * @see #setAbstandDatenpunktEHEMFolgesignal(Abstand_Datenpunkt_EH_EM_Folgesignal_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup_AbstandDatenpunktEHEMFolgesignal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Abstand_Datenpunkt_EH_EM_Folgesignal'"
	 * @generated
	 */
	Abstand_Datenpunkt_EH_EM_Folgesignal_TypeClass getAbstandDatenpunktEHEMFolgesignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup#getAbstandDatenpunktEHEMFolgesignal <em>Abstand Datenpunkt EHEM Folgesignal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstand Datenpunkt EHEM Folgesignal</em>' containment reference.
	 * @see #getAbstandDatenpunktEHEMFolgesignal()
	 * @generated
	 */
	void setAbstandDatenpunktEHEMFolgesignal(Abstand_Datenpunkt_EH_EM_Folgesignal_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Abstand Datenpunkt EPTPI</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abstand des Datenpunkts EP zum Datenpunkt TPI in m. DB-Regelwerk  ESG-Datenpunkttabelle 3, Spalte 3
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstand Datenpunkt EPTPI</em>' containment reference.
	 * @see #setAbstandDatenpunktEPTPI(Abstand_Datenpunkt_EP_TPI_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup_AbstandDatenpunktEPTPI()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Abstand_Datenpunkt_EP_TPI'"
	 * @generated
	 */
	Abstand_Datenpunkt_EP_TPI_TypeClass getAbstandDatenpunktEPTPI();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup#getAbstandDatenpunktEPTPI <em>Abstand Datenpunkt EPTPI</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstand Datenpunkt EPTPI</em>' containment reference.
	 * @see #getAbstandDatenpunktEPTPI()
	 * @generated
	 */
	void setAbstandDatenpunktEPTPI(Abstand_Datenpunkt_EP_TPI_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Abstand Datenpunkt TPI Folgesignal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abstand des Datenpunkts TPI zum Folgesignal in m. Das Folgesignal kann eine ETCS-Haltetafel (Ne 14) sein. DB-Regelwerk  ESG-Datenpunkttabelle 3, Spalte 4
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstand Datenpunkt TPI Folgesignal</em>' containment reference.
	 * @see #setAbstandDatenpunktTPIFolgesignal(Abstand_Datenpunkt_TPI_Folgesignal_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup_AbstandDatenpunktTPIFolgesignal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Abstand_Datenpunkt_TPI_Folgesignal'"
	 * @generated
	 */
	Abstand_Datenpunkt_TPI_Folgesignal_TypeClass getAbstandDatenpunktTPIFolgesignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup#getAbstandDatenpunktTPIFolgesignal <em>Abstand Datenpunkt TPI Folgesignal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstand Datenpunkt TPI Folgesignal</em>' containment reference.
	 * @see #getAbstandDatenpunktTPIFolgesignal()
	 * @generated
	 */
	void setAbstandDatenpunktTPIFolgesignal(Abstand_Datenpunkt_TPI_Folgesignal_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Fachtelegramm</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.Verweise.ID_Fachtelegramm_ohne_Proxy_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der Fachtelegramme zum angegebenen Folgesignal. DB-Regelwerk ESG-Datenpunkttabelle 3, alle Fachtelegramme zu einem Folgesignal werden in einer Zeile ausgegeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fachtelegramm</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup_IDFachtelegramm()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fachtelegramm'"
	 * @generated
	 */
	EList<ID_Fachtelegramm_ohne_Proxy_TypeClass> getIDFachtelegramm();

	/**
	 * Returns the value of the '<em><b>ID Folgesignal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe des Folgesignals, auf das sich die angegebenen Fachtelegramme beziehen. DB-Regelwerk  ESG-Datenpunkttabelle 3, Spalte 6. Alle Fachtelegramme zu einem Folgesignal werden in einer Zeile ausgegeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Folgesignal</em>' containment reference.
	 * @see #setIDFolgesignal(ID_Signal_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup_IDFolgesignal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Folgesignal'"
	 * @generated
	 */
	ID_Signal_TypeClass getIDFolgesignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup#getIDFolgesignal <em>ID Folgesignal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Folgesignal</em>' containment reference.
	 * @see #getIDFolgesignal()
	 * @generated
	 */
	void setIDFolgesignal(ID_Signal_TypeClass value);

} // ZUB_Bereichsgrenze_Nach_L2_Von_ESG_AttributeGroup
