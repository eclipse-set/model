/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Zugnummernmeldeanlage;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZLV Bus</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zuglaufverfolgungsbus. Verbindung zwischen den ZN-Unterstationen zum Transport der Zugnummernmeldetelegramme. ZLV-Busse können BZ-übergreifend geplant werden. In diesem Fall gelten für die Vergabe der ZLV Bus Nr besondere Bedingungen. DB-Regelwerk 819.0731 8 (2) Die Darstellung der Angaben erfolgt im ZLV-Bus-Übersichtsplan nach 819.0731 A01 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZLV_Bus#getZLVBusAllg <em>ZLV Bus Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZLV_Bus()
 * @model extendedMetaData="name='CZLV_Bus' kind='elementOnly'"
 * @generated
 */
public interface ZLV_Bus extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ZLV Bus Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZLV Bus Allg</em>' containment reference.
	 * @see #setZLVBusAllg(ZLV_Bus_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZLV_Bus_ZLVBusAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZLV_Bus_Allg'"
	 * @generated
	 */
	ZLV_Bus_Allg_AttributeGroup getZLVBusAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZLV_Bus#getZLVBusAllg <em>ZLV Bus Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZLV Bus Allg</em>' containment reference.
	 * @see #getZLVBusAllg()
	 * @generated
	 */
	void setZLVBusAllg(ZLV_Bus_Allg_AttributeGroup value);

} // ZLV_Bus
