/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Bedienung;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_Bedien_Oberflaeche_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Oertlichkeit_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedien Oberflaeche Bild</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zusammenfassung der Eigenschaften, die sich jeweils nur auf ein Bild der Bedienoberfläche beziehen. Eigenschaften, die alle Bilder betreffen, sind unter Bedien Oberflaeche eingebunden.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Bild#getBedienOberflaecheBildAllg <em>Bedien Oberflaeche Bild Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Bild#getIDBedienOberflaeche <em>ID Bedien Oberflaeche</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Bild#getIDOertlichkeit <em>ID Oertlichkeit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Bedienung.BedienungPackage#getBedien_Oberflaeche_Bild()
 * @model extendedMetaData="name='CBedien_Oberflaeche_Bild' kind='elementOnly'"
 * @generated
 */
public interface Bedien_Oberflaeche_Bild extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bedien Oberflaeche Bild Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bedien Oberflaeche Bild Allg</em>' containment reference.
	 * @see #setBedienOberflaecheBildAllg(Bedien_Oberflaeche_Bild_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Bedienung.BedienungPackage#getBedien_Oberflaeche_Bild_BedienOberflaecheBildAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bedien_Oberflaeche_Bild_Allg'"
	 * @generated
	 */
	Bedien_Oberflaeche_Bild_Allg_AttributeGroup getBedienOberflaecheBildAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Bild#getBedienOberflaecheBildAllg <em>Bedien Oberflaeche Bild Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bedien Oberflaeche Bild Allg</em>' containment reference.
	 * @see #getBedienOberflaecheBildAllg()
	 * @generated
	 */
	void setBedienOberflaecheBildAllg(Bedien_Oberflaeche_Bild_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Bedien Oberflaeche</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung eines Bildes zur zugehörigen Bedienoberfläche. Die verschiedenen Bedienoberflächenbilder werden zu einem sogenannten \"Aufschaltbereich\" zusammengefasst. Dieser kann dann auf verschiedenen Bedienplätze aufgeschaltet werden. Die Aufschaltung ist Stellwerksfunktion und wird im LST-Datenmodell nicht abgebildet. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Bedien Oberflaeche</em>' containment reference.
	 * @see #setIDBedienOberflaeche(ID_Bedien_Oberflaeche_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bedienung.BedienungPackage#getBedien_Oberflaeche_Bild_IDBedienOberflaeche()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Bedien_Oberflaeche'"
	 * @generated
	 */
	ID_Bedien_Oberflaeche_TypeClass getIDBedienOberflaeche();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Bild#getIDBedienOberflaeche <em>ID Bedien Oberflaeche</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Bedien Oberflaeche</em>' containment reference.
	 * @see #getIDBedienOberflaeche()
	 * @generated
	 */
	void setIDBedienOberflaeche(ID_Bedien_Oberflaeche_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Oertlichkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis zur Ermittlung der Ril 100-Abkürzung für die Bildbezeichnung nach der signifikanten Betriebsstelle des jeweiligen Bildes. Signifikant deshalb, weil von einer ESTW Zentraleinheit, die einer Ril 100 zugeordnet ist, mehrere Aussenelementansteuerungen bedient werden können, die ggf. weitere Ril 100-Bezeichnungen haben. Siehe Beispiel Media:Lupen HBS1.pdf Über die Lupe \"L_HBS1\", die zur ESTW-Zentraleinheit \"ESTW Braunschweig HBS\" gehört, werden Aussenelementansteuerungen in den Bereichen der Örtlichkeiten \"HSMK\" und \"HBUH\" mit bedient. Die Lupe trägt aber die Bezeichnung der signifikanten ESTW-Zentraleinheit ESTW Braunschweig. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Oertlichkeit</em>' containment reference.
	 * @see #setIDOertlichkeit(ID_Oertlichkeit_Proxy_TypeClass)
	 * @see org.eclipse.set.model.planpro.Bedienung.BedienungPackage#getBedien_Oberflaeche_Bild_IDOertlichkeit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Oertlichkeit'"
	 * @generated
	 */
	ID_Oertlichkeit_Proxy_TypeClass getIDOertlichkeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Bedienung.Bedien_Oberflaeche_Bild#getIDOertlichkeit <em>ID Oertlichkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Oertlichkeit</em>' containment reference.
	 * @see #getIDOertlichkeit()
	 * @generated
	 */
	void setIDOertlichkeit(ID_Oertlichkeit_Proxy_TypeClass value);

} // Bedien_Oberflaeche_Bild
