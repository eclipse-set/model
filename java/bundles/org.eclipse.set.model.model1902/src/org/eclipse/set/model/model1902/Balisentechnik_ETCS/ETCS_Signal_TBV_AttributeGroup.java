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
 * A representation of the model object '<em><b>ETCS Signal TBV Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Signal_TBV_AttributeGroup#getTBVMeldepunkt <em>TBV Meldepunkt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Signal_TBV_AttributeGroup#getTBVTunnelbereichLaenge <em>TBV Tunnelbereich Laenge</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Signal_TBV_AttributeGroup#getTBVTunnelsignal <em>TBV Tunnelsignal</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal_TBV_AttributeGroup()
 * @model extendedMetaData="name='CETCS_Signal_TBV' kind='elementOnly'"
 * @generated
 */
public interface ETCS_Signal_TBV_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>TBV Meldepunkt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob das Signal als Meldepunkt für das TBV-System (Tunnelbegegnungsverbot) verwendet wird (true). TBV-Meldepunkte werden im Rahmen der TBV-Planung festgelegt.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TBV Meldepunkt</em>' containment reference.
	 * @see #setTBVMeldepunkt(TBV_Meldepunkt_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal_TBV_AttributeGroup_TBVMeldepunkt()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TBV_Meldepunkt'"
	 * @generated
	 */
	TBV_Meldepunkt_TypeClass getTBVMeldepunkt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Signal_TBV_AttributeGroup#getTBVMeldepunkt <em>TBV Meldepunkt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TBV Meldepunkt</em>' containment reference.
	 * @see #getTBVMeldepunkt()
	 * @generated
	 */
	void setTBVMeldepunkt(TBV_Meldepunkt_TypeClass value);

	/**
	 * Returns the value of the '<em><b>TBV Tunnelbereich Laenge</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der Tunnelbereichslänge gemäß TBV-Planung, sofern das Signal als Tunnelportalsignal geplant ist (Signal, das die Einfahrt in einen Tunnel ermöglicht).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TBV Tunnelbereich Laenge</em>' containment reference.
	 * @see #setTBVTunnelbereichLaenge(TBV_Tunnelbereich_Laenge_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal_TBV_AttributeGroup_TBVTunnelbereichLaenge()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TBV_Tunnelbereich_Laenge'"
	 * @generated
	 */
	TBV_Tunnelbereich_Laenge_TypeClass getTBVTunnelbereichLaenge();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Signal_TBV_AttributeGroup#getTBVTunnelbereichLaenge <em>TBV Tunnelbereich Laenge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TBV Tunnelbereich Laenge</em>' containment reference.
	 * @see #getTBVTunnelbereichLaenge()
	 * @generated
	 */
	void setTBVTunnelbereichLaenge(TBV_Tunnelbereich_Laenge_TypeClass value);

	/**
	 * Returns the value of the '<em><b>TBV Tunnelsignal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, ob das Signal für das TBV-System ein Tunnelsignal ist (alle Signale zwischen Tunnelportalsignal und dem Abstand der maximalen Zuglänge hinter dem Tunnel). Die Festlegung erfolgt im Rahmen der TBV-Planung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TBV Tunnelsignal</em>' containment reference.
	 * @see #setTBVTunnelsignal(TBV_Tunnelsignal_TypeClass)
	 * @see org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getETCS_Signal_TBV_AttributeGroup_TBVTunnelsignal()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='TBV_Tunnelsignal'"
	 * @generated
	 */
	TBV_Tunnelsignal_TypeClass getTBVTunnelsignal();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Balisentechnik_ETCS.ETCS_Signal_TBV_AttributeGroup#getTBVTunnelsignal <em>TBV Tunnelsignal</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TBV Tunnelsignal</em>' containment reference.
	 * @see #getTBVTunnelsignal()
	 * @generated
	 */
	void setTBVTunnelsignal(TBV_Tunnelsignal_TypeClass value);

} // ETCS_Signal_TBV_AttributeGroup
