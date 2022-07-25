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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FT ESG Merkmale Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getBremsweg <em>Bremsweg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getDPTypVLa <em>DP Typ VLa</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getESGIndividuelleMerkmale <em>ESG Individuelle Merkmale</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getESGSpezifischeMerkmale <em>ESG Spezifische Merkmale</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getFTESGSubtyp <em>FTESG Subtyp</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getFTESGTyp <em>FTESG Typ</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getLfdNrInTelegrSpec <em>Lfd Nr In Telegr Spec</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ESG_Merkmale_AttributeGroup()
 * @model extendedMetaData="name='CFT_ESG_Merkmale' kind='elementOnly'"
 * @generated
 */
public interface FT_ESG_Merkmale_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bremsweg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Regelbremsweg der Strecke. Ein Regelbremsweg von 1000 m wird in den Planunterlagen nicht ausgewiesen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bremsweg</em>' containment reference.
	 * @see #setBremsweg(Bremsweg_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ESG_Merkmale_AttributeGroup_Bremsweg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bremsweg'"
	 * @generated
	 */
	Bremsweg_TypeClass getBremsweg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getBremsweg <em>Bremsweg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bremsweg</em>' containment reference.
	 * @see #getBremsweg()
	 * @generated
	 */
	void setBremsweg(Bremsweg_TypeClass value);

	/**
	 * Returns the value of the '<em><b>DP Typ VLa</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Typ_V_La_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Geschwindkeitsbeschränkung (ständige oder vorübergehende Langsamfahrstelle bzw. Vorsignalisierung), die durch den Datenpunkt angekündigt wird (Parameter -y).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DP Typ VLa</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ESG_Merkmale_AttributeGroup_DPTypVLa()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DP_Typ_V_La'"
	 * @generated
	 */
	EList<DP_Typ_V_La_TypeClass> getDPTypVLa();

	/**
	 * Returns the value of the '<em><b>ESG Individuelle Merkmale</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ESG_Individuelle_Merkmale_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Angabe von angepassten Parametern bei individueller Projektierung, z. B. Datenpunkttyp BM mit Parameter für Länge der Metallmasse in Metern.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ESG Individuelle Merkmale</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ESG_Merkmale_AttributeGroup_ESGIndividuelleMerkmale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ESG_Individuelle_Merkmale'"
	 * @generated
	 */
	EList<ESG_Individuelle_Merkmale_AttributeGroup> getESGIndividuelleMerkmale();

	/**
	 * Returns the value of the '<em><b>ESG Spezifische Merkmale</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ESG_Spezifische_Merkmale_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Angabe von frei definierten Parametern bei spezifischer Projektierung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ESG Spezifische Merkmale</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ESG_Merkmale_AttributeGroup_ESGSpezifischeMerkmale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ESG_Spezifische_Merkmale'"
	 * @generated
	 */
	EList<ESG_Spezifische_Merkmale_AttributeGroup> getESGSpezifischeMerkmale();

	/**
	 * Returns the value of the '<em><b>FTESG Subtyp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ergänzung bzw. Zusatzangabe zum Typ des ETCS-Fachtelegramms (ESG). Die zulässigen Werte werden über eine separate Liste vorgegeben, die bei der Werkzeugentwicklung zu berücksichtigen ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FTESG Subtyp</em>' containment reference.
	 * @see #setFTESGSubtyp(FT_ESG_Subtyp_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ESG_Merkmale_AttributeGroup_FTESGSubtyp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FT_ESG_Subtyp'"
	 * @generated
	 */
	FT_ESG_Subtyp_TypeClass getFTESGSubtyp();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getFTESGSubtyp <em>FTESG Subtyp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FTESG Subtyp</em>' containment reference.
	 * @see #getFTESGSubtyp()
	 * @generated
	 */
	void setFTESGSubtyp(FT_ESG_Subtyp_TypeClass value);

	/**
	 * Returns the value of the '<em><b>FTESG Typ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Typ des ETCS-Fachtelegramms (ESG), der dessen (Überwachungs-)Funktion bestimmt. Die zulässigen Werte werden über eine separate Liste vorgegeben, die bei der Werkzeugentwicklung zu berücksichtigen ist (siehe DP_Typ_ESG).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FTESG Typ</em>' containment reference.
	 * @see #setFTESGTyp(FT_ESG_Typ_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ESG_Merkmale_AttributeGroup_FTESGTyp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FT_ESG_Typ'"
	 * @generated
	 */
	FT_ESG_Typ_TypeClass getFTESGTyp();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getFTESGTyp <em>FTESG Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FTESG Typ</em>' containment reference.
	 * @see #getFTESGTyp()
	 * @generated
	 */
	void setFTESGTyp(FT_ESG_Typ_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Lfd Nr In Telegr Spec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Laufende Nummer gemäß Dokument \"Telegramme für Regelbremsweg xxxx m\".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lfd Nr In Telegr Spec</em>' containment reference.
	 * @see #setLfdNrInTelegrSpec(LfdNr_in_Telegr_Spec_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ESG_Merkmale_AttributeGroup_LfdNrInTelegrSpec()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LfdNr_in_Telegr_Spec'"
	 * @generated
	 */
	LfdNr_in_Telegr_Spec_TypeClass getLfdNrInTelegrSpec();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ESG_Merkmale_AttributeGroup#getLfdNrInTelegrSpec <em>Lfd Nr In Telegr Spec</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lfd Nr In Telegr Spec</em>' containment reference.
	 * @see #getLfdNrInTelegrSpec()
	 * @generated
	 */
	void setLfdNrInTelegrSpec(LfdNr_in_Telegr_Spec_TypeClass value);

} // FT_ESG_Merkmale_AttributeGroup
