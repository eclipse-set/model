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
 * A representation of the model object '<em><b>Bedien Platz Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Platz_Allg_AttributeGroup#getBedienPlatzArt <em>Bedien Platz Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Platz_Allg_AttributeGroup#getBedienplatzbezeichnung <em>Bedienplatzbezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Platz_Allg_AttributeGroup#getBedienplatznummer <em>Bedienplatznummer</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Platz_Allg_AttributeGroup#getBedienraumnummer <em>Bedienraumnummer</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Bedienung.BedienungPackage#getBedien_Platz_Allg_AttributeGroup()
 * @model extendedMetaData="name='CBedien_Platz_Allg' kind='elementOnly'"
 * @generated
 */
public interface Bedien_Platz_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bedien Platz Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ausprägung des Bedienplatzes. Da es verschiedne Kombinationen und mehere Instanzen von Bedien_Platz geben kann, sind nachfolgend beispielhafte Varianten aufgeführt: ESTW Zentraleinheit mit Anbindung an einen Bedien Bezirk, örtlichem Notbedienplatz im Modulgebäude und Standardbedienplätzen in der Bedien Zentrale (z.B. ESTW Orxhausen/Siemens); ESTW_Zentraleinheit mit abgesetzten Standardbedienplätzen und örtlichem Notbedienplatz im Modulgebäude (z.B. ESTW Kreiensen/Bombardier); ESTW_Zentraleinheit mit Anbindung an einen Bedien_Bezirk mit abgesetztem Notbedienplatz im Altstellwerk und Standardbedienplätzen in der Bedien_Zentrale (z.B. ESTW Oldenburg Nord/Siemens). Aus diesem Zusammenhang entstehen vier Arten von Bedienplätzen. Standard-Bedienplatz-System (Standard_BPS); Standard-Bedienplatz-System abgesetzt (Standard_BPS_abgesetzt); Not-Bedienplatz-System (Not_BPS); Not-Bedienplatz-System abgesetzt (Not_BPS_Abgesetzt). 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bedien Platz Art</em>' containment reference.
	 * @see #setBedienPlatzArt(Bedien_Platz_Art_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bedienung.BedienungPackage#getBedien_Platz_Allg_AttributeGroup_BedienPlatzArt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bedien_Platz_Art'"
	 * @generated
	 */
	Bedien_Platz_Art_TypeClass getBedienPlatzArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Platz_Allg_AttributeGroup#getBedienPlatzArt <em>Bedien Platz Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bedien Platz Art</em>' containment reference.
	 * @see #getBedienPlatzArt()
	 * @generated
	 */
	void setBedienPlatzArt(Bedien_Platz_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Bedienplatzbezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bezeichnung des Bedienplatzes. Regional abhängig sind Folgen von alphanumerischen- und Sonderzeichen gebräuchlich. Gemeint ist die ortsübliche Bezeichnung eines Arbeittsplatzes z.B. in einer Bedieninsel. Siehe Beispiel der BZ Hannover: Plan der Bedienebene: Media:Plan Bedieneben BZH.pdf, Raster X22. Dort befindet sich der Bedienplatz „82“ mit der Bezeichnung „özF Celle Süd“. Daraus ergibt sich: Bedienplatzbezeichnung: özF Celle Süd Bedienplatznummer: 82 Mögliche weitere Bezeichnungen wären z.B. Bedienplatzbezeichnung özF Celle (Süd) Bedienplatznummer: HC_2 oder HC_S Nicht gemeint ist diese technische Bezeichnung des Systemherstellers, z.B. die fortlaufende Nummer eines Standardbedienplatzes in einem Steuerbezirk, die nicht aus dem PT1 kommt sondern im PT2 von der SBI geliefert wird. Siehe Media:Bedienplatzbezeichnung Nummer.pdf. Hier wird der im Siemens-Bedien_Bezirk angeschaltete Bedienplatz wie folgt erfasst: Bedienplatzbezeichnung: BPS0112 (nämlich der erste Bedienplatz im Bedienbezirk 12) Bedienplatznummer: 1 (nämlich in der Schrankbezeichnung erfasst!) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bedienplatzbezeichnung</em>' containment reference.
	 * @see #setBedienplatzbezeichnung(Bedienplatzbezeichnung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bedienung.BedienungPackage#getBedien_Platz_Allg_AttributeGroup_Bedienplatzbezeichnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bedienplatzbezeichnung'"
	 * @generated
	 */
	Bedienplatzbezeichnung_TypeClass getBedienplatzbezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Platz_Allg_AttributeGroup#getBedienplatzbezeichnung <em>Bedienplatzbezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bedienplatzbezeichnung</em>' containment reference.
	 * @see #getBedienplatzbezeichnung()
	 * @generated
	 */
	void setBedienplatzbezeichnung(Bedienplatzbezeichnung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Bedienplatznummer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nummer oder Kurzbezeichnung des Bedienplatzes. Regional abhängig sind Folgen von alphanumerischen- und Sonderzeichen gebräuchlich. Gemeint ist die Nummer oder Kurzbezeichnung eines Arbeittsplatzes z.B. in einer Bedieninsel. Siehe Beispiel der BZ Hannover: Plan der Bedienebene: Media:Plan Bedieneben BZH.pdf, Raster X22. Dort befindet sich der Bedienplatz „82“mit der Bezeichnung „özF Celle Süd“. Daraus ergibt sich: Bedienplatzbezeichnung: özF Celle Süd Bedienplatznummer: 82 Mögliche weitere Bezeichnungen wären z.B. Bedienplatzbezeichnung özF Celle (Süd) Bedienplatznummer: HC_2 oder HC_S Nicht gemeint ist diese technische Bezeichnung des Systemherstellers, z.B. die fortlaufende Nummer eines Standardbedienplatzes in einem Steuerbezirk, die nicht aus dem PT1 kommt sondern im PT2 von der SBI geliefert wird. Siehe Media:Bedienplatzbezeichnung Nummer.pdf. Hier wird der im Siemens-Bedien_Bezirk angeschaltete Bedienplatz wie folgt erfasst: Bedienplatzbezeichnung: BPS0112 (nämlich der erste Bedienplatz im Bedienbezirk 12) Bedienplatznummer: 1 (nämlich in der Schrankbezeichnung erfasst!) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bedienplatznummer</em>' containment reference.
	 * @see #setBedienplatznummer(Bedienplatznummer_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bedienung.BedienungPackage#getBedien_Platz_Allg_AttributeGroup_Bedienplatznummer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bedienplatznummer'"
	 * @generated
	 */
	Bedienplatznummer_TypeClass getBedienplatznummer();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Platz_Allg_AttributeGroup#getBedienplatznummer <em>Bedienplatznummer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bedienplatznummer</em>' containment reference.
	 * @see #getBedienplatznummer()
	 * @generated
	 */
	void setBedienplatznummer(Bedienplatznummer_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Bedienraumnummer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nummer oder Bezeichnung des Raumes, in dem der Bedienplatz untergebracht ist. Regional abhängig sind Folgen von alphanumerischen- und Sonderzeichen gebräuchlich.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bedienraumnummer</em>' containment reference.
	 * @see #setBedienraumnummer(Bedienraumnummer_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bedienung.BedienungPackage#getBedien_Platz_Allg_AttributeGroup_Bedienraumnummer()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bedienraumnummer'"
	 * @generated
	 */
	Bedienraumnummer_TypeClass getBedienraumnummer();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Platz_Allg_AttributeGroup#getBedienraumnummer <em>Bedienraumnummer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bedienraumnummer</em>' containment reference.
	 * @see #getBedienraumnummer()
	 * @generated
	 */
	void setBedienraumnummer(Bedienraumnummer_TypeClass value);

} // Bedien_Platz_Allg_AttributeGroup
