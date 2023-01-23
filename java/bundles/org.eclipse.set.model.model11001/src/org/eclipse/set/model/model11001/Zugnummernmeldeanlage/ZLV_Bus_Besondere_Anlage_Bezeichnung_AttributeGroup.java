/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Zugnummernmeldeanlage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZLV Bus Besondere Anlage Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup#getBezeichnungBesondereAnlage <em>Bezeichnung Besondere Anlage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CZLV_Bus_Besondere_Anlage_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung Besondere Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung der besonderen Anlage, die Informationen über den ZLV-Bus empfängt bzw. sendet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung Besondere Anlage</em>' containment reference.
	 * @see #setBezeichnungBesondereAnlage(Bezeichnung_Besondere_Anlage_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup_BezeichnungBesondereAnlage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_Besondere_Anlage'"
	 * @generated
	 */
	Bezeichnung_Besondere_Anlage_TypeClass getBezeichnungBesondereAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup#getBezeichnungBesondereAnlage <em>Bezeichnung Besondere Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung Besondere Anlage</em>' containment reference.
	 * @see #getBezeichnungBesondereAnlage()
	 * @generated
	 */
	void setBezeichnungBesondereAnlage(Bezeichnung_Besondere_Anlage_TypeClass value);

} // ZLV_Bus_Besondere_Anlage_Bezeichnung_AttributeGroup
