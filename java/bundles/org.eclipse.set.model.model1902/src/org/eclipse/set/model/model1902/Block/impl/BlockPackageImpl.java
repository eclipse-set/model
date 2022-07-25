/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Block.impl;

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

import org.eclipse.set.model.model1902.Ansteuerung_Element.Ansteuerung_ElementPackage;

import org.eclipse.set.model.model1902.Ansteuerung_Element.impl.Ansteuerung_ElementPackageImpl;

import org.eclipse.set.model.model1902.Bahnsteig.BahnsteigPackage;

import org.eclipse.set.model.model1902.Bahnsteig.impl.BahnsteigPackageImpl;

import org.eclipse.set.model.model1902.Bahnuebergang.BahnuebergangPackage;

import org.eclipse.set.model.model1902.Bahnuebergang.impl.BahnuebergangPackageImpl;

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.Balisentechnik_ETCSPackage;

import org.eclipse.set.model.model1902.Balisentechnik_ETCS.impl.Balisentechnik_ETCSPackageImpl;

import org.eclipse.set.model.model1902.BasisTypen.BasisTypenPackage;

import org.eclipse.set.model.model1902.BasisTypen.impl.BasisTypenPackageImpl;

import org.eclipse.set.model.model1902.Basisobjekte.BasisobjektePackage;

import org.eclipse.set.model.model1902.Basisobjekte.impl.BasisobjektePackageImpl;

import org.eclipse.set.model.model1902.Bedienung.BedienungPackage;

import org.eclipse.set.model.model1902.Bedienung.impl.BedienungPackageImpl;

import org.eclipse.set.model.model1902.Block.Auto_Erlaubnisholen_TypeClass;
import org.eclipse.set.model.model1902.Block.Auto_Erlaubnisruecklauf_TypeClass;
import org.eclipse.set.model.model1902.Block.Betriebsfuehrung_TypeClass;
import org.eclipse.set.model.model1902.Block.BlockFactory;
import org.eclipse.set.model.model1902.Block.BlockPackage;
import org.eclipse.set.model.model1902.Block.Block_Anlage;
import org.eclipse.set.model.model1902.Block.Block_Anlage_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Block.Block_Bauform_TypeClass;
import org.eclipse.set.model.model1902.Block.Block_Element;
import org.eclipse.set.model.model1902.Block.Block_Element_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Block.Block_Element_Erlaubnis_AttributeGroup;
import org.eclipse.set.model.model1902.Block.Block_Strecke;
import org.eclipse.set.model.model1902.Block.Block_Strecke_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Block.Bremsweg_TypeClass;
import org.eclipse.set.model.model1902.Block.ENUMBetriebsfuehrung;
import org.eclipse.set.model.model1902.Block.ENUMBlockBauform;
import org.eclipse.set.model.model1902.Block.ENUMSchaltung;
import org.eclipse.set.model.model1902.Block.ENUMStreckeArt;
import org.eclipse.set.model.model1902.Block.Entwurfsgeschwindigkeit_TypeClass;
import org.eclipse.set.model.model1902.Block.Erlaubnis_Staendig_Vorhanden_TypeClass;
import org.eclipse.set.model.model1902.Block.Erlaubnisabgabespeicherung_TypeClass;
import org.eclipse.set.model.model1902.Block.Erlaubnisholen_TypeClass;
import org.eclipse.set.model.model1902.Block.Rueckblockwecker_TypeClass;
import org.eclipse.set.model.model1902.Block.Schaltung_TypeClass;
import org.eclipse.set.model.model1902.Block.Schutzuebertrager_TypeClass;
import org.eclipse.set.model.model1902.Block.Strecke_Art_TypeClass;
import org.eclipse.set.model.model1902.Block.Traktion_Art_TypeClass;
import org.eclipse.set.model.model1902.Block.Vorblockwecker_TypeClass;
import org.eclipse.set.model.model1902.Block.Zugbeeinflussung_Art_TypeClass;
import org.eclipse.set.model.model1902.Block.Zusatzinformation_TypeClass;

import org.eclipse.set.model.model1902.Block.util.BlockValidator;

import org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage;

import org.eclipse.set.model.model1902.Fahrstrasse.impl.FahrstrassePackageImpl;

import org.eclipse.set.model.model1902.Flankenschutz.FlankenschutzPackage;

import org.eclipse.set.model.model1902.Flankenschutz.impl.FlankenschutzPackageImpl;

import org.eclipse.set.model.model1902.Geodaten.GeodatenPackage;

import org.eclipse.set.model.model1902.Geodaten.impl.GeodatenPackageImpl;

import org.eclipse.set.model.model1902.Gleis.GleisPackage;

import org.eclipse.set.model.model1902.Gleis.impl.GleisPackageImpl;

import org.eclipse.set.model.model1902.Medien_und_Trassen.Medien_und_TrassenPackage;

import org.eclipse.set.model.model1902.Medien_und_Trassen.impl.Medien_und_TrassenPackageImpl;

import org.eclipse.set.model.model1902.Nahbedienbereich.NahbedienbereichPackage;

import org.eclipse.set.model.model1902.Nahbedienbereich.impl.NahbedienbereichPackageImpl;

import org.eclipse.set.model.model1902.Ortung.OrtungPackage;

import org.eclipse.set.model.model1902.Ortung.impl.OrtungPackageImpl;

import org.eclipse.set.model.model1902.PZB.PZBPackage;

import org.eclipse.set.model.model1902.PZB.impl.PZBPackageImpl;

import org.eclipse.set.model.model1902.PlanPro.PlanProPackage;

import org.eclipse.set.model.model1902.PlanPro.impl.PlanProPackageImpl;

import org.eclipse.set.model.model1902.Regelzeichnung.RegelzeichnungPackage;

import org.eclipse.set.model.model1902.Regelzeichnung.impl.RegelzeichnungPackageImpl;

import org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage;

import org.eclipse.set.model.model1902.Schluesselabhaengigkeiten.impl.SchluesselabhaengigkeitenPackageImpl;

import org.eclipse.set.model.model1902.Signalbegriffe_Struktur.Signalbegriffe_StrukturPackage;

import org.eclipse.set.model.model1902.Signalbegriffe_Struktur.impl.Signalbegriffe_StrukturPackageImpl;

import org.eclipse.set.model.model1902.Signale.SignalePackage;

import org.eclipse.set.model.model1902.Signale.impl.SignalePackageImpl;

import org.eclipse.set.model.model1902.Verweise.VerweisePackage;

import org.eclipse.set.model.model1902.Verweise.impl.VerweisePackageImpl;

import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.Weichen_und_GleissperrenPackage;

import org.eclipse.set.model.model1902.Weichen_und_Gleissperren.impl.Weichen_und_GleissperrenPackageImpl;

import org.eclipse.set.model.model1902.Zuglenkung.ZuglenkungPackage;

import org.eclipse.set.model.model1902.Zuglenkung.impl.ZuglenkungPackageImpl;

