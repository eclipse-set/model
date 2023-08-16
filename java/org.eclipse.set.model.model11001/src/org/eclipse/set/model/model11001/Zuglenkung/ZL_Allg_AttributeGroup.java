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
 * A representation of the model object '<em><b>ZL Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Allg_AttributeGroup#getAnzahlWiederholZLAnstoesse <em>Anzahl Wiederhol ZL Anstoesse</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Allg_AttributeGroup#getDeadlockpruefung <em>Deadlockpruefung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Allg_AttributeGroup#getEinstellkontrollzeit <em>Einstellkontrollzeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Allg_AttributeGroup#getLenkabbruchzeit <em>Lenkabbruchzeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Allg_AttributeGroup#getPersonalReaktionszeit <em>Personal Reaktionszeit</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Zuglenkung.ZuglenkungPackage#getZL_Allg_AttributeGroup()
 * @model extendedMetaData="name='CZL_Allg' kind='elementOnly'"
 * @generated
 */
public interface ZL_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Anzahl Wiederhol ZL Anstoesse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anzahl erneuter Stellversuche nach negativer Stw-Quittung im Warteintervall von Standard 3-5 s nach positiver Stellbarkeitsprüfung der ZL. DB-Regelwerk 819.0732 5 (2) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anzahl Wiederhol ZL Anstoesse</em>' containment reference.
	 * @see #setAnzahlWiederholZLAnstoesse(Anzahl_Wiederhol_ZL_Anstoesse_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZuglenkungPackage#getZL_Allg_AttributeGroup_AnzahlWiederholZLAnstoesse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Anzahl_Wiederhol_ZL_Anstoesse'"
	 * @generated
	 */
	Anzahl_Wiederhol_ZL_Anstoesse_TypeClass getAnzahlWiederholZLAnstoesse();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Allg_AttributeGroup#getAnzahlWiederholZLAnstoesse <em>Anzahl Wiederhol ZL Anstoesse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anzahl Wiederhol ZL Anstoesse</em>' containment reference.
	 * @see #getAnzahlWiederholZLAnstoesse()
	 * @generated
	 */
	void setAnzahlWiederholZLAnstoesse(Anzahl_Wiederhol_ZL_Anstoesse_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Deadlockpruefung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In der Zuglenkung ist eine Deadlockprüfung (DLP) zu projektieren. Die Angabe, welche Gleisabschnitte in die Prüfung einzubeziehen sind, erfolgt über ein gesondertes Objekt. Die Objekt-Instanzen, die in die DLP einbezogen werden müssen, werden mit den Objekten ZL DLP Fstr und ZL DLP Abschnitt festgelegt. DB-Regelwerk TM 2011-024 I.NVT3 (Fa. Thales) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deadlockpruefung</em>' containment reference.
	 * @see #setDeadlockpruefung(Deadlockpruefung_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZuglenkungPackage#getZL_Allg_AttributeGroup_Deadlockpruefung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Deadlockpruefung'"
	 * @generated
	 */
	Deadlockpruefung_TypeClass getDeadlockpruefung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Allg_AttributeGroup#getDeadlockpruefung <em>Deadlockpruefung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deadlockpruefung</em>' containment reference.
	 * @see #getDeadlockpruefung()
	 * @generated
	 */
	void setDeadlockpruefung(Deadlockpruefung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Einstellkontrollzeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prüfung auf Fahrtstellung Signal nach Anstoß innerhalb einer Zeit, bei Nicht-Fahrtstellung Lenkabbruch, Angabe in Sekunden, Standard 120 s. Der gewählte Wert muss größer sein als die Summe aus Anstoßverzögerung und Fahrstraßenbildungszeit. DB-Regelwerk 819.0732 5 (5) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einstellkontrollzeit</em>' containment reference.
	 * @see #setEinstellkontrollzeit(Einstellkontrollzeit_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZuglenkungPackage#getZL_Allg_AttributeGroup_Einstellkontrollzeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Einstellkontrollzeit'"
	 * @generated
	 */
	Einstellkontrollzeit_TypeClass getEinstellkontrollzeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Allg_AttributeGroup#getEinstellkontrollzeit <em>Einstellkontrollzeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einstellkontrollzeit</em>' containment reference.
	 * @see #getEinstellkontrollzeit()
	 * @generated
	 */
	void setEinstellkontrollzeit(Einstellkontrollzeit_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Lenkabbruchzeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zeit bis zum Lenkabbruch, wenn die zyklische Stellbarkeitsprüfung der ZL bis dahin negativ war. Der Standard-Wert beträgt 600 s. Die Angabe in den Tools muss in Minuten erfolgen. DB-Regelwerk 819.0732 5 (5) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lenkabbruchzeit</em>' containment reference.
	 * @see #setLenkabbruchzeit(Lenkabbruchzeit_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZuglenkungPackage#getZL_Allg_AttributeGroup_Lenkabbruchzeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Lenkabbruchzeit'"
	 * @generated
	 */
	Lenkabbruchzeit_TypeClass getLenkabbruchzeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Allg_AttributeGroup#getLenkabbruchzeit <em>Lenkabbruchzeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lenkabbruchzeit</em>' containment reference.
	 * @see #getLenkabbruchzeit()
	 * @generated
	 */
	void setLenkabbruchzeit(Lenkabbruchzeit_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Personal Reaktionszeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Personalreaktionszeit, Angabe in Sekunden. Der Standardwert auf Hauptbahnen beträgt 45 Sekunden, der Standardwert auf Nebenbahnen 15 Sekunden. Abweichungen sind möglich, bedürfen jedoch der betrieblichen Bestätigung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Personal Reaktionszeit</em>' containment reference.
	 * @see #setPersonalReaktionszeit(Personal_Reaktionszeit_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zuglenkung.ZuglenkungPackage#getZL_Allg_AttributeGroup_PersonalReaktionszeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Personal_Reaktionszeit'"
	 * @generated
	 */
	Personal_Reaktionszeit_TypeClass getPersonalReaktionszeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zuglenkung.ZL_Allg_AttributeGroup#getPersonalReaktionszeit <em>Personal Reaktionszeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personal Reaktionszeit</em>' containment reference.
	 * @see #getPersonalReaktionszeit()
	 * @generated
	 */
	void setPersonalReaktionszeit(Personal_Reaktionszeit_TypeClass value);

} // ZL_Allg_AttributeGroup
