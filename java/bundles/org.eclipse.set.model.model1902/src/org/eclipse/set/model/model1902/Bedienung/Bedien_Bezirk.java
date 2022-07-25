/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bedienung;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_Bedien_Zentrale_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedien Bezirk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bedienung von mehreren ESTW-Zentraleinheiten. Das Objekt Bedien_Bezirk ermöglicht den Anschluss mehrerer ESTW-Zentraleinheiten an einen Bedien_Bezirk z. B. in einer Bedien_Zentrale. Für einen Bedien_Bezirk gibt es zwei Modellierungen / Ausprägungen. 1.) Reell in einer Bedien_Zentrale, Regio-BZ oder sonstigem Technikstandort errichteter Bedien_Bezirk mit angeschalteten ESTW_Zentraleinheiten (mindestens einer) ==\u0026gt; zentraler Bedien_Bezirk 2.) Geplante, auf die Streckeninfrastruktur bezogene, logische Zusammenfassung von betrieblich und geographisch zusammenhängenden Strecken. ==\u0026gt; virtueller Bedien_Bezirk Beispiele: Siehe auch Anlage Media:Bedien Bezirk Typ.pdf 1.) Zentraler Bedien_Bezirk Das Konzept der zentralen Betriebsführung sieht vor, die Bedienung hochwertiger Strecken von ESTW, durch Bedien_Zentralen (Betriebszentralen) zu bündeln. Besonderheit dabei ist, dass in den Bedien_Zentralen selbst keine ESTW_Zentraleinheiten aus Verfügbarkeitsgründen aufgebaut werden dürfen. Das heißt, in den Betriebszentralen sind keine ESTW_Zentraleinheiten sondern nur Bedien_Plätze und Bedien_Bezirke errichtet. Diese Bedien_Bezirke, die die Bedienung hochwertiger Strecken bündeln, sind „zentrale Bedien_Bezirke“. Die Einschränkung, ESTW_Zentraleinheiten nicht im selben Gebäude wie ESTW_Bedien_Bezirke aufzubauen, gilt nicht für eine Regio-BZ oder sonstige Technikstandorte. Auch im Regionalnetz werden ESTW_Zentraleinheiten errichtet. Bisher sind diese örtlich besetzt. Unter anderem ist geplant bzw. in Realisierung, die Gebäude in denen bereits eine Regio-ESTW_Zentraleinheit errichtet ist, eine weitere Regio-ESTW_Zentraleinheit einzubauen. Um auch hier Redundanzen und Synergien nutzen zu können, ist geplant auch hier einen Bedien_Bezirk über die ESTW_Zentraleinheiten zu installieren. Der entscheidende Unterschied zur Bedienzentrale ist hier, dass Bedien_Bezirk und ESTW_Zentraleinheit in einem Gebäude untergebracht sind. Da Strecken sowohl das Regionalnetz und das Fern- und Ballungsnetz durchlaufen können, müssen die Kennzahlenplanungen ebenfalls Netzartübergreifend sein. Siehe auch Attribut „Kennzahl“. 2.) Virtueller Bedienbezirk Als Zweites ist die Option des virtuellen Bedien_Bezirks zu modellieren. Da ein Bedien_Bezirk ja nicht von Heute auf Morgen in ESTW-Technik da steht, müssen Übergangsregelungen geschaffen werden. Auch wenn Stellwerke in einem Bedien_Bezirk (noch) nicht in ESTW-Technik realisiert sind oder die Zuordnung zum Regionalnetz oder Fern- und Ballungsnetz noch offen ist gilt: Die Stw sind einem Bedien_Bezirk zuzuordnen um jegliche spätere Realisierungsform zu ermöglichen und so auch die Kennzahlenvergabe sicher zu gestalten. Siehe auch Attribut „Kennzahl“. Am Beispiel der Bedien_Bezirke 08 und 11 in der BZ Hannover sieht man, dass auch Stellwerke, die (noch) nicht an einen Bedien_Bezirk angebunden sind, eine Zuordnung erfahren müssen. Alle Stellwerke (HORX, HK, Sarstedt und Barnten) liegen in einem betrieblich zusammenhängenden Bezirk. Nämlich auf den Nord-Süd Strecken von Hannover Richtung Göttingen. Die Stellwerke HK, Sarstedt und Barnten sogar auf derselben Strecke 1732. Aktuell sind die Stellwerke Sarstedt und Barnten noch nicht an einen Bedien_Bezirk angebunden. In den Planungen und betrieblichen Vorgaben des Regionalbereichs aber für eine Zuordnung zum Bedien_Bezirk 11 vorgesehen. Daher muss schon jetzt der Bedienbezirk den Stw zugeordnet werden können, auch wenn sie ggf. trotz ESTW-Aufbau, örtlich besetzt werden. Durch die Darstellung in dem Verweis „zentral“ oder „virtuell“ lässt sich die aktuelle und geplante Anbindung darstellen. Im Verständnis der Betriebszentralen entspricht das Objekt Bedien_Bezirk dem Steuerbezirk. Das Objekt kann im LST-Datenmodell jedoch auch als virtueller Bedien_Bezirk vorkommen. Jeder ESTW-Zentraleinheit wird auch ein Bedien_Bezirk zugeordnet. In der Regel der, der in der Kennzahlenplanung vorgesehen ist. Also auch dann, wenn physisch kein Bedienbezirk (Steuerbezirk) oder eine vergleichbare Einheit vorhanden ist (z. B. Regionale Bedienzentrale mit nur einer ESTW-Zentraleinheit), aber bestimmte Eigenschaften mehrerer gemeinsam gesteuerter ESTW-Zentraleinheiten übergreifend geplant werden müssen (z.B. Richtungssinn und Kennzahlen). Gemäß Richtlinie 819.0603 müssen Kennzahlen und Betriebsstellenbezeichner im Steuerbezirk und an seinen Grenzen eindeutig (einmalig) sein. Diese Regel kann nicht über das Modell abgebildet werden, sondern muss in der Plausibilitäts- und Zulässigkeitsprüfung (PlaZ) abgefangen werden. Die Vorgabe für den Richtungssinn bezieht sich immer auf einen kompletten Steuerbezirk. Sie ist jedoch als Eigenschaft der Bedienoberfläche modelliert. Gegebenenfalls müssen hier Zulässigkeitsprüfungen ablaufen. Im Bedienbezirk werden außerdem die Angaben für die Datenkommunikation mit den zugeordneten ESTW-Zentraleinheiten geplant. Die Werte A, B und C werden nach Ril 819.0705A01 von der DB Netz festgelegt. Der Ansprechpartner findet sich in der Ril. Alle weiteren Werte lassen sich anhand dieser Unterlage bestimmen. Siehe Anlage Media:ipadr namensv ib1.pdf DB-Regelwerk 819.0603 819.0705A01 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Bezirk#getBedienBezirkAdressformel <em>Bedien Bezirk Adressformel</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Bezirk#getBedienBezirkAllg <em>Bedien Bezirk Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Bezirk#getBedienBezirkAnhaenge <em>Bedien Bezirk Anhaenge</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Bezirk#getIDBedienZentrale <em>ID Bedien Zentrale</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Bedienung.BedienungPackage#getBedien_Bezirk()
 * @model extendedMetaData="name='CBedien_Bezirk' kind='elementOnly'"
 * @generated
 */
