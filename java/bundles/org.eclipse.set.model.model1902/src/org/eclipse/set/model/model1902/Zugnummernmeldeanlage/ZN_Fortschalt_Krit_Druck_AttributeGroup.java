/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Zugnummernmeldeanlage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZN Fortschalt Krit Druck Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Druck_AttributeGroup#getAusfahrdruck <em>Ausfahrdruck</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Druck_AttributeGroup#getAusfahrdruckGegengleis <em>Ausfahrdruck Gegengleis</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Druck_AttributeGroup#getDurchfahrdruck <em>Durchfahrdruck</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Druck_AttributeGroup#getEinfahrdruck <em>Einfahrdruck</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Druck_AttributeGroup#getEinfahrdruckGegengleis <em>Einfahrdruck Gegengleis</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Druck_AttributeGroup#getMeldedruck <em>Meldedruck</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Fortschalt_Krit_Druck_AttributeGroup()
 * @model extendedMetaData="name='CZN_Fortschalt_Krit_Druck' kind='elementOnly'"
 * @generated
 */
public interface ZN_Fortschalt_Krit_Druck_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Ausfahrdruck</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Druck nach Ausfahrt eines Zuges. Im ZN Anzeigefeld wird ein Druck nach Ausfahrt des Zuges generiert. Die Ausgabe erfolgt auf einem ZN-Drucker oder in ein Doku-System. Das DB-Regelwerk enthält keine konkreten Planungsvorgaben. Es bedarf der Abstimmung zwischen LST-Fachplaner und späterem Betreiber. DB-Regelwerk Allgemein gehaltene Aussagen zu den Drucken finden sich in 819.0731 2 (3) 819.0731 6 (12) 819.0731 6 (18) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ausfahrdruck</em>' containment reference.
	 * @see #setAusfahrdruck(Ausfahrdruck_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Fortschalt_Krit_Druck_AttributeGroup_Ausfahrdruck()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Ausfahrdruck'"
	 * @generated
	 */
	Ausfahrdruck_TypeClass getAusfahrdruck();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Druck_AttributeGroup#getAusfahrdruck <em>Ausfahrdruck</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ausfahrdruck</em>' containment reference.
	 * @see #getAusfahrdruck()
	 * @generated
	 */
	void setAusfahrdruck(Ausfahrdruck_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Ausfahrdruck Gegengleis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Druck nach Ausfahrt des Zuges ins Gegengleis. Im ZN Anzeigefeld wird ein Druck nach Ausfahrt des Zuges ins Gegengleis generiert. Die Ausgabe erfolgt auf einem ZN-Drucker oder in ein Doku-System. Das DB-Regelwerk enthält keine konkreten Planungsvorgaben. Es bedarf der Abstimmung zwischen LST-Fachplaner und späterem Betreiber. DB-Regelwerk Allgemein gehaltene Aussagen zu den Drucken finden sich in 819.0731 2 (3) 819.0731 6 (12) 819.0731 6 (18) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ausfahrdruck Gegengleis</em>' containment reference.
	 * @see #setAusfahrdruckGegengleis(Ausfahrdruck_Gegengleis_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Fortschalt_Krit_Druck_AttributeGroup_AusfahrdruckGegengleis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Ausfahrdruck_Gegengleis'"
	 * @generated
	 */
	Ausfahrdruck_Gegengleis_TypeClass getAusfahrdruckGegengleis();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Druck_AttributeGroup#getAusfahrdruckGegengleis <em>Ausfahrdruck Gegengleis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ausfahrdruck Gegengleis</em>' containment reference.
	 * @see #getAusfahrdruckGegengleis()
	 * @generated
	 */
	void setAusfahrdruckGegengleis(Ausfahrdruck_Gegengleis_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Durchfahrdruck</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Druck nach Durchfahrt des Zuges. Im ZN Anzeigefeld wird ein Druck nach Durchfahrt des Zuges (z. B. nach Passieren eines Bahnhofsteils) generiert. Die Ausgabe erfolgt auf einem ZN-Drucker oder in ein Doku-System. Das DB-Regelwerk enthält keine konkreten Planungsvorgaben. Es bedarf der Abstimmung zwischen LST-Fachplaner und späterem Betreiber. DB-Regelwerk Allgemein gehaltene Aussagen zu den Drucken finden sich in 819.0731 2 (3) 819.0731 6 (12) 819.0731 6 (18) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Durchfahrdruck</em>' containment reference.
	 * @see #setDurchfahrdruck(Durchfahrdruck_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Fortschalt_Krit_Druck_AttributeGroup_Durchfahrdruck()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Durchfahrdruck'"
	 * @generated
	 */
	Durchfahrdruck_TypeClass getDurchfahrdruck();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Druck_AttributeGroup#getDurchfahrdruck <em>Durchfahrdruck</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Durchfahrdruck</em>' containment reference.
	 * @see #getDurchfahrdruck()
	 * @generated
	 */
	void setDurchfahrdruck(Durchfahrdruck_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Einfahrdruck</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Druck nach Einfahrt des Zuges. Im ZN Anzeigefeld wird ein Druck nach Einfahrt des Zuges in den Bahnhof generiert. Die Ausgabe erfolgt auf einem ZN-Drucker oder in ein Doku-System. Das DB-Regelwerk enthält keine konkreten Planungsvorgaben. Es bedarf der Abstimmung zwischen LST-Fachplaner und späterem Betreiber. DB-Regelwerk Allgemein gehaltene Aussagen zu den Drucken finden sich in 819.0731 2 (3) 819.0731 6 (12) 819.0731 6 (18) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einfahrdruck</em>' containment reference.
	 * @see #setEinfahrdruck(Einfahrdruck_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Fortschalt_Krit_Druck_AttributeGroup_Einfahrdruck()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Einfahrdruck'"
	 * @generated
	 */
	Einfahrdruck_TypeClass getEinfahrdruck();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Druck_AttributeGroup#getEinfahrdruck <em>Einfahrdruck</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einfahrdruck</em>' containment reference.
	 * @see #getEinfahrdruck()
	 * @generated
	 */
	void setEinfahrdruck(Einfahrdruck_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Einfahrdruck Gegengleis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Druck nach Einfahrt des Zuges aus dem Gegengleis. Im ZN Anzeigefeld wird ein Druck nach Einfahrt des Zuges aus dem Gegengleis in den Bahnhof generiert. Die Ausgabe erfolgt auf einem ZN-Drucker oder in ein Doku-System. Das DB-Regelwerk enthält keine konkreten Planungsvorgaben. Es bedarf der Abstimmung zwischen LST-Fachplaner und späterem Betreiber. DB-Regelwerk Allgemein gehaltene Aussagen zu den Drucken finden sich in 819.0731 2 (3) 819.0731 6 (12) 819.0731 6 (18) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einfahrdruck Gegengleis</em>' containment reference.
	 * @see #setEinfahrdruckGegengleis(Einfahrdruck_Gegengleis_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Fortschalt_Krit_Druck_AttributeGroup_EinfahrdruckGegengleis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Einfahrdruck_Gegengleis'"
	 * @generated
	 */
	Einfahrdruck_Gegengleis_TypeClass getEinfahrdruckGegengleis();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Druck_AttributeGroup#getEinfahrdruckGegengleis <em>Einfahrdruck Gegengleis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einfahrdruck Gegengleis</em>' containment reference.
	 * @see #getEinfahrdruckGegengleis()
	 * @generated
	 */
	void setEinfahrdruckGegengleis(Einfahrdruck_Gegengleis_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Meldedruck</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Druck nach Fortschaltung der Zugnummer. Im ZN Anzeigefeld wird ein Druck nach Fortschaltung der Zugnummer generiert. Die Ausgabe erfolgt auf einem ZN-Drucker oder in ein Doku-System. Das DB-Regelwerk enthält keine konkreten Planungsvorgaben. Es bedarf der Abstimmung zwischen LST-Fachplaner und späterem Betreiber. DB-Regelwerk Allgemein gehaltene Aussagen zu den Drucken finden sich in 819.0731 2 (3) 819.0731 6 (12) 819.0731 6 (18) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Meldedruck</em>' containment reference.
	 * @see #setMeldedruck(Meldedruck_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Fortschalt_Krit_Druck_AttributeGroup_Meldedruck()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Meldedruck'"
	 * @generated
	 */
	Meldedruck_TypeClass getMeldedruck();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Fortschalt_Krit_Druck_AttributeGroup#getMeldedruck <em>Meldedruck</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Meldedruck</em>' containment reference.
	 * @see #getMeldedruck()
	 * @generated
	 */
	void setMeldedruck(Meldedruck_TypeClass value);

} // ZN_Fortschalt_Krit_Druck_AttributeGroup
