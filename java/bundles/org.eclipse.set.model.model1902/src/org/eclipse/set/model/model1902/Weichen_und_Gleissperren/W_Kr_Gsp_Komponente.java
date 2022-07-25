/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Weichen_und_Gleissperren;

import org.eclipse.emf.common.util.EList;

import org.eclipse.set.model.model1902.Basisobjekte.Punkt_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_Regelzeichnung_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_W_Kr_Gsp_Element_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>WKr Gsp Komponente</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Einzelner Teil der Weichenanlage (Zungenpaar) oder konstruktiver Mittelpunkt einer Kreuzung in Form von 2 Kreuzungsseiten. Mit Hilfe der W_Kr_Gsp_Komponente als punktförmiges Objekt wird die Verknüpfung mit dem Knoten im Topologischen Modell hergestellt. Als Zuordnungspunkte für die Topologie und die Topographie werden Weichenknoten definiert. Die Verortung der Weichenkomponente ist in für die typischen Anwendungsfälle in der Modellierung Weichen dargestellt. Bei einfachen Weichen entspricht der Weichenknoten dem Weichenanfang. Bei EKW und DKW entspricht der Weichenknoten dem Anfang der entsprechenden Zungenpaare (auch hier einheitlich als Weichenanfang bezeichnet). Bei einer Kreuzung wird der Mittelpunkt der Kreuzung als Weichenknoten verwendet. Beide Kreuzungsseiten werden jeweils auf die beiden sich kreuzenden TOP-Kanten verortet. Der Mittelpunkt einer Kreuzung ist kein TOP-Knoten und kein GEO-Knoten. Bei Gleissperren wird die Lage des Entgleisungsschuhs verortet. Über die Seitliche Lage im Punkt Objekt wird die Schiene bestimmt, an der der Entgleisungsschuh angebracht ist. Die seitliche Lage wird im Bezug auf die Richtung der TOP_Kante angegeben und stellt nicht die Entgleisungsrichtung dar! Wenn die Weichenkomponente mit einem nicht mechanisch mit der Weiche verbundenen (Weichen-)Signal (z. B. Rückfallweichensignal, Weichenlagemelder) ausgerüstet werden soll, erfolgt die Modellierung dieses Signals als ein gesondertes Objekt Signal. Auf dieses Signal wird von W Kr Anlage (wenn die Anlage ein Signal hat) bzw. W Kr Gsp Element (wenn mehrere Elemete vorhanden sind und diese unterschiedliche Signale haben) verwiesen. Der Weichelagemelder einer DKW wird von den beiden W_Kr_Gsp_Element gesteuert, aber in einem Signal angezeigt. Er wird deshalb nur als ein Signal in der Weichenanlage modelliert. Ein mit der Weichenkomponente mechanisch verbundenes Weichensignal wird gemäß Regelzeichnung errichtet, wenn das Attribut Weichensignal gesetzt ist. Es wird dann kein gesondertes Signal modelliert. Siehe auch Modellierung Weichen. Die im Glossar mit (E) gekennzeichneten Attribute Radius_L und Radius_R sollen nicht mehr befüllt werden, da ein künftiger Entfall vorgesehen ist.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente#getIDRegelzeichnung <em>ID Regelzeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente#getIDWKrGspElement <em>IDW Kr Gsp Element</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente#getBesonderesFahrwegelement <em>Besonderes Fahrwegelement</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente#getEntgleisungsschuh <em>Entgleisungsschuh</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente#getKreuzung <em>Kreuzung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente#getZungenpaar <em>Zungenpaar</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getW_Kr_Gsp_Komponente()
 * @model extendedMetaData="name='CW_Kr_Gsp_Komponente' kind='elementOnly'"
 * @generated
 */
