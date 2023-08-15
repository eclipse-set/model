/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Basisobjekte;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model11001.Verweise.ID_GEO_Punkt_ohne_Proxy_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_TOP_Kante_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Punkt Objekt TOP Kante Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup#getAbstand <em>Abstand</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup#getIDGEOPunktBerechnet <em>IDGEO Punkt Berechnet</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup#getIDTOPKante <em>IDTOP Kante</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup#getWirkrichtung <em>Wirkrichtung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup#getSeitlicheLage <em>Seitliche Lage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup#getSeitlicherAbstand <em>Seitlicher Abstand</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Basisobjekte.BasisobjektePackage#getPunkt_Objekt_TOP_Kante_AttributeGroup()
 * @model extendedMetaData="name='CPunkt_Objekt_TOP_Kante' kind='elementOnly'"
 * @generated
 */
public interface Punkt_Objekt_TOP_Kante_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Abstand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abstand des Objekts vom Knoten A bezogen auf TOP_Kante in Metern. DB-Regelwerk Darstellung im sicherungstechnischen Lageplan
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstand</em>' containment reference.
	 * @see #setAbstand(Abstand_TypeClass)
	 * @see org.eclipse.set.model.model11001.Basisobjekte.BasisobjektePackage#getPunkt_Objekt_TOP_Kante_AttributeGroup_Abstand()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Abstand'"
	 * @generated
	 */
	Abstand_TypeClass getAbstand();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup#getAbstand <em>Abstand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstand</em>' containment reference.
	 * @see #getAbstand()
	 * @generated
	 */
	void setAbstand(Abstand_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDGEO Punkt Berechnet</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.Verweise.ID_GEO_Punkt_ohne_Proxy_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf einen GEO_Punkt zur Angabe von berechneten Objekt-Koordinaten. Diese werden auf Basis der Soll-Gleislage und der im Punktobjekt vorgegebenen Abstände ermittelt und sind für Bau und Abnahme maßgebend. Eine Mehrfachangabe ist bei Verortung in unterschiedlichen Koordinatensystemen notwendig.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDGEO Punkt Berechnet</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.Basisobjekte.BasisobjektePackage#getPunkt_Objekt_TOP_Kante_AttributeGroup_IDGEOPunktBerechnet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_GEO_Punkt_Berechnet'"
	 * @generated
	 */
	EList<ID_GEO_Punkt_ohne_Proxy_TypeClass> getIDGEOPunktBerechnet();

	/**
	 * Returns the value of the '<em><b>IDTOP Kante</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis, an welcher Kante das Objekt verortet ist. Eine n-fache Einbindung der Attributgruppe erfolgt zum Verweis, an welcher Kante das Objekt noch verortet sein kann (sogenanntes Doppelpunkt-Objekt). Notwendig z. B. für: Grenzzeichen, W_Kr_Gsp_Komponente, Signale im Zungenbereich von Weichen. DB-Regelwerk Darstellung im sicherungstechnischen Lageplan 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDTOP Kante</em>' containment reference.
	 * @see #setIDTOPKante(ID_TOP_Kante_TypeClass)
	 * @see org.eclipse.set.model.model11001.Basisobjekte.BasisobjektePackage#getPunkt_Objekt_TOP_Kante_AttributeGroup_IDTOPKante()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_TOP_Kante'"
	 * @generated
	 */
	ID_TOP_Kante_TypeClass getIDTOPKante();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup#getIDTOPKante <em>IDTOP Kante</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDTOP Kante</em>' containment reference.
	 * @see #getIDTOPKante()
	 * @generated
	 */
	void setIDTOPKante(ID_TOP_Kante_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Wirkrichtung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (Fahrt-)Richtung, in die ein verortetes Objekt wirkt. Die Angabe \"in\", \"gegen\" bzw. \"beide\" bezieht sich auf die Topologierichtung der TOP Kante. Weitere Erläuterungen zu den verwendeten Richtungsbegriffen siehe Modellierung Richtung. Zur vererbungsspezifischen Befüllung siehe Modellierung Basisobjekte. DB-Regelwerk Darstellung im sicherungstechnischen Lageplan
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Wirkrichtung</em>' containment reference.
	 * @see #setWirkrichtung(Wirkrichtung_TypeClass)
	 * @see org.eclipse.set.model.model11001.Basisobjekte.BasisobjektePackage#getPunkt_Objekt_TOP_Kante_AttributeGroup_Wirkrichtung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Wirkrichtung'"
	 * @generated
	 */
	Wirkrichtung_TypeClass getWirkrichtung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup#getWirkrichtung <em>Wirkrichtung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wirkrichtung</em>' containment reference.
	 * @see #getWirkrichtung()
	 * @generated
	 */
	void setWirkrichtung(Wirkrichtung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Seitliche Lage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob sich das Punkt Objekt bezogen auf die Topologierichtung links oder rechts von der TOP Kante bzw. Gleisachse befindet. Das Attribut wird verwendet, wenn keine Vorgabe des Abstands von der Gleisachse notwendig ist (z. B. bei Anbringung an der linken oder rechten Fahrschiene) und soll als Alternative zum seitlichen Abstand verwendet werden. Es kann die Werte links, rechts annehmen. Zur vererbungsspezifischen Befüllung siehe Modellierung Basisobjekte.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seitliche Lage</em>' containment reference.
	 * @see #setSeitlicheLage(Seitliche_Lage_TypeClass)
	 * @see org.eclipse.set.model.model11001.Basisobjekte.BasisobjektePackage#getPunkt_Objekt_TOP_Kante_AttributeGroup_SeitlicheLage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Seitliche_Lage'"
	 * @generated
	 */
	Seitliche_Lage_TypeClass getSeitlicheLage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup#getSeitlicheLage <em>Seitliche Lage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seitliche Lage</em>' containment reference.
	 * @see #getSeitlicheLage()
	 * @generated
	 */
	void setSeitlicheLage(Seitliche_Lage_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Seitlicher Abstand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gibt den orthogonalen seitlichen Abstand eines Elementes zur Gleisachse bezogen auf die Topologierichtung A - B der TOP Kante an: Anordnung des Elementes in Topologierichtung rechts: seitlicher Abstand ist ein positiver Wert. Anordnung des Elementes in Topologierichtung links: seitlicher Abstand ist ein negativer Wert. Die Wirkrichtung des verorteten Elements bleibt bei der Ermittlung des seitlichen Abstands unberücksichtigt. Weitere Erläuterungen zu den verwendeten Richtungsbegriffen siehe Modellierung Richtung. Im Datenmodell wird (teilweise abweichend von der bisherigen Praxis) der seitliche Abstand immer als Abstand Achse zu Achse (z. B. Gleisachse zu Achse des Signalfundaments bzw. Signalmastes) verstanden. Zur vererbungsspezifischen Befüllung siehe Modellierung Basisobjekte. Besonderheiten: Für Elemente, die an einer Fahrschiene angebracht sind (z.B. Entgleissungsschuhe, PZB-Magnete) ist das Attribut Seitliche Lage zu verwenden Für Elemente, die in der Gleismitte angeordnet werden sollen (z. B. Gleis Abschluss) bzw. die keinen realen Abstand haben (z. B. NB_Zone_Grenze), ist der Wert 0.000 zu verwenden. Fiktive Signale erhalten keinen seitlichen Abstand. Punkt_Objekte, die mehreren TOP_Kanten zugeordnet sind, erhalten nur zur nächstliegenden TOP_Kante einen seitlichen Abstand, wenn alle zugeordneten TOP_Kanten auf der selben Seite liegen (z. B. Weichensignal) bzw. nur zu der jeweils rechts und links nächstliegenden TOP_Kante einen seitlichen Abstand, wenn das Punkt_Objekt zwischen den zugeordneten TOP-Kanten liegt (z. B. Grenzzeichen). DB-Regelwerk Darstellung im sicherungstechnischen Lageplan
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seitlicher Abstand</em>' containment reference.
	 * @see #setSeitlicherAbstand(Seitlicher_Abstand_TypeClass)
	 * @see org.eclipse.set.model.model11001.Basisobjekte.BasisobjektePackage#getPunkt_Objekt_TOP_Kante_AttributeGroup_SeitlicherAbstand()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Seitlicher_Abstand'"
	 * @generated
	 */
	Seitlicher_Abstand_TypeClass getSeitlicherAbstand();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt_TOP_Kante_AttributeGroup#getSeitlicherAbstand <em>Seitlicher Abstand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seitlicher Abstand</em>' containment reference.
	 * @see #getSeitlicherAbstand()
	 * @generated
	 */
	void setSeitlicherAbstand(Seitlicher_Abstand_TypeClass value);

} // Punkt_Objekt_TOP_Kante_AttributeGroup
