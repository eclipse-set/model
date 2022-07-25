/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.BasisTypen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model1902.Verweise.ID_Bearbeitungsvermerk_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basis Attribut Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Das BasisAttribut stellt die Schablone für alle Attribute aller Objekte dar. 
 * 
 * Die Attributeigenschaften des BasisAttributs sind in 2 Gruppen unterteilbar. Zum einen die vom Modell gefüllten Attribute, die als eine xs:appinfo umgesetzt sind:
 * • Beispielbefuellung, 
 * • Patternbeschreibung, 
 * • Planungsphase. 
 * 
 * In ihnen werden Informationen zum Attribut fest gespeichert. Sie sind für alle Programme, die das Schema auslesen, verfügbar und werden zur Durchführung von Prüfungen verwendet oder um dem jeweiligen Bearbeitungsprogramm zusätzliche Informationen über das Attribut zur Verfügung zu stellen.
 * 
 * Die zweite Gruppe der Attributeigenschaften sind als XSDElement modellierten Informationen, die von den Nutzern der Schnittstelle erstellt werden. Es handelt sich neben dem eigentlichen Wert, welcher verpflichtend zu füllen ist, um einen oder mehrere optionale Verweise auf Bearbeitungsvermerke. In diesen können weitere Informationen zu der speziellen Ausprägung des Attributs hinterlegt werden.
 * • ID_Bearbeitungsvermerk, 
 * • Wert.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.BasisTypen.BasisAttribut_AttributeGroup#getIDBearbeitungsvermerk <em>ID Bearbeitungsvermerk</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.BasisTypen.BasisTypenPackage#getBasisAttribut_AttributeGroup()
 * @model abstract="true"
 *        extendedMetaData="name='CBasisAttribut' kind='elementOnly'"
 * @generated
 */
public interface BasisAttribut_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Bearbeitungsvermerk</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Verweise.ID_Bearbeitungsvermerk_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweist auf einen oder mehrere Bearbeitungsvermerke. Ein Anhang wird über einen Bearbeitungsvermerk zugeordnet. 
	 * 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Bearbeitungsvermerk</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.BasisTypen.BasisTypenPackage#getBasisAttribut_AttributeGroup_IDBearbeitungsvermerk()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Bearbeitungsvermerk'"
	 * @generated
	 */
	EList<ID_Bearbeitungsvermerk_TypeClass> getIDBearbeitungsvermerk();

} // BasisAttribut_AttributeGroup
