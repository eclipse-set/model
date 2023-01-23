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

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model11001.Verweise.ID_Aussenelementansteuerung_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Gleis_Abschnitt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FMA Anlage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Technische Anlage, die einen Gleisabschnitt auf Freisein von Schienenfahrzeugen überwacht; entspricht im gewöhnlichen Sprachgebrauch dem Freimeldeabschnitt. Eine FMA_Anlage wird alleinstehend zur Fahrwegfreiprüfung bzw. zur Freiprüfung des Flankenschutzraumes genutzt sowie in Auswertung der Reihenfolge von Belegung und Wieder-Frei-Werden zur Erfassung einer Fahrt und damit zur Auflösung von Teilfahrstraßen. Auch andere Schaltvorgänge können durch eine FMA_Anlage ausgelöst werden. Die FMA_Anlage hat mindestens eine Außenanlage (z. B. Drosselspule, Achszählpunkt) und beansprucht Anteile an einer Gleisfreimelde-Innenanlage (z. B. Motorrelaisgruppe, Achszählrechner). DB-Regelwerk Typspezifische Planungshinweise und Technische Mitteilungen; Planungsdaten: Sicherungstechnischer Lageplan, BÜ-Lageplan; Gleisfreimeldepläne (Achszählübersichtsplan, Gleisisolierplan); Freimeldetabelle.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage#getFMAAnlageAllg <em>FMA Anlage Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage#getFMAAnlageElektrMerkmale <em>FMA Anlage Elektr Merkmale</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage#getFMAAnlageKaskade <em>FMA Anlage Kaskade</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage#getFMAAnlageUebertragungFMinfo <em>FMA Anlage Uebertragung FMinfo</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage#getIDGleisAbschnitt <em>ID Gleis Abschnitt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage#getIDGleisfreimeldeInnenanlage <em>ID Gleisfreimelde Innenanlage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Ortung.OrtungPackage#getFMA_Anlage()
 * @model extendedMetaData="name='CFMA_Anlage' kind='elementOnly'"
 * @generated
 */
