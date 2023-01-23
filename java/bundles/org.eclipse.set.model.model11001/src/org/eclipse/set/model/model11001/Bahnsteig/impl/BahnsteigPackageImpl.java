/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Bahnsteig.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.set.model.model11001.ATO.ATOPackage;

import org.eclipse.set.model.model11001.ATO.impl.ATOPackageImpl;

import org.eclipse.set.model.model11001.Ansteuerung_Element.Ansteuerung_ElementPackage;

import org.eclipse.set.model.model11001.Ansteuerung_Element.impl.Ansteuerung_ElementPackageImpl;

import org.eclipse.set.model.model11001.Bahnsteig.BahnsteigFactory;
import org.eclipse.set.model.model11001.Bahnsteig.BahnsteigPackage;
import org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Anlage;
import org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Anlage_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Dach;
import org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Kante;
import org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Kante_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Kante_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Zugang;
import org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Zugang_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Bahnsteig.Bahnsteig_Zugang_Art_TypeClass;
import org.eclipse.set.model.model11001.Bahnsteig.Bezeichnung_Bahnsteig_Anlage_TypeClass;
import org.eclipse.set.model.model11001.Bahnsteig.Bezeichnung_Bahnsteig_Kante_TypeClass;
import org.eclipse.set.model.model11001.Bahnsteig.ENUMBahnsteigZugangArt;
import org.eclipse.set.model.model11001.Bahnsteig.ENUMSystemhoehe;
import org.eclipse.set.model.model11001.Bahnsteig.Hauptzugang_TypeClass;
import org.eclipse.set.model.model11001.Bahnsteig.Lage_Zum_Gleis_TypeClass;
import org.eclipse.set.model.model11001.Bahnsteig.Systemhoehe_TypeClass;

import org.eclipse.set.model.model11001.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.model.model11001.Bahnuebergang.impl.BahnuebergangPackageImpl;

import org.eclipse.set.model.model11001.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;

import org.eclipse.set.model.model11001.Balisentechnik_ETCS.impl.Balisentechnik_ETCSPackageImpl;

