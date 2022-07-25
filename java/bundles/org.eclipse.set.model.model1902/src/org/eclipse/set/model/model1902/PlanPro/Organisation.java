/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.PlanPro;

import org.eclipse.set.model.model1902.Basisobjekte.Ur_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organisation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Angabe einer am PlanPro-Planungsprozess beteiligten Organisation.\nDerzeit insbesondere verwendet zur Abbildung des beteiligten Ingenieurbüros.\nBisher werden in PlanPro lediglich Name und Kontaktdaten der Organisation erfasst. Die Vergabe von Berechtigungen erfolgt in der Prozessrolle des LST-Fachplaners im Zusammenhang mit den definierten Planungsschritten und Planungsstatus.\nDB-Regelwerk\nSchriftfeldeintrag gemäß Ril 819.0103.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Organisation#getAdressePLZOrt <em>Adresse PLZ Ort</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Organisation#getAdresseStrasseNr <em>Adresse Strasse Nr</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Organisation#getEMailAdresse <em>EMail Adresse</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Organisation#getNameOrganisation <em>Name Organisation</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Organisation#getOrganisationseinheit <em>Organisationseinheit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PlanPro.Organisation#getTelefonnummer <em>Telefonnummer</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getOrganisation()
 * @model extendedMetaData="name='COrganisation' kind='elementOnly'"
 * @generated
 */
public interface Organisation extends Ur_Objekt {
	/**
	 * Returns the value of the '<em><b>Adresse PLZ Ort</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adresse der Organisation, Postleitzahl, Ort.\nDB Regelwerk\nGgf. Bestandteil des Schriftfeldeintrages gemäß Ril 819.0103 zum mit der Planung beauftragten Ingenieurbüro.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adresse PLZ Ort</em>' containment reference.
	 * @see #setAdressePLZOrt(Adresse_PLZ_Ort_TypeClass)
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getOrganisation_AdressePLZOrt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Adresse_PLZ_Ort'"
	 * @generated
	 */
	Adresse_PLZ_Ort_TypeClass getAdressePLZOrt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PlanPro.Organisation#getAdressePLZOrt <em>Adresse PLZ Ort</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adresse PLZ Ort</em>' containment reference.
	 * @see #getAdressePLZOrt()
	 * @generated
	 */
	void setAdressePLZOrt(Adresse_PLZ_Ort_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Adresse Strasse Nr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Adresse der Organisation, konkret Straße und Hausnummer. Alternativ ist auch die Eintragung des Postfachs möglich.\nDB Regelwerk\nGgf. Bestandteil des Schriftfeldeintrages gemäß Ril 819.0103 zum mit der Planung beauftragten Ingenieurbüro.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adresse Strasse Nr</em>' containment reference.
	 * @see #setAdresseStrasseNr(Adresse_Strasse_Nr_TypeClass)
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getOrganisation_AdresseStrasseNr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Adresse_Strasse_Nr'"
	 * @generated
	 */
	Adresse_Strasse_Nr_TypeClass getAdresseStrasseNr();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PlanPro.Organisation#getAdresseStrasseNr <em>Adresse Strasse Nr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adresse Strasse Nr</em>' containment reference.
	 * @see #getAdresseStrasseNr()
	 * @generated
	 */
	void setAdresseStrasseNr(Adresse_Strasse_Nr_TypeClass value);

	/**
	 * Returns the value of the '<em><b>EMail Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * E-Mail-Adresse der Organisation.\nDB Regelwerk\nGgf. Bestandteil des Schriftfeldeintrages gemäß Ril 819.0103 zum mit der Planung beauftragten Ingenieurbüro.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>EMail Adresse</em>' containment reference.
	 * @see #setEMailAdresse(E_Mail_Adresse_TypeClass)
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getOrganisation_EMailAdresse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='E_Mail_Adresse'"
	 * @generated
	 */
	E_Mail_Adresse_TypeClass getEMailAdresse();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PlanPro.Organisation#getEMailAdresse <em>EMail Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EMail Adresse</em>' containment reference.
	 * @see #getEMailAdresse()
	 * @generated
	 */
	void setEMailAdresse(E_Mail_Adresse_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Name Organisation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Name der Organisation.\nDB Regelwerk\nSchriftfeldeintrag des mit der Planung beauftragten Ingenieurbüros gemäß Ril 819.0103.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Organisation</em>' containment reference.
	 * @see #setNameOrganisation(Name_Organisation_TypeClass)
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getOrganisation_NameOrganisation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Name_Organisation'"
	 * @generated
	 */
	Name_Organisation_TypeClass getNameOrganisation();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PlanPro.Organisation#getNameOrganisation <em>Name Organisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Organisation</em>' containment reference.
	 * @see #getNameOrganisation()
	 * @generated
	 */
	void setNameOrganisation(Name_Organisation_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Organisationseinheit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Organisationseinheit bzw. Abteilung der Organisationseinheit.\nDB Regelwerk\nGgf. Bestandteil des Schriftfeldeintrages gemäß Ril 819.0103 zum mit der Planung beauftragten Ingenieurbüro.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Organisationseinheit</em>' containment reference.
	 * @see #setOrganisationseinheit(Organisationseinheit_TypeClass)
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getOrganisation_Organisationseinheit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Organisationseinheit'"
	 * @generated
	 */
	Organisationseinheit_TypeClass getOrganisationseinheit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PlanPro.Organisation#getOrganisationseinheit <em>Organisationseinheit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Organisationseinheit</em>' containment reference.
	 * @see #getOrganisationseinheit()
	 * @generated
	 */
	void setOrganisationseinheit(Organisationseinheit_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Telefonnummer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Telefonnummer der Organisation.\nDB Regelwerk\nGgf. Bestandteil des Schriftfeldeintrages gemäß Ril 819.0103 zum mit der Planung beauftragten Ingenieurbüro.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telefonnummer</em>' containment reference.
	 * @see #setTelefonnummer(Telefonnummer_TypeClass)
	 * @see org.eclipse.set.model.model1902.PlanPro.PlanProPackage#getOrganisation_Telefonnummer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Telefonnummer'"
	 * @generated
	 */
	Telefonnummer_TypeClass getTelefonnummer();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PlanPro.Organisation#getTelefonnummer <em>Telefonnummer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telefonnummer</em>' containment reference.
	 * @see #getTelefonnummer()
	 * @generated
	 */
	void setTelefonnummer(Telefonnummer_TypeClass value);

} // Organisation
