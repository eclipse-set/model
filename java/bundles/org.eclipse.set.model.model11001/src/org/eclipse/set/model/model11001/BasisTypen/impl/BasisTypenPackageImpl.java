/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.BasisTypen.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

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

import org.eclipse.set.model.model11001.BasisTypen.BasisAttribut_AttributeGroup;
import org.eclipse.set.model.model11001.BasisTypen.BasisTypenFactory;
import org.eclipse.set.model.model11001.BasisTypen.BasisTypenPackage;
import org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Aussenanlage_TypeClass;
import org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Element_AttributeGroup;
import org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Lageplan_Kurz_TypeClass;
import org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Lageplan_Lang_TypeClass;
import org.eclipse.set.model.model11001.BasisTypen.Bezeichnung_Tabelle_TypeClass;
import org.eclipse.set.model.model11001.BasisTypen.Datum_Auslieferung_TypeClass;
import org.eclipse.set.model.model11001.BasisTypen.ENUMAnwendungssystem;
import org.eclipse.set.model.model11001.BasisTypen.ENUMAusrichtung;
import org.eclipse.set.model.model11001.BasisTypen.ENUMBremsweg;
import org.eclipse.set.model.model11001.BasisTypen.ENUMFahrstrom;
import org.eclipse.set.model.model11001.BasisTypen.ENUMLinksRechts;
import org.eclipse.set.model.model11001.BasisTypen.ENUMPruefsummeArt;
import org.eclipse.set.model.model11001.BasisTypen.ENUMRegionalbereich;
import org.eclipse.set.model.model11001.BasisTypen.ENUMWirkrichtung;
import org.eclipse.set.model.model11001.BasisTypen.ID_Bearbeitungsvermerk_TypeClass;
import org.eclipse.set.model.model11001.BasisTypen.Kennzahl_TypeClass;
import org.eclipse.set.model.model11001.BasisTypen.Oertlicher_Elementname_TypeClass;
import org.eclipse.set.model.model11001.BasisTypen.Pruefmerkmale_Daten_AttributeGroup;
import org.eclipse.set.model.model11001.BasisTypen.Pruefsumme_Art_TypeClass;
import org.eclipse.set.model.model11001.BasisTypen.Pruefsumme_TypeClass;
import org.eclipse.set.model.model11001.BasisTypen.Version_Auslieferung_TypeClass;
import org.eclipse.set.model.model11001.BasisTypen.Zeiger_TypeClass;

