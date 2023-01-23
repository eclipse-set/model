/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Basisobjekte;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.model11001.BasisTypen.ID_Bearbeitungsvermerk_TypeClass;

import org.eclipse.set.model.model11001.Verweise.ID_Oertlichkeit_Ausgabe_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basis Objekt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Allen Modell-Objekten zugrundeliegendes Objekt, welches gemeinsame Eigenschaften definiert. In den Basisobjekten werden grundsätzliche Eigenschaften definiert, die allen Objekten gemein sind. Alle im Datenmodell definierten LST-Objekte erben diese Eigenschaften unmittelbar, wie z.B. die Regelzeichnung, oder mittelbar, z.B. über das Punkt Objekt.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt#getBasisObjektAllg <em>Basis Objekt Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt#getIDBearbeitungsvermerk <em>ID Bearbeitungsvermerk</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt#getIDOertlichkeitAusgabe <em>ID Oertlichkeit Ausgabe</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt#getObjektreferenzen <em>Objektreferenzen</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Basisobjekte.BasisobjektePackage#getBasis_Objekt()
 * @model abstract="true"
 *        extendedMetaData="name='CBasis_Objekt' kind='elementOnly'"
 * @generated
 */
public interface Basis_Objekt extends Ur_Objekt {
	/**
	 * Returns the value of the '<em><b>Basis Objekt Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis Objekt Allg</em>' containment reference.
	 * @see #setBasisObjektAllg(Basis_Objekt_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Basisobjekte.BasisobjektePackage#getBasis_Objekt_BasisObjektAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Basis_Objekt_Allg'"
	 * @generated
	 */
	Basis_Objekt_Allg_AttributeGroup getBasisObjektAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt#getBasisObjektAllg <em>Basis Objekt Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basis Objekt Allg</em>' containment reference.
	 * @see #getBasisObjektAllg()
	 * @generated
	 */
	void setBasisObjektAllg(Basis_Objekt_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.BasisTypen.ID_Bearbeitungsvermerk_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweist auf einen oder mehrere Bearbeitungsvermerke. Ein Anhang wird über einen Bearbeitungsvermerk zugeordnet. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Bearbeitungsvermerk</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.Basisobjekte.BasisobjektePackage#getBasis_Objekt_IDBearbeitungsvermerk()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Bearbeitungsvermerk'"
	 * @generated
	 */
	EList<ID_Bearbeitungsvermerk_TypeClass> getIDBearbeitungsvermerk();

	/**
	 * Returns the value of the '<em><b>ID Oertlichkeit Ausgabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Oertlichkeit (Betriebsstelle), der das Element zugeordnet wird. Die Angabe ist beispielsweise relevant für die Erzeugung der Ausgabeformate (Lagepläne, Tabellen).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Oertlichkeit Ausgabe</em>' containment reference.
	 * @see #setIDOertlichkeitAusgabe(ID_Oertlichkeit_Ausgabe_TypeClass)
	 * @see org.eclipse.set.model.model11001.Basisobjekte.BasisobjektePackage#getBasis_Objekt_IDOertlichkeitAusgabe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Oertlichkeit_Ausgabe'"
	 * @generated
	 */
	ID_Oertlichkeit_Ausgabe_TypeClass getIDOertlichkeitAusgabe();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt#getIDOertlichkeitAusgabe <em>ID Oertlichkeit Ausgabe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Oertlichkeit Ausgabe</em>' containment reference.
	 * @see #getIDOertlichkeitAusgabe()
	 * @generated
	 */
	void setIDOertlichkeitAusgabe(ID_Oertlichkeit_Ausgabe_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Objektreferenzen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objektreferenzen</em>' containment reference.
	 * @see #setObjektreferenzen(Objektreferenzen_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Basisobjekte.BasisobjektePackage#getBasis_Objekt_Objektreferenzen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Objektreferenzen'"
	 * @generated
	 */
	Objektreferenzen_AttributeGroup getObjektreferenzen();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt#getObjektreferenzen <em>Objektreferenzen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objektreferenzen</em>' containment reference.
	 * @see #getObjektreferenzen()
	 * @generated
	 */
	void setObjektreferenzen(Objektreferenzen_AttributeGroup value);

} // Basis_Objekt
