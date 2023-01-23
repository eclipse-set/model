/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Flankenschutz.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.set.model.model11001.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.model11001.Flankenschutz.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Flankenschutz.FlankenschutzPackage
 * @generated
 */
public class FlankenschutzSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FlankenschutzPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlankenschutzSwitch() {
		if (modelPackage == null) {
			modelPackage = FlankenschutzPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case FlankenschutzPackage.EKW_KR_ANTEIL_TYPE_CLASS: {
				EKW_Kr_Anteil_TypeClass ekW_Kr_Anteil_TypeClass = (EKW_Kr_Anteil_TypeClass)theEObject;
				T result = caseEKW_Kr_Anteil_TypeClass(ekW_Kr_Anteil_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(ekW_Kr_Anteil_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlankenschutzPackage.FAHRT_UEBER_TYPE_CLASS: {
				Fahrt_Ueber_TypeClass fahrt_Ueber_TypeClass = (Fahrt_Ueber_TypeClass)theEObject;
				T result = caseFahrt_Ueber_TypeClass(fahrt_Ueber_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fahrt_Ueber_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlankenschutzPackage.FLA_FREIMELDE_ZUORDNUNG: {
				Fla_Freimelde_Zuordnung fla_Freimelde_Zuordnung = (Fla_Freimelde_Zuordnung)theEObject;
				T result = caseFla_Freimelde_Zuordnung(fla_Freimelde_Zuordnung);
				if (result == null) result = caseBasis_Objekt(fla_Freimelde_Zuordnung);
				if (result == null) result = caseUr_Objekt(fla_Freimelde_Zuordnung);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlankenschutzPackage.FLA_RAUM_FREIMELDUNG_TYPE_CLASS: {
				Fla_Raum_Freimeldung_TypeClass fla_Raum_Freimeldung_TypeClass = (Fla_Raum_Freimeldung_TypeClass)theEObject;
				T result = caseFla_Raum_Freimeldung_TypeClass(fla_Raum_Freimeldung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fla_Raum_Freimeldung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlankenschutzPackage.FLA_SCHUTZ: {
				Fla_Schutz fla_Schutz = (Fla_Schutz)theEObject;
				T result = caseFla_Schutz(fla_Schutz);
				if (result == null) result = caseBasis_Objekt(fla_Schutz);
				if (result == null) result = caseUr_Objekt(fla_Schutz);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlankenschutzPackage.FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP: {
				Fla_Schutz_Anforderer_AttributeGroup fla_Schutz_Anforderer_AttributeGroup = (Fla_Schutz_Anforderer_AttributeGroup)theEObject;
				T result = caseFla_Schutz_Anforderer_AttributeGroup(fla_Schutz_Anforderer_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlankenschutzPackage.FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP: {
				Fla_Schutz_Signal_AttributeGroup fla_Schutz_Signal_AttributeGroup = (Fla_Schutz_Signal_AttributeGroup)theEObject;
				T result = caseFla_Schutz_Signal_AttributeGroup(fla_Schutz_Signal_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlankenschutzPackage.FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP: {
				Fla_Schutz_W_Gsp_AttributeGroup fla_Schutz_W_Gsp_AttributeGroup = (Fla_Schutz_W_Gsp_AttributeGroup)theEObject;
				T result = caseFla_Schutz_W_Gsp_AttributeGroup(fla_Schutz_W_Gsp_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlankenschutzPackage.FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP: {
				Fla_Schutz_Weitergabe_AttributeGroup fla_Schutz_Weitergabe_AttributeGroup = (Fla_Schutz_Weitergabe_AttributeGroup)theEObject;
				T result = caseFla_Schutz_Weitergabe_AttributeGroup(fla_Schutz_Weitergabe_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlankenschutzPackage.FLA_SIGNAL_ZIELSPERRUNG_TYPE_CLASS: {
				Fla_Signal_Zielsperrung_TypeClass fla_Signal_Zielsperrung_TypeClass = (Fla_Signal_Zielsperrung_TypeClass)theEObject;
				T result = caseFla_Signal_Zielsperrung_TypeClass(fla_Signal_Zielsperrung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fla_Signal_Zielsperrung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlankenschutzPackage.FLA_VERZICHT_TYPE_CLASS: {
				Fla_Verzicht_TypeClass fla_Verzicht_TypeClass = (Fla_Verzicht_TypeClass)theEObject;
				T result = caseFla_Verzicht_TypeClass(fla_Verzicht_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fla_Verzicht_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlankenschutzPackage.FLA_WLAGE_TYPE_CLASS: {
				Fla_W_Lage_TypeClass fla_W_Lage_TypeClass = (Fla_W_Lage_TypeClass)theEObject;
				T result = caseFla_W_Lage_TypeClass(fla_W_Lage_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fla_W_Lage_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlankenschutzPackage.FLA_ZWIESCHUTZ: {
				Fla_Zwieschutz fla_Zwieschutz = (Fla_Zwieschutz)theEObject;
				T result = caseFla_Zwieschutz(fla_Zwieschutz);
				if (result == null) result = caseBasis_Objekt(fla_Zwieschutz);
				if (result == null) result = caseUr_Objekt(fla_Zwieschutz);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlankenschutzPackage.FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP: {
				Fla_Zwieschutz_Element_AttributeGroup fla_Zwieschutz_Element_AttributeGroup = (Fla_Zwieschutz_Element_AttributeGroup)theEObject;
				T result = caseFla_Zwieschutz_Element_AttributeGroup(fla_Zwieschutz_Element_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlankenschutzPackage.MASSNAHME_TYPE_CLASS: {
				Massnahme_TypeClass massnahme_TypeClass = (Massnahme_TypeClass)theEObject;
				T result = caseMassnahme_TypeClass(massnahme_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(massnahme_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlankenschutzPackage.NACHLAUFVERHINDERUNG_TYPE_CLASS: {
				Nachlaufverhinderung_TypeClass nachlaufverhinderung_TypeClass = (Nachlaufverhinderung_TypeClass)theEObject;
				T result = caseNachlaufverhinderung_TypeClass(nachlaufverhinderung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(nachlaufverhinderung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case FlankenschutzPackage.ZWIESCHUTZ_ART_TYPE_CLASS: {
				Zwieschutz_Art_TypeClass zwieschutz_Art_TypeClass = (Zwieschutz_Art_TypeClass)theEObject;
				T result = caseZwieschutz_Art_TypeClass(zwieschutz_Art_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(zwieschutz_Art_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EKW Kr Anteil Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EKW Kr Anteil Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEKW_Kr_Anteil_TypeClass(EKW_Kr_Anteil_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fahrt Ueber Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fahrt Ueber Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFahrt_Ueber_TypeClass(Fahrt_Ueber_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fla Freimelde Zuordnung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fla Freimelde Zuordnung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFla_Freimelde_Zuordnung(Fla_Freimelde_Zuordnung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fla Raum Freimeldung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fla Raum Freimeldung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFla_Raum_Freimeldung_TypeClass(Fla_Raum_Freimeldung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fla Schutz</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fla Schutz</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFla_Schutz(Fla_Schutz object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fla Schutz Anforderer Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fla Schutz Anforderer Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFla_Schutz_Anforderer_AttributeGroup(Fla_Schutz_Anforderer_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fla Schutz Signal Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fla Schutz Signal Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFla_Schutz_Signal_AttributeGroup(Fla_Schutz_Signal_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fla Schutz WGsp Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fla Schutz WGsp Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFla_Schutz_W_Gsp_AttributeGroup(Fla_Schutz_W_Gsp_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fla Schutz Weitergabe Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fla Schutz Weitergabe Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFla_Schutz_Weitergabe_AttributeGroup(Fla_Schutz_Weitergabe_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fla Signal Zielsperrung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fla Signal Zielsperrung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFla_Signal_Zielsperrung_TypeClass(Fla_Signal_Zielsperrung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fla Verzicht Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fla Verzicht Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFla_Verzicht_TypeClass(Fla_Verzicht_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fla WLage Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fla WLage Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFla_W_Lage_TypeClass(Fla_W_Lage_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fla Zwieschutz</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fla Zwieschutz</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFla_Zwieschutz(Fla_Zwieschutz object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fla Zwieschutz Element Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fla Zwieschutz Element Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFla_Zwieschutz_Element_AttributeGroup(Fla_Zwieschutz_Element_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Massnahme Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Massnahme Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMassnahme_TypeClass(Massnahme_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Nachlaufverhinderung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Nachlaufverhinderung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNachlaufverhinderung_TypeClass(Nachlaufverhinderung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zwieschutz Art Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zwieschutz Art Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZwieschutz_Art_TypeClass(Zwieschutz_Art_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basis Attribut Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basis Attribut Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasisAttribut_AttributeGroup(BasisAttribut_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ur Objekt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ur Objekt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUr_Objekt(Ur_Objekt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basis Objekt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basis Objekt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasis_Objekt(Basis_Objekt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FlankenschutzSwitch
