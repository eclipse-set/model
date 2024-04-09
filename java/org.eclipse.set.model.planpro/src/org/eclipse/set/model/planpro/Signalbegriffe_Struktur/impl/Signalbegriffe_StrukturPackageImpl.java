/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Signalbegriffe_Struktur.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

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

import org.eclipse.set.model.planpro.Regelzeichnung.RegelzeichnungPackage;

import org.eclipse.set.model.planpro.Regelzeichnung.impl.RegelzeichnungPackageImpl;

import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage;

import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl;

import org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.Signalbegriffe_Ril_301Package;

import org.eclipse.set.model.planpro.Signalbegriffe_Ril_301.impl.Signalbegriffe_Ril_301PackageImpl;

import org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriff_ID_TypeClass;
import org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriffe_StrukturFactory;
import org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriffe_StrukturPackage;

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
public class Signalbegriffe_StrukturPackageImpl extends EPackageImpl implements Signalbegriffe_StrukturPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalbegriff_ID_TypeClassEClass = null;

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
	 * @see org.eclipse.set.model.planpro.Signalbegriffe_Struktur.Signalbegriffe_StrukturPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Signalbegriffe_StrukturPackageImpl() {
		super(eNS_URI, Signalbegriffe_StrukturFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Signalbegriffe_StrukturPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Signalbegriffe_StrukturPackage init() {
		if (isInited) return (Signalbegriffe_StrukturPackage)EPackage.Registry.INSTANCE.getEPackage(Signalbegriffe_StrukturPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSignalbegriffe_StrukturPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Signalbegriffe_StrukturPackageImpl theSignalbegriffe_StrukturPackage = registeredSignalbegriffe_StrukturPackage instanceof Signalbegriffe_StrukturPackageImpl ? (Signalbegriffe_StrukturPackageImpl)registeredSignalbegriffe_StrukturPackage : new Signalbegriffe_StrukturPackageImpl();

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
		theSignalbegriffe_StrukturPackage.createPackageContents();
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
		theRegelzeichnungPackage.createPackageContents();
		theSchluesselabhaengigkeitenPackage.createPackageContents();
		theSignalePackage.createPackageContents();
		theZuglenkungPackage.createPackageContents();
		theZugnummernmeldeanlagePackage.createPackageContents();
		theLayoutinformationenPackage.createPackageContents();

		// Initialize created meta-data
		theSignalbegriffe_StrukturPackage.initializePackageContents();
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
		theRegelzeichnungPackage.initializePackageContents();
		theSchluesselabhaengigkeitenPackage.initializePackageContents();
		theSignalePackage.initializePackageContents();
		theZuglenkungPackage.initializePackageContents();
		theZugnummernmeldeanlagePackage.initializePackageContents();
		theLayoutinformationenPackage.initializePackageContents();

		// Fix loaded packages
		thePlanProPackage.fixPackageContents();
		theBalisentechnik_ETCSPackage.fixPackageContents();
		theBahnuebergangPackage.fixPackageContents();
		theSignalbegriffe_Ril_301Package.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theSignalbegriffe_StrukturPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Signalbegriffe_StrukturPackage.eNS_URI, theSignalbegriffe_StrukturPackage);
		return theSignalbegriffe_StrukturPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignalbegriff_ID_TypeClass() {
		return signalbegriff_ID_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignalbegriff_ID_TypeClass_Symbol() {
		return (EAttribute)signalbegriff_ID_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignalbegriff_ID_TypeClass_Anmerkungen() {
		return (EAttribute)signalbegriff_ID_TypeClassEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignalbegriff_ID_TypeClass_Beleuchtbar() {
		return (EAttribute)signalbegriff_ID_TypeClassEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignalbegriff_ID_TypeClass_Beschreibung() {
		return (EAttribute)signalbegriff_ID_TypeClassEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignalbegriff_ID_TypeClass_GeltungsbereichDS() {
		return (EAttribute)signalbegriff_ID_TypeClassEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignalbegriff_ID_TypeClass_GeltungsbereichDV() {
		return (EAttribute)signalbegriff_ID_TypeClassEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignalbegriff_ID_TypeClass_GeltungsbereichSBahnB() {
		return (EAttribute)signalbegriff_ID_TypeClassEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignalbegriff_ID_TypeClass_GeltungsbereichSBahnHH() {
		return (EAttribute)signalbegriff_ID_TypeClassEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignalbegriff_ID_TypeClass_GueltigAb() {
		return (EAttribute)signalbegriff_ID_TypeClassEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignalbegriff_ID_TypeClass_GueltigBis() {
		return (EAttribute)signalbegriff_ID_TypeClassEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignalbegriff_ID_TypeClass_KurzbezeichnungDS() {
		return (EAttribute)signalbegriff_ID_TypeClassEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignalbegriff_ID_TypeClass_KurzbezeichnungDV() {
		return (EAttribute)signalbegriff_ID_TypeClassEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignalbegriff_ID_TypeClass_Langbezeichnung() {
		return (EAttribute)signalbegriff_ID_TypeClassEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignalbegriff_ID_TypeClass_Schaltbar() {
		return (EAttribute)signalbegriff_ID_TypeClassEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignalbegriff_ID_TypeClass_ZusatzMoeglich() {
		return (EAttribute)signalbegriff_ID_TypeClassEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Signalbegriffe_StrukturFactory getSignalbegriffe_StrukturFactory() {
		return (Signalbegriffe_StrukturFactory)getEFactoryInstance();
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
		signalbegriff_ID_TypeClassEClass = createEClass(SIGNALBEGRIFF_ID_TYPE_CLASS);
		createEAttribute(signalbegriff_ID_TypeClassEClass, SIGNALBEGRIFF_ID_TYPE_CLASS__SYMBOL);
		createEAttribute(signalbegriff_ID_TypeClassEClass, SIGNALBEGRIFF_ID_TYPE_CLASS__ANMERKUNGEN);
		createEAttribute(signalbegriff_ID_TypeClassEClass, SIGNALBEGRIFF_ID_TYPE_CLASS__BELEUCHTBAR);
		createEAttribute(signalbegriff_ID_TypeClassEClass, SIGNALBEGRIFF_ID_TYPE_CLASS__BESCHREIBUNG);
		createEAttribute(signalbegriff_ID_TypeClassEClass, SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DS);
		createEAttribute(signalbegriff_ID_TypeClassEClass, SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_DV);
		createEAttribute(signalbegriff_ID_TypeClassEClass, SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_B);
		createEAttribute(signalbegriff_ID_TypeClassEClass, SIGNALBEGRIFF_ID_TYPE_CLASS__GELTUNGSBEREICH_SBAHN_HH);
		createEAttribute(signalbegriff_ID_TypeClassEClass, SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_AB);
		createEAttribute(signalbegriff_ID_TypeClassEClass, SIGNALBEGRIFF_ID_TYPE_CLASS__GUELTIG_BIS);
		createEAttribute(signalbegriff_ID_TypeClassEClass, SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DS);
		createEAttribute(signalbegriff_ID_TypeClassEClass, SIGNALBEGRIFF_ID_TYPE_CLASS__KURZBEZEICHNUNG_DV);
		createEAttribute(signalbegriff_ID_TypeClassEClass, SIGNALBEGRIFF_ID_TYPE_CLASS__LANGBEZEICHNUNG);
		createEAttribute(signalbegriff_ID_TypeClassEClass, SIGNALBEGRIFF_ID_TYPE_CLASS__SCHALTBAR);
		createEAttribute(signalbegriff_ID_TypeClassEClass, SIGNALBEGRIFF_ID_TYPE_CLASS__ZUSATZ_MOEGLICH);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(signalbegriff_ID_TypeClassEClass, Signalbegriff_ID_TypeClass.class, "Signalbegriff_ID_TypeClass", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignalbegriff_ID_TypeClass_Symbol(), theXMLTypePackage.getString(), "symbol", null, 0, 1, Signalbegriff_ID_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignalbegriff_ID_TypeClass_Anmerkungen(), theXMLTypePackage.getString(), "anmerkungen", null, 0, 1, Signalbegriff_ID_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignalbegriff_ID_TypeClass_Beleuchtbar(), theXMLTypePackage.getBoolean(), "beleuchtbar", null, 0, 1, Signalbegriff_ID_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignalbegriff_ID_TypeClass_Beschreibung(), theXMLTypePackage.getString(), "beschreibung", null, 0, 1, Signalbegriff_ID_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignalbegriff_ID_TypeClass_GeltungsbereichDS(), theXMLTypePackage.getBoolean(), "geltungsbereichDS", null, 0, 1, Signalbegriff_ID_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignalbegriff_ID_TypeClass_GeltungsbereichDV(), theXMLTypePackage.getBoolean(), "geltungsbereichDV", null, 0, 1, Signalbegriff_ID_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignalbegriff_ID_TypeClass_GeltungsbereichSBahnB(), theXMLTypePackage.getBoolean(), "geltungsbereichSBahnB", null, 0, 1, Signalbegriff_ID_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignalbegriff_ID_TypeClass_GeltungsbereichSBahnHH(), theXMLTypePackage.getBoolean(), "geltungsbereichSBahnHH", null, 0, 1, Signalbegriff_ID_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignalbegriff_ID_TypeClass_GueltigAb(), theXMLTypePackage.getDate(), "gueltigAb", null, 0, 1, Signalbegriff_ID_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignalbegriff_ID_TypeClass_GueltigBis(), theXMLTypePackage.getDate(), "gueltigBis", null, 0, 1, Signalbegriff_ID_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignalbegriff_ID_TypeClass_KurzbezeichnungDS(), theXMLTypePackage.getString(), "kurzbezeichnungDS", null, 0, 1, Signalbegriff_ID_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignalbegriff_ID_TypeClass_KurzbezeichnungDV(), theXMLTypePackage.getString(), "kurzbezeichnungDV", null, 0, 1, Signalbegriff_ID_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignalbegriff_ID_TypeClass_Langbezeichnung(), theXMLTypePackage.getString(), "langbezeichnung", null, 0, 1, Signalbegriff_ID_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignalbegriff_ID_TypeClass_Schaltbar(), theXMLTypePackage.getBoolean(), "schaltbar", null, 0, 1, Signalbegriff_ID_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSignalbegriff_ID_TypeClass_ZusatzMoeglich(), theXMLTypePackage.getBoolean(), "zusatzMoeglich", null, 0, 1, Signalbegriff_ID_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// null
		createNullAnnotations();
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
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
			   "documentation", "Dieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface."
		   });
		addAnnotation
		  (signalbegriff_ID_TypeClassEClass,
		   source,
		   new String[] {
			   "documentation", "Signalbegriff gem\u00e4\u00df Ril 301 (Signalbuch).\n\nF\u00fcr jeden Signalbegriff wird eine eigene Instanz des Objektes angelegt. Die Attribute \\\"Kurzbezeichnung_DS\\\", \\\"Kurzbezeichnung_DV\\\", \\\"Langbezeichnung\\\", \\\"Beschreibung\\\", \\\"Geltungsbereich_DS\\\", \\\"Geltungsbereich_DV\\\",\\\"Geltungsbereich_SBahn_Berlin\\\", \\\"Geltungsbereich_SBahn_Hamburg\\\" sowie \\\"Gueltig_Ab\\\", \\\"Gueltig_Bis\\\", \\\"Beleuchtbar\\\", \\\"Schaltbar\\\", \\\"Zusatz_Moeglich\\\" und \\\"Anmerkungen\\\" sind dabei modellseitig fixierte Eigenschaften. Mittels des Attributs \\\"Symbol\\\" k\u00f6nnen planungsseitig in einigen F\u00e4llen Wertangaben erfolgen.\n\nSonstige w\u00e4hlbare Eigenschaften des Signals sind im Objekt Signal Signalbegriff enthalten.\n\nDie Struktur der Signalbegriffsmodellierung (Anzahl und Auspr\u00e4gung der Attribute) und die Inhalte (konkrete Signalbegriffe) sind in zwei getrennten XSD-Dateien enthalten, um sp\u00e4ter eine separate Bearbeitung zu erm\u00f6glichen: \n\u2022 Signalbegriffe_Struktur.xsd, \n\u2022 Signalbegriffe_Ril_301.xsd. \n\nWeitere Erl\u00e4uterungen hierzu siehe Media:2013-10-08 Einfuehrung Komponenten XSD.pdf.\n\nDas nachfolgende Beispiel zeigt auszugsweise die Abbildung des Signalbegriffs \\\"Zs 3\\\" mit Symbol \\\"6\\\". Der Bezug zur Signalbegriffsinhalts-XSD wird durch die erweiterte Angabe der Signalbegriff ID hergestellt.\n<Signal_Signalbegriff>\n  <Signalbegriff_ID xsi:type=\\\"ril301:Zs_3\\\">\n   <Symbol>6</Symbol> \n  </Signalbegriff_ID>\n</Signal_Signalbegriff>\n\nEin vollst\u00e4ndige XML-Datei mit drei verschiedenen Signalbegriffen finden Sie hier: Media:adorf.xml.\n\nInnerhalb einer ESTW Zentraleinheit gilt immer nur eine Version des Signalbuchs und somit der Signalbegriffsinhalts-XSD. \n\nDB-Regelwerk\n\u2022 Ril 301 (Signalbuch)\n\nDB-Regelwerk\n\u2022 Ril 301 (Signalbuch) \n"
		   });
		addAnnotation
		  (getSignalbegriff_ID_TypeClass_Symbol(),
		   source,
		   new String[] {
			   "documentation", "Bedeutung 1: Anzuzeigendes Symbol des Signalbegriffs. \n\nDas Signalbuch (Ril 301) schr\u00e4nkt nicht in allen F\u00e4llen den Wertevorrat ausreichend ein, sodass direkt ENUM-Werte abgeleitet werden k\u00f6nnen. Eine Angabe als Text ist jedoch ebenfalls nicht zielf\u00fchrend. Die ENUM-Werte wurden daher unter Ber\u00fccksichtigung der Vorgaben der Ril 301 nach ingenieurm\u00e4\u00dfigem Ermessen festgelegt, sodass alle denkbaren Konstellationen abbildbar sind.\n\nBedeutung 2: Zusatzangabe bzw. Aufschrift eines Zusatzschildes.\n\nIm Fall des Signalbegriffs "
		   });
		addAnnotation
		  (getSignalbegriff_ID_TypeClass_Anmerkungen(),
		   source,
		   new String[] {
			   "documentation", "Beschreibung von Besonderheiten des Signalbegriffs gem\u00e4\u00df Ril 301 (Signalbuch). Das Attribut ist nicht durch den Planer ver\u00e4nderbar.\n"
		   });
		addAnnotation
		  (getSignalbegriff_ID_TypeClass_Beleuchtbar(),
		   source,
		   new String[] {
			   "documentation", "Angabe, ob der Signalbegriff gem\u00e4\u00df Ril 301 (Signalbuch) prinzipiell beleuchtbar ist. \n\nEin positiver Eintrag erfolgt auch dann, wenn ein Signalbegriff nur in einer Ausf\u00fchrungsform (Lichtsignal, Formsignal etc.) die entsprechende Eigenschaft besitzt. Ob der Signalbegriff tats\u00e4chlich beleuchtet werden soll, ist im Objekt Signal Signalbegriff im Attribut Beleuchtet hinterlegt. \n\nWertzuordnung: \n\u2022 true - Signalbegriff ist beleuchtbar, \n\u2022 false - Signalbegriff ist nicht beleuchtbar. \n\nDas Attribut ist nicht durch den Planer ver\u00e4nderbar.\n\nBesonderheiten:\n\nLf 1: Das Nachtzeichen wird im LST-Datenmodell nicht ber\u00fccksichtigt, da es kein Bestandteil der AP PT 1 ist.\n\nSh 1: Beleuchtete Formsignale Sh 1 werden aufgrund der geringen Auftrittswahrscheinlichkeit im Vergleich zum Lichtsignal nicht ber\u00fccksichtigt. Die Planung muss ggf. \u00fcber einen Bearbeitungsvermerk erfolgen.\n\nSh 2 (Sh_2): Beleuchtbar == "
		   });
		addAnnotation
		  (getSignalbegriff_ID_TypeClass_Beschreibung(),
		   source,
		   new String[] {
			   "documentation", "Erscheinungsbild des Signalbegriffs gem\u00e4\u00df Ril 301 (Signalbuch). Das Attribut ist nicht durch den Planer ver\u00e4nderbar."
		   });
		addAnnotation
		  (getSignalbegriff_ID_TypeClass_GeltungsbereichDS(),
		   source,
		   new String[] {
			   "documentation", "Angabe, ob der Signalbegriff gem\u00e4\u00df Ril 301 (Signalbuch) im Geltungsbereich DS g\u00fcltig ist (true) oder nicht (false). Das Attribut ist nicht durch den Planer ver\u00e4nderbar."
		   });
		addAnnotation
		  (getSignalbegriff_ID_TypeClass_GeltungsbereichDV(),
		   source,
		   new String[] {
			   "documentation", "Angabe, ob der Signalbegriff gem\u00e4\u00df Ril 301 (Signalbuch) im Geltungsbereich DV g\u00fcltig ist (true) oder nicht (false). Das Attribut ist nicht durch den Planer ver\u00e4nderbar."
		   });
		addAnnotation
		  (getSignalbegriff_ID_TypeClass_GeltungsbereichSBahnB(),
		   source,
		   new String[] {
			   "documentation", "Angabe, ob der Signalbegriff gem\u00e4\u00df Ril 301 (Signalbuch) im Geltungsbereich der S-Bahn Berlin g\u00fcltig ist (true) oder nicht (false). Das Attribut ist nicht durch den Planer ver\u00e4nderbar."
		   });
		addAnnotation
		  (getSignalbegriff_ID_TypeClass_GeltungsbereichSBahnHH(),
		   source,
		   new String[] {
			   "documentation", "Angabe, ob der Signalbegriff gem\u00e4\u00df Ril 301 (Signalbuch) im Geltungsbereich der S-Bahn Hamburg g\u00fcltig ist (true) oder nicht (false). Das Attribut ist nicht durch den Planer ver\u00e4nderbar."
		   });
		addAnnotation
		  (getSignalbegriff_ID_TypeClass_GueltigAb(),
		   source,
		   new String[] {
			   "documentation", "Zeitlicher Beginn der G\u00fcltigkeit eines Signalbegriffs gem\u00e4\u00df Ril 301 (Signalbuch). Das Attribut ist nicht durch den Planer ver\u00e4nderbar."
		   });
		addAnnotation
		  (getSignalbegriff_ID_TypeClass_GueltigBis(),
		   source,
		   new String[] {
			   "documentation", "Zeitliches Ende der G\u00fcltigkeit eines Signalbegriffs gem\u00e4\u00df Ril 301 (Signalbuch). Das Attribut ist nicht durch den Planer ver\u00e4nderbar."
		   });
		addAnnotation
		  (getSignalbegriff_ID_TypeClass_KurzbezeichnungDS(),
		   source,
		   new String[] {
			   "documentation", "Kurzbezeichnung des Signalbegriffs gem\u00e4\u00df Ril 301 (Signalbuch) im Geltungsbereich DS. Das Attribut ist nicht durch den Planer ver\u00e4nderbar."
		   });
		addAnnotation
		  (getSignalbegriff_ID_TypeClass_KurzbezeichnungDV(),
		   source,
		   new String[] {
			   "documentation", "Kurzbezeichnung des Signalbegriffs gem\u00e4\u00df Ril 301 (Signalbuch) im Geltungsbereich DV. Das Attribut ist nicht durch den Planer ver\u00e4nderbar."
		   });
		addAnnotation
		  (getSignalbegriff_ID_TypeClass_Langbezeichnung(),
		   source,
		   new String[] {
			   "documentation", "Langbezeichnung des Signalbegriffs gem\u00e4\u00df Ril 301 (Signalbuch). Das Attribut ist nicht durch den Planer ver\u00e4nderbar."
		   });
		addAnnotation
		  (getSignalbegriff_ID_TypeClass_Schaltbar(),
		   source,
		   new String[] {
			   "documentation", "Angabe, ob der Signalbegriff gem\u00e4\u00df Ril 301 (Signalbuch) prinzipiell schaltbar ist.\n\nEin positiver Eintrag erfolgt auch dann, wenn ein Signalbegriff nur in einer Ausf\u00fchrungsform (Lichtsignal, Formsignal etc.) die entsprechende Eigenschaft besitzt. \n\nNicht schaltbar sind demnach z. B. \n\u2022 Mastschilder oder \n\u2022 Zs 3-Formsignale (auch wenn sie in bestimmten Kombinationen nicht gelten - hier fehlt die aktive Handlung). \n\nOb der Signalbegriff tats\u00e4chlich geschaltet werden soll, ist im Objekt Signal Signalbegriff im Attribut Geschaltet hinterlegt. \n\nWertzuordnung: \n\u2022 true - Signalbegriff ist schaltbar, \n\u2022 false - Signalbegriff ist nicht schaltbar. \n\nDas Attribut ist nicht durch den Planer ver\u00e4nderbar.\n"
		   });
		addAnnotation
		  (getSignalbegriff_ID_TypeClass_ZusatzMoeglich(),
		   source,
		   new String[] {
			   "documentation", "Angabe, ob f\u00fcr den Signalbegriff gem\u00e4\u00df Ril 301 (Signalbuch) eine Zusatzinformation bzw. ein Zusatzschild m\u00f6glich ist (true) oder nicht (false). Das Attribut ist nicht durch den Planer ver\u00e4nderbar."
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
		  (signalbegriff_ID_TypeClassEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                \n  </ppi:WorkflowInformation>\n           \n"
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
		  (signalbegriff_ID_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCSignalbegriff_ID",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSignalbegriff_ID_TypeClass_Symbol(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Symbol"
		   });
		addAnnotation
		  (getSignalbegriff_ID_TypeClass_Anmerkungen(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Anmerkungen"
		   });
		addAnnotation
		  (getSignalbegriff_ID_TypeClass_Beleuchtbar(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Beleuchtbar"
		   });
		addAnnotation
		  (getSignalbegriff_ID_TypeClass_Beschreibung(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Beschreibung"
		   });
		addAnnotation
		  (getSignalbegriff_ID_TypeClass_GeltungsbereichDS(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Geltungsbereich_DS"
		   });
		addAnnotation
		  (getSignalbegriff_ID_TypeClass_GeltungsbereichDV(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Geltungsbereich_DV"
		   });
		addAnnotation
		  (getSignalbegriff_ID_TypeClass_GeltungsbereichSBahnB(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Geltungsbereich_SBahn_B"
		   });
		addAnnotation
		  (getSignalbegriff_ID_TypeClass_GeltungsbereichSBahnHH(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Geltungsbereich_SBahn_HH"
		   });
		addAnnotation
		  (getSignalbegriff_ID_TypeClass_GueltigAb(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Gueltig_Ab"
		   });
		addAnnotation
		  (getSignalbegriff_ID_TypeClass_GueltigBis(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Gueltig_Bis"
		   });
		addAnnotation
		  (getSignalbegriff_ID_TypeClass_KurzbezeichnungDS(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Kurzbezeichnung_DS"
		   });
		addAnnotation
		  (getSignalbegriff_ID_TypeClass_KurzbezeichnungDV(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Kurzbezeichnung_DV"
		   });
		addAnnotation
		  (getSignalbegriff_ID_TypeClass_Langbezeichnung(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Langbezeichnung"
		   });
		addAnnotation
		  (getSignalbegriff_ID_TypeClass_Schaltbar(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Schaltbar"
		   });
		addAnnotation
		  (getSignalbegriff_ID_TypeClass_ZusatzMoeglich(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "Zusatz_Moeglich"
		   });
	}

} //Signalbegriffe_StrukturPackageImpl
