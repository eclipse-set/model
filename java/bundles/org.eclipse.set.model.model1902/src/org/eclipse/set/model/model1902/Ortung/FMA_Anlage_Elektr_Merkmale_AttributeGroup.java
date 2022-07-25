/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Ortung;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FMA Anlage Elektr Merkmale Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup#getBettungswiderstand <em>Bettungswiderstand</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup#getFMALaenge <em>FMA Laenge</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup#getFMALaengeBeeinflusst <em>FMA Laenge Beeinflusst</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup#getFMALaengeE1 <em>FMA Laenge E1</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup#getFMALaengeE2 <em>FMA Laenge E2</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup#getFMALaengeE3 <em>FMA Laenge E3</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup#getFMALaengeS <em>FMA Laenge S</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Ortung.OrtungPackage#getFMA_Anlage_Elektr_Merkmale_AttributeGroup()
 * @model extendedMetaData="name='CFMA_Anlage_Elektr_Merkmale' kind='elementOnly'"
 * @generated
 */
public interface FMA_Anlage_Elektr_Merkmale_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bettungswiderstand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Spezifischer elektrischer Bettungswiderstand eines Gleisabschnitts (in Ohm/km), wenn dieser als Gleisstromkreis ausgebildet ist. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bettungswiderstand</em>' containment reference.
	 * @see #setBettungswiderstand(Bettungswiderstand_TypeClass)
	 * @see org.eclipse.set.model.model1902.Ortung.OrtungPackage#getFMA_Anlage_Elektr_Merkmale_AttributeGroup_Bettungswiderstand()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bettungswiderstand'"
	 * @generated
	 */
	Bettungswiderstand_TypeClass getBettungswiderstand();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup#getBettungswiderstand <em>Bettungswiderstand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bettungswiderstand</em>' containment reference.
	 * @see #getBettungswiderstand()
	 * @generated
	 */
	void setBettungswiderstand(Bettungswiderstand_TypeClass value);

	/**
	 * Returns the value of the '<em><b>FMA Laenge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elektrische Länge des Freimeldeabschnitts. Berechneter Wert entsprechend den Planungsrichtlinien und den örtlichen Gegebenheiten. Die Berechnung wird, sofern sie nicht trivial ist, als Dokument an das Attribut angehangen (s. dazu: BasisAttribut). DB-Regelwerk Freimeldetabelle, bei NF-Gleisstromkreisen: Spalte 9; bei FTGS: Angabe ist nicht enthalten, wird allerdings häufig in einer zusätzlichen Spalte im Bereich FTGS eingetragen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FMA Laenge</em>' containment reference.
	 * @see #setFMALaenge(FMA_Laenge_TypeClass)
	 * @see org.eclipse.set.model.model1902.Ortung.OrtungPackage#getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaenge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FMA_Laenge'"
	 * @generated
	 */
	FMA_Laenge_TypeClass getFMALaenge();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup#getFMALaenge <em>FMA Laenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FMA Laenge</em>' containment reference.
	 * @see #getFMALaenge()
	 * @generated
	 */
	void setFMALaenge(FMA_Laenge_TypeClass value);

	/**
	 * Returns the value of the '<em><b>FMA Laenge Beeinflusst</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Beeinflusste Länge des Freimeldeabschnitts. Ein Eintrag ist nur bei NF-Gleisstromkreisen erforderlich. Die Ermittlung erfolgt entsprechend den Anwendungsrichtlinien und den örtlichen Gegebenheiten. Die Berechnung wird als Dokument an das Attribut angehangen (s. dazu: BasisAttribut). DB-Regelwerk Freimeldetabelle, Spalte 10
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FMA Laenge Beeinflusst</em>' containment reference.
	 * @see #setFMALaengeBeeinflusst(FMA_Laenge_Beeinflusst_TypeClass)
	 * @see org.eclipse.set.model.model1902.Ortung.OrtungPackage#getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeBeeinflusst()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FMA_Laenge_Beeinflusst'"
	 * @generated
	 */
	FMA_Laenge_Beeinflusst_TypeClass getFMALaengeBeeinflusst();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup#getFMALaengeBeeinflusst <em>FMA Laenge Beeinflusst</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FMA Laenge Beeinflusst</em>' containment reference.
	 * @see #getFMALaengeBeeinflusst()
	 * @generated
	 */
	void setFMALaengeBeeinflusst(FMA_Laenge_Beeinflusst_TypeClass value);

	/**
	 * Returns the value of the '<em><b>FMA Laenge E1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elektrische Länge des Teilabschnitts E1. Ist nur bei FTGS erforderlich. Ermittlung entsprechend Anwendungsrichtlinie. Angabe des Attributs erfolgt nur, wenn mindestens zwei Teillängen existieren, sonst ist die Angabe des Attributs FMA Laenge hinreichend. DB-Regelwerk Freimeldetabelle, Spalte 14
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FMA Laenge E1</em>' containment reference.
	 * @see #setFMALaengeE1(FMA_Laenge_E1_TypeClass)
	 * @see org.eclipse.set.model.model1902.Ortung.OrtungPackage#getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeE1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FMA_Laenge_E1'"
	 * @generated
	 */
	FMA_Laenge_E1_TypeClass getFMALaengeE1();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup#getFMALaengeE1 <em>FMA Laenge E1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FMA Laenge E1</em>' containment reference.
	 * @see #getFMALaengeE1()
	 * @generated
	 */
	void setFMALaengeE1(FMA_Laenge_E1_TypeClass value);

	/**
	 * Returns the value of the '<em><b>FMA Laenge E2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elektrische Länge des Teilabschnitts E2. Ist nur bei FTGS erforderlich. Ermittlung entsprechend Anwendungsrichtlinie. Angabe des Attributs erfolgt nur, wenn mindestens drei Teillängen existieren. DB-Regelwerk Freimeldetabelle, Spalte 15
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FMA Laenge E2</em>' containment reference.
	 * @see #setFMALaengeE2(FMA_Laenge_E2_TypeClass)
	 * @see org.eclipse.set.model.model1902.Ortung.OrtungPackage#getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeE2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FMA_Laenge_E2'"
	 * @generated
	 */
	FMA_Laenge_E2_TypeClass getFMALaengeE2();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup#getFMALaengeE2 <em>FMA Laenge E2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FMA Laenge E2</em>' containment reference.
	 * @see #getFMALaengeE2()
	 * @generated
	 */
	void setFMALaengeE2(FMA_Laenge_E2_TypeClass value);

	/**
	 * Returns the value of the '<em><b>FMA Laenge E3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elektrische Länge des Teilabschnitts E3. Ist nur bei FTGS erforderlich. Ermittlung entsprechend Anwendungsrichtlinie. Angabe des Attributs erfolgt nur, wenn vier Teillängen existieren. DB-Regelwerk Freimeldetabelle, Spalte 16
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FMA Laenge E3</em>' containment reference.
	 * @see #setFMALaengeE3(FMA_Laenge_E3_TypeClass)
	 * @see org.eclipse.set.model.model1902.Ortung.OrtungPackage#getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeE3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FMA_Laenge_E3'"
	 * @generated
	 */
	FMA_Laenge_E3_TypeClass getFMALaengeE3();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup#getFMALaengeE3 <em>FMA Laenge E3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FMA Laenge E3</em>' containment reference.
	 * @see #getFMALaengeE3()
	 * @generated
	 */
	void setFMALaengeE3(FMA_Laenge_E3_TypeClass value);

	/**
	 * Returns the value of the '<em><b>FMA Laenge S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Elektrische Länge des Teilabschnitts S. Ist nur bei FTGS erforderlich. Ermittlung entsprechend Anwendungsrichtlinie. Angabe des Attributs erfolgt nur, wenn mindestens zwei Teillängen existieren, sonst ist die Angabe des Attributs FMA Laenge hinreichend. DB-Regelwerk Freimeldetabelle, Spalte 13
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FMA Laenge S</em>' containment reference.
	 * @see #setFMALaengeS(FMA_Laenge_S_TypeClass)
	 * @see org.eclipse.set.model.model1902.Ortung.OrtungPackage#getFMA_Anlage_Elektr_Merkmale_AttributeGroup_FMALaengeS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FMA_Laenge_S'"
	 * @generated
	 */
	FMA_Laenge_S_TypeClass getFMALaengeS();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Ortung.FMA_Anlage_Elektr_Merkmale_AttributeGroup#getFMALaengeS <em>FMA Laenge S</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FMA Laenge S</em>' containment reference.
	 * @see #getFMALaengeS()
	 * @generated
	 */
	void setFMALaengeS(FMA_Laenge_S_TypeClass value);

} // FMA_Anlage_Elektr_Merkmale_AttributeGroup
