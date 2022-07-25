/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Signalbegriffe_Ril_301.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.eclipse.set.model.model1902.Signalbegriffe_Ril_301.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Signalbegriffe_Ril_301.Signalbegriffe_Ril_301Package
 * @generated
 */
public class Signalbegriffe_Ril_301Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Signalbegriffe_Ril_301Validator INSTANCE = new Signalbegriffe_Ril_301Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.set.model.model1902.Signalbegriffe_Ril_301";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signalbegriffe_Ril_301Validator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Signalbegriffe_Ril_301Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Signalbegriffe_Ril_301Package.BSVAUES:
				return validateBSVAUES((BSVAUES)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.BSVRVA:
				return validateBSVRVA((BSVRVA)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.BS_WDH:
				return validateBSWdh((BSWdh)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.BS_ZUSATZ:
				return validateBSZusatz((BSZusatz)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.BUE00_LP:
				return validateBue00Lp((Bue00Lp)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.BUE01_LP:
				return validateBue01Lp((Bue01Lp)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.BUE01_S:
				return validateBue01S((Bue01S)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.BUE02_LP:
				return validateBue02Lp((Bue02Lp)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.BUE02_S:
				return validateBue02S((Bue02S)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.BUE10_LP_BLI:
				return validateBue10LpBli((Bue10LpBli)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.BUE11_LP_BLI:
				return validateBue11LpBli((Bue11LpBli)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.BUE11_SBLI:
				return validateBue11SBli((Bue11SBli)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.BUE12_LP_ST:
				return validateBue12LpSt((Bue12LpSt)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.BUE12_SST:
				return validateBue12SSt((Bue12SSt)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.BUE2:
				return validateBue2((Bue2)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.BUE21_R:
				return validateBue21R((Bue21R)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.BUE22_R:
				return validateBue22R((Bue22R)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.BUE23_R:
				return validateBue23R((Bue23R)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.BUE3:
				return validateBue3((Bue3)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.BUE4:
				return validateBue4((Bue4)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.BUE5:
				return validateBue5((Bue5)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.BUE_AT:
				return validateBueAT((BueAT)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.BUE_AT_ZUSATZ:
				return validateBueATZusatz((BueATZusatz)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.BUE_KT:
				return validateBueKT((BueKT)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.EL1:
				return validateEl1((El1)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.EL1V:
				return validateEl1v((El1v)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.EL2:
				return validateEl2((El2)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.EL3:
				return validateEl3((El3)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.EL4:
				return validateEl4((El4)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.EL5:
				return validateEl5((El5)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.EL6:
				return validateEl6((El6)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.EL_PF_B:
				return validateElPfB((ElPfB)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.EL_PF_L:
				return validateElPfL((ElPfL)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.EL_PF_O:
				return validateElPfO((ElPfO)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.EL_PF_R:
				return validateElPfR((ElPfR)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.EL_TAC:
				return validateElTAC((ElTAC)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.EL_TDC:
				return validateElTDC((ElTDC)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.HL1:
				return validateHl1((Hl1)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.HL10:
				return validateHl10((Hl10)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.HL11:
				return validateHl11((Hl11)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.HL12A:
				return validateHl12a((Hl12a)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.HL12B:
				return validateHl12b((Hl12b)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.HL2:
				return validateHl2((Hl2)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.HL3A:
				return validateHl3a((Hl3a)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.HL3B:
				return validateHl3b((Hl3b)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.HL4:
				return validateHl4((Hl4)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.HL5:
				return validateHl5((Hl5)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.HL6A:
				return validateHl6a((Hl6a)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.HL6B:
				return validateHl6b((Hl6b)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.HL7:
				return validateHl7((Hl7)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.HL8:
				return validateHl8((Hl8)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.HL9A:
				return validateHl9a((Hl9a)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.HL9B:
				return validateHl9b((Hl9b)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.HP0:
				return validateHp0((Hp0)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.HP02_LP:
				return validateHp02Lp((Hp02Lp)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.HP1:
				return validateHp1((Hp1)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.HP2:
				return validateHp2((Hp2)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.KL:
				return validateKl((Kl)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.KS1:
				return validateKs1((Ks1)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.KS2:
				return validateKs2((Ks2)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.LF1:
				return validateLf1((Lf1)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.LF12:
				return validateLf12((Lf12)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.LF2:
				return validateLf2((Lf2)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.LF3:
				return validateLf3((Lf3)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.LF4_DS:
				return validateLf4DS((Lf4DS)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.LF4_DV:
				return validateLf4DV((Lf4DV)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.LF5_DS:
				return validateLf5DS((Lf5DS)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.LF5_DV:
				return validateLf5DV((Lf5DV)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.LF6:
				return validateLf6((Lf6)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.LF7:
				return validateLf7((Lf7)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.LF_PF:
				return validateLfPf((LfPf)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.LF_PF_L:
				return validateLfPfL((LfPfL)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.LF_PF_R:
				return validateLfPfR((LfPfR)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.MS_GE_D:
				return validateMsGeD((MsGeD)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.MS_RT:
				return validateMsRt((MsRt)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.MS_SK_GE:
				return validateMsSkGe((MsSkGe)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.MS_SK_RT:
				return validateMsSkRt((MsSkRt)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.MS_UES_WDH:
				return validateMsUESWdh((MsUESWdh)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.MS_VW:
				return validateMsVw((MsVw)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.MS_WS2SW_P:
				return validateMsWs2swP((MsWs2swP)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.MS_WS_GE_WS:
				return validateMsWsGeWs((MsWsGeWs)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.MS_WS_RT_WS:
				return validateMsWsRtWs((MsWsRtWs)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.MS_WS_SW_WS:
				return validateMsWsSwWs((MsWsSwWs)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.NE1:
				return validateNe1((Ne1)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.NE12:
				return validateNe12((Ne12)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.NE13A:
				return validateNe13a((Ne13a)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.NE13B:
				return validateNe13b((Ne13b)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.NE14:
				return validateNe14((Ne14)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.NE2:
				return validateNe2((Ne2)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.NE2_VRVA:
				return validateNe2VRVA((Ne2VRVA)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.NE31STR:
				return validateNe31str((Ne31str)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.NE32STR:
				return validateNe32str((Ne32str)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.NE33STR:
				return validateNe33str((Ne33str)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.NE34STR:
				return validateNe34str((Ne34str)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.NE35STR:
				return validateNe35str((Ne35str)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.NE4:
				return validateNe4((Ne4)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.NE5:
				return validateNe5((Ne5)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.NE6:
				return validateNe6((Ne6)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.NE7A:
				return validateNe7a((Ne7a)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.NE7B:
				return validateNe7b((Ne7b)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.NISESHM:
				return validateNISESHM((NISESHM)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.OZ_AUTO_ET:
				return validateOzAutoET((OzAutoET)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.OZ_AUTO_HET:
				return validateOzAutoHET((OzAutoHET)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.OZ_BK:
				return validateOzBk((OzBk)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.OZ_ET:
				return validateOzET((OzET)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.OZ_FA:
				return validateOzFa((OzFa)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.OZ_FAK:
				return validateOzFak((OzFak)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.OZ_HET:
				return validateOzHET((OzHET)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.OZ_ICE:
				return validateOzICE((OzICE)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.OZ_LZB_BER:
				return validateOzLZBBer((OzLZBBer)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.OZ_OB_GRENZE:
				return validateOzOBGrenze((OzOBGrenze)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.OZ_PZBBUE:
				return validateOzPZBBUE((OzPZBBUE)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.OZ_ZF:
				return validateOzZf((OzZf)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.OZ_ZUGL:
				return validateOzZugl((OzZugl)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.PF2:
				return validatePf2((Pf2)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.RA10:
				return validateRa10((Ra10)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.RA11:
				return validateRa11((Ra11)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.RA11B:
				return validateRa11b((Ra11b)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.RA12:
				return validateRa12((Ra12)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.RA13:
				return validateRa13((Ra13)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.SH0:
				return validateSh0((Sh0)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.SH1:
				return validateSh1((Sh1)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.SH2:
				return validateSh2((Sh2)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.SK1:
				return validateSk1((Sk1)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.SK2:
				return validateSk2((Sk2)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.SO1:
				return validateSo1((So1)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.SO106:
				return validateSo106((So106)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.SO14:
				return validateSo14((So14)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.SO15:
				return validateSo15((So15)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.SO191_P:
				return validateSo191P((So191P)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.SO192_P:
				return validateSo192P((So192P)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.SO193_P:
				return validateSo193P((So193P)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.SO20:
				return validateSo20((So20)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.SV0:
				return validateSv0((Sv0)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.SV1:
				return validateSv1((Sv1)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.SV2:
				return validateSv2((Sv2)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.SV3:
				return validateSv3((Sv3)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.SV4:
				return validateSv4((Sv4)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.SV5:
				return validateSv5((Sv5)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.SV6:
				return validateSv6((Sv6)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.SV_WPF:
				return validateSvWPf((SvWPf)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.TS1:
				return validateTs1((Ts1)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.TS2:
				return validateTs2((Ts2)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.TS3:
				return validateTs3((Ts3)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.UKR:
				return validateUkr((Ukr)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.VR0:
				return validateVr0((Vr0)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.VR1:
				return validateVr1((Vr1)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.VR2:
				return validateVr2((Vr2)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.WN1:
				return validateWn1((Wn1)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.WN2:
				return validateWn2((Wn2)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.WN3:
				return validateWn3((Wn3)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.WN4:
				return validateWn4((Wn4)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.WN5:
				return validateWn5((Wn5)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.WN6:
				return validateWn6((Wn6)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.WN7:
				return validateWn7((Wn7)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.WVS:
				return validateWvs((Wvs)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ZL_O:
				return validateZlO((ZlO)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ZL_U:
				return validateZlU((ZlU)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ZP10:
				return validateZp10((Zp10)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ZP10_LS:
				return validateZp10Ls((Zp10Ls)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ZP6:
				return validateZp6((Zp6)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ZP7:
				return validateZp7((Zp7)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ZP8:
				return validateZp8((Zp8)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ZP9:
				return validateZp9((Zp9)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ZP9_LS:
				return validateZp9Ls((Zp9Ls)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ZS1:
				return validateZs1((Zs1)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ZS10:
				return validateZs10((Zs10)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ZS103:
				return validateZs103((Zs103)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ZS12:
				return validateZs12((Zs12)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ZS13:
				return validateZs13((Zs13)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ZS1_A:
				return validateZs1A((Zs1A)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ZS2:
				return validateZs2((Zs2)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ZS2V:
				return validateZs2v((Zs2v)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ZS3:
				return validateZs3((Zs3)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ZS3V:
				return validateZs3v((Zs3v)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ZS6:
				return validateZs6((Zs6)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ZS7:
				return validateZs7((Zs7)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ZS8:
				return validateZs8((Zs8)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ZS8_A:
				return validateZs8A((Zs8A)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ZS9:
				return validateZs9((Zs9)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF1:
				return validateENUMSymbolLf1((ENUMSymbolLf1)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF12:
				return validateENUMSymbolLf12((ENUMSymbolLf12)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF6:
				return validateENUMSymbolLf6((ENUMSymbolLf6)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF7:
				return validateENUMSymbolLf7((ENUMSymbolLf7)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_ZS2:
				return validateENUMSymbolZs2((ENUMSymbolZs2)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_ZS2V:
				return validateENUMSymbolZs2v((ENUMSymbolZs2v)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_ZS3:
				return validateENUMSymbolZs3((ENUMSymbolZs3)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_ZS3V:
				return validateENUMSymbolZs3v((ENUMSymbolZs3v)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.BS_ZUSATZ_SYMBOL_TYPE:
				return validateBS_Zusatz_Symbol_Type((String)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF12_OBJECT:
				return validateENUMSymbolLf12Object((ENUMSymbolLf12)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF1_OBJECT:
				return validateENUMSymbolLf1Object((ENUMSymbolLf1)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF6_OBJECT:
				return validateENUMSymbolLf6Object((ENUMSymbolLf6)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_LF7_OBJECT:
				return validateENUMSymbolLf7Object((ENUMSymbolLf7)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_ZS2_OBJECT:
				return validateENUMSymbolZs2Object((ENUMSymbolZs2)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_ZS2V_OBJECT:
				return validateENUMSymbolZs2vObject((ENUMSymbolZs2v)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_ZS3_OBJECT:
				return validateENUMSymbolZs3Object((ENUMSymbolZs3)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.ENUM_SYMBOL_ZS3V_OBJECT:
				return validateENUMSymbolZs3vObject((ENUMSymbolZs3v)value, diagnostics, context);
			case Signalbegriffe_Ril_301Package.OZ_ZUGL_SYMBOL_TYPE:
				return validateOz_Zugl_Symbol_Type((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBSVAUES(BSVAUES bsvaues, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bsvaues, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBSVRVA(BSVRVA bsvrva, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bsvrva, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBSWdh(BSWdh bsWdh, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bsWdh, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBSZusatz(BSZusatz bsZusatz, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bsZusatz, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBue00Lp(Bue00Lp bue00Lp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bue00Lp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBue01Lp(Bue01Lp bue01Lp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bue01Lp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBue01S(Bue01S bue01S, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bue01S, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBue02Lp(Bue02Lp bue02Lp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bue02Lp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBue02S(Bue02S bue02S, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bue02S, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBue10LpBli(Bue10LpBli bue10LpBli, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bue10LpBli, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBue11LpBli(Bue11LpBli bue11LpBli, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bue11LpBli, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBue11SBli(Bue11SBli bue11SBli, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bue11SBli, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBue12LpSt(Bue12LpSt bue12LpSt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bue12LpSt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBue12SSt(Bue12SSt bue12SSt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bue12SSt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBue2(Bue2 bue2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bue2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBue21R(Bue21R bue21R, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bue21R, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBue22R(Bue22R bue22R, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bue22R, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBue23R(Bue23R bue23R, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bue23R, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBue3(Bue3 bue3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bue3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBue4(Bue4 bue4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bue4, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBue5(Bue5 bue5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bue5, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBueAT(BueAT bueAT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bueAT, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBueATZusatz(BueATZusatz bueATZusatz, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bueATZusatz, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBueKT(BueKT bueKT, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bueKT, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEl1(El1 el1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(el1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEl1v(El1v el1v, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(el1v, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEl2(El2 el2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(el2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEl3(El3 el3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(el3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEl4(El4 el4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(el4, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEl5(El5 el5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(el5, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEl6(El6 el6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(el6, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElPfB(ElPfB elPfB, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elPfB, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElPfL(ElPfL elPfL, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elPfL, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElPfO(ElPfO elPfO, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elPfO, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElPfR(ElPfR elPfR, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elPfR, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElTAC(ElTAC elTAC, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elTAC, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateElTDC(ElTDC elTDC, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(elTDC, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHl1(Hl1 hl1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hl1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHl10(Hl10 hl10, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hl10, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHl11(Hl11 hl11, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hl11, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHl12a(Hl12a hl12a, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hl12a, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHl12b(Hl12b hl12b, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hl12b, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHl2(Hl2 hl2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hl2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHl3a(Hl3a hl3a, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hl3a, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHl3b(Hl3b hl3b, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hl3b, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHl4(Hl4 hl4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hl4, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHl5(Hl5 hl5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hl5, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHl6a(Hl6a hl6a, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hl6a, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHl6b(Hl6b hl6b, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hl6b, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHl7(Hl7 hl7, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hl7, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHl8(Hl8 hl8, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hl8, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHl9a(Hl9a hl9a, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hl9a, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHl9b(Hl9b hl9b, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hl9b, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHp0(Hp0 hp0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hp0, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHp02Lp(Hp02Lp hp02Lp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hp02Lp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHp1(Hp1 hp1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hp1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHp2(Hp2 hp2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(hp2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKl(Kl kl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(kl, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKs1(Ks1 ks1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ks1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateKs2(Ks2 ks2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ks2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLf1(Lf1 lf1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lf1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLf12(Lf12 lf12, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lf12, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLf2(Lf2 lf2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lf2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLf3(Lf3 lf3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lf3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLf4DS(Lf4DS lf4DS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lf4DS, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLf4DV(Lf4DV lf4DV, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lf4DV, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLf5DS(Lf5DS lf5DS, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lf5DS, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLf5DV(Lf5DV lf5DV, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lf5DV, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLf6(Lf6 lf6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lf6, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLf7(Lf7 lf7, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lf7, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLfPf(LfPf lfPf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lfPf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLfPfL(LfPfL lfPfL, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lfPfL, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLfPfR(LfPfR lfPfR, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lfPfR, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMsGeD(MsGeD msGeD, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(msGeD, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMsRt(MsRt msRt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(msRt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMsSkGe(MsSkGe msSkGe, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(msSkGe, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMsSkRt(MsSkRt msSkRt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(msSkRt, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMsUESWdh(MsUESWdh msUESWdh, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(msUESWdh, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMsVw(MsVw msVw, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(msVw, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMsWs2swP(MsWs2swP msWs2swP, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(msWs2swP, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMsWsGeWs(MsWsGeWs msWsGeWs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(msWsGeWs, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMsWsRtWs(MsWsRtWs msWsRtWs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(msWsRtWs, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMsWsSwWs(MsWsSwWs msWsSwWs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(msWsSwWs, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNe1(Ne1 ne1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ne1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNe12(Ne12 ne12, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ne12, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNe13a(Ne13a ne13a, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ne13a, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNe13b(Ne13b ne13b, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ne13b, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNe14(Ne14 ne14, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ne14, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNe2(Ne2 ne2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ne2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNe2VRVA(Ne2VRVA ne2VRVA, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ne2VRVA, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNe31str(Ne31str ne31str, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ne31str, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNe32str(Ne32str ne32str, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ne32str, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNe33str(Ne33str ne33str, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ne33str, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNe34str(Ne34str ne34str, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ne34str, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNe35str(Ne35str ne35str, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ne35str, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNe4(Ne4 ne4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ne4, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNe5(Ne5 ne5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ne5, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNe6(Ne6 ne6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ne6, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNe7a(Ne7a ne7a, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ne7a, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNe7b(Ne7b ne7b, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ne7b, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNISESHM(NISESHM niseshm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(niseshm, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOzAutoET(OzAutoET ozAutoET, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ozAutoET, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOzAutoHET(OzAutoHET ozAutoHET, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ozAutoHET, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOzBk(OzBk ozBk, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ozBk, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOzET(OzET ozET, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ozET, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOzFa(OzFa ozFa, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ozFa, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOzFak(OzFak ozFak, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ozFak, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOzHET(OzHET ozHET, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ozHET, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOzICE(OzICE ozICE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ozICE, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOzLZBBer(OzLZBBer ozLZBBer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ozLZBBer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOzOBGrenze(OzOBGrenze ozOBGrenze, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ozOBGrenze, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOzPZBBUE(OzPZBBUE ozPZBBUE, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ozPZBBUE, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOzZf(OzZf ozZf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ozZf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOzZugl(OzZugl ozZugl, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ozZugl, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePf2(Pf2 pf2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pf2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRa10(Ra10 ra10, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ra10, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRa11(Ra11 ra11, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ra11, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRa11b(Ra11b ra11b, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ra11b, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRa12(Ra12 ra12, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ra12, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRa13(Ra13 ra13, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ra13, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSh0(Sh0 sh0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sh0, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSh1(Sh1 sh1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sh1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSh2(Sh2 sh2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sh2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSk1(Sk1 sk1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sk1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSk2(Sk2 sk2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sk2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSo1(So1 so1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(so1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSo106(So106 so106, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(so106, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSo14(So14 so14, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(so14, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSo15(So15 so15, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(so15, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSo191P(So191P so191P, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(so191P, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSo192P(So192P so192P, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(so192P, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSo193P(So193P so193P, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(so193P, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSo20(So20 so20, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(so20, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSv0(Sv0 sv0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sv0, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSv1(Sv1 sv1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sv1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSv2(Sv2 sv2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sv2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSv3(Sv3 sv3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sv3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSv4(Sv4 sv4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sv4, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSv5(Sv5 sv5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sv5, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSv6(Sv6 sv6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sv6, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSvWPf(SvWPf svWPf, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(svWPf, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTs1(Ts1 ts1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ts1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTs2(Ts2 ts2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ts2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTs3(Ts3 ts3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ts3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUkr(Ukr ukr, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ukr, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVr0(Vr0 vr0, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vr0, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVr1(Vr1 vr1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vr1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVr2(Vr2 vr2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vr2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWn1(Wn1 wn1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wn1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWn2(Wn2 wn2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wn2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWn3(Wn3 wn3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wn3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWn4(Wn4 wn4, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wn4, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWn5(Wn5 wn5, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wn5, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWn6(Wn6 wn6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wn6, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWn7(Wn7 wn7, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wn7, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWvs(Wvs wvs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(wvs, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZlO(ZlO zlO, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zlO, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZlU(ZlU zlU, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zlU, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZp10(Zp10 zp10, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zp10, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZp10Ls(Zp10Ls zp10Ls, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zp10Ls, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZp6(Zp6 zp6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zp6, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZp7(Zp7 zp7, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zp7, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZp8(Zp8 zp8, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zp8, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZp9(Zp9 zp9, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zp9, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZp9Ls(Zp9Ls zp9Ls, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zp9Ls, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZs1(Zs1 zs1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zs1, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZs10(Zs10 zs10, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zs10, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZs103(Zs103 zs103, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zs103, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZs12(Zs12 zs12, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zs12, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZs13(Zs13 zs13, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zs13, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZs1A(Zs1A zs1A, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zs1A, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZs2(Zs2 zs2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zs2, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZs2v(Zs2v zs2v, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zs2v, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZs3(Zs3 zs3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zs3, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZs3v(Zs3v zs3v, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zs3v, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZs6(Zs6 zs6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zs6, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZs7(Zs7 zs7, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zs7, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZs8(Zs8 zs8, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zs8, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZs8A(Zs8A zs8A, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zs8A, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZs9(Zs9 zs9, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zs9, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSymbolLf1(ENUMSymbolLf1 enumSymbolLf1, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSymbolLf12(ENUMSymbolLf12 enumSymbolLf12, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSymbolLf6(ENUMSymbolLf6 enumSymbolLf6, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSymbolLf7(ENUMSymbolLf7 enumSymbolLf7, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSymbolZs2(ENUMSymbolZs2 enumSymbolZs2, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSymbolZs2v(ENUMSymbolZs2v enumSymbolZs2v, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSymbolZs3(ENUMSymbolZs3 enumSymbolZs3, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSymbolZs3v(ENUMSymbolZs3v enumSymbolZs3v, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBS_Zusatz_Symbol_Type(String bS_Zusatz_Symbol_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateBS_Zusatz_Symbol_Type_Pattern(bS_Zusatz_Symbol_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateBS_Zusatz_Symbol_Type_Pattern
	 */
	public static final  PatternMatcher [][] BS_ZUSATZ_SYMBOL_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,30}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>BS Zusatz Symbol Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBS_Zusatz_Symbol_Type_Pattern(String bS_Zusatz_Symbol_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Signalbegriffe_Ril_301Package.eINSTANCE.getBS_Zusatz_Symbol_Type(), bS_Zusatz_Symbol_Type, BS_ZUSATZ_SYMBOL_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSymbolLf12Object(ENUMSymbolLf12 enumSymbolLf12Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSymbolLf1Object(ENUMSymbolLf1 enumSymbolLf1Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSymbolLf6Object(ENUMSymbolLf6 enumSymbolLf6Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSymbolLf7Object(ENUMSymbolLf7 enumSymbolLf7Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSymbolZs2Object(ENUMSymbolZs2 enumSymbolZs2Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSymbolZs2vObject(ENUMSymbolZs2v enumSymbolZs2vObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSymbolZs3Object(ENUMSymbolZs3 enumSymbolZs3Object, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSymbolZs3vObject(ENUMSymbolZs3v enumSymbolZs3vObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOz_Zugl_Symbol_Type(String oz_Zugl_Symbol_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateOz_Zugl_Symbol_Type_Pattern(oz_Zugl_Symbol_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateOz_Zugl_Symbol_Type_Pattern
	 */
	public static final  PatternMatcher [][] OZ_ZUGL_SYMBOL_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,30}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Oz Zugl Symbol Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOz_Zugl_Symbol_Type_Pattern(String oz_Zugl_Symbol_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(Signalbegriffe_Ril_301Package.eINSTANCE.getOz_Zugl_Symbol_Type(), oz_Zugl_Symbol_Type, OZ_ZUGL_SYMBOL_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Signalbegriffe_Ril_301Validator
