/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Geodaten;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hoehenpunkt Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Hoehenpunkt_Allg_AttributeGroup#getGEOPAD <em>GEOPAD</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Hoehenpunkt_Allg_AttributeGroup#getHoehenpunktDatum <em>Hoehenpunkt Datum</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Hoehenpunkt_Allg_AttributeGroup#getHoehenpunktHoehe <em>Hoehenpunkt Hoehe</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Hoehenpunkt_Allg_AttributeGroup#getHSystem <em>HSystem</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Hoehenpunkt_Allg_AttributeGroup#getNeigung <em>Neigung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Hoehenpunkt_Allg_AttributeGroup#getPlanQuelle <em>Plan Quelle</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getHoehenpunkt_Allg_AttributeGroup()
 * @model extendedMetaData="name='CHoehenpunkt_Allg' kind='elementOnly'"
 * @generated
 */
public interface Hoehenpunkt_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>GEOPAD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung der topografischen Punktadresse. Die Punktadresse wird aus dem DB-GIS für jeden Vermessungspunkt bereitgestellt. Eine PAD kann in verschiedenen Koordinatensystemen liegen (GEO_Punkt). Die Verwendung ist zum Abgleich mit dem GIS-System der DB Netz AG erforderlich. Bei Neutrassierungen existiert noch keine PAD-Angabe. Dann wird hier die Bezeichnung des Knotens aus dieser Neutrassierung eingetragen. Wenn Daten händisch (z.B. von Ivl-Plänen nachgezeichnet) erstellt wurden, wird das Attribut nicht befüllt. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GEOPAD</em>' containment reference.
	 * @see #setGEOPAD(GEO_PAD_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getHoehenpunkt_Allg_AttributeGroup_GEOPAD()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GEO_PAD'"
	 * @generated
	 */
	GEO_PAD_TypeClass getGEOPAD();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Hoehenpunkt_Allg_AttributeGroup#getGEOPAD <em>GEOPAD</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GEOPAD</em>' containment reference.
	 * @see #getGEOPAD()
	 * @generated
	 */
	void setGEOPAD(GEO_PAD_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Hoehenpunkt Datum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aufnahmedatum der Höhenwerte des Hoehenpunktes. GND: Punktdatum; Ivl und Ivmg: Datum der letzten Bearbeitung; Kopie: Datum aus kopierter Höhe; Neutrassierung: Freigabedatum; sonstige: Datum der letzten Bearbeitung.
	 * Die Information wird zukünftig über das Attribut Datum_Regelwerk abgebildet. Das Attribut soll daher langfristig entfallen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hoehenpunkt Datum</em>' containment reference.
	 * @see #setHoehenpunktDatum(Hoehenpunkt_Datum_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getHoehenpunkt_Allg_AttributeGroup_HoehenpunktDatum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Hoehenpunkt_Datum'"
	 * @generated
	 */
	Hoehenpunkt_Datum_TypeClass getHoehenpunktDatum();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Hoehenpunkt_Allg_AttributeGroup#getHoehenpunktDatum <em>Hoehenpunkt Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hoehenpunkt Datum</em>' containment reference.
	 * @see #getHoehenpunktDatum()
	 * @generated
	 */
	void setHoehenpunktDatum(Hoehenpunkt_Datum_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Hoehenpunkt Hoehe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der Höhe bezogen auf das Höhensystem in Meter. Genauigkeit: Tausendstel m = 1 mm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hoehenpunkt Hoehe</em>' containment reference.
	 * @see #setHoehenpunktHoehe(Hoehenpunkt_Hoehe_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getHoehenpunkt_Allg_AttributeGroup_HoehenpunktHoehe()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Hoehenpunkt_Hoehe'"
	 * @generated
	 */
	Hoehenpunkt_Hoehe_TypeClass getHoehenpunktHoehe();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Hoehenpunkt_Allg_AttributeGroup#getHoehenpunktHoehe <em>Hoehenpunkt Hoehe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hoehenpunkt Hoehe</em>' containment reference.
	 * @see #getHoehenpunktHoehe()
	 * @generated
	 */
	void setHoehenpunktHoehe(Hoehenpunkt_Hoehe_TypeClass value);

	/**
	 * Returns the value of the '<em><b>HSystem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, auf welchem Höhensystem die Angabe der Höhe beruht. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>HSystem</em>' containment reference.
	 * @see #setHSystem(HSystem_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getHoehenpunkt_Allg_AttributeGroup_HSystem()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='HSystem'"
	 * @generated
	 */
	HSystem_TypeClass getHSystem();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Hoehenpunkt_Allg_AttributeGroup#getHSystem <em>HSystem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HSystem</em>' containment reference.
	 * @see #getHSystem()
	 * @generated
	 */
	void setHSystem(HSystem_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Neigung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Neigung des Gleises bzw. der Hoehenlinie am Ort des Hoehenpunkts. Die Art der Neigung (Steigung/Gefälle) muss durch Auswertung der Wirkrichtung ermittelt werden. Die Angabe ist nur bei Vorhandensein einer Höhenlinie sinnvoll.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Neigung</em>' containment reference.
	 * @see #setNeigung(Neigung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getHoehenpunkt_Allg_AttributeGroup_Neigung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Neigung'"
	 * @generated
	 */
	Neigung_TypeClass getNeigung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Hoehenpunkt_Allg_AttributeGroup#getNeigung <em>Neigung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Neigung</em>' containment reference.
	 * @see #getNeigung()
	 * @generated
	 */
	void setNeigung(Neigung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Plan Quelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quelle der Geo-Kante, des Geo-Knotens, des Höhenpunkts, der Höhenlinie, der Überhöhung bzw. der Überhöhungslinie. Bei Auswahl von „sonstige“ ist zwingend ein Bearbeitungsvermerk anzugeben. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plan Quelle</em>' containment reference.
	 * @see #setPlanQuelle(Plan_Quelle_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getHoehenpunkt_Allg_AttributeGroup_PlanQuelle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Plan_Quelle'"
	 * @generated
	 */
	Plan_Quelle_TypeClass getPlanQuelle();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Hoehenpunkt_Allg_AttributeGroup#getPlanQuelle <em>Plan Quelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan Quelle</em>' containment reference.
	 * @see #getPlanQuelle()
	 * @generated
	 */
	void setPlanQuelle(Plan_Quelle_TypeClass value);

} // Hoehenpunkt_Allg_AttributeGroup
