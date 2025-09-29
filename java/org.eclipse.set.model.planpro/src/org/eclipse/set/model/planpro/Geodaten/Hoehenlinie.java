/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Geodaten;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_Hoehenpunkt_TypeClass;
import org.eclipse.set.model.planpro.Verweise.ID_TOP_Kante_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hoehenlinie</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Höhenverlauf zwischen zwei Höhenpunkten.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Hoehenlinie#getHoehenlinieAllg <em>Hoehenlinie Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Hoehenlinie#getIDHoehenpunktA <em>ID Hoehenpunkt A</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Hoehenlinie#getIDHoehenpunktB <em>ID Hoehenpunkt B</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Geodaten.Hoehenlinie#getIDTOPKantePfad <em>IDTOP Kante Pfad</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getHoehenlinie()
 * @model extendedMetaData="name='CHoehenlinie' kind='elementOnly'"
 * @generated
 */
public interface Hoehenlinie extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Hoehenlinie Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hoehenlinie Allg</em>' containment reference.
	 * @see #setHoehenlinieAllg(Hoehenlinie_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getHoehenlinie_HoehenlinieAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Hoehenlinie_Allg'"
	 * @generated
	 */
	Hoehenlinie_Allg_AttributeGroup getHoehenlinieAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Hoehenlinie#getHoehenlinieAllg <em>Hoehenlinie Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hoehenlinie Allg</em>' containment reference.
	 * @see #getHoehenlinieAllg()
	 * @generated
	 */
	void setHoehenlinieAllg(Hoehenlinie_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Hoehenpunkt A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den Hoehenpunkt am Anfang der Hoehenlinie. Durch die Angabe des Anfangs- sowie des Endpunkts wird die Richtung der Hoehenlinie definiert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Hoehenpunkt A</em>' containment reference.
	 * @see #setIDHoehenpunktA(ID_Hoehenpunkt_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getHoehenlinie_IDHoehenpunktA()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Hoehenpunkt_A'"
	 * @generated
	 */
	ID_Hoehenpunkt_TypeClass getIDHoehenpunktA();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Hoehenlinie#getIDHoehenpunktA <em>ID Hoehenpunkt A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Hoehenpunkt A</em>' containment reference.
	 * @see #getIDHoehenpunktA()
	 * @generated
	 */
	void setIDHoehenpunktA(ID_Hoehenpunkt_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Hoehenpunkt B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den Hoehenpunkt am Ende der Hoehenlinie. Durch die Angabe des Anfangs- sowie des Endpunkts wird die Richtung der Hoehenlinie definiert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Hoehenpunkt B</em>' containment reference.
	 * @see #setIDHoehenpunktB(ID_Hoehenpunkt_TypeClass)
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getHoehenlinie_IDHoehenpunktB()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Hoehenpunkt_B'"
	 * @generated
	 */
	ID_Hoehenpunkt_TypeClass getIDHoehenpunktB();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Geodaten.Hoehenlinie#getIDHoehenpunktB <em>ID Hoehenpunkt B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Hoehenpunkt B</em>' containment reference.
	 * @see #getIDHoehenpunktB()
	 * @generated
	 */
	void setIDHoehenpunktB(ID_Hoehenpunkt_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDTOP Kante Pfad</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Verweise.ID_TOP_Kante_ohne_Proxy_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf vollständig von der Hoehenlinie überdeckte TOP-Kanten. Sind die begrenzenden Höhenpunkte A und B auf einer oder zwei aneinander angrenzenden TOP-Kanten verortet, ist keine Angabe erforderlich.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDTOP Kante Pfad</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Geodaten.GeodatenPackage#getHoehenlinie_IDTOPKantePfad()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_TOP_Kante_Pfad'"
	 * @generated
	 */
	EList<ID_TOP_Kante_ohne_Proxy_TypeClass> getIDTOPKantePfad();

} // Hoehenlinie
