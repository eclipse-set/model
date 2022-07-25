/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Schluesselabhaengigkeiten;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_Schluessel_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schloss</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Mechanisches Bauelement, das durch das Ein- oder Ausschließen eines Schlüssels einen Riegel aus- oder einfahren lässt bzw. einen elektrischen Kontakt schließt oder öffnet. Je nach verschlossenem Element wird die entsprechende Attributgruppe ausgewählt: Bahnübergang, Gleissperre, Schlosskombination, Sonderanlage (z. B. bewegliche Brücke), Schlüsselsperre, Weiche. DB-Regelwerk Auf dem Lageplan werden nach 819.9002 3 dargestellt: Schlösser durch ein Symbol (z. B. Schlüsselsperre) oder zusätzliche Angaben zu anderen Symbolen (z. B. Weiche); Abhängigkeiten durch eine Zeichnung mit wiederholter Darstellung der Schlossstellungen als gefülltes oder leeres Schlüsselloch. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss#getIDSchluessel <em>ID Schluessel</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss#getSchluesselInGrdstEingeschl <em>Schluessel In Grdst Eingeschl</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss#getSchlossBUE <em>Schloss BUE</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss#getSchlossGsp <em>Schloss Gsp</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss#getSchlossSk <em>Schloss Sk</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss#getSchlossSonderanlage <em>Schloss Sonderanlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss#getSchlossSsp <em>Schloss Ssp</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss#getSchlossW <em>Schloss W</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss#getTechnischBerechtigter <em>Technisch Berechtigter</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss()
 * @model extendedMetaData="name='CSchloss' kind='elementOnly'"
 * @generated
 */
public interface Schloss extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Schloss_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Schloss_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Schloss_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Schluessel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den zum Schloss gehörigen Schlüssel. DB-Regelwerk Lageplan, Logische Darstellung der Schlüsselabhängigkeit
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Schluessel</em>' containment reference.
	 * @see #setIDSchluessel(ID_Schluessel_TypeClass)
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_IDSchluessel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Schluessel'"
	 * @generated
	 */
	ID_Schluessel_TypeClass getIDSchluessel();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss#getIDSchluessel <em>ID Schluessel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Schluessel</em>' containment reference.
	 * @see #getIDSchluessel()
	 * @generated
	 */
	void setIDSchluessel(ID_Schluessel_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Schluessel In Grdst Eingeschl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Schlüssel ist in Grundstellung eingeschlossen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schluessel In Grdst Eingeschl</em>' containment reference.
	 * @see #setSchluesselInGrdstEingeschl(Schluessel_In_Grdst_Eingeschl_TypeClass)
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_SchluesselInGrdstEingeschl()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Schluessel_In_Grdst_Eingeschl'"
	 * @generated
	 */
	Schluessel_In_Grdst_Eingeschl_TypeClass getSchluesselInGrdstEingeschl();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss#getSchluesselInGrdstEingeschl <em>Schluessel In Grdst Eingeschl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schluessel In Grdst Eingeschl</em>' containment reference.
	 * @see #getSchluesselInGrdstEingeschl()
	 * @generated
	 */
	void setSchluesselInGrdstEingeschl(Schluessel_In_Grdst_Eingeschl_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Schloss BUE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schloss BUE</em>' containment reference.
	 * @see #setSchlossBUE(Schloss_BUE_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_SchlossBUE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Schloss_BUE'"
	 * @generated
	 */
	Schloss_BUE_AttributeGroup getSchlossBUE();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss#getSchlossBUE <em>Schloss BUE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schloss BUE</em>' containment reference.
	 * @see #getSchlossBUE()
	 * @generated
	 */
	void setSchlossBUE(Schloss_BUE_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Schloss Gsp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schloss Gsp</em>' containment reference.
	 * @see #setSchlossGsp(Schloss_Gsp_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_SchlossGsp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Schloss_Gsp'"
	 * @generated
	 */
	Schloss_Gsp_AttributeGroup getSchlossGsp();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss#getSchlossGsp <em>Schloss Gsp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schloss Gsp</em>' containment reference.
	 * @see #getSchlossGsp()
	 * @generated
	 */
	void setSchlossGsp(Schloss_Gsp_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Schloss Sk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schloss Sk</em>' containment reference.
	 * @see #setSchlossSk(Schloss_Sk_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_SchlossSk()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Schloss_Sk'"
	 * @generated
	 */
	Schloss_Sk_AttributeGroup getSchlossSk();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss#getSchlossSk <em>Schloss Sk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schloss Sk</em>' containment reference.
	 * @see #getSchlossSk()
	 * @generated
	 */
	void setSchlossSk(Schloss_Sk_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Schloss Sonderanlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schloss Sonderanlage</em>' containment reference.
	 * @see #setSchlossSonderanlage(Schloss_Sonderanlage_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_SchlossSonderanlage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Schloss_Sonderanlage'"
	 * @generated
	 */
	Schloss_Sonderanlage_AttributeGroup getSchlossSonderanlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss#getSchlossSonderanlage <em>Schloss Sonderanlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schloss Sonderanlage</em>' containment reference.
	 * @see #getSchlossSonderanlage()
	 * @generated
	 */
	void setSchlossSonderanlage(Schloss_Sonderanlage_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Schloss Ssp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schloss Ssp</em>' containment reference.
	 * @see #setSchlossSsp(Schloss_Ssp_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_SchlossSsp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Schloss_Ssp'"
	 * @generated
	 */
	Schloss_Ssp_AttributeGroup getSchlossSsp();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss#getSchlossSsp <em>Schloss Ssp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schloss Ssp</em>' containment reference.
	 * @see #getSchlossSsp()
	 * @generated
	 */
	void setSchlossSsp(Schloss_Ssp_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Schloss W</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schloss W</em>' containment reference.
	 * @see #setSchlossW(Schloss_W_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_SchlossW()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Schloss_W'"
	 * @generated
	 */
	Schloss_W_AttributeGroup getSchlossW();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss#getSchlossW <em>Schloss W</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schloss W</em>' containment reference.
	 * @see #getSchlossW()
	 * @generated
	 */
	void setSchlossW(Schloss_W_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Technisch Berechtigter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Aufbewahrung des Schlüssels beim Technisch Berechtigten (true). Der Wert \"false\" wird nicht verwendet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Technisch Berechtigter</em>' containment reference.
	 * @see #setTechnischBerechtigter(Technisch_Berechtigter_TypeClass)
	 * @see org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchloss_TechnischBerechtigter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Technisch_Berechtigter'"
	 * @generated
	 */
	Technisch_Berechtigter_TypeClass getTechnischBerechtigter();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.Schloss#getTechnischBerechtigter <em>Technisch Berechtigter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Technisch Berechtigter</em>' containment reference.
	 * @see #getTechnischBerechtigter()
	 * @generated
	 */
	void setTechnischBerechtigter(Technisch_Berechtigter_TypeClass value);

} // Schloss
