/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Medien_und_Trassen.impl;

import java.math.BigDecimal;
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

import org.eclipse.set.model.model11001.Medien_und_Trassen.Ader_Durchmesser_TypeClass;
import org.eclipse.set.model.model11001.Medien_und_Trassen.Ader_Querschnitt_TypeClass;
import org.eclipse.set.model.model11001.Medien_und_Trassen.Ader_Reserve_TypeClass;
import org.eclipse.set.model.model11001.Medien_und_Trassen.Anzahl_Verseilelemente_TypeClass;
import org.eclipse.set.model.model11001.Medien_und_Trassen.Bezeichnung_Kabel_TypeClass;
import org.eclipse.set.model.model11001.Medien_und_Trassen.Bezeichnung_Kabel_Verteilpunkt_TypeClass;
import org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMKabelArt;
import org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMKabelVerteilpunktArt;
import org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseKanteArt;
import org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseKnotenArt;
import org.eclipse.set.model.model11001.Medien_und_Trassen.ENUMTrasseNutzer;
import org.eclipse.set.model.model11001.Medien_und_Trassen.Induktionsschutz_TypeClass;
import org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel;
import org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Allg_AttributeGroup;
import org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Art_TypeClass;
import org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Element_AttributeGroup;
import org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Laenge_TypeClass;
import org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Typ_TypeClass;
import org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Verteilpunkt;
import org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Verteilpunkt_Art_TypeClass;
import org.eclipse.set.model.model11001.Medien_und_Trassen.Kabel_Verteilpunkt_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.model11001.Medien_und_Trassen.Medien_und_TrassenFactory;
import org.eclipse.set.model.model11001.Medien_und_Trassen.Medien_und_TrassenPackage;
import org.eclipse.set.model.model11001.Medien_und_Trassen.Nagetierschutz_TypeClass;
import org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Kante;
import org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Kante_Art_TypeClass;
import org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Knoten;
import org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Knoten_Art_TypeClass;
import org.eclipse.set.model.model11001.Medien_und_Trassen.Trasse_Nutzer_TypeClass;
import org.eclipse.set.model.model11001.Medien_und_Trassen.Verseilart_TypeClass;

