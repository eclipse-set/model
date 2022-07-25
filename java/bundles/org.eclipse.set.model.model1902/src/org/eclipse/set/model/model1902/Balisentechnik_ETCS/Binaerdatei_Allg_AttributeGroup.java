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
 * A representation of the model object '<em><b>Binaerdatei Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Binaerdatei_Allg_AttributeGroup#getDateiname <em>Dateiname</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Binaerdatei_Allg_AttributeGroup#getDateitypBinaerdatei <em>Dateityp Binaerdatei</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Binaerdatei_Allg_AttributeGroup#getDaten <em>Daten</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBinaerdatei_Allg_AttributeGroup()
 * @model extendedMetaData="name='CBinaerdatei_Allg' kind='elementOnly'"
 * @generated
 */
public interface Binaerdatei_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Dateiname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ursprünglicher Dateiname der Binaerdatei ohne Endung. Bei Verwendung für ein Lufttelegramm wird kein Dateiname vergeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dateiname</em>' containment reference.
	 * @see #setDateiname(Dateiname_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBinaerdatei_Allg_AttributeGroup_Dateiname()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Dateiname'"
	 * @generated
	 */
	Dateiname_TypeClass getDateiname();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Binaerdatei_Allg_AttributeGroup#getDateiname <em>Dateiname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dateiname</em>' containment reference.
	 * @see #getDateiname()
	 * @generated
	 */
	void setDateiname(Dateiname_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Dateityp Binaerdatei</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Typ der Binaerdatei (z. B. txt, tlg).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dateityp Binaerdatei</em>' containment reference.
	 * @see #setDateitypBinaerdatei(Dateityp_Binaerdatei_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBinaerdatei_Allg_AttributeGroup_DateitypBinaerdatei()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Dateityp_Binaerdatei'"
	 * @generated
	 */
	Dateityp_Binaerdatei_TypeClass getDateitypBinaerdatei();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Binaerdatei_Allg_AttributeGroup#getDateitypBinaerdatei <em>Dateityp Binaerdatei</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dateityp Binaerdatei</em>' containment reference.
	 * @see #getDateitypBinaerdatei()
	 * @generated
	 */
	void setDateitypBinaerdatei(Dateityp_Binaerdatei_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Daten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Im base64-Format codierter Inhalt der Binaerdatei.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Daten</em>' containment reference.
	 * @see #setDaten(Daten_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBinaerdatei_Allg_AttributeGroup_Daten()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Daten'"
	 * @generated
	 */
	Daten_TypeClass getDaten();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.Binaerdatei_Allg_AttributeGroup#getDaten <em>Daten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Daten</em>' containment reference.
	 * @see #getDaten()
	 * @generated
	 */
	void setDaten(Daten_TypeClass value);

} // Binaerdatei_Allg_AttributeGroup
