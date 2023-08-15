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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZBS Merkmale Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZBS_Merkmale_AttributeGroup#getDPLinkArt <em>DP Link Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZBS_Merkmale_AttributeGroup#getZBSReaktion <em>ZBS Reaktion</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZBS_Merkmale_AttributeGroup()
 * @model extendedMetaData="name='CZBS_Merkmale' kind='elementOnly'"
 * @generated
 */
public interface ZBS_Merkmale_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>DP Link Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art des Linkings (Grund- oder Hilfs-). Der Ziel-Datenpunkt des Grund-Linkings muss mit dem Ziel-Datenpunkt des letzten Hilfs-Linkings übereinstimmen. Ist diese Bedingung nicht erfüllt, ist ein Verkettungsstützpunkt erforderlich. Ein Verkettungsstützpunkt besitzt keine Grundverkettung und er ist Start-DP für weitere Hilfs-Linkings mit unterschiedlichen Fachtelegrammen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DP Link Art</em>' containment reference.
	 * @see #setDPLinkArt(DP_Link_Art_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZBS_Merkmale_AttributeGroup_DPLinkArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DP_Link_Art'"
	 * @generated
	 */
	DP_Link_Art_TypeClass getDPLinkArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZBS_Merkmale_AttributeGroup#getDPLinkArt <em>DP Link Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DP Link Art</em>' containment reference.
	 * @see #getDPLinkArt()
	 * @generated
	 */
	void setDPLinkArt(DP_Link_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ZBS Reaktion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reaktion des Fahrzeuggeräts, wenn der unter ID_DP_Link_Ziel angegebene Ziel-Datenpunkt nicht gelesen wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZBS Reaktion</em>' containment reference.
	 * @see #setZBSReaktion(ZBS_Reaktion_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZBS_Merkmale_AttributeGroup_ZBSReaktion()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZBS_Reaktion'"
	 * @generated
	 */
	ZBS_Reaktion_TypeClass getZBSReaktion();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZBS_Merkmale_AttributeGroup#getZBSReaktion <em>ZBS Reaktion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZBS Reaktion</em>' containment reference.
	 * @see #getZBSReaktion()
	 * @generated
	 */
	void setZBSReaktion(ZBS_Reaktion_TypeClass value);

} // ZBS_Merkmale_AttributeGroup
