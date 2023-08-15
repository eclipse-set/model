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
 * A representation of the model object '<em><b>ZUB Bereichsgrenze Nach Sonstige Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup#getBezeichnungZUB <em>Bezeichnung ZUB</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup#getLaengeAusfuehrungsbereich <em>Laenge Ausfuehrungsbereich</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup()
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
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup_BezeichnungZUB()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung_ZUB'"
	 * @generated
	 */
	Bezeichnung_ZUB_TypeClass getBezeichnungZUB();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup#getBezeichnungZUB <em>Bezeichnung ZUB</em>}' containment reference.
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
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup_LaengeAusfuehrungsbereich()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Laenge_Ausfuehrungsbereich'"
	 * @generated
	 */
	Laenge_Ausfuehrungsbereich_TypeClass getLaengeAusfuehrungsbereich();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup#getLaengeAusfuehrungsbereich <em>Laenge Ausfuehrungsbereich</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Laenge Ausfuehrungsbereich</em>' containment reference.
	 * @see #getLaengeAusfuehrungsbereich()
	 * @generated
	 */
	void setLaengeAusfuehrungsbereich(Laenge_Ausfuehrungsbereich_TypeClass value);

} // ZUB_Bereichsgrenze_Nach_Sonstige_AttributeGroup
