/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.PZB.impl;

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

import org.eclipse.set.model.planpro.PZB.ENUMGUEAnordnung;
import org.eclipse.set.model.planpro.PZB.ENUMGUEBauart;
import org.eclipse.set.model.planpro.PZB.ENUMGUEEnergieversorgung;
import org.eclipse.set.model.planpro.PZB.ENUMMessfehler;
import org.eclipse.set.model.planpro.PZB.ENUMPZBArt;
import org.eclipse.set.model.planpro.PZB.ENUMWirksamkeit;
import org.eclipse.set.model.planpro.PZB.ENUMWirksamkeitFstr;
import org.eclipse.set.model.planpro.PZB.GUE_Abstand_Abweichend_TypeClass;
import org.eclipse.set.model.planpro.PZB.GUE_Anordnung_TypeClass;
import org.eclipse.set.model.planpro.PZB.GUE_Bauart_TypeClass;
import org.eclipse.set.model.planpro.PZB.GUE_Energieversorgung_TypeClass;
import org.eclipse.set.model.planpro.PZB.GUE_Messstrecke_TypeClass;
import org.eclipse.set.model.planpro.PZB.INA_Gefahrstelle_AttributeGroup;
import org.eclipse.set.model.planpro.PZB.Messfehler_TypeClass;
import org.eclipse.set.model.planpro.PZB.PZBFactory;
import org.eclipse.set.model.planpro.PZB.PZBPackage;
import org.eclipse.set.model.planpro.PZB.PZB_Abstand_GM_TypeClass;
import org.eclipse.set.model.planpro.PZB.PZB_Art_TypeClass;
import org.eclipse.set.model.planpro.PZB.PZB_Element;
import org.eclipse.set.model.planpro.PZB.PZB_Element_GM_AttributeGroup;
import org.eclipse.set.model.planpro.PZB.PZB_Element_GUE_AttributeGroup;
import org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung;
import org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_BP_AttributeGroup;
import org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_Fstr_AttributeGroup;
import org.eclipse.set.model.planpro.PZB.PZB_Element_Zuordnung_INA_AttributeGroup;
import org.eclipse.set.model.planpro.PZB.PZB_INA_TypeClass;
import org.eclipse.set.model.planpro.PZB.PZB_Zuordnung_Signal;
import org.eclipse.set.model.planpro.PZB.Prioritaet_Gefahrstelle_TypeClass;
import org.eclipse.set.model.planpro.PZB.Pruefgeschwindigkeit_TypeClass;
import org.eclipse.set.model.planpro.PZB.Pruefzeit_TypeClass;
import org.eclipse.set.model.planpro.PZB.Wirksamkeit_Fstr_TypeClass;
import org.eclipse.set.model.planpro.PZB.Wirksamkeit_TypeClass;

