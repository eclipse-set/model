/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Zugnummernmeldeanlage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZN Anzeigefeld Bezeichnung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Anzeigefeld_Bezeichnung_AttributeGroup#getZNABedienbezeichnerFrei <em>ZNA Bedienbezeichner Frei</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Anzeigefeld_Bezeichnung_AttributeGroup#getZNABezeichner <em>ZNA Bezeichner</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Anzeigefeld_Bezeichnung_AttributeGroup()
 * @model extendedMetaData="name='CZN_Anzeigefeld_Bezeichnung' kind='elementOnly'"
 * @generated
 */
public interface ZN_Anzeigefeld_Bezeichnung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ZNA Bedienbezeichner Frei</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe des ESTW-Bedienbezeichners als Texteingabe, Im Regelfall entspricht der Bedienbezeichner des ZN_Anzeigefeldes dem des zugehörigen Gleisfreimeldeabschnitts, in dem das ZN_Anzeigefeld angeordnet wird. Falls abweichend vom Regelfall nicht die Bezeichnung des Gleisfreimeldeabschnitts angewendet werden kann oder wird, ist eine Bezeichnung als Freitext festzulegen. DB-Regelwerk 819.0731
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZNA Bedienbezeichner Frei</em>' containment reference.
	 * @see #setZNABedienbezeichnerFrei(ZN_A_Bedienbezeichner_Frei_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Anzeigefeld_Bezeichnung_AttributeGroup_ZNABedienbezeichnerFrei()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZN_A_Bedienbezeichner_Frei'"
	 * @generated
	 */
	ZN_A_Bedienbezeichner_Frei_TypeClass getZNABedienbezeichnerFrei();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Anzeigefeld_Bezeichnung_AttributeGroup#getZNABedienbezeichnerFrei <em>ZNA Bedienbezeichner Frei</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZNA Bedienbezeichner Frei</em>' containment reference.
	 * @see #getZNABedienbezeichnerFrei()
	 * @generated
	 */
	void setZNABedienbezeichnerFrei(ZN_A_Bedienbezeichner_Frei_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ZNA Bezeichner</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der Anzeigefeldbezeichnung als numerischer Wert. Als Bezeichnung ist eine ZN-Gleisnummer festzulegen, die für den Bereich der ZN-Anlage eindeutig sein muss. Die Bezeichnung (ZN-Gleisnummer) sollte aus der Gleisbezeichnung des ESTW hergeleitet werden. Spiegelfelder werden wie das gespiegelte Anzeigefeld bezeichnet. Anbiete-/Annahme sowie Voranzeigefelder erhalten eine Bezeichnung, die eine Zuordnung zum ZN Anzeigefeld im zugehörigen Gleisabschnitt erkennen lässt. Das Attribut dient der eindeutigen Erkennung des ZN-Anzeigefeldes auf dem ZLV-Bus und wird daher auch „ZLV-Bus-Bezeichner“ genannt. DB-Regelwerk 819.0731 6 (14) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZNA Bezeichner</em>' containment reference.
	 * @see #setZNABezeichner(ZN_A_Bezeichner_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Anzeigefeld_Bezeichnung_AttributeGroup_ZNABezeichner()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZN_A_Bezeichner'"
	 * @generated
	 */
	ZN_A_Bezeichner_TypeClass getZNABezeichner();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Anzeigefeld_Bezeichnung_AttributeGroup#getZNABezeichner <em>ZNA Bezeichner</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZNA Bezeichner</em>' containment reference.
	 * @see #getZNABezeichner()
	 * @generated
	 */
	void setZNABezeichner(ZN_A_Bezeichner_TypeClass value);

} // ZN_Anzeigefeld_Bezeichnung_AttributeGroup
