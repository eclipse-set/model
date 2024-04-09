/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Layoutinformationen.impl;

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

import org.eclipse.set.model.planpro.Layoutinformationen.Bez_Lageplan_Blattschnitt_TypeClass;
import org.eclipse.set.model.planpro.Layoutinformationen.Bezeichnung_Lageplan_TypeClass;
import org.eclipse.set.model.planpro.Layoutinformationen.Darstellung_GEO_Punkt_TypeClass;
import org.eclipse.set.model.planpro.Layoutinformationen.Darstellung_Polygonzug_TypeClass;
import org.eclipse.set.model.planpro.Layoutinformationen.Darstellung_Richtungswinkel_TypeClass;
import org.eclipse.set.model.planpro.Layoutinformationen.DocumentRoot;
import org.eclipse.set.model.planpro.Layoutinformationen.ENUMFuellung;
import org.eclipse.set.model.planpro.Layoutinformationen.ENUMLageplanArt;
import org.eclipse.set.model.planpro.Layoutinformationen.ENUMLinieArt;
import org.eclipse.set.model.planpro.Layoutinformationen.ENUMLinieSubart;
import org.eclipse.set.model.planpro.Layoutinformationen.Element_Position;
import org.eclipse.set.model.planpro.Layoutinformationen.Element_Position_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil;
import org.eclipse.set.model.planpro.Layoutinformationen.Element_Stil_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Layoutinformationen.Fuellung_TypeClass;
import org.eclipse.set.model.planpro.Layoutinformationen.Lageplan;
import org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Art_TypeClass;
import org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Blattschnitt;
import org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Blattschnitt_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.planpro.Layoutinformationen.Lageplan_Zustand;
import org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenFactory;
import org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage;
import org.eclipse.set.model.planpro.Layoutinformationen.Linie_Art_TypeClass;
import org.eclipse.set.model.planpro.Layoutinformationen.Linie_Farbwert_TypeClass;
import org.eclipse.set.model.planpro.Layoutinformationen.Linie_Subart_TypeClass;
import org.eclipse.set.model.planpro.Layoutinformationen.PlanPro_Layoutinfo;
import org.eclipse.set.model.planpro.Layoutinformationen.Polygonzug_Ausrichtung_TypeClass;
import org.eclipse.set.model.planpro.Layoutinformationen.Polygonzug_Blattschnitt_TypeClass;
import org.eclipse.set.model.planpro.Layoutinformationen.Referenz_LST_Zustand_TypeClass;
import org.eclipse.set.model.planpro.Layoutinformationen.Referenz_Objekt_Darstellung_TypeClass;

