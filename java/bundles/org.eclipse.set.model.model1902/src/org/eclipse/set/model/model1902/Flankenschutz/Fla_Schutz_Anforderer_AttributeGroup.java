/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Flankenschutz;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model1902.Verweise.ID_Anforderer_Element_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fla Schutz Anforderer Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Flankenschutz.Fla_Schutz_Anforderer_AttributeGroup#getFahrtUeber <em>Fahrt Ueber</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Flankenschutz.Fla_Schutz_Anforderer_AttributeGroup#getIDAnfordererElement <em>ID Anforderer Element</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Flankenschutz.FlankenschutzPackage#getFla_Schutz_Anforderer_AttributeGroup()
 * @model extendedMetaData="name='CFla_Schutz_Anforderer' kind='elementOnly'"
 * @generated
 */
public interface Fla_Schutz_Anforderer_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Fahrt Ueber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beschreibung des Weichenanschlusses der Flankenschutz anfordernden Weiche. links/rechts: Der linke/rechte Strang der Weiche wird befahren, der jeweils andere sucht Flankenschutz. Spitze: Die nicht durch Verschluss befriedigte Flankenschutzanforderung, die auf eine Zwieschutzweiche trifft, wird über die Spitze der Zwieschutzweiche weitergegeben. DB-Regelwerk links/rechts: Flankenschutztabelle, Spalte 1 \"Fahrstraßen über\"; Spitze: Zwieschutzweichentabelle, indirekt über Spalte 4 \"Zwieschutzfall-Maßnahme\", wenn dort \"Fernschutz\" (eigentlich: Ersatzschutz) oder \"Verzicht\" ausgewählt ist. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fahrt Ueber</em>' containment reference.
	 * @see #setFahrtUeber(Fahrt_Ueber_TypeClass)
	 * @see org.eclipse.set.model.model1902.Flankenschutz.FlankenschutzPackage#getFla_Schutz_Anforderer_AttributeGroup_FahrtUeber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fahrt_Ueber'"
	 * @generated
	 */
	Fahrt_Ueber_TypeClass getFahrtUeber();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Flankenschutz.Fla_Schutz_Anforderer_AttributeGroup#getFahrtUeber <em>Fahrt Ueber</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fahrt Ueber</em>' containment reference.
	 * @see #getFahrtUeber()
	 * @generated
	 */
	void setFahrtUeber(Fahrt_Ueber_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Anforderer Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Element, das den Flankenschutz anfordert. Flankenschutz können Weichen, Kreuzungen (W Kr Gsp Element) und Nahbedienbereiche (NB Zone Grenze) anfordern. Ist bei einer Zwieschutzweiche ein Ersatzschutz geplant, ist die Zwieschutzweiche der Anforderer. DB-Regelwerk Flankenschutztabelle, Spalten 1 \"Fahrstraßen über/Nahbedienbezirk\" und 2 \"Nahbediengrenze\"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anforderer Element</em>' containment reference.
	 * @see #setIDAnfordererElement(ID_Anforderer_Element_TypeClass)
	 * @see org.eclipse.set.model.model1902.Flankenschutz.FlankenschutzPackage#getFla_Schutz_Anforderer_AttributeGroup_IDAnfordererElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Anforderer_Element'"
	 * @generated
	 */
	ID_Anforderer_Element_TypeClass getIDAnfordererElement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Flankenschutz.Fla_Schutz_Anforderer_AttributeGroup#getIDAnfordererElement <em>ID Anforderer Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anforderer Element</em>' containment reference.
	 * @see #getIDAnfordererElement()
	 * @generated
	 */
	void setIDAnfordererElement(ID_Anforderer_Element_TypeClass value);

} // Fla_Schutz_Anforderer_AttributeGroup
