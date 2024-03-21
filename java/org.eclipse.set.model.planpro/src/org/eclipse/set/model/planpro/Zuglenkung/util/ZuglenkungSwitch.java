/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Zuglenkung.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.set.model.planpro.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.planpro.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.planpro.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.planpro.Zuglenkung.*;

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
 * @see org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage
 * @generated
 */
public class ZuglenkungSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ZuglenkungPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZuglenkungSwitch() {
		if (modelPackage == null) {
			modelPackage = ZuglenkungPackage.eINSTANCE;
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
			case ZuglenkungPackage.ANNAEHERUNGSGESCHWINDIGKEIT_TYPE_CLASS: {
				Annaeherungsgeschwindigkeit_TypeClass annaeherungsgeschwindigkeit_TypeClass = (Annaeherungsgeschwindigkeit_TypeClass)theEObject;
				T result = caseAnnaeherungsgeschwindigkeit_TypeClass(annaeherungsgeschwindigkeit_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(annaeherungsgeschwindigkeit_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZuglenkungPackage.ANZAHL_WIEDERHOL_ZL_ANSTOESSE_TYPE_CLASS: {
				Anzahl_Wiederhol_ZL_Anstoesse_TypeClass anzahl_Wiederhol_ZL_Anstoesse_TypeClass = (Anzahl_Wiederhol_ZL_Anstoesse_TypeClass)theEObject;
				T result = caseAnzahl_Wiederhol_ZL_Anstoesse_TypeClass(anzahl_Wiederhol_ZL_Anstoesse_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(anzahl_Wiederhol_ZL_Anstoesse_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZuglenkungPackage.DEADLOCKPRUEFUNG_TYPE_CLASS: {
				Deadlockpruefung_TypeClass deadlockpruefung_TypeClass = (Deadlockpruefung_TypeClass)theEObject;
				T result = caseDeadlockpruefung_TypeClass(deadlockpruefung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(deadlockpruefung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZuglenkungPackage.DWEG_PRIO_TYPE_CLASS: {
				DWeg_Prio_TypeClass dWeg_Prio_TypeClass = (DWeg_Prio_TypeClass)theEObject;
				T result = caseDWeg_Prio_TypeClass(dWeg_Prio_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(dWeg_Prio_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZuglenkungPackage.EINSTELLKONTROLLZEIT_TYPE_CLASS: {
				Einstellkontrollzeit_TypeClass einstellkontrollzeit_TypeClass = (Einstellkontrollzeit_TypeClass)theEObject;
				T result = caseEinstellkontrollzeit_TypeClass(einstellkontrollzeit_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(einstellkontrollzeit_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZuglenkungPackage.FSTR_BILDEZEIT_TYPE_CLASS: {
				Fstr_Bildezeit_TypeClass fstr_Bildezeit_TypeClass = (Fstr_Bildezeit_TypeClass)theEObject;
				T result = caseFstr_Bildezeit_TypeClass(fstr_Bildezeit_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fstr_Bildezeit_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZuglenkungPackage.FUEM_AUSWERTUNG_TYPE_CLASS: {
				FUEM_Auswertung_TypeClass fueM_Auswertung_TypeClass = (FUEM_Auswertung_TypeClass)theEObject;
				T result = caseFUEM_Auswertung_TypeClass(fueM_Auswertung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(fueM_Auswertung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZuglenkungPackage.GK_TYPE_CLASS: {
				GK_TypeClass gK_TypeClass = (GK_TypeClass)theEObject;
				T result = caseGK_TypeClass(gK_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(gK_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZuglenkungPackage.GKZSS_TYPE_CLASS: {
				GKZSS_TypeClass gkzsS_TypeClass = (GKZSS_TypeClass)theEObject;
				T result = caseGKZSS_TypeClass(gkzsS_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(gkzsS_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZuglenkungPackage.LENKABBRUCHZEIT_TYPE_CLASS: {
				Lenkabbruchzeit_TypeClass lenkabbruchzeit_TypeClass = (Lenkabbruchzeit_TypeClass)theEObject;
				T result = caseLenkabbruchzeit_TypeClass(lenkabbruchzeit_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(lenkabbruchzeit_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZuglenkungPackage.LENKZIFFERNSTELLEN_TYPE_CLASS: {
				Lenkziffernstellen_TypeClass lenkziffernstellen_TypeClass = (Lenkziffernstellen_TypeClass)theEObject;
				T result = caseLenkziffernstellen_TypeClass(lenkziffernstellen_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(lenkziffernstellen_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZuglenkungPackage.PERSONAL_REAKTIONSZEIT_TYPE_CLASS: {
				Personal_Reaktionszeit_TypeClass personal_Reaktionszeit_TypeClass = (Personal_Reaktionszeit_TypeClass)theEObject;
				T result = casePersonal_Reaktionszeit_TypeClass(personal_Reaktionszeit_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(personal_Reaktionszeit_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZuglenkungPackage.SICHTZEIT_VORSIGNAL_TYPE_CLASS: {
				Sichtzeit_Vorsignal_TypeClass sichtzeit_Vorsignal_TypeClass = (Sichtzeit_Vorsignal_TypeClass)theEObject;
				T result = caseSichtzeit_Vorsignal_TypeClass(sichtzeit_Vorsignal_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(sichtzeit_Vorsignal_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZuglenkungPackage.SIGNALGRUPPE_BEZEICHNER_TYPE_CLASS: {
				Signalgruppe_Bezeichner_TypeClass signalgruppe_Bezeichner_TypeClass = (Signalgruppe_Bezeichner_TypeClass)theEObject;
				T result = caseSignalgruppe_Bezeichner_TypeClass(signalgruppe_Bezeichner_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(signalgruppe_Bezeichner_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZuglenkungPackage.TV_GK_TYPE_CLASS: {
				Tv_GK_TypeClass tv_GK_TypeClass = (Tv_GK_TypeClass)theEObject;
				T result = caseTv_GK_TypeClass(tv_GK_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(tv_GK_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZuglenkungPackage.VMAX_ANNAEHERUNG_TYPE_CLASS: {
				Vmax_Annaeherung_TypeClass vmax_Annaeherung_TypeClass = (Vmax_Annaeherung_TypeClass)theEObject;
				T result = caseVmax_Annaeherung_TypeClass(vmax_Annaeherung_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(vmax_Annaeherung_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZuglenkungPackage.ZL: {
				ZL zl = (ZL)theEObject;
				T result = caseZL(zl);
				if (result == null) result = caseBasis_Objekt(zl);
				if (result == null) result = caseUr_Objekt(zl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZuglenkungPackage.ZL_ALLG_ATTRIBUTE_GROUP: {
				ZL_Allg_AttributeGroup zL_Allg_AttributeGroup = (ZL_Allg_AttributeGroup)theEObject;
				T result = caseZL_Allg_AttributeGroup(zL_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZuglenkungPackage.ZL_DLP_ABSCHNITT: {
				ZL_DLP_Abschnitt zL_DLP_Abschnitt = (ZL_DLP_Abschnitt)theEObject;
				T result = caseZL_DLP_Abschnitt(zL_DLP_Abschnitt);
				if (result == null) result = caseBasis_Objekt(zL_DLP_Abschnitt);
				if (result == null) result = caseUr_Objekt(zL_DLP_Abschnitt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZuglenkungPackage.ZL_DLP_FSTR: {
				ZL_DLP_Fstr zL_DLP_Fstr = (ZL_DLP_Fstr)theEObject;
				T result = caseZL_DLP_Fstr(zL_DLP_Fstr);
				if (result == null) result = caseBasis_Objekt(zL_DLP_Fstr);
				if (result == null) result = caseUr_Objekt(zL_DLP_Fstr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZuglenkungPackage.ZL_FSTR: {
				ZL_Fstr zL_Fstr = (ZL_Fstr)theEObject;
				T result = caseZL_Fstr(zL_Fstr);
				if (result == null) result = caseBasis_Objekt(zL_Fstr);
				if (result == null) result = caseUr_Objekt(zL_Fstr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZuglenkungPackage.ZL_FSTR_ALLG_ATTRIBUTE_GROUP: {
				ZL_Fstr_Allg_AttributeGroup zL_Fstr_Allg_AttributeGroup = (ZL_Fstr_Allg_AttributeGroup)theEObject;
				T result = caseZL_Fstr_Allg_AttributeGroup(zL_Fstr_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS: {
				ZL_Fstr_Anstoss zL_Fstr_Anstoss = (ZL_Fstr_Anstoss)theEObject;
				T result = caseZL_Fstr_Anstoss(zL_Fstr_Anstoss);
				if (result == null) result = caseBasis_Objekt(zL_Fstr_Anstoss);
				if (result == null) result = caseUr_Objekt(zL_Fstr_Anstoss);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP: {
				ZL_Fstr_Anstoss_Allg_AttributeGroup zL_Fstr_Anstoss_Allg_AttributeGroup = (ZL_Fstr_Anstoss_Allg_AttributeGroup)theEObject;
				T result = caseZL_Fstr_Anstoss_Allg_AttributeGroup(zL_Fstr_Anstoss_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZuglenkungPackage.ZL_FSTR_ANSTOSS_GK_ATTRIBUTE_GROUP: {
				ZL_Fstr_Anstoss_GK_AttributeGroup zL_Fstr_Anstoss_GK_AttributeGroup = (ZL_Fstr_Anstoss_GK_AttributeGroup)theEObject;
				T result = caseZL_Fstr_Anstoss_GK_AttributeGroup(zL_Fstr_Anstoss_GK_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZuglenkungPackage.ZL_FSTR_ZUSCHLAG_TYPE_CLASS: {
				ZL_Fstr_Zuschlag_TypeClass zL_Fstr_Zuschlag_TypeClass = (ZL_Fstr_Zuschlag_TypeClass)theEObject;
				T result = caseZL_Fstr_Zuschlag_TypeClass(zL_Fstr_Zuschlag_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(zL_Fstr_Zuschlag_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZuglenkungPackage.ZL_SIGNALGRUPPE: {
				ZL_Signalgruppe zL_Signalgruppe = (ZL_Signalgruppe)theEObject;
				T result = caseZL_Signalgruppe(zL_Signalgruppe);
				if (result == null) result = caseBasis_Objekt(zL_Signalgruppe);
				if (result == null) result = caseUr_Objekt(zL_Signalgruppe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZuglenkungPackage.ZL_SIGNALGRUPPE_ALLG_ATTRIBUTE_GROUP: {
				ZL_Signalgruppe_Allg_AttributeGroup zL_Signalgruppe_Allg_AttributeGroup = (ZL_Signalgruppe_Allg_AttributeGroup)theEObject;
				T result = caseZL_Signalgruppe_Allg_AttributeGroup(zL_Signalgruppe_Allg_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZuglenkungPackage.ZL_SIGNALGRUPPE_ZUORDNUNG: {
				ZL_Signalgruppe_Zuordnung zL_Signalgruppe_Zuordnung = (ZL_Signalgruppe_Zuordnung)theEObject;
				T result = caseZL_Signalgruppe_Zuordnung(zL_Signalgruppe_Zuordnung);
				if (result == null) result = caseBasis_Objekt(zL_Signalgruppe_Zuordnung);
				if (result == null) result = caseUr_Objekt(zL_Signalgruppe_Zuordnung);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZuglenkungPackage.ZL_ZN_ATTRIBUTE_GROUP: {
				ZL_ZN_AttributeGroup zL_ZN_AttributeGroup = (ZL_ZN_AttributeGroup)theEObject;
				T result = caseZL_ZN_AttributeGroup(zL_ZN_AttributeGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ZuglenkungPackage.ZN_STELLEN_TYPE_CLASS: {
				ZN_Stellen_TypeClass zN_Stellen_TypeClass = (ZN_Stellen_TypeClass)theEObject;
				T result = caseZN_Stellen_TypeClass(zN_Stellen_TypeClass);
				if (result == null) result = caseBasisAttribut_AttributeGroup(zN_Stellen_TypeClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Annaeherungsgeschwindigkeit Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Annaeherungsgeschwindigkeit Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnnaeherungsgeschwindigkeit_TypeClass(Annaeherungsgeschwindigkeit_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Anzahl Wiederhol ZL Anstoesse Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Anzahl Wiederhol ZL Anstoesse Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAnzahl_Wiederhol_ZL_Anstoesse_TypeClass(Anzahl_Wiederhol_ZL_Anstoesse_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Deadlockpruefung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Deadlockpruefung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDeadlockpruefung_TypeClass(Deadlockpruefung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DWeg Prio Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DWeg Prio Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDWeg_Prio_TypeClass(DWeg_Prio_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Einstellkontrollzeit Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Einstellkontrollzeit Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEinstellkontrollzeit_TypeClass(Einstellkontrollzeit_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fstr Bildezeit Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fstr Bildezeit Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFstr_Bildezeit_TypeClass(Fstr_Bildezeit_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FUEM Auswertung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FUEM Auswertung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFUEM_Auswertung_TypeClass(FUEM_Auswertung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GK Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GK Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGK_TypeClass(GK_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>GKZSS Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>GKZSS Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGKZSS_TypeClass(GKZSS_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lenkabbruchzeit Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lenkabbruchzeit Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLenkabbruchzeit_TypeClass(Lenkabbruchzeit_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lenkziffernstellen Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lenkziffernstellen Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLenkziffernstellen_TypeClass(Lenkziffernstellen_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Personal Reaktionszeit Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Personal Reaktionszeit Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonal_Reaktionszeit_TypeClass(Personal_Reaktionszeit_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sichtzeit Vorsignal Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sichtzeit Vorsignal Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSichtzeit_Vorsignal_TypeClass(Sichtzeit_Vorsignal_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signalgruppe Bezeichner Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signalgruppe Bezeichner Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalgruppe_Bezeichner_TypeClass(Signalgruppe_Bezeichner_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tv GK Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tv GK Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTv_GK_TypeClass(Tv_GK_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vmax Annaeherung Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vmax Annaeherung Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVmax_Annaeherung_TypeClass(Vmax_Annaeherung_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZL</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZL</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZL(ZL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZL Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZL Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZL_Allg_AttributeGroup(ZL_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZL DLP Abschnitt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZL DLP Abschnitt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZL_DLP_Abschnitt(ZL_DLP_Abschnitt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZL DLP Fstr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZL DLP Fstr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZL_DLP_Fstr(ZL_DLP_Fstr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZL Fstr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZL Fstr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZL_Fstr(ZL_Fstr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZL Fstr Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZL Fstr Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZL_Fstr_Allg_AttributeGroup(ZL_Fstr_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZL Fstr Anstoss</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZL Fstr Anstoss</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZL_Fstr_Anstoss(ZL_Fstr_Anstoss object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZL Fstr Anstoss Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZL Fstr Anstoss Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZL_Fstr_Anstoss_Allg_AttributeGroup(ZL_Fstr_Anstoss_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZL Fstr Anstoss GK Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZL Fstr Anstoss GK Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZL_Fstr_Anstoss_GK_AttributeGroup(ZL_Fstr_Anstoss_GK_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZL Fstr Zuschlag Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZL Fstr Zuschlag Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZL_Fstr_Zuschlag_TypeClass(ZL_Fstr_Zuschlag_TypeClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZL Signalgruppe</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZL Signalgruppe</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZL_Signalgruppe(ZL_Signalgruppe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZL Signalgruppe Allg Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZL Signalgruppe Allg Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZL_Signalgruppe_Allg_AttributeGroup(ZL_Signalgruppe_Allg_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZL Signalgruppe Zuordnung</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZL Signalgruppe Zuordnung</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZL_Signalgruppe_Zuordnung(ZL_Signalgruppe_Zuordnung object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZL ZN Attribute Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZL ZN Attribute Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZL_ZN_AttributeGroup(ZL_ZN_AttributeGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ZN Stellen Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ZN Stellen Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZN_Stellen_TypeClass(ZN_Stellen_TypeClass object) {
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

} //ZuglenkungSwitch
