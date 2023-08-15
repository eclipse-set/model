/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Ortung;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FMA Element Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Ortung.FMA_Element_Allg_AttributeGroup#getFMAElementArt <em>FMA Element Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ortung.FMA_Element_Allg_AttributeGroup#getFMAElementSeilanzahl <em>FMA Element Seilanzahl</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Ortung.FMA_Element_Allg_AttributeGroup#getFMAElementSeiltyp <em>FMA Element Seiltyp</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Ortung.OrtungPackage#getFMA_Element_Allg_AttributeGroup()
 * @model extendedMetaData="name='CFMA_Element_Allg' kind='elementOnly'"
 * @generated
 */
public interface FMA_Element_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>FMA Element Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art, mit der die Ein- bzw. Ausspeisung in den Freimeldeabschnitt vorgenommen wird. Hinweis: Beim Wert \"S_Verbinder\" handelt es sich streng genommen nur um einen halben S-Verbinder, die jeweils andere Hälfte ist dem angrenzenden Freimeldeabschnitt zugeordnet. Bei der Ermittlung der Anzahl der S-Verbinder in einem Pool muss also die Anzahl der Instanzen FMA_Element mit FMA_Element_Art==S_Verbinder halbiert werden. DB-Regelwerk Bei allen Typen von FMA_Elementen: Sicherungstechnischer Lageplan, BÜ-Lageplan; Gleisfreimeldeplan. Bei FTGS: zusätzlich in der Freimeldetabelle, Spalte 17 links, dabei wird die Zuordnung (z.B. links/rechts) uneinheitlich gehandhabt. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FMA Element Art</em>' containment reference.
	 * @see #setFMAElementArt(FMA_Element_Art_TypeClass)
	 * @see org.eclipse.set.model.model11001.Ortung.OrtungPackage#getFMA_Element_Allg_AttributeGroup_FMAElementArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FMA_Element_Art'"
	 * @generated
	 */
	FMA_Element_Art_TypeClass getFMAElementArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ortung.FMA_Element_Allg_AttributeGroup#getFMAElementArt <em>FMA Element Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FMA Element Art</em>' containment reference.
	 * @see #getFMAElementArt()
	 * @generated
	 */
	void setFMAElementArt(FMA_Element_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>FMA Element Seilanzahl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anzahl der Seile der Schienenverbinder entsprechend der Anwendungsrichtlinien. Die zugehörigen Baulängen ergeben sich aus den Anwendungsrichtlinien und dem Typ der angrenzenden FMA Anlage und werden nicht separat angegeben. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen. DB-Regelwerk bei FTGS: Freimeldetabelle, Spalte 17 rechts; bei anderen Arten von Gleisstromkreisen: Gleisfreimeldeplan. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FMA Element Seilanzahl</em>' containment reference.
	 * @see #setFMAElementSeilanzahl(FMA_Element_Seilanzahl_TypeClass)
	 * @see org.eclipse.set.model.model11001.Ortung.OrtungPackage#getFMA_Element_Allg_AttributeGroup_FMAElementSeilanzahl()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FMA_Element_Seilanzahl'"
	 * @generated
	 */
	FMA_Element_Seilanzahl_TypeClass getFMAElementSeilanzahl();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ortung.FMA_Element_Allg_AttributeGroup#getFMAElementSeilanzahl <em>FMA Element Seilanzahl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FMA Element Seilanzahl</em>' containment reference.
	 * @see #getFMAElementSeilanzahl()
	 * @generated
	 */
	void setFMAElementSeilanzahl(FMA_Element_Seilanzahl_TypeClass value);

	/**
	 * Returns the value of the '<em><b>FMA Element Seiltyp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Querschnitt und Material der Seile der Schienenverbinder entsprechend den Anwendungsrichtlinien. Die Angabe erfolgt in mm². Beispiele: 120 Cu, 240 Al. DB-Regelwerk bei FTGS: Freimeldetabelle, Spalte 17 rechts; bei anderen Arten von Gleisstromkreisen: Gleisfreimeldeplan. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FMA Element Seiltyp</em>' containment reference.
	 * @see #setFMAElementSeiltyp(FMA_Element_Seiltyp_TypeClass)
	 * @see org.eclipse.set.model.model11001.Ortung.OrtungPackage#getFMA_Element_Allg_AttributeGroup_FMAElementSeiltyp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FMA_Element_Seiltyp'"
	 * @generated
	 */
	FMA_Element_Seiltyp_TypeClass getFMAElementSeiltyp();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Ortung.FMA_Element_Allg_AttributeGroup#getFMAElementSeiltyp <em>FMA Element Seiltyp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FMA Element Seiltyp</em>' containment reference.
	 * @see #getFMAElementSeiltyp()
	 * @generated
	 */
	void setFMAElementSeiltyp(FMA_Element_Seiltyp_TypeClass value);

} // FMA_Element_Allg_AttributeGroup
