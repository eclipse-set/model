/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.PZB;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model1902.Verweise.ID_Anhang_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Bahnsteig_Kante_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Markanter_Punkt_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PZB Element Zuordnung INA Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.PZB.PZB_Element_Zuordnung_INA_AttributeGroup#getIDAnhangINA <em>ID Anhang INA</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PZB.PZB_Element_Zuordnung_INA_AttributeGroup#getIDBahnsteigKante <em>ID Bahnsteig Kante</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.PZB.PZB_Element_Zuordnung_INA_AttributeGroup#getIDMarkanterPunkt <em>ID Markanter Punkt</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.PZB.PZBPackage#getPZB_Element_Zuordnung_INA_AttributeGroup()
 * @model extendedMetaData="name='CPZB_Element_Zuordnung_INA' kind='elementOnly'"
 * @generated
 */
public interface PZB_Element_Zuordnung_INA_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Anhang INA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die zugehörigen Dokumente zur INA-Berechnung. Dazu gehören Erhebungsbogen, Wirkbereichsbogen und ggf. die Berechnungsblätter selbst. Diese werden für jedes Signal gesondert erstellt. DB-Regelwerk 819.1310A02 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang INA</em>' containment reference.
	 * @see #setIDAnhangINA(ID_Anhang_TypeClass)
	 * @see org.eclipse.set.model.model1902.PZB.PZBPackage#getPZB_Element_Zuordnung_INA_AttributeGroup_IDAnhangINA()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_INA'"
	 * @generated
	 */
	ID_Anhang_TypeClass getIDAnhangINA();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PZB.PZB_Element_Zuordnung_INA_AttributeGroup#getIDAnhangINA <em>ID Anhang INA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang INA</em>' containment reference.
	 * @see #getIDAnhangINA()
	 * @generated
	 */
	void setIDAnhangINA(ID_Anhang_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Bahnsteig Kante</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ID der zugehörigen Bahnsteigkante bezogen auf ein Signal mit INA-Berechnung. Der Fall, dass zwei separate Bahnsteige zwischen Vor- und Hauptsignal angeordnet sind, wird nicht angenommen. Aus der bisherigen Praxis sind keine solchen Fälle bekannt. DB-Regelwerk 819.1310A02 2 (1) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Bahnsteig Kante</em>' containment reference.
	 * @see #setIDBahnsteigKante(ID_Bahnsteig_Kante_TypeClass)
	 * @see org.eclipse.set.model.model1902.PZB.PZBPackage#getPZB_Element_Zuordnung_INA_AttributeGroup_IDBahnsteigKante()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Bahnsteig_Kante'"
	 * @generated
	 */
	ID_Bahnsteig_Kante_TypeClass getIDBahnsteigKante();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PZB.PZB_Element_Zuordnung_INA_AttributeGroup#getIDBahnsteigKante <em>ID Bahnsteig Kante</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Bahnsteig Kante</em>' containment reference.
	 * @see #getIDBahnsteigKante()
	 * @generated
	 */
	void setIDBahnsteigKante(ID_Bahnsteig_Kante_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Markanter Punkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * ID des Markanten Punktes, welcher die maßgebende Gefahrenstelle für die INA-Berechnung ist. DB-Regelwerk 819.1310A02 2 (11) und (12) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Markanter Punkt</em>' containment reference.
	 * @see #setIDMarkanterPunkt(ID_Markanter_Punkt_TypeClass)
	 * @see org.eclipse.set.model.model1902.PZB.PZBPackage#getPZB_Element_Zuordnung_INA_AttributeGroup_IDMarkanterPunkt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Markanter_Punkt'"
	 * @generated
	 */
	ID_Markanter_Punkt_TypeClass getIDMarkanterPunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.PZB.PZB_Element_Zuordnung_INA_AttributeGroup#getIDMarkanterPunkt <em>ID Markanter Punkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Markanter Punkt</em>' containment reference.
	 * @see #getIDMarkanterPunkt()
	 * @generated
	 */
	void setIDMarkanterPunkt(ID_Markanter_Punkt_TypeClass value);

} // PZB_Element_Zuordnung_INA_AttributeGroup
