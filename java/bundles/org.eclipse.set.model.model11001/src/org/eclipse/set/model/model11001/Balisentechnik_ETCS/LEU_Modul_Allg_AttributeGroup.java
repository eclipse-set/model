/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Balisentechnik_ETCS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LEU Modul Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.LEU_Modul_Allg_AttributeGroup#getHersteller <em>Hersteller</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.LEU_Modul_Allg_AttributeGroup#getLEUModulArt <em>LEU Modul Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.LEU_Modul_Allg_AttributeGroup#getLEUModulGeraetestand <em>LEU Modul Geraetestand</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.LEU_Modul_Allg_AttributeGroup#getLEUModulTyp <em>LEU Modul Typ</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Modul_Allg_AttributeGroup()
 * @model extendedMetaData="name='CLEU_Modul_Allg' kind='elementOnly'"
 * @generated
 */
public interface LEU_Modul_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Hersteller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unternehmen, das die Funktionsfähigkeit der Anlage verantwortlich hergestellt hat oder Hersteller des jeweiligen Elements. Diese Eigenschaft ist kein Datum einer Planung, sondern dient im Rücklauf der Planung dazu den Hersteller im Bestand zu erfassen. Es ist die zum Zeitpunkt der Inbetriebnahme gültige Firmierung zu verwenden. DB-Regelwerk Beschreibung im Erläuterungsbericht
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hersteller</em>' containment reference.
	 * @see #setHersteller(Hersteller_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Modul_Allg_AttributeGroup_Hersteller()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Hersteller'"
	 * @generated
	 */
	Hersteller_TypeClass getHersteller();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.LEU_Modul_Allg_AttributeGroup#getHersteller <em>Hersteller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hersteller</em>' containment reference.
	 * @see #getHersteller()
	 * @generated
	 */
	void setHersteller(Hersteller_TypeClass value);

	/**
	 * Returns the value of the '<em><b>LEU Modul Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art des LEU-Moduls (Voll-LEU, LEU-P). Pflichtangabe bei ESG.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LEU Modul Art</em>' containment reference.
	 * @see #setLEUModulArt(LEU_Modul_Art_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Modul_Allg_AttributeGroup_LEUModulArt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LEU_Modul_Art'"
	 * @generated
	 */
	LEU_Modul_Art_TypeClass getLEUModulArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.LEU_Modul_Allg_AttributeGroup#getLEUModulArt <em>LEU Modul Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LEU Modul Art</em>' containment reference.
	 * @see #getLEUModulArt()
	 * @generated
	 */
	void setLEUModulArt(LEU_Modul_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>LEU Modul Geraetestand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gerätestand des LEU-Moduls. Die Information ist im Zusammenhang mit der Angabe \"LEU_Modul_Typ\" zu interpretieren. Beispiel: 3, 12a.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LEU Modul Geraetestand</em>' containment reference.
	 * @see #setLEUModulGeraetestand(LEU_Modul_Geraetestand_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Modul_Allg_AttributeGroup_LEUModulGeraetestand()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LEU_Modul_Geraetestand'"
	 * @generated
	 */
	LEU_Modul_Geraetestand_TypeClass getLEUModulGeraetestand();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.LEU_Modul_Allg_AttributeGroup#getLEUModulGeraetestand <em>LEU Modul Geraetestand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LEU Modul Geraetestand</em>' containment reference.
	 * @see #getLEUModulGeraetestand()
	 * @generated
	 */
	void setLEUModulGeraetestand(LEU_Modul_Geraetestand_TypeClass value);

	/**
	 * Returns the value of the '<em><b>LEU Modul Typ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Herstellerbezogene Typ-Angabe (Rücklaufdatum).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LEU Modul Typ</em>' containment reference.
	 * @see #setLEUModulTyp(LEU_Modul_Typ_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Modul_Allg_AttributeGroup_LEUModulTyp()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LEU_Modul_Typ'"
	 * @generated
	 */
	LEU_Modul_Typ_TypeClass getLEUModulTyp();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.LEU_Modul_Allg_AttributeGroup#getLEUModulTyp <em>LEU Modul Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LEU Modul Typ</em>' containment reference.
	 * @see #getLEUModulTyp()
	 * @generated
	 */
	void setLEUModulTyp(LEU_Modul_Typ_TypeClass value);

} // LEU_Modul_Allg_AttributeGroup
