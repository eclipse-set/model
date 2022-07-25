/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bahnuebergang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verkehrszeichen Andreaskreuz Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Andreaskreuz_AttributeGroup#getBlitzpfeil <em>Blitzpfeil</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Andreaskreuz_AttributeGroup#getMontageBesonders <em>Montage Besonders</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Andreaskreuz_AttributeGroup#getRichtungspfeil <em>Richtungspfeil</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Andreaskreuz_AttributeGroup#getSchutzbuegel <em>Schutzbuegel</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Andreaskreuz_AttributeGroup#getZusatzschild <em>Zusatzschild</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_Andreaskreuz_AttributeGroup()
 * @model extendedMetaData="name='CVerkehrszeichen_Andreaskreuz' kind='elementOnly'"
 * @generated
 */
public interface Verkehrszeichen_Andreaskreuz_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Blitzpfeil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Auf dem Andreaskreuz ist ein Blitzfeil anzuordnen (true). Das Attribut entfällt, sofern kein Blitzfeil benötigt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Blitzpfeil</em>' containment reference.
	 * @see #setBlitzpfeil(Blitzpfeil_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_Andreaskreuz_AttributeGroup_Blitzpfeil()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Blitzpfeil'"
	 * @generated
	 */
	Blitzpfeil_TypeClass getBlitzpfeil();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Andreaskreuz_AttributeGroup#getBlitzpfeil <em>Blitzpfeil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blitzpfeil</em>' containment reference.
	 * @see #getBlitzpfeil()
	 * @generated
	 */
	void setBlitzpfeil(Blitzpfeil_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Montage Besonders</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur besonderen Montage, z. B. für horizontale Befestigung am Peitschenmastausleger.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Montage Besonders</em>' containment reference.
	 * @see #setMontageBesonders(Montage_Besonders_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_Andreaskreuz_AttributeGroup_MontageBesonders()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Montage_Besonders'"
	 * @generated
	 */
	Montage_Besonders_TypeClass getMontageBesonders();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Andreaskreuz_AttributeGroup#getMontageBesonders <em>Montage Besonders</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Montage Besonders</em>' containment reference.
	 * @see #getMontageBesonders()
	 * @generated
	 */
	void setMontageBesonders(Montage_Besonders_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Richtungspfeil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zusätzlich zum Andreaskreuz ist ein Richtungspfeil als Schild vorzusehen (true). Das Attribut entfällt, sofern kein Richtungspfeil benötigt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Richtungspfeil</em>' containment reference.
	 * @see #setRichtungspfeil(Richtungspfeil_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_Andreaskreuz_AttributeGroup_Richtungspfeil()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Richtungspfeil'"
	 * @generated
	 */
	Richtungspfeil_TypeClass getRichtungspfeil();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Andreaskreuz_AttributeGroup#getRichtungspfeil <em>Richtungspfeil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Richtungspfeil</em>' containment reference.
	 * @see #getRichtungspfeil()
	 * @generated
	 */
	void setRichtungspfeil(Richtungspfeil_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Schutzbuegel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Das Andreaskreuz ist mit einem Schutzbügel auszurüsten (true). Das Attribut entfällt, sofern kein Schutzbügel benötigt wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schutzbuegel</em>' containment reference.
	 * @see #setSchutzbuegel(Schutzbuegel_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_Andreaskreuz_AttributeGroup_Schutzbuegel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Schutzbuegel'"
	 * @generated
	 */
	Schutzbuegel_TypeClass getSchutzbuegel();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Andreaskreuz_AttributeGroup#getSchutzbuegel <em>Schutzbuegel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schutzbuegel</em>' containment reference.
	 * @see #getSchutzbuegel()
	 * @generated
	 */
	void setSchutzbuegel(Schutzbuegel_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Zusatzschild</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zusatzschild zum Andreaskreuz, z. B. \"Privatweg\" oder \"Übergang nur für Berechtigte\".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zusatzschild</em>' containment reference.
	 * @see #setZusatzschild(Zusatzschild_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage#getVerkehrszeichen_Andreaskreuz_AttributeGroup_Zusatzschild()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Zusatzschild'"
	 * @generated
	 */
	Zusatzschild_TypeClass getZusatzschild();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bahnuebergang.Verkehrszeichen_Andreaskreuz_AttributeGroup#getZusatzschild <em>Zusatzschild</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zusatzschild</em>' containment reference.
	 * @see #getZusatzschild()
	 * @generated
	 */
	void setZusatzschild(Zusatzschild_TypeClass value);

} // Verkehrszeichen_Andreaskreuz_AttributeGroup
