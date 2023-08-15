/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.*;

import org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass;

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
 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Signalbegriffe_Ril_301Package
 * @generated
 */
public class Signalbegriffe_Ril_301Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Signalbegriffe_Ril_301Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signalbegriffe_Ril_301Switch() {
		if (modelPackage == null) {
			modelPackage = Signalbegriffe_Ril_301Package.eINSTANCE;
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
			case Signalbegriffe_Ril_301Package.BSVAUES: {
				BSVAUES bsvaues = (BSVAUES)theEObject;
				T result = caseBSVAUES(bsvaues);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(bsvaues);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.BSVRVA: {
				BSVRVA bsvrva = (BSVRVA)theEObject;
				T result = caseBSVRVA(bsvrva);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(bsvrva);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.BS_WDH: {
				BSWdh bsWdh = (BSWdh)theEObject;
				T result = caseBSWdh(bsWdh);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(bsWdh);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.BSZBS_BER: {
				BSZBSBer bszbsBer = (BSZBSBer)theEObject;
				T result = caseBSZBSBer(bszbsBer);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(bszbsBer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.BS_ZUSATZ: {
				BSZusatz bsZusatz = (BSZusatz)theEObject;
				T result = caseBSZusatz(bsZusatz);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(bsZusatz);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.BUE00_LP: {
				Bue00Lp bue00Lp = (Bue00Lp)theEObject;
				T result = caseBue00Lp(bue00Lp);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(bue00Lp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.BUE01_LP: {
				Bue01Lp bue01Lp = (Bue01Lp)theEObject;
				T result = caseBue01Lp(bue01Lp);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(bue01Lp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.BUE01_S: {
				Bue01S bue01S = (Bue01S)theEObject;
				T result = caseBue01S(bue01S);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(bue01S);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.BUE02_LP: {
				Bue02Lp bue02Lp = (Bue02Lp)theEObject;
				T result = caseBue02Lp(bue02Lp);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(bue02Lp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.BUE02_S: {
				Bue02S bue02S = (Bue02S)theEObject;
				T result = caseBue02S(bue02S);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(bue02S);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.BUE10_LP_BLI: {
				Bue10LpBli bue10LpBli = (Bue10LpBli)theEObject;
				T result = caseBue10LpBli(bue10LpBli);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(bue10LpBli);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.BUE11_LP_BLI: {
				Bue11LpBli bue11LpBli = (Bue11LpBli)theEObject;
				T result = caseBue11LpBli(bue11LpBli);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(bue11LpBli);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.BUE11_SBLI: {
				Bue11SBli bue11SBli = (Bue11SBli)theEObject;
				T result = caseBue11SBli(bue11SBli);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(bue11SBli);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.BUE12_LP_ST: {
				Bue12LpSt bue12LpSt = (Bue12LpSt)theEObject;
				T result = caseBue12LpSt(bue12LpSt);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(bue12LpSt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.BUE12_SST: {
				Bue12SSt bue12SSt = (Bue12SSt)theEObject;
				T result = caseBue12SSt(bue12SSt);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(bue12SSt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.BUE2: {
				Bue2 bue2 = (Bue2)theEObject;
				T result = caseBue2(bue2);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(bue2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.BUE21_R: {
				Bue21R bue21R = (Bue21R)theEObject;
				T result = caseBue21R(bue21R);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(bue21R);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.BUE22_R: {
				Bue22R bue22R = (Bue22R)theEObject;
				T result = caseBue22R(bue22R);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(bue22R);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.BUE23_R: {
				Bue23R bue23R = (Bue23R)theEObject;
				T result = caseBue23R(bue23R);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(bue23R);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.BUE3: {
				Bue3 bue3 = (Bue3)theEObject;
				T result = caseBue3(bue3);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(bue3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.BUE4: {
				Bue4 bue4 = (Bue4)theEObject;
				T result = caseBue4(bue4);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(bue4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.BUE5: {
				Bue5 bue5 = (Bue5)theEObject;
				T result = caseBue5(bue5);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(bue5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.BUE_AT: {
				BueAT bueAT = (BueAT)theEObject;
				T result = caseBueAT(bueAT);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(bueAT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.BUE_AT_ZUSATZ: {
				BueATZusatz bueATZusatz = (BueATZusatz)theEObject;
				T result = caseBueATZusatz(bueATZusatz);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.BUE_KT: {
				BueKT bueKT = (BueKT)theEObject;
				T result = caseBueKT(bueKT);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(bueKT);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.EL1: {
				El1 el1 = (El1)theEObject;
				T result = caseEl1(el1);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(el1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.EL1V: {
				El1v el1v = (El1v)theEObject;
				T result = caseEl1v(el1v);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(el1v);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.EL2: {
				El2 el2 = (El2)theEObject;
				T result = caseEl2(el2);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(el2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.EL3: {
				El3 el3 = (El3)theEObject;
				T result = caseEl3(el3);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(el3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.EL4: {
				El4 el4 = (El4)theEObject;
				T result = caseEl4(el4);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(el4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.EL5: {
				El5 el5 = (El5)theEObject;
				T result = caseEl5(el5);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(el5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.EL6: {
				El6 el6 = (El6)theEObject;
				T result = caseEl6(el6);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(el6);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.EL_PF_B: {
				ElPfB elPfB = (ElPfB)theEObject;
				T result = caseElPfB(elPfB);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(elPfB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.EL_PF_L: {
				ElPfL elPfL = (ElPfL)theEObject;
				T result = caseElPfL(elPfL);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(elPfL);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.EL_PF_O: {
				ElPfO elPfO = (ElPfO)theEObject;
				T result = caseElPfO(elPfO);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(elPfO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.EL_PF_R: {
				ElPfR elPfR = (ElPfR)theEObject;
				T result = caseElPfR(elPfR);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(elPfR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.EL_TAC: {
				ElTAC elTAC = (ElTAC)theEObject;
				T result = caseElTAC(elTAC);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(elTAC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.EL_TDC: {
				ElTDC elTDC = (ElTDC)theEObject;
				T result = caseElTDC(elTDC);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(elTDC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.HL1: {
				Hl1 hl1 = (Hl1)theEObject;
				T result = caseHl1(hl1);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(hl1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.HL10: {
				Hl10 hl10 = (Hl10)theEObject;
				T result = caseHl10(hl10);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(hl10);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.HL11: {
				Hl11 hl11 = (Hl11)theEObject;
				T result = caseHl11(hl11);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(hl11);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.HL12A: {
				Hl12a hl12a = (Hl12a)theEObject;
				T result = caseHl12a(hl12a);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(hl12a);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.HL12B: {
				Hl12b hl12b = (Hl12b)theEObject;
				T result = caseHl12b(hl12b);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(hl12b);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.HL2: {
				Hl2 hl2 = (Hl2)theEObject;
				T result = caseHl2(hl2);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(hl2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.HL3A: {
				Hl3a hl3a = (Hl3a)theEObject;
				T result = caseHl3a(hl3a);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(hl3a);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.HL3B: {
				Hl3b hl3b = (Hl3b)theEObject;
				T result = caseHl3b(hl3b);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(hl3b);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.HL4: {
				Hl4 hl4 = (Hl4)theEObject;
				T result = caseHl4(hl4);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(hl4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.HL5: {
				Hl5 hl5 = (Hl5)theEObject;
				T result = caseHl5(hl5);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(hl5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.HL6A: {
				Hl6a hl6a = (Hl6a)theEObject;
				T result = caseHl6a(hl6a);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(hl6a);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.HL6B: {
				Hl6b hl6b = (Hl6b)theEObject;
				T result = caseHl6b(hl6b);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(hl6b);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.HL7: {
				Hl7 hl7 = (Hl7)theEObject;
				T result = caseHl7(hl7);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(hl7);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.HL8: {
				Hl8 hl8 = (Hl8)theEObject;
				T result = caseHl8(hl8);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(hl8);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.HL9A: {
				Hl9a hl9a = (Hl9a)theEObject;
				T result = caseHl9a(hl9a);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(hl9a);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.HL9B: {
				Hl9b hl9b = (Hl9b)theEObject;
				T result = caseHl9b(hl9b);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(hl9b);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.HP0: {
				Hp0 hp0 = (Hp0)theEObject;
				T result = caseHp0(hp0);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(hp0);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.HP02_LP: {
				Hp02Lp hp02Lp = (Hp02Lp)theEObject;
				T result = caseHp02Lp(hp02Lp);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(hp02Lp);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.HP1: {
				Hp1 hp1 = (Hp1)theEObject;
				T result = caseHp1(hp1);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(hp1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.HP2: {
				Hp2 hp2 = (Hp2)theEObject;
				T result = caseHp2(hp2);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(hp2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.KL: {
				Kl kl = (Kl)theEObject;
				T result = caseKl(kl);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(kl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.KS1: {
				Ks1 ks1 = (Ks1)theEObject;
				T result = caseKs1(ks1);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ks1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.KS2: {
				Ks2 ks2 = (Ks2)theEObject;
				T result = caseKs2(ks2);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ks2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.LF1: {
				Lf1 lf1 = (Lf1)theEObject;
				T result = caseLf1(lf1);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(lf1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.LF12: {
				Lf12 lf12 = (Lf12)theEObject;
				T result = caseLf12(lf12);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(lf12);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.LF1_WDH: {
				Lf1Wdh lf1Wdh = (Lf1Wdh)theEObject;
				T result = caseLf1Wdh(lf1Wdh);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(lf1Wdh);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.LF2: {
				Lf2 lf2 = (Lf2)theEObject;
				T result = caseLf2(lf2);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(lf2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.LF3: {
				Lf3 lf3 = (Lf3)theEObject;
				T result = caseLf3(lf3);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(lf3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.LF4_DS: {
				Lf4DS lf4DS = (Lf4DS)theEObject;
				T result = caseLf4DS(lf4DS);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(lf4DS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.LF4_DV: {
				Lf4DV lf4DV = (Lf4DV)theEObject;
				T result = caseLf4DV(lf4DV);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(lf4DV);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.LF5_DS: {
				Lf5DS lf5DS = (Lf5DS)theEObject;
				T result = caseLf5DS(lf5DS);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(lf5DS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.LF5_DV: {
				Lf5DV lf5DV = (Lf5DV)theEObject;
				T result = caseLf5DV(lf5DV);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(lf5DV);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.LF6: {
				Lf6 lf6 = (Lf6)theEObject;
				T result = caseLf6(lf6);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(lf6);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.LF7: {
				Lf7 lf7 = (Lf7)theEObject;
				T result = caseLf7(lf7);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(lf7);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.LF_PF_L: {
				LfPfL lfPfL = (LfPfL)theEObject;
				T result = caseLfPfL(lfPfL);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(lfPfL);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.LF_PF_R: {
				LfPfR lfPfR = (LfPfR)theEObject;
				T result = caseLfPfR(lfPfR);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(lfPfR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.MS_GE_D: {
				MsGeD msGeD = (MsGeD)theEObject;
				T result = caseMsGeD(msGeD);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(msGeD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.MS_RT: {
				MsRt msRt = (MsRt)theEObject;
				T result = caseMsRt(msRt);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(msRt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.MS_SK_GE: {
				MsSkGe msSkGe = (MsSkGe)theEObject;
				T result = caseMsSkGe(msSkGe);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(msSkGe);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.MS_SK_RT: {
				MsSkRt msSkRt = (MsSkRt)theEObject;
				T result = caseMsSkRt(msSkRt);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(msSkRt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.MS_UES_WDH: {
				MsUESWdh msUESWdh = (MsUESWdh)theEObject;
				T result = caseMsUESWdh(msUESWdh);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(msUESWdh);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.MS_VW: {
				MsVw msVw = (MsVw)theEObject;
				T result = caseMsVw(msVw);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(msVw);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.MS_WS2SW_P: {
				MsWs2swP msWs2swP = (MsWs2swP)theEObject;
				T result = caseMsWs2swP(msWs2swP);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(msWs2swP);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.MS_WS_GE_WS: {
				MsWsGeWs msWsGeWs = (MsWsGeWs)theEObject;
				T result = caseMsWsGeWs(msWsGeWs);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(msWsGeWs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.MS_WS_RT_WS: {
				MsWsRtWs msWsRtWs = (MsWsRtWs)theEObject;
				T result = caseMsWsRtWs(msWsRtWs);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(msWsRtWs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.MS_WS_SW_WS: {
				MsWsSwWs msWsSwWs = (MsWsSwWs)theEObject;
				T result = caseMsWsSwWs(msWsSwWs);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(msWsSwWs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.NE1: {
				Ne1 ne1 = (Ne1)theEObject;
				T result = caseNe1(ne1);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ne1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.NE12: {
				Ne12 ne12 = (Ne12)theEObject;
				T result = caseNe12(ne12);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ne12);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.NE13A: {
				Ne13a ne13a = (Ne13a)theEObject;
				T result = caseNe13a(ne13a);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ne13a);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.NE13B: {
				Ne13b ne13b = (Ne13b)theEObject;
				T result = caseNe13b(ne13b);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ne13b);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.NE14: {
				Ne14 ne14 = (Ne14)theEObject;
				T result = caseNe14(ne14);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ne14);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.NE2: {
				Ne2 ne2 = (Ne2)theEObject;
				T result = caseNe2(ne2);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ne2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.NE2_VRVA: {
				Ne2VRVA ne2VRVA = (Ne2VRVA)theEObject;
				T result = caseNe2VRVA(ne2VRVA);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ne2VRVA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.NE31STR: {
				Ne31str ne31str = (Ne31str)theEObject;
				T result = caseNe31str(ne31str);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ne31str);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.NE32STR: {
				Ne32str ne32str = (Ne32str)theEObject;
				T result = caseNe32str(ne32str);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ne32str);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.NE33STR: {
				Ne33str ne33str = (Ne33str)theEObject;
				T result = caseNe33str(ne33str);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ne33str);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.NE34STR: {
				Ne34str ne34str = (Ne34str)theEObject;
				T result = caseNe34str(ne34str);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ne34str);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.NE35STR: {
				Ne35str ne35str = (Ne35str)theEObject;
				T result = caseNe35str(ne35str);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ne35str);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.NE4: {
				Ne4 ne4 = (Ne4)theEObject;
				T result = caseNe4(ne4);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ne4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.NE5: {
				Ne5 ne5 = (Ne5)theEObject;
				T result = caseNe5(ne5);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ne5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.NE6: {
				Ne6 ne6 = (Ne6)theEObject;
				T result = caseNe6(ne6);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ne6);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.NE7A: {
				Ne7a ne7a = (Ne7a)theEObject;
				T result = caseNe7a(ne7a);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ne7a);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.NE7B: {
				Ne7b ne7b = (Ne7b)theEObject;
				T result = caseNe7b(ne7b);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ne7b);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.OZ_AUTO_ET: {
				OzAutoET ozAutoET = (OzAutoET)theEObject;
				T result = caseOzAutoET(ozAutoET);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ozAutoET);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.OZ_AUTO_HET: {
				OzAutoHET ozAutoHET = (OzAutoHET)theEObject;
				T result = caseOzAutoHET(ozAutoHET);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ozAutoHET);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.OZ_BK: {
				OzBk ozBk = (OzBk)theEObject;
				T result = caseOzBk(ozBk);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ozBk);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.OZ_ET: {
				OzET ozET = (OzET)theEObject;
				T result = caseOzET(ozET);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ozET);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.OZ_FA: {
				OzFa ozFa = (OzFa)theEObject;
				T result = caseOzFa(ozFa);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ozFa);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.OZ_FAK: {
				OzFak ozFak = (OzFak)theEObject;
				T result = caseOzFak(ozFak);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.OZ_GSMR: {
				OzGSMR ozGSMR = (OzGSMR)theEObject;
				T result = caseOzGSMR(ozGSMR);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ozGSMR);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.OZ_HET: {
				OzHET ozHET = (OzHET)theEObject;
				T result = caseOzHET(ozHET);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ozHET);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.OZ_HM: {
				OzHM ozHM = (OzHM)theEObject;
				T result = caseOzHM(ozHM);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ozHM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.OZ_ICE: {
				OzICE ozICE = (OzICE)theEObject;
				T result = caseOzICE(ozICE);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ozICE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.OZ_LZB_BER: {
				OzLZBBer ozLZBBer = (OzLZBBer)theEObject;
				T result = caseOzLZBBer(ozLZBBer);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ozLZBBer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.OZ_OB_GRENZE: {
				OzOBGrenze ozOBGrenze = (OzOBGrenze)theEObject;
				T result = caseOzOBGrenze(ozOBGrenze);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ozOBGrenze);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.OZ_PZBBUE: {
				OzPZBBUE ozPZBBUE = (OzPZBBUE)theEObject;
				T result = caseOzPZBBUE(ozPZBBUE);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ozPZBBUE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.OZ_ZF: {
				OzZf ozZf = (OzZf)theEObject;
				T result = caseOzZf(ozZf);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ozZf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.OZ_ZUGL: {
				OzZugl ozZugl = (OzZugl)theEObject;
				T result = caseOzZugl(ozZugl);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.PF2: {
				Pf2 pf2 = (Pf2)theEObject;
				T result = casePf2(pf2);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(pf2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.RA10: {
				Ra10 ra10 = (Ra10)theEObject;
				T result = caseRa10(ra10);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ra10);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.RA11: {
				Ra11 ra11 = (Ra11)theEObject;
				T result = caseRa11(ra11);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ra11);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.RA11B: {
				Ra11b ra11b = (Ra11b)theEObject;
				T result = caseRa11b(ra11b);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ra11b);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.RA12: {
				Ra12 ra12 = (Ra12)theEObject;
				T result = caseRa12(ra12);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ra12);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.RA13: {
				Ra13 ra13 = (Ra13)theEObject;
				T result = caseRa13(ra13);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ra13);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.SH0: {
				Sh0 sh0 = (Sh0)theEObject;
				T result = caseSh0(sh0);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(sh0);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.SH1: {
				Sh1 sh1 = (Sh1)theEObject;
				T result = caseSh1(sh1);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(sh1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.SH2: {
				Sh2 sh2 = (Sh2)theEObject;
				T result = caseSh2(sh2);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(sh2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.SK1: {
				Sk1 sk1 = (Sk1)theEObject;
				T result = caseSk1(sk1);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(sk1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.SK2: {
				Sk2 sk2 = (Sk2)theEObject;
				T result = caseSk2(sk2);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(sk2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.SO1: {
				So1 so1 = (So1)theEObject;
				T result = caseSo1(so1);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(so1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.SO106: {
				So106 so106 = (So106)theEObject;
				T result = caseSo106(so106);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(so106);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.SO14: {
				So14 so14 = (So14)theEObject;
				T result = caseSo14(so14);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(so14);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.SO15: {
				So15 so15 = (So15)theEObject;
				T result = caseSo15(so15);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(so15);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.SO191_P: {
				So191P so191P = (So191P)theEObject;
				T result = caseSo191P(so191P);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(so191P);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.SO192_P: {
				So192P so192P = (So192P)theEObject;
				T result = caseSo192P(so192P);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(so192P);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.SO193_P: {
				So193P so193P = (So193P)theEObject;
				T result = caseSo193P(so193P);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(so193P);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.SO20: {
				So20 so20 = (So20)theEObject;
				T result = caseSo20(so20);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(so20);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.SV0: {
				Sv0 sv0 = (Sv0)theEObject;
				T result = caseSv0(sv0);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(sv0);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.SV1: {
				Sv1 sv1 = (Sv1)theEObject;
				T result = caseSv1(sv1);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(sv1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.SV2: {
				Sv2 sv2 = (Sv2)theEObject;
				T result = caseSv2(sv2);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(sv2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.SV3: {
				Sv3 sv3 = (Sv3)theEObject;
				T result = caseSv3(sv3);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(sv3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.SV4: {
				Sv4 sv4 = (Sv4)theEObject;
				T result = caseSv4(sv4);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(sv4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.SV5: {
				Sv5 sv5 = (Sv5)theEObject;
				T result = caseSv5(sv5);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(sv5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.SV6: {
				Sv6 sv6 = (Sv6)theEObject;
				T result = caseSv6(sv6);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(sv6);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.SV_WPF: {
				SvWPf svWPf = (SvWPf)theEObject;
				T result = caseSvWPf(svWPf);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(svWPf);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.TS1: {
				Ts1 ts1 = (Ts1)theEObject;
				T result = caseTs1(ts1);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ts1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.TS2: {
				Ts2 ts2 = (Ts2)theEObject;
				T result = caseTs2(ts2);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ts2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.TS3: {
				Ts3 ts3 = (Ts3)theEObject;
				T result = caseTs3(ts3);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ts3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.UKR: {
				Ukr ukr = (Ukr)theEObject;
				T result = caseUkr(ukr);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(ukr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.VR0: {
				Vr0 vr0 = (Vr0)theEObject;
				T result = caseVr0(vr0);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(vr0);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.VR1: {
				Vr1 vr1 = (Vr1)theEObject;
				T result = caseVr1(vr1);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(vr1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.VR2: {
				Vr2 vr2 = (Vr2)theEObject;
				T result = caseVr2(vr2);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(vr2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.WN1: {
				Wn1 wn1 = (Wn1)theEObject;
				T result = caseWn1(wn1);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(wn1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.WN2: {
				Wn2 wn2 = (Wn2)theEObject;
				T result = caseWn2(wn2);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(wn2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.WN3: {
				Wn3 wn3 = (Wn3)theEObject;
				T result = caseWn3(wn3);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(wn3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.WN4: {
				Wn4 wn4 = (Wn4)theEObject;
				T result = caseWn4(wn4);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(wn4);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.WN5: {
				Wn5 wn5 = (Wn5)theEObject;
				T result = caseWn5(wn5);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(wn5);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.WN6: {
				Wn6 wn6 = (Wn6)theEObject;
				T result = caseWn6(wn6);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(wn6);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.WN7: {
				Wn7 wn7 = (Wn7)theEObject;
				T result = caseWn7(wn7);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(wn7);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.WVS: {
				Wvs wvs = (Wvs)theEObject;
				T result = caseWvs(wvs);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(wvs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.ZL_O: {
				ZlO zlO = (ZlO)theEObject;
				T result = caseZlO(zlO);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(zlO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.ZL_U: {
				ZlU zlU = (ZlU)theEObject;
				T result = caseZlU(zlU);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(zlU);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.ZP10: {
				Zp10 zp10 = (Zp10)theEObject;
				T result = caseZp10(zp10);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(zp10);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.ZP10_LS: {
				Zp10Ls zp10Ls = (Zp10Ls)theEObject;
				T result = caseZp10Ls(zp10Ls);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(zp10Ls);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.ZP6: {
				Zp6 zp6 = (Zp6)theEObject;
				T result = caseZp6(zp6);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(zp6);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.ZP7: {
				Zp7 zp7 = (Zp7)theEObject;
				T result = caseZp7(zp7);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(zp7);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.ZP8: {
				Zp8 zp8 = (Zp8)theEObject;
				T result = caseZp8(zp8);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(zp8);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.ZP9: {
				Zp9 zp9 = (Zp9)theEObject;
				T result = caseZp9(zp9);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(zp9);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.ZP9_LS: {
				Zp9Ls zp9Ls = (Zp9Ls)theEObject;
				T result = caseZp9Ls(zp9Ls);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(zp9Ls);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.ZS1: {
				Zs1 zs1 = (Zs1)theEObject;
				T result = caseZs1(zs1);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(zs1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.ZS10: {
				Zs10 zs10 = (Zs10)theEObject;
				T result = caseZs10(zs10);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(zs10);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.ZS103: {
				Zs103 zs103 = (Zs103)theEObject;
				T result = caseZs103(zs103);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(zs103);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.ZS12: {
				Zs12 zs12 = (Zs12)theEObject;
				T result = caseZs12(zs12);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(zs12);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.ZS13: {
				Zs13 zs13 = (Zs13)theEObject;
				T result = caseZs13(zs13);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(zs13);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.ZS1_A: {
				Zs1A zs1A = (Zs1A)theEObject;
				T result = caseZs1A(zs1A);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(zs1A);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.ZS2: {
				Zs2 zs2 = (Zs2)theEObject;
				T result = caseZs2(zs2);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(zs2);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.ZS2V: {
				Zs2v zs2v = (Zs2v)theEObject;
				T result = caseZs2v(zs2v);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(zs2v);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.ZS3: {
				Zs3 zs3 = (Zs3)theEObject;
				T result = caseZs3(zs3);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(zs3);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.ZS3V: {
				Zs3v zs3v = (Zs3v)theEObject;
				T result = caseZs3v(zs3v);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(zs3v);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.ZS6: {
				Zs6 zs6 = (Zs6)theEObject;
				T result = caseZs6(zs6);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(zs6);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.ZS7: {
				Zs7 zs7 = (Zs7)theEObject;
				T result = caseZs7(zs7);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(zs7);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.ZS8: {
				Zs8 zs8 = (Zs8)theEObject;
				T result = caseZs8(zs8);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(zs8);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.ZS8_A: {
				Zs8A zs8A = (Zs8A)theEObject;
				T result = caseZs8A(zs8A);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(zs8A);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Signalbegriffe_Ril_301Package.ZS9: {
				Zs9 zs9 = (Zs9)theEObject;
				T result = caseZs9(zs9);
				if (result == null) result = caseSignalbegriff_ID_TypeClass(zs9);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BSVAUES</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BSVAUES</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBSVAUES(BSVAUES object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BSVRVA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BSVRVA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBSVRVA(BSVRVA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BS Wdh</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BS Wdh</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBSWdh(BSWdh object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BSZBS Ber</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BSZBS Ber</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBSZBSBer(BSZBSBer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>BS Zusatz</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>BS Zusatz</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBSZusatz(BSZusatz object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bue00 Lp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bue00 Lp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBue00Lp(Bue00Lp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bue01 Lp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bue01 Lp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBue01Lp(Bue01Lp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bue01 S</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bue01 S</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBue01S(Bue01S object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bue02 Lp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bue02 Lp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBue02Lp(Bue02Lp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bue02 S</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bue02 S</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBue02S(Bue02S object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bue10 Lp Bli</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bue10 Lp Bli</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBue10LpBli(Bue10LpBli object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bue11 Lp Bli</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bue11 Lp Bli</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBue11LpBli(Bue11LpBli object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bue11 SBli</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bue11 SBli</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBue11SBli(Bue11SBli object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bue12 Lp St</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bue12 Lp St</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBue12LpSt(Bue12LpSt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bue12 SSt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bue12 SSt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBue12SSt(Bue12SSt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bue2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bue2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBue2(Bue2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bue21 R</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bue21 R</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBue21R(Bue21R object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bue22 R</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bue22 R</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBue22R(Bue22R object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bue23 R</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bue23 R</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBue23R(Bue23R object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bue3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bue3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBue3(Bue3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bue4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bue4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBue4(Bue4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bue5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bue5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBue5(Bue5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bue AT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bue AT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBueAT(BueAT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bue AT Zusatz</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bue AT Zusatz</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBueATZusatz(BueATZusatz object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bue KT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bue KT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBueKT(BueKT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>El1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>El1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEl1(El1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>El1v</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>El1v</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEl1v(El1v object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>El2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>El2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEl2(El2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>El3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>El3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEl3(El3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>El4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>El4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEl4(El4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>El5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>El5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEl5(El5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>El6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>El6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEl6(El6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>El Pf B</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>El Pf B</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElPfB(ElPfB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>El Pf L</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>El Pf L</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElPfL(ElPfL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>El Pf O</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>El Pf O</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElPfO(ElPfO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>El Pf R</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>El Pf R</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElPfR(ElPfR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>El TAC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>El TAC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElTAC(ElTAC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>El TDC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>El TDC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseElTDC(ElTDC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hl1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hl1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHl1(Hl1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hl10</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hl10</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHl10(Hl10 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hl11</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hl11</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHl11(Hl11 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hl12a</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hl12a</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHl12a(Hl12a object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hl12b</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hl12b</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHl12b(Hl12b object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hl2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hl2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHl2(Hl2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hl3a</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hl3a</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHl3a(Hl3a object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hl3b</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hl3b</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHl3b(Hl3b object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hl4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hl4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHl4(Hl4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hl5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hl5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHl5(Hl5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hl6a</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hl6a</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHl6a(Hl6a object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hl6b</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hl6b</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHl6b(Hl6b object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hl7</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hl7</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHl7(Hl7 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hl8</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hl8</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHl8(Hl8 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hl9a</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hl9a</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHl9a(Hl9a object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hl9b</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hl9b</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHl9b(Hl9b object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hp0</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hp0</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHp0(Hp0 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hp02 Lp</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hp02 Lp</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHp02Lp(Hp02Lp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hp1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hp1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHp1(Hp1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hp2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hp2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHp2(Hp2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Kl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Kl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKl(Kl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ks1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ks1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKs1(Ks1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ks2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ks2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKs2(Ks2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lf1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lf1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLf1(Lf1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lf12</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lf12</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLf12(Lf12 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lf1 Wdh</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lf1 Wdh</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLf1Wdh(Lf1Wdh object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lf2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lf2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLf2(Lf2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lf3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lf3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLf3(Lf3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lf4 DS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lf4 DS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLf4DS(Lf4DS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lf4 DV</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lf4 DV</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLf4DV(Lf4DV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lf5 DS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lf5 DS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLf5DS(Lf5DS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lf5 DV</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lf5 DV</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLf5DV(Lf5DV object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lf6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lf6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLf6(Lf6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lf7</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lf7</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLf7(Lf7 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lf Pf L</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lf Pf L</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLfPfL(LfPfL object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lf Pf R</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lf Pf R</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLfPfR(LfPfR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ms Ge D</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ms Ge D</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsGeD(MsGeD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ms Rt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ms Rt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsRt(MsRt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ms Sk Ge</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ms Sk Ge</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsSkGe(MsSkGe object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ms Sk Rt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ms Sk Rt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsSkRt(MsSkRt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ms UES Wdh</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ms UES Wdh</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsUESWdh(MsUESWdh object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ms Vw</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ms Vw</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsVw(MsVw object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ms Ws2sw P</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ms Ws2sw P</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsWs2swP(MsWs2swP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ms Ws Ge Ws</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ms Ws Ge Ws</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsWsGeWs(MsWsGeWs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ms Ws Rt Ws</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ms Ws Rt Ws</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsWsRtWs(MsWsRtWs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ms Ws Sw Ws</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ms Ws Sw Ws</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMsWsSwWs(MsWsSwWs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ne1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ne1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNe1(Ne1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ne12</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ne12</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNe12(Ne12 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ne13a</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ne13a</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNe13a(Ne13a object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ne13b</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ne13b</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNe13b(Ne13b object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ne14</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ne14</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNe14(Ne14 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ne2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ne2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNe2(Ne2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ne2 VRVA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ne2 VRVA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNe2VRVA(Ne2VRVA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ne31str</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ne31str</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNe31str(Ne31str object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ne32str</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ne32str</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNe32str(Ne32str object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ne33str</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ne33str</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNe33str(Ne33str object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ne34str</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ne34str</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNe34str(Ne34str object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ne35str</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ne35str</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNe35str(Ne35str object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ne4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ne4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNe4(Ne4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ne5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ne5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNe5(Ne5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ne6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ne6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNe6(Ne6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ne7a</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ne7a</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNe7a(Ne7a object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ne7b</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ne7b</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNe7b(Ne7b object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oz Auto ET</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oz Auto ET</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOzAutoET(OzAutoET object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oz Auto HET</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oz Auto HET</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOzAutoHET(OzAutoHET object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oz Bk</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oz Bk</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOzBk(OzBk object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oz ET</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oz ET</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOzET(OzET object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oz Fa</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oz Fa</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOzFa(OzFa object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oz Fak</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oz Fak</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOzFak(OzFak object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oz GSMR</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oz GSMR</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOzGSMR(OzGSMR object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oz HET</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oz HET</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOzHET(OzHET object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oz HM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oz HM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOzHM(OzHM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oz ICE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oz ICE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOzICE(OzICE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oz LZB Ber</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oz LZB Ber</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOzLZBBer(OzLZBBer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oz OB Grenze</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oz OB Grenze</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOzOBGrenze(OzOBGrenze object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oz PZBBUE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oz PZBBUE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOzPZBBUE(OzPZBBUE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oz Zf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oz Zf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOzZf(OzZf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Oz Zugl</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Oz Zugl</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOzZugl(OzZugl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pf2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pf2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePf2(Pf2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ra10</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ra10</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRa10(Ra10 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ra11</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ra11</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRa11(Ra11 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ra11b</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ra11b</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRa11b(Ra11b object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ra12</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ra12</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRa12(Ra12 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ra13</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ra13</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRa13(Ra13 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sh0</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sh0</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSh0(Sh0 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sh1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sh1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSh1(Sh1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sh2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sh2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSh2(Sh2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sk1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sk1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSk1(Sk1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sk2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sk2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSk2(Sk2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>So1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>So1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSo1(So1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>So106</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>So106</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSo106(So106 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>So14</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>So14</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSo14(So14 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>So15</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>So15</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSo15(So15 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>So191 P</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>So191 P</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSo191P(So191P object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>So192 P</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>So192 P</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSo192P(So192P object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>So193 P</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>So193 P</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSo193P(So193P object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>So20</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>So20</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSo20(So20 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sv0</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sv0</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSv0(Sv0 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sv1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sv1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSv1(Sv1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sv2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sv2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSv2(Sv2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sv3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sv3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSv3(Sv3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sv4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sv4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSv4(Sv4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sv5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sv5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSv5(Sv5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sv6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sv6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSv6(Sv6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sv WPf</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sv WPf</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSvWPf(SvWPf object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ts1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ts1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTs1(Ts1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ts2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ts2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTs2(Ts2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ts3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ts3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTs3(Ts3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ukr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ukr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUkr(Ukr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vr0</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vr0</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVr0(Vr0 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vr1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vr1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVr1(Vr1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vr2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vr2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVr2(Vr2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wn1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wn1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWn1(Wn1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wn2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wn2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWn2(Wn2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wn3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wn3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWn3(Wn3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wn4</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wn4</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWn4(Wn4 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wn5</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wn5</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWn5(Wn5 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wn6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wn6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWn6(Wn6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wn7</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wn7</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWn7(Wn7 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Wvs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Wvs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWvs(Wvs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zl O</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zl O</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZlO(ZlO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zl U</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zl U</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZlU(ZlU object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zp10</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zp10</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZp10(Zp10 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zp10 Ls</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zp10 Ls</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZp10Ls(Zp10Ls object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zp6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zp6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZp6(Zp6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zp7</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zp7</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZp7(Zp7 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zp8</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zp8</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZp8(Zp8 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zp9</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zp9</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZp9(Zp9 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zp9 Ls</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zp9 Ls</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZp9Ls(Zp9Ls object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zs1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zs1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZs1(Zs1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zs10</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zs10</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZs10(Zs10 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zs103</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zs103</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZs103(Zs103 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zs12</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zs12</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZs12(Zs12 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zs13</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zs13</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZs13(Zs13 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zs1 A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zs1 A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZs1A(Zs1A object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zs2</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zs2</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZs2(Zs2 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zs2v</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zs2v</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZs2v(Zs2v object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zs3</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zs3</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZs3(Zs3 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zs3v</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zs3v</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZs3v(Zs3v object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zs6</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zs6</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZs6(Zs6 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zs7</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zs7</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZs7(Zs7 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zs8</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zs8</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZs8(Zs8 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zs8 A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zs8 A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZs8A(Zs8A object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Zs9</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Zs9</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseZs9(Zs9 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Signalbegriff ID Type Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Signalbegriff ID Type Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSignalbegriff_ID_TypeClass(Signalbegriff_ID_TypeClass object) {
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

} //Signalbegriffe_Ril_301Switch
