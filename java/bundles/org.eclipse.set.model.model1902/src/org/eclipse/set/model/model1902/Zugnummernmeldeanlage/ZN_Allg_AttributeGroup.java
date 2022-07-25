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
 * A representation of the model object '<em><b>ZN Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Allg_AttributeGroup#getEinwahlstelle <em>Einwahlstelle</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Allg_AttributeGroup#getReaktivierungsfunktion <em>Reaktivierungsfunktion</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Allg_AttributeGroup#getZNAnlagentyp <em>ZN Anlagentyp</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Allg_AttributeGroup()
 * @model extendedMetaData="name='CZN_Allg' kind='elementOnly'"
 * @generated
 */
public interface ZN_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Einwahlstelle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anlage zur Einwahl von Zugnummern. Eine ZN-Einwahlstelle wird im Allgemeinen an benachbarten Stellwerken zu neu errichteten ESTW vorgesehen, sofern diese noch nicht mit einer ZN-Anlage ausgerüstet sind. Hinsichtlich der eigentlichen Planungsdaten einer Einwahlstelle gibt es keine Unterschiede zur Planung einer \"normalen\" ZN-Anlage. Bei der Planung der Einwahlstelle werden die Anhänge für die Einräumung von Rechner- und Bedienraum beigefügt. In der Regel hat die Einwahlstelle keine Anschaltung an die Stellwerkstechnik. Eine Einwahlstelle der Bauform ZNP801 unterscheidet dieses Merkmal hinsichtlich der Anbindung nicht. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es bedarf der umfangreichen Abstimmungen zwischen LST-Fachplaner und Betreiber.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Einwahlstelle</em>' containment reference.
	 * @see #setEinwahlstelle(Einwahlstelle_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Allg_AttributeGroup_Einwahlstelle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Einwahlstelle'"
	 * @generated
	 */
	Einwahlstelle_TypeClass getEinwahlstelle();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Allg_AttributeGroup#getEinwahlstelle <em>Einwahlstelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Einwahlstelle</em>' containment reference.
	 * @see #getEinwahlstelle()
	 * @generated
	 */
	void setEinwahlstelle(Einwahlstelle_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Reaktivierungsfunktion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Im Fall der Störung eines ZLV-Busses sendet die ZN-Anlage ein Reaktivierungstelegramm. In Abhängigkeit zum Hersteller muss die Reaktivierungsfunktion geplant werden. DB-Regelwerk 819.0731 5 (19) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reaktivierungsfunktion</em>' containment reference.
	 * @see #setReaktivierungsfunktion(Reaktivierungsfunktion_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Allg_AttributeGroup_Reaktivierungsfunktion()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Reaktivierungsfunktion'"
	 * @generated
	 */
	Reaktivierungsfunktion_TypeClass getReaktivierungsfunktion();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Allg_AttributeGroup#getReaktivierungsfunktion <em>Reaktivierungsfunktion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reaktivierungsfunktion</em>' containment reference.
	 * @see #getReaktivierungsfunktion()
	 * @generated
	 */
	void setReaktivierungsfunktion(Reaktivierungsfunktion_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ZN Anlagentyp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Herstellerspezifischer Typ der ZN-Anlage. Aufgrund firmenspezifischer Projektierungsunterschiede muss der Hersteller vor Beginn der Planung bekannt sein. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen. DB-Regelwerk Aufgrund firmenspezifischer Projektierungsunterschiede muss der Hersteller vor Beginn der Planung bekannt sein. Siehe dazu Ril 819.0731 A0x. Die Anlagentypen ZNL_800, ZNS_800 und ZNS_801 sind für Neuanlagen nicht mehr zu verwenden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZN Anlagentyp</em>' containment reference.
	 * @see #setZNAnlagentyp(ZN_Anlagentyp_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Allg_AttributeGroup_ZNAnlagentyp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZN_Anlagentyp'"
	 * @generated
	 */
	ZN_Anlagentyp_TypeClass getZNAnlagentyp();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZN_Allg_AttributeGroup#getZNAnlagentyp <em>ZN Anlagentyp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZN Anlagentyp</em>' containment reference.
	 * @see #getZNAnlagentyp()
	 * @generated
	 */
	void setZNAnlagentyp(ZN_Anlagentyp_TypeClass value);

} // ZN_Allg_AttributeGroup
