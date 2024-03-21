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

import org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planung Gruppe</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ermöglicht die globale Angabe und Zuordnung von Daten, die für alle Einzelplanungen einer Planungsgruppe gleichermaßen gelten. Dabei können in organisatorische und inhaltliche Angaben unterschieden werden.
 * Ergänzende Beschreibung zum Umgang im PlanPro-Planungsprozess
 * Die ~ muss vor Beginn der Erstellung nachfolgender Einzelplanungen festgelegt sein.
 * Enthält Informationen zur Bezeichnung der Planungsgruppe, zum gesperrten Planungsbereich und zum notwendigen Betrachtungsbereich.
 * Beim Anlegen der ~ erfolgt keine Festlegung der Anzahl der Einzelplanungen. Der erste Bauzustand ist entweder eine Neuplanung oder baut auf einer Bestandsdokumentationbzw. Bestandsdatenauf. Alle weiteren Bauzustände bauen auf der neutralisierten Bezugsplanung des jeweiligen Vorgängers auf.
 * Eine Planungsgruppe durchläuft definierte Status. Spätestens vor Abschluss einer ~ (sowie nach jeder Revision/Rev_letzte_Planung_E) werden neue Bestandsdaten erstellt.
 * DB-Regelwerk
 * Bisher nicht abgebildet.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_Gruppe#getFuehrendeOertlichkeit <em>Fuehrende Oertlichkeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_Gruppe#getLSTPlanungEinzel <em>LST Planung Einzel</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_Gruppe#getPlanungGAllg <em>Planung GAllg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_Gruppe#getPlanungGFuehrendeStrecke <em>Planung GFuehrende Strecke</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_Gruppe#getPlanungGSchriftfeld <em>Planung GSchriftfeld</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_Gruppe#getPolygoneBetrachtungsbereich <em>Polygone Betrachtungsbereich</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_Gruppe#getPolygonePlanungsbereich <em>Polygone Planungsbereich</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_Gruppe()
 * @model extendedMetaData="name='CPlanung_Gruppe' kind='elementOnly'"
 * @generated
 */
public interface Planung_Gruppe extends Ur_Objekt {
	/**
	 * Returns the value of the '<em><b>Fuehrende Oertlichkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abkürzung der führenden Örtlichkeit als Bestandteil der Plannummer (gemäß Ril 886.0102) und des Dateinamens.
	 * Ergänzende Beschreibung zum Umgang im PlanPro-Planungsprozess
	 * Festzulegen durch Projektleiter oder LST-Fachplaner.
	 * DB-Regelwerk
	 * Bestandteil der Plannummer gemäß Ril 886.0102
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fuehrende Oertlichkeit</em>' containment reference.
	 * @see #setFuehrendeOertlichkeit(Fuehrende_Oertlichkeit_TypeClass)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_Gruppe_FuehrendeOertlichkeit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Fuehrende_Oertlichkeit'"
	 * @generated
	 */
	Fuehrende_Oertlichkeit_TypeClass getFuehrendeOertlichkeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Planung_Gruppe#getFuehrendeOertlichkeit <em>Fuehrende Oertlichkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuehrende Oertlichkeit</em>' containment reference.
	 * @see #getFuehrendeOertlichkeit()
	 * @generated
	 */
	void setFuehrendeOertlichkeit(Fuehrende_Oertlichkeit_TypeClass value);

	/**
	 * Returns the value of the '<em><b>LST Planung Einzel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Einbindung des Objekts Planung Einzel in das Objekt Planung Gruppe.
	 * DB Regelwerk
	 * Bisher keine Abbildung, da Neuerung mit PlanPro.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LST Planung Einzel</em>' containment reference.
	 * @see #setLSTPlanungEinzel(Planung_Einzel)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_Gruppe_LSTPlanungEinzel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LST_Planung_Einzel'"
	 * @generated
	 */
	Planung_Einzel getLSTPlanungEinzel();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Planung_Gruppe#getLSTPlanungEinzel <em>LST Planung Einzel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LST Planung Einzel</em>' containment reference.
	 * @see #getLSTPlanungEinzel()
	 * @generated
	 */
	void setLSTPlanungEinzel(Planung_Einzel value);

