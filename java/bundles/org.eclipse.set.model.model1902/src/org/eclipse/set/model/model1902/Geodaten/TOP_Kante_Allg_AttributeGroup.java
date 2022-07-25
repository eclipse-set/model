/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Geodaten;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TOP Kante Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.TOP_Kante_Allg_AttributeGroup#getTOPAnschlussA <em>TOP Anschluss A</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.TOP_Kante_Allg_AttributeGroup#getTOPAnschlussB <em>TOP Anschluss B</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Geodaten.TOP_Kante_Allg_AttributeGroup#getTOPLaenge <em>TOP Laenge</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage#getTOP_Kante_Allg_AttributeGroup()
 * @model extendedMetaData="name='CTOP_Kante_Allg' kind='elementOnly'"
 * @generated
 */
public interface TOP_Kante_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>TOP Anschluss A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art des Anschlusses am Ende A der TOP_Kante. Eine TOP_Kante muss sowohl am Ende A als auch am Ende B auf einem TOP_Knoten verweisen. In der Regel schließen an einen TOP_Knoten weitere TOP_Kanten an. Wenn an einem TOP_Knoten nur eine TOP_Kante anschließt, endet an diesem Knoten die Topologie des Gleisnetzes. Nachfolgende Arten des Endes einer Topologie sind vorgesehen: Ende - reales Ende einer Gleislinie (z.B. Prellbock, Fähranleger, ...). Ende_Bestdig - temporäres Ende einer Gleislinie, die real weiterführt, aber deren Weiterführung noch nicht im Modell hinterlegt ist. Schnitt - Anschlusspunkt einer Neutrassierung an einen vorhandenen Bestand der Gleislinie. Im Bestand muss dieser Knoten nur ein GEO Punkt sein. Nach dem Einbinden der Neutrassierung in die Bestandsgleislage entfällt dieser TOP_Knoten durch eine neue durchlaufende TOP_Kante. Hinweis für die Fahrwegfindung (Routing): Endet ein Routing auf LINKS oder RECHTS, darf nur ein Fahrweg (Routing) vom gleichen Knoten über die SPITZE gesucht werden. Endet ein Routing auf SPITZE, findet eine Fahrwegverzweigung statt, d.h. vom gleichen Knoten werden zwei getrennte Fahrwege (Routings) über LINKS und RECHTS gesucht. Bei einer Kante mit dem Anschluss VERBINDUNG ist die nachfolgende Infrastruktur aufgrund des Zuschnitts des Planungsbereichs nicht verfügbar. Folgende Werte-Kombinationen entstehen daher für TOP_Knoten.Art Besonders (E) und TOP_Kante.TOP_Anschluss_A bzw. ..._B: Art des TOP_Knoten TOP_Knoten.Art Besonders TOP_Kante.TOP_Anschluss_... Verbindungsknoten Verbindung (E) Verbindung Weichenknoten - Links, Rechts, Spitze Infrastrukturende (Gleisabschluss) - Ende Digitalisierungsende Ende_Bestdig (E) Ende_Bestdig 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TOP Anschluss A</em>' containment reference.
	 * @see #setTOPAnschlussA(TOP_Anschluss_A_TypeClass)
	 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage#getTOP_Kante_Allg_AttributeGroup_TOPAnschlussA()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TOP_Anschluss_A'"
	 * @generated
	 */
	TOP_Anschluss_A_TypeClass getTOPAnschlussA();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Geodaten.TOP_Kante_Allg_AttributeGroup#getTOPAnschlussA <em>TOP Anschluss A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TOP Anschluss A</em>' containment reference.
	 * @see #getTOPAnschlussA()
	 * @generated
	 */
	void setTOPAnschlussA(TOP_Anschluss_A_TypeClass value);

	/**
	 * Returns the value of the '<em><b>TOP Anschluss B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art des Anschlusses am Ende B der TOP_Kante. Eine TOP_Kante muss sowohl am Ende A als auch am Ende B auf einem TOP_Knoten verweisen. In der Regel schließen an einen TOP_Knoten weitere TOP_Kanten an. Wenn an einem TOP_Knoten nur eine TOP_Kante anschließt, endet an diesem Knoten die Topologie des Gleisnetzes. Nachfolgende Arten des Endes einer Topologie sind vorgesehen: Ende - reales Ende einer Gleislinie (z.B. Prellbock, Fähranleger, ...). Ende_Bestdig - temporäres Ende einer Gleislinie, die real weiterführt, aber deren Weiterführung noch nicht im Modell hinterlegt ist. Schnitt - Anschlusspunkt einer Neutrassierung an einen vorhandenen Bestand der Gleislinie. Im Bestand muss dieser Knoten nur ein GEO Punkt sein. Nach dem Einbinden der Neutrassierung in die Bestandsgleislage entfällt dieser TOP_Knoten durch eine neue durchlaufende TOP_Kante. Hinweis für die Fahrwegfindung (Routing): Endet ein Routing auf LINKS oder RECHTS, darf nur ein Fahrweg (Routing) vom gleichen Knoten über die SPITZE gesucht werden. Endet ein Routing auf SPITZE, findet eine Fahrwegverzweigung statt, d.h. vom gleichen Knoten werden zwei getrennte Fahrwege (Routings) über LINKS und RECHTS gesucht. Bei einer Kante mit dem Anschluss VERBINDUNG ist die nachfolgende Infrastruktur aufgrund des Zuschnitts des Planungsbereichs nicht verfügbar. Folgende Werte-Kombinationen entstehen daher für TOP_Knoten.Art Besonders (E) und TOP_Kante.TOP_Anschluss_A bzw. ..._B: Art des TOP_Knoten TOP_Knoten.Art Besonders TOP_Kante.TOP_Anschluss_... Verbindungsknoten Verbindung (E) Verbindung Weichenknoten - Links, Rechts, Spitze Infrastrukturende (Gleisabschluss) - Ende Digitalisierungsende Ende_Bestdig (E) Ende_Bestdig 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TOP Anschluss B</em>' containment reference.
	 * @see #setTOPAnschlussB(TOP_Anschluss_B_TypeClass)
	 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage#getTOP_Kante_Allg_AttributeGroup_TOPAnschlussB()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TOP_Anschluss_B'"
	 * @generated
	 */
	TOP_Anschluss_B_TypeClass getTOPAnschlussB();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Geodaten.TOP_Kante_Allg_AttributeGroup#getTOPAnschlussB <em>TOP Anschluss B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TOP Anschluss B</em>' containment reference.
	 * @see #getTOPAnschlussB()
	 * @generated
	 */
	void setTOPAnschlussB(TOP_Anschluss_B_TypeClass value);

	/**
	 * Returns the value of the '<em><b>TOP Laenge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Länge der TOP-Kante. Genauigkeit: Tausendstel m = 1 mm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TOP Laenge</em>' containment reference.
	 * @see #setTOPLaenge(TOP_Laenge_TypeClass)
	 * @see org.eclipse.set.model.model1902.Geodaten.GeodatenPackage#getTOP_Kante_Allg_AttributeGroup_TOPLaenge()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TOP_Laenge'"
	 * @generated
	 */
	TOP_Laenge_TypeClass getTOPLaenge();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Geodaten.TOP_Kante_Allg_AttributeGroup#getTOPLaenge <em>TOP Laenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TOP Laenge</em>' containment reference.
	 * @see #getTOPLaenge()
	 * @generated
	 */
	void setTOPLaenge(TOP_Laenge_TypeClass value);

} // TOP_Kante_Allg_AttributeGroup
