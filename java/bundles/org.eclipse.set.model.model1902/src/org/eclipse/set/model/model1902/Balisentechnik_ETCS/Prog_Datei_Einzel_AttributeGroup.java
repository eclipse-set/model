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

import org.eclipse.set.model.model1902.BasisTypen.Eigenschaften_Datei_AttributeGroup;

import org.eclipse.set.model.model1902.Verweise.ID_Binaerdatei_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prog Datei Einzel Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Prog_Datei_Einzel_AttributeGroup#getAnzeigetext <em>Anzeigetext</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Prog_Datei_Einzel_AttributeGroup#getEigenschaftenBinaerdatei <em>Eigenschaften Binaerdatei</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Prog_Datei_Einzel_AttributeGroup#getEinzeldateiArt <em>Einzeldatei Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Prog_Datei_Einzel_AttributeGroup#getIDBinaerdatei <em>ID Binaerdatei</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Prog_Datei_Einzel_AttributeGroup#getKonfigurationskennung <em>Konfigurationskennung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Prog_Datei_Einzel_AttributeGroup#getVerwendung <em>Verwendung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getProg_Datei_Einzel_AttributeGroup()
 * @model extendedMetaData="name='CProg_Datei_Einzel' kind='elementOnly'"
 * @generated
 */
public interface Prog_Datei_Einzel_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Anzeigetext</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text zur Unterstützung der Bedienerführung in der Programmiersoftware.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Anzeigetext</em>' containment reference.
	 * @see #setAnzeigetext(Anzeigetext_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getProg_Datei_Einzel_AttributeGroup_Anzeigetext()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Anzeigetext'"
	 * @generated
	 */
	Anzeigetext_TypeClass getAnzeigetext();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Prog_Datei_Einzel_AttributeGroup#getAnzeigetext <em>Anzeigetext</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Anzeigetext</em>' containment reference.
	 * @see #getAnzeigetext()
	 * @generated
	 */
	void setAnzeigetext(Anzeigetext_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Eigenschaften Binaerdatei</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Metadaten der Binaerdatei, die in das zu programmierende Gerät geladen wird bzw. die den Programmier- oder Prüfvorgang unterstützt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Eigenschaften Binaerdatei</em>' containment reference.
	 * @see #setEigenschaftenBinaerdatei(Eigenschaften_Datei_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getProg_Datei_Einzel_AttributeGroup_EigenschaftenBinaerdatei()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Eigenschaften_Binaerdatei'"
	 * @generated
	 */
	Eigenschaften_Datei_AttributeGroup getEigenschaftenBinaerdatei();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Prog_Datei_Einzel_AttributeGroup#getEigenschaftenBinaerdatei <em>Eigenschaften Binaerdatei</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Eigenschaften Binaerdatei</em>' containment reference.
	 * @see #getEigenschaftenBinaerdatei()
	 * @generated
	 */
	void setEigenschaftenBinaerdatei(Eigenschaften_Datei_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Einzeldatei Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der einzelnen Programmierdatei (Ladedatei, Hilfsdatei).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einzeldatei Art</em>' containment reference.
	 * @see #setEinzeldateiArt(Einzeldatei_Art_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getProg_Datei_Einzel_AttributeGroup_EinzeldateiArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Einzeldatei_Art'"
	 * @generated
	 */
	Einzeldatei_Art_TypeClass getEinzeldateiArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Prog_Datei_Einzel_AttributeGroup#getEinzeldateiArt <em>Einzeldatei Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einzeldatei Art</em>' containment reference.
	 * @see #getEinzeldateiArt()
	 * @generated
	 */
	void setEinzeldateiArt(Einzeldatei_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Binaerdatei</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Binaerdatei, die in das zu programmierende Gerät geladen wird bzw. die den Programmier- oder Prüfvorgang unterstützt
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Binaerdatei</em>' containment reference.
	 * @see #setIDBinaerdatei(ID_Binaerdatei_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getProg_Datei_Einzel_AttributeGroup_IDBinaerdatei()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Binaerdatei'"
	 * @generated
	 */
	ID_Binaerdatei_ohne_Proxy_TypeClass getIDBinaerdatei();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Prog_Datei_Einzel_AttributeGroup#getIDBinaerdatei <em>ID Binaerdatei</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Binaerdatei</em>' containment reference.
	 * @see #getIDBinaerdatei()
	 * @generated
	 */
	void setIDBinaerdatei(ID_Binaerdatei_ohne_Proxy_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Konfigurationskennung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Herstellerspezifische Konfigurationskennung der Ladedatei, die sich auf die standardisierte Planung/Projektierung bei ESG bezieht.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Konfigurationskennung</em>' containment reference.
	 * @see #setKonfigurationskennung(Konfigurationskennung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getProg_Datei_Einzel_AttributeGroup_Konfigurationskennung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Konfigurationskennung'"
	 * @generated
	 */
	Konfigurationskennung_TypeClass getKonfigurationskennung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Prog_Datei_Einzel_AttributeGroup#getKonfigurationskennung <em>Konfigurationskennung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Konfigurationskennung</em>' containment reference.
	 * @see #getKonfigurationskennung()
	 * @generated
	 */
	void setKonfigurationskennung(Konfigurationskennung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Verwendung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Herstellerspezifische Kodierung zur Beschreibung des Verwendungszwecks der Ladedatei (z. B. Kanalzuordnung) bzw. Hilfsdatei (z. B. Kanalzuordnung, Prüfdaten, Ortskodierung). Die Kodierung kann zur Steuerung der Programmier-Software verwendet werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verwendung</em>' containment reference.
	 * @see #setVerwendung(Verwendung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getProg_Datei_Einzel_AttributeGroup_Verwendung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Verwendung'"
	 * @generated
	 */
	Verwendung_TypeClass getVerwendung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Prog_Datei_Einzel_AttributeGroup#getVerwendung <em>Verwendung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verwendung</em>' containment reference.
	 * @see #getVerwendung()
	 * @generated
	 */
	void setVerwendung(Verwendung_TypeClass value);

} // Prog_Datei_Einzel_AttributeGroup