import org.eclipse.set.model.model11001.BasisTypen.util.BasisTypenValidator;

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
public class BasisTypenPackageImpl extends EPackageImpl implements BasisTypenPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basisAttribut_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_Aussenanlage_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_Element_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_Lageplan_Kurz_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_Lageplan_Lang_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_Tabelle_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass datum_Auslieferung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iD_Bearbeitungsvermerk_TypeClassEClass = null;

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
	private EClass oertlicher_Elementname_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pruefmerkmale_Daten_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pruefsumme_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pruefsumme_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass version_Auslieferung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zeiger_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumAnwendungssystemEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumAusrichtungEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumBremswegEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumFahrstromEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumLinksRechtsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumPruefsummeArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumRegionalbereichEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumWirkrichtungEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType anwendungssystem_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ausrichtung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_Aussenanlage_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_Lageplan_Kurz_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_Lageplan_Lang_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_Tabelle_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bremsweg_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dateiname_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType datum_Auslieferung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumAnwendungssystemObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumAusrichtungObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumBremswegObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumFahrstromObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumLinksRechtsObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumPruefsummeArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumRegionalbereichObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumWirkrichtungObjectEDataType = null;

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
	private EDataType freiText_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType geschwindigkeit_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType guiD_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType hersteller_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kennzahl_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType kilometrierung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType linksRechts_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType meter_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType objektname_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType oertlicher_Elementname_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType regionalbereich_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sekunde_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType text_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType version_Auslieferung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType wirkrichtung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType zeichenkette_TypeEDataType = null;

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
	 * @see org.eclipse.set.model.model11001.BasisTypen.BasisTypenPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasisTypenPackageImpl() {
		super(eNS_URI, BasisTypenFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BasisTypenPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasisTypenPackage init() {
		if (isInited) return (BasisTypenPackage)EPackage.Registry.INSTANCE.getEPackage(BasisTypenPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBasisTypenPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BasisTypenPackageImpl theBasisTypenPackage = registeredBasisTypenPackage instanceof BasisTypenPackageImpl ? (BasisTypenPackageImpl)registeredBasisTypenPackage : new BasisTypenPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(PlanProPackage.eNS_URI);
		PlanProPackageImpl thePlanProPackage = (PlanProPackageImpl)(registeredPackage instanceof PlanProPackageImpl ? registeredPackage : PlanProPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(BasisobjektePackage.eNS_URI);
		BasisobjektePackageImpl theBasisobjektePackage = (BasisobjektePackageImpl)(registeredPackage instanceof BasisobjektePackageImpl ? registeredPackage : BasisobjektePackage.eINSTANCE);
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
		theBasisTypenPackage.createPackageContents();
		theBasisobjektePackage.createPackageContents();
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
		theSignalbegriffe_StrukturPackage.createPackageContents();
		theZuglenkungPackage.createPackageContents();
		theZugnummernmeldeanlagePackage.createPackageContents();

		// Initialize created meta-data
		theBasisTypenPackage.initializePackageContents();
		theBasisobjektePackage.initializePackageContents();
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
			(theBasisTypenPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return BasisTypenValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theBasisTypenPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasisTypenPackage.eNS_URI, theBasisTypenPackage);
		return theBasisTypenPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBasisAttribut_AttributeGroup() {
		return basisAttribut_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBasisAttribut_AttributeGroup_IDBearbeitungsvermerk() {
		return (EReference)basisAttribut_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_Aussenanlage_TypeClass() {
		return bezeichnung_Aussenanlage_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_Aussenanlage_TypeClass_Wert() {
		return (EAttribute)bezeichnung_Aussenanlage_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_Element_AttributeGroup() {
		return bezeichnung_Element_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBezeichnung_Element_AttributeGroup_BezeichnungAussenanlage() {
		return (EReference)bezeichnung_Element_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBezeichnung_Element_AttributeGroup_BezeichnungLageplanKurz() {
		return (EReference)bezeichnung_Element_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBezeichnung_Element_AttributeGroup_BezeichnungLageplanLang() {
		return (EReference)bezeichnung_Element_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBezeichnung_Element_AttributeGroup_BezeichnungTabelle() {
		return (EReference)bezeichnung_Element_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBezeichnung_Element_AttributeGroup_Kennzahl() {
		return (EReference)bezeichnung_Element_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBezeichnung_Element_AttributeGroup_OertlicherElementname() {
		return (EReference)bezeichnung_Element_AttributeGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_Lageplan_Kurz_TypeClass() {
		return bezeichnung_Lageplan_Kurz_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_Lageplan_Kurz_TypeClass_Wert() {
		return (EAttribute)bezeichnung_Lageplan_Kurz_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_Lageplan_Lang_TypeClass() {
		return bezeichnung_Lageplan_Lang_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_Lageplan_Lang_TypeClass_Wert() {
		return (EAttribute)bezeichnung_Lageplan_Lang_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_Tabelle_TypeClass() {
		return bezeichnung_Tabelle_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_Tabelle_TypeClass_Wert() {
		return (EAttribute)bezeichnung_Tabelle_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatum_Auslieferung_TypeClass() {
		return datum_Auslieferung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatum_Auslieferung_TypeClass_Wert() {
		return (EAttribute)datum_Auslieferung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getID_Bearbeitungsvermerk_TypeClass() {
		return iD_Bearbeitungsvermerk_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getID_Bearbeitungsvermerk_TypeClass_Wert() {
		return (EAttribute)iD_Bearbeitungsvermerk_TypeClassEClass.getEStructuralFeatures().get(0);
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
	public EClass getOertlicher_Elementname_TypeClass() {
		return oertlicher_Elementname_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOertlicher_Elementname_TypeClass_Wert() {
		return (EAttribute)oertlicher_Elementname_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPruefmerkmale_Daten_AttributeGroup() {
		return pruefmerkmale_Daten_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPruefmerkmale_Daten_AttributeGroup_DatumAuslieferung() {
		return (EReference)pruefmerkmale_Daten_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPruefmerkmale_Daten_AttributeGroup_Pruefsumme() {
		return (EReference)pruefmerkmale_Daten_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPruefmerkmale_Daten_AttributeGroup_PruefsummeArt() {
		return (EReference)pruefmerkmale_Daten_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPruefmerkmale_Daten_AttributeGroup_VersionAuslieferung() {
		return (EReference)pruefmerkmale_Daten_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPruefsumme_Art_TypeClass() {
		return pruefsumme_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPruefsumme_Art_TypeClass_Wert() {
		return (EAttribute)pruefsumme_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPruefsumme_TypeClass() {
		return pruefsumme_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPruefsumme_TypeClass_Wert() {
		return (EAttribute)pruefsumme_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVersion_Auslieferung_TypeClass() {
		return version_Auslieferung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersion_Auslieferung_TypeClass_Wert() {
		return (EAttribute)version_Auslieferung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZeiger_TypeClass() {
		return zeiger_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZeiger_TypeClass_Wert() {
		return (EAttribute)zeiger_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMAnwendungssystem() {
		return enumAnwendungssystemEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMAusrichtung() {
		return enumAusrichtungEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMBremsweg() {
		return enumBremswegEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMFahrstrom() {
		return enumFahrstromEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMLinksRechts() {
		return enumLinksRechtsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMPruefsummeArt() {
		return enumPruefsummeArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMRegionalbereich() {
		return enumRegionalbereichEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMWirkrichtung() {
		return enumWirkrichtungEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAnwendungssystem_Type() {
		return anwendungssystem_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAusrichtung_Type() {
		return ausrichtung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_Aussenanlage_Type() {
		return bezeichnung_Aussenanlage_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_Lageplan_Kurz_Type() {
		return bezeichnung_Lageplan_Kurz_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_Lageplan_Lang_Type() {
		return bezeichnung_Lageplan_Lang_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_Tabelle_Type() {
		return bezeichnung_Tabelle_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBremsweg_Type() {
		return bremsweg_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDateiname_Type() {
		return dateiname_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDatum_Auslieferung_Type() {
		return datum_Auslieferung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMAnwendungssystemObject() {
		return enumAnwendungssystemObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMAusrichtungObject() {
		return enumAusrichtungObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMBremswegObject() {
		return enumBremswegObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMFahrstromObject() {
		return enumFahrstromObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMLinksRechtsObject() {
		return enumLinksRechtsObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMPruefsummeArtObject() {
		return enumPruefsummeArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMRegionalbereichObject() {
		return enumRegionalbereichObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMWirkrichtungObject() {
		return enumWirkrichtungObjectEDataType;
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
	public EDataType getFreiText_Type() {
		return freiText_TypeEDataType;
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
	public EDataType getGUID_Type() {
		return guiD_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getHersteller_Type() {
		return hersteller_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getKennzahl_Type() {
		return kennzahl_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getKilometrierung_Type() {
		return kilometrierung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLinksRechts_Type() {
		return linksRechts_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getMeter_Type() {
		return meter_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getObjektname_Type() {
		return objektname_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOertlicher_Elementname_Type() {
		return oertlicher_Elementname_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getRegionalbereich_Type() {
		return regionalbereich_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSekunde_Type() {
		return sekunde_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getText_Type() {
		return text_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVersion_Auslieferung_Type() {
		return version_Auslieferung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getWirkrichtung_Type() {
		return wirkrichtung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getZeichenkette_Type() {
		return zeichenkette_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BasisTypenFactory getBasisTypenFactory() {
		return (BasisTypenFactory)getEFactoryInstance();
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
		basisAttribut_AttributeGroupEClass = createEClass(BASIS_ATTRIBUT_ATTRIBUTE_GROUP);
		createEReference(basisAttribut_AttributeGroupEClass, BASIS_ATTRIBUT_ATTRIBUTE_GROUP__ID_BEARBEITUNGSVERMERK);

		bezeichnung_Aussenanlage_TypeClassEClass = createEClass(BEZEICHNUNG_AUSSENANLAGE_TYPE_CLASS);
		createEAttribute(bezeichnung_Aussenanlage_TypeClassEClass, BEZEICHNUNG_AUSSENANLAGE_TYPE_CLASS__WERT);

		bezeichnung_Element_AttributeGroupEClass = createEClass(BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP);
		createEReference(bezeichnung_Element_AttributeGroupEClass, BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_AUSSENANLAGE);
		createEReference(bezeichnung_Element_AttributeGroupEClass, BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN_KURZ);
		createEReference(bezeichnung_Element_AttributeGroupEClass, BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN_LANG);
		createEReference(bezeichnung_Element_AttributeGroupEClass, BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__BEZEICHNUNG_TABELLE);
		createEReference(bezeichnung_Element_AttributeGroupEClass, BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__KENNZAHL);
		createEReference(bezeichnung_Element_AttributeGroupEClass, BEZEICHNUNG_ELEMENT_ATTRIBUTE_GROUP__OERTLICHER_ELEMENTNAME);

		bezeichnung_Lageplan_Kurz_TypeClassEClass = createEClass(BEZEICHNUNG_LAGEPLAN_KURZ_TYPE_CLASS);
		createEAttribute(bezeichnung_Lageplan_Kurz_TypeClassEClass, BEZEICHNUNG_LAGEPLAN_KURZ_TYPE_CLASS__WERT);

		bezeichnung_Lageplan_Lang_TypeClassEClass = createEClass(BEZEICHNUNG_LAGEPLAN_LANG_TYPE_CLASS);
		createEAttribute(bezeichnung_Lageplan_Lang_TypeClassEClass, BEZEICHNUNG_LAGEPLAN_LANG_TYPE_CLASS__WERT);

		bezeichnung_Tabelle_TypeClassEClass = createEClass(BEZEICHNUNG_TABELLE_TYPE_CLASS);
		createEAttribute(bezeichnung_Tabelle_TypeClassEClass, BEZEICHNUNG_TABELLE_TYPE_CLASS__WERT);

		datum_Auslieferung_TypeClassEClass = createEClass(DATUM_AUSLIEFERUNG_TYPE_CLASS);
		createEAttribute(datum_Auslieferung_TypeClassEClass, DATUM_AUSLIEFERUNG_TYPE_CLASS__WERT);

		iD_Bearbeitungsvermerk_TypeClassEClass = createEClass(ID_BEARBEITUNGSVERMERK_TYPE_CLASS);
		createEAttribute(iD_Bearbeitungsvermerk_TypeClassEClass, ID_BEARBEITUNGSVERMERK_TYPE_CLASS__WERT);

		kennzahl_TypeClassEClass = createEClass(KENNZAHL_TYPE_CLASS);
		createEAttribute(kennzahl_TypeClassEClass, KENNZAHL_TYPE_CLASS__WERT);

		oertlicher_Elementname_TypeClassEClass = createEClass(OERTLICHER_ELEMENTNAME_TYPE_CLASS);
		createEAttribute(oertlicher_Elementname_TypeClassEClass, OERTLICHER_ELEMENTNAME_TYPE_CLASS__WERT);

		pruefmerkmale_Daten_AttributeGroupEClass = createEClass(PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP);
		createEReference(pruefmerkmale_Daten_AttributeGroupEClass, PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__DATUM_AUSLIEFERUNG);
		createEReference(pruefmerkmale_Daten_AttributeGroupEClass, PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__PRUEFSUMME);
		createEReference(pruefmerkmale_Daten_AttributeGroupEClass, PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__PRUEFSUMME_ART);
		createEReference(pruefmerkmale_Daten_AttributeGroupEClass, PRUEFMERKMALE_DATEN_ATTRIBUTE_GROUP__VERSION_AUSLIEFERUNG);

		pruefsumme_Art_TypeClassEClass = createEClass(PRUEFSUMME_ART_TYPE_CLASS);
		createEAttribute(pruefsumme_Art_TypeClassEClass, PRUEFSUMME_ART_TYPE_CLASS__WERT);

		pruefsumme_TypeClassEClass = createEClass(PRUEFSUMME_TYPE_CLASS);
		createEAttribute(pruefsumme_TypeClassEClass, PRUEFSUMME_TYPE_CLASS__WERT);

		version_Auslieferung_TypeClassEClass = createEClass(VERSION_AUSLIEFERUNG_TYPE_CLASS);
		createEAttribute(version_Auslieferung_TypeClassEClass, VERSION_AUSLIEFERUNG_TYPE_CLASS__WERT);

		zeiger_TypeClassEClass = createEClass(ZEIGER_TYPE_CLASS);
		createEAttribute(zeiger_TypeClassEClass, ZEIGER_TYPE_CLASS__WERT);

		// Create enums
		enumAnwendungssystemEEnum = createEEnum(ENUM_ANWENDUNGSSYSTEM);
		enumAusrichtungEEnum = createEEnum(ENUM_AUSRICHTUNG);
		enumBremswegEEnum = createEEnum(ENUM_BREMSWEG);
		enumFahrstromEEnum = createEEnum(ENUM_FAHRSTROM);
		enumLinksRechtsEEnum = createEEnum(ENUM_LINKS_RECHTS);
		enumPruefsummeArtEEnum = createEEnum(ENUM_PRUEFSUMME_ART);
		enumRegionalbereichEEnum = createEEnum(ENUM_REGIONALBEREICH);
		enumWirkrichtungEEnum = createEEnum(ENUM_WIRKRICHTUNG);

		// Create data types
		anwendungssystem_TypeEDataType = createEDataType(ANWENDUNGSSYSTEM_TYPE);
		ausrichtung_TypeEDataType = createEDataType(AUSRICHTUNG_TYPE);
		bezeichnung_Aussenanlage_TypeEDataType = createEDataType(BEZEICHNUNG_AUSSENANLAGE_TYPE);
		bezeichnung_Lageplan_Kurz_TypeEDataType = createEDataType(BEZEICHNUNG_LAGEPLAN_KURZ_TYPE);
		bezeichnung_Lageplan_Lang_TypeEDataType = createEDataType(BEZEICHNUNG_LAGEPLAN_LANG_TYPE);
		bezeichnung_Tabelle_TypeEDataType = createEDataType(BEZEICHNUNG_TABELLE_TYPE);
		bremsweg_TypeEDataType = createEDataType(BREMSWEG_TYPE);
		dateiname_TypeEDataType = createEDataType(DATEINAME_TYPE);
		datum_Auslieferung_TypeEDataType = createEDataType(DATUM_AUSLIEFERUNG_TYPE);
		enumAnwendungssystemObjectEDataType = createEDataType(ENUM_ANWENDUNGSSYSTEM_OBJECT);
		enumAusrichtungObjectEDataType = createEDataType(ENUM_AUSRICHTUNG_OBJECT);
		enumBremswegObjectEDataType = createEDataType(ENUM_BREMSWEG_OBJECT);
		enumFahrstromObjectEDataType = createEDataType(ENUM_FAHRSTROM_OBJECT);
		enumLinksRechtsObjectEDataType = createEDataType(ENUM_LINKS_RECHTS_OBJECT);
		enumPruefsummeArtObjectEDataType = createEDataType(ENUM_PRUEFSUMME_ART_OBJECT);
		enumRegionalbereichObjectEDataType = createEDataType(ENUM_REGIONALBEREICH_OBJECT);
		enumWirkrichtungObjectEDataType = createEDataType(ENUM_WIRKRICHTUNG_OBJECT);
		fahrstrom_TypeEDataType = createEDataType(FAHRSTROM_TYPE);
		freiText_TypeEDataType = createEDataType(FREI_TEXT_TYPE);
		geschwindigkeit_TypeEDataType = createEDataType(GESCHWINDIGKEIT_TYPE);
		guiD_TypeEDataType = createEDataType(GUID_TYPE);
		hersteller_TypeEDataType = createEDataType(HERSTELLER_TYPE);
		kennzahl_TypeEDataType = createEDataType(KENNZAHL_TYPE);
		kilometrierung_TypeEDataType = createEDataType(KILOMETRIERUNG_TYPE);
		linksRechts_TypeEDataType = createEDataType(LINKS_RECHTS_TYPE);
		meter_TypeEDataType = createEDataType(METER_TYPE);
		objektname_TypeEDataType = createEDataType(OBJEKTNAME_TYPE);
		oertlicher_Elementname_TypeEDataType = createEDataType(OERTLICHER_ELEMENTNAME_TYPE);
		regionalbereich_TypeEDataType = createEDataType(REGIONALBEREICH_TYPE);
		sekunde_TypeEDataType = createEDataType(SEKUNDE_TYPE);
		text_TypeEDataType = createEDataType(TEXT_TYPE);
		version_Auslieferung_TypeEDataType = createEDataType(VERSION_AUSLIEFERUNG_TYPE);
		wirkrichtung_TypeEDataType = createEDataType(WIRKRICHTUNG_TYPE);
		zeichenkette_TypeEDataType = createEDataType(ZEICHENKETTE_TYPE);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bezeichnung_Aussenanlage_TypeClassEClass.getESuperTypes().add(this.getBasisAttribut_AttributeGroup());
		bezeichnung_Lageplan_Kurz_TypeClassEClass.getESuperTypes().add(this.getBasisAttribut_AttributeGroup());
		bezeichnung_Lageplan_Lang_TypeClassEClass.getESuperTypes().add(this.getBasisAttribut_AttributeGroup());
		bezeichnung_Tabelle_TypeClassEClass.getESuperTypes().add(this.getBasisAttribut_AttributeGroup());
		datum_Auslieferung_TypeClassEClass.getESuperTypes().add(this.getBasisAttribut_AttributeGroup());
		kennzahl_TypeClassEClass.getESuperTypes().add(this.getBasisAttribut_AttributeGroup());
		oertlicher_Elementname_TypeClassEClass.getESuperTypes().add(this.getBasisAttribut_AttributeGroup());
		pruefsumme_Art_TypeClassEClass.getESuperTypes().add(this.getBasisAttribut_AttributeGroup());
		pruefsumme_TypeClassEClass.getESuperTypes().add(this.getBasisAttribut_AttributeGroup());
		version_Auslieferung_TypeClassEClass.getESuperTypes().add(this.getBasisAttribut_AttributeGroup());
		zeiger_TypeClassEClass.getESuperTypes().add(this.getBasisAttribut_AttributeGroup());

		// Initialize classes and features; add operations and parameters
		initEClass(basisAttribut_AttributeGroupEClass, BasisAttribut_AttributeGroup.class, "BasisAttribut_AttributeGroup", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasisAttribut_AttributeGroup_IDBearbeitungsvermerk(), this.getID_Bearbeitungsvermerk_TypeClass(), null, "iDBearbeitungsvermerk", null, 0, -1, BasisAttribut_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bezeichnung_Aussenanlage_TypeClassEClass, Bezeichnung_Aussenanlage_TypeClass.class, "Bezeichnung_Aussenanlage_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBezeichnung_Aussenanlage_TypeClass_Wert(), this.getBezeichnung_Aussenanlage_Type(), "wert", null, 1, 1, Bezeichnung_Aussenanlage_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bezeichnung_Element_AttributeGroupEClass, Bezeichnung_Element_AttributeGroup.class, "Bezeichnung_Element_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBezeichnung_Element_AttributeGroup_BezeichnungAussenanlage(), this.getBezeichnung_Aussenanlage_TypeClass(), null, "bezeichnungAussenanlage", null, 0, 1, Bezeichnung_Element_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBezeichnung_Element_AttributeGroup_BezeichnungLageplanKurz(), this.getBezeichnung_Lageplan_Kurz_TypeClass(), null, "bezeichnungLageplanKurz", null, 0, 1, Bezeichnung_Element_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBezeichnung_Element_AttributeGroup_BezeichnungLageplanLang(), this.getBezeichnung_Lageplan_Lang_TypeClass(), null, "bezeichnungLageplanLang", null, 0, 1, Bezeichnung_Element_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBezeichnung_Element_AttributeGroup_BezeichnungTabelle(), this.getBezeichnung_Tabelle_TypeClass(), null, "bezeichnungTabelle", null, 1, 1, Bezeichnung_Element_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBezeichnung_Element_AttributeGroup_Kennzahl(), this.getKennzahl_TypeClass(), null, "kennzahl", null, 0, 1, Bezeichnung_Element_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBezeichnung_Element_AttributeGroup_OertlicherElementname(), this.getOertlicher_Elementname_TypeClass(), null, "oertlicherElementname", null, 0, 1, Bezeichnung_Element_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bezeichnung_Lageplan_Kurz_TypeClassEClass, Bezeichnung_Lageplan_Kurz_TypeClass.class, "Bezeichnung_Lageplan_Kurz_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBezeichnung_Lageplan_Kurz_TypeClass_Wert(), this.getBezeichnung_Lageplan_Kurz_Type(), "wert", null, 1, 1, Bezeichnung_Lageplan_Kurz_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bezeichnung_Lageplan_Lang_TypeClassEClass, Bezeichnung_Lageplan_Lang_TypeClass.class, "Bezeichnung_Lageplan_Lang_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBezeichnung_Lageplan_Lang_TypeClass_Wert(), this.getBezeichnung_Lageplan_Lang_Type(), "wert", null, 1, 1, Bezeichnung_Lageplan_Lang_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bezeichnung_Tabelle_TypeClassEClass, Bezeichnung_Tabelle_TypeClass.class, "Bezeichnung_Tabelle_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBezeichnung_Tabelle_TypeClass_Wert(), this.getBezeichnung_Tabelle_Type(), "wert", null, 1, 1, Bezeichnung_Tabelle_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(datum_Auslieferung_TypeClassEClass, Datum_Auslieferung_TypeClass.class, "Datum_Auslieferung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatum_Auslieferung_TypeClass_Wert(), this.getDatum_Auslieferung_Type(), "wert", null, 1, 1, Datum_Auslieferung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iD_Bearbeitungsvermerk_TypeClassEClass, ID_Bearbeitungsvermerk_TypeClass.class, "ID_Bearbeitungsvermerk_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getID_Bearbeitungsvermerk_TypeClass_Wert(), this.getGUID_Type(), "wert", null, 1, 1, ID_Bearbeitungsvermerk_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kennzahl_TypeClassEClass, Kennzahl_TypeClass.class, "Kennzahl_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKennzahl_TypeClass_Wert(), this.getKennzahl_Type(), "wert", null, 1, 1, Kennzahl_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oertlicher_Elementname_TypeClassEClass, Oertlicher_Elementname_TypeClass.class, "Oertlicher_Elementname_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOertlicher_Elementname_TypeClass_Wert(), this.getOertlicher_Elementname_Type(), "wert", null, 1, 1, Oertlicher_Elementname_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pruefmerkmale_Daten_AttributeGroupEClass, Pruefmerkmale_Daten_AttributeGroup.class, "Pruefmerkmale_Daten_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPruefmerkmale_Daten_AttributeGroup_DatumAuslieferung(), this.getDatum_Auslieferung_TypeClass(), null, "datumAuslieferung", null, 1, 1, Pruefmerkmale_Daten_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPruefmerkmale_Daten_AttributeGroup_Pruefsumme(), this.getPruefsumme_TypeClass(), null, "pruefsumme", null, 1, 1, Pruefmerkmale_Daten_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPruefmerkmale_Daten_AttributeGroup_PruefsummeArt(), this.getPruefsumme_Art_TypeClass(), null, "pruefsummeArt", null, 1, 1, Pruefmerkmale_Daten_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPruefmerkmale_Daten_AttributeGroup_VersionAuslieferung(), this.getVersion_Auslieferung_TypeClass(), null, "versionAuslieferung", null, 1, 1, Pruefmerkmale_Daten_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pruefsumme_Art_TypeClassEClass, Pruefsumme_Art_TypeClass.class, "Pruefsumme_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPruefsumme_Art_TypeClass_Wert(), this.getENUMPruefsummeArtObject(), "wert", null, 1, 1, Pruefsumme_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pruefsumme_TypeClassEClass, Pruefsumme_TypeClass.class, "Pruefsumme_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPruefsumme_TypeClass_Wert(), this.getText_Type(), "wert", null, 1, 1, Pruefsumme_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(version_Auslieferung_TypeClassEClass, Version_Auslieferung_TypeClass.class, "Version_Auslieferung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersion_Auslieferung_TypeClass_Wert(), this.getVersion_Auslieferung_Type(), "wert", null, 1, 1, Version_Auslieferung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zeiger_TypeClassEClass, Zeiger_TypeClass.class, "Zeiger_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZeiger_TypeClass_Wert(), this.getGUID_Type(), "wert", null, 1, 1, Zeiger_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumAnwendungssystemEEnum, ENUMAnwendungssystem.class, "ENUMAnwendungssystem");
		addEEnumLiteral(enumAnwendungssystemEEnum, ENUMAnwendungssystem.ENUM_ANWENDUNGSSYSTEM_ESG);
		addEEnumLiteral(enumAnwendungssystemEEnum, ENUMAnwendungssystem.ENUM_ANWENDUNGSSYSTEM_GNT);
		addEEnumLiteral(enumAnwendungssystemEEnum, ENUMAnwendungssystem.ENUM_ANWENDUNGSSYSTEM_L2);
		addEEnumLiteral(enumAnwendungssystemEEnum, ENUMAnwendungssystem.ENUM_ANWENDUNGSSYSTEM_L2O_S);
		addEEnumLiteral(enumAnwendungssystemEEnum, ENUMAnwendungssystem.ENUM_ANWENDUNGSSYSTEM_LZB);
		addEEnumLiteral(enumAnwendungssystemEEnum, ENUMAnwendungssystem.ENUM_ANWENDUNGSSYSTEM_OHNE);
		addEEnumLiteral(enumAnwendungssystemEEnum, ENUMAnwendungssystem.ENUM_ANWENDUNGSSYSTEM_PZB);
		addEEnumLiteral(enumAnwendungssystemEEnum, ENUMAnwendungssystem.ENUM_ANWENDUNGSSYSTEM_SONSTIGE);
		addEEnumLiteral(enumAnwendungssystemEEnum, ENUMAnwendungssystem.ENUM_ANWENDUNGSSYSTEM_ZBS);

		initEEnum(enumAusrichtungEEnum, ENUMAusrichtung.class, "ENUMAusrichtung");
		addEEnumLiteral(enumAusrichtungEEnum, ENUMAusrichtung.ENUM_AUSRICHTUNG_GEGEN);
		addEEnumLiteral(enumAusrichtungEEnum, ENUMAusrichtung.ENUM_AUSRICHTUNG_IN);
		addEEnumLiteral(enumAusrichtungEEnum, ENUMAusrichtung.ENUM_AUSRICHTUNG_KEINE);

		initEEnum(enumBremswegEEnum, ENUMBremsweg.class, "ENUMBremsweg");
		addEEnumLiteral(enumBremswegEEnum, ENUMBremsweg.ENUM_BREMSWEG_1000);
		addEEnumLiteral(enumBremswegEEnum, ENUMBremsweg.ENUM_BREMSWEG_400);
		addEEnumLiteral(enumBremswegEEnum, ENUMBremsweg.ENUM_BREMSWEG_700);
		addEEnumLiteral(enumBremswegEEnum, ENUMBremsweg.ENUM_BREMSWEG_SONSTIGE);

		initEEnum(enumFahrstromEEnum, ENUMFahrstrom.class, "ENUMFahrstrom");
		addEEnumLiteral(enumFahrstromEEnum, ENUMFahrstrom.ENUM_FAHRSTROM_1200V_DC_STROMSCHIENE);
		addEEnumLiteral(enumFahrstromEEnum, ENUMFahrstrom.ENUM_FAHRSTROM_1500V_DC);
		addEEnumLiteral(enumFahrstromEEnum, ENUMFahrstrom.ENUM_FAHRSTROM_15K_V16_7HZ);
		addEEnumLiteral(enumFahrstromEEnum, ENUMFahrstrom.ENUM_FAHRSTROM_2400V_DC);
		addEEnumLiteral(enumFahrstromEEnum, ENUMFahrstrom.ENUM_FAHRSTROM_25K_V50_HZ);
		addEEnumLiteral(enumFahrstromEEnum, ENUMFahrstrom.ENUM_FAHRSTROM_3000V_DC);
		addEEnumLiteral(enumFahrstromEEnum, ENUMFahrstrom.ENUM_FAHRSTROM_750V_DC_STROMSCHIENE);
		addEEnumLiteral(enumFahrstromEEnum, ENUMFahrstrom.ENUM_FAHRSTROM_SONSTIGE);

		initEEnum(enumLinksRechtsEEnum, ENUMLinksRechts.class, "ENUMLinksRechts");
		addEEnumLiteral(enumLinksRechtsEEnum, ENUMLinksRechts.ENUM_LINKS_RECHTS_LINKS);
		addEEnumLiteral(enumLinksRechtsEEnum, ENUMLinksRechts.ENUM_LINKS_RECHTS_RECHTS);

		initEEnum(enumPruefsummeArtEEnum, ENUMPruefsummeArt.class, "ENUMPruefsummeArt");
		addEEnumLiteral(enumPruefsummeArtEEnum, ENUMPruefsummeArt.ENUM_PRUEFSUMME_ART_MD4);
		addEEnumLiteral(enumPruefsummeArtEEnum, ENUMPruefsummeArt.ENUM_PRUEFSUMME_ART_MD5);
		addEEnumLiteral(enumPruefsummeArtEEnum, ENUMPruefsummeArt.ENUM_PRUEFSUMME_ART_SHA1);
		addEEnumLiteral(enumPruefsummeArtEEnum, ENUMPruefsummeArt.ENUM_PRUEFSUMME_ART_SHA256);

		initEEnum(enumRegionalbereichEEnum, ENUMRegionalbereich.class, "ENUMRegionalbereich");
		addEEnumLiteral(enumRegionalbereichEEnum, ENUMRegionalbereich.ENUM_REGIONALBEREICH_MITTE);
		addEEnumLiteral(enumRegionalbereichEEnum, ENUMRegionalbereich.ENUM_REGIONALBEREICH_NORD);
		addEEnumLiteral(enumRegionalbereichEEnum, ENUMRegionalbereich.ENUM_REGIONALBEREICH_OST);
		addEEnumLiteral(enumRegionalbereichEEnum, ENUMRegionalbereich.ENUM_REGIONALBEREICH_SÜD);
		addEEnumLiteral(enumRegionalbereichEEnum, ENUMRegionalbereich.ENUM_REGIONALBEREICH_SÜDOST);
		addEEnumLiteral(enumRegionalbereichEEnum, ENUMRegionalbereich.ENUM_REGIONALBEREICH_SÜDWEST);
		addEEnumLiteral(enumRegionalbereichEEnum, ENUMRegionalbereich.ENUM_REGIONALBEREICH_WEST);

		initEEnum(enumWirkrichtungEEnum, ENUMWirkrichtung.class, "ENUMWirkrichtung");
		addEEnumLiteral(enumWirkrichtungEEnum, ENUMWirkrichtung.ENUM_WIRKRICHTUNG_BEIDE);
		addEEnumLiteral(enumWirkrichtungEEnum, ENUMWirkrichtung.ENUM_WIRKRICHTUNG_GEGEN);
		addEEnumLiteral(enumWirkrichtungEEnum, ENUMWirkrichtung.ENUM_WIRKRICHTUNG_IN);

		// Initialize data types
		initEDataType(anwendungssystem_TypeEDataType, ENUMAnwendungssystem.class, "Anwendungssystem_Type", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(ausrichtung_TypeEDataType, ENUMAusrichtung.class, "Ausrichtung_Type", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bezeichnung_Aussenanlage_TypeEDataType, String.class, "Bezeichnung_Aussenanlage_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bezeichnung_Lageplan_Kurz_TypeEDataType, String.class, "Bezeichnung_Lageplan_Kurz_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bezeichnung_Lageplan_Lang_TypeEDataType, String.class, "Bezeichnung_Lageplan_Lang_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bezeichnung_Tabelle_TypeEDataType, String.class, "Bezeichnung_Tabelle_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bremsweg_TypeEDataType, ENUMBremsweg.class, "Bremsweg_Type", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dateiname_TypeEDataType, String.class, "Dateiname_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(datum_Auslieferung_TypeEDataType, XMLGregorianCalendar.class, "Datum_Auslieferung_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumAnwendungssystemObjectEDataType, ENUMAnwendungssystem.class, "ENUMAnwendungssystemObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumAusrichtungObjectEDataType, ENUMAusrichtung.class, "ENUMAusrichtungObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumBremswegObjectEDataType, ENUMBremsweg.class, "ENUMBremswegObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumFahrstromObjectEDataType, ENUMFahrstrom.class, "ENUMFahrstromObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumLinksRechtsObjectEDataType, ENUMLinksRechts.class, "ENUMLinksRechtsObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumPruefsummeArtObjectEDataType, ENUMPruefsummeArt.class, "ENUMPruefsummeArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumRegionalbereichObjectEDataType, ENUMRegionalbereich.class, "ENUMRegionalbereichObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumWirkrichtungObjectEDataType, ENUMWirkrichtung.class, "ENUMWirkrichtungObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(fahrstrom_TypeEDataType, ENUMFahrstrom.class, "Fahrstrom_Type", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(freiText_TypeEDataType, String.class, "FreiText_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(geschwindigkeit_TypeEDataType, BigInteger.class, "Geschwindigkeit_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(guiD_TypeEDataType, String.class, "GUID_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(hersteller_TypeEDataType, String.class, "Hersteller_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(kennzahl_TypeEDataType, String.class, "Kennzahl_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(kilometrierung_TypeEDataType, String.class, "Kilometrierung_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(linksRechts_TypeEDataType, ENUMLinksRechts.class, "LinksRechts_Type", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(meter_TypeEDataType, BigDecimal.class, "Meter_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(objektname_TypeEDataType, String.class, "Objektname_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(oertlicher_Elementname_TypeEDataType, String.class, "Oertlicher_Elementname_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(regionalbereich_TypeEDataType, ENUMRegionalbereich.class, "Regionalbereich_Type", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sekunde_TypeEDataType, BigDecimal.class, "Sekunde_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(text_TypeEDataType, String.class, "Text_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(version_Auslieferung_TypeEDataType, String.class, "Version_Auslieferung_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(wirkrichtung_TypeEDataType, ENUMWirkrichtung.class, "Wirkrichtung_Type", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(zeichenkette_TypeEDataType, String.class, "Zeichenkette_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
			   "documentation", "Dieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.0.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbnetze.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.0.\n\nMore information about the license can be found on\nhttp://www.dbnetze.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface."
		   });
		addAnnotation
		  (anwendungssystem_TypeEDataType,
		   source,
		   new String[] {
			   "documentation", "System der Zugbeeinflussung bzw. -sicherung, mit dem ein bestimmter Streckenbereich ausger\u00fcstet ist. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk mit entsprechenden Erl\u00e4uterungen anzuf\u00fcgen.\n"
		   });
		addAnnotation
		  (ausrichtung_TypeEDataType,
		   source,
		   new String[] {
			   "documentation", "Ein Attribut diesen Typs wird verwendet, um die Ausrichtung eines Objekts in Bezug zur Topologierichtung anzuzeigen. Ein Attribut mit diesem Basistyp nimmt einen der ENUM-Werte \\\"gegen\\\", \\\"in\\\" und \\\"keine\\\" an.\n"
		   });
		addAnnotation
		  (basisAttribut_AttributeGroupEClass,
		   source,
		   new String[] {
			   "documentation", "Das BasisAttribut stellt die Schablone f\u00fcr alle Attribute aller Objekte dar. \n\nDie Attributeigenschaften des BasisAttributs sind in 2 Gruppen unterteilbar. Zum einen die vom Modell gef\u00fcllten Attribute, die als eine xs:appinfo umgesetzt sind:\n\u2022 Beispielbefuellung, \n\u2022 Patternbeschreibung, \n\u2022 Planungsphase. \n\nIn ihnen werden Informationen zum Attribut fest gespeichert. Sie sind f\u00fcr alle Programme, die das Schema auslesen, verf\u00fcgbar und werden zur Durchf\u00fchrung von Pr\u00fcfungen verwendet oder um dem jeweiligen Bearbeitungsprogramm zus\u00e4tzliche Informationen \u00fcber das Attribut zur Verf\u00fcgung zu stellen.\n\nDie zweite Gruppe der Attributeigenschaften sind als XSDElement modellierten Informationen, die von den Nutzern der Schnittstelle erstellt werden. Es handelt sich neben dem eigentlichen Wert, welcher verpflichtend zu f\u00fcllen ist, um einen oder mehrere optionale Verweise auf Bearbeitungsvermerke. In diesen k\u00f6nnen weitere Informationen zu der speziellen Auspr\u00e4gung des Attributs hinterlegt werden.\n\u2022 ID_Bearbeitungsvermerk, \n\u2022 Wert."
		   });
		addAnnotation
		  (getBasisAttribut_AttributeGroup_IDBearbeitungsvermerk(),
		   source,
		   new String[] {
			   "documentation", "Verweist auf einen oder mehrere Bearbeitungsvermerke. Ein Anhang wird \u00fcber einen Bearbeitungsvermerk zugeordnet. \n"
		   });
		addAnnotation
		  (bezeichnung_Element_AttributeGroupEClass,
		   source,
		   new String[] {
			   "documentation", "Basisattributgruppe zur einheitlichen Modellierung der Bezeichnung von Stell- und weiteren Elementen. Die Bildung der resultierenden Bezeichnung eines Elements in den verschiedenen Auspr\u00e4gungen ist in Bildung der Bezeichnungen beschrieben. DB-Regelwerk Ril 819.9001 (Symbolbezeichnungen sicherungstechnischer Pl\u00e4ne)"
		   });
		addAnnotation
		  (getBezeichnung_Element_AttributeGroup_BezeichnungAussenanlage(),
		   source,
		   new String[] {
			   "documentation", "Beschriftung des Elements oder der Komponente der LST-Anlage. \n\nDie Bezeichnung besteht i. d. R. aus dem Elementnamen (siehe Bildung der Bezeichnungen). Komponenten, die nicht bedienbar sind (z.B. Achsz\u00e4hlpunkte) k\u00f6nnen durch Zusammenf\u00fcgen von Elementnamen oder modifizierten Elementnamen bezeichnet werden. \n\nBei Elementen der LST-Anlage, die in der Au\u00dfenanlage kein Bezeichnungsschild und im sicherungstechnischen Plan- und Tabellenwerk keinen spezifischen Bezeichner haben, kann dieses Attribut entfallen.\n\nBeispiele: \n\u2022 ein Hauptsignal hat in der Au\u00dfenanlage ein Bezeichnungsschild und auf dem sicherungstechnischen Lageplan einen spezifischen Bezeichner, das Attribut wird bef\u00fcllt; \n\u2022 ein Vorsignal hat in der Au\u00dfenanlage kein Bezeichnungsschild, aber auf dem sicherungstechnischen Lageplan einen spezifischen Bezeichner, das Attribut wird bef\u00fcllt; \n\u2022 ein Bedienpunkt (fiktives Signal) existiert gar nicht in der Au\u00dfenanlage, hat aber mindestens im Tabellenwerk einen spezifischen Bezeichner, das Attribut wird bef\u00fcllt; \n\u2022 ein Lf 7 hat in der Au\u00dfenanlage kein Bezeichnungsschild und auf dem sicherungstechnischen Lageplan keinen spezifischen Bezeichner, das Attribut entf\u00e4llt (Hinweis: Auch wenn im Lageplan der Bezeichner \\\"LF7\\\" eingetragen wird, so ist das dennoch kein spezifischer Bezeichner, sondern ein allgemeiner Bezeichner f\u00fcr alle Signale Lf 7). \n\nDB-Regelwerk\n\u2022 819.9001\n"
		   });
		addAnnotation
		  (getBezeichnung_Element_AttributeGroup_BezeichnungLageplanKurz(),
		   source,
		   new String[] {
			   "documentation", "Kurze Bezeichnung eines bedienbaren Elements im Lageplan. Die Bezeichnung besteht i. d. R. ausschlie\u00dflich aus dem Oertlichen Elementnamen (siehe Bildung der Bezeichnungen).\n\n"
		   });
		addAnnotation
		  (getBezeichnung_Element_AttributeGroup_BezeichnungLageplanLang(),
		   source,
		   new String[] {
			   "documentation", "Lange Bezeichnung eines bedienbaren Elements im Lageplan. Die Bezeichnung besteht i. d. R. aus dem Elementnamen (siehe Bildung der Bezeichnungen).\n"
		   });
		addAnnotation
		  (getBezeichnung_Element_AttributeGroup_BezeichnungTabelle(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnung eines bedienbaren Elements in den Tabellen der AP PT 1. Die Bezeichnung besteht i. d. R. aus dem Elementnamen (siehe Bildung der Bezeichnungen)."
		   });
		addAnnotation
		  (getBezeichnung_Element_AttributeGroup_Kennzahl(),
		   source,
		   new String[] {
			   "documentation", "Eindeutige Kennzahl der operativen Sicherungstechnik innerhalb eines Bedienbezirks f\u00fcr eine Betriebsstelle.\n\nDie ESTW-Kennzahl kennzeichnet eine Betriebsstelle oder einen Betriebsstellenteil. Es handelt sich nicht um die Bahnhofsnummer der Zugnummernmeldeanlage (Ril 819.0731)!\n\nEine Betriebsstelle kann mehrere Kennzahlen erhalten. Z.B. dann, wenn in einem Geb\u00e4ude zwei ESTW-Zentraleinheiten untergebracht sind (Beispiel Hannover Hbf mit den ESTW-Zentraleinheiten \\\"HH Kennzahl 06\\\" und \\\"HHZX Kennzahl 30\\\").\n\nEine Kennzahl kann aber auch mehrere Betriebsstellen beinhalten. Z. B dann, wenn eine ESTW-Zentraleinheit zwei \u00dcberleitstellen steuert (Beispiel ESTW-Zentraleinheit Giften HGIF Kennzahl 71 mit \\\"\u00dcst Giften HGIF\\\" und \\\"\u00dcst Ritterkamp HRIT\\\".\n\nIn Stellbereichen von Bedienbezirken werden f\u00fcr Betriebsstellen (z. B. Bahnh\u00f6fe, Abzweigstellen, Anschlussstellen) Kennzahlen von 01 bis 99 vergeben. Diese Kennzahl muss im Bedienbezirk eindeutig sein.\n\nEindeutigkeit der Kennzahlen bei angrenzenden Bedienbezirken entlang einer Strecke:\n\nInnerhalb eines Bedienbezirks und f\u00fcr benachbarte Betriebsstellen eines angrenzenden Bedienbezirks entlang einer Strecke darf eine Kennzahl nur einmal verwendet werden. Beispiel: Media:Bedien Oertlichkeit Kennzahl 131121.pdf\n\nF\u00fcr alle im jeweiligen Bereich befindlichen Stellelemente der Betriebsstellen und Strecken wird die Kennzahl Bestandteil der ausf\u00fchrlichen Elementbezeichnung. Hierdurch er\u00fcbrigt sich in einem gr\u00f6\u00dferen Bereich der Infrastruktur die Mitf\u00fchrung eines Ortsbezeichners.\n\nZentrale Vergabe von Kennzahlen auch ohne Anbindung an Bedien_Zentralen:\n\nUnabnh\u00e4ngig ob eine ESTW-Zentraleinheit aus einer Bedien_Zentrale gesteuert wird oder nur \u00f6rtlich eingerichtet ist, soll die Kennzahlenvergabe zentral im Sinne einer m\u00f6glichen Konzentration von ESTW-Zentraleinheiten in Bedienbezirken geplant und vergeben werden. \n\nDB-Regelwerk\n\u2022 Kennzahltabelle oder Kennzaheln\u00fcbersichtsplan im PT 1, \n\u2022 819.0603 2, \n\u2022 819.9001 1 (5).\n\n"
		   });
		addAnnotation
		  (getBezeichnung_Element_AttributeGroup_OertlicherElementname(),
		   source,
		   new String[] {
			   "documentation", "Kurzbezeichnung eines Elements. Der \u00f6rtliche Elementname ist Bestandteil des Elementnamens und wird elementspezifisch gebildet. Bei Lichtsperrsignalen und anderen Elementen mit Richtungsbuchstaben (X, Y) kann dieser nicht immer eindeutig und automatisch aus einem Richtungsattribut abgeleitet werden. Er ist in jedem Fall vom Planer zu bestimmen und als Bestandteil des \u00f6rtlichen Elementnamens abzuspeichern. Der \u00f6rtliche Elementname wird \u00fcblicherweise im Lageplan verwendet. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk 819.0603 (Stellwerkseinrichtungen - Bedienoberfl\u00e4chen), 819.9001 (Symbolbezeichnungen sicherungstechnischer Pl\u00e4ne).\n\n"
		   });
		addAnnotation
		  (bremsweg_TypeEDataType,
		   source,
		   new String[] {
			   "documentation", "Bremsweg als Grundlage f\u00fcr die Dimensionierung der zugeh\u00f6rigen Strecke. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk mit entsprechenden Erl\u00e4uterungen anzuf\u00fcgen."
		   });
		addAnnotation
		  (dateiname_TypeEDataType,
		   source,
		   new String[] {
			   "documentation", "Name einer Datei ohne Dateiformat bzw. -typ."
		   });
		addAnnotation
		  (datum_Auslieferung_TypeEDataType,
		   source,
		   new String[] {
			   "documentation", "Datum, an dem die Binaerdatei vom Hersteller ausgeliefert wurde."
		   });
		addAnnotation
		  (enumLinksRechtsEEnum,
		   source,
		   new String[] {
			   "documentation", "Attribute dieses Basistyps k\u00f6nnen den ENUM-Wert \'links\' oder \'rechts\' annehmen."
		   });
		addAnnotation
		  (enumPruefsummeArtEEnum,
		   source,
		   new String[] {
			   "documentation", "Art der verwendeten Pr\u00fcfsumme (z. B. MD4)."
		   });
		addAnnotation
		  (fahrstrom_TypeEDataType,
		   source,
		   new String[] {
			   "documentation", "Art der Fahrstromversorgung (Stromart, Spannung, besondere Zuf\u00fchrung)\n"
		   });
		addAnnotation
		  (freiText_TypeEDataType,
		   source,
		   new String[] {
			   "documentation", "Beschr\u00e4nkt die Bef\u00fcllung auf Flie\u00dftext inkl. Zahlen, Leerzeichen und Sonderzeichen aus den Zeichenvorat von UTF-8. Die L\u00e4nge des Flie\u00dftextes ist unbeschr\u00e4nkt."
		   });
		addAnnotation
		  (geschwindigkeit_TypeEDataType,
		   source,
		   new String[] {
			   "documentation", "Von xs:integer abgeleitet mit der Bedeutung einer Geschwindigkeit in Kilometer pro Stunde (km/h) mit dem Wertebereich von 0 bis 500. Geschwindigkeitsangaben werden derzeit beispielsweise verwendet bei: Block Strecke, Gleis Abschnitt, W Kr Gsp Komponente."
		   });
		addAnnotation
		  (guiD_TypeEDataType,
		   source,
		   new String[] {
			   "documentation", "Beschr\u00e4nkt die Bef\u00fcllung auf eine 32-stellige GUID in der Form 8-4-4-4-12 Zeichen unter Verwendung der Zahlen 0-9 und der Gro\u00df- und Kleinbuchstaben A-F/a-f."
		   });
		addAnnotation
		  (hersteller_TypeEDataType,
		   source,
		   new String[] {
			   "documentation", "Unternehmen, das die Funktionsf\u00e4higkeit der Anlage verantwortlich hergestellt hat oder Hersteller des jeweiligen Elements. Diese Eigenschaft ist kein Datum einer Planung, sondern dient im R\u00fccklauf der Planung dazu den Hersteller im Bestand zu erfassen. Es ist die zum Zeitpunkt der Inbetriebnahme g\u00fcltige Firmierung zu verwenden. \n"
		   });
		addAnnotation
		  (kennzahl_TypeEDataType,
		   source,
		   new String[] {
			   "documentation", "Eindeutige Kennzahl der operativen Sicherungstechnik innerhalb eines Bedienbezirks f\u00fcr eine Betriebsstelle.\n\nDie ESTW-Kennzahl kennzeichnet eine Betriebsstelle oder einen Betriebsstellenteil. Es handelt sich nicht um die Bahnhofsnummer der Zugnummernmeldeanlage (Ril 819.0731)!\n\nEine Betriebsstelle kann mehrere Kennzahlen erhalten. Z.B. dann, wenn in einem Geb\u00e4ude zwei ESTW-Zentraleinheiten untergebracht sind (Beispiel Hannover Hbf mit den ESTW-Zentraleinheiten \\\"HH Kennzahl 06\\\" und \\\"HHZX Kennzahl 30\\\").\n\nEine Kennzahl kann aber auch mehrere Betriebsstellen beinhalten. Z. B dann, wenn eine ESTW-Zentraleinheit zwei \u00dcberleitstellen steuert (Beispiel ESTW-Zentraleinheit Giften HGIF Kennzahl 71 mit \\\"\u00dcst Giften HGIF\\\" und \\\"\u00dcst Ritterkamp HRIT\\\".\n\nIn Stellbereichen von Bedienbezirken werden f\u00fcr Betriebsstellen (z. B. Bahnh\u00f6fe, Abzweigstellen, Anschlussstellen) Kennzahlen von 01 bis 99 vergeben. Diese Kennzahl muss im Bedienbezirk eindeutig sein.\n\nEindeutigkeit der Kennzahlen bei angrenzenden Bedienbezirken entlang einer Strecke:\n\nInnerhalb eines Bedienbezirks und f\u00fcr benachbarte Betriebsstellen eines angrenzenden Bedienbezirks entlang einer Strecke darf eine Kennzahl nur einmal verwendet werden. Beispiel: Media:Bedien Oertlichkeit Kennzahl 131121.pdf\n\nF\u00fcr alle im jeweiligen Bereich befindlichen Stellelemente der Betriebsstellen und Strecken wird die Kennzahl Bestandteil der ausf\u00fchrlichen Elementbezeichnung. Hierdurch er\u00fcbrigt sich in einem gr\u00f6\u00dferen Bereich der Infrastruktur die Mitf\u00fchrung eines Ortsbezeichners.\n\nZentrale Vergabe von Kennzahlen auch ohne Anbindung an Bedien_Zentralen:\n\nUnabnh\u00e4ngig ob eine ESTW-Zentraleinheit aus einer Bedien_Zentrale gesteuert wird oder nur \u00f6rtlich eingerichtet ist, soll die Kennzahlenvergabe zentral im Sinne einer m\u00f6glichen Konzentration von ESTW-Zentraleinheiten in Bedienbezirken geplant und vergeben werden. \n\nDB-Regelwerk\n\u2022 Kennzahltabelle oder Kennzaheln\u00fcbersichtsplan im PT 1, \n\u2022 819.0603 2, \n\u2022 819.9001 1 (5).\n\n"
		   });
		addAnnotation
		  (kilometrierung_TypeEDataType,
		   source,
		   new String[] {
			   "documentation", "Beschr\u00e4nkt die Bef\u00fcllung auf einen String mit der Bedeutung eines kilometrischen Wertes in Kilometer (km).\n\nDie Kilometrierung bildet sich aus: \n\u00a6 einem optionalen negativen Vorzeichen, \n\u00a6 der Ziffer 0 oder einer ein- bis dreistelligen Zahl ohne f\u00fchrende Nullen, \n\u00a6 einem Komma, \n\ndann entweder \n\u00a6 eine dreistellige Nachkommazahl, \n\noder bei der Angabe von Mehr- oder Minderl\u00e4ngen \n\u00a6 ein Vorzeichen + oder - und \n\u00a6 eine bis zu f\u00fcnfstellige Zahl ohne f\u00fchrende Nullen.\n"
		   });
		addAnnotation
		  (linksRechts_TypeEDataType,
		   source,
		   new String[] {
			   "documentation", "Attribute dieses Basistyps k\u00f6nnen den ENUM-Wert \\\"links\\\" oder \\\"rechts\\\" annehmen."
		   });
		addAnnotation
		  (meter_TypeEDataType,
		   source,
		   new String[] {
			   "documentation", "Von xs:decimal abgeleiteter Basistyp zur Angabe von Werten mit der Einheit Meter."
		   });
		addAnnotation
		  (objektname_TypeEDataType,
		   source,
		   new String[] {
			   "documentation", "Der Typ wird im Modell verwendet, um GUID-Zeiger auf ein spezifisches Ziel-LST-Objekt zu konfigurieren."
		   });
		addAnnotation
		  (oertlicher_Elementname_TypeEDataType,
		   source,
		   new String[] {
			   "documentation", "Kurzbezeichnung eines Elements. Der \u00f6rtliche Elementbezeichner ist Bestandteil des Elementnamens und wird elementspezifisch gebildet. Bei Lichtsperrsignalen und anderen Elementen mit Richtungsbuchstaben (X, Y) kann dieser nicht immer eindeutig und automatisch aus einem Richtungsattribut abgeleitet werden. Er ist in jedem Fall vom Planer zu bestimmen und als Bestandteil des \u00f6rtlichen Elementbezeichners abzuspeichern. Der \u00f6rtliche Elementbezeichner wird \u00fcblicherweise im Lageplan verwendet. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk 819.0603 (Stellwerkseinrichtungen - Bedienoberfl\u00e4chen), 819.9001 (Symbolbezeichnungen sicherungstechnischer Pl\u00e4ne).\n\n\n"
		   });
		addAnnotation
		  (pruefmerkmale_Daten_AttributeGroupEClass,
		   source,
		   new String[] {
			   "documentation", "Basisattributgruppe zur Zuordnung von Pr\u00fcfmerkmalen zu Daten bzw. einer Datei."
		   });
		addAnnotation
		  (getPruefmerkmale_Daten_AttributeGroup_DatumAuslieferung(),
		   source,
		   new String[] {
			   "documentation", "Datum, an dem die Daten bzw. die Datei vom Hersteller ausgeliefert wurde(n)."
		   });
		addAnnotation
		  (getPruefmerkmale_Daten_AttributeGroup_Pruefsumme(),
		   source,
		   new String[] {
			   "documentation", "Pr\u00fcfsumme f\u00fcr die Daten bzw. die Datei zur Sicherstellung der Unverf\u00e4lschtheit."
		   });
		addAnnotation
		  (getPruefmerkmale_Daten_AttributeGroup_PruefsummeArt(),
		   source,
		   new String[] {
			   "documentation", "Art der verwendeten Pr\u00fcfsumme (z. B. MD4)."
		   });
		addAnnotation
		  (getPruefmerkmale_Daten_AttributeGroup_VersionAuslieferung(),
		   source,
		   new String[] {
			   "documentation", "Version der Auslieferung vom Hersteller."
		   });
		addAnnotation
		  (regionalbereich_TypeEDataType,
		   source,
		   new String[] {
			   "documentation", "Regionalbereich der DB Netz AG, dem die Anlage zugewiesen ist.\n"
		   });
		addAnnotation
		  (sekunde_TypeEDataType,
		   source,
		   new String[] {
			   "documentation", "Von xs:decimal abgeleiteter Basistyp zur Angabe von Werten mit der Einheit Sekunde im Format sssss[.zh] (s: Sekunde, z: Zehntel, h: Hundertstel)."
		   });
		addAnnotation
		  (text_TypeEDataType,
		   source,
		   new String[] {
			   "documentation", "Beschr\u00e4nkt die Bef\u00fcllung auf Flie\u00dftext inkl. Zahlen, Leerzeichen und Sonderzeichen aus den Zeichenvorat von UTF-8, wobei die L\u00e4nge auf [1..250] Zeichen festgelegt ist."
		   });
		addAnnotation
		  (version_Auslieferung_TypeEDataType,
		   source,
		   new String[] {
			   "documentation", "Version der Auslieferung vom Hersteller.\n"
		   });
		addAnnotation
		  (wirkrichtung_TypeEDataType,
		   source,
		   new String[] {
			   "documentation", "Ein Attribut diesen Typs wird verwendet, um die Wirkrichtung eines Objekts in Bezug zur Topologierichtung anzuzeigen. Ein Attribut mit diesem Basistyp nimmt einen der ENUM-Werte \'beide\', \'gegen\' und \'in\' an."
		   });
		addAnnotation
		  (zeichenkette_TypeEDataType,
		   source,
		   new String[] {
			   "documentation", "Beschr\u00e4nkt die Bef\u00fcllung auf alphanumerische Zeichen und Unterstrich, wobei die L\u00e4nge auf [1..250] Zeichen festgelegt ist."
		   });
		addAnnotation
		  (zeiger_TypeClassEClass,
		   source,
		   new String[] {
			   "documentation", "Typklasse, von der alle spezifischen Zeiger im Modell abgeleitet sind. Spezifische Zeiger werden verwendet, um einen Verweis von einem Objekt auf ein anderes Objekt zu modellieren. Dazu wird technisch auf die GUID des Zielobjektes referenziert."
		   });
		addAnnotation
		  (getZeiger_TypeClass_Wert(),
		   source,
		   new String[] {
			   "documentation", "Enth\u00e4lt die GUID des Ziel-LST-Objekts, auf das der GUID-Zeiger verweist."
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
		  (anwendungssystem_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TAnwendungssystem",
			   "baseType", "ENUMAnwendungssystem"
		   });
		addAnnotation
		  (ausrichtung_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TAusrichtung",
			   "baseType", "ENUMAusrichtung"
		   });
		addAnnotation
		  (basisAttribut_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CBasisAttribut",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBasisAttribut_AttributeGroup_IDBearbeitungsvermerk(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Bearbeitungsvermerk"
		   });
		addAnnotation
		  (bezeichnung_Aussenanlage_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBezeichnung_Aussenanlage",
			   "baseType", "TText",
			   "pattern", ".{1,36}"
		   });
		addAnnotation
		  (bezeichnung_Aussenanlage_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBezeichnung_Aussenanlage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBezeichnung_Aussenanlage_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bezeichnung_Element_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CBezeichnung_Element",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBezeichnung_Element_AttributeGroup_BezeichnungAussenanlage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung_Aussenanlage"
		   });
		addAnnotation
		  (getBezeichnung_Element_AttributeGroup_BezeichnungLageplanKurz(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung_Lageplan_Kurz"
		   });
		addAnnotation
		  (getBezeichnung_Element_AttributeGroup_BezeichnungLageplanLang(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung_Lageplan_Lang"
		   });
		addAnnotation
		  (getBezeichnung_Element_AttributeGroup_BezeichnungTabelle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung_Tabelle"
		   });
		addAnnotation
		  (getBezeichnung_Element_AttributeGroup_Kennzahl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Kennzahl"
		   });
		addAnnotation
		  (getBezeichnung_Element_AttributeGroup_OertlicherElementname(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Oertlicher_Elementname"
		   });
		addAnnotation
		  (bezeichnung_Lageplan_Kurz_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBezeichnung_Lageplan_Kurz",
			   "baseType", "TText",
			   "pattern", ".{1,36}"
		   });
		addAnnotation
		  (bezeichnung_Lageplan_Kurz_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBezeichnung_Lageplan_Kurz",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBezeichnung_Lageplan_Kurz_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bezeichnung_Lageplan_Lang_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBezeichnung_Lageplan_Lang",
			   "baseType", "TText",
			   "pattern", ".{1,36}"
		   });
		addAnnotation
		  (bezeichnung_Lageplan_Lang_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBezeichnung_Lageplan_Lang",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBezeichnung_Lageplan_Lang_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bezeichnung_Tabelle_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBezeichnung_Tabelle",
			   "baseType", "TText",
			   "pattern", ".{1,36}"
		   });
		addAnnotation
		  (bezeichnung_Tabelle_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBezeichnung_Tabelle",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBezeichnung_Tabelle_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bremsweg_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBremsweg",
			   "baseType", "ENUMBremsweg"
		   });
		addAnnotation
		  (dateiname_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TDateiname",
			   "baseType", "TText",
			   "pattern", "[^\\\\/?:\\*\\|\"<>]*"
		   });
		addAnnotation
		  (datum_Auslieferung_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TDatum_Auslieferung",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#date"
		   });
		addAnnotation
		  (datum_Auslieferung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCDatum_Auslieferung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDatum_Auslieferung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (enumAnwendungssystemEEnum,
		   source,
		   new String[] {
			   "name", "ENUMAnwendungssystem"
		   });
		addAnnotation
		  (enumAnwendungssystemObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMAnwendungssystem:Object",
			   "baseType", "ENUMAnwendungssystem"
		   });
		addAnnotation
		  (enumAusrichtungEEnum,
		   source,
		   new String[] {
			   "name", "ENUMAusrichtung"
		   });
		addAnnotation
		  (enumAusrichtungObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMAusrichtung:Object",
			   "baseType", "ENUMAusrichtung"
		   });
		addAnnotation
		  (enumBremswegEEnum,
		   source,
		   new String[] {
			   "name", "ENUMBremsweg"
		   });
		addAnnotation
		  (enumBremswegObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMBremsweg:Object",
			   "baseType", "ENUMBremsweg"
		   });
		addAnnotation
		  (enumFahrstromEEnum,
		   source,
		   new String[] {
			   "name", "ENUMFahrstrom"
		   });
		addAnnotation
		  (enumFahrstromObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMFahrstrom:Object",
			   "baseType", "ENUMFahrstrom"
		   });
		addAnnotation
		  (enumLinksRechtsEEnum,
		   source,
		   new String[] {
			   "name", "ENUMLinksRechts"
		   });
		addAnnotation
		  (enumLinksRechtsObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMLinksRechts:Object",
			   "baseType", "ENUMLinksRechts"
		   });
		addAnnotation
		  (enumPruefsummeArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMPruefsumme_Art"
		   });
		addAnnotation
		  (enumPruefsummeArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMPruefsumme_Art:Object",
			   "baseType", "ENUMPruefsumme_Art"
		   });
		addAnnotation
		  (enumRegionalbereichEEnum,
		   source,
		   new String[] {
			   "name", "ENUMRegionalbereich"
		   });
		addAnnotation
		  (enumRegionalbereichObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMRegionalbereich:Object",
			   "baseType", "ENUMRegionalbereich"
		   });
		addAnnotation
		  (enumWirkrichtungEEnum,
		   source,
		   new String[] {
			   "name", "ENUMWirkrichtung"
		   });
		addAnnotation
		  (enumWirkrichtungObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMWirkrichtung:Object",
			   "baseType", "ENUMWirkrichtung"
		   });
		addAnnotation
		  (fahrstrom_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TFahrstrom",
			   "baseType", "ENUMFahrstrom"
		   });
		addAnnotation
		  (freiText_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TFreiText",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
		addAnnotation
		  (geschwindigkeit_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TGeschwindigkeit",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "pattern", "0|[1-9][0-9]{0,1}|[1-4][0-9]{2}|500"
		   });
		addAnnotation
		  (guiD_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TGUID",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "pattern", "[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}"
		   });
		addAnnotation
		  (hersteller_TypeEDataType,
		   source,
		   new String[] {
			   "name", "THersteller",
			   "baseType", "TText"
		   });
		addAnnotation
		  (iD_Bearbeitungsvermerk_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCID_Bearbeitungsvermerk",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getID_Bearbeitungsvermerk_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (kennzahl_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TKennzahl",
			   "baseType", "TZeichenkette",
			   "pattern", "0[1-9]|[1-9][0-9]"
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
		  (kilometrierung_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TKilometrierung",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "pattern", "-?(([1-9][0-9]{0,2})|0),([0-9]{3}|([0-9][\\+\\-][1-9][0-9]{0,4}))"
		   });
		addAnnotation
		  (linksRechts_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TLinksRechts",
			   "baseType", "ENUMLinksRechts"
		   });
		addAnnotation
		  (meter_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TMeter",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal"
		   });
		addAnnotation
		  (objektname_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TObjektname",
			   "baseType", "TText"
		   });
		addAnnotation
		  (oertlicher_Elementname_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TOertlicher_Elementname",
			   "baseType", "TZeichenkette",
			   "pattern", ".{1,6}"
		   });
		addAnnotation
		  (oertlicher_Elementname_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCOertlicher_Elementname",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getOertlicher_Elementname_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (pruefmerkmale_Daten_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CPruefmerkmale_Daten",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPruefmerkmale_Daten_AttributeGroup_DatumAuslieferung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Datum_Auslieferung"
		   });
		addAnnotation
		  (getPruefmerkmale_Daten_AttributeGroup_Pruefsumme(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Pruefsumme"
		   });
		addAnnotation
		  (getPruefmerkmale_Daten_AttributeGroup_PruefsummeArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Pruefsumme_Art"
		   });
		addAnnotation
		  (getPruefmerkmale_Daten_AttributeGroup_VersionAuslieferung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Version_Auslieferung"
		   });
		addAnnotation
		  (pruefsumme_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCPruefsumme_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPruefsumme_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (pruefsumme_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCPruefsumme",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPruefsumme_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (regionalbereich_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TRegionalbereich",
			   "baseType", "ENUMRegionalbereich"
		   });
		addAnnotation
		  (sekunde_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TSekunde",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			   "pattern", "[0-9]{1,5}(\\.[0-9]{2})?"
		   });
		addAnnotation
		  (text_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TText",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "pattern", ".{1,250}"
		   });
		addAnnotation
		  (version_Auslieferung_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TVersion_Auslieferung",
			   "baseType", "TText"
		   });
		addAnnotation
		  (version_Auslieferung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCVersion_Auslieferung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getVersion_Auslieferung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (wirkrichtung_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TWirkrichtung",
			   "baseType", "ENUMWirkrichtung"
		   });
		addAnnotation
		  (zeichenkette_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TZeichenkette",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			   "pattern", "[a-zA-Z_0-9]{1,250}"
		   });
		addAnnotation
		  (zeiger_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCZeiger",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZeiger_TypeClass_Wert(),
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
		  (getBezeichnung_Element_AttributeGroup_Kennzahl(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung> [2] f\u00fchrende Null ist mitzuschreiben, \'00\' ist unzul\u00e4ssig</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (dateiname_TypeEDataType,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:Patternbeschreibung>Alle Zeichen ausser den folgenden: ^\\\\/?:*|&lt;&gt;</ppi:Patternbeschreibung>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (kennzahl_TypeEDataType,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:Patternbeschreibung> [2] f\u00fchrende Null ist mitzuschreiben, \\u002700\\u0027 ist unzul\u00e4ssig</ppi:Patternbeschreibung>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
	}

} //BasisTypenPackageImpl
