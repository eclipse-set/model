/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Balisentechnik_ETCS;

import org.eclipse.set.model.planpro.Basisobjekte.Bereich_Objekt;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZUB Streckeneigenschaft</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bereich mit einheitlicher Ausrüstung von Zugbeeinflussungssystem(en) oder Kennzeichnung eines besonderen Bereichs (z. B. großes Metallteil), der im Rahmen einer Balisen-Planung zu berücksichtigen ist.
 * Sofern in einem Bereich richtungsbezogen unterschiedliche Zugbeeinflussungssysteme genutzt werden (Grenzbereich), sind dafür richtungsbezogene Bereichsobjekte anzulegen.
 * Hinweis für Planungswerkzeuge: Die Definition des Bereichsobjekts ZUB_Streckeneigenschaft richtet sich nach dem Punktobjekt ZUB_Bereichsgrenze.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Streckeneigenschaft#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Streckeneigenschaft#getMetallteil <em>Metallteil</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Streckeneigenschaft#getOberstrombegrenzungGueterzug <em>Oberstrombegrenzung Gueterzug</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Streckeneigenschaft#getOberstrombegrenzungReisezug <em>Oberstrombegrenzung Reisezug</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Streckeneigenschaft#getVerbotAnhalten <em>Verbot Anhalten</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Streckeneigenschaft#getVerbotRegenerativeBremse <em>Verbot Regenerative Bremse</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Streckeneigenschaft#getVerbotWBArt <em>Verbot WB Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Streckeneigenschaft#getZUBSEAusruestung <em>ZUBSE Ausruestung</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Streckeneigenschaft()
 * @model extendedMetaData="name='CZUB_Streckeneigenschaft' kind='elementOnly'"
 * @generated
 */
public interface ZUB_Streckeneigenschaft extends Bereich_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(ZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Streckeneigenschaft_Bezeichnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	ZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Streckeneigenschaft#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(ZUB_Streckeneigenschaft_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Metallteil</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metallteil</em>' containment reference.
	 * @see #setMetallteil(Metallteil_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Streckeneigenschaft_Metallteil()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Metallteil'"
	 * @generated
	 */
	Metallteil_AttributeGroup getMetallteil();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Streckeneigenschaft#getMetallteil <em>Metallteil</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metallteil</em>' containment reference.
	 * @see #getMetallteil()
	 * @generated
	 */
	void setMetallteil(Metallteil_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Oberstrombegrenzung Gueterzug</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Oberstrombegrenzung für Güterzüge in A. Planungsunterstützung: Beim Anlegen des Bereichs soll ein gleichartiger Bereich für Reisezüge angeboten werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Oberstrombegrenzung Gueterzug</em>' containment reference.
	 * @see #setOberstrombegrenzungGueterzug(Oberstrombegrenzung_Gueterzug_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Streckeneigenschaft_OberstrombegrenzungGueterzug()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Oberstrombegrenzung_Gueterzug'"
	 * @generated
	 */
	Oberstrombegrenzung_Gueterzug_TypeClass getOberstrombegrenzungGueterzug();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Streckeneigenschaft#getOberstrombegrenzungGueterzug <em>Oberstrombegrenzung Gueterzug</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oberstrombegrenzung Gueterzug</em>' containment reference.
	 * @see #getOberstrombegrenzungGueterzug()
	 * @generated
	 */
	void setOberstrombegrenzungGueterzug(Oberstrombegrenzung_Gueterzug_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Oberstrombegrenzung Reisezug</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Oberstrombegrenzung für Reisezüge in A. Planungsunterstützung: Beim Anlegen des Bereichs soll ein gleichartiger Bereich für Güterzüge angeboten werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Oberstrombegrenzung Reisezug</em>' containment reference.
	 * @see #setOberstrombegrenzungReisezug(Oberstrombegrenzung_Reisezug_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Streckeneigenschaft_OberstrombegrenzungReisezug()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Oberstrombegrenzung_Reisezug'"
	 * @generated
	 */
	Oberstrombegrenzung_Reisezug_TypeClass getOberstrombegrenzungReisezug();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Streckeneigenschaft#getOberstrombegrenzungReisezug <em>Oberstrombegrenzung Reisezug</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oberstrombegrenzung Reisezug</em>' containment reference.
	 * @see #getOberstrombegrenzungReisezug()
	 * @generated
	 */
	void setOberstrombegrenzungReisezug(Oberstrombegrenzung_Reisezug_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Verbot Anhalten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anhalteverbot mit näherer örtlicher Beschreibung (z. B. Bezeichnung des Tunnels).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verbot Anhalten</em>' containment reference.
	 * @see #setVerbotAnhalten(Verbot_Anhalten_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Streckeneigenschaft_VerbotAnhalten()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Verbot_Anhalten'"
	 * @generated
	 */
	Verbot_Anhalten_TypeClass getVerbotAnhalten();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Streckeneigenschaft#getVerbotAnhalten <em>Verbot Anhalten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verbot Anhalten</em>' containment reference.
	 * @see #getVerbotAnhalten()
	 * @generated
	 */
	void setVerbotAnhalten(Verbot_Anhalten_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Verbot Regenerative Bremse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nutzungsverbot der regenerativen Bremse.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verbot Regenerative Bremse</em>' containment reference.
	 * @see #setVerbotRegenerativeBremse(Verbot_Regenerative_Bremse_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Streckeneigenschaft_VerbotRegenerativeBremse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Verbot_Regenerative_Bremse'"
	 * @generated
	 */
	Verbot_Regenerative_Bremse_TypeClass getVerbotRegenerativeBremse();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Streckeneigenschaft#getVerbotRegenerativeBremse <em>Verbot Regenerative Bremse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verbot Regenerative Bremse</em>' containment reference.
	 * @see #getVerbotRegenerativeBremse()
	 * @generated
	 */
	void setVerbotRegenerativeBremse(Verbot_Regenerative_Bremse_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Verbot WB Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nutzungsverbot der Wirbelstrombremse, abhängig von der Art der Bremsung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Verbot WB Art</em>' containment reference.
	 * @see #setVerbotWBArt(Verbot_WB_Art_TypeClass)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Streckeneigenschaft_VerbotWBArt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Verbot_WB_Art'"
	 * @generated
	 */
	Verbot_WB_Art_TypeClass getVerbotWBArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Streckeneigenschaft#getVerbotWBArt <em>Verbot WB Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verbot WB Art</em>' containment reference.
	 * @see #getVerbotWBArt()
	 * @generated
	 */
	void setVerbotWBArt(Verbot_WB_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ZUBSE Ausruestung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZUBSE Ausruestung</em>' containment reference.
	 * @see #setZUBSEAusruestung(ZUB_SE_Ausruestung_AttributeGroup)
	 * @see org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZUB_Streckeneigenschaft_ZUBSEAusruestung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZUB_SE_Ausruestung'"
	 * @generated
	 */
	ZUB_SE_Ausruestung_AttributeGroup getZUBSEAusruestung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Balisentechnik_ETCS.ZUB_Streckeneigenschaft#getZUBSEAusruestung <em>ZUBSE Ausruestung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZUBSE Ausruestung</em>' containment reference.
	 * @see #getZUBSEAusruestung()
	 * @generated
	 */
	void setZUBSEAusruestung(ZUB_SE_Ausruestung_AttributeGroup value);

} // ZUB_Streckeneigenschaft
