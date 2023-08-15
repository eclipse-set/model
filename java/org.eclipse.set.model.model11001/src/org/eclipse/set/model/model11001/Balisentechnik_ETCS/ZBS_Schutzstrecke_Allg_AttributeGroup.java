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
 * A representation of the model object '<em><b>ZBS Schutzstrecke Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZBS_Schutzstrecke_Allg_AttributeGroup#getLaengeSollMind150 <em>Laenge Soll Mind150</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZBS_Schutzstrecke_Allg_AttributeGroup#getMassgebendeNeigungMind150 <em>Massgebende Neigung Mind150</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZBS_Schutzstrecke_Allg_AttributeGroup#getVFrei <em>VFrei</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZBS_Schutzstrecke_Allg_AttributeGroup()
 * @model extendedMetaData="name='CZBS_Schutzstrecke_Allg' kind='elementOnly'"
 * @generated
 */
public interface ZBS_Schutzstrecke_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Laenge Soll Mind150</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Solllänge der Schutzstrecke bei Betrachtung der Neigung im Bereich 150 m vor dem Zielsignal der Zugstraße bis zum Ende der Mindestschutzstrecke (siehe Massgebende_Neigung_Mind_150). Die Solllänge der Mindestschutzstrecke wird über das Attribut Laenge_Soll in der zugehörigen Instanz von Fstr_DWeg abgebildet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Laenge Soll Mind150</em>' containment reference.
	 * @see #setLaengeSollMind150(Laenge_Soll_Mind_150_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZBS_Schutzstrecke_Allg_AttributeGroup_LaengeSollMind150()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Laenge_Soll_Mind_150'"
	 * @generated
	 */
	Laenge_Soll_Mind_150_TypeClass getLaengeSollMind150();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZBS_Schutzstrecke_Allg_AttributeGroup#getLaengeSollMind150 <em>Laenge Soll Mind150</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Laenge Soll Mind150</em>' containment reference.
	 * @see #getLaengeSollMind150()
	 * @generated
	 */
	void setLaengeSollMind150(Laenge_Soll_Mind_150_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Massgebende Neigung Mind150</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maßgebende Neigung im Bereich 150 m vor dem Zielsignal der Zugstraße bis zum Ende der Mindestschutzstrecke. Die maßgebende Neigung im Bereich der Mindestschutzstrecke wird über das Attribut Massgebende_Neigung in der zugehörigen Instanz von Fstr_DWeg abgebildet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Massgebende Neigung Mind150</em>' containment reference.
	 * @see #setMassgebendeNeigungMind150(Massgebende_Neigung_Mind_150_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZBS_Schutzstrecke_Allg_AttributeGroup_MassgebendeNeigungMind150()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Massgebende_Neigung_Mind_150'"
	 * @generated
	 */
	Massgebende_Neigung_Mind_150_TypeClass getMassgebendeNeigungMind150();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZBS_Schutzstrecke_Allg_AttributeGroup#getMassgebendeNeigungMind150 <em>Massgebende Neigung Mind150</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Massgebende Neigung Mind150</em>' containment reference.
	 * @see #getMassgebendeNeigungMind150()
	 * @generated
	 */
	void setMassgebendeNeigungMind150(Massgebende_Neigung_Mind_150_TypeClass value);

	/**
	 * Returns the value of the '<em><b>VFrei</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Freigabegeschwindigkeit, die der Berechnung der Schutzstrecke zugrunde liegt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VFrei</em>' containment reference.
	 * @see #setVFrei(V_Frei_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZBS_Schutzstrecke_Allg_AttributeGroup_VFrei()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='V_Frei'"
	 * @generated
	 */
	V_Frei_TypeClass getVFrei();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZBS_Schutzstrecke_Allg_AttributeGroup#getVFrei <em>VFrei</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VFrei</em>' containment reference.
	 * @see #getVFrei()
	 * @generated
	 */
	void setVFrei(V_Frei_TypeClass value);

} // ZBS_Schutzstrecke_Allg_AttributeGroup
