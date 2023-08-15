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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kreuzung Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Kreuzung_AttributeGroup#getElektrischerAntriebAnzahl <em>Elektrischer Antrieb Anzahl</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Kreuzung_AttributeGroup#getElektrischerAntriebLage <em>Elektrischer Antrieb Lage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Kreuzung_AttributeGroup#getGeschwindigkeitL <em>Geschwindigkeit L</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Kreuzung_AttributeGroup#getGeschwindigkeitR <em>Geschwindigkeit R</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getKreuzung_AttributeGroup()
 * @model extendedMetaData="name='CKreuzung' kind='elementOnly'"
 * @generated
 */
public interface Kreuzung_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Elektrischer Antrieb Anzahl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anzahl der für die W Kr Gsp Komponente vorgesehenen elektrischen Antriebe. Die Anordnung der Weichenantriebe erfolgt nach der angegebenen Regelzeichnung. Mechanische Weichenantriebe sind durch die Stellart bestimmt. Die Anzahl der elektrischen Antribe wäre dann 0! Mechanische Prüfer und Riegel werden durch die entsprechende Regelzeichnung zugeordnet. Für eine Kreuzung ist die Anzahl der elektrischen Antrieb mit 0 anzugeben. Bei einer Flachkreuzung, die aus 2 Kreuzungsseiten besteht, werden die Antriebe den jeweiligen Kreuzungsseiten A und B beiden zugeordnet, die jeweils 0 oder 1 Antrieb haben können. Die Lage der Antriebe ergibt sich aus der Regelzeichnung. Für eine EKW werden die Antriebe ebenfalls für die beiden Kreuzungsseiten A und B getrennt (0 oder 1) angegeben. Die konkrete Lage der Antriebe ergibt sich aus der Regelzeichnung. Für eine DKW werden die Antriebe für die Seiten AB und CD getrennt angegeben. Da im allgemeinen die Zungenpaare (W_Kr_Gsp_Komponente) einer Kreuzungsseite gemeinsam angetrieben werden, ist es bedeutungslos, ob der zugehörige Antrieb an dem Zungenpaar A oder B bzw. C oder D angeordnet wird. Die konkrete Lage der Antrieb ergibt sich aus der Regelzeichnung. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elektrischer Antrieb Anzahl</em>' containment reference.
	 * @see #setElektrischerAntriebAnzahl(Elektrischer_Antrieb_Anzahl_TypeClass)
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getKreuzung_AttributeGroup_ElektrischerAntriebAnzahl()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Elektrischer_Antrieb_Anzahl'"
	 * @generated
	 */
	Elektrischer_Antrieb_Anzahl_TypeClass getElektrischerAntriebAnzahl();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Kreuzung_AttributeGroup#getElektrischerAntriebAnzahl <em>Elektrischer Antrieb Anzahl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elektrischer Antrieb Anzahl</em>' containment reference.
	 * @see #getElektrischerAntriebAnzahl()
	 * @generated
	 */
	void setElektrischerAntriebAnzahl(Elektrischer_Antrieb_Anzahl_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Elektrischer Antrieb Lage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lage des Antriebs vom Kreuzungsmittelpunkt aus gesehen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elektrischer Antrieb Lage</em>' containment reference.
	 * @see #setElektrischerAntriebLage(Elektrischer_Antrieb_Lage_TypeClass)
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getKreuzung_AttributeGroup_ElektrischerAntriebLage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Elektrischer_Antrieb_Lage'"
	 * @generated
	 */
	Elektrischer_Antrieb_Lage_TypeClass getElektrischerAntriebLage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Kreuzung_AttributeGroup#getElektrischerAntriebLage <em>Elektrischer Antrieb Lage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elektrischer Antrieb Lage</em>' containment reference.
	 * @see #getElektrischerAntriebLage()
	 * @generated
	 */
	void setElektrischerAntriebLage(Elektrischer_Antrieb_Lage_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Geschwindigkeit L</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zulässige Geschwindigkeit über den linken Weichenschenkel. Die Geschwindigkeit kann geringer sein als die aus der Weichengeometrie abgeleitete. Die Angabe erfolgt in km/h.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geschwindigkeit L</em>' containment reference.
	 * @see #setGeschwindigkeitL(Geschwindigkeit_L_TypeClass)
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getKreuzung_AttributeGroup_GeschwindigkeitL()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Geschwindigkeit_L'"
	 * @generated
	 */
	Geschwindigkeit_L_TypeClass getGeschwindigkeitL();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Kreuzung_AttributeGroup#getGeschwindigkeitL <em>Geschwindigkeit L</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geschwindigkeit L</em>' containment reference.
	 * @see #getGeschwindigkeitL()
	 * @generated
	 */
	void setGeschwindigkeitL(Geschwindigkeit_L_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Geschwindigkeit R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zulässige Geschwindigkeit über den rechten Weichenschenkel. Die Geschwindigkeit kann geringer sein als die aus der Weichengeometrie abgeleitete. Die Angabe erfolgt in km/h.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Geschwindigkeit R</em>' containment reference.
	 * @see #setGeschwindigkeitR(Geschwindigkeit_R_TypeClass)
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getKreuzung_AttributeGroup_GeschwindigkeitR()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Geschwindigkeit_R'"
	 * @generated
	 */
	Geschwindigkeit_R_TypeClass getGeschwindigkeitR();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Kreuzung_AttributeGroup#getGeschwindigkeitR <em>Geschwindigkeit R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geschwindigkeit R</em>' containment reference.
	 * @see #getGeschwindigkeitR()
	 * @generated
	 */
	void setGeschwindigkeitR(Geschwindigkeit_R_TypeClass value);

} // Kreuzung_AttributeGroup
