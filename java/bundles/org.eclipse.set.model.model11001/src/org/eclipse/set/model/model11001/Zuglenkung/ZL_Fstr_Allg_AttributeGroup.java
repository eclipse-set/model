/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Zuglenkung;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZL Fstr Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Allg_AttributeGroup#getAnnaeherungsgeschwindigkeit <em>Annaeherungsgeschwindigkeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Allg_AttributeGroup#getDWegPrio <em>DWeg Prio</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Allg_AttributeGroup#getFstrBildezeit <em>Fstr Bildezeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Allg_AttributeGroup#getFUEMAuswertung <em>FUEM Auswertung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Allg_AttributeGroup#getSichtzeitVorsignal <em>Sichtzeit Vorsignal</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Zuglenkung.ZuglenkungPackage#getZL_Fstr_Allg_AttributeGroup()
 * @model extendedMetaData="name='CZL_Fstr_Allg' kind='elementOnly'"
 * @generated
 */
public interface ZL_Fstr_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Annaeherungsgeschwindigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Geschwindigkeit, die der Berechnung des Anstoßzeitpunktes einer Fahrstraße zugrunde liegt. Die genaue Verwendung des Begriffes ist momentan in der Abstimmung mit den Experten der ZL, da dort in den verschiedenen Bauformen unterschiedliche Philosophien umgesetzt wurden und die Lastenheft-Vorgabe nicht eindeutig ist. DB-Regelwerk Ermittlung gemäß 819.0732 15
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Annaeherungsgeschwindigkeit</em>' containment reference.
	 * @see #setAnnaeherungsgeschwindigkeit(Annaeherungsgeschwindigkeit_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZuglenkungPackage#getZL_Fstr_Allg_AttributeGroup_Annaeherungsgeschwindigkeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Annaeherungsgeschwindigkeit'"
	 * @generated
	 */
	Annaeherungsgeschwindigkeit_TypeClass getAnnaeherungsgeschwindigkeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Allg_AttributeGroup#getAnnaeherungsgeschwindigkeit <em>Annaeherungsgeschwindigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annaeherungsgeschwindigkeit</em>' containment reference.
	 * @see #getAnnaeherungsgeschwindigkeit()
	 * @generated
	 */
	void setAnnaeherungsgeschwindigkeit(Annaeherungsgeschwindigkeit_TypeClass value);

	/**
	 * Returns the value of the '<em><b>DWeg Prio</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * D-Weg-Priorität für die vorgesehene ZL-Fahrstraße, wenn diese aus betrieblichen Gründen gefordert wird. Es ist ein Zahlenwert von 0..4 einzutragen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DWeg Prio</em>' containment reference.
	 * @see #setDWegPrio(DWeg_Prio_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZuglenkungPackage#getZL_Fstr_Allg_AttributeGroup_DWegPrio()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DWeg_Prio'"
	 * @generated
	 */
	DWeg_Prio_TypeClass getDWegPrio();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Allg_AttributeGroup#getDWegPrio <em>DWeg Prio</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DWeg Prio</em>' containment reference.
	 * @see #getDWegPrio()
	 * @generated
	 */
	void setDWegPrio(DWeg_Prio_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Fstr Bildezeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Für die Ermittlung des rechtzeitigen Fahrstraßenanstoßes notwendige Fahrstraßenbildezeit. DB-Regelwerk Ril 819.0732
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fstr Bildezeit</em>' containment reference.
	 * @see #setFstrBildezeit(Fstr_Bildezeit_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZuglenkungPackage#getZL_Fstr_Allg_AttributeGroup_FstrBildezeit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Fstr_Bildezeit'"
	 * @generated
	 */
	Fstr_Bildezeit_TypeClass getFstrBildezeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Allg_AttributeGroup#getFstrBildezeit <em>Fstr Bildezeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fstr Bildezeit</em>' containment reference.
	 * @see #getFstrBildezeit()
	 * @generated
	 */
	void setFstrBildezeit(Fstr_Bildezeit_TypeClass value);

	/**
	 * Returns the value of the '<em><b>FUEM Auswertung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Auswertung der FUEM bei der Einstellung der ZL-Fahrstraße. Die FÜM-Auswertung (blinkend) ist notwendig, wenn bei der vorhergehenden Fstr. ein BÜ enthalten ist, der zum Zeitpunkt des Fstr.-Anstoßes noch nicht geschlossen ist. DB-Regelwerk 819.0732 8 (3) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FUEM Auswertung</em>' containment reference.
	 * @see #setFUEMAuswertung(FUEM_Auswertung_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZuglenkungPackage#getZL_Fstr_Allg_AttributeGroup_FUEMAuswertung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FUEM_Auswertung'"
	 * @generated
	 */
	FUEM_Auswertung_TypeClass getFUEMAuswertung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Allg_AttributeGroup#getFUEMAuswertung <em>FUEM Auswertung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FUEM Auswertung</em>' containment reference.
	 * @see #getFUEMAuswertung()
	 * @generated
	 */
	void setFUEMAuswertung(FUEM_Auswertung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Sichtzeit Vorsignal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der Sichtzeit auf das Vorsignal in Sekunden, Standard 15 Sekunden. Der Wert kann projektabhängig verändert werden. Für ZL-Fahrstraßen, die kein Vorsignal haben (LZB-Blockkennzeichen) ist der Wert „0“ anzugeben. DB-Regelwerk 819.0732 5 (2) 819.0732 11 (3) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sichtzeit Vorsignal</em>' containment reference.
	 * @see #setSichtzeitVorsignal(Sichtzeit_Vorsignal_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZuglenkungPackage#getZL_Fstr_Allg_AttributeGroup_SichtzeitVorsignal()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Sichtzeit_Vorsignal'"
	 * @generated
	 */
	Sichtzeit_Vorsignal_TypeClass getSichtzeitVorsignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Fstr_Allg_AttributeGroup#getSichtzeitVorsignal <em>Sichtzeit Vorsignal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sichtzeit Vorsignal</em>' containment reference.
	 * @see #getSichtzeitVorsignal()
	 * @generated
	 */
	void setSichtzeitVorsignal(Sichtzeit_Vorsignal_TypeClass value);

} // ZL_Fstr_Allg_AttributeGroup
