/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Basisobjekte;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LO Material Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Material_AttributeGroup#getLOAusgabestand <em>LO Ausgabestand</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Material_AttributeGroup#getLODatumHerstellung <em>LO Datum Herstellung</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Material_AttributeGroup#getLODBFreigabe <em>LODB Freigabe</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Material_AttributeGroup#getLOEMANr <em>LOEMA Nr</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Material_AttributeGroup#getLOFirmensachnummer <em>LO Firmensachnummer</em>}</li>
 *   <li>{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Material_AttributeGroup#getLOSeriennummer <em>LO Seriennummer</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage#getLO_Material_AttributeGroup()
 * @model extendedMetaData="name='CLO_Material' kind='elementOnly'"
 * @generated
 */
public interface LO_Material_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>LO Ausgabestand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ausgabe- bzw. Gerätestand.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LO Ausgabestand</em>' containment reference.
	 * @see #setLOAusgabestand(LO_Ausgabestand_TypeClass)
	 * @see org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage#getLO_Material_AttributeGroup_LOAusgabestand()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LO_Ausgabestand'"
	 * @generated
	 */
	LO_Ausgabestand_TypeClass getLOAusgabestand();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Material_AttributeGroup#getLOAusgabestand <em>LO Ausgabestand</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LO Ausgabestand</em>' containment reference.
	 * @see #getLOAusgabestand()
	 * @generated
	 */
	void setLOAusgabestand(LO_Ausgabestand_TypeClass value);

	/**
	 * Returns the value of the '<em><b>LO Datum Herstellung</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Produktionszeitpunkt des LO.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LO Datum Herstellung</em>' containment reference.
	 * @see #setLODatumHerstellung(LO_Datum_Herstellung_TypeClass)
	 * @see org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage#getLO_Material_AttributeGroup_LODatumHerstellung()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LO_Datum_Herstellung'"
	 * @generated
	 */
	LO_Datum_Herstellung_TypeClass getLODatumHerstellung();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Material_AttributeGroup#getLODatumHerstellung <em>LO Datum Herstellung</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LO Datum Herstellung</em>' containment reference.
	 * @see #getLODatumHerstellung()
	 * @generated
	 */
	void setLODatumHerstellung(LO_Datum_Herstellung_TypeClass value);

	/**
	 * Returns the value of the '<em><b>LODB Freigabe</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Art der von der DB Netz AG erteilten Freigabe (Erprobung oder Serienfreigabe).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LODB Freigabe</em>' containment reference.
	 * @see #setLODBFreigabe(LO_DB_Freigabe_TypeClass)
	 * @see org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage#getLO_Material_AttributeGroup_LODBFreigabe()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LO_DB_Freigabe'"
	 * @generated
	 */
	LO_DB_Freigabe_TypeClass getLODBFreigabe();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Material_AttributeGroup#getLODBFreigabe <em>LODB Freigabe</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LODB Freigabe</em>' containment reference.
	 * @see #getLODBFreigabe()
	 * @generated
	 */
	void setLODBFreigabe(LO_DB_Freigabe_TypeClass value);

	/**
	 * Returns the value of the '<em><b>LOEMA Nr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EMA-Nummer der DB (zur Nachbestellbarkeit des Ersatzeils über die DB-internen Beschaffungswege).
	 * Für LO ohne EMA-Nummer ist \"ohne EMA-Nummer\" anzugeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LOEMA Nr</em>' containment reference.
	 * @see #setLOEMANr(LO_EMA_Nr_TypeClass)
	 * @see org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage#getLO_Material_AttributeGroup_LOEMANr()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LO_EMA_Nr'"
	 * @generated
	 */
	LO_EMA_Nr_TypeClass getLOEMANr();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Material_AttributeGroup#getLOEMANr <em>LOEMA Nr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LOEMA Nr</em>' containment reference.
	 * @see #getLOEMANr()
	 * @generated
	 */
	void setLOEMANr(LO_EMA_Nr_TypeClass value);

	/**
	 * Returns the value of the '<em><b>LO Firmensachnummer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Firmensachnummer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LO Firmensachnummer</em>' containment reference.
	 * @see #setLOFirmensachnummer(LO_Firmensachnummer_TypeClass)
	 * @see org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage#getLO_Material_AttributeGroup_LOFirmensachnummer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LO_Firmensachnummer'"
	 * @generated
	 */
	LO_Firmensachnummer_TypeClass getLOFirmensachnummer();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Material_AttributeGroup#getLOFirmensachnummer <em>LO Firmensachnummer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LO Firmensachnummer</em>' containment reference.
	 * @see #getLOFirmensachnummer()
	 * @generated
	 */
	void setLOFirmensachnummer(LO_Firmensachnummer_TypeClass value);

	/**
	 * Returns the value of the '<em><b>LO Seriennummer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Seriennummer des Bauteils. Falls keine existiert, ist \"ohne Seriennummer\" einzutragen.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LO Seriennummer</em>' containment reference.
	 * @see #setLOSeriennummer(LO_Seriennummer_TypeClass)
	 * @see org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage#getLO_Material_AttributeGroup_LOSeriennummer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='LO_Seriennummer'"
	 * @generated
	 */
	LO_Seriennummer_TypeClass getLOSeriennummer();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.planpro.Basisobjekte.LO_Material_AttributeGroup#getLOSeriennummer <em>LO Seriennummer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LO Seriennummer</em>' containment reference.
	 * @see #getLOSeriennummer()
	 * @generated
	 */
	void setLOSeriennummer(LO_Seriennummer_TypeClass value);

} // LO_Material_AttributeGroup
