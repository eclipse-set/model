/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Ortung;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Element_AttributeGroup;

import org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt;

import org.eclipse.set.model.model11001.Verweise.ID_FMA_Anlage_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Markanter_Punkt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FMA Komponente</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Freimeldeabschnittsgrenze (Isolierstoß, elektrischer Stoß, Achszählpunkt). Die FMA_Komponente wird dem Punkt im Gleis zugeordnet, bis zu dem die Erkennung einer Belegung gemäß Anwendungsrichtlinien als gesichert gilt. Die zu den zugehörigen Gleisabschnitten gehörenden Bereichsobjekte Gleis Abschnitt müssen deshalb exakt an diesem Punktobjekt enden. Zur Ermittlung der seitlichen Lage einer FMA_Komponente siehe Modellierung Gleisfreimeldung. Eine FMA_Komponente kann nur an einer Seite mindestens einen Freimeldeabschnitt oder beidseitig jeweils mindestens einen Freimeldeabschnitt begrenzen. Bei überlappenden Freimeldeabschnittsgrenzen (z.B. am Übergang von FTGS- zu Achszähl- Gleisfreimeldeanlagen) ist jede Freimeldeabschnittsgrenze für sich als FMA_Komponente zu erfassen. Direkt auf Höhe, rechts und/oder links der Freimeldeabschnittsgrenze können sich technische Anlagen für die Gleisfreimeldung befinden, siehe dazu FMA Element. Das Befahren einer FMA_Komponente kann auch weitere Schaltvorgänge auslösen, siehe dazu Schaltmittel Zuordnung. DB-Regelwerk Typspezifische Planungshinweise und Technische Mitteilungen; Planungsdaten: Sicherungstechnischer Lageplan, BÜ-Lageplan; Achszählübersichtsplan; Freimeldetabelle; Achszähltabelle.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente#getIDBezugspunkt <em>ID Bezugspunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente#getIDFMAgrenze <em>IDFM Agrenze</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente#getFMAKomponenteAchszaehlpunkt <em>FMA Komponente Achszaehlpunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente#getFMAKomponenteArt <em>FMA Komponente Art</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Ortung.OrtungPackage#getFMA_Komponente()
 * @model extendedMetaData="name='CFMA_Komponente' kind='elementOnly'"
 * @generated
 */
public interface FMA_Komponente extends Punkt_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle über Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht möglich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es möglich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und Übersichtsplan, BÜ-Lageplan Planungstabellen 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Bezeichnung_Element_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Ortung.OrtungPackage#getFMA_Komponente_Bezeichnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Bezeichnung_Element_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Bezeichnung_Element_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Bezugspunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das Punkt Objekt, dass für die Positionierung der Freimeldeabschnittsgrenze (FMA_Komponente) bzw. der Zugeinwirkung maßgebend ist. Für alle Arten von Freimeldeabschnittsgrenzen bzw. Zugeinwirkungen anzugeben, für die ein Bezugspunkt existiert, zu dem ein vorgeschriebener Abstand erforderlich ist. Typische Bezugspunkte sind Signal, Weichen-Komponente und Gleissperren-Komponente. DB-Regelwerk bei Achszählpunkten: Achszähltabelle, Spalte 17; bei anderen Freimeldeabschnittsgrenzen und Zugeinwirkungen: häufig aus einer Abstandsangabe im Sicherungstechnischen Lageplan / BÜ-Lageplan erkennbar. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Bezugspunkt</em>' containment reference.
	 * @see #setIDBezugspunkt(ID_Markanter_Punkt_TypeClass)
	 * @see org.eclipse.set.model.model11001.Ortung.OrtungPackage#getFMA_Komponente_IDBezugspunkt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Bezugspunkt'"
	 * @generated
	 */
	ID_Markanter_Punkt_TypeClass getIDBezugspunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente#getIDBezugspunkt <em>ID Bezugspunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Bezugspunkt</em>' containment reference.
	 * @see #getIDBezugspunkt()
	 * @generated
	 */
	void setIDBezugspunkt(ID_Markanter_Punkt_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDFM Agrenze</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.Verweise.ID_FMA_Anlage_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf einen Freimeldeabschnitt, der durch diese Freimeldeabschnittsgrenze begrenzt wird. Der Verweis kann mehrfach verwendet werden, wenn mehrere Freimeldeabschnitte durch eine Freimeldeabschnittsgrenze begrenzt werden. DB-Regelwerk Planungsdaten: Angabe nur bei Achszählern üblich, dort in der Achszähltabelle. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDFM Agrenze</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.Ortung.OrtungPackage#getFMA_Komponente_IDFMAgrenze()
	 * @model containment="true" required="true" upper="4"
	 *        extendedMetaData="kind='element' name='ID_FMAgrenze'"
	 * @generated
	 */
	EList<ID_FMA_Anlage_TypeClass> getIDFMAgrenze();

	/**
	 * Returns the value of the '<em><b>FMA Komponente Achszaehlpunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FMA Komponente Achszaehlpunkt</em>' containment reference.
	 * @see #setFMAKomponenteAchszaehlpunkt(FMA_Komponente_Achszaehlpunkt_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Ortung.OrtungPackage#getFMA_Komponente_FMAKomponenteAchszaehlpunkt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FMA_Komponente_Achszaehlpunkt'"
	 * @generated
	 */
	FMA_Komponente_Achszaehlpunkt_AttributeGroup getFMAKomponenteAchszaehlpunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente#getFMAKomponenteAchszaehlpunkt <em>FMA Komponente Achszaehlpunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FMA Komponente Achszaehlpunkt</em>' containment reference.
	 * @see #getFMAKomponenteAchszaehlpunkt()
	 * @generated
	 */
	void setFMAKomponenteAchszaehlpunkt(FMA_Komponente_Achszaehlpunkt_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>FMA Komponente Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der Freimeldeabschnittsgrenze. Dieses Attribut wird mit Ausnahme der Achszähltechnik für alle Arten von Gleisfreimeldungen eingetragen. Je nach Art der Freimeldeanlage und örtlicher Lage ist die Angabe dieses Attributs ausreichend oder es müssen zur weiteren Detaillierung Objekte FMA Element hinzugefügt werden. Grundsätzlich sind alle FMA_Komponenten zentrale Anlagenteile. Inwieweit sie beidseitig genutzt werden, ergibt sich aus der Art und Lage der angrenzenden FMA_Anlagen. Das Attribut wird im bisherigen PT 1 im Gleisisolierplan (oder bei einfachen Verhältnissen im Signallageplan) dargestellt. DB-Regelwerk Planungsdaten: Sicherungstechnischer Lageplan, BÜ-Lageplan, Gleisfreimeldeplan. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FMA Komponente Art</em>' containment reference.
	 * @see #setFMAKomponenteArt(FMA_Komponente_Art_TypeClass)
	 * @see org.eclipse.set.model.model11001.Ortung.OrtungPackage#getFMA_Komponente_FMAKomponenteArt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FMA_Komponente_Art'"
	 * @generated
	 */
	FMA_Komponente_Art_TypeClass getFMAKomponenteArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ortung.FMA_Komponente#getFMAKomponenteArt <em>FMA Komponente Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FMA Komponente Art</em>' containment reference.
	 * @see #getFMAKomponenteArt()
	 * @generated
	 */
	void setFMAKomponenteArt(FMA_Komponente_Art_TypeClass value);

} // FMA_Komponente
