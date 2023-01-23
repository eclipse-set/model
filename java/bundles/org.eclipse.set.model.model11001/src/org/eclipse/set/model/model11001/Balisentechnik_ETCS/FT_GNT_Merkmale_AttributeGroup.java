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
 * A representation of the model object '<em><b>FT GNT Merkmale Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_GNT_Merkmale_AttributeGroup#getDeltaVGES <em>Delta VGES</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_GNT_Merkmale_AttributeGroup#getDeltaVLES <em>Delta VLES</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_GNT_Merkmale_AttributeGroup#getDeltaVZES <em>Delta VZES</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_GNT_Merkmale_AttributeGroup#getFTGNTPunktart <em>FTGNT Punktart</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_GNT_Merkmale_AttributeGroup#getLLA <em>LLA</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_GNT_Merkmale_AttributeGroup#getNeigung <em>Neigung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_GNT_Merkmale_AttributeGroup#getSBE <em>SBE</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_GNT_Merkmale_AttributeGroup#getSTZ <em>STZ</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_GNT_Merkmale_AttributeGroup#getVGR <em>VGR</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_GNT_Merkmale_AttributeGroup#getVLA <em>VLA</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_GNT_Merkmale_AttributeGroup#getVZ <em>VZ</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_GNT_Merkmale_AttributeGroup#getZLA <em>ZLA</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_GNT_Merkmale_AttributeGroup()
 * @model extendedMetaData="name='CFT_GNT_Merkmale' kind='elementOnly'"
 * @generated
 */
