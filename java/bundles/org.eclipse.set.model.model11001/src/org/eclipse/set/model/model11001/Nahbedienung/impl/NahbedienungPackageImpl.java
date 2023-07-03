/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Nahbedienung.impl;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.eclipse.set.model.model11001.ATO.ATOPackage;

import org.eclipse.set.model.model11001.ATO.impl.ATOPackageImpl;

import org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage;

import org.eclipse.set.model.model11001.Ansteuerung_Element.impl.Ansteuerung_ElementPackageImpl;

import org.eclipse.set.model.model11001.Bahnsteig.BahnsteigPackage;

import org.eclipse.set.model.model11001.Bahnsteig.impl.BahnsteigPackageImpl;

import org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.model.model11001.Bahnuebergang.impl.BahnuebergangPackageImpl;

import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;

import org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.Balisentechnik_ETCSPackageImpl;

import org.eclipse.set.model.model11001.BasisTypen.BasisTypenPackage;

import org.eclipse.set.model.model11001.BasisTypen.impl.BasisTypenPackageImpl;

import org.eclipse.set.model.model11001.Basisobjekte.BasisobjektePackage;

import org.eclipse.set.model.model11001.Basisobjekte.impl.BasisobjektePackageImpl;

import org.eclipse.set.model.model11001.Bedienung.BedienungPackage;

import org.eclipse.set.model.model11001.Bedienung.impl.BedienungPackageImpl;

import org.eclipse.set.model.model11001.Block.BlockPackage;

import org.eclipse.set.model.model11001.Block.impl.BlockPackageImpl;

import org.eclipse.set.model.model11001.Fahrstrasse.FahrstrassePackage;

import org.eclipse.set.model.model11001.Fahrstrasse.impl.FahrstrassePackageImpl;

import org.eclipse.set.model.model11001.Flankenschutz.FlankenschutzPackage;

import org.eclipse.set.model.model11001.Flankenschutz.impl.FlankenschutzPackageImpl;

import org.eclipse.set.model.model11001.Geodaten.GeodatenPackage;

import org.eclipse.set.model.model11001.Geodaten.impl.GeodatenPackageImpl;

import org.eclipse.set.model.model11001.Gleis.GleisPackage;

import org.eclipse.set.model.model11001.Gleis.impl.GleisPackageImpl;

import org.eclipse.set.model.model11001.Layoutinformationen.LayoutinformationenPackage;

import org.eclipse.set.model.model11001.Layoutinformationen.impl.LayoutinformationenPackageImpl;

import org.eclipse.set.model.model11001.Medien_und_Trassen.Medien_und_TrassenPackage;

import org.eclipse.set.model.model11001.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl;

import org.eclipse.set.model.model11001.Nahbedienung.AWU_TypeClass;
import org.eclipse.set.model.model11001.Nahbedienung.Bezeichnung_NB_TypeClass;
import org.eclipse.set.model.model11001.Nahbedienung.Bezeichnung_NB_Zone_TypeClass;
import org.eclipse.set.model.model11001.Nahbedienung.ENUMNBArt;
import org.eclipse.set.model.model11001.Nahbedienung.ENUMNBGrenzeArt;
import org.eclipse.set.model.model11001.Nahbedienung.ENUMNBRueckgabevoraussetzung;
import org.eclipse.set.model.model11001.Nahbedienung.ENUMNBVerhaeltnisBesonders;
import org.eclipse.set.model.model11001.Nahbedienung.ENUMWGspLage;
import org.eclipse.set.model.model11001.Nahbedienung.FA_FAE_TypeClass;
import org.eclipse.set.model.model11001.Nahbedienung.F_ST_Z_TypeClass;
import org.eclipse.set.model.model11001.Nahbedienung.Freie_Stellbarkeit_TypeClass;
import org.eclipse.set.model.model11001.Nahbedienung.Kennzahl_TypeClass;
import org.eclipse.set.model.model11001.Nahbedienung.NB_Art_TypeClass;
import org.eclipse.set.model.model11001.Nahbedienung.NB_Bedien_Anzeige_Element;
import org.eclipse.set.model.model11001.Nahbedienung.NB_Bedien_Anzeige_Funktionen_AttributeGroup;
import org.eclipse.set.model.model11001.Nahbedienung.NB_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model11001.Nahbedienung.NB_Funktionalitaet_NB_R_AttributeGroup;
import org.eclipse.set.model.model11001.Nahbedienung.NB_Grenze_Art_TypeClass;
import org.eclipse.set.model.model11001.Nahbedienung.NB_Rueckgabevoraussetzung_TypeClass;
import org.eclipse.set.model.model11001.Nahbedienung.NB_Verhaeltnis_Besonders_TypeClass;
import org.eclipse.set.model.model11001.Nahbedienung.NB_Zone;
import org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Allg_TypeClass;
import org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Element;
import org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Element_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Grenze;
import org.eclipse.set.model.model11001.Nahbedienung.NB_Zone_Reihenfolgezwang_AttributeGroup;
import org.eclipse.set.model.model11001.Nahbedienung.NahbedienungFactory;
import org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage;
import org.eclipse.set.model.model11001.Nahbedienung.Rang_TypeClass;
import org.eclipse.set.model.model11001.Nahbedienung.SBUE_TypeClass;
import org.eclipse.set.model.model11001.Nahbedienung.SLE_SLS_TypeClass;
import org.eclipse.set.model.model11001.Nahbedienung.Taste_ANF_TypeClass;
import org.eclipse.set.model.model11001.Nahbedienung.Taste_FGT_TypeClass;
import org.eclipse.set.model.model11001.Nahbedienung.Taste_WGT_TypeClass;
import org.eclipse.set.model.model11001.Nahbedienung.WHU_TypeClass;
import org.eclipse.set.model.model11001.Nahbedienung.WUS_TypeClass;
import org.eclipse.set.model.model11001.Nahbedienung.W_Gsp_Lage_TypeClass;

import org.eclipse.set.model.model11001.Nahbedienung.util.NahbedienungValidator;

import org.eclipse.set.model.model11001.Ortung.OrtungPackage;

import org.eclipse.set.model.model11001.Ortung.impl.OrtungPackageImpl;

import org.eclipse.set.model.model11001.PZB.PZBPackage;

import org.eclipse.set.model.model11001.PZB.impl.PZBPackageImpl;

import org.eclipse.set.model.model11001.PlanPro.PlanProPackage;

import org.eclipse.set.model.model11001.PlanPro.impl.PlanProPackageImpl;

import org.eclipse.set.model.model11001.Regelzeichnung.RegelzeichnungPackage;

import org.eclipse.set.model.model11001.Regelzeichnung.impl.RegelzeichnungPackageImpl;

import org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage;

import org.eclipse.set.model.model11001.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl;

import org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.Signalbegriffe_Ril_301Package;

import org.eclipse.set.model.model11001.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl;

import org.eclipse.set.model.model11001.Signalbegriffe_Struktur.Signalbegriffe_StrukturPackage;

import org.eclipse.set.model.model11001.Signalbegriffe_Struktur.impl.Signalbegriffe_StrukturPackageImpl;

import org.eclipse.set.model.model11001.Signale.SignalePackage;

import org.eclipse.set.model.model11001.Signale.impl.SignalePackageImpl;

import org.eclipse.set.model.model11001.Verweise.VerweisePackage;

import org.eclipse.set.model.model11001.Verweise.impl.VerweisePackageImpl;

import org.eclipse.set.model.model11001.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage;

import org.eclipse.set.model.model11001.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl;

import org.eclipse.set.model.model11001.Zuglenkung.ZuglenkungPackage;

import org.eclipse.set.model.model11001.Zuglenkung.impl.ZuglenkungPackageImpl;

import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

