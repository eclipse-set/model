/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Medien_und_Trassen;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kabel Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getInduktionsschutz <em>Induktionsschutz</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getKabelArt <em>Kabel Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getKabelLaenge <em>Kabel Laenge</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getKabelTyp <em>Kabel Typ</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getNagetierschutz <em>Nagetierschutz</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_Allg_AttributeGroup()
 * @model extendedMetaData="name='CKabel_Allg' kind='elementOnly'"
 * @generated
 */
public interface Kabel_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Induktionsschutz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Induktionsschutz-Klasse rx (16,7 Hz).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Induktionsschutz</em>' containment reference.
	 * @see #setInduktionsschutz(Induktionsschutz_TypeClass)
	 * @see org.eclipse.set.model.planpro.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_Allg_AttributeGroup_Induktionsschutz()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Induktionsschutz'"
	 * @generated
	 */
	Induktionsschutz_TypeClass getInduktionsschutz();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getInduktionsschutz <em>Induktionsschutz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Induktionsschutz</em>' containment reference.
	 * @see #getInduktionsschutz()
	 * @generated
	 */
	void setInduktionsschutz(Induktionsschutz_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Kabel Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art des Kabels, z. B. Signalkabel oder Lichtwellenleiter (LWL).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kabel Art</em>' containment reference.
	 * @see #setKabelArt(Kabel_Art_TypeClass)
	 * @see org.eclipse.set.model.planpro.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_Allg_AttributeGroup_KabelArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Kabel_Art'"
	 * @generated
	 */
	Kabel_Art_TypeClass getKabelArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getKabelArt <em>Kabel Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kabel Art</em>' containment reference.
	 * @see #getKabelArt()
	 * @generated
	 */
	void setKabelArt(Kabel_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Kabel Laenge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Länge des Kabels in m.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kabel Laenge</em>' containment reference.
	 * @see #setKabelLaenge(Kabel_Laenge_TypeClass)
	 * @see org.eclipse.set.model.planpro.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_Allg_AttributeGroup_KabelLaenge()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Kabel_Laenge'"
	 * @generated
	 */
	Kabel_Laenge_TypeClass getKabelLaenge();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getKabelLaenge <em>Kabel Laenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kabel Laenge</em>' containment reference.
	 * @see #getKabelLaenge()
	 * @generated
	 */
	void setKabelLaenge(Kabel_Laenge_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Kabel Typ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Typ des Kabels. Eine Liste der zugelassenen Kabeltypen soll über Planungswerkzeug vorgegeben werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kabel Typ</em>' containment reference.
	 * @see #setKabelTyp(Kabel_Typ_TypeClass)
	 * @see org.eclipse.set.model.planpro.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_Allg_AttributeGroup_KabelTyp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Kabel_Typ'"
	 * @generated
	 */
	Kabel_Typ_TypeClass getKabelTyp();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getKabelTyp <em>Kabel Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kabel Typ</em>' containment reference.
	 * @see #getKabelTyp()
	 * @generated
	 */
	void setKabelTyp(Kabel_Typ_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Nagetierschutz</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob das Kabel mit einem Nagetierschutz zu versehen ist (true). Der Wert false wird nicht verwendet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Nagetierschutz</em>' containment reference.
	 * @see #setNagetierschutz(Nagetierschutz_TypeClass)
	 * @see org.eclipse.set.model.planpro.Medien_und_Trassen.Medien_und_TrassenPackage#getKabel_Allg_AttributeGroup_Nagetierschutz()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Nagetierschutz'"
	 * @generated
	 */
	Nagetierschutz_TypeClass getNagetierschutz();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Medien_und_Trassen.Kabel_Allg_AttributeGroup#getNagetierschutz <em>Nagetierschutz</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nagetierschutz</em>' containment reference.
	 * @see #getNagetierschutz()
	 * @generated
	 */
	void setNagetierschutz(Nagetierschutz_TypeClass value);

} // Kabel_Allg_AttributeGroup
