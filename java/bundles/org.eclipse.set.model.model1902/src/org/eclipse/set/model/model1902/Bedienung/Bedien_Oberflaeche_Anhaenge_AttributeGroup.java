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

import org.eclipse.set.model.model1902.Verweise.ID_Anhang_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedien Oberflaeche Anhaenge Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Oberflaeche_Anhaenge_AttributeGroup#getIDAnhangMonitoraufteilung <em>ID Anhang Monitoraufteilung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Oberflaeche_Anhaenge_AttributeGroup#getIDAnhangRichtungssinn <em>ID Anhang Richtungssinn</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Oberflaeche_Anhaenge_AttributeGroup#getIDAnhangVorgabeBELU <em>ID Anhang Vorgabe BELU</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Bedienung.BedienungPackage#getBedien_Oberflaeche_Anhaenge_AttributeGroup()
 * @model extendedMetaData="name='CBedien_Oberflaeche_Anhaenge' kind='elementOnly'"
 * @generated
 */
public interface Bedien_Oberflaeche_Anhaenge_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Anhang Monitoraufteilung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anhang mit der vom Nutzer gewünschten groben Aufteilung der Infrastruktur (z. B. Stellelemente) auf die jeweils anzuzeigenden Bildinhalte der Bedienoberfläche des IB I als Realisierungsvorgabe im Rahmen der AP PT 1 BZ, sofern keine Funktionale und Betriebliche Prüfung (BEST) stattfindet. Eine Monitoraufteilung im Sinne einer Benutzung der Monitore für bestimmte Segmente des Standardbedienplatzes (IB I, IB II, IB III, TK), also die Anordnung der Monitore selbst am Bedienplatz, ist hier nicht gemeint. Diese wird im Attribut ID Anhang Moebelaufstellplan Aufriss verwaltet. Beispiel: Media:Monitoraufteilung.pdf. Wird eine Funktionale und Betriebliche Prüfung durchgeführt (BEST), werden die Vorgaben über ID Anhang Vorgabe BELU übergeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang Monitoraufteilung</em>' containment reference.
	 * @see #setIDAnhangMonitoraufteilung(ID_Anhang_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bedienung.BedienungPackage#getBedien_Oberflaeche_Anhaenge_AttributeGroup_IDAnhangMonitoraufteilung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_Monitoraufteilung'"
	 * @generated
	 */
	ID_Anhang_TypeClass getIDAnhangMonitoraufteilung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Oberflaeche_Anhaenge_AttributeGroup#getIDAnhangMonitoraufteilung <em>ID Anhang Monitoraufteilung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang Monitoraufteilung</em>' containment reference.
	 * @see #getIDAnhangMonitoraufteilung()
	 * @generated
	 */
	void setIDAnhangMonitoraufteilung(ID_Anhang_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Anhang Richtungssinn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anhang zur Erläuterung des Richtungssinns. Der Richtungssinn ist eine Realisierungsvorgabe der AP PT 1 BZ und wird vom Nutzer vorgegeben. Er muss unter Beachtung der Richtlinie 819.0603 innerhalb des Steuerbezirkes und an den Grenzen einschließlich aller dargestellten abzweigenden Strecken eindeutig sein. Die Vorgaben für den Richtungssinn beziehen sich zumindest immer auf einen kompletten Steuerbezirk. Eine Angabe für den gesamten Bereich einer Betriebszentrale ist ebenfalls möglich (BZ Hannover). Somit können einzelne ESTW-Zentraleinheiten bei Bedarf ohne Änderung des Richtungssinnes in einen anderen Bedienbezirk (Steuerbezirk) umgesetzt werden. Die Vorgabe für den Richtungssinn ist jedoch als Eigenschaft der Bedienoberfläche modelliert. Gegebenenfalls müssen hier Zulässigkeitsprüfungen ablaufen. Beispiele: UZ Elsterwerda und UZ Dresden-Neustadt Media:Richtungssinn.pdf, BZ Hannover Media:Richtungssinn BZ Hannover.pdf. DB Regelwerk Richtlinie 819.0603 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang Richtungssinn</em>' containment reference.
	 * @see #setIDAnhangRichtungssinn(ID_Anhang_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bedienung.BedienungPackage#getBedien_Oberflaeche_Anhaenge_AttributeGroup_IDAnhangRichtungssinn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_Richtungssinn'"
	 * @generated
	 */
	ID_Anhang_TypeClass getIDAnhangRichtungssinn();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Oberflaeche_Anhaenge_AttributeGroup#getIDAnhangRichtungssinn <em>ID Anhang Richtungssinn</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang Richtungssinn</em>' containment reference.
	 * @see #getIDAnhangRichtungssinn()
	 * @generated
	 */
	void setIDAnhangRichtungssinn(ID_Anhang_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Anhang Vorgabe BELU</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * In diesem Anhang werden die Realisierungsvorgaben für die Bedienoberflächen in Form von Bildern der jeweiligen Bereichsübersichten und Lupen im PDF-Format geliefert. Diese Realisierungsvorgaben werden in BEST erzeugt, wenn das ESTW einer Funktionalen und Betrieblichen Prüfung unterzogen wurde. Wenn keine Funktionale und Betriebliche Prüfung (BEST) erstellt wurde, werden diese Bilder auch vom Auftragnehmer auf Grundlage von ID Anhang Monitoraufteilung erstellt und dem Auftraggeber zur Prüfung übergeben. In der Regel werden diese Bilder dann vom zuständigen Leiter Fahrdienst geprüft und frei gegeben. Beispiel: Media:BELUVorgabe.pdf. DB-Regelwerk Wenn keine Funktionale und Betriebliche Prüfung stattfindet, werden die Realisierungsvorgaben im Rahmen des PT 1 BZ übergeben (Monitoraufteilung). 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang Vorgabe BELU</em>' containment reference.
	 * @see #setIDAnhangVorgabeBELU(ID_Anhang_TypeClass)
	 * @see org.eclipse.set.model.model1902.Bedienung.BedienungPackage#getBedien_Oberflaeche_Anhaenge_AttributeGroup_IDAnhangVorgabeBELU()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_Vorgabe_BELU'"
	 * @generated
	 */
	ID_Anhang_TypeClass getIDAnhangVorgabeBELU();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Bedienung.Bedien_Oberflaeche_Anhaenge_AttributeGroup#getIDAnhangVorgabeBELU <em>ID Anhang Vorgabe BELU</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang Vorgabe BELU</em>' containment reference.
	 * @see #getIDAnhangVorgabeBELU()
	 * @generated
	 */
	void setIDAnhangVorgabeBELU(ID_Anhang_TypeClass value);

} // Bedien_Oberflaeche_Anhaenge_AttributeGroup
