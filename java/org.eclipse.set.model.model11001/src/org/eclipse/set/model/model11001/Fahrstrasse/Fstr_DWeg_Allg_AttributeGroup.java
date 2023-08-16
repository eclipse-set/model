/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Fahrstrasse;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fstr DWeg Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_DWeg_Allg_AttributeGroup#getLaengeSoll <em>Laenge Soll</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_DWeg_Allg_AttributeGroup#getMassgebendeNeigung <em>Massgebende Neigung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage#getFstr_DWeg_Allg_AttributeGroup()
 * @model extendedMetaData="name='CFstr_DWeg_Allg' kind='elementOnly'"
 * @generated
 */
public interface Fstr_DWeg_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Laenge Soll</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Solllänge des DWeges. Bei Stumpfgleiseinfahrten beträgt die Solllänge = 0. Bei DWegen \u0026gt; 0 und \u0026lt; 50 m ist die Solllänge = 50 m. Die Verkürzung ist explizit zu begründen. Eine Neuplanung ist allerdings nicht mehr erlaubt und kann deshalb nur in alten Planungen auftauchen. DB-Regelwerk Durchrutschwegtabelle, Spalte 7: \"Länge Soll\"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Laenge Soll</em>' containment reference.
	 * @see #setLaengeSoll(Laenge_Soll_TypeClass)
	 * @see org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage#getFstr_DWeg_Allg_AttributeGroup_LaengeSoll()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Laenge_Soll'"
	 * @generated
	 */
	Laenge_Soll_TypeClass getLaengeSoll();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_DWeg_Allg_AttributeGroup#getLaengeSoll <em>Laenge Soll</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Laenge Soll</em>' containment reference.
	 * @see #getLaengeSoll()
	 * @generated
	 */
	void setLaengeSoll(Laenge_Soll_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Massgebende Neigung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maßgebende Neigung des DWeges in Promille. Die Neigung ist für die Berechnung der Soll-Länge des DWeges relevant. DB-Regelwerk Durchrutschwegtabelle, Spalte 8: \"maßgebende Neigung\"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Massgebende Neigung</em>' containment reference.
	 * @see #setMassgebendeNeigung(Massgebende_Neigung_TypeClass)
	 * @see org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage#getFstr_DWeg_Allg_AttributeGroup_MassgebendeNeigung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Massgebende_Neigung'"
	 * @generated
	 */
	Massgebende_Neigung_TypeClass getMassgebendeNeigung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Fahrstrasse.Fstr_DWeg_Allg_AttributeGroup#getMassgebendeNeigung <em>Massgebende Neigung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Massgebende Neigung</em>' containment reference.
	 * @see #getMassgebendeNeigung()
	 * @generated
	 */
	void setMassgebendeNeigung(Massgebende_Neigung_TypeClass value);

} // Fstr_DWeg_Allg_AttributeGroup
