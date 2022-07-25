/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Signale;

import org.eclipse.set.model.model1902.BasisTypen.Bezeichnung_Element_AttributeGroup;

import org.eclipse.set.model.model1902.Basisobjekte.Punkt_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Technische, punktförmig verortete Einrichtung der Eisenbahninfrastruktur, die als Teil der Außenanlage einer Außenelement-Ansteuerung mit statischen oder dynamischen Signalbildern Anweisungen zur Fahrweise oder andere Verhaltensvorschriften an den Triebfahrzeugführer übermittelt oder als Teil der Innenanlage einer Außenelement-Ansteuerung mittels eines Bedienpunkts zur Behandlung von Fahrwegen als Start- oder Zielsignal dient. Steht ein Signal an einer Grenze zweier Bereiche, so ist es dem Bereich zuzuordnen, dem der vom Signal gedeckte Gleisabschnitt angehört. Das Objekt Signal beinhaltet zentrale Eigenschaften, die bei Signalen der Außenanlage in Signal-Befestigungen bzgl. der Konstruktion und in Signal-Rahmen bzgl. der zugeordneten Signalbegriffe ergänzt werden. Je nach Ausführung eines Signals der Außenanlage können dafür mehrere Signal-Befestigungen erforderlich sein (z.B. \u0027Fundament\u0027 und \u0027Signalanordnung\u0027), dafür mehrere Signal-Rahmen erforderlich sein (z.B. \u0027Schirm\u0027, 2x\u0027Zusatzanzeiger\u0027 und \u0027Bezeichnungsschild\u0027) und / oder zeitgleich mehrere Signalbegriffe angezeigt werden, die zu diesem Zeitpunkt für ein Gleis - meist nur in einer Fahrtrichtung - an einem Punkt gültig sind und deren logische Überlagerung zur Handlungsanweisung für den Triebfahrzeugführer wird. Signalbilder, die zwar einem gemeinsamen Punkt zugeordnet sind, aber keiner gemeinsamen logischen Interpretation bedürfen, werden unterschiedlichen Signalen zugeordnet. Kann ein Signal mehrere Signalbilder anzeigen, so werden diese in Gruppen (analog zur Konstruktion) zusammengefasst, jede dieser Gruppen bildet einen Signal-Rahmen. Zur ausführliche Beschreibung der Modellierung eines Signals s. Modellierung Signal. Besonderheiten zur Verortung von Signalen sind unter Punkt Objekt beschrieben. DB-Regelwerk 301, 819.02, Planungsdaten: Sicherungstechnischer Lageplan, statische Eigenschaften: Signaltabelle 1, dynamische Eigenschaften: Signaltabelle 2, vereinzelt sind einzelne Angaben auch anderen Fundorten zugeordnet, dies ist den jeweiligen Einzelbeiträgen zu entnehmen. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal#getPZBSchutzstreckeSoll <em>PZB Schutzstrecke Soll</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal#getSignalFstr <em>Signal Fstr</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal#getSignalFstrAusInselgleis <em>Signal Fstr Aus Inselgleis</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal#getSignalFstrS <em>Signal Fstr S</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal#getSignalFiktiv <em>Signal Fiktiv</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal#getSignalReal <em>Signal Real</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal()
 * @model extendedMetaData="name='CSignal' kind='elementOnly'"
 * @generated
 */
public interface Signal extends Punkt_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle über Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht möglich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es möglich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und Übersichtsplan, BÜ-Lageplan Planungstabellen 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(Bezeichnung_Element_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Bezeichnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	Bezeichnung_Element_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Signale.Signal#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(Bezeichnung_Element_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>PZB Schutzstrecke Soll</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Solllänge der PZB-Schutzstrecke eines Signals. Liegen mehrere Schutzstrecken vor (unterschiedliche Durchrutschwege), so wird hier die Solllänge zum maßgebenden PZB-Gefahrpunkt eingetragen. Maßgebend ist der PZB-Gefahrpunkt, der für die Positionierung des Signals ausschlaggebend ist. DB-Regelwerk Im bisherigen PT1 ohne eindeutige Darstellung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PZB Schutzstrecke Soll</em>' containment reference.
	 * @see #setPZBSchutzstreckeSoll(PZB_Schutzstrecke_Soll_TypeClass)
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_PZBSchutzstreckeSoll()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='PZB_Schutzstrecke_Soll'"
	 * @generated
	 */
	PZB_Schutzstrecke_Soll_TypeClass getPZBSchutzstreckeSoll();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Signale.Signal#getPZBSchutzstreckeSoll <em>PZB Schutzstrecke Soll</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PZB Schutzstrecke Soll</em>' containment reference.
	 * @see #getPZBSchutzstreckeSoll()
	 * @generated
	 */
	void setPZBSchutzstreckeSoll(PZB_Schutzstrecke_Soll_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Signal Fstr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Fstr</em>' containment reference.
	 * @see #setSignalFstr(Signal_Fstr_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_SignalFstr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Signal_Fstr'"
	 * @generated
	 */
	Signal_Fstr_AttributeGroup getSignalFstr();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Signale.Signal#getSignalFstr <em>Signal Fstr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Fstr</em>' containment reference.
	 * @see #getSignalFstr()
	 * @generated
	 */
	void setSignalFstr(Signal_Fstr_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Signal Fstr Aus Inselgleis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Fstr Aus Inselgleis</em>' containment reference.
	 * @see #setSignalFstrAusInselgleis(Signal_Fstr_Aus_Inselgleis_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_SignalFstrAusInselgleis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Signal_Fstr_Aus_Inselgleis'"
	 * @generated
	 */
	Signal_Fstr_Aus_Inselgleis_AttributeGroup getSignalFstrAusInselgleis();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Signale.Signal#getSignalFstrAusInselgleis <em>Signal Fstr Aus Inselgleis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Fstr Aus Inselgleis</em>' containment reference.
	 * @see #getSignalFstrAusInselgleis()
	 * @generated
	 */
	void setSignalFstrAusInselgleis(Signal_Fstr_Aus_Inselgleis_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Signal Fstr S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Fstr S</em>' containment reference.
	 * @see #setSignalFstrS(Signal_Fstr_S_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_SignalFstrS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Signal_Fstr_S'"
	 * @generated
	 */
	Signal_Fstr_S_AttributeGroup getSignalFstrS();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Signale.Signal#getSignalFstrS <em>Signal Fstr S</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Fstr S</em>' containment reference.
	 * @see #getSignalFstrS()
	 * @generated
	 */
	void setSignalFstrS(Signal_Fstr_S_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Signal Fiktiv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Fiktiv</em>' containment reference.
	 * @see #setSignalFiktiv(Signal_Fiktiv_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_SignalFiktiv()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Signal_Fiktiv'"
	 * @generated
	 */
	Signal_Fiktiv_AttributeGroup getSignalFiktiv();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Signale.Signal#getSignalFiktiv <em>Signal Fiktiv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Fiktiv</em>' containment reference.
	 * @see #getSignalFiktiv()
	 * @generated
	 */
	void setSignalFiktiv(Signal_Fiktiv_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Signal Real</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Real</em>' containment reference.
	 * @see #setSignalReal(Signal_Real_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_SignalReal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Signal_Real'"
	 * @generated
	 */
	Signal_Real_AttributeGroup getSignalReal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Signale.Signal#getSignalReal <em>Signal Real</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Real</em>' containment reference.
	 * @see #getSignalReal()
	 * @generated
	 */
	void setSignalReal(Signal_Real_AttributeGroup value);

} // Signal
