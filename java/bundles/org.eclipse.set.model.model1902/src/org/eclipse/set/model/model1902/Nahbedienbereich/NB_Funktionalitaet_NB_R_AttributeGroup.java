/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Nahbedienbereich;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NB Funktionalitaet NB RAttribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Funktionalitaet_NB_R_AttributeGroup#getAWU <em>AWU</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Funktionalitaet_NB_R_AttributeGroup#getFSTZ <em>FSTZ</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Funktionalitaet_NB_R_AttributeGroup#getFAFAE <em>FAFAE</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Funktionalitaet_NB_R_AttributeGroup#getSBUE <em>SBUE</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Funktionalitaet_NB_R_AttributeGroup#getSLESLS <em>SLESLS</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Funktionalitaet_NB_R_AttributeGroup#getWHU <em>WHU</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Funktionalitaet_NB_R_AttributeGroup#getWUS <em>WUS</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NahbedienbereichPackage#getNB_Funktionalitaet_NB_R_AttributeGroup()
 * @model extendedMetaData="name='CNB_Funktionalitaet_NB_R' kind='elementOnly'"
 * @generated
 */
public interface NB_Funktionalitaet_NB_R_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>AWU</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Für den Bediener soll das Bedienkommando „Aufgefahrene Weiche umstellen“ im freigegebenen NB-Bereich möglich sein. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es ist nur im Lastenheft zu finden, das dem LST-Fachplaner nicht zur Verfügung steht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>AWU</em>' containment reference.
	 * @see #setAWU(AWU_TypeClass)
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NahbedienbereichPackage#getNB_Funktionalitaet_NB_R_AttributeGroup_AWU()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='AWU'"
	 * @generated
	 */
	AWU_TypeClass getAWU();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Funktionalitaet_NB_R_AttributeGroup#getAWU <em>AWU</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AWU</em>' containment reference.
	 * @see #getAWU()
	 * @generated
	 */
	void setAWU(AWU_TypeClass value);

	/**
	 * Returns the value of the '<em><b>FSTZ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Für den Bediener soll das Bedienkommando „Fahrstraße in ein Gleis ohne Oberleitung einstellen“ im freigegebenen NB-Bereich möglich sein (nur beim Übergang in nicht überspannte Bereiche relevant). DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es ist nur im Lastenheft zu finden, das dem LST-Fachplaner nicht zur Verfügung steht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FSTZ</em>' containment reference.
	 * @see #setFSTZ(F_ST_Z_TypeClass)
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NahbedienbereichPackage#getNB_Funktionalitaet_NB_R_AttributeGroup_FSTZ()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='F_ST_Z'"
	 * @generated
	 */
	F_ST_Z_TypeClass getFSTZ();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Funktionalitaet_NB_R_AttributeGroup#getFSTZ <em>FSTZ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FSTZ</em>' containment reference.
	 * @see #getFSTZ()
	 * @generated
	 */
	void setFSTZ(F_ST_Z_TypeClass value);

	/**
	 * Returns the value of the '<em><b>FAFAE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Für den Bediener soll das Bedienkommando „Fahrstraße auflösen“ und „Fahrwegelement einzeln auflösen“ im freigegebenen NB-Bereich möglich sein. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es ist nur im Lastenheft zu finden, das dem LST-Fachplaner nicht zur Verfügung steht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FAFAE</em>' containment reference.
	 * @see #setFAFAE(FA_FAE_TypeClass)
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NahbedienbereichPackage#getNB_Funktionalitaet_NB_R_AttributeGroup_FAFAE()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FA_FAE'"
	 * @generated
	 */
	FA_FAE_TypeClass getFAFAE();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Funktionalitaet_NB_R_AttributeGroup#getFAFAE <em>FAFAE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FAFAE</em>' containment reference.
	 * @see #getFAFAE()
	 * @generated
	 */
	void setFAFAE(FA_FAE_TypeClass value);

	/**
	 * Returns the value of the '<em><b>SBUE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Für den Bediener soll das Bedienkommando \"SBUE\" (Schließen eines BÜ, der innerhalb des NB liegt, dessen reguläre Einschaltung aber außerhalb des NB angeordnet ist) im freigegebenen NB-Bereich möglich sein. DB-Regelwerk Das Planungsdatum ist im Regelewrk der DB AG nicht enthalten. Es findet sich im Lastenheft, das dem LST-Fachplaner nicht zur Verfügung steht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SBUE</em>' containment reference.
	 * @see #setSBUE(SBUE_TypeClass)
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NahbedienbereichPackage#getNB_Funktionalitaet_NB_R_AttributeGroup_SBUE()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SBUE'"
	 * @generated
	 */
	SBUE_TypeClass getSBUE();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Funktionalitaet_NB_R_AttributeGroup#getSBUE <em>SBUE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SBUE</em>' containment reference.
	 * @see #getSBUE()
	 * @generated
	 */
	void setSBUE(SBUE_TypeClass value);

	/**
	 * Returns the value of the '<em><b>SLESLS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Für den Bediener soll das Bedienkommando „Schlüsselsperre entsperren“ (freigeben) und „Schlüsselsperre sperren“ (Freigabe zurücknehmen) im freigegebenen NB-Bereich möglich sein. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es findet sich im Lastenheft, das dem LST-Fachplaner nicht zur Verfügung steht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SLESLS</em>' containment reference.
	 * @see #setSLESLS(SLE_SLS_TypeClass)
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NahbedienbereichPackage#getNB_Funktionalitaet_NB_R_AttributeGroup_SLESLS()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SLE_SLS'"
	 * @generated
	 */
	SLE_SLS_TypeClass getSLESLS();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Funktionalitaet_NB_R_AttributeGroup#getSLESLS <em>SLESLS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SLESLS</em>' containment reference.
	 * @see #getSLESLS()
	 * @generated
	 */
	void setSLESLS(SLE_SLS_TypeClass value);

	/**
	 * Returns the value of the '<em><b>WHU</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Für den Bediener soll das Bedienkommando „Weiche hilfsweise umstellen“ im freigegebenen NB-Bereich möglich sein. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es ist nur im Lastenheft zu finden, das dem LST-Fachplaner nicht zur Verfügung steht. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>WHU</em>' containment reference.
	 * @see #setWHU(WHU_TypeClass)
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NahbedienbereichPackage#getNB_Funktionalitaet_NB_R_AttributeGroup_WHU()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='WHU'"
	 * @generated
	 */
	WHU_TypeClass getWHU();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Funktionalitaet_NB_R_AttributeGroup#getWHU <em>WHU</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WHU</em>' containment reference.
	 * @see #getWHU()
	 * @generated
	 */
	void setWHU(WHU_TypeClass value);

	/**
	 * Returns the value of the '<em><b>WUS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Für den Bediener soll das Bedienkommando „Weiche gegen umstellen sperren“ im freigegebenen NB-Bereich möglich sein. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es ist nur im Lastenheft zu finden, das dem LST-Fachplaner nicht zur Verfügung steht. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>WUS</em>' containment reference.
	 * @see #setWUS(WUS_TypeClass)
	 * @see org.eclipse.set.model.model1902.Nahbedienbereich.NahbedienbereichPackage#getNB_Funktionalitaet_NB_R_AttributeGroup_WUS()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='WUS'"
	 * @generated
	 */
	WUS_TypeClass getWUS();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Nahbedienbereich.NB_Funktionalitaet_NB_R_AttributeGroup#getWUS <em>WUS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WUS</em>' containment reference.
	 * @see #getWUS()
	 * @generated
	 */
	void setWUS(WUS_TypeClass value);

} // NB_Funktionalitaet_NB_R_AttributeGroup
