/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Signale;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Real Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal_Real_AttributeGroup#getGeltungsbereich <em>Geltungsbereich</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal_Real_AttributeGroup#getSignalBefestigungsart <em>Signal Befestigungsart</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal_Real_AttributeGroup#getSignalRealAktiv <em>Signal Real Aktiv</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Signale.Signal_Real_AttributeGroup#getSignalRealAktivSchirm <em>Signal Real Aktiv Schirm</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Real_AttributeGroup()
 * @model extendedMetaData="name='CSignal_Real' kind='elementOnly'"
 * @generated
 */
public interface Signal_Real_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Geltungsbereich</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Geltungsbereich, dem das Signal zugeordnet wird (DS/DV). Die Angabe wird zunächst nur zur Unterscheidung Sh 1/Ra 12 vorgesehen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geltungsbereich</em>' containment reference.
	 * @see #setGeltungsbereich(Geltungsbereich_TypeClass)
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Real_AttributeGroup_Geltungsbereich()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Geltungsbereich'"
	 * @generated
	 */
	Geltungsbereich_TypeClass getGeltungsbereich();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Signale.Signal_Real_AttributeGroup#getGeltungsbereich <em>Geltungsbereich</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geltungsbereich</em>' containment reference.
	 * @see #getGeltungsbereich()
	 * @generated
	 */
	void setGeltungsbereich(Geltungsbereich_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Signal Befestigungsart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Grundsätzliche Art der Befestigung eines Signals. Einzelne Elemente des Signals (z. B. ein zum Hauptsignal gehörendes, nicht am Hauptsignalmast angebrachtes Zusatzsignal) können von der grundsätzlichen Befestigungsart abweichen, die exakte Konstruktion des Gesamtsignals ist im Modell in den Instanzen des Objekts Signal Befestigung dargestellt. DB-Regelwerk Signaltabelle 1, Zeile 12 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Signal Befestigungsart</em>' containment reference.
	 * @see #setSignalBefestigungsart(Signal_Befestigungsart_TypeClass)
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Real_AttributeGroup_SignalBefestigungsart()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Signal_Befestigungsart'"
	 * @generated
	 */
	Signal_Befestigungsart_TypeClass getSignalBefestigungsart();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Signale.Signal_Real_AttributeGroup#getSignalBefestigungsart <em>Signal Befestigungsart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Befestigungsart</em>' containment reference.
	 * @see #getSignalBefestigungsart()
	 * @generated
	 */
	void setSignalBefestigungsart(Signal_Befestigungsart_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Signal Real Aktiv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Real Aktiv</em>' containment reference.
	 * @see #setSignalRealAktiv(Signal_Real_Aktiv_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Real_AttributeGroup_SignalRealAktiv()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Signal_Real_Aktiv'"
	 * @generated
	 */
	Signal_Real_Aktiv_AttributeGroup getSignalRealAktiv();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Signale.Signal_Real_AttributeGroup#getSignalRealAktiv <em>Signal Real Aktiv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Real Aktiv</em>' containment reference.
	 * @see #getSignalRealAktiv()
	 * @generated
	 */
	void setSignalRealAktiv(Signal_Real_Aktiv_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Signal Real Aktiv Schirm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Signal Real Aktiv Schirm</em>' containment reference.
	 * @see #setSignalRealAktivSchirm(Signal_Real_Aktiv_Schirm_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Signale.SignalePackage#getSignal_Real_AttributeGroup_SignalRealAktivSchirm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Signal_Real_Aktiv_Schirm'"
	 * @generated
	 */
	Signal_Real_Aktiv_Schirm_AttributeGroup getSignalRealAktivSchirm();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Signale.Signal_Real_AttributeGroup#getSignalRealAktivSchirm <em>Signal Real Aktiv Schirm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Signal Real Aktiv Schirm</em>' containment reference.
	 * @see #getSignalRealAktivSchirm()
	 * @generated
	 */
	void setSignalRealAktivSchirm(Signal_Real_Aktiv_Schirm_AttributeGroup value);

} // Signal_Real_AttributeGroup
