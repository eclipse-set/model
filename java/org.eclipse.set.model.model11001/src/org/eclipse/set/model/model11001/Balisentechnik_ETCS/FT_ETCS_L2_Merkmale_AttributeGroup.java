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
 * A representation of the model object '<em><b>FT ETCS L2 Merkmale Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_ETCS_L2_Merkmale_AttributeGroup#getFTETCSL2Typ <em>FTETCSL2 Typ</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_ETCS_L2_Merkmale_AttributeGroup#getVBCKennung <em>VBC Kennung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_ETCS_L2_Merkmale_AttributeGroup#getVBCNIDC <em>VBCNIDC</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_ETCS_L2_Merkmale_AttributeGroup#getVBCSetzen <em>VBC Setzen</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_ETCS_L2_Merkmale_AttributeGroup#getVBCTimer <em>VBC Timer</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ETCS_L2_Merkmale_AttributeGroup()
 * @model extendedMetaData="name='CFT_ETCS_L2_Merkmale' kind='elementOnly'"
 * @generated
 */
public interface FT_ETCS_L2_Merkmale_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>FTETCSL2 Typ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Typ des ETCS-Fachtelegramms (Level 2), der dessen (Überwachungs-)Funktion bestimmt. Als Typ des Fachtelegramms kann der Typ des zugehörigen Datenpunkts angegeben werden, auf den sich das Fachtelegramm bezieht. Bei zusammengesetzten DP-Typen sind entsprechend mehrere Fachtelegramme anzulegen und jeweils ein Wert auszuwählen. Dies ist bei der Werkzeugentwicklung zu berücksichtigen. Die insgesamt zulässigen Werte werden über eine separate Liste gemäß Regelwerk vorgegeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FTETCSL2 Typ</em>' containment reference.
	 * @see #setFTETCSL2Typ(FT_ETCS_L2_Typ_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ETCS_L2_Merkmale_AttributeGroup_FTETCSL2Typ()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FT_ETCS_L2_Typ'"
	 * @generated
	 */
	FT_ETCS_L2_Typ_TypeClass getFTETCSL2Typ();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_ETCS_L2_Merkmale_AttributeGroup#getFTETCSL2Typ <em>FTETCSL2 Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FTETCSL2 Typ</em>' containment reference.
	 * @see #getFTETCSL2Typ()
	 * @generated
	 */
	void setFTETCSL2Typ(FT_ETCS_L2_Typ_TypeClass value);

	/**
	 * Returns the value of the '<em><b>VBC Kennung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kennung des Virtuel Balise Cover (VBC). Je nach Typ des Fachtelegramms gibt das Attribut die zu setzende/löschende Kennung oder die Kennung des zugehörigen Datenpunkts an.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VBC Kennung</em>' containment reference.
	 * @see #setVBCKennung(VBC_Kennung_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ETCS_L2_Merkmale_AttributeGroup_VBCKennung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VBC_Kennung'"
	 * @generated
	 */
	VBC_Kennung_TypeClass getVBCKennung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_ETCS_L2_Merkmale_AttributeGroup#getVBCKennung <em>VBC Kennung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VBC Kennung</em>' containment reference.
	 * @see #getVBCKennung()
	 * @generated
	 */
	void setVBCKennung(VBC_Kennung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>VBCNIDC</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * NID C, für die das Virtual Balise Cover (VBC) gilt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VBCNIDC</em>' containment reference.
	 * @see #setVBCNIDC(VBC_NID_C_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ETCS_L2_Merkmale_AttributeGroup_VBCNIDC()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VBC_NID_C'"
	 * @generated
	 */
	VBC_NID_C_TypeClass getVBCNIDC();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_ETCS_L2_Merkmale_AttributeGroup#getVBCNIDC <em>VBCNIDC</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VBCNIDC</em>' containment reference.
	 * @see #getVBCNIDC()
	 * @generated
	 */
	void setVBCNIDC(VBC_NID_C_TypeClass value);

	/**
	 * Returns the value of the '<em><b>VBC Setzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob Virtual Balise Cover (VBC) gesetzt (true) oder zurückgenommen (false) werden soll.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VBC Setzen</em>' containment reference.
	 * @see #setVBCSetzen(VBC_Setzen_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ETCS_L2_Merkmale_AttributeGroup_VBCSetzen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VBC_Setzen'"
	 * @generated
	 */
	VBC_Setzen_TypeClass getVBCSetzen();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_ETCS_L2_Merkmale_AttributeGroup#getVBCSetzen <em>VBC Setzen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VBC Setzen</em>' containment reference.
	 * @see #getVBCSetzen()
	 * @generated
	 */
	void setVBCSetzen(VBC_Setzen_TypeClass value);

	/**
	 * Returns the value of the '<em><b>VBC Timer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anzahl von Tagen, an denen das Virtual Balise Cover (VBC) gültig ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VBC Timer</em>' containment reference.
	 * @see #setVBCTimer(VBC_Timer_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ETCS_L2_Merkmale_AttributeGroup_VBCTimer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VBC_Timer'"
	 * @generated
	 */
	VBC_Timer_TypeClass getVBCTimer();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_ETCS_L2_Merkmale_AttributeGroup#getVBCTimer <em>VBC Timer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VBC Timer</em>' containment reference.
	 * @see #getVBCTimer()
	 * @generated
	 */
	void setVBCTimer(VBC_Timer_TypeClass value);

} // FT_ETCS_L2_Merkmale_AttributeGroup
