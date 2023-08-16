/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bahnuebergang;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BUE Schnittstelle Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Schnittstelle_Allg_AttributeGroup#getBUENachlaufzeit <em>BUE Nachlaufzeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Schnittstelle_Allg_AttributeGroup#getBUEVorlaufzeit <em>BUE Vorlaufzeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Schnittstelle_Allg_AttributeGroup#getHpErsatzstecker <em>Hp Ersatzstecker</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Schnittstelle_Allg_AttributeGroup#getLFUEImpuls <em>LFUE Impuls</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getBUE_Schnittstelle_Allg_AttributeGroup()
 * @model extendedMetaData="name='CBUE_Schnittstelle_Allg' kind='elementOnly'"
 * @generated
 */
public interface BUE_Schnittstelle_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>BUE Nachlaufzeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nachlaufzeit des BÜ. Eine Nachlaufzeit wird vorgesehen, um an mehrgleisigen BÜ nach der Ausschaltung des BÜ eine Mindestöffnungszeit für den kreuzenden Straßenverkehr einzuhalten, bevor der BÜ erneut wieder eingeschaltet wird. Die Nachlaufzeit wirkt unmittelbar bei manueller Einschaltung durch den Fahrdienstleiter oder fahrstraßenbewirkter Einschaltung. DB-Regelwerk Einschaltstreckenberechnung 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BUE Nachlaufzeit</em>' containment reference.
	 * @see #setBUENachlaufzeit(BUE_Nachlaufzeit_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getBUE_Schnittstelle_Allg_AttributeGroup_BUENachlaufzeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BUE_Nachlaufzeit'"
	 * @generated
	 */
	BUE_Nachlaufzeit_TypeClass getBUENachlaufzeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Schnittstelle_Allg_AttributeGroup#getBUENachlaufzeit <em>BUE Nachlaufzeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BUE Nachlaufzeit</em>' containment reference.
	 * @see #getBUENachlaufzeit()
	 * @generated
	 */
	void setBUENachlaufzeit(BUE_Nachlaufzeit_TypeClass value);

	/**
	 * Returns the value of the '<em><b>BUE Vorlaufzeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vorlaufzeit des BÜ. Eine Vorlaufzeit wird vorgesehen, um an mehrgleisigen BÜ nach der Ausschaltung des BÜ eine Mindestöffnungszeit für den kreuzenden Straßenverkehr einzuhalten, bevor der BÜ erneut wieder eingeschaltet wird. Sie wird bei zugbewirkter Einschaltung vorgesehen und durch die Vorverlegung des Einschaltkontaktes erzwungen. Die sich daraus ergebene Verzögerungszeit wird als \"Vorlaufzeit\" bezeichnet. Damit verbunden ist der Nachteil, dass der BÜ zu früh eingeschaltet wird, wenn keine Zugbegegnung stattfindet. DB-Regelwerk Einschaltstreckenberechnung 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BUE Vorlaufzeit</em>' containment reference.
	 * @see #setBUEVorlaufzeit(BUE_Vorlaufzeit_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getBUE_Schnittstelle_Allg_AttributeGroup_BUEVorlaufzeit()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='BUE_Vorlaufzeit'"
	 * @generated
	 */
	BUE_Vorlaufzeit_TypeClass getBUEVorlaufzeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Schnittstelle_Allg_AttributeGroup#getBUEVorlaufzeit <em>BUE Vorlaufzeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BUE Vorlaufzeit</em>' containment reference.
	 * @see #getBUEVorlaufzeit()
	 * @generated
	 */
	void setBUEVorlaufzeit(BUE_Vorlaufzeit_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Hp Ersatzstecker</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stecker, der die Betriebsart des zugehörigen Stellteils bestimmt. Bei vorbereiteten BÜ-Abhängigkeiten im Stellwerk, ohne dass die Außenanlage des BÜ vorhanden ist, kann mittels Ersatzstecker für das Stellwerk die Abhängigkeit zum BÜ aufgehoben werden. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Die Anwendung ist mit allen Beteiligten projektbezogen abzustimmen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Hp Ersatzstecker</em>' containment reference.
	 * @see #setHpErsatzstecker(Hp_Ersatzstecker_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getBUE_Schnittstelle_Allg_AttributeGroup_HpErsatzstecker()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Hp_Ersatzstecker'"
	 * @generated
	 */
	Hp_Ersatzstecker_TypeClass getHpErsatzstecker();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Schnittstelle_Allg_AttributeGroup#getHpErsatzstecker <em>Hp Ersatzstecker</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hp Ersatzstecker</em>' containment reference.
	 * @see #getHpErsatzstecker()
	 * @generated
	 */
	void setHpErsatzstecker(Hp_Ersatzstecker_TypeClass value);

	/**
	 * Returns the value of the '<em><b>LFUE Impuls</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art des Impulses bei vorhandener Ladefernüberwachung. In Abhängigkeit vom Hersteller der BÜSA und vom Stellwerkstyp kann eine Ladefernüberwachung der BÜ-Batterie über die Hp- oder Fü-Schnittstelle erfolgen. Das Attribut ist anzulegen, wenn die BÜSA die technische Möglichkeit bietet. DB-Regelwerk Das Regelwerk der DB AG enthält keine entsprechende Vorgabe. Ob eine Ladefernüberwachung möglich ist, geht aus den Projektierungsrichtlinien der BÜ-Hersteller hervor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LFUE Impuls</em>' containment reference.
	 * @see #setLFUEImpuls(LFUE_Impuls_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage#getBUE_Schnittstelle_Allg_AttributeGroup_LFUEImpuls()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LFUE_Impuls'"
	 * @generated
	 */
	LFUE_Impuls_TypeClass getLFUEImpuls();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bahnuebergang.BUE_Schnittstelle_Allg_AttributeGroup#getLFUEImpuls <em>LFUE Impuls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LFUE Impuls</em>' containment reference.
	 * @see #getLFUEImpuls()
	 * @generated
	 */
	void setLFUEImpuls(LFUE_Impuls_TypeClass value);

} // BUE_Schnittstelle_Allg_AttributeGroup
