/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Basisobjekte;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Anhang Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.Anhang_Allg_AttributeGroup#getAnhangArt <em>Anhang Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.Anhang_Allg_AttributeGroup#getDateiname <em>Dateiname</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.Anhang_Allg_AttributeGroup#getDateityp <em>Dateityp</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage#getAnhang_Allg_AttributeGroup()
 * @model extendedMetaData="name='CAnhang_Allg' kind='elementOnly'"
 * @generated
 */
public interface Anhang_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Anhang Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beinhaltet die Information über den fachlichen Inhalt des Anhangs. Bei Auswahl von \"sonstige\" ist der Anhang im dazugehörigen Bearbeitungsvermerk zu erläutern. Ggf. ist ein weiterer Bearbeitungsvermerk zur Kommentierung anzufügen. Das LST-Datenmodell enthält sowohl fachliche Anhänge (zu LST-Fachdaten) sowie Anhänge des Objektmanagements. Zu den Anhängen des Objektmanagements für eine Einzelplanung gehören: Abnahmeniederschrift Anhänge zu einem LST Zustand Information BAST Bestätigung der Gleichstellung Bestätigung der Qualitätsprüfung Bestätigung der Übernahme Erläuterungsbericht Bestätigung der Freigabe des Bvb Bestätigung der Genehmigung des AG/Bh/Bhv besondere Materialisierung (v. a. projektbezogene Wiederverwendung von LST-Reststoffen) Planverzeichnis Planprüfberichtbericht sonstige VzG 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anhang Art</em>' containment reference.
	 * @see #setAnhangArt(Anhang_Art_TypeClass)
	 * @see org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage#getAnhang_Allg_AttributeGroup_AnhangArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Anhang_Art'"
	 * @generated
	 */
	Anhang_Art_TypeClass getAnhangArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Basisobjekte.Anhang_Allg_AttributeGroup#getAnhangArt <em>Anhang Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anhang Art</em>' containment reference.
	 * @see #getAnhangArt()
	 * @generated
	 */
	void setAnhangArt(Anhang_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Dateiname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ursprünglicher Name der angehängten Datei ohne Dateiformat bzw. -typ.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dateiname</em>' containment reference.
	 * @see #setDateiname(Dateiname_TypeClass)
	 * @see org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage#getAnhang_Allg_AttributeGroup_Dateiname()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Dateiname'"
	 * @generated
	 */
	Dateiname_TypeClass getDateiname();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Basisobjekte.Anhang_Allg_AttributeGroup#getDateiname <em>Dateiname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dateiname</em>' containment reference.
	 * @see #getDateiname()
	 * @generated
	 */
	void setDateiname(Dateiname_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Dateityp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Format des Anhangs. Nur die im ENUM dargestellten Dateiarten können einer Planung angehangen werden. Andere Dateiarten sind aus Gründen der Nachprüfbarkeit und der Transparenz nicht zulässig. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dateityp</em>' containment reference.
	 * @see #setDateityp(Dateityp_TypeClass)
	 * @see org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage#getAnhang_Allg_AttributeGroup_Dateityp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Dateityp'"
	 * @generated
	 */
	Dateityp_TypeClass getDateityp();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Basisobjekte.Anhang_Allg_AttributeGroup#getDateityp <em>Dateityp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dateityp</em>' containment reference.
	 * @see #getDateityp()
	 * @generated
	 */
	void setDateityp(Dateityp_TypeClass value);

} // Anhang_Allg_AttributeGroup
