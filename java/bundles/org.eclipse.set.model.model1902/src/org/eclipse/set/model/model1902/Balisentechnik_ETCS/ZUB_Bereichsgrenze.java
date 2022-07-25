/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.model1902.Basisobjekte.Punkt_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_Oertlichkeit_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZUB Bereichsgrenze</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Grenze des Ausrüstungsbereichs eines Zugbeeinflussungssystems oder RBC-Grenze bei L2. Auch im Lastenheft bzw. Planungsregelwerk als Ausstieg definierte Bereichsgrenzen werden im Datenmodell generell als Einstieg abgebildet. Später Einstieg wird nicht abgebildet
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze#getIDOertlichkeit <em>ID Oertlichkeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze#getZUBBereichsgrenzeAllg <em>ZUB Bereichsgrenze Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze#getZUBBereichsgrenzeNachESG <em>ZUB Bereichsgrenze Nach ESG</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze#getZUBBereichsgrenzeNachGNT <em>ZUB Bereichsgrenze Nach GNT</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze#getZUBBereichsgrenzeNachL2 <em>ZUB Bereichsgrenze Nach L2</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze#getZUBBereichsgrenzeNachLZB <em>ZUB Bereichsgrenze Nach LZB</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze#getZUBBereichsgrenzeNachOhne <em>ZUB Bereichsgrenze Nach Ohne</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze#getZUBBereichsgrenzeNachPZB <em>ZUB Bereichsgrenze Nach PZB</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze#getZUBBereichsgrenzeNachSonstige <em>ZUB Bereichsgrenze Nach Sonstige</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze#getZUBBgrenzeRBCWechsel <em>ZUB Bgrenze RBC Wechsel</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze()
 * @model extendedMetaData="name='CZUB_Bereichsgrenze' kind='elementOnly'"
 * @generated
 */
public interface ZUB_Bereichsgrenze extends Punkt_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(ZUB_Bereichsgrenze_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Bezeichnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	ZUB_Bereichsgrenze_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(ZUB_Bereichsgrenze_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Oertlichkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maßgebende Örtlichkeit des Stellbereichs, in dem sich die Bereichsgrenze befindet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Oertlichkeit</em>' containment reference.
	 * @see #setIDOertlichkeit(ID_Oertlichkeit_Proxy_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_IDOertlichkeit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Oertlichkeit'"
	 * @generated
	 */
	ID_Oertlichkeit_Proxy_TypeClass getIDOertlichkeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze#getIDOertlichkeit <em>ID Oertlichkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Oertlichkeit</em>' containment reference.
	 * @see #getIDOertlichkeit()
	 * @generated
	 */
	void setIDOertlichkeit(ID_Oertlichkeit_Proxy_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ZUB Bereichsgrenze Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZUB Bereichsgrenze Allg</em>' containment reference.
	 * @see #setZUBBereichsgrenzeAllg(ZUB_Bereichsgrenze_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_ZUBBereichsgrenzeAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZUB_Bereichsgrenze_Allg'"
	 * @generated
	 */
	ZUB_Bereichsgrenze_Allg_AttributeGroup getZUBBereichsgrenzeAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze#getZUBBereichsgrenzeAllg <em>ZUB Bereichsgrenze Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZUB Bereichsgrenze Allg</em>' containment reference.
	 * @see #getZUBBereichsgrenzeAllg()
	 * @generated
	 */
	void setZUBBereichsgrenzeAllg(ZUB_Bereichsgrenze_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ZUB Bereichsgrenze Nach ESG</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_ESG_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZUB Bereichsgrenze Nach ESG</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_ZUBBereichsgrenzeNachESG()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZUB_Bereichsgrenze_Nach_ESG'"
	 * @generated
	 */
	EList<ZUB_Bereichsgrenze_Nach_ESG_AttributeGroup> getZUBBereichsgrenzeNachESG();

	/**
	 * Returns the value of the '<em><b>ZUB Bereichsgrenze Nach GNT</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_GNT_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZUB Bereichsgrenze Nach GNT</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_ZUBBereichsgrenzeNachGNT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZUB_Bereichsgrenze_Nach_GNT'"
	 * @generated
	 */
	EList<ZUB_Bereichsgrenze_Nach_GNT_AttributeGroup> getZUBBereichsgrenzeNachGNT();

	/**
	 * Returns the value of the '<em><b>ZUB Bereichsgrenze Nach L2</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZUB Bereichsgrenze Nach L2</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_ZUBBereichsgrenzeNachL2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZUB_Bereichsgrenze_Nach_L2'"
	 * @generated
	 */
	EList<ZUB_Bereichsgrenze_Nach_L2_AttributeGroup> getZUBBereichsgrenzeNachL2();

	/**
	 * Returns the value of the '<em><b>ZUB Bereichsgrenze Nach LZB</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_LZB_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZUB Bereichsgrenze Nach LZB</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_ZUBBereichsgrenzeNachLZB()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZUB_Bereichsgrenze_Nach_LZB'"
	 * @generated
	 */
	EList<ZUB_Bereichsgrenze_Nach_LZB_AttributeGroup> getZUBBereichsgrenzeNachLZB();

	/**
	 * Returns the value of the '<em><b>ZUB Bereichsgrenze Nach Ohne</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei Übergang von L2 nach OHNE handelt es sich stets um einen harten Ausstieg. Bei einem harten Ausstieg erfolgt keine Ankündigung durch das RBC.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZUB Bereichsgrenze Nach Ohne</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_ZUBBereichsgrenzeNachOhne()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZUB_Bereichsgrenze_Nach_Ohne'"
	 * @generated
	 */
	EList<ZUB_Bereichsgrenze_Nach_Ohne_AttributeGroup> getZUBBereichsgrenzeNachOhne();

	/**
	 * Returns the value of the '<em><b>ZUB Bereichsgrenze Nach PZB</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_PZB_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZUB Bereichsgrenze Nach PZB</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_ZUBBereichsgrenzeNachPZB()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZUB_Bereichsgrenze_Nach_PZB'"
	 * @generated
	 */
	EList<ZUB_Bereichsgrenze_Nach_PZB_AttributeGroup> getZUBBereichsgrenzeNachPZB();

	/**
	 * Returns the value of the '<em><b>ZUB Bereichsgrenze Nach Sonstige</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Übergang in ein Class-B-Zugbeeinflussungssystem.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZUB Bereichsgrenze Nach Sonstige</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_ZUBBereichsgrenzeNachSonstige()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZUB_Bereichsgrenze_Nach_Sonstige'"
	 * @generated
	 */
	EList<ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup> getZUBBereichsgrenzeNachSonstige();

	/**
	 * Returns the value of the '<em><b>ZUB Bgrenze RBC Wechsel</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bgrenze_RBC_Wechsel_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZUB Bgrenze RBC Wechsel</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_ZUBBgrenzeRBCWechsel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZUB_Bgrenze_RBC_Wechsel'"
	 * @generated
	 */
	EList<ZUB_Bgrenze_RBC_Wechsel_AttributeGroup> getZUBBgrenzeRBCWechsel();

} // ZUB_Bereichsgrenze
