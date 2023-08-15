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

import org.eclipse.set.model.model11001.Verweise.ID_Information_Eingang_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_LEU_Anlage_ohne_Proxy_TypeClass;
import org.eclipse.set.model.model11001.Verweise.ID_LEU_Schaltkasten_ohne_Proxy_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LEU Modul</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Elektronische Baugruppe zur Ansteuerung von Balisen in Abhängigkeit von Eingangsinformationen. Ein LEU-Modul ist in einem LEU-Schaltkasten untergebracht.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.LEU_Modul#getBezeichnung <em>Bezeichnung</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.LEU_Modul#getIDInformationEingang <em>ID Information Eingang</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.LEU_Modul#getIDLEUAnlage <em>IDLEU Anlage</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.LEU_Modul#getIDLEUSchaltkasten <em>IDLEU Schaltkasten</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.LEU_Modul#getLEUModulAllg <em>LEU Modul Allg</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.LEU_Modul#getLEUModulAusgang <em>LEU Modul Ausgang</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Modul()
 * @model extendedMetaData="name='CLEU_Modul' kind='elementOnly'"
 * @generated
 */
public interface LEU_Modul extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>Bezeichnung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #setBezeichnung(LEU_Modul_Bezeichnung_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Modul_Bezeichnung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Bezeichnung'"
	 * @generated
	 */
	LEU_Modul_Bezeichnung_AttributeGroup getBezeichnung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.LEU_Modul#getBezeichnung <em>Bezeichnung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bezeichnung</em>' containment reference.
	 * @see #getBezeichnung()
	 * @generated
	 */
	void setBezeichnung(LEU_Modul_Bezeichnung_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>ID Information Eingang</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.Verweise.ID_Information_Eingang_TypeClass}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die Quelle(n) der Eingangsinformationen, sofern dieses LEU-Modul Eingangsinformationen aufnimmt. Über eine Aussenelementansteuerung können auch Informationen von Objekten bezogen werden, die nicht im Stellbereich dieser Aussenelementansteuerung liegen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Information Eingang</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Modul_IDInformationEingang()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Information_Eingang'"
	 * @generated
	 */
	EList<ID_Information_Eingang_TypeClass> getIDInformationEingang();

	/**
	 * Returns the value of the '<em><b>IDLEU Anlage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die LEU-Anlage, zu der das LEU-Modul gehört.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDLEU Anlage</em>' containment reference.
	 * @see #setIDLEUAnlage(ID_LEU_Anlage_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Modul_IDLEUAnlage()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_LEU_Anlage'"
	 * @generated
	 */
	ID_LEU_Anlage_ohne_Proxy_TypeClass getIDLEUAnlage();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.LEU_Modul#getIDLEUAnlage <em>IDLEU Anlage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDLEU Anlage</em>' containment reference.
	 * @see #getIDLEUAnlage()
	 * @generated
	 */
	void setIDLEUAnlage(ID_LEU_Anlage_ohne_Proxy_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDLEU Schaltkasten</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf den LEU-Schaltkasten, in dem das LEU-Modul untergebracht ist. Es können LEU-Module verschiedener LEU-Anlagen in einem LEU-Schaltkasten untergebracht sein. Die Angabe entfällt bei ESG.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDLEU Schaltkasten</em>' containment reference.
	 * @see #setIDLEUSchaltkasten(ID_LEU_Schaltkasten_ohne_Proxy_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Modul_IDLEUSchaltkasten()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_LEU_Schaltkasten'"
	 * @generated
	 */
	ID_LEU_Schaltkasten_ohne_Proxy_TypeClass getIDLEUSchaltkasten();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.LEU_Modul#getIDLEUSchaltkasten <em>IDLEU Schaltkasten</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDLEU Schaltkasten</em>' containment reference.
	 * @see #getIDLEUSchaltkasten()
	 * @generated
	 */
	void setIDLEUSchaltkasten(ID_LEU_Schaltkasten_ohne_Proxy_TypeClass value);

	/**
	 * Returns the value of the '<em><b>LEU Modul Allg</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LEU Modul Allg</em>' containment reference.
	 * @see #setLEUModulAllg(LEU_Modul_Allg_AttributeGroup)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Modul_LEUModulAllg()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LEU_Modul_Allg'"
	 * @generated
	 */
	LEU_Modul_Allg_AttributeGroup getLEUModulAllg();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.LEU_Modul#getLEUModulAllg <em>LEU Modul Allg</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LEU Modul Allg</em>' containment reference.
	 * @see #getLEUModulAllg()
	 * @generated
	 */
	void setLEUModulAllg(LEU_Modul_Allg_AttributeGroup value);

	/**
	 * Returns the value of the '<em><b>LEU Modul Ausgang</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.LEU_Modul_Ausgang_AttributeGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Attributgruppe zur Zuordnung von Ausgängen des LEU-Moduls zu Balisen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LEU Modul Ausgang</em>' containment reference list.
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Modul_LEUModulAusgang()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LEU_Modul_Ausgang'"
	 * @generated
	 */
	EList<LEU_Modul_Ausgang_AttributeGroup> getLEUModulAusgang();

} // LEU_Modul
