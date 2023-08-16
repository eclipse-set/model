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
 * A representation of the model object '<em><b>ETCS Signal Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_Signal_Allg_AttributeGroup#getAusstiegETCSSperre <em>Ausstieg ETCS Sperre</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_Signal_Allg_AttributeGroup#getDunkelschaltanstoss <em>Dunkelschaltanstoss</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_Signal_Allg_AttributeGroup#getEinstiegErlaubt <em>Einstieg Erlaubt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_Signal_Allg_AttributeGroup#getGruppenID <em>Gruppen ID</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_Signal_Allg_AttributeGroup#getUntergruppenID <em>Untergruppen ID</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal_Allg_AttributeGroup()
 * @model extendedMetaData="name='CETCS_Signal_Allg' kind='elementOnly'"
 * @generated
 */
public interface ETCS_Signal_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Ausstieg ETCS Sperre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob bzw. in welcher Form bei einer ETCS-Sperre ein Ausstieg aus L2 erlaubt ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ausstieg ETCS Sperre</em>' containment reference.
	 * @see #setAusstiegETCSSperre(Ausstieg_ETCS_Sperre_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal_Allg_AttributeGroup_AusstiegETCSSperre()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Ausstieg_ETCS_Sperre'"
	 * @generated
	 */
	Ausstieg_ETCS_Sperre_TypeClass getAusstiegETCSSperre();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_Signal_Allg_AttributeGroup#getAusstiegETCSSperre <em>Ausstieg ETCS Sperre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ausstieg ETCS Sperre</em>' containment reference.
	 * @see #getAusstiegETCSSperre()
	 * @generated
	 */
	void setAusstiegETCSSperre(Ausstieg_ETCS_Sperre_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Dunkelschaltanstoss</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob für dieses Signal von der ETCS-Zentrale Dunkelschaltanstöße gesendet werden dürfen (true) oder nicht (false). Vorbedingung ist, dass das Signal stellwerksseitig bereits dunkelschaltbar ist (siehe Dunkelschaltung).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dunkelschaltanstoss</em>' containment reference.
	 * @see #setDunkelschaltanstoss(Dunkelschaltanstoss_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal_Allg_AttributeGroup_Dunkelschaltanstoss()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Dunkelschaltanstoss'"
	 * @generated
	 */
	Dunkelschaltanstoss_TypeClass getDunkelschaltanstoss();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_Signal_Allg_AttributeGroup#getDunkelschaltanstoss <em>Dunkelschaltanstoss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dunkelschaltanstoss</em>' containment reference.
	 * @see #getDunkelschaltanstoss()
	 * @generated
	 */
	void setDunkelschaltanstoss(Dunkelschaltanstoss_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Einstieg Erlaubt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob das Signal als Einstiegssignal innerhalb des L2-Bereichs zulässig ist (true) oder nicht (false).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einstieg Erlaubt</em>' containment reference.
	 * @see #setEinstiegErlaubt(Einstieg_Erlaubt_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal_Allg_AttributeGroup_EinstiegErlaubt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Einstieg_Erlaubt'"
	 * @generated
	 */
	Einstieg_Erlaubt_TypeClass getEinstiegErlaubt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_Signal_Allg_AttributeGroup#getEinstiegErlaubt <em>Einstieg Erlaubt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einstieg Erlaubt</em>' containment reference.
	 * @see #getEinstiegErlaubt()
	 * @generated
	 */
	void setEinstiegErlaubt(Einstieg_Erlaubt_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Gruppen ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung zu einer Gruppe, um im Falle einer Rechnerstörung im ESTW dem RBC die gestörten Elemente einfach übertragen zu können. Siehe Ril 819.1344 4 (36). Die Angabe entfällt ggf. zu einem späteren Zeitpunkt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gruppen ID</em>' containment reference.
	 * @see #setGruppenID(Gruppen_ID_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal_Allg_AttributeGroup_GruppenID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Gruppen_ID'"
	 * @generated
	 */
	Gruppen_ID_TypeClass getGruppenID();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_Signal_Allg_AttributeGroup#getGruppenID <em>Gruppen ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gruppen ID</em>' containment reference.
	 * @see #getGruppenID()
	 * @generated
	 */
	void setGruppenID(Gruppen_ID_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Untergruppen ID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung zu einer Untergruppe, um im Falle einer Rechnerstörung im ESTW dem RBC die gestörten Elemente einfach übertragen zu können. Siehe Ril 819.1344 4 (36). Die Angabe entfällt ggf. zu einem späteren Zeitpunkt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Untergruppen ID</em>' containment reference.
	 * @see #setUntergruppenID(Untergruppen_ID_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal_Allg_AttributeGroup_UntergruppenID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Untergruppen_ID'"
	 * @generated
	 */
	Untergruppen_ID_TypeClass getUntergruppenID();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_Signal_Allg_AttributeGroup#getUntergruppenID <em>Untergruppen ID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Untergruppen ID</em>' containment reference.
	 * @see #getUntergruppenID()
	 * @generated
	 */
	void setUntergruppenID(Untergruppen_ID_TypeClass value);

} // ETCS_Signal_Allg_AttributeGroup
