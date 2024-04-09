/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Block;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Strecke Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Block.Block_Strecke_Allg_AttributeGroup#getBetriebsfuehrung <em>Betriebsfuehrung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Block.Block_Strecke_Allg_AttributeGroup#getBremsweg <em>Bremsweg</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Block.Block_Strecke_Allg_AttributeGroup#getStreckeArt <em>Strecke Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Block.Block_Strecke_Allg_AttributeGroup#getStreckengeschwindigkeit <em>Streckengeschwindigkeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Block.Block_Strecke_Allg_AttributeGroup#getTraktionArtElektrisch <em>Traktion Art Elektrisch</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Block.Block_Strecke_Allg_AttributeGroup#getZugbeeinflussungArt <em>Zugbeeinflussung Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Block.Block_Strecke_Allg_AttributeGroup#getZusatzinformation <em>Zusatzinformation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Block.BlockPackage#getBlock_Strecke_Allg_AttributeGroup()
 * @model extendedMetaData="name='CBlock_Strecke_Allg' kind='elementOnly'"
 * @generated
 */
public interface Block_Strecke_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Betriebsfuehrung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Betriebsführung auf der zugehörigen Strecke. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Betriebsfuehrung</em>' containment reference.
	 * @see #setBetriebsfuehrung(Betriebsfuehrung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Block.BlockPackage#getBlock_Strecke_Allg_AttributeGroup_Betriebsfuehrung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Betriebsfuehrung'"
	 * @generated
	 */
	Betriebsfuehrung_TypeClass getBetriebsfuehrung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Block.Block_Strecke_Allg_AttributeGroup#getBetriebsfuehrung <em>Betriebsfuehrung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Betriebsfuehrung</em>' containment reference.
	 * @see #getBetriebsfuehrung()
	 * @generated
	 */
	void setBetriebsfuehrung(Betriebsfuehrung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Bremsweg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bremsweg als Grundlage für die Dimesionierung der zugehörigen Strecke. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen. Das Attribut wird zukünftig durch einen Verweis auf das Objekt Strecke_Bremsweg ersetzt. Zur Unterstützung der Migration wird das Attribut jedoch zunächst optional beibehalten.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bremsweg</em>' containment reference.
	 * @see #setBremsweg(Bremsweg_TypeClass)
	 * @see org.eclipse.set.model.planpro.Block.BlockPackage#getBlock_Strecke_Allg_AttributeGroup_Bremsweg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bremsweg'"
	 * @generated
	 */
	Bremsweg_TypeClass getBremsweg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Block.Block_Strecke_Allg_AttributeGroup#getBremsweg <em>Bremsweg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bremsweg</em>' containment reference.
	 * @see #getBremsweg()
	 * @generated
	 */
	void setBremsweg(Bremsweg_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Strecke Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rechtliche Klassifizierung der Strecke (Haupt-/Nebenbahn). DB-Regelwerk Angabe auf dem LP
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strecke Art</em>' containment reference.
	 * @see #setStreckeArt(Strecke_Art_TypeClass)
	 * @see org.eclipse.set.model.planpro.Block.BlockPackage#getBlock_Strecke_Allg_AttributeGroup_StreckeArt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Strecke_Art'"
	 * @generated
	 */
	Strecke_Art_TypeClass getStreckeArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Block.Block_Strecke_Allg_AttributeGroup#getStreckeArt <em>Strecke Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strecke Art</em>' containment reference.
	 * @see #getStreckeArt()
	 * @generated
	 */
	void setStreckeArt(Strecke_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Streckengeschwindigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VzG-Geschwindigkeit der zugehörigen Strecke.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Streckengeschwindigkeit</em>' containment reference.
	 * @see #setStreckengeschwindigkeit(Streckengeschwindigkeit_TypeClass)
	 * @see org.eclipse.set.model.planpro.Block.BlockPackage#getBlock_Strecke_Allg_AttributeGroup_Streckengeschwindigkeit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Streckengeschwindigkeit'"
	 * @generated
	 */
	Streckengeschwindigkeit_TypeClass getStreckengeschwindigkeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Block.Block_Strecke_Allg_AttributeGroup#getStreckengeschwindigkeit <em>Streckengeschwindigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Streckengeschwindigkeit</em>' containment reference.
	 * @see #getStreckengeschwindigkeit()
	 * @generated
	 */
	void setStreckengeschwindigkeit(Streckengeschwindigkeit_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Traktion Art Elektrisch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der Fahrstromversorgung (Stromart, Spannung, besondere Zuführung). Die Angabe entfällt bei nicht elektrifizierten Strecken. Auf die Angabe verschiedener nicht-elektrischer Traktionsarten (Diesel, Batterie, Wasserstoff etc.) wird verzichtet. DB-Regelwerk Angabe auf dem LP
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Traktion Art Elektrisch</em>' containment reference.
	 * @see #setTraktionArtElektrisch(Traktion_Art_Elektrisch_TypeClass)
	 * @see org.eclipse.set.model.planpro.Block.BlockPackage#getBlock_Strecke_Allg_AttributeGroup_TraktionArtElektrisch()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Traktion_Art_Elektrisch'"
	 * @generated
	 */
	Traktion_Art_Elektrisch_TypeClass getTraktionArtElektrisch();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Block.Block_Strecke_Allg_AttributeGroup#getTraktionArtElektrisch <em>Traktion Art Elektrisch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traktion Art Elektrisch</em>' containment reference.
	 * @see #getTraktionArtElektrisch()
	 * @generated
	 */
	void setTraktionArtElektrisch(Traktion_Art_Elektrisch_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Zugbeeinflussung Art</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.planpro.Block.Zugbeeinflussung_Art_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vorhandenes bzw. vorgesehenes Zugbeeinflussungssystem. Bei Mehrfachausrüstung ist das Attribut mehrfach einzubinden. DB-Regelwerk Angabe auf dem LP
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zugbeeinflussung Art</em>' containment reference list.
	 * @see org.eclipse.set.model.planpro.Block.BlockPackage#getBlock_Strecke_Allg_AttributeGroup_ZugbeeinflussungArt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Zugbeeinflussung_Art'"
	 * @generated
	 */
	EList<Zugbeeinflussung_Art_TypeClass> getZugbeeinflussungArt();

	/**
	 * Returns the value of the '<em><b>Zusatzinformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Erlaubt die Angabe zusätzlicher Informationen zur Ausgabe im LP. DB-Regelwerk Angabe auf dem LP
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zusatzinformation</em>' containment reference.
	 * @see #setZusatzinformation(Zusatzinformation_TypeClass)
	 * @see org.eclipse.set.model.planpro.Block.BlockPackage#getBlock_Strecke_Allg_AttributeGroup_Zusatzinformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Zusatzinformation'"
	 * @generated
	 */
	Zusatzinformation_TypeClass getZusatzinformation();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Block.Block_Strecke_Allg_AttributeGroup#getZusatzinformation <em>Zusatzinformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zusatzinformation</em>' containment reference.
	 * @see #getZusatzinformation()
	 * @generated
	 */
	void setZusatzinformation(Zusatzinformation_TypeClass value);

} // Block_Strecke_Allg_AttributeGroup
