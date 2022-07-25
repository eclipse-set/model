/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model1902.Verweise.ID_EV_Modul_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LEU Schaltkasten Energie Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Schaltkasten_Energie_AttributeGroup#getAnzahlVollLEUKalkuliert <em>Anzahl Voll LEU Kalkuliert</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Schaltkasten_Energie_AttributeGroup#getIDEnergieLEUSchaltkasten <em>ID Energie LEU Schaltkasten</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Schaltkasten_Energie_AttributeGroup#getMaxLeistung <em>Max Leistung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Schaltkasten_Energie_AttributeGroup#getSpannungArt <em>Spannung Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Schaltkasten_Energie_AttributeGroup#getUeberbrueckungEVUnterbrechung <em>Ueberbrueckung EV Unterbrechung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Schaltkasten_Energie_AttributeGroup()
 * @model extendedMetaData="name='CLEU_Schaltkasten_Energie' kind='elementOnly'"
 * @generated
 */
public interface LEU_Schaltkasten_Energie_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Anzahl Voll LEU Kalkuliert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kalkulierte Anzahl der Voll-LEU im LEU-Schaltkasten (Grundlage für die Energiebedarfsermittlung). Die tatsächliche Anzahl ergibt sich aus den Instanzen LEU_Modul, die dem LEU-Schaltkasten zugeordnet sind.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anzahl Voll LEU Kalkuliert</em>' containment reference.
	 * @see #setAnzahlVollLEUKalkuliert(Anzahl_Voll_LEU_Kalkuliert_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Schaltkasten_Energie_AttributeGroup_AnzahlVollLEUKalkuliert()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Anzahl_Voll_LEU_Kalkuliert'"
	 * @generated
	 */
	Anzahl_Voll_LEU_Kalkuliert_TypeClass getAnzahlVollLEUKalkuliert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Schaltkasten_Energie_AttributeGroup#getAnzahlVollLEUKalkuliert <em>Anzahl Voll LEU Kalkuliert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anzahl Voll LEU Kalkuliert</em>' containment reference.
	 * @see #getAnzahlVollLEUKalkuliert()
	 * @generated
	 */
	void setAnzahlVollLEUKalkuliert(Anzahl_Voll_LEU_Kalkuliert_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Energie LEU Schaltkasten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Element, von dem die Energieversorgung der LEU erfolgt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Energie LEU Schaltkasten</em>' containment reference.
	 * @see #setIDEnergieLEUSchaltkasten(ID_EV_Modul_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Schaltkasten_Energie_AttributeGroup_IDEnergieLEUSchaltkasten()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Energie_LEU_Schaltkasten'"
	 * @generated
	 */
	ID_EV_Modul_TypeClass getIDEnergieLEUSchaltkasten();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Schaltkasten_Energie_AttributeGroup#getIDEnergieLEUSchaltkasten <em>ID Energie LEU Schaltkasten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Energie LEU Schaltkasten</em>' containment reference.
	 * @see #getIDEnergieLEUSchaltkasten()
	 * @generated
	 */
	void setIDEnergieLEUSchaltkasten(ID_EV_Modul_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Max Leistung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximaler Leistungsbedarf des LEU-Schaltkastens (Summe aller LEU-Module). Der Leistungsbedarf soll durch das Planungswerkzeug über LEU_Art und die Anzahl der zugehörigen Datenpunkte bestimmt werden. Im besonderen Fall ist die Korrektur durch den Planer möglich.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Leistung</em>' containment reference.
	 * @see #setMaxLeistung(Max_Leistung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Schaltkasten_Energie_AttributeGroup_MaxLeistung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Max_Leistung'"
	 * @generated
	 */
	Max_Leistung_TypeClass getMaxLeistung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Schaltkasten_Energie_AttributeGroup#getMaxLeistung <em>Max Leistung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Leistung</em>' containment reference.
	 * @see #getMaxLeistung()
	 * @generated
	 */
	void setMaxLeistung(Max_Leistung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Spannung Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nennspannung, mit der der LEU-Schaltkasten betrieben wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spannung Art</em>' containment reference.
	 * @see #setSpannungArt(Spannung_Art_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Schaltkasten_Energie_AttributeGroup_SpannungArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Spannung_Art'"
	 * @generated
	 */
	Spannung_Art_TypeClass getSpannungArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Schaltkasten_Energie_AttributeGroup#getSpannungArt <em>Spannung Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spannung Art</em>' containment reference.
	 * @see #getSpannungArt()
	 * @generated
	 */
	void setSpannungArt(Spannung_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Ueberbrueckung EV Unterbrechung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EV-Unterbrechungszeit, die im LEU-Schaltkasten überbrückt werden muss. Sofern eine USV vorgesehen ist, ist keine Überbrückung erforderlich. Hinweis: Erfolgt der LEU-Hochlauf innerhalb von 0,5 s, kann der Hersteller auf eine Überbrückung verzichten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ueberbrueckung EV Unterbrechung</em>' containment reference.
	 * @see #setUeberbrueckungEVUnterbrechung(Ueberbrueckung_EV_Unterbrechung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Schaltkasten_Energie_AttributeGroup_UeberbrueckungEVUnterbrechung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Ueberbrueckung_EV_Unterbrechung'"
	 * @generated
	 */
	Ueberbrueckung_EV_Unterbrechung_TypeClass getUeberbrueckungEVUnterbrechung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Schaltkasten_Energie_AttributeGroup#getUeberbrueckungEVUnterbrechung <em>Ueberbrueckung EV Unterbrechung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ueberbrueckung EV Unterbrechung</em>' containment reference.
	 * @see #getUeberbrueckungEVUnterbrechung()
	 * @generated
	 */
	void setUeberbrueckungEVUnterbrechung(Ueberbrueckung_EV_Unterbrechung_TypeClass value);

} // LEU_Schaltkasten_Energie_AttributeGroup
