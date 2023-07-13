/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.ATO.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.set.model.model11001.ATO.ATOFactory;
import org.eclipse.set.model.model11001.ATO.ATOPackage;
import org.eclipse.set.model.model11001.ATO.ATO_Segment_Profile;
import org.eclipse.set.model.model11001.ATO.ATO_Segment_Profile_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model11001.ATO.ATO_TS_Instanz;
import org.eclipse.set.model.model11001.ATO.ATO_TS_Instanz_Adresse_AttributeGroup;
import org.eclipse.set.model.model11001.ATO.ATO_Timing_Point;
import org.eclipse.set.model.model11001.ATO.ATO_Timing_Point_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.ATO.ATO_Timing_Point_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model11001.ATO.Abstand_ATO_Halt_Vor_EoA_TypeClass;
import org.eclipse.set.model.model11001.ATO.Bezeichnung_ATO_TP_TypeClass;
import org.eclipse.set.model.model11001.ATO.Erreichungstoleranz_TypeClass;
import org.eclipse.set.model.model11001.ATO.Haltetoleranz_TypeClass;
import org.eclipse.set.model.model11001.ATO.NID_ATOTS_TypeClass;
import org.eclipse.set.model.model11001.ATO.NID_C_ATOTS_TypeClass;
import org.eclipse.set.model.model11001.ATO.NID_SP_TypeClass;
import org.eclipse.set.model.model11001.ATO.NID_TP_TypeClass;

import org.eclipse.set.model.model11001.ATO.util.ATOValidator;

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

import org.eclipse.set.model.model11001.Nahbedienung.NahbedienungPackage;

