/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Flankenschutz.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
import org.eclipse.set.model.planpro.BasisTypen.ENUMLinksRechts;

import org.eclipse.set.model.planpro.BasisTypen.impl.BasisTypenPackageImpl;

import org.eclipse.set.model.planpro.Basisobjekte.BasisobjektePackage;

import org.eclipse.set.model.planpro.Basisobjekte.impl.BasisobjektePackageImpl;

import org.eclipse.set.model.planpro.Bedienung.BedienungPackage;

import org.eclipse.set.model.planpro.Bedienung.impl.BedienungPackageImpl;

import org.eclipse.set.model.planpro.Block.BlockPackage;

import org.eclipse.set.model.planpro.Block.impl.BlockPackageImpl;

import org.eclipse.set.model.planpro.Fahrstrasse.FahrstrassePackage;

import org.eclipse.set.model.planpro.Fahrstrasse.impl.FahrstrassePackageImpl;

import org.eclipse.set.model.planpro.Flankenschutz.EKW_Kr_Anteil_TypeClass;
import org.eclipse.set.model.planpro.Flankenschutz.ENUMFahrtUeber;
import org.eclipse.set.model.planpro.Flankenschutz.ENUMMassnahme;
import org.eclipse.set.model.planpro.Flankenschutz.ENUMZwieschutzArt;
import org.eclipse.set.model.planpro.Flankenschutz.Fahrt_Ueber_TypeClass;
import org.eclipse.set.model.planpro.Flankenschutz.Fla_Freimelde_Zuordnung;
import org.eclipse.set.model.planpro.Flankenschutz.Fla_Raum_Freimeldung_TypeClass;
import org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz;
import org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_Anforderer_AttributeGroup;
import org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_Signal_AttributeGroup;
import org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_W_Gsp_AttributeGroup;
import org.eclipse.set.model.planpro.Flankenschutz.Fla_Schutz_Weitergabe_AttributeGroup;
import org.eclipse.set.model.planpro.Flankenschutz.Fla_Signal_Zielsperrung_TypeClass;
import org.eclipse.set.model.planpro.Flankenschutz.Fla_Verzicht_TypeClass;
import org.eclipse.set.model.planpro.Flankenschutz.Fla_W_Lage_TypeClass;
import org.eclipse.set.model.planpro.Flankenschutz.Fla_Zwieschutz;
import org.eclipse.set.model.planpro.Flankenschutz.Fla_Zwieschutz_Element_AttributeGroup;
import org.eclipse.set.model.planpro.Flankenschutz.FlankenschutzFactory;
import org.eclipse.set.model.planpro.Flankenschutz.FlankenschutzPackage;
import org.eclipse.set.model.planpro.Flankenschutz.Massnahme_TypeClass;
import org.eclipse.set.model.planpro.Flankenschutz.Nachlaufverhinderung_TypeClass;
import org.eclipse.set.model.planpro.Flankenschutz.Zwieschutz_Art_TypeClass;

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
public class FlankenschutzPackageImpl extends EPackageImpl implements FlankenschutzPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ekW_Kr_Anteil_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fahrt_Ueber_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fla_Freimelde_ZuordnungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fla_Raum_Freimeldung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fla_SchutzEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fla_Schutz_Anforderer_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fla_Schutz_Signal_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fla_Schutz_W_Gsp_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fla_Schutz_Weitergabe_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fla_Signal_Zielsperrung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fla_Verzicht_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fla_W_Lage_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fla_ZwieschutzEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fla_Zwieschutz_Element_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass massnahme_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nachlaufverhinderung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zwieschutz_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumFahrtUeberEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumMassnahmeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumZwieschutzArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumFahrtUeberObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumMassnahmeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumZwieschutzArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fla_W_Lage_TypeEDataType = null;

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
	 * @see org.eclipse.set.model.planpro.Flankenschutz.FlankenschutzPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FlankenschutzPackageImpl() {
		super(eNS_URI, FlankenschutzFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FlankenschutzPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FlankenschutzPackage init() {
		if (isInited) return (FlankenschutzPackage)EPackage.Registry.INSTANCE.getEPackage(FlankenschutzPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFlankenschutzPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FlankenschutzPackageImpl theFlankenschutzPackage = registeredFlankenschutzPackage instanceof FlankenschutzPackageImpl ? (FlankenschutzPackageImpl)registeredFlankenschutzPackage : new FlankenschutzPackageImpl();

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
		theFlankenschutzPackage.createPackageContents();
		theBasisobjektePackage.createPackageContents();
		theBasisTypenPackage.createPackageContents();
		theATOPackage.createPackageContents();
		theVerweisePackage.createPackageContents();
		theAnsteuerung_ElementPackage.createPackageContents();
		theBahnsteigPackage.createPackageContents();
		theBedienungPackage.createPackageContents();
		theBlockPackage.createPackageContents();
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
		theFlankenschutzPackage.initializePackageContents();
		theBasisobjektePackage.initializePackageContents();
		theBasisTypenPackage.initializePackageContents();
		theATOPackage.initializePackageContents();
		theVerweisePackage.initializePackageContents();
		theAnsteuerung_ElementPackage.initializePackageContents();
		theBahnsteigPackage.initializePackageContents();
		theBedienungPackage.initializePackageContents();
		theBlockPackage.initializePackageContents();
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

		// Mark meta-data to indicate it can't be changed
		theFlankenschutzPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FlankenschutzPackage.eNS_URI, theFlankenschutzPackage);
		return theFlankenschutzPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEKW_Kr_Anteil_TypeClass() {
		return ekW_Kr_Anteil_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEKW_Kr_Anteil_TypeClass_Wert() {
		return (EAttribute)ekW_Kr_Anteil_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFahrt_Ueber_TypeClass() {
		return fahrt_Ueber_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFahrt_Ueber_TypeClass_Wert() {
		return (EAttribute)fahrt_Ueber_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFla_Freimelde_Zuordnung() {
		return fla_Freimelde_ZuordnungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFla_Freimelde_Zuordnung_FlaRaumFreimeldung() {
		return (EReference)fla_Freimelde_ZuordnungEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFla_Freimelde_Zuordnung_IDFlaSchutz() {
		return (EReference)fla_Freimelde_ZuordnungEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFla_Freimelde_Zuordnung_IDFMAAnlage() {
		return (EReference)fla_Freimelde_ZuordnungEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFla_Raum_Freimeldung_TypeClass() {
		return fla_Raum_Freimeldung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFla_Raum_Freimeldung_TypeClass_Wert() {
		return (EAttribute)fla_Raum_Freimeldung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFla_Schutz() {
		return fla_SchutzEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFla_Schutz_FlaSchutzAnforderer() {
		return (EReference)fla_SchutzEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFla_Schutz_FlaSchutzSignal() {
		return (EReference)fla_SchutzEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFla_Schutz_FlaSchutzWGsp() {
		return (EReference)fla_SchutzEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFla_Schutz_FlaSchutzWeitergabe() {
		return (EReference)fla_SchutzEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFla_Schutz_FlaVerzicht() {
		return (EReference)fla_SchutzEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFla_Schutz_Anforderer_AttributeGroup() {
		return fla_Schutz_Anforderer_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFla_Schutz_Anforderer_AttributeGroup_EKWKrAnteil() {
		return (EReference)fla_Schutz_Anforderer_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFla_Schutz_Anforderer_AttributeGroup_FahrtUeber() {
		return (EReference)fla_Schutz_Anforderer_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFla_Schutz_Anforderer_AttributeGroup_IDAnfordererElement() {
		return (EReference)fla_Schutz_Anforderer_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFla_Schutz_Signal_AttributeGroup() {
		return fla_Schutz_Signal_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFla_Schutz_Signal_AttributeGroup_FlaSignalZielsperrung() {
		return (EReference)fla_Schutz_Signal_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFla_Schutz_Signal_AttributeGroup_IDFlaSignal() {
		return (EReference)fla_Schutz_Signal_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFla_Schutz_W_Gsp_AttributeGroup() {
		return fla_Schutz_W_Gsp_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFla_Schutz_W_Gsp_AttributeGroup_FlaWLage() {
		return (EReference)fla_Schutz_W_Gsp_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFla_Schutz_W_Gsp_AttributeGroup_IDFlaWGspElement() {
		return (EReference)fla_Schutz_W_Gsp_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFla_Schutz_Weitergabe_AttributeGroup() {
		return fla_Schutz_Weitergabe_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFla_Schutz_Weitergabe_AttributeGroup_IDFlaWeitergabeL() {
		return (EReference)fla_Schutz_Weitergabe_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFla_Schutz_Weitergabe_AttributeGroup_IDFlaWeitergabeR() {
		return (EReference)fla_Schutz_Weitergabe_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFla_Signal_Zielsperrung_TypeClass() {
		return fla_Signal_Zielsperrung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFla_Signal_Zielsperrung_TypeClass_Wert() {
		return (EAttribute)fla_Signal_Zielsperrung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFla_Verzicht_TypeClass() {
		return fla_Verzicht_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFla_Verzicht_TypeClass_Wert() {
		return (EAttribute)fla_Verzicht_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFla_W_Lage_TypeClass() {
		return fla_W_Lage_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFla_W_Lage_TypeClass_Wert() {
		return (EAttribute)fla_W_Lage_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFla_Zwieschutz() {
		return fla_ZwieschutzEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFla_Zwieschutz_FlaZwieschutzElement() {
		return (EReference)fla_ZwieschutzEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFla_Zwieschutz_IDWElement() {
		return (EReference)fla_ZwieschutzEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFla_Zwieschutz_ZwieschutzArt() {
		return (EReference)fla_ZwieschutzEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFla_Zwieschutz_Element_AttributeGroup() {
		return fla_Zwieschutz_Element_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFla_Zwieschutz_Element_AttributeGroup_IDFlaSchutzL() {
		return (EReference)fla_Zwieschutz_Element_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFla_Zwieschutz_Element_AttributeGroup_IDFlaSchutzR() {
		return (EReference)fla_Zwieschutz_Element_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFla_Zwieschutz_Element_AttributeGroup_MassnahmeL() {
		return (EReference)fla_Zwieschutz_Element_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFla_Zwieschutz_Element_AttributeGroup_MassnahmeR() {
		return (EReference)fla_Zwieschutz_Element_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFla_Zwieschutz_Element_AttributeGroup_Nachlaufverhinderung() {
		return (EReference)fla_Zwieschutz_Element_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMassnahme_TypeClass() {
		return massnahme_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMassnahme_TypeClass_Wert() {
		return (EAttribute)massnahme_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNachlaufverhinderung_TypeClass() {
		return nachlaufverhinderung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNachlaufverhinderung_TypeClass_Wert() {
		return (EAttribute)nachlaufverhinderung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZwieschutz_Art_TypeClass() {
		return zwieschutz_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZwieschutz_Art_TypeClass_Wert() {
		return (EAttribute)zwieschutz_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMFahrtUeber() {
		return enumFahrtUeberEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMMassnahme() {
		return enumMassnahmeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMZwieschutzArt() {
		return enumZwieschutzArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMFahrtUeberObject() {
		return enumFahrtUeberObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMMassnahmeObject() {
		return enumMassnahmeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMZwieschutzArtObject() {
		return enumZwieschutzArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getFla_W_Lage_Type() {
		return fla_W_Lage_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FlankenschutzFactory getFlankenschutzFactory() {
		return (FlankenschutzFactory)getEFactoryInstance();
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
		ekW_Kr_Anteil_TypeClassEClass = createEClass(EKW_KR_ANTEIL_TYPE_CLASS);
		createEAttribute(ekW_Kr_Anteil_TypeClassEClass, EKW_KR_ANTEIL_TYPE_CLASS__WERT);

		fahrt_Ueber_TypeClassEClass = createEClass(FAHRT_UEBER_TYPE_CLASS);
		createEAttribute(fahrt_Ueber_TypeClassEClass, FAHRT_UEBER_TYPE_CLASS__WERT);

		fla_Freimelde_ZuordnungEClass = createEClass(FLA_FREIMELDE_ZUORDNUNG);
		createEReference(fla_Freimelde_ZuordnungEClass, FLA_FREIMELDE_ZUORDNUNG__FLA_RAUM_FREIMELDUNG);
		createEReference(fla_Freimelde_ZuordnungEClass, FLA_FREIMELDE_ZUORDNUNG__ID_FLA_SCHUTZ);
		createEReference(fla_Freimelde_ZuordnungEClass, FLA_FREIMELDE_ZUORDNUNG__IDFMA_ANLAGE);

		fla_Raum_Freimeldung_TypeClassEClass = createEClass(FLA_RAUM_FREIMELDUNG_TYPE_CLASS);
		createEAttribute(fla_Raum_Freimeldung_TypeClassEClass, FLA_RAUM_FREIMELDUNG_TYPE_CLASS__WERT);

		fla_SchutzEClass = createEClass(FLA_SCHUTZ);
		createEReference(fla_SchutzEClass, FLA_SCHUTZ__FLA_SCHUTZ_ANFORDERER);
		createEReference(fla_SchutzEClass, FLA_SCHUTZ__FLA_SCHUTZ_SIGNAL);
		createEReference(fla_SchutzEClass, FLA_SCHUTZ__FLA_SCHUTZ_WGSP);
		createEReference(fla_SchutzEClass, FLA_SCHUTZ__FLA_SCHUTZ_WEITERGABE);
		createEReference(fla_SchutzEClass, FLA_SCHUTZ__FLA_VERZICHT);

		fla_Schutz_Anforderer_AttributeGroupEClass = createEClass(FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP);
		createEReference(fla_Schutz_Anforderer_AttributeGroupEClass, FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__EKW_KR_ANTEIL);
		createEReference(fla_Schutz_Anforderer_AttributeGroupEClass, FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__FAHRT_UEBER);
		createEReference(fla_Schutz_Anforderer_AttributeGroupEClass, FLA_SCHUTZ_ANFORDERER_ATTRIBUTE_GROUP__ID_ANFORDERER_ELEMENT);

		fla_Schutz_Signal_AttributeGroupEClass = createEClass(FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP);
		createEReference(fla_Schutz_Signal_AttributeGroupEClass, FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__FLA_SIGNAL_ZIELSPERRUNG);
		createEReference(fla_Schutz_Signal_AttributeGroupEClass, FLA_SCHUTZ_SIGNAL_ATTRIBUTE_GROUP__ID_FLA_SIGNAL);

		fla_Schutz_W_Gsp_AttributeGroupEClass = createEClass(FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP);
		createEReference(fla_Schutz_W_Gsp_AttributeGroupEClass, FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__FLA_WLAGE);
		createEReference(fla_Schutz_W_Gsp_AttributeGroupEClass, FLA_SCHUTZ_WGSP_ATTRIBUTE_GROUP__ID_FLA_WGSP_ELEMENT);

		fla_Schutz_Weitergabe_AttributeGroupEClass = createEClass(FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP);
		createEReference(fla_Schutz_Weitergabe_AttributeGroupEClass, FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_L);
		createEReference(fla_Schutz_Weitergabe_AttributeGroupEClass, FLA_SCHUTZ_WEITERGABE_ATTRIBUTE_GROUP__ID_FLA_WEITERGABE_R);

		fla_Signal_Zielsperrung_TypeClassEClass = createEClass(FLA_SIGNAL_ZIELSPERRUNG_TYPE_CLASS);
		createEAttribute(fla_Signal_Zielsperrung_TypeClassEClass, FLA_SIGNAL_ZIELSPERRUNG_TYPE_CLASS__WERT);

		fla_Verzicht_TypeClassEClass = createEClass(FLA_VERZICHT_TYPE_CLASS);
		createEAttribute(fla_Verzicht_TypeClassEClass, FLA_VERZICHT_TYPE_CLASS__WERT);

		fla_W_Lage_TypeClassEClass = createEClass(FLA_WLAGE_TYPE_CLASS);
		createEAttribute(fla_W_Lage_TypeClassEClass, FLA_WLAGE_TYPE_CLASS__WERT);

		fla_ZwieschutzEClass = createEClass(FLA_ZWIESCHUTZ);
		createEReference(fla_ZwieschutzEClass, FLA_ZWIESCHUTZ__FLA_ZWIESCHUTZ_ELEMENT);
		createEReference(fla_ZwieschutzEClass, FLA_ZWIESCHUTZ__IDW_ELEMENT);
		createEReference(fla_ZwieschutzEClass, FLA_ZWIESCHUTZ__ZWIESCHUTZ_ART);

		fla_Zwieschutz_Element_AttributeGroupEClass = createEClass(FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP);
		createEReference(fla_Zwieschutz_Element_AttributeGroupEClass, FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__ID_FLA_SCHUTZ_L);
		createEReference(fla_Zwieschutz_Element_AttributeGroupEClass, FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__ID_FLA_SCHUTZ_R);
		createEReference(fla_Zwieschutz_Element_AttributeGroupEClass, FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__MASSNAHME_L);
		createEReference(fla_Zwieschutz_Element_AttributeGroupEClass, FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__MASSNAHME_R);
		createEReference(fla_Zwieschutz_Element_AttributeGroupEClass, FLA_ZWIESCHUTZ_ELEMENT_ATTRIBUTE_GROUP__NACHLAUFVERHINDERUNG);

		massnahme_TypeClassEClass = createEClass(MASSNAHME_TYPE_CLASS);
		createEAttribute(massnahme_TypeClassEClass, MASSNAHME_TYPE_CLASS__WERT);

		nachlaufverhinderung_TypeClassEClass = createEClass(NACHLAUFVERHINDERUNG_TYPE_CLASS);
		createEAttribute(nachlaufverhinderung_TypeClassEClass, NACHLAUFVERHINDERUNG_TYPE_CLASS__WERT);

		zwieschutz_Art_TypeClassEClass = createEClass(ZWIESCHUTZ_ART_TYPE_CLASS);
		createEAttribute(zwieschutz_Art_TypeClassEClass, ZWIESCHUTZ_ART_TYPE_CLASS__WERT);

		// Create enums
		enumFahrtUeberEEnum = createEEnum(ENUM_FAHRT_UEBER);
		enumMassnahmeEEnum = createEEnum(ENUM_MASSNAHME);
		enumZwieschutzArtEEnum = createEEnum(ENUM_ZWIESCHUTZ_ART);

		// Create data types
		enumFahrtUeberObjectEDataType = createEDataType(ENUM_FAHRT_UEBER_OBJECT);
		enumMassnahmeObjectEDataType = createEDataType(ENUM_MASSNAHME_OBJECT);
		enumZwieschutzArtObjectEDataType = createEDataType(ENUM_ZWIESCHUTZ_ART_OBJECT);
		fla_W_Lage_TypeEDataType = createEDataType(FLA_WLAGE_TYPE);
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
		ekW_Kr_Anteil_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fahrt_Ueber_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fla_Freimelde_ZuordnungEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		fla_Raum_Freimeldung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fla_SchutzEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		fla_Signal_Zielsperrung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fla_Verzicht_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fla_W_Lage_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fla_ZwieschutzEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		massnahme_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		nachlaufverhinderung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		zwieschutz_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());

		// Initialize classes and features; add operations and parameters
		initEClass(ekW_Kr_Anteil_TypeClassEClass, EKW_Kr_Anteil_TypeClass.class, "EKW_Kr_Anteil_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEKW_Kr_Anteil_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, EKW_Kr_Anteil_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fahrt_Ueber_TypeClassEClass, Fahrt_Ueber_TypeClass.class, "Fahrt_Ueber_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFahrt_Ueber_TypeClass_Wert(), this.getENUMFahrtUeberObject(), "wert", null, 1, 1, Fahrt_Ueber_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fla_Freimelde_ZuordnungEClass, Fla_Freimelde_Zuordnung.class, "Fla_Freimelde_Zuordnung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFla_Freimelde_Zuordnung_FlaRaumFreimeldung(), this.getFla_Raum_Freimeldung_TypeClass(), null, "flaRaumFreimeldung", null, 1, 1, Fla_Freimelde_Zuordnung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFla_Freimelde_Zuordnung_IDFlaSchutz(), theVerweisePackage.getID_Fla_Schutz_TypeClass(), null, "iDFlaSchutz", null, 1, 1, Fla_Freimelde_Zuordnung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFla_Freimelde_Zuordnung_IDFMAAnlage(), theVerweisePackage.getID_FMA_Anlage_TypeClass(), null, "iDFMAAnlage", null, 1, 1, Fla_Freimelde_Zuordnung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fla_Raum_Freimeldung_TypeClassEClass, Fla_Raum_Freimeldung_TypeClass.class, "Fla_Raum_Freimeldung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFla_Raum_Freimeldung_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Fla_Raum_Freimeldung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fla_SchutzEClass, Fla_Schutz.class, "Fla_Schutz", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFla_Schutz_FlaSchutzAnforderer(), this.getFla_Schutz_Anforderer_AttributeGroup(), null, "flaSchutzAnforderer", null, 1, 1, Fla_Schutz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFla_Schutz_FlaSchutzSignal(), this.getFla_Schutz_Signal_AttributeGroup(), null, "flaSchutzSignal", null, 0, 1, Fla_Schutz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFla_Schutz_FlaSchutzWGsp(), this.getFla_Schutz_W_Gsp_AttributeGroup(), null, "flaSchutzWGsp", null, 0, 1, Fla_Schutz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFla_Schutz_FlaSchutzWeitergabe(), this.getFla_Schutz_Weitergabe_AttributeGroup(), null, "flaSchutzWeitergabe", null, 0, 1, Fla_Schutz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFla_Schutz_FlaVerzicht(), this.getFla_Verzicht_TypeClass(), null, "flaVerzicht", null, 0, 1, Fla_Schutz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fla_Schutz_Anforderer_AttributeGroupEClass, Fla_Schutz_Anforderer_AttributeGroup.class, "Fla_Schutz_Anforderer_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFla_Schutz_Anforderer_AttributeGroup_EKWKrAnteil(), this.getEKW_Kr_Anteil_TypeClass(), null, "eKWKrAnteil", null, 0, 1, Fla_Schutz_Anforderer_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFla_Schutz_Anforderer_AttributeGroup_FahrtUeber(), this.getFahrt_Ueber_TypeClass(), null, "fahrtUeber", null, 0, 1, Fla_Schutz_Anforderer_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFla_Schutz_Anforderer_AttributeGroup_IDAnfordererElement(), theVerweisePackage.getID_Anforderer_Element_TypeClass(), null, "iDAnfordererElement", null, 1, 1, Fla_Schutz_Anforderer_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fla_Schutz_Signal_AttributeGroupEClass, Fla_Schutz_Signal_AttributeGroup.class, "Fla_Schutz_Signal_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFla_Schutz_Signal_AttributeGroup_FlaSignalZielsperrung(), this.getFla_Signal_Zielsperrung_TypeClass(), null, "flaSignalZielsperrung", null, 0, 1, Fla_Schutz_Signal_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFla_Schutz_Signal_AttributeGroup_IDFlaSignal(), theVerweisePackage.getID_Signal_TypeClass(), null, "iDFlaSignal", null, 1, 1, Fla_Schutz_Signal_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fla_Schutz_W_Gsp_AttributeGroupEClass, Fla_Schutz_W_Gsp_AttributeGroup.class, "Fla_Schutz_W_Gsp_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFla_Schutz_W_Gsp_AttributeGroup_FlaWLage(), this.getFla_W_Lage_TypeClass(), null, "flaWLage", null, 0, 1, Fla_Schutz_W_Gsp_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFla_Schutz_W_Gsp_AttributeGroup_IDFlaWGspElement(), theVerweisePackage.getID_W_Kr_Gsp_Element_TypeClass(), null, "iDFlaWGspElement", null, 1, 1, Fla_Schutz_W_Gsp_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fla_Schutz_Weitergabe_AttributeGroupEClass, Fla_Schutz_Weitergabe_AttributeGroup.class, "Fla_Schutz_Weitergabe_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFla_Schutz_Weitergabe_AttributeGroup_IDFlaWeitergabeL(), theVerweisePackage.getID_Fla_Schutz_TypeClass(), null, "iDFlaWeitergabeL", null, 0, 1, Fla_Schutz_Weitergabe_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFla_Schutz_Weitergabe_AttributeGroup_IDFlaWeitergabeR(), theVerweisePackage.getID_Fla_Schutz_TypeClass(), null, "iDFlaWeitergabeR", null, 0, 1, Fla_Schutz_Weitergabe_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fla_Signal_Zielsperrung_TypeClassEClass, Fla_Signal_Zielsperrung_TypeClass.class, "Fla_Signal_Zielsperrung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFla_Signal_Zielsperrung_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Fla_Signal_Zielsperrung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fla_Verzicht_TypeClassEClass, Fla_Verzicht_TypeClass.class, "Fla_Verzicht_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFla_Verzicht_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Fla_Verzicht_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fla_W_Lage_TypeClassEClass, Fla_W_Lage_TypeClass.class, "Fla_W_Lage_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFla_W_Lage_TypeClass_Wert(), this.getFla_W_Lage_Type(), "wert", null, 1, 1, Fla_W_Lage_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fla_ZwieschutzEClass, Fla_Zwieschutz.class, "Fla_Zwieschutz", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFla_Zwieschutz_FlaZwieschutzElement(), this.getFla_Zwieschutz_Element_AttributeGroup(), null, "flaZwieschutzElement", null, 1, 1, Fla_Zwieschutz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFla_Zwieschutz_IDWElement(), theVerweisePackage.getID_W_Kr_Gsp_Element_TypeClass(), null, "iDWElement", null, 1, 1, Fla_Zwieschutz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFla_Zwieschutz_ZwieschutzArt(), this.getZwieschutz_Art_TypeClass(), null, "zwieschutzArt", null, 1, 1, Fla_Zwieschutz.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fla_Zwieschutz_Element_AttributeGroupEClass, Fla_Zwieschutz_Element_AttributeGroup.class, "Fla_Zwieschutz_Element_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFla_Zwieschutz_Element_AttributeGroup_IDFlaSchutzL(), theVerweisePackage.getID_Fla_Schutz_TypeClass(), null, "iDFlaSchutzL", null, 0, 1, Fla_Zwieschutz_Element_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFla_Zwieschutz_Element_AttributeGroup_IDFlaSchutzR(), theVerweisePackage.getID_Fla_Schutz_TypeClass(), null, "iDFlaSchutzR", null, 0, 1, Fla_Zwieschutz_Element_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFla_Zwieschutz_Element_AttributeGroup_MassnahmeL(), this.getMassnahme_TypeClass(), null, "massnahmeL", null, 1, 1, Fla_Zwieschutz_Element_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFla_Zwieschutz_Element_AttributeGroup_MassnahmeR(), this.getMassnahme_TypeClass(), null, "massnahmeR", null, 1, 1, Fla_Zwieschutz_Element_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFla_Zwieschutz_Element_AttributeGroup_Nachlaufverhinderung(), this.getNachlaufverhinderung_TypeClass(), null, "nachlaufverhinderung", null, 1, 1, Fla_Zwieschutz_Element_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(massnahme_TypeClassEClass, Massnahme_TypeClass.class, "Massnahme_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMassnahme_TypeClass_Wert(), this.getENUMMassnahmeObject(), "wert", null, 1, 1, Massnahme_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nachlaufverhinderung_TypeClassEClass, Nachlaufverhinderung_TypeClass.class, "Nachlaufverhinderung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNachlaufverhinderung_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Nachlaufverhinderung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zwieschutz_Art_TypeClassEClass, Zwieschutz_Art_TypeClass.class, "Zwieschutz_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZwieschutz_Art_TypeClass_Wert(), this.getENUMZwieschutzArtObject(), "wert", null, 1, 1, Zwieschutz_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumFahrtUeberEEnum, ENUMFahrtUeber.class, "ENUMFahrtUeber");
		addEEnumLiteral(enumFahrtUeberEEnum, ENUMFahrtUeber.ENUM_FAHRT_UEBER_LINKS);
		addEEnumLiteral(enumFahrtUeberEEnum, ENUMFahrtUeber.ENUM_FAHRT_UEBER_RECHTS);
		addEEnumLiteral(enumFahrtUeberEEnum, ENUMFahrtUeber.ENUM_FAHRT_UEBER_SPITZE);

		initEEnum(enumMassnahmeEEnum, ENUMMassnahme.class, "ENUMMassnahme");
		addEEnumLiteral(enumMassnahmeEEnum, ENUMMassnahme.ENUM_MASSNAHME_ERSATZSCHUTZ);
		addEEnumLiteral(enumMassnahmeEEnum, ENUMMassnahme.ENUM_MASSNAHME_VERSCHLUSS);
		addEEnumLiteral(enumMassnahmeEEnum, ENUMMassnahme.ENUM_MASSNAHME_VERSCHLUSS_ERSATZSCHUTZ);
		addEEnumLiteral(enumMassnahmeEEnum, ENUMMassnahme.ENUM_MASSNAHME_VERZICHT);

		initEEnum(enumZwieschutzArtEEnum, ENUMZwieschutzArt.class, "ENUMZwieschutzArt");
		addEEnumLiteral(enumZwieschutzArtEEnum, ENUMZwieschutzArt.ENUM_ZWIESCHUTZ_ART_ECHT);
		addEEnumLiteral(enumZwieschutzArtEEnum, ENUMZwieschutzArt.ENUM_ZWIESCHUTZ_ART_ECHT_EIGEN);
		addEEnumLiteral(enumZwieschutzArtEEnum, ENUMZwieschutzArt.ENUM_ZWIESCHUTZ_ART_EIGEN);

		// Initialize data types
		initEDataType(enumFahrtUeberObjectEDataType, ENUMFahrtUeber.class, "ENUMFahrtUeberObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumMassnahmeObjectEDataType, ENUMMassnahme.class, "ENUMMassnahmeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumZwieschutzArtObjectEDataType, ENUMZwieschutzArt.class, "ENUMZwieschutzArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fla_W_Lage_TypeEDataType, ENUMLinksRechts.class, "Fla_W_Lage_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (fla_Freimelde_ZuordnungEClass,
		   source,
		   new String[] {
			   "documentation", "Zuordnung der freizupr\u00fcfenden Freimeldeabschnitte zur jeweiligen Flankenschutzma\u00dfnahme. DB-Regelwerk Flankenschutztabelle, Spalte 10 \\\"\u00fcberwachter Schutzraum\\\""
		   });
		addAnnotation
		  (getFla_Freimelde_Zuordnung_FlaRaumFreimeldung(),
		   source,
		   new String[] {
			   "documentation", "Angabe, ob eine Freimeldung des Freimeldeabschnitts im Flankenschutzraum erfolgen soll (true) oder nicht (false). In der Regel werden die Freimeldeabschnitte des Flankenschutzraumes freigemeldet. Im Ausnahmefall kann bei Ersatzschutz auf die Freimeldung verzichtet werden (Lastenheft F1 Abschnitt Z 4.4.10). DB-Regelwerk Das Datum ist im jetzigen PT 1 h\u00f6chstens unformal (Fu\u00dfnote, Erl\u00e4uterungsbericht) enthalten."
		   });
		addAnnotation
		  (getFla_Freimelde_Zuordnung_IDFlaSchutz(),
		   source,
		   new String[] {
			   "documentation", "Zuordnung des Flankenschutzfalls zu den daf\u00fcr freizumeldenden Gleisfreimeldeabschnitten. DB-Regelwerk Flankenschutztabelle, Zeile. "
		   });
		addAnnotation
		  (getFla_Freimelde_Zuordnung_IDFMAAnlage(),
		   source,
		   new String[] {
			   "documentation", "Beschreibung des freizupr\u00fcfenden Flankenschutzraums. DB-Regelwerk Flankenschutztabelle, Spalte 10: \\\"\u00fcberwachter Schutzraum\\\". "
		   });
		addAnnotation
		  (fla_SchutzEClass,
		   source,
		   new String[] {
			   "documentation", "Darstellung der technischen Ma\u00dfnahmen, um Flankenschutz zu gew\u00e4hrleisten. DB-Regelwerk 819.0505 "
		   });
		addAnnotation
		  (getFla_Schutz_FlaVerzicht(),
		   source,
		   new String[] {
			   "documentation", "Auswahl der Ma\u00dfnahme \\\"Verzicht\\\" f\u00fcr den Flankenschutz. Der Flankenschutz wird durch betriebliche Ma\u00dfnahmen hergestellt (mittelbarer Flankenschutz). Die Ma\u00dfnahmen \\\"unmittelbar\\\" und \\\"Weitergabe\\\" sind aus der Bef\u00fcllung anderer Attribute erkennbar, deshalb muss nur die Ma\u00dfnahme \\\"Verzicht\\\" explizit angegeben werden. DB-Regelwerk Flankenschutztabelle, Spalte 8 \\\"Flankenschutzumkehr, Verzicht\\\""
		   });
		addAnnotation
		  (getFla_Schutz_Anforderer_AttributeGroup_EKWKrAnteil(),
		   source,
		   new String[] {
			   "documentation", "Nur bei EKW: Kennzeichnung des Kreuzungsanteils, auf den sich die Flankenschutzbetrachtung bezieht (\\\"true\\\"). Der Wert \\\"false\\\" wird nicht verwendet. Die Zerlegung in Weichen- und Kreuzungsanteile findet nur bei der Flankenschutzbetrachtung f\u00fcr die EKW statt. Je zugeh\u00f6rigem Weichenelement sind damit 4 Inszanzen Fla_Schutz anzulegen (zweimal bezogen auf den Weichenanteil (links/rechts) und zweimal bezogen auf den Kreuzungsanteil (links/rechts)). Die Modellierung der EKW an sich (eine Weichenanlage, zwei Weichenelemente) bleibt hiervon unber\u00fchrt."
		   });
		addAnnotation
		  (getFla_Schutz_Anforderer_AttributeGroup_FahrtUeber(),
		   source,
		   new String[] {
			   "documentation", "Beschreibung des Weichenanschlusses der Flankenschutz anfordernden Weiche. links/rechts: Der linke/rechte Strang der Weiche wird befahren, der jeweils andere sucht Flankenschutz. Spitze: Die nicht durch Verschluss befriedigte Flankenschutzanforderung, die auf eine Zwieschutzweiche trifft, wird \u00fcber die Spitze der Zwieschutzweiche weitergegeben. DB-Regelwerk links/rechts: Flankenschutztabelle, Spalte 1 \\\"Fahrstra\u00dfen \u00fcber\\\"; Spitze: Zwieschutzweichentabelle, indirekt \u00fcber Spalte 4 \\\"Zwieschutzfall-Ma\u00dfnahme\\\", wenn dort \\\"Fernschutz\\\" (eigentlich: Ersatzschutz) oder \\\"Verzicht\\\" ausgew\u00e4hlt ist. "
		   });
		addAnnotation
		  (getFla_Schutz_Anforderer_AttributeGroup_IDAnfordererElement(),
		   source,
		   new String[] {
			   "documentation", "Element, das den Flankenschutz anfordert. Flankenschutz k\u00f6nnen Weichen, Kreuzungen (W Kr Gsp Element) und Nahstellbereiche (NB Zone Grenze) anfordern. Ist bei einer Zwieschutzweiche ein Ersatzschutz geplant, ist die Zwieschutzweiche der Anforderer. DB-Regelwerk Flankenschutztabelle, Spalten 1 \\\"Fahrstra\u00dfen \u00fcber/Nahbedienbezirk\\\" und 2 \\\"Nahbediengrenze\\\""
		   });
		addAnnotation
		  (getFla_Schutz_Signal_AttributeGroup_FlaSignalZielsperrung(),
		   source,
		   new String[] {
			   "documentation", "Belegung des Signals mit einer Zielsperre f\u00fcr Rangierstra\u00dfen, w\u00e4hrend der Beanspruchung als Flankenschutz bietendes Element. Das Attribut ist nur dann sinnvoll f\u00fcllbar, wenn das betreffende Signal Ziel einer Rangierstra\u00dfe ist. Betrieblich wird diese Ma\u00dfnahme \\\"Doppelter Lichtschutz\\\" genannt. DB-Regelwerk Flankenschutztabelle, Fu\u00dfnote"
		   });
		addAnnotation
		  (getFla_Schutz_Signal_AttributeGroup_IDFlaSignal(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf das Signal, das unmittelbar an die Weiche angrenzt und Flankenschutz bietet. Steht das Signal nicht grenzzeichenfrei an der Flankenschutz suchenden Weiche, so wird dies nicht explizit im Datenmodell gespeichert. Stattdessen wird das n\u00e4chste Flankenschutz bietende Element als Flankenschutzma\u00dfnahme geplant. DB-Regelwerk Flankenschutztabelle, Spalte 5 \\\"Hp 0\\\""
		   });
		addAnnotation
		  (getFla_Schutz_W_Gsp_AttributeGroup_FlaWLage(),
		   source,
		   new String[] {
			   "documentation", "Lage der Flankenschutz bietenden Weiche. DB-Regelwerk Flankenschutztabelle, Spalte 3 \\\"Weiche Gs\\\""
		   });
		addAnnotation
		  (getFla_Schutz_W_Gsp_AttributeGroup_IDFlaWGspElement(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die Flankenschutz bietende Weiche oder Gleissperre. DB-Regelwerk Flankenschutztabelle, Spalte 3 \\\"Weiche Gs\\\""
		   });
		addAnnotation
		  (getFla_Schutz_Weitergabe_AttributeGroup_IDFlaWeitergabeL(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die Flankenschutzma\u00dfnahme bei Weitergabe der Flankenschutzanforderung wie bei Fahrt \u00fcber den linken Strang der Flankenschutztransportweiche. DB-Regelwerk Flankenschutztabelle, Spalten 6 \\\"Weitergabe \u00fcber Weiche, Kreuzung\\\" und 7 \\\"wie Fahrt \u00fcber deren Strang\\\" mit Ausf\u00fcllung \\\"L\\\" (Links)"
		   });
		addAnnotation
		  (getFla_Schutz_Weitergabe_AttributeGroup_IDFlaWeitergabeR(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die Flankenschutzma\u00dfnahme bei Weitergabe der Flankenschutzanforderung wie bei Fahrt \u00fcber den rechten Strang der Flankenschutztransportweiche. DB-Regelwerk Flankenschutztabelle, Spalten 6 \\\"Weitergabe \u00fcber Weiche, Kreuzung\\\" und 7 \\\"wie Fahrt \u00fcber deren Strang\\\" mit Ausf\u00fcllung \\\"R\\\" (Rechts)"
		   });
		addAnnotation
		  (fla_ZwieschutzEClass,
		   source,
		   new String[] {
			   "documentation", "Beschreibung der Verhaltensweise einer Zwieschutzweiche, wenn sie gleichzeitig in beiden Stellungen f\u00fcr den Flankenschutz angefordert wird. DB-Regelwerk Zwieschutzweichentabelle"
		   });
		addAnnotation
		  (getFla_Zwieschutz_IDWElement(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die Zwieschutzweiche. DB-Regelwerk Fla Zwieschutz: Zwieschutzweichentabelle, Spalte 1: \\\"Weiche/Kreuzung in angeforderter Weichenstellung\\\""
		   });
		addAnnotation
		  (getFla_Zwieschutz_ZwieschutzArt(),
		   source,
		   new String[] {
			   "documentation", "Charakter der Zwieschutzweiche. Echte Zwieschutzweiche: Flankenschutzweiche, die durch unabh\u00e4ngige Fahrten in beiden Stellungen angefordert wird. Ohne spezielle Behandlung kann nur eine der beiden Fahrten zu einem Zeitpunkt eingestellt sein, da sich durch die Zwieschutzweiche ein Fahrstra\u00dfenausschluss ergibt. Eigenzwieschutzweiche: Flankenschutzweiche, die durch die gleiche Fahrt in beiden Stellungen angefordert wird. Ohne spezielle Behandlung kann die Fahrt nicht eingestellt werden. Eine Zwieschutzweiche kann gleichzeitig beide Charaktere annehmen. DB-Regelwerk Zwieschutzweichentabelle, Spalte 2 \\\"Zwieschutzweiche - Eigen\\\" und Spalte 3 \\\"Zwieschutzweiche - Echt\\\""
		   });
		addAnnotation
		  (getFla_Zwieschutz_Element_AttributeGroup_IDFlaSchutzL(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die Ersatzschutzma\u00dfnahme bei Ersatzschutz und Anforderung in Linkslage. DB-Regelwerk Zwieschutzweichentabelle, Spalten 5...7 \\\"direkt anschlie\u00dfender Flankenschutz\\\" und 8...9 \\\"Flankenschutz\\\""
		   });
		addAnnotation
		  (getFla_Zwieschutz_Element_AttributeGroup_IDFlaSchutzR(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die Ersatzschutzma\u00dfnahme bei Ersatzschutz und Anforderung in Rechtslage. DB-Regelwerk Zwieschutzweichentabelle, Spalten 5...7 \\\"direkt anschlie\u00dfender Flankenschutz\\\" und 8...9 \\\"Flankenschutz\\\""
		   });
		addAnnotation
		  (getFla_Zwieschutz_Element_AttributeGroup_MassnahmeL(),
		   source,
		   new String[] {
			   "documentation", "Ma\u00dfnahme, durch die der Flankenschutz im linken Strang der Zwieschutzweiche hergestellt wird. Ersatzschutz: Der Flankenschutz wird durch das n\u00e4chste Flankenschutzelement hergestellt. Verschluss: Die Flankenschutzweiche wird in der Linkslage verschlossen. Verzicht: Der Flankenschutz wird durch betriebliche Ma\u00dfnahmen hergestellt; technisch wird darauf verzichtet. Verschluss/Ersatzschutz: Der Wert bildet den Planungsfall ab, dass die Flankenschutzanforderungen an die Zwieschutzweiche von gleichberechtigten Fahrstra\u00dfen kommen und damit planerisch keine feste Zuweisung von Verschluss und Ersatzschutz erfolgt. Der ENUM-Wert ist also im Sinne \u201eVerschluss oder Ersatzschutz\u201c zu interpretieren. In der Praxis bedeutet dies, dass die Fahrstra\u00dfe, die zuerst eingestellt wird, den direkten Flankenschutz und die als zweite eingestellte Fahrstra\u00dfe den Ersatzschutz erh\u00e4lt. \nDie Ma\u00dfnahmen beziehen sich nur auf den Zwieschutzfall. Wird die Weiche nur in einem Strang angefordert, wird sie regul\u00e4r Flankenschutz bieten, wie es in der Flankenschutzplanung vorgesehen ist. DB-Regelwerk Zwieschutzweichentabelle, Spalte 4 \\\"Zwieschutzfall-Ma\u00dfnahme\\\""
		   });
		addAnnotation
		  (getFla_Zwieschutz_Element_AttributeGroup_MassnahmeR(),
		   source,
		   new String[] {
			   "documentation", "Ma\u00dfnahme, durch die der Flankenschutz im rechten Strang der Zwieschutzweiche hergestellt wird. Ersatzschutz: Der Flankenschutz wird durch das n\u00e4chste Flankenschutzelement hergestellt. Verschluss: Die Flankenschutzweiche wird in der Rechtslage verschlossen. Verzicht: Der Flankenschutz wird durch betriebliche Ma\u00dfnahmen hergestellt; technisch wird darauf verzichtet. Verschluss/Ersatzschutz: Der Wert bildet den Planungsfall ab, dass die Flankenschutzanforderungen an die Zwieschutzweiche von gleichberechtigten Fahrstra\u00dfen kommen und damit planerisch keine feste Zuweisung von Verschluss und Ersatzschutz erfolgt. Der ENUM-Wert ist also im Sinne \u201eVerschluss oder Ersatzschutz\u201c zu interpretieren. In der Praxis bedeutet dies, dass die Fahrstra\u00dfe, die zuerst eingestellt wird, den direkten Flankenschutz und die als zweite eingestellte Fahrstra\u00dfe den Ersatzchutz erh\u00e4lt. Die Ma\u00dfnahmen beziehen sich nur auf den Zwieschutzfall. Wird die Weiche nur in einem Strang angefordert, wird sie regul\u00e4r Flankenschutz bieten, wie es in der Flankenschutzplanung vorgesehen ist. \nDB-Regelwerk Zwieschutzweichentabelle, Spalte 4 \\\"Zwieschutzfall-Ma\u00dfnahme\\\""
		   });
		addAnnotation
		  (getFla_Zwieschutz_Element_AttributeGroup_Nachlaufverhinderung(),
		   source,
		   new String[] {
			   "documentation", "Das Nachlaufen der Weiche wird verhindert, wenn die Flankenschutzanforderung, f\u00fcr die der Verschluss projektiert ist, nicht mehr besteht. In der Regel wird f\u00fcr Eigenzwieschutzweichen die Nachlaufverhinderung projektiert. DB-Regelwerk Zwieschutzweichentabelle, Spalten 10 und 11 \\\"Zwieschutzweiche mit/ohne Nachlaufverhinderung\\\""
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
		  (ekW_Kr_Anteil_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCEKW_Kr_Anteil",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEKW_Kr_Anteil_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (enumFahrtUeberEEnum,
		   source,
		   new String[] {
			   "name", "ENUMFahrt_Ueber"
		   });
		addAnnotation
		  (enumFahrtUeberObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMFahrt_Ueber:Object",
			   "baseType", "ENUMFahrt_Ueber"
		   });
		addAnnotation
		  (enumMassnahmeEEnum,
		   source,
		   new String[] {
			   "name", "ENUMMassnahme"
		   });
		addAnnotation
		  (enumMassnahmeObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMMassnahme:Object",
			   "baseType", "ENUMMassnahme"
		   });
		addAnnotation
		  (enumZwieschutzArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMZwieschutz_Art"
		   });
		addAnnotation
		  (enumZwieschutzArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMZwieschutz_Art:Object",
			   "baseType", "ENUMZwieschutz_Art"
		   });
		addAnnotation
		  (fahrt_Ueber_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFahrt_Ueber",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFahrt_Ueber_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fla_Freimelde_ZuordnungEClass,
		   source,
		   new String[] {
			   "name", "CFla_Freimelde_Zuordnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFla_Freimelde_Zuordnung_FlaRaumFreimeldung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fla_Raum_Freimeldung"
		   });
		addAnnotation
		  (getFla_Freimelde_Zuordnung_IDFlaSchutz(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Fla_Schutz"
		   });
		addAnnotation
		  (getFla_Freimelde_Zuordnung_IDFMAAnlage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_FMA_Anlage"
		   });
		addAnnotation
		  (fla_Raum_Freimeldung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFla_Raum_Freimeldung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFla_Raum_Freimeldung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fla_SchutzEClass,
		   source,
		   new String[] {
			   "name", "CFla_Schutz",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFla_Schutz_FlaSchutzAnforderer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fla_Schutz_Anforderer"
		   });
		addAnnotation
		  (getFla_Schutz_FlaSchutzSignal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fla_Schutz_Signal"
		   });
		addAnnotation
		  (getFla_Schutz_FlaSchutzWGsp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fla_Schutz_W_Gsp"
		   });
		addAnnotation
		  (getFla_Schutz_FlaSchutzWeitergabe(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fla_Schutz_Weitergabe"
		   });
		addAnnotation
		  (getFla_Schutz_FlaVerzicht(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fla_Verzicht"
		   });
		addAnnotation
		  (fla_Schutz_Anforderer_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CFla_Schutz_Anforderer",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFla_Schutz_Anforderer_AttributeGroup_EKWKrAnteil(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "EKW_Kr_Anteil"
		   });
		addAnnotation
		  (getFla_Schutz_Anforderer_AttributeGroup_FahrtUeber(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fahrt_Ueber"
		   });
		addAnnotation
		  (getFla_Schutz_Anforderer_AttributeGroup_IDAnfordererElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Anforderer_Element"
		   });
		addAnnotation
		  (fla_Schutz_Signal_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CFla_Schutz_Signal",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFla_Schutz_Signal_AttributeGroup_FlaSignalZielsperrung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fla_Signal_Zielsperrung"
		   });
		addAnnotation
		  (getFla_Schutz_Signal_AttributeGroup_IDFlaSignal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Fla_Signal"
		   });
		addAnnotation
		  (fla_Schutz_W_Gsp_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CFla_Schutz_W_Gsp",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFla_Schutz_W_Gsp_AttributeGroup_FlaWLage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fla_W_Lage"
		   });
		addAnnotation
		  (getFla_Schutz_W_Gsp_AttributeGroup_IDFlaWGspElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Fla_W_Gsp_Element"
		   });
		addAnnotation
		  (fla_Schutz_Weitergabe_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CFla_Schutz_Weitergabe",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFla_Schutz_Weitergabe_AttributeGroup_IDFlaWeitergabeL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Fla_Weitergabe_L"
		   });
		addAnnotation
		  (getFla_Schutz_Weitergabe_AttributeGroup_IDFlaWeitergabeR(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Fla_Weitergabe_R"
		   });
		addAnnotation
		  (fla_Signal_Zielsperrung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFla_Signal_Zielsperrung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFla_Signal_Zielsperrung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fla_Verzicht_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFla_Verzicht",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFla_Verzicht_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fla_W_Lage_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TFla_W_Lage",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TLinksRechts"
		   });
		addAnnotation
		  (fla_W_Lage_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFla_W_Lage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFla_W_Lage_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (fla_ZwieschutzEClass,
		   source,
		   new String[] {
			   "name", "CFla_Zwieschutz",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFla_Zwieschutz_FlaZwieschutzElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fla_Zwieschutz_Element"
		   });
		addAnnotation
		  (getFla_Zwieschutz_IDWElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_W_Element"
		   });
		addAnnotation
		  (getFla_Zwieschutz_ZwieschutzArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Zwieschutz_Art"
		   });
		addAnnotation
		  (fla_Zwieschutz_Element_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CFla_Zwieschutz_Element",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFla_Zwieschutz_Element_AttributeGroup_IDFlaSchutzL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Fla_Schutz_L"
		   });
		addAnnotation
		  (getFla_Zwieschutz_Element_AttributeGroup_IDFlaSchutzR(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Fla_Schutz_R"
		   });
		addAnnotation
		  (getFla_Zwieschutz_Element_AttributeGroup_MassnahmeL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Massnahme_L"
		   });
		addAnnotation
		  (getFla_Zwieschutz_Element_AttributeGroup_MassnahmeR(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Massnahme_R"
		   });
		addAnnotation
		  (getFla_Zwieschutz_Element_AttributeGroup_Nachlaufverhinderung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Nachlaufverhinderung"
		   });
		addAnnotation
		  (massnahme_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCMassnahme",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMassnahme_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (nachlaufverhinderung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCNachlaufverhinderung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNachlaufverhinderung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (zwieschutz_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCZwieschutz_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZwieschutz_Art_TypeClass_Wert(),
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
		  (fla_Freimelde_ZuordnungEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getFla_Freimelde_Zuordnung_FlaRaumFreimeldung(),
		   source,
		   new String[] {
			   "appinfo", "\n                          \n  <ppi:WorkflowInformation>\n                               \n    <ppi:ProposedValue>true</ppi:ProposedValue>\n                            \n  </ppi:WorkflowInformation>\n                       \n"
		   });
		addAnnotation
		  (fla_SchutzEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getFla_Schutz_Anforderer_AttributeGroup_EKWKrAnteil(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>true</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getFla_Schutz_Signal_AttributeGroup_FlaSignalZielsperrung(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>false</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (fla_ZwieschutzEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getFla_Zwieschutz_Element_AttributeGroup_Nachlaufverhinderung(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>true</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
	}

} //FlankenschutzPackageImpl
