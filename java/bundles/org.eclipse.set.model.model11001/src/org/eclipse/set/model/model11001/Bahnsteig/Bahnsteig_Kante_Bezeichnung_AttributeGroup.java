/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bahnsteig;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bahnsteig Kante Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Kante_Bezeichnung_AttributeGroup#getBezeichnungBahnsteigKante <em>Bezeichnung Bahnsteig Kante</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Bahnsteig.BahnsteigPackage#getBahnsteig_Kante_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CBahnsteig_Kante_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface Bahnsteig_Kante_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung Bahnsteig Kante</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung der Bahnsteig Kante. Die Bezeichnung der Bahnsteigkante ist für die LST-Planung relevant und muss vergeben werden. In verkehrlichen Unterlagen wird der Name unter \"Gleis\" bekanntgegeben, worauf im Datenmodell verzichtet wird, da hier \"Gleis\" im betrieblichen Sinne verwendet wird. Bezeichnungsbeispiel siehe Bezeichnung Bahnsteig Anlage. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung Bahnsteig Kante</em>' containment reference.
	 * @see #setBezeichnungBahnsteigKante(Bezeichnung_Bahnsteig_Kante_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bahnsteig.BahnsteigPackage#getBahnsteig_Kante_Bezeichnung_AttributeGroup_BezeichnungBahnsteigKante()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_Bahnsteig_Kante'"
	 * @generated
	 */
	Bezeichnung_Bahnsteig_Kante_TypeClass getBezeichnungBahnsteigKante();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Kante_Bezeichnung_AttributeGroup#getBezeichnungBahnsteigKante <em>Bezeichnung Bahnsteig Kante</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung Bahnsteig Kante</em>' containment reference.
	 * @see #getBezeichnungBahnsteigKante()
	 * @generated
	 */
	void setBezeichnungBahnsteigKante(Bezeichnung_Bahnsteig_Kante_TypeClass value);

} // Bahnsteig_Kante_Bezeichnung_AttributeGroup
