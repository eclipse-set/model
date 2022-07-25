/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Regelzeichnung;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regelzeichnung</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Regelzeichnungen werden verwendet, um einheitliche Bauausführungen für bestimmte Objekte sicherzustellen. Die für die LST-Anwendungen im Datenmodell benötigten Regelzeichnungen werden in einer Regelzeichnungstabelle aufgelistet. Regelzeichnungen können neben dem Bild eine beliebige Anzahl von Parametern haben, die die Bausausführung für einen konkreten Anwendungsfall genauer spezifizieren. Die Gültigkeit der Parameter für eine konkrete Anwendung in einer Regelzeichnung kann nur mit Hilfe der Plausibilitäts- und Zulässigkeitsprüfung (PlaZ) bestimmt werden. DB-Regelwerk Für die Anwendung der Regelzeichnugen für Weichen, Kreuzungen und Gleissperren ist das Regelwerk 819.0401Z01 bis 819.0401Z03 zu beachten.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Regelzeichnung.Regelzeichnung#getRegelzeichnungAllg <em>Regelzeichnung Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Regelzeichnung.RegelzeichnungPackage#getRegelzeichnung()
 * @model extendedMetaData="name='CRegelzeichnung' kind='elementOnly'"
 * @generated
 */
public interface Regelzeichnung extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Regelzeichnung Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regelzeichnung Allg</em>' containment reference.
	 * @see #setRegelzeichnungAllg(Regelzeichnung_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Regelzeichnung.RegelzeichnungPackage#getRegelzeichnung_RegelzeichnungAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Regelzeichnung_Allg'"
	 * @generated
	 */
	Regelzeichnung_Allg_AttributeGroup getRegelzeichnungAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Regelzeichnung.Regelzeichnung#getRegelzeichnungAllg <em>Regelzeichnung Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Regelzeichnung Allg</em>' containment reference.
	 * @see #getRegelzeichnungAllg()
	 * @generated
	 */
	void setRegelzeichnungAllg(Regelzeichnung_Allg_AttributeGroup value);

} // Regelzeichnung
