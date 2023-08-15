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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZBS Signal Signalabstand Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZBS_Signal_Signalabstand_AttributeGroup#getAbstandReduziert <em>Abstand Reduziert</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZBS_Signal_Signalabstand_AttributeGroup#getMassgebendeNeigungMindSig <em>Massgebende Neigung Mind Sig</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZBS_Signal_Signalabstand_AttributeGroup#getMassgebendeNeigungMindSig150 <em>Massgebende Neigung Mind Sig150</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZBS_Signal_Signalabstand_AttributeGroup#getSolllaengeMindSig <em>Solllaenge Mind Sig</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZBS_Signal_Signalabstand_AttributeGroup#getSolllaengeMindSig150 <em>Solllaenge Mind Sig150</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZBS_Signal_Signalabstand_AttributeGroup()
 * @model extendedMetaData="name='CZBS_Signal_Signalabstand' kind='elementOnly'"
 * @generated
 */
public interface ZBS_Signal_Signalabstand_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Abstand Reduziert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Kennzeichnung, ob für die Berechnung des Mindestsignalabstandes bei Zielgeschwindigkeit Null abweichend von der Regel (1,25) der Faktor 1,0 angewendet wird.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Abstand Reduziert</em>' containment reference.
	 * @see #setAbstandReduziert(Abstand_Reduziert_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZBS_Signal_Signalabstand_AttributeGroup_AbstandReduziert()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Abstand_Reduziert'"
	 * @generated
	 */
	Abstand_Reduziert_TypeClass getAbstandReduziert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZBS_Signal_Signalabstand_AttributeGroup#getAbstandReduziert <em>Abstand Reduziert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstand Reduziert</em>' containment reference.
	 * @see #getAbstandReduziert()
	 * @generated
	 */
	void setAbstandReduziert(Abstand_Reduziert_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Massgebende Neigung Mind Sig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maßgebende Neigung im Bereich des Mindestsignalabstands in Promille.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Massgebende Neigung Mind Sig</em>' containment reference.
	 * @see #setMassgebendeNeigungMindSig(Massgebende_Neigung_Mind_Sig_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZBS_Signal_Signalabstand_AttributeGroup_MassgebendeNeigungMindSig()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Massgebende_Neigung_Mind_Sig'"
	 * @generated
	 */
	Massgebende_Neigung_Mind_Sig_TypeClass getMassgebendeNeigungMindSig();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZBS_Signal_Signalabstand_AttributeGroup#getMassgebendeNeigungMindSig <em>Massgebende Neigung Mind Sig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Massgebende Neigung Mind Sig</em>' containment reference.
	 * @see #getMassgebendeNeigungMindSig()
	 * @generated
	 */
	void setMassgebendeNeigungMindSig(Massgebende_Neigung_Mind_Sig_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Massgebende Neigung Mind Sig150</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maßgebende Neigung im Bereich des Mindestsignalabstands zuzüglich 150 m in Promille.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Massgebende Neigung Mind Sig150</em>' containment reference.
	 * @see #setMassgebendeNeigungMindSig150(Massgebende_Neigung_Mind_Sig_150_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZBS_Signal_Signalabstand_AttributeGroup_MassgebendeNeigungMindSig150()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Massgebende_Neigung_Mind_Sig_150'"
	 * @generated
	 */
	Massgebende_Neigung_Mind_Sig_150_TypeClass getMassgebendeNeigungMindSig150();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZBS_Signal_Signalabstand_AttributeGroup#getMassgebendeNeigungMindSig150 <em>Massgebende Neigung Mind Sig150</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Massgebende Neigung Mind Sig150</em>' containment reference.
	 * @see #getMassgebendeNeigungMindSig150()
	 * @generated
	 */
	void setMassgebendeNeigungMindSig150(Massgebende_Neigung_Mind_Sig_150_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Solllaenge Mind Sig</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Soll-Abstand zum Zielsignal unter Berücksichtigung der maßgebenden Neigung im Bereich des Mindestsignalabstands.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Solllaenge Mind Sig</em>' containment reference.
	 * @see #setSolllaengeMindSig(Solllaenge_Mind_Sig_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZBS_Signal_Signalabstand_AttributeGroup_SolllaengeMindSig()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Solllaenge_Mind_Sig'"
	 * @generated
	 */
	Solllaenge_Mind_Sig_TypeClass getSolllaengeMindSig();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZBS_Signal_Signalabstand_AttributeGroup#getSolllaengeMindSig <em>Solllaenge Mind Sig</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solllaenge Mind Sig</em>' containment reference.
	 * @see #getSolllaengeMindSig()
	 * @generated
	 */
	void setSolllaengeMindSig(Solllaenge_Mind_Sig_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Solllaenge Mind Sig150</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Soll-Abstand zum Zielsignal unter Berücksichtigung der maßgebenden Neigung im Bereich des Mindestsignalabstands zuzüglich 150 m.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Solllaenge Mind Sig150</em>' containment reference.
	 * @see #setSolllaengeMindSig150(Solllaenge_Mind_Sig_150_TypeClass)
	 * @see org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage#getZBS_Signal_Signalabstand_AttributeGroup_SolllaengeMindSig150()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Solllaenge_Mind_Sig_150'"
	 * @generated
	 */
	Solllaenge_Mind_Sig_150_TypeClass getSolllaengeMindSig150();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Balisentechnik_ETCS.ZBS_Signal_Signalabstand_AttributeGroup#getSolllaengeMindSig150 <em>Solllaenge Mind Sig150</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Solllaenge Mind Sig150</em>' containment reference.
	 * @see #getSolllaengeMindSig150()
	 * @generated
	 */
	void setSolllaengeMindSig150(Solllaenge_Mind_Sig_150_TypeClass value);

} // ZBS_Signal_Signalabstand_AttributeGroup
