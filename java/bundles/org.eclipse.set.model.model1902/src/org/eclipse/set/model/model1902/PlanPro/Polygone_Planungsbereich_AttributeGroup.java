/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.PlanPro;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Polygone Planungsbereich Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Polygone_Planungsbereich_AttributeGroup#getKoordinatensystemPB <em>Koordinatensystem PB</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Polygone_Planungsbereich_AttributeGroup#getPolygonzugPlanungsbereich <em>Polygonzug Planungsbereich</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getPolygone_Planungsbereich_AttributeGroup()
 * @model extendedMetaData="name='CPolygone_Planungsbereich' kind='elementOnly'"
 * @generated
 */
public interface Polygone_Planungsbereich_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Koordinatensystem PB</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Koordinatensystem, in dem der Polygonzug des Planungsbereichs definiert ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Koordinatensystem PB</em>' containment reference.
	 * @see #setKoordinatensystemPB(Koordinatensystem_PB_TypeClass)
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getPolygone_Planungsbereich_AttributeGroup_KoordinatensystemPB()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Koordinatensystem_PB'"
	 * @generated
	 */
	Koordinatensystem_PB_TypeClass getKoordinatensystemPB();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PlanPro.Polygone_Planungsbereich_AttributeGroup#getKoordinatensystemPB <em>Koordinatensystem PB</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Koordinatensystem PB</em>' containment reference.
	 * @see #getKoordinatensystemPB()
	 * @generated
	 */
	void setKoordinatensystemPB(Koordinatensystem_PB_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Polygonzug Planungsbereich</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.PlanPro.Polygonzug_Planungsbereich_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Polygonzug zur Beschreibung des Planungsbereichs unter Nutzung des GML-Standards.\r\n\rDer definierte Planungsbereich gilt für alle Einzelplanungen der Planung Gruppe und dient der Ermittlung der eingeschlossenen Objekte der LST-Anlage sowie der Beschreibung des flächenhaften Bereichs.\r\n\rDer Planungsbereich kann vom LST-Fachplaner durch Ändern, Eintragen und Löschen von Objekten in einer Einzelplanung verändert werden.\r\n\r\nErgänzende Beschreibung zum Umgang im PlanPro-Planungsprozess\r\n\r\nFür den Planungsbereich gibt es einen oder mehrere Polygonzüge, durch die eine geografische Ausdehnung definiert ist. Über die geografische Zuordnung hinaus gibt es Möglichkeiten, weitere Objekte dem Planungsbereich zuzuordnen oder von ihm ausnehmen. Innerhalb dieser geografischen Ausdehnung können Objekte mit GEO-Referenzen nur vom Planer des Planungsbereichs hinzugefügt oder geändert werden. Der Planungsbereich ist in der 1. Umsetzungsstufe PlanPro auf den Bereich einer ESTW-ZE festgelegt. Er wird durch die Angabe aller darin befindlichen Streckenabschnitte mit Strecke, Abschnittsanfang und Abschnittsende hinreichend beschrieben, alle Bahnhofsgleise werden gemäß den örtlichen Richtlinien der Betriebsstellen den Streckengleisen zugeordnet.\r\n\r\nAls Schnittstellen zwischen zwei ESTW-Zentraleinheiten kommen nur die Bahnhofs- und Blockschnittstellen in Frage. An den Planungsbereich kann ein oder können mehrere Betrachtungsbereich(e) angrenzen. Alle Objekte, auf die aus dem Planungsbereich heraus verwiesen wird, müssen im Betrachtungsbereich liegen. Ebenfalls müssen Objekte im Betrachtungsbereich liegen, die auf Objekte im Planungsbereich verweisen.\r\n \r\nDB-Regelwerk\r\nBisher keine eindeutige Abbildung. \r\nProzessuale Definition indirekt durch Sperrung entsprechender Bestandspläne der Bestandsdokumentation gemäß Ril 809.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Polygonzug Planungsbereich</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getPolygone_Planungsbereich_AttributeGroup_PolygonzugPlanungsbereich()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Polygonzug_Planungsbereich'"
	 * @generated
	 */
	EList<Polygonzug_Planungsbereich_TypeClass> getPolygonzugPlanungsbereich();

} // Polygone_Planungsbereich_AttributeGroup
