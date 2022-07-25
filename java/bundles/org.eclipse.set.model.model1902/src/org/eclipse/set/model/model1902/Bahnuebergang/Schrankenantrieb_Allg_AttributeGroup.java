/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bahnuebergang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schrankenantrieb Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.Schrankenantrieb_Allg_AttributeGroup#getAbstandGehwegFahrbahn <em>Abstand Gehweg Fahrbahn</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.Schrankenantrieb_Allg_AttributeGroup#getHersteller <em>Hersteller</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.Schrankenantrieb_Allg_AttributeGroup#getSchaltgruppe <em>Schaltgruppe</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getSchrankenantrieb_Allg_AttributeGroup()
 * @model extendedMetaData="name='CSchrankenantrieb_Allg' kind='elementOnly'"
 * @generated
 */
public interface Schrankenantrieb_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Abstand Gehweg Fahrbahn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abstand von der Mitte des Schrankenantriebs zur nächstgelegenen Gehweg- bzw. Fahrbahnkante. Der seitlicher Abstand zur Gleisachse ist über die Eigenschaft \"Punkt_Objekt\" abgebildet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstand Gehweg Fahrbahn</em>' containment reference.
	 * @see #setAbstandGehwegFahrbahn(Abstand_Gehweg_Fahrbahn_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getSchrankenantrieb_Allg_AttributeGroup_AbstandGehwegFahrbahn()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Abstand_Gehweg_Fahrbahn'"
	 * @generated
	 */
	Abstand_Gehweg_Fahrbahn_TypeClass getAbstandGehwegFahrbahn();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.Schrankenantrieb_Allg_AttributeGroup#getAbstandGehwegFahrbahn <em>Abstand Gehweg Fahrbahn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstand Gehweg Fahrbahn</em>' containment reference.
	 * @see #getAbstandGehwegFahrbahn()
	 * @generated
	 */
	void setAbstandGehwegFahrbahn(Abstand_Gehweg_Fahrbahn_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Hersteller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unternehmen, das die Funktionsfähigkeit der Anlage verantwortlich hergestellt hat oder Hersteller des jeweiligen Elements. Diese Eigenschaft ist kein Datum einer Planung, sondern dient im Rücklauf der Planung dazu den Hersteller im Bestand zu erfassen. Es ist die zum Zeitpunkt der Inbetriebnahme gültige Firmierung zu verwenden. DB-Regelwerk Beschreibung im Erläuterungsbericht
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hersteller</em>' containment reference.
	 * @see #setHersteller(Hersteller_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getSchrankenantrieb_Allg_AttributeGroup_Hersteller()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Hersteller'"
	 * @generated
	 */
	Hersteller_TypeClass getHersteller();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.Schrankenantrieb_Allg_AttributeGroup#getHersteller <em>Hersteller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hersteller</em>' containment reference.
	 * @see #getHersteller()
	 * @generated
	 */
	void setHersteller(Hersteller_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Schaltgruppe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung des Schrankenantriebs zu einer Schaltgruppe.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schaltgruppe</em>' containment reference.
	 * @see #setSchaltgruppe(Schaltgruppe_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getSchrankenantrieb_Allg_AttributeGroup_Schaltgruppe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Schaltgruppe'"
	 * @generated
	 */
	Schaltgruppe_TypeClass getSchaltgruppe();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.Schrankenantrieb_Allg_AttributeGroup#getSchaltgruppe <em>Schaltgruppe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schaltgruppe</em>' containment reference.
	 * @see #getSchaltgruppe()
	 * @generated
	 */
	void setSchaltgruppe(Schaltgruppe_TypeClass value);

} // Schrankenantrieb_Allg_AttributeGroup
