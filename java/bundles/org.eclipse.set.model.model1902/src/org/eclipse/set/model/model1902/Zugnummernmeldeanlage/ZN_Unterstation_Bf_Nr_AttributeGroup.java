/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Zugnummernmeldeanlage;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model1902.Verweise.ID_Oertlichkeit_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZN Unterstation Bf Nr Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Unterstation_Bf_Nr_AttributeGroup#getBfNr <em>Bf Nr</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Unterstation_Bf_Nr_AttributeGroup#getIDOertlichkeit <em>ID Oertlichkeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Unterstation_Bf_Nr_AttributeGroup#getPrioritaet <em>Prioritaet</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Unterstation_Bf_Nr_AttributeGroup()
 * @model extendedMetaData="name='CZN_Unterstation_Bf_Nr' kind='elementOnly'"
 * @generated
 */
public interface ZN_Unterstation_Bf_Nr_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bf Nr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der Bahnhofsadresse zur eindeutigen Identifikation einer Betriebsstelle. Zur eindeutigen Identifikation einer Betriebsstelle auf dem ZLV-Bus ist eine Bahnhofsadresse festzulegen. Die Bahnhofsadresse muss im Bereich der angrenzenden ZLV-Busse eindeutig sein. Bei der Verwendung von Bahnhosadressen in Bereichen mit (Koppel-/Mehrfach-)Unterstation (siehe ZN Unterstation Art) sind besondere Randbedingungen zu beachten. DB-Regelwerk 819.0731 5 (3) 819.0731 5 (4) Bei Bereichen mit (K/M)-Unterstationen: 819.0731 5 (5) - (7) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bf Nr</em>' containment reference.
	 * @see #setBfNr(Bf_Nr_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Unterstation_Bf_Nr_AttributeGroup_BfNr()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bf_Nr'"
	 * @generated
	 */
	Bf_Nr_TypeClass getBfNr();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Unterstation_Bf_Nr_AttributeGroup#getBfNr <em>Bf Nr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bf Nr</em>' containment reference.
	 * @see #getBfNr()
	 * @generated
	 */
	void setBfNr(Bf_Nr_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Oertlichkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Örtlichkeit, die einer Bahnhofsnummer zugeordnet ist, welche zusätzlich von der ZN_Unterstation verwaltet wird. Es ist der Wert \"Oertlichkeit_Abkuerzung\" zu verwenden. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Oertlichkeit</em>' containment reference.
	 * @see #setIDOertlichkeit(ID_Oertlichkeit_Proxy_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Unterstation_Bf_Nr_AttributeGroup_IDOertlichkeit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Oertlichkeit'"
	 * @generated
	 */
	ID_Oertlichkeit_Proxy_TypeClass getIDOertlichkeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Unterstation_Bf_Nr_AttributeGroup#getIDOertlichkeit <em>ID Oertlichkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Oertlichkeit</em>' containment reference.
	 * @see #getIDOertlichkeit()
	 * @generated
	 */
	void setIDOertlichkeit(ID_Oertlichkeit_Proxy_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Prioritaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der maßgebenden Bahnhofsnummer der ZN Unterstation Das Attribut wird nur für diejenige Bahnhofsnummer mit \"1\" befüllt, welche für die Kommunikation der ZN_Unterstation mit dem ZLV Bus maßgebend ist. In allen übrigen Fällen wird das Attribut nicht befüllt. DB-Regelwerk Das Planungsdatum hat keine Entsprechung im Regelwerk. Es findet zeichnerisch Anwendung auf dem ZLV-Bus-Übersichtsplan einzelner Regionen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prioritaet</em>' containment reference.
	 * @see #setPrioritaet(Prioritaet_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Unterstation_Bf_Nr_AttributeGroup_Prioritaet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Prioritaet'"
	 * @generated
	 */
	Prioritaet_TypeClass getPrioritaet();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Unterstation_Bf_Nr_AttributeGroup#getPrioritaet <em>Prioritaet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prioritaet</em>' containment reference.
	 * @see #getPrioritaet()
	 * @generated
	 */
	void setPrioritaet(Prioritaet_TypeClass value);

} // ZN_Unterstation_Bf_Nr_AttributeGroup
