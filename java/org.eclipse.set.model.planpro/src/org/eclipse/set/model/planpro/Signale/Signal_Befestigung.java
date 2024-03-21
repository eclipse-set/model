/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Signale;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.planpro.Basisobjekte.Punkt_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_Befestigung_Bauwerk_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Regelzeichnung_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Signal_Befestigung_TypeClass;

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
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Befestigung#getIDRegelzeichnung <em>ID Regelzeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Befestigung#getSignalBefestigungAllg <em>Signal Befestigung Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Befestigung#getIDBefestigungBauwerk <em>ID Befestigung Bauwerk</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Befestigung#getIDSignalBefestigung <em>ID Signal Befestigung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Befestigung()
 * @model extendedMetaData="name='CSignal_Befestigung' kind='elementOnly'"
 * @generated
 */
public interface Signal_Befestigung extends Punkt_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Regelzeichnung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Verweise.ID_Regelzeichnung_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein Objekt Regelzeichnung. Für Signale werden in der Regel die Regelzeichnungen der Gruppe S800x,yy verwendet, die die grundsätzliche Anordnung am Gleis beschreiben. Die angegebene Regelzeichnung wird mittels Parametern (z. B.: \"Bild\") weiter spezifiziert. Der Verweis kann mehrfach verwendet werden, wenn die Zuordnung mehrerer Regelzeichnungen explizit erforderlich ist. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Regelzeichnung</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Befestigung_IDRegelzeichnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Regelzeichnung'"
	 * @generated
	 */
	EList<ID_Regelzeichnung_TypeClass> getIDRegelzeichnung();

	/**
	 * Returns the value of the '<em><b>Signal Befestigung Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Befestigung Allg</em>' containment reference.
	 * @see #setSignalBefestigungAllg(Signal_Befestigung_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Befestigung_SignalBefestigungAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Signal_Befestigung_Allg'"
	 * @generated
	 */
	Signal_Befestigung_Allg_AttributeGroup getSignalBefestigungAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Befestigung#getSignalBefestigungAllg <em>Signal Befestigung Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Befestigung Allg</em>' containment reference.
	 * @see #getSignalBefestigungAllg()
	 * @generated
	 */
	void setSignalBefestigungAllg(Signal_Befestigung_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Befestigung Bauwerk</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein Nicht-LST-Objekt (OL-Mast, Brücke, Stützwand), an dem die Signalbefestigung befestigt ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Befestigung Bauwerk</em>' containment reference.
	 * @see #setIDBefestigungBauwerk(ID_Befestigung_Bauwerk_TypeClass)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Befestigung_IDBefestigungBauwerk()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Befestigung_Bauwerk'"
	 * @generated
	 */
	ID_Befestigung_Bauwerk_TypeClass getIDBefestigungBauwerk();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Befestigung#getIDBefestigungBauwerk <em>ID Befestigung Bauwerk</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Befestigung Bauwerk</em>' containment reference.
	 * @see #getIDBefestigungBauwerk()
	 * @generated
	 */
	void setIDBefestigungBauwerk(ID_Befestigung_Bauwerk_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Signal Befestigung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein zugehöriges Objekt Signal Befestigung. Zur Anwendung siehe Modellierung Signal. DB-Regelwerk Im bisherigen PT1 keine eindeutige Darstellung, oft aus den Einträgen in der Signaltabelle1, Zeilen 4-6, 10, 13 und 24-28 zu erkennen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal Befestigung</em>' containment reference.
	 * @see #setIDSignalBefestigung(ID_Signal_Befestigung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Befestigung_IDSignalBefestigung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Signal_Befestigung'"
	 * @generated
	 */
	ID_Signal_Befestigung_TypeClass getIDSignalBefestigung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Befestigung#getIDSignalBefestigung <em>ID Signal Befestigung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Signal Befestigung</em>' containment reference.
	 * @see #getIDSignalBefestigung()
	 * @generated
	 */
	void setIDSignalBefestigung(ID_Signal_Befestigung_TypeClass value);

} // Signal_Befestigung
