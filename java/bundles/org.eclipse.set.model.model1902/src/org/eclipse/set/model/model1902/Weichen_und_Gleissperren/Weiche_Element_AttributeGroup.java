/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Weichen_und_Gleissperren;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model1902.Verweise.ID_Grenzzeichen_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_Signal_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Weiche Element Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup#getAuffahrortung <em>Auffahrortung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup#getGZFreimeldungL <em>GZ Freimeldung L</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup#getGZFreimeldungR <em>GZ Freimeldung R</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup#getIDGrenzzeichen <em>ID Grenzzeichen</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup#getIDSignal <em>ID Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup#getWeicheBetriebsart <em>Weiche Betriebsart</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup#getWeicheVorzugslage <em>Weiche Vorzugslage</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getWeiche_Element_AttributeGroup()
 * @model extendedMetaData="name='CWeiche_Element' kind='elementOnly'"
 * @generated
 */
public interface Weiche_Element_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Auffahrortung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Für das technisch nicht auffahrbare Weichenelement sind spezielle Sensoren zur Auffahrortung anzubringen. Ist diese Funktionalität erforderlich ist, wird das Attribut auf true gesetzt. Ansonsten entfällt es. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Auffahrortung</em>' containment reference.
	 * @see #setAuffahrortung(Auffahrortung_TypeClass)
	 * @see org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getWeiche_Element_AttributeGroup_Auffahrortung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Auffahrortung'"
	 * @generated
	 */
	Auffahrortung_TypeClass getAuffahrortung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup#getAuffahrortung <em>Auffahrortung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auffahrortung</em>' containment reference.
	 * @see #getAuffahrortung()
	 * @generated
	 */
	void setAuffahrortung(Auffahrortung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>GZ Freimeldung L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob die Freimeldung im linken Weichenschenkel grenzzeichenfrei realisiert ist (true) oder nicht (false).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GZ Freimeldung L</em>' containment reference.
	 * @see #setGZFreimeldungL(GZ_Freimeldung_L_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getWeiche_Element_AttributeGroup_GZFreimeldungL()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GZ_Freimeldung_L'"
	 * @generated
	 */
	GZ_Freimeldung_L_AttributeGroup getGZFreimeldungL();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup#getGZFreimeldungL <em>GZ Freimeldung L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GZ Freimeldung L</em>' containment reference.
	 * @see #getGZFreimeldungL()
	 * @generated
	 */
	void setGZFreimeldungL(GZ_Freimeldung_L_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>GZ Freimeldung R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob die Freimeldung im rechten Weichenschenkel grenzzeichenfrei realisiert ist (true) oder nicht (false).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GZ Freimeldung R</em>' containment reference.
	 * @see #setGZFreimeldungR(GZ_Freimeldung_R_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getWeiche_Element_AttributeGroup_GZFreimeldungR()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='GZ_Freimeldung_R'"
	 * @generated
	 */
	GZ_Freimeldung_R_AttributeGroup getGZFreimeldungR();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup#getGZFreimeldungR <em>GZ Freimeldung R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GZ Freimeldung R</em>' containment reference.
	 * @see #getGZFreimeldungR()
	 * @generated
	 */
	void setGZFreimeldungR(GZ_Freimeldung_R_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Grenzzeichen</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein Signal, was das zugehörige Grenzzeichen dieser Weiche ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Grenzzeichen</em>' containment reference.
	 * @see #setIDGrenzzeichen(ID_Grenzzeichen_TypeClass)
	 * @see org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getWeiche_Element_AttributeGroup_IDGrenzzeichen()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Grenzzeichen'"
	 * @generated
	 */
	ID_Grenzzeichen_TypeClass getIDGrenzzeichen();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup#getIDGrenzzeichen <em>ID Grenzzeichen</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Grenzzeichen</em>' containment reference.
	 * @see #getIDGrenzzeichen()
	 * @generated
	 */
	void setIDGrenzzeichen(ID_Grenzzeichen_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein Signal, welches den Zustand des W_Kr_Gsp_Element signalisiert (z. B. Weichenlagemelder).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal</em>' containment reference.
	 * @see #setIDSignal(ID_Signal_TypeClass)
	 * @see org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getWeiche_Element_AttributeGroup_IDSignal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Signal'"
	 * @generated
	 */
	ID_Signal_TypeClass getIDSignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup#getIDSignal <em>ID Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Signal</em>' containment reference.
	 * @see #getIDSignal()
	 * @generated
	 */
	void setIDSignal(ID_Signal_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Weiche Betriebsart</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Neben dem Normalbetrieb (Element ist stellbar) kann das Element durch den Betriebsartenstecker in einer definierten Lage festgelegt werden.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weiche Betriebsart</em>' containment reference.
	 * @see #setWeicheBetriebsart(Weiche_Betriebsart_TypeClass)
	 * @see org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getWeiche_Element_AttributeGroup_WeicheBetriebsart()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Weiche_Betriebsart'"
	 * @generated
	 */
	Weiche_Betriebsart_TypeClass getWeicheBetriebsart();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup#getWeicheBetriebsart <em>Weiche Betriebsart</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weiche Betriebsart</em>' containment reference.
	 * @see #getWeicheBetriebsart()
	 * @generated
	 */
	void setWeicheBetriebsart(Weiche_Betriebsart_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Weiche Vorzugslage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vorzugslage des Weichenelements. Sofern die Angabe erforderlich ist, enthält dieses Attribut den Eintrag links oder rechts bezüglich der Fahrtrichtung mit Blick von der Weichenspitze. Ist dieses Attribut nicht angegeben, so ist auch keine Vorzugslage vorhanden. Das Attribut Vorzugslage Automatik darf dann nicht befüllt sein. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weiche Vorzugslage</em>' containment reference.
	 * @see #setWeicheVorzugslage(Weiche_Vorzugslage_TypeClass)
	 * @see org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getWeiche_Element_AttributeGroup_WeicheVorzugslage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Weiche_Vorzugslage'"
	 * @generated
	 */
	Weiche_Vorzugslage_TypeClass getWeicheVorzugslage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weiche_Element_AttributeGroup#getWeicheVorzugslage <em>Weiche Vorzugslage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weiche Vorzugslage</em>' containment reference.
	 * @see #getWeicheVorzugslage()
	 * @generated
	 */
	void setWeicheVorzugslage(Weiche_Vorzugslage_TypeClass value);

} // Weiche_Element_AttributeGroup
