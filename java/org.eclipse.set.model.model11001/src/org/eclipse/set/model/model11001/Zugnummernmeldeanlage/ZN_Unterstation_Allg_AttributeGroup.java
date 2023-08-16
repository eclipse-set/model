/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Zugnummernmeldeanlage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZN Unterstation Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Unterstation_Allg_AttributeGroup#getBfKennung <em>Bf Kennung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Unterstation_Allg_AttributeGroup#getKoppelunterstation <em>Koppelunterstation</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Unterstation_Allg_AttributeGroup#getKUsZeittelegramm <em>KUs Zeittelegramm</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Unterstation_Allg_AttributeGroup#getZBSAdresse <em>ZBS Adresse</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Unterstation_Allg_AttributeGroup#getZBSAnbindung <em>ZBS Anbindung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Unterstation_Allg_AttributeGroup#getZeitsynchronisationFunkuhr <em>Zeitsynchronisation Funkuhr</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Unterstation_Allg_AttributeGroup#getZNUnterstationBfNr <em>ZN Unterstation Bf Nr</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Unterstation_Allg_AttributeGroup()
 * @model extendedMetaData="name='CZN_Unterstation_Allg' kind='elementOnly'"
 * @generated
 */
public interface ZN_Unterstation_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bf Kennung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der Bahnhofskennung. Die erste Ziffer gibt die Basis für die Bestimmung der Fehlnummernbereiche an (2 = 20, 5 = 50). In BZ-Bereichen kann die Vergabe von gleichen Bahnhofsadressen nicht ausgeschlossen werden. Es sind daher Bereiche mit eindeutiger Bahnhofsadresse festzulegen und zur Unterscheidung von Nachbarbereichen mit einer Bahnhofskennung zu markieren. Die Fehlnummernbereiche werden automatisch in Abhängigkeit der Bahnhofskennung gebildet (siehe Ril 819.0731A03 (3)). Dies gilt für alle Bauarten der ZN. DB-Regelwerk 819.0731A03 (3) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bf Kennung</em>' containment reference.
	 * @see #setBfKennung(Bf_Kennung_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Unterstation_Allg_AttributeGroup_BfKennung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bf_Kennung'"
	 * @generated
	 */
	Bf_Kennung_TypeClass getBfKennung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Unterstation_Allg_AttributeGroup#getBfKennung <em>Bf Kennung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bf Kennung</em>' containment reference.
	 * @see #getBfKennung()
	 * @generated
	 */
	void setBfKennung(Bf_Kennung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Koppelunterstation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob es sich um eine Koppelunterstation handelt. Bei einer Koppelunterstation treffen ein oder mehrere ZLV-Bus-Leitungen sowie eine ZBS zusammen. Eine Koppelunterstation hat somit immer eine Anbindung an die Betriebszentrale (BZ). Eine Unterstation hat eine oder mehrere Anbindung(en) an einen ZLV-Bus. DB-Regelwerk Für das Planungsdatum gibt es im Regelwerk der DB AG keine konkrete Vorgabe. Die Art der Unterstation ergibt sich aus dem ZLV-Bus-Konzept, welches die DB AG erstellt. 819.0731 5 (17). Koppelunterstationen erhalten eine ZBS-Anbindung. 819.0731 8 (1), 819.0731 8 (2), 819.0731 9 (7), 819.0731 A05. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Koppelunterstation</em>' containment reference.
	 * @see #setKoppelunterstation(Koppelunterstation_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Unterstation_Allg_AttributeGroup_Koppelunterstation()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Koppelunterstation'"
	 * @generated
	 */
	Koppelunterstation_TypeClass getKoppelunterstation();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Unterstation_Allg_AttributeGroup#getKoppelunterstation <em>Koppelunterstation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Koppelunterstation</em>' containment reference.
	 * @see #getKoppelunterstation()
	 * @generated
	 */
	void setKoppelunterstation(Koppelunterstation_TypeClass value);

	/**
	 * Returns the value of the '<em><b>KUs Zeittelegramm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob die Koppelunterstation (KUs) zur Zeitsynchronisation ein Zeittelegramm auf den ZLV-Bus sendet (true) oder nicht (false). Sind zwei
	 * KUs an einem ZLV-Bus angeschlossen, so darf jeweils nur eine KUs ein Zeittelegramm auf den ZLV-Bus senden. DB-Regelwerk 819.0731 5 (22)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>KUs Zeittelegramm</em>' containment reference.
	 * @see #setKUsZeittelegramm(KUs_Zeittelegramm_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Unterstation_Allg_AttributeGroup_KUsZeittelegramm()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='KUs_Zeittelegramm'"
	 * @generated
	 */
	KUs_Zeittelegramm_TypeClass getKUsZeittelegramm();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Unterstation_Allg_AttributeGroup#getKUsZeittelegramm <em>KUs Zeittelegramm</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KUs Zeittelegramm</em>' containment reference.
	 * @see #getKUsZeittelegramm()
	 * @generated
	 */
	void setKUsZeittelegramm(KUs_Zeittelegramm_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ZBS Adresse</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der ZBS-Adresse (KUs-Kennung) für die Koppelunterstation. Bei einer MUs (Mehrfachunterstation) bzw. Us (Unterstation) wird das Attribut nicht gefüllt. Die Angabe erfolgt hexadezimal. DB-Regelwerk 819.0731 5 (16) 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZBS Adresse</em>' containment reference.
	 * @see #setZBSAdresse(ZBS_Adresse_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Unterstation_Allg_AttributeGroup_ZBSAdresse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ZBS_Adresse'"
	 * @generated
	 */
	ZBS_Adresse_TypeClass getZBSAdresse();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Unterstation_Allg_AttributeGroup#getZBSAdresse <em>ZBS Adresse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZBS Adresse</em>' containment reference.
	 * @see #getZBSAdresse()
	 * @generated
	 */
	void setZBSAdresse(ZBS_Adresse_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ZBS Anbindung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Die Unterstation erhält eine ZBS-Anbindung. DB-Regelwerk 819.0731 8 (1) 819.0731 8 (2) 819.0731 9 (7) 819.0731A05 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ZBS Anbindung</em>' containment reference.
	 * @see #setZBSAnbindung(ZBS_Anbindung_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Unterstation_Allg_AttributeGroup_ZBSAnbindung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZBS_Anbindung'"
	 * @generated
	 */
	ZBS_Anbindung_TypeClass getZBSAnbindung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Unterstation_Allg_AttributeGroup#getZBSAnbindung <em>ZBS Anbindung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ZBS Anbindung</em>' containment reference.
	 * @see #getZBSAnbindung()
	 * @generated
	 */
	void setZBSAnbindung(ZBS_Anbindung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Zeitsynchronisation Funkuhr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob eine Zeitsynchronisation über Funkuhr zu projektieren is (true). Bei Benutzung der Funkuhr darf keine Zeitsynchronisation über den ZLV-Bus (Telegramm 80) oder über Network-Time-Protocol (ntp) erfolgen. Der Wert \"false\" wird nicht verwendet. DB-Regelwerk Ril 819.0731 2 (4)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Zeitsynchronisation Funkuhr</em>' containment reference.
	 * @see #setZeitsynchronisationFunkuhr(Zeitsynchronisation_Funkuhr_TypeClass)
	 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Unterstation_Allg_AttributeGroup_ZeitsynchronisationFunkuhr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Zeitsynchronisation_Funkuhr'"
	 * @generated
	 */
	Zeitsynchronisation_Funkuhr_TypeClass getZeitsynchronisationFunkuhr();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Unterstation_Allg_AttributeGroup#getZeitsynchronisationFunkuhr <em>Zeitsynchronisation Funkuhr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zeitsynchronisation Funkuhr</em>' containment reference.
	 * @see #getZeitsynchronisationFunkuhr()
	 * @generated
	 */
	void setZeitsynchronisationFunkuhr(Zeitsynchronisation_Funkuhr_TypeClass value);

	/**
	 * Returns the value of the '<em><b>ZN Unterstation Bf Nr</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZN_Unterstation_Bf_Nr_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ZN Unterstation Bf Nr</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage#getZN_Unterstation_Allg_AttributeGroup_ZNUnterstationBfNr()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ZN_Unterstation_Bf_Nr'"
	 * @generated
	 */
	EList<ZN_Unterstation_Bf_Nr_AttributeGroup> getZNUnterstationBfNr();

} // ZN_Unterstation_Allg_AttributeGroup
