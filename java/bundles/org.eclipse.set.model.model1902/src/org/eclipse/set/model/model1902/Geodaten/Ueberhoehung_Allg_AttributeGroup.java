/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Geodaten;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ueberhoehung Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehung_Allg_AttributeGroup#getGEOPAD <em>GEOPAD</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehung_Allg_AttributeGroup#getPlanQuelle <em>Plan Quelle</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehung_Allg_AttributeGroup#getUeberhoehungDatum <em>Ueberhoehung Datum</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehung_Allg_AttributeGroup#getUeberhoehungHoehe <em>Ueberhoehung Hoehe</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage#getUeberhoehung_Allg_AttributeGroup()
 * @model extendedMetaData="name='CUeberhoehung_Allg' kind='elementOnly'"
 * @generated
 */
public interface Ueberhoehung_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>GEOPAD</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung der topografischen Punktadresse. Die Punktadresse wird aus dem DB-GIS für jeden Vermessungspunkt bereitgestellt. Eine PAD kann in verschiedenen Koordinatensystemen liegen (GEO_Punkt). Die Verwendung ist zum Abgleich mit dem GIS-System der DB Netz AG erforderlich. Bei Neutrassierungen existiert noch keine PAD-Angabe. Dann wird hier die Bezeichnung des Knotens aus dieser Neutrassierung eingetragen. Wenn Daten händisch (z.B. von Ivl-Plänen nachgezeichnet) erstellt wurden, wird das Attribut nicht befüllt. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GEOPAD</em>' containment reference.
	 * @see #setGEOPAD(GEO_PAD_TypeClass)
	 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage#getUeberhoehung_Allg_AttributeGroup_GEOPAD()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GEO_PAD'"
	 * @generated
	 */
	GEO_PAD_TypeClass getGEOPAD();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehung_Allg_AttributeGroup#getGEOPAD <em>GEOPAD</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GEOPAD</em>' containment reference.
	 * @see #getGEOPAD()
	 * @generated
	 */
	void setGEOPAD(GEO_PAD_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Plan Quelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Quelle der Geo-Kante, des Geo-Knotens, des Höhenpunkts, der Höhenlinie, der Überhöhung bzw. der Überhöhungslinie. Bei Auswahl von „sonstige“ ist zwingend ein Bearbeitungsvermerk anzugeben. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Plan Quelle</em>' containment reference.
	 * @see #setPlanQuelle(Plan_Quelle_TypeClass)
	 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage#getUeberhoehung_Allg_AttributeGroup_PlanQuelle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Plan_Quelle'"
	 * @generated
	 */
	Plan_Quelle_TypeClass getPlanQuelle();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehung_Allg_AttributeGroup#getPlanQuelle <em>Plan Quelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan Quelle</em>' containment reference.
	 * @see #getPlanQuelle()
	 * @generated
	 */
	void setPlanQuelle(Plan_Quelle_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Ueberhoehung Datum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aufnahmedatum der Koordinaten der Überhöhung. GND: Punktdatum; Ivl und Ivmg: Datum der letzten Bearbeitung; Kopie: Datum aus kopierter Höhe; Neutrassierung: Freigabedatum; sonstige: Datum der letzten Bearbeitung. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ueberhoehung Datum</em>' containment reference.
	 * @see #setUeberhoehungDatum(Ueberhoehung_Datum_TypeClass)
	 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage#getUeberhoehung_Allg_AttributeGroup_UeberhoehungDatum()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Ueberhoehung_Datum'"
	 * @generated
	 */
	Ueberhoehung_Datum_TypeClass getUeberhoehungDatum();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehung_Allg_AttributeGroup#getUeberhoehungDatum <em>Ueberhoehung Datum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ueberhoehung Datum</em>' containment reference.
	 * @see #getUeberhoehungDatum()
	 * @generated
	 */
	void setUeberhoehungDatum(Ueberhoehung_Datum_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Ueberhoehung Hoehe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Höhendifferenz in Querrichtung eines Gleises zwischen beiden Schienen. Genauigkeit: Tausendstel m = 1 mm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ueberhoehung Hoehe</em>' containment reference.
	 * @see #setUeberhoehungHoehe(Ueberhoehung_Hoehe_TypeClass)
	 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage#getUeberhoehung_Allg_AttributeGroup_UeberhoehungHoehe()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Ueberhoehung_Hoehe'"
	 * @generated
	 */
	Ueberhoehung_Hoehe_TypeClass getUeberhoehungHoehe();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Geodaten.Ueberhoehung_Allg_AttributeGroup#getUeberhoehungHoehe <em>Ueberhoehung Hoehe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ueberhoehung Hoehe</em>' containment reference.
	 * @see #getUeberhoehungHoehe()
	 * @generated
	 */
	void setUeberhoehungHoehe(Ueberhoehung_Hoehe_TypeClass value);

} // Ueberhoehung_Allg_AttributeGroup
