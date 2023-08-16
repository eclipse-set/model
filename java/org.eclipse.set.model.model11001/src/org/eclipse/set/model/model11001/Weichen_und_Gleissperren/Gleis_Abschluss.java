/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Weichen_und_Gleissperren;

import org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gleis Abschluss</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ständig vorhandenes Ende eines betrieblich nutzbaren Gleises (z. B. Prellbock oder Schwellenkreuz). Der Gleisabschluss ist ein Punkt Objekt. Die TOP Kante kann hinter dem Gleisabschluss bis zum baulichen Ende des Gleises weitergeführt sein. Er wird auf den Punkt verortet, der die Grenze der möglichen Fahrzeugbewegung darstellt. Da das bauliche Ende konstruktiv hinter diesem Punkt liegt, fällt der Gleisabschluss in der Regel nicht mit einem TOP Knoten zusammen. Der Gleisabschluss ist vom klappbaren Prellbock (und anderen beweglichen Elementen) zu unterscheiden. Diese besonderen beweglichen Fahrwegelemente sind als Gleissperre mit einem ergänzenden Bearbeitungsvermerk zu planen. Der Gleisabschluss ist in der Regel auch Grenze eines Gleisabschnittes. Die Wirkrichtung entspricht der Richtung der möglichen Fahrzeugbewegung auf den Gleisabschluss. Der Gleisabschluss ist mittig angeordnet, sodass die Angabe des seitlichen Abstands bzw. der seitlichen Lage entfällt.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleis_Abschluss#getGleisAbschlussArt <em>Gleis Abschluss Art</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getGleis_Abschluss()
 * @model extendedMetaData="name='CGleis_Abschluss' kind='elementOnly'"
 * @generated
 */
public interface Gleis_Abschluss extends Punkt_Objekt {
	/**
	 * Returns the value of the '<em><b>Gleis Abschluss Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Technische Ausbildung des Gleisabschlusses. Falls als ENUM-Wert \"sonstige\" angegeben wird, ist der Gleisabschluss mittels eines Bearbeitungsvermerks gesondert zu erläutern. Ein abklappbarer Prellbock ist ein bewegliches Fahwegelement und wird hier nicht modelliert. Das den Gleisabschluss kennzeichnende Signal wird als solches gesondert modelliert. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Gleis Abschluss Art</em>' containment reference.
	 * @see #setGleisAbschlussArt(Gleis_Abschluss_Art_TypeClass)
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getGleis_Abschluss_GleisAbschlussArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Gleis_Abschluss_Art'"
	 * @generated
	 */
	Gleis_Abschluss_Art_TypeClass getGleisAbschlussArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Gleis_Abschluss#getGleisAbschlussArt <em>Gleis Abschluss Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gleis Abschluss Art</em>' containment reference.
	 * @see #getGleisAbschlussArt()
	 * @generated
	 */
	void setGleisAbschlussArt(Gleis_Abschluss_Art_TypeClass value);

} // Gleis_Abschluss
