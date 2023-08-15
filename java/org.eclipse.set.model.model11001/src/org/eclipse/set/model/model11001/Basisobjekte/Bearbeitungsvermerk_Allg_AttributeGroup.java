/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Basisobjekte;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bearbeitungsvermerk Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup#getBearbeitungsvermerkRolle <em>Bearbeitungsvermerk Rolle</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup#getBestandsrelevanz <em>Bestandsrelevanz</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup#getBVDarstellungInPlan <em>BV Darstellung In Plan</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup#getBVKategorie <em>BV Kategorie</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup#getKommentar <em>Kommentar</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup#getKurztext <em>Kurztext</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup#getZeitBearbeitungsvermerk <em>Zeit Bearbeitungsvermerk</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Basisobjekte.BasisobjektePackage#getBearbeitungsvermerk_Allg_AttributeGroup()
 * @model extendedMetaData="name='CBearbeitungsvermerk_Allg' kind='elementOnly'"
 * @generated
 */
public interface Bearbeitungsvermerk_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bearbeitungsvermerk Rolle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fachliche Rolle des Bearbeiters, der den Bearbeitungsvermerk verfasst hat. In der ersten Umsetzungsstufe PlanPro ist dabei nur die Rolle \"LST_Fachplaner\" (Ingenieurbüro) vorgesehen. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bearbeitungsvermerk Rolle</em>' containment reference.
	 * @see #setBearbeitungsvermerkRolle(Bearbeitungsvermerk_Rolle_TypeClass)
	 * @see org.eclipse.set.model.model11001.Basisobjekte.BasisobjektePackage#getBearbeitungsvermerk_Allg_AttributeGroup_BearbeitungsvermerkRolle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bearbeitungsvermerk_Rolle'"
	 * @generated
	 */
	Bearbeitungsvermerk_Rolle_TypeClass getBearbeitungsvermerkRolle();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup#getBearbeitungsvermerkRolle <em>Bearbeitungsvermerk Rolle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bearbeitungsvermerk Rolle</em>' containment reference.
	 * @see #getBearbeitungsvermerkRolle()
	 * @generated
	 */
	void setBearbeitungsvermerkRolle(Bearbeitungsvermerk_Rolle_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Bestandsrelevanz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relevanz eines Bearbeitungsvermerks für die Übernahme in den Bestand (Bestandsdaten bzw. Bestandspläne).
	 * nein - Nur gültig innerhalb einer Planungsgruppe. Der BV ist vor Erstellen der Bestandsdaten einer Planungsgruppe zu löschen.
	 * Bestandsdaten - Gültig innerhalb eines Planungsprojekts bis vor Erstellen einer Bestandsdokumentation, d. h. der BV kann in den Bestandsdaten enthalten bleiben, ist jedoch vor Erstellen einer Bestandsdokumentation zu löschen.
	 * Bestandsdokumentation - Gültig innerhalb eines Planungsprojekts bis vor Erstellen der letzten Bestandsdokumentation, d. h. der BV kann über mehrere Planungsgruppen hinaus enthalten bleiben, ist jedoch vor Projektabschluss zu löschen.
	 * dauerhaft - Gültig über das Gesamtprojekt hinaus auch nach Erstellen der letzten Bestandsdokumentation.
	 * Der BV ist dauerhaft relevant und kann erst mit einem neuen Planungsprojekt  geändert/gelöscht werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bestandsrelevanz</em>' containment reference.
	 * @see #setBestandsrelevanz(Bestandsrelevanz_TypeClass)
	 * @see org.eclipse.set.model.model11001.Basisobjekte.BasisobjektePackage#getBearbeitungsvermerk_Allg_AttributeGroup_Bestandsrelevanz()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bestandsrelevanz'"
	 * @generated
	 */
	Bestandsrelevanz_TypeClass getBestandsrelevanz();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup#getBestandsrelevanz <em>Bestandsrelevanz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bestandsrelevanz</em>' containment reference.
	 * @see #getBestandsrelevanz()
	 * @generated
	 */
	void setBestandsrelevanz(Bestandsrelevanz_TypeClass value);

	/**
	 * Returns the value of the '<em><b>BV Darstellung In Plan</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.Basisobjekte.BV_Darstellung_In_Plan_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe des Plans, in dem der Bearbeitungsvermerk dargestellt werden soll.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BV Darstellung In Plan</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.Basisobjekte.BasisobjektePackage#getBearbeitungsvermerk_Allg_AttributeGroup_BVDarstellungInPlan()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BV_Darstellung_In_Plan'"
	 * @generated
	 */
	EList<BV_Darstellung_In_Plan_TypeClass> getBVDarstellungInPlan();

	/**
	 * Returns the value of the '<em><b>BV Kategorie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kategorisierung des Bearbeitungsvermerks zur Sortierung und Filterung (z. B. zur Ablage von Zusatzinformationen für besondere Anwendungsfälle)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BV Kategorie</em>' containment reference.
	 * @see #setBVKategorie(BV_Kategorie_TypeClass)
	 * @see org.eclipse.set.model.model11001.Basisobjekte.BasisobjektePackage#getBearbeitungsvermerk_Allg_AttributeGroup_BVKategorie()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BV_Kategorie'"
	 * @generated
	 */
	BV_Kategorie_TypeClass getBVKategorie();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup#getBVKategorie <em>BV Kategorie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BV Kategorie</em>' containment reference.
	 * @see #getBVKategorie()
	 * @generated
	 */
	void setBVKategorie(BV_Kategorie_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Kommentar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kommentare des Bearbeiters als Freitext.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kommentar</em>' containment reference.
	 * @see #setKommentar(Kommentar_TypeClass)
	 * @see org.eclipse.set.model.model11001.Basisobjekte.BasisobjektePackage#getBearbeitungsvermerk_Allg_AttributeGroup_Kommentar()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Kommentar'"
	 * @generated
	 */
	Kommentar_TypeClass getKommentar();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup#getKommentar <em>Kommentar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kommentar</em>' containment reference.
	 * @see #getKommentar()
	 * @generated
	 */
	void setKommentar(Kommentar_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Kurztext</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kurzform des Kommentars des Bearbeitungsvermerks für Anzeige bzw. Druck in den Ausgabeformaten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kurztext</em>' containment reference.
	 * @see #setKurztext(Kurztext_TypeClass)
	 * @see org.eclipse.set.model.model11001.Basisobjekte.BasisobjektePackage#getBearbeitungsvermerk_Allg_AttributeGroup_Kurztext()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Kurztext'"
	 * @generated
	 */
	Kurztext_TypeClass getKurztext();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup#getKurztext <em>Kurztext</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kurztext</em>' containment reference.
	 * @see #getKurztext()
	 * @generated
	 */
	void setKurztext(Kurztext_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Zeit Bearbeitungsvermerk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeitpunkt, zu dem der Bearbeitungsvermerk geändert wurde.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zeit Bearbeitungsvermerk</em>' containment reference.
	 * @see #setZeitBearbeitungsvermerk(Zeit_Bearbeitungsvermerk_TypeClass)
	 * @see org.eclipse.set.model.model11001.Basisobjekte.BasisobjektePackage#getBearbeitungsvermerk_Allg_AttributeGroup_ZeitBearbeitungsvermerk()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Zeit_Bearbeitungsvermerk'"
	 * @generated
	 */
	Zeit_Bearbeitungsvermerk_TypeClass getZeitBearbeitungsvermerk();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Basisobjekte.Bearbeitungsvermerk_Allg_AttributeGroup#getZeitBearbeitungsvermerk <em>Zeit Bearbeitungsvermerk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zeit Bearbeitungsvermerk</em>' containment reference.
	 * @see #getZeitBearbeitungsvermerk()
	 * @generated
	 */
	void setZeitBearbeitungsvermerk(Zeit_Bearbeitungsvermerk_TypeClass value);

} // Bearbeitungsvermerk_Allg_AttributeGroup
