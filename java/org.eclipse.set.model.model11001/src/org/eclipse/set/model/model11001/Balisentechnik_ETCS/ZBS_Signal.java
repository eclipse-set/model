/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Balisentechnik_ETCS;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model11001.Verweise.ID_Signal_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZBS Signal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zusatzangaben für Signale im Zusammenhang mit ZBS.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZBS_Signal#getIDSignal <em>ID Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZBS_Signal#getZBSSignalSignalabstand <em>ZBS Signal Signalabstand</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZBS_Signal()
 * @model extendedMetaData="name='CZBS_Signal' kind='elementOnly'"
 * @generated
 */
public interface ZBS_Signal extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das zugehörige Signal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal</em>' containment reference.
	 * @see #setIDSignal(ID_Signal_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZBS_Signal_IDSignal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Signal'"
	 * @generated
	 */
	ID_Signal_ohne_Proxy_TypeClass getIDSignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZBS_Signal#getIDSignal <em>ID Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Signal</em>' containment reference.
	 * @see #getIDSignal()
	 * @generated
	 */
	void setIDSignal(ID_Signal_ohne_Proxy_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ZBS Signal Signalabstand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZBS Signal Signalabstand</em>' containment reference.
	 * @see #setZBSSignalSignalabstand(ZBS_Signal_Signalabstand_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZBS_Signal_ZBSSignalSignalabstand()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZBS_Signal_Signalabstand'"
	 * @generated
	 */
	ZBS_Signal_Signalabstand_AttributeGroup getZBSSignalSignalabstand();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZBS_Signal#getZBSSignalSignalabstand <em>ZBS Signal Signalabstand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZBS Signal Signalabstand</em>' containment reference.
	 * @see #getZBSSignalSignalabstand()
	 * @generated
	 */
	void setZBSSignalSignalabstand(ZBS_Signal_Signalabstand_AttributeGroup value);

} // ZBS_Signal
