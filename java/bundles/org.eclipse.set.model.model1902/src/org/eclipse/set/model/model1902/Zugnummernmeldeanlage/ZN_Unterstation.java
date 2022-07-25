/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Zugnummernmeldeanlage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_GEO_Punkt_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Strecke_Punkt_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_ZN_ZBS_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZN Unterstation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Verbindung zwischen ZN und ZLV Bus und/oder ZN ZBS. Über Modems wird die ZN an einen oder mehrere ZLV-Busse und ggf. an eine ZBS (Verbindung zu einer Bedien Zentrale) angebunden. Die Attributgruppe ZN_Unterstation_Bf_Nr kann mehrfach eingebunden werden. Damit werden alle Betriebsstellen, die ZN-seitig über diese Unterstation verwaltet bzw \"angesprochen\" werden, beschrieben. Der ZN-seitigen Bahnhofsnummer wird eine Örtlichkeit (Ril-100-Bezeichner der zugewiesenen Betriebsstelle) und ggf. eine Priorität zugeordnet. Letztere wird nur für diejenige Bahnhosnummer angegeben, die für die Kommunikation der ZN_Unterstation mit dem ZLV-Bus maßgebend ist. In allen anderen Fällen wird das Attribut nicht befüllt. Die Darstellung erfolgt auf dem ZLV-Bus-Übersichtsplan als tabellarischer Block mit den Zeilen \u0026lt;Bf-Nr\u0026gt; \u0026lt;Oertlichkeit_Abkuerzung\u0026gt; in dem Symbol für die ZN_Unterstation. Die Bahnhofsnummer mit Priorität wird direkt neben dem ZLV-Bus-Anschluss angeordnet. DB-Regelwerk 819.0731 5 Die Darstellung der Angaben erfolgt im ZLV-Bus-Übersichtsplan nach 819.0731 A01 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Unterstation#getIDGEOPunkt <em>IDGEO Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Unterstation#getIDStreckePunkt <em>ID Strecke Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Unterstation#getIDZNZBS <em>IDZNZBS</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Unterstation#getZNUnterstationAllg <em>ZN Unterstation Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Unterstation()
 * @model extendedMetaData="name='CZN_Unterstation' kind='elementOnly'"
 * @generated
 */
public interface ZN_Unterstation extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>IDGEO Punkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Positionierung der ZN-Unterstation(en) auf dem ZLV-Bus-Übersichtsplan. Gegenwärtig ist noch in Klärung, ob der Verweis auf Strecke Punkt oder dieser Verweis die bessere Lösung darstellt. DB-Regelwerk Darstellung auf dem ZLV-Bus-Übersichtsplan. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDGEO Punkt</em>' containment reference.
	 * @see #setIDGEOPunkt(ID_GEO_Punkt_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Unterstation_IDGEOPunkt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_GEO_Punkt'"
	 * @generated
	 */
	ID_GEO_Punkt_TypeClass getIDGEOPunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Unterstation#getIDGEOPunkt <em>IDGEO Punkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDGEO Punkt</em>' containment reference.
	 * @see #getIDGEOPunkt()
	 * @generated
	 */
	void setIDGEOPunkt(ID_GEO_Punkt_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Strecke Punkt</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Verweise.ID_Strecke_Punkt_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf einen Streckenpunkt zur geordneten Darstellung der ZN-Unterstationen auf dem ZLV-Bus-Übersichtsplan. Gegenwärtig ist noch in Klärung, ob der Verweis auf GEO Punkt oder dieser Verweis die bessere Lösung darstellt. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Strecke Punkt</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Unterstation_IDStreckePunkt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Strecke_Punkt'"
	 * @generated
	 */
	EList<ID_Strecke_Punkt_TypeClass> getIDStreckePunkt();

	/**
	 * Returns the value of the '<em><b>IDZNZBS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die ID der zugehörigen ZLV-Bus-Sammelleitung (ZBS), sofern diese vorhanden ist. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZNZBS</em>' containment reference.
	 * @see #setIDZNZBS(ID_ZN_ZBS_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Unterstation_IDZNZBS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_ZN_ZBS'"
	 * @generated
	 */
	ID_ZN_ZBS_TypeClass getIDZNZBS();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Unterstation#getIDZNZBS <em>IDZNZBS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZNZBS</em>' containment reference.
	 * @see #getIDZNZBS()
	 * @generated
	 */
	void setIDZNZBS(ID_ZN_ZBS_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ZN Unterstation Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZN Unterstation Allg</em>' containment reference.
	 * @see #setZNUnterstationAllg(ZN_Unterstation_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Unterstation_ZNUnterstationAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZN_Unterstation_Allg'"
	 * @generated
	 */
	ZN_Unterstation_Allg_AttributeGroup getZNUnterstationAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Unterstation#getZNUnterstationAllg <em>ZN Unterstation Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZN Unterstation Allg</em>' containment reference.
	 * @see #getZNUnterstationAllg()
	 * @generated
	 */
	void setZNUnterstationAllg(ZN_Unterstation_Allg_AttributeGroup value);

} // ZN_Unterstation
