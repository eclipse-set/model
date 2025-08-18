/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Regelzeichnung.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.set.model.planpro.ATO.ATOPackage;

import org.eclipse.set.model.planpro.ATO.impl.ATOPackageImpl;

import org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementPackage;

import org.eclipse.set.model.planpro.Ansteuerung_Element.impl.Ansteuerung_ElementPackageImpl;

import org.eclipse.set.model.planpro.Bahnsteig.BahnsteigPackage;

import org.eclipse.set.model.planpro.Bahnsteig.impl.BahnsteigPackageImpl;

import org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.model.planpro.Bahnuebergang.impl.BahnuebergangPackageImpl;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.impl.Balisentechnik_ETCSPackageImpl;

import org.eclipse.set.model.planpro.BasisTypen.BasisTypenPackage;

import org.eclipse.set.model.planpro.BasisTypen.impl.BasisTypenPackageImpl;

import org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage;

import org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl;

import org.eclipse.set.model.planpro.Bedienung.BedienungPackage;

import org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl;

import org.eclipse.set.model.planpro.Block.BlockPackage;

import org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl;

import org.eclipse.set.model.planpro.Fahrstrasse.FahrstrassePackage;

import org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl;

import org.eclipse.set.model.planpro.Flankenschutz.FlankenschutzPackage;

import org.eclipse.set.model.planpro.Flankenschutz.impl.FlankenschutzPackageImpl;

import org.eclipse.set.model.planpro.Geodaten.GeodatenPackage;

import org.eclipse.set.model.planpro.Geodaten.impl.GeodatenPackageImpl;

import org.eclipse.set.model.planpro.Gleis.GleisPackage;

import org.eclipse.set.model.planpro.Gleis.impl.GleisPackageImpl;

import org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage;

import org.eclipse.set.model.planpro.Layoutinformationen.impl.LayoutinformationenPackageImpl;

import org.eclipse.set.model.planpro.Medien_und_Trassen.Medien_und_TrassenPackage;

import org.eclipse.set.model.planpro.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl;

import org.eclipse.set.model.planpro.Nahbedienung.NahbedienungPackage;

import org.eclipse.set.model.planpro.Nahbedienung.impl.NahbedienungPackageImpl;

import org.eclipse.set.model.planpro.Ortung.OrtungPackage;

import org.eclipse.set.model.planpro.Ortung.impl.OrtungPackageImpl;

import org.eclipse.set.model.planpro.PZB.PZBPackage;

import org.eclipse.set.model.planpro.PZB.impl.PZBPackageImpl;

import org.eclipse.set.model.planpro.PlanPro.PlanProPackage;

import org.eclipse.set.model.planpro.PlanPro.impl.PlanProPackageImpl;

import org.eclipse.set.model.planpro.Regelzeichnung.Bild_TypeClass;
import org.eclipse.set.model.planpro.Regelzeichnung.RZ_Nummer_TypeClass;
import org.eclipse.set.model.planpro.Regelzeichnung.RZ_Parameter_Name_TypeClass;
import org.eclipse.set.model.planpro.Regelzeichnung.RZ_Parameter_Wert_TypeClass;
import org.eclipse.set.model.planpro.Regelzeichnung.Regelzeichnung;
import org.eclipse.set.model.planpro.Regelzeichnung.RegelzeichnungFactory;
import org.eclipse.set.model.planpro.Regelzeichnung.RegelzeichnungPackage;
import org.eclipse.set.model.planpro.Regelzeichnung.Regelzeichnung_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Regelzeichnung.Regelzeichnung_Parameter;
import org.eclipse.set.model.planpro.Regelzeichnung.Regelzeichnung_Parameter_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Regelzeichnung.Titel_TypeClass;
import org.eclipse.set.model.planpro.Regelzeichnung.Untertitel_TypeClass;

import org.eclipse.set.model.planpro.Regelzeichnung.util.RegelzeichnungValidator;

import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage;

import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl;

import org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Signalbegriffe_Ril_301Package;

import org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl;

import org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriffe_StrukturPackage;

import org.eclipse.set.model.planpro.Signalbegriffe_Struktur.impl.Signalbegriffe_StrukturPackageImpl;

import org.eclipse.set.model.planpro.Signale.SignalePackage;

