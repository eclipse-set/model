/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Zugnummernmeldeanlage;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_Anhang_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Stellwerk_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Unterbringung_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ZN_Unterstation_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zugnummernmeldeanlage. Wird die ZN-Anlage zusammen mit dem ESTW geplant, gibt es keinen Verweis auf die Anhänge, da die ZN bereits in der ESTW-Konfiguration berücksichtigt ist. Wird die ZN nachgerüstet, sind die Verweise auf ESTW_Zentraleinheit und Anhänge vorhanden. Kann eine ESTW-Bauform keine ZN berücksichtigen, dann gibt es keinen Verweis auf ESTW_Zentraleinheit. DB-Regelwerk 819.0731 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN#getIDAnhangZNPlanBedienraum <em>ID Anhang ZN Plan Bedienraum</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN#getIDAnhangZNPlanRechnerraum <em>ID Anhang ZN Plan Rechnerraum</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN#getIDOertlichkeit <em>ID Oertlichkeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN#getBezeichnungStellwerk <em>Bezeichnung Stellwerk</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN#getIDStellwerk <em>ID Stellwerk</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN#getIDZNUnterstation <em>IDZN Unterstation</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN#getZNAllg <em>ZN Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN()
 * @model extendedMetaData="name='CZN' kind='elementOnly'"
 * @generated
 */
