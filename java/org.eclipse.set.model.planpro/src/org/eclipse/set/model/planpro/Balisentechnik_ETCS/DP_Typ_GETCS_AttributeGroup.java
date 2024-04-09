/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.planpro.Verweise.ID_DP_Bezug_Funktional_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DP Typ GETCS Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_GETCS_AttributeGroup#getDPATO <em>DPATO</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_GETCS_AttributeGroup#getDPTypETCS <em>DP Typ ETCS</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_GETCS_AttributeGroup#getIDDPBezugFunktional <em>IDDP Bezug Funktional</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_GETCS_AttributeGroup#getVerkuerzterAbstand <em>Verkuerzter Abstand</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Typ_GETCS_AttributeGroup()
 * @model extendedMetaData="name='CDP_Typ_GETCS' kind='elementOnly'"
 * @generated
 */
public interface DP_Typ_GETCS_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>DPATO</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verwendungsart des Datenpunkt(typ)s bei Nutzung für ATO. Das Attribut kann die Werte \"Präzisionshalt\", \"Präzisionshalt hochpräzise\" (mit besonderen Anforderungen hinsichtlich Platzierung und Einmessung) und \"sonstige\" (sonstige Funktion für ATO, die mittels Bearbeitungsvermerk zu erläutern ist) annehmen. Hat der Datenpunkt(typ) für ATO keinerlei Funktion, entfällt das Attribut.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DPATO</em>' containment reference.
	 * @see #setDPATO(DP_ATO_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Typ_GETCS_AttributeGroup_DPATO()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DP_ATO'"
	 * @generated
	 */
	DP_ATO_TypeClass getDPATO();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_GETCS_AttributeGroup#getDPATO <em>DPATO</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DPATO</em>' containment reference.
	 * @see #getDPATO()
	 * @generated
	 */
	void setDPATO(DP_ATO_TypeClass value);

	/**
	 * Returns the value of the '<em><b>DP Typ ETCS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Durch das Anwendungssystem ETCS definierter Datenpunkttyp. Bei zusammengefassten Datenpunkttypen erfolgt eine mehrfache Angabe.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DP Typ ETCS</em>' containment reference.
	 * @see #setDPTypETCS(DP_Typ_ETCS_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Typ_GETCS_AttributeGroup_DPTypETCS()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DP_Typ_ETCS'"
	 * @generated
	 */
	DP_Typ_ETCS_TypeClass getDPTypETCS();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_GETCS_AttributeGroup#getDPTypETCS <em>DP Typ ETCS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DP Typ ETCS</em>' containment reference.
	 * @see #getDPTypETCS()
	 * @generated
	 */
	void setDPTypETCS(DP_Typ_ETCS_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDDP Bezug Funktional</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element, auf das sich der fachliche Inhalt des Datenpunkts bezieht. Der fachliche Bezug kann Vorgaben für die Positionierung des Datenpunkts beinhalten. Die Angabe ist nur erforderlich, sofern sich dieser Punkt nicht über eine zugehörige LEU-Anlage ermittelt werden kann bzw. soll. Große Metallteile werden über ZUB_Streckeneigenschaft abgebildet. Bei ETCS L2 erfolgt die Angabe des Bezugspunkts im Zuammenhang mit dem DP-Typ.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDDP Bezug Funktional</em>' containment reference.
	 * @see #setIDDPBezugFunktional(ID_DP_Bezug_Funktional_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Typ_GETCS_AttributeGroup_IDDPBezugFunktional()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_DP_Bezug_Funktional'"
	 * @generated
	 */
	ID_DP_Bezug_Funktional_TypeClass getIDDPBezugFunktional();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_GETCS_AttributeGroup#getIDDPBezugFunktional <em>IDDP Bezug Funktional</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDDP Bezug Funktional</em>' containment reference.
	 * @see #getIDDPBezugFunktional()
	 * @generated
	 */
	void setIDDPBezugFunktional(ID_DP_Bezug_Funktional_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Verkuerzter Abstand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei DP 26: Angabe des Abstands, um den der Beginn der Langsamfahrstelle verkürzt wird. DB-Regelwerk Ril 819.1344, 4.1 (31)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verkuerzter Abstand</em>' containment reference.
	 * @see #setVerkuerzterAbstand(Verkuerzter_Abstand_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Typ_GETCS_AttributeGroup_VerkuerzterAbstand()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Verkuerzter_Abstand'"
	 * @generated
	 */
	Verkuerzter_Abstand_TypeClass getVerkuerzterAbstand();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_GETCS_AttributeGroup#getVerkuerzterAbstand <em>Verkuerzter Abstand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verkuerzter Abstand</em>' containment reference.
	 * @see #getVerkuerzterAbstand()
	 * @generated
	 */
	void setVerkuerzterAbstand(Verkuerzter_Abstand_TypeClass value);

} // DP_Typ_GETCS_AttributeGroup
