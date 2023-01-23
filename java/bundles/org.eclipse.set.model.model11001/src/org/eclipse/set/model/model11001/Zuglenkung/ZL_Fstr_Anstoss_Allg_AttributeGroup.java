/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Zuglenkung;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZL Fstr Anstoss Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss_Allg_AttributeGroup#getGKZSS <em>GKZSS</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss_Allg_AttributeGroup#getVmaxAnnaeherung <em>Vmax Annaeherung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss_Allg_AttributeGroup#getZLFstrZuschlag <em>ZL Fstr Zuschlag</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Zuglenkung.ZuglenkungPackage#getZL_Fstr_Anstoss_Allg_AttributeGroup()
 * @model extendedMetaData="name='CZL_Fstr_Anstoss_Allg' kind='elementOnly'"
 * @generated
 */
public interface ZL_Fstr_Anstoss_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>GKZSS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Der Anstoß aus einem Zugbeeinflussungssystem (ETCS, LZB) ist möglich. DB-Regelwerk 819.0732 13 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GKZSS</em>' containment reference.
	 * @see #setGKZSS(GKZSS_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZuglenkungPackage#getZL_Fstr_Anstoss_Allg_AttributeGroup_GKZSS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GKZSS'"
	 * @generated
	 */
	GKZSS_TypeClass getGKZSS();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss_Allg_AttributeGroup#getGKZSS <em>GKZSS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GKZSS</em>' containment reference.
	 * @see #getGKZSS()
	 * @generated
	 */
	void setGKZSS(GKZSS_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Vmax Annaeherung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zulässige Höchstgeschwindigkeit zwischen Vorsignal und berechnetem Einschaltpunkt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vmax Annaeherung</em>' containment reference.
	 * @see #setVmaxAnnaeherung(Vmax_Annaeherung_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZuglenkungPackage#getZL_Fstr_Anstoss_Allg_AttributeGroup_VmaxAnnaeherung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Vmax_Annaeherung'"
	 * @generated
	 */
	Vmax_Annaeherung_TypeClass getVmaxAnnaeherung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss_Allg_AttributeGroup#getVmaxAnnaeherung <em>Vmax Annaeherung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vmax Annaeherung</em>' containment reference.
	 * @see #getVmaxAnnaeherung()
	 * @generated
	 */
	void setVmaxAnnaeherung(Vmax_Annaeherung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ZL Fstr Zuschlag</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitzuschlag für die Berechnung des Anstoßpunktes der ZL. Es kann sich die Notwendigkeit ergeben, eine Zeitspanne auf die bisher errechneten Zeiten (Sichtzeit Vorsignal, Fahrstraßenbildungszeit ...) aufzuschlagen, damit der ZL-Anstoß früher erfolgt, als nach der allgemeinen Berechnungsregel vorgesehen. In einem Bearbeitungsvermerk ist dafür eine Begründung anzugeben. Falls kein Zeitzuschlag erforderlich wird, ist das Attribut nicht zu befüllen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZL Fstr Zuschlag</em>' containment reference.
	 * @see #setZLFstrZuschlag(ZL_Fstr_Zuschlag_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZuglenkungPackage#getZL_Fstr_Anstoss_Allg_AttributeGroup_ZLFstrZuschlag()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZL_Fstr_Zuschlag'"
	 * @generated
	 */
	ZL_Fstr_Zuschlag_TypeClass getZLFstrZuschlag();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Anstoss_Allg_AttributeGroup#getZLFstrZuschlag <em>ZL Fstr Zuschlag</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZL Fstr Zuschlag</em>' containment reference.
	 * @see #getZLFstrZuschlag()
	 * @generated
	 */
	void setZLFstrZuschlag(ZL_Fstr_Zuschlag_TypeClass value);

} // ZL_Fstr_Anstoss_Allg_AttributeGroup
