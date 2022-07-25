/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Zuglenkung.impl;

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

import org.eclipse.set.model.model1902.Block.BlockPackage;

import org.eclipse.set.model.model1902.Block.impl.BlockPackageImpl;

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

import org.eclipse.set.model.model1902.Zuglenkung.Annaeherungsgeschwindigkeit_TypeClass;
import org.eclipse.set.model.model1902.Zuglenkung.Anzahl_Wiederhol_ZL_Anstoesse_TypeClass;
import org.eclipse.set.model.model1902.Zuglenkung.DWeg_Prio_TypeClass;
import org.eclipse.set.model.model1902.Zuglenkung.Deadlockpruefung_TypeClass;
import org.eclipse.set.model.model1902.Zuglenkung.ENUMLenkziffernstellen;
import org.eclipse.set.model.model1902.Zuglenkung.ENUMZNStellen;
import org.eclipse.set.model.model1902.Zuglenkung.Einstellkontrollzeit_TypeClass;
import org.eclipse.set.model.model1902.Zuglenkung.FUEM_Auswertung_TypeClass;
import org.eclipse.set.model.model1902.Zuglenkung.GKZSS_TypeClass;
import org.eclipse.set.model.model1902.Zuglenkung.GK_TypeClass;
import org.eclipse.set.model.model1902.Zuglenkung.Lenkabbruchzeit_TypeClass;
import org.eclipse.set.model.model1902.Zuglenkung.Lenkziffernstellen_TypeClass;
import org.eclipse.set.model.model1902.Zuglenkung.Personal_Reaktionszeit_TypeClass;
import org.eclipse.set.model.model1902.Zuglenkung.Sichtzeit_Vorsignal_TypeClass;
import org.eclipse.set.model.model1902.Zuglenkung.Signalgruppe_Bezeichner_TypeClass;
import org.eclipse.set.model.model1902.Zuglenkung.Tv_GK_TypeClass;
import org.eclipse.set.model.model1902.Zuglenkung.Vmax_Annaeherung_TypeClass;
import org.eclipse.set.model.model1902.Zuglenkung.ZL_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Zuglenkung.ZL_DLP_Abschnitt;
import org.eclipse.set.model.model1902.Zuglenkung.ZL_DLP_Fstr;
import org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr;
import org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr_Anstoss;
import org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr_Anstoss_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr_Anstoss_GK_AttributeGroup;
import org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr_Zuschlag_TypeClass;
import org.eclipse.set.model.model1902.Zuglenkung.ZL_Signalgruppe;
import org.eclipse.set.model.model1902.Zuglenkung.ZL_Signalgruppe_Allg_AttributeGroup;
import org.eclipse.set.model.model1902.Zuglenkung.ZL_Signalgruppe_Zuordnung;
import org.eclipse.set.model.model1902.Zuglenkung.ZL_ZN_AttributeGroup;
import org.eclipse.set.model.model1902.Zuglenkung.ZN_Stellen_TypeClass;
import org.eclipse.set.model.model1902.Zuglenkung.ZuglenkungFactory;
import org.eclipse.set.model.model1902.Zuglenkung.ZuglenkungPackage;

import org.eclipse.set.model.model1902.Zuglenkung.util.ZuglenkungValidator;

import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.ZugnummernmeldeanlagePackage;

