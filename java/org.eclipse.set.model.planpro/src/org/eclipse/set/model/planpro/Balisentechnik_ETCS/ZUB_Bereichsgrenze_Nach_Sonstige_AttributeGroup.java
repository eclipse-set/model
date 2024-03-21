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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZUB Bereichsgrenze Nach Sonstige Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup#getBezeichnungZUB <em>Bezeichnung ZUB</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup#getLaengeAusfuehrungsbereich <em>Laenge Ausfuehrungsbereich</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup()
 * @model extendedMetaData="name='CZUB_Bereichsgrenze_Nach_Sonstige' kind='elementOnly'"
 * @generated
 */
public interface ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bezeichnung ZUB</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung des Class-B-Zugbeeinflussungssystems.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bezeichnung ZUB</em>' containment reference.
	 * @see #setBezeichnungZUB(Bezeichnung_ZUB_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup_BezeichnungZUB()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_ZUB'"
	 * @generated
	 */
	Bezeichnung_ZUB_TypeClass getBezeichnungZUB();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup#getBezeichnungZUB <em>Bezeichnung ZUB</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung ZUB</em>' containment reference.
	 * @see #getBezeichnungZUB()
	 * @generated
	 */
	void setBezeichnungZUB(Bezeichnung_ZUB_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Laenge Ausfuehrungsbereich</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Länge des Ausführungsbereichs (Distanz zwischen Transitions-Datenpunkt und dem max. Ende der Transition (ET)).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Laenge Ausfuehrungsbereich</em>' containment reference.
	 * @see #setLaengeAusfuehrungsbereich(Laenge_Ausfuehrungsbereich_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup_LaengeAusfuehrungsbereich()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Laenge_Ausfuehrungsbereich'"
	 * @generated
	 */
	Laenge_Ausfuehrungsbereich_TypeClass getLaengeAusfuehrungsbereich();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup#getLaengeAusfuehrungsbereich <em>Laenge Ausfuehrungsbereich</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Laenge Ausfuehrungsbereich</em>' containment reference.
	 * @see #getLaengeAusfuehrungsbereich()
	 * @generated
	 */
	void setLaengeAusfuehrungsbereich(Laenge_Ausfuehrungsbereich_TypeClass value);

} // ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup
