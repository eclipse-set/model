/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.PlanPro;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planung GSchriftfeld Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Planung_G_Schriftfeld_AttributeGroup#getBauabschnitt <em>Bauabschnitt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Planung_G_Schriftfeld_AttributeGroup#getBezeichnungAnlage <em>Bezeichnung Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Planung_G_Schriftfeld_AttributeGroup#getBezeichnungPlanungGruppe <em>Bezeichnung Planung Gruppe</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Planung_G_Schriftfeld_AttributeGroup#getBezeichnungUnteranlage <em>Bezeichnung Unteranlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Planung_G_Schriftfeld_AttributeGroup#getPlanungsbuero <em>Planungsbuero</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getPlanung_G_Schriftfeld_AttributeGroup()
 * @model extendedMetaData="name='CPlanung_G_Schriftfeld' kind='elementOnly'"
 * @generated
 */
public interface Planung_G_Schriftfeld_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bauabschnitt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Räumliche Abgrenzung einer ausgedehnten Gesamtmaßnahme (z.B. ABS Leipzig-Dresden, Bauabschnitt Dresden Hbf - Dresden-Neustadt).\r\n \r\nDB-Regelwerk\r\n\rBisher ohne eindeutige Darstellung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bauabschnitt</em>' containment reference.
	 * @see #setBauabschnitt(Bauabschnitt_TypeClass)
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getPlanung_G_Schriftfeld_AttributeGroup_Bauabschnitt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bauabschnitt'"
	 * @generated
	 */
	Bauabschnitt_TypeClass getBauabschnitt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PlanPro.Planung_G_Schriftfeld_AttributeGroup#getBauabschnitt <em>Bauabschnitt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bauabschnitt</em>' containment reference.
	 * @see #getBauabschnitt()
	 * @generated
	 */
	void setBauabschnitt(Bauabschnitt_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Bezeichnung Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung der Anlage (z. B. ESTW-ZE Xyz).\n\nDB-Regelwerk\nBisher keine eindeutige Abbildung. \nÜblicherweise Bestandteil des Schriftfeldeintrages Feld 2 \"Kurze treffende Bezeichnung des Planinhaltes (4 Zeilen)\" gemäß Ril 819.0103.\n
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung Anlage</em>' containment reference.
	 * @see #setBezeichnungAnlage(Bezeichnung_Anlage_TypeClass)
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getPlanung_G_Schriftfeld_AttributeGroup_BezeichnungAnlage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_Anlage'"
	 * @generated
	 */
	Bezeichnung_Anlage_TypeClass getBezeichnungAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PlanPro.Planung_G_Schriftfeld_AttributeGroup#getBezeichnungAnlage <em>Bezeichnung Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung Anlage</em>' containment reference.
	 * @see #getBezeichnungAnlage()
	 * @generated
	 */
	void setBezeichnungAnlage(Bezeichnung_Anlage_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Bezeichnung Planung Gruppe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * \"Gekürzte Langbezeichnung\" einer Baumaßnahme, die über eine Planungsgruppe realisiert wird.\nz. B. Umbau Bf xxxxx, Neuerrichtung ESTW-ZE Xyz\n\nDB-Regelwerk\nBisher keine eindeutige Abbildung. \nMeist Zusatzeintrag auf Planungsunterlagen außerhalb Standard-Schriftfeld nach Ril 819.0103.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung Planung Gruppe</em>' containment reference.
	 * @see #setBezeichnungPlanungGruppe(Bezeichnung_Planung_Gruppe_TypeClass)
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getPlanung_G_Schriftfeld_AttributeGroup_BezeichnungPlanungGruppe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_Planung_Gruppe'"
	 * @generated
	 */
	Bezeichnung_Planung_Gruppe_TypeClass getBezeichnungPlanungGruppe();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PlanPro.Planung_G_Schriftfeld_AttributeGroup#getBezeichnungPlanungGruppe <em>Bezeichnung Planung Gruppe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung Planung Gruppe</em>' containment reference.
	 * @see #getBezeichnungPlanungGruppe()
	 * @generated
	 */
	void setBezeichnungPlanungGruppe(Bezeichnung_Planung_Gruppe_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Bezeichnung Unteranlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung der Unteranlage (z. B. ESTW-A Xyz).\n\nDB-Regelwerk\nBisher keine eindeutige Abbildung. \nÜblicherweise Bestandteil des Schriftfeldeintrages Feld 2 \"Kurze treffende Bezeichnung des Planinhaltes (4 Zeilen)\" gemäß Ril 819.0103. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung Unteranlage</em>' containment reference.
	 * @see #setBezeichnungUnteranlage(Bezeichnung_Unteranlage_TypeClass)
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getPlanung_G_Schriftfeld_AttributeGroup_BezeichnungUnteranlage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_Unteranlage'"
	 * @generated
	 */
	Bezeichnung_Unteranlage_TypeClass getBezeichnungUnteranlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PlanPro.Planung_G_Schriftfeld_AttributeGroup#getBezeichnungUnteranlage <em>Bezeichnung Unteranlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung Unteranlage</em>' containment reference.
	 * @see #getBezeichnungUnteranlage()
	 * @generated
	 */
	void setBezeichnungUnteranlage(Bezeichnung_Unteranlage_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Planungsbuero</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zum beauftragten Planungsbüro zur\nInformation über Ansprechpartner für Dritte, die auf aktualisierte Daten aus der beauftragten Planung zugreifen müssen.\n\nDB-Regelwerk\nBisher ohne eindeutige Abbildung als Schriftfeldeintrag gemäß Ril 819.0103.\nIn Planungspraxis heute meist als Zusatzfeld auf Planungsunterlagen eingetragen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Planungsbuero</em>' containment reference.
	 * @see #setPlanungsbuero(Organisation)
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getPlanung_G_Schriftfeld_AttributeGroup_Planungsbuero()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Planungsbuero'"
	 * @generated
	 */
	Organisation getPlanungsbuero();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PlanPro.Planung_G_Schriftfeld_AttributeGroup#getPlanungsbuero <em>Planungsbuero</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Planungsbuero</em>' containment reference.
	 * @see #getPlanungsbuero()
	 * @generated
	 */
	void setPlanungsbuero(Organisation value);

} // Planung_G_Schriftfeld_AttributeGroup