	/**
	 * Returns the value of the '<em><b>Planung GAllg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planung GAllg</em>' containment reference.
	 * @see #setPlanungGAllg(Planung_G_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_Gruppe_PlanungGAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Planung_G_Allg'"
	 * @generated
	 */
	Planung_G_Allg_AttributeGroup getPlanungGAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Planung_Gruppe#getPlanungGAllg <em>Planung GAllg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planung GAllg</em>' containment reference.
	 * @see #getPlanungGAllg()
	 * @generated
	 */
	void setPlanungGAllg(Planung_G_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Planung GFuehrende Strecke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planung GFuehrende Strecke</em>' containment reference.
	 * @see #setPlanungGFuehrendeStrecke(Planung_G_Fuehrende_Strecke_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_Gruppe_PlanungGFuehrendeStrecke()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Planung_G_Fuehrende_Strecke'"
	 * @generated
	 */
	Planung_G_Fuehrende_Strecke_AttributeGroup getPlanungGFuehrendeStrecke();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Planung_Gruppe#getPlanungGFuehrendeStrecke <em>Planung GFuehrende Strecke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planung GFuehrende Strecke</em>' containment reference.
	 * @see #getPlanungGFuehrendeStrecke()
	 * @generated
	 */
	void setPlanungGFuehrendeStrecke(Planung_G_Fuehrende_Strecke_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Planung GSchriftfeld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Planung GSchriftfeld</em>' containment reference.
	 * @see #setPlanungGSchriftfeld(Planung_G_Schriftfeld_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_Gruppe_PlanungGSchriftfeld()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Planung_G_Schriftfeld'"
	 * @generated
	 */
	Planung_G_Schriftfeld_AttributeGroup getPlanungGSchriftfeld();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Planung_Gruppe#getPlanungGSchriftfeld <em>Planung GSchriftfeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planung GSchriftfeld</em>' containment reference.
	 * @see #getPlanungGSchriftfeld()
	 * @generated
	 */
	void setPlanungGSchriftfeld(Planung_G_Schriftfeld_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Polygone Betrachtungsbereich</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygone Betrachtungsbereich</em>' containment reference.
	 * @see #setPolygoneBetrachtungsbereich(Polygone_Betrachtungsbereich_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_Gruppe_PolygoneBetrachtungsbereich()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Polygone_Betrachtungsbereich'"
	 * @generated
	 */
	Polygone_Betrachtungsbereich_AttributeGroup getPolygoneBetrachtungsbereich();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Planung_Gruppe#getPolygoneBetrachtungsbereich <em>Polygone Betrachtungsbereich</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polygone Betrachtungsbereich</em>' containment reference.
	 * @see #getPolygoneBetrachtungsbereich()
	 * @generated
	 */
	void setPolygoneBetrachtungsbereich(Polygone_Betrachtungsbereich_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Polygone Planungsbereich</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polygone Planungsbereich</em>' containment reference.
	 * @see #setPolygonePlanungsbereich(Polygone_Planungsbereich_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_Gruppe_PolygonePlanungsbereich()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Polygone_Planungsbereich'"
	 * @generated
	 */
	Polygone_Planungsbereich_AttributeGroup getPolygonePlanungsbereich();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.PlanPro.Planung_Gruppe#getPolygonePlanungsbereich <em>Polygone Planungsbereich</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polygone Planungsbereich</em>' containment reference.
	 * @see #getPolygonePlanungsbereich()
	 * @generated
	 */
	void setPolygonePlanungsbereich(Polygone_Planungsbereich_AttributeGroup value);

} // Planung_Gruppe