import org.eclipse.set.model.planpro.PZB.util.PZBValidator;

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
public class PZBPackageImpl extends EPackageImpl implements PZBPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guE_Abstand_Abweichend_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guE_Anordnung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guE_Bauart_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guE_Energieversorgung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guE_Messstrecke_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inA_Gefahrstelle_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messfehler_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prioritaet_Gefahrstelle_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pruefgeschwindigkeit_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pruefzeit_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pzB_Abstand_GM_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pzB_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pzB_ElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pzB_Element_GM_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pzB_Element_GUE_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pzB_Element_ZuordnungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pzB_Element_Zuordnung_BP_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pzB_Element_Zuordnung_Fstr_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pzB_Element_Zuordnung_INA_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pzB_INA_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pzB_Zuordnung_SignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wirksamkeit_Fstr_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass wirksamkeit_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumgueAnordnungEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumgueBauartEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumgueEnergieversorgungEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumMessfehlerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumpzbArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumWirksamkeitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumWirksamkeitFstrEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumgueAnordnungObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumgueBauartObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumgueEnergieversorgungObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumMessfehlerObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumpzbArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumWirksamkeitFstrObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumWirksamkeitObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType guE_Abstand_Abweichend_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType guE_Messstrecke_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType prioritaet_Gefahrstelle_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pruefgeschwindigkeit_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pruefzeit_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pzB_Abstand_GM_TypeEDataType = null;

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
	 * @see org.eclipse.set.model.planpro.PZB.PZBPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PZBPackageImpl() {
		super(eNS_URI, PZBFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link PZBPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PZBPackage init() {
		if (isInited) return (PZBPackage)EPackage.Registry.INSTANCE.getEPackage(PZBPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredPZBPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		PZBPackageImpl thePZBPackage = registeredPZBPackage instanceof PZBPackageImpl ? (PZBPackageImpl)registeredPZBPackage : new PZBPackageImpl();

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
		thePZBPackage.createPackageContents();
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
		theRegelzeichnungPackage.createPackageContents();
		theSchluesselabhaengigkeitenPackage.createPackageContents();
		theSignalePackage.createPackageContents();
		theSignalbegriffe_StrukturPackage.createPackageContents();
		theZuglenkungPackage.createPackageContents();
		theZugnummernmeldeanlagePackage.createPackageContents();
		theLayoutinformationenPackage.createPackageContents();

		// Initialize created meta-data
		thePZBPackage.initializePackageContents();
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
			(thePZBPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return PZBValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		thePZBPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PZBPackage.eNS_URI, thePZBPackage);
		return thePZBPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGUE_Abstand_Abweichend_TypeClass() {
		return guE_Abstand_Abweichend_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGUE_Abstand_Abweichend_TypeClass_Wert() {
		return (EAttribute)guE_Abstand_Abweichend_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGUE_Anordnung_TypeClass() {
		return guE_Anordnung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGUE_Anordnung_TypeClass_Wert() {
		return (EAttribute)guE_Anordnung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGUE_Bauart_TypeClass() {
		return guE_Bauart_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGUE_Bauart_TypeClass_Wert() {
		return (EAttribute)guE_Bauart_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGUE_Energieversorgung_TypeClass() {
		return guE_Energieversorgung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGUE_Energieversorgung_TypeClass_Wert() {
		return (EAttribute)guE_Energieversorgung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGUE_Messstrecke_TypeClass() {
		return guE_Messstrecke_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGUE_Messstrecke_TypeClass_Wert() {
		return (EAttribute)guE_Messstrecke_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getINA_Gefahrstelle_AttributeGroup() {
		return inA_Gefahrstelle_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getINA_Gefahrstelle_AttributeGroup_IDMarkanterPunkt() {
		return (EReference)inA_Gefahrstelle_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getINA_Gefahrstelle_AttributeGroup_PrioritaetGefahrstelle() {
		return (EReference)inA_Gefahrstelle_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMessfehler_TypeClass() {
		return messfehler_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMessfehler_TypeClass_Wert() {
		return (EAttribute)messfehler_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrioritaet_Gefahrstelle_TypeClass() {
		return prioritaet_Gefahrstelle_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrioritaet_Gefahrstelle_TypeClass_Wert() {
		return (EAttribute)prioritaet_Gefahrstelle_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPruefgeschwindigkeit_TypeClass() {
		return pruefgeschwindigkeit_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPruefgeschwindigkeit_TypeClass_Wert() {
		return (EAttribute)pruefgeschwindigkeit_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPruefzeit_TypeClass() {
		return pruefzeit_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPruefzeit_TypeClass_Wert() {
		return (EAttribute)pruefzeit_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPZB_Abstand_GM_TypeClass() {
		return pzB_Abstand_GM_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPZB_Abstand_GM_TypeClass_Wert() {
		return (EAttribute)pzB_Abstand_GM_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPZB_Art_TypeClass() {
		return pzB_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPZB_Art_TypeClass_Wert() {
		return (EAttribute)pzB_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPZB_Element() {
		return pzB_ElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPZB_Element_IDPZBElementZuordnung() {
		return (EReference)pzB_ElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPZB_Element_PZBArt() {
		return (EReference)pzB_ElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPZB_Element_IDStellelement() {
		return (EReference)pzB_ElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPZB_Element_IDUnterbringung() {
		return (EReference)pzB_ElementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPZB_Element_PZBElementGM() {
		return (EReference)pzB_ElementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPZB_Element_PZBElementGUE() {
		return (EReference)pzB_ElementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPZB_Element_GM_AttributeGroup() {
		return pzB_Element_GM_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPZB_Element_GM_AttributeGroup_PZBAbstandGM() {
		return (EReference)pzB_Element_GM_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPZB_Element_GM_AttributeGroup_PZBINA() {
		return (EReference)pzB_Element_GM_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPZB_Element_GUE_AttributeGroup() {
		return pzB_Element_GUE_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPZB_Element_GUE_AttributeGroup_GUEAbstandAbweichend() {
		return (EReference)pzB_Element_GUE_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPZB_Element_GUE_AttributeGroup_GUEAnordnung() {
		return (EReference)pzB_Element_GUE_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPZB_Element_GUE_AttributeGroup_GUEBauart() {
		return (EReference)pzB_Element_GUE_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPZB_Element_GUE_AttributeGroup_GUEEnergieversorgung() {
		return (EReference)pzB_Element_GUE_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPZB_Element_GUE_AttributeGroup_GUEMessstrecke() {
		return (EReference)pzB_Element_GUE_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPZB_Element_GUE_AttributeGroup_IDPZBElementMitnutzung() {
		return (EReference)pzB_Element_GUE_AttributeGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPZB_Element_GUE_AttributeGroup_Messfehler() {
		return (EReference)pzB_Element_GUE_AttributeGroupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPZB_Element_GUE_AttributeGroup_Pruefgeschwindigkeit() {
		return (EReference)pzB_Element_GUE_AttributeGroupEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPZB_Element_GUE_AttributeGroup_Pruefzeit() {
		return (EReference)pzB_Element_GUE_AttributeGroupEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPZB_Element_Zuordnung() {
		return pzB_Element_ZuordnungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPZB_Element_Zuordnung_PZBElementZuordnungBP() {
		return (EReference)pzB_Element_ZuordnungEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPZB_Element_Zuordnung_PZBElementZuordnungFstr() {
		return (EReference)pzB_Element_ZuordnungEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPZB_Element_Zuordnung_BP_AttributeGroup() {
		return pzB_Element_Zuordnung_BP_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPZB_Element_Zuordnung_BP_AttributeGroup_IDPZBElementBezugspunkt() {
		return (EReference)pzB_Element_Zuordnung_BP_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPZB_Element_Zuordnung_BP_AttributeGroup_INAGefahrstelle() {
		return (EReference)pzB_Element_Zuordnung_BP_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPZB_Element_Zuordnung_BP_AttributeGroup_PZBElementZuordnungINA() {
		return (EReference)pzB_Element_Zuordnung_BP_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPZB_Element_Zuordnung_BP_AttributeGroup_Wirksamkeit() {
		return (EReference)pzB_Element_Zuordnung_BP_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPZB_Element_Zuordnung_Fstr_AttributeGroup() {
		return pzB_Element_Zuordnung_Fstr_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPZB_Element_Zuordnung_Fstr_AttributeGroup_IDFstrZugRangier() {
		return (EReference)pzB_Element_Zuordnung_Fstr_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPZB_Element_Zuordnung_Fstr_AttributeGroup_WirksamkeitFstr() {
		return (EReference)pzB_Element_Zuordnung_Fstr_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPZB_Element_Zuordnung_INA_AttributeGroup() {
		return pzB_Element_Zuordnung_INA_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPZB_Element_Zuordnung_INA_AttributeGroup_IDAnhangINA() {
		return (EReference)pzB_Element_Zuordnung_INA_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPZB_Element_Zuordnung_INA_AttributeGroup_IDBahnsteigKante() {
		return (EReference)pzB_Element_Zuordnung_INA_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPZB_INA_TypeClass() {
		return pzB_INA_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPZB_INA_TypeClass_Wert() {
		return (EAttribute)pzB_INA_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPZB_Zuordnung_Signal() {
		return pzB_Zuordnung_SignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPZB_Zuordnung_Signal_IDPZBElementZuordnung() {
		return (EReference)pzB_Zuordnung_SignalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPZB_Zuordnung_Signal_IDSignal() {
		return (EReference)pzB_Zuordnung_SignalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWirksamkeit_Fstr_TypeClass() {
		return wirksamkeit_Fstr_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWirksamkeit_Fstr_TypeClass_Wert() {
		return (EAttribute)wirksamkeit_Fstr_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWirksamkeit_TypeClass() {
		return wirksamkeit_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWirksamkeit_TypeClass_Wert() {
		return (EAttribute)wirksamkeit_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMGUEAnordnung() {
		return enumgueAnordnungEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMGUEBauart() {
		return enumgueBauartEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMGUEEnergieversorgung() {
		return enumgueEnergieversorgungEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMMessfehler() {
		return enumMessfehlerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMPZBArt() {
		return enumpzbArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMWirksamkeit() {
		return enumWirksamkeitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMWirksamkeitFstr() {
		return enumWirksamkeitFstrEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMGUEAnordnungObject() {
		return enumgueAnordnungObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMGUEBauartObject() {
		return enumgueBauartObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMGUEEnergieversorgungObject() {
		return enumgueEnergieversorgungObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMMessfehlerObject() {
		return enumMessfehlerObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMPZBArtObject() {
		return enumpzbArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMWirksamkeitFstrObject() {
		return enumWirksamkeitFstrObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMWirksamkeitObject() {
		return enumWirksamkeitObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGUE_Abstand_Abweichend_Type() {
		return guE_Abstand_Abweichend_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGUE_Messstrecke_Type() {
		return guE_Messstrecke_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPrioritaet_Gefahrstelle_Type() {
		return prioritaet_Gefahrstelle_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPruefgeschwindigkeit_Type() {
		return pruefgeschwindigkeit_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPruefzeit_Type() {
		return pruefzeit_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPZB_Abstand_GM_Type() {
		return pzB_Abstand_GM_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PZBFactory getPZBFactory() {
		return (PZBFactory)getEFactoryInstance();
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
		guE_Abstand_Abweichend_TypeClassEClass = createEClass(GUE_ABSTAND_ABWEICHEND_TYPE_CLASS);
		createEAttribute(guE_Abstand_Abweichend_TypeClassEClass, GUE_ABSTAND_ABWEICHEND_TYPE_CLASS__WERT);

		guE_Anordnung_TypeClassEClass = createEClass(GUE_ANORDNUNG_TYPE_CLASS);
		createEAttribute(guE_Anordnung_TypeClassEClass, GUE_ANORDNUNG_TYPE_CLASS__WERT);

		guE_Bauart_TypeClassEClass = createEClass(GUE_BAUART_TYPE_CLASS);
		createEAttribute(guE_Bauart_TypeClassEClass, GUE_BAUART_TYPE_CLASS__WERT);

		guE_Energieversorgung_TypeClassEClass = createEClass(GUE_ENERGIEVERSORGUNG_TYPE_CLASS);
		createEAttribute(guE_Energieversorgung_TypeClassEClass, GUE_ENERGIEVERSORGUNG_TYPE_CLASS__WERT);

		guE_Messstrecke_TypeClassEClass = createEClass(GUE_MESSSTRECKE_TYPE_CLASS);
		createEAttribute(guE_Messstrecke_TypeClassEClass, GUE_MESSSTRECKE_TYPE_CLASS__WERT);

		inA_Gefahrstelle_AttributeGroupEClass = createEClass(INA_GEFAHRSTELLE_ATTRIBUTE_GROUP);
		createEReference(inA_Gefahrstelle_AttributeGroupEClass, INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__ID_MARKANTER_PUNKT);
		createEReference(inA_Gefahrstelle_AttributeGroupEClass, INA_GEFAHRSTELLE_ATTRIBUTE_GROUP__PRIORITAET_GEFAHRSTELLE);

		messfehler_TypeClassEClass = createEClass(MESSFEHLER_TYPE_CLASS);
		createEAttribute(messfehler_TypeClassEClass, MESSFEHLER_TYPE_CLASS__WERT);

		prioritaet_Gefahrstelle_TypeClassEClass = createEClass(PRIORITAET_GEFAHRSTELLE_TYPE_CLASS);
		createEAttribute(prioritaet_Gefahrstelle_TypeClassEClass, PRIORITAET_GEFAHRSTELLE_TYPE_CLASS__WERT);

		pruefgeschwindigkeit_TypeClassEClass = createEClass(PRUEFGESCHWINDIGKEIT_TYPE_CLASS);
		createEAttribute(pruefgeschwindigkeit_TypeClassEClass, PRUEFGESCHWINDIGKEIT_TYPE_CLASS__WERT);

		pruefzeit_TypeClassEClass = createEClass(PRUEFZEIT_TYPE_CLASS);
		createEAttribute(pruefzeit_TypeClassEClass, PRUEFZEIT_TYPE_CLASS__WERT);

		pzB_Abstand_GM_TypeClassEClass = createEClass(PZB_ABSTAND_GM_TYPE_CLASS);
		createEAttribute(pzB_Abstand_GM_TypeClassEClass, PZB_ABSTAND_GM_TYPE_CLASS__WERT);

		pzB_Art_TypeClassEClass = createEClass(PZB_ART_TYPE_CLASS);
		createEAttribute(pzB_Art_TypeClassEClass, PZB_ART_TYPE_CLASS__WERT);

		pzB_ElementEClass = createEClass(PZB_ELEMENT);
		createEReference(pzB_ElementEClass, PZB_ELEMENT__IDPZB_ELEMENT_ZUORDNUNG);
		createEReference(pzB_ElementEClass, PZB_ELEMENT__PZB_ART);
		createEReference(pzB_ElementEClass, PZB_ELEMENT__ID_STELLELEMENT);
		createEReference(pzB_ElementEClass, PZB_ELEMENT__ID_UNTERBRINGUNG);
		createEReference(pzB_ElementEClass, PZB_ELEMENT__PZB_ELEMENT_GM);
		createEReference(pzB_ElementEClass, PZB_ELEMENT__PZB_ELEMENT_GUE);

		pzB_Element_GM_AttributeGroupEClass = createEClass(PZB_ELEMENT_GM_ATTRIBUTE_GROUP);
		createEReference(pzB_Element_GM_AttributeGroupEClass, PZB_ELEMENT_GM_ATTRIBUTE_GROUP__PZB_ABSTAND_GM);
		createEReference(pzB_Element_GM_AttributeGroupEClass, PZB_ELEMENT_GM_ATTRIBUTE_GROUP__PZBINA);

		pzB_Element_GUE_AttributeGroupEClass = createEClass(PZB_ELEMENT_GUE_ATTRIBUTE_GROUP);
		createEReference(pzB_Element_GUE_AttributeGroupEClass, PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ABSTAND_ABWEICHEND);
		createEReference(pzB_Element_GUE_AttributeGroupEClass, PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ANORDNUNG);
		createEReference(pzB_Element_GUE_AttributeGroupEClass, PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_BAUART);
		createEReference(pzB_Element_GUE_AttributeGroupEClass, PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_ENERGIEVERSORGUNG);
		createEReference(pzB_Element_GUE_AttributeGroupEClass, PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__GUE_MESSSTRECKE);
		createEReference(pzB_Element_GUE_AttributeGroupEClass, PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__IDPZB_ELEMENT_MITNUTZUNG);
		createEReference(pzB_Element_GUE_AttributeGroupEClass, PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__MESSFEHLER);
		createEReference(pzB_Element_GUE_AttributeGroupEClass, PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__PRUEFGESCHWINDIGKEIT);
		createEReference(pzB_Element_GUE_AttributeGroupEClass, PZB_ELEMENT_GUE_ATTRIBUTE_GROUP__PRUEFZEIT);

		pzB_Element_ZuordnungEClass = createEClass(PZB_ELEMENT_ZUORDNUNG);
		createEReference(pzB_Element_ZuordnungEClass, PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_BP);
		createEReference(pzB_Element_ZuordnungEClass, PZB_ELEMENT_ZUORDNUNG__PZB_ELEMENT_ZUORDNUNG_FSTR);

		pzB_Element_Zuordnung_BP_AttributeGroupEClass = createEClass(PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP);
		createEReference(pzB_Element_Zuordnung_BP_AttributeGroupEClass, PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__IDPZB_ELEMENT_BEZUGSPUNKT);
		createEReference(pzB_Element_Zuordnung_BP_AttributeGroupEClass, PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__INA_GEFAHRSTELLE);
		createEReference(pzB_Element_Zuordnung_BP_AttributeGroupEClass, PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__PZB_ELEMENT_ZUORDNUNG_INA);
		createEReference(pzB_Element_Zuordnung_BP_AttributeGroupEClass, PZB_ELEMENT_ZUORDNUNG_BP_ATTRIBUTE_GROUP__WIRKSAMKEIT);

		pzB_Element_Zuordnung_Fstr_AttributeGroupEClass = createEClass(PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP);
		createEReference(pzB_Element_Zuordnung_Fstr_AttributeGroupEClass, PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__ID_FSTR_ZUG_RANGIER);
		createEReference(pzB_Element_Zuordnung_Fstr_AttributeGroupEClass, PZB_ELEMENT_ZUORDNUNG_FSTR_ATTRIBUTE_GROUP__WIRKSAMKEIT_FSTR);

		pzB_Element_Zuordnung_INA_AttributeGroupEClass = createEClass(PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP);
		createEReference(pzB_Element_Zuordnung_INA_AttributeGroupEClass, PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_ANHANG_INA);
		createEReference(pzB_Element_Zuordnung_INA_AttributeGroupEClass, PZB_ELEMENT_ZUORDNUNG_INA_ATTRIBUTE_GROUP__ID_BAHNSTEIG_KANTE);

		pzB_INA_TypeClassEClass = createEClass(PZB_INA_TYPE_CLASS);
		createEAttribute(pzB_INA_TypeClassEClass, PZB_INA_TYPE_CLASS__WERT);

		pzB_Zuordnung_SignalEClass = createEClass(PZB_ZUORDNUNG_SIGNAL);
		createEReference(pzB_Zuordnung_SignalEClass, PZB_ZUORDNUNG_SIGNAL__IDPZB_ELEMENT_ZUORDNUNG);
		createEReference(pzB_Zuordnung_SignalEClass, PZB_ZUORDNUNG_SIGNAL__ID_SIGNAL);

		wirksamkeit_Fstr_TypeClassEClass = createEClass(WIRKSAMKEIT_FSTR_TYPE_CLASS);
		createEAttribute(wirksamkeit_Fstr_TypeClassEClass, WIRKSAMKEIT_FSTR_TYPE_CLASS__WERT);

		wirksamkeit_TypeClassEClass = createEClass(WIRKSAMKEIT_TYPE_CLASS);
		createEAttribute(wirksamkeit_TypeClassEClass, WIRKSAMKEIT_TYPE_CLASS__WERT);

		// Create enums
		enumgueAnordnungEEnum = createEEnum(ENUMGUE_ANORDNUNG);
		enumgueBauartEEnum = createEEnum(ENUMGUE_BAUART);
		enumgueEnergieversorgungEEnum = createEEnum(ENUMGUE_ENERGIEVERSORGUNG);
		enumMessfehlerEEnum = createEEnum(ENUM_MESSFEHLER);
		enumpzbArtEEnum = createEEnum(ENUMPZB_ART);
		enumWirksamkeitEEnum = createEEnum(ENUM_WIRKSAMKEIT);
		enumWirksamkeitFstrEEnum = createEEnum(ENUM_WIRKSAMKEIT_FSTR);

		// Create data types
		enumgueAnordnungObjectEDataType = createEDataType(ENUMGUE_ANORDNUNG_OBJECT);
		enumgueBauartObjectEDataType = createEDataType(ENUMGUE_BAUART_OBJECT);
		enumgueEnergieversorgungObjectEDataType = createEDataType(ENUMGUE_ENERGIEVERSORGUNG_OBJECT);
		enumMessfehlerObjectEDataType = createEDataType(ENUM_MESSFEHLER_OBJECT);
		enumpzbArtObjectEDataType = createEDataType(ENUMPZB_ART_OBJECT);
		enumWirksamkeitFstrObjectEDataType = createEDataType(ENUM_WIRKSAMKEIT_FSTR_OBJECT);
		enumWirksamkeitObjectEDataType = createEDataType(ENUM_WIRKSAMKEIT_OBJECT);
		guE_Abstand_Abweichend_TypeEDataType = createEDataType(GUE_ABSTAND_ABWEICHEND_TYPE);
		guE_Messstrecke_TypeEDataType = createEDataType(GUE_MESSSTRECKE_TYPE);
		prioritaet_Gefahrstelle_TypeEDataType = createEDataType(PRIORITAET_GEFAHRSTELLE_TYPE);
		pruefgeschwindigkeit_TypeEDataType = createEDataType(PRUEFGESCHWINDIGKEIT_TYPE);
		pruefzeit_TypeEDataType = createEDataType(PRUEFZEIT_TYPE);
		pzB_Abstand_GM_TypeEDataType = createEDataType(PZB_ABSTAND_GM_TYPE);
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
		VerweisePackage theVerweisePackage = (VerweisePackage)EPackage.Registry.INSTANCE.getEPackage(VerweisePackage.eNS_URI);
		BasisobjektePackage theBasisobjektePackage = (BasisobjektePackage)EPackage.Registry.INSTANCE.getEPackage(BasisobjektePackage.eNS_URI);
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		guE_Abstand_Abweichend_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		guE_Anordnung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		guE_Bauart_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		guE_Energieversorgung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		guE_Messstrecke_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		messfehler_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		prioritaet_Gefahrstelle_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		pruefgeschwindigkeit_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		pruefzeit_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		pzB_Abstand_GM_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		pzB_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		pzB_ElementEClass.getESuperTypes().add(theBasisobjektePackage.getPunkt_Objekt());
		pzB_Element_ZuordnungEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		pzB_INA_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		pzB_Zuordnung_SignalEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		wirksamkeit_Fstr_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		wirksamkeit_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());

		// Initialize classes and features; add operations and parameters
		initEClass(guE_Abstand_Abweichend_TypeClassEClass, GUE_Abstand_Abweichend_TypeClass.class, "GUE_Abstand_Abweichend_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGUE_Abstand_Abweichend_TypeClass_Wert(), this.getGUE_Abstand_Abweichend_Type(), "wert", null, 1, 1, GUE_Abstand_Abweichend_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guE_Anordnung_TypeClassEClass, GUE_Anordnung_TypeClass.class, "GUE_Anordnung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGUE_Anordnung_TypeClass_Wert(), this.getENUMGUEAnordnungObject(), "wert", null, 1, 1, GUE_Anordnung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guE_Bauart_TypeClassEClass, GUE_Bauart_TypeClass.class, "GUE_Bauart_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGUE_Bauart_TypeClass_Wert(), this.getENUMGUEBauartObject(), "wert", null, 1, 1, GUE_Bauart_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guE_Energieversorgung_TypeClassEClass, GUE_Energieversorgung_TypeClass.class, "GUE_Energieversorgung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGUE_Energieversorgung_TypeClass_Wert(), this.getENUMGUEEnergieversorgungObject(), "wert", null, 1, 1, GUE_Energieversorgung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(guE_Messstrecke_TypeClassEClass, GUE_Messstrecke_TypeClass.class, "GUE_Messstrecke_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGUE_Messstrecke_TypeClass_Wert(), this.getGUE_Messstrecke_Type(), "wert", null, 1, 1, GUE_Messstrecke_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inA_Gefahrstelle_AttributeGroupEClass, INA_Gefahrstelle_AttributeGroup.class, "INA_Gefahrstelle_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getINA_Gefahrstelle_AttributeGroup_IDMarkanterPunkt(), theVerweisePackage.getID_Markanter_Punkt_TypeClass(), null, "iDMarkanterPunkt", null, 1, 1, INA_Gefahrstelle_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getINA_Gefahrstelle_AttributeGroup_PrioritaetGefahrstelle(), this.getPrioritaet_Gefahrstelle_TypeClass(), null, "prioritaetGefahrstelle", null, 1, 1, INA_Gefahrstelle_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messfehler_TypeClassEClass, Messfehler_TypeClass.class, "Messfehler_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessfehler_TypeClass_Wert(), this.getENUMMessfehlerObject(), "wert", null, 1, 1, Messfehler_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prioritaet_Gefahrstelle_TypeClassEClass, Prioritaet_Gefahrstelle_TypeClass.class, "Prioritaet_Gefahrstelle_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrioritaet_Gefahrstelle_TypeClass_Wert(), this.getPrioritaet_Gefahrstelle_Type(), "wert", null, 1, 1, Prioritaet_Gefahrstelle_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pruefgeschwindigkeit_TypeClassEClass, Pruefgeschwindigkeit_TypeClass.class, "Pruefgeschwindigkeit_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPruefgeschwindigkeit_TypeClass_Wert(), this.getPruefgeschwindigkeit_Type(), "wert", null, 1, 1, Pruefgeschwindigkeit_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pruefzeit_TypeClassEClass, Pruefzeit_TypeClass.class, "Pruefzeit_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPruefzeit_TypeClass_Wert(), this.getPruefzeit_Type(), "wert", null, 1, 1, Pruefzeit_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pzB_Abstand_GM_TypeClassEClass, PZB_Abstand_GM_TypeClass.class, "PZB_Abstand_GM_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPZB_Abstand_GM_TypeClass_Wert(), this.getPZB_Abstand_GM_Type(), "wert", null, 1, 1, PZB_Abstand_GM_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pzB_Art_TypeClassEClass, PZB_Art_TypeClass.class, "PZB_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPZB_Art_TypeClass_Wert(), this.getENUMPZBArtObject(), "wert", null, 1, 1, PZB_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pzB_ElementEClass, PZB_Element.class, "PZB_Element", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPZB_Element_IDPZBElementZuordnung(), theVerweisePackage.getID_PZB_Element_Zuordnung_TypeClass(), null, "iDPZBElementZuordnung", null, 1, 1, PZB_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPZB_Element_PZBArt(), this.getPZB_Art_TypeClass(), null, "pZBArt", null, 1, 1, PZB_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPZB_Element_IDStellelement(), theVerweisePackage.getID_Stellelement_TypeClass(), null, "iDStellelement", null, 0, 1, PZB_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPZB_Element_IDUnterbringung(), theVerweisePackage.getID_Unterbringung_TypeClass(), null, "iDUnterbringung", null, 0, 1, PZB_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPZB_Element_PZBElementGM(), this.getPZB_Element_GM_AttributeGroup(), null, "pZBElementGM", null, 0, 1, PZB_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPZB_Element_PZBElementGUE(), this.getPZB_Element_GUE_AttributeGroup(), null, "pZBElementGUE", null, 0, 1, PZB_Element.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pzB_Element_GM_AttributeGroupEClass, PZB_Element_GM_AttributeGroup.class, "PZB_Element_GM_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPZB_Element_GM_AttributeGroup_PZBAbstandGM(), this.getPZB_Abstand_GM_TypeClass(), null, "pZBAbstandGM", null, 0, 1, PZB_Element_GM_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPZB_Element_GM_AttributeGroup_PZBINA(), this.getPZB_INA_TypeClass(), null, "pZBINA", null, 1, 1, PZB_Element_GM_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pzB_Element_GUE_AttributeGroupEClass, PZB_Element_GUE_AttributeGroup.class, "PZB_Element_GUE_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPZB_Element_GUE_AttributeGroup_GUEAbstandAbweichend(), this.getGUE_Abstand_Abweichend_TypeClass(), null, "gUEAbstandAbweichend", null, 0, 1, PZB_Element_GUE_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPZB_Element_GUE_AttributeGroup_GUEAnordnung(), this.getGUE_Anordnung_TypeClass(), null, "gUEAnordnung", null, 1, 1, PZB_Element_GUE_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPZB_Element_GUE_AttributeGroup_GUEBauart(), this.getGUE_Bauart_TypeClass(), null, "gUEBauart", null, 1, 1, PZB_Element_GUE_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPZB_Element_GUE_AttributeGroup_GUEEnergieversorgung(), this.getGUE_Energieversorgung_TypeClass(), null, "gUEEnergieversorgung", null, 1, 1, PZB_Element_GUE_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPZB_Element_GUE_AttributeGroup_GUEMessstrecke(), this.getGUE_Messstrecke_TypeClass(), null, "gUEMessstrecke", null, 1, 1, PZB_Element_GUE_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPZB_Element_GUE_AttributeGroup_IDPZBElementMitnutzung(), theVerweisePackage.getID_PZB_Element_Mitnutzung_TypeClass(), null, "iDPZBElementMitnutzung", null, 0, 1, PZB_Element_GUE_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPZB_Element_GUE_AttributeGroup_Messfehler(), this.getMessfehler_TypeClass(), null, "messfehler", null, 0, 1, PZB_Element_GUE_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPZB_Element_GUE_AttributeGroup_Pruefgeschwindigkeit(), this.getPruefgeschwindigkeit_TypeClass(), null, "pruefgeschwindigkeit", null, 1, 1, PZB_Element_GUE_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPZB_Element_GUE_AttributeGroup_Pruefzeit(), this.getPruefzeit_TypeClass(), null, "pruefzeit", null, 0, 1, PZB_Element_GUE_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pzB_Element_ZuordnungEClass, PZB_Element_Zuordnung.class, "PZB_Element_Zuordnung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPZB_Element_Zuordnung_PZBElementZuordnungBP(), this.getPZB_Element_Zuordnung_BP_AttributeGroup(), null, "pZBElementZuordnungBP", null, 1, -1, PZB_Element_Zuordnung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPZB_Element_Zuordnung_PZBElementZuordnungFstr(), this.getPZB_Element_Zuordnung_Fstr_AttributeGroup(), null, "pZBElementZuordnungFstr", null, 0, -1, PZB_Element_Zuordnung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pzB_Element_Zuordnung_BP_AttributeGroupEClass, PZB_Element_Zuordnung_BP_AttributeGroup.class, "PZB_Element_Zuordnung_BP_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPZB_Element_Zuordnung_BP_AttributeGroup_IDPZBElementBezugspunkt(), theVerweisePackage.getID_PZB_Element_Bezugspunkt_TypeClass(), null, "iDPZBElementBezugspunkt", null, 1, 1, PZB_Element_Zuordnung_BP_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPZB_Element_Zuordnung_BP_AttributeGroup_INAGefahrstelle(), this.getINA_Gefahrstelle_AttributeGroup(), null, "iNAGefahrstelle", null, 0, -1, PZB_Element_Zuordnung_BP_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPZB_Element_Zuordnung_BP_AttributeGroup_PZBElementZuordnungINA(), this.getPZB_Element_Zuordnung_INA_AttributeGroup(), null, "pZBElementZuordnungINA", null, 0, 1, PZB_Element_Zuordnung_BP_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPZB_Element_Zuordnung_BP_AttributeGroup_Wirksamkeit(), this.getWirksamkeit_TypeClass(), null, "wirksamkeit", null, 1, 1, PZB_Element_Zuordnung_BP_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pzB_Element_Zuordnung_Fstr_AttributeGroupEClass, PZB_Element_Zuordnung_Fstr_AttributeGroup.class, "PZB_Element_Zuordnung_Fstr_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPZB_Element_Zuordnung_Fstr_AttributeGroup_IDFstrZugRangier(), theVerweisePackage.getID_Fstr_Zug_Rangier_TypeClass(), null, "iDFstrZugRangier", null, 1, 1, PZB_Element_Zuordnung_Fstr_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPZB_Element_Zuordnung_Fstr_AttributeGroup_WirksamkeitFstr(), this.getWirksamkeit_Fstr_TypeClass(), null, "wirksamkeitFstr", null, 1, 1, PZB_Element_Zuordnung_Fstr_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pzB_Element_Zuordnung_INA_AttributeGroupEClass, PZB_Element_Zuordnung_INA_AttributeGroup.class, "PZB_Element_Zuordnung_INA_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPZB_Element_Zuordnung_INA_AttributeGroup_IDAnhangINA(), theVerweisePackage.getID_Anhang_TypeClass(), null, "iDAnhangINA", null, 1, -1, PZB_Element_Zuordnung_INA_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPZB_Element_Zuordnung_INA_AttributeGroup_IDBahnsteigKante(), theVerweisePackage.getID_Bahnsteig_Kante_TypeClass(), null, "iDBahnsteigKante", null, 1, 1, PZB_Element_Zuordnung_INA_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pzB_INA_TypeClassEClass, PZB_INA_TypeClass.class, "PZB_INA_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPZB_INA_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, PZB_INA_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pzB_Zuordnung_SignalEClass, PZB_Zuordnung_Signal.class, "PZB_Zuordnung_Signal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPZB_Zuordnung_Signal_IDPZBElementZuordnung(), theVerweisePackage.getID_PZB_Element_Zuordnung_TypeClass(), null, "iDPZBElementZuordnung", null, 1, 1, PZB_Zuordnung_Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPZB_Zuordnung_Signal_IDSignal(), theVerweisePackage.getID_Signal_TypeClass(), null, "iDSignal", null, 1, 1, PZB_Zuordnung_Signal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wirksamkeit_Fstr_TypeClassEClass, Wirksamkeit_Fstr_TypeClass.class, "Wirksamkeit_Fstr_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWirksamkeit_Fstr_TypeClass_Wert(), this.getENUMWirksamkeitFstrObject(), "wert", null, 1, 1, Wirksamkeit_Fstr_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(wirksamkeit_TypeClassEClass, Wirksamkeit_TypeClass.class, "Wirksamkeit_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWirksamkeit_TypeClass_Wert(), this.getENUMWirksamkeitObject(), "wert", null, 1, 1, Wirksamkeit_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumgueAnordnungEEnum, ENUMGUEAnordnung.class, "ENUMGUEAnordnung");
		addEEnumLiteral(enumgueAnordnungEEnum, ENUMGUEAnordnung.ENUMGUE_ANORDNUNG_1EA);
		addEEnumLiteral(enumgueAnordnungEEnum, ENUMGUEAnordnung.ENUMGUE_ANORDNUNG_2AE);

		initEEnum(enumgueBauartEEnum, ENUMGUEBauart.class, "ENUMGUEBauart");
		addEEnumLiteral(enumgueBauartEEnum, ENUMGUEBauart.ENUMGUE_BAUART_GPE_90R);
		addEEnumLiteral(enumgueBauartEEnum, ENUMGUEBauart.ENUMGUE_BAUART_GUE_60);
		addEEnumLiteral(enumgueBauartEEnum, ENUMGUEBauart.ENUMGUE_BAUART_PZ_80);
		addEEnumLiteral(enumgueBauartEEnum, ENUMGUEBauart.ENUMGUE_BAUART_SONSTIGE);

		initEEnum(enumgueEnergieversorgungEEnum, ENUMGUEEnergieversorgung.class, "ENUMGUEEnergieversorgung");
		addEEnumLiteral(enumgueEnergieversorgungEEnum, ENUMGUEEnergieversorgung.ENUMGUE_ENERGIEVERSORGUNG_SOLAR);
		addEEnumLiteral(enumgueEnergieversorgungEEnum, ENUMGUEEnergieversorgung.ENUMGUE_ENERGIEVERSORGUNG_SONSTIGE);
		addEEnumLiteral(enumgueEnergieversorgungEEnum, ENUMGUEEnergieversorgung.ENUMGUE_ENERGIEVERSORGUNG_STELLWERK);

		initEEnum(enumMessfehlerEEnum, ENUMMessfehler.class, "ENUMMessfehler");
		addEEnumLiteral(enumMessfehlerEEnum, ENUMMessfehler.ENUM_MESSFEHLER_2BIS_3);
		addEEnumLiteral(enumMessfehlerEEnum, ENUMMessfehler.ENUM_MESSFEHLER_3BIS_5);
		addEEnumLiteral(enumMessfehlerEEnum, ENUMMessfehler.ENUM_MESSFEHLER_5BIS_7);
		addEEnumLiteral(enumMessfehlerEEnum, ENUMMessfehler.ENUM_MESSFEHLER_KLEINER_4);
		addEEnumLiteral(enumMessfehlerEEnum, ENUMMessfehler.ENUM_MESSFEHLER_KLEINER_5);

		initEEnum(enumpzbArtEEnum, ENUMPZBArt.class, "ENUMPZBArt");
		addEEnumLiteral(enumpzbArtEEnum, ENUMPZBArt.ENUMPZB_ART_1000_2000_HZ);
		addEEnumLiteral(enumpzbArtEEnum, ENUMPZBArt.ENUMPZB_ART_1000_HZ);
		addEEnumLiteral(enumpzbArtEEnum, ENUMPZBArt.ENUMPZB_ART_2000_HZ);
		addEEnumLiteral(enumpzbArtEEnum, ENUMPZBArt.ENUMPZB_ART_500_HZ);

		initEEnum(enumWirksamkeitEEnum, ENUMWirksamkeit.class, "ENUMWirksamkeit");
		addEEnumLiteral(enumWirksamkeitEEnum, ENUMWirksamkeit.ENUM_WIRKSAMKEIT_SCHALTBAR_VON_SIGNAL);
		addEEnumLiteral(enumWirksamkeitEEnum, ENUMWirksamkeit.ENUM_WIRKSAMKEIT_SONSTIGE);
		addEEnumLiteral(enumWirksamkeitEEnum, ENUMWirksamkeit.ENUM_WIRKSAMKEIT_STAENDIG_WIRKSAM);

		initEEnum(enumWirksamkeitFstrEEnum, ENUMWirksamkeitFstr.class, "ENUMWirksamkeitFstr");
		addEEnumLiteral(enumWirksamkeitFstrEEnum, ENUMWirksamkeitFstr.ENUM_WIRKSAMKEIT_FSTR_SONSTIGE);
		addEEnumLiteral(enumWirksamkeitFstrEEnum, ENUMWirksamkeitFstr.ENUM_WIRKSAMKEIT_FSTR_STAENDIG_WIRKSAM_WENN_FAHRSTRASSE_EINGESTELLT);
		addEEnumLiteral(enumWirksamkeitFstrEEnum, ENUMWirksamkeitFstr.ENUM_WIRKSAMKEIT_FSTR_UNWIRKSAM_WENN_FAHRSTRASSE_EINGESTELLT);

		// Initialize data types
		initEDataType(enumgueAnordnungObjectEDataType, ENUMGUEAnordnung.class, "ENUMGUEAnordnungObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumgueBauartObjectEDataType, ENUMGUEBauart.class, "ENUMGUEBauartObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumgueEnergieversorgungObjectEDataType, ENUMGUEEnergieversorgung.class, "ENUMGUEEnergieversorgungObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumMessfehlerObjectEDataType, ENUMMessfehler.class, "ENUMMessfehlerObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumpzbArtObjectEDataType, ENUMPZBArt.class, "ENUMPZBArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumWirksamkeitFstrObjectEDataType, ENUMWirksamkeitFstr.class, "ENUMWirksamkeitFstrObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumWirksamkeitObjectEDataType, ENUMWirksamkeit.class, "ENUMWirksamkeitObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(guE_Abstand_Abweichend_TypeEDataType, BigDecimal.class, "GUE_Abstand_Abweichend_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(guE_Messstrecke_TypeEDataType, BigDecimal.class, "GUE_Messstrecke_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(prioritaet_Gefahrstelle_TypeEDataType, BigInteger.class, "Prioritaet_Gefahrstelle_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pruefgeschwindigkeit_TypeEDataType, BigInteger.class, "Pruefgeschwindigkeit_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pruefzeit_TypeEDataType, BigDecimal.class, "Pruefzeit_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(pzB_Abstand_GM_TypeEDataType, BigDecimal.class, "PZB_Abstand_GM_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (getINA_Gefahrstelle_AttributeGroup_IDMarkanterPunkt(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf einen Markanten Punkt zur Angabe einer Gefahrstelle f\u00fcr die INA-Berechnung. Die Unterscheidung in  ma\u00dfgebende und sch\u00fctzenswertere Gefahrstelle erfolgt \u00fcber das Attribut Prioritaet_Gefahrstelle. DB-Regelwerk 819.1311V00"
		   });
		addAnnotation
		  (getINA_Gefahrstelle_AttributeGroup_PrioritaetGefahrstelle(),
		   source,
		   new String[] {
			   "documentation", "Priorit\u00e4t der Gefahrstelle f\u00fcr die INA-Berechnung. Die ma\u00dfgebende Gefahrstelle wird durch den Wert 1 gekennzeichnet, sch\u00fctzenswertere Gefahrstellen erhalten entsprechend h\u00f6here Werte."
		   });
		addAnnotation
		  (pzB_ElementEClass,
		   source,
		   new String[] {
			   "documentation", "(Bau)Art, Umfang und Funktionen der punktf\u00f6rmigen Zugbeeinflussung. Unter dem PZB_Element werden sowohl einzelne Gleismagneten als auch die Geschwindigkeits\u00fcberwachungseinrichtungen (G\u00dc - in der Literatur auch als Geschwindigkeitspr\u00fcfeinrichtungen - GPE bezeichnet) sowie dazugeh\u00f6rige Eigenschaften und Parameter zusammenfassend dargestellt. DB-Regelwerk 819.1310 8 f\u00fcr Gleismagnete 819.1310 9 f\u00fcr G\u00dc In der Gleismagenttabelle finden sich die Angaben in den Zeilen 16 und 17 sowie 33 bis 35 f\u00fcr G\u00dc und 29 bis 32 f\u00fcr Gleismagnete."
		   });
		addAnnotation
		  (getPZB_Element_IDPZBElementZuordnung(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf das Objekt PZB_Element_Zuordnung zur Angabe des Bezugspunkts bzw. der Bezugspunkte und ggf. bestehender Fahrstra\u00dfen-Abh\u00e4ngigkeiten."
		   });
		addAnnotation
		  (getPZB_Element_PZBArt(),
		   source,
		   new String[] {
			   "documentation", "Art des PZB-Elementes."
		   });
		addAnnotation
		  (getPZB_Element_IDStellelement(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf das Objekt Stellelement zur Zusammenfassung von Eigenschaften der Objekte BUE Schnittstelle, PZB Element, Schluesselsperre, Signal, W Kr Gsp Element. Das Stellelement enth\u00e4lt Informationen \u00fcber den energetischen und logischen Anschluss der Objekte. F\u00fcr das PZB Element ist der Verweis nicht zu f\u00fcllen, wenn damit eine G\u00dc oder ein st\u00e4ndig wirksamer Gleismagnet abgebildet wird. DB-Regelwerk Bisher ohne eindeutige Darstellung "
		   });
		addAnnotation
		  (getPZB_Element_IDUnterbringung(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf den physischen Ort der Unterbringung von Aussenelementansteuerung, Bedien Einrichtung Oertlich, Bedien Platz, ESTW Zentraleinheit, PZB Element, Schlosskombination, Schluesselsperre und ZN. F\u00fcr das PZB Element wird der Verweis nur f\u00fcr eine G\u00dc gef\u00fcllt - mit der Bedeutung: G\u00dc-Schaltkasten. F\u00fcr die ZN ist der Verweis optional, da im Planungswerkzeug ZN/ZL keine Bef\u00fcllung aller der f\u00fcr die Unterbringung notwendigen Attribute m\u00f6glich ist. DB-Regelwerk Darstellung des Geb\u00e4udes, der Bediens\u00e4ule bzw. des Schaltkastens im sicherungstechnischen Lageplan nach Ril 819.9002 oder Beschreibung im Erl\u00e4uterungsbericht."
		   });
		addAnnotation
		  (getPZB_Element_GM_AttributeGroup_PZBAbstandGM(),
		   source,
		   new String[] {
			   "documentation", "Abstand des PZB-Magneten zum Signal, f\u00fcr den eine INA-Berechnung durchgef\u00fchrt wurde. Der aktuelle Abstand wird \u00fcber die Verortung der beiden Punktobjekte ermittelt."
		   });
		addAnnotation
		  (getPZB_Element_GM_AttributeGroup_PZBINA(),
		   source,
		   new String[] {
			   "documentation", "Der PZB-Magnet deckt gem\u00e4\u00df Wirkbereichsbogen Bereiche ab (\\\"true\\\"). Liegt ein Bahnsteig zwischen den PZB-Magneten von Vor- und nachfolgendem Hauptsignal, wird eine INA-Berechnung durchgef\u00fchrt. Das Ergebnis wird in einem Wirkbereichsbogen dokumentiert. Daraus geht die Relevanz des PZB-Magneten f\u00fcr die \u00dcberwachung gegen Halt anfahrender Z\u00fcge hervor: Z. B. \\\"Der GM 1000 Hz deckt bei bei einer Beschleunigung von 0,3 m/s\u00b2 die Bereiche von ... bis ... m ab.\\\" oder \\\"Der GM 2000 Hz deckt keine Bereiche ab\\\". "
		   });
		addAnnotation
		  (getPZB_Element_GUE_AttributeGroup_GUEAbstandAbweichend(),
		   source,
		   new String[] {
			   "documentation", "Angabe des von der Regelanordnung abweichenden Abstandes einer G\u00dc zum Signal. Das Attribut wird nur bef\u00fcllt, wenn der Abstand der GUE zum Signal gem\u00e4\u00df Ril 819.1310 Anhang 01 aus baulichen Gr\u00fcnden nicht realisiert werden kann. Es ist dann der Abstand zwischen GUE und Signal anzugeben. Dann sind die Toleranzen gem\u00e4\u00df Ril 819.1310 Abschnitt 9, Absatz (4) einzuhalten. DB-Regelwerk 819.1310A01 in Verbindung mit 819.1310 9 (4) "
		   });
		addAnnotation
		  (getPZB_Element_GUE_AttributeGroup_GUEAnordnung(),
		   source,
		   new String[] {
			   "documentation", "Angabe des Anordnungsfalles des Pr\u00fcf- und der Pr\u00fcfmagneten einer G\u00dc. Fall 1 (EA): in Fahrtrichtung zuerst Einschaltmagnet (GSE), dann Wirkmagnet, dann Ausschaltmagnet (GSA). Fall 2 (AE): in Fahrtrichtung zuerst Ausschaltmagnet (GSA) dann Einschaltmagnet (GSE), dann Wirkmagnet. Nach Ril 819.1310 ist im Regelfall die Variante gem\u00e4\u00df Fall 1 anzuwenden. DB-Regelwerk 819.1310 9 819.1310A01 "
		   });
		addAnnotation
		  (getPZB_Element_GUE_AttributeGroup_GUEBauart(),
		   source,
		   new String[] {
			   "documentation", "Bauart der G\u00dc, von der weitere Planungsparameter wie Messfehler oder Pruefzeit abh\u00e4ngen. DB-Regelwerk Ril 819.1310A01"
		   });
		addAnnotation
		  (getPZB_Element_GUE_AttributeGroup_GUEEnergieversorgung(),
		   source,
		   new String[] {
			   "documentation", "Angabe, wie die Energieversorgung der G\u00dc erfolgt. Bei G\u00dc, die zur \u00dcberwachung restriktiver Geschwindigkeiten an Signalen bzw. f\u00fcr Weichen geplant werden, erfolgt die Stromversorgung im Regelfall aus dem zugeh\u00f6rigen Stellwerk. Bei Lf-Signalen der freien Strecke, die einer G\u00dc-Sicherung bed\u00fcrfen, ist im Regelfall die Solarspeisung vorzusehen, da sich keine geeignete Stromversorgung in der N\u00e4he befindet. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk mit entsprechenden Erl\u00e4uterungen anzuf\u00fcgen. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. Es ergibt sich aus dem konkreten Anwendungsfall."
		   });
		addAnnotation
		  (getPZB_Element_GUE_AttributeGroup_GUEMessstrecke(),
		   source,
		   new String[] {
			   "documentation", "Angabe \u00fcber die L\u00e4nge der Messstrecke der G\u00dc in [m]. Aus Sicht des LST-Planers ist die Messstrecke das ma\u00dfgebende Planungskriterium, die aufgrund der \u00f6rtlichen Verh\u00e4ltnisse (z. B. Weichenlage, Schwei\u00dfstelle, andere sicherungstechnischen Elemente) festzulegen ist. Daraus ergibt sich die dann zu realisierende Bauform der G\u00dc. DB-Regelwerk 819.1310A01 7 819.1310A01 8 "
		   });
		addAnnotation
		  (getPZB_Element_GUE_AttributeGroup_IDPZBElementMitnutzung(),
		   source,
		   new String[] {
			   "documentation", "Mit Ausnahme von G\u00dc bei Lf-Signalisierung werden bei der Anordnung von G\u00dc unmittelbar am Signal (meist im Zusammenhang mit geschwindigkeitsmindernden Zusatzanzeigern) der Wirkmagnet der G\u00dc und der PZB-Magnet des Signals zu einem PZB-Magneten zusammengefasst. DB-Regelwerk Der Sachverhalt ist in der Ril 819.1310 zwar nicht eindeutig beschrieben, geht jedoch aus den Tabelleneintr\u00e4gen im Anhang 01 hervor."
		   });
		addAnnotation
		  (getPZB_Element_GUE_AttributeGroup_Messfehler(),
		   source,
		   new String[] {
			   "documentation", "Messfehlerbereich der G\u00dc in Abh\u00e4ngigkeit von der Bauart DB-Regelwerk Ril 819.1310A01"
		   });
		addAnnotation
		  (getPZB_Element_GUE_AttributeGroup_Pruefgeschwindigkeit(),
		   source,
		   new String[] {
			   "documentation", "Angabe der an der G\u00dc eingestellten \u00dcberwachungsgeschwindigkeit in [km/h]. Bis auf die \u00dcberwachungsgeschwindigkeiten 95 und 105 erhalten die G\u00dc eine Wirkmagnet mit 2000 Hz; f\u00fcr G\u00dc 95 und 105 einen Wirkmagneten mit 1000 Hz. Eine explizite Angabe der Wirkfrequenz bei der G\u00dc ist daher nicht vorgesehen. DB-Regelwerk 819.1310A01 3 819.1310A01 5 819.1310A01 6 "
		   });
		addAnnotation
		  (getPZB_Element_GUE_AttributeGroup_Pruefzeit(),
		   source,
		   new String[] {
			   "documentation", "Pr\u00fcfzeit der G\u00dc in Abh\u00e4ngigkeit von der Bauart. DB-Regelwerk Ril 819.1310A01"
		   });
		addAnnotation
		  (pzB_Element_ZuordnungEClass,
		   source,
		   new String[] {
			   "documentation", "Zuordnung von PZB Element zu einem Signal, einer Fahrstra\u00dfe oder auch anderen Objekten, die im Bezug zum PZB_Element stehen. Der Verweis von einem PZB Element \u00fcber das Zuordnungsobjekt auf ein Signal ist dabei immer gef\u00fcllt. Die Verkn\u00fcpfung mit einer Fahrstra\u00dfe (nur Zugstra\u00dfen sind relevant) oder weiteren Objekten (INA-Berechnungsrelevante Objekte) ist fallbezogen notwendig. Beispiele f\u00fcr die Zuordnung sind unter ID Fstr Zug Rangier zu finden. DB-Regelwerk Eintrag in der Gleismagnettabelle; die Zuordnung zu einzelnen Fahrstra\u00dfen wird heute \u00fcber Fu\u00dfnoten gel\u00f6st."
		   });
		addAnnotation
		  (getPZB_Element_Zuordnung_BP_AttributeGroup_IDPZBElementBezugspunkt(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf das Signal bzw. die Weiche, in dessen Abh\u00e4ngigkeit das PZB Element angeordnet werden muss. W\u00e4hrend bei PZB-Element-GM im Regelfall das Signal anzugeben ist, k\u00f6nnen PZB-Element-GUE auch in Abh\u00e4ngigkeit einer Weiche angeordnet werden (z.B. Sp\u00e4tablenkung). DB-Regelwerk Gleismagnettabelle 1 "
		   });
		addAnnotation
		  (getPZB_Element_Zuordnung_BP_AttributeGroup_Wirksamkeit(),
		   source,
		   new String[] {
			   "documentation", "Angabe, ob der Gleismagnet/ die G\u00dc schaltbar ist oder nicht bzw. wie die Anschaltung erfolgt. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk mit entsprechenden Erl\u00e4uterungen anzuf\u00fcgen. DB-Regelwerk Gleismagnettabelle"
		   });
		addAnnotation
		  (getPZB_Element_Zuordnung_Fstr_AttributeGroup_IDFstrZugRangier(),
		   source,
		   new String[] {
			   "documentation", "Verlinkung, zu welcher Fahrstra\u00dfe der PZB-Gleismagnet geh\u00f6rt (wird nur angegeben, wenn Ziel der Fahrstra\u00dfe nicht identisch mit zugeordneten Signal ist oder Umfahrwege existieren). Dabei ist festgelegt, dass der Fahrweg der Fahrstra\u00dfe \u00fcber den PZB-Gleismagneten f\u00fchrt. Gleismagnete ohne Zuordnung zu einem Signal oder einer Fahrstra\u00dfe sind st\u00e4ndig wirksam. Zur Verdeutlichung dienen die folgenden Beispiele: Media:Skizze PZB.pdf, Media:Tabellen PZB.pdf. In den Beipielen ist das PZB Element ein Gleismagnet 500 Hz; diese Verfahrensweise kann analog auch f\u00fcr alle anderen PZB_Elemente, z.B. G\u00dc, angewandt werden. DB-Regelwerk Gleismagnettabelle 1 mittels Fu\u00dfnote "
		   });
		addAnnotation
		  (getPZB_Element_Zuordnung_Fstr_AttributeGroup_WirksamkeitFstr(),
		   source,
		   new String[] {
			   "documentation", "Angabe, ob der Gleismagnet/ die G\u00dc bei Einstellung der referenzierten Fahrstra\u00dfe wirksam ist oder nicht. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk mit entsprechenden Erl\u00e4uterungen anzuf\u00fcgen. DB-Regelwerk Gleismagnettabelle"
		   });
		addAnnotation
		  (getPZB_Element_Zuordnung_INA_AttributeGroup_IDAnhangINA(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die zugeh\u00f6rigen Dokumente zur INA-Berechnung. Dazu geh\u00f6ren Erhebungsbogen, Wirkbereichsbogen und ggf. die Berechnungsbl\u00e4tter selbst. Diese werden f\u00fcr jedes Signal gesondert erstellt. DB-Regelwerk 819.1310A02 "
		   });
		addAnnotation
		  (getPZB_Element_Zuordnung_INA_AttributeGroup_IDBahnsteigKante(),
		   source,
		   new String[] {
			   "documentation", "ID der zugeh\u00f6rigen Bahnsteigkante bezogen auf ein Signal mit INA-Berechnung. Der Fall, dass zwei separate Bahnsteige zwischen Vor- und Hauptsignal angeordnet sind, wird nicht angenommen. Aus der bisherigen Praxis sind keine solchen F\u00e4lle bekannt. DB-Regelwerk 819.1310A02 2 (1) "
		   });
		addAnnotation
		  (pzB_Zuordnung_SignalEClass,
		   source,
		   new String[] {
			   "documentation", "Das Objekt dient der Zuordnung der Signale (Vorsignal, Vorsignalwiederholer, H-Tafel) zum ma\u00dfgebenden Gleismagneten (GM) 2000 Hz des Hauptsignals. Die Unterscheidung zwischen den verschiedenen Signalen wird \u00fcber die GUID des Signals hergestellt. Der angegebene Abstand bezieht sich beim Vorsignal auf den Abstand des GM 1000 Hz, bei Vorsignalwiederholer und H-Tafel auf den Abstand des Signals zum ma\u00dfgebenden GM 2000 Hz des Hauptsignals. Es werden in der Regel bis zu vier H-Tafeln pro Hauptsignal geplant. DB-Regelwerk Gleismagnettabelle, Zeilen 19 sowie 21 bis 25 "
		   });
		addAnnotation
		  (getPZB_Zuordnung_Signal_IDPZBElementZuordnung(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf das Objekt PZB_Element_Zuordnung, zur Angabe des zugeh\u00f6rigen Signals. "
		   });
		addAnnotation
		  (getPZB_Zuordnung_Signal_IDSignal(),
		   source,
		   new String[] {
			   "documentation", "ID des zugeordneten Signals (Vorsignal, Vorsignalwiederholer, H-Tafel), welches im Rahmen der INA-Berechnung dem Hauptsignal zugeordet wird und damit mit diesem im festen Zusammenhang steht."
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
		  (enumgueAnordnungEEnum,
		   source,
		   new String[] {
			   "name", "ENUMGUE_Anordnung"
		   });
		addAnnotation
		  (enumgueAnordnungObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMGUE_Anordnung:Object",
			   "baseType", "ENUMGUE_Anordnung"
		   });
		addAnnotation
		  (enumgueBauartEEnum,
		   source,
		   new String[] {
			   "name", "ENUMGUE_Bauart"
		   });
		addAnnotation
		  (enumgueBauartObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMGUE_Bauart:Object",
			   "baseType", "ENUMGUE_Bauart"
		   });
		addAnnotation
		  (enumgueEnergieversorgungEEnum,
		   source,
		   new String[] {
			   "name", "ENUMGUE_Energieversorgung"
		   });
		addAnnotation
		  (enumgueEnergieversorgungObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMGUE_Energieversorgung:Object",
			   "baseType", "ENUMGUE_Energieversorgung"
		   });
		addAnnotation
		  (enumMessfehlerEEnum,
		   source,
		   new String[] {
			   "name", "ENUMMessfehler"
		   });
		addAnnotation
		  (enumMessfehlerObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMMessfehler:Object",
			   "baseType", "ENUMMessfehler"
		   });
		addAnnotation
		  (enumpzbArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMPZB_Art"
		   });
		addAnnotation
		  (enumpzbArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMPZB_Art:Object",
			   "baseType", "ENUMPZB_Art"
		   });
		addAnnotation
		  (enumWirksamkeitEEnum,
		   source,
		   new String[] {
			   "name", "ENUMWirksamkeit"
		   });
		addAnnotation
		  (enumWirksamkeitFstrEEnum,
		   source,
		   new String[] {
			   "name", "ENUMWirksamkeit_Fstr"
		   });
		addAnnotation
		  (enumWirksamkeitFstrObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMWirksamkeit_Fstr:Object",
			   "baseType", "ENUMWirksamkeit_Fstr"
		   });
		addAnnotation
		  (enumWirksamkeitObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMWirksamkeit:Object",
			   "baseType", "ENUMWirksamkeit"
		   });
		addAnnotation
		  (guE_Abstand_Abweichend_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TGUE_Abstand_Abweichend",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter"
		   });
		addAnnotation
		  (guE_Abstand_Abweichend_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCGUE_Abstand_Abweichend",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGUE_Abstand_Abweichend_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (guE_Anordnung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCGUE_Anordnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGUE_Anordnung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (guE_Bauart_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCGUE_Bauart",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGUE_Bauart_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (guE_Energieversorgung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCGUE_Energieversorgung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGUE_Energieversorgung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (guE_Messstrecke_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TGUE_Messstrecke",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter",
			   "pattern", "5\\.[89][0-9]|([6-9]|[1-6][0-9]|7[0-4])\\.[0-9]{2}|75\\.00"
		   });
		addAnnotation
		  (guE_Messstrecke_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCGUE_Messstrecke",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGUE_Messstrecke_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (inA_Gefahrstelle_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CINA_Gefahrstelle",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getINA_Gefahrstelle_AttributeGroup_IDMarkanterPunkt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Markanter_Punkt"
		   });
		addAnnotation
		  (getINA_Gefahrstelle_AttributeGroup_PrioritaetGefahrstelle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Prioritaet_Gefahrstelle"
		   });
		addAnnotation
		  (messfehler_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCMessfehler",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getMessfehler_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (prioritaet_Gefahrstelle_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TPrioritaet_Gefahrstelle",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer"
		   });
		addAnnotation
		  (prioritaet_Gefahrstelle_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCPrioritaet_Gefahrstelle",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPrioritaet_Gefahrstelle_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (pruefgeschwindigkeit_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TPruefgeschwindigkeit",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TGeschwindigkeit",
			   "pattern", "[1-9][0-9]|1[0-4][0-9]|150"
		   });
		addAnnotation
		  (pruefgeschwindigkeit_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCPruefgeschwindigkeit",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPruefgeschwindigkeit_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (pruefzeit_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TPruefzeit",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TSekunde",
			   "pattern", "(0|[1-9][0-9]{0,1})\\.[0-9]{2}"
		   });
		addAnnotation
		  (pruefzeit_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCPruefzeit",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPruefzeit_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (pzB_Abstand_GM_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TPZB_Abstand_GM",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.1#TMeter",
			   "pattern", "\\-[1-6]|[0-9]|[1-9][0-9]|[12][0-9]{2}|300"
		   });
		addAnnotation
		  (pzB_Abstand_GM_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCPZB_Abstand_GM",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPZB_Abstand_GM_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (pzB_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCPZB_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPZB_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (pzB_ElementEClass,
		   source,
		   new String[] {
			   "name", "CPZB_Element",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPZB_Element_IDPZBElementZuordnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_PZB_Element_Zuordnung"
		   });
		addAnnotation
		  (getPZB_Element_PZBArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PZB_Art"
		   });
		addAnnotation
		  (getPZB_Element_IDStellelement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Stellelement"
		   });
		addAnnotation
		  (getPZB_Element_IDUnterbringung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Unterbringung"
		   });
		addAnnotation
		  (getPZB_Element_PZBElementGM(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PZB_Element_GM"
		   });
		addAnnotation
		  (getPZB_Element_PZBElementGUE(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PZB_Element_GUE"
		   });
		addAnnotation
		  (pzB_Element_GM_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CPZB_Element_GM",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPZB_Element_GM_AttributeGroup_PZBAbstandGM(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PZB_Abstand_GM"
		   });
		addAnnotation
		  (getPZB_Element_GM_AttributeGroup_PZBINA(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PZB_INA"
		   });
		addAnnotation
		  (pzB_Element_GUE_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CPZB_Element_GUE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPZB_Element_GUE_AttributeGroup_GUEAbstandAbweichend(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GUE_Abstand_Abweichend"
		   });
		addAnnotation
		  (getPZB_Element_GUE_AttributeGroup_GUEAnordnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GUE_Anordnung"
		   });
		addAnnotation
		  (getPZB_Element_GUE_AttributeGroup_GUEBauart(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GUE_Bauart"
		   });
		addAnnotation
		  (getPZB_Element_GUE_AttributeGroup_GUEEnergieversorgung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GUE_Energieversorgung"
		   });
		addAnnotation
		  (getPZB_Element_GUE_AttributeGroup_GUEMessstrecke(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GUE_Messstrecke"
		   });
		addAnnotation
		  (getPZB_Element_GUE_AttributeGroup_IDPZBElementMitnutzung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_PZB_Element_Mitnutzung"
		   });
		addAnnotation
		  (getPZB_Element_GUE_AttributeGroup_Messfehler(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Messfehler"
		   });
		addAnnotation
		  (getPZB_Element_GUE_AttributeGroup_Pruefgeschwindigkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Pruefgeschwindigkeit"
		   });
		addAnnotation
		  (getPZB_Element_GUE_AttributeGroup_Pruefzeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Pruefzeit"
		   });
		addAnnotation
		  (pzB_Element_ZuordnungEClass,
		   source,
		   new String[] {
			   "name", "CPZB_Element_Zuordnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPZB_Element_Zuordnung_PZBElementZuordnungBP(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PZB_Element_Zuordnung_BP"
		   });
		addAnnotation
		  (getPZB_Element_Zuordnung_PZBElementZuordnungFstr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PZB_Element_Zuordnung_Fstr"
		   });
		addAnnotation
		  (pzB_Element_Zuordnung_BP_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CPZB_Element_Zuordnung_BP",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPZB_Element_Zuordnung_BP_AttributeGroup_IDPZBElementBezugspunkt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_PZB_Element_Bezugspunkt"
		   });
		addAnnotation
		  (getPZB_Element_Zuordnung_BP_AttributeGroup_INAGefahrstelle(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "INA_Gefahrstelle"
		   });
		addAnnotation
		  (getPZB_Element_Zuordnung_BP_AttributeGroup_PZBElementZuordnungINA(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "PZB_Element_Zuordnung_INA"
		   });
		addAnnotation
		  (getPZB_Element_Zuordnung_BP_AttributeGroup_Wirksamkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wirksamkeit"
		   });
		addAnnotation
		  (pzB_Element_Zuordnung_Fstr_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CPZB_Element_Zuordnung_Fstr",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPZB_Element_Zuordnung_Fstr_AttributeGroup_IDFstrZugRangier(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Fstr_Zug_Rangier"
		   });
		addAnnotation
		  (getPZB_Element_Zuordnung_Fstr_AttributeGroup_WirksamkeitFstr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wirksamkeit_Fstr"
		   });
		addAnnotation
		  (pzB_Element_Zuordnung_INA_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CPZB_Element_Zuordnung_INA",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPZB_Element_Zuordnung_INA_AttributeGroup_IDAnhangINA(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Anhang_INA"
		   });
		addAnnotation
		  (getPZB_Element_Zuordnung_INA_AttributeGroup_IDBahnsteigKante(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Bahnsteig_Kante"
		   });
		addAnnotation
		  (pzB_INA_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCPZB_INA",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPZB_INA_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (pzB_Zuordnung_SignalEClass,
		   source,
		   new String[] {
			   "name", "CPZB_Zuordnung_Signal",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPZB_Zuordnung_Signal_IDPZBElementZuordnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_PZB_Element_Zuordnung"
		   });
		addAnnotation
		  (getPZB_Zuordnung_Signal_IDSignal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Signal"
		   });
		addAnnotation
		  (wirksamkeit_Fstr_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCWirksamkeit_Fstr",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getWirksamkeit_Fstr_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (wirksamkeit_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCWirksamkeit",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getWirksamkeit_TypeClass_Wert(),
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
		  (pzB_ElementEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>B\u00dc|ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getPZB_Element_GM_AttributeGroup_PZBAbstandGM(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[-6..300]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getPZB_Element_GM_AttributeGroup_PZBINA(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>false</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getPZB_Element_GUE_AttributeGroup_GUEAnordnung(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>1_EA</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getPZB_Element_GUE_AttributeGroup_GUEEnergieversorgung(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>Stellwerk</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getPZB_Element_GUE_AttributeGroup_GUEMessstrecke(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung> [5.80..75.00] </ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getPZB_Element_GUE_AttributeGroup_Pruefgeschwindigkeit(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung> [10..150] </ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (getPZB_Element_GUE_AttributeGroup_Pruefzeit(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:Patternbeschreibung>[0.00..99.99]</ppi:Patternbeschreibung>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (pzB_Element_ZuordnungEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>B\u00dc|ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
		addAnnotation
		  (getPZB_Element_Zuordnung_BP_AttributeGroup_Wirksamkeit(),
		   source,
		   new String[] {
			   "appinfo", "\n                    \n  <ppi:WorkflowInformation>\n                         \n    <ppi:ProposedValue>schaltbar_von_Signal</ppi:ProposedValue>\n                      \n  </ppi:WorkflowInformation>\n                 \n"
		   });
		addAnnotation
		  (pzB_Zuordnung_SignalEClass,
		   source,
		   new String[] {
			   "appinfo", "\n              \n  <ppi:WorkflowInformation>\n                   \n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\n                   \n    <ppi:Untergewerke>ESTW</ppi:Untergewerke>\n                \n  </ppi:WorkflowInformation>\n           \n"
		   });
	}

} //PZBPackageImpl
