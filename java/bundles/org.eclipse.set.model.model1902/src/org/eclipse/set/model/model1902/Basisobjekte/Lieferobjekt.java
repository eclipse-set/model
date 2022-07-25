/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Basisobjekte;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.model1902.Verweise.ID_LO_Einbau_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lieferobjekt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Von der SBI geliefertes Objekt. Hier werden alle relevanten Daten des gelieferten Teils der LST-Anlage eingetragen. Das Lieferobjekt muss einen Bezug zu einem bestehenden bzw. geplanten LST-Objekt haben, das es näher beschreibt.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Basisobjekte.Lieferobjekt#getBeschreibung <em>Beschreibung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Basisobjekte.Lieferobjekt#getIDLOEinbau <em>IDLO Einbau</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Basisobjekte.Lieferobjekt#getLOErsatz <em>LO Ersatz</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Basisobjekte.Lieferobjekt#getLOMaterial <em>LO Material</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Basisobjekte.BasisobjektePackage#getLieferobjekt()
 * @model extendedMetaData="name='CLieferobjekt' kind='elementOnly'"
 * @generated
 */
public interface Lieferobjekt extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Beschreibung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verbale Beschreibung des LO. \r\nDie Angabe soll als Beschreibung des Technischen Platzes in SAP R/3 Netz übernommen werden. \rDie Bereitstellung der Bildungsvorschrift erfolgt gesondert.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Beschreibung</em>' containment reference.
	 * @see #setBeschreibung(Beschreibung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Basisobjekte.BasisobjektePackage#getLieferobjekt_Beschreibung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Beschreibung'"
	 * @generated
	 */
	Beschreibung_TypeClass getBeschreibung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Basisobjekte.Lieferobjekt#getBeschreibung <em>Beschreibung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beschreibung</em>' containment reference.
	 * @see #getBeschreibung()
	 * @generated
	 */
	void setBeschreibung(Beschreibung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDLO Einbau</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Verweise.ID_LO_Einbau_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein geplantes oder existierendes Objekt bzw. mehrere Objekte, zu dem bzw. denen das LO logisch gehört. LO können auch hierarchisch gegliedert sein.\r\nFür Ersatzteile ist der Ort der Lagerung anzugeben, d.h. in der Regel die Unterbringung direkt.\r\nDer Verweis ist prinzipiell auf alle Objekttypen möglich einschließlich des LO selbst für eine rekursive Darstellung der herstellerspezifischen Anlagenstruktur.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDLO Einbau</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Basisobjekte.BasisobjektePackage#getLieferobjekt_IDLOEinbau()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_LO_Einbau'"
	 * @generated
	 */
	EList<ID_LO_Einbau_TypeClass> getIDLOEinbau();

	/**
	 * Returns the value of the '<em><b>LO Ersatz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob es sich um eine Ersatzteil (true) oder ein eingebautes und genutztes Teil handelt (false).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LO Ersatz</em>' containment reference.
	 * @see #setLOErsatz(LO_Ersatz_TypeClass)
	 * @see org.eclipse.set.model.model1902.Basisobjekte.BasisobjektePackage#getLieferobjekt_LOErsatz()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LO_Ersatz'"
	 * @generated
	 */
	LO_Ersatz_TypeClass getLOErsatz();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Basisobjekte.Lieferobjekt#getLOErsatz <em>LO Ersatz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LO Ersatz</em>' containment reference.
	 * @see #getLOErsatz()
	 * @generated
	 */
	void setLOErsatz(LO_Ersatz_TypeClass value);

	/**
	 * Returns the value of the '<em><b>LO Material</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LO Material</em>' containment reference.
	 * @see #setLOMaterial(LO_Material_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Basisobjekte.BasisobjektePackage#getLieferobjekt_LOMaterial()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LO_Material'"
	 * @generated
	 */
	LO_Material_AttributeGroup getLOMaterial();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Basisobjekte.Lieferobjekt#getLOMaterial <em>LO Material</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LO Material</em>' containment reference.
	 * @see #getLOMaterial()
	 * @generated
	 */
	void setLOMaterial(LO_Material_AttributeGroup value);

} // Lieferobjekt
