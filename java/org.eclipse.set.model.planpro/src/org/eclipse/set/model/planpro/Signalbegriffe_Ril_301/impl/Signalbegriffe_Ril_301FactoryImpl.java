/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Signalbegriffe_Ril_301FactoryImpl extends EFactoryImpl implements Signalbegriffe_Ril_301Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Signalbegriffe_Ril_301Factory init() {
		try {
			Signalbegriffe_Ril_301Factory theSignalbegriffe_Ril_301Factory = (Signalbegriffe_Ril_301Factory)EPackage.Registry.INSTANCE.getEFactory(Signalbegriffe_Ril_301Package.eNS_URI);
			if (theSignalbegriffe_Ril_301Factory != null) {
				return theSignalbegriffe_Ril_301Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Signalbegriffe_Ril_301FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signalbegriffe_Ril_301FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Signalbegriffe_Ril_301Package.BSVAUES: return createBSVAUES();
			case Signalbegriffe_Ril_301Package.BSVRVA: return createBSVRVA();
			case Signalbegriffe_Ril_301Package.BS_WDH: return createBSWdh();
			case Signalbegriffe_Ril_301Package.BSZBS_BER: return createBSZBSBer();
			case Signalbegriffe_Ril_301Package.BS_ZUSATZ: return createBSZusatz();
			case Signalbegriffe_Ril_301Package.BUE00_LP: return createBue00Lp();
			case Signalbegriffe_Ril_301Package.BUE01_LP: return createBue01Lp();
			case Signalbegriffe_Ril_301Package.BUE01_S: return createBue01S();
			case Signalbegriffe_Ril_301Package.BUE02_LP: return createBue02Lp();
			case Signalbegriffe_Ril_301Package.BUE02_S: return createBue02S();
			case Signalbegriffe_Ril_301Package.BUE10_LP_BLI: return createBue10LpBli();
			case Signalbegriffe_Ril_301Package.BUE11_LP_BLI: return createBue11LpBli();
			case Signalbegriffe_Ril_301Package.BUE11_SBLI: return createBue11SBli();
			case Signalbegriffe_Ril_301Package.BUE12_LP_ST: return createBue12LpSt();
			case Signalbegriffe_Ril_301Package.BUE12_SST: return createBue12SSt();
			case Signalbegriffe_Ril_301Package.BUE2: return createBue2();
			case Signalbegriffe_Ril_301Package.BUE21_R: return createBue21R();
			case Signalbegriffe_Ril_301Package.BUE22_R: return createBue22R();
			case Signalbegriffe_Ril_301Package.BUE23_R: return createBue23R();
			case Signalbegriffe_Ril_301Package.BUE3: return createBue3();
			case Signalbegriffe_Ril_301Package.BUE4: return createBue4();
			case Signalbegriffe_Ril_301Package.BUE5: return createBue5();
			case Signalbegriffe_Ril_301Package.BUE_AT: return createBueAT();
			case Signalbegriffe_Ril_301Package.BUE_AT_ZUSATZ: return createBueATZusatz();
			case Signalbegriffe_Ril_301Package.BUE_KT: return createBueKT();
			case Signalbegriffe_Ril_301Package.EL1: return createEl1();
			case Signalbegriffe_Ril_301Package.EL1V: return createEl1v();
			case Signalbegriffe_Ril_301Package.EL2: return createEl2();
			case Signalbegriffe_Ril_301Package.EL3: return createEl3();
			case Signalbegriffe_Ril_301Package.EL4: return createEl4();
			case Signalbegriffe_Ril_301Package.EL5: return createEl5();
			case Signalbegriffe_Ril_301Package.EL6: return createEl6();
			case Signalbegriffe_Ril_301Package.EL_PF_B: return createElPfB();
			case Signalbegriffe_Ril_301Package.EL_PF_L: return createElPfL();
			case Signalbegriffe_Ril_301Package.EL_PF_O: return createElPfO();
			case Signalbegriffe_Ril_301Package.EL_PF_R: return createElPfR();
			case Signalbegriffe_Ril_301Package.EL_TAC: return createElTAC();
			case Signalbegriffe_Ril_301Package.EL_TDC: return createElTDC();
			case Signalbegriffe_Ril_301Package.HL1: return createHl1();
			case Signalbegriffe_Ril_301Package.HL10: return createHl10();
			case Signalbegriffe_Ril_301Package.HL11: return createHl11();
			case Signalbegriffe_Ril_301Package.HL12A: return createHl12a();
			case Signalbegriffe_Ril_301Package.HL12B: return createHl12b();
			case Signalbegriffe_Ril_301Package.HL2: return createHl2();
			case Signalbegriffe_Ril_301Package.HL3A: return createHl3a();
			case Signalbegriffe_Ril_301Package.HL3B: return createHl3b();
			case Signalbegriffe_Ril_301Package.HL4: return createHl4();
			case Signalbegriffe_Ril_301Package.HL5: return createHl5();
			case Signalbegriffe_Ril_301Package.HL6A: return createHl6a();
			case Signalbegriffe_Ril_301Package.HL6B: return createHl6b();
			case Signalbegriffe_Ril_301Package.HL7: return createHl7();
			case Signalbegriffe_Ril_301Package.HL8: return createHl8();
			case Signalbegriffe_Ril_301Package.HL9A: return createHl9a();
			case Signalbegriffe_Ril_301Package.HL9B: return createHl9b();
			case Signalbegriffe_Ril_301Package.HP0: return createHp0();
			case Signalbegriffe_Ril_301Package.HP02_LP: return createHp02Lp();
			case Signalbegriffe_Ril_301Package.HP1: return createHp1();
			case Signalbegriffe_Ril_301Package.HP2: return createHp2();
			case Signalbegriffe_Ril_301Package.KL: return createKl();
			case Signalbegriffe_Ril_301Package.KS1: return createKs1();
			case Signalbegriffe_Ril_301Package.KS2: return createKs2();
			case Signalbegriffe_Ril_301Package.LF1: return createLf1();
			case Signalbegriffe_Ril_301Package.LF12: return createLf12();
			case Signalbegriffe_Ril_301Package.LF1_WDH: return createLf1Wdh();
			case Signalbegriffe_Ril_301Package.LF2: return createLf2();
			case Signalbegriffe_Ril_301Package.LF3: return createLf3();
			case Signalbegriffe_Ril_301Package.LF4_DS: return createLf4DS();
			case Signalbegriffe_Ril_301Package.LF4_DV: return createLf4DV();
			case Signalbegriffe_Ril_301Package.LF5_DS: return createLf5DS();
			case Signalbegriffe_Ril_301Package.LF5_DV: return createLf5DV();
			case Signalbegriffe_Ril_301Package.LF6: return createLf6();
			case Signalbegriffe_Ril_301Package.LF7: return createLf7();
			case Signalbegriffe_Ril_301Package.LF_PF_L: return createLfPfL();
			case Signalbegriffe_Ril_301Package.LF_PF_R: return createLfPfR();
			case Signalbegriffe_Ril_301Package.MS_GE_D: return createMsGeD();
			case Signalbegriffe_Ril_301Package.MS_RT: return createMsRt();
			case Signalbegriffe_Ril_301Package.MS_SK_GE: return createMsSkGe();
			case Signalbegriffe_Ril_301Package.MS_SK_RT: return createMsSkRt();
			case Signalbegriffe_Ril_301Package.MS_UES_WDH: return createMsUESWdh();
			case Signalbegriffe_Ril_301Package.MS_VW: return createMsVw();
			case Signalbegriffe_Ril_301Package.MS_WS2SW_P: return createMsWs2swP();
			case Signalbegriffe_Ril_301Package.MS_WS_GE_WS: return createMsWsGeWs();
			case Signalbegriffe_Ril_301Package.MS_WS_RT_WS: return createMsWsRtWs();
			case Signalbegriffe_Ril_301Package.MS_WS_SW_WS: return createMsWsSwWs();
			case Signalbegriffe_Ril_301Package.NE1: return createNe1();
			case Signalbegriffe_Ril_301Package.NE12: return createNe12();
			case Signalbegriffe_Ril_301Package.NE13A: return createNe13a();
			case Signalbegriffe_Ril_301Package.NE13B: return createNe13b();
			case Signalbegriffe_Ril_301Package.NE14: return createNe14();
			case Signalbegriffe_Ril_301Package.NE2: return createNe2();
			case Signalbegriffe_Ril_301Package.NE2_VRVA: return createNe2VRVA();
			case Signalbegriffe_Ril_301Package.NE31STR: return createNe31str();
			case Signalbegriffe_Ril_301Package.NE32STR: return createNe32str();
			case Signalbegriffe_Ril_301Package.NE33STR: return createNe33str();
			case Signalbegriffe_Ril_301Package.NE34STR: return createNe34str();
			case Signalbegriffe_Ril_301Package.NE35STR: return createNe35str();
			case Signalbegriffe_Ril_301Package.NE4: return createNe4();
			case Signalbegriffe_Ril_301Package.NE5: return createNe5();
			case Signalbegriffe_Ril_301Package.NE6: return createNe6();
			case Signalbegriffe_Ril_301Package.NE7A: return createNe7a();
			case Signalbegriffe_Ril_301Package.NE7B: return createNe7b();
			case Signalbegriffe_Ril_301Package.OZ_AUTO_ET: return createOzAutoET();
			case Signalbegriffe_Ril_301Package.OZ_AUTO_HET: return createOzAutoHET();
			case Signalbegriffe_Ril_301Package.OZ_BK: return createOzBk();
			case Signalbegriffe_Ril_301Package.OZ_ET: return createOzET();
			case Signalbegriffe_Ril_301Package.OZ_FA: return createOzFa();
			case Signalbegriffe_Ril_301Package.OZ_FAK: return createOzFak();
			case Signalbegriffe_Ril_301Package.OZ_GSMR: return createOzGSMR();
			case Signalbegriffe_Ril_301Package.OZ_HET: return createOzHET();
			case Signalbegriffe_Ril_301Package.OZ_HM: return createOzHM();
			case Signalbegriffe_Ril_301Package.OZ_ICE: return createOzICE();
			case Signalbegriffe_Ril_301Package.OZ_LZB_BER: return createOzLZBBer();
			case Signalbegriffe_Ril_301Package.OZ_OB_GRENZE: return createOzOBGrenze();
			case Signalbegriffe_Ril_301Package.OZ_PZBBUE: return createOzPZBBUE();
			case Signalbegriffe_Ril_301Package.OZ_ZF: return createOzZf();
			case Signalbegriffe_Ril_301Package.OZ_ZUGL: return createOzZugl();
			case Signalbegriffe_Ril_301Package.PF2: return createPf2();
			case Signalbegriffe_Ril_301Package.RA10: return createRa10();
			case Signalbegriffe_Ril_301Package.RA11: return createRa11();
			case Signalbegriffe_Ril_301Package.RA11B: return createRa11b();
			case Signalbegriffe_Ril_301Package.RA12: return createRa12();
			case Signalbegriffe_Ril_301Package.RA13: return createRa13();
			case Signalbegriffe_Ril_301Package.SH0: return createSh0();
			case Signalbegriffe_Ril_301Package.SH1: return createSh1();
			case Signalbegriffe_Ril_301Package.SH2: return createSh2();
			case Signalbegriffe_Ril_301Package.SK1: return createSk1();
			case Signalbegriffe_Ril_301Package.SK2: return createSk2();
			case Signalbegriffe_Ril_301Package.SO1: return createSo1();
			case Signalbegriffe_Ril_301Package.SO106: return createSo106();
			case Signalbegriffe_Ril_301Package.SO14: return createSo14();
			case Signalbegriffe_Ril_301Package.SO15: return createSo15();
			case Signalbegriffe_Ril_301Package.SO191_P: return createSo191P();
			case Signalbegriffe_Ril_301Package.SO192_P: return createSo192P();
			case Signalbegriffe_Ril_301Package.SO193_P: return createSo193P();
			case Signalbegriffe_Ril_301Package.SO20: return createSo20();
			case Signalbegriffe_Ril_301Package.SV0: return createSv0();
			case Signalbegriffe_Ril_301Package.SV1: return createSv1();
			case Signalbegriffe_Ril_301Package.SV2: return createSv2();
			case Signalbegriffe_Ril_301Package.SV3: return createSv3();
			case Signalbegriffe_Ril_301Package.SV4: return createSv4();
			case Signalbegriffe_Ril_301Package.SV5: return createSv5();
			case Signalbegriffe_Ril_301Package.SV6: return createSv6();
			case Signalbegriffe_Ril_301Package.SV_WPF: return createSvWPf();
			case Signalbegriffe_Ril_301Package.TS1: return createTs1();
			case Signalbegriffe_Ril_301Package.TS2: return createTs2();
			case Signalbegriffe_Ril_301Package.TS3: return createTs3();
			case Signalbegriffe_Ril_301Package.UKR: return createUkr();
			case Signalbegriffe_Ril_301Package.VR0: return createVr0();
			case Signalbegriffe_Ril_301Package.VR1: return createVr1();
			case Signalbegriffe_Ril_301Package.VR2: return createVr2();
			case Signalbegriffe_Ril_301Package.WN1: return createWn1();
			case Signalbegriffe_Ril_301Package.WN2: return createWn2();
			case Signalbegriffe_Ril_301Package.WN3: return createWn3();
			case Signalbegriffe_Ril_301Package.WN4: return createWn4();
			case Signalbegriffe_Ril_301Package.WN5: return createWn5();
			case Signalbegriffe_Ril_301Package.WN6: return createWn6();
			case Signalbegriffe_Ril_301Package.WN7: return createWn7();
			case Signalbegriffe_Ril_301Package.WVS: return createWvs();
			case Signalbegriffe_Ril_301Package.ZL_O: return createZlO();
			case Signalbegriffe_Ril_301Package.ZL_U: return createZlU();
			case Signalbegriffe_Ril_301Package.ZP10: return createZp10();
			case Signalbegriffe_Ril_301Package.ZP10_LS: return createZp10Ls();
			case Signalbegriffe_Ril_301Package.ZP6: return createZp6();
			case Signalbegriffe_Ril_301Package.ZP7: return createZp7();
			case Signalbegriffe_Ril_301Package.ZP8: return createZp8();
			case Signalbegriffe_Ril_301Package.ZP9: return createZp9();
			case Signalbegriffe_Ril_301Package.ZP9_LS: return createZp9Ls();
			case Signalbegriffe_Ril_301Package.ZS1: return createZs1();
			case Signalbegriffe_Ril_301Package.ZS10: return createZs10();
			case Signalbegriffe_Ril_301Package.ZS103: return createZs103();
			case Signalbegriffe_Ril_301Package.ZS12: return createZs12();
			case Signalbegriffe_Ril_301Package.ZS13: return createZs13();
			case Signalbegriffe_Ril_301Package.ZS1_A: return createZs1A();
			case Signalbegriffe_Ril_301Package.ZS2: return createZs2();
			case Signalbegriffe_Ril_301Package.ZS2V: return createZs2v();
			case Signalbegriffe_Ril_301Package.ZS3: return createZs3();
			case Signalbegriffe_Ril_301Package.ZS3V: return createZs3v();
			case Signalbegriffe_Ril_301Package.ZS6: return createZs6();
			case Signalbegriffe_Ril_301Package.ZS7: return createZs7();
			case Signalbegriffe_Ril_301Package.ZS8: return createZs8();
			case Signalbegriffe_Ril_301Package.ZS8_A: return createZs8A();
			case Signalbegriffe_Ril_301Package.ZS9: return createZs9();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF1:
				return createENUMSymbolLf1FromString(eDataType, initialValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF12:
				return createENUMSymbolLf12FromString(eDataType, initialValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF1_WDH:
				return createENUMSymbolLf1WdhFromString(eDataType, initialValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF4_DS:
				return createENUMSymbolLf4DSFromString(eDataType, initialValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF4_DV:
				return createENUMSymbolLf4DVFromString(eDataType, initialValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF6:
				return createENUMSymbolLf6FromString(eDataType, initialValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF7:
				return createENUMSymbolLf7FromString(eDataType, initialValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_ZS2:
				return createENUMSymbolZs2FromString(eDataType, initialValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_ZS2V:
				return createENUMSymbolZs2vFromString(eDataType, initialValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_ZS3:
				return createENUMSymbolZs3FromString(eDataType, initialValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_ZS3V:
				return createENUMSymbolZs3vFromString(eDataType, initialValue);
			case Signalbegriffe_Ril_301Package.BS_ZUSATZ_SYMBOL_TYPE:
				return createBS_Zusatz_Symbol_TypeFromString(eDataType, initialValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF12_OBJECT:
				return createENUMSymbolLf12ObjectFromString(eDataType, initialValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF1_OBJECT:
				return createENUMSymbolLf1ObjectFromString(eDataType, initialValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF1_WDH_OBJECT:
				return createENUMSymbolLf1WdhObjectFromString(eDataType, initialValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF4_DS_OBJECT:
				return createENUMSymbolLf4DSObjectFromString(eDataType, initialValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF4_DV_OBJECT:
				return createENUMSymbolLf4DVObjectFromString(eDataType, initialValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF6_OBJECT:
				return createENUMSymbolLf6ObjectFromString(eDataType, initialValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF7_OBJECT:
				return createENUMSymbolLf7ObjectFromString(eDataType, initialValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_ZS2_OBJECT:
				return createENUMSymbolZs2ObjectFromString(eDataType, initialValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_ZS2V_OBJECT:
				return createENUMSymbolZs2vObjectFromString(eDataType, initialValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_ZS3_OBJECT:
				return createENUMSymbolZs3ObjectFromString(eDataType, initialValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_ZS3V_OBJECT:
				return createENUMSymbolZs3vObjectFromString(eDataType, initialValue);
			case Signalbegriffe_Ril_301Package.OZ_ZUGL_SYMBOL_TYPE:
				return createOz_Zugl_Symbol_TypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF1:
				return convertENUMSymbolLf1ToString(eDataType, instanceValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF12:
				return convertENUMSymbolLf12ToString(eDataType, instanceValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF1_WDH:
				return convertENUMSymbolLf1WdhToString(eDataType, instanceValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF4_DS:
				return convertENUMSymbolLf4DSToString(eDataType, instanceValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF4_DV:
				return convertENUMSymbolLf4DVToString(eDataType, instanceValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF6:
				return convertENUMSymbolLf6ToString(eDataType, instanceValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF7:
				return convertENUMSymbolLf7ToString(eDataType, instanceValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_ZS2:
				return convertENUMSymbolZs2ToString(eDataType, instanceValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_ZS2V:
				return convertENUMSymbolZs2vToString(eDataType, instanceValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_ZS3:
				return convertENUMSymbolZs3ToString(eDataType, instanceValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_ZS3V:
				return convertENUMSymbolZs3vToString(eDataType, instanceValue);
			case Signalbegriffe_Ril_301Package.BS_ZUSATZ_SYMBOL_TYPE:
				return convertBS_Zusatz_Symbol_TypeToString(eDataType, instanceValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF12_OBJECT:
				return convertENUMSymbolLf12ObjectToString(eDataType, instanceValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF1_OBJECT:
				return convertENUMSymbolLf1ObjectToString(eDataType, instanceValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF1_WDH_OBJECT:
				return convertENUMSymbolLf1WdhObjectToString(eDataType, instanceValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF4_DS_OBJECT:
				return convertENUMSymbolLf4DSObjectToString(eDataType, instanceValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF4_DV_OBJECT:
				return convertENUMSymbolLf4DVObjectToString(eDataType, instanceValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF6_OBJECT:
				return convertENUMSymbolLf6ObjectToString(eDataType, instanceValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF7_OBJECT:
				return convertENUMSymbolLf7ObjectToString(eDataType, instanceValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_ZS2_OBJECT:
				return convertENUMSymbolZs2ObjectToString(eDataType, instanceValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_ZS2V_OBJECT:
				return convertENUMSymbolZs2vObjectToString(eDataType, instanceValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_ZS3_OBJECT:
				return convertENUMSymbolZs3ObjectToString(eDataType, instanceValue);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_ZS3V_OBJECT:
				return convertENUMSymbolZs3vObjectToString(eDataType, instanceValue);
			case Signalbegriffe_Ril_301Package.OZ_ZUGL_SYMBOL_TYPE:
				return convertOz_Zugl_Symbol_TypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BSVAUES createBSVAUES() {
		BSVAUESImpl bsvaues = new BSVAUESImpl();
		return bsvaues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BSVRVA createBSVRVA() {
		BSVRVAImpl bsvrva = new BSVRVAImpl();
		return bsvrva;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BSWdh createBSWdh() {
		BSWdhImpl bsWdh = new BSWdhImpl();
		return bsWdh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BSZBSBer createBSZBSBer() {
		BSZBSBerImpl bszbsBer = new BSZBSBerImpl();
		return bszbsBer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BSZusatz createBSZusatz() {
		BSZusatzImpl bsZusatz = new BSZusatzImpl();
		return bsZusatz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bue00Lp createBue00Lp() {
		Bue00LpImpl bue00Lp = new Bue00LpImpl();
		return bue00Lp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bue01Lp createBue01Lp() {
		Bue01LpImpl bue01Lp = new Bue01LpImpl();
		return bue01Lp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bue01S createBue01S() {
		Bue01SImpl bue01S = new Bue01SImpl();
		return bue01S;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bue02Lp createBue02Lp() {
		Bue02LpImpl bue02Lp = new Bue02LpImpl();
		return bue02Lp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bue02S createBue02S() {
		Bue02SImpl bue02S = new Bue02SImpl();
		return bue02S;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bue10LpBli createBue10LpBli() {
		Bue10LpBliImpl bue10LpBli = new Bue10LpBliImpl();
		return bue10LpBli;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bue11LpBli createBue11LpBli() {
		Bue11LpBliImpl bue11LpBli = new Bue11LpBliImpl();
		return bue11LpBli;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bue11SBli createBue11SBli() {
		Bue11SBliImpl bue11SBli = new Bue11SBliImpl();
		return bue11SBli;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bue12LpSt createBue12LpSt() {
		Bue12LpStImpl bue12LpSt = new Bue12LpStImpl();
		return bue12LpSt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bue12SSt createBue12SSt() {
		Bue12SStImpl bue12SSt = new Bue12SStImpl();
		return bue12SSt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bue2 createBue2() {
		Bue2Impl bue2 = new Bue2Impl();
		return bue2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bue21R createBue21R() {
		Bue21RImpl bue21R = new Bue21RImpl();
		return bue21R;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bue22R createBue22R() {
		Bue22RImpl bue22R = new Bue22RImpl();
		return bue22R;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bue23R createBue23R() {
		Bue23RImpl bue23R = new Bue23RImpl();
		return bue23R;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bue3 createBue3() {
		Bue3Impl bue3 = new Bue3Impl();
		return bue3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bue4 createBue4() {
		Bue4Impl bue4 = new Bue4Impl();
		return bue4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Bue5 createBue5() {
		Bue5Impl bue5 = new Bue5Impl();
		return bue5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BueAT createBueAT() {
		BueATImpl bueAT = new BueATImpl();
		return bueAT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BueATZusatz createBueATZusatz() {
		BueATZusatzImpl bueATZusatz = new BueATZusatzImpl();
		return bueATZusatz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BueKT createBueKT() {
		BueKTImpl bueKT = new BueKTImpl();
		return bueKT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public El1 createEl1() {
		El1Impl el1 = new El1Impl();
		return el1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public El1v createEl1v() {
		El1vImpl el1v = new El1vImpl();
		return el1v;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public El2 createEl2() {
		El2Impl el2 = new El2Impl();
		return el2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public El3 createEl3() {
		El3Impl el3 = new El3Impl();
		return el3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public El4 createEl4() {
		El4Impl el4 = new El4Impl();
		return el4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public El5 createEl5() {
		El5Impl el5 = new El5Impl();
		return el5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public El6 createEl6() {
		El6Impl el6 = new El6Impl();
		return el6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElPfB createElPfB() {
		ElPfBImpl elPfB = new ElPfBImpl();
		return elPfB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElPfL createElPfL() {
		ElPfLImpl elPfL = new ElPfLImpl();
		return elPfL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElPfO createElPfO() {
		ElPfOImpl elPfO = new ElPfOImpl();
		return elPfO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElPfR createElPfR() {
		ElPfRImpl elPfR = new ElPfRImpl();
		return elPfR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElTAC createElTAC() {
		ElTACImpl elTAC = new ElTACImpl();
		return elTAC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ElTDC createElTDC() {
		ElTDCImpl elTDC = new ElTDCImpl();
		return elTDC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hl1 createHl1() {
		Hl1Impl hl1 = new Hl1Impl();
		return hl1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hl10 createHl10() {
		Hl10Impl hl10 = new Hl10Impl();
		return hl10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hl11 createHl11() {
		Hl11Impl hl11 = new Hl11Impl();
		return hl11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hl12a createHl12a() {
		Hl12aImpl hl12a = new Hl12aImpl();
		return hl12a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hl12b createHl12b() {
		Hl12bImpl hl12b = new Hl12bImpl();
		return hl12b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hl2 createHl2() {
		Hl2Impl hl2 = new Hl2Impl();
		return hl2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hl3a createHl3a() {
		Hl3aImpl hl3a = new Hl3aImpl();
		return hl3a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hl3b createHl3b() {
		Hl3bImpl hl3b = new Hl3bImpl();
		return hl3b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hl4 createHl4() {
		Hl4Impl hl4 = new Hl4Impl();
		return hl4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hl5 createHl5() {
		Hl5Impl hl5 = new Hl5Impl();
		return hl5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hl6a createHl6a() {
		Hl6aImpl hl6a = new Hl6aImpl();
		return hl6a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hl6b createHl6b() {
		Hl6bImpl hl6b = new Hl6bImpl();
		return hl6b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hl7 createHl7() {
		Hl7Impl hl7 = new Hl7Impl();
		return hl7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hl8 createHl8() {
		Hl8Impl hl8 = new Hl8Impl();
		return hl8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hl9a createHl9a() {
		Hl9aImpl hl9a = new Hl9aImpl();
		return hl9a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hl9b createHl9b() {
		Hl9bImpl hl9b = new Hl9bImpl();
		return hl9b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hp0 createHp0() {
		Hp0Impl hp0 = new Hp0Impl();
		return hp0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hp02Lp createHp02Lp() {
		Hp02LpImpl hp02Lp = new Hp02LpImpl();
		return hp02Lp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hp1 createHp1() {
		Hp1Impl hp1 = new Hp1Impl();
		return hp1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hp2 createHp2() {
		Hp2Impl hp2 = new Hp2Impl();
		return hp2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Kl createKl() {
		KlImpl kl = new KlImpl();
		return kl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ks1 createKs1() {
		Ks1Impl ks1 = new Ks1Impl();
		return ks1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ks2 createKs2() {
		Ks2Impl ks2 = new Ks2Impl();
		return ks2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lf1 createLf1() {
		Lf1Impl lf1 = new Lf1Impl();
		return lf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lf12 createLf12() {
		Lf12Impl lf12 = new Lf12Impl();
		return lf12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lf1Wdh createLf1Wdh() {
		Lf1WdhImpl lf1Wdh = new Lf1WdhImpl();
		return lf1Wdh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lf2 createLf2() {
		Lf2Impl lf2 = new Lf2Impl();
		return lf2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lf3 createLf3() {
		Lf3Impl lf3 = new Lf3Impl();
		return lf3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lf4DS createLf4DS() {
		Lf4DSImpl lf4DS = new Lf4DSImpl();
		return lf4DS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lf4DV createLf4DV() {
		Lf4DVImpl lf4DV = new Lf4DVImpl();
		return lf4DV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lf5DS createLf5DS() {
		Lf5DSImpl lf5DS = new Lf5DSImpl();
		return lf5DS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lf5DV createLf5DV() {
		Lf5DVImpl lf5DV = new Lf5DVImpl();
		return lf5DV;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lf6 createLf6() {
		Lf6Impl lf6 = new Lf6Impl();
		return lf6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lf7 createLf7() {
		Lf7Impl lf7 = new Lf7Impl();
		return lf7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LfPfL createLfPfL() {
		LfPfLImpl lfPfL = new LfPfLImpl();
		return lfPfL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LfPfR createLfPfR() {
		LfPfRImpl lfPfR = new LfPfRImpl();
		return lfPfR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsGeD createMsGeD() {
		MsGeDImpl msGeD = new MsGeDImpl();
		return msGeD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsRt createMsRt() {
		MsRtImpl msRt = new MsRtImpl();
		return msRt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsSkGe createMsSkGe() {
		MsSkGeImpl msSkGe = new MsSkGeImpl();
		return msSkGe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsSkRt createMsSkRt() {
		MsSkRtImpl msSkRt = new MsSkRtImpl();
		return msSkRt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsUESWdh createMsUESWdh() {
		MsUESWdhImpl msUESWdh = new MsUESWdhImpl();
		return msUESWdh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsVw createMsVw() {
		MsVwImpl msVw = new MsVwImpl();
		return msVw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsWs2swP createMsWs2swP() {
		MsWs2swPImpl msWs2swP = new MsWs2swPImpl();
		return msWs2swP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsWsGeWs createMsWsGeWs() {
		MsWsGeWsImpl msWsGeWs = new MsWsGeWsImpl();
		return msWsGeWs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsWsRtWs createMsWsRtWs() {
		MsWsRtWsImpl msWsRtWs = new MsWsRtWsImpl();
		return msWsRtWs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MsWsSwWs createMsWsSwWs() {
		MsWsSwWsImpl msWsSwWs = new MsWsSwWsImpl();
		return msWsSwWs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ne1 createNe1() {
		Ne1Impl ne1 = new Ne1Impl();
		return ne1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ne12 createNe12() {
		Ne12Impl ne12 = new Ne12Impl();
		return ne12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ne13a createNe13a() {
		Ne13aImpl ne13a = new Ne13aImpl();
		return ne13a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ne13b createNe13b() {
		Ne13bImpl ne13b = new Ne13bImpl();
		return ne13b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ne14 createNe14() {
		Ne14Impl ne14 = new Ne14Impl();
		return ne14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ne2 createNe2() {
		Ne2Impl ne2 = new Ne2Impl();
		return ne2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ne2VRVA createNe2VRVA() {
		Ne2VRVAImpl ne2VRVA = new Ne2VRVAImpl();
		return ne2VRVA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ne31str createNe31str() {
		Ne31strImpl ne31str = new Ne31strImpl();
		return ne31str;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ne32str createNe32str() {
		Ne32strImpl ne32str = new Ne32strImpl();
		return ne32str;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ne33str createNe33str() {
		Ne33strImpl ne33str = new Ne33strImpl();
		return ne33str;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ne34str createNe34str() {
		Ne34strImpl ne34str = new Ne34strImpl();
		return ne34str;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ne35str createNe35str() {
		Ne35strImpl ne35str = new Ne35strImpl();
		return ne35str;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ne4 createNe4() {
		Ne4Impl ne4 = new Ne4Impl();
		return ne4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ne5 createNe5() {
		Ne5Impl ne5 = new Ne5Impl();
		return ne5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ne6 createNe6() {
		Ne6Impl ne6 = new Ne6Impl();
		return ne6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ne7a createNe7a() {
		Ne7aImpl ne7a = new Ne7aImpl();
		return ne7a;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ne7b createNe7b() {
		Ne7bImpl ne7b = new Ne7bImpl();
		return ne7b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OzAutoET createOzAutoET() {
		OzAutoETImpl ozAutoET = new OzAutoETImpl();
		return ozAutoET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OzAutoHET createOzAutoHET() {
		OzAutoHETImpl ozAutoHET = new OzAutoHETImpl();
		return ozAutoHET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OzBk createOzBk() {
		OzBkImpl ozBk = new OzBkImpl();
		return ozBk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OzET createOzET() {
		OzETImpl ozET = new OzETImpl();
		return ozET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OzFa createOzFa() {
		OzFaImpl ozFa = new OzFaImpl();
		return ozFa;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OzFak createOzFak() {
		OzFakImpl ozFak = new OzFakImpl();
		return ozFak;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OzGSMR createOzGSMR() {
		OzGSMRImpl ozGSMR = new OzGSMRImpl();
		return ozGSMR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OzHET createOzHET() {
		OzHETImpl ozHET = new OzHETImpl();
		return ozHET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OzHM createOzHM() {
		OzHMImpl ozHM = new OzHMImpl();
		return ozHM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OzICE createOzICE() {
		OzICEImpl ozICE = new OzICEImpl();
		return ozICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OzLZBBer createOzLZBBer() {
		OzLZBBerImpl ozLZBBer = new OzLZBBerImpl();
		return ozLZBBer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OzOBGrenze createOzOBGrenze() {
		OzOBGrenzeImpl ozOBGrenze = new OzOBGrenzeImpl();
		return ozOBGrenze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OzPZBBUE createOzPZBBUE() {
		OzPZBBUEImpl ozPZBBUE = new OzPZBBUEImpl();
		return ozPZBBUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OzZf createOzZf() {
		OzZfImpl ozZf = new OzZfImpl();
		return ozZf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OzZugl createOzZugl() {
		OzZuglImpl ozZugl = new OzZuglImpl();
		return ozZugl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pf2 createPf2() {
		Pf2Impl pf2 = new Pf2Impl();
		return pf2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ra10 createRa10() {
		Ra10Impl ra10 = new Ra10Impl();
		return ra10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ra11 createRa11() {
		Ra11Impl ra11 = new Ra11Impl();
		return ra11;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ra11b createRa11b() {
		Ra11bImpl ra11b = new Ra11bImpl();
		return ra11b;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ra12 createRa12() {
		Ra12Impl ra12 = new Ra12Impl();
		return ra12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ra13 createRa13() {
		Ra13Impl ra13 = new Ra13Impl();
		return ra13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sh0 createSh0() {
		Sh0Impl sh0 = new Sh0Impl();
		return sh0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sh1 createSh1() {
		Sh1Impl sh1 = new Sh1Impl();
		return sh1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sh2 createSh2() {
		Sh2Impl sh2 = new Sh2Impl();
		return sh2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sk1 createSk1() {
		Sk1Impl sk1 = new Sk1Impl();
		return sk1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sk2 createSk2() {
		Sk2Impl sk2 = new Sk2Impl();
		return sk2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public So1 createSo1() {
		So1Impl so1 = new So1Impl();
		return so1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public So106 createSo106() {
		So106Impl so106 = new So106Impl();
		return so106;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public So14 createSo14() {
		So14Impl so14 = new So14Impl();
		return so14;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public So15 createSo15() {
		So15Impl so15 = new So15Impl();
		return so15;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public So191P createSo191P() {
		So191PImpl so191P = new So191PImpl();
		return so191P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public So192P createSo192P() {
		So192PImpl so192P = new So192PImpl();
		return so192P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public So193P createSo193P() {
		So193PImpl so193P = new So193PImpl();
		return so193P;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public So20 createSo20() {
		So20Impl so20 = new So20Impl();
		return so20;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sv0 createSv0() {
		Sv0Impl sv0 = new Sv0Impl();
		return sv0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sv1 createSv1() {
		Sv1Impl sv1 = new Sv1Impl();
		return sv1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sv2 createSv2() {
		Sv2Impl sv2 = new Sv2Impl();
		return sv2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sv3 createSv3() {
		Sv3Impl sv3 = new Sv3Impl();
		return sv3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sv4 createSv4() {
		Sv4Impl sv4 = new Sv4Impl();
		return sv4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sv5 createSv5() {
		Sv5Impl sv5 = new Sv5Impl();
		return sv5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Sv6 createSv6() {
		Sv6Impl sv6 = new Sv6Impl();
		return sv6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SvWPf createSvWPf() {
		SvWPfImpl svWPf = new SvWPfImpl();
		return svWPf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ts1 createTs1() {
		Ts1Impl ts1 = new Ts1Impl();
		return ts1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ts2 createTs2() {
		Ts2Impl ts2 = new Ts2Impl();
		return ts2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ts3 createTs3() {
		Ts3Impl ts3 = new Ts3Impl();
		return ts3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ukr createUkr() {
		UkrImpl ukr = new UkrImpl();
		return ukr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vr0 createVr0() {
		Vr0Impl vr0 = new Vr0Impl();
		return vr0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vr1 createVr1() {
		Vr1Impl vr1 = new Vr1Impl();
		return vr1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Vr2 createVr2() {
		Vr2Impl vr2 = new Vr2Impl();
		return vr2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wn1 createWn1() {
		Wn1Impl wn1 = new Wn1Impl();
		return wn1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wn2 createWn2() {
		Wn2Impl wn2 = new Wn2Impl();
		return wn2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wn3 createWn3() {
		Wn3Impl wn3 = new Wn3Impl();
		return wn3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wn4 createWn4() {
		Wn4Impl wn4 = new Wn4Impl();
		return wn4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wn5 createWn5() {
		Wn5Impl wn5 = new Wn5Impl();
		return wn5;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wn6 createWn6() {
		Wn6Impl wn6 = new Wn6Impl();
		return wn6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wn7 createWn7() {
		Wn7Impl wn7 = new Wn7Impl();
		return wn7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Wvs createWvs() {
		WvsImpl wvs = new WvsImpl();
		return wvs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZlO createZlO() {
		ZlOImpl zlO = new ZlOImpl();
		return zlO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZlU createZlU() {
		ZlUImpl zlU = new ZlUImpl();
		return zlU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zp10 createZp10() {
		Zp10Impl zp10 = new Zp10Impl();
		return zp10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zp10Ls createZp10Ls() {
		Zp10LsImpl zp10Ls = new Zp10LsImpl();
		return zp10Ls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zp6 createZp6() {
		Zp6Impl zp6 = new Zp6Impl();
		return zp6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zp7 createZp7() {
		Zp7Impl zp7 = new Zp7Impl();
		return zp7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zp8 createZp8() {
		Zp8Impl zp8 = new Zp8Impl();
		return zp8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zp9 createZp9() {
		Zp9Impl zp9 = new Zp9Impl();
		return zp9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zp9Ls createZp9Ls() {
		Zp9LsImpl zp9Ls = new Zp9LsImpl();
		return zp9Ls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zs1 createZs1() {
		Zs1Impl zs1 = new Zs1Impl();
		return zs1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zs10 createZs10() {
		Zs10Impl zs10 = new Zs10Impl();
		return zs10;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zs103 createZs103() {
		Zs103Impl zs103 = new Zs103Impl();
		return zs103;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zs12 createZs12() {
		Zs12Impl zs12 = new Zs12Impl();
		return zs12;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zs13 createZs13() {
		Zs13Impl zs13 = new Zs13Impl();
		return zs13;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zs1A createZs1A() {
		Zs1AImpl zs1A = new Zs1AImpl();
		return zs1A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zs2 createZs2() {
		Zs2Impl zs2 = new Zs2Impl();
		return zs2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zs2v createZs2v() {
		Zs2vImpl zs2v = new Zs2vImpl();
		return zs2v;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zs3 createZs3() {
		Zs3Impl zs3 = new Zs3Impl();
		return zs3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zs3v createZs3v() {
		Zs3vImpl zs3v = new Zs3vImpl();
		return zs3v;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zs6 createZs6() {
		Zs6Impl zs6 = new Zs6Impl();
		return zs6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zs7 createZs7() {
		Zs7Impl zs7 = new Zs7Impl();
		return zs7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zs8 createZs8() {
		Zs8Impl zs8 = new Zs8Impl();
		return zs8;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zs8A createZs8A() {
		Zs8AImpl zs8A = new Zs8AImpl();
		return zs8A;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Zs9 createZs9() {
		Zs9Impl zs9 = new Zs9Impl();
		return zs9;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSymbolLf1 createENUMSymbolLf1FromString(EDataType eDataType, String initialValue) {
		ENUMSymbolLf1 result = ENUMSymbolLf1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSymbolLf1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSymbolLf12 createENUMSymbolLf12FromString(EDataType eDataType, String initialValue) {
		ENUMSymbolLf12 result = ENUMSymbolLf12.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSymbolLf12ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSymbolLf1Wdh createENUMSymbolLf1WdhFromString(EDataType eDataType, String initialValue) {
		ENUMSymbolLf1Wdh result = ENUMSymbolLf1Wdh.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSymbolLf1WdhToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSymbolLf4DS createENUMSymbolLf4DSFromString(EDataType eDataType, String initialValue) {
		ENUMSymbolLf4DS result = ENUMSymbolLf4DS.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSymbolLf4DSToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSymbolLf4DV createENUMSymbolLf4DVFromString(EDataType eDataType, String initialValue) {
		ENUMSymbolLf4DV result = ENUMSymbolLf4DV.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSymbolLf4DVToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSymbolLf6 createENUMSymbolLf6FromString(EDataType eDataType, String initialValue) {
		ENUMSymbolLf6 result = ENUMSymbolLf6.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSymbolLf6ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSymbolLf7 createENUMSymbolLf7FromString(EDataType eDataType, String initialValue) {
		ENUMSymbolLf7 result = ENUMSymbolLf7.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSymbolLf7ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSymbolZs2 createENUMSymbolZs2FromString(EDataType eDataType, String initialValue) {
		ENUMSymbolZs2 result = ENUMSymbolZs2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSymbolZs2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSymbolZs2v createENUMSymbolZs2vFromString(EDataType eDataType, String initialValue) {
		ENUMSymbolZs2v result = ENUMSymbolZs2v.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSymbolZs2vToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSymbolZs3 createENUMSymbolZs3FromString(EDataType eDataType, String initialValue) {
		ENUMSymbolZs3 result = ENUMSymbolZs3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSymbolZs3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSymbolZs3v createENUMSymbolZs3vFromString(EDataType eDataType, String initialValue) {
		ENUMSymbolZs3v result = ENUMSymbolZs3v.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSymbolZs3vToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createBS_Zusatz_Symbol_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBS_Zusatz_Symbol_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSymbolLf12 createENUMSymbolLf12ObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMSymbolLf12FromString(Signalbegriffe_Ril_301Package.eINSTANCE.getENUMSymbolLf12(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSymbolLf12ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMSymbolLf12ToString(Signalbegriffe_Ril_301Package.eINSTANCE.getENUMSymbolLf12(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSymbolLf1 createENUMSymbolLf1ObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMSymbolLf1FromString(Signalbegriffe_Ril_301Package.eINSTANCE.getENUMSymbolLf1(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSymbolLf1ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMSymbolLf1ToString(Signalbegriffe_Ril_301Package.eINSTANCE.getENUMSymbolLf1(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSymbolLf1Wdh createENUMSymbolLf1WdhObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMSymbolLf1WdhFromString(Signalbegriffe_Ril_301Package.eINSTANCE.getENUMSymbolLf1Wdh(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSymbolLf1WdhObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMSymbolLf1WdhToString(Signalbegriffe_Ril_301Package.eINSTANCE.getENUMSymbolLf1Wdh(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSymbolLf4DS createENUMSymbolLf4DSObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMSymbolLf4DSFromString(Signalbegriffe_Ril_301Package.eINSTANCE.getENUMSymbolLf4DS(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSymbolLf4DSObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMSymbolLf4DSToString(Signalbegriffe_Ril_301Package.eINSTANCE.getENUMSymbolLf4DS(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSymbolLf4DV createENUMSymbolLf4DVObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMSymbolLf4DVFromString(Signalbegriffe_Ril_301Package.eINSTANCE.getENUMSymbolLf4DV(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSymbolLf4DVObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMSymbolLf4DVToString(Signalbegriffe_Ril_301Package.eINSTANCE.getENUMSymbolLf4DV(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSymbolLf6 createENUMSymbolLf6ObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMSymbolLf6FromString(Signalbegriffe_Ril_301Package.eINSTANCE.getENUMSymbolLf6(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSymbolLf6ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMSymbolLf6ToString(Signalbegriffe_Ril_301Package.eINSTANCE.getENUMSymbolLf6(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSymbolLf7 createENUMSymbolLf7ObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMSymbolLf7FromString(Signalbegriffe_Ril_301Package.eINSTANCE.getENUMSymbolLf7(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSymbolLf7ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMSymbolLf7ToString(Signalbegriffe_Ril_301Package.eINSTANCE.getENUMSymbolLf7(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSymbolZs2 createENUMSymbolZs2ObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMSymbolZs2FromString(Signalbegriffe_Ril_301Package.eINSTANCE.getENUMSymbolZs2(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSymbolZs2ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMSymbolZs2ToString(Signalbegriffe_Ril_301Package.eINSTANCE.getENUMSymbolZs2(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSymbolZs2v createENUMSymbolZs2vObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMSymbolZs2vFromString(Signalbegriffe_Ril_301Package.eINSTANCE.getENUMSymbolZs2v(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSymbolZs2vObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMSymbolZs2vToString(Signalbegriffe_Ril_301Package.eINSTANCE.getENUMSymbolZs2v(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSymbolZs3 createENUMSymbolZs3ObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMSymbolZs3FromString(Signalbegriffe_Ril_301Package.eINSTANCE.getENUMSymbolZs3(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSymbolZs3ObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMSymbolZs3ToString(Signalbegriffe_Ril_301Package.eINSTANCE.getENUMSymbolZs3(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ENUMSymbolZs3v createENUMSymbolZs3vObjectFromString(EDataType eDataType, String initialValue) {
		return createENUMSymbolZs3vFromString(Signalbegriffe_Ril_301Package.eINSTANCE.getENUMSymbolZs3v(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertENUMSymbolZs3vObjectToString(EDataType eDataType, Object instanceValue) {
		return convertENUMSymbolZs3vToString(Signalbegriffe_Ril_301Package.eINSTANCE.getENUMSymbolZs3v(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createOz_Zugl_Symbol_TypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOz_Zugl_Symbol_TypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signalbegriffe_Ril_301Package getSignalbegriffe_Ril_301Package() {
		return (Signalbegriffe_Ril_301Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Signalbegriffe_Ril_301Package getPackage() {
		return Signalbegriffe_Ril_301Package.eINSTANCE;
	}

} //Signalbegriffe_Ril_301FactoryImpl
