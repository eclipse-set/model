/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Block;

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
 *   <li>{@link org.eclipse.set.model.model1902.Block.Block_Strecke_Allg_AttributeGroup#getBetriebsfuehrung <em>Betriebsfuehrung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Block.Block_Strecke_Allg_AttributeGroup#getBremsweg <em>Bremsweg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Block.Block_Strecke_Allg_AttributeGroup#getEntwurfsgeschwindigkeit <em>Entwurfsgeschwindigkeit</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Block.Block_Strecke_Allg_AttributeGroup#getStreckeArt <em>Strecke Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Block.Block_Strecke_Allg_AttributeGroup#getTraktionArt <em>Traktion Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Block.Block_Strecke_Allg_AttributeGroup#getZugbeeinflussungArt <em>Zugbeeinflussung Art</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Block.Block_Strecke_Allg_AttributeGroup#getZusatzinformation <em>Zusatzinformation</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Block.BlockPackage#getBlock_Strecke_Allg_AttributeGroup()
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
	 * @see org.eclipse.set.model.model1902.Block.BlockPackage#getBlock_Strecke_Allg_AttributeGroup_Betriebsfuehrung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Betriebsfuehrung'"
	 * @generated
	 */
	Betriebsfuehrung_TypeClass getBetriebsfuehrung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Block.Block_Strecke_Allg_AttributeGroup#getBetriebsfuehrung <em>Betriebsfuehrung</em>}' containment reference.
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
	 * Bremsweg als Grundlage für die Dimesionierung der zugehörigen Strecke. Bei Auswahl von \"sonstige\" ist ein Bearbeitungsvermerk mit entsprechenden Erläuterungen anzufügen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bremsweg</em>' containment reference.
	 * @see #setBremsweg(Bremsweg_TypeClass)
	 * @see org.eclipse.set.model.model1902.Block.BlockPackage#getBlock_Strecke_Allg_AttributeGroup_Bremsweg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bremsweg'"
	 * @generated
	 */
	Bremsweg_TypeClass getBremsweg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Block.Block_Strecke_Allg_AttributeGroup#getBremsweg <em>Bremsweg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bremsweg</em>' containment reference.
	 * @see #getBremsweg()
	 * @generated
	 */
	void setBremsweg(Bremsweg_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Entwurfsgeschwindigkeit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Entwurfsgeschwindigkeit für die Dimensionierung der zugehörigen Strecke.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Entwurfsgeschwindigkeit</em>' containment reference.
	 * @see #setEntwurfsgeschwindigkeit(Entwurfsgeschwindigkeit_TypeClass)
	 * @see org.eclipse.set.model.model1902.Block.BlockPackage#getBlock_Strecke_Allg_AttributeGroup_Entwurfsgeschwindigkeit()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Entwurfsgeschwindigkeit'"
	 * @generated
	 */
	Entwurfsgeschwindigkeit_TypeClass getEntwurfsgeschwindigkeit();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Block.Block_Strecke_Allg_AttributeGroup#getEntwurfsgeschwindigkeit <em>Entwurfsgeschwindigkeit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entwurfsgeschwindigkeit</em>' containment reference.
	 * @see #getEntwurfsgeschwindigkeit()
	 * @generated
	 */
	void setEntwurfsgeschwindigkeit(Entwurfsgeschwindigkeit_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Strecke Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rechtliche Klassifizierung der Strecke (Haupt-/Nebenbahn). DB-Regelwerk Angabe auf dem LP
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Strecke Art</em>' containment reference.
	 * @see #setStreckeArt(Strecke_Art_TypeClass)
	 * @see org.eclipse.set.model.model1902.Block.BlockPackage#getBlock_Strecke_Allg_AttributeGroup_StreckeArt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Strecke_Art'"
	 * @generated
	 */
	Strecke_Art_TypeClass getStreckeArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Block.Block_Strecke_Allg_AttributeGroup#getStreckeArt <em>Strecke Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Strecke Art</em>' containment reference.
	 * @see #getStreckeArt()
	 * @generated
	 */
	void setStreckeArt(Strecke_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Traktion Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der Fahrstromversorgung (Stromart, Spannung, besondere Zuführung). DB-Regelwerk Angabe auf dem LP
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Traktion Art</em>' containment reference.
	 * @see #setTraktionArt(Traktion_Art_TypeClass)
	 * @see org.eclipse.set.model.model1902.Block.BlockPackage#getBlock_Strecke_Allg_AttributeGroup_TraktionArt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Traktion_Art'"
	 * @generated
	 */
	Traktion_Art_TypeClass getTraktionArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Block.Block_Strecke_Allg_AttributeGroup#getTraktionArt <em>Traktion Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traktion Art</em>' containment reference.
	 * @see #getTraktionArt()
	 * @generated
	 */
	void setTraktionArt(Traktion_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Zugbeeinflussung Art</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vorhandenes bzw. vorgesehenes Zugbeeinflussungssystem. DB-Regelwerk Angabe auf dem LP
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zugbeeinflussung Art</em>' containment reference.
	 * @see #setZugbeeinflussungArt(Zugbeeinflussung_Art_TypeClass)
	 * @see org.eclipse.set.model.model1902.Block.BlockPackage#getBlock_Strecke_Allg_AttributeGroup_ZugbeeinflussungArt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Zugbeeinflussung_Art'"
	 * @generated
	 */
	Zugbeeinflussung_Art_TypeClass getZugbeeinflussungArt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Block.Block_Strecke_Allg_AttributeGroup#getZugbeeinflussungArt <em>Zugbeeinflussung Art</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zugbeeinflussung Art</em>' containment reference.
	 * @see #getZugbeeinflussungArt()
	 * @generated
	 */
	void setZugbeeinflussungArt(Zugbeeinflussung_Art_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Zusatzinformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Erlaubt die Angabe zusätzlicher Informationen zur Ausgabe im LP. DB-Regelwerk Angabe auf dem LP
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zusatzinformation</em>' containment reference.
	 * @see #setZusatzinformation(Zusatzinformation_TypeClass)
	 * @see org.eclipse.set.model.model1902.Block.BlockPackage#getBlock_Strecke_Allg_AttributeGroup_Zusatzinformation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Zusatzinformation'"
	 * @generated
	 */
	Zusatzinformation_TypeClass getZusatzinformation();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Block.Block_Strecke_Allg_AttributeGroup#getZusatzinformation <em>Zusatzinformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zusatzinformation</em>' containment reference.
	 * @see #getZusatzinformation()
	 * @generated
	 */
	void setZusatzinformation(Zusatzinformation_TypeClass value);

} // Block_Strecke_Allg_AttributeGroup
