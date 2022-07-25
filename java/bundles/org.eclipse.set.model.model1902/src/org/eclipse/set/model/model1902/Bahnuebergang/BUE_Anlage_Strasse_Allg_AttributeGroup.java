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
 * A representation of the model object '<em><b>BUE Anlage Strasse Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse_Allg_AttributeGroup#getBaulast <em>Baulast</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse_Allg_AttributeGroup#getFahrbahnBefestigung <em>Fahrbahn Befestigung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse_Allg_AttributeGroup#getFahrbahnBefestigungGleis <em>Fahrbahn Befestigung Gleis</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse_Allg_AttributeGroup#getFahrbahnBreite <em>Fahrbahn Breite</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse_Allg_AttributeGroup#getKlassifizierung <em>Klassifizierung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse_Allg_AttributeGroup#getKreuzungswinkel <em>Kreuzungswinkel</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_Strasse_Allg_AttributeGroup()
 * @model extendedMetaData="name='CBUE_Anlage_Strasse_Allg' kind='elementOnly'"
 * @generated
 */
public interface BUE_Anlage_Strasse_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Baulast</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Straßenbaulastträger, z. B. Gemeinde G-Dorf.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Baulast</em>' containment reference.
	 * @see #setBaulast(Baulast_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_Strasse_Allg_AttributeGroup_Baulast()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Baulast'"
	 * @generated
	 */
	Baulast_TypeClass getBaulast();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse_Allg_AttributeGroup#getBaulast <em>Baulast</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baulast</em>' containment reference.
	 * @see #getBaulast()
	 * @generated
	 */
	void setBaulast(Baulast_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Fahrbahn Befestigung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der Fahrbahnbefestigung, z. B. Asphalt, Kleinpflaster, unbefestigt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fahrbahn Befestigung</em>' containment reference.
	 * @see #setFahrbahnBefestigung(Fahrbahn_Befestigung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_Strasse_Allg_AttributeGroup_FahrbahnBefestigung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Fahrbahn_Befestigung'"
	 * @generated
	 */
	Fahrbahn_Befestigung_TypeClass getFahrbahnBefestigung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse_Allg_AttributeGroup#getFahrbahnBefestigung <em>Fahrbahn Befestigung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fahrbahn Befestigung</em>' containment reference.
	 * @see #getFahrbahnBefestigung()
	 * @generated
	 */
	void setFahrbahnBefestigung(Fahrbahn_Befestigung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Fahrbahn Befestigung Gleis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der Fahrbahnbefestigung im Gleisbereich, z. B. Asphalt, STRAIL, Bodan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fahrbahn Befestigung Gleis</em>' containment reference.
	 * @see #setFahrbahnBefestigungGleis(Fahrbahn_Befestigung_Gleis_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_Strasse_Allg_AttributeGroup_FahrbahnBefestigungGleis()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Fahrbahn_Befestigung_Gleis'"
	 * @generated
	 */
	Fahrbahn_Befestigung_Gleis_TypeClass getFahrbahnBefestigungGleis();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse_Allg_AttributeGroup#getFahrbahnBefestigungGleis <em>Fahrbahn Befestigung Gleis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fahrbahn Befestigung Gleis</em>' containment reference.
	 * @see #getFahrbahnBefestigungGleis()
	 * @generated
	 */
	void setFahrbahnBefestigungGleis(Fahrbahn_Befestigung_Gleis_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Fahrbahn Breite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Breite der Fahrbahn im BÜ- und Räumbereich (sog. 27-m-Bereich) in m.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fahrbahn Breite</em>' containment reference.
	 * @see #setFahrbahnBreite(Fahrbahn_Breite_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_Strasse_Allg_AttributeGroup_FahrbahnBreite()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Fahrbahn_Breite'"
	 * @generated
	 */
	Fahrbahn_Breite_TypeClass getFahrbahnBreite();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse_Allg_AttributeGroup#getFahrbahnBreite <em>Fahrbahn Breite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fahrbahn Breite</em>' containment reference.
	 * @see #getFahrbahnBreite()
	 * @generated
	 */
	void setFahrbahnBreite(Fahrbahn_Breite_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Klassifizierung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Klassifizierung der kreuzenden Straße.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Klassifizierung</em>' containment reference.
	 * @see #setKlassifizierung(Klassifizierung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_Strasse_Allg_AttributeGroup_Klassifizierung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Klassifizierung'"
	 * @generated
	 */
	Klassifizierung_TypeClass getKlassifizierung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse_Allg_AttributeGroup#getKlassifizierung <em>Klassifizierung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Klassifizierung</em>' containment reference.
	 * @see #getKlassifizierung()
	 * @generated
	 */
	void setKlassifizierung(Klassifizierung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Kreuzungswinkel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Winkel zwischen Gleis und kreuzender Straße bzw. kreuzendem Weg in Grad, gemessen im I. ODER III. Quadranten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kreuzungswinkel</em>' containment reference.
	 * @see #setKreuzungswinkel(Kreuzungswinkel_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getBUE_Anlage_Strasse_Allg_AttributeGroup_Kreuzungswinkel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Kreuzungswinkel'"
	 * @generated
	 */
	Kreuzungswinkel_TypeClass getKreuzungswinkel();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.BUE_Anlage_Strasse_Allg_AttributeGroup#getKreuzungswinkel <em>Kreuzungswinkel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kreuzungswinkel</em>' containment reference.
	 * @see #getKreuzungswinkel()
	 * @generated
	 */
	void setKreuzungswinkel(Kreuzungswinkel_TypeClass value);

} // BUE_Anlage_Strasse_Allg_AttributeGroup
