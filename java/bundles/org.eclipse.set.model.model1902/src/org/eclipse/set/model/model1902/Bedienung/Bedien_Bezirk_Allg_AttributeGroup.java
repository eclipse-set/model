/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Bedienung;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedien Bezirk Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Bezirk_Allg_AttributeGroup#getAnbindungIB2 <em>Anbindung IB2</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Bezirk_Allg_AttributeGroup#getAnbindungIB3 <em>Anbindung IB3</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Bezirk_Allg_AttributeGroup#getHersteller <em>Hersteller</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Bezirk_Allg_AttributeGroup#getSchrankreihe <em>Schrankreihe</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Bezirk_Allg_AttributeGroup#getSteuerbezirksname <em>Steuerbezirksname</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Bezirk_Allg_AttributeGroup#getSteuerbezirksnummer <em>Steuerbezirksnummer</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Bedienung.BedienungPackage#getBedien_Bezirk_Allg_AttributeGroup()
 * @model extendedMetaData="name='CBedien_Bezirk_Allg' kind='elementOnly'"
 * @generated
 */
public interface Bedien_Bezirk_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Anbindung IB2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verbindung IB 1 zu IB 2. Angabe, ob der jeweilige Bedien Bezirk (Steuerbezirk) eine Anbindung zum Integritätsbereich 2 (IB II) hat (true) oder nicht (false). Die Planungsdaten für die IB I-IB II-Kopplung werden über ID Anhang Anbindung IB2 im PDF-Format als Anhang beigegeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anbindung IB2</em>' containment reference.
	 * @see #setAnbindungIB2(Anbindung_IB2_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bedienung.BedienungPackage#getBedien_Bezirk_Allg_AttributeGroup_AnbindungIB2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Anbindung_IB2'"
	 * @generated
	 */
	Anbindung_IB2_TypeClass getAnbindungIB2();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Bezirk_Allg_AttributeGroup#getAnbindungIB2 <em>Anbindung IB2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anbindung IB2</em>' containment reference.
	 * @see #getAnbindungIB2()
	 * @generated
	 */
	void setAnbindungIB2(Anbindung_IB2_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Anbindung IB3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verbindung IB 1 zu IB 3. Angabe, ob der jeweilige Bedien Bezirk (Steuerbezirk) eine Anbindung zum Integritätsbereich 3 (IB III) hat (true) oder nicht (false). Die Planungsdaten für die IB III-Anbindung werden über ID Anhang Anbindung IB3 im PDF-Format als Anhang beigegeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anbindung IB3</em>' containment reference.
	 * @see #setAnbindungIB3(Anbindung_IB3_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bedienung.BedienungPackage#getBedien_Bezirk_Allg_AttributeGroup_AnbindungIB3()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Anbindung_IB3'"
	 * @generated
	 */
	Anbindung_IB3_TypeClass getAnbindungIB3();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Bezirk_Allg_AttributeGroup#getAnbindungIB3 <em>Anbindung IB3</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anbindung IB3</em>' containment reference.
	 * @see #getAnbindungIB3()
	 * @generated
	 */
	void setAnbindungIB3(Anbindung_IB3_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Hersteller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unternehmen, das die Funktionsfähigkeit der Anlage verantwortlich hergestellt hat oder Hersteller des jeweiligen Elements. Diese Eigenschaft ist kein Datum einer Planung, sondern dient im Rücklauf der Planung dazu den Hersteller im Bestand zu erfassen. Es ist die zum Zeitpunkt der Inbetriebnahme gültige Firmierung zu verwenden. DB-Regelwerk Beschreibung im Erläuterungsbericht
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hersteller</em>' containment reference.
	 * @see #setHersteller(Hersteller_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bedienung.BedienungPackage#getBedien_Bezirk_Allg_AttributeGroup_Hersteller()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Hersteller'"
	 * @generated
	 */
	Hersteller_TypeClass getHersteller();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Bezirk_Allg_AttributeGroup#getHersteller <em>Hersteller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hersteller</em>' containment reference.
	 * @see #getHersteller()
	 * @generated
	 */
	void setHersteller(Hersteller_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Schrankreihe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordnungskriterium eines Bedien_Bezirkes im Rechnerraum. Das Attribut kann, in Abhängigkeit von den örtlichen Gepflogenheiten, aus mehreren alphanumerischen und Sonderzeichen bestehen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schrankreihe</em>' containment reference.
	 * @see #setSchrankreihe(Schrankreihe_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bedienung.BedienungPackage#getBedien_Bezirk_Allg_AttributeGroup_Schrankreihe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Schrankreihe'"
	 * @generated
	 */
	Schrankreihe_TypeClass getSchrankreihe();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Bezirk_Allg_AttributeGroup#getSchrankreihe <em>Schrankreihe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schrankreihe</em>' containment reference.
	 * @see #getSchrankreihe()
	 * @generated
	 */
	void setSchrankreihe(Schrankreihe_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Steuerbezirksname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe des regional übliche Namen des Bedienbezirks (Steuerbezirks) in der BZ-Planung (AP PT 1 BZ). Beispiele sind: \"Rechter Rhein\", \"Allgäu/Fichtelgebirge\", etc.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Steuerbezirksname</em>' containment reference.
	 * @see #setSteuerbezirksname(Steuerbezirksname_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bedienung.BedienungPackage#getBedien_Bezirk_Allg_AttributeGroup_Steuerbezirksname()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Steuerbezirksname'"
	 * @generated
	 */
	Steuerbezirksname_TypeClass getSteuerbezirksname();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Bezirk_Allg_AttributeGroup#getSteuerbezirksname <em>Steuerbezirksname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steuerbezirksname</em>' containment reference.
	 * @see #getSteuerbezirksname()
	 * @generated
	 */
	void setSteuerbezirksname(Steuerbezirksname_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Steuerbezirksnummer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordnungskriterium des Bedien-Bezirks in den Planunterlagen. Die Steuerbezirksnummer besteht in der Regel aus einem numerischen Zeichen, ggf. aus einer Ganzzahl. Da regional Abweichungen möglich sind, wurde der Basistyp offen gehalten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Steuerbezirksnummer</em>' containment reference.
	 * @see #setSteuerbezirksnummer(Steuerbezirksnummer_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bedienung.BedienungPackage#getBedien_Bezirk_Allg_AttributeGroup_Steuerbezirksnummer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Steuerbezirksnummer'"
	 * @generated
	 */
	Steuerbezirksnummer_TypeClass getSteuerbezirksnummer();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Bezirk_Allg_AttributeGroup#getSteuerbezirksnummer <em>Steuerbezirksnummer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steuerbezirksnummer</em>' containment reference.
	 * @see #getSteuerbezirksnummer()
	 * @generated
	 */
	void setSteuerbezirksnummer(Steuerbezirksnummer_TypeClass value);

} // Bedien_Bezirk_Allg_AttributeGroup
