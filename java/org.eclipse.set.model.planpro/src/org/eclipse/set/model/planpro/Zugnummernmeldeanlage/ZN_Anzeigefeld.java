/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Zugnummernmeldeanlage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_Gleis_Abschnitt_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ZLV_Bus_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ZN_Anzeigefeld_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ZN_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZN Anzeigefeld</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Objekt, welches die Funktionalitäten der ZN auf der Bedienoberfläche abbildet. Für jedes Gleis, in denen die ZN-Anlage Zugnummern verwalten und/oder anzeigen soll, ist mindestens ein ZN-Anzeigefeld zu definieren. Hinsichtlich der Besonderheiten bei der Bezeichnug wird auf die Ausführungen auf der Seite Bezeichnung ZN-Anzeigefeld verwiesen. DB-Regelwerk 819.0731 6 (1) bis (15) sowie (19) ff 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Anzeigefeld#getIDGleisAbschnitt <em>ID Gleis Abschnitt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Anzeigefeld#getIDZLVBus <em>IDZLV Bus</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Anzeigefeld#getIDZN <em>IDZN</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Anzeigefeld#getIDZNAnzeigefeld <em>IDZN Anzeigefeld</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Anzeigefeld#getZNAnzeigefeldAllg <em>ZN Anzeigefeld Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Anzeigefeld#getZNAnzeigefeldBezeichnung <em>ZN Anzeigefeld Bezeichnung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Anzeigefeld()
 * @model extendedMetaData="name='CZN_Anzeigefeld' kind='elementOnly'"
 * @generated
 */
public interface ZN_Anzeigefeld extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Gleis Abschnitt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den zugehörigen Gleisabschnitt, in dem das ZN-Anzeigefeld auf der Bedienoberfläche angeordnet wird. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Gleis Abschnitt</em>' containment reference.
	 * @see #setIDGleisAbschnitt(ID_Gleis_Abschnitt_TypeClass)
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Anzeigefeld_IDGleisAbschnitt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Gleis_Abschnitt'"
	 * @generated
	 */
	ID_Gleis_Abschnitt_TypeClass getIDGleisAbschnitt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Anzeigefeld#getIDGleisAbschnitt <em>ID Gleis Abschnitt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Gleis Abschnitt</em>' containment reference.
	 * @see #getIDGleisAbschnitt()
	 * @generated
	 */
	void setIDGleisAbschnitt(ID_Gleis_Abschnitt_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDZLV Bus</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Verweise.ID_ZLV_Bus_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den oder die ZLV_Bus(se), auf den/die das Anzeigefeld durchgereicht wird. Der Verweis wird nur im Falle einer Durchreichung gefüllt. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZLV Bus</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Anzeigefeld_IDZLVBus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_ZLV_Bus'"
	 * @generated
	 */
	EList<ID_ZLV_Bus_TypeClass> getIDZLVBus();

	/**
	 * Returns the value of the '<em><b>IDZN</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die ZN, zu der das ZN-Anzeigefeld gehört. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZN</em>' containment reference.
	 * @see #setIDZN(ID_ZN_TypeClass)
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Anzeigefeld_IDZN()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_ZN'"
	 * @generated
	 */
	ID_ZN_TypeClass getIDZN();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Anzeigefeld#getIDZN <em>IDZN</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZN</em>' containment reference.
	 * @see #getIDZN()
	 * @generated
	 */
	void setIDZN(ID_ZN_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDZN Anzeigefeld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein zugehöriges ZN-Anzeigefeld, z. B. bei der Anordnung von Voranzeige- oder Anbiete-/Annahmefeldern. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZN Anzeigefeld</em>' containment reference.
	 * @see #setIDZNAnzeigefeld(ID_ZN_Anzeigefeld_TypeClass)
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Anzeigefeld_IDZNAnzeigefeld()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_ZN_Anzeigefeld'"
	 * @generated
	 */
	ID_ZN_Anzeigefeld_TypeClass getIDZNAnzeigefeld();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Anzeigefeld#getIDZNAnzeigefeld <em>IDZN Anzeigefeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZN Anzeigefeld</em>' containment reference.
	 * @see #getIDZNAnzeigefeld()
	 * @generated
	 */
	void setIDZNAnzeigefeld(ID_ZN_Anzeigefeld_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ZN Anzeigefeld Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZN Anzeigefeld Allg</em>' containment reference.
	 * @see #setZNAnzeigefeldAllg(ZN_Anzeigefeld_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Anzeigefeld_ZNAnzeigefeldAllg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZN_Anzeigefeld_Allg'"
	 * @generated
	 */
	ZN_Anzeigefeld_Allg_AttributeGroup getZNAnzeigefeldAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Anzeigefeld#getZNAnzeigefeldAllg <em>ZN Anzeigefeld Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZN Anzeigefeld Allg</em>' containment reference.
	 * @see #getZNAnzeigefeldAllg()
	 * @generated
	 */
	void setZNAnzeigefeldAllg(ZN_Anzeigefeld_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ZN Anzeigefeld Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZN Anzeigefeld Bezeichnung</em>' containment reference.
	 * @see #setZNAnzeigefeldBezeichnung(ZN_Anzeigefeld_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Anzeigefeld_ZNAnzeigefeldBezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZN_Anzeigefeld_Bezeichnung'"
	 * @generated
	 */
	ZN_Anzeigefeld_Bezeichnung_AttributeGroup getZNAnzeigefeldBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZN_Anzeigefeld#getZNAnzeigefeldBezeichnung <em>ZN Anzeigefeld Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZN Anzeigefeld Bezeichnung</em>' containment reference.
	 * @see #getZNAnzeigefeldBezeichnung()
	 * @generated
	 */
	void setZNAnzeigefeldBezeichnung(ZN_Anzeigefeld_Bezeichnung_AttributeGroup value);

} // ZN_Anzeigefeld
