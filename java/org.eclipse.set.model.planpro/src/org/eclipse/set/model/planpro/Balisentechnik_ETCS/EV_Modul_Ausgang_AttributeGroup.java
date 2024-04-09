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
 * A representation of the model object '<em><b>EV Modul Ausgang Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul_Ausgang_AttributeGroup#getAusgangNr <em>Ausgang Nr</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul_Ausgang_AttributeGroup#getMaxUnterbrechungszeit <em>Max Unterbrechungszeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul_Ausgang_AttributeGroup#getNennleistung <em>Nennleistung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul_Ausgang_AttributeGroup#getSpannungArt <em>Spannung Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul_Ausgang_AttributeGroup#getSpannungToleranzObere <em>Spannung Toleranz Obere</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul_Ausgang_AttributeGroup#getSpannungToleranzUntere <em>Spannung Toleranz Untere</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getEV_Modul_Ausgang_AttributeGroup()
 * @model extendedMetaData="name='CEV_Modul_Ausgang' kind='elementOnly'"
 * @generated
 */
public interface EV_Modul_Ausgang_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Ausgang Nr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nummer des Ausgangs des Energieversorgungsmoduls.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ausgang Nr</em>' containment reference.
	 * @see #setAusgangNr(Ausgang_Nr_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getEV_Modul_Ausgang_AttributeGroup_AusgangNr()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Ausgang_Nr'"
	 * @generated
	 */
	Ausgang_Nr_TypeClass getAusgangNr();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul_Ausgang_AttributeGroup#getAusgangNr <em>Ausgang Nr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ausgang Nr</em>' containment reference.
	 * @see #getAusgangNr()
	 * @generated
	 */
	void setAusgangNr(Ausgang_Nr_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Max Unterbrechungszeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maximale Unterbrechungszeit für die Energieversorgung am Ausgang des Energieversorgungsmoduls.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Unterbrechungszeit</em>' containment reference.
	 * @see #setMaxUnterbrechungszeit(Max_Unterbrechungszeit_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getEV_Modul_Ausgang_AttributeGroup_MaxUnterbrechungszeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Max_Unterbrechungszeit'"
	 * @generated
	 */
	Max_Unterbrechungszeit_TypeClass getMaxUnterbrechungszeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul_Ausgang_AttributeGroup#getMaxUnterbrechungszeit <em>Max Unterbrechungszeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Unterbrechungszeit</em>' containment reference.
	 * @see #getMaxUnterbrechungszeit()
	 * @generated
	 */
	void setMaxUnterbrechungszeit(Max_Unterbrechungszeit_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Nennleistung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nennleistung, die der Ausgang des Energieversorgungsmoduls zur Verfügung stellt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nennleistung</em>' containment reference.
	 * @see #setNennleistung(Nennleistung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getEV_Modul_Ausgang_AttributeGroup_Nennleistung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Nennleistung'"
	 * @generated
	 */
	Nennleistung_TypeClass getNennleistung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul_Ausgang_AttributeGroup#getNennleistung <em>Nennleistung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nennleistung</em>' containment reference.
	 * @see #getNennleistung()
	 * @generated
	 */
	void setNennleistung(Nennleistung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Spannung Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nennspannung, die der Ausgang des Energieversorgungsmoduls zur Verfügung stellt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spannung Art</em>' containment reference.
	 * @see #setSpannungArt(Spannung_Art_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getEV_Modul_Ausgang_AttributeGroup_SpannungArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Spannung_Art'"
	 * @generated
	 */
	Spannung_Art_TypeClass getSpannungArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul_Ausgang_AttributeGroup#getSpannungArt <em>Spannung Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spannung Art</em>' containment reference.
	 * @see #getSpannungArt()
	 * @generated
	 */
	void setSpannungArt(Spannung_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Spannung Toleranz Obere</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Obere Toleranzgrenze in V für die unter Spannung_Art angegebene Nennspannung des Ausgangs. Die gewählte Toleranz wirkt sich auf die möglichen Schleifenwiderstände aus.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spannung Toleranz Obere</em>' containment reference.
	 * @see #setSpannungToleranzObere(Spannung_Toleranz_Obere_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getEV_Modul_Ausgang_AttributeGroup_SpannungToleranzObere()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Spannung_Toleranz_Obere'"
	 * @generated
	 */
	Spannung_Toleranz_Obere_TypeClass getSpannungToleranzObere();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul_Ausgang_AttributeGroup#getSpannungToleranzObere <em>Spannung Toleranz Obere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spannung Toleranz Obere</em>' containment reference.
	 * @see #getSpannungToleranzObere()
	 * @generated
	 */
	void setSpannungToleranzObere(Spannung_Toleranz_Obere_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Spannung Toleranz Untere</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Untere Toleranzgrenze in V für die unter Spannung_Art angegebene Nennspannung des Ausgangs. Die gewählte Toleranz wirkt sich auf die möglichen Schleifenwiderstände aus.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Spannung Toleranz Untere</em>' containment reference.
	 * @see #setSpannungToleranzUntere(Spannung_Toleranz_Untere_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getEV_Modul_Ausgang_AttributeGroup_SpannungToleranzUntere()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Spannung_Toleranz_Untere'"
	 * @generated
	 */
	Spannung_Toleranz_Untere_TypeClass getSpannungToleranzUntere();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.EV_Modul_Ausgang_AttributeGroup#getSpannungToleranzUntere <em>Spannung Toleranz Untere</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spannung Toleranz Untere</em>' containment reference.
	 * @see #getSpannungToleranzUntere()
	 * @generated
	 */
	void setSpannungToleranzUntere(Spannung_Toleranz_Untere_TypeClass value);

} // EV_Modul_Ausgang_AttributeGroup
