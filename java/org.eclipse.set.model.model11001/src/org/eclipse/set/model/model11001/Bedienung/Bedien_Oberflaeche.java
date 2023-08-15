/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bedienung;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model11001.Verweise.ID_Bedien_Bezirk_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedien Oberflaeche</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Topologisches Abbild der für die Bedienung und Anzeige eines ESTW relevanten sicherungstechnischen Anlagen. Dies wird in Form von Meldebildern mit unterschiedlicher Informationstiefe dargestellt. Darüber hinaus gibt es weitere zum Bedienplatzsystem gehörende Meldebilder. Folgende Meldebildtypen stehen an einem Bedienplatzsystem (BPS) zur Verfügung: Bereichsübersicht (Berü), Bereichsübergreifende Berü, Lupe, Gleisbenutzungstabelle (GBT), Kommunikationsanzeige (KA), KA-Bild 1 (PSI-Spiegel), KA-Bild 2 (ESTW-Störungsmeldungen), Betriebsstatus (Rechnerstörungen), Sammelmelderbild (SM-Bild), Dokumentation (Doku), Integrierte Bedienerführung. An anderen Bedienplatzsystemen können andere Meldebildtypen möglich sein. Die Eigenschaften eines Bildes sind unter dem Objekt Bedien Oberflaeche Bild zusammengefasst. Mehrere Bilder verweisen auf das Objekt Bedien_Oberflaeche. Die Möglichkeiten der Aufschaltung der jeweiligen Bedienoberflächen auf den Bedienplätzen sind implizite Stellwerksfunktion. Die dazu notwendigen Berechtigungen sind Betriebsdaten der Instandhaltung. Diese Parameter werden im PT I nicht geplant und im Datenmodell nicht abgebildet. Sondern von der örtlichen Instandhaltung in die Systeme eingegeben. Die Bildbezeichnung des jeweiligen Oberflächenbildes nach der signifikanten (also der bedeutenstenten) Betriebsstelle entsprechend Richtlinie 819.0603 in der Form \"(Bildart)_(Ril 100 Abk)\" wird über die Attribute Oberflaeche Bildart und ID Oertlichkeit gebildet. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Oberflaeche#getBedienOberflaecheAnhaenge <em>Bedien Oberflaeche Anhaenge</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Oberflaeche#getIDBedienBezirk <em>ID Bedien Bezirk</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_Oberflaeche()
 * @model extendedMetaData="name='CBedien_Oberflaeche' kind='elementOnly'"
 * @generated
 */
public interface Bedien_Oberflaeche extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bedien Oberflaeche Anhaenge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bedien Oberflaeche Anhaenge</em>' containment reference.
	 * @see #setBedienOberflaecheAnhaenge(Bedien_Oberflaeche_Anhaenge_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_Oberflaeche_BedienOberflaecheAnhaenge()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bedien_Oberflaeche_Anhaenge'"
	 * @generated
	 */
	Bedien_Oberflaeche_Anhaenge_AttributeGroup getBedienOberflaecheAnhaenge();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Oberflaeche#getBedienOberflaecheAnhaenge <em>Bedien Oberflaeche Anhaenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bedien Oberflaeche Anhaenge</em>' containment reference.
	 * @see #getBedienOberflaecheAnhaenge()
	 * @generated
	 */
	void setBedienOberflaecheAnhaenge(Bedien_Oberflaeche_Anhaenge_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Bedien Bezirk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf einen Bedien_Bezirk zur Zuordnung der Bedienoberflächen eines Steuerbereiches und der für Ihre Darstellung notwendigen Parameter. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Bedien Bezirk</em>' containment reference.
	 * @see #setIDBedienBezirk(ID_Bedien_Bezirk_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_Oberflaeche_IDBedienBezirk()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Bedien_Bezirk'"
	 * @generated
	 */
	ID_Bedien_Bezirk_TypeClass getIDBedienBezirk();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Oberflaeche#getIDBedienBezirk <em>ID Bedien Bezirk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Bedien Bezirk</em>' containment reference.
	 * @see #getIDBedienBezirk()
	 * @generated
	 */
	void setIDBedienBezirk(ID_Bedien_Bezirk_TypeClass value);

} // Bedien_Oberflaeche
