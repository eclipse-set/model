/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Weichen_und_Gleissperren;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model11001.Verweise.ID_Anhang_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_Signal_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WKr Anlage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Bauliche Gesamtheit des Objektes Weiche oder Kreuzung einschließlich der für seine Funktion unmittelbar und in der Nähe vorhandenen Stell-, Steuer- und Überwachungseinrichtungen. Typische Grundformen der Weichenanlagen sind: einfache Weiche (EW), einfache Kreuzungsweiche (EKW), doppelte Kreuzungsweiche (DKW), starre Kreuzung (KR) und Flachkreuzungen mit doppelten Herzstücken und beweglichen Spitzen (KR). Grundlage der Bezeichnungen ist die Ril 800.0120 in Verbindung mit den zugehörigen Anlagen. Weichenanlagen werden unterteilt in die einzelnen Elemente (Weichenelement). Die Elemente besitzen eine oder mehrere Komponenten (Weichenkomponente). Diese Objekte beschreiben in Verbindung mit Regelzeichnungen weitere Eigenschaften (z.B. Antriebe und Endlagenprüfer) der Weichenanlage. Siehe auch Modellierung Weichen. DB-Regelwerk Ril 800.0120 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Anlage#getIDAnhangDWS <em>ID Anhang DWS</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Anlage#getIDSignal <em>ID Signal</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Anlage#getWKrAnlageAllg <em>WKr Anlage Allg</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getW_Kr_Anlage()
 * @model extendedMetaData="name='CW_Kr_Anlage' kind='elementOnly'"
 * @generated
 */
public interface W_Kr_Anlage extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Anhang DWS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die zugehörige Digitale Weichenskizze, die als Dateianhang mittels des Objektes Anhang eingebunden wird. DB-Regelwerk Die Digitale Weichenskizze wird für alle neu zu beschaffenden Weichen nach Ril 823.0700 erstellt. Sie enthält alle konstruktiven Daten der zu beschaffenden Weiche. Die relevanten Daten für die signaltechnischen Planungen werden künftig der DWS entnommen bzw. mit dieser Datei abgeglichen. Die für die LST-Planung relevanten Daten werden in entsprechende Attribute der allgemeinen Merkmale eingetragen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Anhang DWS</em>' containment reference.
	 * @see #setIDAnhangDWS(ID_Anhang_TypeClass)
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getW_Kr_Anlage_IDAnhangDWS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Anhang_DWS'"
	 * @generated
	 */
	ID_Anhang_TypeClass getIDAnhangDWS();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Anlage#getIDAnhangDWS <em>ID Anhang DWS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Anhang DWS</em>' containment reference.
	 * @see #getIDAnhangDWS()
	 * @generated
	 */
	void setIDAnhangDWS(ID_Anhang_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ID Signal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein Signal, welches den Zustand der W_Kr_Anlage signalisiert (z. B. Rückfallweichensignal).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Signal</em>' containment reference.
	 * @see #setIDSignal(ID_Signal_TypeClass)
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getW_Kr_Anlage_IDSignal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Signal'"
	 * @generated
	 */
	ID_Signal_TypeClass getIDSignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Anlage#getIDSignal <em>ID Signal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Signal</em>' containment reference.
	 * @see #getIDSignal()
	 * @generated
	 */
	void setIDSignal(ID_Signal_TypeClass value);

	/**
	 * Returns the value of the '<em><b>WKr Anlage Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>WKr Anlage Allg</em>' containment reference.
	 * @see #setWKrAnlageAllg(W_Kr_Anlage_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getW_Kr_Anlage_WKrAnlageAllg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='W_Kr_Anlage_Allg'"
	 * @generated
	 */
	W_Kr_Anlage_Allg_AttributeGroup getWKrAnlageAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.W_Kr_Anlage#getWKrAnlageAllg <em>WKr Anlage Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>WKr Anlage Allg</em>' containment reference.
	 * @see #getWKrAnlageAllg()
	 * @generated
	 */
	void setWKrAnlageAllg(W_Kr_Anlage_Allg_AttributeGroup value);

} // W_Kr_Anlage
