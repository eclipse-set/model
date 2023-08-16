/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Schluesselabhaengigkeiten;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schluessel Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel_Allg_AttributeGroup#getSchluesselBartform <em>Schluessel Bartform</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel_Allg_AttributeGroup#getSchluesselGruppe <em>Schluessel Gruppe</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchluessel_Allg_AttributeGroup()
 * @model extendedMetaData="name='CSchluessel_Allg' kind='elementOnly'"
 * @generated
 */
public interface Schluessel_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Schluessel Bartform</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bartform des Schlüssels. DB-Regelwerk Bisher keine Darstellung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schluessel Bartform</em>' containment reference.
	 * @see #setSchluesselBartform(Schluessel_Bartform_TypeClass)
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchluessel_Allg_AttributeGroup_SchluesselBartform()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Schluessel_Bartform'"
	 * @generated
	 */
	Schluessel_Bartform_TypeClass getSchluesselBartform();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel_Allg_AttributeGroup#getSchluesselBartform <em>Schluessel Bartform</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schluessel Bartform</em>' containment reference.
	 * @see #getSchluesselBartform()
	 * @generated
	 */
	void setSchluesselBartform(Schluessel_Bartform_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Schluessel Gruppe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gruppe des Schlüssels. DB-Regelwerk Bisher keine Darstellung
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schluessel Gruppe</em>' containment reference.
	 * @see #setSchluesselGruppe(Schluessel_Gruppe_TypeClass)
	 * @see org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#getSchluessel_Allg_AttributeGroup_SchluesselGruppe()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Schluessel_Gruppe'"
	 * @generated
	 */
	Schluessel_Gruppe_TypeClass getSchluesselGruppe();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.Schluessel_Allg_AttributeGroup#getSchluesselGruppe <em>Schluessel Gruppe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schluessel Gruppe</em>' containment reference.
	 * @see #getSchluesselGruppe()
	 * @generated
	 */
	void setSchluesselGruppe(Schluessel_Gruppe_TypeClass value);

} // Schluessel_Allg_AttributeGroup
