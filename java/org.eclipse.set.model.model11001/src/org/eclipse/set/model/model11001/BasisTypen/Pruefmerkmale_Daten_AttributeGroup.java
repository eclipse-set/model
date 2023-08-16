/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.BasisTypen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pruefmerkmale Daten Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Basisattributgruppe zur Zuordnung von Prüfmerkmalen zu Daten bzw. einer Datei.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.BasisTypen.Pruefmerkmale_Daten_AttributeGroup#getDatumAuslieferung <em>Datum Auslieferung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.BasisTypen.Pruefmerkmale_Daten_AttributeGroup#getPruefsumme <em>Pruefsumme</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.BasisTypen.Pruefmerkmale_Daten_AttributeGroup#getPruefsummeArt <em>Pruefsumme Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.BasisTypen.Pruefmerkmale_Daten_AttributeGroup#getVersionAuslieferung <em>Version Auslieferung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.BasisTypen.BasisTypenPackage#getPruefmerkmale_Daten_AttributeGroup()
 * @model extendedMetaData="name='CPruefmerkmale_Daten' kind='elementOnly'"
 * @generated
 */
public interface Pruefmerkmale_Daten_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Datum Auslieferung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Datum, an dem die Daten bzw. die Datei vom Hersteller ausgeliefert wurde(n).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Datum Auslieferung</em>' containment reference.
	 * @see #setDatumAuslieferung(Datum_Auslieferung_TypeClass)
	 * @see org.eclipse.set.model.model11001.BasisTypen.BasisTypenPackage#getPruefmerkmale_Daten_AttributeGroup_DatumAuslieferung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Datum_Auslieferung'"
	 * @generated
	 */
	Datum_Auslieferung_TypeClass getDatumAuslieferung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.BasisTypen.Pruefmerkmale_Daten_AttributeGroup#getDatumAuslieferung <em>Datum Auslieferung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datum Auslieferung</em>' containment reference.
	 * @see #getDatumAuslieferung()
	 * @generated
	 */
	void setDatumAuslieferung(Datum_Auslieferung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Pruefsumme</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prüfsumme für die Daten bzw. die Datei zur Sicherstellung der Unverfälschtheit.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pruefsumme</em>' containment reference.
	 * @see #setPruefsumme(Pruefsumme_TypeClass)
	 * @see org.eclipse.set.model.model11001.BasisTypen.BasisTypenPackage#getPruefmerkmale_Daten_AttributeGroup_Pruefsumme()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Pruefsumme'"
	 * @generated
	 */
	Pruefsumme_TypeClass getPruefsumme();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.BasisTypen.Pruefmerkmale_Daten_AttributeGroup#getPruefsumme <em>Pruefsumme</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pruefsumme</em>' containment reference.
	 * @see #getPruefsumme()
	 * @generated
	 */
	void setPruefsumme(Pruefsumme_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Pruefsumme Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der verwendeten Prüfsumme (z. B. MD4).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pruefsumme Art</em>' containment reference.
	 * @see #setPruefsummeArt(Pruefsumme_Art_TypeClass)
	 * @see org.eclipse.set.model.model11001.BasisTypen.BasisTypenPackage#getPruefmerkmale_Daten_AttributeGroup_PruefsummeArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Pruefsumme_Art'"
	 * @generated
	 */
	Pruefsumme_Art_TypeClass getPruefsummeArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.BasisTypen.Pruefmerkmale_Daten_AttributeGroup#getPruefsummeArt <em>Pruefsumme Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pruefsumme Art</em>' containment reference.
	 * @see #getPruefsummeArt()
	 * @generated
	 */
	void setPruefsummeArt(Pruefsumme_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Version Auslieferung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Version der Auslieferung vom Hersteller.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version Auslieferung</em>' containment reference.
	 * @see #setVersionAuslieferung(Version_Auslieferung_TypeClass)
	 * @see org.eclipse.set.model.model11001.BasisTypen.BasisTypenPackage#getPruefmerkmale_Daten_AttributeGroup_VersionAuslieferung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Version_Auslieferung'"
	 * @generated
	 */
	Version_Auslieferung_TypeClass getVersionAuslieferung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.BasisTypen.Pruefmerkmale_Daten_AttributeGroup#getVersionAuslieferung <em>Version Auslieferung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version Auslieferung</em>' containment reference.
	 * @see #getVersionAuslieferung()
	 * @generated
	 */
	void setVersionAuslieferung(Version_Auslieferung_TypeClass value);

} // Pruefmerkmale_Daten_AttributeGroup