import org.eclipse.set.model.model11001.Medien_und_Trassen.util.Medien_und_TrassenValidator;

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
public class Medien_und_TrassenPackageImpl extends EPackageImpl implements Medien_und_TrassenPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ader_Durchmesser_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ader_Querschnitt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ader_Reserve_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anzahl_Verseilelemente_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_Kabel_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_Kabel_Verteilpunkt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass induktionsschutz_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kabel_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kabel_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kabel_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kabel_Element_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kabel_Laenge_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kabel_Typ_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kabel_VerteilpunktEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kabel_Verteilpunkt_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kabel_Verteilpunkt_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nagetierschutz_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trasse_KanteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trasse_Kante_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trasse_KnotenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trasse_Knoten_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trasse_Nutzer_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verseilart_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumKabelArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumKabelVerteilpunktArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumTrasseKanteArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumTrasseKnotenArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumTrasseNutzerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ader_Durchmesser_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ader_Querschnitt_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ader_Reserve_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType anzahl_Verseilelemente_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_Kabel_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_Kabel_Verteilpunkt_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumKabelArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumKabelVerteilpunktArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumTrasseKanteArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumTrasseKnotenArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumTrasseNutzerObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType induktionsschutz_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kabel_Laenge_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kabel_Typ_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType verseilart_TypeEDataType = null;

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
	 * @see org.eclipse.set.model.model11001.Medien_und_Trassen.Medien_und_TrassenPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Medien_und_TrassenPackageImpl() {
		super(eNS_URI, Medien_und_TrassenFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Medien_und_TrassenPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Medien_und_TrassenPackage init() {
		if (isInited) return (Medien_und_TrassenPackage)EPackage.Registry.INSTANCE.getEPackage(Medien_und_TrassenPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMedien_und_TrassenPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		Medien_und_TrassenPackageImpl theMedien_und_TrassenPackage = registeredMedien_und_TrassenPackage instanceof Medien_und_TrassenPackageImpl ? (Medien_und_TrassenPackageImpl)registeredMedien_und_TrassenPackage : new Medien_und_TrassenPackageImpl();

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
		theMedien_und_TrassenPackage.createPackageContents();
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
		theNahbedienungPackage.createPackageContents();
		thePZBPackage.createPackageContents();
		theRegelzeichnungPackage.createPackageContents();
		theSchluesselabhaengigkeitenPackage.createPackageContents();
		theSignalePackage.createPackageContents();
		theSignalbegriffe_StrukturPackage.createPackageContents();
		theZuglenkungPackage.createPackageContents();
		theZugnummernmeldeanlagePackage.createPackageContents();

		// Initialize created meta-data
		theMedien_und_TrassenPackage.initializePackageContents();
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

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theMedien_und_TrassenPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return Medien_und_TrassenValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theMedien_und_TrassenPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Medien_und_TrassenPackage.eNS_URI, theMedien_und_TrassenPackage);
		return theMedien_und_TrassenPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAder_Durchmesser_TypeClass() {
		return ader_Durchmesser_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAder_Durchmesser_TypeClass_Wert() {
		return (EAttribute)ader_Durchmesser_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAder_Querschnitt_TypeClass() {
		return ader_Querschnitt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAder_Querschnitt_TypeClass_Wert() {
		return (EAttribute)ader_Querschnitt_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAder_Reserve_TypeClass() {
		return ader_Reserve_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAder_Reserve_TypeClass_Wert() {
		return (EAttribute)ader_Reserve_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnzahl_Verseilelemente_TypeClass() {
		return anzahl_Verseilelemente_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnzahl_Verseilelemente_TypeClass_Wert() {
		return (EAttribute)anzahl_Verseilelemente_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_Kabel_TypeClass() {
		return bezeichnung_Kabel_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_Kabel_TypeClass_Wert() {
		return (EAttribute)bezeichnung_Kabel_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_Kabel_Verteilpunkt_TypeClass() {
		return bezeichnung_Kabel_Verteilpunkt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_Kabel_Verteilpunkt_TypeClass_Wert() {
		return (EAttribute)bezeichnung_Kabel_Verteilpunkt_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInduktionsschutz_TypeClass() {
		return induktionsschutz_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInduktionsschutz_TypeClass_Wert() {
		return (EAttribute)induktionsschutz_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKabel() {
		return kabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKabel_Bezeichnung() {
		return (EReference)kabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKabel_IDTrasseKante() {
		return (EReference)kabelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKabel_KabelAllg() {
		return (EReference)kabelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKabel_KabelElement() {
		return (EReference)kabelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKabel_Allg_AttributeGroup() {
		return kabel_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKabel_Allg_AttributeGroup_Induktionsschutz() {
		return (EReference)kabel_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKabel_Allg_AttributeGroup_KabelArt() {
		return (EReference)kabel_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKabel_Allg_AttributeGroup_KabelLaenge() {
		return (EReference)kabel_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKabel_Allg_AttributeGroup_KabelTyp() {
		return (EReference)kabel_Allg_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKabel_Allg_AttributeGroup_Nagetierschutz() {
		return (EReference)kabel_Allg_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKabel_Art_TypeClass() {
		return kabel_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKabel_Art_TypeClass_Wert() {
		return (EAttribute)kabel_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKabel_Bezeichnung_AttributeGroup() {
		return kabel_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKabel_Bezeichnung_AttributeGroup_BezeichnungKabel() {
		return (EReference)kabel_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKabel_Element_AttributeGroup() {
		return kabel_Element_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKabel_Element_AttributeGroup_AderReserve() {
		return (EReference)kabel_Element_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKabel_Element_AttributeGroup_AnzahlVerseilelemente() {
		return (EReference)kabel_Element_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKabel_Element_AttributeGroup_Verseilart() {
		return (EReference)kabel_Element_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKabel_Element_AttributeGroup_AderDurchmesser() {
		return (EReference)kabel_Element_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKabel_Element_AttributeGroup_AderQuerschnitt() {
		return (EReference)kabel_Element_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKabel_Laenge_TypeClass() {
		return kabel_Laenge_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKabel_Laenge_TypeClass_Wert() {
		return (EAttribute)kabel_Laenge_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKabel_Typ_TypeClass() {
		return kabel_Typ_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKabel_Typ_TypeClass_Wert() {
		return (EAttribute)kabel_Typ_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKabel_Verteilpunkt() {
		return kabel_VerteilpunktEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKabel_Verteilpunkt_Bezeichnung() {
		return (EReference)kabel_VerteilpunktEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKabel_Verteilpunkt_IDUnterbringung() {
		return (EReference)kabel_VerteilpunktEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKabel_Verteilpunkt_KabelVerteilpunktArt() {
		return (EReference)kabel_VerteilpunktEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKabel_Verteilpunkt_Art_TypeClass() {
		return kabel_Verteilpunkt_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKabel_Verteilpunkt_Art_TypeClass_Wert() {
		return (EAttribute)kabel_Verteilpunkt_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKabel_Verteilpunkt_Bezeichnung_AttributeGroup() {
		return kabel_Verteilpunkt_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKabel_Verteilpunkt_Bezeichnung_AttributeGroup_BezeichnungKabelVerteilpunkt() {
		return (EReference)kabel_Verteilpunkt_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNagetierschutz_TypeClass() {
		return nagetierschutz_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNagetierschutz_TypeClass_Wert() {
		return (EAttribute)nagetierschutz_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrasse_Kante() {
		return trasse_KanteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrasse_Kante_IDTrasseKnotenA() {
		return (EReference)trasse_KanteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrasse_Kante_IDTrasseKnotenB() {
		return (EReference)trasse_KanteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrasse_Kante_TrasseKanteArt() {
		return (EReference)trasse_KanteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrasse_Kante_TrasseNutzer() {
		return (EReference)trasse_KanteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrasse_Kante_Art_TypeClass() {
		return trasse_Kante_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrasse_Kante_Art_TypeClass_Wert() {
		return (EAttribute)trasse_Kante_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrasse_Knoten() {
		return trasse_KnotenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrasse_Knoten_IDAnschlussElement() {
		return (EReference)trasse_KnotenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrasse_Knoten_IDGEOKnoten() {
		return (EReference)trasse_KnotenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrasse_Knoten_TrasseKnotenArt() {
		return (EReference)trasse_KnotenEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrasse_Knoten_Art_TypeClass() {
		return trasse_Knoten_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrasse_Knoten_Art_TypeClass_Wert() {
		return (EAttribute)trasse_Knoten_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrasse_Nutzer_TypeClass() {
		return trasse_Nutzer_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrasse_Nutzer_TypeClass_Wert() {
		return (EAttribute)trasse_Nutzer_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerseilart_TypeClass() {
		return verseilart_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerseilart_TypeClass_Wert() {
		return (EAttribute)verseilart_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMKabelArt() {
		return enumKabelArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMKabelVerteilpunktArt() {
		return enumKabelVerteilpunktArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMTrasseKanteArt() {
		return enumTrasseKanteArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMTrasseKnotenArt() {
		return enumTrasseKnotenArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMTrasseNutzer() {
		return enumTrasseNutzerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAder_Durchmesser_Type() {
		return ader_Durchmesser_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAder_Querschnitt_Type() {
		return ader_Querschnitt_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAder_Reserve_Type() {
		return ader_Reserve_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAnzahl_Verseilelemente_Type() {
		return anzahl_Verseilelemente_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_Kabel_Type() {
		return bezeichnung_Kabel_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_Kabel_Verteilpunkt_Type() {
		return bezeichnung_Kabel_Verteilpunkt_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMKabelArtObject() {
		return enumKabelArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMKabelVerteilpunktArtObject() {
		return enumKabelVerteilpunktArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMTrasseKanteArtObject() {
		return enumTrasseKanteArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMTrasseKnotenArtObject() {
		return enumTrasseKnotenArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMTrasseNutzerObject() {
		return enumTrasseNutzerObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getInduktionsschutz_Type() {
		return induktionsschutz_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getKabel_Laenge_Type() {
		return kabel_Laenge_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getKabel_Typ_Type() {
		return kabel_Typ_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVerseilart_Type() {
		return verseilart_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Medien_und_TrassenFactory getMedien_und_TrassenFactory() {
		return (Medien_und_TrassenFactory)getEFactoryInstance();
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
		ader_Durchmesser_TypeClassEClass = createEClass(ADER_DURCHMESSER_TYPE_CLASS);
		createEAttribute(ader_Durchmesser_TypeClassEClass, ADER_DURCHMESSER_TYPE_CLASS__WERT);

		ader_Querschnitt_TypeClassEClass = createEClass(ADER_QUERSCHNITT_TYPE_CLASS);
		createEAttribute(ader_Querschnitt_TypeClassEClass, ADER_QUERSCHNITT_TYPE_CLASS__WERT);

		ader_Reserve_TypeClassEClass = createEClass(ADER_RESERVE_TYPE_CLASS);
		createEAttribute(ader_Reserve_TypeClassEClass, ADER_RESERVE_TYPE_CLASS__WERT);

		anzahl_Verseilelemente_TypeClassEClass = createEClass(ANZAHL_VERSEILELEMENTE_TYPE_CLASS);
		createEAttribute(anzahl_Verseilelemente_TypeClassEClass, ANZAHL_VERSEILELEMENTE_TYPE_CLASS__WERT);

		bezeichnung_Kabel_TypeClassEClass = createEClass(BEZEICHNUNG_KABEL_TYPE_CLASS);
		createEAttribute(bezeichnung_Kabel_TypeClassEClass, BEZEICHNUNG_KABEL_TYPE_CLASS__WERT);

		bezeichnung_Kabel_Verteilpunkt_TypeClassEClass = createEClass(BEZEICHNUNG_KABEL_VERTEILPUNKT_TYPE_CLASS);
		createEAttribute(bezeichnung_Kabel_Verteilpunkt_TypeClassEClass, BEZEICHNUNG_KABEL_VERTEILPUNKT_TYPE_CLASS__WERT);

		induktionsschutz_TypeClassEClass = createEClass(INDUKTIONSSCHUTZ_TYPE_CLASS);
		createEAttribute(induktionsschutz_TypeClassEClass, INDUKTIONSSCHUTZ_TYPE_CLASS__WERT);

		kabelEClass = createEClass(KABEL);
		createEReference(kabelEClass, KABEL__BEZEICHNUNG);
		createEReference(kabelEClass, KABEL__ID_TRASSE_KANTE);
		createEReference(kabelEClass, KABEL__KABEL_ALLG);
		createEReference(kabelEClass, KABEL__KABEL_ELEMENT);

		kabel_Allg_AttributeGroupEClass = createEClass(KABEL_ALLG_ATTRIBUTE_GROUP);
		createEReference(kabel_Allg_AttributeGroupEClass, KABEL_ALLG_ATTRIBUTE_GROUP__INDUKTIONSSCHUTZ);
		createEReference(kabel_Allg_AttributeGroupEClass, KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_ART);
		createEReference(kabel_Allg_AttributeGroupEClass, KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_LAENGE);
		createEReference(kabel_Allg_AttributeGroupEClass, KABEL_ALLG_ATTRIBUTE_GROUP__KABEL_TYP);
		createEReference(kabel_Allg_AttributeGroupEClass, KABEL_ALLG_ATTRIBUTE_GROUP__NAGETIERSCHUTZ);

		kabel_Art_TypeClassEClass = createEClass(KABEL_ART_TYPE_CLASS);
		createEAttribute(kabel_Art_TypeClassEClass, KABEL_ART_TYPE_CLASS__WERT);

		kabel_Bezeichnung_AttributeGroupEClass = createEClass(KABEL_BEZEICHNUNG_ATTRIBUTE_GROUP);
		createEReference(kabel_Bezeichnung_AttributeGroupEClass, KABEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KABEL);

		kabel_Element_AttributeGroupEClass = createEClass(KABEL_ELEMENT_ATTRIBUTE_GROUP);
		createEReference(kabel_Element_AttributeGroupEClass, KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_RESERVE);
		createEReference(kabel_Element_AttributeGroupEClass, KABEL_ELEMENT_ATTRIBUTE_GROUP__ANZAHL_VERSEILELEMENTE);
		createEReference(kabel_Element_AttributeGroupEClass, KABEL_ELEMENT_ATTRIBUTE_GROUP__VERSEILART);
		createEReference(kabel_Element_AttributeGroupEClass, KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_DURCHMESSER);
		createEReference(kabel_Element_AttributeGroupEClass, KABEL_ELEMENT_ATTRIBUTE_GROUP__ADER_QUERSCHNITT);

		kabel_Laenge_TypeClassEClass = createEClass(KABEL_LAENGE_TYPE_CLASS);
		createEAttribute(kabel_Laenge_TypeClassEClass, KABEL_LAENGE_TYPE_CLASS__WERT);

		kabel_Typ_TypeClassEClass = createEClass(KABEL_TYP_TYPE_CLASS);
		createEAttribute(kabel_Typ_TypeClassEClass, KABEL_TYP_TYPE_CLASS__WERT);

		kabel_VerteilpunktEClass = createEClass(KABEL_VERTEILPUNKT);
		createEReference(kabel_VerteilpunktEClass, KABEL_VERTEILPUNKT__BEZEICHNUNG);
		createEReference(kabel_VerteilpunktEClass, KABEL_VERTEILPUNKT__ID_UNTERBRINGUNG);
		createEReference(kabel_VerteilpunktEClass, KABEL_VERTEILPUNKT__KABEL_VERTEILPUNKT_ART);

		kabel_Verteilpunkt_Art_TypeClassEClass = createEClass(KABEL_VERTEILPUNKT_ART_TYPE_CLASS);
		createEAttribute(kabel_Verteilpunkt_Art_TypeClassEClass, KABEL_VERTEILPUNKT_ART_TYPE_CLASS__WERT);

		kabel_Verteilpunkt_Bezeichnung_AttributeGroupEClass = createEClass(KABEL_VERTEILPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP);
		createEReference(kabel_Verteilpunkt_Bezeichnung_AttributeGroupEClass, KABEL_VERTEILPUNKT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_KABEL_VERTEILPUNKT);

		nagetierschutz_TypeClassEClass = createEClass(NAGETIERSCHUTZ_TYPE_CLASS);
		createEAttribute(nagetierschutz_TypeClassEClass, NAGETIERSCHUTZ_TYPE_CLASS__WERT);

		trasse_KanteEClass = createEClass(TRASSE_KANTE);
		createEReference(trasse_KanteEClass, TRASSE_KANTE__ID_TRASSE_KNOTEN_A);
		createEReference(trasse_KanteEClass, TRASSE_KANTE__ID_TRASSE_KNOTEN_B);
		createEReference(trasse_KanteEClass, TRASSE_KANTE__TRASSE_KANTE_ART);
		createEReference(trasse_KanteEClass, TRASSE_KANTE__TRASSE_NUTZER);

		trasse_Kante_Art_TypeClassEClass = createEClass(TRASSE_KANTE_ART_TYPE_CLASS);
		createEAttribute(trasse_Kante_Art_TypeClassEClass, TRASSE_KANTE_ART_TYPE_CLASS__WERT);

		trasse_KnotenEClass = createEClass(TRASSE_KNOTEN);
		createEReference(trasse_KnotenEClass, TRASSE_KNOTEN__ID_ANSCHLUSS_ELEMENT);
		createEReference(trasse_KnotenEClass, TRASSE_KNOTEN__IDGEO_KNOTEN);
		createEReference(trasse_KnotenEClass, TRASSE_KNOTEN__TRASSE_KNOTEN_ART);

		trasse_Knoten_Art_TypeClassEClass = createEClass(TRASSE_KNOTEN_ART_TYPE_CLASS);
		createEAttribute(trasse_Knoten_Art_TypeClassEClass, TRASSE_KNOTEN_ART_TYPE_CLASS__WERT);

		trasse_Nutzer_TypeClassEClass = createEClass(TRASSE_NUTZER_TYPE_CLASS);
		createEAttribute(trasse_Nutzer_TypeClassEClass, TRASSE_NUTZER_TYPE_CLASS__WERT);

		verseilart_TypeClassEClass = createEClass(VERSEILART_TYPE_CLASS);
		createEAttribute(verseilart_TypeClassEClass, VERSEILART_TYPE_CLASS__WERT);

		// Create enums
		enumKabelArtEEnum = createEEnum(ENUM_KABEL_ART);
		enumKabelVerteilpunktArtEEnum = createEEnum(ENUM_KABEL_VERTEILPUNKT_ART);
		enumTrasseKanteArtEEnum = createEEnum(ENUM_TRASSE_KANTE_ART);
		enumTrasseKnotenArtEEnum = createEEnum(ENUM_TRASSE_KNOTEN_ART);
		enumTrasseNutzerEEnum = createEEnum(ENUM_TRASSE_NUTZER);

		// Create data types
		ader_Durchmesser_TypeEDataType = createEDataType(ADER_DURCHMESSER_TYPE);
		ader_Querschnitt_TypeEDataType = createEDataType(ADER_QUERSCHNITT_TYPE);
		ader_Reserve_TypeEDataType = createEDataType(ADER_RESERVE_TYPE);
		anzahl_Verseilelemente_TypeEDataType = createEDataType(ANZAHL_VERSEILELEMENTE_TYPE);
		bezeichnung_Kabel_TypeEDataType = createEDataType(BEZEICHNUNG_KABEL_TYPE);
		bezeichnung_Kabel_Verteilpunkt_TypeEDataType = createEDataType(BEZEICHNUNG_KABEL_VERTEILPUNKT_TYPE);
		enumKabelArtObjectEDataType = createEDataType(ENUM_KABEL_ART_OBJECT);
		enumKabelVerteilpunktArtObjectEDataType = createEDataType(ENUM_KABEL_VERTEILPUNKT_ART_OBJECT);
		enumTrasseKanteArtObjectEDataType = createEDataType(ENUM_TRASSE_KANTE_ART_OBJECT);
		enumTrasseKnotenArtObjectEDataType = createEDataType(ENUM_TRASSE_KNOTEN_ART_OBJECT);
		enumTrasseNutzerObjectEDataType = createEDataType(ENUM_TRASSE_NUTZER_OBJECT);
		induktionsschutz_TypeEDataType = createEDataType(INDUKTIONSSCHUTZ_TYPE);
		kabel_Laenge_TypeEDataType = createEDataType(KABEL_LAENGE_TYPE);
		kabel_Typ_TypeEDataType = createEDataType(KABEL_TYP_TYPE);
		verseilart_TypeEDataType = createEDataType(VERSEILART_TYPE);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		ader_Durchmesser_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		ader_Querschnitt_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		ader_Reserve_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		anzahl_Verseilelemente_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bezeichnung_Kabel_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bezeichnung_Kabel_Verteilpunkt_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		induktionsschutz_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		kabelEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		kabel_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		kabel_Laenge_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		kabel_Typ_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		kabel_VerteilpunktEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		kabel_Verteilpunkt_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		nagetierschutz_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		trasse_KanteEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		trasse_Kante_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		trasse_KnotenEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		trasse_Knoten_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		trasse_Nutzer_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		verseilart_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());

		// Initialize classes and features; add operations and parameters
		initEClass(ader_Durchmesser_TypeClassEClass, Ader_Durchmesser_TypeClass.class, "Ader_Durchmesser_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAder_Durchmesser_TypeClass_Wert(), this.getAder_Durchmesser_Type(), "wert", null, 1, 1, Ader_Durchmesser_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ader_Querschnitt_TypeClassEClass, Ader_Querschnitt_TypeClass.class, "Ader_Querschnitt_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAder_Querschnitt_TypeClass_Wert(), this.getAder_Querschnitt_Type(), "wert", null, 1, 1, Ader_Querschnitt_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ader_Reserve_TypeClassEClass, Ader_Reserve_TypeClass.class, "Ader_Reserve_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAder_Reserve_TypeClass_Wert(), this.getAder_Reserve_Type(), "wert", null, 1, 1, Ader_Reserve_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anzahl_Verseilelemente_TypeClassEClass, Anzahl_Verseilelemente_TypeClass.class, "Anzahl_Verseilelemente_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnzahl_Verseilelemente_TypeClass_Wert(), this.getAnzahl_Verseilelemente_Type(), "wert", null, 1, 1, Anzahl_Verseilelemente_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bezeichnung_Kabel_TypeClassEClass, Bezeichnung_Kabel_TypeClass.class, "Bezeichnung_Kabel_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBezeichnung_Kabel_TypeClass_Wert(), this.getBezeichnung_Kabel_Type(), "wert", null, 1, 1, Bezeichnung_Kabel_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bezeichnung_Kabel_Verteilpunkt_TypeClassEClass, Bezeichnung_Kabel_Verteilpunkt_TypeClass.class, "Bezeichnung_Kabel_Verteilpunkt_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBezeichnung_Kabel_Verteilpunkt_TypeClass_Wert(), this.getBezeichnung_Kabel_Verteilpunkt_Type(), "wert", null, 1, 1, Bezeichnung_Kabel_Verteilpunkt_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(induktionsschutz_TypeClassEClass, Induktionsschutz_TypeClass.class, "Induktionsschutz_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInduktionsschutz_TypeClass_Wert(), this.getInduktionsschutz_Type(), "wert", null, 1, 1, Induktionsschutz_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kabelEClass, Kabel.class, "Kabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKabel_Bezeichnung(), this.getKabel_Bezeichnung_AttributeGroup(), null, "bezeichnung", null, 1, 1, Kabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKabel_IDTrasseKante(), theVerweisePackage.getID_Trasse_Kante_TypeClass(), null, "iDTrasseKante", null, 0, -1, Kabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKabel_KabelAllg(), this.getKabel_Allg_AttributeGroup(), null, "kabelAllg", null, 1, 1, Kabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKabel_KabelElement(), this.getKabel_Element_AttributeGroup(), null, "kabelElement", null, 1, 2, Kabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kabel_Allg_AttributeGroupEClass, Kabel_Allg_AttributeGroup.class, "Kabel_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKabel_Allg_AttributeGroup_Induktionsschutz(), this.getInduktionsschutz_TypeClass(), null, "induktionsschutz", null, 0, 1, Kabel_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKabel_Allg_AttributeGroup_KabelArt(), this.getKabel_Art_TypeClass(), null, "kabelArt", null, 1, 1, Kabel_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKabel_Allg_AttributeGroup_KabelLaenge(), this.getKabel_Laenge_TypeClass(), null, "kabelLaenge", null, 1, 1, Kabel_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKabel_Allg_AttributeGroup_KabelTyp(), this.getKabel_Typ_TypeClass(), null, "kabelTyp", null, 1, 1, Kabel_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKabel_Allg_AttributeGroup_Nagetierschutz(), this.getNagetierschutz_TypeClass(), null, "nagetierschutz", null, 0, 1, Kabel_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kabel_Art_TypeClassEClass, Kabel_Art_TypeClass.class, "Kabel_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKabel_Art_TypeClass_Wert(), this.getENUMKabelArtObject(), "wert", null, 1, 1, Kabel_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kabel_Bezeichnung_AttributeGroupEClass, Kabel_Bezeichnung_AttributeGroup.class, "Kabel_Bezeichnung_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKabel_Bezeichnung_AttributeGroup_BezeichnungKabel(), this.getBezeichnung_Kabel_TypeClass(), null, "bezeichnungKabel", null, 1, 1, Kabel_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kabel_Element_AttributeGroupEClass, Kabel_Element_AttributeGroup.class, "Kabel_Element_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKabel_Element_AttributeGroup_AderReserve(), this.getAder_Reserve_TypeClass(), null, "aderReserve", null, 1, 1, Kabel_Element_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKabel_Element_AttributeGroup_AnzahlVerseilelemente(), this.getAnzahl_Verseilelemente_TypeClass(), null, "anzahlVerseilelemente", null, 1, 1, Kabel_Element_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKabel_Element_AttributeGroup_Verseilart(), this.getVerseilart_TypeClass(), null, "verseilart", null, 0, 1, Kabel_Element_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKabel_Element_AttributeGroup_AderDurchmesser(), this.getAder_Durchmesser_TypeClass(), null, "aderDurchmesser", null, 0, 1, Kabel_Element_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKabel_Element_AttributeGroup_AderQuerschnitt(), this.getAder_Querschnitt_TypeClass(), null, "aderQuerschnitt", null, 0, 1, Kabel_Element_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kabel_Laenge_TypeClassEClass, Kabel_Laenge_TypeClass.class, "Kabel_Laenge_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKabel_Laenge_TypeClass_Wert(), this.getKabel_Laenge_Type(), "wert", null, 1, 1, Kabel_Laenge_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kabel_Typ_TypeClassEClass, Kabel_Typ_TypeClass.class, "Kabel_Typ_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKabel_Typ_TypeClass_Wert(), this.getKabel_Typ_Type(), "wert", null, 1, 1, Kabel_Typ_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kabel_VerteilpunktEClass, Kabel_Verteilpunkt.class, "Kabel_Verteilpunkt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKabel_Verteilpunkt_Bezeichnung(), this.getKabel_Verteilpunkt_Bezeichnung_AttributeGroup(), null, "bezeichnung", null, 1, 1, Kabel_Verteilpunkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKabel_Verteilpunkt_IDUnterbringung(), theVerweisePackage.getID_Unterbringung_TypeClass(), null, "iDUnterbringung", null, 1, 1, Kabel_Verteilpunkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getKabel_Verteilpunkt_KabelVerteilpunktArt(), this.getKabel_Verteilpunkt_Art_TypeClass(), null, "kabelVerteilpunktArt", null, 1, 1, Kabel_Verteilpunkt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kabel_Verteilpunkt_Art_TypeClassEClass, Kabel_Verteilpunkt_Art_TypeClass.class, "Kabel_Verteilpunkt_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKabel_Verteilpunkt_Art_TypeClass_Wert(), this.getENUMKabelVerteilpunktArtObject(), "wert", null, 1, 1, Kabel_Verteilpunkt_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kabel_Verteilpunkt_Bezeichnung_AttributeGroupEClass, Kabel_Verteilpunkt_Bezeichnung_AttributeGroup.class, "Kabel_Verteilpunkt_Bezeichnung_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKabel_Verteilpunkt_Bezeichnung_AttributeGroup_BezeichnungKabelVerteilpunkt(), this.getBezeichnung_Kabel_Verteilpunkt_TypeClass(), null, "bezeichnungKabelVerteilpunkt", null, 1, 1, Kabel_Verteilpunkt_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nagetierschutz_TypeClassEClass, Nagetierschutz_TypeClass.class, "Nagetierschutz_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNagetierschutz_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Nagetierschutz_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trasse_KanteEClass, Trasse_Kante.class, "Trasse_Kante", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrasse_Kante_IDTrasseKnotenA(), theVerweisePackage.getID_Trasse_Knoten_TypeClass(), null, "iDTrasseKnotenA", null, 1, 1, Trasse_Kante.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrasse_Kante_IDTrasseKnotenB(), theVerweisePackage.getID_Trasse_Knoten_TypeClass(), null, "iDTrasseKnotenB", null, 1, 1, Trasse_Kante.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrasse_Kante_TrasseKanteArt(), this.getTrasse_Kante_Art_TypeClass(), null, "trasseKanteArt", null, 1, 1, Trasse_Kante.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrasse_Kante_TrasseNutzer(), this.getTrasse_Nutzer_TypeClass(), null, "trasseNutzer", null, 1, -1, Trasse_Kante.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trasse_Kante_Art_TypeClassEClass, Trasse_Kante_Art_TypeClass.class, "Trasse_Kante_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrasse_Kante_Art_TypeClass_Wert(), this.getENUMTrasseKanteArtObject(), "wert", null, 1, 1, Trasse_Kante_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trasse_KnotenEClass, Trasse_Knoten.class, "Trasse_Knoten", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrasse_Knoten_IDAnschlussElement(), theVerweisePackage.getID_Anschluss_Element_TypeClass(), null, "iDAnschlussElement", null, 0, -1, Trasse_Knoten.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrasse_Knoten_IDGEOKnoten(), theVerweisePackage.getID_GEO_Knoten_TypeClass(), null, "iDGEOKnoten", null, 1, 1, Trasse_Knoten.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrasse_Knoten_TrasseKnotenArt(), this.getTrasse_Knoten_Art_TypeClass(), null, "trasseKnotenArt", null, 1, 1, Trasse_Knoten.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trasse_Knoten_Art_TypeClassEClass, Trasse_Knoten_Art_TypeClass.class, "Trasse_Knoten_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrasse_Knoten_Art_TypeClass_Wert(), this.getENUMTrasseKnotenArtObject(), "wert", null, 1, 1, Trasse_Knoten_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(trasse_Nutzer_TypeClassEClass, Trasse_Nutzer_TypeClass.class, "Trasse_Nutzer_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrasse_Nutzer_TypeClass_Wert(), this.getENUMTrasseNutzerObject(), "wert", null, 1, 1, Trasse_Nutzer_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verseilart_TypeClassEClass, Verseilart_TypeClass.class, "Verseilart_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerseilart_TypeClass_Wert(), this.getVerseilart_Type(), "wert", null, 1, 1, Verseilart_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumKabelArtEEnum, ENUMKabelArt.class, "ENUMKabelArt");
		addEEnumLiteral(enumKabelArtEEnum, ENUMKabelArt.ENUM_KABEL_ART_BALISENKABEL);
		addEEnumLiteral(enumKabelArtEEnum, ENUMKabelArt.ENUM_KABEL_ART_ENERGIE_400V_AC);
		addEEnumLiteral(enumKabelArtEEnum, ENUMKabelArt.ENUM_KABEL_ART_ENERGIE_750V_DC);
		addEEnumLiteral(enumKabelArtEEnum, ENUMKabelArt.ENUM_KABEL_ART_LWL);
		addEEnumLiteral(enumKabelArtEEnum, ENUMKabelArt.ENUM_KABEL_ART_SIGNALKABEL_ADRIG);
		addEEnumLiteral(enumKabelArtEEnum, ENUMKabelArt.ENUM_KABEL_ART_SIGNALKABEL_KOMBINIERT);
		addEEnumLiteral(enumKabelArtEEnum, ENUMKabelArt.ENUM_KABEL_ART_SIGNALKABEL_STERNVIERER);
		addEEnumLiteral(enumKabelArtEEnum, ENUMKabelArt.ENUM_KABEL_ART_SONSTIGE);

		initEEnum(enumKabelVerteilpunktArtEEnum, ENUMKabelVerteilpunktArt.class, "ENUMKabelVerteilpunktArt");
		addEEnumLiteral(enumKabelVerteilpunktArtEEnum, ENUMKabelVerteilpunktArt.ENUM_KABEL_VERTEILPUNKT_ART_KABELSCHRANK);
		addEEnumLiteral(enumKabelVerteilpunktArtEEnum, ENUMKabelVerteilpunktArt.ENUM_KABEL_VERTEILPUNKT_ART_KABELVERTEILER);
		addEEnumLiteral(enumKabelVerteilpunktArtEEnum, ENUMKabelVerteilpunktArt.ENUM_KABEL_VERTEILPUNKT_ART_SONSTIGE);

		initEEnum(enumTrasseKanteArtEEnum, ENUMTrasseKanteArt.class, "ENUMTrasseKanteArt");
		addEEnumLiteral(enumTrasseKanteArtEEnum, ENUMTrasseKanteArt.ENUM_TRASSE_KANTE_ART_ERDTRASSE);
		addEEnumLiteral(enumTrasseKanteArtEEnum, ENUMTrasseKanteArt.ENUM_TRASSE_KANTE_ART_FREI);
		addEEnumLiteral(enumTrasseKanteArtEEnum, ENUMTrasseKanteArt.ENUM_TRASSE_KANTE_ART_KABELGESTELL_TUNNEL);
		addEEnumLiteral(enumTrasseKanteArtEEnum, ENUMTrasseKanteArt.ENUM_TRASSE_KANTE_ART_LUFTTRASSE);
		addEEnumLiteral(enumTrasseKanteArtEEnum, ENUMTrasseKanteArt.ENUM_TRASSE_KANTE_ART_ROHRTRASSE);
		addEEnumLiteral(enumTrasseKanteArtEEnum, ENUMTrasseKanteArt.ENUM_TRASSE_KANTE_ART_SONSTIGE);
		addEEnumLiteral(enumTrasseKanteArtEEnum, ENUMTrasseKanteArt.ENUM_TRASSE_KANTE_ART_TROGTRASSE);
		addEEnumLiteral(enumTrasseKanteArtEEnum, ENUMTrasseKanteArt.ENUM_TRASSE_KANTE_ART_TROGTRASSE_AUFGESTAENDERT);
		addEEnumLiteral(enumTrasseKanteArtEEnum, ENUMTrasseKanteArt.ENUM_TRASSE_KANTE_ART_TROGTRASSE_BEHELF);

		initEEnum(enumTrasseKnotenArtEEnum, ENUMTrasseKnotenArt.class, "ENUMTrasseKnotenArt");
		addEEnumLiteral(enumTrasseKnotenArtEEnum, ENUMTrasseKnotenArt.ENUM_TRASSE_KNOTEN_ART_SCHACHT);
		addEEnumLiteral(enumTrasseKnotenArtEEnum, ENUMTrasseKnotenArt.ENUM_TRASSE_KNOTEN_ART_SONSTIGE);
		addEEnumLiteral(enumTrasseKnotenArtEEnum, ENUMTrasseKnotenArt.ENUM_TRASSE_KNOTEN_ART_TRASSENABZWEIG);
		addEEnumLiteral(enumTrasseKnotenArtEEnum, ENUMTrasseKnotenArt.ENUM_TRASSE_KNOTEN_ART_TRASSENAENDERUNG);
		addEEnumLiteral(enumTrasseKnotenArtEEnum, ENUMTrasseKnotenArt.ENUM_TRASSE_KNOTEN_ART_TRASSENAUSLASS);
		addEEnumLiteral(enumTrasseKnotenArtEEnum, ENUMTrasseKnotenArt.ENUM_TRASSE_KNOTEN_ART_TRASSENENDE);

		initEEnum(enumTrasseNutzerEEnum, ENUMTrasseNutzer.class, "ENUMTrasseNutzer");
		addEEnumLiteral(enumTrasseNutzerEEnum, ENUMTrasseNutzer.ENUM_TRASSE_NUTZER_DB_ENERGIE);
		addEEnumLiteral(enumTrasseNutzerEEnum, ENUMTrasseNutzer.ENUM_TRASSE_NUTZER_DB_KT);
		addEEnumLiteral(enumTrasseNutzerEEnum, ENUMTrasseNutzer.ENUM_TRASSE_NUTZER_DB_NETZ);
		addEEnumLiteral(enumTrasseNutzerEEnum, ENUMTrasseNutzer.ENUM_TRASSE_NUTZER_DB_STU_S);
		addEEnumLiteral(enumTrasseNutzerEEnum, ENUMTrasseNutzer.ENUM_TRASSE_NUTZER_DRITTE);
		addEEnumLiteral(enumTrasseNutzerEEnum, ENUMTrasseNutzer.ENUM_TRASSE_NUTZER_SONSTIGE);
		addEEnumLiteral(enumTrasseNutzerEEnum, ENUMTrasseNutzer.ENUM_TRASSE_NUTZER_UNBEKANNT);

		// Initialize data types
		initEDataType(ader_Durchmesser_TypeEDataType, BigDecimal.class, "Ader_Durchmesser_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ader_Querschnitt_TypeEDataType, BigDecimal.class, "Ader_Querschnitt_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ader_Reserve_TypeEDataType, BigInteger.class, "Ader_Reserve_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(anzahl_Verseilelemente_TypeEDataType, BigInteger.class, "Anzahl_Verseilelemente_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bezeichnung_Kabel_TypeEDataType, String.class, "Bezeichnung_Kabel_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bezeichnung_Kabel_Verteilpunkt_TypeEDataType, String.class, "Bezeichnung_Kabel_Verteilpunkt_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumKabelArtObjectEDataType, ENUMKabelArt.class, "ENUMKabelArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumKabelVerteilpunktArtObjectEDataType, ENUMKabelVerteilpunktArt.class, "ENUMKabelVerteilpunktArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumTrasseKanteArtObjectEDataType, ENUMTrasseKanteArt.class, "ENUMTrasseKanteArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumTrasseKnotenArtObjectEDataType, ENUMTrasseKnotenArt.class, "ENUMTrasseKnotenArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumTrasseNutzerObjectEDataType, ENUMTrasseNutzer.class, "ENUMTrasseNutzerObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(induktionsschutz_TypeEDataType, BigInteger.class, "Induktionsschutz_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(kabel_Laenge_TypeEDataType, BigDecimal.class, "Kabel_Laenge_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(kabel_Typ_TypeEDataType, String.class, "Kabel_Typ_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(verseilart_TypeEDataType, BigInteger.class, "Verseilart_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
			   "documentation", "Dieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface."
		   });
		addAnnotation
		  (enumTrasseKanteArtEEnum,
		   source,
		   new String[] {
			   "documentation", "\\\"frei\\\"==Kabelverlegung ohne Kabeltiefbau (z. B. Verlegung auf Schotter, Verbindung benachbarter Schaltschr\u00e4nke)"
		   });
		addAnnotation
		  (enumTrasseKnotenArtEEnum,
		   source,
		   new String[] {
			   "documentation", "\\\"Schacht, Trassenabzweig\\\"==Abzweig beliebig vieler Trassen;\n\\\"Trassenauslass\\\"==Auslass von Kabeln (z. B. zu einem Kabelverteiler), wobei die Verbindung Trasse - Verteiler nicht als eigene Trasse abgebildet wird "
		   });
		addAnnotation
		  (kabelEClass,
		   source,
		   new String[] {
			   "documentation", "Medium zur \u00dcbermittlung von Energie und/oder Information."
		   });
		addAnnotation
		  (getKabel_IDTrasseKante(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die Trassen-Kante des Kabel-Gef\u00e4\u00dfsystems, in dem das Kabel verlegt werden soll bzw. ist. Kurze Verbindungen sind auch ohne Kabelgef\u00e4\u00dfsystem m\u00f6glich, z. B. zwischen zwei benachbarten Schaltk\u00e4sten."
		   });
		addAnnotation
		  (getKabel_KabelElement(),
		   source,
		   new String[] {
			   "documentation", "Attributgruppe zur Angabe der Kabeleigenschaften je Verseilart. Bei kombinierten Signalkabeln wird die Attributgruppe zweimal instanziiert, sonst einmal."
		   });
		addAnnotation
		  (getKabel_Allg_AttributeGroup_Induktionsschutz(),
		   source,
		   new String[] {
			   "documentation", "Induktionsschutz-Klasse rx (16,7 Hz)."
		   });
		addAnnotation
		  (getKabel_Allg_AttributeGroup_KabelArt(),
		   source,
		   new String[] {
			   "documentation", "Art des Kabels, z. B. Signalkabel oder Lichtwellenleiter (LWL)."
		   });
		addAnnotation
		  (getKabel_Allg_AttributeGroup_KabelLaenge(),
		   source,
		   new String[] {
			   "documentation", "L\u00e4nge des Kabels in m."
		   });
		addAnnotation
		  (getKabel_Allg_AttributeGroup_KabelTyp(),
		   source,
		   new String[] {
			   "documentation", "Typ des Kabels. Eine Liste der zugelassenen Kabeltypen soll \u00fcber Planungswerkzeug vorgegeben werden."
		   });
		addAnnotation
		  (getKabel_Allg_AttributeGroup_Nagetierschutz(),
		   source,
		   new String[] {
			   "documentation", "Angabe, ob das Kabel mit einem Nagetierschutz zu versehen ist (true). Der Wert false wird nicht verwendet."
		   });
		addAnnotation
		  (getKabel_Bezeichnung_AttributeGroup_BezeichnungKabel(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnung des Kabels."
		   });
		addAnnotation
		  (getKabel_Element_AttributeGroup_AderReserve(),
		   source,
		   new String[] {
			   "documentation", "Anzahl der Reserveadern. Bsp.: 3x4x1,4 (4).\nDie unter Anzahl_Verseilelemente angebbare Aderanzahl muss auch als Reserve angebbar sein (freigeschaltetes Kabel)."
		   });
		addAnnotation
		  (getKabel_Element_AttributeGroup_AnzahlVerseilelemente(),
		   source,
		   new String[] {
			   "documentation", "Anzahl der Verseilelemente. Bsp.: 3x4x1,4."
		   });
		addAnnotation
		  (getKabel_Element_AttributeGroup_Verseilart(),
		   source,
		   new String[] {
			   "documentation", "Verseilart (4 = Viererverseilung; 1 = adrige Verseilung). Bsp.: 3x4x1,4."
		   });
		addAnnotation
		  (getKabel_Element_AttributeGroup_AderDurchmesser(),
		   source,
		   new String[] {
			   "documentation", "Bei Signalkabeln: Durchmesser der Kabeladern in mm. Bsp.: 3x4x1,4."
		   });
		addAnnotation
		  (getKabel_Element_AttributeGroup_AderQuerschnitt(),
		   source,
		   new String[] {
			   "documentation", "Bei Kabeln zur rein elektrischen Energie\u00fcbertragung: Querschnitt der Kabeladern in Quadratmillimetern. Bsp.: 2x1,5."
		   });
		addAnnotation
		  (kabel_VerteilpunktEClass,
		   source,
		   new String[] {
			   "documentation", "Punktf\u00f6rmige Installation zur Aufteilung bzw. Verschaltung von Kabeln (ohne Intelligenz)."
		   });
		addAnnotation
		  (getKabel_Verteilpunkt_IDUnterbringung(),
		   source,
		   new String[] {
			   "documentation", "Art des Kabel-Verteilpunkts."
		   });
		addAnnotation
		  (getKabel_Verteilpunkt_KabelVerteilpunktArt(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die Unterbringung des Kabel-Verteilpunkts. Als Art der Unterbringung ist dabei immer \\\"keine\\\" auszuw\u00e4hlen, da der Kabel-Verteilpunkt selbst die physische Unterbringung definiert."
		   });
		addAnnotation
		  (getKabel_Verteilpunkt_Bezeichnung_AttributeGroup_BezeichnungKabelVerteilpunkt(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnung des Kabel-Verteilpunkts."
		   });
		addAnnotation
		  (trasse_KanteEClass,
		   source,
		   new String[] {
			   "documentation", "Kante des topologischen Knoten-Kanten-Modells zur Darstellung des Kabelgef\u00e4\u00dfsystems (Kabeltrasse) oder gleichartiger Medientrassen. Die Trasse Kante ist vom Knoten A zum Knoten B gerichtet und muss immer an zwei Trasse Knoten enden. Der geometrische Verlauf einer Trasse_Kante kann durch eine oder mehrere GEO_Kanten beschrieben werden (siehe auch TOP_Kante)."
		   });
		addAnnotation
		  (getTrasse_Kante_IDTrasseKnotenA(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf den Trasse Knoten am Anfang der Kante."
		   });
		addAnnotation
		  (getTrasse_Kante_IDTrasseKnotenB(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf den Trasse Knoten am Ende der Kante."
		   });
		addAnnotation
		  (getTrasse_Kante_TrasseKanteArt(),
		   source,
		   new String[] {
			   "documentation", "Art der Medientrasse (z. B. Luft- oder Trogtrasse)."
		   });
		addAnnotation
		  (getTrasse_Kante_TrasseNutzer(),
		   source,
		   new String[] {
			   "documentation", "Nutzer der Medientrasse, z. B. DB Netz. Eine Trasse kann von mehreren Nutzern beansprucht werden."
		   });
		addAnnotation
		  (trasse_KnotenEClass,
		   source,
		   new String[] {
			   "documentation", "Knoten des topologischen Knoten-Kanten-Modells zur Darstellung des Kabelgef\u00e4\u00dfsystems (Kabeltrasse) oder gleichartiger Medientrassen. Der Trasse_Knoten verweist auf einen GEO_Knoten. Die Anzahl der an den Trasse_Knoten anschlie\u00dfenden topologischen Kanten ist je nach Art des Trasse_Knoten unterschiedlich und muss mit der Anzahl der an den zugeh\u00f6rigen GEO Knoten anschlie\u00dfenden GEO_Kanten \u00fcbereinstimmen."
		   });
		addAnnotation
		  (getTrasse_Knoten_IDAnschlussElement(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf das Anschluss-Element, das durch den Trassen-Knoten repr\u00e4sentiert wird. Der Verweis wird nicht gef\u00fcllt bei Schacht, Trassenabzweig, Trassen\u00e4nderung, ggf. auch nicht bei Trassenende. Die Medientrasse kann ggf.wenige Meter vor dem Anschlusselement enden, wenn f\u00fcr den Weg bis zum Anschlusselement eine freie Verlegung (z. B. im Schotter) vorgesehen ist. "
		   });
		addAnnotation
		  (getTrasse_Knoten_IDGEOKnoten(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf den zugeh\u00f6rigen GEO_Knoten, \u00fcber den mittelbar (GEO_Punkt) auch eine Verortung erfolgen kann."
		   });
		addAnnotation
		  (getTrasse_Knoten_TrasseKnotenArt(),
		   source,
		   new String[] {
			   "documentation", "Art des Trassenknotens, z. B. Trassenende oder -abzweig. Beim Wechsel der Trassen(kanten)art ist ein Trassenknoten der Art \\\"Trassenaenderung\\\" vorzusehen."
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
		  (ader_Durchmesser_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TAder_Durchmesser",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "pattern", "[01][.][1-8]|[0][.][9]|[1][.][0]"
		   });
		addAnnotation
		  (ader_Durchmesser_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCAder_Durchmesser",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAder_Durchmesser_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (ader_Querschnitt_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TAder_Querschnitt",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "pattern", "[1-9][0-9]?([.][1-9])?"
		   });
		addAnnotation
		  (ader_Querschnitt_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCAder_Querschnitt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAder_Querschnitt_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (ader_Reserve_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TAder_Reserve",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "pattern", "[1-9][0-9]{0,1}|[1][0-9]{2}|200"
		   });
		addAnnotation
		  (ader_Reserve_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCAder_Reserve",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAder_Reserve_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (anzahl_Verseilelemente_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TAnzahl_Verseilelemente",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "pattern", "[1-9][0-9]{0,1}|[1][0-9]{2}|200"
		   });
		addAnnotation
		  (anzahl_Verseilelemente_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCAnzahl_Verseilelemente",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAnzahl_Verseilelemente_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bezeichnung_Kabel_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBezeichnung_Kabel",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText",
			   "pattern", "[1-9]|1[0-6]"
		   });
		addAnnotation
		  (bezeichnung_Kabel_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBezeichnung_Kabel",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBezeichnung_Kabel_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bezeichnung_Kabel_Verteilpunkt_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBezeichnung_Kabel_Verteilpunkt",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText",
			   "pattern", "[1-9]|1[0-9]|20"
		   });
		addAnnotation
		  (bezeichnung_Kabel_Verteilpunkt_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBezeichnung_Kabel_Verteilpunkt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBezeichnung_Kabel_Verteilpunkt_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (enumKabelArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMKabel_Art"
		   });
		addAnnotation
		  (enumKabelArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMKabel_Art:Object",
			   "baseType", "ENUMKabel_Art"
		   });
		addAnnotation
		  (enumKabelVerteilpunktArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMKabel_Verteilpunkt_Art"
		   });
		addAnnotation
		  (enumKabelVerteilpunktArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMKabel_Verteilpunkt_Art:Object",
			   "baseType", "ENUMKabel_Verteilpunkt_Art"
		   });
		addAnnotation
		  (enumTrasseKanteArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMTrasse_Kante_Art"
		   });
		addAnnotation
		  (enumTrasseKanteArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMTrasse_Kante_Art:Object",
			   "baseType", "ENUMTrasse_Kante_Art"
		   });
		addAnnotation
		  (enumTrasseKnotenArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMTrasse_Knoten_Art"
		   });
		addAnnotation
		  (enumTrasseKnotenArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMTrasse_Knoten_Art:Object",
			   "baseType", "ENUMTrasse_Knoten_Art"
		   });
		addAnnotation
		  (enumTrasseNutzerEEnum,
		   source,
		   new String[] {
			   "name", "ENUMTrasse_Nutzer"
		   });
		addAnnotation
		  (enumTrasseNutzerObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMTrasse_Nutzer:Object",
			   "baseType", "ENUMTrasse_Nutzer"
		   });
		addAnnotation
		  (induktionsschutz_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TInduktionsschutz",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer"
		   });
		addAnnotation
		  (induktionsschutz_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCInduktionsschutz",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getInduktionsschutz_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (kabelEClass,
		   source,
		   new String[] {
			   "name", "CKabel",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKabel_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getKabel_IDTrasseKante(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Trasse_Kante"
		   });
		addAnnotation
		  (getKabel_KabelAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Kabel_Allg"
		   });
		addAnnotation
		  (getKabel_KabelElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Kabel_Element"
		   });
		addAnnotation
		  (kabel_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CKabel_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKabel_Allg_AttributeGroup_Induktionsschutz(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Induktionsschutz"
		   });
		addAnnotation
		  (getKabel_Allg_AttributeGroup_KabelArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Kabel_Art"
		   });
		addAnnotation
		  (getKabel_Allg_AttributeGroup_KabelLaenge(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Kabel_Laenge"
		   });
		addAnnotation
		  (getKabel_Allg_AttributeGroup_KabelTyp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Kabel_Typ"
		   });
		addAnnotation
		  (getKabel_Allg_AttributeGroup_Nagetierschutz(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Nagetierschutz"
		   });
		addAnnotation
		  (kabel_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCKabel_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKabel_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (kabel_Bezeichnung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CKabel_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKabel_Bezeichnung_AttributeGroup_BezeichnungKabel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung_Kabel"
		   });
		addAnnotation
		  (kabel_Element_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CKabel_Element",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKabel_Element_AttributeGroup_AderReserve(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Ader_Reserve"
		   });
		addAnnotation
		  (getKabel_Element_AttributeGroup_AnzahlVerseilelemente(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Anzahl_Verseilelemente"
		   });
		addAnnotation
		  (getKabel_Element_AttributeGroup_Verseilart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Verseilart"
		   });
		addAnnotation
		  (getKabel_Element_AttributeGroup_AderDurchmesser(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Ader_Durchmesser"
		   });
		addAnnotation
		  (getKabel_Element_AttributeGroup_AderQuerschnitt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Ader_Querschnitt"
		   });
		addAnnotation
		  (kabel_Laenge_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TKabel_Laenge",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter",
			   "pattern", "(-?[1-9][0-9]{0,})|0"
		   });
		addAnnotation
		  (kabel_Laenge_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCKabel_Laenge",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKabel_Laenge_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (kabel_Typ_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TKabel_Typ",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText"
		   });
		addAnnotation
		  (kabel_Typ_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCKabel_Typ",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKabel_Typ_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (kabel_VerteilpunktEClass,
		   source,
		   new String[] {
			   "name", "CKabel_Verteilpunkt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKabel_Verteilpunkt_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getKabel_Verteilpunkt_IDUnterbringung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Unterbringung"
		   });
		addAnnotation
		  (getKabel_Verteilpunkt_KabelVerteilpunktArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Kabel_Verteilpunkt_Art"
		   });
		addAnnotation
		  (kabel_Verteilpunkt_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCKabel_Verteilpunkt_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKabel_Verteilpunkt_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (kabel_Verteilpunkt_Bezeichnung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CKabel_Verteilpunkt_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getKabel_Verteilpunkt_Bezeichnung_AttributeGroup_BezeichnungKabelVerteilpunkt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung_Kabel_Verteilpunkt"
		   });
		addAnnotation
		  (nagetierschutz_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCNagetierschutz",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getNagetierschutz_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (trasse_KanteEClass,
		   source,
		   new String[] {
			   "name", "CTrasse_Kante",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTrasse_Kante_IDTrasseKnotenA(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Trasse_Knoten_A"
		   });
		addAnnotation
		  (getTrasse_Kante_IDTrasseKnotenB(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Trasse_Knoten_B"
		   });
		addAnnotation
		  (getTrasse_Kante_TrasseKanteArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Trasse_Kante_Art"
		   });
		addAnnotation
		  (getTrasse_Kante_TrasseNutzer(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Trasse_Nutzer"
		   });
		addAnnotation
		  (trasse_Kante_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTrasse_Kante_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTrasse_Kante_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (trasse_KnotenEClass,
		   source,
		   new String[] {
			   "name", "CTrasse_Knoten",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTrasse_Knoten_IDAnschlussElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Anschluss_Element"
		   });
		addAnnotation
		  (getTrasse_Knoten_IDGEOKnoten(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_GEO_Knoten"
		   });
		addAnnotation
		  (getTrasse_Knoten_TrasseKnotenArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Trasse_Knoten_Art"
		   });
		addAnnotation
		  (trasse_Knoten_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTrasse_Knoten_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTrasse_Knoten_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (trasse_Nutzer_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTrasse_Nutzer",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTrasse_Nutzer_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (verseilart_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TVerseilart",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "pattern", "[1|4]"
		   });
		addAnnotation
		  (verseilart_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCVerseilart",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getVerseilart_TypeClass_Wert(),
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
		  (kabelEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW|B\u00dc</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getKabel_Allg_AttributeGroup_KabelLaenge(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[ganzzahliger Wert]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getKabel_Bezeichnung_AttributeGroup_BezeichnungKabel(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[1..16]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getKabel_Element_AttributeGroup_AderReserve(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[1..200]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getKabel_Element_AttributeGroup_AnzahlVerseilelemente(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[1..200]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getKabel_Element_AttributeGroup_Verseilart(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[1,4]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getKabel_Element_AttributeGroup_AderDurchmesser(),
		   source,
		   new String[] {
			   "appinfo", "\n                       \n  <ppi:WorkflowInformation>\n                            \n    <ppi:Patternbeschreibung>[0.1..1.8]</ppi:Patternbeschreibung>\n                         \n  </ppi:WorkflowInformation>\n                    \n"
		   });
		addAnnotation
		  (getKabel_Element_AttributeGroup_AderQuerschnitt(),
		   source,
		   new String[] {
			   "appinfo", "\n                       \n  <ppi:WorkflowInformation>\n                            \n    <ppi:Patternbeschreibung>[1..99, optional eine Nachkommastelle]</ppi:Patternbeschreibung>\n                         \n  </ppi:WorkflowInformation>\n                    \n"
		   });
		addAnnotation
		  (kabel_VerteilpunktEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW|B\u00dc</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getKabel_Verteilpunkt_Bezeichnung_AttributeGroup_BezeichnungKabelVerteilpunkt(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[1..20]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (trasse_KanteEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW|B\u00dc</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getTrasse_Kante_TrasseNutzer(),
		   source,
		   new String[] {
			   "appinfo", "\n                          \n  <ppi:WorkflowInformation>\n                               \n    <ppi:ProposedValue>DB_Netz</ppi:ProposedValue>\n                            \n  </ppi:WorkflowInformation>\n                       \n"
		   });
		addAnnotation
		  (trasse_KnotenEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW|B\u00dc</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
	}

} //Medien_und_TrassenPackageImpl
