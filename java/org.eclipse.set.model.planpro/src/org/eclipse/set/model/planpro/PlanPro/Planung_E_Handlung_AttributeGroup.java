/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.PlanPro;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Planung EHandlung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Handlung_AttributeGroup#getPlanungEAbnahme <em>Planung EAbnahme</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Handlung_AttributeGroup#getPlanungEErstellung <em>Planung EErstellung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Handlung_AttributeGroup#getPlanungEFreigabe <em>Planung EFreigabe</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Handlung_AttributeGroup#getPlanungEGenehmigung <em>Planung EGenehmigung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Handlung_AttributeGroup#getPlanungEGleichstellung <em>Planung EGleichstellung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Handlung_AttributeGroup#getPlanungEPruefung <em>Planung EPruefung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Handlung_AttributeGroup#getPlanungEQualitaetspruefung <em>Planung EQualitaetspruefung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Handlung_AttributeGroup#getPlanungESonstige <em>Planung ESonstige</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.PlanPro.Planung_E_Handlung_AttributeGroup#getPlanungEUebernahme <em>Planung EUebernahme</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_E_Handlung_AttributeGroup()
 * @model extendedMetaData="name='CPlanung_E_Handlung' kind='elementOnly'"
 * @generated
 */
public interface Planung_E_Handlung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Planung EAbnahme</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.PlanPro.Akteur_Zuordnung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abbildung aller notwendigen Informationen zur Dokumentation der Abnahme.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Planung EAbnahme</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_E_Handlung_AttributeGroup_PlanungEAbnahme()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Planung_E_Abnahme'"
	 * @generated
	 */
	EList<Akteur_Zuordnung> getPlanungEAbnahme();

	/**
	 * Returns the value of the '<em><b>Planung EErstellung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.PlanPro.Akteur_Zuordnung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abbildung aller notwendigen Informationen zur Dokumentation der Erstellung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Planung EErstellung</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_E_Handlung_AttributeGroup_PlanungEErstellung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Planung_E_Erstellung'"
	 * @generated
	 */
	EList<Akteur_Zuordnung> getPlanungEErstellung();

	/**
	 * Returns the value of the '<em><b>Planung EFreigabe</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.PlanPro.Akteur_Zuordnung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abbildung aller notwendigen Informationen zur Dokumentation der Freigabe.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Planung EFreigabe</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_E_Handlung_AttributeGroup_PlanungEFreigabe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Planung_E_Freigabe'"
	 * @generated
	 */
	EList<Akteur_Zuordnung> getPlanungEFreigabe();

	/**
	 * Returns the value of the '<em><b>Planung EGenehmigung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.PlanPro.Akteur_Zuordnung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abbildung aller notwendigen Informationen zur Dokumentation der Genehmigung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Planung EGenehmigung</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_E_Handlung_AttributeGroup_PlanungEGenehmigung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Planung_E_Genehmigung'"
	 * @generated
	 */
	EList<Akteur_Zuordnung> getPlanungEGenehmigung();

	/**
	 * Returns the value of the '<em><b>Planung EGleichstellung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.PlanPro.Akteur_Zuordnung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abbildung aller notwendigen Informationen zur Dokumentation der Gleichstellung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Planung EGleichstellung</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_E_Handlung_AttributeGroup_PlanungEGleichstellung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Planung_E_Gleichstellung'"
	 * @generated
	 */
	EList<Akteur_Zuordnung> getPlanungEGleichstellung();

	/**
	 * Returns the value of the '<em><b>Planung EPruefung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.PlanPro.Akteur_Zuordnung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abbildung aller notwendigen Informationen zur Dokumentation der (fachtechnischen) Prüfung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Planung EPruefung</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_E_Handlung_AttributeGroup_PlanungEPruefung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Planung_E_Pruefung'"
	 * @generated
	 */
	EList<Akteur_Zuordnung> getPlanungEPruefung();

	/**
	 * Returns the value of the '<em><b>Planung EQualitaetspruefung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.PlanPro.Akteur_Zuordnung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abbildung aller notwendigen Informationen zur Dokumentation der Qualitätsprüfung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Planung EQualitaetspruefung</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_E_Handlung_AttributeGroup_PlanungEQualitaetspruefung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Planung_E_Qualitaetspruefung'"
	 * @generated
	 */
	EList<Akteur_Zuordnung> getPlanungEQualitaetspruefung();

	/**
	 * Returns the value of the '<em><b>Planung ESonstige</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.PlanPro.Akteur_Zuordnung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abbildung aller notwendigen Informationen zur Dokumentation sonstiger Handlungen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Planung ESonstige</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_E_Handlung_AttributeGroup_PlanungESonstige()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Planung_E_Sonstige'"
	 * @generated
	 */
	EList<Akteur_Zuordnung> getPlanungESonstige();

	/**
	 * Returns the value of the '<em><b>Planung EUebernahme</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.PlanPro.Akteur_Zuordnung}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abbildung aller notwendigen Informationen zur Dokumentation der Übernahme von Revisionseinträgen in die Bestandsdaten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Planung EUebernahme</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.PlanPro.PlanProPackage#getPlanung_E_Handlung_AttributeGroup_PlanungEUebernahme()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Planung_E_Uebernahme'"
	 * @generated
	 */
	EList<Akteur_Zuordnung> getPlanungEUebernahme();

} // Planung_E_Handlung_AttributeGroup