import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZugnummernmeldeanlagePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BlockPackageImpl extends EPackageImpl implements BlockPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auto_Erlaubnisholen_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auto_Erlaubnisruecklauf_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass betriebsfuehrung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass block_AnlageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass block_Anlage_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass block_Bauform_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass block_ElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass block_Element_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass block_Element_Erlaubnis_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass block_StreckeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass block_Strecke_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bremsweg_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entwurfsgeschwindigkeit_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erlaubnis_Staendig_Vorhanden_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erlaubnisabgabespeicherung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass erlaubnisholen_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rueckblockwecker_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schaltung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schutzuebertrager_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass strecke_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass traktion_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vorblockwecker_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zugbeeinflussung_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zusatzinformation_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumBetriebsfuehrungEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumBlockBauformEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumSchaltungEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumStreckeArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType entwurfsgeschwindigkeit_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumBetriebsfuehrungObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumBlockBauformObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumSchaltungObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumStreckeArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType zusatzinformation_TypeEDataType = null;

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
	 * @see org.eclipse.set.model.model1902.Block.BlockPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BlockPackageImpl() {
		super(eNS_URI, BlockFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BlockPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BlockPackage init() {
		if (isInited) return (BlockPackage)EPackage.Registry.INSTANCE.getEPackage(BlockPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBlockPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BlockPackageImpl theBlockPackage = registeredBlockPackage instanceof BlockPackageImpl ? (BlockPackageImpl)registeredBlockPackage : new BlockPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(NahbedienbereichPackage.eNS_URI);
		NahbedienbereichPackageImpl theNahbedienbereichPackage = (NahbedienbereichPackageImpl)(registeredPackage instanceof NahbedienbereichPackageImpl ? registeredPackage : NahbedienbereichPackage.eINSTANCE);
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

		// Load packages
		thePlanProPackage.loadPackage();
		theBalisentechnik_ETCSPackage.loadPackage();
		theBahnuebergangPackage.loadPackage();

		// Create package meta-data objects
		theBlockPackage.createPackageContents();
		theBasisobjektePackage.createPackageContents();
		theBasisTypenPackage.createPackageContents();
		theVerweisePackage.createPackageContents();
		theAnsteuerung_ElementPackage.createPackageContents();
		theBahnsteigPackage.createPackageContents();
		theBedienungPackage.createPackageContents();
		theFlankenschutzPackage.createPackageContents();
		theOrtungPackage.createPackageContents();
		theFahrstrassePackage.createPackageContents();
		theGeodatenPackage.createPackageContents();
		theWeichen_und_GleissperrenPackage.createPackageContents();
		theGleisPackage.createPackageContents();
		theMedien_und_TrassenPackage.createPackageContents();
		theNahbedienbereichPackage.createPackageContents();
		thePZBPackage.createPackageContents();
		theRegelzeichnungPackage.createPackageContents();
		theSchluesselabhaengigkeitenPackage.createPackageContents();
		theSignalePackage.createPackageContents();
		theSignalbegriffe_StrukturPackage.createPackageContents();
		theZuglenkungPackage.createPackageContents();
		theZugnummernmeldeanlagePackage.createPackageContents();

		// Initialize created meta-data
		theBlockPackage.initializePackageContents();
		theBasisobjektePackage.initializePackageContents();
		theBasisTypenPackage.initializePackageContents();
		theVerweisePackage.initializePackageContents();
		theAnsteuerung_ElementPackage.initializePackageContents();
		theBahnsteigPackage.initializePackageContents();
		theBedienungPackage.initializePackageContents();
		theFlankenschutzPackage.initializePackageContents();
		theOrtungPackage.initializePackageContents();
		theFahrstrassePackage.initializePackageContents();
		theGeodatenPackage.initializePackageContents();
		theWeichen_und_GleissperrenPackage.initializePackageContents();
		theGleisPackage.initializePackageContents();
		theMedien_und_TrassenPackage.initializePackageContents();
		theNahbedienbereichPackage.initializePackageContents();
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

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theBlockPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return BlockValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theBlockPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BlockPackage.eNS_URI, theBlockPackage);
		return theBlockPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuto_Erlaubnisholen_TypeClass() {
		return auto_Erlaubnisholen_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuto_Erlaubnisholen_TypeClass_Wert() {
		return (EAttribute)auto_Erlaubnisholen_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuto_Erlaubnisruecklauf_TypeClass() {
		return auto_Erlaubnisruecklauf_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAuto_Erlaubnisruecklauf_TypeClass_Wert() {
		return (EAttribute)auto_Erlaubnisruecklauf_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBetriebsfuehrung_TypeClass() {
		return betriebsfuehrung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBetriebsfuehrung_TypeClass_Wert() {
		return (EAttribute)betriebsfuehrung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlock_Anlage() {
		return block_AnlageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Anlage_BlockAnlageAllg() {
		return (EReference)block_AnlageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Anlage_IDBlockElementA() {
		return (EReference)block_AnlageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Anlage_IDBlockElementB() {
		return (EReference)block_AnlageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Anlage_IDGleisBezeichnung() {
		return (EReference)block_AnlageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlock_Anlage_Allg_AttributeGroup() {
		return block_Anlage_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Anlage_Allg_AttributeGroup_Schaltung() {
		return (EReference)block_Anlage_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Anlage_Allg_AttributeGroup_Schutzuebertrager() {
		return (EReference)block_Anlage_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlock_Bauform_TypeClass() {
		return block_Bauform_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBlock_Bauform_TypeClass_Wert() {
		return (EAttribute)block_Bauform_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlock_Element() {
		return block_ElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Element_BlockElementAllg() {
		return (EReference)block_ElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Element_BlockElementErlaubnis() {
		return (EReference)block_ElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Element_IDBlockStrecke() {
		return (EReference)block_ElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Element_IDRaeumungspruefung() {
		return (EReference)block_ElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Element_IDSignal() {
		return (EReference)block_ElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Element_IDZugschlussmeldung() {
		return (EReference)block_ElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlock_Element_Allg_AttributeGroup() {
		return block_Element_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Element_Allg_AttributeGroup_BlockBauform() {
		return (EReference)block_Element_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Element_Allg_AttributeGroup_Rueckblockwecker() {
		return (EReference)block_Element_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Element_Allg_AttributeGroup_Vorblockwecker() {
		return (EReference)block_Element_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlock_Element_Erlaubnis_AttributeGroup() {
		return block_Element_Erlaubnis_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Element_Erlaubnis_AttributeGroup_AutoErlaubnisholen() {
		return (EReference)block_Element_Erlaubnis_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Element_Erlaubnis_AttributeGroup_AutoErlaubnisruecklauf() {
		return (EReference)block_Element_Erlaubnis_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Element_Erlaubnis_AttributeGroup_ErlaubnisStaendigVorhanden() {
		return (EReference)block_Element_Erlaubnis_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Element_Erlaubnis_AttributeGroup_Erlaubnisabgabespeicherung() {
		return (EReference)block_Element_Erlaubnis_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Element_Erlaubnis_AttributeGroup_Erlaubnisholen() {
		return (EReference)block_Element_Erlaubnis_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlock_Strecke() {
		return block_StreckeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Strecke_BlockStreckeAllg() {
		return (EReference)block_StreckeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Strecke_IDBetriebsstelleNachbar() {
		return (EReference)block_StreckeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Strecke_IDKnotenbahnhof() {
		return (EReference)block_StreckeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Strecke_IDStrecke() {
		return (EReference)block_StreckeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlock_Strecke_Allg_AttributeGroup() {
		return block_Strecke_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Strecke_Allg_AttributeGroup_Betriebsfuehrung() {
		return (EReference)block_Strecke_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Strecke_Allg_AttributeGroup_Bremsweg() {
		return (EReference)block_Strecke_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Strecke_Allg_AttributeGroup_Entwurfsgeschwindigkeit() {
		return (EReference)block_Strecke_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Strecke_Allg_AttributeGroup_StreckeArt() {
		return (EReference)block_Strecke_Allg_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Strecke_Allg_AttributeGroup_TraktionArt() {
		return (EReference)block_Strecke_Allg_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Strecke_Allg_AttributeGroup_ZugbeeinflussungArt() {
		return (EReference)block_Strecke_Allg_AttributeGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlock_Strecke_Allg_AttributeGroup_Zusatzinformation() {
		return (EReference)block_Strecke_Allg_AttributeGroupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBremsweg_TypeClass() {
		return bremsweg_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBremsweg_TypeClass_Wert() {
		return (EAttribute)bremsweg_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEntwurfsgeschwindigkeit_TypeClass() {
		return entwurfsgeschwindigkeit_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEntwurfsgeschwindigkeit_TypeClass_Wert() {
		return (EAttribute)entwurfsgeschwindigkeit_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getErlaubnis_Staendig_Vorhanden_TypeClass() {
		return erlaubnis_Staendig_Vorhanden_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getErlaubnis_Staendig_Vorhanden_TypeClass_Wert() {
		return (EAttribute)erlaubnis_Staendig_Vorhanden_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getErlaubnisabgabespeicherung_TypeClass() {
		return erlaubnisabgabespeicherung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getErlaubnisabgabespeicherung_TypeClass_Wert() {
		return (EAttribute)erlaubnisabgabespeicherung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getErlaubnisholen_TypeClass() {
		return erlaubnisholen_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getErlaubnisholen_TypeClass_Wert() {
		return (EAttribute)erlaubnisholen_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRueckblockwecker_TypeClass() {
		return rueckblockwecker_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRueckblockwecker_TypeClass_Wert() {
		return (EAttribute)rueckblockwecker_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchaltung_TypeClass() {
		return schaltung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchaltung_TypeClass_Wert() {
		return (EAttribute)schaltung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchutzuebertrager_TypeClass() {
		return schutzuebertrager_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchutzuebertrager_TypeClass_Wert() {
		return (EAttribute)schutzuebertrager_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStrecke_Art_TypeClass() {
		return strecke_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStrecke_Art_TypeClass_Wert() {
		return (EAttribute)strecke_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTraktion_Art_TypeClass() {
		return traktion_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTraktion_Art_TypeClass_Wert() {
		return (EAttribute)traktion_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVorblockwecker_TypeClass() {
		return vorblockwecker_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVorblockwecker_TypeClass_Wert() {
		return (EAttribute)vorblockwecker_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZugbeeinflussung_Art_TypeClass() {
		return zugbeeinflussung_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZugbeeinflussung_Art_TypeClass_Wert() {
		return (EAttribute)zugbeeinflussung_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZusatzinformation_TypeClass() {
		return zusatzinformation_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZusatzinformation_TypeClass_Wert() {
		return (EAttribute)zusatzinformation_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMBetriebsfuehrung() {
		return enumBetriebsfuehrungEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMBlockBauform() {
		return enumBlockBauformEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMSchaltung() {
		return enumSchaltungEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMStreckeArt() {
		return enumStreckeArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEntwurfsgeschwindigkeit_Type() {
		return entwurfsgeschwindigkeit_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMBetriebsfuehrungObject() {
		return enumBetriebsfuehrungObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMBlockBauformObject() {
		return enumBlockBauformObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMSchaltungObject() {
		return enumSchaltungObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMStreckeArtObject() {
		return enumStreckeArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getZusatzinformation_Type() {
		return zusatzinformation_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockFactory getBlockFactory() {
		return (BlockFactory)getEFactoryInstance();
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
		auto_Erlaubnisholen_TypeClassEClass = createEClass(AUTO_ERLAUBNISHOLEN_TYPE_CLASS);
		createEAttribute(auto_Erlaubnisholen_TypeClassEClass, AUTO_ERLAUBNISHOLEN_TYPE_CLASS__WERT);

		auto_Erlaubnisruecklauf_TypeClassEClass = createEClass(AUTO_ERLAUBNISRUECKLAUF_TYPE_CLASS);
		createEAttribute(auto_Erlaubnisruecklauf_TypeClassEClass, AUTO_ERLAUBNISRUECKLAUF_TYPE_CLASS__WERT);

		betriebsfuehrung_TypeClassEClass = createEClass(BETRIEBSFUEHRUNG_TYPE_CLASS);
		createEAttribute(betriebsfuehrung_TypeClassEClass, BETRIEBSFUEHRUNG_TYPE_CLASS__WERT);

		block_AnlageEClass = createEClass(BLOCK_ANLAGE);
		createEReference(block_AnlageEClass, BLOCK_ANLAGE__BLOCK_ANLAGE_ALLG);
		createEReference(block_AnlageEClass, BLOCK_ANLAGE__ID_BLOCK_ELEMENT_A);
		createEReference(block_AnlageEClass, BLOCK_ANLAGE__ID_BLOCK_ELEMENT_B);
		createEReference(block_AnlageEClass, BLOCK_ANLAGE__ID_GLEIS_BEZEICHNUNG);

		block_Anlage_Allg_AttributeGroupEClass = createEClass(BLOCK_ANLAGE_ALLG_ATTRIBUTE_GROUP);
		createEReference(block_Anlage_Allg_AttributeGroupEClass, BLOCK_ANLAGE_ALLG_ATTRIBUTE_GROUP__SCHALTUNG);
		createEReference(block_Anlage_Allg_AttributeGroupEClass, BLOCK_ANLAGE_ALLG_ATTRIBUTE_GROUP__SCHUTZUEBERTRAGER);

		block_Bauform_TypeClassEClass = createEClass(BLOCK_BAUFORM_TYPE_CLASS);
		createEAttribute(block_Bauform_TypeClassEClass, BLOCK_BAUFORM_TYPE_CLASS__WERT);

		block_ElementEClass = createEClass(BLOCK_ELEMENT);
		createEReference(block_ElementEClass, BLOCK_ELEMENT__BLOCK_ELEMENT_ALLG);
		createEReference(block_ElementEClass, BLOCK_ELEMENT__BLOCK_ELEMENT_ERLAUBNIS);
		createEReference(block_ElementEClass, BLOCK_ELEMENT__ID_BLOCK_STRECKE);
		createEReference(block_ElementEClass, BLOCK_ELEMENT__ID_RAEUMUNGSPRUEFUNG);
		createEReference(block_ElementEClass, BLOCK_ELEMENT__ID_SIGNAL);
		createEReference(block_ElementEClass, BLOCK_ELEMENT__ID_ZUGSCHLUSSMELDUNG);

		block_Element_Allg_AttributeGroupEClass = createEClass(BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP);
		createEReference(block_Element_Allg_AttributeGroupEClass, BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__BLOCK_BAUFORM);
		createEReference(block_Element_Allg_AttributeGroupEClass, BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__RUECKBLOCKWECKER);
		createEReference(block_Element_Allg_AttributeGroupEClass, BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP__VORBLOCKWECKER);

		block_Element_Erlaubnis_AttributeGroupEClass = createEClass(BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP);
		createEReference(block_Element_Erlaubnis_AttributeGroupEClass, BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__AUTO_ERLAUBNISHOLEN);
		createEReference(block_Element_Erlaubnis_AttributeGroupEClass, BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__AUTO_ERLAUBNISRUECKLAUF);
		createEReference(block_Element_Erlaubnis_AttributeGroupEClass, BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNIS_STAENDIG_VORHANDEN);
		createEReference(block_Element_Erlaubnis_AttributeGroupEClass, BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNISABGABESPEICHERUNG);
		createEReference(block_Element_Erlaubnis_AttributeGroupEClass, BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP__ERLAUBNISHOLEN);

		block_StreckeEClass = createEClass(BLOCK_STRECKE);
		createEReference(block_StreckeEClass, BLOCK_STRECKE__BLOCK_STRECKE_ALLG);
		createEReference(block_StreckeEClass, BLOCK_STRECKE__ID_BETRIEBSSTELLE_NACHBAR);
		createEReference(block_StreckeEClass, BLOCK_STRECKE__ID_KNOTENBAHNHOF);
		createEReference(block_StreckeEClass, BLOCK_STRECKE__ID_STRECKE);

		block_Strecke_Allg_AttributeGroupEClass = createEClass(BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP);
		createEReference(block_Strecke_Allg_AttributeGroupEClass, BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__BETRIEBSFUEHRUNG);
		createEReference(block_Strecke_Allg_AttributeGroupEClass, BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__BREMSWEG);
		createEReference(block_Strecke_Allg_AttributeGroupEClass, BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ENTWURFSGESCHWINDIGKEIT);
		createEReference(block_Strecke_Allg_AttributeGroupEClass, BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__STRECKE_ART);
		createEReference(block_Strecke_Allg_AttributeGroupEClass, BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__TRAKTION_ART);
		createEReference(block_Strecke_Allg_AttributeGroupEClass, BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUGBEEINFLUSSUNG_ART);
		createEReference(block_Strecke_Allg_AttributeGroupEClass, BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP__ZUSATZINFORMATION);

		bremsweg_TypeClassEClass = createEClass(BREMSWEG_TYPE_CLASS);
		createEAttribute(bremsweg_TypeClassEClass, BREMSWEG_TYPE_CLASS__WERT);

		entwurfsgeschwindigkeit_TypeClassEClass = createEClass(ENTWURFSGESCHWINDIGKEIT_TYPE_CLASS);
		createEAttribute(entwurfsgeschwindigkeit_TypeClassEClass, ENTWURFSGESCHWINDIGKEIT_TYPE_CLASS__WERT);

		erlaubnis_Staendig_Vorhanden_TypeClassEClass = createEClass(ERLAUBNIS_STAENDIG_VORHANDEN_TYPE_CLASS);
		createEAttribute(erlaubnis_Staendig_Vorhanden_TypeClassEClass, ERLAUBNIS_STAENDIG_VORHANDEN_TYPE_CLASS__WERT);

		erlaubnisabgabespeicherung_TypeClassEClass = createEClass(ERLAUBNISABGABESPEICHERUNG_TYPE_CLASS);
		createEAttribute(erlaubnisabgabespeicherung_TypeClassEClass, ERLAUBNISABGABESPEICHERUNG_TYPE_CLASS__WERT);

		erlaubnisholen_TypeClassEClass = createEClass(ERLAUBNISHOLEN_TYPE_CLASS);
		createEAttribute(erlaubnisholen_TypeClassEClass, ERLAUBNISHOLEN_TYPE_CLASS__WERT);

		rueckblockwecker_TypeClassEClass = createEClass(RUECKBLOCKWECKER_TYPE_CLASS);
		createEAttribute(rueckblockwecker_TypeClassEClass, RUECKBLOCKWECKER_TYPE_CLASS__WERT);

		schaltung_TypeClassEClass = createEClass(SCHALTUNG_TYPE_CLASS);
		createEAttribute(schaltung_TypeClassEClass, SCHALTUNG_TYPE_CLASS__WERT);

		schutzuebertrager_TypeClassEClass = createEClass(SCHUTZUEBERTRAGER_TYPE_CLASS);
		createEAttribute(schutzuebertrager_TypeClassEClass, SCHUTZUEBERTRAGER_TYPE_CLASS__WERT);

		strecke_Art_TypeClassEClass = createEClass(STRECKE_ART_TYPE_CLASS);
		createEAttribute(strecke_Art_TypeClassEClass, STRECKE_ART_TYPE_CLASS__WERT);

		traktion_Art_TypeClassEClass = createEClass(TRAKTION_ART_TYPE_CLASS);
		createEAttribute(traktion_Art_TypeClassEClass, TRAKTION_ART_TYPE_CLASS__WERT);

		vorblockwecker_TypeClassEClass = createEClass(VORBLOCKWECKER_TYPE_CLASS);
		createEAttribute(vorblockwecker_TypeClassEClass, VORBLOCKWECKER_TYPE_CLASS__WERT);

		zugbeeinflussung_Art_TypeClassEClass = createEClass(ZUGBEEINFLUSSUNG_ART_TYPE_CLASS);
		createEAttribute(zugbeeinflussung_Art_TypeClassEClass, ZUGBEEINFLUSSUNG_ART_TYPE_CLASS__WERT);

		zusatzinformation_TypeClassEClass = createEClass(ZUSATZINFORMATION_TYPE_CLASS);
		createEAttribute(zusatzinformation_TypeClassEClass, ZUSATZINFORMATION_TYPE_CLASS__WERT);

		// Create enums
		enumBetriebsfuehrungEEnum = createEEnum(ENUM_BETRIEBSFUEHRUNG);
		enumBlockBauformEEnum = createEEnum(ENUM_BLOCK_BAUFORM);
		enumSchaltungEEnum = createEEnum(ENUM_SCHALTUNG);
		enumStreckeArtEEnum = createEEnum(ENUM_STRECKE_ART);

		// Create data types
		entwurfsgeschwindigkeit_TypeEDataType = createEDataType(ENTWURFSGESCHWINDIGKEIT_TYPE);
		enumBetriebsfuehrungObjectEDataType = createEDataType(ENUM_BETRIEBSFUEHRUNG_OBJECT);
		enumBlockBauformObjectEDataType = createEDataType(ENUM_BLOCK_BAUFORM_OBJECT);
		enumSchaltungObjectEDataType = createEDataType(ENUM_SCHALTUNG_OBJECT);
		enumStreckeArtObjectEDataType = createEDataType(ENUM_STRECKE_ART_OBJECT);
		zusatzinformation_TypeEDataType = createEDataType(ZUSATZINFORMATION_TYPE);
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
		auto_Erlaubnisholen_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		auto_Erlaubnisruecklauf_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		betriebsfuehrung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		block_AnlageEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		block_Bauform_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		block_ElementEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		block_StreckeEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		bremsweg_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		entwurfsgeschwindigkeit_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		erlaubnis_Staendig_Vorhanden_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		erlaubnisabgabespeicherung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		erlaubnisholen_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		rueckblockwecker_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		schaltung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		schutzuebertrager_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		strecke_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		traktion_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		vorblockwecker_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		zugbeeinflussung_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		zusatzinformation_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());

		// Initialize classes, features, and operations; add parameters
		initEClass(auto_Erlaubnisholen_TypeClassEClass, Auto_Erlaubnisholen_TypeClass.class, "Auto_Erlaubnisholen_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuto_Erlaubnisholen_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Auto_Erlaubnisholen_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(auto_Erlaubnisruecklauf_TypeClassEClass, Auto_Erlaubnisruecklauf_TypeClass.class, "Auto_Erlaubnisruecklauf_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuto_Erlaubnisruecklauf_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Auto_Erlaubnisruecklauf_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(betriebsfuehrung_TypeClassEClass, Betriebsfuehrung_TypeClass.class, "Betriebsfuehrung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBetriebsfuehrung_TypeClass_Wert(), this.getENUMBetriebsfuehrungObject(), "wert", null, 1, 1, Betriebsfuehrung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(block_AnlageEClass, Block_Anlage.class, "Block_Anlage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Anlage_BlockAnlageAllg(), this.getBlock_Anlage_Allg_AttributeGroup(), null, "blockAnlageAllg", null, 1, 1, Block_Anlage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Anlage_IDBlockElementA(), theVerweisePackage.getID_Block_Element_TypeClass(), null, "iDBlockElementA", null, 1, 1, Block_Anlage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Anlage_IDBlockElementB(), theVerweisePackage.getID_Block_Element_TypeClass(), null, "iDBlockElementB", null, 0, 1, Block_Anlage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Anlage_IDGleisBezeichnung(), theVerweisePackage.getID_Gleis_Bezeichnung_TypeClass(), null, "iDGleisBezeichnung", null, 1, 1, Block_Anlage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(block_Anlage_Allg_AttributeGroupEClass, Block_Anlage_Allg_AttributeGroup.class, "Block_Anlage_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Anlage_Allg_AttributeGroup_Schaltung(), this.getSchaltung_TypeClass(), null, "schaltung", null, 0, 1, Block_Anlage_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Anlage_Allg_AttributeGroup_Schutzuebertrager(), this.getSchutzuebertrager_TypeClass(), null, "schutzuebertrager", null, 0, 1, Block_Anlage_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(block_Bauform_TypeClassEClass, Block_Bauform_TypeClass.class, "Block_Bauform_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBlock_Bauform_TypeClass_Wert(), this.getENUMBlockBauformObject(), "wert", null, 1, 1, Block_Bauform_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(block_ElementEClass, Block_Element.class, "Block_Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Element_BlockElementAllg(), this.getBlock_Element_Allg_AttributeGroup(), null, "blockElementAllg", null, 1, 1, Block_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Element_BlockElementErlaubnis(), this.getBlock_Element_Erlaubnis_AttributeGroup(), null, "blockElementErlaubnis", null, 0, 1, Block_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Element_IDBlockStrecke(), theVerweisePackage.getID_Block_Strecke_TypeClass(), null, "iDBlockStrecke", null, 1, 1, Block_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Element_IDRaeumungspruefung(), theVerweisePackage.getID_Schaltmittel_Zuordnung_TypeClass(), null, "iDRaeumungspruefung", null, 0, 1, Block_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Element_IDSignal(), theVerweisePackage.getID_Signal_TypeClass(), null, "iDSignal", null, 0, 1, Block_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Element_IDZugschlussmeldung(), theVerweisePackage.getID_Bedien_Anzeige_Element_TypeClass(), null, "iDZugschlussmeldung", null, 0, 1, Block_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(block_Element_Allg_AttributeGroupEClass, Block_Element_Allg_AttributeGroup.class, "Block_Element_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Element_Allg_AttributeGroup_BlockBauform(), this.getBlock_Bauform_TypeClass(), null, "blockBauform", null, 1, 1, Block_Element_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Element_Allg_AttributeGroup_Rueckblockwecker(), this.getRueckblockwecker_TypeClass(), null, "rueckblockwecker", null, 1, 1, Block_Element_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Element_Allg_AttributeGroup_Vorblockwecker(), this.getVorblockwecker_TypeClass(), null, "vorblockwecker", null, 1, 1, Block_Element_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(block_Element_Erlaubnis_AttributeGroupEClass, Block_Element_Erlaubnis_AttributeGroup.class, "Block_Element_Erlaubnis_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Element_Erlaubnis_AttributeGroup_AutoErlaubnisholen(), this.getAuto_Erlaubnisholen_TypeClass(), null, "autoErlaubnisholen", null, 0, 1, Block_Element_Erlaubnis_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Element_Erlaubnis_AttributeGroup_AutoErlaubnisruecklauf(), this.getAuto_Erlaubnisruecklauf_TypeClass(), null, "autoErlaubnisruecklauf", null, 0, 1, Block_Element_Erlaubnis_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Element_Erlaubnis_AttributeGroup_ErlaubnisStaendigVorhanden(), this.getErlaubnis_Staendig_Vorhanden_TypeClass(), null, "erlaubnisStaendigVorhanden", null, 0, 1, Block_Element_Erlaubnis_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Element_Erlaubnis_AttributeGroup_Erlaubnisabgabespeicherung(), this.getErlaubnisabgabespeicherung_TypeClass(), null, "erlaubnisabgabespeicherung", null, 0, 1, Block_Element_Erlaubnis_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Element_Erlaubnis_AttributeGroup_Erlaubnisholen(), this.getErlaubnisholen_TypeClass(), null, "erlaubnisholen", null, 0, 1, Block_Element_Erlaubnis_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(block_StreckeEClass, Block_Strecke.class, "Block_Strecke", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Strecke_BlockStreckeAllg(), this.getBlock_Strecke_Allg_AttributeGroup(), null, "blockStreckeAllg", null, 1, 1, Block_Strecke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Strecke_IDBetriebsstelleNachbar(), theVerweisePackage.getID_Oertlichkeit_Proxy_TypeClass(), null, "iDBetriebsstelleNachbar", null, 1, 1, Block_Strecke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Strecke_IDKnotenbahnhof(), theVerweisePackage.getID_Oertlichkeit_Proxy_TypeClass(), null, "iDKnotenbahnhof", null, 0, 1, Block_Strecke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Strecke_IDStrecke(), theVerweisePackage.getID_Strecke_TypeClass(), null, "iDStrecke", null, 1, 1, Block_Strecke.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(block_Strecke_Allg_AttributeGroupEClass, Block_Strecke_Allg_AttributeGroup.class, "Block_Strecke_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Strecke_Allg_AttributeGroup_Betriebsfuehrung(), this.getBetriebsfuehrung_TypeClass(), null, "betriebsfuehrung", null, 1, 1, Block_Strecke_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Strecke_Allg_AttributeGroup_Bremsweg(), this.getBremsweg_TypeClass(), null, "bremsweg", null, 1, 1, Block_Strecke_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Strecke_Allg_AttributeGroup_Entwurfsgeschwindigkeit(), this.getEntwurfsgeschwindigkeit_TypeClass(), null, "entwurfsgeschwindigkeit", null, 1, 1, Block_Strecke_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Strecke_Allg_AttributeGroup_StreckeArt(), this.getStrecke_Art_TypeClass(), null, "streckeArt", null, 0, 1, Block_Strecke_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Strecke_Allg_AttributeGroup_TraktionArt(), this.getTraktion_Art_TypeClass(), null, "traktionArt", null, 0, 1, Block_Strecke_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Strecke_Allg_AttributeGroup_ZugbeeinflussungArt(), this.getZugbeeinflussung_Art_TypeClass(), null, "zugbeeinflussungArt", null, 0, 1, Block_Strecke_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlock_Strecke_Allg_AttributeGroup_Zusatzinformation(), this.getZusatzinformation_TypeClass(), null, "zusatzinformation", null, 0, 1, Block_Strecke_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bremsweg_TypeClassEClass, Bremsweg_TypeClass.class, "Bremsweg_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBremsweg_TypeClass_Wert(), theBasisTypenPackage.getBremsweg_Type(), "wert", null, 1, 1, Bremsweg_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entwurfsgeschwindigkeit_TypeClassEClass, Entwurfsgeschwindigkeit_TypeClass.class, "Entwurfsgeschwindigkeit_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEntwurfsgeschwindigkeit_TypeClass_Wert(), this.getEntwurfsgeschwindigkeit_Type(), "wert", null, 1, 1, Entwurfsgeschwindigkeit_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(erlaubnis_Staendig_Vorhanden_TypeClassEClass, Erlaubnis_Staendig_Vorhanden_TypeClass.class, "Erlaubnis_Staendig_Vorhanden_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErlaubnis_Staendig_Vorhanden_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Erlaubnis_Staendig_Vorhanden_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(erlaubnisabgabespeicherung_TypeClassEClass, Erlaubnisabgabespeicherung_TypeClass.class, "Erlaubnisabgabespeicherung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErlaubnisabgabespeicherung_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Erlaubnisabgabespeicherung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(erlaubnisholen_TypeClassEClass, Erlaubnisholen_TypeClass.class, "Erlaubnisholen_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getErlaubnisholen_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Erlaubnisholen_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(rueckblockwecker_TypeClassEClass, Rueckblockwecker_TypeClass.class, "Rueckblockwecker_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRueckblockwecker_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Rueckblockwecker_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schaltung_TypeClassEClass, Schaltung_TypeClass.class, "Schaltung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchaltung_TypeClass_Wert(), this.getENUMSchaltungObject(), "wert", null, 1, 1, Schaltung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schutzuebertrager_TypeClassEClass, Schutzuebertrager_TypeClass.class, "Schutzuebertrager_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchutzuebertrager_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Schutzuebertrager_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(strecke_Art_TypeClassEClass, Strecke_Art_TypeClass.class, "Strecke_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStrecke_Art_TypeClass_Wert(), this.getENUMStreckeArtObject(), "wert", null, 1, 1, Strecke_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(traktion_Art_TypeClassEClass, Traktion_Art_TypeClass.class, "Traktion_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTraktion_Art_TypeClass_Wert(), theBasisTypenPackage.getFahrstrom_Type(), "wert", null, 1, 1, Traktion_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vorblockwecker_TypeClassEClass, Vorblockwecker_TypeClass.class, "Vorblockwecker_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVorblockwecker_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Vorblockwecker_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zugbeeinflussung_Art_TypeClassEClass, Zugbeeinflussung_Art_TypeClass.class, "Zugbeeinflussung_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZugbeeinflussung_Art_TypeClass_Wert(), theBasisTypenPackage.getAnwendungssystem_Type(), "wert", null, 1, 1, Zugbeeinflussung_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zusatzinformation_TypeClassEClass, Zusatzinformation_TypeClass.class, "Zusatzinformation_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZusatzinformation_TypeClass_Wert(), this.getZusatzinformation_Type(), "wert", null, 1, 1, Zusatzinformation_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumBetriebsfuehrungEEnum, ENUMBetriebsfuehrung.class, "ENUMBetriebsfuehrung");
		addEEnumLiteral(enumBetriebsfuehrungEEnum, ENUMBetriebsfuehrung.ENUM_BETRIEBSFUEHRUNG_EINGL);
		addEEnumLiteral(enumBetriebsfuehrungEEnum, ENUMBetriebsfuehrung.ENUM_BETRIEBSFUEHRUNG_SONSTIGE);
		addEEnumLiteral(enumBetriebsfuehrungEEnum, ENUMBetriebsfuehrung.ENUM_BETRIEBSFUEHRUNG_STICHSTRECKENBLOCK);
		addEEnumLiteral(enumBetriebsfuehrungEEnum, ENUMBetriebsfuehrung.ENUM_BETRIEBSFUEHRUNG_ZLB);
		addEEnumLiteral(enumBetriebsfuehrungEEnum, ENUMBetriebsfuehrung.ENUM_BETRIEBSFUEHRUNG_ZWEIGL);
		addEEnumLiteral(enumBetriebsfuehrungEEnum, ENUMBetriebsfuehrung.ENUM_BETRIEBSFUEHRUNG_ZWEIGL_GWB);

		initEEnum(enumBlockBauformEEnum, ENUMBlockBauform.class, "ENUMBlockBauform");
		addEEnumLiteral(enumBlockBauformEEnum, ENUMBlockBauform.ENUM_BLOCK_BAUFORM_AB64);
		addEEnumLiteral(enumBlockBauformEEnum, ENUMBlockBauform.ENUM_BLOCK_BAUFORM_AB70);
		addEEnumLiteral(enumBlockBauformEEnum, ENUMBlockBauform.ENUM_BLOCK_BAUFORM_ELEKTRONISCHER_BLOCK_EBL2000);
		addEEnumLiteral(enumBlockBauformEEnum, ENUMBlockBauform.ENUM_BLOCK_BAUFORM_SONSTIGE);
		addEEnumLiteral(enumBlockBauformEEnum, ENUMBlockBauform.ENUM_BLOCK_BAUFORM_ESTW_ZENTRALBLOCK);
		addEEnumLiteral(enumBlockBauformEEnum, ENUMBlockBauform.ENUM_BLOCK_BAUFORM_ESTW_ZENTRALBLOCK_MIT_SB_ABSCHLUSS_MCL84);
		addEEnumLiteral(enumBlockBauformEEnum, ENUMBlockBauform.ENUM_BLOCK_BAUFORM_ESTW_ZENTRALBLOCK_MIT_SB_ABSCHLUSS_SBL60);
		addEEnumLiteral(enumBlockBauformEEnum, ENUMBlockBauform.ENUM_BLOCK_BAUFORM_ESTW_ZENTRALBLOCK_MIT_SB_ABSCHLUSS_SBS59);
		addEEnumLiteral(enumBlockBauformEEnum, ENUMBlockBauform.ENUM_BLOCK_BAUFORM_ZENTRALBLOCK_ZSB2000);
		addEEnumLiteral(enumBlockBauformEEnum, ENUMBlockBauform.ENUM_BLOCK_BAUFORM_ESTW_ZENTRALBLOCK_MIT_SB_ABSCHLUSS_SBS60);
		addEEnumLiteral(enumBlockBauformEEnum, ENUMBlockBauform.ENUM_BLOCK_BAUFORM_FELDERBLOCK);
		addEEnumLiteral(enumBlockBauformEEnum, ENUMBlockBauform.ENUM_BLOCK_BAUFORM_FIRMENNEUTRALE_BLOCKSCHNITTSTELLE);
		addEEnumLiteral(enumBlockBauformEEnum, ENUMBlockBauform.ENUM_BLOCK_BAUFORM_DB_BLOCK);
		addEEnumLiteral(enumBlockBauformEEnum, ENUMBlockBauform.ENUM_BLOCK_BAUFORM_ZENTRALBLOCK_ZBS65);
		addEEnumLiteral(enumBlockBauformEEnum, ENUMBlockBauform.ENUM_BLOCK_BAUFORM_ZENTRALBLOCK_ZBS600);
		addEEnumLiteral(enumBlockBauformEEnum, ENUMBlockBauform.ENUM_BLOCK_BAUFORM_SELBSTBLOCK_SBL60);
		addEEnumLiteral(enumBlockBauformEEnum, ENUMBlockBauform.ENUM_BLOCK_BAUFORM_SELBSTBLOCK_SBS59);
		addEEnumLiteral(enumBlockBauformEEnum, ENUMBlockBauform.ENUM_BLOCK_BAUFORM_SELBSTBLOCK_SBS60);
		addEEnumLiteral(enumBlockBauformEEnum, ENUMBlockBauform.ENUM_BLOCK_BAUFORM_RELAISBLOCK_RBII60);
		addEEnumLiteral(enumBlockBauformEEnum, ENUMBlockBauform.ENUM_BLOCK_BAUFORM_RELAISBLOCK_RBII_SP64B);
		addEEnumLiteral(enumBlockBauformEEnum, ENUMBlockBauform.ENUM_BLOCK_BAUFORM_RELAISBLOCK_RBIII_SP68);

		initEEnum(enumSchaltungEEnum, ENUMSchaltung.class, "ENUMSchaltung");
		addEEnumLiteral(enumSchaltungEEnum, ENUMSchaltung.ENUM_SCHALTUNG_3DRAHTSCHALTUNG);
		addEEnumLiteral(enumSchaltungEEnum, ENUMSchaltung.ENUM_SCHALTUNG_SONSTIGE);
		addEEnumLiteral(enumSchaltungEEnum, ENUMSchaltung.ENUM_SCHALTUNG_6DRAHTSCHALTUNG);
		addEEnumLiteral(enumSchaltungEEnum, ENUMSchaltung.ENUM_SCHALTUNG_9DRAHTSCHALTUNG);

		initEEnum(enumStreckeArtEEnum, ENUMStreckeArt.class, "ENUMStreckeArt");
		addEEnumLiteral(enumStreckeArtEEnum, ENUMStreckeArt.ENUM_STRECKE_ART_HAUPTBAHN);
		addEEnumLiteral(enumStreckeArtEEnum, ENUMStreckeArt.ENUM_STRECKE_ART_NEBENBAHN);

		// Initialize data types
		initEDataType(entwurfsgeschwindigkeit_TypeEDataType, BigInteger.class, "Entwurfsgeschwindigkeit_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumBetriebsfuehrungObjectEDataType, ENUMBetriebsfuehrung.class, "ENUMBetriebsfuehrungObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumBlockBauformObjectEDataType, ENUMBlockBauform.class, "ENUMBlockBauformObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumSchaltungObjectEDataType, ENUMSchaltung.class, "ENUMSchaltungObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumStreckeArtObjectEDataType, ENUMStreckeArt.class, "ENUMStreckeArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(zusatzinformation_TypeEDataType, String.class, "Zusatzinformation_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
			   "documentation", "Dieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nF\u00fcr Fragen zum Schema wenden Sie sich bitte an Herrn :\n\nReiner Br\u00f6del (reiner.broedel@deutschebahn.com, +49 30 297-57123)\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\r\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nF\u00fcr Fragen zum Schema wenden Sie sich bitte an Herrn :\n\nReiner Br\u00f6del (reiner.broedel@deutschebahn.com, +49 30 297-57123)\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\r\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nF\u00fcr Fragen zum Schema wenden Sie sich bitte an Herrn :\n\nReiner Br\u00f6del (reiner.broedel@deutschebahn.com, +49 30 297-57123)\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\r\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nF\u00fcr Fragen zum Schema wenden Sie sich bitte an Herrn :\n\nReiner Br\u00f6del (reiner.broedel@deutschebahn.com, +49 30 297-57123)\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface."
		   });
		addAnnotation
		  (block_AnlageEClass,
		   source,
		   new String[] {
			   "documentation", "Technische Einrichtungen f\u00fcr die blocktechnische Sicherung von Zugfahrten auf Streckengleisen. Die zugeh\u00f6rige Bezeichnung des Streckengleises wird \u00fcber das Objekt Gleis Bezeichnung ermittelt. Die Klammern der Gleisbezeichnung f\u00fcr Streckengleise sind Bestandteil der Gleisbezeichnung. F\u00fcr die Darstellung der Streckendaten f\u00fcr eine Blockstrecke wird \u00fcber das Objekt Block Element das Objekt Block Strecke verwendet. Ist Streckenblock geplant, wird einem Streckengleis eine Block_Anlage zugeordnet. Bei einer zweigleisigen Strecke, bei der beide Streckengleise mit Streckenblock ausger\u00fcstet sind, wird den beiden Streckengleisen jeweils eine eigene Block_Anlage zugeordnet. Eine Block_Anlage verf\u00fcgt \u00fcber zwei Block_Elemente A und B (Blockendstellen), die entsprechend der Regelfahrrichtung zugewiesen werden. Bei eingleisigen Strecken ergibt sich der Richtungssinn A - B aus der Streckenkilometrierung. Eine Ausnahme bildet der Stichstreckenblock, dem nur ein Block Element zugeordnet wird. Als Zusammenfassung aller Objekte wird auch die Bezeichnung Block verwendet. "
		   });
		addAnnotation
		  (getBlock_Anlage_IDBlockElementA(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf das Block_Element am Anfang einer Blockanlage."
		   });
		addAnnotation
		  (getBlock_Anlage_IDBlockElementB(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf das Block_Element am Ende einer Blockanlage. Die Angabe ist nur bei Stichstreckenblock nicht erforderlich."
		   });
		addAnnotation
		  (getBlock_Anlage_IDGleisBezeichnung(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf das zugeh\u00f6rige Streckengleis als Tr\u00e4ger der Bezeichnung des Streckengleises zwischen den beiden Blockendstellen."
		   });
		addAnnotation
		  (getBlock_Anlage_Allg_AttributeGroup_Schaltung(),
		   source,
		   new String[] {
			   "documentation", "Ausf\u00fchrung der Schaltung f\u00fcr die \u00dcbertragung der Blockinformationen."
		   });
		addAnnotation
		  (getBlock_Anlage_Allg_AttributeGroup_Schutzuebertrager(),
		   source,
		   new String[] {
			   "documentation", "Die Schaltung des Streckenblocks ist mit Schutz\u00fcbertrager ausger\u00fcstet. Die konkrete Anzahl der Schutz\u00fcbertrager ergibt sich aus der Beeinflussungsberechnung, die nicht Bestandteil des Modells ist."
		   });
		addAnnotation
		  (block_ElementEClass,
		   source,
		   new String[] {
			   "documentation", "Element am Ende einer Blockstrecke/Blockanlage. Ein Streckengleis, welches mit einer Block Anlage ausger\u00fcstet ist, besitzt zwei korrespondierende Blockelemente in den benachbarten Betriebsstellen. Eine Ausnahme bildet der Stichstreckenblock, der nur ein Block_Element besitzt. Das Block_Element verweist auch auf die zugeh\u00f6rige Blockstrecke, die die relevanten blocktechnischen und betrieblichen Daten der Strecke enth\u00e4lt. Bei zweigleisigen Strecken verweisen zwei Blockelemente auf die Blockstrecke. Das Block_Element verweist auf ein Signal in Form des Streckenziels (A-Feld) und auf ein Schaltmittel zur R\u00e4umungspr\u00fcfung (E-Feld). Wenn eine gesonderte Zugschlussmeldung verwendet wird, wird mit ID_Zugschlussmeldung auf eine entsprechende Bedieneinrichtung verwiesen. Aus der Blockbauform der jeweiligen Endstelle kann die Art der technischen Realisierung erkannt werden. "
		   });
		addAnnotation
		  (getBlock_Element_IDBlockStrecke(),
		   source,
		   new String[] {
			   "documentation", "Verweis vom Block Element auf die zugeh\u00f6rige Block Strecke. Bei zweigleisigen Strecken verweisen zwei Block_Elemente auf die Block_Strecke. Bei eingleisigen Strecken verweist nur ein Block_Element auf die Block_Strecke. "
		   });
		addAnnotation
		  (getBlock_Element_IDRaeumungspruefung(),
		   source,
		   new String[] {
			   "documentation", "Verweis vom Block Element auf die zugeh\u00f6rge R\u00e4umungspr\u00fcfung. Das Blockelement verweist \u00fcber Schaltmittel Zuordnung auf ein Schaltmittel, welches zur R\u00e4umungspr\u00fcfung befahren und freigefahren werden muss. Nach erfolgreicher R\u00e4umungspr\u00fcfung kann der (automatische) R\u00fcckblock erfolgen. "
		   });
		addAnnotation
		  (getBlock_Element_IDSignal(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf ein fiktives Signal (Ausfahrziel), \u00fcber das die Abh\u00e4ngigkeit des zugeh\u00f6rigen A-Feldes beschrieben wird. "
		   });
		addAnnotation
		  (getBlock_Element_IDZugschlussmeldung(),
		   source,
		   new String[] {
			   "documentation", "Verweis vom Block Element auf die zugeh\u00f6rige Bedieneinrichtung zur Abgabe einer Zugschlussmeldung. "
		   });
		addAnnotation
		  (getBlock_Element_Allg_AttributeGroup_BlockBauform(),
		   source,
		   new String[] {
			   "documentation", "Technische Auspr\u00e4gung der Blockbauform an den beiden Enden einer Blockanlage. Eine Blockstrecke beginnt und endet an einer Betriebsstelle, zu der jeweils ein Block Element mit der entsprechenden Block_Bauform zugeordnet wird. DB-Regelwerk Ril 482.9001A07, Seite 1 und 5 "
		   });
		addAnnotation
		  (getBlock_Element_Allg_AttributeGroup_Rueckblockwecker(),
		   source,
		   new String[] {
			   "documentation", "F\u00fcr den Streckenblock des Streckengleises ist ein R\u00fcckblockwecker eingerichtet. Mit dieser technischen Einrichtung wird eine akustische Meldung beim Eintreffen des R\u00fcckblocks von der Gegenstelle ausgegeben."
		   });
		addAnnotation
		  (getBlock_Element_Allg_AttributeGroup_Vorblockwecker(),
		   source,
		   new String[] {
			   "documentation", "F\u00fcr den Streckenblock des Streckengleises ist ein Vorkblockwecker eingerichtet. Mit dieser technischen Einrichtung wird eine akustische Meldung beim Eintreffen des Vorblocks von der Gegenstelle ausgegeben."
		   });
		addAnnotation
		  (getBlock_Element_Erlaubnis_AttributeGroup_AutoErlaubnisholen(),
		   source,
		   new String[] {
			   "documentation", "Das zugeh\u00f6rige Block Element kann sich die Erlaubnis von der Gegenstelle automatisch holen. Dass Attribut kann f\u00fcr die zu einer Block Anlage zugeh\u00f6rigen Block_Elementen unabh\u00e4ngig voneinander verwendet werden. Nur die Blockendstelle kann die Erlaubnis automatisch holen, bei der dieses Attribut auf wahr gesetzt ist. Siehe dazu auch Erlaubnisholen als Alternative. "
		   });
		addAnnotation
		  (getBlock_Element_Erlaubnis_AttributeGroup_AutoErlaubnisruecklauf(),
		   source,
		   new String[] {
			   "documentation", "Automatischer Erlaubnisr\u00fccklauf f\u00fcr die Block Anlage. Das Attribut ist auf beiden Block_Elementen der Blockanlage anzugeben, wobei eines mit wahr und das andere mit falsch zu bef\u00fcllen ist. Die Erlaubnis l\u00e4uft zu dem mit wahr gekennzeichneten Block Element zur\u00fcck. Wenn kein automatischer Erlaubnisruecklauf eingerichtet ist, entf\u00e4llt das Attribut. DB-Regelwerk [Ril 819.0102A04] Streckenblocktabelle. [482.9014, Abschnitt 3 (4)] Selbstt\u00e4tige Erlaubnisr\u00fcckgabe: Ist eine Fahrtrichtung f\u00fcr die Erlaubnis bevorrechtigt geschaltet, wird die Erlaubnis nach einer Zugfahrt gegen die bevorrechtigte Fahrtrichtung selbstt\u00e4tig an die bevorrechtigte Betriebsstelle zur\u00fcckgegeben. "
		   });
		addAnnotation
		  (getBlock_Element_Erlaubnis_AttributeGroup_ErlaubnisStaendigVorhanden(),
		   source,
		   new String[] {
			   "documentation", "Die Erlaubnis befindet sind st\u00e4ndig im zugeh\u00f6rigen Block Element einer Block Anlage. Die Erlaubnis kann nicht abgegeben werden. Die Anwendung ist typisch f\u00fcr zweigleisige Strecken im Richtungsbetrieb ohne signalisiertem Gleiswechelbetrieb. Die anderen Funktionen des Erlaubniswechsels sind dann nicht m\u00f6glich."
		   });
		addAnnotation
		  (getBlock_Element_Erlaubnis_AttributeGroup_Erlaubnisabgabespeicherung(),
		   source,
		   new String[] {
			   "documentation", "Das Block Element kann die Abgabe der Erlaubnis speichern, wenn die Bedingungen zum Erlaubniswechsel noch nicht erf\u00fcllt sind. DB-Regelwerk [Ril 482.9014, Abschnitt 3 (3), Abschnitt 7 (3), Abschnitt 11 (3)]. "
		   });
		addAnnotation
		  (getBlock_Element_Erlaubnis_AttributeGroup_Erlaubnisholen(),
		   source,
		   new String[] {
			   "documentation", "Das Block Element kann die Erlaubnis durch manuelle Bedienung von der Gegenstelle holen. Dass Attribut kann f\u00fcr die zu einer Block Anlage zugeh\u00f6rigen Block_Elemente unabh\u00e4ngig voneinander verwendet werden. Nur die Blockendstelle kann die Erlaubnis holen, bei der dieses Attribut auf true gesetzt ist. Siehe dazu auch Automatisches Erlaubnisholen als Alternative. DB Regelwerk Ril 482.9090 "
		   });
		addAnnotation
		  (block_StreckeEClass,
		   source,
		   new String[] {
			   "documentation", "Speicherung der betrieblich relevanter Streckendaten einer Blockstrecke. Das Objekt enth\u00e4lt die zwischen zwei Zugmeldestellen typischen betrieblichen Informationen (Streckendaten) zur Information. Es wird dem Blockelement der zugeh\u00f6rigen Blockstelle zugeordnet."
		   });
		addAnnotation
		  (getBlock_Strecke_IDBetriebsstelleNachbar(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die \u00d6rtlichkeit der n\u00e4chsten Zugmeldestelle."
		   });
		addAnnotation
		  (getBlock_Strecke_IDKnotenbahnhof(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die \u00d6rtlichkeit des n\u00e4chsten Knotenbahnhofs."
		   });
		addAnnotation
		  (getBlock_Strecke_IDStrecke(),
		   source,
		   new String[] {
			   "documentation", "Zuordnung auf die Strecke. "
		   });
		addAnnotation
		  (getBlock_Strecke_Allg_AttributeGroup_Betriebsfuehrung(),
		   source,
		   new String[] {
			   "documentation", "Betriebsf\u00fchrung auf der zugeh\u00f6rigen Strecke. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk mit entsprechenden Erl\u00e4uterungen anzuf\u00fcgen."
		   });
		addAnnotation
		  (getBlock_Strecke_Allg_AttributeGroup_Bremsweg(),
		   source,
		   new String[] {
			   "documentation", "Bremsweg als Grundlage f\u00fcr die Dimesionierung der zugeh\u00f6rigen Strecke. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk mit entsprechenden Erl\u00e4uterungen anzuf\u00fcgen."
		   });
		addAnnotation
		  (getBlock_Strecke_Allg_AttributeGroup_Entwurfsgeschwindigkeit(),
		   source,
		   new String[] {
			   "documentation", "Entwurfsgeschwindigkeit f\u00fcr die Dimensionierung der zugeh\u00f6rigen Strecke."
		   });
		addAnnotation
		  (getBlock_Strecke_Allg_AttributeGroup_StreckeArt(),
		   source,
		   new String[] {
			   "documentation", "Rechtliche Klassifizierung der Strecke (Haupt-/Nebenbahn). DB-Regelwerk Angabe auf dem LP"
		   });
		addAnnotation
		  (getBlock_Strecke_Allg_AttributeGroup_TraktionArt(),
		   source,
		   new String[] {
			   "documentation", "Art der Fahrstromversorgung (Stromart, Spannung, besondere Zuf\u00fchrung). DB-Regelwerk Angabe auf dem LP"
		   });
		addAnnotation
		  (getBlock_Strecke_Allg_AttributeGroup_ZugbeeinflussungArt(),
		   source,
		   new String[] {
			   "documentation", "Vorhandenes bzw. vorgesehenes Zugbeeinflussungssystem. DB-Regelwerk Angabe auf dem LP"
		   });
		addAnnotation
		  (getBlock_Strecke_Allg_AttributeGroup_Zusatzinformation(),
		   source,
		   new String[] {
			   "documentation", "Erlaubt die Angabe zus\u00e4tzlicher Informationen zur Ausgabe im LP. DB-Regelwerk Angabe auf dem LP"
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
		  (auto_Erlaubnisholen_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCAuto_Erlaubnisholen",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAuto_Erlaubnisholen_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (auto_Erlaubnisruecklauf_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCAuto_Erlaubnisruecklauf",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAuto_Erlaubnisruecklauf_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (betriebsfuehrung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBetriebsfuehrung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBetriebsfuehrung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (block_AnlageEClass,
		   source,
		   new String[] {
			   "name", "CBlock_Anlage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBlock_Anlage_BlockAnlageAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Block_Anlage_Allg"
		   });
		addAnnotation
		  (getBlock_Anlage_IDBlockElementA(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Block_Element_A"
		   });
		addAnnotation
		  (getBlock_Anlage_IDBlockElementB(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Block_Element_B"
		   });
		addAnnotation
		  (getBlock_Anlage_IDGleisBezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Gleis_Bezeichnung"
		   });
		addAnnotation
		  (block_Anlage_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CBlock_Anlage_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBlock_Anlage_Allg_AttributeGroup_Schaltung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Schaltung"
		   });
		addAnnotation
		  (getBlock_Anlage_Allg_AttributeGroup_Schutzuebertrager(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Schutzuebertrager"
		   });
		addAnnotation
		  (block_Bauform_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBlock_Bauform",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBlock_Bauform_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (block_ElementEClass,
		   source,
		   new String[] {
			   "name", "CBlock_Element",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBlock_Element_BlockElementAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Block_Element_Allg"
		   });
		addAnnotation
		  (getBlock_Element_BlockElementErlaubnis(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Block_Element_Erlaubnis"
		   });
		addAnnotation
		  (getBlock_Element_IDBlockStrecke(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Block_Strecke"
		   });
		addAnnotation
		  (getBlock_Element_IDRaeumungspruefung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Raeumungspruefung"
		   });
		addAnnotation
		  (getBlock_Element_IDSignal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Signal"
		   });
		addAnnotation
		  (getBlock_Element_IDZugschlussmeldung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Zugschlussmeldung"
		   });
		addAnnotation
		  (block_Element_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CBlock_Element_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBlock_Element_Allg_AttributeGroup_BlockBauform(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Block_Bauform"
		   });
		addAnnotation
		  (getBlock_Element_Allg_AttributeGroup_Rueckblockwecker(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Rueckblockwecker"
		   });
		addAnnotation
		  (getBlock_Element_Allg_AttributeGroup_Vorblockwecker(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Vorblockwecker"
		   });
		addAnnotation
		  (block_Element_Erlaubnis_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CBlock_Element_Erlaubnis",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBlock_Element_Erlaubnis_AttributeGroup_AutoErlaubnisholen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Auto_Erlaubnisholen"
		   });
		addAnnotation
		  (getBlock_Element_Erlaubnis_AttributeGroup_AutoErlaubnisruecklauf(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Auto_Erlaubnisruecklauf"
		   });
		addAnnotation
		  (getBlock_Element_Erlaubnis_AttributeGroup_ErlaubnisStaendigVorhanden(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Erlaubnis_Staendig_Vorhanden"
		   });
		addAnnotation
		  (getBlock_Element_Erlaubnis_AttributeGroup_Erlaubnisabgabespeicherung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Erlaubnisabgabespeicherung"
		   });
		addAnnotation
		  (getBlock_Element_Erlaubnis_AttributeGroup_Erlaubnisholen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Erlaubnisholen"
		   });
		addAnnotation
		  (block_StreckeEClass,
		   source,
		   new String[] {
			   "name", "CBlock_Strecke",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBlock_Strecke_BlockStreckeAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Block_Strecke_Allg"
		   });
		addAnnotation
		  (getBlock_Strecke_IDBetriebsstelleNachbar(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Betriebsstelle_Nachbar"
		   });
		addAnnotation
		  (getBlock_Strecke_IDKnotenbahnhof(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Knotenbahnhof"
		   });
		addAnnotation
		  (getBlock_Strecke_IDStrecke(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Strecke"
		   });
		addAnnotation
		  (block_Strecke_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CBlock_Strecke_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBlock_Strecke_Allg_AttributeGroup_Betriebsfuehrung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Betriebsfuehrung"
		   });
		addAnnotation
		  (getBlock_Strecke_Allg_AttributeGroup_Bremsweg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bremsweg"
		   });
		addAnnotation
		  (getBlock_Strecke_Allg_AttributeGroup_Entwurfsgeschwindigkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Entwurfsgeschwindigkeit"
		   });
		addAnnotation
		  (getBlock_Strecke_Allg_AttributeGroup_StreckeArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Strecke_Art"
		   });
		addAnnotation
		  (getBlock_Strecke_Allg_AttributeGroup_TraktionArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Traktion_Art"
		   });
		addAnnotation
		  (getBlock_Strecke_Allg_AttributeGroup_ZugbeeinflussungArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Zugbeeinflussung_Art"
		   });
		addAnnotation
		  (getBlock_Strecke_Allg_AttributeGroup_Zusatzinformation(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Zusatzinformation"
		   });
		addAnnotation
		  (bremsweg_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBremsweg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBremsweg_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (entwurfsgeschwindigkeit_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TEntwurfsgeschwindigkeit",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TGeschwindigkeit"
		   });
		addAnnotation
		  (entwurfsgeschwindigkeit_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCEntwurfsgeschwindigkeit",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEntwurfsgeschwindigkeit_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (enumBetriebsfuehrungEEnum,
		   source,
		   new String[] {
			   "name", "ENUMBetriebsfuehrung"
		   });
		addAnnotation
		  (enumBetriebsfuehrungObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMBetriebsfuehrung:Object",
			   "baseType", "ENUMBetriebsfuehrung"
		   });
		addAnnotation
		  (enumBlockBauformEEnum,
		   source,
		   new String[] {
			   "name", "ENUMBlock_Bauform"
		   });
		addAnnotation
		  (enumBlockBauformObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMBlock_Bauform:Object",
			   "baseType", "ENUMBlock_Bauform"
		   });
		addAnnotation
		  (enumSchaltungEEnum,
		   source,
		   new String[] {
			   "name", "ENUMSchaltung"
		   });
		addAnnotation
		  (enumSchaltungObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMSchaltung:Object",
			   "baseType", "ENUMSchaltung"
		   });
		addAnnotation
		  (enumStreckeArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMStrecke_Art"
		   });
		addAnnotation
		  (enumStreckeArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMStrecke_Art:Object",
			   "baseType", "ENUMStrecke_Art"
		   });
		addAnnotation
		  (erlaubnis_Staendig_Vorhanden_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCErlaubnis_Staendig_Vorhanden",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getErlaubnis_Staendig_Vorhanden_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (erlaubnisabgabespeicherung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCErlaubnisabgabespeicherung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getErlaubnisabgabespeicherung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (erlaubnisholen_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCErlaubnisholen",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getErlaubnisholen_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (rueckblockwecker_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCRueckblockwecker",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getRueckblockwecker_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (schaltung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCSchaltung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSchaltung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (schutzuebertrager_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCSchutzuebertrager",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSchutzuebertrager_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (strecke_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCStrecke_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getStrecke_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (traktion_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTraktion_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTraktion_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (vorblockwecker_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCVorblockwecker",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getVorblockwecker_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (zugbeeinflussung_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCZugbeeinflussung_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZugbeeinflussung_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (zusatzinformation_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TZusatzinformation",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TText",
			   "pattern", ".{1,50}"
		   });
		addAnnotation
		  (zusatzinformation_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCZusatzinformation",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZusatzinformation_TypeClass_Wert(),
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
		  (block_AnlageEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n            <ppi:WorkflowInformation>\r\n               <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n            </ppi:WorkflowInformation>\r\n         "
		   });
		addAnnotation
		  (block_ElementEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n            <ppi:WorkflowInformation>\r\n               <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n            </ppi:WorkflowInformation>\r\n         "
		   });
		addAnnotation
		  (getBlock_Element_Allg_AttributeGroup_BlockBauform(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:ProposedValue>ESTW_Zentralblock</ppi:ProposedValue>\r\n                     <ppi:PlanningStage>PT1</ppi:PlanningStage>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (getBlock_Element_Allg_AttributeGroup_Rueckblockwecker(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:ProposedValue>false</ppi:ProposedValue>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (getBlock_Element_Allg_AttributeGroup_Vorblockwecker(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:ProposedValue>false</ppi:ProposedValue>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (getBlock_Element_Erlaubnis_AttributeGroup_AutoErlaubnisholen(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:ProposedValue>false</ppi:ProposedValue>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (getBlock_Element_Erlaubnis_AttributeGroup_AutoErlaubnisruecklauf(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:ProposedValue>false</ppi:ProposedValue>\r\n                     <ppi:PlanningStage>PT1</ppi:PlanningStage>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (getBlock_Element_Erlaubnis_AttributeGroup_ErlaubnisStaendigVorhanden(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:ProposedValue>false</ppi:ProposedValue>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (getBlock_Element_Erlaubnis_AttributeGroup_Erlaubnisabgabespeicherung(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:ProposedValue>false</ppi:ProposedValue>\r\n                     <ppi:PlanningStage>PT1</ppi:PlanningStage>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (getBlock_Element_Erlaubnis_AttributeGroup_Erlaubnisholen(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:ProposedValue>false</ppi:ProposedValue>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (block_StreckeEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n            <ppi:WorkflowInformation>\r\n               <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n            </ppi:WorkflowInformation>\r\n         "
		   });
		addAnnotation
		  (getBlock_Strecke_Allg_AttributeGroup_Betriebsfuehrung(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:ProposedValue>zweigl_GWB</ppi:ProposedValue>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (getBlock_Strecke_Allg_AttributeGroup_Bremsweg(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:ProposedValue>1000</ppi:ProposedValue>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (getBlock_Strecke_Allg_AttributeGroup_Zusatzinformation(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:Patternbeschreibung>[1..50]</ppi:Patternbeschreibung>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
	}

} //BlockPackageImpl
