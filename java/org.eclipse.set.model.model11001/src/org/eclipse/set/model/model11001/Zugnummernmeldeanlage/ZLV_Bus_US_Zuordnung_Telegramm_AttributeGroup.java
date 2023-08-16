/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Zugnummernmeldeanlage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZLV Bus US Zuordnung Telegramm Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup#getTelegramm02 <em>Telegramm02</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup#getTelegramm03 <em>Telegramm03</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup#getTelegramm04 <em>Telegramm04</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup#getTelegramm10 <em>Telegramm10</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup#getTelegramm21 <em>Telegramm21</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup#getTelegramm30 <em>Telegramm30</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup()
 * @model extendedMetaData="name='CZLV_Bus_US_Zuordnung_Telegramm' kind='elementOnly'"
 * @generated
 */
public interface ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Telegramm02</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Telegramm 02 (ZN/FN Meldung ohne erfolgte Überschreibung, jedoch auch bei Überspeicherung) ist durchzureichen. Die Angabe von Telegrammen ist für die Durchreichfunktion erforderlich. Eine Aufstellung aller verfügbaren Telegramme steht dem LST-Fachplaner nicht zur Verfügung. Es bedarf der Vorgabe des Betreibers, welche Telegramme von wo nach wo durchgereicht werden sollen. DB-Regelwerk 819.0731A02 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telegramm02</em>' containment reference.
	 * @see #setTelegramm02(Telegramm_02_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup_Telegramm02()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Telegramm_02'"
	 * @generated
	 */
	Telegramm_02_TypeClass getTelegramm02();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup#getTelegramm02 <em>Telegramm02</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telegramm02</em>' containment reference.
	 * @see #getTelegramm02()
	 * @generated
	 */
	void setTelegramm02(Telegramm_02_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Telegramm03</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Telegramm 03 (Erste FN-Meldung) ist durchzureichen. Die Angabe von Telegrammen ist für die Durchreichfunktion erforderlich. Eine Aufstellung aller verfügbaren Telegramme steht dem LST-Fachplaner nicht zur Verfügung. Es bedarf der Vorgabe des Betreibers, welche Telegramme von wo nach wo durchgereicht werden sollen. DB-Regelwerk 819.0731A02 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telegramm03</em>' containment reference.
	 * @see #setTelegramm03(Telegramm_03_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup_Telegramm03()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Telegramm_03'"
	 * @generated
	 */
	Telegramm_03_TypeClass getTelegramm03();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup#getTelegramm03 <em>Telegramm03</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telegramm03</em>' containment reference.
	 * @see #getTelegramm03()
	 * @generated
	 */
	void setTelegramm03(Telegramm_03_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Telegramm04</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Telegramm 04 (ZN/FN mit erfolgter Überschreibung von ZN/FN). Die Angabe von Telegrammen ist für die Durchreichfunktion erforderlich. Eine Aufstellung aller verfügbaren Telegramme steht dem LST-Fachplaner nicht zur Verfügung. Es bedarf der Vorgabe des Betreibers, welche Telegramme von wo nach wo durchgereicht werden sollen. DB-Regelwerk 819.0731A02 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telegramm04</em>' containment reference.
	 * @see #setTelegramm04(Telegramm_04_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup_Telegramm04()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Telegramm_04'"
	 * @generated
	 */
	Telegramm_04_TypeClass getTelegramm04();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup#getTelegramm04 <em>Telegramm04</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telegramm04</em>' containment reference.
	 * @see #getTelegramm04()
	 * @generated
	 */
	void setTelegramm04(Telegramm_04_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Telegramm10</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Telegramm 10 (Einwahl von ZN und Verfügbarkeitshinweisen und Wiederkehr von Verfügbarkeitshinweisen). Die Angabe von Telegrammen ist für die Durchreichfunktion erforderlich. Eine Aufstellung aller verfügbaren Telegramme steht dem LST-Fachplaner nicht zur Verfügung. Es bedarf der Vorgabe des Betreibers, welche Telegramme von wo nach wo durchgereicht werden sollen. DB-Regelwerk 819.0731A02 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telegramm10</em>' containment reference.
	 * @see #setTelegramm10(Telegramm_10_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup_Telegramm10()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Telegramm_10'"
	 * @generated
	 */
	Telegramm_10_TypeClass getTelegramm10();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup#getTelegramm10 <em>Telegramm10</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telegramm10</em>' containment reference.
	 * @see #getTelegramm10()
	 * @generated
	 */
	void setTelegramm10(Telegramm_10_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Telegramm21</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Telegramm 21 (Löschen von ZN/FN). Die Angabe von Telegrammen ist für die Durchreichfunktion erforderlich. Eine Aufstellung aller verfügbaren Telegramme steht dem LST-Fachplaner nicht zur Verfügung. Es bedarf der Vorgabe des Betreibers, welche Telegramme von wo nach wo durchgereicht werden sollen. Bei ZN-Anlagen der Bauformen Thales (einschließlich Bauformen Alcatel SEL) und Bombardier wird das Telegramm 21 unabhängig von einer Filterung IMMER durchgereicht. DB-Regelwerk 819.0731A02 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telegramm21</em>' containment reference.
	 * @see #setTelegramm21(Telegramm_21_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup_Telegramm21()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Telegramm_21'"
	 * @generated
	 */
	Telegramm_21_TypeClass getTelegramm21();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup#getTelegramm21 <em>Telegramm21</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telegramm21</em>' containment reference.
	 * @see #getTelegramm21()
	 * @generated
	 */
	void setTelegramm21(Telegramm_21_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Telegramm30</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Telegramm 30 (Ersetzen von ZN/FN). Die Angabe von Telegrammen ist für die Durchreichfunktion erforderlich. Eine Aufstellung aller verfügbaren Telegramme steht dem LST-Fachplaner nicht zur Verfügung. Es bedarf der Vorgabe des Betreibers, welche Telegramme von wo nach wo durchgereicht werden sollen. Bei ZN-Anlagen der Bauformen Thales (einschließlich Bauformen Alcatel SEL) und Bombardier wird das Telegramm 30 unabhängig von einer Filterung IMMER durchgereicht. DB-Regelwerk 819.0731A02 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telegramm30</em>' containment reference.
	 * @see #setTelegramm30(Telegramm_30_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup_Telegramm30()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Telegramm_30'"
	 * @generated
	 */
	Telegramm_30_TypeClass getTelegramm30();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup#getTelegramm30 <em>Telegramm30</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telegramm30</em>' containment reference.
	 * @see #getTelegramm30()
	 * @generated
	 */
	void setTelegramm30(Telegramm_30_TypeClass value);

} // ZLV_Bus_US_Zuordnung_Telegramm_AttributeGroup
