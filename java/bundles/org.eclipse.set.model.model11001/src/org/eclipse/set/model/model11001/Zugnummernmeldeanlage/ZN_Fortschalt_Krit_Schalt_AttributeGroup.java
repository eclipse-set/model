/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Zugnummernmeldeanlage;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model11001.Verweise.ID_Fortschaltung_Start_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZN Fortschalt Krit Schalt Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Schalt_AttributeGroup#getBesonderesSchaltkriterium <em>Besonderes Schaltkriterium</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Schalt_AttributeGroup#getIDFortschaltungStart <em>ID Fortschaltung Start</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Schalt_AttributeGroup#getTelegrammwiederholung <em>Telegrammwiederholung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Schalt_AttributeGroup#getZNSchaltkriterium <em>ZN Schaltkriterium</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Fortschalt_Krit_Schalt_AttributeGroup()
 * @model extendedMetaData="name='CZN_Fortschalt_Krit_Schalt' kind='elementOnly'"
 * @generated
 */
public interface ZN_Fortschalt_Krit_Schalt_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Besonderes Schaltkriterium</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe von besonderen Fortschaltkriterien für die Zugnummernfortschaltung als Kommentar. Die Angabe kann auch in Verbindung mit dem Attribut ZN Schaltkriterium erfolgen; z. B. \"positive Stellbarkeitsprüfung Signal xy\". DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es bedarf dazu der Abstimmung zwischen LST-Fachplaner und Betreiber.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Besonderes Schaltkriterium</em>' containment reference.
	 * @see #setBesonderesSchaltkriterium(Besonderes_Schaltkriterium_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Fortschalt_Krit_Schalt_AttributeGroup_BesonderesSchaltkriterium()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Besonderes_Schaltkriterium'"
	 * @generated
	 */
	Besonderes_Schaltkriterium_TypeClass getBesonderesSchaltkriterium();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Schalt_AttributeGroup#getBesonderesSchaltkriterium <em>Besonderes Schaltkriterium</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Besonderes Schaltkriterium</em>' containment reference.
	 * @see #getBesonderesSchaltkriterium()
	 * @generated
	 */
	void setBesonderesSchaltkriterium(Besonderes_Schaltkriterium_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Fortschaltung Start</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Startelement, von dem fortgeschaltet wird. Aus Start und Ziel lässt sich eine Fortschaltrichtung ableiten. DB-Regelwerk 819.0731 6 (15) 819.0731 6 (16) 819.0731 6 (17) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fortschaltung Start</em>' containment reference.
	 * @see #setIDFortschaltungStart(ID_Fortschaltung_Start_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Fortschalt_Krit_Schalt_AttributeGroup_IDFortschaltungStart()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fortschaltung_Start'"
	 * @generated
	 */
	ID_Fortschaltung_Start_TypeClass getIDFortschaltungStart();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Schalt_AttributeGroup#getIDFortschaltungStart <em>ID Fortschaltung Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fortschaltung Start</em>' containment reference.
	 * @see #getIDFortschaltungStart()
	 * @generated
	 */
	void setIDFortschaltungStart(ID_Fortschaltung_Start_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Telegrammwiederholung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei Fortschaltung wird die Sendung des Telegramms wiederholt. Falls keine Telegrammwiederholung erfolgt, wird das Attribut nicht befüllt. DB-Regelwerk 819.0731 6 (21) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telegrammwiederholung</em>' containment reference.
	 * @see #setTelegrammwiederholung(Telegrammwiederholung_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Fortschalt_Krit_Schalt_AttributeGroup_Telegrammwiederholung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Telegrammwiederholung'"
	 * @generated
	 */
	Telegrammwiederholung_TypeClass getTelegrammwiederholung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Schalt_AttributeGroup#getTelegrammwiederholung <em>Telegrammwiederholung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telegrammwiederholung</em>' containment reference.
	 * @see #getTelegrammwiederholung()
	 * @generated
	 */
	void setTelegrammwiederholung(Telegrammwiederholung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ZN Schaltkriterium</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kriterium zur Fortschaltung der Zugnummer. Die Angabe eines ZN-Fortschaltkriteriums erfolgt, sofern es nicht Funktionalität der Anlage ist (ENUM-Wert „kein“). Firmenspezifische Besonderheiten nach Ril 819.0731A03 sind zu beachten. Das Kriterium \"Signalhaltfall\" beinhaltet neben Haltstellung von Hauptsignalen auch das Erlöschen von Kennlicht, Sh1, Ersatz- bzw. Vorsichtssignalen. Diese sind im ESTW Stellwerksfunktionalität und werden nicht explizit geplant. Das Kriterium der Haltstellung von virtuellen Signalen (Anwendung bei ETCS) wird zu einem späteren Zeitpunkt im Modell berücksichtigt. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen. DB-Regelwerk Ril 819.0731A03 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZN Schaltkriterium</em>' containment reference.
	 * @see #setZNSchaltkriterium(ZN_Schaltkriterium_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Fortschalt_Krit_Schalt_AttributeGroup_ZNSchaltkriterium()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZN_Schaltkriterium'"
	 * @generated
	 */
	ZN_Schaltkriterium_TypeClass getZNSchaltkriterium();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Schalt_AttributeGroup#getZNSchaltkriterium <em>ZN Schaltkriterium</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZN Schaltkriterium</em>' containment reference.
	 * @see #getZNSchaltkriterium()
	 * @generated
	 */
	void setZNSchaltkriterium(ZN_Schaltkriterium_TypeClass value);

} // ZN_Fortschalt_Krit_Schalt_AttributeGroup
