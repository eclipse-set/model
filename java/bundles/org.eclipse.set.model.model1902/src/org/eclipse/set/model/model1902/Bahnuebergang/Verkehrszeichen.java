/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bahnuebergang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_BUE_Anlage_ohne_Proxy_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Unterbringung_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verkehrszeichen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abbildung von Lichtzeichen und Andreaskreuzen im Rahmen der BÜ-Planung. Die Attributgruppe Verkehrszeichen_Lz entfällt bei nichttechnisch gesicherten BÜ oder beschrankten BÜ mit Läutewerk. Die Attributgruppe Verkehrszeichen_Andreaskreuz entfällt bei vorgeschalteten Lichtzeichen. Mehrere Andreaskreuze bei einmündenden Straßen sind möglich (i. d. R. max 3). Die Attributgruppe Vz_Sperrstrecke entfällt bei vorgeschalteten Lichtzeichen
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen#getIDBUEAnlage <em>IDBUE Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen#getIDUnterbringung <em>ID Unterbringung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen#getVerkehrszeichenAllg <em>Verkehrszeichen Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen#getVerkehrszeichenAndreaskreuz <em>Verkehrszeichen Andreaskreuz</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen#getVerkehrszeichenLz <em>Verkehrszeichen Lz</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen#getVzSperrstrecke <em>Vz Sperrstrecke</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen()
 * @model extendedMetaData="name='CVerkehrszeichen' kind='elementOnly'"
 * @generated
 */
public interface Verkehrszeichen extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Verkehrszeichen_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_Bezeichnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Verkehrszeichen_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Verkehrszeichen_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDBUE Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die BÜ-Anlage, zu der das Verkehrszeichen gehört.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDBUE Anlage</em>' containment reference.
	 * @see #setIDBUEAnlage(ID_BUE_Anlage_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_IDBUEAnlage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_BUE_Anlage'"
	 * @generated
	 */
	ID_BUE_Anlage_ohne_Proxy_TypeClass getIDBUEAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen#getIDBUEAnlage <em>IDBUE Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDBUE Anlage</em>' containment reference.
	 * @see #getIDBUEAnlage()
	 * @generated
	 */
	void setIDBUEAnlage(ID_BUE_Anlage_ohne_Proxy_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Unterbringung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf eine Unterbringung zur Verortung des Verkehrszeichens
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Unterbringung</em>' containment reference.
	 * @see #setIDUnterbringung(ID_Unterbringung_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_IDUnterbringung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Unterbringung'"
	 * @generated
	 */
	ID_Unterbringung_ohne_Proxy_TypeClass getIDUnterbringung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen#getIDUnterbringung <em>ID Unterbringung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Unterbringung</em>' containment reference.
	 * @see #getIDUnterbringung()
	 * @generated
	 */
	void setIDUnterbringung(ID_Unterbringung_ohne_Proxy_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Verkehrszeichen Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verkehrszeichen Allg</em>' containment reference.
	 * @see #setVerkehrszeichenAllg(Verkehrszeichen_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_VerkehrszeichenAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Verkehrszeichen_Allg'"
	 * @generated
	 */
	Verkehrszeichen_Allg_AttributeGroup getVerkehrszeichenAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen#getVerkehrszeichenAllg <em>Verkehrszeichen Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verkehrszeichen Allg</em>' containment reference.
	 * @see #getVerkehrszeichenAllg()
	 * @generated
	 */
	void setVerkehrszeichenAllg(Verkehrszeichen_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Verkehrszeichen Andreaskreuz</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Andreaskreuz_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verkehrszeichen Andreaskreuz</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_VerkehrszeichenAndreaskreuz()
	 * @model containment="true" upper="5"
	 *        extendedMetaData="kind='element' name='Verkehrszeichen_Andreaskreuz'"
	 * @generated
	 */
	EList<Verkehrszeichen_Andreaskreuz_AttributeGroup> getVerkehrszeichenAndreaskreuz();

	/**
	 * Returns the value of the '<em><b>Verkehrszeichen Lz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verkehrszeichen Lz</em>' containment reference.
	 * @see #setVerkehrszeichenLz(Verkehrszeichen_Lz_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_VerkehrszeichenLz()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Verkehrszeichen_Lz'"
	 * @generated
	 */
	Verkehrszeichen_Lz_AttributeGroup getVerkehrszeichenLz();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen#getVerkehrszeichenLz <em>Verkehrszeichen Lz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verkehrszeichen Lz</em>' containment reference.
	 * @see #getVerkehrszeichenLz()
	 * @generated
	 */
	void setVerkehrszeichenLz(Verkehrszeichen_Lz_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Vz Sperrstrecke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vz Sperrstrecke</em>' containment reference.
	 * @see #setVzSperrstrecke(Vz_Sperrstrecke_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_VzSperrstrecke()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Vz_Sperrstrecke'"
	 * @generated
	 */
	Vz_Sperrstrecke_AttributeGroup getVzSperrstrecke();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen#getVzSperrstrecke <em>Vz Sperrstrecke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vz Sperrstrecke</em>' containment reference.
	 * @see #getVzSperrstrecke()
	 * @generated
	 */
	void setVzSperrstrecke(Vz_Sperrstrecke_AttributeGroup value);

} // Verkehrszeichen
