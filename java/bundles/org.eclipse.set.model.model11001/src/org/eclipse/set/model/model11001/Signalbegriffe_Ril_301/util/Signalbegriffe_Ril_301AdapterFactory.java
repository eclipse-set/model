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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.*;

import org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Signalbegriffe_Ril_301Package
 * @generated
 */
public class Signalbegriffe_Ril_301AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Signalbegriffe_Ril_301Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Signalbegriffe_Ril_301AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Signalbegriffe_Ril_301Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Signalbegriffe_Ril_301Switch<Adapter> modelSwitch =
		new Signalbegriffe_Ril_301Switch<Adapter>() {
			@Override
			public Adapter caseBSVAUES(BSVAUES object) {
				return createBSVAUESAdapter();
			}
			@Override
			public Adapter caseBSVRVA(BSVRVA object) {
				return createBSVRVAAdapter();
			}
			@Override
			public Adapter caseBSWdh(BSWdh object) {
				return createBSWdhAdapter();
			}
			@Override
			public Adapter caseBSZBSBer(BSZBSBer object) {
				return createBSZBSBerAdapter();
			}
			@Override
			public Adapter caseBSZusatz(BSZusatz object) {
				return createBSZusatzAdapter();
			}
			@Override
			public Adapter caseBue00Lp(Bue00Lp object) {
				return createBue00LpAdapter();
			}
			@Override
			public Adapter caseBue01Lp(Bue01Lp object) {
				return createBue01LpAdapter();
			}
			@Override
			public Adapter caseBue01S(Bue01S object) {
				return createBue01SAdapter();
			}
			@Override
			public Adapter caseBue02Lp(Bue02Lp object) {
				return createBue02LpAdapter();
			}
			@Override
			public Adapter caseBue02S(Bue02S object) {
				return createBue02SAdapter();
			}
			@Override
			public Adapter caseBue10LpBli(Bue10LpBli object) {
				return createBue10LpBliAdapter();
			}
			@Override
			public Adapter caseBue11LpBli(Bue11LpBli object) {
				return createBue11LpBliAdapter();
			}
			@Override
			public Adapter caseBue11SBli(Bue11SBli object) {
				return createBue11SBliAdapter();
			}
			@Override
			public Adapter caseBue12LpSt(Bue12LpSt object) {
				return createBue12LpStAdapter();
			}
			@Override
			public Adapter caseBue12SSt(Bue12SSt object) {
				return createBue12SStAdapter();
			}
			@Override
			public Adapter caseBue2(Bue2 object) {
				return createBue2Adapter();
			}
			@Override
			public Adapter caseBue21R(Bue21R object) {
				return createBue21RAdapter();
			}
			@Override
			public Adapter caseBue22R(Bue22R object) {
				return createBue22RAdapter();
			}
			@Override
			public Adapter caseBue23R(Bue23R object) {
				return createBue23RAdapter();
			}
			@Override
			public Adapter caseBue3(Bue3 object) {
				return createBue3Adapter();
			}
			@Override
			public Adapter caseBue4(Bue4 object) {
				return createBue4Adapter();
			}
			@Override
			public Adapter caseBue5(Bue5 object) {
				return createBue5Adapter();
			}
			@Override
			public Adapter caseBueAT(BueAT object) {
				return createBueATAdapter();
			}
			@Override
			public Adapter caseBueATZusatz(BueATZusatz object) {
				return createBueATZusatzAdapter();
			}
			@Override
			public Adapter caseBueKT(BueKT object) {
				return createBueKTAdapter();
			}
			@Override
			public Adapter caseEl1(El1 object) {
				return createEl1Adapter();
			}
			@Override
			public Adapter caseEl1v(El1v object) {
				return createEl1vAdapter();
			}
			@Override
			public Adapter caseEl2(El2 object) {
				return createEl2Adapter();
			}
			@Override
			public Adapter caseEl3(El3 object) {
				return createEl3Adapter();
			}
			@Override
			public Adapter caseEl4(El4 object) {
				return createEl4Adapter();
			}
			@Override
			public Adapter caseEl5(El5 object) {
				return createEl5Adapter();
			}
			@Override
			public Adapter caseEl6(El6 object) {
				return createEl6Adapter();
			}
			@Override
			public Adapter caseElPfB(ElPfB object) {
				return createElPfBAdapter();
			}
			@Override
			public Adapter caseElPfL(ElPfL object) {
				return createElPfLAdapter();
			}
			@Override
			public Adapter caseElPfO(ElPfO object) {
				return createElPfOAdapter();
			}
			@Override
			public Adapter caseElPfR(ElPfR object) {
				return createElPfRAdapter();
			}
			@Override
			public Adapter caseElTAC(ElTAC object) {
				return createElTACAdapter();
			}
			@Override
			public Adapter caseElTDC(ElTDC object) {
				return createElTDCAdapter();
			}
			@Override
			public Adapter caseHl1(Hl1 object) {
				return createHl1Adapter();
			}
			@Override
			public Adapter caseHl10(Hl10 object) {
				return createHl10Adapter();
			}
			@Override
			public Adapter caseHl11(Hl11 object) {
				return createHl11Adapter();
			}
			@Override
			public Adapter caseHl12a(Hl12a object) {
				return createHl12aAdapter();
			}
			@Override
			public Adapter caseHl12b(Hl12b object) {
				return createHl12bAdapter();
			}
			@Override
			public Adapter caseHl2(Hl2 object) {
				return createHl2Adapter();
			}
			@Override
			public Adapter caseHl3a(Hl3a object) {
				return createHl3aAdapter();
			}
			@Override
			public Adapter caseHl3b(Hl3b object) {
				return createHl3bAdapter();
			}
			@Override
			public Adapter caseHl4(Hl4 object) {
				return createHl4Adapter();
			}
			@Override
			public Adapter caseHl5(Hl5 object) {
				return createHl5Adapter();
			}
			@Override
			public Adapter caseHl6a(Hl6a object) {
				return createHl6aAdapter();
			}
			@Override
			public Adapter caseHl6b(Hl6b object) {
				return createHl6bAdapter();
			}
			@Override
			public Adapter caseHl7(Hl7 object) {
				return createHl7Adapter();
			}
			@Override
			public Adapter caseHl8(Hl8 object) {
				return createHl8Adapter();
			}
			@Override
			public Adapter caseHl9a(Hl9a object) {
				return createHl9aAdapter();
			}
			@Override
			public Adapter caseHl9b(Hl9b object) {
				return createHl9bAdapter();
			}
			@Override
			public Adapter caseHp0(Hp0 object) {
				return createHp0Adapter();
			}
			@Override
			public Adapter caseHp02Lp(Hp02Lp object) {
				return createHp02LpAdapter();
			}
			@Override
			public Adapter caseHp1(Hp1 object) {
				return createHp1Adapter();
			}
			@Override
			public Adapter caseHp2(Hp2 object) {
				return createHp2Adapter();
			}
			@Override
			public Adapter caseKl(Kl object) {
				return createKlAdapter();
			}
			@Override
			public Adapter caseKs1(Ks1 object) {
				return createKs1Adapter();
			}
			@Override
			public Adapter caseKs2(Ks2 object) {
				return createKs2Adapter();
			}
			@Override
			public Adapter caseLf1(Lf1 object) {
				return createLf1Adapter();
			}
			@Override
			public Adapter caseLf12(Lf12 object) {
				return createLf12Adapter();
			}
			@Override
			public Adapter caseLf1Wdh(Lf1Wdh object) {
				return createLf1WdhAdapter();
			}
			@Override
			public Adapter caseLf2(Lf2 object) {
				return createLf2Adapter();
			}
			@Override
			public Adapter caseLf3(Lf3 object) {
				return createLf3Adapter();
			}
			@Override
			public Adapter caseLf4DS(Lf4DS object) {
				return createLf4DSAdapter();
			}
			@Override
			public Adapter caseLf4DV(Lf4DV object) {
				return createLf4DVAdapter();
			}
			@Override
			public Adapter caseLf5DS(Lf5DS object) {
				return createLf5DSAdapter();
			}
			@Override
			public Adapter caseLf5DV(Lf5DV object) {
				return createLf5DVAdapter();
			}
			@Override
			public Adapter caseLf6(Lf6 object) {
				return createLf6Adapter();
			}
			@Override
			public Adapter caseLf7(Lf7 object) {
				return createLf7Adapter();
			}
			@Override
			public Adapter caseLfPfL(LfPfL object) {
				return createLfPfLAdapter();
			}
			@Override
			public Adapter caseLfPfR(LfPfR object) {
				return createLfPfRAdapter();
			}
			@Override
			public Adapter caseMsGeD(MsGeD object) {
				return createMsGeDAdapter();
			}
			@Override
			public Adapter caseMsRt(MsRt object) {
				return createMsRtAdapter();
			}
			@Override
			public Adapter caseMsSkGe(MsSkGe object) {
				return createMsSkGeAdapter();
			}
			@Override
			public Adapter caseMsSkRt(MsSkRt object) {
				return createMsSkRtAdapter();
			}
			@Override
			public Adapter caseMsUESWdh(MsUESWdh object) {
				return createMsUESWdhAdapter();
			}
			@Override
			public Adapter caseMsVw(MsVw object) {
				return createMsVwAdapter();
			}
			@Override
			public Adapter caseMsWs2swP(MsWs2swP object) {
				return createMsWs2swPAdapter();
			}
			@Override
			public Adapter caseMsWsGeWs(MsWsGeWs object) {
				return createMsWsGeWsAdapter();
			}
			@Override
			public Adapter caseMsWsRtWs(MsWsRtWs object) {
				return createMsWsRtWsAdapter();
			}
			@Override
			public Adapter caseMsWsSwWs(MsWsSwWs object) {
				return createMsWsSwWsAdapter();
			}
			@Override
			public Adapter caseNe1(Ne1 object) {
				return createNe1Adapter();
			}
			@Override
			public Adapter caseNe12(Ne12 object) {
				return createNe12Adapter();
			}
			@Override
			public Adapter caseNe13a(Ne13a object) {
				return createNe13aAdapter();
			}
			@Override
			public Adapter caseNe13b(Ne13b object) {
				return createNe13bAdapter();
			}
			@Override
			public Adapter caseNe14(Ne14 object) {
				return createNe14Adapter();
			}
			@Override
			public Adapter caseNe2(Ne2 object) {
				return createNe2Adapter();
			}
			@Override
			public Adapter caseNe2VRVA(Ne2VRVA object) {
				return createNe2VRVAAdapter();
			}
			@Override
			public Adapter caseNe31str(Ne31str object) {
				return createNe31strAdapter();
			}
			@Override
			public Adapter caseNe32str(Ne32str object) {
				return createNe32strAdapter();
			}
			@Override
			public Adapter caseNe33str(Ne33str object) {
				return createNe33strAdapter();
			}
			@Override
			public Adapter caseNe34str(Ne34str object) {
				return createNe34strAdapter();
			}
			@Override
			public Adapter caseNe35str(Ne35str object) {
				return createNe35strAdapter();
			}
			@Override
			public Adapter caseNe4(Ne4 object) {
				return createNe4Adapter();
			}
			@Override
			public Adapter caseNe5(Ne5 object) {
				return createNe5Adapter();
			}
			@Override
			public Adapter caseNe6(Ne6 object) {
				return createNe6Adapter();
			}
			@Override
			public Adapter caseNe7a(Ne7a object) {
				return createNe7aAdapter();
			}
			@Override
			public Adapter caseNe7b(Ne7b object) {
				return createNe7bAdapter();
			}
			@Override
			public Adapter caseOzAutoET(OzAutoET object) {
				return createOzAutoETAdapter();
			}
			@Override
			public Adapter caseOzAutoHET(OzAutoHET object) {
				return createOzAutoHETAdapter();
			}
			@Override
			public Adapter caseOzBk(OzBk object) {
				return createOzBkAdapter();
			}
			@Override
			public Adapter caseOzET(OzET object) {
				return createOzETAdapter();
			}
			@Override
			public Adapter caseOzFa(OzFa object) {
				return createOzFaAdapter();
			}
			@Override
			public Adapter caseOzFak(OzFak object) {
				return createOzFakAdapter();
			}
			@Override
			public Adapter caseOzGSMR(OzGSMR object) {
				return createOzGSMRAdapter();
			}
			@Override
			public Adapter caseOzHET(OzHET object) {
				return createOzHETAdapter();
			}
			@Override
			public Adapter caseOzHM(OzHM object) {
				return createOzHMAdapter();
			}
			@Override
			public Adapter caseOzICE(OzICE object) {
				return createOzICEAdapter();
			}
			@Override
			public Adapter caseOzLZBBer(OzLZBBer object) {
				return createOzLZBBerAdapter();
			}
			@Override
			public Adapter caseOzOBGrenze(OzOBGrenze object) {
				return createOzOBGrenzeAdapter();
			}
			@Override
			public Adapter caseOzPZBBUE(OzPZBBUE object) {
				return createOzPZBBUEAdapter();
			}
			@Override
			public Adapter caseOzZf(OzZf object) {
				return createOzZfAdapter();
			}
			@Override
			public Adapter caseOzZugl(OzZugl object) {
				return createOzZuglAdapter();
			}
			@Override
			public Adapter casePf2(Pf2 object) {
				return createPf2Adapter();
			}
			@Override
			public Adapter caseRa10(Ra10 object) {
				return createRa10Adapter();
			}
			@Override
			public Adapter caseRa11(Ra11 object) {
				return createRa11Adapter();
			}
			@Override
			public Adapter caseRa11b(Ra11b object) {
				return createRa11bAdapter();
			}
			@Override
			public Adapter caseRa12(Ra12 object) {
				return createRa12Adapter();
			}
			@Override
			public Adapter caseRa13(Ra13 object) {
				return createRa13Adapter();
			}
			@Override
			public Adapter caseSh0(Sh0 object) {
				return createSh0Adapter();
			}
			@Override
			public Adapter caseSh1(Sh1 object) {
				return createSh1Adapter();
			}
			@Override
			public Adapter caseSh2(Sh2 object) {
				return createSh2Adapter();
			}
			@Override
			public Adapter caseSk1(Sk1 object) {
				return createSk1Adapter();
			}
			@Override
			public Adapter caseSk2(Sk2 object) {
				return createSk2Adapter();
			}
			@Override
			public Adapter caseSo1(So1 object) {
				return createSo1Adapter();
			}
			@Override
			public Adapter caseSo106(So106 object) {
				return createSo106Adapter();
			}
			@Override
			public Adapter caseSo14(So14 object) {
				return createSo14Adapter();
			}
			@Override
			public Adapter caseSo15(So15 object) {
				return createSo15Adapter();
			}
			@Override
			public Adapter caseSo191P(So191P object) {
				return createSo191PAdapter();
			}
			@Override
			public Adapter caseSo192P(So192P object) {
				return createSo192PAdapter();
			}
			@Override
			public Adapter caseSo193P(So193P object) {
				return createSo193PAdapter();
			}
			@Override
			public Adapter caseSo20(So20 object) {
				return createSo20Adapter();
			}
			@Override
			public Adapter caseSv0(Sv0 object) {
				return createSv0Adapter();
			}
			@Override
			public Adapter caseSv1(Sv1 object) {
				return createSv1Adapter();
			}
			@Override
			public Adapter caseSv2(Sv2 object) {
				return createSv2Adapter();
			}
			@Override
			public Adapter caseSv3(Sv3 object) {
				return createSv3Adapter();
			}
			@Override
			public Adapter caseSv4(Sv4 object) {
				return createSv4Adapter();
			}
			@Override
			public Adapter caseSv5(Sv5 object) {
				return createSv5Adapter();
			}
			@Override
			public Adapter caseSv6(Sv6 object) {
				return createSv6Adapter();
			}
			@Override
			public Adapter caseSvWPf(SvWPf object) {
				return createSvWPfAdapter();
			}
			@Override
			public Adapter caseTs1(Ts1 object) {
				return createTs1Adapter();
			}
			@Override
			public Adapter caseTs2(Ts2 object) {
				return createTs2Adapter();
			}
			@Override
			public Adapter caseTs3(Ts3 object) {
				return createTs3Adapter();
			}
			@Override
			public Adapter caseUkr(Ukr object) {
				return createUkrAdapter();
			}
			@Override
			public Adapter caseVr0(Vr0 object) {
				return createVr0Adapter();
			}
			@Override
			public Adapter caseVr1(Vr1 object) {
				return createVr1Adapter();
			}
			@Override
			public Adapter caseVr2(Vr2 object) {
				return createVr2Adapter();
			}
			@Override
			public Adapter caseWn1(Wn1 object) {
				return createWn1Adapter();
			}
			@Override
			public Adapter caseWn2(Wn2 object) {
				return createWn2Adapter();
			}
			@Override
			public Adapter caseWn3(Wn3 object) {
				return createWn3Adapter();
			}
			@Override
			public Adapter caseWn4(Wn4 object) {
				return createWn4Adapter();
			}
			@Override
			public Adapter caseWn5(Wn5 object) {
				return createWn5Adapter();
			}
			@Override
			public Adapter caseWn6(Wn6 object) {
				return createWn6Adapter();
			}
			@Override
			public Adapter caseWn7(Wn7 object) {
				return createWn7Adapter();
			}
			@Override
			public Adapter caseWvs(Wvs object) {
				return createWvsAdapter();
			}
			@Override
			public Adapter caseZlO(ZlO object) {
				return createZlOAdapter();
			}
			@Override
			public Adapter caseZlU(ZlU object) {
				return createZlUAdapter();
			}
			@Override
			public Adapter caseZp10(Zp10 object) {
				return createZp10Adapter();
			}
			@Override
			public Adapter caseZp10Ls(Zp10Ls object) {
				return createZp10LsAdapter();
			}
			@Override
			public Adapter caseZp6(Zp6 object) {
				return createZp6Adapter();
			}
			@Override
			public Adapter caseZp7(Zp7 object) {
				return createZp7Adapter();
			}
			@Override
			public Adapter caseZp8(Zp8 object) {
				return createZp8Adapter();
			}
			@Override
			public Adapter caseZp9(Zp9 object) {
				return createZp9Adapter();
			}
			@Override
			public Adapter caseZp9Ls(Zp9Ls object) {
				return createZp9LsAdapter();
			}
			@Override
			public Adapter caseZs1(Zs1 object) {
				return createZs1Adapter();
			}
			@Override
			public Adapter caseZs10(Zs10 object) {
				return createZs10Adapter();
			}
			@Override
			public Adapter caseZs103(Zs103 object) {
				return createZs103Adapter();
			}
			@Override
			public Adapter caseZs12(Zs12 object) {
				return createZs12Adapter();
			}
			@Override
			public Adapter caseZs13(Zs13 object) {
				return createZs13Adapter();
			}
			@Override
			public Adapter caseZs1A(Zs1A object) {
				return createZs1AAdapter();
			}
			@Override
			public Adapter caseZs2(Zs2 object) {
				return createZs2Adapter();
			}
			@Override
			public Adapter caseZs2v(Zs2v object) {
				return createZs2vAdapter();
			}
			@Override
			public Adapter caseZs3(Zs3 object) {
				return createZs3Adapter();
			}
			@Override
			public Adapter caseZs3v(Zs3v object) {
				return createZs3vAdapter();
			}
			@Override
			public Adapter caseZs6(Zs6 object) {
				return createZs6Adapter();
			}
			@Override
			public Adapter caseZs7(Zs7 object) {
				return createZs7Adapter();
			}
			@Override
			public Adapter caseZs8(Zs8 object) {
				return createZs8Adapter();
			}
			@Override
			public Adapter caseZs8A(Zs8A object) {
				return createZs8AAdapter();
			}
			@Override
			public Adapter caseZs9(Zs9 object) {
				return createZs9Adapter();
			}
			@Override
			public Adapter caseSignalbegriff_ID_TypeClass(Signalbegriff_ID_TypeClass object) {
				return createSignalbegriff_ID_TypeClassAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.BSVAUES <em>BSVAUES</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.BSVAUES
	 * @generated
	 */
	public Adapter createBSVAUESAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.BSVRVA <em>BSVRVA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.BSVRVA
	 * @generated
	 */
	public Adapter createBSVRVAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.BSWdh <em>BS Wdh</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.BSWdh
	 * @generated
	 */
	public Adapter createBSWdhAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.BSZBSBer <em>BSZBS Ber</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.BSZBSBer
	 * @generated
	 */
	public Adapter createBSZBSBerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.BSZusatz <em>BS Zusatz</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.BSZusatz
	 * @generated
	 */
	public Adapter createBSZusatzAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue00Lp <em>Bue00 Lp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue00Lp
	 * @generated
	 */
	public Adapter createBue00LpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue01Lp <em>Bue01 Lp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue01Lp
	 * @generated
	 */
	public Adapter createBue01LpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue01S <em>Bue01 S</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue01S
	 * @generated
	 */
	public Adapter createBue01SAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue02Lp <em>Bue02 Lp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue02Lp
	 * @generated
	 */
	public Adapter createBue02LpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue02S <em>Bue02 S</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue02S
	 * @generated
	 */
	public Adapter createBue02SAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue10LpBli <em>Bue10 Lp Bli</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue10LpBli
	 * @generated
	 */
	public Adapter createBue10LpBliAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue11LpBli <em>Bue11 Lp Bli</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue11LpBli
	 * @generated
	 */
	public Adapter createBue11LpBliAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue11SBli <em>Bue11 SBli</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue11SBli
	 * @generated
	 */
	public Adapter createBue11SBliAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue12LpSt <em>Bue12 Lp St</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue12LpSt
	 * @generated
	 */
	public Adapter createBue12LpStAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue12SSt <em>Bue12 SSt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue12SSt
	 * @generated
	 */
	public Adapter createBue12SStAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue2 <em>Bue2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue2
	 * @generated
	 */
	public Adapter createBue2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue21R <em>Bue21 R</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue21R
	 * @generated
	 */
	public Adapter createBue21RAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue22R <em>Bue22 R</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue22R
	 * @generated
	 */
	public Adapter createBue22RAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue23R <em>Bue23 R</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue23R
	 * @generated
	 */
	public Adapter createBue23RAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue3 <em>Bue3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue3
	 * @generated
	 */
	public Adapter createBue3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue4 <em>Bue4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue4
	 * @generated
	 */
	public Adapter createBue4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue5 <em>Bue5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Bue5
	 * @generated
	 */
	public Adapter createBue5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.BueAT <em>Bue AT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.BueAT
	 * @generated
	 */
	public Adapter createBueATAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.BueATZusatz <em>Bue AT Zusatz</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.BueATZusatz
	 * @generated
	 */
	public Adapter createBueATZusatzAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.BueKT <em>Bue KT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.BueKT
	 * @generated
	 */
	public Adapter createBueKTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.El1 <em>El1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.El1
	 * @generated
	 */
	public Adapter createEl1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.El1v <em>El1v</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.El1v
	 * @generated
	 */
	public Adapter createEl1vAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.El2 <em>El2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.El2
	 * @generated
	 */
	public Adapter createEl2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.El3 <em>El3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.El3
	 * @generated
	 */
	public Adapter createEl3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.El4 <em>El4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.El4
	 * @generated
	 */
	public Adapter createEl4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.El5 <em>El5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.El5
	 * @generated
	 */
	public Adapter createEl5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.El6 <em>El6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.El6
	 * @generated
	 */
	public Adapter createEl6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.ElPfB <em>El Pf B</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.ElPfB
	 * @generated
	 */
	public Adapter createElPfBAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.ElPfL <em>El Pf L</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.ElPfL
	 * @generated
	 */
	public Adapter createElPfLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.ElPfO <em>El Pf O</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.ElPfO
	 * @generated
	 */
	public Adapter createElPfOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.ElPfR <em>El Pf R</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.ElPfR
	 * @generated
	 */
	public Adapter createElPfRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.ElTAC <em>El TAC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.ElTAC
	 * @generated
	 */
	public Adapter createElTACAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.ElTDC <em>El TDC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.ElTDC
	 * @generated
	 */
	public Adapter createElTDCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hl1 <em>Hl1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hl1
	 * @generated
	 */
	public Adapter createHl1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hl10 <em>Hl10</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hl10
	 * @generated
	 */
	public Adapter createHl10Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hl11 <em>Hl11</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hl11
	 * @generated
	 */
	public Adapter createHl11Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hl12a <em>Hl12a</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hl12a
	 * @generated
	 */
	public Adapter createHl12aAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hl12b <em>Hl12b</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hl12b
	 * @generated
	 */
	public Adapter createHl12bAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hl2 <em>Hl2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hl2
	 * @generated
	 */
	public Adapter createHl2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hl3a <em>Hl3a</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hl3a
	 * @generated
	 */
	public Adapter createHl3aAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hl3b <em>Hl3b</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hl3b
	 * @generated
	 */
	public Adapter createHl3bAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hl4 <em>Hl4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hl4
	 * @generated
	 */
	public Adapter createHl4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hl5 <em>Hl5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hl5
	 * @generated
	 */
	public Adapter createHl5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hl6a <em>Hl6a</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hl6a
	 * @generated
	 */
	public Adapter createHl6aAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hl6b <em>Hl6b</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hl6b
	 * @generated
	 */
	public Adapter createHl6bAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hl7 <em>Hl7</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hl7
	 * @generated
	 */
	public Adapter createHl7Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hl8 <em>Hl8</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hl8
	 * @generated
	 */
	public Adapter createHl8Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hl9a <em>Hl9a</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hl9a
	 * @generated
	 */
	public Adapter createHl9aAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hl9b <em>Hl9b</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hl9b
	 * @generated
	 */
	public Adapter createHl9bAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hp0 <em>Hp0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hp0
	 * @generated
	 */
	public Adapter createHp0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hp02Lp <em>Hp02 Lp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hp02Lp
	 * @generated
	 */
	public Adapter createHp02LpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hp1 <em>Hp1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hp1
	 * @generated
	 */
	public Adapter createHp1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hp2 <em>Hp2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Hp2
	 * @generated
	 */
	public Adapter createHp2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Kl <em>Kl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Kl
	 * @generated
	 */
	public Adapter createKlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ks1 <em>Ks1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ks1
	 * @generated
	 */
	public Adapter createKs1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ks2 <em>Ks2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ks2
	 * @generated
	 */
	public Adapter createKs2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Lf1 <em>Lf1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Lf1
	 * @generated
	 */
	public Adapter createLf1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Lf12 <em>Lf12</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Lf12
	 * @generated
	 */
	public Adapter createLf12Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Lf1Wdh <em>Lf1 Wdh</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Lf1Wdh
	 * @generated
	 */
	public Adapter createLf1WdhAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Lf2 <em>Lf2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Lf2
	 * @generated
	 */
	public Adapter createLf2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Lf3 <em>Lf3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Lf3
	 * @generated
	 */
	public Adapter createLf3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Lf4DS <em>Lf4 DS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Lf4DS
	 * @generated
	 */
	public Adapter createLf4DSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Lf4DV <em>Lf4 DV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Lf4DV
	 * @generated
	 */
	public Adapter createLf4DVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Lf5DS <em>Lf5 DS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Lf5DS
	 * @generated
	 */
	public Adapter createLf5DSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Lf5DV <em>Lf5 DV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Lf5DV
	 * @generated
	 */
	public Adapter createLf5DVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Lf6 <em>Lf6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Lf6
	 * @generated
	 */
	public Adapter createLf6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Lf7 <em>Lf7</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Lf7
	 * @generated
	 */
	public Adapter createLf7Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.LfPfL <em>Lf Pf L</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.LfPfL
	 * @generated
	 */
	public Adapter createLfPfLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.LfPfR <em>Lf Pf R</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.LfPfR
	 * @generated
	 */
	public Adapter createLfPfRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.MsGeD <em>Ms Ge D</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.MsGeD
	 * @generated
	 */
	public Adapter createMsGeDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.MsRt <em>Ms Rt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.MsRt
	 * @generated
	 */
	public Adapter createMsRtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.MsSkGe <em>Ms Sk Ge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.MsSkGe
	 * @generated
	 */
	public Adapter createMsSkGeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.MsSkRt <em>Ms Sk Rt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.MsSkRt
	 * @generated
	 */
	public Adapter createMsSkRtAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.MsUESWdh <em>Ms UES Wdh</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.MsUESWdh
	 * @generated
	 */
	public Adapter createMsUESWdhAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.MsVw <em>Ms Vw</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.MsVw
	 * @generated
	 */
	public Adapter createMsVwAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.MsWs2swP <em>Ms Ws2sw P</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.MsWs2swP
	 * @generated
	 */
	public Adapter createMsWs2swPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.MsWsGeWs <em>Ms Ws Ge Ws</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.MsWsGeWs
	 * @generated
	 */
	public Adapter createMsWsGeWsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.MsWsRtWs <em>Ms Ws Rt Ws</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.MsWsRtWs
	 * @generated
	 */
	public Adapter createMsWsRtWsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.MsWsSwWs <em>Ms Ws Sw Ws</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.MsWsSwWs
	 * @generated
	 */
	public Adapter createMsWsSwWsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne1 <em>Ne1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne1
	 * @generated
	 */
	public Adapter createNe1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne12 <em>Ne12</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne12
	 * @generated
	 */
	public Adapter createNe12Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne13a <em>Ne13a</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne13a
	 * @generated
	 */
	public Adapter createNe13aAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne13b <em>Ne13b</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne13b
	 * @generated
	 */
	public Adapter createNe13bAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne14 <em>Ne14</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne14
	 * @generated
	 */
	public Adapter createNe14Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne2 <em>Ne2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne2
	 * @generated
	 */
	public Adapter createNe2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne2VRVA <em>Ne2 VRVA</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne2VRVA
	 * @generated
	 */
	public Adapter createNe2VRVAAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne31str <em>Ne31str</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne31str
	 * @generated
	 */
	public Adapter createNe31strAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne32str <em>Ne32str</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne32str
	 * @generated
	 */
	public Adapter createNe32strAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne33str <em>Ne33str</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne33str
	 * @generated
	 */
	public Adapter createNe33strAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne34str <em>Ne34str</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne34str
	 * @generated
	 */
	public Adapter createNe34strAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne35str <em>Ne35str</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne35str
	 * @generated
	 */
	public Adapter createNe35strAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne4 <em>Ne4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne4
	 * @generated
	 */
	public Adapter createNe4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne5 <em>Ne5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne5
	 * @generated
	 */
	public Adapter createNe5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne6 <em>Ne6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne6
	 * @generated
	 */
	public Adapter createNe6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne7a <em>Ne7a</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne7a
	 * @generated
	 */
	public Adapter createNe7aAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne7b <em>Ne7b</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ne7b
	 * @generated
	 */
	public Adapter createNe7bAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.OzAutoET <em>Oz Auto ET</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.OzAutoET
	 * @generated
	 */
	public Adapter createOzAutoETAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.OzAutoHET <em>Oz Auto HET</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.OzAutoHET
	 * @generated
	 */
	public Adapter createOzAutoHETAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.OzBk <em>Oz Bk</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.OzBk
	 * @generated
	 */
	public Adapter createOzBkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.OzET <em>Oz ET</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.OzET
	 * @generated
	 */
	public Adapter createOzETAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.OzFa <em>Oz Fa</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.OzFa
	 * @generated
	 */
	public Adapter createOzFaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.OzFak <em>Oz Fak</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.OzFak
	 * @generated
	 */
	public Adapter createOzFakAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.OzGSMR <em>Oz GSMR</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.OzGSMR
	 * @generated
	 */
	public Adapter createOzGSMRAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.OzHET <em>Oz HET</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.OzHET
	 * @generated
	 */
	public Adapter createOzHETAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.OzHM <em>Oz HM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.OzHM
	 * @generated
	 */
	public Adapter createOzHMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.OzICE <em>Oz ICE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.OzICE
	 * @generated
	 */
	public Adapter createOzICEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.OzLZBBer <em>Oz LZB Ber</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.OzLZBBer
	 * @generated
	 */
	public Adapter createOzLZBBerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.OzOBGrenze <em>Oz OB Grenze</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.OzOBGrenze
	 * @generated
	 */
	public Adapter createOzOBGrenzeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.OzPZBBUE <em>Oz PZBBUE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.OzPZBBUE
	 * @generated
	 */
	public Adapter createOzPZBBUEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.OzZf <em>Oz Zf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.OzZf
	 * @generated
	 */
	public Adapter createOzZfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.OzZugl <em>Oz Zugl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.OzZugl
	 * @generated
	 */
	public Adapter createOzZuglAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Pf2 <em>Pf2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Pf2
	 * @generated
	 */
	public Adapter createPf2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ra10 <em>Ra10</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ra10
	 * @generated
	 */
	public Adapter createRa10Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ra11 <em>Ra11</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ra11
	 * @generated
	 */
	public Adapter createRa11Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ra11b <em>Ra11b</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ra11b
	 * @generated
	 */
	public Adapter createRa11bAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ra12 <em>Ra12</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ra12
	 * @generated
	 */
	public Adapter createRa12Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ra13 <em>Ra13</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ra13
	 * @generated
	 */
	public Adapter createRa13Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Sh0 <em>Sh0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Sh0
	 * @generated
	 */
	public Adapter createSh0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Sh1 <em>Sh1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Sh1
	 * @generated
	 */
	public Adapter createSh1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Sh2 <em>Sh2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Sh2
	 * @generated
	 */
	public Adapter createSh2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Sk1 <em>Sk1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Sk1
	 * @generated
	 */
	public Adapter createSk1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Sk2 <em>Sk2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Sk2
	 * @generated
	 */
	public Adapter createSk2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.So1 <em>So1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.So1
	 * @generated
	 */
	public Adapter createSo1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.So106 <em>So106</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.So106
	 * @generated
	 */
	public Adapter createSo106Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.So14 <em>So14</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.So14
	 * @generated
	 */
	public Adapter createSo14Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.So15 <em>So15</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.So15
	 * @generated
	 */
	public Adapter createSo15Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.So191P <em>So191 P</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.So191P
	 * @generated
	 */
	public Adapter createSo191PAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.So192P <em>So192 P</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.So192P
	 * @generated
	 */
	public Adapter createSo192PAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.So193P <em>So193 P</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.So193P
	 * @generated
	 */
	public Adapter createSo193PAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.So20 <em>So20</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.So20
	 * @generated
	 */
	public Adapter createSo20Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Sv0 <em>Sv0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Sv0
	 * @generated
	 */
	public Adapter createSv0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Sv1 <em>Sv1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Sv1
	 * @generated
	 */
	public Adapter createSv1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Sv2 <em>Sv2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Sv2
	 * @generated
	 */
	public Adapter createSv2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Sv3 <em>Sv3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Sv3
	 * @generated
	 */
	public Adapter createSv3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Sv4 <em>Sv4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Sv4
	 * @generated
	 */
	public Adapter createSv4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Sv5 <em>Sv5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Sv5
	 * @generated
	 */
	public Adapter createSv5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Sv6 <em>Sv6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Sv6
	 * @generated
	 */
	public Adapter createSv6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.SvWPf <em>Sv WPf</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.SvWPf
	 * @generated
	 */
	public Adapter createSvWPfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ts1 <em>Ts1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ts1
	 * @generated
	 */
	public Adapter createTs1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ts2 <em>Ts2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ts2
	 * @generated
	 */
	public Adapter createTs2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ts3 <em>Ts3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ts3
	 * @generated
	 */
	public Adapter createTs3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ukr <em>Ukr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Ukr
	 * @generated
	 */
	public Adapter createUkrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Vr0 <em>Vr0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Vr0
	 * @generated
	 */
	public Adapter createVr0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Vr1 <em>Vr1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Vr1
	 * @generated
	 */
	public Adapter createVr1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Vr2 <em>Vr2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Vr2
	 * @generated
	 */
	public Adapter createVr2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Wn1 <em>Wn1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Wn1
	 * @generated
	 */
	public Adapter createWn1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Wn2 <em>Wn2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Wn2
	 * @generated
	 */
	public Adapter createWn2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Wn3 <em>Wn3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Wn3
	 * @generated
	 */
	public Adapter createWn3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Wn4 <em>Wn4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Wn4
	 * @generated
	 */
	public Adapter createWn4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Wn5 <em>Wn5</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Wn5
	 * @generated
	 */
	public Adapter createWn5Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Wn6 <em>Wn6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Wn6
	 * @generated
	 */
	public Adapter createWn6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Wn7 <em>Wn7</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Wn7
	 * @generated
	 */
	public Adapter createWn7Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Wvs <em>Wvs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Wvs
	 * @generated
	 */
	public Adapter createWvsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.ZlO <em>Zl O</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.ZlO
	 * @generated
	 */
	public Adapter createZlOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.ZlU <em>Zl U</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.ZlU
	 * @generated
	 */
	public Adapter createZlUAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zp10 <em>Zp10</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zp10
	 * @generated
	 */
	public Adapter createZp10Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zp10Ls <em>Zp10 Ls</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zp10Ls
	 * @generated
	 */
	public Adapter createZp10LsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zp6 <em>Zp6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zp6
	 * @generated
	 */
	public Adapter createZp6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zp7 <em>Zp7</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zp7
	 * @generated
	 */
	public Adapter createZp7Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zp8 <em>Zp8</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zp8
	 * @generated
	 */
	public Adapter createZp8Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zp9 <em>Zp9</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zp9
	 * @generated
	 */
	public Adapter createZp9Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zp9Ls <em>Zp9 Ls</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zp9Ls
	 * @generated
	 */
	public Adapter createZp9LsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zs1 <em>Zs1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zs1
	 * @generated
	 */
	public Adapter createZs1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zs10 <em>Zs10</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zs10
	 * @generated
	 */
	public Adapter createZs10Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zs103 <em>Zs103</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zs103
	 * @generated
	 */
	public Adapter createZs103Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zs12 <em>Zs12</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zs12
	 * @generated
	 */
	public Adapter createZs12Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zs13 <em>Zs13</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zs13
	 * @generated
	 */
	public Adapter createZs13Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zs1A <em>Zs1 A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zs1A
	 * @generated
	 */
	public Adapter createZs1AAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zs2 <em>Zs2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zs2
	 * @generated
	 */
	public Adapter createZs2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zs2v <em>Zs2v</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zs2v
	 * @generated
	 */
	public Adapter createZs2vAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zs3 <em>Zs3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zs3
	 * @generated
	 */
	public Adapter createZs3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zs3v <em>Zs3v</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zs3v
	 * @generated
	 */
	public Adapter createZs3vAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zs6 <em>Zs6</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zs6
	 * @generated
	 */
	public Adapter createZs6Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zs7 <em>Zs7</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zs7
	 * @generated
	 */
	public Adapter createZs7Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zs8 <em>Zs8</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zs8
	 * @generated
	 */
	public Adapter createZs8Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zs8A <em>Zs8 A</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zs8A
	 * @generated
	 */
	public Adapter createZs8AAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zs9 <em>Zs9</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Zs9
	 * @generated
	 */
	public Adapter createZs9Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass <em>Signalbegriff ID Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass
	 * @generated
	 */
	public Adapter createSignalbegriff_ID_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Signalbegriffe_Ril_301AdapterFactory