import org.eclipse.set.model.model11001.Zugnummernmeldeanlage.impl.ZugnummernmeldeanlagePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NahbedienungPackageImpl extends EPackageImpl implements NahbedienungPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass awU_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_NB_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_NB_Zone_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass f_ST_Z_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fA_FAE_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass freie_Stellbarkeit_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kennzahl_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nbEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nB_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nB_Bedien_Anzeige_ElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nB_Bedien_Anzeige_Funktionen_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nB_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nB_Funktionalitaet_NB_R_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nB_Grenze_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nB_Rueckgabevoraussetzung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nB_Verhaeltnis_Besonders_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nB_ZoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nB_Zone_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nB_Zone_Allg_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nB_Zone_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nB_Zone_ElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nB_Zone_Element_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nB_Zone_GrenzeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nB_Zone_Reihenfolgezwang_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rang_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sbuE_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass slE_SLS_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taste_ANF_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taste_FGT_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taste_WGT_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass w_Gsp_Lage_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whU_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wuS_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumnbArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumnbGrenzeArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumnbRueckgabevoraussetzungEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumnbVerhaeltnisBesondersEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumwGspLageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_NB_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_NB_Zone_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumnbArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumnbGrenzeArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumnbRueckgabevoraussetzungObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumnbVerhaeltnisBesondersObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumwGspLageObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nB_Zone_Allg_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rang_TypeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NahbedienungPackageImpl() {
		super(eNS_URI, NahbedienungFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link NahbedienungPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NahbedienungPackage init() {
		if (isInited) return (NahbedienungPackage)EPackage.Registry.INSTANCE.getEPackage(NahbedienungPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredNahbedienungPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		NahbedienungPackageImpl theNahbedienungPackage = registeredNahbedienungPackage instanceof NahbedienungPackageImpl ? (NahbedienungPackageImpl)registeredNahbedienungPackage : new NahbedienungPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI);
		PlanProPackageImpl thePlanProPackage = (PlanProPackageImpl)(registeredPackage instanceof PlanProPackageImpl ? registeredPackage : PlanProPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasisobjektePackage.eNS_URI);
		BasisobjektePackageImpl theBasisobjektePackage = (BasisobjektePackageImpl)(registeredPackage instanceof BasisobjektePackageImpl ? registeredPackage : BasisobjektePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasisTypenPackage.eNS_URI);
		BasisTypenPackageImpl theBasisTypenPackage = (BasisTypenPackageImpl)(registeredPackage instanceof BasisTypenPackageImpl ? registeredPackage : BasisTypenPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ATOPackage.eNS_URI);
		ATOPackageImpl theATOPackage = (ATOPackageImpl)(registeredPackage instanceof ATOPackageImpl ? registeredPackage : ATOPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(VerweisePackage.eNS_URI);
		VerweisePackageImpl theVerweisePackage = (VerweisePackageImpl)(registeredPackage instanceof VerweisePackageImpl ? registeredPackage : VerweisePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Ansteuerung_ElementPackage.eNS_URI);
		Ansteuerung_ElementPackageImpl theAnsteuerung_ElementPackage = (Ansteuerung_ElementPackageImpl)(registeredPackage instanceof Ansteuerung_ElementPackageImpl ? registeredPackage : Ansteuerung_ElementPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BahnsteigPackage.eNS_URI);
		BahnsteigPackageImpl theBahnsteigPackage = (BahnsteigPackageImpl)(registeredPackage instanceof BahnsteigPackageImpl ? registeredPackage : BahnsteigPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Balisentechnik_ETCSPackage.eNS_URI);
		Balisentechnik_ETCSPackageImpl theBalisentechnik_ETCSPackage = (Balisentechnik_ETCSPackageImpl)(registeredPackage instanceof Balisentechnik_ETCSPackageImpl ? registeredPackage : Balisentechnik_ETCSPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BedienungPackage.eNS_URI);
		BedienungPackageImpl theBedienungPackage = (BedienungPackageImpl)(registeredPackage instanceof BedienungPackageImpl ? registeredPackage : BedienungPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BlockPackage.eNS_URI);
		BlockPackageImpl theBlockPackage = (BlockPackageImpl)(registeredPackage instanceof BlockPackageImpl ? registeredPackage : BlockPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BahnuebergangPackage.eNS_URI);
		BahnuebergangPackageImpl theBahnuebergangPackage = (BahnuebergangPackageImpl)(registeredPackage instanceof BahnuebergangPackageImpl ? registeredPackage : BahnuebergangPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FlankenschutzPackage.eNS_URI);
		FlankenschutzPackageImpl theFlankenschutzPackage = (FlankenschutzPackageImpl)(registeredPackage instanceof FlankenschutzPackageImpl ? registeredPackage : FlankenschutzPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(OrtungPackage.eNS_URI);
		OrtungPackageImpl theOrtungPackage = (OrtungPackageImpl)(registeredPackage instanceof OrtungPackageImpl ? registeredPackage : OrtungPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(FahrstrassePackage.eNS_URI);
		FahrstrassePackageImpl theFahrstrassePackage = (FahrstrassePackageImpl)(registeredPackage instanceof FahrstrassePackageImpl ? registeredPackage : FahrstrassePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GeodatenPackage.eNS_URI);
		GeodatenPackageImpl theGeodatenPackage = (GeodatenPackageImpl)(registeredPackage instanceof GeodatenPackageImpl ? registeredPackage : GeodatenPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Weichen_und_GleissperrenPackage.eNS_URI);
		Weichen_und_GleissperrenPackageImpl theWeichen_und_GleissperrenPackage = (Weichen_und_GleissperrenPackageImpl)(registeredPackage instanceof Weichen_und_GleissperrenPackageImpl ? registeredPackage : Weichen_und_GleissperrenPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GleisPackage.eNS_URI);
		GleisPackageImpl theGleisPackage = (GleisPackageImpl)(registeredPackage instanceof GleisPackageImpl ? registeredPackage : GleisPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Medien_und_TrassenPackage.eNS_URI);
		Medien_und_TrassenPackageImpl theMedien_und_TrassenPackage = (Medien_und_TrassenPackageImpl)(registeredPackage instanceof Medien_und_TrassenPackageImpl ? registeredPackage : Medien_und_TrassenPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PZBPackage.eNS_URI);
		PZBPackageImpl thePZBPackage = (PZBPackageImpl)(registeredPackage instanceof PZBPackageImpl ? registeredPackage : PZBPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(RegelzeichnungPackage.eNS_URI);
		RegelzeichnungPackageImpl theRegelzeichnungPackage = (RegelzeichnungPackageImpl)(registeredPackage instanceof RegelzeichnungPackageImpl ? registeredPackage : RegelzeichnungPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SchluesselabhaengigkeitenPackage.eNS_URI);
		SchluesselabhaengigkeitenPackageImpl theSchluesselabhaengigkeitenPackage = (SchluesselabhaengigkeitenPackageImpl)(registeredPackage instanceof SchluesselabhaengigkeitenPackageImpl ? registeredPackage : SchluesselabhaengigkeitenPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(SignalePackage.eNS_URI);
		SignalePackageImpl theSignalePackage = (SignalePackageImpl)(registeredPackage instanceof SignalePackageImpl ? registeredPackage : SignalePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Signalbegriffe_StrukturPackage.eNS_URI);
		Signalbegriffe_StrukturPackageImpl theSignalbegriffe_StrukturPackage = (Signalbegriffe_StrukturPackageImpl)(registeredPackage instanceof Signalbegriffe_StrukturPackageImpl ? registeredPackage : Signalbegriffe_StrukturPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ZuglenkungPackage.eNS_URI);
		ZuglenkungPackageImpl theZuglenkungPackage = (ZuglenkungPackageImpl)(registeredPackage instanceof ZuglenkungPackageImpl ? registeredPackage : ZuglenkungPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ZugnummernmeldeanlagePackage.eNS_URI);
		ZugnummernmeldeanlagePackageImpl theZugnummernmeldeanlagePackage = (ZugnummernmeldeanlagePackageImpl)(registeredPackage instanceof ZugnummernmeldeanlagePackageImpl ? registeredPackage : ZugnummernmeldeanlagePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Signalbegriffe_Ril_301Package.eNS_URI);
		Signalbegriffe_Ril_301PackageImpl theSignalbegriffe_Ril_301Package = (Signalbegriffe_Ril_301PackageImpl)(registeredPackage instanceof Signalbegriffe_Ril_301PackageImpl ? registeredPackage : Signalbegriffe_Ril_301Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LayoutinformationenPackage.eNS_URI);
		LayoutinformationenPackageImpl theLayoutinformationenPackage = (LayoutinformationenPackageImpl)(registeredPackage instanceof LayoutinformationenPackageImpl ? registeredPackage : LayoutinformationenPackage.eINSTANCE);

		// Load packages
		thePlanProPackage.loadPackage();
		theBalisentechnik_ETCSPackage.loadPackage();
		theBahnuebergangPackage.loadPackage();
		theSignalbegriffe_Ril_301Package.loadPackage();

		// Create package meta-data objects
		theNahbedienungPackage.createPackageContents();
		theBasisobjektePackage.createPackageContents();
		theBasisTypenPackage.createPackageContents();
		theATOPackage.createPackageContents();
		theVerweisePackage.createPackageContents();
		theAnsteuerung_ElementPackage.createPackageContents();
		theBahnsteigPackage.createPackageContents();
		theBedienungPackage.createPackageContents();
		theBlockPackage.createPackageContents();
		theFlankenschutzPackage.createPackageContents();
		theOrtungPackage.createPackageContents();
		theFahrstrassePackage.createPackageContents();
		theGeodatenPackage.createPackageContents();
		theWeichen_und_GleissperrenPackage.createPackageContents();
		theGleisPackage.createPackageContents();
		theMedien_und_TrassenPackage.createPackageContents();
		thePZBPackage.createPackageContents();
		theRegelzeichnungPackage.createPackageContents();
		theSchluesselabhaengigkeitenPackage.createPackageContents();
		theSignalePackage.createPackageContents();
		theSignalbegriffe_StrukturPackage.createPackageContents();
		theZuglenkungPackage.createPackageContents();
		theZugnummernmeldeanlagePackage.createPackageContents();
		theLayoutinformationenPackage.createPackageContents();

		// Initialize created meta-data
		theNahbedienungPackage.initializePackageContents();
		theBasisobjektePackage.initializePackageContents();
		theBasisTypenPackage.initializePackageContents();
		theATOPackage.initializePackageContents();
		theVerweisePackage.initializePackageContents();
		theAnsteuerung_ElementPackage.initializePackageContents();
		theBahnsteigPackage.initializePackageContents();
		theBedienungPackage.initializePackageContents();
		theBlockPackage.initializePackageContents();
		theFlankenschutzPackage.initializePackageContents();
		theOrtungPackage.initializePackageContents();
		theFahrstrassePackage.initializePackageContents();
		theGeodatenPackage.initializePackageContents();
		theWeichen_und_GleissperrenPackage.initializePackageContents();
		theGleisPackage.initializePackageContents();
		theMedien_und_TrassenPackage.initializePackageContents();
		thePZBPackage.initializePackageContents();
		theRegelzeichnungPackage.initializePackageContents();
		theSchluesselabhaengigkeitenPackage.initializePackageContents();
		theSignalePackage.initializePackageContents();
		theSignalbegriffe_StrukturPackage.initializePackageContents();
		theZuglenkungPackage.initializePackageContents();
		theZugnummernmeldeanlagePackage.initializePackageContents();
		theLayoutinformationenPackage.initializePackageContents();

		// Fix loaded packages
		thePlanProPackage.fixPackageContents();
		theBalisentechnik_ETCSPackage.fixPackageContents();
		theBahnuebergangPackage.fixPackageContents();
		theSignalbegriffe_Ril_301Package.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theNahbedienungPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return NahbedienungValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theNahbedienungPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NahbedienungPackage.eNS_URI, theNahbedienungPackage);
		return theNahbedienungPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAWU_TypeClass() {
		return awU_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAWU_TypeClass_Wert() {
		return (EAttribute)awU_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_NB_TypeClass() {
		return bezeichnung_NB_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_NB_TypeClass_Wert() {
		return (EAttribute)bezeichnung_NB_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_NB_Zone_TypeClass() {
		return bezeichnung_NB_Zone_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_NB_Zone_TypeClass_Wert() {
		return (EAttribute)bezeichnung_NB_Zone_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getF_ST_Z_TypeClass() {
		return f_ST_Z_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getF_ST_Z_TypeClass_Wert() {
		return (EAttribute)f_ST_Z_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFA_FAE_TypeClass() {
		return fA_FAE_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFA_FAE_TypeClass_Wert() {
		return (EAttribute)fA_FAE_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFreie_Stellbarkeit_TypeClass() {
		return freie_Stellbarkeit_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFreie_Stellbarkeit_TypeClass_Wert() {
		return (EAttribute)freie_Stellbarkeit_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKennzahl_TypeClass() {
		return kennzahl_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKennzahl_TypeClass_Wert() {
		return (EAttribute)kennzahl_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNB() {
		return nbEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Bezeichnung() {
		return (EReference)nbEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_NBArt() {
		return (EReference)nbEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_NBFunktionalitaetNBR() {
		return (EReference)nbEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNB_Art_TypeClass() {
		return nB_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNB_Art_TypeClass_Wert() {
		return (EAttribute)nB_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNB_Bedien_Anzeige_Element() {
		return nB_Bedien_Anzeige_ElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Bedien_Anzeige_Element_IDBedienAnzeigeElement() {
		return (EReference)nB_Bedien_Anzeige_ElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Bedien_Anzeige_Element_IDNBZone() {
		return (EReference)nB_Bedien_Anzeige_ElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Bedien_Anzeige_Element_NBBedienAnzeigeFunktionen() {
		return (EReference)nB_Bedien_Anzeige_ElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNB_Bedien_Anzeige_Funktionen_AttributeGroup() {
		return nB_Bedien_Anzeige_Funktionen_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Bedien_Anzeige_Funktionen_AttributeGroup_TasteANF() {
		return (EReference)nB_Bedien_Anzeige_Funktionen_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Bedien_Anzeige_Funktionen_AttributeGroup_TasteFGT() {
		return (EReference)nB_Bedien_Anzeige_Funktionen_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Bedien_Anzeige_Funktionen_AttributeGroup_TasteWGT() {
		return (EReference)nB_Bedien_Anzeige_Funktionen_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNB_Bezeichnung_AttributeGroup() {
		return nB_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Bezeichnung_AttributeGroup_BezeichnungNB() {
		return (EReference)nB_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Bezeichnung_AttributeGroup_Kennzahl() {
		return (EReference)nB_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNB_Funktionalitaet_NB_R_AttributeGroup() {
		return nB_Funktionalitaet_NB_R_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Funktionalitaet_NB_R_AttributeGroup_AWU() {
		return (EReference)nB_Funktionalitaet_NB_R_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Funktionalitaet_NB_R_AttributeGroup_FSTZ() {
		return (EReference)nB_Funktionalitaet_NB_R_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Funktionalitaet_NB_R_AttributeGroup_FAFAE() {
		return (EReference)nB_Funktionalitaet_NB_R_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Funktionalitaet_NB_R_AttributeGroup_SBUE() {
		return (EReference)nB_Funktionalitaet_NB_R_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Funktionalitaet_NB_R_AttributeGroup_SLESLS() {
		return (EReference)nB_Funktionalitaet_NB_R_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Funktionalitaet_NB_R_AttributeGroup_WHU() {
		return (EReference)nB_Funktionalitaet_NB_R_AttributeGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Funktionalitaet_NB_R_AttributeGroup_WUS() {
		return (EReference)nB_Funktionalitaet_NB_R_AttributeGroupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNB_Grenze_Art_TypeClass() {
		return nB_Grenze_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNB_Grenze_Art_TypeClass_Wert() {
		return (EAttribute)nB_Grenze_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNB_Rueckgabevoraussetzung_TypeClass() {
		return nB_Rueckgabevoraussetzung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNB_Rueckgabevoraussetzung_TypeClass_Wert() {
		return (EAttribute)nB_Rueckgabevoraussetzung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNB_Verhaeltnis_Besonders_TypeClass() {
		return nB_Verhaeltnis_Besonders_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNB_Verhaeltnis_Besonders_TypeClass_Wert() {
		return (EAttribute)nB_Verhaeltnis_Besonders_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNB_Zone() {
		return nB_ZoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Zone_Bezeichnung() {
		return (EReference)nB_ZoneEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Zone_IDNB() {
		return (EReference)nB_ZoneEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Zone_IDNBZone() {
		return (EReference)nB_ZoneEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Zone_NBZoneAllg() {
		return (EReference)nB_ZoneEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNB_Zone_Allg_AttributeGroup() {
		return nB_Zone_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Zone_Allg_AttributeGroup_NBVerhaeltnisBesonders() {
		return (EReference)nB_Zone_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Zone_Allg_AttributeGroup_Rang() {
		return (EReference)nB_Zone_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNB_Zone_Allg_TypeClass() {
		return nB_Zone_Allg_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNB_Zone_Allg_TypeClass_Wert() {
		return (EAttribute)nB_Zone_Allg_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNB_Zone_Bezeichnung_AttributeGroup() {
		return nB_Zone_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Zone_Bezeichnung_AttributeGroup_BezeichnungNBZone() {
		return (EReference)nB_Zone_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNB_Zone_Element() {
		return nB_Zone_ElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Zone_Element_IDNBElement() {
		return (EReference)nB_Zone_ElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Zone_Element_IDNBZone() {
		return (EReference)nB_Zone_ElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Zone_Element_NBZoneElementAllg() {
		return (EReference)nB_Zone_ElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNB_Zone_Element_Allg_AttributeGroup() {
		return nB_Zone_Element_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Zone_Element_Allg_AttributeGroup_FreieStellbarkeit() {
		return (EReference)nB_Zone_Element_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Zone_Element_Allg_AttributeGroup_NBRueckgabevoraussetzung() {
		return (EReference)nB_Zone_Element_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Zone_Element_Allg_AttributeGroup_WGspLage() {
		return (EReference)nB_Zone_Element_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNB_Zone_Grenze() {
		return nB_Zone_GrenzeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Zone_Grenze_IDMarkanterPunkt() {
		return (EReference)nB_Zone_GrenzeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Zone_Grenze_IDNBZone() {
		return (EReference)nB_Zone_GrenzeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Zone_Grenze_NBGrenzeArt() {
		return (EReference)nB_Zone_GrenzeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNB_Zone_Reihenfolgezwang_AttributeGroup() {
		return nB_Zone_Reihenfolgezwang_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNB_Zone_Reihenfolgezwang_AttributeGroup_NBZoneAllg() {
		return (EReference)nB_Zone_Reihenfolgezwang_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRang_TypeClass() {
		return rang_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRang_TypeClass_Wert() {
		return (EAttribute)rang_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSBUE_TypeClass() {
		return sbuE_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSBUE_TypeClass_Wert() {
		return (EAttribute)sbuE_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSLE_SLS_TypeClass() {
		return slE_SLS_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSLE_SLS_TypeClass_Wert() {
		return (EAttribute)slE_SLS_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaste_ANF_TypeClass() {
		return taste_ANF_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaste_ANF_TypeClass_Wert() {
		return (EAttribute)taste_ANF_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaste_FGT_TypeClass() {
		return taste_FGT_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaste_FGT_TypeClass_Wert() {
		return (EAttribute)taste_FGT_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTaste_WGT_TypeClass() {
		return taste_WGT_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTaste_WGT_TypeClass_Wert() {
		return (EAttribute)taste_WGT_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getW_Gsp_Lage_TypeClass() {
		return w_Gsp_Lage_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getW_Gsp_Lage_TypeClass_Wert() {
		return (EAttribute)w_Gsp_Lage_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWHU_TypeClass() {
		return whU_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWHU_TypeClass_Wert() {
		return (EAttribute)whU_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWUS_TypeClass() {
		return wuS_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWUS_TypeClass_Wert() {
		return (EAttribute)wuS_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMNBArt() {
		return enumnbArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMNBGrenzeArt() {
		return enumnbGrenzeArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMNBRueckgabevoraussetzung() {
		return enumnbRueckgabevoraussetzungEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMNBVerhaeltnisBesonders() {
		return enumnbVerhaeltnisBesondersEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMWGspLage() {
		return enumwGspLageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_NB_Type() {
		return bezeichnung_NB_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_NB_Zone_Type() {
		return bezeichnung_NB_Zone_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMNBArtObject() {
		return enumnbArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMNBGrenzeArtObject() {
		return enumnbGrenzeArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMNBRueckgabevoraussetzungObject() {
		return enumnbRueckgabevoraussetzungObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMNBVerhaeltnisBesondersObject() {
		return enumnbVerhaeltnisBesondersObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMWGspLageObject() {
		return enumwGspLageObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNB_Zone_Allg_Type() {
		return nB_Zone_Allg_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRang_Type() {
		return rang_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NahbedienungFactory getNahbedienungFactory() {
		return (NahbedienungFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		awU_TypeClassEClass = createEClass(AWU_TYPE_CLASS);
		createEAttribute(awU_TypeClassEClass, AWU_TYPE_CLASS__WERT);

		bezeichnung_NB_TypeClassEClass = createEClass(BEZEICHNUNG_NB_TYPE_CLASS);
		createEAttribute(bezeichnung_NB_TypeClassEClass, BEZEICHNUNG_NB_TYPE_CLASS__WERT);

		bezeichnung_NB_Zone_TypeClassEClass = createEClass(BEZEICHNUNG_NB_ZONE_TYPE_CLASS);
		createEAttribute(bezeichnung_NB_Zone_TypeClassEClass, BEZEICHNUNG_NB_ZONE_TYPE_CLASS__WERT);

		f_ST_Z_TypeClassEClass = createEClass(FST_ZTYPE_CLASS);
		createEAttribute(f_ST_Z_TypeClassEClass, FST_ZTYPE_CLASS__WERT);

		fA_FAE_TypeClassEClass = createEClass(FA_FAE_TYPE_CLASS);
		createEAttribute(fA_FAE_TypeClassEClass, FA_FAE_TYPE_CLASS__WERT);

		freie_Stellbarkeit_TypeClassEClass = createEClass(FREIE_STELLBARKEIT_TYPE_CLASS);
		createEAttribute(freie_Stellbarkeit_TypeClassEClass, FREIE_STELLBARKEIT_TYPE_CLASS__WERT);

		kennzahl_TypeClassEClass = createEClass(KENNZAHL_TYPE_CLASS);
		createEAttribute(kennzahl_TypeClassEClass, KENNZAHL_TYPE_CLASS__WERT);

		nbEClass = createEClass(NB);
		createEReference(nbEClass, NB__BEZEICHNUNG);
		createEReference(nbEClass, NB__NB_ART);
		createEReference(nbEClass, NB__NB_FUNKTIONALITAET_NBR);

		nB_Art_TypeClassEClass = createEClass(NB_ART_TYPE_CLASS);
		createEAttribute(nB_Art_TypeClassEClass, NB_ART_TYPE_CLASS__WERT);

		nB_Bedien_Anzeige_ElementEClass = createEClass(NB_BEDIEN_ANZEIGE_ELEMENT);
		createEReference(nB_Bedien_Anzeige_ElementEClass, NB_BEDIEN_ANZEIGE_ELEMENT__ID_BEDIEN_ANZEIGE_ELEMENT);
		createEReference(nB_Bedien_Anzeige_ElementEClass, NB_BEDIEN_ANZEIGE_ELEMENT__IDNB_ZONE);
		createEReference(nB_Bedien_Anzeige_ElementEClass, NB_BEDIEN_ANZEIGE_ELEMENT__NB_BEDIEN_ANZEIGE_FUNKTIONEN);

		nB_Bedien_Anzeige_Funktionen_AttributeGroupEClass = createEClass(NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP);
		createEReference(nB_Bedien_Anzeige_Funktionen_AttributeGroupEClass, NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_ANF);
		createEReference(nB_Bedien_Anzeige_Funktionen_AttributeGroupEClass, NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_FGT);
		createEReference(nB_Bedien_Anzeige_Funktionen_AttributeGroupEClass, NB_BEDIEN_ANZEIGE_FUNKTIONEN_ATTRIBUTE_GROUP__TASTE_WGT);

		nB_Bezeichnung_AttributeGroupEClass = createEClass(NB_BEZEICHNUNG_ATTRIBUTE_GROUP);
		createEReference(nB_Bezeichnung_AttributeGroupEClass, NB_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_NB);
		createEReference(nB_Bezeichnung_AttributeGroupEClass, NB_BEZEICHNUNG_ATTRIBUTE_GROUP__KENNZAHL);

		nB_Funktionalitaet_NB_R_AttributeGroupEClass = createEClass(NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP);
		createEReference(nB_Funktionalitaet_NB_R_AttributeGroupEClass, NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__AWU);
		createEReference(nB_Funktionalitaet_NB_R_AttributeGroupEClass, NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__FSTZ);
		createEReference(nB_Funktionalitaet_NB_R_AttributeGroupEClass, NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__FAFAE);
		createEReference(nB_Funktionalitaet_NB_R_AttributeGroupEClass, NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__SBUE);
		createEReference(nB_Funktionalitaet_NB_R_AttributeGroupEClass, NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__SLESLS);
		createEReference(nB_Funktionalitaet_NB_R_AttributeGroupEClass, NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__WHU);
		createEReference(nB_Funktionalitaet_NB_R_AttributeGroupEClass, NB_FUNKTIONALITAET_NB_RATTRIBUTE_GROUP__WUS);

		nB_Grenze_Art_TypeClassEClass = createEClass(NB_GRENZE_ART_TYPE_CLASS);
		createEAttribute(nB_Grenze_Art_TypeClassEClass, NB_GRENZE_ART_TYPE_CLASS__WERT);

		nB_Rueckgabevoraussetzung_TypeClassEClass = createEClass(NB_RUECKGABEVORAUSSETZUNG_TYPE_CLASS);
		createEAttribute(nB_Rueckgabevoraussetzung_TypeClassEClass, NB_RUECKGABEVORAUSSETZUNG_TYPE_CLASS__WERT);

		nB_Verhaeltnis_Besonders_TypeClassEClass = createEClass(NB_VERHAELTNIS_BESONDERS_TYPE_CLASS);
		createEAttribute(nB_Verhaeltnis_Besonders_TypeClassEClass, NB_VERHAELTNIS_BESONDERS_TYPE_CLASS__WERT);

		nB_ZoneEClass = createEClass(NB_ZONE);
		createEReference(nB_ZoneEClass, NB_ZONE__BEZEICHNUNG);
		createEReference(nB_ZoneEClass, NB_ZONE__IDNB);
		createEReference(nB_ZoneEClass, NB_ZONE__IDNB_ZONE);
		createEReference(nB_ZoneEClass, NB_ZONE__NB_ZONE_ALLG);

		nB_Zone_Allg_AttributeGroupEClass = createEClass(NB_ZONE_ALLG_ATTRIBUTE_GROUP);
		createEReference(nB_Zone_Allg_AttributeGroupEClass, NB_ZONE_ALLG_ATTRIBUTE_GROUP__NB_VERHAELTNIS_BESONDERS);
		createEReference(nB_Zone_Allg_AttributeGroupEClass, NB_ZONE_ALLG_ATTRIBUTE_GROUP__RANG);

		nB_Zone_Allg_TypeClassEClass = createEClass(NB_ZONE_ALLG_TYPE_CLASS);
		createEAttribute(nB_Zone_Allg_TypeClassEClass, NB_ZONE_ALLG_TYPE_CLASS__WERT);

		nB_Zone_Bezeichnung_AttributeGroupEClass = createEClass(NB_ZONE_BEZEICHNUNG_ATTRIBUTE_GROUP);
		createEReference(nB_Zone_Bezeichnung_AttributeGroupEClass, NB_ZONE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_NB_ZONE);

		nB_Zone_ElementEClass = createEClass(NB_ZONE_ELEMENT);
		createEReference(nB_Zone_ElementEClass, NB_ZONE_ELEMENT__IDNB_ELEMENT);
		createEReference(nB_Zone_ElementEClass, NB_ZONE_ELEMENT__IDNB_ZONE);
		createEReference(nB_Zone_ElementEClass, NB_ZONE_ELEMENT__NB_ZONE_ELEMENT_ALLG);

		nB_Zone_Element_Allg_AttributeGroupEClass = createEClass(NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP);
		createEReference(nB_Zone_Element_Allg_AttributeGroupEClass, NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__FREIE_STELLBARKEIT);
		createEReference(nB_Zone_Element_Allg_AttributeGroupEClass, NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__NB_RUECKGABEVORAUSSETZUNG);
		createEReference(nB_Zone_Element_Allg_AttributeGroupEClass, NB_ZONE_ELEMENT_ALLG_ATTRIBUTE_GROUP__WGSP_LAGE);

		nB_Zone_GrenzeEClass = createEClass(NB_ZONE_GRENZE);
		createEReference(nB_Zone_GrenzeEClass, NB_ZONE_GRENZE__ID_MARKANTER_PUNKT);
		createEReference(nB_Zone_GrenzeEClass, NB_ZONE_GRENZE__IDNB_ZONE);
		createEReference(nB_Zone_GrenzeEClass, NB_ZONE_GRENZE__NB_GRENZE_ART);

		nB_Zone_Reihenfolgezwang_AttributeGroupEClass = createEClass(NB_ZONE_REIHENFOLGEZWANG_ATTRIBUTE_GROUP);
		createEReference(nB_Zone_Reihenfolgezwang_AttributeGroupEClass, NB_ZONE_REIHENFOLGEZWANG_ATTRIBUTE_GROUP__NB_ZONE_ALLG);

		rang_TypeClassEClass = createEClass(RANG_TYPE_CLASS);
		createEAttribute(rang_TypeClassEClass, RANG_TYPE_CLASS__WERT);

		sbuE_TypeClassEClass = createEClass(SBUE_TYPE_CLASS);
		createEAttribute(sbuE_TypeClassEClass, SBUE_TYPE_CLASS__WERT);

		slE_SLS_TypeClassEClass = createEClass(SLE_SLS_TYPE_CLASS);
		createEAttribute(slE_SLS_TypeClassEClass, SLE_SLS_TYPE_CLASS__WERT);

		taste_ANF_TypeClassEClass = createEClass(TASTE_ANF_TYPE_CLASS);
		createEAttribute(taste_ANF_TypeClassEClass, TASTE_ANF_TYPE_CLASS__WERT);

		taste_FGT_TypeClassEClass = createEClass(TASTE_FGT_TYPE_CLASS);
		createEAttribute(taste_FGT_TypeClassEClass, TASTE_FGT_TYPE_CLASS__WERT);

		taste_WGT_TypeClassEClass = createEClass(TASTE_WGT_TYPE_CLASS);
		createEAttribute(taste_WGT_TypeClassEClass, TASTE_WGT_TYPE_CLASS__WERT);

		w_Gsp_Lage_TypeClassEClass = createEClass(WGSP_LAGE_TYPE_CLASS);
		createEAttribute(w_Gsp_Lage_TypeClassEClass, WGSP_LAGE_TYPE_CLASS__WERT);

		whU_TypeClassEClass = createEClass(WHU_TYPE_CLASS);
		createEAttribute(whU_TypeClassEClass, WHU_TYPE_CLASS__WERT);

		wuS_TypeClassEClass = createEClass(WUS_TYPE_CLASS);
		createEAttribute(wuS_TypeClassEClass, WUS_TYPE_CLASS__WERT);

		// Create enums
		enumnbArtEEnum = createEEnum(ENUMNB_ART);
		enumnbGrenzeArtEEnum = createEEnum(ENUMNB_GRENZE_ART);
		enumnbRueckgabevoraussetzungEEnum = createEEnum(ENUMNB_RUECKGABEVORAUSSETZUNG);
		enumnbVerhaeltnisBesondersEEnum = createEEnum(ENUMNB_VERHAELTNIS_BESONDERS);
		enumwGspLageEEnum = createEEnum(ENUMW_GSP_LAGE);

		// Create data types
		bezeichnung_NB_TypeEDataType = createEDataType(BEZEICHNUNG_NB_TYPE);
		bezeichnung_NB_Zone_TypeEDataType = createEDataType(BEZEICHNUNG_NB_ZONE_TYPE);
		enumnbArtObjectEDataType = createEDataType(ENUMNB_ART_OBJECT);
		enumnbGrenzeArtObjectEDataType = createEDataType(ENUMNB_GRENZE_ART_OBJECT);
		enumnbRueckgabevoraussetzungObjectEDataType = createEDataType(ENUMNB_RUECKGABEVORAUSSETZUNG_OBJECT);
		enumnbVerhaeltnisBesondersObjectEDataType = createEDataType(ENUMNB_VERHAELTNIS_BESONDERS_OBJECT);
		enumwGspLageObjectEDataType = createEDataType(ENUMW_GSP_LAGE_OBJECT);
		nB_Zone_Allg_TypeEDataType = createEDataType(NB_ZONE_ALLG_TYPE);
		rang_TypeEDataType = createEDataType(RANG_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		BasisTypenPackage theBasisTypenPackage = (BasisTypenPackage)EPackage.Registry.INSTANCE.getEPackage(BasisTypenPackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);
		BasisobjektePackage theBasisobjektePackage = (BasisobjektePackage)EPackage.Registry.INSTANCE.getEPackage(BasisobjektePackage.eNS_URI);
		VerweisePackage theVerweisePackage = (VerweisePackage)EPackage.Registry.INSTANCE.getEPackage(VerweisePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		awU_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bezeichnung_NB_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bezeichnung_NB_Zone_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		f_ST_Z_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fA_FAE_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		freie_Stellbarkeit_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		kennzahl_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		nbEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		nB_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		nB_Bedien_Anzeige_ElementEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		nB_Grenze_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		nB_Rueckgabevoraussetzung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		nB_Verhaeltnis_Besonders_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		nB_ZoneEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		nB_Zone_Allg_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		nB_Zone_ElementEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		nB_Zone_GrenzeEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		rang_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		sbuE_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		slE_SLS_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		taste_ANF_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		taste_FGT_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		taste_WGT_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		w_Gsp_Lage_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		whU_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		wuS_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());

		// Initialize classes and features; add operations and parameters
		initEClass(awU_TypeClassEClass, AWU_TypeClass.class, "AWU_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAWU_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, AWU_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bezeichnung_NB_TypeClassEClass, Bezeichnung_NB_TypeClass.class, "Bezeichnung_NB_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBezeichnung_NB_TypeClass_Wert(), this.getBezeichnung_NB_Type(), "wert", null, 1, 1, Bezeichnung_NB_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bezeichnung_NB_Zone_TypeClassEClass, Bezeichnung_NB_Zone_TypeClass.class, "Bezeichnung_NB_Zone_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBezeichnung_NB_Zone_TypeClass_Wert(), this.getBezeichnung_NB_Zone_Type(), "wert", null, 1, 1, Bezeichnung_NB_Zone_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(f_ST_Z_TypeClassEClass, F_ST_Z_TypeClass.class, "F_ST_Z_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getF_ST_Z_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, F_ST_Z_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fA_FAE_TypeClassEClass, FA_FAE_TypeClass.class, "FA_FAE_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFA_FAE_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, FA_FAE_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(freie_Stellbarkeit_TypeClassEClass, Freie_Stellbarkeit_TypeClass.class, "Freie_Stellbarkeit_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFreie_Stellbarkeit_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Freie_Stellbarkeit_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kennzahl_TypeClassEClass, Kennzahl_TypeClass.class, "Kennzahl_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKennzahl_TypeClass_Wert(), theBasisTypenPackage.getKennzahl_Type(), "wert", null, 1, 1, Kennzahl_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nbEClass, org.eclipse.set.model.model11001.Nahbedienung.NB.class, "NB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNB_Bezeichnung(), this.getNB_Bezeichnung_AttributeGroup(), null, "bezeichnung", null, 1, 1, org.eclipse.set.model.model11001.Nahbedienung.NB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNB_NBArt(), this.getNB_Art_TypeClass(), null, "nBArt", null, 1, 1, org.eclipse.set.model.model11001.Nahbedienung.NB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNB_NBFunktionalitaetNBR(), this.getNB_Funktionalitaet_NB_R_AttributeGroup(), null, "nBFunktionalitaetNBR", null, 0, 1, org.eclipse.set.model.model11001.Nahbedienung.NB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nB_Art_TypeClassEClass, NB_Art_TypeClass.class, "NB_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNB_Art_TypeClass_Wert(), this.getENUMNBArtObject(), "wert", null, 1, 1, NB_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nB_Bedien_Anzeige_ElementEClass, NB_Bedien_Anzeige_Element.class, "NB_Bedien_Anzeige_Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNB_Bedien_Anzeige_Element_IDBedienAnzeigeElement(), theVerweisePackage.getID_Bedien_Anzeige_Element_TypeClass(), null, "iDBedienAnzeigeElement", null, 1, 1, NB_Bedien_Anzeige_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNB_Bedien_Anzeige_Element_IDNBZone(), theVerweisePackage.getID_NB_Zone_TypeClass(), null, "iDNBZone", null, 1, 1, NB_Bedien_Anzeige_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNB_Bedien_Anzeige_Element_NBBedienAnzeigeFunktionen(), this.getNB_Bedien_Anzeige_Funktionen_AttributeGroup(), null, "nBBedienAnzeigeFunktionen", null, 1, 1, NB_Bedien_Anzeige_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nB_Bedien_Anzeige_Funktionen_AttributeGroupEClass, NB_Bedien_Anzeige_Funktionen_AttributeGroup.class, "NB_Bedien_Anzeige_Funktionen_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNB_Bedien_Anzeige_Funktionen_AttributeGroup_TasteANF(), this.getTaste_ANF_TypeClass(), null, "tasteANF", null, 0, 1, NB_Bedien_Anzeige_Funktionen_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNB_Bedien_Anzeige_Funktionen_AttributeGroup_TasteFGT(), this.getTaste_FGT_TypeClass(), null, "tasteFGT", null, 0, 1, NB_Bedien_Anzeige_Funktionen_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNB_Bedien_Anzeige_Funktionen_AttributeGroup_TasteWGT(), this.getTaste_WGT_TypeClass(), null, "tasteWGT", null, 0, 1, NB_Bedien_Anzeige_Funktionen_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nB_Bezeichnung_AttributeGroupEClass, NB_Bezeichnung_AttributeGroup.class, "NB_Bezeichnung_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNB_Bezeichnung_AttributeGroup_BezeichnungNB(), this.getBezeichnung_NB_TypeClass(), null, "bezeichnungNB", null, 1, 1, NB_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNB_Bezeichnung_AttributeGroup_Kennzahl(), this.getKennzahl_TypeClass(), null, "kennzahl", null, 1, 1, NB_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nB_Funktionalitaet_NB_R_AttributeGroupEClass, NB_Funktionalitaet_NB_R_AttributeGroup.class, "NB_Funktionalitaet_NB_R_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNB_Funktionalitaet_NB_R_AttributeGroup_AWU(), this.getAWU_TypeClass(), null, "aWU", null, 1, 1, NB_Funktionalitaet_NB_R_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNB_Funktionalitaet_NB_R_AttributeGroup_FSTZ(), this.getF_ST_Z_TypeClass(), null, "fSTZ", null, 1, 1, NB_Funktionalitaet_NB_R_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNB_Funktionalitaet_NB_R_AttributeGroup_FAFAE(), this.getFA_FAE_TypeClass(), null, "fAFAE", null, 1, 1, NB_Funktionalitaet_NB_R_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNB_Funktionalitaet_NB_R_AttributeGroup_SBUE(), this.getSBUE_TypeClass(), null, "sBUE", null, 1, 1, NB_Funktionalitaet_NB_R_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNB_Funktionalitaet_NB_R_AttributeGroup_SLESLS(), this.getSLE_SLS_TypeClass(), null, "sLESLS", null, 1, 1, NB_Funktionalitaet_NB_R_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNB_Funktionalitaet_NB_R_AttributeGroup_WHU(), this.getWHU_TypeClass(), null, "wHU", null, 1, 1, NB_Funktionalitaet_NB_R_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNB_Funktionalitaet_NB_R_AttributeGroup_WUS(), this.getWUS_TypeClass(), null, "wUS", null, 1, 1, NB_Funktionalitaet_NB_R_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nB_Grenze_Art_TypeClassEClass, NB_Grenze_Art_TypeClass.class, "NB_Grenze_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNB_Grenze_Art_TypeClass_Wert(), this.getENUMNBGrenzeArtObject(), "wert", null, 1, 1, NB_Grenze_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nB_Rueckgabevoraussetzung_TypeClassEClass, NB_Rueckgabevoraussetzung_TypeClass.class, "NB_Rueckgabevoraussetzung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNB_Rueckgabevoraussetzung_TypeClass_Wert(), this.getENUMNBRueckgabevoraussetzungObject(), "wert", null, 1, 1, NB_Rueckgabevoraussetzung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nB_Verhaeltnis_Besonders_TypeClassEClass, NB_Verhaeltnis_Besonders_TypeClass.class, "NB_Verhaeltnis_Besonders_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNB_Verhaeltnis_Besonders_TypeClass_Wert(), this.getENUMNBVerhaeltnisBesondersObject(), "wert", null, 1, 1, NB_Verhaeltnis_Besonders_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nB_ZoneEClass, NB_Zone.class, "NB_Zone", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNB_Zone_Bezeichnung(), this.getNB_Zone_Bezeichnung_AttributeGroup(), null, "bezeichnung", null, 1, 1, NB_Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNB_Zone_IDNB(), theVerweisePackage.getID_NB_TypeClass(), null, "iDNB", null, 1, 1, NB_Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNB_Zone_IDNBZone(), theVerweisePackage.getID_NB_Zone_TypeClass(), null, "iDNBZone", null, 0, 1, NB_Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNB_Zone_NBZoneAllg(), this.getNB_Zone_Allg_AttributeGroup(), null, "nBZoneAllg", null, 0, 1, NB_Zone.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nB_Zone_Allg_AttributeGroupEClass, NB_Zone_Allg_AttributeGroup.class, "NB_Zone_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNB_Zone_Allg_AttributeGroup_NBVerhaeltnisBesonders(), this.getNB_Verhaeltnis_Besonders_TypeClass(), null, "nBVerhaeltnisBesonders", null, 0, 1, NB_Zone_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNB_Zone_Allg_AttributeGroup_Rang(), this.getRang_TypeClass(), null, "rang", null, 0, 1, NB_Zone_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nB_Zone_Allg_TypeClassEClass, NB_Zone_Allg_TypeClass.class, "NB_Zone_Allg_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNB_Zone_Allg_TypeClass_Wert(), this.getNB_Zone_Allg_Type(), "wert", null, 1, 1, NB_Zone_Allg_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nB_Zone_Bezeichnung_AttributeGroupEClass, NB_Zone_Bezeichnung_AttributeGroup.class, "NB_Zone_Bezeichnung_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNB_Zone_Bezeichnung_AttributeGroup_BezeichnungNBZone(), this.getBezeichnung_NB_Zone_TypeClass(), null, "bezeichnungNBZone", null, 1, 1, NB_Zone_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nB_Zone_ElementEClass, NB_Zone_Element.class, "NB_Zone_Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNB_Zone_Element_IDNBElement(), theVerweisePackage.getID_NB_Element_TypeClass(), null, "iDNBElement", null, 1, 1, NB_Zone_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNB_Zone_Element_IDNBZone(), theVerweisePackage.getID_NB_Zone_TypeClass(), null, "iDNBZone", null, 1, 1, NB_Zone_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNB_Zone_Element_NBZoneElementAllg(), this.getNB_Zone_Element_Allg_AttributeGroup(), null, "nBZoneElementAllg", null, 0, 1, NB_Zone_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nB_Zone_Element_Allg_AttributeGroupEClass, NB_Zone_Element_Allg_AttributeGroup.class, "NB_Zone_Element_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNB_Zone_Element_Allg_AttributeGroup_FreieStellbarkeit(), this.getFreie_Stellbarkeit_TypeClass(), null, "freieStellbarkeit", null, 0, 1, NB_Zone_Element_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNB_Zone_Element_Allg_AttributeGroup_NBRueckgabevoraussetzung(), this.getNB_Rueckgabevoraussetzung_TypeClass(), null, "nBRueckgabevoraussetzung", null, 1, 1, NB_Zone_Element_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNB_Zone_Element_Allg_AttributeGroup_WGspLage(), this.getW_Gsp_Lage_TypeClass(), null, "wGspLage", null, 0, 1, NB_Zone_Element_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nB_Zone_GrenzeEClass, NB_Zone_Grenze.class, "NB_Zone_Grenze", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNB_Zone_Grenze_IDMarkanterPunkt(), theVerweisePackage.getID_Markanter_Punkt_TypeClass(), null, "iDMarkanterPunkt", null, 1, 1, NB_Zone_Grenze.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNB_Zone_Grenze_IDNBZone(), theVerweisePackage.getID_NB_Zone_TypeClass(), null, "iDNBZone", null, 1, 1, NB_Zone_Grenze.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNB_Zone_Grenze_NBGrenzeArt(), this.getNB_Grenze_Art_TypeClass(), null, "nBGrenzeArt", null, 1, 1, NB_Zone_Grenze.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nB_Zone_Reihenfolgezwang_AttributeGroupEClass, NB_Zone_Reihenfolgezwang_AttributeGroup.class, "NB_Zone_Reihenfolgezwang_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNB_Zone_Reihenfolgezwang_AttributeGroup_NBZoneAllg(), this.getNB_Zone_Allg_TypeClass(), null, "nBZoneAllg", null, 0, 1, NB_Zone_Reihenfolgezwang_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rang_TypeClassEClass, Rang_TypeClass.class, "Rang_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRang_TypeClass_Wert(), this.getRang_Type(), "wert", null, 1, 1, Rang_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sbuE_TypeClassEClass, SBUE_TypeClass.class, "SBUE_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSBUE_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, SBUE_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(slE_SLS_TypeClassEClass, SLE_SLS_TypeClass.class, "SLE_SLS_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSLE_SLS_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, SLE_SLS_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taste_ANF_TypeClassEClass, Taste_ANF_TypeClass.class, "Taste_ANF_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaste_ANF_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Taste_ANF_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taste_FGT_TypeClassEClass, Taste_FGT_TypeClass.class, "Taste_FGT_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaste_FGT_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Taste_FGT_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taste_WGT_TypeClassEClass, Taste_WGT_TypeClass.class, "Taste_WGT_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTaste_WGT_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Taste_WGT_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(w_Gsp_Lage_TypeClassEClass, W_Gsp_Lage_TypeClass.class, "W_Gsp_Lage_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getW_Gsp_Lage_TypeClass_Wert(), this.getENUMWGspLageObject(), "wert", null, 1, 1, W_Gsp_Lage_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(whU_TypeClassEClass, WHU_TypeClass.class, "WHU_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWHU_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, WHU_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wuS_TypeClassEClass, WUS_TypeClass.class, "WUS_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWUS_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, WUS_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumnbArtEEnum, ENUMNBArt.class, "ENUMNBArt");
		addEEnumLiteral(enumnbArtEEnum, ENUMNBArt.ENUMNB_ART_NB_G);
		addEEnumLiteral(enumnbArtEEnum, ENUMNBArt.ENUMNB_ART_NB_R);
		addEEnumLiteral(enumnbArtEEnum, ENUMNBArt.ENUMNB_ART_NB_W);

		initEEnum(enumnbGrenzeArtEEnum, ENUMNBGrenzeArt.class, "ENUMNBGrenzeArt");
		addEEnumLiteral(enumnbGrenzeArtEEnum, ENUMNBGrenzeArt.ENUMNB_GRENZE_ART_ESTW_BEREICH);
		addEEnumLiteral(enumnbGrenzeArtEEnum, ENUMNBGrenzeArt.ENUMNB_GRENZE_ART_NB_ZONE);
		addEEnumLiteral(enumnbGrenzeArtEEnum, ENUMNBGrenzeArt.ENUMNB_GRENZE_ART_ORTSSTELLBEREICH);

		initEEnum(enumnbRueckgabevoraussetzungEEnum, ENUMNBRueckgabevoraussetzung.class, "ENUMNBRueckgabevoraussetzung");
		addEEnumLiteral(enumnbRueckgabevoraussetzungEEnum, ENUMNBRueckgabevoraussetzung.ENUMNB_RUECKGABEVORAUSSETZUNG_ABGELEGT);
		addEEnumLiteral(enumnbRueckgabevoraussetzungEEnum, ENUMNBRueckgabevoraussetzung.ENUMNB_RUECKGABEVORAUSSETZUNG_AUFGELEGT);
		addEEnumLiteral(enumnbRueckgabevoraussetzungEEnum, ENUMNBRueckgabevoraussetzung.ENUMNB_RUECKGABEVORAUSSETZUNG_HP_0);
		addEEnumLiteral(enumnbRueckgabevoraussetzungEEnum, ENUMNBRueckgabevoraussetzung.ENUMNB_RUECKGABEVORAUSSETZUNG_KEINE);
		addEEnumLiteral(enumnbRueckgabevoraussetzungEEnum, ENUMNBRueckgabevoraussetzung.ENUMNB_RUECKGABEVORAUSSETZUNG_KENNLICHT);
		addEEnumLiteral(enumnbRueckgabevoraussetzungEEnum, ENUMNBRueckgabevoraussetzung.ENUMNB_RUECKGABEVORAUSSETZUNG_LINKS);
		addEEnumLiteral(enumnbRueckgabevoraussetzungEEnum, ENUMNBRueckgabevoraussetzung.ENUMNB_RUECKGABEVORAUSSETZUNG_RECHTS);
		addEEnumLiteral(enumnbRueckgabevoraussetzungEEnum, ENUMNBRueckgabevoraussetzung.ENUMNB_RUECKGABEVORAUSSETZUNG_SCHLUESSEL_EINGESCHLOSSEN);

		initEEnum(enumnbVerhaeltnisBesondersEEnum, ENUMNBVerhaeltnisBesonders.class, "ENUMNBVerhaeltnisBesonders");
		addEEnumLiteral(enumnbVerhaeltnisBesondersEEnum, ENUMNBVerhaeltnisBesonders.ENUMNB_VERHAELTNIS_BESONDERS_UEBERLAPPEND);
		addEEnumLiteral(enumnbVerhaeltnisBesondersEEnum, ENUMNBVerhaeltnisBesonders.ENUMNB_VERHAELTNIS_BESONDERS_VEREINIGT);

		initEEnum(enumwGspLageEEnum, ENUMWGspLage.class, "ENUMWGspLage");
		addEEnumLiteral(enumwGspLageEEnum, ENUMWGspLage.ENUMW_GSP_LAGE_ABGELEGT);
		addEEnumLiteral(enumwGspLageEEnum, ENUMWGspLage.ENUMW_GSP_LAGE_AUFGELEGT);
		addEEnumLiteral(enumwGspLageEEnum, ENUMWGspLage.ENUMW_GSP_LAGE_LINKS);
		addEEnumLiteral(enumwGspLageEEnum, ENUMWGspLage.ENUMW_GSP_LAGE_RECHTS);
		addEEnumLiteral(enumwGspLageEEnum, ENUMWGspLage.ENUMW_GSP_LAGE_SONSTIGE);

		// Initialize data types
		initEDataType(bezeichnung_NB_TypeEDataType, BigInteger.class, "Bezeichnung_NB_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bezeichnung_NB_Zone_TypeEDataType, BigInteger.class, "Bezeichnung_NB_Zone_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumnbArtObjectEDataType, ENUMNBArt.class, "ENUMNBArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumnbGrenzeArtObjectEDataType, ENUMNBGrenzeArt.class, "ENUMNBGrenzeArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumnbRueckgabevoraussetzungObjectEDataType, ENUMNBRueckgabevoraussetzung.class, "ENUMNBRueckgabevoraussetzungObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumnbVerhaeltnisBesondersObjectEDataType, ENUMNBVerhaeltnisBesonders.class, "ENUMNBVerhaeltnisBesondersObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumwGspLageObjectEDataType, ENUMWGspLage.class, "ENUMWGspLageObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nB_Zone_Allg_TypeEDataType, BigInteger.class, "NB_Zone_Allg_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rang_TypeEDataType, BigInteger.class, "Rang_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// null
		createNullAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "documentation", "Dieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface."
		   });
		addAnnotation
		  (nbEClass,
		   source,
		   new String[] {
			   "documentation", "Nahstellbereich. Teilbereich innerhalb eines ESTW-Stellbereichs, f\u00fcr den zeitweise die Zust\u00e4ndigkeit vom Fahrdienstleiter an einen \u00f6rtlichen Bediener zur Durchf\u00fchrung von Rangierbewegungen abgegeben werden kann. Die Kommunikation zwischen Fahrdienstleiter und Bediener erfolgt \u00fcber entsprechende Bedieneinrichtung(en). Mit Abgabe der Nahbedienung hat der Fahrdienstleiter auf diesen Bereich keinen Zugriff; die Verantwortung liegt beim \u00f6rtlichen Bediener. Mit R\u00fcckgabe der Nahbedienung geht die Verantwortung vom Bediener wieder an den Fahrdienstleiter. F\u00fcr die R\u00fcckgabe der Nahbedienung k\u00f6nnen bestimmte Voraussetzungen erforderlich sein. F\u00fcr die Abgabe bzw. R\u00fcckgabe der Nahbedienung werden in der Literatur auch die Begriffe \\\"Einschalten\\\" und \\\"Ausschalten\\\" verwendet. Der Nahstellbereich muss vom \u00fcbrigen Stellwerksbereich durch Flankenschutzma\u00dfnahmen abgegrenzt werden. Jeder Nahstellbereich hat immer mindestens eine NB Zone. Bei einem Nahstellbereich mit der Funktionalit\u00e4t eines abgesetzten \\\"Rangierstellwerkes\\\" (NB-R) k\u00f6nnen Weichen mit elektrischem Antrieb umgestellt und innerhalb des NB Fahrten mit Rangierstra\u00dfen durchgef\u00fchrt werden. DB-Regelwerk F\u00fcr die Planung von Nahstellbereichen exisitert bei der DB AG kein Regelwerk."
		   });
		addAnnotation
		  (getNB_Bezeichnung(),
		   source,
		   new String[] {
			   "documentation", "Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle \u00fcber Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht m\u00f6glich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es m\u00f6glich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und \u00dcbersichtsplan, B\u00dc-Lageplan Planungstabellen "
		   });
		addAnnotation
		  (getNB_NBArt(),
		   source,
		   new String[] {
			   "documentation", "Festlegung der innerhalb des Nahstellbereiches m\u00f6glichen Bedienhandlungen. Die Art des Nahstellbereiches (NB) entscheidet \u00fcber die innerhalb des NB m\u00f6glichen Funktionalit\u00e4ten: G: Signale zeigen Kl/Sh1; nur ortsbediente Weichen umstellbar; B\u00dc-Bedienung mit Rangierschalter; W: wie G, zus\u00e4tzlich Umstellung von mit Antrieben ausger\u00fcsteter Weichen m\u00f6glich; R: wie W, zus\u00e4tzlich Fahren mit Rangierstra\u00dfen innerhalb des NB. In Abh\u00e4ngigkeit der gew\u00e4hlten Art des Nahstellbereiches werden Funktionalit\u00e4ten und physische Ausbildung von NB Bedien Anzeige Element festgelegt. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es geht aus dem zugeh\u00f6rigen Lastenheft hervor, dass dem LST-Fachplaner jedoch nicht zur Verf\u00fcgung steht."
		   });
		addAnnotation
		  (nB_Bedien_Anzeige_ElementEClass,
		   source,
		   new String[] {
			   "documentation", "Zuordnung von Bedienfunktionen zur Bedieneinrichtung einer oder mehrerer NB_Zonen, \u00fcber die Fahrdienstleiter und \u00f6rtlichen Bediener miteinander kommunizieren. Falls sich bedienbare Elemente innerhalb der NB_Zone befinden, sind diese durch eine entsprechende Bedieneinrichtung (um)stellbar, sofern eine (Um-)Stellbarkeit vorgesehen wurde. Der Umfang h\u00e4ngt von der gew\u00e4hlten NB Art ab. Weiterhin sind in der Bedieneinrichtung Elemente f\u00fcr die Kommunikation zwischen Fahrdienstleiter und Bediener untergebracht. In diesem Objekt wird die Logik der Bedieneinrichtung abgebildet. Falls eine Bedieneinrichtung Elemente aus mindestens zwei verschiedenen NB_Zonen enth\u00e4lt, ist eine Zuordnung der Bedieneinrichtung zu den betreffenden NB_Zonen erforderlich. Der Verweis auf Bedien Anzeige Element f\u00fchrt zur Zuordnung der physischen Unterbringung. DB-Regelwerk F\u00fcr die Planung exisitert bei der DB AG kein Regelwerk. Die Angaben finden sich meist im Erl\u00e4uterungsbericht zum PT1."
		   });
		addAnnotation
		  (getNB_Bedien_Anzeige_Element_IDBedienAnzeigeElement(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf das Bedien Anzeige Element, welches die Zuordnung zur Bedien Einrichtung Oertlich und damit zur physischen Unterbringung der Tasten herstellt. "
		   });
		addAnnotation
		  (getNB_Bedien_Anzeige_Element_IDNBZone(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die NB_Zone, der das geplante Bedien_Anzeige_Element zugeordnet wird. "
		   });
		addAnnotation
		  (getNB_Bedien_Anzeige_Funktionen_AttributeGroup_TasteANF(),
		   source,
		   new String[] {
			   "documentation", "Anforderungstaste. Eine Anforderungstaste ist vorzusehen, mit der der \u00f6rtliche Bediener beim Fahrdienstleiter die Nahbedienung anfordert. DB-Regelwerk F\u00fcr die Planung von Nahstellbereichen exisitert bei der DB AG kein Regelwerk. Es gibt ein Lastenheft sowie firmenspezifische Projektierungshinweise, die jedoch dem LST-Fachplaner nicht zur Verf\u00fcgung stehen."
		   });
		addAnnotation
		  (getNB_Bedien_Anzeige_Funktionen_AttributeGroup_TasteFGT(),
		   source,
		   new String[] {
			   "documentation", "Fertigmeldetaste. Eine Fertigmeldetaste ist vorzusehen, mit der der Bediener dem Fahrdienstleiter den NB fertig meldet, bevor die Nahbedienung zur\u00fcckgenommen werden kann. DB-Regelwerk F\u00fcr die Planung von Nahstellbereichen exisitert bei der DB AG kein Regelwerk. Es gibt ein Lastenheft sowie firmenspezifische Projektierungshinweise, die jedoch dem LST-Fachplaner nicht zur Verf\u00fcgung stehen."
		   });
		addAnnotation
		  (getNB_Bedien_Anzeige_Funktionen_AttributeGroup_TasteWGT(),
		   source,
		   new String[] {
			   "documentation", "Weichengruppentaste. Eine Weichengruppentaste f\u00fcr die Zwei-Tasten-Bedienung ist vorzusehen. Damit k\u00f6nnen innerhalb eines Nahstellbereiches ferngestellte Weichen, die ans ESTW angebunden sind, w\u00e4hrend der abgegebenen Nahbedienung durch den \u00f6rtlichen Bediener umgestellt werden. DB-Regelwerk F\u00fcr die Planung von Nahstellbereichen exisitert bei der DB AG kein Regelwerk. Es gibt ein Lastenheft sowie firmenspezifische Projektierungshinweise, die jedoch dem LST-Fachplaner nicht zur Verf\u00fcgung stehen."
		   });
		addAnnotation
		  (getNB_Bezeichnung_AttributeGroup_BezeichnungNB(),
		   source,
		   new String[] {
			   "documentation", "Numerische Bezeichnung des Nahstellbereichs. Die Bezeichnung des Nahstellbereichs gem\u00e4\u00df Ril 819.9001 (z. B. 99NB1) wird aus der Kennzahl von Bezeichnung Element, dem K\u00fcrzel NB (generiert aus der Anlegung der Instanz \u201eNB\u201c) und der NB_Bezeichnung zusammengesetzt. Das Attribut NB_Bezeichnung wurde trotz Nutzung der Basisattributgruppe Bezeichnung geschaffen, da die numerische Bezeichnung des NB (z. B. \\\"1\\\") kein \u00f6rtlicher Elementbezeichner ist. DB-Regelwerk 819.9001 "
		   });
		addAnnotation
		  (getNB_Bezeichnung_AttributeGroup_Kennzahl(),
		   source,
		   new String[] {
			   "documentation", "Eindeutige Kennzahl der operativen Sicherungstechnik innerhalb eines Bedienbezirks f\u00fcr eine Betriebsstelle.\n\nDie ESTW-Kennzahl kennzeichnet eine Betriebsstelle oder einen Betriebsstellenteil. Es handelt sich nicht um die Bahnhofsnummer der Zugnummernmeldeanlage (Ril 819.0731)!\n\nEine Betriebsstelle kann mehrere Kennzahlen erhalten. Z.B. dann, wenn in einem Geb\u00e4ude zwei ESTW-Zentraleinheiten untergebracht sind (Beispiel Hannover Hbf mit den ESTW-Zentraleinheiten \u201eHH Kennzahl 06\u201c und \u201eHHZX Kennzahl 30\u201c).\n\nEine Kennzahl kann aber auch mehrere Betriebsstellen beinhalten. Z. B dann, wenn eine ESTW-Zentraleinheit zwei \u00dcberleitstellen steuert (Beispiel ESTW-Zentraleinheit Giften HGIF Kennzahl 71 mit \u201e\u00dcst Giften HGIF\u201c und \u201e\u00dcst Ritterkamp HRIT\u201c.\n\nIn Stellbereichen von Bedienbezirken werden f\u00fcr Betriebsstellen (z. B. Bahnh\u00f6fe, Abzweigstellen, Anschlussstellen) Kennzahlen von 01 bis 99 vergeben. Diese Kennzahl muss im Bedienbezirk eindeutig sein.\n\nEindeutigkeit der Kennzahlen bei angrenzenden Bedienbezirken entlang einer Strecke:\n\nInnerhalb eines Bedienbezirks und f\u00fcr benachbarte Betriebsstellen eines angrenzenden Bedienbezirks entlang einer Strecke darf eine Kennzahl nur einmal verwendet werden. Beispiel: Media:Bedien Oertlichkeit Kennzahl 131121.pdf\n\nF\u00fcr alle im jeweiligen Bereich befindlichen Stellelemente der Betriebsstellen und Strecken wird die Kennzahl Bestandteil der ausf\u00fchrlichen Elementbezeichnung. Hierdurch er\u00fcbrigt sich in einem gr\u00f6\u00dferen Bereich der Infrastruktur die Mitf\u00fchrung eines Ortsbezeichners.\n\nZentrale Vergabe von Kennzahlen auch ohne Anbindung an Bedien_Zentralen:\n\nUnabnh\u00e4ngig ob eine ESTW-Zentraleinheit aus einer Bedien_Zentrale gesteuert wird oder nur \u00f6rtlich eingerichtet ist, soll die Kennzahlenvergabe zentral im Sinne einer m\u00f6glichen Konzentration von ESTW-Zentraleinheiten in Bedienbezirken geplant und vergeben werden. \n\nDB-Regelwerk\n\u2022 Kennzahltabelle oder Kennzaheln\u00fcbersichtsplan im PT 1, \n\u2022 819.0603 2, \n\u2022 819.9001 1 (5).\n"
		   });
		addAnnotation
		  (getNB_Funktionalitaet_NB_R_AttributeGroup_AWU(),
		   source,
		   new String[] {
			   "documentation", "F\u00fcr den Bediener soll das Bedienkommando \u201eAufgefahrene Weiche umstellen\u201c im freigegebenen NB-Bereich m\u00f6glich sein. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es ist nur im Lastenheft zu finden, das dem LST-Fachplaner nicht zur Verf\u00fcgung steht."
		   });
		addAnnotation
		  (getNB_Funktionalitaet_NB_R_AttributeGroup_FSTZ(),
		   source,
		   new String[] {
			   "documentation", "F\u00fcr den Bediener soll das Bedienkommando \u201eFahrstra\u00dfe in ein Gleis ohne Oberleitung einstellen\u201c im freigegebenen NB-Bereich m\u00f6glich sein (nur beim \u00dcbergang in nicht \u00fcberspannte Bereiche relevant). DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es ist nur im Lastenheft zu finden, das dem LST-Fachplaner nicht zur Verf\u00fcgung steht."
		   });
		addAnnotation
		  (getNB_Funktionalitaet_NB_R_AttributeGroup_FAFAE(),
		   source,
		   new String[] {
			   "documentation", "F\u00fcr den Bediener soll das Bedienkommando \u201eFahrstra\u00dfe aufl\u00f6sen\u201c und \u201eFahrwegelement einzeln aufl\u00f6sen\u201c im freigegebenen NB-Bereich m\u00f6glich sein. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es ist nur im Lastenheft zu finden, das dem LST-Fachplaner nicht zur Verf\u00fcgung steht."
		   });
		addAnnotation
		  (getNB_Funktionalitaet_NB_R_AttributeGroup_SBUE(),
		   source,
		   new String[] {
			   "documentation", "F\u00fcr den Bediener soll das Bedienkommando \\\"SBUE\\\" (Schlie\u00dfen eines B\u00dc, der innerhalb des NB liegt, dessen regul\u00e4re Einschaltung aber au\u00dferhalb des NB angeordnet ist) im freigegebenen NB-Bereich m\u00f6glich sein. DB-Regelwerk Das Planungsdatum ist im Regelewrk der DB AG nicht enthalten. Es findet sich im Lastenheft, das dem LST-Fachplaner nicht zur Verf\u00fcgung steht."
		   });
		addAnnotation
		  (getNB_Funktionalitaet_NB_R_AttributeGroup_SLESLS(),
		   source,
		   new String[] {
			   "documentation", "F\u00fcr den Bediener soll das Bedienkommando \u201eSchl\u00fcsselsperre entsperren\u201c (freigeben) und \u201eSchl\u00fcsselsperre sperren\u201c (Freigabe zur\u00fccknehmen) im freigegebenen NB-Bereich m\u00f6glich sein. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es findet sich im Lastenheft, das dem LST-Fachplaner nicht zur Verf\u00fcgung steht."
		   });
		addAnnotation
		  (getNB_Funktionalitaet_NB_R_AttributeGroup_WHU(),
		   source,
		   new String[] {
			   "documentation", "F\u00fcr den Bediener soll das Bedienkommando \u201eWeiche hilfsweise umstellen\u201c im freigegebenen NB-Bereich m\u00f6glich sein. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es ist nur im Lastenheft zu finden, das dem LST-Fachplaner nicht zur Verf\u00fcgung steht. "
		   });
		addAnnotation
		  (getNB_Funktionalitaet_NB_R_AttributeGroup_WUS(),
		   source,
		   new String[] {
			   "documentation", "F\u00fcr den Bediener soll das Bedienkommando \u201eWeiche gegen umstellen sperren\u201c im freigegebenen NB-Bereich m\u00f6glich sein. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es ist nur im Lastenheft zu finden, das dem LST-Fachplaner nicht zur Verf\u00fcgung steht. "
		   });
		addAnnotation
		  (nB_ZoneEClass,
		   source,
		   new String[] {
			   "documentation", "Nahstellbereichszone. Jeder Nahstellbereich hat mindestens eine Zone; es sind auch mehrere Zonen m\u00f6glich. Die Zonen k\u00f6nnen voneinander unabh\u00e4ngig nebeneinander liegen, sich \u00fcberlappen oder eine Zone kann eine kleinere \\\"Teilmenge\\\" einer gr\u00f6\u00dferen Zone sein. Als spezieller Fall ist auch die Vereinigung von zwei nebeneinander liegenden Zonen m\u00f6glich. F\u00fcr jede Zone werden eigene Grenzen zum angrenzenden Bereich (ESTW, NB, Ortstellbereich) festgelegt. DB-Regelwerk F\u00fcr die Planung von Nahbedienzonen exisitert bei der DB AG kein Regelwerk. Die Angabe findet sich in der Nahbedienungstabelle, Spalte 1."
		   });
		addAnnotation
		  (getNB_Zone_IDNB(),
		   source,
		   new String[] {
			   "documentation", "Verweis von der NB Zone auf den zugeh\u00f6rigen Nahstellbereich. "
		   });
		addAnnotation
		  (getNB_Zone_IDNBZone(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die \u00fcbergeordnete NB_Zone (die betrachtete NB_Zone ist damit untergeordnet). In der untergeordneten Zone muss die Nahbedienung zuerst zur\u00fcckgegeben werden, bevor die Nahbedienung in der \u00fcbergeordneten Zone zur\u00fcckgegeben werden kann."
		   });
		addAnnotation
		  (getNB_Zone_Allg_AttributeGroup_NBVerhaeltnisBesonders(),
		   source,
		   new String[] {
			   "documentation", "Besonderes Verh\u00e4ltnis der betrachteten NB-Zone in Bezug auf die unter ID_NB_Zone angegebene. \u00fcberlappend: zwei Zonen \u00fcberlappen sich, das hei\u00dft einige Elemente geh\u00f6ren sowohl zur einen als auch zur anderen Zone. vereinigt: zwei nebeneinander liegende Zonen werden zu einer gro\u00dfen Zone zusammengef\u00fchrt. Die \u00dcber- bzw. Unterordnung ergibt sich aus dem Verweis ID_NB_Zone. DB-Regelwerk F\u00fcr die Planung von Nahstellbereichen exisitert bei der DB AG kein Regelwerk. Dieses Planungsdatum findet sich in der Nahbedienungstabelle."
		   });
		addAnnotation
		  (getNB_Zone_Allg_AttributeGroup_Rang(),
		   source,
		   new String[] {
			   "documentation", "Festlegung, an welcher Stelle die NB_Zone in der Reihe(nfolge) steht. Ist bei mehreren Zonen, die einer \\\"Haupt\\\"zone untergeordnet sind, eine Reihenfolge der Zonen f\u00fcr die Ein- bzw. Ausschaltung als notwendig festgelegt worden, muss f\u00fcr jede Zone ein Rang in dieser Reihe festgelegt werden. DB-Regelwerk F\u00fcr die Planung von Nahstellbereichen existiert bei der DB AG kein Regelwerk. Dieses Planungsdatum findet sich nur im Lastenheft, das dem LST-Fachplaner nicht zur Verf\u00fcgung steht."
		   });
		addAnnotation
		  (getNB_Zone_Bezeichnung_AttributeGroup_BezeichnungNBZone(),
		   source,
		   new String[] {
			   "documentation", "Numerische Ordnungsnummer der NB_Zone innerhalb des Nahstellbereiches. Aus der Bezeichnung des NB und diesem Attribut wird die Angabe gem\u00e4\u00df Ril 819.9001 (z. B. 99NB1/2 bzw. 99NB12) zusammengesetzt - auf dem Lageplan getrennt durch einen Schr\u00e4gstrich. DB-Regelwerk 819.9001 "
		   });
		addAnnotation
		  (nB_Zone_ElementEClass,
		   source,
		   new String[] {
			   "documentation", "Zuordnung der ESTW-Elemente (Signale, Weichen, Gleissperren, Schl\u00fcsselsperren) zur NB_Zone, in der sie sich befinden. F\u00fcr diese Elemente sind in Abh\u00e4ngigkeit der vorgesehenen NB Art Eigenschaften zur Stellbarkeit und R\u00fcckgabevoraussetzung festzulegen. DB-Regelwerk Die Angaben finden sich in der Nahbedienungstabelle, Spalten 5, 8 und 9."
		   });
		addAnnotation
		  (getNB_Zone_Element_IDNBElement(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die ID des Elementes, welches innerhalb der NB Zone angeordnet ist."
		   });
		addAnnotation
		  (getNB_Zone_Element_IDNBZone(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die NB_Zone, zu der das NB_Zone_Element geh\u00f6rt. "
		   });
		addAnnotation
		  (getNB_Zone_Element_Allg_AttributeGroup_FreieStellbarkeit(),
		   source,
		   new String[] {
			   "documentation", "Das betreffende Element (Signal, Weiche oder Gleissperre) ist innerhalb des Nahstellbereiches frei stellbar. "
		   });
		addAnnotation
		  (getNB_Zone_Element_Allg_AttributeGroup_NBRueckgabevoraussetzung(),
		   source,
		   new String[] {
			   "documentation", "Voraussetzung, die f\u00fcr ein stellbares Element (Signal, Weiche, Gleissperre, Schl\u00fcsselsperre) innerhalb eines Nahstellbereiches erf\u00fcllt sein muss, bevor die Nahbedienung zur\u00fcckgegeben werden kann. Kann der \u00f6rtliche Bediener bei abgegebener Nahbedienung in Abh\u00e4ngigkeit der vorgesehenen NB Art Weichen und Gleissperren um- bzw. Signale stellen, m\u00fcssen diese vor R\u00fcckgabe der Nahbedienung ggf. wieder in eine bestimmte Lage / Stellung gebracht werden. Daher ist f\u00fcr jedes NB Zone Element festzulegen, welche R\u00fcckgabevoraussetzung besteht. DB-Regelwerk F\u00fcr die Planung von Nahstellbereichen existiert bei der DB AG kein Regelwerk. Das Planungsdatum findet sich in der Nahbedienungstabelle. "
		   });
		addAnnotation
		  (getNB_Zone_Element_Allg_AttributeGroup_WGspLage(),
		   source,
		   new String[] {
			   "documentation", "Lage der W/Gsp, sofern diese unabh\u00e4ngig von der Flankenschutzbetrachtung innerhalb des NB in einer Lage verschlossen werden soll. DB-Regelwerk Ril 819.0512"
		   });
		addAnnotation
		  (nB_Zone_GrenzeEClass,
		   source,
		   new String[] {
			   "documentation", "Grenze der NB Zone gegen\u00fcber dem der Zone angrenzenden Bereich. Die NB Zone wird mittels (technischem) Flankenschutz gegen\u00fcber dem benachbarten Bereich (ESTW oder einer weiteren Zone) abgegrenzt. Grenzelemente bilden Signale, Weichen oder Gleissperren, welche in jeweiliger Flankenschutzlage verschlossen werden. Auch die Angabe eines Achz\u00e4hlpunkts ist m\u00f6glich. Bei an die NB Zone angrenzendem Ortstellbereich ist die TM 2010-388 I.NVT 3 \\\"Planungsregeln Bedienbereiche - Schnittstellen Stellwerksbereiche\\\" zu beachten. DB-Regelwerk TM 2010-388 I.NVT 3 Die Angabe von Grenzelementen au\u00dferhalb der NB-Zone finden sich in der Nahbedienungstabelle, Spalte 7."
		   });
		addAnnotation
		  (getNB_Zone_Grenze_IDMarkanterPunkt(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf einen Markanten Punkt (Signal, Weichen- bzw. Gleissperrenkomponente, Azp), der die Grenze der NB_Zone darstellt. DB-Regelwerk Zur Planung von Nahstellbereichen gibt es bei der DB AG kein Regelwerk. Dieses Planungsdatum findet sich in der Nahbedienungstabelle Flankenschutztabelle "
		   });
		addAnnotation
		  (getNB_Zone_Grenze_IDNBZone(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die NB_Zone, f\u00fcr die die Grenze festgelegt wird. "
		   });
		addAnnotation
		  (getNB_Zone_Grenze_NBGrenzeArt(),
		   source,
		   new String[] {
			   "documentation", "Angrenzender Nachbar der NB Zone. Von der Art des angrenzenden Bereiches h\u00e4ngt der zu planende (technische) Flankenschutz ab. "
		   });
		addAnnotation
		  (getNB_Zone_Reihenfolgezwang_AttributeGroup_NBZoneAllg(),
		   source,
		   new String[] {
			   "documentation", "Festlegung, an welcher Stelle die NB_Zone in der Reihe(nfolge) steht. Ist bei mehreren Zonen, die einer \\\"Haupt\\\"zone untergeordnet sind, eine Reihenfolge der Zonen f\u00fcr die Ein- bzw. Ausschaltung als notwendig festgelegt worden, muss f\u00fcr jede Zone ein Rang in dieser Reihe festgelegt werden. DB-Regelwerk F\u00fcr die Planung von Nahstellbereichen existiert bei der DB AG kein Regelwerk. Dieses Planungsdatum findet sich nur im Lastenheft, das dem LST-Fachplaner nicht zur Verf\u00fcgung steht."
		   });
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (awU_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCAWU",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAWU_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bezeichnung_NB_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBezeichnung_NB",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "pattern", "[1-9][0-9]?"
		   });
		addAnnotation
		  (bezeichnung_NB_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBezeichnung_NB",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBezeichnung_NB_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bezeichnung_NB_Zone_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBezeichnung_NB_Zone",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "pattern", "[1-9][0-9]?"
		   });
		addAnnotation
		  (bezeichnung_NB_Zone_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBezeichnung_NB_Zone",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBezeichnung_NB_Zone_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (enumnbArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMNB_Art"
		   });
		addAnnotation
		  (enumnbArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMNB_Art:Object",
			   "baseType", "ENUMNB_Art"
		   });
		addAnnotation
		  (enumnbGrenzeArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMNB_Grenze_Art"
		   });
		addAnnotation
		  (enumnbGrenzeArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMNB_Grenze_Art:Object",
			   "baseType", "ENUMNB_Grenze_Art"
		   });
		addAnnotation
		  (enumnbRueckgabevoraussetzungEEnum,
		   source,
		   new String[] {
			   "name", "ENUMNB_Rueckgabevoraussetzung"
		   });
		addAnnotation
		  (enumnbRueckgabevoraussetzungObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMNB_Rueckgabevoraussetzung:Object",
			   "baseType", "ENUMNB_Rueckgabevoraussetzung"
		   });
		addAnnotation
		  (enumnbVerhaeltnisBesondersEEnum,
		   source,
		   new String[] {
			   "name", "ENUMNB_Verhaeltnis_Besonders"
		   });
		addAnnotation
		  (enumnbVerhaeltnisBesondersObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMNB_Verhaeltnis_Besonders:Object",
			   "baseType", "ENUMNB_Verhaeltnis_Besonders"
		   });
		addAnnotation
		  (enumwGspLageEEnum,
		   source,
		   new String[] {
			   "name", "ENUMW_Gsp_Lage"
		   });
		addAnnotation
		  (enumwGspLageObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMW_Gsp_Lage:Object",
			   "baseType", "ENUMW_Gsp_Lage"
		   });
		addAnnotation
		  (f_ST_Z_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCF_ST_Z",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getF_ST_Z_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fA_FAE_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFA_FAE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFA_FAE_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (freie_Stellbarkeit_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFreie_Stellbarkeit",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFreie_Stellbarkeit_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (kennzahl_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCKennzahl",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKennzahl_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (nbEClass,
		   source,
		   new String[] {
			   "name", "CNB",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNB_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getNB_NBArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NB_Art"
		   });
		addAnnotation
		  (getNB_NBFunktionalitaetNBR(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NB_Funktionalitaet_NB_R"
		   });
		addAnnotation
		  (nB_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCNB_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNB_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (nB_Bedien_Anzeige_ElementEClass,
		   source,
		   new String[] {
			   "name", "CNB_Bedien_Anzeige_Element",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNB_Bedien_Anzeige_Element_IDBedienAnzeigeElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Bedien_Anzeige_Element"
		   });
		addAnnotation
		  (getNB_Bedien_Anzeige_Element_IDNBZone(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_NB_Zone"
		   });
		addAnnotation
		  (getNB_Bedien_Anzeige_Element_NBBedienAnzeigeFunktionen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NB_Bedien_Anzeige_Funktionen"
		   });
		addAnnotation
		  (nB_Bedien_Anzeige_Funktionen_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CNB_Bedien_Anzeige_Funktionen",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNB_Bedien_Anzeige_Funktionen_AttributeGroup_TasteANF(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Taste_ANF"
		   });
		addAnnotation
		  (getNB_Bedien_Anzeige_Funktionen_AttributeGroup_TasteFGT(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Taste_FGT"
		   });
		addAnnotation
		  (getNB_Bedien_Anzeige_Funktionen_AttributeGroup_TasteWGT(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Taste_WGT"
		   });
		addAnnotation
		  (nB_Bezeichnung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CNB_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNB_Bezeichnung_AttributeGroup_BezeichnungNB(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung_NB"
		   });
		addAnnotation
		  (getNB_Bezeichnung_AttributeGroup_Kennzahl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Kennzahl"
		   });
		addAnnotation
		  (nB_Funktionalitaet_NB_R_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CNB_Funktionalitaet_NB_R",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNB_Funktionalitaet_NB_R_AttributeGroup_AWU(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "AWU"
		   });
		addAnnotation
		  (getNB_Funktionalitaet_NB_R_AttributeGroup_FSTZ(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "F_ST_Z"
		   });
		addAnnotation
		  (getNB_Funktionalitaet_NB_R_AttributeGroup_FAFAE(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FA_FAE"
		   });
		addAnnotation
		  (getNB_Funktionalitaet_NB_R_AttributeGroup_SBUE(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SBUE"
		   });
		addAnnotation
		  (getNB_Funktionalitaet_NB_R_AttributeGroup_SLESLS(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "SLE_SLS"
		   });
		addAnnotation
		  (getNB_Funktionalitaet_NB_R_AttributeGroup_WHU(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "WHU"
		   });
		addAnnotation
		  (getNB_Funktionalitaet_NB_R_AttributeGroup_WUS(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "WUS"
		   });
		addAnnotation
		  (nB_Grenze_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCNB_Grenze_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNB_Grenze_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (nB_Rueckgabevoraussetzung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCNB_Rueckgabevoraussetzung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNB_Rueckgabevoraussetzung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (nB_Verhaeltnis_Besonders_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCNB_Verhaeltnis_Besonders",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNB_Verhaeltnis_Besonders_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (nB_ZoneEClass,
		   source,
		   new String[] {
			   "name", "CNB_Zone",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNB_Zone_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getNB_Zone_IDNB(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_NB"
		   });
		addAnnotation
		  (getNB_Zone_IDNBZone(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_NB_Zone"
		   });
		addAnnotation
		  (getNB_Zone_NBZoneAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NB_Zone_Allg"
		   });
		addAnnotation
		  (nB_Zone_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CNB_Zone_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNB_Zone_Allg_AttributeGroup_NBVerhaeltnisBesonders(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NB_Verhaeltnis_Besonders"
		   });
		addAnnotation
		  (getNB_Zone_Allg_AttributeGroup_Rang(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Rang"
		   });
		addAnnotation
		  (nB_Zone_Allg_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TNB_Zone_Allg",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "pattern", "[1-9][0-9]*"
		   });
		addAnnotation
		  (nB_Zone_Allg_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCNB_Zone_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNB_Zone_Allg_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (nB_Zone_Bezeichnung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CNB_Zone_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNB_Zone_Bezeichnung_AttributeGroup_BezeichnungNBZone(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung_NB_Zone"
		   });
		addAnnotation
		  (nB_Zone_ElementEClass,
		   source,
		   new String[] {
			   "name", "CNB_Zone_Element",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNB_Zone_Element_IDNBElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_NB_Element"
		   });
		addAnnotation
		  (getNB_Zone_Element_IDNBZone(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_NB_Zone"
		   });
		addAnnotation
		  (getNB_Zone_Element_NBZoneElementAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NB_Zone_Element_Allg"
		   });
		addAnnotation
		  (nB_Zone_Element_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CNB_Zone_Element_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNB_Zone_Element_Allg_AttributeGroup_FreieStellbarkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Freie_Stellbarkeit"
		   });
		addAnnotation
		  (getNB_Zone_Element_Allg_AttributeGroup_NBRueckgabevoraussetzung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NB_Rueckgabevoraussetzung"
		   });
		addAnnotation
		  (getNB_Zone_Element_Allg_AttributeGroup_WGspLage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "W_Gsp_Lage"
		   });
		addAnnotation
		  (nB_Zone_GrenzeEClass,
		   source,
		   new String[] {
			   "name", "CNB_Zone_Grenze",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNB_Zone_Grenze_IDMarkanterPunkt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Markanter_Punkt"
		   });
		addAnnotation
		  (getNB_Zone_Grenze_IDNBZone(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_NB_Zone"
		   });
		addAnnotation
		  (getNB_Zone_Grenze_NBGrenzeArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NB_Grenze_Art"
		   });
		addAnnotation
		  (nB_Zone_Reihenfolgezwang_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CNB_Zone_Reihenfolgezwang",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNB_Zone_Reihenfolgezwang_AttributeGroup_NBZoneAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NB_Zone_Allg"
		   });
		addAnnotation
		  (rang_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TRang",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "pattern", "[1-9][0-9]{0,}"
		   });
		addAnnotation
		  (rang_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCRang",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRang_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (sbuE_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCSBUE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSBUE_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (slE_SLS_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCSLE_SLS",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSLE_SLS_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (taste_ANF_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTaste_ANF",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTaste_ANF_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (taste_FGT_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTaste_FGT",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTaste_FGT_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (taste_WGT_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTaste_WGT",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTaste_WGT_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (w_Gsp_Lage_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCW_Gsp_Lage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getW_Gsp_Lage_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (whU_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCWHU",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getWHU_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (wuS_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCWUS",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getWUS_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
	}

	/**
	 * Initializes the annotations for <b>null</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNullAnnotations() {
		String source = null;
		addAnnotation
		  (nbEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (nB_Bedien_Anzeige_ElementEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getNB_Bezeichnung_AttributeGroup_BezeichnungNB(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung> [1..99] </ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (nB_ZoneEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getNB_Zone_Allg_AttributeGroup_Rang(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>  [1..n] </ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getNB_Zone_Bezeichnung_AttributeGroup_BezeichnungNBZone(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung> [1..99] </ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (nB_Zone_ElementEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getNB_Zone_Element_Allg_AttributeGroup_FreieStellbarkeit(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>true</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (nB_Zone_GrenzeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getNB_Zone_Reihenfolgezwang_AttributeGroup_NBZoneAllg(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>  [1..n] </ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
	}

} //NahbedienungPackageImpl
