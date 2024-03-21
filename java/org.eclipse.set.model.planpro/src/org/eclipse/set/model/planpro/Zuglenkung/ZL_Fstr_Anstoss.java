/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Zuglenkung;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_Einschaltpunkt_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Signal_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ZL_Fstr_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_ZN_Anzeigefeld_Anstoss_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZL Fstr Anstoss</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Mit ZL_Fstr_Anstoss wird für eine Fahrstrasse der Zuglenkung der Anstosspunkt gebildet. Die für diese ZL-Fahrstraße relevante(n) Geschwindigkeitsklasse(n) (GK) wird/werden über die entsprechende Attributgruppe zugeordnet. DB-Regelwerk 819.0732 11 In der Tabelle der Zuglenkanstöße findet sich die Angabe in der Spalte \"EP-MO\".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Zuglenkung.ZL_Fstr_Anstoss#getIDVorsignal <em>ID Vorsignal</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zuglenkung.ZL_Fstr_Anstoss#getIDZLFstr <em>IDZL Fstr</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zuglenkung.ZL_Fstr_Anstoss#getZLFstrAnstossAllg <em>ZL Fstr Anstoss Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zuglenkung.ZL_Fstr_Anstoss#getZLFstrAnstossGK <em>ZL Fstr Anstoss GK</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zuglenkung.ZL_Fstr_Anstoss#getIDEinschaltpunkt <em>ID Einschaltpunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Zuglenkung.ZL_Fstr_Anstoss#getIDZNAnzeigefeldAnstoss <em>IDZN Anzeigefeld Anstoss</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage#getZL_Fstr_Anstoss()
 * @model extendedMetaData="name='CZL_Fstr_Anstoss' kind='elementOnly'"
 * @generated
 */
public interface ZL_Fstr_Anstoss extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Vorsignal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Standort der Vorsignalisierung des zu lenkenden Hauptsignals. Die Angabe ist notwendig für die Ermittlung des Sichtpunkts bei vorgegebener Sichtzeit. Es wird aus dem Objekt der Standort (km, Stationierung) benötigt. Der Verweis kann entfallen, wenn der Zug erst am zu lenkenden Hauptsignal startet oder das Startsignal ein LZB-Blockkennzeichen ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Vorsignal</em>' containment reference.
	 * @see #setIDVorsignal(ID_Signal_TypeClass)
	 * @see org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage#getZL_Fstr_Anstoss_IDVorsignal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Vorsignal'"
	 * @generated
	 */
	ID_Signal_TypeClass getIDVorsignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zuglenkung.ZL_Fstr_Anstoss#getIDVorsignal <em>ID Vorsignal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Vorsignal</em>' containment reference.
	 * @see #getIDVorsignal()
	 * @generated
	 */
	void setIDVorsignal(ID_Signal_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDZL Fstr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verlinkung, zu welcher ZL_Fstr dieser Anstoß gehört. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZL Fstr</em>' containment reference.
	 * @see #setIDZLFstr(ID_ZL_Fstr_TypeClass)
	 * @see org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage#getZL_Fstr_Anstoss_IDZLFstr()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_ZL_Fstr'"
	 * @generated
	 */
	ID_ZL_Fstr_TypeClass getIDZLFstr();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zuglenkung.ZL_Fstr_Anstoss#getIDZLFstr <em>IDZL Fstr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZL Fstr</em>' containment reference.
	 * @see #getIDZLFstr()
	 * @generated
	 */
	void setIDZLFstr(ID_ZL_Fstr_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ZL Fstr Anstoss Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZL Fstr Anstoss Allg</em>' containment reference.
	 * @see #setZLFstrAnstossAllg(ZL_Fstr_Anstoss_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage#getZL_Fstr_Anstoss_ZLFstrAnstossAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZL_Fstr_Anstoss_Allg'"
	 * @generated
	 */
	ZL_Fstr_Anstoss_Allg_AttributeGroup getZLFstrAnstossAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zuglenkung.ZL_Fstr_Anstoss#getZLFstrAnstossAllg <em>ZL Fstr Anstoss Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZL Fstr Anstoss Allg</em>' containment reference.
	 * @see #getZLFstrAnstossAllg()
	 * @generated
	 */
	void setZLFstrAnstossAllg(ZL_Fstr_Anstoss_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ZL Fstr Anstoss GK</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Zuglenkung.ZL_Fstr_Anstoss_GK_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZL Fstr Anstoss GK</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage#getZL_Fstr_Anstoss_ZLFstrAnstossGK()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZL_Fstr_Anstoss_GK'"
	 * @generated
	 */
	EList<ZL_Fstr_Anstoss_GK_AttributeGroup> getZLFstrAnstossGK();

	/**
	 * Returns the value of the '<em><b>ID Einschaltpunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein Schaltmittel, welches als Anstoß für die ZL-Fahrstraße ausgewertet wird. Der Standort bzw. die Stationierung geht in die Berechnung einer Verzögerungszeit ein. Das Attribut ist optional, da nicht für jede ZL-Fahrstraße ein Schaltmittel ausgewählt werden kann (z. B. an Stellbereichsgrenzen). In dem Fall ist ein ZN_Anzeigefeld als Anstoßkriterium festzulegen. Einer von beiden Verweisen (ID_Einschaltpunkt oder ID ZN Anzeigefeld Anstoss) muss immer gefüllt sein.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Einschaltpunkt</em>' containment reference.
	 * @see #setIDEinschaltpunkt(ID_Einschaltpunkt_TypeClass)
	 * @see org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage#getZL_Fstr_Anstoss_IDEinschaltpunkt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Einschaltpunkt'"
	 * @generated
	 */
	ID_Einschaltpunkt_TypeClass getIDEinschaltpunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zuglenkung.ZL_Fstr_Anstoss#getIDEinschaltpunkt <em>ID Einschaltpunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Einschaltpunkt</em>' containment reference.
	 * @see #getIDEinschaltpunkt()
	 * @generated
	 */
	void setIDEinschaltpunkt(ID_Einschaltpunkt_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDZN Anzeigefeld Anstoss</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das ZN Anzeigefeld, aus dem der Anstoß der ZL ausgelöst wird. Das Attribut ist optional, falls für einen ZL-Anstoß kein geeignetes ZN-Anzeigefeld zur Verfügung steht. In dem Fall ist ein Schaltmittel als Anstoßkriterium festzulegen. Einer von beiden Verweisen (ID Einschaltpunkt oder ID_ZN_Anzeigefeld_Anstoss) muss immer gefüllt sein.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZN Anzeigefeld Anstoss</em>' containment reference.
	 * @see #setIDZNAnzeigefeldAnstoss(ID_ZN_Anzeigefeld_Anstoss_TypeClass)
	 * @see org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage#getZL_Fstr_Anstoss_IDZNAnzeigefeldAnstoss()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_ZN_Anzeigefeld_Anstoss'"
	 * @generated
	 */
	ID_ZN_Anzeigefeld_Anstoss_TypeClass getIDZNAnzeigefeldAnstoss();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Zuglenkung.ZL_Fstr_Anstoss#getIDZNAnzeigefeldAnstoss <em>IDZN Anzeigefeld Anstoss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZN Anzeigefeld Anstoss</em>' containment reference.
	 * @see #getIDZNAnzeigefeldAnstoss()
	 * @generated
	 */
	void setIDZNAnzeigefeldAnstoss(ID_ZN_Anzeigefeld_Anstoss_TypeClass value);

} // ZL_Fstr_Anstoss