public interface FMA_Anlage extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle über Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht möglich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es möglich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und Übersichtsplan, BÜ-Lageplan Planungstabellen 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(FMA_Anlage_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Ortung.OrtungPackage#getFMA_Anlage_Bezeichnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	FMA_Anlage_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(FMA_Anlage_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>FMA Anlage Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FMA Anlage Allg</em>' containment reference.
	 * @see #setFMAAnlageAllg(FMA_Anlage_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Ortung.OrtungPackage#getFMA_Anlage_FMAAnlageAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FMA_Anlage_Allg'"
	 * @generated
	 */
	FMA_Anlage_Allg_AttributeGroup getFMAAnlageAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage#getFMAAnlageAllg <em>FMA Anlage Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FMA Anlage Allg</em>' containment reference.
	 * @see #getFMAAnlageAllg()
	 * @generated
	 */
	void setFMAAnlageAllg(FMA_Anlage_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>FMA Anlage Elektr Merkmale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FMA Anlage Elektr Merkmale</em>' containment reference.
	 * @see #setFMAAnlageElektrMerkmale(FMA_Anlage_Elektr_Merkmale_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Ortung.OrtungPackage#getFMA_Anlage_FMAAnlageElektrMerkmale()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FMA_Anlage_Elektr_Merkmale'"
	 * @generated
	 */
	FMA_Anlage_Elektr_Merkmale_AttributeGroup getFMAAnlageElektrMerkmale();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage#getFMAAnlageElektrMerkmale <em>FMA Anlage Elektr Merkmale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FMA Anlage Elektr Merkmale</em>' containment reference.
	 * @see #getFMAAnlageElektrMerkmale()
	 * @generated
	 */
	void setFMAAnlageElektrMerkmale(FMA_Anlage_Elektr_Merkmale_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>FMA Anlage Kaskade</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FMA Anlage Kaskade</em>' containment reference.
	 * @see #setFMAAnlageKaskade(FMA_Anlage_Kaskade_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Ortung.OrtungPackage#getFMA_Anlage_FMAAnlageKaskade()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FMA_Anlage_Kaskade'"
	 * @generated
	 */
	FMA_Anlage_Kaskade_AttributeGroup getFMAAnlageKaskade();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage#getFMAAnlageKaskade <em>FMA Anlage Kaskade</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FMA Anlage Kaskade</em>' containment reference.
	 * @see #getFMAAnlageKaskade()
	 * @generated
	 */
	void setFMAAnlageKaskade(FMA_Anlage_Kaskade_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>FMA Anlage Uebertragung FMinfo</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FMA Anlage Uebertragung FMinfo</em>' containment reference.
	 * @see #setFMAAnlageUebertragungFMinfo(FMA_Anlage_Uebertragung_FMinfo_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Ortung.OrtungPackage#getFMA_Anlage_FMAAnlageUebertragungFMinfo()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FMA_Anlage_Uebertragung_FMinfo'"
	 * @generated
	 */
	FMA_Anlage_Uebertragung_FMinfo_AttributeGroup getFMAAnlageUebertragungFMinfo();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage#getFMAAnlageUebertragungFMinfo <em>FMA Anlage Uebertragung FMinfo</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FMA Anlage Uebertragung FMinfo</em>' containment reference.
	 * @see #getFMAAnlageUebertragungFMinfo()
	 * @generated
	 */
	void setFMAAnlageUebertragungFMinfo(FMA_Anlage_Uebertragung_FMinfo_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Gleis Abschnitt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gleis_Abschnitt, der auf Freisein von Schienenfahrzeugen überwacht wird. DB-Regelwerk Sicherungstechnischer Lageplan, BÜ-Lageplan 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Gleis Abschnitt</em>' containment reference.
	 * @see #setIDGleisAbschnitt(ID_Gleis_Abschnitt_TypeClass)
	 * @see org.eclipse.set.model.model11001.Ortung.OrtungPackage#getFMA_Anlage_IDGleisAbschnitt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Gleis_Abschnitt'"
	 * @generated
	 */
	ID_Gleis_Abschnitt_TypeClass getIDGleisAbschnitt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage#getIDGleisAbschnitt <em>ID Gleis Abschnitt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Gleis Abschnitt</em>' containment reference.
	 * @see #getIDGleisAbschnitt()
	 * @generated
	 */
	void setIDGleisAbschnitt(ID_Gleis_Abschnitt_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Gleisfreimelde Innenanlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf eine Aussenelementansteuerung, die die logische Aufbereitung der Daten der FMA Anlage (primär zur Information frei/belegt) übernimmt. Im Fall, dass der Achszählrechner direkt einem ESTW-A zugeordnet ist, wird auf eine Aussenelementansteuerung der Art \"ESTW_A\" verwiesen. Sofern ein separat stehender Achszählrechner vorgesehen ist, erfolgt der Verweis auf eine Aussenelementansteuerung der Art \"Gleisfreimelde_Innennanlage\". Die Unterbringung dieser Außenelementansteuerung muss nicht zwingend identisch mit der Unterbringung der Außenelementansteuerung sein, die die Ergebnisse der Gleisfreimelde-Innenanlage verwertet. Bei Achszählanlagen gilt speziell: Zusätzlich muss auch noch die Außenelementansteuerung bekannt sein, an die die zugehörigen Achszähler angeschlossen sind, siehe dazu die Attribute des Objekts FMA Komponente. DB-Regelwerk Im bisherigen PT1 ohne eindeutige Darstellung. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Gleisfreimelde Innenanlage</em>' containment reference.
	 * @see #setIDGleisfreimeldeInnenanlage(ID_Aussenelementansteuerung_TypeClass)
	 * @see org.eclipse.set.model.model11001.Ortung.OrtungPackage#getFMA_Anlage_IDGleisfreimeldeInnenanlage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Gleisfreimelde_Innenanlage'"
	 * @generated
	 */
	ID_Aussenelementansteuerung_TypeClass getIDGleisfreimeldeInnenanlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ortung.FMA_Anlage#getIDGleisfreimeldeInnenanlage <em>ID Gleisfreimelde Innenanlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Gleisfreimelde Innenanlage</em>' containment reference.
	 * @see #getIDGleisfreimeldeInnenanlage()
	 * @generated
	 */
	void setIDGleisfreimeldeInnenanlage(ID_Aussenelementansteuerung_TypeClass value);

} // FMA_Anlage
