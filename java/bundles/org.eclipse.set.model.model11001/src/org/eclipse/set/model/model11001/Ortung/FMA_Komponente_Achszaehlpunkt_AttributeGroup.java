/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Ortung;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model11001.Verweise.ID_Aussenelementansteuerung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FMA Komponente Achszaehlpunkt Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Achszaehlpunkt_AttributeGroup#getFMAKomponenteSchienenprofil <em>FMA Komponente Schienenprofil</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Achszaehlpunkt_AttributeGroup#getFMAKomponenteStromversorgung <em>FMA Komponente Stromversorgung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Achszaehlpunkt_AttributeGroup#getFMAKomponenteTyp <em>FMA Komponente Typ</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Achszaehlpunkt_AttributeGroup#getIDEnergie <em>ID Energie</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Achszaehlpunkt_AttributeGroup#getIDInformation <em>ID Information</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Ortung.OrtungPackage#getFMA_Komponente_Achszaehlpunkt_AttributeGroup()
 * @model extendedMetaData="name='CFMA_Komponente_Achszaehlpunkt' kind='elementOnly'"
 * @generated
 */
public interface FMA_Komponente_Achszaehlpunkt_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>FMA Komponente Schienenprofil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hinsichtlich der Befestigung zu berücksichtigendes Schienenprofil. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FMA Komponente Schienenprofil</em>' containment reference.
	 * @see #setFMAKomponenteSchienenprofil(FMA_Komponente_Schienenprofil_TypeClass)
	 * @see org.eclipse.set.model.model11001.Ortung.OrtungPackage#getFMA_Komponente_Achszaehlpunkt_AttributeGroup_FMAKomponenteSchienenprofil()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FMA_Komponente_Schienenprofil'"
	 * @generated
	 */
	FMA_Komponente_Schienenprofil_TypeClass getFMAKomponenteSchienenprofil();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Achszaehlpunkt_AttributeGroup#getFMAKomponenteSchienenprofil <em>FMA Komponente Schienenprofil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FMA Komponente Schienenprofil</em>' containment reference.
	 * @see #getFMAKomponenteSchienenprofil()
	 * @generated
	 */
	void setFMAKomponenteSchienenprofil(FMA_Komponente_Schienenprofil_TypeClass value);

	/**
	 * Returns the value of the '<em><b>FMA Komponente Stromversorgung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kennzeichnet den Weg der Stromversorgung im Vergleich mit dem Weg der Informationsübertragung. Die Angabe ist nur bei Achszählpunkten erforderlich. Wertezuordnung: true - entspricht dem Eintrag \"fern\" im bisherigen PT 1 (Stromversorgung in separaten Adern), hierbei müssen ID Energie und ID Information auf unterschiedliche Außenelementansteuerungen verweisen, false - entspricht den Einträgen \"eigen\" und \"fremd\" im bisherigen PT 1 (Stromversorgung und Informationsübertragung über die selben Adern), die weitere Unterscheidung zwischen \"eigen\" und \"fremd\" geht aus dem Vergleich von ID Energie und ID Information hervor. DB-Regelwerk Achszähltabelle, Spalte 3 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FMA Komponente Stromversorgung</em>' containment reference.
	 * @see #setFMAKomponenteStromversorgung(FMA_Komponente_Stromversorgung_TypeClass)
	 * @see org.eclipse.set.model.model11001.Ortung.OrtungPackage#getFMA_Komponente_Achszaehlpunkt_AttributeGroup_FMAKomponenteStromversorgung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FMA_Komponente_Stromversorgung'"
	 * @generated
	 */
	FMA_Komponente_Stromversorgung_TypeClass getFMAKomponenteStromversorgung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Achszaehlpunkt_AttributeGroup#getFMAKomponenteStromversorgung <em>FMA Komponente Stromversorgung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FMA Komponente Stromversorgung</em>' containment reference.
	 * @see #getFMAKomponenteStromversorgung()
	 * @generated
	 */
	void setFMAKomponenteStromversorgung(FMA_Komponente_Stromversorgung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>FMA Komponente Typ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Technische Typbezeichnung. Ist nur bei Achszählpunkten erforderlich. Beispiele: RSR 122, ZP 30H, ZP 43. DB-Regelwerk Achszähltabelle, Spalte 2
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FMA Komponente Typ</em>' containment reference.
	 * @see #setFMAKomponenteTyp(FMA_Komponente_Typ_TypeClass)
	 * @see org.eclipse.set.model.model11001.Ortung.OrtungPackage#getFMA_Komponente_Achszaehlpunkt_AttributeGroup_FMAKomponenteTyp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FMA_Komponente_Typ'"
	 * @generated
	 */
	FMA_Komponente_Typ_TypeClass getFMAKomponenteTyp();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Achszaehlpunkt_AttributeGroup#getFMAKomponenteTyp <em>FMA Komponente Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FMA Komponente Typ</em>' containment reference.
	 * @see #getFMAKomponenteTyp()
	 * @generated
	 */
	void setFMAKomponenteTyp(FMA_Komponente_Typ_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Energie</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Aussenelementansteuerung, von der die Energieversorgung des Stellelements oder der FMA Komponente erfolgt. Objekte, die Stellelemente\" href=\"//Stellelement\"\u003eStellelemente sind, enthalten keine eigenen Attribute ID_Energie und ID Information, sondern verweisen auf das Objekt Stellelement, das diese Attribute enthält. Nicht-Stellelemente (z. B. der Achszählpunkt als FMA Komponente) hingegen müssen diese Attribute selbst enthalten. DB-Regelwerk bei Achszählpunkten: Achszählpunkttabelle, Spalte 4 (und redundant dazu: Freimeldetabelle, Spalte 4); bei anderen Typen von Freimeldeanlagen: im bisherigen PT1 ohne eindeutige Darstellung, in der Regel mittelbar aus dem Sicherungstechnischen Lageplan/BÜ-Lageplan ermittelbar. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Energie</em>' containment reference.
	 * @see #setIDEnergie(ID_Aussenelementansteuerung_TypeClass)
	 * @see org.eclipse.set.model.model11001.Ortung.OrtungPackage#getFMA_Komponente_Achszaehlpunkt_AttributeGroup_IDEnergie()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Energie'"
	 * @generated
	 */
	ID_Aussenelementansteuerung_TypeClass getIDEnergie();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente_Achszaehlpunkt_AttributeGroup#getIDEnergie <em>ID Energie</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Energie</em>' containment reference.
	 * @see #getIDEnergie()
	 * @generated
	 */
	void setIDEnergie(ID_Aussenelementansteuerung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Information</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.Verweise.ID_Aussenelementansteuerung_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Aussenelementansteuerung, von der die Informationsversorgung des Stellelements bzw. die Informationsverarbeitung der FMA Komponente erfolgt. Objekte, die Stellelemente\" href=\"//Stellelement\"\u003eStellelemente sind, enthalten keine eigenen Attribute ID Energie und ID_Information, sondern verweisen auf das Objekt Stellelement, das diese Attribute enthält. Nicht-Stellelemente (z.B. der Achszählpunkt als FMA Komponente) hingegen müssen diese Attribute selbst enthalten. DB-Regelwerk Im bisherigen PT1 ohne eindeutige Darstellung. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Information</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.Ortung.OrtungPackage#getFMA_Komponente_Achszaehlpunkt_AttributeGroup_IDInformation()
	 * @model containment="true" required="true" upper="2"
	 *        extendedMetaData="kind='element' name='ID_Information'"
	 * @generated
	 */
	EList<ID_Aussenelementansteuerung_TypeClass> getIDInformation();

} // FMA_Komponente_Achszaehlpunkt_AttributeGroup
