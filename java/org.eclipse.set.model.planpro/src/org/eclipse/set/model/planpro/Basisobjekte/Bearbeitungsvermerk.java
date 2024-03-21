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

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.planpro.Verweise.ID_Anhang_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bearbeitungsvermerk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Anhang in Form von Datei oder Text zu einem Objekt oder Attribut. Jeder zugelassene Projektbeteiligte kann zu einem Objekt oder Attribut einen Bearbeitungsvermerk anfügen, sofern er die entsprechend notwendige Berechtigung besitzt. Dies gilt für fachliche wie organisatorische Objekte und Attribute. Für ENUM-Attribute ist bei Auswahl des Werts \"sonstige\" zwingend ein Bearbeitungsvermerk anzufügen. Eine Dokumentenbeigabe ist dabei optional. Zu einem Objekt oder Attribut können mehrere Bearbeitungsvermerke erstellt werden. Der Bearbeitungsvermerk enthält vorläufig eine GUID zur Identifikation des Bearbeiters sowie eine GUID für die Signatur. Im Attribut „Bearbeitungsvermerk Rolle“ kann die fachliche Rolle des Bearbeiters abgelegt werden. Kommentare des Bearbeiters werden als Freitext im Attribut „Kommentar“ hinterlegt. Der Bearbeitungsvermerk kann einen Anhang aufnehmen. Um mehrere Anhänge zu einem Objekt zuzuordnen, müssen mehrere Bearbeitungsvermerke erstellt werden.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk#getBearbeitungsvermerkAllg <em>Bearbeitungsvermerk Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk#getIDAnhang <em>ID Anhang</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage#getBearbeitungsvermerk()
 * @model extendedMetaData="name='CBearbeitungsvermerk' kind='elementOnly'"
 * @generated
 */
public interface Bearbeitungsvermerk extends Ur_Objekt {
	/**
	 * Returns the value of the '<em><b>Bearbeitungsvermerk Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bearbeitungsvermerk Allg</em>' containment reference.
	 * @see #setBearbeitungsvermerkAllg(Bearbeitungsvermerk_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage#getBearbeitungsvermerk_BearbeitungsvermerkAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bearbeitungsvermerk_Allg'"
	 * @generated
	 */
	Bearbeitungsvermerk_Allg_AttributeGroup getBearbeitungsvermerkAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Basisobjekte.Bearbeitungsvermerk#getBearbeitungsvermerkAllg <em>Bearbeitungsvermerk Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bearbeitungsvermerk Allg</em>' containment reference.
	 * @see #getBearbeitungsvermerkAllg()
	 * @generated
	 */
	void setBearbeitungsvermerkAllg(Bearbeitungsvermerk_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Anhang</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Verweise.ID_Anhang_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den durch diesen Bearbeitungsvermerk referenzierten Anhang.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage#getBearbeitungsvermerk_IDAnhang()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang'"
	 * @generated
	 */
	EList<ID_Anhang_TypeClass> getIDAnhang();

} // Bearbeitungsvermerk