import org.eclipse.set.model.planpro.Layoutinformationen.util.LayoutinformationenValidator;

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
public class LayoutinformationenPackageImpl extends EPackageImpl implements LayoutinformationenPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bez_Lageplan_Blattschnitt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_Lageplan_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass darstellung_GEO_Punkt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass darstellung_Polygonzug_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass darstellung_Richtungswinkel_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass element_PositionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass element_Position_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass element_StilEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass element_Stil_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fuellung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lageplanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lageplan_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lageplan_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lageplan_BlattschnittEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lageplan_Blattschnitt_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lageplan_ZustandEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linie_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linie_Farbwert_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linie_Subart_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass planPro_LayoutinfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonzug_Ausrichtung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass polygonzug_Blattschnitt_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenz_LST_Zustand_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenz_Objekt_Darstellung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumFuellungEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumLageplanArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumLinieArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumLinieSubartEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bez_Lageplan_Blattschnitt_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_Lageplan_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType darstellung_GEO_Punkt_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType darstellung_Polygonzug_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType darstellung_Richtungswinkel_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumFuellungObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumLageplanArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumLinieArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumLinieSubartObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType linie_Farbwert_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType polygonzug_Ausrichtung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType polygonzug_Blattschnitt_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType referenz_LST_Zustand_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType referenz_Objekt_Darstellung_TypeEDataType = null;

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
	 * @see org.eclipse.set.model.planpro.Layoutinformationen.LayoutinformationenPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LayoutinformationenPackageImpl() {
		super(eNS_URI, LayoutinformationenFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LayoutinformationenPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LayoutinformationenPackage init() {
		if (isInited) return (LayoutinformationenPackage)EPackage.Registry.INSTANCE.getEPackage(LayoutinformationenPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLayoutinformationenPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LayoutinformationenPackageImpl theLayoutinformationenPackage = registeredLayoutinformationenPackage instanceof LayoutinformationenPackageImpl ? (LayoutinformationenPackageImpl)registeredLayoutinformationenPackage : new LayoutinformationenPackageImpl();

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
		theLayoutinformationenPackage.createPackageContents();
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
		theSignalbegriffe_StrukturPackage.createPackageContents();
		theZuglenkungPackage.createPackageContents();
		theZugnummernmeldeanlagePackage.createPackageContents();

		// Initialize created meta-data
		theLayoutinformationenPackage.initializePackageContents();
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
			(theLayoutinformationenPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return LayoutinformationenValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theLayoutinformationenPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LayoutinformationenPackage.eNS_URI, theLayoutinformationenPackage);
		return theLayoutinformationenPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBez_Lageplan_Blattschnitt_TypeClass() {
		return bez_Lageplan_Blattschnitt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBez_Lageplan_Blattschnitt_TypeClass_Wert() {
		return (EAttribute)bez_Lageplan_Blattschnitt_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_Lageplan_TypeClass() {
		return bezeichnung_Lageplan_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_Lageplan_TypeClass_Wert() {
		return (EAttribute)bezeichnung_Lageplan_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDarstellung_GEO_Punkt_TypeClass() {
		return darstellung_GEO_Punkt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDarstellung_GEO_Punkt_TypeClass_Wert() {
		return (EAttribute)darstellung_GEO_Punkt_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDarstellung_Polygonzug_TypeClass() {
		return darstellung_Polygonzug_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDarstellung_Polygonzug_TypeClass_Wert() {
		return (EAttribute)darstellung_Polygonzug_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDarstellung_Richtungswinkel_TypeClass() {
		return darstellung_Richtungswinkel_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDarstellung_Richtungswinkel_TypeClass_Wert() {
		return (EAttribute)darstellung_Richtungswinkel_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDocumentRoot_PlanProLayoutinfo() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElement_Position() {
		return element_PositionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Position_ElementPositionAllg() {
		return (EReference)element_PositionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Position_IDLageplanZustand() {
		return (EReference)element_PositionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Position_ReferenzObjektDarstellung() {
		return (EReference)element_PositionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElement_Position_Allg_AttributeGroup() {
		return element_Position_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Position_Allg_AttributeGroup_DarstellungRichtungswinkel() {
		return (EReference)element_Position_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Position_Allg_AttributeGroup_DarstellungGEOPunkt() {
		return (EReference)element_Position_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Position_Allg_AttributeGroup_DarstellungPolygonzug() {
		return (EReference)element_Position_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElement_Stil() {
		return element_StilEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Stil_ElementStilAllg() {
		return (EReference)element_StilEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Stil_IDLageplanZustand() {
		return (EReference)element_StilEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Stil_ReferenzObjektDarstellung() {
		return (EReference)element_StilEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getElement_Stil_Allg_AttributeGroup() {
		return element_Stil_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Stil_Allg_AttributeGroup_Fuellung() {
		return (EReference)element_Stil_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Stil_Allg_AttributeGroup_LinieArt() {
		return (EReference)element_Stil_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Stil_Allg_AttributeGroup_LinieFarbwert() {
		return (EReference)element_Stil_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getElement_Stil_Allg_AttributeGroup_LinieSubart() {
		return (EReference)element_Stil_Allg_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFuellung_TypeClass() {
		return fuellung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFuellung_TypeClass_Wert() {
		return (EAttribute)fuellung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLageplan() {
		return lageplanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLageplan_Bezeichnung() {
		return (EReference)lageplanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLageplan_IDLageplanBlattschnitt() {
		return (EReference)lageplanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLageplan_LageplanArt() {
		return (EReference)lageplanEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLageplan_Art_TypeClass() {
		return lageplan_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLageplan_Art_TypeClass_Wert() {
		return (EAttribute)lageplan_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLageplan_Bezeichnung_AttributeGroup() {
		return lageplan_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLageplan_Bezeichnung_AttributeGroup_BezeichnungLageplan() {
		return (EReference)lageplan_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLageplan_Blattschnitt() {
		return lageplan_BlattschnittEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLageplan_Blattschnitt_Bezeichnung() {
		return (EReference)lageplan_BlattschnittEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLageplan_Blattschnitt_PolygonzugAusrichtung() {
		return (EReference)lageplan_BlattschnittEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLageplan_Blattschnitt_PolygonzugBlattschnitt() {
		return (EReference)lageplan_BlattschnittEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLageplan_Blattschnitt_Bezeichnung_AttributeGroup() {
		return lageplan_Blattschnitt_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLageplan_Blattschnitt_Bezeichnung_AttributeGroup_BezLageplanBlattschnitt() {
		return (EReference)lageplan_Blattschnitt_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLageplan_Zustand() {
		return lageplan_ZustandEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLageplan_Zustand_IDLageplan() {
		return (EReference)lageplan_ZustandEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLageplan_Zustand_ReferenzLSTZustand() {
		return (EReference)lageplan_ZustandEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinie_Art_TypeClass() {
		return linie_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinie_Art_TypeClass_Wert() {
		return (EAttribute)linie_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinie_Farbwert_TypeClass() {
		return linie_Farbwert_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinie_Farbwert_TypeClass_Wert() {
		return (EAttribute)linie_Farbwert_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLinie_Subart_TypeClass() {
		return linie_Subart_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLinie_Subart_TypeClass_Wert() {
		return (EAttribute)linie_Subart_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPlanPro_Layoutinfo() {
		return planPro_LayoutinfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanPro_Layoutinfo_ElementPosition() {
		return (EReference)planPro_LayoutinfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanPro_Layoutinfo_ElementStil() {
		return (EReference)planPro_LayoutinfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanPro_Layoutinfo_Lageplan() {
		return (EReference)planPro_LayoutinfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanPro_Layoutinfo_LageplanBlattschnitt() {
		return (EReference)planPro_LayoutinfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPlanPro_Layoutinfo_LageplanZustand() {
		return (EReference)planPro_LayoutinfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolygonzug_Ausrichtung_TypeClass() {
		return polygonzug_Ausrichtung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolygonzug_Ausrichtung_TypeClass_Wert() {
		return (EAttribute)polygonzug_Ausrichtung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPolygonzug_Blattschnitt_TypeClass() {
		return polygonzug_Blattschnitt_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPolygonzug_Blattschnitt_TypeClass_Wert() {
		return (EAttribute)polygonzug_Blattschnitt_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenz_LST_Zustand_TypeClass() {
		return referenz_LST_Zustand_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferenz_LST_Zustand_TypeClass_Wert() {
		return (EAttribute)referenz_LST_Zustand_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenz_Objekt_Darstellung_TypeClass() {
		return referenz_Objekt_Darstellung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferenz_Objekt_Darstellung_TypeClass_Wert() {
		return (EAttribute)referenz_Objekt_Darstellung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMFuellung() {
		return enumFuellungEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMLageplanArt() {
		return enumLageplanArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMLinieArt() {
		return enumLinieArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMLinieSubart() {
		return enumLinieSubartEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBez_Lageplan_Blattschnitt_Type() {
		return bez_Lageplan_Blattschnitt_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_Lageplan_Type() {
		return bezeichnung_Lageplan_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDarstellung_GEO_Punkt_Type() {
		return darstellung_GEO_Punkt_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDarstellung_Polygonzug_Type() {
		return darstellung_Polygonzug_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDarstellung_Richtungswinkel_Type() {
		return darstellung_Richtungswinkel_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMFuellungObject() {
		return enumFuellungObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMLageplanArtObject() {
		return enumLageplanArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMLinieArtObject() {
		return enumLinieArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMLinieSubartObject() {
		return enumLinieSubartObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLinie_Farbwert_Type() {
		return linie_Farbwert_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPolygonzug_Ausrichtung_Type() {
		return polygonzug_Ausrichtung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPolygonzug_Blattschnitt_Type() {
		return polygonzug_Blattschnitt_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getReferenz_LST_Zustand_Type() {
		return referenz_LST_Zustand_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getReferenz_Objekt_Darstellung_Type() {
		return referenz_Objekt_Darstellung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LayoutinformationenFactory getLayoutinformationenFactory() {
		return (LayoutinformationenFactory)getEFactoryInstance();
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
		bez_Lageplan_Blattschnitt_TypeClassEClass = createEClass(BEZ_LAGEPLAN_BLATTSCHNITT_TYPE_CLASS);
		createEAttribute(bez_Lageplan_Blattschnitt_TypeClassEClass, BEZ_LAGEPLAN_BLATTSCHNITT_TYPE_CLASS__WERT);

		bezeichnung_Lageplan_TypeClassEClass = createEClass(BEZEICHNUNG_LAGEPLAN_TYPE_CLASS);
		createEAttribute(bezeichnung_Lageplan_TypeClassEClass, BEZEICHNUNG_LAGEPLAN_TYPE_CLASS__WERT);

		darstellung_GEO_Punkt_TypeClassEClass = createEClass(DARSTELLUNG_GEO_PUNKT_TYPE_CLASS);
		createEAttribute(darstellung_GEO_Punkt_TypeClassEClass, DARSTELLUNG_GEO_PUNKT_TYPE_CLASS__WERT);

		darstellung_Polygonzug_TypeClassEClass = createEClass(DARSTELLUNG_POLYGONZUG_TYPE_CLASS);
		createEAttribute(darstellung_Polygonzug_TypeClassEClass, DARSTELLUNG_POLYGONZUG_TYPE_CLASS__WERT);

		darstellung_Richtungswinkel_TypeClassEClass = createEClass(DARSTELLUNG_RICHTUNGSWINKEL_TYPE_CLASS);
		createEAttribute(darstellung_Richtungswinkel_TypeClassEClass, DARSTELLUNG_RICHTUNGSWINKEL_TYPE_CLASS__WERT);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PLAN_PRO_LAYOUTINFO);

		element_PositionEClass = createEClass(ELEMENT_POSITION);
		createEReference(element_PositionEClass, ELEMENT_POSITION__ELEMENT_POSITION_ALLG);
		createEReference(element_PositionEClass, ELEMENT_POSITION__ID_LAGEPLAN_ZUSTAND);
		createEReference(element_PositionEClass, ELEMENT_POSITION__REFERENZ_OBJEKT_DARSTELLUNG);

		element_Position_Allg_AttributeGroupEClass = createEClass(ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP);
		createEReference(element_Position_Allg_AttributeGroupEClass, ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_RICHTUNGSWINKEL);
		createEReference(element_Position_Allg_AttributeGroupEClass, ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_GEO_PUNKT);
		createEReference(element_Position_Allg_AttributeGroupEClass, ELEMENT_POSITION_ALLG_ATTRIBUTE_GROUP__DARSTELLUNG_POLYGONZUG);

		element_StilEClass = createEClass(ELEMENT_STIL);
		createEReference(element_StilEClass, ELEMENT_STIL__ELEMENT_STIL_ALLG);
		createEReference(element_StilEClass, ELEMENT_STIL__ID_LAGEPLAN_ZUSTAND);
		createEReference(element_StilEClass, ELEMENT_STIL__REFERENZ_OBJEKT_DARSTELLUNG);

		element_Stil_Allg_AttributeGroupEClass = createEClass(ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP);
		createEReference(element_Stil_Allg_AttributeGroupEClass, ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__FUELLUNG);
		createEReference(element_Stil_Allg_AttributeGroupEClass, ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_ART);
		createEReference(element_Stil_Allg_AttributeGroupEClass, ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_FARBWERT);
		createEReference(element_Stil_Allg_AttributeGroupEClass, ELEMENT_STIL_ALLG_ATTRIBUTE_GROUP__LINIE_SUBART);

		fuellung_TypeClassEClass = createEClass(FUELLUNG_TYPE_CLASS);
		createEAttribute(fuellung_TypeClassEClass, FUELLUNG_TYPE_CLASS__WERT);

		lageplanEClass = createEClass(LAGEPLAN);
		createEReference(lageplanEClass, LAGEPLAN__BEZEICHNUNG);
		createEReference(lageplanEClass, LAGEPLAN__ID_LAGEPLAN_BLATTSCHNITT);
		createEReference(lageplanEClass, LAGEPLAN__LAGEPLAN_ART);

		lageplan_Art_TypeClassEClass = createEClass(LAGEPLAN_ART_TYPE_CLASS);
		createEAttribute(lageplan_Art_TypeClassEClass, LAGEPLAN_ART_TYPE_CLASS__WERT);

		lageplan_Bezeichnung_AttributeGroupEClass = createEClass(LAGEPLAN_BEZEICHNUNG_ATTRIBUTE_GROUP);
		createEReference(lageplan_Bezeichnung_AttributeGroupEClass, LAGEPLAN_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_LAGEPLAN);

		lageplan_BlattschnittEClass = createEClass(LAGEPLAN_BLATTSCHNITT);
		createEReference(lageplan_BlattschnittEClass, LAGEPLAN_BLATTSCHNITT__BEZEICHNUNG);
		createEReference(lageplan_BlattschnittEClass, LAGEPLAN_BLATTSCHNITT__POLYGONZUG_AUSRICHTUNG);
		createEReference(lageplan_BlattschnittEClass, LAGEPLAN_BLATTSCHNITT__POLYGONZUG_BLATTSCHNITT);

		lageplan_Blattschnitt_Bezeichnung_AttributeGroupEClass = createEClass(LAGEPLAN_BLATTSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP);
		createEReference(lageplan_Blattschnitt_Bezeichnung_AttributeGroupEClass, LAGEPLAN_BLATTSCHNITT_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZ_LAGEPLAN_BLATTSCHNITT);

		lageplan_ZustandEClass = createEClass(LAGEPLAN_ZUSTAND);
		createEReference(lageplan_ZustandEClass, LAGEPLAN_ZUSTAND__ID_LAGEPLAN);
		createEReference(lageplan_ZustandEClass, LAGEPLAN_ZUSTAND__REFERENZ_LST_ZUSTAND);

		linie_Art_TypeClassEClass = createEClass(LINIE_ART_TYPE_CLASS);
		createEAttribute(linie_Art_TypeClassEClass, LINIE_ART_TYPE_CLASS__WERT);

		linie_Farbwert_TypeClassEClass = createEClass(LINIE_FARBWERT_TYPE_CLASS);
		createEAttribute(linie_Farbwert_TypeClassEClass, LINIE_FARBWERT_TYPE_CLASS__WERT);

		linie_Subart_TypeClassEClass = createEClass(LINIE_SUBART_TYPE_CLASS);
		createEAttribute(linie_Subart_TypeClassEClass, LINIE_SUBART_TYPE_CLASS__WERT);

		planPro_LayoutinfoEClass = createEClass(PLAN_PRO_LAYOUTINFO);
		createEReference(planPro_LayoutinfoEClass, PLAN_PRO_LAYOUTINFO__ELEMENT_POSITION);
		createEReference(planPro_LayoutinfoEClass, PLAN_PRO_LAYOUTINFO__ELEMENT_STIL);
		createEReference(planPro_LayoutinfoEClass, PLAN_PRO_LAYOUTINFO__LAGEPLAN);
		createEReference(planPro_LayoutinfoEClass, PLAN_PRO_LAYOUTINFO__LAGEPLAN_BLATTSCHNITT);
		createEReference(planPro_LayoutinfoEClass, PLAN_PRO_LAYOUTINFO__LAGEPLAN_ZUSTAND);

		polygonzug_Ausrichtung_TypeClassEClass = createEClass(POLYGONZUG_AUSRICHTUNG_TYPE_CLASS);
		createEAttribute(polygonzug_Ausrichtung_TypeClassEClass, POLYGONZUG_AUSRICHTUNG_TYPE_CLASS__WERT);

		polygonzug_Blattschnitt_TypeClassEClass = createEClass(POLYGONZUG_BLATTSCHNITT_TYPE_CLASS);
		createEAttribute(polygonzug_Blattschnitt_TypeClassEClass, POLYGONZUG_BLATTSCHNITT_TYPE_CLASS__WERT);

		referenz_LST_Zustand_TypeClassEClass = createEClass(REFERENZ_LST_ZUSTAND_TYPE_CLASS);
		createEAttribute(referenz_LST_Zustand_TypeClassEClass, REFERENZ_LST_ZUSTAND_TYPE_CLASS__WERT);

		referenz_Objekt_Darstellung_TypeClassEClass = createEClass(REFERENZ_OBJEKT_DARSTELLUNG_TYPE_CLASS);
		createEAttribute(referenz_Objekt_Darstellung_TypeClassEClass, REFERENZ_OBJEKT_DARSTELLUNG_TYPE_CLASS__WERT);

		// Create enums
		enumFuellungEEnum = createEEnum(ENUM_FUELLUNG);
		enumLageplanArtEEnum = createEEnum(ENUM_LAGEPLAN_ART);
		enumLinieArtEEnum = createEEnum(ENUM_LINIE_ART);
		enumLinieSubartEEnum = createEEnum(ENUM_LINIE_SUBART);

		// Create data types
		bez_Lageplan_Blattschnitt_TypeEDataType = createEDataType(BEZ_LAGEPLAN_BLATTSCHNITT_TYPE);
		bezeichnung_Lageplan_TypeEDataType = createEDataType(BEZEICHNUNG_LAGEPLAN_TYPE);
		darstellung_GEO_Punkt_TypeEDataType = createEDataType(DARSTELLUNG_GEO_PUNKT_TYPE);
		darstellung_Polygonzug_TypeEDataType = createEDataType(DARSTELLUNG_POLYGONZUG_TYPE);
		darstellung_Richtungswinkel_TypeEDataType = createEDataType(DARSTELLUNG_RICHTUNGSWINKEL_TYPE);
		enumFuellungObjectEDataType = createEDataType(ENUM_FUELLUNG_OBJECT);
		enumLageplanArtObjectEDataType = createEDataType(ENUM_LAGEPLAN_ART_OBJECT);
		enumLinieArtObjectEDataType = createEDataType(ENUM_LINIE_ART_OBJECT);
		enumLinieSubartObjectEDataType = createEDataType(ENUM_LINIE_SUBART_OBJECT);
		linie_Farbwert_TypeEDataType = createEDataType(LINIE_FARBWERT_TYPE);
		polygonzug_Ausrichtung_TypeEDataType = createEDataType(POLYGONZUG_AUSRICHTUNG_TYPE);
		polygonzug_Blattschnitt_TypeEDataType = createEDataType(POLYGONZUG_BLATTSCHNITT_TYPE);
		referenz_LST_Zustand_TypeEDataType = createEDataType(REFERENZ_LST_ZUSTAND_TYPE);
		referenz_Objekt_Darstellung_TypeEDataType = createEDataType(REFERENZ_OBJEKT_DARSTELLUNG_TYPE);
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
		GeodatenPackage theGeodatenPackage = (GeodatenPackage)EPackage.Registry.INSTANCE.getEPackage(GeodatenPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bez_Lageplan_Blattschnitt_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bezeichnung_Lageplan_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		darstellung_GEO_Punkt_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		darstellung_Polygonzug_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		darstellung_Richtungswinkel_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		element_PositionEClass.getESuperTypes().add(theBasisobjektePackage.getUr_Objekt());
		element_StilEClass.getESuperTypes().add(theBasisobjektePackage.getUr_Objekt());
		fuellung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		lageplanEClass.getESuperTypes().add(theBasisobjektePackage.getUr_Objekt());
		lageplan_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		lageplan_BlattschnittEClass.getESuperTypes().add(theBasisobjektePackage.getUr_Objekt());
		lageplan_ZustandEClass.getESuperTypes().add(theBasisobjektePackage.getUr_Objekt());
		linie_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		linie_Farbwert_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		linie_Subart_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		planPro_LayoutinfoEClass.getESuperTypes().add(theBasisobjektePackage.getUr_Objekt());
		polygonzug_Ausrichtung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		polygonzug_Blattschnitt_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		referenz_LST_Zustand_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		referenz_Objekt_Darstellung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());

		// Initialize classes and features; add operations and parameters
		initEClass(bez_Lageplan_Blattschnitt_TypeClassEClass, Bez_Lageplan_Blattschnitt_TypeClass.class, "Bez_Lageplan_Blattschnitt_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBez_Lageplan_Blattschnitt_TypeClass_Wert(), this.getBez_Lageplan_Blattschnitt_Type(), "wert", null, 1, 1, Bez_Lageplan_Blattschnitt_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bezeichnung_Lageplan_TypeClassEClass, Bezeichnung_Lageplan_TypeClass.class, "Bezeichnung_Lageplan_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBezeichnung_Lageplan_TypeClass_Wert(), this.getBezeichnung_Lageplan_Type(), "wert", null, 1, 1, Bezeichnung_Lageplan_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(darstellung_GEO_Punkt_TypeClassEClass, Darstellung_GEO_Punkt_TypeClass.class, "Darstellung_GEO_Punkt_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDarstellung_GEO_Punkt_TypeClass_Wert(), this.getDarstellung_GEO_Punkt_Type(), "wert", null, 1, 1, Darstellung_GEO_Punkt_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(darstellung_Polygonzug_TypeClassEClass, Darstellung_Polygonzug_TypeClass.class, "Darstellung_Polygonzug_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDarstellung_Polygonzug_TypeClass_Wert(), this.getDarstellung_Polygonzug_Type(), "wert", null, 1, 1, Darstellung_Polygonzug_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(darstellung_Richtungswinkel_TypeClassEClass, Darstellung_Richtungswinkel_TypeClass.class, "Darstellung_Richtungswinkel_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDarstellung_Richtungswinkel_TypeClass_Wert(), this.getDarstellung_Richtungswinkel_Type(), "wert", null, 1, 1, Darstellung_Richtungswinkel_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_PlanProLayoutinfo(), this.getPlanPro_Layoutinfo(), null, "planProLayoutinfo", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(element_PositionEClass, Element_Position.class, "Element_Position", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_Position_ElementPositionAllg(), this.getElement_Position_Allg_AttributeGroup(), null, "elementPositionAllg", null, 1, 1, Element_Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Position_IDLageplanZustand(), theVerweisePackage.getID_Lageplan_Zustand_TypeClass(), null, "iDLageplanZustand", null, 1, 2, Element_Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Position_ReferenzObjektDarstellung(), this.getReferenz_Objekt_Darstellung_TypeClass(), null, "referenzObjektDarstellung", null, 1, 1, Element_Position.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(element_Position_Allg_AttributeGroupEClass, Element_Position_Allg_AttributeGroup.class, "Element_Position_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_Position_Allg_AttributeGroup_DarstellungRichtungswinkel(), this.getDarstellung_Richtungswinkel_TypeClass(), null, "darstellungRichtungswinkel", null, 0, 1, Element_Position_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Position_Allg_AttributeGroup_DarstellungGEOPunkt(), theGeodatenPackage.getGEO_Punkt(), null, "darstellungGEOPunkt", null, 0, -1, Element_Position_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Position_Allg_AttributeGroup_DarstellungPolygonzug(), this.getDarstellung_Polygonzug_TypeClass(), null, "darstellungPolygonzug", null, 0, 1, Element_Position_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(element_StilEClass, Element_Stil.class, "Element_Stil", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_Stil_ElementStilAllg(), this.getElement_Stil_Allg_AttributeGroup(), null, "elementStilAllg", null, 1, 1, Element_Stil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Stil_IDLageplanZustand(), theVerweisePackage.getID_Lageplan_Zustand_TypeClass(), null, "iDLageplanZustand", null, 1, 2, Element_Stil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Stil_ReferenzObjektDarstellung(), this.getReferenz_Objekt_Darstellung_TypeClass(), null, "referenzObjektDarstellung", null, 1, 1, Element_Stil.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(element_Stil_Allg_AttributeGroupEClass, Element_Stil_Allg_AttributeGroup.class, "Element_Stil_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getElement_Stil_Allg_AttributeGroup_Fuellung(), this.getFuellung_TypeClass(), null, "fuellung", null, 0, 1, Element_Stil_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Stil_Allg_AttributeGroup_LinieArt(), this.getLinie_Art_TypeClass(), null, "linieArt", null, 0, 1, Element_Stil_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Stil_Allg_AttributeGroup_LinieFarbwert(), this.getLinie_Farbwert_TypeClass(), null, "linieFarbwert", null, 0, 1, Element_Stil_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getElement_Stil_Allg_AttributeGroup_LinieSubart(), this.getLinie_Subart_TypeClass(), null, "linieSubart", null, 0, 1, Element_Stil_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fuellung_TypeClassEClass, Fuellung_TypeClass.class, "Fuellung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFuellung_TypeClass_Wert(), this.getENUMFuellungObject(), "wert", null, 1, 1, Fuellung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lageplanEClass, Lageplan.class, "Lageplan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLageplan_Bezeichnung(), this.getLageplan_Bezeichnung_AttributeGroup(), null, "bezeichnung", null, 0, 1, Lageplan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLageplan_IDLageplanBlattschnitt(), theVerweisePackage.getID_Lageplan_Blattschnitt_TypeClass(), null, "iDLageplanBlattschnitt", null, 1, -1, Lageplan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLageplan_LageplanArt(), this.getLageplan_Art_TypeClass(), null, "lageplanArt", null, 1, 1, Lageplan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lageplan_Art_TypeClassEClass, Lageplan_Art_TypeClass.class, "Lageplan_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLageplan_Art_TypeClass_Wert(), this.getENUMLageplanArtObject(), "wert", null, 1, 1, Lageplan_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lageplan_Bezeichnung_AttributeGroupEClass, Lageplan_Bezeichnung_AttributeGroup.class, "Lageplan_Bezeichnung_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLageplan_Bezeichnung_AttributeGroup_BezeichnungLageplan(), this.getBezeichnung_Lageplan_TypeClass(), null, "bezeichnungLageplan", null, 1, 1, Lageplan_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lageplan_BlattschnittEClass, Lageplan_Blattschnitt.class, "Lageplan_Blattschnitt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLageplan_Blattschnitt_Bezeichnung(), this.getLageplan_Blattschnitt_Bezeichnung_AttributeGroup(), null, "bezeichnung", null, 1, 1, Lageplan_Blattschnitt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLageplan_Blattschnitt_PolygonzugAusrichtung(), this.getPolygonzug_Ausrichtung_TypeClass(), null, "polygonzugAusrichtung", null, 1, 1, Lageplan_Blattschnitt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLageplan_Blattschnitt_PolygonzugBlattschnitt(), this.getPolygonzug_Blattschnitt_TypeClass(), null, "polygonzugBlattschnitt", null, 1, 1, Lageplan_Blattschnitt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lageplan_Blattschnitt_Bezeichnung_AttributeGroupEClass, Lageplan_Blattschnitt_Bezeichnung_AttributeGroup.class, "Lageplan_Blattschnitt_Bezeichnung_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLageplan_Blattschnitt_Bezeichnung_AttributeGroup_BezLageplanBlattschnitt(), this.getBez_Lageplan_Blattschnitt_TypeClass(), null, "bezLageplanBlattschnitt", null, 1, 1, Lageplan_Blattschnitt_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lageplan_ZustandEClass, Lageplan_Zustand.class, "Lageplan_Zustand", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLageplan_Zustand_IDLageplan(), theVerweisePackage.getID_Lageplan_TypeClass(), null, "iDLageplan", null, 1, 1, Lageplan_Zustand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLageplan_Zustand_ReferenzLSTZustand(), this.getReferenz_LST_Zustand_TypeClass(), null, "referenzLSTZustand", null, 1, -1, Lageplan_Zustand.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linie_Art_TypeClassEClass, Linie_Art_TypeClass.class, "Linie_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinie_Art_TypeClass_Wert(), this.getENUMLinieArtObject(), "wert", null, 1, 1, Linie_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linie_Farbwert_TypeClassEClass, Linie_Farbwert_TypeClass.class, "Linie_Farbwert_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinie_Farbwert_TypeClass_Wert(), this.getLinie_Farbwert_Type(), "wert", null, 1, 1, Linie_Farbwert_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linie_Subart_TypeClassEClass, Linie_Subart_TypeClass.class, "Linie_Subart_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinie_Subart_TypeClass_Wert(), this.getENUMLinieSubartObject(), "wert", null, 1, 1, Linie_Subart_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(planPro_LayoutinfoEClass, PlanPro_Layoutinfo.class, "PlanPro_Layoutinfo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlanPro_Layoutinfo_ElementPosition(), this.getElement_Position(), null, "elementPosition", null, 0, -1, PlanPro_Layoutinfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlanPro_Layoutinfo_ElementStil(), this.getElement_Stil(), null, "elementStil", null, 0, -1, PlanPro_Layoutinfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlanPro_Layoutinfo_Lageplan(), this.getLageplan(), null, "lageplan", null, 0, -1, PlanPro_Layoutinfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlanPro_Layoutinfo_LageplanBlattschnitt(), this.getLageplan_Blattschnitt(), null, "lageplanBlattschnitt", null, 0, -1, PlanPro_Layoutinfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPlanPro_Layoutinfo_LageplanZustand(), this.getLageplan_Zustand(), null, "lageplanZustand", null, 0, -1, PlanPro_Layoutinfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(polygonzug_Ausrichtung_TypeClassEClass, Polygonzug_Ausrichtung_TypeClass.class, "Polygonzug_Ausrichtung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolygonzug_Ausrichtung_TypeClass_Wert(), this.getPolygonzug_Ausrichtung_Type(), "wert", null, 1, 1, Polygonzug_Ausrichtung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(polygonzug_Blattschnitt_TypeClassEClass, Polygonzug_Blattschnitt_TypeClass.class, "Polygonzug_Blattschnitt_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPolygonzug_Blattschnitt_TypeClass_Wert(), this.getPolygonzug_Blattschnitt_Type(), "wert", null, 1, 1, Polygonzug_Blattschnitt_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenz_LST_Zustand_TypeClassEClass, Referenz_LST_Zustand_TypeClass.class, "Referenz_LST_Zustand_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferenz_LST_Zustand_TypeClass_Wert(), this.getReferenz_LST_Zustand_Type(), "wert", null, 1, 1, Referenz_LST_Zustand_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenz_Objekt_Darstellung_TypeClassEClass, Referenz_Objekt_Darstellung_TypeClass.class, "Referenz_Objekt_Darstellung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferenz_Objekt_Darstellung_TypeClass_Wert(), this.getReferenz_Objekt_Darstellung_Type(), "wert", null, 1, 1, Referenz_Objekt_Darstellung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumFuellungEEnum, ENUMFuellung.class, "ENUMFuellung");
		addEEnumLiteral(enumFuellungEEnum, ENUMFuellung.ENUM_FUELLUNG_DOPPELTE_SCHRAFFUR);
		addEEnumLiteral(enumFuellungEEnum, ENUMFuellung.ENUM_FUELLUNG_EINFACHE_SCHRAFFUR);
		addEEnumLiteral(enumFuellungEEnum, ENUMFuellung.ENUM_FUELLUNG_EINFACHE_SCHRAFFUR_GESTRICHELT);
		addEEnumLiteral(enumFuellungEEnum, ENUMFuellung.ENUM_FUELLUNG_SONSTIGE);

		initEEnum(enumLageplanArtEEnum, ENUMLageplanArt.class, "ENUMLageplanArt");
		addEEnumLiteral(enumLageplanArtEEnum, ENUMLageplanArt.ENUM_LAGEPLAN_ART_BU_KREUZUNGSPLAN_LST);
		addEEnumLiteral(enumLageplanArtEEnum, ENUMLageplanArt.ENUM_LAGEPLAN_ART_BU_SICHERUNGSTECHN_LAGE_UND_KABELÜBERSICHTSPLAN);
		addEEnumLiteral(enumLageplanArtEEnum, ENUMLageplanArt.ENUM_LAGEPLAN_ART_GLEISFREIMELDEPLAN_FÜR_GLEISSTROMKREISE);
		addEEnumLiteral(enumLageplanArtEEnum, ENUMLageplanArt.ENUM_LAGEPLAN_ART_KABELLAGEPLAN);
		addEEnumLiteral(enumLageplanArtEEnum, ENUMLageplanArt.ENUM_LAGEPLAN_ART_KABELÜBERSICHTSPLAN);
		addEEnumLiteral(enumLageplanArtEEnum, ENUMLageplanArt.ENUM_LAGEPLAN_ART_SICHERUNGSTECHNISCHER_LAGEPLAN);
		addEEnumLiteral(enumLageplanArtEEnum, ENUMLageplanArt.ENUM_LAGEPLAN_ART_SICHERUNGSTECHNISCHER_UBERSICHTSPLAN);
		addEEnumLiteral(enumLageplanArtEEnum, ENUMLageplanArt.ENUM_LAGEPLAN_ART_SONSTIGE);
		addEEnumLiteral(enumLageplanArtEEnum, ENUMLageplanArt.ENUM_LAGEPLAN_ART_STAMMKABELÜBERSICHTSPLAN);
		addEEnumLiteral(enumLageplanArtEEnum, ENUMLageplanArt.ENUM_LAGEPLAN_ART_ZLV_BUS_UBERSICHTSPLAN);

		initEEnum(enumLinieArtEEnum, ENUMLinieArt.class, "ENUMLinieArt");
		addEEnumLiteral(enumLinieArtEEnum, ENUMLinieArt.ENUM_LINIE_ART_PUNKTLINIE);
		addEEnumLiteral(enumLinieArtEEnum, ENUMLinieArt.ENUM_LINIE_ART_STRICH_DREIPUNKTLINIE);
		addEEnumLiteral(enumLinieArtEEnum, ENUMLinieArt.ENUM_LINIE_ART_STRICH_PUNKTLINIE);
		addEEnumLiteral(enumLinieArtEEnum, ENUMLinieArt.ENUM_LINIE_ART_STRICH_STRICHLINIE);
		addEEnumLiteral(enumLinieArtEEnum, ENUMLinieArt.ENUM_LINIE_ART_STRICH_ZWEIPUNKTLINIE);
		addEEnumLiteral(enumLinieArtEEnum, ENUMLinieArt.ENUM_LINIE_ART_STRICH_ZWEISTRICHLINIE);
		addEEnumLiteral(enumLinieArtEEnum, ENUMLinieArt.ENUM_LINIE_ART_STRICHLINIE);
		addEEnumLiteral(enumLinieArtEEnum, ENUMLinieArt.ENUM_LINIE_ART_STRICHLINIE_LANG);
		addEEnumLiteral(enumLinieArtEEnum, ENUMLinieArt.ENUM_LINIE_ART_VOLLLINIE);
		addEEnumLiteral(enumLinieArtEEnum, ENUMLinieArt.ENUM_LINIE_ART_ZWEISTRICH_DREIPUNKTLINIE);
		addEEnumLiteral(enumLinieArtEEnum, ENUMLinieArt.ENUM_LINIE_ART_ZWEISTRICH_PUNKTLINIE);
		addEEnumLiteral(enumLinieArtEEnum, ENUMLinieArt.ENUM_LINIE_ART_ZWEISTRICH_ZWEIPUNKTLINIE);

		initEEnum(enumLinieSubartEEnum, ENUMLinieSubart.class, "ENUMLinieSubart");
		addEEnumLiteral(enumLinieSubartEEnum, ENUMLinieSubart.ENUM_LINIE_SUBART_BREIT);
		addEEnumLiteral(enumLinieSubartEEnum, ENUMLinieSubart.ENUM_LINIE_SUBART_EXTRABREIT);
		addEEnumLiteral(enumLinieSubartEEnum, ENUMLinieSubart.ENUM_LINIE_SUBART_SCHMAL);

		// Initialize data types
		initEDataType(bez_Lageplan_Blattschnitt_TypeEDataType, BigInteger.class, "Bez_Lageplan_Blattschnitt_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bezeichnung_Lageplan_TypeEDataType, String.class, "Bezeichnung_Lageplan_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(darstellung_GEO_Punkt_TypeEDataType, String.class, "Darstellung_GEO_Punkt_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(darstellung_Polygonzug_TypeEDataType, String.class, "Darstellung_Polygonzug_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(darstellung_Richtungswinkel_TypeEDataType, BigDecimal.class, "Darstellung_Richtungswinkel_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumFuellungObjectEDataType, ENUMFuellung.class, "ENUMFuellungObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumLageplanArtObjectEDataType, ENUMLageplanArt.class, "ENUMLageplanArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumLinieArtObjectEDataType, ENUMLinieArt.class, "ENUMLinieArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumLinieSubartObjectEDataType, ENUMLinieSubart.class, "ENUMLinieSubartObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(linie_Farbwert_TypeEDataType, String.class, "Linie_Farbwert_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(polygonzug_Ausrichtung_TypeEDataType, String.class, "Polygonzug_Ausrichtung_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(polygonzug_Blattschnitt_TypeEDataType, String.class, "Polygonzug_Blattschnitt_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(referenz_LST_Zustand_TypeEDataType, String.class, "Referenz_LST_Zustand_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(referenz_Objekt_Darstellung_TypeEDataType, String.class, "Referenz_Objekt_Darstellung_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (getDocumentRoot_PlanProLayoutinfo(),
		   source,
		   new String[] {
			   "documentation", "Oberstes Objekt der Layout-XML. Bei jeder Erzeugung einer XML-Ausgabe f\u00fcr eine Planung muss eine neue GUID (Identitaet) erzeugt werden."
		   });
		addAnnotation
		  (element_PositionEClass,
		   source,
		   new String[] {
			   "documentation", "Objekt zur Angabe von Positionsinformationen f\u00fcr ein LST-Objekt bezogen auf einen Lageplan."
		   });
		addAnnotation
		  (getElement_Position_IDLageplanZustand(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf den Lageplan-Zustand, f\u00fcr den die Layoutinformation definiert wird."
		   });
		addAnnotation
		  (getElement_Position_ReferenzObjektDarstellung(),
		   source,
		   new String[] {
			   "documentation", "GUID des Fachobjekts, f\u00fcr dessen Darstellung die Layoutinformationen gegeben werden."
		   });
		addAnnotation
		  (getElement_Position_Allg_AttributeGroup_DarstellungRichtungswinkel(),
		   source,
		   new String[] {
			   "documentation", "Richtungswinkel f\u00fcr die Darstellung in [gon]. Es gilt nachfolgende Zuordnung der Richtung: Nord = 0,0 gon Ost = 100,0 gon S\u00fcd = 200,0 gon West = 300,0 gon. Originale negative Werte werden durch Addition von 400.0 gon normalisiert."
		   });
		addAnnotation
		  (getElement_Position_Allg_AttributeGroup_DarstellungGEOPunkt(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf einen GEO_Punkt zur Angabe der Position, an der das Symbol f\u00fcr das Fachobjekt im referenzierten Lageplan dargestellt werden soll."
		   });
		addAnnotation
		  (getElement_Position_Allg_AttributeGroup_DarstellungPolygonzug(),
		   source,
		   new String[] {
			   "documentation", "Polygonzug zur Darstellung des Fachobjekts unter Nutzung des GML-Standards. Die Information wird nur gegeben, wenn kein Standard-Symbol zur Anwendung kommt und sich die Darstellung nicht einfach algorithmisch herleiten l\u00e4sst (z. B. Grenzlinie NB_Zone)."
		   });
		addAnnotation
		  (element_StilEClass,
		   source,
		   new String[] {
			   "documentation", "Objekt zur Angabe von Darstellungsvorgaben (z. B. Linienart) f\u00fcr ein LST-Objekt bezogen auf einen Lageplan."
		   });
		addAnnotation
		  (getElement_Stil_IDLageplanZustand(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf den Lageplan-Zustand, f\u00fcr den die Layoutinformation definiert wird."
		   });
		addAnnotation
		  (getElement_Stil_ReferenzObjektDarstellung(),
		   source,
		   new String[] {
			   "documentation", "GUID des Fachobjekts, f\u00fcr dessen Darstellung die Layoutinformationen gegeben werden."
		   });
		addAnnotation
		  (getElement_Stil_Allg_AttributeGroup_Fuellung(),
		   source,
		   new String[] {
			   "documentation", "F\u00fcllung der mittels Darstellung_Polygonzug beschriebenen Fl\u00e4che. Ist keine F\u00fcllung vorgesehen, entf\u00e4llt das Attribut."
		   });
		addAnnotation
		  (getElement_Stil_Allg_AttributeGroup_LinieArt(),
		   source,
		   new String[] {
			   "documentation", "Art bzw. Ausf\u00fchrungform der Linie gem\u00e4\u00df DIN EN ISO 128-2."
		   });
		addAnnotation
		  (getElement_Stil_Allg_AttributeGroup_LinieFarbwert(),
		   source,
		   new String[] {
			   "documentation", "RGB-Kodierung (hexadezimal) f\u00fcr den Farbton, in dem die Linie dargestellt werden soll."
		   });
		addAnnotation
		  (getElement_Stil_Allg_AttributeGroup_LinieSubart(),
		   source,
		   new String[] {
			   "documentation", "Subart bzw. Breite der Linie gem\u00e4\u00df DIN EN ISO 128-2."
		   });
		addAnnotation
		  (lageplanEClass,
		   source,
		   new String[] {
			   "documentation", "Plan, der ma\u00dfst\u00e4blich oder unma\u00dfst\u00e4blich die Lage von LST-Objekten zeigt. Beispiel: Sicherungstechnischer Lageplan. Bei Planungen wird f\u00fcr Start- und Zielzustand je eine Instanz von Lageplan erzeugt. Zu einem Lageplan ist mindestens ein Blattschnitt zu definieren."
		   });
		addAnnotation
		  (getLageplan_IDLageplanBlattschnitt(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf den zum Lageplan geh\u00f6renden Blattschnitt."
		   });
		addAnnotation
		  (getLageplan_LageplanArt(),
		   source,
		   new String[] {
			   "documentation", "Art des Ausgabeformats (Plan), dem die Layoutinformationen zugeordnet werden. Beispiel: Sicherungstechnischer Lageplan."
		   });
		addAnnotation
		  (getLageplan_Bezeichnung_AttributeGroup_BezeichnungLageplan(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnung des Lageplans, sofern eine Differenzierung \u00fcber Stellbereiche nicht m\u00f6glich bzw. ausreichend ist."
		   });
		addAnnotation
		  (lageplan_BlattschnittEClass,
		   source,
		   new String[] {
			   "documentation", "Teil des Lageplans, der auf einem Blatt dargestellt wird."
		   });
		addAnnotation
		  (getLageplan_Blattschnitt_PolygonzugAusrichtung(),
		   source,
		   new String[] {
			   "documentation", "Polygonzug zur Ausrichtung des Blattschnitts unter Nutzung des GML-Standards. Es sind nur zwei St\u00fctzpunkte anzugeben. Die damit beschriebene Linie dient der Ausrichtung des Blattschnitts an der waagerechten Blattkante. Die Reihenfolge der St\u00fctzpunkte bestimmt die Richtung der Darstellung."
		   });
		addAnnotation
		  (getLageplan_Blattschnitt_PolygonzugBlattschnitt(),
		   source,
		   new String[] {
			   "documentation", "Polygonzug zur Beschreibung des Blattschnitts unter Nutzung des GML-Standards."
		   });
		addAnnotation
		  (getLageplan_Blattschnitt_Bezeichnung_AttributeGroup_BezLageplanBlattschnitt(),
		   source,
		   new String[] {
			   "documentation", "Numerierung des Blattschnitts."
		   });
		addAnnotation
		  (lageplan_ZustandEClass,
		   source,
		   new String[] {
			   "documentation", "Objekt zur Abbildung der zustandsbezogenen Layoutinformationen zu einem Lageplan."
		   });
		addAnnotation
		  (getLageplan_Zustand_IDLageplan(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf den Lageplan, zu dem der Lageplan-Zustand definiert wird."
		   });
		addAnnotation
		  (getLageplan_Zustand_ReferenzLSTZustand(),
		   source,
		   new String[] {
			   "documentation", "GUID des LST-Zustand, der f\u00fcr die Erstellung des Lageplans ausgewertet wird. Werden LST-Zust\u00e4nde einer Planung referenziert, m\u00fcssen Sie einheitlich entweder den Start- oder den Zielzustand beschreiben. Eine Mischung von Start- und Zielzust\u00e4nden ist nicht zul\u00e4ssig."
		   });
		addAnnotation
		  (planPro_LayoutinfoEClass,
		   source,
		   new String[] {
			   "documentation", "Oberstes Objekt der Layout-XML. Bei jeder Erzeugung einer XML-Ausgabe f\u00fcr eine Planung muss eine neue GUID (Identitaet) erzeugt werden."
		   });
		addAnnotation
		  (getPlanPro_Layoutinfo_ElementPosition(),
		   source,
		   new String[] {
			   "documentation", "Objekt zur Angabe von Positionsinformationen f\u00fcr ein LST-Objekt bezogen auf einen Lageplan."
		   });
		addAnnotation
		  (getPlanPro_Layoutinfo_ElementStil(),
		   source,
		   new String[] {
			   "documentation", "Objekt zur Angabe von Darstellungsvorgaben (z. B. Linienart) f\u00fcr ein LST-Objekt bezogen auf einen Lageplan."
		   });
		addAnnotation
		  (getPlanPro_Layoutinfo_Lageplan(),
		   source,
		   new String[] {
			   "documentation", "Plan, der ma\u00dfst\u00e4blich oder unma\u00dfst\u00e4blich die Lage von LST-Objekten zeigt. Beispiel: Sicherungstechnischer Lageplan. Bei Planungen wird f\u00fcr Start- und Zielzustand je eine Instanz von Lageplan erzeugt. Zu einem Lageplan ist mindestens ein Blattschnitt zu definieren."
		   });
		addAnnotation
		  (getPlanPro_Layoutinfo_LageplanBlattschnitt(),
		   source,
		   new String[] {
			   "documentation", "Teil des Lageplans, der auf einem Blatt dargestellt wird."
		   });
		addAnnotation
		  (getPlanPro_Layoutinfo_LageplanZustand(),
		   source,
		   new String[] {
			   "documentation", "Objekt zur Abbildung der zustandsbezogenen Layoutinformationen zu einem Lageplan."
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
		  (bez_Lageplan_Blattschnitt_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBez_Lageplan_Blattschnitt",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer"
		   });
		addAnnotation
		  (bez_Lageplan_Blattschnitt_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBez_Lageplan_Blattschnitt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBez_Lageplan_Blattschnitt_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bezeichnung_Lageplan_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBezeichnung_Lageplan",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText"
		   });
		addAnnotation
		  (bezeichnung_Lageplan_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBezeichnung_Lageplan",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBezeichnung_Lageplan_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (darstellung_GEO_Punkt_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TDarstellung_GEO_Punkt",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#string"
		   });
		addAnnotation
		  (darstellung_GEO_Punkt_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCDarstellung_GEO_Punkt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDarstellung_GEO_Punkt_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (darstellung_Polygonzug_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TDarstellung_Polygonzug",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TFreiText"
		   });
		addAnnotation
		  (darstellung_Polygonzug_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCDarstellung_Polygonzug",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDarstellung_Polygonzug_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (darstellung_Richtungswinkel_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TDarstellung_Richtungswinkel",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal"
		   });
		addAnnotation
		  (darstellung_Richtungswinkel_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCDarstellung_Richtungswinkel",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDarstellung_Richtungswinkel_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (documentRootEClass,
		   source,
		   new String[] {
			   "name", "",
			   "kind", "mixed"
		   });
		addAnnotation
		  (getDocumentRoot_Mixed(),
		   source,
		   new String[] {
			   "kind", "elementWildcard",
			   "name", ":mixed"
		   });
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xmlns:prefix"
		   });
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(),
		   source,
		   new String[] {
			   "kind", "attribute",
			   "name", "xsi:schemaLocation"
		   });
		addAnnotation
		  (getDocumentRoot_PlanProLayoutinfo(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PlanPro_Layoutinfo",
			   "namespace", "##targetNamespace"
		   });
		addAnnotation
		  (element_PositionEClass,
		   source,
		   new String[] {
			   "name", "CElement_Position",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getElement_Position_ElementPositionAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Element_Position_Allg"
		   });
		addAnnotation
		  (getElement_Position_IDLageplanZustand(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Lageplan_Zustand"
		   });
		addAnnotation
		  (getElement_Position_ReferenzObjektDarstellung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Referenz_Objekt_Darstellung"
		   });
		addAnnotation
		  (element_Position_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CElement_Position_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getElement_Position_Allg_AttributeGroup_DarstellungRichtungswinkel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Darstellung_Richtungswinkel"
		   });
		addAnnotation
		  (getElement_Position_Allg_AttributeGroup_DarstellungGEOPunkt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Darstellung_GEO_Punkt"
		   });
		addAnnotation
		  (getElement_Position_Allg_AttributeGroup_DarstellungPolygonzug(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Darstellung_Polygonzug"
		   });
		addAnnotation
		  (element_StilEClass,
		   source,
		   new String[] {
			   "name", "CElement_Stil",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getElement_Stil_ElementStilAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Element_Stil_Allg"
		   });
		addAnnotation
		  (getElement_Stil_IDLageplanZustand(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Lageplan_Zustand"
		   });
		addAnnotation
		  (getElement_Stil_ReferenzObjektDarstellung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Referenz_Objekt_Darstellung"
		   });
		addAnnotation
		  (element_Stil_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CElement_Stil_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getElement_Stil_Allg_AttributeGroup_Fuellung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Fuellung"
		   });
		addAnnotation
		  (getElement_Stil_Allg_AttributeGroup_LinieArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Linie_Art"
		   });
		addAnnotation
		  (getElement_Stil_Allg_AttributeGroup_LinieFarbwert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Linie_Farbwert"
		   });
		addAnnotation
		  (getElement_Stil_Allg_AttributeGroup_LinieSubart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Linie_Subart"
		   });
		addAnnotation
		  (enumFuellungEEnum,
		   source,
		   new String[] {
			   "name", "ENUMFuellung"
		   });
		addAnnotation
		  (enumFuellungObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMFuellung:Object",
			   "baseType", "ENUMFuellung"
		   });
		addAnnotation
		  (enumLageplanArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMLageplan_Art"
		   });
		addAnnotation
		  (enumLageplanArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMLageplan_Art:Object",
			   "baseType", "ENUMLageplan_Art"
		   });
		addAnnotation
		  (enumLinieArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMLinie_Art"
		   });
		addAnnotation
		  (enumLinieArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMLinie_Art:Object",
			   "baseType", "ENUMLinie_Art"
		   });
		addAnnotation
		  (enumLinieSubartEEnum,
		   source,
		   new String[] {
			   "name", "ENUMLinie_Subart"
		   });
		addAnnotation
		  (enumLinieSubartObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMLinie_Subart:Object",
			   "baseType", "ENUMLinie_Subart"
		   });
		addAnnotation
		  (fuellung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFuellung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFuellung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (lageplanEClass,
		   source,
		   new String[] {
			   "name", "CLageplan",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLageplan_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getLageplan_IDLageplanBlattschnitt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Lageplan_Blattschnitt"
		   });
		addAnnotation
		  (getLageplan_LageplanArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Lageplan_Art"
		   });
		addAnnotation
		  (lageplan_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCLageplan_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLageplan_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (lageplan_Bezeichnung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CLageplan_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLageplan_Bezeichnung_AttributeGroup_BezeichnungLageplan(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung_Lageplan"
		   });
		addAnnotation
		  (lageplan_BlattschnittEClass,
		   source,
		   new String[] {
			   "name", "CLageplan_Blattschnitt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLageplan_Blattschnitt_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getLageplan_Blattschnitt_PolygonzugAusrichtung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Polygonzug_Ausrichtung"
		   });
		addAnnotation
		  (getLageplan_Blattschnitt_PolygonzugBlattschnitt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Polygonzug_Blattschnitt"
		   });
		addAnnotation
		  (lageplan_Blattschnitt_Bezeichnung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CLageplan_Blattschnitt_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLageplan_Blattschnitt_Bezeichnung_AttributeGroup_BezLageplanBlattschnitt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bez_Lageplan_Blattschnitt"
		   });
		addAnnotation
		  (lageplan_ZustandEClass,
		   source,
		   new String[] {
			   "name", "CLageplan_Zustand",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLageplan_Zustand_IDLageplan(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Lageplan"
		   });
		addAnnotation
		  (getLageplan_Zustand_ReferenzLSTZustand(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Referenz_LST_Zustand"
		   });
		addAnnotation
		  (linie_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCLinie_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLinie_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (linie_Farbwert_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TLinie_Farbwert",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TText",
			   "pattern", "[a-fA-F0-9]{6}"
		   });
		addAnnotation
		  (linie_Farbwert_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCLinie_Farbwert",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLinie_Farbwert_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (linie_Subart_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCLinie_Subart",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLinie_Subart_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (planPro_LayoutinfoEClass,
		   source,
		   new String[] {
			   "name", "CPlanPro_Layoutinfo",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPlanPro_Layoutinfo_ElementPosition(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Element_Position"
		   });
		addAnnotation
		  (getPlanPro_Layoutinfo_ElementStil(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Element_Stil"
		   });
		addAnnotation
		  (getPlanPro_Layoutinfo_Lageplan(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Lageplan"
		   });
		addAnnotation
		  (getPlanPro_Layoutinfo_LageplanBlattschnitt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Lageplan_Blattschnitt"
		   });
		addAnnotation
		  (getPlanPro_Layoutinfo_LageplanZustand(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Lageplan_Zustand"
		   });
		addAnnotation
		  (polygonzug_Ausrichtung_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TPolygonzug_Ausrichtung",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TFreiText"
		   });
		addAnnotation
		  (polygonzug_Ausrichtung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCPolygonzug_Ausrichtung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPolygonzug_Ausrichtung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (polygonzug_Blattschnitt_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TPolygonzug_Blattschnitt",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TFreiText"
		   });
		addAnnotation
		  (polygonzug_Blattschnitt_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCPolygonzug_Blattschnitt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPolygonzug_Blattschnitt_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (referenz_LST_Zustand_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TReferenz_LST_Zustand",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TGUID"
		   });
		addAnnotation
		  (referenz_LST_Zustand_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCReferenz_LST_Zustand",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReferenz_LST_Zustand_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (referenz_Objekt_Darstellung_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TReferenz_Objekt_Darstellung",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TGUID"
		   });
		addAnnotation
		  (referenz_Objekt_Darstellung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCReferenz_Objekt_Darstellung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getReferenz_Objekt_Darstellung_TypeClass_Wert(),
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
		  (element_PositionEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getElement_Position_Allg_AttributeGroup_DarstellungGEOPunkt(),
		   source,
		   new String[] {
			   "appinfo", "\n                       \n  <ppi:WorkflowInformation>\n                            \n    <ppi:ProposedValue>GEO_Punkt</ppi:ProposedValue>\n                         \n  </ppi:WorkflowInformation>\n                    \n"
		   });
		addAnnotation
		  (element_StilEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getElement_Stil_Allg_AttributeGroup_LinieFarbwert(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[6], hexadezimal</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (lageplanEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (lageplan_BlattschnittEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (lageplan_ZustandEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (planPro_LayoutinfoEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getPlanPro_Layoutinfo_ElementPosition(),
		   source,
		   new String[] {
			   "appinfo", "\n                          \n  <ppi:WorkflowInformation>\n                               \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                            \n  </ppi:WorkflowInformation>\n                       \n"
		   });
		addAnnotation
		  (getPlanPro_Layoutinfo_ElementStil(),
		   source,
		   new String[] {
			   "appinfo", "\n                          \n  <ppi:WorkflowInformation>\n                               \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                            \n  </ppi:WorkflowInformation>\n                       \n"
		   });
		addAnnotation
		  (getPlanPro_Layoutinfo_Lageplan(),
		   source,
		   new String[] {
			   "appinfo", "\n                          \n  <ppi:WorkflowInformation>\n                               \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                            \n  </ppi:WorkflowInformation>\n                       \n"
		   });
		addAnnotation
		  (getPlanPro_Layoutinfo_LageplanBlattschnitt(),
		   source,
		   new String[] {
			   "appinfo", "\n                          \n  <ppi:WorkflowInformation>\n                               \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                            \n  </ppi:WorkflowInformation>\n                       \n"
		   });
	}

} //LayoutinformationenPackageImpl
