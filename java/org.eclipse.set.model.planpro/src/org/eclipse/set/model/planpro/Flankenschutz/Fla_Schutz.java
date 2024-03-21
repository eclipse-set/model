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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fla Schutz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Darstellung der technischen Maßnahmen, um Flankenschutz zu gewährleisten. DB-Regelwerk 819.0505 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz#getFlaSchutzAnforderer <em>Fla Schutz Anforderer</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz#getFlaSchutzSignal <em>Fla Schutz Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz#getFlaSchutzWGsp <em>Fla Schutz WGsp</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz#getFlaSchutzWeitergabe <em>Fla Schutz Weitergabe</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz#getFlaVerzicht <em>Fla Verzicht</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Flankenschutz.FlankenschutzPackage#getFla_Schutz()
 * @model extendedMetaData="name='CFla_Schutz' kind='elementOnly'"
 * @generated
 */
public interface Fla_Schutz extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Fla Schutz Anforderer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fla Schutz Anforderer</em>' containment reference.
	 * @see #setFlaSchutzAnforderer(Fla_Schutz_Anforderer_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Flankenschutz.FlankenschutzPackage#getFla_Schutz_FlaSchutzAnforderer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Fla_Schutz_Anforderer'"
	 * @generated
	 */
	Fla_Schutz_Anforderer_AttributeGroup getFlaSchutzAnforderer();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz#getFlaSchutzAnforderer <em>Fla Schutz Anforderer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fla Schutz Anforderer</em>' containment reference.
	 * @see #getFlaSchutzAnforderer()
	 * @generated
	 */
	void setFlaSchutzAnforderer(Fla_Schutz_Anforderer_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Fla Schutz Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fla Schutz Signal</em>' containment reference.
	 * @see #setFlaSchutzSignal(Fla_Schutz_Signal_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Flankenschutz.FlankenschutzPackage#getFla_Schutz_FlaSchutzSignal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fla_Schutz_Signal'"
	 * @generated
	 */
	Fla_Schutz_Signal_AttributeGroup getFlaSchutzSignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz#getFlaSchutzSignal <em>Fla Schutz Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fla Schutz Signal</em>' containment reference.
	 * @see #getFlaSchutzSignal()
	 * @generated
	 */
	void setFlaSchutzSignal(Fla_Schutz_Signal_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Fla Schutz WGsp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fla Schutz WGsp</em>' containment reference.
	 * @see #setFlaSchutzWGsp(Fla_Schutz_W_Gsp_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Flankenschutz.FlankenschutzPackage#getFla_Schutz_FlaSchutzWGsp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fla_Schutz_W_Gsp'"
	 * @generated
	 */
	Fla_Schutz_W_Gsp_AttributeGroup getFlaSchutzWGsp();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz#getFlaSchutzWGsp <em>Fla Schutz WGsp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fla Schutz WGsp</em>' containment reference.
	 * @see #getFlaSchutzWGsp()
	 * @generated
	 */
	void setFlaSchutzWGsp(Fla_Schutz_W_Gsp_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Fla Schutz Weitergabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fla Schutz Weitergabe</em>' containment reference.
	 * @see #setFlaSchutzWeitergabe(Fla_Schutz_Weitergabe_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Flankenschutz.FlankenschutzPackage#getFla_Schutz_FlaSchutzWeitergabe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fla_Schutz_Weitergabe'"
	 * @generated
	 */
	Fla_Schutz_Weitergabe_AttributeGroup getFlaSchutzWeitergabe();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz#getFlaSchutzWeitergabe <em>Fla Schutz Weitergabe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fla Schutz Weitergabe</em>' containment reference.
	 * @see #getFlaSchutzWeitergabe()
	 * @generated
	 */
	void setFlaSchutzWeitergabe(Fla_Schutz_Weitergabe_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Fla Verzicht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Auswahl der Maßnahme \"Verzicht\" für den Flankenschutz. Der Flankenschutz wird durch betriebliche Maßnahmen hergestellt (mittelbarer Flankenschutz). Die Maßnahmen \"unmittelbar\" und \"Weitergabe\" sind aus der Befüllung anderer Attribute erkennbar, deshalb muss nur die Maßnahme \"Verzicht\" explizit angegeben werden. DB-Regelwerk Flankenschutztabelle, Spalte 8 \"Flankenschutzumkehr, Verzicht\"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fla Verzicht</em>' containment reference.
	 * @see #setFlaVerzicht(Fla_Verzicht_TypeClass)
	 * @see org.eclipse.set.model.planpro.Flankenschutz.FlankenschutzPackage#getFla_Schutz_FlaVerzicht()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fla_Verzicht'"
	 * @generated
	 */
	Fla_Verzicht_TypeClass getFlaVerzicht();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz#getFlaVerzicht <em>Fla Verzicht</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fla Verzicht</em>' containment reference.
	 * @see #getFlaVerzicht()
	 * @generated
	 */
	void setFlaVerzicht(Fla_Verzicht_TypeClass value);

} // Fla_Schutz