public interface Bedien_Bezirk extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bedien Bezirk Adressformel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bedien Bezirk Adressformel</em>' containment reference.
	 * @see #setBedienBezirkAdressformel(Bedien_Bezirk_Adressformel_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Bedienung.BedienungPackage#getBedien_Bezirk_BedienBezirkAdressformel()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bedien_Bezirk_Adressformel'"
	 * @generated
	 */
	Bedien_Bezirk_Adressformel_AttributeGroup getBedienBezirkAdressformel();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Bezirk#getBedienBezirkAdressformel <em>Bedien Bezirk Adressformel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bedien Bezirk Adressformel</em>' containment reference.
	 * @see #getBedienBezirkAdressformel()
	 * @generated
	 */
	void setBedienBezirkAdressformel(Bedien_Bezirk_Adressformel_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Bedien Bezirk Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bedien Bezirk Allg</em>' containment reference.
	 * @see #setBedienBezirkAllg(Bedien_Bezirk_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Bedienung.BedienungPackage#getBedien_Bezirk_BedienBezirkAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bedien_Bezirk_Allg'"
	 * @generated
	 */
	Bedien_Bezirk_Allg_AttributeGroup getBedienBezirkAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Bezirk#getBedienBezirkAllg <em>Bedien Bezirk Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bedien Bezirk Allg</em>' containment reference.
	 * @see #getBedienBezirkAllg()
	 * @generated
	 */
	void setBedienBezirkAllg(Bedien_Bezirk_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Bedien Bezirk Anhaenge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bedien Bezirk Anhaenge</em>' containment reference.
	 * @see #setBedienBezirkAnhaenge(Bedien_Bezirk_Anhaenge_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Bedienung.BedienungPackage#getBedien_Bezirk_BedienBezirkAnhaenge()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bedien_Bezirk_Anhaenge'"
	 * @generated
	 */
	Bedien_Bezirk_Anhaenge_AttributeGroup getBedienBezirkAnhaenge();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Bezirk#getBedienBezirkAnhaenge <em>Bedien Bezirk Anhaenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bedien Bezirk Anhaenge</em>' containment reference.
	 * @see #getBedienBezirkAnhaenge()
	 * @generated
	 */
	void setBedienBezirkAnhaenge(Bedien_Bezirk_Anhaenge_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Bedien Zentrale</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis vom Bedienbezirk auf die Bedienzentrale. Der Verweis ist auch für virtuelle Bedienbezirke zu füllen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Bedien Zentrale</em>' containment reference.
	 * @see #setIDBedienZentrale(ID_Bedien_Zentrale_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bedienung.BedienungPackage#getBedien_Bezirk_IDBedienZentrale()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Bedien_Zentrale'"
	 * @generated
	 */
	ID_Bedien_Zentrale_TypeClass getIDBedienZentrale();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Bezirk#getIDBedienZentrale <em>ID Bedien Zentrale</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Bedien Zentrale</em>' containment reference.
	 * @see #getIDBedienZentrale()
	 * @generated
	 */
	void setIDBedienZentrale(ID_Bedien_Zentrale_TypeClass value);

} // Bedien_Bezirk
