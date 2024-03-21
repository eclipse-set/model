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

import org.eclipse.set.model.planpro.Basisobjekte.Anhang;
import org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planung Einzel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angabe und Zuordnung von Daten, die für eine Einzelplanung innerhalb einer definierten Planungsgruppe gelten.
 * Die Attribute des Objekts Planung_Einzel werden zum Teil während der Erstellung der beauftragten Planung befüllt. Mit der Weiterschaltung des jeweiligen Planungsstatus können im Rahmen nachfolgender Prozessschritte (z. B. Planprüfung) weitere Attribute befüllt werden.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_Einzel#getAnhangErlaeuterungsbericht <em>Anhang Erlaeuterungsbericht</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_Einzel#getAnhangMaterialBesonders <em>Anhang Material Besonders</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_Einzel#getAnhangVzG <em>Anhang Vz G</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_Einzel#getIDAusgabeFachdaten <em>ID Ausgabe Fachdaten</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_Einzel#getLSTObjektePlanungsbereich <em>LST Objekte Planungsbereich</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_Einzel#getPlanungEAllg <em>Planung EAllg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_Einzel#getPlanungEAusgabeBesonders <em>Planung EAusgabe Besonders</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_Einzel#getPlanungEHandlung <em>Planung EHandlung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_Einzel#getReferenzPlanungBasis <em>Referenz Planung Basis</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_Einzel()
 * @model extendedMetaData="name='CPlanung_Einzel' kind='elementOnly'"
 * @generated
 */
public interface Planung_Einzel extends Ur_Objekt {
	/**
	 * Returns the value of the '<em><b>Anhang Erlaeuterungsbericht</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Basisobjekte.Anhang}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zur Planung gehörender Erläuterungsbericht, welcher als *.pdf der Planung angehängt wird.
	 * DB-Regelwerk
	 * Bisher ohne eindeutige Darstellung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anhang Erlaeuterungsbericht</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_Einzel_AnhangErlaeuterungsbericht()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Anhang_Erlaeuterungsbericht'"
	 * @generated
	 */
	EList<Anhang> getAnhangErlaeuterungsbericht();

	/**
	 * Returns the value of the '<em><b>Anhang Material Besonders</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Basisobjekte.Anhang}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anhang zur Angabe von Besonderheiten, die von der Signalbauindustrie bei der Materialisierung beachtet werden müssen, z. B. beigestellte bzw. wiederverwendete Materialien.
	 * DB-Regelwerk
	 * Bisher ohne eindeutige Darstellung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anhang Material Besonders</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_Einzel_AnhangMaterialBesonders()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Anhang_Material_Besonders'"
	 * @generated
	 */
	EList<Anhang> getAnhangMaterialBesonders();

	/**
	 * Returns the value of the '<em><b>Anhang Vz G</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Basisobjekte.Anhang}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das bei der Erstellung der Planung zu Grunde gelegte VzG des Zielzustandes für die Strecken im Planungsbereich.
	 * Das VzG wird als *.pdf der Planung angehängt.
	 * Das Ausgabedatum des VzG ist in die Dateibezeichnung aufzunehmen, da auch unterjährig aktualisierte VzG herausgegeben werden können.
	 * DB-Regelwerk
	 * Bisher ohne eindeutige Abbildung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anhang Vz G</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_Einzel_AnhangVzG()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Anhang_VzG'"
	 * @generated
	 */
	EList<Anhang> getAnhangVzG();

	/**
	 * Returns the value of the '<em><b>ID Ausgabe Fachdaten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die konkrete Ausgabe der Fachdaten des LST-Datenmodells.
	 * DB Regelwerk
	 * Bisher keine Abbildung, da Neuerung mit PlanPro.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Ausgabe Fachdaten</em>' containment reference.
	 * @see #setIDAusgabeFachdaten(ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_Einzel_IDAusgabeFachdaten()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Ausgabe_Fachdaten'"
	 * @generated
	 */
	ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass getIDAusgabeFachdaten();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Planung_Einzel#getIDAusgabeFachdaten <em>ID Ausgabe Fachdaten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Ausgabe Fachdaten</em>' containment reference.
	 * @see #getIDAusgabeFachdaten()
	 * @generated
	 */
	void setIDAusgabeFachdaten(ID_Ausgabe_Fachdaten_ohne_Proxy_TypeClass value);

