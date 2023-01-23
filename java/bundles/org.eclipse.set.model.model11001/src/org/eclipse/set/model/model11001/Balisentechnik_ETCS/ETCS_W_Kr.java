/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Balisentechnik_ETCS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model11001.Verweise.ID_ETCS_Knoten_ohne_Proxy_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Markanter_Punkt_Gleis_Abschluss_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_RBC_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_W_Kr_Anlage_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ETCS WKr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Zusatzangaben für Weichen und Kreuzungen im Zusammenhang mit ETCS L2. Ortsgestellte Weichen sind gemäß der Vorgaben in Ril 819.1344 zu berücksichtigen.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_W_Kr#getETCSWKrMUKA <em>ETCSW Kr MUKA</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_W_Kr#getIDETCSGefahrpunktNebengleis <em>IDETCS Gefahrpunkt Nebengleis</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_W_Kr#getIDETCSKnoten <em>IDETCS Knoten</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_W_Kr#getIDRBC <em>IDRBC</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_W_Kr#getIDWKrAnlage <em>IDW Kr Anlage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_W_Kr()
 * @model extendedMetaData="name='CETCS_W_Kr' kind='elementOnly'"
 * @generated
 */
public interface ETCS_W_Kr extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ETCSW Kr MUKA</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ETCSW Kr MUKA</em>' containment reference.
	 * @see #setETCSWKrMUKA(ETCS_W_Kr_MUKA_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_W_Kr_ETCSWKrMUKA()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ETCS_W_Kr_MUKA'"
	 * @generated
	 */
	ETCS_W_Kr_MUKA_AttributeGroup getETCSWKrMUKA();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_W_Kr#getETCSWKrMUKA <em>ETCSW Kr MUKA</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ETCSW Kr MUKA</em>' containment reference.
	 * @see #getETCSWKrMUKA()
	 * @generated
	 */
	void setETCSWKrMUKA(ETCS_W_Kr_MUKA_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>IDETCS Gefahrpunkt Nebengleis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Bei ortsgestellten Weichen: Angabe des nächsten ETCS-Gefahrpunkts hinter der ortsgestellten Weiche für den Fahrweg ins Nebengleis. DB-Regelwerk Ril 819.1344, 3.3.2 (25)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDETCS Gefahrpunkt Nebengleis</em>' containment reference.
	 * @see #setIDETCSGefahrpunktNebengleis(ID_Markanter_Punkt_Gleis_Abschluss_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_W_Kr_IDETCSGefahrpunktNebengleis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_ETCS_Gefahrpunkt_Nebengleis'"
	 * @generated
	 */
	ID_Markanter_Punkt_Gleis_Abschluss_TypeClass getIDETCSGefahrpunktNebengleis();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_W_Kr#getIDETCSGefahrpunktNebengleis <em>IDETCS Gefahrpunkt Nebengleis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDETCS Gefahrpunkt Nebengleis</em>' containment reference.
	 * @see #getIDETCSGefahrpunktNebengleis()
	 * @generated
	 */
	void setIDETCSGefahrpunktNebengleis(ID_Markanter_Punkt_Gleis_Abschluss_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDETCS Knoten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den ETCS_Knoten, der die Weiche bzw. Kreuzung repräsentiert. ETCS benutzt bei abzweigendem Fahrweg ersatzhalber die Geo-/Topo-Daten der Fahrwegabschnitte über den Kreuzungsmittelpunkt. Der auftretende Fehler wird vernachlässigt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDETCS Knoten</em>' containment reference.
	 * @see #setIDETCSKnoten(ID_ETCS_Knoten_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_W_Kr_IDETCSKnoten()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_ETCS_Knoten'"
	 * @generated
	 */
	ID_ETCS_Knoten_ohne_Proxy_TypeClass getIDETCSKnoten();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_W_Kr#getIDETCSKnoten <em>IDETCS Knoten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDETCS Knoten</em>' containment reference.
	 * @see #getIDETCSKnoten()
	 * @generated
	 */
	void setIDETCSKnoten(ID_ETCS_Knoten_ohne_Proxy_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDRBC</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.Verweise.ID_RBC_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das RBC, dem die Weiche zugeordnet ist. Die Zuordnung ist auch für ortsgestellte Weichen notwendig, um das Ende des Weichenbereichs ermitteln bzw. trotz fehlender Lageinformation das Ende der Fahrerlaubnis bestimmen zu können.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDRBC</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_W_Kr_IDRBC()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_RBC'"
	 * @generated
	 */
	EList<ID_RBC_TypeClass> getIDRBC();

	/**
	 * Returns the value of the '<em><b>IDW Kr Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die zugehörige Weiche bzw. Kreuzung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDW Kr Anlage</em>' containment reference.
	 * @see #setIDWKrAnlage(ID_W_Kr_Anlage_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_W_Kr_IDWKrAnlage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_W_Kr_Anlage'"
	 * @generated
	 */
	ID_W_Kr_Anlage_ohne_Proxy_TypeClass getIDWKrAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ETCS_W_Kr#getIDWKrAnlage <em>IDW Kr Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDW Kr Anlage</em>' containment reference.
	 * @see #getIDWKrAnlage()
	 * @generated
	 */
	void setIDWKrAnlage(ID_W_Kr_Anlage_ohne_Proxy_TypeClass value);

} // ETCS_W_Kr
