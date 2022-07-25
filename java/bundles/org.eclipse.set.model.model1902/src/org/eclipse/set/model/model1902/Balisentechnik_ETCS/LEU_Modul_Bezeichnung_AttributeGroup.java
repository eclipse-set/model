/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LEU Modul Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Modul_Bezeichnung_AttributeGroup#getModulnummer <em>Modulnummer</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Modul_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CLEU_Modul_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface LEU_Modul_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Modulnummer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nummer des LEU-Moduls, die eindeutig innerhalb einer LEU-Anlage zu wählen ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modulnummer</em>' containment reference.
	 * @see #setModulnummer(Modulnummer_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Modul_Bezeichnung_AttributeGroup_Modulnummer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Modulnummer'"
	 * @generated
	 */
	Modulnummer_TypeClass getModulnummer();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Modul_Bezeichnung_AttributeGroup#getModulnummer <em>Modulnummer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modulnummer</em>' containment reference.
	 * @see #getModulnummer()
	 * @generated
	 */
	void setModulnummer(Modulnummer_TypeClass value);

} // LEU_Modul_Bezeichnung_AttributeGroup
