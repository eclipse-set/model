/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Signale;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.model1902.Basisobjekte.Punkt_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_Regelzeichnung_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Signal_Befestigung_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Befestigung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Konstruktionselement, das der baulichen Aufnahme eines oder mehrerer Signalrahmen dient. Die konkreten konstruktiven Merkmale sind in einer (oder im Bedarfsfall mehreren) Regelzeichnung(en) enthalten, auf die jeweils ein GUID-Verweis zeigt. Bei Sonderkonstruktionen wird die Regelzeichnung durch die zugehörigen Zulassungsdokumente ersetzt. Diese sind als Anhang mittels eines Bearbeitungsvermerks beizufügen. Signalbefestigungen können auch weitere Signalbefestigungen aufnehmen (z.B. trägt ein Signalausleger eine Arbeitsbühne). Einer Signalbefestigung ist mindestens ein Objekt Signal Rahmen oder Signal Befestigung zugeordnet. Ausführliche Beschreibung s. Modellierung Signal. DB-Regelwerk Regelzeichnungen 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal_Befestigung#getIDRegelzeichnung <em>ID Regelzeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal_Befestigung#getIDRegelzeichnungVsigTafel <em>ID Regelzeichnung Vsig Tafel</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal_Befestigung#getIDSignalBefestigung <em>ID Signal Befestigung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal_Befestigung#getSignalBefestigungAllg <em>Signal Befestigung Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Befestigung()
 * @model extendedMetaData="name='CSignal_Befestigung' kind='elementOnly'"
 * @generated
 */
public interface Signal_Befestigung extends Punkt_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Regelzeichnung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Verweise.ID_Regelzeichnung_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein Objekt Regelzeichnung. Für Signale werden in der Regel die Regelzeichnungen der Gruppe S800x,yy verwendet, die die grundsätzliche Anordnung am Gleis beschreiben. Die angegebene Regelzeichnung wird mittels Parametern (z. B.: \"Bild\") weiter spezifiziert. Der Verweis kann mehrfach verwendet werden, wenn die Zuordnung mehrerer Regelzeichnungen explizit erforderlich ist. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Regelzeichnung</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Befestigung_IDRegelzeichnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Regelzeichnung'"
	 * @generated
	 */
	EList<ID_Regelzeichnung_TypeClass> getIDRegelzeichnung();

	/**
	 * Returns the value of the '<em><b>ID Regelzeichnung Vsig Tafel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Regelzeichnung für die Vorsignaltafel.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Regelzeichnung Vsig Tafel</em>' containment reference.
	 * @see #setIDRegelzeichnungVsigTafel(ID_Regelzeichnung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Befestigung_IDRegelzeichnungVsigTafel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Regelzeichnung_Vsig_Tafel'"
	 * @generated
	 */
	ID_Regelzeichnung_TypeClass getIDRegelzeichnungVsigTafel();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Signale.Signal_Befestigung#getIDRegelzeichnungVsigTafel <em>ID Regelzeichnung Vsig Tafel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Regelzeichnung Vsig Tafel</em>' containment reference.
	 * @see #getIDRegelzeichnungVsigTafel()
	 * @generated
	 */
	void setIDRegelzeichnungVsigTafel(ID_Regelzeichnung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Signal Befestigung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein zugehöriges Objekt Signal Befestigung. Zur Anwendung siehe Modellierung Signal. DB-Regelwerk Im bisherigen PT1 keine eindeutige Darstellung, oft aus den Einträgen in der Signaltabelle1, Zeilen 4-6, 10, 13 und 24-28 zu erkennen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal Befestigung</em>' containment reference.
	 * @see #setIDSignalBefestigung(ID_Signal_Befestigung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Befestigung_IDSignalBefestigung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Signal_Befestigung'"
	 * @generated
	 */
	ID_Signal_Befestigung_TypeClass getIDSignalBefestigung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Signale.Signal_Befestigung#getIDSignalBefestigung <em>ID Signal Befestigung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Signal Befestigung</em>' containment reference.
	 * @see #getIDSignalBefestigung()
	 * @generated
	 */
	void setIDSignalBefestigung(ID_Signal_Befestigung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Signal Befestigung Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Befestigung Allg</em>' containment reference.
	 * @see #setSignalBefestigungAllg(Signal_Befestigung_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Befestigung_SignalBefestigungAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Signal_Befestigung_Allg'"
	 * @generated
	 */
	Signal_Befestigung_Allg_AttributeGroup getSignalBefestigungAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Signale.Signal_Befestigung#getSignalBefestigungAllg <em>Signal Befestigung Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Befestigung Allg</em>' containment reference.
	 * @see #getSignalBefestigungAllg()
	 * @generated
	 */
	void setSignalBefestigungAllg(Signal_Befestigung_Allg_AttributeGroup value);

} // Signal_Befestigung