import org.eclipse.set.model.model11001.Nahbedienung.impl.NahbedienungPackageImpl;

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
public class ATOPackageImpl extends EPackageImpl implements ATOPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstand_ATO_Halt_Vor_EoA_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atO_Segment_ProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atO_Segment_Profile_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atO_Timing_PointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atO_Timing_Point_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atO_Timing_Point_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atO_TS_InstanzEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atO_TS_Instanz_Adresse_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_ATO_TP_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erreichungstoleranz_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass haltetoleranz_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass niD_ATOTS_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass niD_C_ATOTS_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass niD_SP_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass niD_TP_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType abstand_ATO_Halt_Vor_EoA_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_ATO_TP_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType erreichungstoleranz_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType haltetoleranz_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType niD_ATOTS_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType niD_C_ATOTS_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType niD_SP_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType niD_TP_TypeEDataType = null;

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
	 * @see org.eclipse.set.model.model11001.ATO.ATOPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ATOPackageImpl() {
		super(eNS_URI, ATOFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ATOPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ATOPackage init() {
		if (isInited) return (ATOPackage)EPackage.Registry.INSTANCE.getEPackage(ATOPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredATOPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ATOPackageImpl theATOPackage = registeredATOPackage instanceof ATOPackageImpl ? (ATOPackageImpl)registeredATOPackage : new ATOPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI);
		PlanProPackageImpl thePlanProPackage = (PlanProPackageImpl)(registeredPackage instanceof PlanProPackageImpl ? registeredPackage : PlanProPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasisobjektePackage.eNS_URI);
		BasisobjektePackageImpl theBasisobjektePackage = (BasisobjektePackageImpl)(registeredPackage instanceof BasisobjektePackageImpl ? registeredPackage : BasisobjektePackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasisTypenPackage.eNS_URI);
		BasisTypenPackageImpl theBasisTypenPackage = (BasisTypenPackageImpl)(registeredPackage instanceof BasisTypenPackageImpl ? registeredPackage : BasisTypenPackage.eINSTANCE);
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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NahbedienungPackage.eNS_URI);
		NahbedienungPackageImpl theNahbedienungPackage = (NahbedienungPackageImpl)(registeredPackage instanceof NahbedienungPackageImpl ? registeredPackage : NahbedienungPackage.eINSTANCE);
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
		theATOPackage.createPackageContents();
		theBasisobjektePackage.createPackageContents();
		theBasisTypenPackage.createPackageContents();
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
		theNahbedienungPackage.createPackageContents();
		thePZBPackage.createPackageContents();
		theRegelzeichnungPackage.createPackageContents();
		theSchluesselabhaengigkeitenPackage.createPackageContents();
		theSignalePackage.createPackageContents();
		theSignalbegriffe_StrukturPackage.createPackageContents();
		theZuglenkungPackage.createPackageContents();
		theZugnummernmeldeanlagePackage.createPackageContents();
		theLayoutinformationenPackage.createPackageContents();

		// Initialize created meta-data
		theATOPackage.initializePackageContents();
		theBasisobjektePackage.initializePackageContents();
		theBasisTypenPackage.initializePackageContents();
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
		theNahbedienungPackage.initializePackageContents();
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
			(theATOPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return ATOValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theATOPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ATOPackage.eNS_URI, theATOPackage);
		return theATOPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAbstand_ATO_Halt_Vor_EoA_TypeClass() {
		return abstand_ATO_Halt_Vor_EoA_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAbstand_ATO_Halt_Vor_EoA_TypeClass_Wert() {
		return (EAttribute)abstand_ATO_Halt_Vor_EoA_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getATO_Segment_Profile() {
		return atO_Segment_ProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getATO_Segment_Profile_AbstandATOHaltVorEoA() {
		return (EReference)atO_Segment_ProfileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getATO_Segment_Profile_Bezeichnung() {
		return (EReference)atO_Segment_ProfileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getATO_Segment_Profile_IDATOTSInstanz() {
		return (EReference)atO_Segment_ProfileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getATO_Segment_Profile_IDATOTSInstanzNachbar() {
		return (EReference)atO_Segment_ProfileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getATO_Segment_Profile_IDETCSKante() {
		return (EReference)atO_Segment_ProfileEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getATO_Segment_Profile_IDOertlichkeit() {
		return (EReference)atO_Segment_ProfileEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getATO_Segment_Profile_Bezeichnung_AttributeGroup() {
		return atO_Segment_Profile_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getATO_Segment_Profile_Bezeichnung_AttributeGroup_NIDSP() {
		return (EReference)atO_Segment_Profile_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getATO_Timing_Point() {
		return atO_Timing_PointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getATO_Timing_Point_ATOTimingPointAllg() {
		return (EReference)atO_Timing_PointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getATO_Timing_Point_Bezeichnung() {
		return (EReference)atO_Timing_PointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getATO_Timing_Point_IDSignal() {
		return (EReference)atO_Timing_PointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getATO_Timing_Point_Allg_AttributeGroup() {
		return atO_Timing_Point_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getATO_Timing_Point_Allg_AttributeGroup_Erreichungstoleranz() {
		return (EReference)atO_Timing_Point_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getATO_Timing_Point_Allg_AttributeGroup_Haltetoleranz() {
		return (EReference)atO_Timing_Point_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getATO_Timing_Point_Allg_AttributeGroup_NIDTP() {
		return (EReference)atO_Timing_Point_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getATO_Timing_Point_Bezeichnung_AttributeGroup() {
		return atO_Timing_Point_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getATO_Timing_Point_Bezeichnung_AttributeGroup_BezeichnungATOTP() {
		return (EReference)atO_Timing_Point_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getATO_TS_Instanz() {
		return atO_TS_InstanzEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getATO_TS_Instanz_ATOTSInstanzAdresse() {
		return (EReference)atO_TS_InstanzEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getATO_TS_Instanz_IDUnterbringung() {
		return (EReference)atO_TS_InstanzEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getATO_TS_Instanz_Adresse_AttributeGroup() {
		return atO_TS_Instanz_Adresse_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getATO_TS_Instanz_Adresse_AttributeGroup_NIDATOTS() {
		return (EReference)atO_TS_Instanz_Adresse_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getATO_TS_Instanz_Adresse_AttributeGroup_NIDCATOTS() {
		return (EReference)atO_TS_Instanz_Adresse_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_ATO_TP_TypeClass() {
		return bezeichnung_ATO_TP_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_ATO_TP_TypeClass_Wert() {
		return (EAttribute)bezeichnung_ATO_TP_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getErreichungstoleranz_TypeClass() {
		return erreichungstoleranz_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getErreichungstoleranz_TypeClass_Wert() {
		return (EAttribute)erreichungstoleranz_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHaltetoleranz_TypeClass() {
		return haltetoleranz_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHaltetoleranz_TypeClass_Wert() {
		return (EAttribute)haltetoleranz_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNID_ATOTS_TypeClass() {
		return niD_ATOTS_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNID_ATOTS_TypeClass_Wert() {
		return (EAttribute)niD_ATOTS_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNID_C_ATOTS_TypeClass() {
		return niD_C_ATOTS_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNID_C_ATOTS_TypeClass_Wert() {
		return (EAttribute)niD_C_ATOTS_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNID_SP_TypeClass() {
		return niD_SP_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNID_SP_TypeClass_Wert() {
		return (EAttribute)niD_SP_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNID_TP_TypeClass() {
		return niD_TP_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNID_TP_TypeClass_Wert() {
		return (EAttribute)niD_TP_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAbstand_ATO_Halt_Vor_EoA_Type() {
		return abstand_ATO_Halt_Vor_EoA_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_ATO_TP_Type() {
		return bezeichnung_ATO_TP_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getErreichungstoleranz_Type() {
		return erreichungstoleranz_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getHaltetoleranz_Type() {
		return haltetoleranz_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNID_ATOTS_Type() {
		return niD_ATOTS_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNID_C_ATOTS_Type() {
		return niD_C_ATOTS_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNID_SP_Type() {
		return niD_SP_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNID_TP_Type() {
		return niD_TP_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ATOFactory getATOFactory() {
		return (ATOFactory)getEFactoryInstance();
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
		abstand_ATO_Halt_Vor_EoA_TypeClassEClass = createEClass(ABSTAND_ATO_HALT_VOR_EO_ATYPE_CLASS);
		createEAttribute(abstand_ATO_Halt_Vor_EoA_TypeClassEClass, ABSTAND_ATO_HALT_VOR_EO_ATYPE_CLASS__WERT);

		atO_Segment_ProfileEClass = createEClass(ATO_SEGMENT_PROFILE);
		createEReference(atO_Segment_ProfileEClass, ATO_SEGMENT_PROFILE__ABSTAND_ATO_HALT_VOR_EO_A);
		createEReference(atO_Segment_ProfileEClass, ATO_SEGMENT_PROFILE__BEZEICHNUNG);
		createEReference(atO_Segment_ProfileEClass, ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ);
		createEReference(atO_Segment_ProfileEClass, ATO_SEGMENT_PROFILE__IDATOTS_INSTANZ_NACHBAR);
		createEReference(atO_Segment_ProfileEClass, ATO_SEGMENT_PROFILE__IDETCS_KANTE);
		createEReference(atO_Segment_ProfileEClass, ATO_SEGMENT_PROFILE__ID_OERTLICHKEIT);

		atO_Segment_Profile_Bezeichnung_AttributeGroupEClass = createEClass(ATO_SEGMENT_PROFILE_BEZEICHNUNG_ATTRIBUTE_GROUP);
		createEReference(atO_Segment_Profile_Bezeichnung_AttributeGroupEClass, ATO_SEGMENT_PROFILE_BEZEICHNUNG_ATTRIBUTE_GROUP__NIDSP);

		atO_Timing_PointEClass = createEClass(ATO_TIMING_POINT);
		createEReference(atO_Timing_PointEClass, ATO_TIMING_POINT__ATO_TIMING_POINT_ALLG);
		createEReference(atO_Timing_PointEClass, ATO_TIMING_POINT__BEZEICHNUNG);
		createEReference(atO_Timing_PointEClass, ATO_TIMING_POINT__ID_SIGNAL);

		atO_Timing_Point_Allg_AttributeGroupEClass = createEClass(ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP);
		createEReference(atO_Timing_Point_Allg_AttributeGroupEClass, ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__ERREICHUNGSTOLERANZ);
		createEReference(atO_Timing_Point_Allg_AttributeGroupEClass, ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__HALTETOLERANZ);
		createEReference(atO_Timing_Point_Allg_AttributeGroupEClass, ATO_TIMING_POINT_ALLG_ATTRIBUTE_GROUP__NIDTP);

		atO_Timing_Point_Bezeichnung_AttributeGroupEClass = createEClass(ATO_TIMING_POINT_BEZEICHNUNG_ATTRIBUTE_GROUP);
		createEReference(atO_Timing_Point_Bezeichnung_AttributeGroupEClass, ATO_TIMING_POINT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_ATOTP);

		atO_TS_InstanzEClass = createEClass(ATO_TS_INSTANZ);
		createEReference(atO_TS_InstanzEClass, ATO_TS_INSTANZ__ATOTS_INSTANZ_ADRESSE);
		createEReference(atO_TS_InstanzEClass, ATO_TS_INSTANZ__ID_UNTERBRINGUNG);

		atO_TS_Instanz_Adresse_AttributeGroupEClass = createEClass(ATO_TS_INSTANZ_ADRESSE_ATTRIBUTE_GROUP);
		createEReference(atO_TS_Instanz_Adresse_AttributeGroupEClass, ATO_TS_INSTANZ_ADRESSE_ATTRIBUTE_GROUP__NIDATOTS);
		createEReference(atO_TS_Instanz_Adresse_AttributeGroupEClass, ATO_TS_INSTANZ_ADRESSE_ATTRIBUTE_GROUP__NIDCATOTS);

		bezeichnung_ATO_TP_TypeClassEClass = createEClass(BEZEICHNUNG_ATO_TP_TYPE_CLASS);
		createEAttribute(bezeichnung_ATO_TP_TypeClassEClass, BEZEICHNUNG_ATO_TP_TYPE_CLASS__WERT);

		erreichungstoleranz_TypeClassEClass = createEClass(ERREICHUNGSTOLERANZ_TYPE_CLASS);
		createEAttribute(erreichungstoleranz_TypeClassEClass, ERREICHUNGSTOLERANZ_TYPE_CLASS__WERT);

		haltetoleranz_TypeClassEClass = createEClass(HALTETOLERANZ_TYPE_CLASS);
		createEAttribute(haltetoleranz_TypeClassEClass, HALTETOLERANZ_TYPE_CLASS__WERT);

		niD_ATOTS_TypeClassEClass = createEClass(NID_ATOTS_TYPE_CLASS);
		createEAttribute(niD_ATOTS_TypeClassEClass, NID_ATOTS_TYPE_CLASS__WERT);

		niD_C_ATOTS_TypeClassEClass = createEClass(NID_CATOTS_TYPE_CLASS);
		createEAttribute(niD_C_ATOTS_TypeClassEClass, NID_CATOTS_TYPE_CLASS__WERT);

		niD_SP_TypeClassEClass = createEClass(NID_SP_TYPE_CLASS);
		createEAttribute(niD_SP_TypeClassEClass, NID_SP_TYPE_CLASS__WERT);

		niD_TP_TypeClassEClass = createEClass(NID_TP_TYPE_CLASS);
		createEAttribute(niD_TP_TypeClassEClass, NID_TP_TYPE_CLASS__WERT);

		// Create data types
		abstand_ATO_Halt_Vor_EoA_TypeEDataType = createEDataType(ABSTAND_ATO_HALT_VOR_EO_ATYPE);
		bezeichnung_ATO_TP_TypeEDataType = createEDataType(BEZEICHNUNG_ATO_TP_TYPE);
		erreichungstoleranz_TypeEDataType = createEDataType(ERREICHUNGSTOLERANZ_TYPE);
		haltetoleranz_TypeEDataType = createEDataType(HALTETOLERANZ_TYPE);
		niD_ATOTS_TypeEDataType = createEDataType(NID_ATOTS_TYPE);
		niD_C_ATOTS_TypeEDataType = createEDataType(NID_CATOTS_TYPE);
		niD_SP_TypeEDataType = createEDataType(NID_SP_TYPE);
		niD_TP_TypeEDataType = createEDataType(NID_TP_TYPE);
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
		BasisobjektePackage theBasisobjektePackage = (BasisobjektePackage)EPackage.Registry.INSTANCE.getEPackage(BasisobjektePackage.eNS_URI);
		VerweisePackage theVerweisePackage = (VerweisePackage)EPackage.Registry.INSTANCE.getEPackage(VerweisePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		abstand_ATO_Halt_Vor_EoA_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		atO_Segment_ProfileEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		atO_Timing_PointEClass.getESuperTypes().add(theBasisobjektePackage.getPunkt_Objekt());
		atO_TS_InstanzEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		bezeichnung_ATO_TP_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		erreichungstoleranz_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		haltetoleranz_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		niD_ATOTS_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		niD_C_ATOTS_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		niD_SP_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		niD_TP_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());

		// Initialize classes and features; add operations and parameters
		initEClass(abstand_ATO_Halt_Vor_EoA_TypeClassEClass, Abstand_ATO_Halt_Vor_EoA_TypeClass.class, "Abstand_ATO_Halt_Vor_EoA_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstand_ATO_Halt_Vor_EoA_TypeClass_Wert(), this.getAbstand_ATO_Halt_Vor_EoA_Type(), "wert", null, 1, 1, Abstand_ATO_Halt_Vor_EoA_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atO_Segment_ProfileEClass, ATO_Segment_Profile.class, "ATO_Segment_Profile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getATO_Segment_Profile_AbstandATOHaltVorEoA(), this.getAbstand_ATO_Halt_Vor_EoA_TypeClass(), null, "abstandATOHaltVorEoA", null, 1, 1, ATO_Segment_Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATO_Segment_Profile_Bezeichnung(), this.getATO_Segment_Profile_Bezeichnung_AttributeGroup(), null, "bezeichnung", null, 1, 1, ATO_Segment_Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATO_Segment_Profile_IDATOTSInstanz(), theVerweisePackage.getID_ATO_TS_Instanz_ohne_Proxy_TypeClass(), null, "iDATOTSInstanz", null, 1, 1, ATO_Segment_Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATO_Segment_Profile_IDATOTSInstanzNachbar(), theVerweisePackage.getID_ATO_TS_Instanz_TypeClass(), null, "iDATOTSInstanzNachbar", null, 0, 1, ATO_Segment_Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATO_Segment_Profile_IDETCSKante(), theVerweisePackage.getID_ETCS_Kante_TypeClass(), null, "iDETCSKante", null, 1, 1, ATO_Segment_Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATO_Segment_Profile_IDOertlichkeit(), theVerweisePackage.getID_Oertlichkeit_Proxy_TypeClass(), null, "iDOertlichkeit", null, 0, -1, ATO_Segment_Profile.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atO_Segment_Profile_Bezeichnung_AttributeGroupEClass, ATO_Segment_Profile_Bezeichnung_AttributeGroup.class, "ATO_Segment_Profile_Bezeichnung_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getATO_Segment_Profile_Bezeichnung_AttributeGroup_NIDSP(), this.getNID_SP_TypeClass(), null, "nIDSP", null, 1, 1, ATO_Segment_Profile_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atO_Timing_PointEClass, ATO_Timing_Point.class, "ATO_Timing_Point", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getATO_Timing_Point_ATOTimingPointAllg(), this.getATO_Timing_Point_Allg_AttributeGroup(), null, "aTOTimingPointAllg", null, 1, 1, ATO_Timing_Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATO_Timing_Point_Bezeichnung(), this.getATO_Timing_Point_Bezeichnung_AttributeGroup(), null, "bezeichnung", null, 1, 1, ATO_Timing_Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATO_Timing_Point_IDSignal(), theVerweisePackage.getID_Signal_ohne_Proxy_TypeClass(), null, "iDSignal", null, 0, 1, ATO_Timing_Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atO_Timing_Point_Allg_AttributeGroupEClass, ATO_Timing_Point_Allg_AttributeGroup.class, "ATO_Timing_Point_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getATO_Timing_Point_Allg_AttributeGroup_Erreichungstoleranz(), this.getErreichungstoleranz_TypeClass(), null, "erreichungstoleranz", null, 1, 1, ATO_Timing_Point_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATO_Timing_Point_Allg_AttributeGroup_Haltetoleranz(), this.getHaltetoleranz_TypeClass(), null, "haltetoleranz", null, 1, 1, ATO_Timing_Point_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATO_Timing_Point_Allg_AttributeGroup_NIDTP(), this.getNID_TP_TypeClass(), null, "nIDTP", null, 1, 1, ATO_Timing_Point_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atO_Timing_Point_Bezeichnung_AttributeGroupEClass, ATO_Timing_Point_Bezeichnung_AttributeGroup.class, "ATO_Timing_Point_Bezeichnung_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getATO_Timing_Point_Bezeichnung_AttributeGroup_BezeichnungATOTP(), this.getBezeichnung_ATO_TP_TypeClass(), null, "bezeichnungATOTP", null, 1, 1, ATO_Timing_Point_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atO_TS_InstanzEClass, ATO_TS_Instanz.class, "ATO_TS_Instanz", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getATO_TS_Instanz_ATOTSInstanzAdresse(), this.getATO_TS_Instanz_Adresse_AttributeGroup(), null, "aTOTSInstanzAdresse", null, 1, 1, ATO_TS_Instanz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATO_TS_Instanz_IDUnterbringung(), theVerweisePackage.getID_Unterbringung_TypeClass(), null, "iDUnterbringung", null, 0, 1, ATO_TS_Instanz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(atO_TS_Instanz_Adresse_AttributeGroupEClass, ATO_TS_Instanz_Adresse_AttributeGroup.class, "ATO_TS_Instanz_Adresse_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getATO_TS_Instanz_Adresse_AttributeGroup_NIDATOTS(), this.getNID_ATOTS_TypeClass(), null, "nIDATOTS", null, 1, 1, ATO_TS_Instanz_Adresse_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getATO_TS_Instanz_Adresse_AttributeGroup_NIDCATOTS(), this.getNID_C_ATOTS_TypeClass(), null, "nIDCATOTS", null, 1, 1, ATO_TS_Instanz_Adresse_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bezeichnung_ATO_TP_TypeClassEClass, Bezeichnung_ATO_TP_TypeClass.class, "Bezeichnung_ATO_TP_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBezeichnung_ATO_TP_TypeClass_Wert(), this.getBezeichnung_ATO_TP_Type(), "wert", null, 1, 1, Bezeichnung_ATO_TP_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(erreichungstoleranz_TypeClassEClass, Erreichungstoleranz_TypeClass.class, "Erreichungstoleranz_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErreichungstoleranz_TypeClass_Wert(), this.getErreichungstoleranz_Type(), "wert", null, 1, 1, Erreichungstoleranz_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(haltetoleranz_TypeClassEClass, Haltetoleranz_TypeClass.class, "Haltetoleranz_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHaltetoleranz_TypeClass_Wert(), this.getHaltetoleranz_Type(), "wert", null, 1, 1, Haltetoleranz_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(niD_ATOTS_TypeClassEClass, NID_ATOTS_TypeClass.class, "NID_ATOTS_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNID_ATOTS_TypeClass_Wert(), this.getNID_ATOTS_Type(), "wert", null, 1, 1, NID_ATOTS_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(niD_C_ATOTS_TypeClassEClass, NID_C_ATOTS_TypeClass.class, "NID_C_ATOTS_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNID_C_ATOTS_TypeClass_Wert(), this.getNID_C_ATOTS_Type(), "wert", null, 1, 1, NID_C_ATOTS_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(niD_SP_TypeClassEClass, NID_SP_TypeClass.class, "NID_SP_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNID_SP_TypeClass_Wert(), this.getNID_SP_Type(), "wert", null, 1, 1, NID_SP_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(niD_TP_TypeClassEClass, NID_TP_TypeClass.class, "NID_TP_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNID_TP_TypeClass_Wert(), this.getNID_TP_Type(), "wert", null, 1, 1, NID_TP_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(abstand_ATO_Halt_Vor_EoA_TypeEDataType, BigDecimal.class, "Abstand_ATO_Halt_Vor_EoA_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bezeichnung_ATO_TP_TypeEDataType, String.class, "Bezeichnung_ATO_TP_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(erreichungstoleranz_TypeEDataType, BigInteger.class, "Erreichungstoleranz_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(haltetoleranz_TypeEDataType, BigInteger.class, "Haltetoleranz_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(niD_ATOTS_TypeEDataType, BigInteger.class, "NID_ATOTS_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(niD_C_ATOTS_TypeEDataType, BigInteger.class, "NID_C_ATOTS_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(niD_SP_TypeEDataType, String.class, "NID_SP_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(niD_TP_TypeEDataType, BigInteger.class, "NID_TP_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (atO_Segment_ProfileEClass,
		   source,
		   new String[] {
			   "documentation", "Infrastrukturabschnitte mit definiertem Beginn und Ende sowie zugeh\u00f6rigen Infrastrukturangaben bzw. Eigenschaften f\u00fcr den atomatischen Bahnbetrieb (ATO). Die Definition der Richtung wird aus der zugeh\u00f6rigen ETCS-Kante \u00fcbernommen."
		   });
		addAnnotation
		  (getATO_Segment_Profile_AbstandATOHaltVorEoA(),
		   source,
		   new String[] {
			   "documentation", "Distanz vor dem eigentlichen Punkt der End of Authority (EoA) der relevanten ETCS MA, auf die ATO-OB den automatisch gef\u00fchrten Zug hin bremst. Der Parameter entspricht dem ATO-Parameter \u201eD_EoA_Offset\u201c und betr\u00e4gt in der Regel 5\u00a0m. Abweichende Angaben sind durch die betriebliche Infrastrukturplanung in der BAst vorzugeben."
		   });
		addAnnotation
		  (getATO_Segment_Profile_IDATOTSInstanz(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die ATO-TS-Instanz, von der dieses Segment Profile verwaltet wird."
		   });
		addAnnotation
		  (getATO_Segment_Profile_IDATOTSInstanzNachbar(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die benachbarte ATO-TS-Instanz, der dieses Segment Profile bekannt ist."
		   });
		addAnnotation
		  (getATO_Segment_Profile_IDETCSKante(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die ETCS-Kante, deren Bezeichnung als Bezeichnung des Segment Profiles verwendet wird."
		   });
		addAnnotation
		  (getATO_Segment_Profile_IDOertlichkeit(),
		   source,
		   new String[] {
			   "documentation", "Betriebsstelle(n) (\u00d6rtlichkeiten), denen das Segment Profil zugeordnet ist. Aus der Zuordnung l\u00e4sst sich der Zust\u00e4ndigkeitsbereich einer ATO-TS-Instanz ableiten."
		   });
		addAnnotation
		  (getATO_Segment_Profile_Bezeichnung_AttributeGroup_NIDSP(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnung des Segment Profiles, die sich in der Regel aus der Bezeichnung der referenzierten ETCS-Gleiskante ergibt. Zur Herstellung der Eineindeutigkeit k\u00f6nnen weitere Bezeichnungsbestandteile erg\u00e4nzt werden."
		   });
		addAnnotation
		  (atO_Timing_PointEClass,
		   source,
		   new String[] {
			   "documentation", "Definierter Punkt in den Infrastrukturdaten f\u00fcr ATO (Segment Profile), an dem betriebliche Vorgaben definiert werden k\u00f6nnen. Diese betrieblichen Vorgaben werden entweder direkt aus dem Fahrplan abgeleitet oder durch dispositive Handlungen definiert, z. B. Betriebshalte oder Verkehrshalte einf\u00fcgen oder auslassen, Beschleunigen oder Verlangsamung der Fahrt (fr\u00fchere/sp\u00e4tere Zeit f\u00fcr die Erreichung des Timing Points) und \u00fcber das Journey Profile an ATO-OB kommandiert. \nDar\u00fcber hinaus kann an einem Timing Point die geplante betriebliche Fahrplanlage eines Zuges mit der tats\u00e4chlichen betrieblichen Lage des Zuges verglichen werden.\nDie Position des TP im Segment Profile muss \u00fcber die Topologie ermittelt werden. Der TP besitzt keine Wirkrichtung."
		   });
		addAnnotation
		  (getATO_Timing_Point_IDSignal(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf das Signal, zu dem der Timing Point geh\u00f6rt. Timing Points an weiteren Infrastrukturelementen oder -punkten (z.B. Fahrzeitmesspunkte in der Mitte von Betriebsstellen) k\u00f6nnen projektspezifisch durch die betriebliche Infrastrukturplanung in der BAst ATO vorgegeben werden."
		   });
		addAnnotation
		  (getATO_Timing_Point_Allg_AttributeGroup_Erreichungstoleranz(),
		   source,
		   new String[] {
			   "documentation", "Kodierung des Haltefensters am Haltplatz bei manueller Fahrt.\u00a0Der Parameter entspricht dem ATO-Parameter \\\"Q_STP_Reached\\\" gem\u00e4\u00df Subset 126, Version 0.0.17 vom 05.08.2020."
		   });
		addAnnotation
		  (getATO_Timing_Point_Allg_AttributeGroup_Haltetoleranz(),
		   source,
		   new String[] {
			   "documentation", "Kodierung des Haltefensters am Halteplatz bei automatischer Fahrt (Q_Stop_Location Tolerance)."
		   });
		addAnnotation
		  (getATO_Timing_Point_Allg_AttributeGroup_NIDTP(),
		   source,
		   new String[] {
			   "documentation", "Innerhalb eines Landes (NID-C-Bereich) einmalige Adresse des Timing Points."
		   });
		addAnnotation
		  (getATO_Timing_Point_Bezeichnung_AttributeGroup_BezeichnungATOTP(),
		   source,
		   new String[] {
			   "documentation", "Fachliche Bezeichnung des Timing Points (Parameter \u201eX_TEXT\u201c aus dem Block \u201eTiming Point Name\u201c, siehe Subset 126)."
		   });
		addAnnotation
		  (atO_TS_InstanzEClass,
		   source,
		   new String[] {
			   "documentation", "Zentrale Komponente f\u00fcr einen ATO-Infrastrukturbereich, die f\u00fcr die gesamten ATO-relevanten Infrastrukturdaten, insbesondere Segment Profiles und deren Verteilung an die ATO-Fahrzeugkomponenten (ATO-OB), verantwortlich ist."
		   });
		addAnnotation
		  (getATO_TS_Instanz_IDUnterbringung(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die Unterbringung, in der die ATO-TS-Instanz untergebracht ist. \u00dcber die Unterbringung wird auch die Position abgebildet. Die Angabe entf\u00e4llt bei einer cloud-basierten Realisierung."
		   });
		addAnnotation
		  (getATO_TS_Instanz_Adresse_AttributeGroup_NIDATOTS(),
		   source,
		   new String[] {
			   "documentation", "Kennung der ATO-TS-Instanz als Bestandteil der ATO-Kennung (ATO-ID) gem\u00e4\u00df Subset 126, Version 0.0.17 vom 05.08.2020.\nDie Kennung wird zentral zugeteilt und verwaltet."
		   });
		addAnnotation
		  (getATO_TS_Instanz_Adresse_AttributeGroup_NIDCATOTS(),
		   source,
		   new String[] {
			   "documentation", "Gebietskennung als Bestandteil der ATO-Kennung (ATO-ID) gem\u00e4\u00df Subset 126, Version 0.0.17 vom 05.08.2020.\nDie Gebietskennung NID_C_ATOTS f\u00fcr ATO-TS- Instanzen wird aus der ETCS-Gebietskennung (NID_C) des entsprechenden Bereichs \u00fcbernommen."
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
		  (abstand_ATO_Halt_Vor_EoA_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TAbstand_ATO_Halt_Vor_EoA",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter"
		   });
		addAnnotation
		  (abstand_ATO_Halt_Vor_EoA_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCAbstand_ATO_Halt_Vor_EoA",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAbstand_ATO_Halt_Vor_EoA_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (atO_Segment_ProfileEClass,
		   source,
		   new String[] {
			   "name", "CATO_Segment_Profile",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getATO_Segment_Profile_AbstandATOHaltVorEoA(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Abstand_ATO_Halt_Vor_EoA"
		   });
		addAnnotation
		  (getATO_Segment_Profile_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getATO_Segment_Profile_IDATOTSInstanz(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ATO_TS_Instanz"
		   });
		addAnnotation
		  (getATO_Segment_Profile_IDATOTSInstanzNachbar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ATO_TS_Instanz_Nachbar"
		   });
		addAnnotation
		  (getATO_Segment_Profile_IDETCSKante(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ETCS_Kante"
		   });
		addAnnotation
		  (getATO_Segment_Profile_IDOertlichkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Oertlichkeit"
		   });
		addAnnotation
		  (atO_Segment_Profile_Bezeichnung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CATO_Segment_Profile_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getATO_Segment_Profile_Bezeichnung_AttributeGroup_NIDSP(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NID_SP"
		   });
		addAnnotation
		  (atO_Timing_PointEClass,
		   source,
		   new String[] {
			   "name", "CATO_Timing_Point",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getATO_Timing_Point_ATOTimingPointAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ATO_Timing_Point_Allg"
		   });
		addAnnotation
		  (getATO_Timing_Point_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getATO_Timing_Point_IDSignal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Signal"
		   });
		addAnnotation
		  (atO_Timing_Point_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CATO_Timing_Point_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getATO_Timing_Point_Allg_AttributeGroup_Erreichungstoleranz(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Erreichungstoleranz"
		   });
		addAnnotation
		  (getATO_Timing_Point_Allg_AttributeGroup_Haltetoleranz(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Haltetoleranz"
		   });
		addAnnotation
		  (getATO_Timing_Point_Allg_AttributeGroup_NIDTP(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NID_TP"
		   });
		addAnnotation
		  (atO_Timing_Point_Bezeichnung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CATO_Timing_Point_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getATO_Timing_Point_Bezeichnung_AttributeGroup_BezeichnungATOTP(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung_ATO_TP"
		   });
		addAnnotation
		  (atO_TS_InstanzEClass,
		   source,
		   new String[] {
			   "name", "CATO_TS_Instanz",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getATO_TS_Instanz_ATOTSInstanzAdresse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ATO_TS_Instanz_Adresse"
		   });
		addAnnotation
		  (getATO_TS_Instanz_IDUnterbringung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Unterbringung"
		   });
		addAnnotation
		  (atO_TS_Instanz_Adresse_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CATO_TS_Instanz_Adresse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getATO_TS_Instanz_Adresse_AttributeGroup_NIDATOTS(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NID_ATOTS"
		   });
		addAnnotation
		  (getATO_TS_Instanz_Adresse_AttributeGroup_NIDCATOTS(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "NID_C_ATOTS"
		   });
		addAnnotation
		  (bezeichnung_ATO_TP_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBezeichnung_ATO_TP",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText"
		   });
		addAnnotation
		  (bezeichnung_ATO_TP_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBezeichnung_ATO_TP",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBezeichnung_ATO_TP_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (erreichungstoleranz_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TErreichungstoleranz",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "pattern", "[0-9]|[12][0-9]|30|31"
		   });
		addAnnotation
		  (erreichungstoleranz_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCErreichungstoleranz",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getErreichungstoleranz_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (haltetoleranz_TypeEDataType,
		   source,
		   new String[] {
			   "name", "THaltetoleranz",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "pattern", "[0-9]|[12][0-9]|30|31"
		   });
		addAnnotation
		  (haltetoleranz_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCHaltetoleranz",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHaltetoleranz_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (niD_ATOTS_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TNID_ATOTS",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer"
		   });
		addAnnotation
		  (niD_ATOTS_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCNID_ATOTS",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNID_ATOTS_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (niD_C_ATOTS_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TNID_C_ATOTS",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "pattern", "102[0-3]|10[0-1][0-9]|[1-9][0-9]{2}|0|[1-9][0-9]{0,1}"
		   });
		addAnnotation
		  (niD_C_ATOTS_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCNID_C_ATOTS",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNID_C_ATOTS_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (niD_SP_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TNID_SP",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText"
		   });
		addAnnotation
		  (niD_SP_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCNID_SP",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNID_SP_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (niD_TP_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TNID_TP",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer"
		   });
		addAnnotation
		  (niD_TP_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCNID_TP",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNID_TP_TypeClass_Wert(),
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
		  (atO_Segment_ProfileEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ATO</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (atO_Timing_PointEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ATO</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getATO_Timing_Point_Allg_AttributeGroup_Erreichungstoleranz(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[0..31]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getATO_Timing_Point_Allg_AttributeGroup_Haltetoleranz(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[0..31]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (atO_TS_InstanzEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ATO</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getATO_TS_Instanz_Adresse_AttributeGroup_NIDCATOTS(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[0..1023]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
	}

} //ATOPackageImpl
