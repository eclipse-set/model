/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Balisentechnik_ETCS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LEU Anlage Moduleigenschaften Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Anlage_Moduleigenschaften_AttributeGroup#getLEUAusgangNr <em>LEU Ausgang Nr</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Anlage_Moduleigenschaften_AttributeGroup()
 * @model extendedMetaData="name='CLEU_Anlage_Moduleigenschaften' kind='elementOnly'"
 * @generated
 */
public interface LEU_Anlage_Moduleigenschaften_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>LEU Ausgang Nr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Planerisch vergebene Nummer des genutzten LEU-Ausgangs für die Ansteuerung der Balisen des Datenpunkts. \nBei Verwendung in Datenpunkt: Angabe des für diesen DP genutzen LEU-Ausgangs im Sinne einer Referenz. Mehrere Ausgänge werden bei DP mit mehreren gesteuerten Balisen benötigt.\nBei Verwendung in LEU_Anlage: Definition des LEU-Ausgangs für die entsprechendes LEU-Anlage. Die Port-Nr. muss in Bezug auf die LEU-Anlage eindeutig sein.\nBei Verwendung in LEU_Modul: Zuordnung des LEU-Ausgangs zu einem LEU-Modul. Weiterhin wird dem LEU-Ausgang vom Hersteller eine Portnummer zugeordnet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LEU Ausgang Nr</em>' containment reference.
	 * @see #setLEUAusgangNr(LEU_Ausgang_Nr_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getLEU_Anlage_Moduleigenschaften_AttributeGroup_LEUAusgangNr()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='LEU_Ausgang_Nr'"
	 * @generated
	 */
	LEU_Ausgang_Nr_TypeClass getLEUAusgangNr();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.LEU_Anlage_Moduleigenschaften_AttributeGroup#getLEUAusgangNr <em>LEU Ausgang Nr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LEU Ausgang Nr</em>' containment reference.
	 * @see #getLEUAusgangNr()
	 * @generated
	 */
	void setLEUAusgangNr(LEU_Ausgang_Nr_TypeClass value);

} // LEU_Anlage_Moduleigenschaften_AttributeGroup