import org.eclipse.set.model.model1902.Zugnummernmeldeanlage.impl.ZugnummernmeldeanlagePackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ZuglenkungPackageImpl extends EPackageImpl implements ZuglenkungPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annaeherungsgeschwindigkeit_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass anzahl_Wiederhol_ZL_Anstoesse_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deadlockpruefung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dWeg_Prio_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass einstellkontrollzeit_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fueM_Auswertung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gK_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gkzsS_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lenkabbruchzeit_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lenkziffernstellen_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personal_Reaktionszeit_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sichtzeit_Vorsignal_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalgruppe_Bezeichner_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tv_GK_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmax_Annaeherung_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zL_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zL_DLP_AbschnittEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zL_DLP_FstrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zL_FstrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zL_Fstr_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zL_Fstr_AnstossEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zL_Fstr_Anstoss_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zL_Fstr_Anstoss_GK_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zL_Fstr_Zuschlag_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zL_SignalgruppeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zL_Signalgruppe_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zL_Signalgruppe_ZuordnungEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zL_ZN_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass zN_Stellen_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumLenkziffernstellenEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumznStellenEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType annaeherungsgeschwindigkeit_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType anzahl_Wiederhol_ZL_Anstoesse_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dWeg_Prio_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType einstellkontrollzeit_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumLenkziffernstellenObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumznStellenObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType gK_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType lenkabbruchzeit_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType personal_Reaktionszeit_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sichtzeit_Vorsignal_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType signalgruppe_Bezeichner_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType tv_GK_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vmax_Annaeherung_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType zL_Fstr_Zuschlag_TypeEDataType = null;

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
	 * @see org.eclipse.set.model.model1902.Zuglenkung.ZuglenkungPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ZuglenkungPackageImpl() {
		super(eNS_URI, ZuglenkungFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ZuglenkungPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ZuglenkungPackage init() {
		if (isInited) return (ZuglenkungPackage)EPackage.Registry.INSTANCE.getEPackage(ZuglenkungPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredZuglenkungPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ZuglenkungPackageImpl theZuglenkungPackage = registeredZuglenkungPackage instanceof ZuglenkungPackageImpl ? (ZuglenkungPackageImpl)registeredZuglenkungPackage : new ZuglenkungPackageImpl();

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
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(ZugnummernmeldeanlagePackage.eNS_URI);
		ZugnummernmeldeanlagePackageImpl theZugnummernmeldeanlagePackage = (ZugnummernmeldeanlagePackageImpl)(registeredPackage instanceof ZugnummernmeldeanlagePackageImpl ? registeredPackage : ZugnummernmeldeanlagePackage.eINSTANCE);

		// Load packages
		thePlanProPackage.loadPackage();
		theBalisentechnik_ETCSPackage.loadPackage();
		theBahnuebergangPackage.loadPackage();

		// Create package meta-data objects
		theZuglenkungPackage.createPackageContents();
		theBasisobjektePackage.createPackageContents();
		theBasisTypenPackage.createPackageContents();
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
		theNahbedienbereichPackage.createPackageContents();
		thePZBPackage.createPackageContents();
		theRegelzeichnungPackage.createPackageContents();
		theSchluesselabhaengigkeitenPackage.createPackageContents();
		theSignalePackage.createPackageContents();
		theSignalbegriffe_StrukturPackage.createPackageContents();
		theZugnummernmeldeanlagePackage.createPackageContents();

		// Initialize created meta-data
		theZuglenkungPackage.initializePackageContents();
		theBasisobjektePackage.initializePackageContents();
		theBasisTypenPackage.initializePackageContents();
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
		theNahbedienbereichPackage.initializePackageContents();
		thePZBPackage.initializePackageContents();
		theRegelzeichnungPackage.initializePackageContents();
		theSchluesselabhaengigkeitenPackage.initializePackageContents();
		theSignalePackage.initializePackageContents();
		theSignalbegriffe_StrukturPackage.initializePackageContents();
		theZugnummernmeldeanlagePackage.initializePackageContents();

		// Fix loaded packages
		thePlanProPackage.fixPackageContents();
		theBalisentechnik_ETCSPackage.fixPackageContents();
		theBahnuebergangPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theZuglenkungPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return ZuglenkungValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theZuglenkungPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ZuglenkungPackage.eNS_URI, theZuglenkungPackage);
		return theZuglenkungPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnaeherungsgeschwindigkeit_TypeClass() {
		return annaeherungsgeschwindigkeit_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnaeherungsgeschwindigkeit_TypeClass_Wert() {
		return (EAttribute)annaeherungsgeschwindigkeit_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnzahl_Wiederhol_ZL_Anstoesse_TypeClass() {
		return anzahl_Wiederhol_ZL_Anstoesse_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnzahl_Wiederhol_ZL_Anstoesse_TypeClass_Wert() {
		return (EAttribute)anzahl_Wiederhol_ZL_Anstoesse_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeadlockpruefung_TypeClass() {
		return deadlockpruefung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeadlockpruefung_TypeClass_Wert() {
		return (EAttribute)deadlockpruefung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDWeg_Prio_TypeClass() {
		return dWeg_Prio_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDWeg_Prio_TypeClass_Wert() {
		return (EAttribute)dWeg_Prio_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEinstellkontrollzeit_TypeClass() {
		return einstellkontrollzeit_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEinstellkontrollzeit_TypeClass_Wert() {
		return (EAttribute)einstellkontrollzeit_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFUEM_Auswertung_TypeClass() {
		return fueM_Auswertung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFUEM_Auswertung_TypeClass_Wert() {
		return (EAttribute)fueM_Auswertung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGK_TypeClass() {
		return gK_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGK_TypeClass_Wert() {
		return (EAttribute)gK_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGKZSS_TypeClass() {
		return gkzsS_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGKZSS_TypeClass_Wert() {
		return (EAttribute)gkzsS_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLenkabbruchzeit_TypeClass() {
		return lenkabbruchzeit_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLenkabbruchzeit_TypeClass_Wert() {
		return (EAttribute)lenkabbruchzeit_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLenkziffernstellen_TypeClass() {
		return lenkziffernstellen_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLenkziffernstellen_TypeClass_Wert() {
		return (EAttribute)lenkziffernstellen_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPersonal_Reaktionszeit_TypeClass() {
		return personal_Reaktionszeit_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPersonal_Reaktionszeit_TypeClass_Wert() {
		return (EAttribute)personal_Reaktionszeit_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSichtzeit_Vorsignal_TypeClass() {
		return sichtzeit_Vorsignal_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSichtzeit_Vorsignal_TypeClass_Wert() {
		return (EAttribute)sichtzeit_Vorsignal_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSignalgruppe_Bezeichner_TypeClass() {
		return signalgruppe_Bezeichner_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSignalgruppe_Bezeichner_TypeClass_Wert() {
		return (EAttribute)signalgruppe_Bezeichner_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTv_GK_TypeClass() {
		return tv_GK_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTv_GK_TypeClass_Wert() {
		return (EAttribute)tv_GK_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVmax_Annaeherung_TypeClass() {
		return vmax_Annaeherung_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVmax_Annaeherung_TypeClass_Wert() {
		return (EAttribute)vmax_Annaeherung_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZL() {
		return zlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_IDESTWZentraleinheit() {
		return (EReference)zlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_IDZN() {
		return (EReference)zlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_ZLAllg() {
		return (EReference)zlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_ZLZN() {
		return (EReference)zlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZL_Allg_AttributeGroup() {
		return zL_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_Allg_AttributeGroup_AnzahlWiederholZLAnstoesse() {
		return (EReference)zL_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_Allg_AttributeGroup_Deadlockpruefung() {
		return (EReference)zL_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_Allg_AttributeGroup_Einstellkontrollzeit() {
		return (EReference)zL_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_Allg_AttributeGroup_Lenkabbruchzeit() {
		return (EReference)zL_Allg_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_Allg_AttributeGroup_PersonalReaktionszeit() {
		return (EReference)zL_Allg_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZL_DLP_Abschnitt() {
		return zL_DLP_AbschnittEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_DLP_Abschnitt_IDGleisAbschnitt() {
		return (EReference)zL_DLP_AbschnittEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_DLP_Abschnitt_IDZLDLPFstr() {
		return (EReference)zL_DLP_AbschnittEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZL_DLP_Fstr() {
		return zL_DLP_FstrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_DLP_Fstr_IDZLFstr() {
		return (EReference)zL_DLP_FstrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZL_Fstr() {
		return zL_FstrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_Fstr_IDFstrZugRangier() {
		return (EReference)zL_FstrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_Fstr_IDZL() {
		return (EReference)zL_FstrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_Fstr_IDZLFstr() {
		return (EReference)zL_FstrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_Fstr_ZLFstrAllg() {
		return (EReference)zL_FstrEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZL_Fstr_Allg_AttributeGroup() {
		return zL_Fstr_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_Fstr_Allg_AttributeGroup_Annaeherungsgeschwindigkeit() {
		return (EReference)zL_Fstr_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_Fstr_Allg_AttributeGroup_DWegPrio() {
		return (EReference)zL_Fstr_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_Fstr_Allg_AttributeGroup_FUEMAuswertung() {
		return (EReference)zL_Fstr_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_Fstr_Allg_AttributeGroup_SichtzeitVorsignal() {
		return (EReference)zL_Fstr_Allg_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZL_Fstr_Anstoss() {
		return zL_Fstr_AnstossEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_Fstr_Anstoss_IDEinschaltpunkt() {
		return (EReference)zL_Fstr_AnstossEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_Fstr_Anstoss_IDVorsignal() {
		return (EReference)zL_Fstr_AnstossEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_Fstr_Anstoss_IDZLFstr() {
		return (EReference)zL_Fstr_AnstossEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_Fstr_Anstoss_IDZNAnzeigefeldAnstoss() {
		return (EReference)zL_Fstr_AnstossEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_Fstr_Anstoss_ZLFstrAnstossAllg() {
		return (EReference)zL_Fstr_AnstossEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_Fstr_Anstoss_ZLFstrAnstossGK() {
		return (EReference)zL_Fstr_AnstossEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZL_Fstr_Anstoss_Allg_AttributeGroup() {
		return zL_Fstr_Anstoss_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_Fstr_Anstoss_Allg_AttributeGroup_GKZSS() {
		return (EReference)zL_Fstr_Anstoss_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_Fstr_Anstoss_Allg_AttributeGroup_VmaxAnnaeherung() {
		return (EReference)zL_Fstr_Anstoss_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_Fstr_Anstoss_Allg_AttributeGroup_ZLFstrZuschlag() {
		return (EReference)zL_Fstr_Anstoss_Allg_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZL_Fstr_Anstoss_GK_AttributeGroup() {
		return zL_Fstr_Anstoss_GK_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_Fstr_Anstoss_GK_AttributeGroup_GK() {
		return (EReference)zL_Fstr_Anstoss_GK_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_Fstr_Anstoss_GK_AttributeGroup_TvGK() {
		return (EReference)zL_Fstr_Anstoss_GK_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZL_Fstr_Zuschlag_TypeClass() {
		return zL_Fstr_Zuschlag_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZL_Fstr_Zuschlag_TypeClass_Wert() {
		return (EAttribute)zL_Fstr_Zuschlag_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZL_Signalgruppe() {
		return zL_SignalgruppeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_Signalgruppe_IDZL() {
		return (EReference)zL_SignalgruppeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_Signalgruppe_ZLSignalgruppeAllg() {
		return (EReference)zL_SignalgruppeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZL_Signalgruppe_Allg_AttributeGroup() {
		return zL_Signalgruppe_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_Signalgruppe_Allg_AttributeGroup_SignalgruppeBezeichner() {
		return (EReference)zL_Signalgruppe_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZL_Signalgruppe_Zuordnung() {
		return zL_Signalgruppe_ZuordnungEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_Signalgruppe_Zuordnung_IDSignal() {
		return (EReference)zL_Signalgruppe_ZuordnungEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_Signalgruppe_Zuordnung_IDZLSignalgruppe() {
		return (EReference)zL_Signalgruppe_ZuordnungEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZL_ZN_AttributeGroup() {
		return zL_ZN_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_ZN_AttributeGroup_Lenkziffernstellen() {
		return (EReference)zL_ZN_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getZL_ZN_AttributeGroup_ZNStellen() {
		return (EReference)zL_ZN_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getZN_Stellen_TypeClass() {
		return zN_Stellen_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getZN_Stellen_TypeClass_Wert() {
		return (EAttribute)zN_Stellen_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMLenkziffernstellen() {
		return enumLenkziffernstellenEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMZNStellen() {
		return enumznStellenEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAnnaeherungsgeschwindigkeit_Type() {
		return annaeherungsgeschwindigkeit_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAnzahl_Wiederhol_ZL_Anstoesse_Type() {
		return anzahl_Wiederhol_ZL_Anstoesse_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDWeg_Prio_Type() {
		return dWeg_Prio_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getEinstellkontrollzeit_Type() {
		return einstellkontrollzeit_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMLenkziffernstellenObject() {
		return enumLenkziffernstellenObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMZNStellenObject() {
		return enumznStellenObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGK_Type() {
		return gK_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getLenkabbruchzeit_Type() {
		return lenkabbruchzeit_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getPersonal_Reaktionszeit_Type() {
		return personal_Reaktionszeit_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSichtzeit_Vorsignal_Type() {
		return sichtzeit_Vorsignal_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSignalgruppe_Bezeichner_Type() {
		return signalgruppe_Bezeichner_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTv_GK_Type() {
		return tv_GK_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getVmax_Annaeherung_Type() {
		return vmax_Annaeherung_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getZL_Fstr_Zuschlag_Type() {
		return zL_Fstr_Zuschlag_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ZuglenkungFactory getZuglenkungFactory() {
		return (ZuglenkungFactory)getEFactoryInstance();
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
		annaeherungsgeschwindigkeit_TypeClassEClass = createEClass(ANNAEHERUNGSGESCHWINDIGKEIT_TYPE_CLASS);
		createEAttribute(annaeherungsgeschwindigkeit_TypeClassEClass, ANNAEHERUNGSGESCHWINDIGKEIT_TYPE_CLASS__WERT);

		anzahl_Wiederhol_ZL_Anstoesse_TypeClassEClass = createEClass(ANZAHL_WIEDERHOL_ZL_ANSTOESSE_TYPE_CLASS);
		createEAttribute(anzahl_Wiederhol_ZL_Anstoesse_TypeClassEClass, ANZAHL_WIEDERHOL_ZL_ANSTOESSE_TYPE_CLASS__WERT);

		deadlockpruefung_TypeClassEClass = createEClass(DEADLOCKPRUEFUNG_TYPE_CLASS);
		createEAttribute(deadlockpruefung_TypeClassEClass, DEADLOCKPRUEFUNG_TYPE_CLASS__WERT);

		dWeg_Prio_TypeClassEClass = createEClass(DWEG_PRIO_TYPE_CLASS);
		createEAttribute(dWeg_Prio_TypeClassEClass, DWEG_PRIO_TYPE_CLASS__WERT);

		einstellkontrollzeit_TypeClassEClass = createEClass(EINSTELLKONTROLLZEIT_TYPE_CLASS);
		createEAttribute(einstellkontrollzeit_TypeClassEClass, EINSTELLKONTROLLZEIT_TYPE_CLASS__WERT);

		fueM_Auswertung_TypeClassEClass = createEClass(FUEM_AUSWERTUNG_TYPE_CLASS);
		createEAttribute(fueM_Auswertung_TypeClassEClass, FUEM_AUSWERTUNG_TYPE_CLASS__WERT);

		gK_TypeClassEClass = createEClass(GK_TYPE_CLASS);
		createEAttribute(gK_TypeClassEClass, GK_TYPE_CLASS__WERT);

		gkzsS_TypeClassEClass = createEClass(GKZSS_TYPE_CLASS);
		createEAttribute(gkzsS_TypeClassEClass, GKZSS_TYPE_CLASS__WERT);

		lenkabbruchzeit_TypeClassEClass = createEClass(LENKABBRUCHZEIT_TYPE_CLASS);
		createEAttribute(lenkabbruchzeit_TypeClassEClass, LENKABBRUCHZEIT_TYPE_CLASS__WERT);

		lenkziffernstellen_TypeClassEClass = createEClass(LENKZIFFERNSTELLEN_TYPE_CLASS);
		createEAttribute(lenkziffernstellen_TypeClassEClass, LENKZIFFERNSTELLEN_TYPE_CLASS__WERT);

		personal_Reaktionszeit_TypeClassEClass = createEClass(PERSONAL_REAKTIONSZEIT_TYPE_CLASS);
		createEAttribute(personal_Reaktionszeit_TypeClassEClass, PERSONAL_REAKTIONSZEIT_TYPE_CLASS__WERT);

		sichtzeit_Vorsignal_TypeClassEClass = createEClass(SICHTZEIT_VORSIGNAL_TYPE_CLASS);
		createEAttribute(sichtzeit_Vorsignal_TypeClassEClass, SICHTZEIT_VORSIGNAL_TYPE_CLASS__WERT);

		signalgruppe_Bezeichner_TypeClassEClass = createEClass(SIGNALGRUPPE_BEZEICHNER_TYPE_CLASS);
		createEAttribute(signalgruppe_Bezeichner_TypeClassEClass, SIGNALGRUPPE_BEZEICHNER_TYPE_CLASS__WERT);

		tv_GK_TypeClassEClass = createEClass(TV_GK_TYPE_CLASS);
		createEAttribute(tv_GK_TypeClassEClass, TV_GK_TYPE_CLASS__WERT);

		vmax_Annaeherung_TypeClassEClass = createEClass(VMAX_ANNAEHERUNG_TYPE_CLASS);
		createEAttribute(vmax_Annaeherung_TypeClassEClass, VMAX_ANNAEHERUNG_TYPE_CLASS__WERT);

		zlEClass = createEClass(ZL);
		createEReference(zlEClass, ZL__IDESTW_ZENTRALEINHEIT);
		createEReference(zlEClass, ZL__IDZN);
		createEReference(zlEClass, ZL__ZL_ALLG);
		createEReference(zlEClass, ZL__ZLZN);

		zL_Allg_AttributeGroupEClass = createEClass(ZL_ALLG_ATTRIBUTE_GROUP);
		createEReference(zL_Allg_AttributeGroupEClass, ZL_ALLG_ATTRIBUTE_GROUP__ANZAHL_WIEDERHOL_ZL_ANSTOESSE);
		createEReference(zL_Allg_AttributeGroupEClass, ZL_ALLG_ATTRIBUTE_GROUP__DEADLOCKPRUEFUNG);
		createEReference(zL_Allg_AttributeGroupEClass, ZL_ALLG_ATTRIBUTE_GROUP__EINSTELLKONTROLLZEIT);
		createEReference(zL_Allg_AttributeGroupEClass, ZL_ALLG_ATTRIBUTE_GROUP__LENKABBRUCHZEIT);
		createEReference(zL_Allg_AttributeGroupEClass, ZL_ALLG_ATTRIBUTE_GROUP__PERSONAL_REAKTIONSZEIT);

		zL_DLP_AbschnittEClass = createEClass(ZL_DLP_ABSCHNITT);
		createEReference(zL_DLP_AbschnittEClass, ZL_DLP_ABSCHNITT__ID_GLEIS_ABSCHNITT);
		createEReference(zL_DLP_AbschnittEClass, ZL_DLP_ABSCHNITT__IDZLDLP_FSTR);

		zL_DLP_FstrEClass = createEClass(ZL_DLP_FSTR);
		createEReference(zL_DLP_FstrEClass, ZL_DLP_FSTR__IDZL_FSTR);

		zL_FstrEClass = createEClass(ZL_FSTR);
		createEReference(zL_FstrEClass, ZL_FSTR__ID_FSTR_ZUG_RANGIER);
		createEReference(zL_FstrEClass, ZL_FSTR__IDZL);
		createEReference(zL_FstrEClass, ZL_FSTR__IDZL_FSTR);
		createEReference(zL_FstrEClass, ZL_FSTR__ZL_FSTR_ALLG);

		zL_Fstr_Allg_AttributeGroupEClass = createEClass(ZL_FSTR_ALLG_ATTRIBUTE_GROUP);
		createEReference(zL_Fstr_Allg_AttributeGroupEClass, ZL_FSTR_ALLG_ATTRIBUTE_GROUP__ANNAEHERUNGSGESCHWINDIGKEIT);
		createEReference(zL_Fstr_Allg_AttributeGroupEClass, ZL_FSTR_ALLG_ATTRIBUTE_GROUP__DWEG_PRIO);
		createEReference(zL_Fstr_Allg_AttributeGroupEClass, ZL_FSTR_ALLG_ATTRIBUTE_GROUP__FUEM_AUSWERTUNG);
		createEReference(zL_Fstr_Allg_AttributeGroupEClass, ZL_FSTR_ALLG_ATTRIBUTE_GROUP__SICHTZEIT_VORSIGNAL);

		zL_Fstr_AnstossEClass = createEClass(ZL_FSTR_ANSTOSS);
		createEReference(zL_Fstr_AnstossEClass, ZL_FSTR_ANSTOSS__ID_EINSCHALTPUNKT);
		createEReference(zL_Fstr_AnstossEClass, ZL_FSTR_ANSTOSS__ID_VORSIGNAL);
		createEReference(zL_Fstr_AnstossEClass, ZL_FSTR_ANSTOSS__IDZL_FSTR);
		createEReference(zL_Fstr_AnstossEClass, ZL_FSTR_ANSTOSS__IDZN_ANZEIGEFELD_ANSTOSS);
		createEReference(zL_Fstr_AnstossEClass, ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_ALLG);
		createEReference(zL_Fstr_AnstossEClass, ZL_FSTR_ANSTOSS__ZL_FSTR_ANSTOSS_GK);

		zL_Fstr_Anstoss_Allg_AttributeGroupEClass = createEClass(ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP);
		createEReference(zL_Fstr_Anstoss_Allg_AttributeGroupEClass, ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__GKZSS);
		createEReference(zL_Fstr_Anstoss_Allg_AttributeGroupEClass, ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__VMAX_ANNAEHERUNG);
		createEReference(zL_Fstr_Anstoss_Allg_AttributeGroupEClass, ZL_FSTR_ANSTOSS_ALLG_ATTRIBUTE_GROUP__ZL_FSTR_ZUSCHLAG);

		zL_Fstr_Anstoss_GK_AttributeGroupEClass = createEClass(ZL_FSTR_ANSTOSS_GK_ATTRIBUTE_GROUP);
		createEReference(zL_Fstr_Anstoss_GK_AttributeGroupEClass, ZL_FSTR_ANSTOSS_GK_ATTRIBUTE_GROUP__GK);
		createEReference(zL_Fstr_Anstoss_GK_AttributeGroupEClass, ZL_FSTR_ANSTOSS_GK_ATTRIBUTE_GROUP__TV_GK);

		zL_Fstr_Zuschlag_TypeClassEClass = createEClass(ZL_FSTR_ZUSCHLAG_TYPE_CLASS);
		createEAttribute(zL_Fstr_Zuschlag_TypeClassEClass, ZL_FSTR_ZUSCHLAG_TYPE_CLASS__WERT);

		zL_SignalgruppeEClass = createEClass(ZL_SIGNALGRUPPE);
		createEReference(zL_SignalgruppeEClass, ZL_SIGNALGRUPPE__IDZL);
		createEReference(zL_SignalgruppeEClass, ZL_SIGNALGRUPPE__ZL_SIGNALGRUPPE_ALLG);

		zL_Signalgruppe_Allg_AttributeGroupEClass = createEClass(ZL_SIGNALGRUPPE_ALLG_ATTRIBUTE_GROUP);
		createEReference(zL_Signalgruppe_Allg_AttributeGroupEClass, ZL_SIGNALGRUPPE_ALLG_ATTRIBUTE_GROUP__SIGNALGRUPPE_BEZEICHNER);

		zL_Signalgruppe_ZuordnungEClass = createEClass(ZL_SIGNALGRUPPE_ZUORDNUNG);
		createEReference(zL_Signalgruppe_ZuordnungEClass, ZL_SIGNALGRUPPE_ZUORDNUNG__ID_SIGNAL);
		createEReference(zL_Signalgruppe_ZuordnungEClass, ZL_SIGNALGRUPPE_ZUORDNUNG__IDZL_SIGNALGRUPPE);

		zL_ZN_AttributeGroupEClass = createEClass(ZL_ZN_ATTRIBUTE_GROUP);
		createEReference(zL_ZN_AttributeGroupEClass, ZL_ZN_ATTRIBUTE_GROUP__LENKZIFFERNSTELLEN);
		createEReference(zL_ZN_AttributeGroupEClass, ZL_ZN_ATTRIBUTE_GROUP__ZN_STELLEN);

		zN_Stellen_TypeClassEClass = createEClass(ZN_STELLEN_TYPE_CLASS);
		createEAttribute(zN_Stellen_TypeClassEClass, ZN_STELLEN_TYPE_CLASS__WERT);

		// Create enums
		enumLenkziffernstellenEEnum = createEEnum(ENUM_LENKZIFFERNSTELLEN);
		enumznStellenEEnum = createEEnum(ENUMZN_STELLEN);

		// Create data types
		annaeherungsgeschwindigkeit_TypeEDataType = createEDataType(ANNAEHERUNGSGESCHWINDIGKEIT_TYPE);
		anzahl_Wiederhol_ZL_Anstoesse_TypeEDataType = createEDataType(ANZAHL_WIEDERHOL_ZL_ANSTOESSE_TYPE);
		dWeg_Prio_TypeEDataType = createEDataType(DWEG_PRIO_TYPE);
		einstellkontrollzeit_TypeEDataType = createEDataType(EINSTELLKONTROLLZEIT_TYPE);
		enumLenkziffernstellenObjectEDataType = createEDataType(ENUM_LENKZIFFERNSTELLEN_OBJECT);
		enumznStellenObjectEDataType = createEDataType(ENUMZN_STELLEN_OBJECT);
		gK_TypeEDataType = createEDataType(GK_TYPE);
		lenkabbruchzeit_TypeEDataType = createEDataType(LENKABBRUCHZEIT_TYPE);
		personal_Reaktionszeit_TypeEDataType = createEDataType(PERSONAL_REAKTIONSZEIT_TYPE);
		sichtzeit_Vorsignal_TypeEDataType = createEDataType(SICHTZEIT_VORSIGNAL_TYPE);
		signalgruppe_Bezeichner_TypeEDataType = createEDataType(SIGNALGRUPPE_BEZEICHNER_TYPE);
		tv_GK_TypeEDataType = createEDataType(TV_GK_TYPE);
		vmax_Annaeherung_TypeEDataType = createEDataType(VMAX_ANNAEHERUNG_TYPE);
		zL_Fstr_Zuschlag_TypeEDataType = createEDataType(ZL_FSTR_ZUSCHLAG_TYPE);
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
		annaeherungsgeschwindigkeit_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		anzahl_Wiederhol_ZL_Anstoesse_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		deadlockpruefung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		dWeg_Prio_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		einstellkontrollzeit_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		fueM_Auswertung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		gK_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		gkzsS_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		lenkabbruchzeit_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		lenkziffernstellen_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		personal_Reaktionszeit_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		sichtzeit_Vorsignal_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		signalgruppe_Bezeichner_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		tv_GK_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		vmax_Annaeherung_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		zlEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		zL_DLP_AbschnittEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		zL_DLP_FstrEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		zL_FstrEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		zL_Fstr_AnstossEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		zL_Fstr_Zuschlag_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		zL_SignalgruppeEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		zL_Signalgruppe_ZuordnungEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		zN_Stellen_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());

		// Initialize classes, features, and operations; add parameters
		initEClass(annaeherungsgeschwindigkeit_TypeClassEClass, Annaeherungsgeschwindigkeit_TypeClass.class, "Annaeherungsgeschwindigkeit_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnaeherungsgeschwindigkeit_TypeClass_Wert(), this.getAnnaeherungsgeschwindigkeit_Type(), "wert", null, 1, 1, Annaeherungsgeschwindigkeit_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(anzahl_Wiederhol_ZL_Anstoesse_TypeClassEClass, Anzahl_Wiederhol_ZL_Anstoesse_TypeClass.class, "Anzahl_Wiederhol_ZL_Anstoesse_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnzahl_Wiederhol_ZL_Anstoesse_TypeClass_Wert(), this.getAnzahl_Wiederhol_ZL_Anstoesse_Type(), "wert", null, 1, 1, Anzahl_Wiederhol_ZL_Anstoesse_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deadlockpruefung_TypeClassEClass, Deadlockpruefung_TypeClass.class, "Deadlockpruefung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeadlockpruefung_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Deadlockpruefung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dWeg_Prio_TypeClassEClass, DWeg_Prio_TypeClass.class, "DWeg_Prio_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDWeg_Prio_TypeClass_Wert(), this.getDWeg_Prio_Type(), "wert", null, 1, 1, DWeg_Prio_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(einstellkontrollzeit_TypeClassEClass, Einstellkontrollzeit_TypeClass.class, "Einstellkontrollzeit_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEinstellkontrollzeit_TypeClass_Wert(), this.getEinstellkontrollzeit_Type(), "wert", null, 1, 1, Einstellkontrollzeit_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fueM_Auswertung_TypeClassEClass, FUEM_Auswertung_TypeClass.class, "FUEM_Auswertung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFUEM_Auswertung_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, FUEM_Auswertung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gK_TypeClassEClass, GK_TypeClass.class, "GK_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGK_TypeClass_Wert(), this.getGK_Type(), "wert", null, 1, 1, GK_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gkzsS_TypeClassEClass, GKZSS_TypeClass.class, "GKZSS_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGKZSS_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, GKZSS_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lenkabbruchzeit_TypeClassEClass, Lenkabbruchzeit_TypeClass.class, "Lenkabbruchzeit_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLenkabbruchzeit_TypeClass_Wert(), this.getLenkabbruchzeit_Type(), "wert", null, 1, 1, Lenkabbruchzeit_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lenkziffernstellen_TypeClassEClass, Lenkziffernstellen_TypeClass.class, "Lenkziffernstellen_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLenkziffernstellen_TypeClass_Wert(), this.getENUMLenkziffernstellenObject(), "wert", null, 1, 1, Lenkziffernstellen_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personal_Reaktionszeit_TypeClassEClass, Personal_Reaktionszeit_TypeClass.class, "Personal_Reaktionszeit_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPersonal_Reaktionszeit_TypeClass_Wert(), this.getPersonal_Reaktionszeit_Type(), "wert", null, 1, 1, Personal_Reaktionszeit_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sichtzeit_Vorsignal_TypeClassEClass, Sichtzeit_Vorsignal_TypeClass.class, "Sichtzeit_Vorsignal_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSichtzeit_Vorsignal_TypeClass_Wert(), this.getSichtzeit_Vorsignal_Type(), "wert", null, 1, 1, Sichtzeit_Vorsignal_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(signalgruppe_Bezeichner_TypeClassEClass, Signalgruppe_Bezeichner_TypeClass.class, "Signalgruppe_Bezeichner_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSignalgruppe_Bezeichner_TypeClass_Wert(), this.getSignalgruppe_Bezeichner_Type(), "wert", null, 1, 1, Signalgruppe_Bezeichner_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tv_GK_TypeClassEClass, Tv_GK_TypeClass.class, "Tv_GK_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTv_GK_TypeClass_Wert(), this.getTv_GK_Type(), "wert", null, 1, 1, Tv_GK_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vmax_Annaeherung_TypeClassEClass, Vmax_Annaeherung_TypeClass.class, "Vmax_Annaeherung_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVmax_Annaeherung_TypeClass_Wert(), this.getVmax_Annaeherung_Type(), "wert", null, 1, 1, Vmax_Annaeherung_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zlEClass, org.eclipse.set.model.model1902.Zuglenkung.ZL.class, "ZL", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZL_IDESTWZentraleinheit(), theVerweisePackage.getID_ESTW_Zentraleinheit_TypeClass(), null, "iDESTWZentraleinheit", null, 0, 1, org.eclipse.set.model.model1902.Zuglenkung.ZL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZL_IDZN(), theVerweisePackage.getID_ZN_TypeClass(), null, "iDZN", null, 0, 1, org.eclipse.set.model.model1902.Zuglenkung.ZL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZL_ZLAllg(), this.getZL_Allg_AttributeGroup(), null, "zLAllg", null, 1, 1, org.eclipse.set.model.model1902.Zuglenkung.ZL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZL_ZLZN(), this.getZL_ZN_AttributeGroup(), null, "zLZN", null, 1, 1, org.eclipse.set.model.model1902.Zuglenkung.ZL.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zL_Allg_AttributeGroupEClass, ZL_Allg_AttributeGroup.class, "ZL_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZL_Allg_AttributeGroup_AnzahlWiederholZLAnstoesse(), this.getAnzahl_Wiederhol_ZL_Anstoesse_TypeClass(), null, "anzahlWiederholZLAnstoesse", null, 0, 1, ZL_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZL_Allg_AttributeGroup_Deadlockpruefung(), this.getDeadlockpruefung_TypeClass(), null, "deadlockpruefung", null, 0, 1, ZL_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZL_Allg_AttributeGroup_Einstellkontrollzeit(), this.getEinstellkontrollzeit_TypeClass(), null, "einstellkontrollzeit", null, 0, 1, ZL_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZL_Allg_AttributeGroup_Lenkabbruchzeit(), this.getLenkabbruchzeit_TypeClass(), null, "lenkabbruchzeit", null, 0, 1, ZL_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZL_Allg_AttributeGroup_PersonalReaktionszeit(), this.getPersonal_Reaktionszeit_TypeClass(), null, "personalReaktionszeit", null, 0, 1, ZL_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zL_DLP_AbschnittEClass, ZL_DLP_Abschnitt.class, "ZL_DLP_Abschnitt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZL_DLP_Abschnitt_IDGleisAbschnitt(), theVerweisePackage.getID_Gleis_Abschnitt_TypeClass(), null, "iDGleisAbschnitt", null, 1, 1, ZL_DLP_Abschnitt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZL_DLP_Abschnitt_IDZLDLPFstr(), theVerweisePackage.getID_ZL_DLP_Fstr_TypeClass(), null, "iDZLDLPFstr", null, 1, 1, ZL_DLP_Abschnitt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zL_DLP_FstrEClass, ZL_DLP_Fstr.class, "ZL_DLP_Fstr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZL_DLP_Fstr_IDZLFstr(), theVerweisePackage.getID_ZL_Fstr_TypeClass(), null, "iDZLFstr", null, 1, 1, ZL_DLP_Fstr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zL_FstrEClass, ZL_Fstr.class, "ZL_Fstr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZL_Fstr_IDFstrZugRangier(), theVerweisePackage.getID_Fstr_Zug_Rangier_TypeClass(), null, "iDFstrZugRangier", null, 0, 1, ZL_Fstr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZL_Fstr_IDZL(), theVerweisePackage.getID_ZL_TypeClass(), null, "iDZL", null, 1, 1, ZL_Fstr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZL_Fstr_IDZLFstr(), theVerweisePackage.getID_ZL_Fstr_TypeClass(), null, "iDZLFstr", null, 0, 1, ZL_Fstr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZL_Fstr_ZLFstrAllg(), this.getZL_Fstr_Allg_AttributeGroup(), null, "zLFstrAllg", null, 1, 1, ZL_Fstr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zL_Fstr_Allg_AttributeGroupEClass, ZL_Fstr_Allg_AttributeGroup.class, "ZL_Fstr_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZL_Fstr_Allg_AttributeGroup_Annaeherungsgeschwindigkeit(), this.getAnnaeherungsgeschwindigkeit_TypeClass(), null, "annaeherungsgeschwindigkeit", null, 0, 1, ZL_Fstr_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZL_Fstr_Allg_AttributeGroup_DWegPrio(), this.getDWeg_Prio_TypeClass(), null, "dWegPrio", null, 0, 1, ZL_Fstr_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZL_Fstr_Allg_AttributeGroup_FUEMAuswertung(), this.getFUEM_Auswertung_TypeClass(), null, "fUEMAuswertung", null, 0, 1, ZL_Fstr_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZL_Fstr_Allg_AttributeGroup_SichtzeitVorsignal(), this.getSichtzeit_Vorsignal_TypeClass(), null, "sichtzeitVorsignal", null, 1, 1, ZL_Fstr_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zL_Fstr_AnstossEClass, ZL_Fstr_Anstoss.class, "ZL_Fstr_Anstoss", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZL_Fstr_Anstoss_IDEinschaltpunkt(), theVerweisePackage.getID_Einschaltpunkt_TypeClass(), null, "iDEinschaltpunkt", null, 0, 1, ZL_Fstr_Anstoss.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZL_Fstr_Anstoss_IDVorsignal(), theVerweisePackage.getID_Signal_TypeClass(), null, "iDVorsignal", null, 0, 1, ZL_Fstr_Anstoss.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZL_Fstr_Anstoss_IDZLFstr(), theVerweisePackage.getID_ZL_Fstr_TypeClass(), null, "iDZLFstr", null, 1, 1, ZL_Fstr_Anstoss.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZL_Fstr_Anstoss_IDZNAnzeigefeldAnstoss(), theVerweisePackage.getID_ZN_Anzeigefeld_Anstoss_TypeClass(), null, "iDZNAnzeigefeldAnstoss", null, 0, 1, ZL_Fstr_Anstoss.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZL_Fstr_Anstoss_ZLFstrAnstossAllg(), this.getZL_Fstr_Anstoss_Allg_AttributeGroup(), null, "zLFstrAnstossAllg", null, 1, 1, ZL_Fstr_Anstoss.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZL_Fstr_Anstoss_ZLFstrAnstossGK(), this.getZL_Fstr_Anstoss_GK_AttributeGroup(), null, "zLFstrAnstossGK", null, 0, -1, ZL_Fstr_Anstoss.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zL_Fstr_Anstoss_Allg_AttributeGroupEClass, ZL_Fstr_Anstoss_Allg_AttributeGroup.class, "ZL_Fstr_Anstoss_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZL_Fstr_Anstoss_Allg_AttributeGroup_GKZSS(), this.getGKZSS_TypeClass(), null, "gKZSS", null, 0, 1, ZL_Fstr_Anstoss_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZL_Fstr_Anstoss_Allg_AttributeGroup_VmaxAnnaeherung(), this.getVmax_Annaeherung_TypeClass(), null, "vmaxAnnaeherung", null, 0, 1, ZL_Fstr_Anstoss_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZL_Fstr_Anstoss_Allg_AttributeGroup_ZLFstrZuschlag(), this.getZL_Fstr_Zuschlag_TypeClass(), null, "zLFstrZuschlag", null, 0, 1, ZL_Fstr_Anstoss_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zL_Fstr_Anstoss_GK_AttributeGroupEClass, ZL_Fstr_Anstoss_GK_AttributeGroup.class, "ZL_Fstr_Anstoss_GK_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZL_Fstr_Anstoss_GK_AttributeGroup_GK(), this.getGK_TypeClass(), null, "gK", null, 1, 1, ZL_Fstr_Anstoss_GK_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZL_Fstr_Anstoss_GK_AttributeGroup_TvGK(), this.getTv_GK_TypeClass(), null, "tvGK", null, 1, 1, ZL_Fstr_Anstoss_GK_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zL_Fstr_Zuschlag_TypeClassEClass, ZL_Fstr_Zuschlag_TypeClass.class, "ZL_Fstr_Zuschlag_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZL_Fstr_Zuschlag_TypeClass_Wert(), this.getZL_Fstr_Zuschlag_Type(), "wert", null, 1, 1, ZL_Fstr_Zuschlag_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zL_SignalgruppeEClass, ZL_Signalgruppe.class, "ZL_Signalgruppe", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZL_Signalgruppe_IDZL(), theVerweisePackage.getID_ZL_TypeClass(), null, "iDZL", null, 1, 1, ZL_Signalgruppe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZL_Signalgruppe_ZLSignalgruppeAllg(), this.getZL_Signalgruppe_Allg_AttributeGroup(), null, "zLSignalgruppeAllg", null, 1, 1, ZL_Signalgruppe.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zL_Signalgruppe_Allg_AttributeGroupEClass, ZL_Signalgruppe_Allg_AttributeGroup.class, "ZL_Signalgruppe_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZL_Signalgruppe_Allg_AttributeGroup_SignalgruppeBezeichner(), this.getSignalgruppe_Bezeichner_TypeClass(), null, "signalgruppeBezeichner", null, 0, 1, ZL_Signalgruppe_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zL_Signalgruppe_ZuordnungEClass, ZL_Signalgruppe_Zuordnung.class, "ZL_Signalgruppe_Zuordnung", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZL_Signalgruppe_Zuordnung_IDSignal(), theVerweisePackage.getID_Signal_TypeClass(), null, "iDSignal", null, 1, 1, ZL_Signalgruppe_Zuordnung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZL_Signalgruppe_Zuordnung_IDZLSignalgruppe(), theVerweisePackage.getID_ZL_Signalgruppe_TypeClass(), null, "iDZLSignalgruppe", null, 1, 1, ZL_Signalgruppe_Zuordnung.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zL_ZN_AttributeGroupEClass, ZL_ZN_AttributeGroup.class, "ZL_ZN_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getZL_ZN_AttributeGroup_Lenkziffernstellen(), this.getLenkziffernstellen_TypeClass(), null, "lenkziffernstellen", null, 0, 1, ZL_ZN_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getZL_ZN_AttributeGroup_ZNStellen(), this.getZN_Stellen_TypeClass(), null, "zNStellen", null, 0, 1, ZL_ZN_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(zN_Stellen_TypeClassEClass, ZN_Stellen_TypeClass.class, "ZN_Stellen_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getZN_Stellen_TypeClass_Wert(), this.getENUMZNStellenObject(), "wert", null, 1, 1, ZN_Stellen_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumLenkziffernstellenEEnum, ENUMLenkziffernstellen.class, "ENUMLenkziffernstellen");
		addEEnumLiteral(enumLenkziffernstellenEEnum, ENUMLenkziffernstellen.ENUM_LENKZIFFERNSTELLEN_0);
		addEEnumLiteral(enumLenkziffernstellenEEnum, ENUMLenkziffernstellen.ENUM_LENKZIFFERNSTELLEN_1);

		initEEnum(enumznStellenEEnum, ENUMZNStellen.class, "ENUMZNStellen");
		addEEnumLiteral(enumznStellenEEnum, ENUMZNStellen.ENUMZN_STELLEN_5);
		addEEnumLiteral(enumznStellenEEnum, ENUMZNStellen.ENUMZN_STELLEN_6);

		// Initialize data types
		initEDataType(annaeherungsgeschwindigkeit_TypeEDataType, BigInteger.class, "Annaeherungsgeschwindigkeit_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(anzahl_Wiederhol_ZL_Anstoesse_TypeEDataType, BigInteger.class, "Anzahl_Wiederhol_ZL_Anstoesse_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(dWeg_Prio_TypeEDataType, BigInteger.class, "DWeg_Prio_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(einstellkontrollzeit_TypeEDataType, BigDecimal.class, "Einstellkontrollzeit_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumLenkziffernstellenObjectEDataType, ENUMLenkziffernstellen.class, "ENUMLenkziffernstellenObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumznStellenObjectEDataType, ENUMZNStellen.class, "ENUMZNStellenObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(gK_TypeEDataType, BigInteger.class, "GK_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(lenkabbruchzeit_TypeEDataType, BigDecimal.class, "Lenkabbruchzeit_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(personal_Reaktionszeit_TypeEDataType, BigDecimal.class, "Personal_Reaktionszeit_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(sichtzeit_Vorsignal_TypeEDataType, BigDecimal.class, "Sichtzeit_Vorsignal_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(signalgruppe_Bezeichner_TypeEDataType, String.class, "Signalgruppe_Bezeichner_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(tv_GK_TypeEDataType, BigDecimal.class, "Tv_GK_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(vmax_Annaeherung_TypeEDataType, BigInteger.class, "Vmax_Annaeherung_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(zL_Fstr_Zuschlag_TypeEDataType, BigDecimal.class, "ZL_Fstr_Zuschlag_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
		  (zlEClass,
		   source,
		   new String[] {
			   "documentation", "Anlage zur automatischen Einstellung von Fahrstra\u00dfen aufgrund von Zuglaufinformationen. Die Zuglenkung ist eine Anlage, die der Unterst\u00fctzung des Betriebsablaufes dient. Aufgabe der Zuglenkung ist es, auf der Basis von Zuglaufinformationen und zugbezogenen Vorgaben f\u00fcr die Benutzung von Strecken- und Bahnhofsgleisen ohne unmittelbare Mitwirkung des Bedieners Stellkommandos an das zust\u00e4ndige Stellwerk auszugeben, ihre Ausf\u00fchrung zu \u00fcberwachen und sich aus Meldungen des Stellwerkes ergebenden Handlungsbedarf an den Bediener weiterzugeben. Zuglaufinformationen erh\u00e4lt die Zuglenkung von der Zuglaufverfolgung (ZLV), die vorgesehene Benutzung der Strecken- und Bahnhofsgleise sowie Wartebedingungen einschlie\u00dflich besonderer Bedingungen f\u00fcr die Regelung der Reihenfolge der Z\u00fcge aus einem sogenannten Lenkplan, der in Form einer Gleisbenutzungstabelle (GBT) darstellbar ist. Alle Signale und Fahrstra\u00dfen, die mit der Zuglenkung behandelt werden, werden in dem Objekt Zuglenkung_Element aufgenommen und bekommen dort zus\u00e4tzliche Eigenschaften f\u00fcr die Nutzung in der ZL. Angaben zur Verwendung der Signale und zugeh\u00f6rigen Gleisabschnitte f\u00fcr die Lenkplanerstellung erfolgen in der Gleisbenutzungstabelle. DB-Regelwerk 819.0732 Gleisbenutzungstabelle Weitere Angaben finden sich im Lastenheft, das dem LST-Fachplaner nicht zur Verf\u00fcgung steht."
		   });
		addAnnotation
		  (getZL_IDESTWZentraleinheit(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die ESTW-Zentraleinheit, zu der diese ZL geplant wurde. "
		   });
		addAnnotation
		  (getZL_IDZN(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die ZN, die zu dieser ZL geh\u00f6rt. ZL und ZN m\u00fcssen planerisch eine Einheit bilden, da die ZN-Anzeigefelder immer definierte Einschaltpunkte f\u00fcr die ZL sind. "
		   });
		addAnnotation
		  (getZL_Allg_AttributeGroup_AnzahlWiederholZLAnstoesse(),
		   source,
		   new String[] {
			   "documentation", "Anzahl erneuter Stellversuche nach negativer Stw-Quittung im Warteintervall von Standard 3-5 s nach positiver Stellbarkeitspr\u00fcfung der ZL. DB-Regelwerk 819.0732 5 (2) "
		   });
		addAnnotation
		  (getZL_Allg_AttributeGroup_Deadlockpruefung(),
		   source,
		   new String[] {
			   "documentation", "In der Zuglenkung ist eine Deadlockpr\u00fcfung (DLP) zu projektieren. Die Angabe, welche Gleisabschnitte in die Pr\u00fcfung einzubeziehen sind, erfolgt \u00fcber ein gesondertes Objekt. Die Objekt-Instanzen, die in die DLP einbezogen werden m\u00fcssen, werden mit den Objekten ZL DLP Fstr und ZL DLP Abschnitt festgelegt. DB-Regelwerk TM 2011-024 I.NVT3 (Fa. Thales) "
		   });
		addAnnotation
		  (getZL_Allg_AttributeGroup_Einstellkontrollzeit(),
		   source,
		   new String[] {
			   "documentation", "Pr\u00fcfung auf Fahrtstellung Signal nach Ansto\u00df innerhalb einer Zeit, bei Nicht-Fahrtstellung Lenkabbruch, Angabe in Sekunden, Standard 120 s. Der gew\u00e4hlte Wert muss gr\u00f6\u00dfer sein als die Summe aus Ansto\u00dfverz\u00f6gerung und Fahrstra\u00dfenbildungszeit. DB-Regelwerk 819.0732 5 (5) "
		   });
		addAnnotation
		  (getZL_Allg_AttributeGroup_Lenkabbruchzeit(),
		   source,
		   new String[] {
			   "documentation", "Zeit bis zum Lenkabbruch, wenn die zyklische Stellbarkeitspr\u00fcfung der ZL bis dahin negativ war. Der Standard-Wert betr\u00e4gt 600 s. Die Angabe in den Tools muss in Minuten erfolgen. DB-Regelwerk 819.0732 5 (5) "
		   });
		addAnnotation
		  (getZL_Allg_AttributeGroup_PersonalReaktionszeit(),
		   source,
		   new String[] {
			   "documentation", "Personalreaktionszeit, Angabe in Sekunden. Der Standardwert auf Hauptbahnen betr\u00e4gt 45 Sekunden, der Standardwert auf Nebenbahnen 15 Sekunden. Abweichungen sind m\u00f6glich, bed\u00fcrfen jedoch der betrieblichen Best\u00e4tigung."
		   });
		addAnnotation
		  (zL_DLP_AbschnittEClass,
		   source,
		   new String[] {
			   "documentation", "Sammlung der Gleisabschnitte, die in ZL DLP Fstr eingebunden werden und f\u00fcr die eine Pr\u00fcfung auf Deadlock erfolgen muss. DB-Regelwerk TM 2011-024 I.NVT 3 "
		   });
		addAnnotation
		  (getZL_DLP_Abschnitt_IDGleisAbschnitt(),
		   source,
		   new String[] {
			   "documentation", "Angabe, welcher Freimeldeabschnitt gepr\u00fcft werden muss."
		   });
		addAnnotation
		  (getZL_DLP_Abschnitt_IDZLDLPFstr(),
		   source,
		   new String[] {
			   "documentation", "Angabe der ZL DLP Fstr, f\u00fcr welche die Gleisabschnitte UND-verkn\u00fcpft werden m\u00fcssen. "
		   });
		addAnnotation
		  (zL_DLP_FstrEClass,
		   source,
		   new String[] {
			   "documentation", "Zuordnung von ZL-DLP-Abschnitten zur ZL-Fahrstra\u00dfe. DB-Regelwerk TM 2011-024 I.NVT 3 "
		   });
		addAnnotation
		  (getZL_DLP_Fstr_IDZLFstr(),
		   source,
		   new String[] {
			   "documentation", "Angabe der ZL_Fstr, f\u00fcr welche die DLP erfolgen soll. Die Angabe, zu welcher Betriebsstelle die ZL_Fstr geh\u00f6rt, ist \u00fcber die Zuordnung der Fstr_Zug_Rangier zur \u00d6rtlichkeit indirekt m\u00f6glich. Mehrere Instanzen mit der gleichen ZL_Fstr m\u00fcssen dann f\u00fcr die eigentliche systematische Pr\u00fcfung in der DLP ODER-verkn\u00fcpft werden. "
		   });
		addAnnotation
		  (zL_FstrEClass,
		   source,
		   new String[] {
			   "documentation", "Objekt zur Aufnahme verschiedener Anstosspunkte (mittels ZL Fstr Anstoss) abh\u00e4ngig von den zugeh\u00f6rigen Vorsignalen und den Geschwindigkeitsklassen f\u00fcr die ZL. \u00dcber den Verweis zur Fstr Zug Rangier ist die Verbindung zur Fstr des ESTW hergestellt. F\u00fcr eine Fstr des ESTW kann es mehrere ZL_Fstr geben, umgekehrt gilt dies nicht. DB-Regelwerk 819.0732 6 (1)b In der Tabelle der Zuglenkanst\u00f6\u00dfe entspricht eine Zeile einer ZL-Fahrstra\u00dfe. "
		   });
		addAnnotation
		  (getZL_Fstr_IDFstrZugRangier(),
		   source,
		   new String[] {
			   "documentation", "Verlinkung, zu welcher Fahrstra\u00dfe die ZL-Fahrstra\u00dfe geh\u00f6rt. "
		   });
		addAnnotation
		  (getZL_Fstr_IDZL(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die zugeh\u00f6rige ZL, dessen Bestandteil die ZL-Fahrstra\u00dfe ist. "
		   });
		addAnnotation
		  (getZL_Fstr_IDZLFstr(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf eine ZL_Fstr, die als Alternative f\u00fcr die urspr\u00fcnglich vorgesehene ZL_Fstr verwendet werden kann (in Tabelle ZL \u201eD-Weg_Prio\u201c). "
		   });
		addAnnotation
		  (getZL_Fstr_Allg_AttributeGroup_Annaeherungsgeschwindigkeit(),
		   source,
		   new String[] {
			   "documentation", "Geschwindigkeit, die der Berechnung des Ansto\u00dfzeitpunktes einer Fahrstra\u00dfe zugrunde liegt. Die genaue Verwendung des Begriffes ist momentan in der Abstimmung mit den Experten der ZL, da dort in den verschiedenen Bauformen unterschiedliche Philosophien umgesetzt wurden und die Lastenheft-Vorgabe nicht eindeutig ist. DB-Regelwerk Ermittlung gem\u00e4\u00df 819.0732 15"
		   });
		addAnnotation
		  (getZL_Fstr_Allg_AttributeGroup_DWegPrio(),
		   source,
		   new String[] {
			   "documentation", "D-Weg-Priorit\u00e4t f\u00fcr die vorgesehene ZL-Fahrstra\u00dfe, wenn diese aus betrieblichen Gr\u00fcnden gefordert wird. Es ist ein Zahlenwert von 0..4 einzutragen."
		   });
		addAnnotation
		  (getZL_Fstr_Allg_AttributeGroup_FUEMAuswertung(),
		   source,
		   new String[] {
			   "documentation", "Auswertung der FUEM bei der Einstellung der ZL-Fahrstra\u00dfe. Die F\u00dcM-Auswertung (blinkend) ist notwendig, wenn bei der vorhergehenden Fstr. ein B\u00dc enthalten ist, der zum Zeitpunkt des Fstr.-Ansto\u00dfes noch nicht geschlossen ist. DB-Regelwerk 819.0732 8 (3) "
		   });
		addAnnotation
		  (getZL_Fstr_Allg_AttributeGroup_SichtzeitVorsignal(),
		   source,
		   new String[] {
			   "documentation", "Angabe der Sichtzeit auf das Vorsignal in Sekunden, Standard 15 Sekunden. Der Wert kann projektabh\u00e4ngig ver\u00e4ndert werden. F\u00fcr ZL-Fahrstra\u00dfen, die kein Vorsignal haben (LZB-Blockkennzeichen) ist der Wert \u201e0\u201c anzugeben. DB-Regelwerk 819.0732 5 (2) 819.0732 11 (3) "
		   });
		addAnnotation
		  (zL_Fstr_AnstossEClass,
		   source,
		   new String[] {
			   "documentation", "Mit ZL_Fstr_Anstoss wird f\u00fcr eine Fahrstrasse der Zuglenkung der Anstosspunkt gebildet. Die f\u00fcr diese ZL-Fahrstra\u00dfe relevante(n) Geschwindigkeitsklasse(n) (GK) wird/werden \u00fcber die entsprechende Attributgruppe zugeordnet. DB-Regelwerk 819.0732 11 In der Tabelle der Zuglenkanst\u00f6\u00dfe findet sich die Angabe in der Spalte \\\"EP-MO\\\"."
		   });
		addAnnotation
		  (getZL_Fstr_Anstoss_IDEinschaltpunkt(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf ein Schaltmittel, welches als Ansto\u00df f\u00fcr die ZL-Fahrstra\u00dfe ausgewertet wird. Der Standort bzw. die Stationierung geht in die Berechnung einer Verz\u00f6gerungszeit ein. Das Attribut ist optional, da nicht f\u00fcr jede ZL-Fahrstra\u00dfe ein Schaltmittel ausgew\u00e4hlt werden kann (z. B. an Stellbereichsgrenzen). In dem Fall ist ein ZN_Anzeigefeld als Ansto\u00dfkriterium festzulegen. Einer von beiden Verweisen (ID_Einschaltpunkt oder ID ZN Anzeigefeld Anstoss) muss immer gef\u00fcllt sein."
		   });
		addAnnotation
		  (getZL_Fstr_Anstoss_IDVorsignal(),
		   source,
		   new String[] {
			   "documentation", "Standort der Vorsignalisierung des zu lenkenden Hauptsignals. Die Angabe ist notwendig f\u00fcr die Ermittlung des Sichtpunkts bei vorgegebener Sichtzeit. Es wird aus dem Objekt der Standort (km, Stationierung) ben\u00f6tigt. Der Verweis kann entfallen, wenn der Zug erst am zu lenkenden Hauptsignal startet oder das Startsignal ein LZB-Blockkennzeichen ist."
		   });
		addAnnotation
		  (getZL_Fstr_Anstoss_IDZLFstr(),
		   source,
		   new String[] {
			   "documentation", "Verlinkung, zu welcher ZL_Fstr dieser Ansto\u00df geh\u00f6rt. "
		   });
		addAnnotation
		  (getZL_Fstr_Anstoss_IDZNAnzeigefeldAnstoss(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf das ZN Anzeigefeld, aus dem der Ansto\u00df der ZL ausgel\u00f6st wird. Das Attribut ist optional, falls f\u00fcr einen ZL-Ansto\u00df kein geeignetes ZN-Anzeigefeld zur Verf\u00fcgung steht. In dem Fall ist ein Schaltmittel als Ansto\u00dfkriterium festzulegen. Einer von beiden Verweisen (ID Einschaltpunkt oder ID_ZN_Anzeigefeld_Anstoss) muss immer gef\u00fcllt sein."
		   });
		addAnnotation
		  (getZL_Fstr_Anstoss_Allg_AttributeGroup_GKZSS(),
		   source,
		   new String[] {
			   "documentation", "Der Ansto\u00df aus einem Zugbeeinflussungssystem (ETCS, LZB) ist m\u00f6glich. DB-Regelwerk 819.0732 13 "
		   });
		addAnnotation
		  (getZL_Fstr_Anstoss_Allg_AttributeGroup_VmaxAnnaeherung(),
		   source,
		   new String[] {
			   "documentation", "Zul\u00e4ssige H\u00f6chstgeschwindigkeit zwischen Vorsignal und berechnetem Einschaltpunkt."
		   });
		addAnnotation
		  (getZL_Fstr_Anstoss_Allg_AttributeGroup_ZLFstrZuschlag(),
		   source,
		   new String[] {
			   "documentation", "Zeitzuschlag f\u00fcr die Berechnung des Ansto\u00dfpunktes der ZL. Es kann sich die Notwendigkeit ergeben, eine Zeitspanne auf die bisher errechneten Zeiten (Sichtzeit Vorsignal, Fahrstra\u00dfenbildungszeit ...) aufzuschlagen, damit der ZL-Ansto\u00df fr\u00fcher erfolgt, als nach der allgemeinen Berechnungsregel vorgesehen. In einem Bearbeitungsvermerk ist daf\u00fcr eine Begr\u00fcndung anzugeben. Falls kein Zeitzuschlag erforderlich wird, ist das Attribut nicht zu bef\u00fcllen."
		   });
		addAnnotation
		  (getZL_Fstr_Anstoss_GK_AttributeGroup_GK(),
		   source,
		   new String[] {
			   "documentation", "Geschwindigkeitsklasse, f\u00fcr die die in Tv GK angegebene Geschwindigkeit gilt. F\u00fcr jede Geschwindigkeitsklasse (GK) ist eine Instanz der Attributgruppe ZL_Fstr_Anstoss_GK anzulegen. Bei der Festlegung von Geschwindigkeitsklassen sind herstellerspezifische Unterschiede zu beachten. DB-Regelwerk 819.0732 14 "
		   });
		addAnnotation
		  (getZL_Fstr_Anstoss_GK_AttributeGroup_TvGK(),
		   source,
		   new String[] {
			   "documentation", "Verz\u00f6gerungszeit f\u00fcr den ZL-Ansto\u00df. Ist keine tv erforderlich, ist \\\"0\\\" anzugeben. DB-Regelwerk 819.0732 8 (3) 819.0732 11 "
		   });
		addAnnotation
		  (zL_SignalgruppeEClass,
		   source,
		   new String[] {
			   "documentation", "Gruppe von Signalen (Haupt-, Sperrsignale), die von der Zug- bzw. Rangierlenkung f\u00fcr die Vorzugregelung ben\u00f6tigt wird. DB-Regelwerk 819.0732 A06 Im PT1 erfolgt die Angabe in einer gesonderten Tabelle, f\u00fcr die es im Regelwerk z. Zt. keine Vorgabe gibt."
		   });
		addAnnotation
		  (getZL_Signalgruppe_IDZL(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die zugeh\u00f6rige ZL, der die Signalgruppe zugeordnet ist. "
		   });
		addAnnotation
		  (getZL_Signalgruppe_Allg_AttributeGroup_SignalgruppeBezeichner(),
		   source,
		   new String[] {
			   "documentation", "Bezeichner der Signalgruppe f\u00fcr ZL und GBT. Die Bezeichnung ist mit dem Besteller abzustimmen."
		   });
		addAnnotation
		  (zL_Signalgruppe_ZuordnungEClass,
		   source,
		   new String[] {
			   "documentation", "Zuordnung von Signalen zur ZL Signalgruppe. DB-Regelwerk 819.0732 A06 Im PT1 erfolgt die Angabe in einer gesonderten Tabelle, f\u00fcr die es im Regelwerk z. Zt. keine Vorgabe gibt."
		   });
		addAnnotation
		  (getZL_Signalgruppe_Zuordnung_IDSignal(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf ein Signal, das der ZL_Signalgruppe zugeordnet wird."
		   });
		addAnnotation
		  (getZL_Signalgruppe_Zuordnung_IDZLSignalgruppe(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die ZL_Signalgruppe, zu der das zugeordnete Signal geh\u00f6rt."
		   });
		addAnnotation
		  (getZL_ZN_AttributeGroup_Lenkziffernstellen(),
		   source,
		   new String[] {
			   "documentation", "Stellen der Lenkziffern. Die Angabe ist notwendig, wenn die ZN bereits vorhanden ist und nicht neu geplant wird. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht enthalten. "
		   });
		addAnnotation
		  (getZL_ZN_AttributeGroup_ZNStellen(),
		   source,
		   new String[] {
			   "documentation", "Stellen der ZN. Die Angabe ist notwendig, wenn die ZN bereits vorhanden ist und nicht neu geplant wird. DB-Regelwerk Das Planungsdatum ist im Regelwerk der DB AG nicht zu finden. "
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
		  (annaeherungsgeschwindigkeit_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TAnnaeherungsgeschwindigkeit",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TGeschwindigkeit",
			   "pattern", "[4-9][0-9]|1[0-5][0-9]|160"
		   });
		addAnnotation
		  (annaeherungsgeschwindigkeit_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCAnnaeherungsgeschwindigkeit",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAnnaeherungsgeschwindigkeit_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (anzahl_Wiederhol_ZL_Anstoesse_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TAnzahl_Wiederhol_ZL_Anstoesse",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "pattern", "[1-9]|10"
		   });
		addAnnotation
		  (anzahl_Wiederhol_ZL_Anstoesse_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCAnzahl_Wiederhol_ZL_Anstoesse",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getAnzahl_Wiederhol_ZL_Anstoesse_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (deadlockpruefung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCDeadlockpruefung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDeadlockpruefung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (dWeg_Prio_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TDWeg_Prio",
			   "baseType", "http://www.eclipse.org/emf/2003/XMLType#integer",
			   "pattern", "[0-4]"
		   });
		addAnnotation
		  (dWeg_Prio_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCDWeg_Prio",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getDWeg_Prio_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (einstellkontrollzeit_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TEinstellkontrollzeit",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TSekunde",
			   "pattern", "[1-9][0-9]{0,1}|1[0-9]{2}|200"
		   });
		addAnnotation
		  (einstellkontrollzeit_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCEinstellkontrollzeit",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getEinstellkontrollzeit_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (enumLenkziffernstellenEEnum,
		   source,
		   new String[] {
			   "name", "ENUMLenkziffernstellen"
		   });
		addAnnotation
		  (enumLenkziffernstellenObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMLenkziffernstellen:Object",
			   "baseType", "ENUMLenkziffernstellen"
		   });
		addAnnotation
		  (enumznStellenEEnum,
		   source,
		   new String[] {
			   "name", "ENUMZN_Stellen"
		   });
		addAnnotation
		  (enumznStellenObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMZN_Stellen:Object",
			   "baseType", "ENUMZN_Stellen"
		   });
		addAnnotation
		  (fueM_Auswertung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCFUEM_Auswertung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getFUEM_Auswertung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (gK_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TGK",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TGeschwindigkeit",
			   "pattern", "[4-9][0-9]|1[0-5][0-9]|160"
		   });
		addAnnotation
		  (gK_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCGK",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGK_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (gkzsS_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCGKZSS",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGKZSS_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (lenkabbruchzeit_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TLenkabbruchzeit",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TSekunde",
			   "pattern", "0|[1-9][0-9]{0,2}|1[01][0-9]{2}|1200"
		   });
		addAnnotation
		  (lenkabbruchzeit_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCLenkabbruchzeit",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLenkabbruchzeit_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (lenkziffernstellen_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCLenkziffernstellen",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getLenkziffernstellen_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (personal_Reaktionszeit_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TPersonal_Reaktionszeit",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TSekunde",
			   "pattern", "1[5-9]|[23][0-9]|4[0-5]"
		   });
		addAnnotation
		  (personal_Reaktionszeit_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCPersonal_Reaktionszeit",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getPersonal_Reaktionszeit_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (sichtzeit_Vorsignal_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TSichtzeit_Vorsignal",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TSekunde",
			   "pattern", "0|1[0-9]|20"
		   });
		addAnnotation
		  (sichtzeit_Vorsignal_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCSichtzeit_Vorsignal",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSichtzeit_Vorsignal_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (signalgruppe_Bezeichner_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TSignalgruppe_Bezeichner",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TZeichenkette"
		   });
		addAnnotation
		  (signalgruppe_Bezeichner_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCSignalgruppe_Bezeichner",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSignalgruppe_Bezeichner_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (tv_GK_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TTv_GK",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TSekunde",
			   "pattern", "0|[1-9][0-9]{0,1}|[1-2][0-9]{2}|300"
		   });
		addAnnotation
		  (tv_GK_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTv_GK",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTv_GK_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (vmax_Annaeherung_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TVmax_Annaeherung",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TGeschwindigkeit"
		   });
		addAnnotation
		  (vmax_Annaeherung_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCVmax_Annaeherung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getVmax_Annaeherung_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (zlEClass,
		   source,
		   new String[] {
			   "name", "CZL",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZL_IDESTWZentraleinheit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ESTW_Zentraleinheit"
		   });
		addAnnotation
		  (getZL_IDZN(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ZN"
		   });
		addAnnotation
		  (getZL_ZLAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZL_Allg"
		   });
		addAnnotation
		  (getZL_ZLZN(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZL_ZN"
		   });
		addAnnotation
		  (zL_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CZL_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZL_Allg_AttributeGroup_AnzahlWiederholZLAnstoesse(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Anzahl_Wiederhol_ZL_Anstoesse"
		   });
		addAnnotation
		  (getZL_Allg_AttributeGroup_Deadlockpruefung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Deadlockpruefung"
		   });
		addAnnotation
		  (getZL_Allg_AttributeGroup_Einstellkontrollzeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Einstellkontrollzeit"
		   });
		addAnnotation
		  (getZL_Allg_AttributeGroup_Lenkabbruchzeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Lenkabbruchzeit"
		   });
		addAnnotation
		  (getZL_Allg_AttributeGroup_PersonalReaktionszeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Personal_Reaktionszeit"
		   });
		addAnnotation
		  (zL_DLP_AbschnittEClass,
		   source,
		   new String[] {
			   "name", "CZL_DLP_Abschnitt",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZL_DLP_Abschnitt_IDGleisAbschnitt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Gleis_Abschnitt"
		   });
		addAnnotation
		  (getZL_DLP_Abschnitt_IDZLDLPFstr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ZL_DLP_Fstr"
		   });
		addAnnotation
		  (zL_DLP_FstrEClass,
		   source,
		   new String[] {
			   "name", "CZL_DLP_Fstr",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZL_DLP_Fstr_IDZLFstr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ZL_Fstr"
		   });
		addAnnotation
		  (zL_FstrEClass,
		   source,
		   new String[] {
			   "name", "CZL_Fstr",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZL_Fstr_IDFstrZugRangier(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Fstr_Zug_Rangier"
		   });
		addAnnotation
		  (getZL_Fstr_IDZL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ZL"
		   });
		addAnnotation
		  (getZL_Fstr_IDZLFstr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ZL_Fstr"
		   });
		addAnnotation
		  (getZL_Fstr_ZLFstrAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZL_Fstr_Allg"
		   });
		addAnnotation
		  (zL_Fstr_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CZL_Fstr_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZL_Fstr_Allg_AttributeGroup_Annaeherungsgeschwindigkeit(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Annaeherungsgeschwindigkeit"
		   });
		addAnnotation
		  (getZL_Fstr_Allg_AttributeGroup_DWegPrio(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "DWeg_Prio"
		   });
		addAnnotation
		  (getZL_Fstr_Allg_AttributeGroup_FUEMAuswertung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "FUEM_Auswertung"
		   });
		addAnnotation
		  (getZL_Fstr_Allg_AttributeGroup_SichtzeitVorsignal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Sichtzeit_Vorsignal"
		   });
		addAnnotation
		  (zL_Fstr_AnstossEClass,
		   source,
		   new String[] {
			   "name", "CZL_Fstr_Anstoss",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZL_Fstr_Anstoss_IDEinschaltpunkt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Einschaltpunkt"
		   });
		addAnnotation
		  (getZL_Fstr_Anstoss_IDVorsignal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Vorsignal"
		   });
		addAnnotation
		  (getZL_Fstr_Anstoss_IDZLFstr(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ZL_Fstr"
		   });
		addAnnotation
		  (getZL_Fstr_Anstoss_IDZNAnzeigefeldAnstoss(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ZN_Anzeigefeld_Anstoss"
		   });
		addAnnotation
		  (getZL_Fstr_Anstoss_ZLFstrAnstossAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZL_Fstr_Anstoss_Allg"
		   });
		addAnnotation
		  (getZL_Fstr_Anstoss_ZLFstrAnstossGK(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZL_Fstr_Anstoss_GK"
		   });
		addAnnotation
		  (zL_Fstr_Anstoss_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CZL_Fstr_Anstoss_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZL_Fstr_Anstoss_Allg_AttributeGroup_GKZSS(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GKZSS"
		   });
		addAnnotation
		  (getZL_Fstr_Anstoss_Allg_AttributeGroup_VmaxAnnaeherung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Vmax_Annaeherung"
		   });
		addAnnotation
		  (getZL_Fstr_Anstoss_Allg_AttributeGroup_ZLFstrZuschlag(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZL_Fstr_Zuschlag"
		   });
		addAnnotation
		  (zL_Fstr_Anstoss_GK_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CZL_Fstr_Anstoss_GK",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZL_Fstr_Anstoss_GK_AttributeGroup_GK(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "GK"
		   });
		addAnnotation
		  (getZL_Fstr_Anstoss_GK_AttributeGroup_TvGK(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Tv_GK"
		   });
		addAnnotation
		  (zL_Fstr_Zuschlag_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TZL_Fstr_Zuschlag",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.9.0.2#TSekunde"
		   });
		addAnnotation
		  (zL_Fstr_Zuschlag_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCZL_Fstr_Zuschlag",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZL_Fstr_Zuschlag_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (zL_SignalgruppeEClass,
		   source,
		   new String[] {
			   "name", "CZL_Signalgruppe",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZL_Signalgruppe_IDZL(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ZL"
		   });
		addAnnotation
		  (getZL_Signalgruppe_ZLSignalgruppeAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZL_Signalgruppe_Allg"
		   });
		addAnnotation
		  (zL_Signalgruppe_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CZL_Signalgruppe_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZL_Signalgruppe_Allg_AttributeGroup_SignalgruppeBezeichner(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Signalgruppe_Bezeichner"
		   });
		addAnnotation
		  (zL_Signalgruppe_ZuordnungEClass,
		   source,
		   new String[] {
			   "name", "CZL_Signalgruppe_Zuordnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZL_Signalgruppe_Zuordnung_IDSignal(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Signal"
		   });
		addAnnotation
		  (getZL_Signalgruppe_Zuordnung_IDZLSignalgruppe(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_ZL_Signalgruppe"
		   });
		addAnnotation
		  (zL_ZN_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CZL_ZN",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZL_ZN_AttributeGroup_Lenkziffernstellen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Lenkziffernstellen"
		   });
		addAnnotation
		  (getZL_ZN_AttributeGroup_ZNStellen(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ZN_Stellen"
		   });
		addAnnotation
		  (zN_Stellen_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCZN_Stellen",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getZN_Stellen_TypeClass_Wert(),
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
		  (zlEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n            <ppi:WorkflowInformation>\r\n               <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n            </ppi:WorkflowInformation>\r\n         "
		   });
		addAnnotation
		  (getZL_Allg_AttributeGroup_AnzahlWiederholZLAnstoesse(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:ProposedValue>1</ppi:ProposedValue>\r\n                     <ppi:PlanningStage>PT1</ppi:PlanningStage>\r\n                     <ppi:Patternbeschreibung> [1..10] </ppi:Patternbeschreibung>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (getZL_Allg_AttributeGroup_Deadlockpruefung(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:ProposedValue>false</ppi:ProposedValue>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (getZL_Allg_AttributeGroup_Einstellkontrollzeit(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:ProposedValue>120</ppi:ProposedValue>\r\n                     <ppi:PlanningStage>PT1</ppi:PlanningStage>\r\n                     <ppi:Patternbeschreibung> [1..200] </ppi:Patternbeschreibung>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (getZL_Allg_AttributeGroup_Lenkabbruchzeit(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:ProposedValue>600</ppi:ProposedValue>\r\n                     <ppi:PlanningStage>PT1</ppi:PlanningStage>\r\n                     <ppi:Patternbeschreibung> [0..1200] </ppi:Patternbeschreibung>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (getZL_Allg_AttributeGroup_PersonalReaktionszeit(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:ProposedValue>45</ppi:ProposedValue>\r\n                     <ppi:PlanningStage>PT1</ppi:PlanningStage>\r\n                     <ppi:Patternbeschreibung> [15..45] </ppi:Patternbeschreibung>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (zL_DLP_AbschnittEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n            <ppi:WorkflowInformation>\r\n               <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n            </ppi:WorkflowInformation>\r\n         "
		   });
		addAnnotation
		  (zL_DLP_FstrEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n            <ppi:WorkflowInformation>\r\n               <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n            </ppi:WorkflowInformation>\r\n         "
		   });
		addAnnotation
		  (zL_FstrEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n            <ppi:WorkflowInformation>\r\n               <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n            </ppi:WorkflowInformation>\r\n         "
		   });
		addAnnotation
		  (getZL_Fstr_Allg_AttributeGroup_Annaeherungsgeschwindigkeit(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:Patternbeschreibung> [40..160] </ppi:Patternbeschreibung>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (getZL_Fstr_Allg_AttributeGroup_DWegPrio(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:Patternbeschreibung>[0..4]</ppi:Patternbeschreibung>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (getZL_Fstr_Allg_AttributeGroup_FUEMAuswertung(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:ProposedValue>false</ppi:ProposedValue>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (getZL_Fstr_Allg_AttributeGroup_SichtzeitVorsignal(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:ProposedValue>15</ppi:ProposedValue>\r\n                     <ppi:PlanningStage>PT1</ppi:PlanningStage>\r\n                     <ppi:Patternbeschreibung>0,[10..20] </ppi:Patternbeschreibung>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (zL_Fstr_AnstossEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n            <ppi:WorkflowInformation>\r\n               <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n            </ppi:WorkflowInformation>\r\n         "
		   });
		addAnnotation
		  (getZL_Fstr_Anstoss_GK_AttributeGroup_GK(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:Patternbeschreibung> [40..160] </ppi:Patternbeschreibung>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (getZL_Fstr_Anstoss_GK_AttributeGroup_TvGK(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:Patternbeschreibung> [0..300] </ppi:Patternbeschreibung>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (zL_SignalgruppeEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n            <ppi:WorkflowInformation>\r\n               <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n            </ppi:WorkflowInformation>\r\n         "
		   });
		addAnnotation
		  (getZL_Signalgruppe_Allg_AttributeGroup_SignalgruppeBezeichner(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:PlanningStage>PT1</ppi:PlanningStage>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (zL_Signalgruppe_ZuordnungEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n            <ppi:WorkflowInformation>\r\n               <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n            </ppi:WorkflowInformation>\r\n         "
		   });
		addAnnotation
		  (getZL_ZN_AttributeGroup_Lenkziffernstellen(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:ProposedValue>0</ppi:ProposedValue>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
		addAnnotation
		  (getZL_ZN_AttributeGroup_ZNStellen(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                  <ppi:WorkflowInformation>\r\n                     <ppi:ProposedValue>5</ppi:ProposedValue>\r\n                  </ppi:WorkflowInformation>\r\n               "
		   });
	}

} //ZuglenkungPackageImpl
