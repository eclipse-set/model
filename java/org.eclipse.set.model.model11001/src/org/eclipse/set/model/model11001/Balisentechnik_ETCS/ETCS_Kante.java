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

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model11001.Verweise.ID_ETCS_Knoten_ohne_Proxy_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_RBC_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Strecke_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_TOP_Kante_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETCS Kante</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abbildung der Kante des ETCS-spezifischen Knoten-Kanten-Modells auf das topologische PlanPro-Knoten-Kanten-Modell.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_Kante#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_Kante#getIDETCSKnotenA <em>IDETCS Knoten A</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_Kante#getIDETCSKnotenB <em>IDETCS Knoten B</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_Kante#getIDRBC <em>IDRBC</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_Kante#getIDStrecke <em>ID Strecke</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_Kante#getIDTOPKante <em>IDTOP Kante</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Kante()
 * @model extendedMetaData="name='CETCS_Kante' kind='elementOnly'"
 * @generated
 */
public interface ETCS_Kante extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(ETCS_Kante_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Kante_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	ETCS_Kante_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_Kante#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(ETCS_Kante_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDETCS Knoten A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den ETCS-Knoten am Anfang der Kante.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDETCS Knoten A</em>' containment reference.
	 * @see #setIDETCSKnotenA(ID_ETCS_Knoten_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Kante_IDETCSKnotenA()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_ETCS_Knoten_A'"
	 * @generated
	 */
	ID_ETCS_Knoten_ohne_Proxy_TypeClass getIDETCSKnotenA();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_Kante#getIDETCSKnotenA <em>IDETCS Knoten A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDETCS Knoten A</em>' containment reference.
	 * @see #getIDETCSKnotenA()
	 * @generated
	 */
	void setIDETCSKnotenA(ID_ETCS_Knoten_ohne_Proxy_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDETCS Knoten B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den ETCS-Knoten am Ende der Kante.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDETCS Knoten B</em>' containment reference.
	 * @see #setIDETCSKnotenB(ID_ETCS_Knoten_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Kante_IDETCSKnotenB()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_ETCS_Knoten_B'"
	 * @generated
	 */
	ID_ETCS_Knoten_ohne_Proxy_TypeClass getIDETCSKnotenB();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_Kante#getIDETCSKnotenB <em>IDETCS Knoten B</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDETCS Knoten B</em>' containment reference.
	 * @see #getIDETCSKnotenB()
	 * @generated
	 */
	void setIDETCSKnotenB(ID_ETCS_Knoten_ohne_Proxy_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDRBC</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.Verweise.ID_RBC_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das RBC, in dessen Bereich die ETCS-Kante liegt. Im Bereich der RBC-Grenze ist ggf. eine Mehrfachangabe erforderlich.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDRBC</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Kante_IDRBC()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_RBC'"
	 * @generated
	 */
	EList<ID_RBC_TypeClass> getIDRBC();

	/**
	 * Returns the value of the '<em><b>ID Strecke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Strecke, der die STCS-Kante zugeordnet wird. Die Angabe lässt sich durch Auswertung der topologischen Verortung der Strecke(n) sowie der Verortung der ETCS_Knoten ermitteln. Eine Abspeicherung kann zur Erleichterung weiterer Anwendungen (z. B. DiB) erfolgen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Strecke</em>' containment reference.
	 * @see #setIDStrecke(ID_Strecke_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Kante_IDStrecke()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Strecke'"
	 * @generated
	 */
	ID_Strecke_TypeClass getIDStrecke();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_Kante#getIDStrecke <em>ID Strecke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Strecke</em>' containment reference.
	 * @see #getIDStrecke()
	 * @generated
	 */
	void setIDStrecke(ID_Strecke_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDTOP Kante</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.Verweise.ID_TOP_Kante_ohne_Proxy_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die TOP-Kanten, die vollständig oder teilweise die ETCS-Kante bilden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDTOP Kante</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Kante_IDTOPKante()
	 * @model containment="true" required="true" upper="3"
	 *        extendedMetaData="kind='element' name='ID_TOP_Kante'"
	 * @generated
	 */
	EList<ID_TOP_Kante_ohne_Proxy_TypeClass> getIDTOPKante();

} // ETCS_Kante
