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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model11001.Verweise.ID_Balise_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LEU Modul Ausgang Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.LEU_Modul_Ausgang_AttributeGroup#getIDBalise <em>ID Balise</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.LEU_Modul_Ausgang_AttributeGroup#getLEUAusgangNr <em>LEU Ausgang Nr</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.LEU_Modul_Ausgang_AttributeGroup#getPortNrAusgPhysisch <em>Port Nr Ausg Physisch</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Modul_Ausgang_AttributeGroup()
 * @model extendedMetaData="name='CLEU_Modul_Ausgang' kind='elementOnly'"
 * @generated
 */
public interface LEU_Modul_Ausgang_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>ID Balise</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Verweis auf die über den angegebenen Ausgang angesteuerte Balise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Balise</em>' containment reference.
	 * @see #setIDBalise(ID_Balise_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Modul_Ausgang_AttributeGroup_IDBalise()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ID_Balise'"
	 * @generated
	 */
	ID_Balise_TypeClass getIDBalise();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.LEU_Modul_Ausgang_AttributeGroup#getIDBalise <em>ID Balise</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Balise</em>' containment reference.
	 * @see #getIDBalise()
	 * @generated
	 */
	void setIDBalise(ID_Balise_TypeClass value);

	/**
	 * Returns the value of the '<em><b>LEU Ausgang Nr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Planerisch vergebene Nummer des genutzten LEU-Ausgangs für die Ansteuerung der Balisen des Datenpunkts. 
	 * Bei Verwendung in Datenpunkt: Angabe des für diesen DP genutzen LEU-Ausgangs im Sinne einer Referenz. Mehrere Ausgänge werden bei DP mit mehreren gesteuerten Balisen benötigt.
	 * Bei Verwendung in LEU_Modul: Zuordnung des LEU-Ausgangs zu einem LEU-Modul. Weiterhin wird dem LEU-Ausgang vom Hersteller eine Portnummer zugeordnet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LEU Ausgang Nr</em>' containment reference.
	 * @see #setLEUAusgangNr(LEU_Ausgang_Nr_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Modul_Ausgang_AttributeGroup_LEUAusgangNr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LEU_Ausgang_Nr'"
	 * @generated
	 */
	LEU_Ausgang_Nr_TypeClass getLEUAusgangNr();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.LEU_Modul_Ausgang_AttributeGroup#getLEUAusgangNr <em>LEU Ausgang Nr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LEU Ausgang Nr</em>' containment reference.
	 * @see #getLEUAusgangNr()
	 * @generated
	 */
	void setLEUAusgangNr(LEU_Ausgang_Nr_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Port Nr Ausg Physisch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Durch den Hersteller vergebene Nummer des Ports, über den Informationen an die Balise ausgegeben werden. Die Angabe kann von LEU_Ausgang_Nr abweichen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Nr Ausg Physisch</em>' containment reference.
	 * @see #setPortNrAusgPhysisch(Port_Nr_Ausg_Physisch_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Modul_Ausgang_AttributeGroup_PortNrAusgPhysisch()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Port_Nr_Ausg_Physisch'"
	 * @generated
	 */
	Port_Nr_Ausg_Physisch_TypeClass getPortNrAusgPhysisch();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.LEU_Modul_Ausgang_AttributeGroup#getPortNrAusgPhysisch <em>Port Nr Ausg Physisch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Nr Ausg Physisch</em>' containment reference.
	 * @see #getPortNrAusgPhysisch()
	 * @generated
	 */
	void setPortNrAusgPhysisch(Port_Nr_Ausg_Physisch_TypeClass value);

} // LEU_Modul_Ausgang_AttributeGroup