public interface FT_GNT_Merkmale_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Delta VGES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Erhöhung der Grenzgeschwindigkeit im Überwachungsabschnitt im ES-Profil.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta VGES</em>' containment reference.
	 * @see #setDeltaVGES(Delta_VGES_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_GNT_Merkmale_AttributeGroup_DeltaVGES()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Delta_VGES'"
	 * @generated
	 */
	Delta_VGES_TypeClass getDeltaVGES();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_GNT_Merkmale_AttributeGroup#getDeltaVGES <em>Delta VGES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta VGES</em>' containment reference.
	 * @see #getDeltaVGES()
	 * @generated
	 */
	void setDeltaVGES(Delta_VGES_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Delta VLES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Geschwindigkeitsdifferenz für Langsamfahrbereich im ES-Profil.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta VLES</em>' containment reference.
	 * @see #setDeltaVLES(Delta_VLES_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_GNT_Merkmale_AttributeGroup_DeltaVLES()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Delta_VLES'"
	 * @generated
	 */
	Delta_VLES_TypeClass getDeltaVLES();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_GNT_Merkmale_AttributeGroup#getDeltaVLES <em>Delta VLES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta VLES</em>' containment reference.
	 * @see #getDeltaVLES()
	 * @generated
	 */
	void setDeltaVLES(Delta_VLES_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Delta VZES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Differenz für die Zielgeschwindigkeit im ES-Profil.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Delta VZES</em>' containment reference.
	 * @see #setDeltaVZES(Delta_VZES_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_GNT_Merkmale_AttributeGroup_DeltaVZES()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Delta_VZES'"
	 * @generated
	 */
	Delta_VZES_TypeClass getDeltaVZES();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_GNT_Merkmale_AttributeGroup#getDeltaVZES <em>Delta VZES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta VZES</em>' containment reference.
	 * @see #getDeltaVZES()
	 * @generated
	 */
	void setDeltaVZES(Delta_VZES_TypeClass value);

	/**
	 * Returns the value of the '<em><b>FTGNT Punktart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Punktart des GNT-Fachtelegramms, die dessen (Überwachungs-)Funktion bestimmt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FTGNT Punktart</em>' containment reference.
	 * @see #setFTGNTPunktart(FT_GNT_Punktart_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_GNT_Merkmale_AttributeGroup_FTGNTPunktart()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FT_GNT_Punktart'"
	 * @generated
	 */
	FT_GNT_Punktart_TypeClass getFTGNTPunktart();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_GNT_Merkmale_AttributeGroup#getFTGNTPunktart <em>FTGNT Punktart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FTGNT Punktart</em>' containment reference.
	 * @see #getFTGNTPunktart()
	 * @generated
	 */
	void setFTGNTPunktart(FT_GNT_Punktart_TypeClass value);

	/**
	 * Returns the value of the '<em><b>LLA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Länge des La-Bereichs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LLA</em>' containment reference.
	 * @see #setLLA(LLA_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_GNT_Merkmale_AttributeGroup_LLA()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LLA'"
	 * @generated
	 */
	LLA_TypeClass getLLA();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_GNT_Merkmale_AttributeGroup#getLLA <em>LLA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LLA</em>' containment reference.
	 * @see #getLLA()
	 * @generated
	 */
	void setLLA(LLA_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Neigung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kennzahl für die Streckenneigung im Überwachungsabschnitt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Neigung</em>' containment reference.
	 * @see #setNeigung(Neigung_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_GNT_Merkmale_AttributeGroup_Neigung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Neigung'"
	 * @generated
	 */
	Neigung_TypeClass getNeigung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_GNT_Merkmale_AttributeGroup#getNeigung <em>Neigung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neigung</em>' containment reference.
	 * @see #getNeigung()
	 * @generated
	 */
	void setNeigung(Neigung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>SBE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kennung des Sicherungsbereichs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SBE</em>' containment reference.
	 * @see #setSBE(SBE_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_GNT_Merkmale_AttributeGroup_SBE()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SBE'"
	 * @generated
	 */
	SBE_TypeClass getSBE();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_GNT_Merkmale_AttributeGroup#getSBE <em>SBE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SBE</em>' containment reference.
	 * @see #getSBE()
	 * @generated
	 */
	void setSBE(SBE_TypeClass value);

	/**
	 * Returns the value of the '<em><b>STZ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Steuerzeichen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>STZ</em>' containment reference.
	 * @see #setSTZ(STZ_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_GNT_Merkmale_AttributeGroup_STZ()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='STZ'"
	 * @generated
	 */
	STZ_TypeClass getSTZ();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_GNT_Merkmale_AttributeGroup#getSTZ <em>STZ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>STZ</em>' containment reference.
	 * @see #getSTZ()
	 * @generated
	 */
	void setSTZ(STZ_TypeClass value);

	/**
	 * Returns the value of the '<em><b>VGR</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Grenzgeschwindigkeit im Überwachungsabschnitt für das RS-Profil.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VGR</em>' containment reference.
	 * @see #setVGR(VGR_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_GNT_Merkmale_AttributeGroup_VGR()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VGR'"
	 * @generated
	 */
	VGR_TypeClass getVGR();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_GNT_Merkmale_AttributeGroup#getVGR <em>VGR</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VGR</em>' containment reference.
	 * @see #getVGR()
	 * @generated
	 */
	void setVGR(VGR_TypeClass value);

	/**
	 * Returns the value of the '<em><b>VLA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zulässige Geschwindigkeit im La-Bereich.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VLA</em>' containment reference.
	 * @see #setVLA(VLA_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_GNT_Merkmale_AttributeGroup_VLA()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='VLA'"
	 * @generated
	 */
	VLA_TypeClass getVLA();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_GNT_Merkmale_AttributeGroup#getVLA <em>VLA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VLA</em>' containment reference.
	 * @see #getVLA()
	 * @generated
	 */
	void setVLA(VLA_TypeClass value);

	/**
	 * Returns the value of the '<em><b>VZ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zielgeschwindigkeit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VZ</em>' containment reference.
	 * @see #setVZ(VZ_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_GNT_Merkmale_AttributeGroup_VZ()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='VZ'"
	 * @generated
	 */
	VZ_TypeClass getVZ();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_GNT_Merkmale_AttributeGroup#getVZ <em>VZ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VZ</em>' containment reference.
	 * @see #getVZ()
	 * @generated
	 */
	void setVZ(VZ_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ZLA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zielentfernung bis zum Beginn des La-Bereichs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZLA</em>' containment reference.
	 * @see #setZLA(ZLA_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_GNT_Merkmale_AttributeGroup_ZLA()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZLA'"
	 * @generated
	 */
	ZLA_TypeClass getZLA();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.FT_GNT_Merkmale_AttributeGroup#getZLA <em>ZLA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZLA</em>' containment reference.
	 * @see #getZLA()
	 * @generated
	 */
	void setZLA(ZLA_TypeClass value);

} // FT_GNT_Merkmale_AttributeGroup