import org.eclipse.set.model.model11001.BasisTypen.BasisTypenPackage;
import org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts;

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
public class BahnsteigPackageImpl extends EPackageImpl implements BahnsteigPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bahnsteig_AnlageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bahnsteig_Anlage_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bahnsteig_DachEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bahnsteig_KanteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bahnsteig_Kante_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bahnsteig_Kante_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bahnsteig_ZugangEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bahnsteig_Zugang_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bahnsteig_Zugang_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_Bahnsteig_Anlage_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_Bahnsteig_Kante_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hauptzugang_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lage_Zum_Gleis_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemhoehe_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumBahnsteigZugangArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumSystemhoeheEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_Bahnsteig_Anlage_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_Bahnsteig_Kante_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumBahnsteigZugangArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumSystemhoeheObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hauptzugang_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hauptzugang_TypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lage_Zum_Gleis_TypeEDataType = null;

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
	 * @see org.eclipse.set.model.model11001.Bahnsteig.BahnsteigPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BahnsteigPackageImpl() {
		super(eNS_URI, BahnsteigFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BahnsteigPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BahnsteigPackage init() {
		if (isInited) return (BahnsteigPackage)EPackage.Registry.INSTANCE.getEPackage(BahnsteigPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBahnsteigPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BahnsteigPackageImpl theBahnsteigPackage = registeredBahnsteigPackage instanceof BahnsteigPackageImpl ? (BahnsteigPackageImpl)registeredBahnsteigPackage : new BahnsteigPackageImpl();

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

		// Load packages
		thePlanProPackage.loadPackage();
		theBalisentechnik_ETCSPackage.loadPackage();
		theBahnuebergangPackage.loadPackage();
		theSignalbegriffe_Ril_301Package.loadPackage();

		// Create package meta-data objects
		theBahnsteigPackage.createPackageContents();
		theBasisobjektePackage.createPackageContents();
		theBasisTypenPackage.createPackageContents();
		theATOPackage.createPackageContents();
		theVerweisePackage.createPackageContents();
		theAnsteuerung_ElementPackage.createPackageContents();
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

		// Initialize created meta-data
		theBahnsteigPackage.initializePackageContents();
		theBasisobjektePackage.initializePackageContents();
		theBasisTypenPackage.initializePackageContents();
		theATOPackage.initializePackageContents();
		theVerweisePackage.initializePackageContents();
		theAnsteuerung_ElementPackage.initializePackageContents();
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

		// Fix loaded packages
		thePlanProPackage.fixPackageContents();
		theBalisentechnik_ETCSPackage.fixPackageContents();
		theBahnuebergangPackage.fixPackageContents();
		theSignalbegriffe_Ril_301Package.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theBahnsteigPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BahnsteigPackage.eNS_URI, theBahnsteigPackage);
		return theBahnsteigPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBahnsteig_Anlage() {
		return bahnsteig_AnlageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBahnsteig_Anlage_Bezeichnung() {
		return (EReference)bahnsteig_AnlageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBahnsteig_Anlage_Bezeichnung_AttributeGroup() {
		return bahnsteig_Anlage_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBahnsteig_Anlage_Bezeichnung_AttributeGroup_BezeichnungBahnsteigAnlage() {
		return (EReference)bahnsteig_Anlage_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBahnsteig_Dach() {
		return bahnsteig_DachEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBahnsteig_Dach_IDBahnsteigKante() {
		return (EReference)bahnsteig_DachEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBahnsteig_Kante() {
		return bahnsteig_KanteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBahnsteig_Kante_BahnsteigKanteAllg() {
		return (EReference)bahnsteig_KanteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBahnsteig_Kante_Bezeichnung() {
		return (EReference)bahnsteig_KanteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBahnsteig_Kante_IDBahnsteigAnlage() {
		return (EReference)bahnsteig_KanteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBahnsteig_Kante_Allg_AttributeGroup() {
		return bahnsteig_Kante_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBahnsteig_Kante_Allg_AttributeGroup_LageZumGleis() {
		return (EReference)bahnsteig_Kante_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBahnsteig_Kante_Allg_AttributeGroup_Systemhoehe() {
		return (EReference)bahnsteig_Kante_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBahnsteig_Kante_Bezeichnung_AttributeGroup() {
		return bahnsteig_Kante_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBahnsteig_Kante_Bezeichnung_AttributeGroup_BezeichnungBahnsteigKante() {
		return (EReference)bahnsteig_Kante_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBahnsteig_Zugang() {
		return bahnsteig_ZugangEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBahnsteig_Zugang_BahnsteigZugangAllg() {
		return (EReference)bahnsteig_ZugangEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBahnsteig_Zugang_IDBahnsteigAnlage() {
		return (EReference)bahnsteig_ZugangEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBahnsteig_Zugang_Allg_AttributeGroup() {
		return bahnsteig_Zugang_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBahnsteig_Zugang_Allg_AttributeGroup_BahnsteigZugangArt() {
		return (EReference)bahnsteig_Zugang_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBahnsteig_Zugang_Allg_AttributeGroup_Hauptzugang() {
		return (EReference)bahnsteig_Zugang_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBahnsteig_Zugang_Art_TypeClass() {
		return bahnsteig_Zugang_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBahnsteig_Zugang_Art_TypeClass_Wert() {
		return (EAttribute)bahnsteig_Zugang_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_Bahnsteig_Anlage_TypeClass() {
		return bezeichnung_Bahnsteig_Anlage_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_Bahnsteig_Anlage_TypeClass_Wert() {
		return (EAttribute)bezeichnung_Bahnsteig_Anlage_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_Bahnsteig_Kante_TypeClass() {
		return bezeichnung_Bahnsteig_Kante_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_Bahnsteig_Kante_TypeClass_Wert() {
		return (EAttribute)bezeichnung_Bahnsteig_Kante_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHauptzugang_TypeClass() {
		return hauptzugang_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHauptzugang_TypeClass_Wert() {
		return (EAttribute)hauptzugang_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLage_Zum_Gleis_TypeClass() {
		return lage_Zum_Gleis_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLage_Zum_Gleis_TypeClass_Wert() {
		return (EAttribute)lage_Zum_Gleis_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemhoehe_TypeClass() {
		return systemhoehe_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemhoehe_TypeClass_Wert() {
		return (EAttribute)systemhoehe_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMBahnsteigZugangArt() {
		return enumBahnsteigZugangArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMSystemhoehe() {
		return enumSystemhoeheEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_Bahnsteig_Anlage_Type() {
		return bezeichnung_Bahnsteig_Anlage_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_Bahnsteig_Kante_Type() {
		return bezeichnung_Bahnsteig_Kante_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMBahnsteigZugangArtObject() {
		return enumBahnsteigZugangArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMSystemhoeheObject() {
		return enumSystemhoeheObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getHauptzugang_Type() {
		return hauptzugang_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getHauptzugang_TypeObject() {
		return hauptzugang_TypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLage_Zum_Gleis_Type() {
		return lage_Zum_Gleis_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BahnsteigFactory getBahnsteigFactory() {
		return (BahnsteigFactory)getEFactoryInstance();
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
		bahnsteig_AnlageEClass = createEClass(BAHNSTEIG_ANLAGE);
		createEReference(bahnsteig_AnlageEClass, BAHNSTEIG_ANLAGE__BEZEICHNUNG);

		bahnsteig_Anlage_Bezeichnung_AttributeGroupEClass = createEClass(BAHNSTEIG_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP);
		createEReference(bahnsteig_Anlage_Bezeichnung_AttributeGroupEClass, BAHNSTEIG_ANLAGE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BAHNSTEIG_ANLAGE);

		bahnsteig_DachEClass = createEClass(BAHNSTEIG_DACH);
		createEReference(bahnsteig_DachEClass, BAHNSTEIG_DACH__ID_BAHNSTEIG_KANTE);

		bahnsteig_KanteEClass = createEClass(BAHNSTEIG_KANTE);
		createEReference(bahnsteig_KanteEClass, BAHNSTEIG_KANTE__BAHNSTEIG_KANTE_ALLG);
		createEReference(bahnsteig_KanteEClass, BAHNSTEIG_KANTE__BEZEICHNUNG);
		createEReference(bahnsteig_KanteEClass, BAHNSTEIG_KANTE__ID_BAHNSTEIG_ANLAGE);

		bahnsteig_Kante_Allg_AttributeGroupEClass = createEClass(BAHNSTEIG_KANTE_ALLG_ATTRIBUTE_GROUP);
		createEReference(bahnsteig_Kante_Allg_AttributeGroupEClass, BAHNSTEIG_KANTE_ALLG_ATTRIBUTE_GROUP__LAGE_ZUM_GLEIS);
		createEReference(bahnsteig_Kante_Allg_AttributeGroupEClass, BAHNSTEIG_KANTE_ALLG_ATTRIBUTE_GROUP__SYSTEMHOEHE);

		bahnsteig_Kante_Bezeichnung_AttributeGroupEClass = createEClass(BAHNSTEIG_KANTE_BEZEICHNUNG_ATTRIBUTE_GROUP);
		createEReference(bahnsteig_Kante_Bezeichnung_AttributeGroupEClass, BAHNSTEIG_KANTE_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_BAHNSTEIG_KANTE);

		bahnsteig_ZugangEClass = createEClass(BAHNSTEIG_ZUGANG);
		createEReference(bahnsteig_ZugangEClass, BAHNSTEIG_ZUGANG__BAHNSTEIG_ZUGANG_ALLG);
		createEReference(bahnsteig_ZugangEClass, BAHNSTEIG_ZUGANG__ID_BAHNSTEIG_ANLAGE);

		bahnsteig_Zugang_Allg_AttributeGroupEClass = createEClass(BAHNSTEIG_ZUGANG_ALLG_ATTRIBUTE_GROUP);
		createEReference(bahnsteig_Zugang_Allg_AttributeGroupEClass, BAHNSTEIG_ZUGANG_ALLG_ATTRIBUTE_GROUP__BAHNSTEIG_ZUGANG_ART);
		createEReference(bahnsteig_Zugang_Allg_AttributeGroupEClass, BAHNSTEIG_ZUGANG_ALLG_ATTRIBUTE_GROUP__HAUPTZUGANG);

		bahnsteig_Zugang_Art_TypeClassEClass = createEClass(BAHNSTEIG_ZUGANG_ART_TYPE_CLASS);
		createEAttribute(bahnsteig_Zugang_Art_TypeClassEClass, BAHNSTEIG_ZUGANG_ART_TYPE_CLASS__WERT);

		bezeichnung_Bahnsteig_Anlage_TypeClassEClass = createEClass(BEZEICHNUNG_BAHNSTEIG_ANLAGE_TYPE_CLASS);
		createEAttribute(bezeichnung_Bahnsteig_Anlage_TypeClassEClass, BEZEICHNUNG_BAHNSTEIG_ANLAGE_TYPE_CLASS__WERT);

		bezeichnung_Bahnsteig_Kante_TypeClassEClass = createEClass(BEZEICHNUNG_BAHNSTEIG_KANTE_TYPE_CLASS);
		createEAttribute(bezeichnung_Bahnsteig_Kante_TypeClassEClass, BEZEICHNUNG_BAHNSTEIG_KANTE_TYPE_CLASS__WERT);

		hauptzugang_TypeClassEClass = createEClass(HAUPTZUGANG_TYPE_CLASS);
		createEAttribute(hauptzugang_TypeClassEClass, HAUPTZUGANG_TYPE_CLASS__WERT);

		lage_Zum_Gleis_TypeClassEClass = createEClass(LAGE_ZUM_GLEIS_TYPE_CLASS);
		createEAttribute(lage_Zum_Gleis_TypeClassEClass, LAGE_ZUM_GLEIS_TYPE_CLASS__WERT);

		systemhoehe_TypeClassEClass = createEClass(SYSTEMHOEHE_TYPE_CLASS);
		createEAttribute(systemhoehe_TypeClassEClass, SYSTEMHOEHE_TYPE_CLASS__WERT);

		// Create enums
		enumBahnsteigZugangArtEEnum = createEEnum(ENUM_BAHNSTEIG_ZUGANG_ART);
		enumSystemhoeheEEnum = createEEnum(ENUM_SYSTEMHOEHE);

		// Create data types
		bezeichnung_Bahnsteig_Anlage_TypeEDataType = createEDataType(BEZEICHNUNG_BAHNSTEIG_ANLAGE_TYPE);
		bezeichnung_Bahnsteig_Kante_TypeEDataType = createEDataType(BEZEICHNUNG_BAHNSTEIG_KANTE_TYPE);
		enumBahnsteigZugangArtObjectEDataType = createEDataType(ENUM_BAHNSTEIG_ZUGANG_ART_OBJECT);
		enumSystemhoeheObjectEDataType = createEDataType(ENUM_SYSTEMHOEHE_OBJECT);
		hauptzugang_TypeEDataType = createEDataType(HAUPTZUGANG_TYPE);
		hauptzugang_TypeObjectEDataType = createEDataType(HAUPTZUGANG_TYPE_OBJECT);
		lage_Zum_Gleis_TypeEDataType = createEDataType(LAGE_ZUM_GLEIS_TYPE);
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
		BasisobjektePackage theBasisobjektePackage = (BasisobjektePackage)EPackage.Registry.INSTANCE.getEPackage(BasisobjektePackage.eNS_URI);
		VerweisePackage theVerweisePackage = (VerweisePackage)EPackage.Registry.INSTANCE.getEPackage(VerweisePackage.eNS_URI);
		BasisTypenPackage theBasisTypenPackage = (BasisTypenPackage)EPackage.Registry.INSTANCE.getEPackage(BasisTypenPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bahnsteig_AnlageEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		bahnsteig_DachEClass.getESuperTypes().add(theBasisobjektePackage.getBereich_Objekt());
		bahnsteig_KanteEClass.getESuperTypes().add(theBasisobjektePackage.getBereich_Objekt());
		bahnsteig_ZugangEClass.getESuperTypes().add(theBasisobjektePackage.getPunkt_Objekt());
		bahnsteig_Zugang_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bezeichnung_Bahnsteig_Anlage_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bezeichnung_Bahnsteig_Kante_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		hauptzugang_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		lage_Zum_Gleis_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		systemhoehe_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());

		// Initialize classes and features; add operations and parameters
		initEClass(bahnsteig_AnlageEClass, Bahnsteig_Anlage.class, "Bahnsteig_Anlage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBahnsteig_Anlage_Bezeichnung(), this.getBahnsteig_Anlage_Bezeichnung_AttributeGroup(), null, "bezeichnung", null, 0, 1, Bahnsteig_Anlage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bahnsteig_Anlage_Bezeichnung_AttributeGroupEClass, Bahnsteig_Anlage_Bezeichnung_AttributeGroup.class, "Bahnsteig_Anlage_Bezeichnung_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBahnsteig_Anlage_Bezeichnung_AttributeGroup_BezeichnungBahnsteigAnlage(), this.getBezeichnung_Bahnsteig_Anlage_TypeClass(), null, "bezeichnungBahnsteigAnlage", null, 1, 1, Bahnsteig_Anlage_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bahnsteig_DachEClass, Bahnsteig_Dach.class, "Bahnsteig_Dach", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBahnsteig_Dach_IDBahnsteigKante(), theVerweisePackage.getID_Bahnsteig_Kante_ohne_Proxy_TypeClass(), null, "iDBahnsteigKante", null, 1, 1, Bahnsteig_Dach.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bahnsteig_KanteEClass, Bahnsteig_Kante.class, "Bahnsteig_Kante", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBahnsteig_Kante_BahnsteigKanteAllg(), this.getBahnsteig_Kante_Allg_AttributeGroup(), null, "bahnsteigKanteAllg", null, 1, 1, Bahnsteig_Kante.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBahnsteig_Kante_Bezeichnung(), this.getBahnsteig_Kante_Bezeichnung_AttributeGroup(), null, "bezeichnung", null, 1, 1, Bahnsteig_Kante.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBahnsteig_Kante_IDBahnsteigAnlage(), theVerweisePackage.getID_Bahnsteig_Anlage_TypeClass(), null, "iDBahnsteigAnlage", null, 1, 1, Bahnsteig_Kante.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bahnsteig_Kante_Allg_AttributeGroupEClass, Bahnsteig_Kante_Allg_AttributeGroup.class, "Bahnsteig_Kante_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBahnsteig_Kante_Allg_AttributeGroup_LageZumGleis(), this.getLage_Zum_Gleis_TypeClass(), null, "lageZumGleis", null, 1, 1, Bahnsteig_Kante_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBahnsteig_Kante_Allg_AttributeGroup_Systemhoehe(), this.getSystemhoehe_TypeClass(), null, "systemhoehe", null, 0, 1, Bahnsteig_Kante_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bahnsteig_Kante_Bezeichnung_AttributeGroupEClass, Bahnsteig_Kante_Bezeichnung_AttributeGroup.class, "Bahnsteig_Kante_Bezeichnung_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBahnsteig_Kante_Bezeichnung_AttributeGroup_BezeichnungBahnsteigKante(), this.getBezeichnung_Bahnsteig_Kante_TypeClass(), null, "bezeichnungBahnsteigKante", null, 1, 1, Bahnsteig_Kante_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bahnsteig_ZugangEClass, Bahnsteig_Zugang.class, "Bahnsteig_Zugang", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBahnsteig_Zugang_BahnsteigZugangAllg(), this.getBahnsteig_Zugang_Allg_AttributeGroup(), null, "bahnsteigZugangAllg", null, 1, 1, Bahnsteig_Zugang.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBahnsteig_Zugang_IDBahnsteigAnlage(), theVerweisePackage.getID_Bahnsteig_Anlage_TypeClass(), null, "iDBahnsteigAnlage", null, 1, 1, Bahnsteig_Zugang.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bahnsteig_Zugang_Allg_AttributeGroupEClass, Bahnsteig_Zugang_Allg_AttributeGroup.class, "Bahnsteig_Zugang_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBahnsteig_Zugang_Allg_AttributeGroup_BahnsteigZugangArt(), this.getBahnsteig_Zugang_Art_TypeClass(), null, "bahnsteigZugangArt", null, 1, 1, Bahnsteig_Zugang_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBahnsteig_Zugang_Allg_AttributeGroup_Hauptzugang(), this.getHauptzugang_TypeClass(), null, "hauptzugang", null, 1, 1, Bahnsteig_Zugang_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bahnsteig_Zugang_Art_TypeClassEClass, Bahnsteig_Zugang_Art_TypeClass.class, "Bahnsteig_Zugang_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBahnsteig_Zugang_Art_TypeClass_Wert(), this.getENUMBahnsteigZugangArtObject(), "wert", null, 1, 1, Bahnsteig_Zugang_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bezeichnung_Bahnsteig_Anlage_TypeClassEClass, Bezeichnung_Bahnsteig_Anlage_TypeClass.class, "Bezeichnung_Bahnsteig_Anlage_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBezeichnung_Bahnsteig_Anlage_TypeClass_Wert(), this.getBezeichnung_Bahnsteig_Anlage_Type(), "wert", null, 1, 1, Bezeichnung_Bahnsteig_Anlage_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bezeichnung_Bahnsteig_Kante_TypeClassEClass, Bezeichnung_Bahnsteig_Kante_TypeClass.class, "Bezeichnung_Bahnsteig_Kante_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBezeichnung_Bahnsteig_Kante_TypeClass_Wert(), this.getBezeichnung_Bahnsteig_Kante_Type(), "wert", null, 1, 1, Bezeichnung_Bahnsteig_Kante_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hauptzugang_TypeClassEClass, Hauptzugang_TypeClass.class, "Hauptzugang_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHauptzugang_TypeClass_Wert(), this.getHauptzugang_TypeObject(), "wert", null, 1, 1, Hauptzugang_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lage_Zum_Gleis_TypeClassEClass, Lage_Zum_Gleis_TypeClass.class, "Lage_Zum_Gleis_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLage_Zum_Gleis_TypeClass_Wert(), this.getLage_Zum_Gleis_Type(), "wert", null, 1, 1, Lage_Zum_Gleis_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemhoehe_TypeClassEClass, Systemhoehe_TypeClass.class, "Systemhoehe_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemhoehe_TypeClass_Wert(), this.getENUMSystemhoeheObject(), "wert", null, 1, 1, Systemhoehe_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumBahnsteigZugangArtEEnum, ENUMBahnsteigZugangArt.class, "ENUMBahnsteigZugangArt");
		addEEnumLiteral(enumBahnsteigZugangArtEEnum, ENUMBahnsteigZugangArt.ENUM_BAHNSTEIG_ZUGANG_ART_AUFZUG);
		addEEnumLiteral(enumBahnsteigZugangArtEEnum, ENUMBahnsteigZugangArt.ENUM_BAHNSTEIG_ZUGANG_ART_EMPFANGSGEBÄUDE);
		addEEnumLiteral(enumBahnsteigZugangArtEEnum, ENUMBahnsteigZugangArt.ENUM_BAHNSTEIG_ZUGANG_ART_RAMPE);
		addEEnumLiteral(enumBahnsteigZugangArtEEnum, ENUMBahnsteigZugangArt.ENUM_BAHNSTEIG_ZUGANG_ART_SONSTIGE);
		addEEnumLiteral(enumBahnsteigZugangArtEEnum, ENUMBahnsteigZugangArt.ENUM_BAHNSTEIG_ZUGANG_ART_TREPPE);
		addEEnumLiteral(enumBahnsteigZugangArtEEnum, ENUMBahnsteigZugangArt.ENUM_BAHNSTEIG_ZUGANG_ART_TRESI);
		addEEnumLiteral(enumBahnsteigZugangArtEEnum, ENUMBahnsteigZugangArt.ENUM_BAHNSTEIG_ZUGANG_ART_WEG);

		initEEnum(enumSystemhoeheEEnum, ENUMSystemhoehe.class, "ENUMSystemhoehe");
		addEEnumLiteral(enumSystemhoeheEEnum, ENUMSystemhoehe.ENUM_SYSTEMHOEHE_38_CM);
		addEEnumLiteral(enumSystemhoeheEEnum, ENUMSystemhoehe.ENUM_SYSTEMHOEHE_55_CM);
		addEEnumLiteral(enumSystemhoeheEEnum, ENUMSystemhoehe.ENUM_SYSTEMHOEHE_76_CM);
		addEEnumLiteral(enumSystemhoeheEEnum, ENUMSystemhoehe.ENUM_SYSTEMHOEHE_96_CM);
		addEEnumLiteral(enumSystemhoeheEEnum, ENUMSystemhoehe.ENUM_SYSTEMHOEHE_SONSTIGE);

		// Initialize data types
		initEDataType(bezeichnung_Bahnsteig_Anlage_TypeEDataType, String.class, "Bezeichnung_Bahnsteig_Anlage_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bezeichnung_Bahnsteig_Kante_TypeEDataType, String.class, "Bezeichnung_Bahnsteig_Kante_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumBahnsteigZugangArtObjectEDataType, ENUMBahnsteigZugangArt.class, "ENUMBahnsteigZugangArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumSystemhoeheObjectEDataType, ENUMSystemhoehe.class, "ENUMSystemhoeheObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hauptzugang_TypeEDataType, boolean.class, "Hauptzugang_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hauptzugang_TypeObjectEDataType, Boolean.class, "Hauptzugang_TypeObject", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(lage_Zum_Gleis_TypeEDataType, ENUMLinksRechts.class, "Lage_Zum_Gleis_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
			   "documentation", "Dieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface."
		   });
		addAnnotation
		  (bahnsteig_AnlageEClass,
		   source,
		   new String[] {
			   "documentation", "Parallel zum Gleis gelegenes Element des Tiefbaus mit befestigter Oberfl\u00e4che zum Zwecke des Zugangs der Reisenden von bzw. zu den Z\u00fcgen. Ein Bahnsteig kann eine oder mehrere Bahnsteigkanten besitzen. Mehr als zwei Bahnsteigkanten k\u00f6nnen dazugeh\u00f6ren, wenn z. B. an einen Mittelbahnsteig noch ein Zungenbahnsteig anschlie\u00dft. DB-Regelwerk Ril 813.0201 "
		   });
		addAnnotation
		  (getBahnsteig_Anlage_Bezeichnung(),
		   source,
		   new String[] {
			   "documentation", "Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle \u00fcber Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht m\u00f6glich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es m\u00f6glich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und \u00dcbersichtsplan, B\u00dc-Lageplan Planungstabellen "
		   });
		addAnnotation
		  (getBahnsteig_Anlage_Bezeichnung_AttributeGroup_BezeichnungBahnsteigAnlage(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnung der Bahnsteig_Anlage. Die Bezeichnung des Bahnsteigs muss nicht vergeben werden. Meist setzt sie sich aus dem Namen der beteiligten Bahnsteigkanten (z. B. \\\"Bahnsteig 3/4\\\") zusammen, gelegentlich kann sie aber auch einen eigenen Namen bekommen (z. B. \\\"Bahnsteig A\\\" mit den Gleisen 102 und 103). Die folgende Grafik zeigt beispielhaft die Bezeichnung eines Mitelbahnsteigs mit anschlie\u00dfendem Zungenbahnsteig (zwei Bahnsteig-Anlagen mit jeweils zwei Bahnsteig-Kanten). "
		   });
		addAnnotation
		  (bahnsteig_DachEClass,
		   source,
		   new String[] {
			   "documentation", "Bahnsteigkanten-bezogene Abbildung der Bahnsteig-\u00dcberdachung. Die Angabe ist im INA-Erhebungsbogen erforderlich."
		   });
		addAnnotation
		  (getBahnsteig_Dach_IDBahnsteigKante(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die Bahnsteigkante, zu der die \u00dcberdachung geh\u00f6rt."
		   });
		addAnnotation
		  (bahnsteig_KanteEClass,
		   source,
		   new String[] {
			   "documentation", "Parallel zum Gleis verlaufende Kante eines Bahnsteigs, die f\u00fcr den Fahrgastwechsel nutzbar ist (Nettobaul\u00e4nge). F\u00fcr die LST-Planung sind Beginn und Ende z. B. f\u00fcr die Zugbeeinflussung (PZB 90) sowie die Festlegung von Signalstandorten und Gefahrpunkten ma\u00dfgebend. Die Nettobaul\u00e4nge der Bahnsteigkante wird im Datenmodell durch die L\u00e4nge des Bereichsobjekts Bahnsteig_Kante abgebildet. Eventuell daran anschlie\u00dfende Tiefbauobjekte (auch stillgelegte Bahnsteigbereiche) k\u00f6nnen als Ingenieurbauwerke (Technischer_Bereich) abgebildet werden. DB-Regelwerk Darstellung einer Doppellinie im sicherungstechnischen Lageplan, Ril 413.0507"
		   });
		addAnnotation
		  (getBahnsteig_Kante_Bezeichnung(),
		   source,
		   new String[] {
			   "documentation", "Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle \u00fcber Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht m\u00f6glich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es m\u00f6glich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und \u00dcbersichtsplan, B\u00dc-Lageplan Planungstabellen "
		   });
		addAnnotation
		  (getBahnsteig_Kante_IDBahnsteigAnlage(),
		   source,
		   new String[] {
			   "documentation", "Zuordnung einer Bahnsteigkante oder eines Bahnsteigzugangs zu einer Bahnsteiganlage. DB-Regelwerk Zusammenhang wird aus der Darstellung im sicherungstechnischen Lageplan ersichtlich"
		   });
		addAnnotation
		  (getBahnsteig_Kante_Allg_AttributeGroup_LageZumGleis(),
		   source,
		   new String[] {
			   "documentation", "Lage der Bahnsteig Kante zur Gleisachse bezogen auf die Richtung des Bereich Objekt. Siehe auch Modellierung Richtung. DB-Regelwerk Darstellung im sicherungstechnischen Lageplan"
		   });
		addAnnotation
		  (getBahnsteig_Kante_Allg_AttributeGroup_Systemhoehe(),
		   source,
		   new String[] {
			   "documentation", "H\u00f6he der Bahnsteigoberkante am Gleis, gemessen ab Schienenoberkante. Bahnsteige werden in folgenden Systemh\u00f6hen (in cm) errichtet: 38 cm: niedrigste zul\u00e4ssige H\u00f6he; 55 cm: Zwischenh\u00f6he; 76 cm: Regelh\u00f6he; 96 cm: gr\u00f6\u00dfte zul\u00e4ssige H\u00f6he (nur f\u00fcr ausschlie\u00dflich daf\u00fcr vorgesehene S-Bahnfahrzeuge); Sonderhoehe: Abweichende H\u00f6hen sind m\u00f6glich, vor allem \u00e4ltere Bahnsteigkanten k\u00f6nnen auch andere H\u00f6hen aufweisen. Bei Bahnsteigkanten mit mehreren H\u00f6hen wird die H\u00f6he angegeben, an der der Schwerpunkt des Reisendenzustiegs liegt. DB-Regelwerk Bestandteil der betrieblichen Aufgabenstellung, ggf. Erw\u00e4hnung im Erl\u00e4uterungsbericht"
		   });
		addAnnotation
		  (getBahnsteig_Kante_Bezeichnung_AttributeGroup_BezeichnungBahnsteigKante(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnung der Bahnsteig Kante. Die Bezeichnung der Bahnsteigkante ist f\u00fcr die LST-Planung relevant und muss vergeben werden. In verkehrlichen Unterlagen wird der Name unter \\\"Gleis\\\" bekanntgegeben, worauf im Datenmodell verzichtet wird, da hier \\\"Gleis\\\" im betrieblichen Sinne verwendet wird. Bezeichnungsbeispiel siehe Bezeichnung Bahnsteig Anlage. "
		   });
		addAnnotation
		  (bahnsteig_ZugangEClass,
		   source,
		   new String[] {
			   "documentation", "Zugangspunkt der Reisenden zum Bahnsteig. Es wird jeweils die Mitte der Linie angegeben, auf der der Zugangsweg auf den Bahnsteig st\u00f6\u00dft. F\u00fcr die Verwendung im Sicherungstechnischen Lageplan w\u00e4hrend der Bearbeitung wurde ein neues Symbol erschaffen. Dieses soll im endg\u00fcltigen Lageplan nicht erscheinen. Der Zugang ist in der LST-Planung f\u00fcr die INA-Berechnung relevant. Hierbei wird der Punkt auf der Bahnsteigkante ben\u00f6tigt, an der der Zustrom der Reisenden erfolgt. Dieser Punkt wird im Datenmodell nicht abgespeichert, er kann aus Bahnsteig_Zugang hergeleitet werden. DB-Regelwerk Nennung des Zugangs im INA-Erhebungsbogen, Verortung erfolgt bisher nicht"
		   });
		addAnnotation
		  (getBahnsteig_Zugang_IDBahnsteigAnlage(),
		   source,
		   new String[] {
			   "documentation", "Zuordnung einer Bahnsteigkante oder eines Bahnsteigzugangs zu einer Bahnsteiganlage. DB-Regelwerk Zusammenhang wird aus der Darstellung im sicherungstechnischen Lageplan ersichtlich"
		   });
		addAnnotation
		  (getBahnsteig_Zugang_Allg_AttributeGroup_BahnsteigZugangArt(),
		   source,
		   new String[] {
			   "documentation", "Art des Zugangs zum Bahnsteig. Das Attribut dient nur dazu, im INA-Erhebungsbogen die Zug\u00e4nge zum Bahnsteig grob zu unterscheiden. DB-Regelwerk Eintrag im INA-Erhebungsbogen"
		   });
		addAnnotation
		  (getBahnsteig_Zugang_Allg_AttributeGroup_Hauptzugang(),
		   source,
		   new String[] {
			   "documentation", "Angabe, ob der Bahnsteig Zugang ein Hauptzugang ist (true) oder noicht (false). Die Angabe ist f\u00fcr die INA-Berechnung relevant. Je Bahnsteig Anlage darf nur ein Hauptzugang bestimmt werden. DB-Regelwerk Eintrag im INA-Erhebungsbogen"
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
		  (bahnsteig_AnlageEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (bahnsteig_DachEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (bahnsteig_KanteEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getBahnsteig_Kante_Allg_AttributeGroup_Systemhoehe(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:PlanningStage>EP</ppi:PlanningStage>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (bahnsteig_ZugangEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getBahnsteig_Zugang_Allg_AttributeGroup_Hauptzugang(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>false</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
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
		  (bahnsteig_AnlageEClass,
		   source,
		   new String[] {
			   "name", "CBahnsteig_Anlage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBahnsteig_Anlage_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (bahnsteig_Anlage_Bezeichnung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CBahnsteig_Anlage_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBahnsteig_Anlage_Bezeichnung_AttributeGroup_BezeichnungBahnsteigAnlage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung_Bahnsteig_Anlage"
		   });
		addAnnotation
		  (bahnsteig_DachEClass,
		   source,
		   new String[] {
			   "name", "CBahnsteig_Dach",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBahnsteig_Dach_IDBahnsteigKante(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Bahnsteig_Kante"
		   });
		addAnnotation
		  (bahnsteig_KanteEClass,
		   source,
		   new String[] {
			   "name", "CBahnsteig_Kante",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBahnsteig_Kante_BahnsteigKanteAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bahnsteig_Kante_Allg"
		   });
		addAnnotation
		  (getBahnsteig_Kante_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getBahnsteig_Kante_IDBahnsteigAnlage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Bahnsteig_Anlage"
		   });
		addAnnotation
		  (bahnsteig_Kante_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CBahnsteig_Kante_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBahnsteig_Kante_Allg_AttributeGroup_LageZumGleis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Lage_Zum_Gleis"
		   });
		addAnnotation
		  (getBahnsteig_Kante_Allg_AttributeGroup_Systemhoehe(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Systemhoehe"
		   });
		addAnnotation
		  (bahnsteig_Kante_Bezeichnung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CBahnsteig_Kante_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBahnsteig_Kante_Bezeichnung_AttributeGroup_BezeichnungBahnsteigKante(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung_Bahnsteig_Kante"
		   });
		addAnnotation
		  (bahnsteig_ZugangEClass,
		   source,
		   new String[] {
			   "name", "CBahnsteig_Zugang",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBahnsteig_Zugang_BahnsteigZugangAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bahnsteig_Zugang_Allg"
		   });
		addAnnotation
		  (getBahnsteig_Zugang_IDBahnsteigAnlage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Bahnsteig_Anlage"
		   });
		addAnnotation
		  (bahnsteig_Zugang_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CBahnsteig_Zugang_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBahnsteig_Zugang_Allg_AttributeGroup_BahnsteigZugangArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bahnsteig_Zugang_Art"
		   });
		addAnnotation
		  (getBahnsteig_Zugang_Allg_AttributeGroup_Hauptzugang(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Hauptzugang"
		   });
		addAnnotation
		  (bahnsteig_Zugang_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBahnsteig_Zugang_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBahnsteig_Zugang_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bezeichnung_Bahnsteig_Anlage_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBezeichnung_Bahnsteig_Anlage",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText"
		   });
		addAnnotation
		  (bezeichnung_Bahnsteig_Anlage_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBezeichnung_Bahnsteig_Anlage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBezeichnung_Bahnsteig_Anlage_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bezeichnung_Bahnsteig_Kante_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBezeichnung_Bahnsteig_Kante",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText"
		   });
		addAnnotation
		  (bezeichnung_Bahnsteig_Kante_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBezeichnung_Bahnsteig_Kante",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBezeichnung_Bahnsteig_Kante_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (enumBahnsteigZugangArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMBahnsteig_Zugang_Art"
		   });
		addAnnotation
		  (enumBahnsteigZugangArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMBahnsteig_Zugang_Art:Object",
			   "baseType", "ENUMBahnsteig_Zugang_Art"
		   });
		addAnnotation
		  (enumSystemhoeheEEnum,
		   source,
		   new String[] {
			   "name", "ENUMSystemhoehe"
		   });
		addAnnotation
		  (enumSystemhoeheObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMSystemhoehe:Object",
			   "baseType", "ENUMSystemhoehe"
		   });
		addAnnotation
		  (hauptzugang_TypeEDataType,
		   source,
		   new String[] {
			   "name", "THauptzugang",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#boolean"
		   });
		addAnnotation
		  (hauptzugang_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCHauptzugang",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHauptzugang_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (hauptzugang_TypeObjectEDataType,
		   source,
		   new String[] {
			   "name", "THauptzugang:Object",
			   "baseType", "THauptzugang"
		   });
		addAnnotation
		  (lage_Zum_Gleis_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TLage_Zum_Gleis",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TLinksRechts"
		   });
		addAnnotation
		  (lage_Zum_Gleis_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCLage_Zum_Gleis",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLage_Zum_Gleis_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (systemhoehe_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCSystemhoehe",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSystemhoehe_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
	}

} //BahnsteigPackageImpl
