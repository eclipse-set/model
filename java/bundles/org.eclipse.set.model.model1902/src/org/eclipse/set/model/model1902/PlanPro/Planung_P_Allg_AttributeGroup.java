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
 * A representation of the model object '<em><b>Planung PAllg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Planung_P_Allg_AttributeGroup#getBezeichnungPlanungProjekt <em>Bezeichnung Planung Projekt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Planung_P_Allg_AttributeGroup#getDatumAbschlussProjekt <em>Datum Abschluss Projekt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Planung_P_Allg_AttributeGroup#getProjektNummer <em>Projekt Nummer</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Planung_P_Allg_AttributeGroup#getProjektleiter <em>Projektleiter</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getPlanung_P_Allg_AttributeGroup()
 * @model extendedMetaData="name='CPlanung_P_Allg' kind='elementOnly'"
 * @generated
 */
public interface Planung_P_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung Planung Projekt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * \"Gekürzte Langbezeichnung\" einer Baumaßnahme, die über mehrere Planungsgruppen realisiert wird.\nz. B. Grunderneuerung Strecke xxxx.\n\nDB-Regelwerk\nBisher keine eindeutige Abbildung. \nMeist Zusatzeintrag auf Planungsunterlagen außerhalb Standard-Schriftfeld nach Ril 819.0103.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung Planung Projekt</em>' containment reference.
	 * @see #setBezeichnungPlanungProjekt(Bezeichnung_Planung_Projekt_TypeClass)
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getPlanung_P_Allg_AttributeGroup_BezeichnungPlanungProjekt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_Planung_Projekt'"
	 * @generated
	 */
	Bezeichnung_Planung_Projekt_TypeClass getBezeichnungPlanungProjekt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PlanPro.Planung_P_Allg_AttributeGroup#getBezeichnungPlanungProjekt <em>Bezeichnung Planung Projekt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung Planung Projekt</em>' containment reference.
	 * @see #getBezeichnungPlanungProjekt()
	 * @generated
	 */
	void setBezeichnungPlanungProjekt(Bezeichnung_Planung_Projekt_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Datum Abschluss Projekt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum des Abschlusses des Planungsprojektes.\nBis zum tatsächlichen Abschluss handelt es sich dabei um ein geplantes Datum, das iterativ nachzupflegen ist.\n\nDB-Regelwerk\nBisher ohne eindeutige Abbildung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datum Abschluss Projekt</em>' containment reference.
	 * @see #setDatumAbschlussProjekt(Datum_Abschluss_Projekt_TypeClass)
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getPlanung_P_Allg_AttributeGroup_DatumAbschlussProjekt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Datum_Abschluss_Projekt'"
	 * @generated
	 */
	Datum_Abschluss_Projekt_TypeClass getDatumAbschlussProjekt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PlanPro.Planung_P_Allg_AttributeGroup#getDatumAbschlussProjekt <em>Datum Abschluss Projekt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datum Abschluss Projekt</em>' containment reference.
	 * @see #getDatumAbschlussProjekt()
	 * @generated
	 */
	void setDatumAbschlussProjekt(Datum_Abschluss_Projekt_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Projekt Nummer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der Projektnummer.\nDie Struktur wird im LST-Datenmodell nicht vorgegeben. \n\nDB-Regelwerk\nBisher keine eindeutige Abbildung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Projekt Nummer</em>' containment reference.
	 * @see #setProjektNummer(Projekt_Nummer_TypeClass)
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getPlanung_P_Allg_AttributeGroup_ProjektNummer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Projekt_Nummer'"
	 * @generated
	 */
	Projekt_Nummer_TypeClass getProjektNummer();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PlanPro.Planung_P_Allg_AttributeGroup#getProjektNummer <em>Projekt Nummer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projekt Nummer</em>' containment reference.
	 * @see #getProjektNummer()
	 * @generated
	 */
	void setProjektNummer(Projekt_Nummer_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Projektleiter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name des Projektleiters, der für die erfolgreiche Projektabwicklung verantwortlich ist.\n\nDB-Regelwerk\nBisher ohne eindeutige Abbildung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Projektleiter</em>' containment reference.
	 * @see #setProjektleiter(Akteur)
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getPlanung_P_Allg_AttributeGroup_Projektleiter()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Projektleiter'"
	 * @generated
	 */
	Akteur getProjektleiter();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PlanPro.Planung_P_Allg_AttributeGroup#getProjektleiter <em>Projektleiter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Projektleiter</em>' containment reference.
	 * @see #getProjektleiter()
	 * @generated
	 */
	void setProjektleiter(Akteur value);

} // Planung_P_Allg_AttributeGroup
