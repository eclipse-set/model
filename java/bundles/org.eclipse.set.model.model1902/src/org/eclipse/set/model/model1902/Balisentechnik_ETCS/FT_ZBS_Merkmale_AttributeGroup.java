/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FT ZBS Merkmale Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getFTHinweisFunktion <em>FT Hinweis Funktion</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getFTZBSMerkmaleLa <em>FTZBS Merkmale La</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getFTZBSTyp <em>FTZBS Typ</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getLaenge1 <em>Laenge1</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getLMG <em>LMG</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getMassgebendeNeig1 <em>Massgebende Neig1</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getMassgebendeNeigSchutzstrecke <em>Massgebende Neig Schutzstrecke</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getMastschild <em>Mastschild</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getSchutzstreckeErforderlich <em>Schutzstrecke Erforderlich</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getSchutzstreckeVorhanden <em>Schutzstrecke Vorhanden</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getTelegrammnummer <em>Telegrammnummer</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getVBefehlR <em>VBefehl R</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getVBefehlZ <em>VBefehl Z</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getVFrei <em>VFrei</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getVZulStrecke <em>VZul Strecke</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getVGR1 <em>VGR1</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getVGR2 <em>VGR2</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ZBS_Merkmale_AttributeGroup()
 * @model extendedMetaData="name='CFT_ZBS_Merkmale' kind='elementOnly'"
 * @generated
 */
