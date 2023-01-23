/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bahnuebergang;

import org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt;

import org.eclipse.set.model.model11001.Verweise.ID_BUE_Anlage_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schrankenantrieb</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abbildung von Schrankenantrieben für Bahnübergänge.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.Schrankenantrieb#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.Schrankenantrieb#getIDBUEAnlage <em>IDBUE Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.Schrankenantrieb#getSASchrankenbaum <em>SA Schrankenbaum</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.Schrankenantrieb#getSchrankenantriebAllg <em>Schrankenantrieb Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getSchrankenantrieb()
 * @model extendedMetaData="name='CSchrankenantrieb' kind='elementOnly'"
 * @generated
 */
public interface Schrankenantrieb extends Punkt_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Schrankenantrieb_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getSchrankenantrieb_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Schrankenantrieb_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.Schrankenantrieb#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Schrankenantrieb_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDBUE Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die BÜ-Anlage, zu der der Schrankenantrieb gehört.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDBUE Anlage</em>' containment reference.
	 * @see #setIDBUEAnlage(ID_BUE_Anlage_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getSchrankenantrieb_IDBUEAnlage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_BUE_Anlage'"
	 * @generated
	 */
	ID_BUE_Anlage_ohne_Proxy_TypeClass getIDBUEAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.Schrankenantrieb#getIDBUEAnlage <em>IDBUE Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDBUE Anlage</em>' containment reference.
	 * @see #getIDBUEAnlage()
	 * @generated
	 */
	void setIDBUEAnlage(ID_BUE_Anlage_ohne_Proxy_TypeClass value);

	/**
	 * Returns the value of the '<em><b>SA Schrankenbaum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SA Schrankenbaum</em>' containment reference.
	 * @see #setSASchrankenbaum(SA_Schrankenbaum_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getSchrankenantrieb_SASchrankenbaum()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SA_Schrankenbaum'"
	 * @generated
	 */
	SA_Schrankenbaum_AttributeGroup getSASchrankenbaum();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.Schrankenantrieb#getSASchrankenbaum <em>SA Schrankenbaum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SA Schrankenbaum</em>' containment reference.
	 * @see #getSASchrankenbaum()
	 * @generated
	 */
	void setSASchrankenbaum(SA_Schrankenbaum_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Schrankenantrieb Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schrankenantrieb Allg</em>' containment reference.
	 * @see #setSchrankenantriebAllg(Schrankenantrieb_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getSchrankenantrieb_SchrankenantriebAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Schrankenantrieb_Allg'"
	 * @generated
	 */
	Schrankenantrieb_Allg_AttributeGroup getSchrankenantriebAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.Schrankenantrieb#getSchrankenantriebAllg <em>Schrankenantrieb Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schrankenantrieb Allg</em>' containment reference.
	 * @see #getSchrankenantriebAllg()
	 * @generated
	 */
	void setSchrankenantriebAllg(Schrankenantrieb_Allg_AttributeGroup value);

} // Schrankenantrieb