	/**
	 * Returns the value of the '<em><b>LST Objekte Planungsbereich</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ID-Verweise auf alle Objekte im Planungsbereich.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LST Objekte Planungsbereich</em>' containment reference.
	 * @see #setLSTObjektePlanungsbereich(LST_Objekte_Planungsbereich_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_Einzel_LSTObjektePlanungsbereich()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LST_Objekte_Planungsbereich'"
	 * @generated
	 */
	LST_Objekte_Planungsbereich_AttributeGroup getLSTObjektePlanungsbereich();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Planung_Einzel#getLSTObjektePlanungsbereich <em>LST Objekte Planungsbereich</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LST Objekte Planungsbereich</em>' containment reference.
	 * @see #getLSTObjektePlanungsbereich()
	 * @generated
	 */
	void setLSTObjektePlanungsbereich(LST_Objekte_Planungsbereich_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Planung EAllg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planung EAllg</em>' containment reference.
	 * @see #setPlanungEAllg(Planung_E_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_Einzel_PlanungEAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Planung_E_Allg'"
	 * @generated
	 */
	Planung_E_Allg_AttributeGroup getPlanungEAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Planung_Einzel#getPlanungEAllg <em>Planung EAllg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planung EAllg</em>' containment reference.
	 * @see #getPlanungEAllg()
	 * @generated
	 */
	void setPlanungEAllg(Planung_E_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Planung EAusgabe Besonders</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planung EAusgabe Besonders</em>' containment reference.
	 * @see #setPlanungEAusgabeBesonders(Planung_E_Ausgabe_Besonders_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_Einzel_PlanungEAusgabeBesonders()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Planung_E_Ausgabe_Besonders'"
	 * @generated
	 */
	Planung_E_Ausgabe_Besonders_AttributeGroup getPlanungEAusgabeBesonders();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Planung_Einzel#getPlanungEAusgabeBesonders <em>Planung EAusgabe Besonders</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planung EAusgabe Besonders</em>' containment reference.
	 * @see #getPlanungEAusgabeBesonders()
	 * @generated
	 */
	void setPlanungEAusgabeBesonders(Planung_E_Ausgabe_Besonders_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Planung EHandlung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planung EHandlung</em>' containment reference.
	 * @see #setPlanungEHandlung(Planung_E_Handlung_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_Einzel_PlanungEHandlung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Planung_E_Handlung'"
	 * @generated
	 */
	Planung_E_Handlung_AttributeGroup getPlanungEHandlung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Planung_Einzel#getPlanungEHandlung <em>Planung EHandlung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planung EHandlung</em>' containment reference.
	 * @see #getPlanungEHandlung()
	 * @generated
	 */
	void setPlanungEHandlung(Planung_E_Handlung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Referenz Planung Basis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Referenz auf eine Planung Einzel mit dem Ausgabestand, der als Grundlage für die Erstellung der aktuellen Planung_Einzel verwendet wurde.
	 * Ergänzende Beschreibung zum Umgang im PlanPro-Planungsprozess
	 * Bei einer Planung der Eigenschaft Planung E Art = Bestandsdigitalisierung_Geo_Topo ist keine Referenz_Planung_Basis vorhanden. Gleiches gilt für Planungen der Art Bestandsdigitalisierung_LST, Geodaten oder Bauzustand, sofern zuvor keine separaten Planungsdaten erzeugt wurden. Alle anderen Planungen verfügen über eine Referenz_Planung_Basis, über deren Verlinkung weitere Angaben im Schriftfeld gefüllt werden können (Ersteller, Bauzustand).
	 * DB-Regelwerk
	 * Bisher keine eindeutige Abbildung.
	 * Herleitbar aus Schriftfeldeinträgen gemäß Ril 886.0102 einschließlich Erläuterungen, insbesondere Änderungsindex/-historie sowie aufbauendem Ausgabestand.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referenz Planung Basis</em>' containment reference.
	 * @see #setReferenzPlanungBasis(Referenz_Planung_Basis_TypeClass)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_Einzel_ReferenzPlanungBasis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Referenz_Planung_Basis'"
	 * @generated
	 */
	Referenz_Planung_Basis_TypeClass getReferenzPlanungBasis();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Planung_Einzel#getReferenzPlanungBasis <em>Referenz Planung Basis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenz Planung Basis</em>' containment reference.
	 * @see #getReferenzPlanungBasis()
	 * @generated
	 */
	void setReferenzPlanungBasis(Referenz_Planung_Basis_TypeClass value);

} // Planung_Einzel