public interface W_Kr_Gsp_Komponente extends Punkt_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Regelzeichnung</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Verweise.ID_Regelzeichnung_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf ein Objekt Regelzeichnung. Für Weichen, Kreuzungen und Gleissperren werden die Regelzeichnungen der Gruppe S73xx.yy verwendet. Die Regelzeichnung wird für die W_Kr_Gsp_Komponente angegeben und enthält u. a. auch die Anordnung der Antriebe und Endlagenprüfer. Die Lage ist durch unterschiedliche Bilder in der Regelzeichnung spezifiziert, so dass auch das Bild mit angegeben werden muss. Nur dann, wenn in einer Regelzeichnung mehrere Komponenten zusammengefasst sind (z. B. bei der DKW und der gekuppelten Gleissperre), wird der Eintrag bei W Kr Gsp Element vorgenommen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Regelzeichnung</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getW_Kr_Gsp_Komponente_IDRegelzeichnung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Regelzeichnung'"
	 * @generated
	 */
	EList<ID_Regelzeichnung_TypeClass> getIDRegelzeichnung();

	/**
	 * Returns the value of the '<em><b>IDW Kr Gsp Element</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf das zugehörige Weichen-, Kreuzungs- oder Gleissperrenelement. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDW Kr Gsp Element</em>' containment reference.
	 * @see #setIDWKrGspElement(ID_W_Kr_Gsp_Element_TypeClass)
	 * @see org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getW_Kr_Gsp_Komponente_IDWKrGspElement()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_W_Kr_Gsp_Element'"
	 * @generated
	 */
	ID_W_Kr_Gsp_Element_TypeClass getIDWKrGspElement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente#getIDWKrGspElement <em>IDW Kr Gsp Element</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDW Kr Gsp Element</em>' containment reference.
	 * @see #getIDWKrGspElement()
	 * @generated
	 */
	void setIDWKrGspElement(ID_W_Kr_Gsp_Element_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Besonderes Fahrwegelement</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Abbildung besonderer Fahrwegelemente wie Wehrkammtertor, bewegliche Brücke oder abklappbarer Prellbock.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Besonderes Fahrwegelement</em>' containment reference.
	 * @see #setBesonderesFahrwegelement(Besonderes_Fahrwegelement_TypeClass)
	 * @see org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getW_Kr_Gsp_Komponente_BesonderesFahrwegelement()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Besonderes_Fahrwegelement'"
	 * @generated
	 */
	Besonderes_Fahrwegelement_TypeClass getBesonderesFahrwegelement();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente#getBesonderesFahrwegelement <em>Besonderes Fahrwegelement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Besonderes Fahrwegelement</em>' containment reference.
	 * @see #getBesonderesFahrwegelement()
	 * @generated
	 */
	void setBesonderesFahrwegelement(Besonderes_Fahrwegelement_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Entgleisungsschuh</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entgleisungsschuh</em>' containment reference.
	 * @see #setEntgleisungsschuh(Entgleisungsschuh_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getW_Kr_Gsp_Komponente_Entgleisungsschuh()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Entgleisungsschuh'"
	 * @generated
	 */
	Entgleisungsschuh_AttributeGroup getEntgleisungsschuh();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente#getEntgleisungsschuh <em>Entgleisungsschuh</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entgleisungsschuh</em>' containment reference.
	 * @see #getEntgleisungsschuh()
	 * @generated
	 */
	void setEntgleisungsschuh(Entgleisungsschuh_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Kreuzung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Fahrwegelement, an dem sich zwei Gleise höhengleich kreuzen, ohne dass ein Übergang zwischen den Gleisen möglich ist. Einfache Kreuzungen sind in der Regel nicht stellbar. Kreuzungen, die einen besonders spitzen Winkel haben (Kreuzungen mit beweglichen Doppelherzstückspitzen, auch Flachkreuzung genannt) sind stellbar und besitzen mindestens einen, vorzugsweise zwei gleichlaufende Antriebe
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kreuzung</em>' containment reference.
	 * @see #setKreuzung(Kreuzung_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getW_Kr_Gsp_Komponente_Kreuzung()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Kreuzung'"
	 * @generated
	 */
	Kreuzung_AttributeGroup getKreuzung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente#getKreuzung <em>Kreuzung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kreuzung</em>' containment reference.
	 * @see #getKreuzung()
	 * @generated
	 */
	void setKreuzung(Kreuzung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>Zungenpaar</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zungenpaar</em>' containment reference.
	 * @see #setZungenpaar(Zungenpaar_AttributeGroup)
	 * @see org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getW_Kr_Gsp_Komponente_Zungenpaar()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Zungenpaar'"
	 * @generated
	 */
	Zungenpaar_AttributeGroup getZungenpaar();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Weichen_und_Gleissperren.W_Kr_Gsp_Komponente#getZungenpaar <em>Zungenpaar</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zungenpaar</em>' containment reference.
	 * @see #getZungenpaar()
	 * @generated
	 */
	void setZungenpaar(Zungenpaar_AttributeGroup value);

} // W_Kr_Gsp_Komponente
