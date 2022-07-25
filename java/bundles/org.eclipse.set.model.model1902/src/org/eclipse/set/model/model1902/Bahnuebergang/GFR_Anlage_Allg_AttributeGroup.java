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
 * A representation of the model object '<em><b>GFR Anlage Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Anlage_Allg_AttributeGroup#getBUESicherungszeit <em>BUE Sicherungszeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Anlage_Allg_AttributeGroup#getGFRArt <em>GFR Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Anlage_Allg_AttributeGroup#getGFRTyp <em>GFR Typ</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Anlage_Allg_AttributeGroup#getHersteller <em>Hersteller</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getGFR_Anlage_Allg_AttributeGroup()
 * @model extendedMetaData="name='CGFR_Anlage_Allg' kind='elementOnly'"
 * @generated
 */
public interface GFR_Anlage_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>BUE Sicherungszeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gesamtzeit in s von der Einschaltung des BÜ bis zum Abschluss des Schrankenschließvorgangs gemäß 819.1210, Seite 21.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BUE Sicherungszeit</em>' containment reference.
	 * @see #setBUESicherungszeit(BUE_Sicherungszeit_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getGFR_Anlage_Allg_AttributeGroup_BUESicherungszeit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='BUE_Sicherungszeit'"
	 * @generated
	 */
	BUE_Sicherungszeit_TypeClass getBUESicherungszeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Anlage_Allg_AttributeGroup#getBUESicherungszeit <em>BUE Sicherungszeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BUE Sicherungszeit</em>' containment reference.
	 * @see #getBUESicherungszeit()
	 * @generated
	 */
	void setBUESicherungszeit(BUE_Sicherungszeit_TypeClass value);

	/**
	 * Returns the value of the '<em><b>GFR Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der Gefahrraumfreimeldung (automatisch, Kameraüberwachung etc.).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GFR Art</em>' containment reference.
	 * @see #setGFRArt(GFR_Art_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getGFR_Anlage_Allg_AttributeGroup_GFRArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='GFR_Art'"
	 * @generated
	 */
	GFR_Art_TypeClass getGFRArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Anlage_Allg_AttributeGroup#getGFRArt <em>GFR Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GFR Art</em>' containment reference.
	 * @see #getGFRArt()
	 * @generated
	 */
	void setGFRArt(GFR_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>GFR Typ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Herstellerspezifischer Typ der GFR, z. B. YD136A2.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GFR Typ</em>' containment reference.
	 * @see #setGFRTyp(GFR_Typ_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getGFR_Anlage_Allg_AttributeGroup_GFRTyp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GFR_Typ'"
	 * @generated
	 */
	GFR_Typ_TypeClass getGFRTyp();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Anlage_Allg_AttributeGroup#getGFRTyp <em>GFR Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GFR Typ</em>' containment reference.
	 * @see #getGFRTyp()
	 * @generated
	 */
	void setGFRTyp(GFR_Typ_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Hersteller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unternehmen, das die Funktionsfähigkeit der Anlage verantwortlich hergestellt hat oder Hersteller des jeweiligen Elements. Diese Eigenschaft ist kein Datum einer Planung, sondern dient im Rücklauf der Planung dazu den Hersteller im Bestand zu erfassen. Es ist die zum Zeitpunkt der Inbetriebnahme gültige Firmierung zu verwenden. DB-Regelwerk Beschreibung im Erläuterungsbericht
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hersteller</em>' containment reference.
	 * @see #setHersteller(Hersteller_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getGFR_Anlage_Allg_AttributeGroup_Hersteller()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Hersteller'"
	 * @generated
	 */
	Hersteller_TypeClass getHersteller();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.GFR_Anlage_Allg_AttributeGroup#getHersteller <em>Hersteller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hersteller</em>' containment reference.
	 * @see #getHersteller()
	 * @generated
	 */
	void setHersteller(Hersteller_TypeClass value);

} // GFR_Anlage_Allg_AttributeGroup
