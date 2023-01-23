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
 * A representation of the model object '<em><b>Zungenpaar Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getElektrischerAntriebAnzahl <em>Elektrischer Antrieb Anzahl</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getElektrischerAntriebLage <em>Elektrischer Antrieb Lage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getGeschwindigkeitL <em>Geschwindigkeit L</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getGeschwindigkeitR <em>Geschwindigkeit R</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getHerzstueckAntriebe <em>Herzstueck Antriebe</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getKreuzungsgleis <em>Kreuzungsgleis</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getStammgleis <em>Stammgleis</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getWeichensignal <em>Weichensignal</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getZungenpruefkontaktAnzahl <em>Zungenpruefkontakt Anzahl</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getZungenpaar_AttributeGroup()
 * @model extendedMetaData="name='CZungenpaar' kind='elementOnly'"
 * @generated
 */
public interface Zungenpaar_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Elektrischer Antrieb Anzahl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anzahl der für die W Kr Gsp Komponente vorgesehenen elektrischen Antriebe. Die Anordnung der Weichenantriebe erfolgt nach der angegebenen Regelzeichnung. Mechanische Weichenantriebe sind durch die Stellart bestimmt. Die Anzahl der elektrischen Antribe wäre dann 0! Mechanische Prüfer und Riegel werden durch die entsprechende Regelzeichnung zugeordnet. Für eine Kreuzung ist die Anzahl der elektrischen Antrieb mit 0 anzugeben. Bei einer Flachkreuzung, die aus 2 Kreuzungsseiten besteht, werden die Antriebe den jeweiligen Kreuzungsseiten A und B beiden zugeordnet, die jeweils 0 oder 1 Antrieb haben können. Die Lage der Antriebe ergibt sich aus der Regelzeichnung. Für eine EKW werden die Antriebe ebenfalls für die beiden Kreuzungsseiten A und B getrennt (0 oder 1) angegeben. Die konkrete Lage der Antriebe ergibt sich aus der Regelzeichnung. Für eine DKW werden die Antriebe für die Seiten AB und CD getrennt angegeben. Da im allgemeinen die Zungenpaare (W_Kr_Gsp_Komponente) einer Kreuzungsseite gemeinsam angetrieben werden, ist es bedeutungslos, ob der zugehörige Antrieb an dem Zungenpaar A oder B bzw. C oder D angeordnet wird. Die konkrete Lage der Antrieb ergibt sich aus der Regelzeichnung. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elektrischer Antrieb Anzahl</em>' containment reference.
	 * @see #setElektrischerAntriebAnzahl(Elektrischer_Antrieb_Anzahl_TypeClass)
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getZungenpaar_AttributeGroup_ElektrischerAntriebAnzahl()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Elektrischer_Antrieb_Anzahl'"
	 * @generated
	 */
	Elektrischer_Antrieb_Anzahl_TypeClass getElektrischerAntriebAnzahl();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getElektrischerAntriebAnzahl <em>Elektrischer Antrieb Anzahl</em>}' containment reference.
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
	 * Lage des Antriebs von der Weichenspitze aus gesehen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Elektrischer Antrieb Lage</em>' containment reference.
	 * @see #setElektrischerAntriebLage(Elektrischer_Antrieb_Lage_TypeClass)
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getZungenpaar_AttributeGroup_ElektrischerAntriebLage()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Elektrischer_Antrieb_Lage'"
	 * @generated
	 */
	Elektrischer_Antrieb_Lage_TypeClass getElektrischerAntriebLage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getElektrischerAntriebLage <em>Elektrischer Antrieb Lage</em>}' containment reference.
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
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getZungenpaar_AttributeGroup_GeschwindigkeitL()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Geschwindigkeit_L'"
	 * @generated
	 */
	Geschwindigkeit_L_TypeClass getGeschwindigkeitL();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getGeschwindigkeitL <em>Geschwindigkeit L</em>}' containment reference.
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
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getZungenpaar_AttributeGroup_GeschwindigkeitR()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Geschwindigkeit_R'"
	 * @generated
	 */
	Geschwindigkeit_R_TypeClass getGeschwindigkeitR();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getGeschwindigkeitR <em>Geschwindigkeit R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Geschwindigkeit R</em>' containment reference.
	 * @see #getGeschwindigkeitR()
	 * @generated
	 */
	void setGeschwindigkeitR(Geschwindigkeit_R_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Herzstueck Antriebe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anzahl der Antriebe am Herzstück einer Weiche. Das Attribut entfällt, wenn keine bewegliche Herzstückspitze vorhanden ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Herzstueck Antriebe</em>' containment reference.
	 * @see #setHerzstueckAntriebe(Herzstueck_Antriebe_TypeClass)
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getZungenpaar_AttributeGroup_HerzstueckAntriebe()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Herzstueck_Antriebe'"
	 * @generated
	 */
	Herzstueck_Antriebe_TypeClass getHerzstueckAntriebe();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getHerzstueckAntriebe <em>Herzstueck Antriebe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Herzstueck Antriebe</em>' containment reference.
	 * @see #getHerzstueckAntriebe()
	 * @generated
	 */
	void setHerzstueckAntriebe(Herzstueck_Antriebe_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Kreuzungsgleis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lage der TOP Kante, die bei EKW und DKW vom zugehörigen Zungenpaar in Richtung des Kreuzungsmittelpunktes führt. Das Attribut muss bei EKW und DKW angegeben werden, um eine lagerichtige Zuordnung der Kanteneigenschaften in dem Ausgabetabellen sicherzustellen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kreuzungsgleis</em>' containment reference.
	 * @see #setKreuzungsgleis(Kreuzungsgleis_TypeClass)
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getZungenpaar_AttributeGroup_Kreuzungsgleis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Kreuzungsgleis'"
	 * @generated
	 */
	Kreuzungsgleis_TypeClass getKreuzungsgleis();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getKreuzungsgleis <em>Kreuzungsgleis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kreuzungsgleis</em>' containment reference.
	 * @see #getKreuzungsgleis()
	 * @generated
	 */
	void setKreuzungsgleis(Kreuzungsgleis_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Stammgleis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Lage der TOP Kante, die das Stammgleis repräsentiert (Blickrichtung von der Weichenspitze zum Weichenstumpf bzw. Kreuzungsmittelpunkt).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stammgleis</em>' containment reference.
	 * @see #setStammgleis(Stammgleis_TypeClass)
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getZungenpaar_AttributeGroup_Stammgleis()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Stammgleis'"
	 * @generated
	 */
	Stammgleis_TypeClass getStammgleis();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getStammgleis <em>Stammgleis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stammgleis</em>' containment reference.
	 * @see #getStammgleis()
	 * @generated
	 */
	void setStammgleis(Stammgleis_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Weichensignal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Existenz eines (Weichen)-Signals, was konstruktiv (mechanisch) mit der Weichenkomponente verbunden ist. Der Begriff, der am Weichensignal anzeigbar ist, wird nicht modelliert. Die konstruktive Ausbildung des Weichensignals wird dem ENUM entnommen. Bei EKW und DKW wird für alle Weichenkomponenten das Attribut gefüllt, auch wenn die Lage der Zungenpaare in einem Anzeiger abgebildet werden. Kreuzungen und Kreuzungen mit beweglichen Doppelherzstückspitzen (auch Flachkreuzungen genannt) haben grundsätzlich kein Weichensignal. Wenn die Weichenanlage ein gesondertes (Weichen)-Signal besitzt (z. B. Weichenlagemelder mit Lichtpunkten oder Rückfallweichensignale), wird ein eigenes Signal modelliert. Die Weichenanlage bzw. das Weichenelement hat dann einen Elementbezug zum entsprechenden Signal. Als Punkt Objekt wird das Signal gesondert verortet. Achtung: Weichensignale mit Lichtpunkten sind nur in EOW-Bereichen zulässig. Für diese Signale existieren keine Regelzeichnungen! DB-Regelwerk Regelzeichnungen 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Weichensignal</em>' containment reference.
	 * @see #setWeichensignal(Weichensignal_TypeClass)
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getZungenpaar_AttributeGroup_Weichensignal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Weichensignal'"
	 * @generated
	 */
	Weichensignal_TypeClass getWeichensignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getWeichensignal <em>Weichensignal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weichensignal</em>' containment reference.
	 * @see #getWeichensignal()
	 * @generated
	 */
	void setWeichensignal(Weichensignal_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Zungenpruefkontakt Anzahl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Anzahl der für diese Komponente vorgesehenen elektrischen Zungenprüfkontakte (Zprk). Ein Zungenprüfer innerhalb eines Weichenantriebes wird nicht berücksichtigt. Die Anordnung der Zungenprüfkontakte erfolgt nach der angegebenen Regelzeichnung. Mechanische Weichenantriebe sind durch die Stellart bestimmt. Mechanische Prüfer und Riegel werden durch die entsprechende Regelzeichnung zugeordnet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zungenpruefkontakt Anzahl</em>' containment reference.
	 * @see #setZungenpruefkontaktAnzahl(Zungenpruefkontakt_Anzahl_TypeClass)
	 * @see org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage#getZungenpaar_AttributeGroup_ZungenpruefkontaktAnzahl()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Zungenpruefkontakt_Anzahl'"
	 * @generated
	 */
	Zungenpruefkontakt_Anzahl_TypeClass getZungenpruefkontaktAnzahl();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Zungenpaar_AttributeGroup#getZungenpruefkontaktAnzahl <em>Zungenpruefkontakt Anzahl</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zungenpruefkontakt Anzahl</em>' containment reference.
	 * @see #getZungenpruefkontaktAnzahl()
	 * @generated
	 */
	void setZungenpruefkontaktAnzahl(Zungenpruefkontakt_Anzahl_TypeClass value);

} // Zungenpaar_AttributeGroup
