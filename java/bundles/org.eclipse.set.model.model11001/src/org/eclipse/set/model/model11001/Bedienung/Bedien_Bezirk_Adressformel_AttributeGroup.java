/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bedienung;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bedien Bezirk Adressformel Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup#getAWert <em>AWert</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup#getBWert <em>BWert</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup#getCWert <em>CWert</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup#getDDWert <em>DD Wert</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup#getXWert <em>XWert</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup#getYWert <em>YWert</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup#getYYWert <em>YY Wert</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_Bezirk_Adressformel_AttributeGroup()
 * @model extendedMetaData="name='CBedien_Bezirk_Adressformel' kind='elementOnly'"
 * @generated
 */
public interface Bedien_Bezirk_Adressformel_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>AWert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vorgabewert für Rechneradressen gemäß Adressformel für die Kommunikation zwischen Bedien Bezirk (Steuerbezirk) und ESTW Zentraleinheit (Unterzentrale). DB-Regelwerk Der A-Wert wird gemäß 819.0705 Abschnitt 6 (9) und (10) gebildet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>AWert</em>' containment reference.
	 * @see #setAWert(A_Wert_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_Bezirk_Adressformel_AttributeGroup_AWert()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='A_Wert'"
	 * @generated
	 */
	A_Wert_TypeClass getAWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup#getAWert <em>AWert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AWert</em>' containment reference.
	 * @see #getAWert()
	 * @generated
	 */
	void setAWert(A_Wert_TypeClass value);

	/**
	 * Returns the value of the '<em><b>BWert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vorgabewert für Rechneradressen gemäß Adressformel für die Kommunikation zwischen Bedien Bezirk (Steuerbezirk) und ESTW Zentraleinheit (Unterzentrale). DB-Regelwerk Der B-Wert wird gemäß 819.0705 Abschnitt 6 (9) und (10) gebildet. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BWert</em>' containment reference.
	 * @see #setBWert(B_Wert_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_Bezirk_Adressformel_AttributeGroup_BWert()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='B_Wert'"
	 * @generated
	 */
	B_Wert_TypeClass getBWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup#getBWert <em>BWert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BWert</em>' containment reference.
	 * @see #getBWert()
	 * @generated
	 */
	void setBWert(B_Wert_TypeClass value);

	/**
	 * Returns the value of the '<em><b>CWert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vorgabewert für Rechneradressen gemäß Adressformel für die Kommunikation zwischen Bedien Bezirk (Steuerbezirk) und ESTW Zentraleinheit (Unterzentrale). DB-Regelwerk Der C-Wert wird gemäß 819.0705 Abschnitt 6 (8) gebildet. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CWert</em>' containment reference.
	 * @see #setCWert(C_Wert_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_Bezirk_Adressformel_AttributeGroup_CWert()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='C_Wert'"
	 * @generated
	 */
	C_Wert_TypeClass getCWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup#getCWert <em>CWert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CWert</em>' containment reference.
	 * @see #getCWert()
	 * @generated
	 */
	void setCWert(C_Wert_TypeClass value);

	/**
	 * Returns the value of the '<em><b>DD Wert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vorgabewert für Rechneradressen gemäß Adressformel für die Kommunikation zwischen Bedien Bezirk (Steuerbezirk) und ESTW Zentraleinheit (Unterzentrale). DB-Regelwerk Der DD-Wert wird gemäß 819.0705 Abschnitt 6 (11) gebildet. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DD Wert</em>' containment reference.
	 * @see #setDDWert(DD_Wert_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_Bezirk_Adressformel_AttributeGroup_DDWert()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DD_Wert'"
	 * @generated
	 */
	DD_Wert_TypeClass getDDWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup#getDDWert <em>DD Wert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DD Wert</em>' containment reference.
	 * @see #getDDWert()
	 * @generated
	 */
	void setDDWert(DD_Wert_TypeClass value);

	/**
	 * Returns the value of the '<em><b>XWert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vorgabewert für Rechneradressen gemäß Adressformel für die Kommunikation zwischen Bedien Bezirk (Steuerbezirk) und ESTW Zentraleinheit (Unterzentrale). DB-Regelwerk Der X-Wert wird gemäß 819.0705 Abschnitt 6 (5) und (7) gebildet. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>XWert</em>' containment reference.
	 * @see #setXWert(X_Wert_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_Bezirk_Adressformel_AttributeGroup_XWert()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='X_Wert'"
	 * @generated
	 */
	X_Wert_TypeClass getXWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup#getXWert <em>XWert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XWert</em>' containment reference.
	 * @see #getXWert()
	 * @generated
	 */
	void setXWert(X_Wert_TypeClass value);

	/**
	 * Returns the value of the '<em><b>YWert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vorgabewert für Rechneradressen gemäß Adressformel für die Kommunikation zwischen Bedien Bezirk (Steuerbezirk) und ESTW Zentraleinheit (Unterzentrale). DB-Regelwerk Der Y-Wert wird gemäß 819.0705 Abschnitt 6 (5) und (7) gebildet. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YWert</em>' containment reference.
	 * @see #setYWert(Y_Wert_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_Bezirk_Adressformel_AttributeGroup_YWert()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Y_Wert'"
	 * @generated
	 */
	Y_Wert_TypeClass getYWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup#getYWert <em>YWert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YWert</em>' containment reference.
	 * @see #getYWert()
	 * @generated
	 */
	void setYWert(Y_Wert_TypeClass value);

	/**
	 * Returns the value of the '<em><b>YY Wert</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vorgabewert für Rechneradressen gemäß Adressformel für die Kommunikation zwischen Bedien Bezirk (Steuerbezirk) und ESTW Zentraleinheit (Unterzentrale). DB-Regelwerk Der YY-Wert wird gemäß 819.0705 Abschnitt 6 (8) gebildet. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>YY Wert</em>' containment reference.
	 * @see #setYYWert(YY_Wert_TypeClass)
	 * @see org.eclipse.set.model.model11001.Bedienung.BedienungPackage#getBedien_Bezirk_Adressformel_AttributeGroup_YYWert()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='YY_Wert'"
	 * @generated
	 */
	YY_Wert_TypeClass getYYWert();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Bedienung.Bedien_Bezirk_Adressformel_AttributeGroup#getYYWert <em>YY Wert</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>YY Wert</em>' containment reference.
	 * @see #getYYWert()
	 * @generated
	 */
	void setYYWert(YY_Wert_TypeClass value);

} // Bedien_Bezirk_Adressformel_AttributeGroup
