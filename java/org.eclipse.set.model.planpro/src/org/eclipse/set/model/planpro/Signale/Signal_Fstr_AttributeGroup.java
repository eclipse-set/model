/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Signale;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.planpro.Verweise.ID_Block_Element_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Signal Fstr Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Fstr_AttributeGroup#getBesetzteAusfahrt <em>Besetzte Ausfahrt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Fstr_AttributeGroup#getDAManuell <em>DA Manuell</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Fstr_AttributeGroup#getDurchfahrt <em>Durchfahrt</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Fstr_AttributeGroup#getIDRaZielErlaubnisabhaengig <em>ID Ra Ziel Erlaubnisabhaengig</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Signale.Signal_Fstr_AttributeGroup#getRangierstrasseRestaufloesung <em>Rangierstrasse Restaufloesung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Fstr_AttributeGroup()
 * @model extendedMetaData="name='CSignal_Fstr' kind='elementOnly'"
 * @generated
 */
public interface Signal_Fstr_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Besetzte Ausfahrt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob für das Startsignal im Stumpfgleis eine Besetzte Ausfahrt geplant ist (true) oder nicht (false). Im Planungs- bzw. Projektierungsfall \"Besetzte Ausfahrt\" müssen die an das Stumpfgleis anschließenden Weichen oder Kreuzungen nicht freigemeldet sein, wenn sie durch die zuletzt in das Stumpfgleis eingestellte Fahrstraße kontinuierlich besetzt wurden und besetzt geblieben sind. DB Regelwerk Lastenheft ESTW F1, Abschnitt 4.3.3
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Besetzte Ausfahrt</em>' containment reference.
	 * @see #setBesetzteAusfahrt(Besetzte_Ausfahrt_TypeClass)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Fstr_AttributeGroup_BesetzteAusfahrt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Besetzte_Ausfahrt'"
	 * @generated
	 */
	Besetzte_Ausfahrt_TypeClass getBesetzteAusfahrt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Fstr_AttributeGroup#getBesetzteAusfahrt <em>Besetzte Ausfahrt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Besetzte Ausfahrt</em>' containment reference.
	 * @see #getBesetzteAusfahrt()
	 * @generated
	 */
	void setBesetzteAusfahrt(Besetzte_Ausfahrt_TypeClass value);

	/**
	 * Returns the value of the '<em><b>DA Manuell</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gibt an, ob eine manuelle Durchrutschwegauflösung möglich ist. Die manuelle Durchrutschwegauflösung ist als Möglichkeit zur Regelbedienung zu planen. Sie ist nicht mit der Hilfsauflösung zu verwechseln, die als Grundfunktion keiner Planung bedarf. Im herkömmlichen PT1 Inhalt der Durchrutschwegtabelle, gilt jedoch immer für alle Durchrutschwege eines Signals einheitlich. Wertzuordnung: true - manuelle Durchrutschwegauflösung ist möglich, false - manuelle Durchrutschwegauflösung ist nicht möglich. DB-Regelwerk Durchrutschwegtabelle, Spalte 15 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DA Manuell</em>' containment reference.
	 * @see #setDAManuell(DA_Manuell_TypeClass)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Fstr_AttributeGroup_DAManuell()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DA_Manuell'"
	 * @generated
	 */
	DA_Manuell_TypeClass getDAManuell();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Fstr_AttributeGroup#getDAManuell <em>DA Manuell</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DA Manuell</em>' containment reference.
	 * @see #getDAManuell()
	 * @generated
	 */
	void setDAManuell(DA_Manuell_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Durchfahrt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gibt an, ob und wie Weiterfahren ohne Halt über das Zielsignal eines Fahrweges hinaus gestattet sind. Ist die Durchfahrt mittels aneinandergereihter Zugstraßen verboten, mittels einzeln angewählter Zugstraßen auf dieses Signal und von diesem Signal aber zu gestatten, so ist der Wert \"erlaubt\" zu verwenden. In diesem Fall wird allerdings kein Objekt Fstr Aneinander über dieses Signal angelegt. Ist betrieblich die Weiterfahrt einer Zugfahrt als Rangierfahrt zu gestatten (diese Änderung der Ril 408 ist noch nicht Bestandteil des Lastenheftes ESTW), so ist der Wert \"nur_mit_Sh1\" zu verwenden. Technisch schließt eine Zugfahrt mit Durchrutschweg D0 an, das Signal zeigt Hp 0 und Sh 1. DB-Regelwerk Im bisherigen PT 1 ohne eindeutige Darstellung. Die Symbolik im Sicherungstechnischen Lageplan gemäße 819.9002 (11) ist für diesen Sachverhalt nicht ausreichend.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Durchfahrt</em>' containment reference.
	 * @see #setDurchfahrt(Durchfahrt_TypeClass)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Fstr_AttributeGroup_Durchfahrt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Durchfahrt'"
	 * @generated
	 */
	Durchfahrt_TypeClass getDurchfahrt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Fstr_AttributeGroup#getDurchfahrt <em>Durchfahrt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Durchfahrt</em>' containment reference.
	 * @see #getDurchfahrt()
	 * @generated
	 */
	void setDurchfahrt(Durchfahrt_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Ra Ziel Erlaubnisabhaengig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Eine Rangierstraße mit diesem Zielsignal ist nur einstellbar, wenn die Erlaubnis des Streckenblocks in Richtung Strecke zeigt. Abhängigkeit einer auf ein Signal zuführenden Rangierstraße von der Stellung der Erlaubnis einer Block Anlage. Das Attribut wird nur dann befüllt, wenn eine Abhängigkeit besteht. DB-Regelwerk Planungsdaten: Rangierstraßentabelle, Spalte 7
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Ra Ziel Erlaubnisabhaengig</em>' containment reference.
	 * @see #setIDRaZielErlaubnisabhaengig(ID_Block_Element_TypeClass)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Fstr_AttributeGroup_IDRaZielErlaubnisabhaengig()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_RaZiel_Erlaubnisabhaengig'"
	 * @generated
	 */
	ID_Block_Element_TypeClass getIDRaZielErlaubnisabhaengig();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Fstr_AttributeGroup#getIDRaZielErlaubnisabhaengig <em>ID Ra Ziel Erlaubnisabhaengig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Ra Ziel Erlaubnisabhaengig</em>' containment reference.
	 * @see #getIDRaZielErlaubnisabhaengig()
	 * @generated
	 */
	void setIDRaZielErlaubnisabhaengig(ID_Block_Element_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Rangierstrasse Restaufloesung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Auflösung einer nicht angefahrenen Rangierstraße bei einer wendenden Rangierfahrt über mehrere Rangierstraßen. Es handelt sich hierbei um den durch die Planung festzulegenden Fall 2 der Rangierstraßenrestauflösung (RRAU) des Lastenheftes für das Elektronische Stellwerk, Teilheft F1. Die Fälle 1 RRAU und 3 RRAU gemäß Lastenheft sind Grundfunktion eines ESTW und bedürfen keiner Planung. Der Eintrag im Attribut Rangierstrasse_Restauflösung hat auf diese beiden Fälle keine Auswirkung. Das Attribut wird in den Signalen gefüllt, an dem nicht angefahrene, aufzulösende Rangierstraßen beginnen. Wertzuordnung: true – Rangierstraßenrestauflösung erlaubt, false – Rangierstraßenrestauflösung verboten. DB-Regelwerk Planungsdaten: Rangierstraßentabelle, Spalte 12 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rangierstrasse Restaufloesung</em>' containment reference.
	 * @see #setRangierstrasseRestaufloesung(Rangierstrasse_Restaufloesung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Signale.SignalePackage#getSignal_Fstr_AttributeGroup_RangierstrasseRestaufloesung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Rangierstrasse_Restaufloesung'"
	 * @generated
	 */
	Rangierstrasse_Restaufloesung_TypeClass getRangierstrasseRestaufloesung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Signale.Signal_Fstr_AttributeGroup#getRangierstrasseRestaufloesung <em>Rangierstrasse Restaufloesung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rangierstrasse Restaufloesung</em>' containment reference.
	 * @see #getRangierstrasseRestaufloesung()
	 * @generated
	 */
	void setRangierstrasseRestaufloesung(Rangierstrasse_Restaufloesung_TypeClass value);

} // Signal_Fstr_AttributeGroup
