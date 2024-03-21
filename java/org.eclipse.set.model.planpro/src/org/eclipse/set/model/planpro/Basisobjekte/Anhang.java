/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Basisobjekte;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anhang</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ermöglicht die Aufnahme von Anhangsdokumenten in das Modell. Das Objekt Anhang erlaubt es, im PlanPro Datenmodell Informationen aus bestehenden Dateien vorzuhalten, die nicht durch ein eigenes Objekt im Modell abgebildet sind. Diese Informationen entsprechen den im bisherigen papiergebundenen Prozess beigefügten Anlagen, eben den Anhängen. Die erlaubten Typen von Anhängen sind im Attribut „Anhang Art“ definiert. Der Dateiname der Ursprungsdatei wird im Attribut „Dateiname“ ohne die Endung abgelegt. Die erlaubte Endung wird im Attribut „Dateityp“ definiert. Der eigentliche Inhalt der Ursprungsdatei wird im Attribut „Daten“ als base64-codierte Binärdaten abgelegt. Ein Anhang wird im Datenmodell auf zwei Arten verwendet. Zum einen kann ein Anhang über das Objekt Bearbeitungsvermerk mit jedem Objekt oder Attribut verbunden werden. Dies ist in der Beschreibung des Objekts Bearbeitungsvermerk näher erläutert. Spezielle Anhänge, die direkt in einem Objekt bei der Planung enthalten sein müssen, z.B. INA-Berechnung, werden direkt durch Attribute im jeweiligen Objekt definiert und so ohne den Umweg des Bearbeitungsvermerkes eingebunden.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.Anhang#getAnhangAllg <em>Anhang Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage#getAnhang()
 * @model extendedMetaData="name='CAnhang' kind='elementOnly'"
 * @generated
 */
public interface Anhang extends Ur_Objekt {
	/**
	 * Returns the value of the '<em><b>Anhang Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Anhang Allg</em>' containment reference.
	 * @see #setAnhangAllg(Anhang_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage#getAnhang_AnhangAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Anhang_Allg'"
	 * @generated
	 */
	Anhang_Allg_AttributeGroup getAnhangAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Basisobjekte.Anhang#getAnhangAllg <em>Anhang Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anhang Allg</em>' containment reference.
	 * @see #getAnhangAllg()
	 * @generated
	 */
	void setAnhangAllg(Anhang_Allg_AttributeGroup value);

} // Anhang