import org.eclipse.set.model.planpro.Signale.impl.SignalePackageImpl;

import org.eclipse.set.model.planpro.Verweise.VerweisePackage;

import org.eclipse.set.model.planpro.Verweise.impl.VerweisePackageImpl;

import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage;

import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl;

import org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungPackage;

import org.eclipse.set.model.planpro.Zuglenkung.impl.ZuglenkungPackageImpl;

import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.impl.ZugnummernmeldeanlagePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RegelzeichnungPackageImpl extends EPackageImpl implements RegelzeichnungPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bild_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regelzeichnungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regelzeichnung_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regelzeichnung_ParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass regelzeichnung_Parameter_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rZ_Nummer_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rZ_Parameter_Name_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rZ_Parameter_Wert_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titel_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass untertitel_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bild_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rZ_Nummer_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rZ_Parameter_Name_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rZ_Parameter_Wert_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType titel_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType untertitel_TypeEDataType = null;

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
	 * @see org.eclipse.set.model.planpro.Regelzeichnung.RegelzeichnungPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RegelzeichnungPackageImpl() {
		super(eNS_URI, RegelzeichnungFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RegelzeichnungPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RegelzeichnungPackage init() {
		if (isInited) return (RegelzeichnungPackage)EPackage.Registry.INSTANCE.getEPackage(RegelzeichnungPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRegelzeichnungPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RegelzeichnungPackageImpl theRegelzeichnungPackage = registeredRegelzeichnungPackage instanceof RegelzeichnungPackageImpl ? (RegelzeichnungPackageImpl)registeredRegelzeichnungPackage : new RegelzeichnungPackageImpl();

		isInited = true;

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NahbedienungPackage.eNS_URI);
		NahbedienungPackageImpl theNahbedienungPackage = (NahbedienungPackageImpl)(registeredPackage instanceof NahbedienungPackageImpl ? registeredPackage : NahbedienungPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PZBPackage.eNS_URI);
		PZBPackageImpl thePZBPackage = (PZBPackageImpl)(registeredPackage instanceof PZBPackageImpl ? registeredPackage : PZBPackage.eINSTANCE);
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
		theRegelzeichnungPackage.createPackageContents();
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
		theNahbedienungPackage.createPackageContents();
		thePZBPackage.createPackageContents();
		theSchluesselabhaengigkeitenPackage.createPackageContents();
		theSignalePackage.createPackageContents();
		theSignalbegriffe_StrukturPackage.createPackageContents();
		theZuglenkungPackage.createPackageContents();
		theZugnummernmeldeanlagePackage.createPackageContents();
		theLayoutinformationenPackage.createPackageContents();

		// Initialize created meta-data
		theRegelzeichnungPackage.initializePackageContents();
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
		theNahbedienungPackage.initializePackageContents();
		thePZBPackage.initializePackageContents();
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
			(theRegelzeichnungPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return RegelzeichnungValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theRegelzeichnungPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RegelzeichnungPackage.eNS_URI, theRegelzeichnungPackage);
		return theRegelzeichnungPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBild_TypeClass() {
		return bild_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBild_TypeClass_Wert() {
		return (EAttribute)bild_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegelzeichnung() {
		return regelzeichnungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRegelzeichnung_RegelzeichnungAllg() {
		return (EReference)regelzeichnungEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegelzeichnung_Allg_AttributeGroup() {
		return regelzeichnung_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRegelzeichnung_Allg_AttributeGroup_Bild() {
		return (EReference)regelzeichnung_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRegelzeichnung_Allg_AttributeGroup_RZNummer() {
		return (EReference)regelzeichnung_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRegelzeichnung_Allg_AttributeGroup_Titel() {
		return (EReference)regelzeichnung_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRegelzeichnung_Allg_AttributeGroup_Untertitel() {
		return (EReference)regelzeichnung_Allg_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegelzeichnung_Parameter() {
		return regelzeichnung_ParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRegelzeichnung_Parameter_IDRegelzeichnung() {
		return (EReference)regelzeichnung_ParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRegelzeichnung_Parameter_RegelzeichnungParameterAllg() {
		return (EReference)regelzeichnung_ParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRegelzeichnung_Parameter_Allg_AttributeGroup() {
		return regelzeichnung_Parameter_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRegelzeichnung_Parameter_Allg_AttributeGroup_RZParameterName() {
		return (EReference)regelzeichnung_Parameter_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRegelzeichnung_Parameter_Allg_AttributeGroup_RZParameterWert() {
		return (EReference)regelzeichnung_Parameter_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRZ_Nummer_TypeClass() {
		return rZ_Nummer_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRZ_Nummer_TypeClass_Wert() {
		return (EAttribute)rZ_Nummer_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRZ_Parameter_Name_TypeClass() {
		return rZ_Parameter_Name_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRZ_Parameter_Name_TypeClass_Wert() {
		return (EAttribute)rZ_Parameter_Name_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRZ_Parameter_Wert_TypeClass() {
		return rZ_Parameter_Wert_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRZ_Parameter_Wert_TypeClass_Wert() {
		return (EAttribute)rZ_Parameter_Wert_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTitel_TypeClass() {
		return titel_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTitel_TypeClass_Wert() {
		return (EAttribute)titel_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUntertitel_TypeClass() {
		return untertitel_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUntertitel_TypeClass_Wert() {
		return (EAttribute)untertitel_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBild_Type() {
		return bild_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRZ_Nummer_Type() {
		return rZ_Nummer_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRZ_Parameter_Name_Type() {
		return rZ_Parameter_Name_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRZ_Parameter_Wert_Type() {
		return rZ_Parameter_Wert_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTitel_Type() {
		return titel_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getUntertitel_Type() {
		return untertitel_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RegelzeichnungFactory getRegelzeichnungFactory() {
		return (RegelzeichnungFactory)getEFactoryInstance();
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
		bild_TypeClassEClass = createEClass(BILD_TYPE_CLASS);
		createEAttribute(bild_TypeClassEClass, BILD_TYPE_CLASS__WERT);

		regelzeichnungEClass = createEClass(REGELZEICHNUNG);
		createEReference(regelzeichnungEClass, REGELZEICHNUNG__REGELZEICHNUNG_ALLG);

		regelzeichnung_Allg_AttributeGroupEClass = createEClass(REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP);
		createEReference(regelzeichnung_Allg_AttributeGroupEClass, REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__BILD);
		createEReference(regelzeichnung_Allg_AttributeGroupEClass, REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__RZ_NUMMER);
		createEReference(regelzeichnung_Allg_AttributeGroupEClass, REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__TITEL);
		createEReference(regelzeichnung_Allg_AttributeGroupEClass, REGELZEICHNUNG_ALLG_ATTRIBUTE_GROUP__UNTERTITEL);

		regelzeichnung_ParameterEClass = createEClass(REGELZEICHNUNG_PARAMETER);
		createEReference(regelzeichnung_ParameterEClass, REGELZEICHNUNG_PARAMETER__ID_REGELZEICHNUNG);
		createEReference(regelzeichnung_ParameterEClass, REGELZEICHNUNG_PARAMETER__REGELZEICHNUNG_PARAMETER_ALLG);

		regelzeichnung_Parameter_Allg_AttributeGroupEClass = createEClass(REGELZEICHNUNG_PARAMETER_ALLG_ATTRIBUTE_GROUP);
		createEReference(regelzeichnung_Parameter_Allg_AttributeGroupEClass, REGELZEICHNUNG_PARAMETER_ALLG_ATTRIBUTE_GROUP__RZ_PARAMETER_NAME);
		createEReference(regelzeichnung_Parameter_Allg_AttributeGroupEClass, REGELZEICHNUNG_PARAMETER_ALLG_ATTRIBUTE_GROUP__RZ_PARAMETER_WERT);

		rZ_Nummer_TypeClassEClass = createEClass(RZ_NUMMER_TYPE_CLASS);
		createEAttribute(rZ_Nummer_TypeClassEClass, RZ_NUMMER_TYPE_CLASS__WERT);

		rZ_Parameter_Name_TypeClassEClass = createEClass(RZ_PARAMETER_NAME_TYPE_CLASS);
		createEAttribute(rZ_Parameter_Name_TypeClassEClass, RZ_PARAMETER_NAME_TYPE_CLASS__WERT);

		rZ_Parameter_Wert_TypeClassEClass = createEClass(RZ_PARAMETER_WERT_TYPE_CLASS);
		createEAttribute(rZ_Parameter_Wert_TypeClassEClass, RZ_PARAMETER_WERT_TYPE_CLASS__WERT);

		titel_TypeClassEClass = createEClass(TITEL_TYPE_CLASS);
		createEAttribute(titel_TypeClassEClass, TITEL_TYPE_CLASS__WERT);

		untertitel_TypeClassEClass = createEClass(UNTERTITEL_TYPE_CLASS);
		createEAttribute(untertitel_TypeClassEClass, UNTERTITEL_TYPE_CLASS__WERT);

		// Create data types
		bild_TypeEDataType = createEDataType(BILD_TYPE);
		rZ_Nummer_TypeEDataType = createEDataType(RZ_NUMMER_TYPE);
		rZ_Parameter_Name_TypeEDataType = createEDataType(RZ_PARAMETER_NAME_TYPE);
		rZ_Parameter_Wert_TypeEDataType = createEDataType(RZ_PARAMETER_WERT_TYPE);
		titel_TypeEDataType = createEDataType(TITEL_TYPE);
		untertitel_TypeEDataType = createEDataType(UNTERTITEL_TYPE);
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
		bild_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		regelzeichnungEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		regelzeichnung_ParameterEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		rZ_Nummer_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		rZ_Parameter_Name_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		rZ_Parameter_Wert_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		titel_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		untertitel_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());

		// Initialize classes and features; add operations and parameters
		initEClass(bild_TypeClassEClass, Bild_TypeClass.class, "Bild_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBild_TypeClass_Wert(), this.getBild_Type(), "wert", null, 1, 1, Bild_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regelzeichnungEClass, Regelzeichnung.class, "Regelzeichnung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegelzeichnung_RegelzeichnungAllg(), this.getRegelzeichnung_Allg_AttributeGroup(), null, "regelzeichnungAllg", null, 1, 1, Regelzeichnung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regelzeichnung_Allg_AttributeGroupEClass, Regelzeichnung_Allg_AttributeGroup.class, "Regelzeichnung_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegelzeichnung_Allg_AttributeGroup_Bild(), this.getBild_TypeClass(), null, "bild", null, 0, 1, Regelzeichnung_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegelzeichnung_Allg_AttributeGroup_RZNummer(), this.getRZ_Nummer_TypeClass(), null, "rZNummer", null, 1, 1, Regelzeichnung_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegelzeichnung_Allg_AttributeGroup_Titel(), this.getTitel_TypeClass(), null, "titel", null, 0, 1, Regelzeichnung_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegelzeichnung_Allg_AttributeGroup_Untertitel(), this.getUntertitel_TypeClass(), null, "untertitel", null, 0, 1, Regelzeichnung_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regelzeichnung_ParameterEClass, Regelzeichnung_Parameter.class, "Regelzeichnung_Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegelzeichnung_Parameter_IDRegelzeichnung(), theVerweisePackage.getID_Regelzeichnung_TypeClass(), null, "iDRegelzeichnung", null, 1, 1, Regelzeichnung_Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegelzeichnung_Parameter_RegelzeichnungParameterAllg(), this.getRegelzeichnung_Parameter_Allg_AttributeGroup(), null, "regelzeichnungParameterAllg", null, 1, 1, Regelzeichnung_Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(regelzeichnung_Parameter_Allg_AttributeGroupEClass, Regelzeichnung_Parameter_Allg_AttributeGroup.class, "Regelzeichnung_Parameter_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegelzeichnung_Parameter_Allg_AttributeGroup_RZParameterName(), this.getRZ_Parameter_Name_TypeClass(), null, "rZParameterName", null, 1, 1, Regelzeichnung_Parameter_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegelzeichnung_Parameter_Allg_AttributeGroup_RZParameterWert(), this.getRZ_Parameter_Wert_TypeClass(), null, "rZParameterWert", null, 1, 1, Regelzeichnung_Parameter_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rZ_Nummer_TypeClassEClass, RZ_Nummer_TypeClass.class, "RZ_Nummer_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRZ_Nummer_TypeClass_Wert(), this.getRZ_Nummer_Type(), "wert", null, 1, 1, RZ_Nummer_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rZ_Parameter_Name_TypeClassEClass, RZ_Parameter_Name_TypeClass.class, "RZ_Parameter_Name_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRZ_Parameter_Name_TypeClass_Wert(), this.getRZ_Parameter_Name_Type(), "wert", null, 1, 1, RZ_Parameter_Name_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rZ_Parameter_Wert_TypeClassEClass, RZ_Parameter_Wert_TypeClass.class, "RZ_Parameter_Wert_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRZ_Parameter_Wert_TypeClass_Wert(), this.getRZ_Parameter_Wert_Type(), "wert", null, 1, 1, RZ_Parameter_Wert_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(titel_TypeClassEClass, Titel_TypeClass.class, "Titel_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTitel_TypeClass_Wert(), this.getTitel_Type(), "wert", null, 1, 1, Titel_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(untertitel_TypeClassEClass, Untertitel_TypeClass.class, "Untertitel_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUntertitel_TypeClass_Wert(), this.getUntertitel_Type(), "wert", null, 1, 1, Untertitel_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(bild_TypeEDataType, String.class, "Bild_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rZ_Nummer_TypeEDataType, String.class, "RZ_Nummer_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rZ_Parameter_Name_TypeEDataType, String.class, "RZ_Parameter_Name_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(rZ_Parameter_Wert_TypeEDataType, String.class, "RZ_Parameter_Wert_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(titel_TypeEDataType, String.class, "Titel_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(untertitel_TypeEDataType, String.class, "Untertitel_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
			   "documentation", "Dieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.1.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbinfrago.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.1.\n\nMore information about the license can be found on\nhttp://www.dbinfrago.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\r\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.1.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbinfrago.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.1.\n\nMore information about the license can be found on\nhttp://www.dbinfrago.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\r\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.1.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbinfrago.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.1.\n\nMore information about the license can be found on\nhttp://www.dbinfrago.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\r\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.1.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbinfrago.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.1.\n\nMore information about the license can be found on\nhttp://www.dbinfrago.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface."
		   });
		addAnnotation
		  (regelzeichnungEClass,
		   source,
		   new String[] {
			   "documentation", "Regelzeichnungen werden verwendet, um einheitliche Bauausf\u00fchrungen f\u00fcr bestimmte Objekte sicherzustellen. Die f\u00fcr die LST-Anwendungen im Datenmodell ben\u00f6tigten Regelzeichnungen werden in einer Regelzeichnungstabelle aufgelistet. Regelzeichnungen k\u00f6nnen neben dem Bild eine beliebige Anzahl von Parametern haben, die die Bausausf\u00fchrung f\u00fcr einen konkreten Anwendungsfall genauer spezifizieren. Die G\u00fcltigkeit der Parameter f\u00fcr eine konkrete Anwendung in einer Regelzeichnung kann nur mit Hilfe der Plausibilit\u00e4ts- und Zul\u00e4ssigkeitspr\u00fcfung (PlaZ) bestimmt werden. DB-Regelwerk F\u00fcr die Anwendung der Regelzeichnugen f\u00fcr Weichen, Kreuzungen und Gleissperren ist das Regelwerk 819.0401Z01 bis 819.0401Z03 zu beachten."
		   });
		addAnnotation
		  (getRegelzeichnung_Allg_AttributeGroup_Bild(),
		   source,
		   new String[] {
			   "documentation", "Parameter zur Angabe eines bestimmten Anwendungsfalls einer Regelzeichnung. Auf einer Regelzeichnung sind im Allgemeinen mehrere Anwendungen in unterschiedlichen Bildern dargestellt. Der Parameter Bild verweist auf eine derartige konkrete Anwendung. Die Bezeichnung der Bilder ist nicht vorgegeben und wird von den Erstellern der Regelzeichnung unterschiedlich angegeben. Es sind neben den alphanumerischen Zeichen auch Sonderzeichen m\u00f6glich."
		   });
		addAnnotation
		  (getRegelzeichnung_Allg_AttributeGroup_RZNummer(),
		   source,
		   new String[] {
			   "documentation", "Ordnungsmerkmal, was die Regelzeichnung identifiziert. Die Regelzeichnungen sind im System von IZ-Plan unter diesem Ordnungsmerkmal abgelegt. Die Regelzeichnungen der Sicherungstechnik beginnen in der Regel mit dem Kennbuchstaben S und werden von mehrteilig durch Dezimalpunkt getrennte Zahlen erg\u00e4nzt. Die letzte Zahl stellt dabei den Ausgabestand dar."
		   });
		addAnnotation
		  (getRegelzeichnung_Allg_AttributeGroup_Titel(),
		   source,
		   new String[] {
			   "documentation", "Titel der Regelzeichnung. Der Titel ist im Schriftfeld dargestellt und erl\u00e4utert grob den Inhalt und die Anwendung der Regelzeichnung."
		   });
		addAnnotation
		  (getRegelzeichnung_Allg_AttributeGroup_Untertitel(),
		   source,
		   new String[] {
			   "documentation", "Zus\u00e4tzliche Erl\u00e4uterungen und Abgrenzungen der Regelzeichnung, die nicht aus dem Titel hervorgehen. Der Untertitel wird vom Bearbeiter der Regelzeichnung vergeben."
		   });
		addAnnotation
		  (regelzeichnung_ParameterEClass,
		   source,
		   new String[] {
			   "documentation", "Einer Regelzeichnung werden durch dieses Objekt weitere Parameter zugeordnet. F\u00fcr eine Regelzeichnung k\u00f6nnen beliebig viele Parameter entsprechend der konkreten Anwendung angegeben werden. "
		   });
		addAnnotation
		  (getRegelzeichnung_Parameter_IDRegelzeichnung(),
		   source,
		   new String[] {
			   "documentation", "Zuweisung des Parameters zur Regelzeichnung. "
		   });
		addAnnotation
		  (getRegelzeichnung_Parameter_Allg_AttributeGroup_RZParameterName(),
		   source,
		   new String[] {
			   "documentation", "Name eines Parameters, der in einer Regelzeichnung hinterlegt ist und die konkrete Anwendung der Regelzeichnung pr\u00e4zisiert. Dem benannten Parameter wird ein Wert zugewiesen. Die zul\u00e4ssigen Namen sind f\u00fcr die Regelzeichnungen unterschiedlich. Es muss deshalb eine Datenbank entstehen, in der die f\u00fcr eine Regelzeichnung g\u00fcltigen Parameter abgelegt sind, da ansonsten eine rechnergest\u00fctzte Auswertung nicht m\u00f6glich ist."
		   });
		addAnnotation
		  (getRegelzeichnung_Parameter_Allg_AttributeGroup_RZParameterWert(),
		   source,
		   new String[] {
			   "documentation", "Wert, der einen Parameter in einer Regelzeichnung spezifiziert. Der Wert kann dabei ein fester Wert sein oder aus einer in der Regelzeichnung vorhandenen Tabelle entnommen werden. "
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
		  (bild_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBild",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TText",
			   "pattern", ".{1,20}"
		   });
		addAnnotation
		  (bild_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBild",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBild_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (regelzeichnungEClass,
		   source,
		   new String[] {
			   "name", "CRegelzeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRegelzeichnung_RegelzeichnungAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Regelzeichnung_Allg"
		   });
		addAnnotation
		  (regelzeichnung_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CRegelzeichnung_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRegelzeichnung_Allg_AttributeGroup_Bild(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bild"
		   });
		addAnnotation
		  (getRegelzeichnung_Allg_AttributeGroup_RZNummer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RZ_Nummer"
		   });
		addAnnotation
		  (getRegelzeichnung_Allg_AttributeGroup_Titel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Titel"
		   });
		addAnnotation
		  (getRegelzeichnung_Allg_AttributeGroup_Untertitel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Untertitel"
		   });
		addAnnotation
		  (regelzeichnung_ParameterEClass,
		   source,
		   new String[] {
			   "name", "CRegelzeichnung_Parameter",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRegelzeichnung_Parameter_IDRegelzeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Regelzeichnung"
		   });
		addAnnotation
		  (getRegelzeichnung_Parameter_RegelzeichnungParameterAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Regelzeichnung_Parameter_Allg"
		   });
		addAnnotation
		  (regelzeichnung_Parameter_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CRegelzeichnung_Parameter_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRegelzeichnung_Parameter_Allg_AttributeGroup_RZParameterName(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RZ_Parameter_Name"
		   });
		addAnnotation
		  (getRegelzeichnung_Parameter_Allg_AttributeGroup_RZParameterWert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "RZ_Parameter_Wert"
		   });
		addAnnotation
		  (rZ_Nummer_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TRZ_Nummer",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TText",
			   "pattern", ".{1,20}"
		   });
		addAnnotation
		  (rZ_Nummer_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCRZ_Nummer",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRZ_Nummer_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (rZ_Parameter_Name_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TRZ_Parameter_Name",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TText",
			   "pattern", ".{1,20}"
		   });
		addAnnotation
		  (rZ_Parameter_Name_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCRZ_Parameter_Name",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRZ_Parameter_Name_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (rZ_Parameter_Wert_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TRZ_Parameter_Wert",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TText",
			   "pattern", ".{1,20}"
		   });
		addAnnotation
		  (rZ_Parameter_Wert_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCRZ_Parameter_Wert",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRZ_Parameter_Wert_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (titel_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TTitel",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TText",
			   "pattern", ".{1,200}"
		   });
		addAnnotation
		  (titel_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTitel",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTitel_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (untertitel_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TUntertitel",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TText",
			   "pattern", ".{1,200}"
		   });
		addAnnotation
		  (untertitel_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCUntertitel",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getUntertitel_TypeClass_Wert(),
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
		  (regelzeichnungEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n              \r\n  <ppi:WorkflowInformation>\r\n                   \r\n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n                   \r\n    <ppi:Untergewerke>B\u00dc|ESTW</ppi:Untergewerke>\r\n                \r\n  </ppi:WorkflowInformation>\r\n           \r\n"
		   });
		addAnnotation
		  (getRegelzeichnung_Allg_AttributeGroup_Bild(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                    \r\n  <ppi:WorkflowInformation>\r\n                         \r\n    <ppi:Patternbeschreibung> [1..20] </ppi:Patternbeschreibung>\r\n                      \r\n  </ppi:WorkflowInformation>\r\n                 \r\n"
		   });
		addAnnotation
		  (getRegelzeichnung_Allg_AttributeGroup_RZNummer(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                    \r\n  <ppi:WorkflowInformation>\r\n                         \r\n    <ppi:Patternbeschreibung> [1..20] </ppi:Patternbeschreibung>\r\n                      \r\n  </ppi:WorkflowInformation>\r\n                 \r\n"
		   });
		addAnnotation
		  (getRegelzeichnung_Allg_AttributeGroup_Titel(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                    \r\n  <ppi:WorkflowInformation>\r\n                         \r\n    <ppi:Patternbeschreibung> [1..200] </ppi:Patternbeschreibung>\r\n                      \r\n  </ppi:WorkflowInformation>\r\n                 \r\n"
		   });
		addAnnotation
		  (getRegelzeichnung_Allg_AttributeGroup_Untertitel(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                    \r\n  <ppi:WorkflowInformation>\r\n                         \r\n    <ppi:Patternbeschreibung> [1..200] </ppi:Patternbeschreibung>\r\n                      \r\n  </ppi:WorkflowInformation>\r\n                 \r\n"
		   });
		addAnnotation
		  (regelzeichnung_ParameterEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n              \r\n  <ppi:WorkflowInformation>\r\n                   \r\n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n                   \r\n    <ppi:Untergewerke>B\u00dc|ESTW</ppi:Untergewerke>\r\n                \r\n  </ppi:WorkflowInformation>\r\n           \r\n"
		   });
		addAnnotation
		  (getRegelzeichnung_Parameter_Allg_AttributeGroup_RZParameterName(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                    \r\n  <ppi:WorkflowInformation>\r\n                         \r\n    <ppi:Patternbeschreibung> [1..20] </ppi:Patternbeschreibung>\r\n                      \r\n  </ppi:WorkflowInformation>\r\n                 \r\n"
		   });
		addAnnotation
		  (getRegelzeichnung_Parameter_Allg_AttributeGroup_RZParameterWert(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                    \r\n  <ppi:WorkflowInformation>\r\n                         \r\n    <ppi:Patternbeschreibung> [1..20] </ppi:Patternbeschreibung>\r\n                      \r\n  </ppi:WorkflowInformation>\r\n                 \r\n"
		   });
	}

} //RegelzeichnungPackageImpl
