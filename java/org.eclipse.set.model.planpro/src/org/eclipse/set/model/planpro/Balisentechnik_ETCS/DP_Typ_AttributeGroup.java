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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DP Typ Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_AttributeGroup#getDPTypArt <em>DP Typ Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_AttributeGroup#getDPTypGESG <em>DP Typ GESG</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_AttributeGroup#getDPTypGETCS <em>DP Typ GETCS</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_AttributeGroup#getDPTypGGNT <em>DP Typ GGNT</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_AttributeGroup#getDPTypGSonst <em>DP Typ GSonst</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_AttributeGroup#getDPTypGTrans <em>DP Typ GTrans</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_AttributeGroup#getDPTypGZBS <em>DP Typ GZBS</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Typ_AttributeGroup()
 * @model extendedMetaData="name='CDP_Typ' kind='elementOnly'"
 * @generated
 */
public interface DP_Typ_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>DP Typ Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das angegebene Anwendungssystem ist das sekundär genutzte. Sofern keine Angabe vorhanden ist, handelt es sich um das einzige oder primaer genutzte Anwendungssystem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DP Typ Art</em>' containment reference.
	 * @see #setDPTypArt(DP_Typ_Art_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Typ_AttributeGroup_DPTypArt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DP_Typ_Art'"
	 * @generated
	 */
	DP_Typ_Art_TypeClass getDPTypArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_AttributeGroup#getDPTypArt <em>DP Typ Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DP Typ Art</em>' containment reference.
	 * @see #getDPTypArt()
	 * @generated
	 */
	void setDPTypArt(DP_Typ_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>DP Typ GESG</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DP Typ GESG</em>' containment reference.
	 * @see #setDPTypGESG(DP_Typ_GESG_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Typ_AttributeGroup_DPTypGESG()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DP_Typ_GESG'"
	 * @generated
	 */
	DP_Typ_GESG_AttributeGroup getDPTypGESG();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_AttributeGroup#getDPTypGESG <em>DP Typ GESG</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DP Typ GESG</em>' containment reference.
	 * @see #getDPTypGESG()
	 * @generated
	 */
	void setDPTypGESG(DP_Typ_GESG_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>DP Typ GETCS</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_GETCS_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DP Typ GETCS</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Typ_AttributeGroup_DPTypGETCS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DP_Typ_GETCS'"
	 * @generated
	 */
	EList<DP_Typ_GETCS_AttributeGroup> getDPTypGETCS();

	/**
	 * Returns the value of the '<em><b>DP Typ GGNT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DP Typ GGNT</em>' containment reference.
	 * @see #setDPTypGGNT(DP_Typ_GGNT_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Typ_AttributeGroup_DPTypGGNT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DP_Typ_GGNT'"
	 * @generated
	 */
	DP_Typ_GGNT_AttributeGroup getDPTypGGNT();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_AttributeGroup#getDPTypGGNT <em>DP Typ GGNT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DP Typ GGNT</em>' containment reference.
	 * @see #getDPTypGGNT()
	 * @generated
	 */
	void setDPTypGGNT(DP_Typ_GGNT_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>DP Typ GSonst</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DP Typ GSonst</em>' containment reference.
	 * @see #setDPTypGSonst(DP_Typ_GSonst_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Typ_AttributeGroup_DPTypGSonst()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DP_Typ_GSonst'"
	 * @generated
	 */
	DP_Typ_GSonst_AttributeGroup getDPTypGSonst();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_AttributeGroup#getDPTypGSonst <em>DP Typ GSonst</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DP Typ GSonst</em>' containment reference.
	 * @see #getDPTypGSonst()
	 * @generated
	 */
	void setDPTypGSonst(DP_Typ_GSonst_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>DP Typ GTrans</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DP Typ GTrans</em>' containment reference.
	 * @see #setDPTypGTrans(DP_Typ_GTrans_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Typ_AttributeGroup_DPTypGTrans()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DP_Typ_GTrans'"
	 * @generated
	 */
	DP_Typ_GTrans_AttributeGroup getDPTypGTrans();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_AttributeGroup#getDPTypGTrans <em>DP Typ GTrans</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DP Typ GTrans</em>' containment reference.
	 * @see #getDPTypGTrans()
	 * @generated
	 */
	void setDPTypGTrans(DP_Typ_GTrans_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>DP Typ GZBS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DP Typ GZBS</em>' containment reference.
	 * @see #setDPTypGZBS(DP_Typ_GZBS_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Typ_AttributeGroup_DPTypGZBS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DP_Typ_GZBS'"
	 * @generated
	 */
	DP_Typ_GZBS_AttributeGroup getDPTypGZBS();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.DP_Typ_AttributeGroup#getDPTypGZBS <em>DP Typ GZBS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DP Typ GZBS</em>' containment reference.
	 * @see #getDPTypGZBS()
	 * @generated
	 */
	void setDPTypGZBS(DP_Typ_GZBS_AttributeGroup value);

} // DP_Typ_AttributeGroup
