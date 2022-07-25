/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DP Typ GESG Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Typ_GESG_AttributeGroup#getBremsweg <em>Bremsweg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Typ_GESG_AttributeGroup#getDPTypESG <em>DP Typ ESG</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Typ_GESG_AttributeGroup#getIndividuell <em>Individuell</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Typ_GESG_AttributeGroup#getLfdNrAmBezugspunkt <em>Lfd Nr Am Bezugspunkt</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Typ_GESG_AttributeGroup()
 * @model extendedMetaData="name='CDP_Typ_GESG' kind='elementOnly'"
 * @generated
 */
public interface DP_Typ_GESG_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bremsweg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Regelbremsweg der Strecke. Ein Regelbremsweg von 1000 m wird in den Planunterlagen nicht ausgewiesen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bremsweg</em>' containment reference.
	 * @see #setBremsweg(Bremsweg_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Typ_GESG_AttributeGroup_Bremsweg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bremsweg'"
	 * @generated
	 */
	Bremsweg_TypeClass getBremsweg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Typ_GESG_AttributeGroup#getBremsweg <em>Bremsweg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bremsweg</em>' containment reference.
	 * @see #getBremsweg()
	 * @generated
	 */
	void setBremsweg(Bremsweg_TypeClass value);

	/**
	 * Returns the value of the '<em><b>DP Typ ESG</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Durch das Anwendungssystem ESG definierter Datenpunkttyp.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DP Typ ESG</em>' containment reference.
	 * @see #setDPTypESG(DP_Typ_ESG_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Typ_GESG_AttributeGroup_DPTypESG()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DP_Typ_ESG'"
	 * @generated
	 */
	DP_Typ_ESG_TypeClass getDPTypESG();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Typ_GESG_AttributeGroup#getDPTypESG <em>DP Typ ESG</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DP Typ ESG</em>' containment reference.
	 * @see #getDPTypESG()
	 * @generated
	 */
	void setDPTypESG(DP_Typ_ESG_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Individuell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob es sich um einen individuell programmierten Datenpunkt handelt (true). Der Wert \"false\" wird nicht verwendet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Individuell</em>' containment reference.
	 * @see #setIndividuell(Individuell_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Typ_GESG_AttributeGroup_Individuell()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Individuell'"
	 * @generated
	 */
	Individuell_TypeClass getIndividuell();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Typ_GESG_AttributeGroup#getIndividuell <em>Individuell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Individuell</em>' containment reference.
	 * @see #getIndividuell()
	 * @generated
	 */
	void setIndividuell(Individuell_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Lfd Nr Am Bezugspunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Laufende Nummer, wenn zu einem betrieblichen Bezugspunkt mehrere Datenpunkte des gleichen Typs gehören.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lfd Nr Am Bezugspunkt</em>' containment reference.
	 * @see #setLfdNrAmBezugspunkt(Lfd_Nr_Am_Bezugspunkt_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getDP_Typ_GESG_AttributeGroup_LfdNrAmBezugspunkt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Lfd_Nr_Am_Bezugspunkt'"
	 * @generated
	 */
	Lfd_Nr_Am_Bezugspunkt_TypeClass getLfdNrAmBezugspunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.DP_Typ_GESG_AttributeGroup#getLfdNrAmBezugspunkt <em>Lfd Nr Am Bezugspunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lfd Nr Am Bezugspunkt</em>' containment reference.
	 * @see #getLfdNrAmBezugspunkt()
	 * @generated
	 */
	void setLfdNrAmBezugspunkt(Lfd_Nr_Am_Bezugspunkt_TypeClass value);

} // DP_Typ_GESG_AttributeGroup
