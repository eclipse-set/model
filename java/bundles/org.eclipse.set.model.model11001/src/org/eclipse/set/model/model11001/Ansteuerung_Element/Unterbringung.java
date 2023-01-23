/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Ansteuerung_Element;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup;
import org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup;

import org.eclipse.set.model.model11001.Verweise.ID_GEO_Punkt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unterbringung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ort der Anordnung von nicht an das Gleis gebundenen Komponenten. Die Verortung der U. erfolgt entweder analog zum Punkt Objekt, mit einem GEO Punkt, einem Polygonzug oder durch einen beschreibenden Text. Eine U. beschreibt in der Regel die Umhausung der Komponente. Ist sie nicht eingehaust, wird als Unterbringung Art \"keine\" angegeben. In diesen Fällen hat die Komponente dennoch eine Unterbringung Befestigung. Das ist z. B. der Fall, wenn eine wetterfeste Komponente (z. B. Schlüsselschalter) ohne Einhausung direkt an einem Pfosten befestigt ist. In einer U. können mehrere LST-Objekte untergebracht sein. Eine U. ist z. B. ein Betonschalthaus oder ein Schaltkasten. DB-Regelwerk Darstellung des Gebäudes im sicherungstechnischen Lageplan nach Ril 819.9002 oder Beschreibung im Erläuterungsbericht
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Ansteuerung_Element.Unterbringung#getPunktObjektStrecke <em>Punkt Objekt Strecke</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ansteuerung_Element.Unterbringung#getUnterbringungAllg <em>Unterbringung Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ansteuerung_Element.Unterbringung#getIDGEOPunkt <em>IDGEO Punkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ansteuerung_Element.Unterbringung#getPunktObjektTOPKante <em>Punkt Objekt TOP Kante</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ansteuerung_Element.Unterbringung#getStandortBeschreibung <em>Standort Beschreibung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ansteuerung_Element.Unterbringung#getUnterbringungPolygonzug <em>Unterbringung Polygonzug</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage#getUnterbringung()
 * @model extendedMetaData="name='CUnterbringung' kind='elementOnly'"
 * @generated
 */
public interface Unterbringung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Punkt Objekt Strecke</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt_Strecke_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Zuordnung eines Objektes zu einer Strecke. Zur vererbungsspezifischen Befüllung der Attributgruppe siehe Modellierung Basisobjekte.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Punkt Objekt Strecke</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage#getUnterbringung_PunktObjektStrecke()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Punkt_Objekt_Strecke'"
	 * @generated
	 */
	EList<Punkt_Objekt_Strecke_AttributeGroup> getPunktObjektStrecke();

	/**
	 * Returns the value of the '<em><b>Unterbringung Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unterbringung Allg</em>' containment reference.
	 * @see #setUnterbringungAllg(Unterbringung_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage#getUnterbringung_UnterbringungAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Unterbringung_Allg'"
	 * @generated
	 */
	Unterbringung_Allg_AttributeGroup getUnterbringungAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ansteuerung_Element.Unterbringung#getUnterbringungAllg <em>Unterbringung Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unterbringung Allg</em>' containment reference.
	 * @see #getUnterbringungAllg()
	 * @generated
	 */
	void setUnterbringungAllg(Unterbringung_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDGEO Punkt</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.Verweise.ID_GEO_Punkt_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf einen GEO Punkt, der eine Verortung über x- und y-Koordinate ermöglicht. Eine Mehrfachangabe ist bei Verortung in unterschiedlichen Koordinatensystemen notwendig. DB-Regelwerk ESTW: Darstellung im sicherungstechnischen Lageplan.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDGEO Punkt</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage#getUnterbringung_IDGEOPunkt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_GEO_Punkt'"
	 * @generated
	 */
	EList<ID_GEO_Punkt_TypeClass> getIDGEOPunkt();

	/**
	 * Returns the value of the '<em><b>Punkt Objekt TOP Kante</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Verortung eines Objektes an der Topologie. Die vererbungsspezifische Befüllung der zugehörigen Attribute wird auf der Seite Modellierung Basisobjekte beschrieben. Durch die mögliche Mehrfacheinbindung der Attributgruppe ist es möglich, ein Objekt (z. B. Grenzzeichen) mehreren topologischen Kanten zuzuordnen. DB-Regelwerk Darstellung im sicherungstechnischen Lageplan
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Punkt Objekt TOP Kante</em>' containment reference.
	 * @see #setPunktObjektTOPKante(Punkt_Objekt_TOP_Kante_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage#getUnterbringung_PunktObjektTOPKante()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Punkt_Objekt_TOP_Kante'"
	 * @generated
	 */
	Punkt_Objekt_TOP_Kante_AttributeGroup getPunktObjektTOPKante();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ansteuerung_Element.Unterbringung#getPunktObjektTOPKante <em>Punkt Objekt TOP Kante</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Punkt Objekt TOP Kante</em>' containment reference.
	 * @see #getPunktObjektTOPKante()
	 * @generated
	 */
	void setPunktObjektTOPKante(Punkt_Objekt_TOP_Kante_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Standort Beschreibung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Textuelle Beschreibung des Standorts der Unterbringung. Das Attribut wird genutzt, wenn eine punktförmige Verortung nicht möglich ist, z. B. aufgrund der großen Entfernung des Standorts und der somit bedingten Lage außerhalb des Planungs- oder Betrachtungsbereichs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Standort Beschreibung</em>' containment reference.
	 * @see #setStandortBeschreibung(Standort_Beschreibung_TypeClass)
	 * @see org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage#getUnterbringung_StandortBeschreibung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Standort_Beschreibung'"
	 * @generated
	 */
	Standort_Beschreibung_TypeClass getStandortBeschreibung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ansteuerung_Element.Unterbringung#getStandortBeschreibung <em>Standort Beschreibung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Standort Beschreibung</em>' containment reference.
	 * @see #getStandortBeschreibung()
	 * @generated
	 */
	void setStandortBeschreibung(Standort_Beschreibung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Unterbringung Polygonzug</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Grundriss der Unterbringung, beschrieben mittels Polygonzug unter Nutzung des GML-Standards.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Unterbringung Polygonzug</em>' containment reference.
	 * @see #setUnterbringungPolygonzug(Unterbringung_Polygonzug_TypeClass)
	 * @see org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage#getUnterbringung_UnterbringungPolygonzug()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Unterbringung_Polygonzug'"
	 * @generated
	 */
	Unterbringung_Polygonzug_TypeClass getUnterbringungPolygonzug();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ansteuerung_Element.Unterbringung#getUnterbringungPolygonzug <em>Unterbringung Polygonzug</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unterbringung Polygonzug</em>' containment reference.
	 * @see #getUnterbringungPolygonzug()
	 * @generated
	 */
	void setUnterbringungPolygonzug(Unterbringung_Polygonzug_TypeClass value);

} // Unterbringung
