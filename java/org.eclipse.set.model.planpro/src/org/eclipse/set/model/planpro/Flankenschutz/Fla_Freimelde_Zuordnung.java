/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Flankenschutz;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_FMA_Anlage_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_Fla_Schutz_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fla Freimelde Zuordnung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zuordnung der freizuprüfenden Freimeldeabschnitte zur jeweiligen Flankenschutzmaßnahme. DB-Regelwerk Flankenschutztabelle, Spalte 10 \"überwachter Schutzraum\"
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Freimelde_Zuordnung#getFlaRaumFreimeldung <em>Fla Raum Freimeldung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Freimelde_Zuordnung#getIDFlaSchutz <em>ID Fla Schutz</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Freimelde_Zuordnung#getIDFMAAnlage <em>IDFMA Anlage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Flankenschutz.FlankenschutzPackage#getFla_Freimelde_Zuordnung()
 * @model extendedMetaData="name='CFla_Freimelde_Zuordnung' kind='elementOnly'"
 * @generated
 */
public interface Fla_Freimelde_Zuordnung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Fla Raum Freimeldung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob eine Freimeldung des Freimeldeabschnitts im Flankenschutzraum erfolgen soll (true) oder nicht (false). In der Regel werden die Freimeldeabschnitte des Flankenschutzraumes freigemeldet. Im Ausnahmefall kann bei Ersatzschutz auf die Freimeldung verzichtet werden (Lastenheft F1 Abschnitt Z 4.4.10). DB-Regelwerk Das Datum ist im jetzigen PT 1 höchstens unformal (Fußnote, Erläuterungsbericht) enthalten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fla Raum Freimeldung</em>' containment reference.
	 * @see #setFlaRaumFreimeldung(Fla_Raum_Freimeldung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Flankenschutz.FlankenschutzPackage#getFla_Freimelde_Zuordnung_FlaRaumFreimeldung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Fla_Raum_Freimeldung'"
	 * @generated
	 */
	Fla_Raum_Freimeldung_TypeClass getFlaRaumFreimeldung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Freimelde_Zuordnung#getFlaRaumFreimeldung <em>Fla Raum Freimeldung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fla Raum Freimeldung</em>' containment reference.
	 * @see #getFlaRaumFreimeldung()
	 * @generated
	 */
	void setFlaRaumFreimeldung(Fla_Raum_Freimeldung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Fla Schutz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zuordnung des Flankenschutzfalls zu den dafür freizumeldenden Gleisfreimeldeabschnitten. DB-Regelwerk Flankenschutztabelle, Zeile. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fla Schutz</em>' containment reference.
	 * @see #setIDFlaSchutz(ID_Fla_Schutz_TypeClass)
	 * @see org.eclipse.set.model.planpro.Flankenschutz.FlankenschutzPackage#getFla_Freimelde_Zuordnung_IDFlaSchutz()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fla_Schutz'"
	 * @generated
	 */
	ID_Fla_Schutz_TypeClass getIDFlaSchutz();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Freimelde_Zuordnung#getIDFlaSchutz <em>ID Fla Schutz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fla Schutz</em>' containment reference.
	 * @see #getIDFlaSchutz()
	 * @generated
	 */
	void setIDFlaSchutz(ID_Fla_Schutz_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDFMA Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beschreibung des freizuprüfenden Flankenschutzraums. DB-Regelwerk Flankenschutztabelle, Spalte 10: \"überwachter Schutzraum\". 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDFMA Anlage</em>' containment reference.
	 * @see #setIDFMAAnlage(ID_FMA_Anlage_TypeClass)
	 * @see org.eclipse.set.model.planpro.Flankenschutz.FlankenschutzPackage#getFla_Freimelde_Zuordnung_IDFMAAnlage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_FMA_Anlage'"
	 * @generated
	 */
	ID_FMA_Anlage_TypeClass getIDFMAAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Freimelde_Zuordnung#getIDFMAAnlage <em>IDFMA Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDFMA Anlage</em>' containment reference.
	 * @see #getIDFMAAnlage()
	 * @generated
	 */
	void setIDFMAAnlage(ID_FMA_Anlage_TypeClass value);

} // Fla_Freimelde_Zuordnung
