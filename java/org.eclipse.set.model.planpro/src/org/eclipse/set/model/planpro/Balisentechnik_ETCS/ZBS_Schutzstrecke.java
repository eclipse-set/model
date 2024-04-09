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

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.planpro.Verweise.ID_Fstr_DWeg_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZBS Schutzstrecke</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Abbildung der ZBS-Schutzstrecke. Modellseitig werden für die Abbildung einer Schutzstrecke die Objekte Fstr_DWeg und ZBS_Schutzstrecke benötigt mit entsprechender Aufteilung der Planungsinformationen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_Schutzstrecke#getIDFstrDWeg <em>ID Fstr DWeg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_Schutzstrecke#getZBSSchutzstreckeAllg <em>ZBS Schutzstrecke Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZBS_Schutzstrecke()
 * @model extendedMetaData="name='CZBS_Schutzstrecke' kind='elementOnly'"
 * @generated
 */
public interface ZBS_Schutzstrecke extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Fstr DWeg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf Fstr_DWeg zur Anreicherung der spezifischen Angaben von Schutzstrecken bei ZBS.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Fstr DWeg</em>' containment reference.
	 * @see #setIDFstrDWeg(ID_Fstr_DWeg_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZBS_Schutzstrecke_IDFstrDWeg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Fstr_DWeg'"
	 * @generated
	 */
	ID_Fstr_DWeg_ohne_Proxy_TypeClass getIDFstrDWeg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_Schutzstrecke#getIDFstrDWeg <em>ID Fstr DWeg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Fstr DWeg</em>' containment reference.
	 * @see #getIDFstrDWeg()
	 * @generated
	 */
	void setIDFstrDWeg(ID_Fstr_DWeg_ohne_Proxy_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ZBS Schutzstrecke Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZBS Schutzstrecke Allg</em>' containment reference.
	 * @see #setZBSSchutzstreckeAllg(ZBS_Schutzstrecke_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZBS_Schutzstrecke_ZBSSchutzstreckeAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZBS_Schutzstrecke_Allg'"
	 * @generated
	 */
	ZBS_Schutzstrecke_Allg_AttributeGroup getZBSSchutzstreckeAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZBS_Schutzstrecke#getZBSSchutzstreckeAllg <em>ZBS Schutzstrecke Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZBS Schutzstrecke Allg</em>' containment reference.
	 * @see #getZBSSchutzstreckeAllg()
	 * @generated
	 */
	void setZBSSchutzstreckeAllg(ZBS_Schutzstrecke_Allg_AttributeGroup value);

} // ZBS_Schutzstrecke
