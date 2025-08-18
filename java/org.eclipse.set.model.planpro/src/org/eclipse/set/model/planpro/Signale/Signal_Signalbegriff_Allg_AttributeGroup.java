/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Signale;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Signalbegriff Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff_Allg_AttributeGroup#getAnschaltdauer <em>Anschaltdauer</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff_Allg_AttributeGroup#getBeleuchtet <em>Beleuchtet</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff_Allg_AttributeGroup#getGeschaltet <em>Geschaltet</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff_Allg_AttributeGroup#getZs2Ueberwacht <em>Zs2 Ueberwacht</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Signalbegriff_Allg_AttributeGroup()
 * @model extendedMetaData="name='CSignal_Signalbegriff_Allg' kind='elementOnly'"
 * @generated
 */
public interface Signal_Signalbegriff_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Anschaltdauer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anschaltdauer des Signalbegriffes. Eingetragen wird bei Ersatzsignal als Standardwert \"Z\" (zeitgesteuert - einheitlich 90 s); bei technisch abhängigen Signalbegriffen (z. B. Fahrtbegriffen) ein \"T\" sowie für Grundstellungsbegriffe ein \"G\". Es ist dabei unerheblich, wodurch die Abschaltung erzielt wird, z.B. sind auch mechanische Vorgänge möglich. Deswegen ist die Ausrichtung des Signalbegriffs mit zu betrachten, so leuchtet zwar ein Weichenlagemelder (z. B. Wn 1) ständig, der Signalbegriff ist aber nur angeschaltet, wenn er in der Richtung des Weichenanfangs zeigt. Weichenlagemelder haben deshalb die Anschaltdauer \"T\". DB-Regelwerk Im bisherigen PT1 ohne eindeutige Darstellung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anschaltdauer</em>' containment reference.
	 * @see #setAnschaltdauer(Anschaltdauer_TypeClass)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Signalbegriff_Allg_AttributeGroup_Anschaltdauer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Anschaltdauer'"
	 * @generated
	 */
	Anschaltdauer_TypeClass getAnschaltdauer();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff_Allg_AttributeGroup#getAnschaltdauer <em>Anschaltdauer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anschaltdauer</em>' containment reference.
	 * @see #getAnschaltdauer()
	 * @generated
	 */
	void setAnschaltdauer(Anschaltdauer_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Beleuchtet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gibt an, ob ein beleuchtbarer Signalbegriff beleuchtet wird. Als \"Beleuchtet\" gilt, wenn zur besseren Erkennbarkeit eines Signalbegriffs eine zusätzliche, signaltechnisch nicht überwachte Lichtquelle angebracht ist. Das Attribut ist dann und nur dann erforderlich, wenn das Attribut \"Beleuchtbar\" im zugehörigen Signalbegriff den Wert \"true\" hat. DB-Regelwerk Im bisherigen PT1 ohne eindeutige Darstellung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beleuchtet</em>' containment reference.
	 * @see #setBeleuchtet(Beleuchtet_TypeClass)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Signalbegriff_Allg_AttributeGroup_Beleuchtet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Beleuchtet'"
	 * @generated
	 */
	Beleuchtet_TypeClass getBeleuchtet();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff_Allg_AttributeGroup#getBeleuchtet <em>Beleuchtet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beleuchtet</em>' containment reference.
	 * @see #getBeleuchtet()
	 * @generated
	 */
	void setBeleuchtet(Beleuchtet_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Geschaltet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gibt an, ob ein schaltbarer Signalbegriff durch eine Außenelement-Ansteuerung den betrieblichen Erfordernissen am Signal aktiv angepasst werden kann. Das Attribut ist dann und nur dann erforderlich, wenn das Attribut \"Schaltbar\" im zugehörigen Signalbegriff den Wert \"true\" hat. Wertzuordnung: true - Signalbegriff ist (schaltbar und) geschaltet, false - Signalbegriff ist (schaltbar, aber) nicht geschaltet. Beispiel: Zs 3 ist grundsätzlich schaltbar (Schaltbar == \"true\"). Bei Ausführung aus Lichtsignal ist Geschaltet == \"true\", bei Ausführung als Blechtafel ist Geschaltet == \"false\". DB-Regelwerk Im bisherigen PT 1 ohne eindeutige Darstellung, oft aus dem Symbol des Signals im Sicherungstechnischen Lageplan / BÜ-Lageplan zu erkennen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geschaltet</em>' containment reference.
	 * @see #setGeschaltet(Geschaltet_TypeClass)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Signalbegriff_Allg_AttributeGroup_Geschaltet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Geschaltet'"
	 * @generated
	 */
	Geschaltet_TypeClass getGeschaltet();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff_Allg_AttributeGroup#getGeschaltet <em>Geschaltet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geschaltet</em>' containment reference.
	 * @see #getGeschaltet()
	 * @generated
	 */
	void setGeschaltet(Geschaltet_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Zs2 Ueberwacht</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob die Anschaltung von Zs 2 bzw. Zs 2v zu überwachen ist (true) oder nicht (false). Die Angabe erfolgt nur für die Signalbegriffe Zs 2 und Zs 2v. 
	 * Das Zs 2v wird i. d. R. überwacht, wenn auch das zugehörige Zs 2 überwacht wird. Ausnahmen sind möglich, wenn für ein zwingend zu überwachendes Zs 2 keine Vorsignalisierung erforderlich ist, diese aber auf Wunsch des Bestellers vorgesehen wird.
	 * DB-Regelwerk 
	 * Ril 819.0204 3 (2) Richtungsanzeiger anwenden Zwang
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zs2 Ueberwacht</em>' containment reference.
	 * @see #setZs2Ueberwacht(Zs2_Ueberwacht_TypeClass)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Signalbegriff_Allg_AttributeGroup_Zs2Ueberwacht()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Zs2_Ueberwacht'"
	 * @generated
	 */
	Zs2_Ueberwacht_TypeClass getZs2Ueberwacht();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Signalbegriff_Allg_AttributeGroup#getZs2Ueberwacht <em>Zs2 Ueberwacht</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zs2 Ueberwacht</em>' containment reference.
	 * @see #getZs2Ueberwacht()
	 * @generated
	 */
	void setZs2Ueberwacht(Zs2_Ueberwacht_TypeClass value);

} // Signal_Signalbegriff_Allg_AttributeGroup
