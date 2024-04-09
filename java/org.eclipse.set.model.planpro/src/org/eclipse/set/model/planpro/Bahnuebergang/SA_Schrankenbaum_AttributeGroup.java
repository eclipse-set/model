/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bahnuebergang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SA Schrankenbaum Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.SA_Schrankenbaum_AttributeGroup#getAusrichtung <em>Ausrichtung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.SA_Schrankenbaum_AttributeGroup#getAusrichtungWinkel <em>Ausrichtung Winkel</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.SA_Schrankenbaum_AttributeGroup#getBaumprofil <em>Baumprofil</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.SA_Schrankenbaum_AttributeGroup#getGitterbehang <em>Gitterbehang</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.SA_Schrankenbaum_AttributeGroup#getLagerungArt <em>Lagerung Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.SA_Schrankenbaum_AttributeGroup#getLieferlaenge <em>Lieferlaenge</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.SA_Schrankenbaum_AttributeGroup#getMontageAusgleichsgewichte <em>Montage Ausgleichsgewichte</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bahnuebergang.SA_Schrankenbaum_AttributeGroup#getSperrlaenge <em>Sperrlaenge</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getSA_Schrankenbaum_AttributeGroup()
 * @model extendedMetaData="name='CSA_Schrankenbaum' kind='elementOnly'"
 * @generated
 */
public interface SA_Schrankenbaum_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Ausrichtung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Generelle Ausrichtung des Schrankenbaums in Bezug auf die Topologierichtung der TOP_Kante, an der der Schrankenantrieb verortet ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ausrichtung</em>' containment reference.
	 * @see #setAusrichtung(Ausrichtung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getSA_Schrankenbaum_AttributeGroup_Ausrichtung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Ausrichtung'"
	 * @generated
	 */
	Ausrichtung_TypeClass getAusrichtung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.SA_Schrankenbaum_AttributeGroup#getAusrichtung <em>Ausrichtung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ausrichtung</em>' containment reference.
	 * @see #getAusrichtung()
	 * @generated
	 */
	void setAusrichtung(Ausrichtung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Ausrichtung Winkel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ausrichtungswinkel des Schrankenbaums in Bezug auf die Tangente am Verortungspunkt auf der topologischen Kante. Ein direkter Bezug zur Straßenachse ist nicht möglich, da der Straßenverlauf zunächst nur als Bild eingebunden wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ausrichtung Winkel</em>' containment reference.
	 * @see #setAusrichtungWinkel(Ausrichtung_Winkel_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getSA_Schrankenbaum_AttributeGroup_AusrichtungWinkel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Ausrichtung_Winkel'"
	 * @generated
	 */
	Ausrichtung_Winkel_TypeClass getAusrichtungWinkel();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.SA_Schrankenbaum_AttributeGroup#getAusrichtungWinkel <em>Ausrichtung Winkel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ausrichtung Winkel</em>' containment reference.
	 * @see #getAusrichtungWinkel()
	 * @generated
	 */
	void setAusrichtungWinkel(Ausrichtung_Winkel_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Baumprofil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art des Baumprofils, z. B. Rundprofil oder Rechteckprofil.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Baumprofil</em>' containment reference.
	 * @see #setBaumprofil(Baumprofil_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getSA_Schrankenbaum_AttributeGroup_Baumprofil()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Baumprofil'"
	 * @generated
	 */
	Baumprofil_TypeClass getBaumprofil();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.SA_Schrankenbaum_AttributeGroup#getBaumprofil <em>Baumprofil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baumprofil</em>' containment reference.
	 * @see #getBaumprofil()
	 * @generated
	 */
	void setBaumprofil(Baumprofil_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Gitterbehang</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ein Gitterbehang ist vorhanden (true) oder nicht vorhanden (false).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gitterbehang</em>' containment reference.
	 * @see #setGitterbehang(Gitterbehang_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getSA_Schrankenbaum_AttributeGroup_Gitterbehang()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Gitterbehang'"
	 * @generated
	 */
	Gitterbehang_TypeClass getGitterbehang();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.SA_Schrankenbaum_AttributeGroup#getGitterbehang <em>Gitterbehang</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gitterbehang</em>' containment reference.
	 * @see #getGitterbehang()
	 * @generated
	 */
	void setGitterbehang(Gitterbehang_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Lagerung Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, in welcher Art der Schrankenbaum gelagert ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lagerung Art</em>' containment reference.
	 * @see #setLagerungArt(Lagerung_Art_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getSA_Schrankenbaum_AttributeGroup_LagerungArt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Lagerung_Art'"
	 * @generated
	 */
	Lagerung_Art_TypeClass getLagerungArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.SA_Schrankenbaum_AttributeGroup#getLagerungArt <em>Lagerung Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lagerung Art</em>' containment reference.
	 * @see #getLagerungArt()
	 * @generated
	 */
	void setLagerungArt(Lagerung_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Lieferlaenge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lieferlänge des Schrankenbaums.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lieferlaenge</em>' containment reference.
	 * @see #setLieferlaenge(Lieferlaenge_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getSA_Schrankenbaum_AttributeGroup_Lieferlaenge()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Lieferlaenge'"
	 * @generated
	 */
	Lieferlaenge_TypeClass getLieferlaenge();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.SA_Schrankenbaum_AttributeGroup#getLieferlaenge <em>Lieferlaenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lieferlaenge</em>' containment reference.
	 * @see #getLieferlaenge()
	 * @generated
	 */
	void setLieferlaenge(Lieferlaenge_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Montage Ausgleichsgewichte</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob und in welcher Ausführung Ausgleichsgewichte montiert werden sollen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Montage Ausgleichsgewichte</em>' containment reference.
	 * @see #setMontageAusgleichsgewichte(Montage_Ausgleichsgewichte_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getSA_Schrankenbaum_AttributeGroup_MontageAusgleichsgewichte()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Montage_Ausgleichsgewichte'"
	 * @generated
	 */
	Montage_Ausgleichsgewichte_TypeClass getMontageAusgleichsgewichte();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.SA_Schrankenbaum_AttributeGroup#getMontageAusgleichsgewichte <em>Montage Ausgleichsgewichte</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Montage Ausgleichsgewichte</em>' containment reference.
	 * @see #getMontageAusgleichsgewichte()
	 * @generated
	 */
	void setMontageAusgleichsgewichte(Montage_Ausgleichsgewichte_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Sperrlaenge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sperrlänge des Schrankenbaums.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sperrlaenge</em>' containment reference.
	 * @see #setSperrlaenge(Sperrlaenge_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage#getSA_Schrankenbaum_AttributeGroup_Sperrlaenge()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Sperrlaenge'"
	 * @generated
	 */
	Sperrlaenge_TypeClass getSperrlaenge();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bahnuebergang.SA_Schrankenbaum_AttributeGroup#getSperrlaenge <em>Sperrlaenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sperrlaenge</em>' containment reference.
	 * @see #getSperrlaenge()
	 * @generated
	 */
	void setSperrlaenge(Sperrlaenge_TypeClass value);

} // SA_Schrankenbaum_AttributeGroup