public interface ZN extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Anhang ZN Plan Bedienraum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die ID des Raumplans Bedienraum, der als Anhang im Format PDF beigefügt wird. Bei Planung einer ZN-Einwahlstelle bzw. einer ZN in der Nachbarbetriebsstelle ist die Anordnung von Möbeln mit Unterbringung der ZN-Komponenten für den Bedienraum des Stw in einem Plan darzustellen. Dieser wird als PDF beigefügt. Wird die ZN zusammen mit dem zugehörigen ESTW geplant, gibt es keinen Anhang. DB-Regelwerk 819.0731 12 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang ZN Plan Bedienraum</em>' containment reference.
	 * @see #setIDAnhangZNPlanBedienraum(ID_Anhang_TypeClass)
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_IDAnhangZNPlanBedienraum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_ZN_Plan_Bedienraum'"
	 * @generated
	 */
	ID_Anhang_TypeClass getIDAnhangZNPlanBedienraum();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN#getIDAnhangZNPlanBedienraum <em>ID Anhang ZN Plan Bedienraum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang ZN Plan Bedienraum</em>' containment reference.
	 * @see #getIDAnhangZNPlanBedienraum()
	 * @generated
	 */
	void setIDAnhangZNPlanBedienraum(ID_Anhang_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Anhang ZN Plan Rechnerraum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die ID des Raumplans Rechnerraum, der als Anhang im Format PDF beigefügt wird. Bei Planung einer ZN-Einwahlstelle bzw. einer ZN in der Nachbarbetriebsstelle ist die Anordnung von ZN-Komponenten im Rechnerraum des Stw in einem Plan darzustellen. Dieser wird als PDF beigefügt. Wird die ZN zusammen mit dem zugehörigen ESTW geplant, gibt es keinen Anhang. DB-Regelwerk 819.0731 12 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang ZN Plan Rechnerraum</em>' containment reference.
	 * @see #setIDAnhangZNPlanRechnerraum(ID_Anhang_TypeClass)
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_IDAnhangZNPlanRechnerraum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_ZN_Plan_Rechnerraum'"
	 * @generated
	 */
	ID_Anhang_TypeClass getIDAnhangZNPlanRechnerraum();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN#getIDAnhangZNPlanRechnerraum <em>ID Anhang ZN Plan Rechnerraum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang ZN Plan Rechnerraum</em>' containment reference.
	 * @see #getIDAnhangZNPlanRechnerraum()
	 * @generated
	 */
	void setIDAnhangZNPlanRechnerraum(ID_Anhang_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Oertlichkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Örtlichkeit, die für die ZN-Anlage namensgebend ist. Es ist der Wert „Oertlichkeit_Langname“ zu verwenden. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Oertlichkeit</em>' containment reference.
	 * @see #setIDOertlichkeit(ID_Oertlichkeit_TypeClass)
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_IDOertlichkeit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Oertlichkeit'"
	 * @generated
	 */
	ID_Oertlichkeit_TypeClass getIDOertlichkeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN#getIDOertlichkeit <em>ID Oertlichkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Oertlichkeit</em>' containment reference.
	 * @see #getIDOertlichkeit()
	 * @generated
	 */
	void setIDOertlichkeit(ID_Oertlichkeit_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Bezeichnung Stellwerk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung des Stellwerks, sofern kein Verweis auf eine ESTW-Zentraleinheit möglich ist (z. B. \"Relaisstellwerk xyz\").
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung Stellwerk</em>' containment reference.
	 * @see #setBezeichnungStellwerk(Bezeichnung_Stellwerk_TypeClass)
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_BezeichnungStellwerk()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_Stellwerk'"
	 * @generated
	 */
	Bezeichnung_Stellwerk_TypeClass getBezeichnungStellwerk();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN#getBezeichnungStellwerk <em>Bezeichnung Stellwerk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung Stellwerk</em>' containment reference.
	 * @see #getBezeichnungStellwerk()
	 * @generated
	 */
	void setBezeichnungStellwerk(Bezeichnung_Stellwerk_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Stellwerk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die ESTW-Zentraleinheit, zu der diese ZN oder für die eine ZN-Einwahlstelle geplant wurde. Der Verweis ist optional, da im Plaungswerkzeug ZN/ZL keine Befüllung aller für die ESTW-ZE vorgesehenen Attribute möglich ist. Der Verweis auf Aussenelementansteuerung soll nicht mehr genutzt werden. Zur Angabe der Bezeichnung eines Relaisstellwerks wird mit Version 1.11 eine Modellerweiterung erfolgen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Stellwerk</em>' containment reference.
	 * @see #setIDStellwerk(ID_Stellwerk_TypeClass)
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_IDStellwerk()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Stellwerk'"
	 * @generated
	 */
	ID_Stellwerk_TypeClass getIDStellwerk();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN#getIDStellwerk <em>ID Stellwerk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Stellwerk</em>' containment reference.
	 * @see #getIDStellwerk()
	 * @generated
	 */
	void setIDStellwerk(ID_Stellwerk_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Unterbringung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den physischen Ort der Unterbringung von Aussenelementansteuerung, Bedien Einrichtung Oertlich, Bedien Platz, ESTW Zentraleinheit, PZB Element, Schlosskombination, Schluesselsperre und ZN. Für das PZB Element wird der Verweis nur für eine GÜ gefüllt - mit der Bedeutung: GÜ-Schaltkasten. Für die ZN ist der Verweis optional, da im Planungswerkzeug ZN/ZL keine Befüllung aller der für die Unterbringung notwendigen Attribute möglich ist. DB-Regelwerk Darstellung des Gebäudes, der Bediensäule bzw. des Schaltkastens im sicherungstechnischen Lageplan nach Ril 819.9002 oder Beschreibung im Erläuterungsbericht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Unterbringung</em>' containment reference.
	 * @see #setIDUnterbringung(ID_Unterbringung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_IDUnterbringung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Unterbringung'"
	 * @generated
	 */
	ID_Unterbringung_TypeClass getIDUnterbringung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN#getIDUnterbringung <em>ID Unterbringung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Unterbringung</em>' containment reference.
	 * @see #getIDUnterbringung()
	 * @generated
	 */
	void setIDUnterbringung(ID_Unterbringung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDZN Unterstation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ID der zugehörigen ZLV-Bus-Unterstation. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZN Unterstation</em>' containment reference.
	 * @see #setIDZNUnterstation(ID_ZN_Unterstation_TypeClass)
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_IDZNUnterstation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_ZN_Unterstation'"
	 * @generated
	 */
	ID_ZN_Unterstation_TypeClass getIDZNUnterstation();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN#getIDZNUnterstation <em>IDZN Unterstation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZN Unterstation</em>' containment reference.
	 * @see #getIDZNUnterstation()
	 * @generated
	 */
	void setIDZNUnterstation(ID_ZN_Unterstation_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ZN Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZN Allg</em>' containment reference.
	 * @see #setZNAllg(ZN_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_ZNAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZN_Allg'"
	 * @generated
	 */
	ZN_Allg_AttributeGroup getZNAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN#getZNAllg <em>ZN Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZN Allg</em>' containment reference.
	 * @see #getZNAllg()
	 * @generated
	 */
	void setZNAllg(ZN_Allg_AttributeGroup value);

} // ZN
