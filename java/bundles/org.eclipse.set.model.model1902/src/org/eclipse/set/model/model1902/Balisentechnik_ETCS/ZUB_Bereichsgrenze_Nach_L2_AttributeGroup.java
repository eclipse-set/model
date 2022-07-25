/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model1902.Verweise.ID_RBC_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Signal_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZUB Bereichsgrenze Nach L2 Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_AttributeGroup#getAbstandGrenzeBereichC <em>Abstand Grenze Bereich C</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_AttributeGroup#getBaselineSRS <em>Baseline SRS</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_AttributeGroup#getBgrenzeNachL2BedEinstieg <em>Bgrenze Nach L2 Bed Einstieg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_AttributeGroup#getEinstiegOhneRueckwSig <em>Einstieg Ohne Rueckw Sig</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_AttributeGroup#getIDRBCNachGrenze <em>IDRBC Nach Grenze</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_AttributeGroup#getIDSignalZufahrtsicherungL2oS <em>ID Signal Zufahrtsicherung L2o S</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_AttributeGroup#getPrioritaet <em>Prioritaet</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Nach_L2_AttributeGroup()
 * @model extendedMetaData="name='CZUB_Bereichsgrenze_Nach_L2' kind='elementOnly'"
 * @generated
 */
public interface ZUB_Bereichsgrenze_Nach_L2_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Abstand Grenze Bereich C</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abstand der Grenze des Bereichs C von der ZUB-Bereichsgrenze entgegengesetzt zu deren Wirkrichtung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstand Grenze Bereich C</em>' containment reference.
	 * @see #setAbstandGrenzeBereichC(Abstand_Grenze_Bereich_C_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Nach_L2_AttributeGroup_AbstandGrenzeBereichC()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Abstand_Grenze_Bereich_C'"
	 * @generated
	 */
	Abstand_Grenze_Bereich_C_TypeClass getAbstandGrenzeBereichC();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_AttributeGroup#getAbstandGrenzeBereichC <em>Abstand Grenze Bereich C</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstand Grenze Bereich C</em>' containment reference.
	 * @see #getAbstandGrenzeBereichC()
	 * @generated
	 */
	void setAbstandGrenzeBereichC(Abstand_Grenze_Bereich_C_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Baseline SRS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Baseline der System Requirement Specification.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Baseline SRS</em>' containment reference.
	 * @see #setBaselineSRS(Baseline_SRS_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Nach_L2_AttributeGroup_BaselineSRS()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Baseline_SRS'"
	 * @generated
	 */
	Baseline_SRS_TypeClass getBaselineSRS();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_AttributeGroup#getBaselineSRS <em>Baseline SRS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baseline SRS</em>' containment reference.
	 * @see #getBaselineSRS()
	 * @generated
	 */
	void setBaselineSRS(Baseline_SRS_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Bgrenze Nach L2 Bed Einstieg</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Bgrenze_Nach_L2_Bed_Einstieg_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angaben zur Entscheidungsweiche bei bedingtem Einsteig (entspricht einem bedingten Ausstieg aus dem vorherigen System).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bgrenze Nach L2 Bed Einstieg</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Nach_L2_AttributeGroup_BgrenzeNachL2BedEinstieg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bgrenze_Nach_L2_Bed_Einstieg'"
	 * @generated
	 */
	EList<Bgrenze_Nach_L2_Bed_Einstieg_AttributeGroup> getBgrenzeNachL2BedEinstieg();

	/**
	 * Returns the value of the '<em><b>Einstieg Ohne Rueckw Sig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob der Einstieg ohne rückwärtiges Signal erfolgt (true). Der Einstieg erfolgt dabei vor dem ersten der ETCS-Zentrale bekanntem Signal.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einstieg Ohne Rueckw Sig</em>' containment reference.
	 * @see #setEinstiegOhneRueckwSig(Einstieg_Ohne_Rueckw_Sig_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Nach_L2_AttributeGroup_EinstiegOhneRueckwSig()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Einstieg_Ohne_Rueckw_Sig'"
	 * @generated
	 */
	Einstieg_Ohne_Rueckw_Sig_TypeClass getEinstiegOhneRueckwSig();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_AttributeGroup#getEinstiegOhneRueckwSig <em>Einstieg Ohne Rueckw Sig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einstieg Ohne Rueckw Sig</em>' containment reference.
	 * @see #getEinstiegOhneRueckwSig()
	 * @generated
	 */
	void setEinstiegOhneRueckwSig(Einstieg_Ohne_Rueckw_Sig_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDRBC Nach Grenze</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei L2: Verweis auf das nach der Bereichsgrenze zuständige RBC.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDRBC Nach Grenze</em>' containment reference.
	 * @see #setIDRBCNachGrenze(ID_RBC_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Nach_L2_AttributeGroup_IDRBCNachGrenze()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_RBC_Nach_Grenze'"
	 * @generated
	 */
	ID_RBC_TypeClass getIDRBCNachGrenze();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_AttributeGroup#getIDRBCNachGrenze <em>IDRBC Nach Grenze</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDRBC Nach Grenze</em>' containment reference.
	 * @see #getIDRBCNachGrenze()
	 * @generated
	 */
	void setIDRBCNachGrenze(ID_RBC_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Signal Zufahrtsicherung L2o S</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Verweise.ID_Signal_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Signale, die die Zufahrt für nicht-ETCS-geführte Züge verhindern. Die Angabe ist nur bei L2oS sinnvoll.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal Zufahrtsicherung L2o S</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Nach_L2_AttributeGroup_IDSignalZufahrtsicherungL2oS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Signal_Zufahrtsicherung_L2oS'"
	 * @generated
	 */
	EList<ID_Signal_TypeClass> getIDSignalZufahrtsicherungL2oS();

	/**
	 * Returns the value of the '<em><b>Prioritaet</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei mehreren Anwendungssystemen in Sonderfällen (z. B. ausländische Anwendungssysteme): Priorität für die Nutzung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prioritaet</em>' containment reference.
	 * @see #setPrioritaet(Prioritaet_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Bereichsgrenze_Nach_L2_AttributeGroup_Prioritaet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Prioritaet'"
	 * @generated
	 */
	Prioritaet_TypeClass getPrioritaet();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ZUB_Bereichsgrenze_Nach_L2_AttributeGroup#getPrioritaet <em>Prioritaet</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prioritaet</em>' containment reference.
	 * @see #getPrioritaet()
	 * @generated
	 */
	void setPrioritaet(Prioritaet_TypeClass value);

} // ZUB_Bereichsgrenze_Nach_L2_AttributeGroup
