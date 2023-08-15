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
 * A representation of the model object '<em><b>Binaerdaten Datei Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.Binaerdaten_Datei_AttributeGroup#getDateiname <em>Dateiname</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.Binaerdaten_Datei_AttributeGroup#getDateitypBinaerdatei <em>Dateityp Binaerdatei</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBinaerdaten_Datei_AttributeGroup()
 * @model extendedMetaData="name='CBinaerdaten_Datei' kind='elementOnly'"
 * @generated
 */
public interface Binaerdaten_Datei_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Dateiname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ursprünglicher Dateiname der Binaerdatei ohne Endung. Bei Verwendung für ein Lufttelegramm wird kein Dateiname vergeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dateiname</em>' containment reference.
	 * @see #setDateiname(Dateiname_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBinaerdaten_Datei_AttributeGroup_Dateiname()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Dateiname'"
	 * @generated
	 */
	Dateiname_TypeClass getDateiname();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.Binaerdaten_Datei_AttributeGroup#getDateiname <em>Dateiname</em>}' containment reference.
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
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getBinaerdaten_Datei_AttributeGroup_DateitypBinaerdatei()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Dateityp_Binaerdatei'"
	 * @generated
	 */
	Dateityp_Binaerdatei_TypeClass getDateitypBinaerdatei();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.Binaerdaten_Datei_AttributeGroup#getDateitypBinaerdatei <em>Dateityp Binaerdatei</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dateityp Binaerdatei</em>' containment reference.
	 * @see #getDateitypBinaerdatei()
	 * @generated
	 */
	void setDateitypBinaerdatei(Dateityp_Binaerdatei_TypeClass value);

} // Binaerdaten_Datei_AttributeGroup
