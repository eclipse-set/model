/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Zugnummernmeldeanlage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZN ZBS Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_ZBS_Allg_AttributeGroup#getIPAdresse <em>IP Adresse</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_ZBS_Allg_AttributeGroup#getZBSSchnittstelle <em>ZBS Schnittstelle</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_ZBS_Allg_AttributeGroup()
 * @model extendedMetaData="name='CZN_ZBS_Allg' kind='elementOnly'"
 * @generated
 */
public interface ZN_ZBS_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>IP Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * IP_Adresse des COM-Servers gemäß Ril 819.0705. Der Planungsfall tritt ein, wenn eine ZBS-Verbindung zwischen ZN Unterstation und BZ zu planen ist. DB-Regelwerk 819.0731A05 819.0705 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IP Adresse</em>' containment reference.
	 * @see #setIPAdresse(IP_Adresse_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_ZBS_Allg_AttributeGroup_IPAdresse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='IP_Adresse'"
	 * @generated
	 */
	IP_Adresse_TypeClass getIPAdresse();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_ZBS_Allg_AttributeGroup#getIPAdresse <em>IP Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IP Adresse</em>' containment reference.
	 * @see #getIPAdresse()
	 * @generated
	 */
	void setIPAdresse(IP_Adresse_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ZBS Schnittstelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Modem, welches die Verbindung zwischen ZN Unterstation und ZBS für die Datenkommunikation herstellt. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen. DB-Regelwerk 819.0731A04 2 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZBS Schnittstelle</em>' containment reference.
	 * @see #setZBSSchnittstelle(ZBS_Schnittstelle_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_ZBS_Allg_AttributeGroup_ZBSSchnittstelle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZBS_Schnittstelle'"
	 * @generated
	 */
	ZBS_Schnittstelle_TypeClass getZBSSchnittstelle();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_ZBS_Allg_AttributeGroup#getZBSSchnittstelle <em>ZBS Schnittstelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZBS Schnittstelle</em>' containment reference.
	 * @see #getZBSSchnittstelle()
	 * @generated
	 */
	void setZBSSchnittstelle(ZBS_Schnittstelle_TypeClass value);

} // ZN_ZBS_Allg_AttributeGroup
