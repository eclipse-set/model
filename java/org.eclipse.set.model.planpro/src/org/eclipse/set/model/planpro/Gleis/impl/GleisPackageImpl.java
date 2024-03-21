/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Gleis.impl;

import java.math.BigInteger;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
import org.eclipse.set.model.planpro.BasisTypen.ENUMFahrstrom;

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

import org.eclipse.set.model.planpro.Gleis.Baubereich_Art_TypeClass;
import org.eclipse.set.model.planpro.Gleis.Bez_Gleis_Bezeichnung_TypeClass;
import org.eclipse.set.model.planpro.Gleis.ENUMBaubereichArt;
import org.eclipse.set.model.planpro.Gleis.ENUMGleisart;
import org.eclipse.set.model.planpro.Gleis.ENUMKonstruktion;
import org.eclipse.set.model.planpro.Gleis.ENUMLichtraumprofil;
import org.eclipse.set.model.planpro.Gleis.Fahrstrom_TypeClass;
import org.eclipse.set.model.planpro.Gleis.Geschwindigkeit_TypeClass;
import org.eclipse.set.model.planpro.Gleis.GleisFactory;
import org.eclipse.set.model.planpro.Gleis.GleisPackage;
import org.eclipse.set.model.planpro.Gleis.Gleis_Abschnitt;
import org.eclipse.set.model.planpro.Gleis.Gleis_Art;
import org.eclipse.set.model.planpro.Gleis.Gleis_Baubereich;
import org.eclipse.set.model.planpro.Gleis.Gleis_Bezeichnung;
import org.eclipse.set.model.planpro.Gleis.Gleis_Bezeichnung_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.planpro.Gleis.Gleis_Fahrbahn;
import org.eclipse.set.model.planpro.Gleis.Gleis_Lichtraum;
import org.eclipse.set.model.planpro.Gleis.Gleis_Schaltgruppe;
import org.eclipse.set.model.planpro.Gleis.Gleisart_TypeClass;
import org.eclipse.set.model.planpro.Gleis.Konstruktion_TypeClass;
import org.eclipse.set.model.planpro.Gleis.Lichtraumprofil_TypeClass;

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
public class GleisPackageImpl extends EPackageImpl implements GleisPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baubereich_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bez_Gleis_Bezeichnung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fahrstrom_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geschwindigkeit_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gleis_AbschnittEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gleis_ArtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gleis_BaubereichEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gleis_BezeichnungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gleis_Bezeichnung_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gleis_FahrbahnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gleis_LichtraumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gleis_SchaltgruppeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gleisart_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass konstruktion_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lichtraumprofil_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumBaubereichArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumGleisartEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumKonstruktionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumLichtraumprofilEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bez_Gleis_Bezeichnung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumBaubereichArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumGleisartObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumKonstruktionObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumLichtraumprofilObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fahrstrom_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType geschwindigkeit_TypeEDataType = null;

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
	 * @see org.eclipse.set.model.planpro.Gleis.GleisPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GleisPackageImpl() {
		super(eNS_URI, GleisFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GleisPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GleisPackage init() {
		if (isInited) return (GleisPackage)EPackage.Registry.INSTANCE.getEPackage(GleisPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGleisPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GleisPackageImpl theGleisPackage = registeredGleisPackage instanceof GleisPackageImpl ? (GleisPackageImpl)registeredGleisPackage : new GleisPackageImpl();

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
		theGleisPackage.createPackageContents();
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
		theGleisPackage.initializePackageContents();
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

		// Mark meta-data to indicate it can't be changed
		theGleisPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GleisPackage.eNS_URI, theGleisPackage);
		return theGleisPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBaubereich_Art_TypeClass() {
		return baubereich_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBaubereich_Art_TypeClass_Wert() {
		return (EAttribute)baubereich_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBez_Gleis_Bezeichnung_TypeClass() {
		return bez_Gleis_Bezeichnung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBez_Gleis_Bezeichnung_TypeClass_Wert() {
		return (EAttribute)bez_Gleis_Bezeichnung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFahrstrom_TypeClass() {
		return fahrstrom_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFahrstrom_TypeClass_Wert() {
		return (EAttribute)fahrstrom_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeschwindigkeit_TypeClass() {
		return geschwindigkeit_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeschwindigkeit_TypeClass_Wert() {
		return (EAttribute)geschwindigkeit_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGleis_Abschnitt() {
		return gleis_AbschnittEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGleis_Abschnitt_Bezeichnung() {
		return (EReference)gleis_AbschnittEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGleis_Abschnitt_Geschwindigkeit() {
		return (EReference)gleis_AbschnittEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGleis_Art() {
		return gleis_ArtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGleis_Art_Gleisart() {
		return (EReference)gleis_ArtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGleis_Baubereich() {
		return gleis_BaubereichEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGleis_Baubereich_BaubereichArt() {
		return (EReference)gleis_BaubereichEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGleis_Bezeichnung() {
		return gleis_BezeichnungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGleis_Bezeichnung_Bezeichnung() {
		return (EReference)gleis_BezeichnungEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGleis_Bezeichnung_Bezeichnung_AttributeGroup() {
		return gleis_Bezeichnung_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGleis_Bezeichnung_Bezeichnung_AttributeGroup_BezGleisBezeichnung() {
		return (EReference)gleis_Bezeichnung_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGleis_Fahrbahn() {
		return gleis_FahrbahnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGleis_Fahrbahn_Konstruktion() {
		return (EReference)gleis_FahrbahnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGleis_Lichtraum() {
		return gleis_LichtraumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGleis_Lichtraum_Lichtraumprofil() {
		return (EReference)gleis_LichtraumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGleis_Schaltgruppe() {
		return gleis_SchaltgruppeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGleis_Schaltgruppe_Bezeichnung() {
		return (EReference)gleis_SchaltgruppeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGleis_Schaltgruppe_Fahrstrom() {
		return (EReference)gleis_SchaltgruppeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGleisart_TypeClass() {
		return gleisart_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGleisart_TypeClass_Wert() {
		return (EAttribute)gleisart_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKonstruktion_TypeClass() {
		return konstruktion_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKonstruktion_TypeClass_Wert() {
		return (EAttribute)konstruktion_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLichtraumprofil_TypeClass() {
		return lichtraumprofil_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLichtraumprofil_TypeClass_Wert() {
		return (EAttribute)lichtraumprofil_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMBaubereichArt() {
		return enumBaubereichArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMGleisart() {
		return enumGleisartEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMKonstruktion() {
		return enumKonstruktionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMLichtraumprofil() {
		return enumLichtraumprofilEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBez_Gleis_Bezeichnung_Type() {
		return bez_Gleis_Bezeichnung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMBaubereichArtObject() {
		return enumBaubereichArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMGleisartObject() {
		return enumGleisartObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMKonstruktionObject() {
		return enumKonstruktionObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMLichtraumprofilObject() {
		return enumLichtraumprofilObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFahrstrom_Type() {
		return fahrstrom_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGeschwindigkeit_Type() {
		return geschwindigkeit_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GleisFactory getGleisFactory() {
		return (GleisFactory)getEFactoryInstance();
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
		baubereich_Art_TypeClassEClass = createEClass(BAUBEREICH_ART_TYPE_CLASS);
		createEAttribute(baubereich_Art_TypeClassEClass, BAUBEREICH_ART_TYPE_CLASS__WERT);

		bez_Gleis_Bezeichnung_TypeClassEClass = createEClass(BEZ_GLEIS_BEZEICHNUNG_TYPE_CLASS);
		createEAttribute(bez_Gleis_Bezeichnung_TypeClassEClass, BEZ_GLEIS_BEZEICHNUNG_TYPE_CLASS__WERT);

		fahrstrom_TypeClassEClass = createEClass(FAHRSTROM_TYPE_CLASS);
		createEAttribute(fahrstrom_TypeClassEClass, FAHRSTROM_TYPE_CLASS__WERT);

		geschwindigkeit_TypeClassEClass = createEClass(GESCHWINDIGKEIT_TYPE_CLASS);
		createEAttribute(geschwindigkeit_TypeClassEClass, GESCHWINDIGKEIT_TYPE_CLASS__WERT);

		gleis_AbschnittEClass = createEClass(GLEIS_ABSCHNITT);
		createEReference(gleis_AbschnittEClass, GLEIS_ABSCHNITT__BEZEICHNUNG);
		createEReference(gleis_AbschnittEClass, GLEIS_ABSCHNITT__GESCHWINDIGKEIT);

		gleis_ArtEClass = createEClass(GLEIS_ART);
		createEReference(gleis_ArtEClass, GLEIS_ART__GLEISART);

		gleis_BaubereichEClass = createEClass(GLEIS_BAUBEREICH);
		createEReference(gleis_BaubereichEClass, GLEIS_BAUBEREICH__BAUBEREICH_ART);

		gleis_BezeichnungEClass = createEClass(GLEIS_BEZEICHNUNG);
		createEReference(gleis_BezeichnungEClass, GLEIS_BEZEICHNUNG__BEZEICHNUNG);

		gleis_Bezeichnung_Bezeichnung_AttributeGroupEClass = createEClass(GLEIS_BEZEICHNUNG_BEZEICHNUNG_ATTRIBUTE_GROUP);
		createEReference(gleis_Bezeichnung_Bezeichnung_AttributeGroupEClass, GLEIS_BEZEICHNUNG_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_GLEIS_BEZEICHNUNG);

		gleis_FahrbahnEClass = createEClass(GLEIS_FAHRBAHN);
		createEReference(gleis_FahrbahnEClass, GLEIS_FAHRBAHN__KONSTRUKTION);

		gleis_LichtraumEClass = createEClass(GLEIS_LICHTRAUM);
		createEReference(gleis_LichtraumEClass, GLEIS_LICHTRAUM__LICHTRAUMPROFIL);

		gleis_SchaltgruppeEClass = createEClass(GLEIS_SCHALTGRUPPE);
		createEReference(gleis_SchaltgruppeEClass, GLEIS_SCHALTGRUPPE__BEZEICHNUNG);
		createEReference(gleis_SchaltgruppeEClass, GLEIS_SCHALTGRUPPE__FAHRSTROM);

		gleisart_TypeClassEClass = createEClass(GLEISART_TYPE_CLASS);
		createEAttribute(gleisart_TypeClassEClass, GLEISART_TYPE_CLASS__WERT);

		konstruktion_TypeClassEClass = createEClass(KONSTRUKTION_TYPE_CLASS);
		createEAttribute(konstruktion_TypeClassEClass, KONSTRUKTION_TYPE_CLASS__WERT);

		lichtraumprofil_TypeClassEClass = createEClass(LICHTRAUMPROFIL_TYPE_CLASS);
		createEAttribute(lichtraumprofil_TypeClassEClass, LICHTRAUMPROFIL_TYPE_CLASS__WERT);

		// Create enums
		enumBaubereichArtEEnum = createEEnum(ENUM_BAUBEREICH_ART);
		enumGleisartEEnum = createEEnum(ENUM_GLEISART);
		enumKonstruktionEEnum = createEEnum(ENUM_KONSTRUKTION);
		enumLichtraumprofilEEnum = createEEnum(ENUM_LICHTRAUMPROFIL);

		// Create data types
		bez_Gleis_Bezeichnung_TypeEDataType = createEDataType(BEZ_GLEIS_BEZEICHNUNG_TYPE);
		enumBaubereichArtObjectEDataType = createEDataType(ENUM_BAUBEREICH_ART_OBJECT);
		enumGleisartObjectEDataType = createEDataType(ENUM_GLEISART_OBJECT);
		enumKonstruktionObjectEDataType = createEDataType(ENUM_KONSTRUKTION_OBJECT);
		enumLichtraumprofilObjectEDataType = createEDataType(ENUM_LICHTRAUMPROFIL_OBJECT);
		fahrstrom_TypeEDataType = createEDataType(FAHRSTROM_TYPE);
		geschwindigkeit_TypeEDataType = createEDataType(GESCHWINDIGKEIT_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		baubereich_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bez_Gleis_Bezeichnung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fahrstrom_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		geschwindigkeit_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		gleis_AbschnittEClass.getESuperTypes().add(theBasisobjektePackage.getBereich_Objekt());
		gleis_ArtEClass.getESuperTypes().add(theBasisobjektePackage.getBereich_Objekt());
		gleis_BaubereichEClass.getESuperTypes().add(theBasisobjektePackage.getBereich_Objekt());
		gleis_BezeichnungEClass.getESuperTypes().add(theBasisobjektePackage.getBereich_Objekt());
		gleis_FahrbahnEClass.getESuperTypes().add(theBasisobjektePackage.getBereich_Objekt());
		gleis_LichtraumEClass.getESuperTypes().add(theBasisobjektePackage.getBereich_Objekt());
		gleis_SchaltgruppeEClass.getESuperTypes().add(theBasisobjektePackage.getBereich_Objekt());
		gleisart_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		konstruktion_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		lichtraumprofil_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());

		// Initialize classes and features; add operations and parameters
		initEClass(baubereich_Art_TypeClassEClass, Baubereich_Art_TypeClass.class, "Baubereich_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBaubereich_Art_TypeClass_Wert(), this.getENUMBaubereichArtObject(), "wert", null, 1, 1, Baubereich_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bez_Gleis_Bezeichnung_TypeClassEClass, Bez_Gleis_Bezeichnung_TypeClass.class, "Bez_Gleis_Bezeichnung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBez_Gleis_Bezeichnung_TypeClass_Wert(), this.getBez_Gleis_Bezeichnung_Type(), "wert", null, 1, 1, Bez_Gleis_Bezeichnung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fahrstrom_TypeClassEClass, Fahrstrom_TypeClass.class, "Fahrstrom_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFahrstrom_TypeClass_Wert(), this.getFahrstrom_Type(), "wert", null, 1, 1, Fahrstrom_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geschwindigkeit_TypeClassEClass, Geschwindigkeit_TypeClass.class, "Geschwindigkeit_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeschwindigkeit_TypeClass_Wert(), this.getGeschwindigkeit_Type(), "wert", null, 1, 1, Geschwindigkeit_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gleis_AbschnittEClass, Gleis_Abschnitt.class, "Gleis_Abschnitt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGleis_Abschnitt_Bezeichnung(), theBasisTypenPackage.getBezeichnung_Element_AttributeGroup(), null, "bezeichnung", null, 1, 1, Gleis_Abschnitt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGleis_Abschnitt_Geschwindigkeit(), this.getGeschwindigkeit_TypeClass(), null, "geschwindigkeit", null, 0, 1, Gleis_Abschnitt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gleis_ArtEClass, Gleis_Art.class, "Gleis_Art", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGleis_Art_Gleisart(), this.getGleisart_TypeClass(), null, "gleisart", null, 1, 1, Gleis_Art.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gleis_BaubereichEClass, Gleis_Baubereich.class, "Gleis_Baubereich", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGleis_Baubereich_BaubereichArt(), this.getBaubereich_Art_TypeClass(), null, "baubereichArt", null, 1, 1, Gleis_Baubereich.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gleis_BezeichnungEClass, Gleis_Bezeichnung.class, "Gleis_Bezeichnung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGleis_Bezeichnung_Bezeichnung(), this.getGleis_Bezeichnung_Bezeichnung_AttributeGroup(), null, "bezeichnung", null, 1, 1, Gleis_Bezeichnung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gleis_Bezeichnung_Bezeichnung_AttributeGroupEClass, Gleis_Bezeichnung_Bezeichnung_AttributeGroup.class, "Gleis_Bezeichnung_Bezeichnung_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGleis_Bezeichnung_Bezeichnung_AttributeGroup_BezGleisBezeichnung(), this.getBez_Gleis_Bezeichnung_TypeClass(), null, "bezGleisBezeichnung", null, 1, 1, Gleis_Bezeichnung_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gleis_FahrbahnEClass, Gleis_Fahrbahn.class, "Gleis_Fahrbahn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGleis_Fahrbahn_Konstruktion(), this.getKonstruktion_TypeClass(), null, "konstruktion", null, 1, 1, Gleis_Fahrbahn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gleis_LichtraumEClass, Gleis_Lichtraum.class, "Gleis_Lichtraum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGleis_Lichtraum_Lichtraumprofil(), this.getLichtraumprofil_TypeClass(), null, "lichtraumprofil", null, 1, 1, Gleis_Lichtraum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gleis_SchaltgruppeEClass, Gleis_Schaltgruppe.class, "Gleis_Schaltgruppe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGleis_Schaltgruppe_Bezeichnung(), theBasisTypenPackage.getBezeichnung_Element_AttributeGroup(), null, "bezeichnung", null, 1, 1, Gleis_Schaltgruppe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGleis_Schaltgruppe_Fahrstrom(), this.getFahrstrom_TypeClass(), null, "fahrstrom", null, 1, 1, Gleis_Schaltgruppe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gleisart_TypeClassEClass, Gleisart_TypeClass.class, "Gleisart_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGleisart_TypeClass_Wert(), this.getENUMGleisartObject(), "wert", null, 1, 1, Gleisart_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(konstruktion_TypeClassEClass, Konstruktion_TypeClass.class, "Konstruktion_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKonstruktion_TypeClass_Wert(), this.getENUMKonstruktionObject(), "wert", null, 1, 1, Konstruktion_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lichtraumprofil_TypeClassEClass, Lichtraumprofil_TypeClass.class, "Lichtraumprofil_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLichtraumprofil_TypeClass_Wert(), this.getENUMLichtraumprofilObject(), "wert", null, 1, 1, Lichtraumprofil_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumBaubereichArtEEnum, ENUMBaubereichArt.class, "ENUMBaubereichArt");
		addEEnumLiteral(enumBaubereichArtEEnum, ENUMBaubereichArt.ENUM_BAUBEREICH_ART_AUSGEBAUT);
		addEEnumLiteral(enumBaubereichArtEEnum, ENUMBaubereichArt.ENUM_BAUBEREICH_ART_BAUGLEIS);
		addEEnumLiteral(enumBaubereichArtEEnum, ENUMBaubereichArt.ENUM_BAUBEREICH_ART_GESPERRT);
		addEEnumLiteral(enumBaubereichArtEEnum, ENUMBaubereichArt.ENUM_BAUBEREICH_ART_SONSTIGE);

		initEEnum(enumGleisartEEnum, ENUMGleisart.class, "ENUMGleisart");
		addEEnumLiteral(enumGleisartEEnum, ENUMGleisart.ENUM_GLEISART_ANSCHLUSSGLEIS);
		addEEnumLiteral(enumGleisartEEnum, ENUMGleisart.ENUM_GLEISART_DURCHGEHENDES_HAUPTGLEIS);
		addEEnumLiteral(enumGleisartEEnum, ENUMGleisart.ENUM_GLEISART_HAUPTGLEIS);
		addEEnumLiteral(enumGleisartEEnum, ENUMGleisart.ENUM_GLEISART_NEBENGLEIS);
		addEEnumLiteral(enumGleisartEEnum, ENUMGleisart.ENUM_GLEISART_SONSTIGE);
		addEEnumLiteral(enumGleisartEEnum, ENUMGleisart.ENUM_GLEISART_STRECKENGLEIS);

		initEEnum(enumKonstruktionEEnum, ENUMKonstruktion.class, "ENUMKonstruktion");
		addEEnumLiteral(enumKonstruktionEEnum, ENUMKonstruktion.ENUM_KONSTRUKTION_FESTE_FAHRBAHN);
		addEEnumLiteral(enumKonstruktionEEnum, ENUMKonstruktion.ENUM_KONSTRUKTION_SCHUTZSCHIENE_LINKS);
		addEEnumLiteral(enumKonstruktionEEnum, ENUMKonstruktion.ENUM_KONSTRUKTION_SCHUTZSCHIENE_RECHTS);
		addEEnumLiteral(enumKonstruktionEEnum, ENUMKonstruktion.ENUM_KONSTRUKTION_SONSTIGE);

		initEEnum(enumLichtraumprofilEEnum, ENUMLichtraumprofil.class, "ENUMLichtraumprofil");
		addEEnumLiteral(enumLichtraumprofilEEnum, ENUMLichtraumprofil.ENUM_LICHTRAUMPROFIL_1SMDR);
		addEEnumLiteral(enumLichtraumprofilEEnum, ENUMLichtraumprofil.ENUM_LICHTRAUMPROFIL_GC);
		addEEnumLiteral(enumLichtraumprofilEEnum, ENUMLichtraumprofil.ENUM_LICHTRAUMPROFIL_SBAHN_80003);
		addEEnumLiteral(enumLichtraumprofilEEnum, ENUMLichtraumprofil.ENUM_LICHTRAUMPROFIL_SBAHN_BERLIN);
		addEEnumLiteral(enumLichtraumprofilEEnum, ENUMLichtraumprofil.ENUM_LICHTRAUMPROFIL_SONSTIGE);

		// Initialize data types
		initEDataType(bez_Gleis_Bezeichnung_TypeEDataType, String.class, "Bez_Gleis_Bezeichnung_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumBaubereichArtObjectEDataType, ENUMBaubereichArt.class, "ENUMBaubereichArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumGleisartObjectEDataType, ENUMGleisart.class, "ENUMGleisartObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumKonstruktionObjectEDataType, ENUMKonstruktion.class, "ENUMKonstruktionObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumLichtraumprofilObjectEDataType, ENUMLichtraumprofil.class, "ENUMLichtraumprofilObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fahrstrom_TypeEDataType, ENUMFahrstrom.class, "Fahrstrom_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(geschwindigkeit_TypeEDataType, BigInteger.class, "Geschwindigkeit_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (gleis_AbschnittEClass,
		   source,
		   new String[] {
			   "documentation", "Abschnitt eines Gleises, welcher als kleinste Einheit betrieblich und technisch verwendet wird. Der Gleisabschnitt wird im Allgemeinen durch zwei Enden begrenzt. Wenn in diesem Gleisabschnitt Weichen, Kreuzungen oder Kreuzungsweichen enthalten sind, entstehen weitere Enden. Diese werden in der Regel nur dann definiert, wenn technische Anlagen zur Gleisfreimeldung vorhanden sind. Der Begriff Weichenabschnitt wird wegen Mehrdeutigkeit im Modell nicht verwendet. Ein Gleisabschnitt kann mittels technischer Anlagen (abgebildet im Objekt FMA Anlage) auf Freisein \u00fcberwacht werden. Der Gleisabschnitt als Bereich_Objekt muss an seinen Grenzen genau mit dem Punkt_Objekt FMA Element \u00fcbereinstimmen. Rundungsfehler bei der Berechnung sind zu beachten! "
		   });
		addAnnotation
		  (getGleis_Abschnitt_Bezeichnung(),
		   source,
		   new String[] {
			   "documentation", "Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle \u00fcber Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht m\u00f6glich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es m\u00f6glich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und \u00dcbersichtsplan, B\u00dc-Lageplan Planungstabellen "
		   });
		addAnnotation
		  (getGleis_Abschnitt_Geschwindigkeit(),
		   source,
		   new String[] {
			   "documentation", "Geschwindigkeit, die f\u00fcr einen Gleisabschnitt festgelegt wird, um die Signalisierung f\u00fcr Zugfahrten zu beeinflussen. Das Attribut wird nur dann verwendet, wenn die zu signalisierende Geschwindigkeit nicht \u00fcber andere Objekte (z. B. Weichen) abgebildet werden kann. Die Geschwindigkeit ist nicht richtungsabh\u00e4ngig und nicht die VzG-Geschwindigkeit. Siehe auch Bildung der Signalbegriffe. "
		   });
		addAnnotation
		  (gleis_ArtEClass,
		   source,
		   new String[] {
			   "documentation", "Klassifizierung des Gleises aus betrieblicher Sicht. Es erfolgt die Unterscheidung in Haupt- und Nebengleise in einem Bahnhof, sowie die Abgrenzung von Strecken und Anschlussgleisen."
		   });
		addAnnotation
		  (getGleis_Art_Gleisart(),
		   source,
		   new String[] {
			   "documentation", "Betriebliche Einordnung des Gleises. Aus einer Liste erfolgt die Auswahl der Gleisart. Falls eine abweichende Gleisart vorhanden ist, ist \\\"sonstige\\\" auszuw\u00e4hlen und mit einem Bearbeitungsvermerk zu erl\u00e4utern."
		   });
		addAnnotation
		  (gleis_BaubereichEClass,
		   source,
		   new String[] {
			   "documentation", "Markierung eines Gleisbereiches als Baubereich. Mit diesem Objekt wird der Bereich markiert, der w\u00e4hrend einer Planung als Baubereich verwendet wird. Die Topologie des Baubereiches und die verorteten Objekte bleiben erhalten."
		   });
		addAnnotation
		  (getGleis_Baubereich_BaubereichArt(),
		   source,
		   new String[] {
			   "documentation", "Kennzeichnung der Art des Baubereichs zur Darstellung in der Planung. ausgebaut: Tempor\u00e4r ausgebautes Gleis, das aus Zweckm\u00e4\u00dfigkeitsgr\u00fcnden (z. B. f\u00fcr Verortung von Objekten) noch in den Planungs- bzw. Bestandsdaten mitgef\u00fchrt werden muss. Baugleis: Umsetzung der durch die Baubetriebsplanung vorgegebene besondere Eigenschaft eines Gleises oder Teil eines Gleises als Baugleis im PT 1. Die Eigenschaft ~ ist genau und nur dann anzuwenden, wenn daraus folgend oder in Zusammenhang damit stehend Ma\u00dfnahmen resultieren, die in sicherungstechnischen Planungen dargestellt werden m\u00fcssen. Die Erkl\u00e4rung zum Baugleis kann in diesem Fall auch nicht ohne \u00c4nderung des sicherungstechnischen Zustands zur\u00fcckgenommen werden. Erkl\u00e4rung und R\u00fccknahme der Erkl\u00e4rung zum Baugleis mit rein betrieblichen Konsequenzen, insbesondere in Zeitr\u00e4umen kleiner als die zugeh\u00f6rigen sicherungstechnischen Bauzust\u00e4nde, sind hingegen in PlanPro nicht abzubilden. [gem\u00e4\u00df Ril 408.0471, Ril 408.1471, Ril 408.1488] gesperrt: Sicherungstechnisch gesperrtes Gleis mit definierter Begrenzung. Erg\u00e4nzende Beschreibung f\u00fcr PlanPro: Die betreffenden Gleise m\u00fcssen im Rahmen der AP PT 1 (oder Bestandsdigitalisierung) als gesperrt markiert werden. Eine Aufhebung der Sperrung des Gleises kann nur mit einer neuen Planung (AP PT 1) erfolgen. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk mit entsprechenden Erl\u00e4uterungen anzuf\u00fcgen."
		   });
		addAnnotation
		  (gleis_BezeichnungEClass,
		   source,
		   new String[] {
			   "documentation", "Tr\u00e4ger der betrieblichen Bezeichnung eines Gleises. Ein Gleis erh\u00e4lt dann eine Bezeichnung, wenn es f\u00fcr die betriebliche Nutzung ben\u00f6tigt wird. Topologische Knoten (z. B. Weichen) unterbrechen nicht die Gleisbezeichnung. F\u00fcr die durchgehenden Hauptgleise in einem Bahnhof wird das Bereichsobjekt f\u00fcr das Gleis in der Regel von einem Einfahrsignal bis zum Einfahrsignal der Gegenrichtung modelliert. Wenn das Gleis hinsichtlich der betrieblichen Bezeichnung geteilt ist (z.B. Gleis 1 und Gleis 21) sind getrennte Bereichsobjekte f\u00fcr diese Gleise anzulegen. Weitere Bezeichnungen von Bahnhofsgleisen werden in der Regel zwischen topologischen Knoten gebildet, wobei auch weitere Knoten enthalten sein k\u00f6nnen. Gleise, die aus betrieblicher Sicht keine Bezeichnung ben\u00f6tigen (z. B. Gleisverbindungen), erhalten keine Gleisbezeichnung. Streckengleise werden in der Regel zwischen den Bahnhofsgrenzen (ggf. auch andere Zugmeldestellen) durchgehend bezeichnet. Die Klammersetzung der Bezeichnung von Streckengleisen ist Bestandteil der Bezeichnung das Steckengleises."
		   });
		addAnnotation
		  (getGleis_Bezeichnung_Bezeichnung(),
		   source,
		   new String[] {
			   "documentation", "Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle \u00fcber Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht m\u00f6glich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es m\u00f6glich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und \u00dcbersichtsplan, B\u00dc-Lageplan Planungstabellen "
		   });
		addAnnotation
		  (getGleis_Bezeichnung_Bezeichnung_AttributeGroup_BezGleisBezeichnung(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnung des Gleises entsprechend der betrieblichen Vorgaben (\u00fcblicherweise Ziffern bzw. Zahlen)."
		   });
		addAnnotation
		  (gleis_FahrbahnEClass,
		   source,
		   new String[] {
			   "documentation", "Bereich, in dem eine besondere Fahrbahnkonstruktion vorhanden ist, die f\u00fcr die Leit- und Sicherungstechnik relevant ist (z. B. Feste Fahrbahn). "
		   });
		addAnnotation
		  (getGleis_Fahrbahn_Konstruktion(),
		   source,
		   new String[] {
			   "documentation", "LST-relevante Fahrbahneigenschaft (z. B. Feste Fahrbahn)."
		   });
		addAnnotation
		  (gleis_LichtraumEClass,
		   source,
		   new String[] {
			   "documentation", "Bereich, in dem besondere Lichtraumbedingungen vorhanden sind. Es werden nur die Bereiche angegeben, in denen von der EBO abweichende und LST-relevante Lichtraumbedingungen vorhanden oder zu beachten sind. "
		   });
		addAnnotation
		  (getGleis_Lichtraum_Lichtraumprofil(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnung des von der EBO abweichenden Lichtraumprofils. Bei Auswahl des ENUM-Werts \\\"sonstige\\\" ist mittels Bearbeitungsvermerk eine Profilzeichnung als Anhang beizulegen. "
		   });
		addAnnotation
		  (gleis_SchaltgruppeEClass,
		   source,
		   new String[] {
			   "documentation", "Einzeln schaltbarer Abschnitt einer Fahrleitungsanlage, der mit Fahrstrom versorgt wird. Das Objekt wird vom Grundsatz dem \u00dcbersichtsplan mit Schaltanweisung (Ebs\u00fc) des elektrotechnischen Dienstes entnommen. Zur Beschreibung von Fahrleitungsschaltgruppen in der ESTW-Logik zum Zwecke der Merkhinweiseingabe f\u00fcr Befahrbarkeitssperren sind die betroffenen Gleisabschnitte zu beachten. Die Grenzen einer Schaltgruppe m\u00fcssen nicht mit den Grenzen der Gleisabschnitte \u00fcbereinstimmen. Wenn ein angeschnittener Gleisabschnitt vorhanden ist, wird dieser in der Befahrbarkeitssperre ber\u00fccksichtigt. Die Schaltgruppen k\u00f6nnen sich dann auch \u00fcberlagern. In der Regel sollten \u00dcberlagerungen von Schaltgruppen vermieden werden, indem ein Gleisabschnitt nur einer Schaltgruppe zugeordnet wird. Zwischen Bereichen verschiedener Schaltgruppen k\u00f6nnen aus vorgenanntem Grund auch L\u00fccken sein. F\u00fcr Schaltgruppen, die verschiedenen Fahrstromsystemen zugeordnet werden k\u00f6nnen (Systemwechselstellen), ist f\u00fcr jedes Fahrstromsystem je eine Instanz mit gleichem Elementnamen und gleichen Bereichsgrenzen anzulegen. Die Zuordnung der Schaltgruppen zu den Gleisabschnitten erfolgt \u00fcber die topologischen Kanten als ein Bereichsobjekt."
		   });
		addAnnotation
		  (getGleis_Schaltgruppe_Bezeichnung(),
		   source,
		   new String[] {
			   "documentation", "Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle \u00fcber Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht m\u00f6glich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es m\u00f6glich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und \u00dcbersichtsplan, B\u00dc-Lageplan Planungstabellen "
		   });
		addAnnotation
		  (getGleis_Schaltgruppe_Fahrstrom(),
		   source,
		   new String[] {
			   "documentation", "Angabe des f\u00fcr die Schaltgruppe verwendeten Fahrstromsystems. Falls als ENUM-Wert \\\"sonstige\\\" angegeben wird, ist das Fahrstromsystem mittels eines Bearbeitungsvermerks gesondert zu erl\u00e4utern."
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
		  (baubereich_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBaubereich_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBaubereich_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bez_Gleis_Bezeichnung_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBez_Gleis_Bezeichnung",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText"
		   });
		addAnnotation
		  (bez_Gleis_Bezeichnung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBez_Gleis_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBez_Gleis_Bezeichnung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (enumBaubereichArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMBaubereich_Art"
		   });
		addAnnotation
		  (enumBaubereichArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMBaubereich_Art:Object",
			   "baseType", "ENUMBaubereich_Art"
		   });
		addAnnotation
		  (enumGleisartEEnum,
		   source,
		   new String[] {
			   "name", "ENUMGleisart"
		   });
		addAnnotation
		  (enumGleisartObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMGleisart:Object",
			   "baseType", "ENUMGleisart"
		   });
		addAnnotation
		  (enumKonstruktionEEnum,
		   source,
		   new String[] {
			   "name", "ENUMKonstruktion"
		   });
		addAnnotation
		  (enumKonstruktionObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMKonstruktion:Object",
			   "baseType", "ENUMKonstruktion"
		   });
		addAnnotation
		  (enumLichtraumprofilEEnum,
		   source,
		   new String[] {
			   "name", "ENUMLichtraumprofil"
		   });
		addAnnotation
		  (enumLichtraumprofilObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMLichtraumprofil:Object",
			   "baseType", "ENUMLichtraumprofil"
		   });
		addAnnotation
		  (fahrstrom_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TFahrstrom",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TFahrstrom"
		   });
		addAnnotation
		  (fahrstrom_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFahrstrom",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFahrstrom_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (geschwindigkeit_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TGeschwindigkeit",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TGeschwindigkeit"
		   });
		addAnnotation
		  (geschwindigkeit_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCGeschwindigkeit",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGeschwindigkeit_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (gleis_AbschnittEClass,
		   source,
		   new String[] {
			   "name", "CGleis_Abschnitt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGleis_Abschnitt_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getGleis_Abschnitt_Geschwindigkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Geschwindigkeit"
		   });
		addAnnotation
		  (gleis_ArtEClass,
		   source,
		   new String[] {
			   "name", "CGleis_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGleis_Art_Gleisart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Gleisart"
		   });
		addAnnotation
		  (gleis_BaubereichEClass,
		   source,
		   new String[] {
			   "name", "CGleis_Baubereich",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGleis_Baubereich_BaubereichArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Baubereich_Art"
		   });
		addAnnotation
		  (gleis_BezeichnungEClass,
		   source,
		   new String[] {
			   "name", "CGleis_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGleis_Bezeichnung_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (gleis_Bezeichnung_Bezeichnung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CGleis_Bezeichnung_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGleis_Bezeichnung_Bezeichnung_AttributeGroup_BezGleisBezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bez_Gleis_Bezeichnung"
		   });
		addAnnotation
		  (gleis_FahrbahnEClass,
		   source,
		   new String[] {
			   "name", "CGleis_Fahrbahn",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGleis_Fahrbahn_Konstruktion(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Konstruktion"
		   });
		addAnnotation
		  (gleis_LichtraumEClass,
		   source,
		   new String[] {
			   "name", "CGleis_Lichtraum",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGleis_Lichtraum_Lichtraumprofil(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Lichtraumprofil"
		   });
		addAnnotation
		  (gleis_SchaltgruppeEClass,
		   source,
		   new String[] {
			   "name", "CGleis_Schaltgruppe",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGleis_Schaltgruppe_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getGleis_Schaltgruppe_Fahrstrom(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fahrstrom"
		   });
		addAnnotation
		  (gleisart_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCGleisart",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGleisart_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (konstruktion_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCKonstruktion",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKonstruktion_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (lichtraumprofil_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCLichtraumprofil",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLichtraumprofil_TypeClass_Wert(),
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
		  (gleis_AbschnittEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (gleis_ArtEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (gleis_BaubereichEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (gleis_BezeichnungEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (gleis_FahrbahnEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (gleis_LichtraumEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (gleis_SchaltgruppeEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getGleis_Schaltgruppe_Fahrstrom(),
		   source,
		   new String[] {
			   "appinfo", "\n                          \n  <ppi:WorkflowInformation>\n                               \n    <ppi:ProposedValue>15kV_16_7Hz</ppi:ProposedValue>\n                            \n  </ppi:WorkflowInformation>\n                       \n"
		   });
	}

} //GleisPackageImpl
