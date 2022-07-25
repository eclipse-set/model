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

import org.eclipse.set.model.model1902.Verweise.ID_Anhang_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fachtelegramm</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Informationen auf Planungsebene, die einem Datenpunkt in Abhängkeit eines Signalbegriffs oder anderer Eingangsinformationen zugeordnet werden.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Fachtelegramm#getFTFahrwegTeile <em>FT Fahrweg Teile</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Fachtelegramm#getIDDokuTelegrammkodierung <em>ID Doku Telegrammkodierung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Fachtelegramm#getWirkrichtungInDatenpunkt <em>Wirkrichtung In Datenpunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Fachtelegramm#getFTESGMerkmale <em>FTESG Merkmale</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Fachtelegramm#getFTETCSL2Merkmale <em>FTETCSL2 Merkmale</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Fachtelegramm#getFTETCSTransMerkmale <em>FTETCS Trans Merkmale</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Fachtelegramm#getFTGNTMerkmale <em>FTGNT Merkmale</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Fachtelegramm#getFTZBSMerkmale <em>FTZBS Merkmale</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFachtelegramm()
 * @model extendedMetaData="name='CFachtelegramm' kind='elementOnly'"
 * @generated
 */
public interface Fachtelegramm extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>FT Fahrweg Teile</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_Fahrweg_Teile_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fahrwegteile, auf die sich das Fachtelegramm bezieht. Die Fahrwegteile sind nicht zwingend identisch mit existierenden Fahrstraßen und können über den Überwachungsbereich hinausgehen. Die Angabe ist bei ZBS verpflichtend. Die Notwendigkeit für weitere Anwendungssysteme ist (auch im Zusammenhang mit der Werkzeugentwicklung) noch einmal zu betrachten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FT Fahrweg Teile</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFachtelegramm_FTFahrwegTeile()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FT_Fahrweg_Teile'"
	 * @generated
	 */
	EList<FT_Fahrweg_Teile_AttributeGroup> getFTFahrwegTeile();

	/**
	 * Returns the value of the '<em><b>ID Doku Telegrammkodierung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf einen Anhang mit folgenden möglichen Inhalten: Umsetzung der Fachtelegramme auf die Lufttelegramme, Lastenheftangaben, Planungsrichtlinien, SRS-Version.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Doku Telegrammkodierung</em>' containment reference.
	 * @see #setIDDokuTelegrammkodierung(ID_Anhang_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFachtelegramm_IDDokuTelegrammkodierung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Doku_Telegrammkodierung'"
	 * @generated
	 */
	ID_Anhang_TypeClass getIDDokuTelegrammkodierung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Fachtelegramm#getIDDokuTelegrammkodierung <em>ID Doku Telegrammkodierung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Doku Telegrammkodierung</em>' containment reference.
	 * @see #getIDDokuTelegrammkodierung()
	 * @generated
	 */
	void setIDDokuTelegrammkodierung(ID_Anhang_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Wirkrichtung In Datenpunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Richtung der betrieblichen Funktion in Bezug auf die Ausrichtung des Datenpunkts. Der Wert \"in\" ist mit \"nominal\" gleichzusetzen, der Wert \"gegen\" mit \"reverse\".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wirkrichtung In Datenpunkt</em>' containment reference.
	 * @see #setWirkrichtungInDatenpunkt(Wirkrichtung_In_Datenpunkt_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFachtelegramm_WirkrichtungInDatenpunkt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Wirkrichtung_In_Datenpunkt'"
	 * @generated
	 */
	Wirkrichtung_In_Datenpunkt_TypeClass getWirkrichtungInDatenpunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Fachtelegramm#getWirkrichtungInDatenpunkt <em>Wirkrichtung In Datenpunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wirkrichtung In Datenpunkt</em>' containment reference.
	 * @see #getWirkrichtungInDatenpunkt()
	 * @generated
	 */
	void setWirkrichtungInDatenpunkt(Wirkrichtung_In_Datenpunkt_TypeClass value);

	/**
	 * Returns the value of the '<em><b>FTESG Merkmale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FTESG Merkmale</em>' containment reference.
	 * @see #setFTESGMerkmale(FT_ESG_Merkmale_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFachtelegramm_FTESGMerkmale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FT_ESG_Merkmale'"
	 * @generated
	 */
	FT_ESG_Merkmale_AttributeGroup getFTESGMerkmale();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Fachtelegramm#getFTESGMerkmale <em>FTESG Merkmale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FTESG Merkmale</em>' containment reference.
	 * @see #getFTESGMerkmale()
	 * @generated
	 */
	void setFTESGMerkmale(FT_ESG_Merkmale_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>FTETCSL2 Merkmale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FTETCSL2 Merkmale</em>' containment reference.
	 * @see #setFTETCSL2Merkmale(FT_ETCS_L2_Merkmale_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFachtelegramm_FTETCSL2Merkmale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FT_ETCS_L2_Merkmale'"
	 * @generated
	 */
	FT_ETCS_L2_Merkmale_AttributeGroup getFTETCSL2Merkmale();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Fachtelegramm#getFTETCSL2Merkmale <em>FTETCSL2 Merkmale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FTETCSL2 Merkmale</em>' containment reference.
	 * @see #getFTETCSL2Merkmale()
	 * @generated
	 */
	void setFTETCSL2Merkmale(FT_ETCS_L2_Merkmale_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>FTETCS Trans Merkmale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FTETCS Trans Merkmale</em>' containment reference.
	 * @see #setFTETCSTransMerkmale(FT_ETCS_Trans_Merkmale_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFachtelegramm_FTETCSTransMerkmale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FT_ETCS_Trans_Merkmale'"
	 * @generated
	 */
	FT_ETCS_Trans_Merkmale_AttributeGroup getFTETCSTransMerkmale();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Fachtelegramm#getFTETCSTransMerkmale <em>FTETCS Trans Merkmale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FTETCS Trans Merkmale</em>' containment reference.
	 * @see #getFTETCSTransMerkmale()
	 * @generated
	 */
	void setFTETCSTransMerkmale(FT_ETCS_Trans_Merkmale_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>FTGNT Merkmale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FTGNT Merkmale</em>' containment reference.
	 * @see #setFTGNTMerkmale(FT_GNT_Merkmale_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFachtelegramm_FTGNTMerkmale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FT_GNT_Merkmale'"
	 * @generated
	 */
	FT_GNT_Merkmale_AttributeGroup getFTGNTMerkmale();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Fachtelegramm#getFTGNTMerkmale <em>FTGNT Merkmale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FTGNT Merkmale</em>' containment reference.
	 * @see #getFTGNTMerkmale()
	 * @generated
	 */
	void setFTGNTMerkmale(FT_GNT_Merkmale_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>FTZBS Merkmale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FTZBS Merkmale</em>' containment reference.
	 * @see #setFTZBSMerkmale(FT_ZBS_Merkmale_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFachtelegramm_FTZBSMerkmale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FT_ZBS_Merkmale'"
	 * @generated
	 */
	FT_ZBS_Merkmale_AttributeGroup getFTZBSMerkmale();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Fachtelegramm#getFTZBSMerkmale <em>FTZBS Merkmale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FTZBS Merkmale</em>' containment reference.
	 * @see #getFTZBSMerkmale()
	 * @generated
	 */
	void setFTZBSMerkmale(FT_ZBS_Merkmale_AttributeGroup value);

} // Fachtelegramm