public interface FT_ZBS_Merkmale_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>FT Hinweis Funktion</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hinweis zum Signalbegriff bzw. der Funktion des Fachtelegramms bei Festdatenpunkten (z. B. ZBS-Ende, Ortsreferenz).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FT Hinweis Funktion</em>' containment reference.
	 * @see #setFTHinweisFunktion(FT_Hinweis_Funktion_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ZBS_Merkmale_AttributeGroup_FTHinweisFunktion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='FT_Hinweis_Funktion'"
	 * @generated
	 */
	FT_Hinweis_Funktion_TypeClass getFTHinweisFunktion();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getFTHinweisFunktion <em>FT Hinweis Funktion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FT Hinweis Funktion</em>' containment reference.
	 * @see #getFTHinweisFunktion()
	 * @generated
	 */
	void setFTHinweisFunktion(FT_Hinweis_Funktion_TypeClass value);

	/**
	 * Returns the value of the '<em><b>FTZBS Merkmale La</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_La_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe für Bereiche mit V-Einschränkung innerhalb des Überwachungsabschnitts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FTZBS Merkmale La</em>' containment reference list.
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ZBS_Merkmale_AttributeGroup_FTZBSMerkmaleLa()
	 * @model containment="true" upper="4"
	 *        extendedMetaData="kind='element' name='FT_ZBS_Merkmale_La'"
	 * @generated
	 */
	EList<FT_ZBS_Merkmale_La_AttributeGroup> getFTZBSMerkmaleLa();

	/**
	 * Returns the value of the '<em><b>FTZBS Typ</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Typ des ZBS-Fachtelegramms, der dessen (Überwachungs-)Funktion bestimmt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FTZBS Typ</em>' containment reference.
	 * @see #setFTZBSTyp(FT_ZBS_Typ_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ZBS_Merkmale_AttributeGroup_FTZBSTyp()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='FT_ZBS_Typ'"
	 * @generated
	 */
	FT_ZBS_Typ_TypeClass getFTZBSTyp();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getFTZBSTyp <em>FTZBS Typ</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FTZBS Typ</em>' containment reference.
	 * @see #getFTZBSTyp()
	 * @generated
	 */
	void setFTZBSTyp(FT_ZBS_Typ_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Laenge1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Länge des Überwachungsabschnitts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Laenge1</em>' containment reference.
	 * @see #setLaenge1(Laenge_1_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ZBS_Merkmale_AttributeGroup_Laenge1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Laenge_1'"
	 * @generated
	 */
	Laenge_1_TypeClass getLaenge1();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getLaenge1 <em>Laenge1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Laenge1</em>' containment reference.
	 * @see #getLaenge1()
	 * @generated
	 */
	void setLaenge1(Laenge_1_TypeClass value);

	/**
	 * Returns the value of the '<em><b>LMG</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob der Leuchtmelder G (Hinweis für den Tf, dass eine Überwachung auf eine niedrigere Geschwindigkeit am nächsten Signal noch aktiv ist) angeschaltet werden muss.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LMG</em>' containment reference.
	 * @see #setLMG(LM_G_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ZBS_Merkmale_AttributeGroup_LMG()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LM_G'"
	 * @generated
	 */
	LM_G_TypeClass getLMG();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getLMG <em>LMG</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LMG</em>' containment reference.
	 * @see #getLMG()
	 * @generated
	 */
	void setLMG(LM_G_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Massgebende Neig1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maßgebende Neigung im Überwachungsabschnitt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Massgebende Neig1</em>' containment reference.
	 * @see #setMassgebendeNeig1(Massgebende_Neig_1_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ZBS_Merkmale_AttributeGroup_MassgebendeNeig1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Massgebende_Neig_1'"
	 * @generated
	 */
	Massgebende_Neig_1_TypeClass getMassgebendeNeig1();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getMassgebendeNeig1 <em>Massgebende Neig1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Massgebende Neig1</em>' containment reference.
	 * @see #getMassgebendeNeig1()
	 * @generated
	 */
	void setMassgebendeNeig1(Massgebende_Neig_1_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Massgebende Neig Schutzstrecke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maßgebende Neigung für die Ermittlung der Schutzstreckenlänge. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Massgebende Neig Schutzstrecke</em>' containment reference.
	 * @see #setMassgebendeNeigSchutzstrecke(Massgebende_Neig_Schutzstrecke_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ZBS_Merkmale_AttributeGroup_MassgebendeNeigSchutzstrecke()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Massgebende_Neig_Schutzstrecke'"
	 * @generated
	 */
	Massgebende_Neig_Schutzstrecke_TypeClass getMassgebendeNeigSchutzstrecke();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getMassgebendeNeigSchutzstrecke <em>Massgebende Neig Schutzstrecke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Massgebende Neig Schutzstrecke</em>' containment reference.
	 * @see #getMassgebendeNeigSchutzstrecke()
	 * @generated
	 */
	void setMassgebendeNeigSchutzstrecke(Massgebende_Neig_Schutzstrecke_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Mastschild</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Gibt an, ob am zugehörigen Signal ein Mastschild ws-sw-ws-sw-ws vorhanden ist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Mastschild</em>' containment reference.
	 * @see #setMastschild(Mastschild_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ZBS_Merkmale_AttributeGroup_Mastschild()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Mastschild'"
	 * @generated
	 */
	Mastschild_TypeClass getMastschild();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getMastschild <em>Mastschild</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mastschild</em>' containment reference.
	 * @see #getMastschild()
	 * @generated
	 */
	void setMastschild(Mastschild_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Schutzstrecke Erforderlich</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hinter dem Zielsignal des Überwachungsabschnitts für die gewählte Freigabegeschwindigkeit geforderte Soll-Länge der Schutzstrecke.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schutzstrecke Erforderlich</em>' containment reference.
	 * @see #setSchutzstreckeErforderlich(Schutzstrecke_Erforderlich_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ZBS_Merkmale_AttributeGroup_SchutzstreckeErforderlich()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Schutzstrecke_Erforderlich'"
	 * @generated
	 */
	Schutzstrecke_Erforderlich_TypeClass getSchutzstreckeErforderlich();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getSchutzstreckeErforderlich <em>Schutzstrecke Erforderlich</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schutzstrecke Erforderlich</em>' containment reference.
	 * @see #getSchutzstreckeErforderlich()
	 * @generated
	 */
	void setSchutzstreckeErforderlich(Schutzstrecke_Erforderlich_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Schutzstrecke Vorhanden</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Hinter dem Zielsignal des Überwachungsabschnitts vorhandene Ist-Länge der Schutzstrecke.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Schutzstrecke Vorhanden</em>' containment reference.
	 * @see #setSchutzstreckeVorhanden(Schutzstrecke_Vorhanden_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ZBS_Merkmale_AttributeGroup_SchutzstreckeVorhanden()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Schutzstrecke_Vorhanden'"
	 * @generated
	 */
	Schutzstrecke_Vorhanden_TypeClass getSchutzstreckeVorhanden();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getSchutzstreckeVorhanden <em>Schutzstrecke Vorhanden</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schutzstrecke Vorhanden</em>' containment reference.
	 * @see #getSchutzstreckeVorhanden()
	 * @generated
	 */
	void setSchutzstreckeVorhanden(Schutzstrecke_Vorhanden_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Telegrammnummer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Nummer des Fachtelegramms als Referenz für das Linking.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Telegrammnummer</em>' containment reference.
	 * @see #setTelegrammnummer(Telegrammnummer_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ZBS_Merkmale_AttributeGroup_Telegrammnummer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Telegrammnummer'"
	 * @generated
	 */
	Telegrammnummer_TypeClass getTelegrammnummer();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getTelegrammnummer <em>Telegrammnummer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Telegrammnummer</em>' containment reference.
	 * @see #getTelegrammnummer()
	 * @generated
	 */
	void setTelegrammnummer(Telegrammnummer_TypeClass value);

	/**
	 * Returns the value of the '<em><b>VBefehl R</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Befehlsfahrgeschwindigkeit für Rangierfahrt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VBefehl R</em>' containment reference.
	 * @see #setVBefehlR(V_Befehl_R_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ZBS_Merkmale_AttributeGroup_VBefehlR()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='V_Befehl_R'"
	 * @generated
	 */
	V_Befehl_R_TypeClass getVBefehlR();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getVBefehlR <em>VBefehl R</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VBefehl R</em>' containment reference.
	 * @see #getVBefehlR()
	 * @generated
	 */
	void setVBefehlR(V_Befehl_R_TypeClass value);

	/**
	 * Returns the value of the '<em><b>VBefehl Z</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Befehlsfahrgeschwindigkeit für Zugfahrt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VBefehl Z</em>' containment reference.
	 * @see #setVBefehlZ(V_Befehl_Z_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ZBS_Merkmale_AttributeGroup_VBefehlZ()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='V_Befehl_Z'"
	 * @generated
	 */
	V_Befehl_Z_TypeClass getVBefehlZ();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getVBefehlZ <em>VBefehl Z</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VBefehl Z</em>' containment reference.
	 * @see #getVBefehlZ()
	 * @generated
	 */
	void setVBefehlZ(V_Befehl_Z_TypeClass value);

	/**
	 * Returns the value of the '<em><b>VFrei</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Freigabegeschwindigkeit (release speed).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VFrei</em>' containment reference.
	 * @see #setVFrei(V_Frei_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ZBS_Merkmale_AttributeGroup_VFrei()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='V_Frei'"
	 * @generated
	 */
	V_Frei_TypeClass getVFrei();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getVFrei <em>VFrei</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VFrei</em>' containment reference.
	 * @see #getVFrei()
	 * @generated
	 */
	void setVFrei(V_Frei_TypeClass value);

	/**
	 * Returns the value of the '<em><b>VZul Strecke</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zulässige Geschwindigkeit im Bereich des Überwachungsabschnitts. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VZul Strecke</em>' containment reference.
	 * @see #setVZulStrecke(V_Zul_Strecke_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ZBS_Merkmale_AttributeGroup_VZulStrecke()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='V_Zul_Strecke'"
	 * @generated
	 */
	V_Zul_Strecke_TypeClass getVZulStrecke();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getVZulStrecke <em>VZul Strecke</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VZul Strecke</em>' containment reference.
	 * @see #getVZulStrecke()
	 * @generated
	 */
	void setVZulStrecke(V_Zul_Strecke_TypeClass value);

	/**
	 * Returns the value of the '<em><b>VGR1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Größte Überwachungsgeschwindigkeit im Überwachungsabschnitt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VGR1</em>' containment reference.
	 * @see #setVGR1(VGR_1_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ZBS_Merkmale_AttributeGroup_VGR1()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VGR_1'"
	 * @generated
	 */
	VGR_1_TypeClass getVGR1();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getVGR1 <em>VGR1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VGR1</em>' containment reference.
	 * @see #getVGR1()
	 * @generated
	 */
	void setVGR1(VGR_1_TypeClass value);

	/**
	 * Returns the value of the '<em><b>VGR2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Überwachungsgeschwindigkeit am Ende des Überwachungsabschnitts.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VGR2</em>' containment reference.
	 * @see #setVGR2(VGR_2_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getFT_ZBS_Merkmale_AttributeGroup_VGR2()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VGR_2'"
	 * @generated
	 */
	VGR_2_TypeClass getVGR2();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.FT_ZBS_Merkmale_AttributeGroup#getVGR2 <em>VGR2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VGR2</em>' containment reference.
	 * @see #getVGR2()
	 * @generated
	 */
	void setVGR2(VGR_2_TypeClass value);

} // FT_ZBS_Merkmale_AttributeGroup
