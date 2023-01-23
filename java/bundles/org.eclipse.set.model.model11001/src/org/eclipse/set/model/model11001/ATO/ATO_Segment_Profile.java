/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.ATO;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model11001.Verweise.ID_ATO_TS_Instanz_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_ATO_TS_Instanz_ohne_Proxy_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_ETCS_Kante_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Oertlichkeit_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ATO Segment Profile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Infrastrukturabschnitte mit definiertem Beginn und Ende sowie zugehörigen Infrastrukturangaben bzw. Eigenschaften für den atomatischen Bahnbetrieb (ATO). Die Definition der Richtung wird aus der zugehörigen ETCS-Kante übernommen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.ATO.ATO_Segment_Profile#getAbstandATOHaltVorEoA <em>Abstand ATO Halt Vor Eo A</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.ATO.ATO_Segment_Profile#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.ATO.ATO_Segment_Profile#getIDATOTSInstanz <em>IDATOTS Instanz</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.ATO.ATO_Segment_Profile#getIDATOTSInstanzNachbar <em>IDATOTS Instanz Nachbar</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.ATO.ATO_Segment_Profile#getIDETCSKante <em>IDETCS Kante</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.ATO.ATO_Segment_Profile#getIDOertlichkeit <em>ID Oertlichkeit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.ATO.ATOPackage#getATO_Segment_Profile()
 * @model extendedMetaData="name='CATO_Segment_Profile' kind='elementOnly'"
 * @generated
 */
public interface ATO_Segment_Profile extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Abstand ATO Halt Vor Eo A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Distanz vor dem eigentlichen Punkt der End of Authority (EoA) der relevanten ETCS MA, auf die ATO-OB den automatisch geführten Zug hin bremst. Der Parameter entspricht dem ATO-Parameter „D_EoA_Offset“ und beträgt in der Regel 5 m. Abweichende Angaben sind durch die betriebliche Infrastrukturplanung in der BAst vorzugeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstand ATO Halt Vor Eo A</em>' containment reference.
	 * @see #setAbstandATOHaltVorEoA(Abstand_ATO_Halt_Vor_EoA_TypeClass)
	 * @see org.eclipse.set.model.model11001.ATO.ATOPackage#getATO_Segment_Profile_AbstandATOHaltVorEoA()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Abstand_ATO_Halt_Vor_EoA'"
	 * @generated
	 */
	Abstand_ATO_Halt_Vor_EoA_TypeClass getAbstandATOHaltVorEoA();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.ATO.ATO_Segment_Profile#getAbstandATOHaltVorEoA <em>Abstand ATO Halt Vor Eo A</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstand ATO Halt Vor Eo A</em>' containment reference.
	 * @see #getAbstandATOHaltVorEoA()
	 * @generated
	 */
	void setAbstandATOHaltVorEoA(Abstand_ATO_Halt_Vor_EoA_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(ATO_Segment_Profile_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.ATO.ATOPackage#getATO_Segment_Profile_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	ATO_Segment_Profile_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.ATO.ATO_Segment_Profile#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(ATO_Segment_Profile_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDATOTS Instanz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die ATO-TS-Instanz, von der dieses Segment Profile verwaltet wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDATOTS Instanz</em>' containment reference.
	 * @see #setIDATOTSInstanz(ID_ATO_TS_Instanz_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.model11001.ATO.ATOPackage#getATO_Segment_Profile_IDATOTSInstanz()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_ATO_TS_Instanz'"
	 * @generated
	 */
	ID_ATO_TS_Instanz_ohne_Proxy_TypeClass getIDATOTSInstanz();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.ATO.ATO_Segment_Profile#getIDATOTSInstanz <em>IDATOTS Instanz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDATOTS Instanz</em>' containment reference.
	 * @see #getIDATOTSInstanz()
	 * @generated
	 */
	void setIDATOTSInstanz(ID_ATO_TS_Instanz_ohne_Proxy_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDATOTS Instanz Nachbar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die benachbarte ATO-TS-Instanz, der dieses Segment Profile bekannt ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDATOTS Instanz Nachbar</em>' containment reference.
	 * @see #setIDATOTSInstanzNachbar(ID_ATO_TS_Instanz_TypeClass)
	 * @see org.eclipse.set.model.model11001.ATO.ATOPackage#getATO_Segment_Profile_IDATOTSInstanzNachbar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_ATO_TS_Instanz_Nachbar'"
	 * @generated
	 */
	ID_ATO_TS_Instanz_TypeClass getIDATOTSInstanzNachbar();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.ATO.ATO_Segment_Profile#getIDATOTSInstanzNachbar <em>IDATOTS Instanz Nachbar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDATOTS Instanz Nachbar</em>' containment reference.
	 * @see #getIDATOTSInstanzNachbar()
	 * @generated
	 */
	void setIDATOTSInstanzNachbar(ID_ATO_TS_Instanz_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDETCS Kante</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die ETCS-Kante, deren Bezeichnung als Bezeichnung des Segment Profiles verwendet wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDETCS Kante</em>' containment reference.
	 * @see #setIDETCSKante(ID_ETCS_Kante_TypeClass)
	 * @see org.eclipse.set.model.model11001.ATO.ATOPackage#getATO_Segment_Profile_IDETCSKante()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_ETCS_Kante'"
	 * @generated
	 */
	ID_ETCS_Kante_TypeClass getIDETCSKante();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.ATO.ATO_Segment_Profile#getIDETCSKante <em>IDETCS Kante</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDETCS Kante</em>' containment reference.
	 * @see #getIDETCSKante()
	 * @generated
	 */
	void setIDETCSKante(ID_ETCS_Kante_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Oertlichkeit</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.Verweise.ID_Oertlichkeit_Proxy_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Betriebsstelle(n) (Örtlichkeiten), denen das Segment Profil zugeordnet ist. Aus der Zuordnung lässt sich der Zuständigkeitsbereich einer ATO-TS-Instanz ableiten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Oertlichkeit</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.ATO.ATOPackage#getATO_Segment_Profile_IDOertlichkeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Oertlichkeit'"
	 * @generated
	 */
	EList<ID_Oertlichkeit_Proxy_TypeClass> getIDOertlichkeit();

} // ATO_Segment_Profile
