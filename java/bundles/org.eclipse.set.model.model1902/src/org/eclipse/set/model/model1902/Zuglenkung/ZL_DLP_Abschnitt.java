/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Zuglenkung;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;

import org.eclipse.set.model.model1902.Verweise.ID_Gleis_Abschnitt_TypeClass;
import org.eclipse.set.model.model1902.Verweise.ID_ZL_DLP_Fstr_TypeClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ZL DLP Abschnitt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Sammlung der Gleisabschnitte, die in ZL DLP Fstr eingebunden werden und für die eine Prüfung auf Deadlock erfolgen muss. DB-Regelwerk TM 2011-024 I.NVT 3 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model1902.Zuglenkung.ZL_DLP_Abschnitt#getIDGleisAbschnitt <em>ID Gleis Abschnitt</em>}</li>
 *   <li>{@link org.eclipse.set.model.model1902.Zuglenkung.ZL_DLP_Abschnitt#getIDZLDLPFstr <em>IDZLDLP Fstr</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model1902.Zuglenkung.ZuglenkungPackage#getZL_DLP_Abschnitt()
 * @model extendedMetaData="name='CZL_DLP_Abschnitt' kind='elementOnly'"
 * @generated
 */
public interface ZL_DLP_Abschnitt extends Basis_Objekt {
	/**
	 * Returns the value of the '<em><b>ID Gleis Abschnitt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe, welcher Freimeldeabschnitt geprüft werden muss.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ID Gleis Abschnitt</em>' containment reference.
	 * @see #setIDGleisAbschnitt(ID_Gleis_Abschnitt_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zuglenkung.ZuglenkungPackage#getZL_DLP_Abschnitt_IDGleisAbschnitt()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_Gleis_Abschnitt'"
	 * @generated
	 */
	ID_Gleis_Abschnitt_TypeClass getIDGleisAbschnitt();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zuglenkung.ZL_DLP_Abschnitt#getIDGleisAbschnitt <em>ID Gleis Abschnitt</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID Gleis Abschnitt</em>' containment reference.
	 * @see #getIDGleisAbschnitt()
	 * @generated
	 */
	void setIDGleisAbschnitt(ID_Gleis_Abschnitt_TypeClass value);

	/**
	 * Returns the value of the '<em><b>IDZLDLP Fstr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Angabe der ZL DLP Fstr, für welche die Gleisabschnitte UND-verknüpft werden müssen. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDZLDLP Fstr</em>' containment reference.
	 * @see #setIDZLDLPFstr(ID_ZL_DLP_Fstr_TypeClass)
	 * @see org.eclipse.set.model.model1902.Zuglenkung.ZuglenkungPackage#getZL_DLP_Abschnitt_IDZLDLPFstr()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='ID_ZL_DLP_Fstr'"
	 * @generated
	 */
	ID_ZL_DLP_Fstr_TypeClass getIDZLDLPFstr();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model1902.Zuglenkung.ZL_DLP_Abschnitt#getIDZLDLPFstr <em>IDZLDLP Fstr</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDZLDLP Fstr</em>' containment reference.
	 * @see #getIDZLDLPFstr()
	 * @generated
	 */
	void setIDZLDLPFstr(ID_ZL_DLP_Fstr_TypeClass value);

} // ZL_DLP_Abschnitt
