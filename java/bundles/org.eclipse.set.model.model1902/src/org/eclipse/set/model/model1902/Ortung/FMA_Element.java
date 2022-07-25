/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Ortung;

import org.eclipse.set.model.model1902.Basisobjekte.Punkt_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_FMA_Anlage_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FMA Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Ergänzung einer FMA Komponente bei Gleisstromkreisen um die Bauelemente zur Ein- und Ausspeisung. FMA_Elemente werden rechts und/oder links der FMA_Komponente direkt den angrenzenden FMA_Anlagen zugewiesen. Das Objekt ist bei Achszählpunkten nicht erforderlich. DB-Regelwerk Typspezifische Planungshinweise und Technische Mitteilungen; Planungsdaten: Sicherungstechnischer Lageplan, BÜ-Lageplan, Gleisisolierplan, Freimeldetabelle. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Ortung.FMA_Element#getFMAElementAllg <em>FMA Element Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ortung.FMA_Element#getFMAElementAnschluss <em>FMA Element Anschluss</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ortung.FMA_Element#getIDFMAAnlage <em>IDFMA Anlage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Ortung.OrtungPackage#getFMA_Element()
 * @model extendedMetaData="name='CFMA_Element' kind='elementOnly'"
 * @generated
 */
public interface FMA_Element extends Punkt_Objekt {
	/**
	 * Returns the value of the '<em><b>FMA Element Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FMA Element Allg</em>' containment reference.
	 * @see #setFMAElementAllg(FMA_Element_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Ortung.OrtungPackage#getFMA_Element_FMAElementAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FMA_Element_Allg'"
	 * @generated
	 */
	FMA_Element_Allg_AttributeGroup getFMAElementAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ortung.FMA_Element#getFMAElementAllg <em>FMA Element Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FMA Element Allg</em>' containment reference.
	 * @see #getFMAElementAllg()
	 * @generated
	 */
	void setFMAElementAllg(FMA_Element_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>FMA Element Anschluss</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>FMA Element Anschluss</em>' containment reference.
	 * @see #setFMAElementAnschluss(FMA_Element_Anschluss_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Ortung.OrtungPackage#getFMA_Element_FMAElementAnschluss()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FMA_Element_Anschluss'"
	 * @generated
	 */
	FMA_Element_Anschluss_AttributeGroup getFMAElementAnschluss();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ortung.FMA_Element#getFMAElementAnschluss <em>FMA Element Anschluss</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FMA Element Anschluss</em>' containment reference.
	 * @see #getFMAElementAnschluss()
	 * @generated
	 */
	void setFMAElementAnschluss(FMA_Element_Anschluss_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDFMA Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die zugehörige Freimeldeabschnitts-Anlage (FMA_Anlage). Einer FMA_Anlage können maximal vier Freimeldeabschnittelemente, davon genau eine Einspeisung und maximal drei Ausspeisungen zugeordnet werden. DB-Regelwerk Sicherungstechnischer Lageplan, BÜ-Lageplan, Gleisfreimeldeplan. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDFMA Anlage</em>' containment reference.
	 * @see #setIDFMAAnlage(ID_FMA_Anlage_TypeClass)
	 * @see org.eclipse.set.model.model1902.Ortung.OrtungPackage#getFMA_Element_IDFMAAnlage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_FMA_Anlage'"
	 * @generated
	 */
	ID_FMA_Anlage_TypeClass getIDFMAAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ortung.FMA_Element#getIDFMAAnlage <em>IDFMA Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDFMA Anlage</em>' containment reference.
	 * @see #getIDFMAAnlage()
	 * @generated
	 */
	void setIDFMAAnlage(ID_FMA_Anlage_TypeClass value);

} // FMA_Element
