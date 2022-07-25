/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Balise Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balise_Allg_AttributeGroup#getAnordnungImDP <em>Anordnung Im DP</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balise_Allg_AttributeGroup#getFabrikat <em>Fabrikat</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balise_Allg_AttributeGroup#getHersteller <em>Hersteller</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balise_Allg_AttributeGroup#getHinweisBalisenbefestigung <em>Hinweis Balisenbefestigung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBalise_Allg_AttributeGroup()
 * @model extendedMetaData="name='CBalise_Allg' kind='elementOnly'"
 * @generated
 */
public interface Balise_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Anordnung Im DP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Physische Anordnung der Balise im Datenpunkt. Die Balise mit der Nummer 1 ist die Referenzbalise des Datenpunkts. Duplizierte Balisen werden mitgezählt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anordnung Im DP</em>' containment reference.
	 * @see #setAnordnungImDP(Anordnung_Im_DP_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBalise_Allg_AttributeGroup_AnordnungImDP()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Anordnung_Im_DP'"
	 * @generated
	 */
	Anordnung_Im_DP_TypeClass getAnordnungImDP();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balise_Allg_AttributeGroup#getAnordnungImDP <em>Anordnung Im DP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anordnung Im DP</em>' containment reference.
	 * @see #getAnordnungImDP()
	 * @generated
	 */
	void setAnordnungImDP(Anordnung_Im_DP_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Fabrikat</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Herstellerbezogene Bezeichnung bzw. Typ-Angabe einschließlich Gerätestand (Rücklaufdatum).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fabrikat</em>' containment reference.
	 * @see #setFabrikat(Fabrikat_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBalise_Allg_AttributeGroup_Fabrikat()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Fabrikat'"
	 * @generated
	 */
	Fabrikat_TypeClass getFabrikat();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balise_Allg_AttributeGroup#getFabrikat <em>Fabrikat</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fabrikat</em>' containment reference.
	 * @see #getFabrikat()
	 * @generated
	 */
	void setFabrikat(Fabrikat_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Hersteller</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Unternehmen, das die Funktionsfähigkeit der Anlage verantwortlich hergestellt hat oder Hersteller des jeweiligen Elements. Diese Eigenschaft ist kein Datum einer Planung, sondern dient im Rücklauf der Planung dazu den Hersteller im Bestand zu erfassen. Es ist die zum Zeitpunkt der Inbetriebnahme gültige Firmierung zu verwenden. DB-Regelwerk Beschreibung im Erläuterungsbericht
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hersteller</em>' containment reference.
	 * @see #setHersteller(Hersteller_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBalise_Allg_AttributeGroup_Hersteller()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Hersteller'"
	 * @generated
	 */
	Hersteller_TypeClass getHersteller();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balise_Allg_AttributeGroup#getHersteller <em>Hersteller</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hersteller</em>' containment reference.
	 * @see #getHersteller()
	 * @generated
	 */
	void setHersteller(Hersteller_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Hinweis Balisenbefestigung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hinweis auf Besonderheiten bei der Balisenbefestigung, z. B. Typ des Balisenträgers, Längsbefestigung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hinweis Balisenbefestigung</em>' containment reference.
	 * @see #setHinweisBalisenbefestigung(Hinweis_Balisenbefestigung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBalise_Allg_AttributeGroup_HinweisBalisenbefestigung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Hinweis_Balisenbefestigung'"
	 * @generated
	 */
	Hinweis_Balisenbefestigung_TypeClass getHinweisBalisenbefestigung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balise_Allg_AttributeGroup#getHinweisBalisenbefestigung <em>Hinweis Balisenbefestigung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hinweis Balisenbefestigung</em>' containment reference.
	 * @see #getHinweisBalisenbefestigung()
	 * @generated
	 */
	void setHinweisBalisenbefestigung(Hinweis_Balisenbefestigung_TypeClass value);

} // Balise_Allg_AttributeGroup
