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

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model11001.Verweise.ID_ZN_Anzeigefeld_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_ZN_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZN Akustik</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Akustisches Signal bei Befüllung eines ZN-Anzeigefeldes mit einer Zugnummer Bei der Planung der ZN-Akustik sind herstellerspezifische Besonderheiten zu beachten. Akustiken im Anbiete-/Annahmefeld sind Standard und nicht gesondert zu planen. Das Objekt bzw. die Attributgruppe wird bei Anbiete/Annahme- sowie Voranzeigefeldern IMMER angelegt, um die Dauer der Akustik festzulegen. Für die weiteren ZN-Anzeigefelder wird das Objekt nur dann angelegt, wenn das betreffene ZN Anzeigefeld mit einer Akustik ausgestatteet wird. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht vorhanden. Es findet sich im Lastenheft sowie in den firmenspezifischen Projektierungsunterlagen, die dem LST-Fachplaner nicht zur Verfügung stehen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Akustik#getZNAkustikAnzeigefeld <em>ZN Akustik Anzeigefeld</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Akustik#getIDZN <em>IDZN</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Akustik#getIDZNAnzeigefeld <em>IDZN Anzeigefeld</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Akustik()
 * @model extendedMetaData="name='CZN_Akustik' kind='elementOnly'"
 * @generated
 */
public interface ZN_Akustik extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ZN Akustik Anzeigefeld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZN Akustik Anzeigefeld</em>' containment reference.
	 * @see #setZNAkustikAnzeigefeld(ZN_Akustik_Anzeigefeld_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Akustik_ZNAkustikAnzeigefeld()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZN_Akustik_Anzeigefeld'"
	 * @generated
	 */
	ZN_Akustik_Anzeigefeld_AttributeGroup getZNAkustikAnzeigefeld();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Akustik#getZNAkustikAnzeigefeld <em>ZN Akustik Anzeigefeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZN Akustik Anzeigefeld</em>' containment reference.
	 * @see #getZNAkustikAnzeigefeld()
	 * @generated
	 */
	void setZNAkustikAnzeigefeld(ZN_Akustik_Anzeigefeld_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDZN</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die ZN, für die eine Akustik geplant wird, sofern keine ZN-Anzeigefeld-spezifische Planung möglich ist (herstellerabhängig). 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZN</em>' containment reference.
	 * @see #setIDZN(ID_ZN_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Akustik_IDZN()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_ZN'"
	 * @generated
	 */
	ID_ZN_TypeClass getIDZN();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Akustik#getIDZN <em>IDZN</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZN</em>' containment reference.
	 * @see #getIDZN()
	 * @generated
	 */
	void setIDZN(ID_ZN_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDZN Anzeigefeld</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das ZN-Anzeigefeld, für das eine Akustik geplant wird (herstellerabhängig). 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZN Anzeigefeld</em>' containment reference.
	 * @see #setIDZNAnzeigefeld(ID_ZN_Anzeigefeld_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Akustik_IDZNAnzeigefeld()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_ZN_Anzeigefeld'"
	 * @generated
	 */
	ID_ZN_Anzeigefeld_TypeClass getIDZNAnzeigefeld();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Akustik#getIDZNAnzeigefeld <em>IDZN Anzeigefeld</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZN Anzeigefeld</em>' containment reference.
	 * @see #getIDZNAnzeigefeld()
	 * @generated
	 */
	void setIDZNAnzeigefeld(ID_ZN_Anzeigefeld_TypeClass value);

} // ZN_Akustik
