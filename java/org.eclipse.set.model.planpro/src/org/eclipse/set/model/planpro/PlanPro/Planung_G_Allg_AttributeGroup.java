/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.PlanPro;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.planpro.Basisobjekte.Anhang;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planung GAllg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_G_Allg_AttributeGroup#getAnhangBAST <em>Anhang BAST</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_G_Allg_AttributeGroup#getDatumAbschlussGruppe <em>Datum Abschluss Gruppe</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_G_Allg_AttributeGroup#getPlanProXSDVersion <em>Plan Pro XSD Version</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_G_Allg_AttributeGroup#getPlanungGArtBesonders <em>Planung GArt Besonders</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_G_Allg_AttributeGroup#getUntergewerkArt <em>Untergewerk Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_G_Allg_AttributeGroup#getVerantwortlicheStelleDB <em>Verantwortliche Stelle DB</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_G_Allg_AttributeGroup()
 * @model extendedMetaData="name='CPlanung_G_Allg' kind='elementOnly'"
 * @generated
 */
public interface Planung_G_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Anhang BAST</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Basisobjekte.Anhang}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beinhaltet die zur Planung gehörende Betriebliche Aufgabenstellung (BAST), welche als *.pdf der Planung angehängt wird.
	 * DB-Regelwerk
	 * Bisher ohne eindeutige Abbildung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anhang BAST</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_G_Allg_AttributeGroup_AnhangBAST()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Anhang_BAST'"
	 * @generated
	 */
	EList<Anhang> getAnhangBAST();

	/**
	 * Returns the value of the '<em><b>Datum Abschluss Gruppe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum des Abschlusses der letzten Einzelplanung der definierten Planungsgruppe.
	 * Bis zum tatsächlichen Abschluss handelt es sich dabei um ein geplantes Datum, das iterativ nachzupflegen ist.
	 * DB-Regelwerk
	 * Bisher keine eindeutige Abbildung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datum Abschluss Gruppe</em>' containment reference.
	 * @see #setDatumAbschlussGruppe(Datum_Abschluss_Gruppe_TypeClass)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_G_Allg_AttributeGroup_DatumAbschlussGruppe()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Datum_Abschluss_Gruppe'"
	 * @generated
	 */
	Datum_Abschluss_Gruppe_TypeClass getDatumAbschlussGruppe();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Planung_G_Allg_AttributeGroup#getDatumAbschlussGruppe <em>Datum Abschluss Gruppe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datum Abschluss Gruppe</em>' containment reference.
	 * @see #getDatumAbschlussGruppe()
	 * @generated
	 */
	void setDatumAbschlussGruppe(Datum_Abschluss_Gruppe_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Plan Pro XSD Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der zu verwendenden PlanPro-Modellversion (PlanPro-XSD). Ein XSD-Versionswechsel kann dabei nur zwischen zwei Planungsgruppen erfolgen.
	 * DB-Regelwerk
	 * Bisher nicht abgebildet, da Neuerung durch PlanPro-Planungsprozess.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plan Pro XSD Version</em>' containment reference.
	 * @see #setPlanProXSDVersion(PlanPro_XSD_Version_TypeClass)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_G_Allg_AttributeGroup_PlanProXSDVersion()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PlanPro_XSD_Version'"
	 * @generated
	 */
	PlanPro_XSD_Version_TypeClass getPlanProXSDVersion();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Planung_G_Allg_AttributeGroup#getPlanProXSDVersion <em>Plan Pro XSD Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan Pro XSD Version</em>' containment reference.
	 * @see #getPlanProXSDVersion()
	 * @generated
	 */
	void setPlanProXSDVersion(PlanPro_XSD_Version_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Planung GArt Besonders</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gibt an, welche besondere Art der Planungsgruppe vorliegt.
	 * DB-Regelwerk
	 * Bisher ohne eindeutige Abbildung.
	 * Meist Bestandteil Schriftfeldeintrag gemäß Ril 886.0102 der Kurzbezeichnung des Bauzustandes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Planung GArt Besonders</em>' containment reference.
	 * @see #setPlanungGArtBesonders(Planung_G_Art_Besonders_TypeClass)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_G_Allg_AttributeGroup_PlanungGArtBesonders()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Planung_G_Art_Besonders'"
	 * @generated
	 */
	Planung_G_Art_Besonders_TypeClass getPlanungGArtBesonders();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Planung_G_Allg_AttributeGroup#getPlanungGArtBesonders <em>Planung GArt Besonders</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planung GArt Besonders</em>' containment reference.
	 * @see #getPlanungGArtBesonders()
	 * @generated
	 */
	void setPlanungGArtBesonders(Planung_G_Art_Besonders_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Untergewerk Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe des Untergewerks, für das die Fachdaten ausgegeben werden.
	 * DB Regelwerk
	 * Bisher keine Abbildung, da Neuerung mit PlanPro.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Untergewerk Art</em>' containment reference.
	 * @see #setUntergewerkArt(Untergewerk_Art_TypeClass)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_G_Allg_AttributeGroup_UntergewerkArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Untergewerk_Art'"
	 * @generated
	 */
	Untergewerk_Art_TypeClass getUntergewerkArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Planung_G_Allg_AttributeGroup#getUntergewerkArt <em>Untergewerk Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Untergewerk Art</em>' containment reference.
	 * @see #getUntergewerkArt()
	 * @generated
	 */
	void setUntergewerkArt(Untergewerk_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Verantwortliche Stelle DB</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Organisationseinheit der DB, die für die Bestandsplanbestellung (und Sperrung) bei der Bestandsplan haltenden Stelle verantwortlich ist.
	 * DB-Regelwerk
	 * Schriftfeldeintrag gemäß Ril 886.0102, Feld 18 \"Name des Auftraggebers\" bzw. 26 \"Genehmigungsvermerks des Auftraggebers\".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verantwortliche Stelle DB</em>' containment reference.
	 * @see #setVerantwortlicheStelleDB(Verantwortliche_Stelle_DB_TypeClass)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_G_Allg_AttributeGroup_VerantwortlicheStelleDB()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Verantwortliche_Stelle_DB'"
	 * @generated
	 */
	Verantwortliche_Stelle_DB_TypeClass getVerantwortlicheStelleDB();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Planung_G_Allg_AttributeGroup#getVerantwortlicheStelleDB <em>Verantwortliche Stelle DB</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verantwortliche Stelle DB</em>' containment reference.
	 * @see #getVerantwortlicheStelleDB()
	 * @generated
	 */
	void setVerantwortlicheStelleDB(Verantwortliche_Stelle_DB_TypeClass value);

} // Planung_G_Allg_AttributeGroup
