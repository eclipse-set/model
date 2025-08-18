/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.impl;

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

import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.BUE_Lage_TypeClass;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Bedienung_Art_TypeClass;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Beschreibung_Sonderanlage_TypeClass;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Bezeichnung_Schloss_TypeClass;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Bezeichnung_Schluessel_TypeClass;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Bezeichnung_Sk_TypeClass;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.ENUMBUELage;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.ENUMBedienungArt;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.ENUMGspLage;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.ENUMSchlossArt;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.ENUMSchluesselBartform;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.ENUMSchluesselGruppe;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.ENUMSonderanlageLage;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.ENUMVerschlussOrt;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Gsp_Lage_TypeClass;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Hauptschloss_TypeClass;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss_Art_TypeClass;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss_BUE_AttributeGroup;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss_Gsp_AttributeGroup;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss_Sk_AttributeGroup;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss_Sonderanlage_AttributeGroup;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss_Ssp_AttributeGroup;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schloss_W_AttributeGroup;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schlosskombination;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schlosskombination_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schluessel;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schluessel_Allg_AttributeGroup;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schluessel_Bartform_TypeClass;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schluessel_Bezeichnung_AttributeGroup;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schluessel_Gruppe_TypeClass;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schluessel_In_Grdst_Eingeschl_TypeClass;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenFactory;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Schluesselsperre;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Sonderanlage_Lage_TypeClass;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Technisch_Berechtigter_TypeClass;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.Verschluss_Ort_TypeClass;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.W_Anbaulage_TypeClass;
import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.W_Lage_TypeClass;

import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.util.SchluesselabhaengigkeitenValidator;

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
public class SchluesselabhaengigkeitenPackageImpl extends EPackageImpl implements SchluesselabhaengigkeitenPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bedienung_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass beschreibung_Sonderanlage_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_Schloss_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_Schluessel_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bezeichnung_Sk_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass buE_Lage_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gsp_Lage_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hauptschloss_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schlossEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schloss_Art_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schloss_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schloss_BUE_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schloss_Gsp_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schloss_Sk_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schloss_Sonderanlage_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schloss_Ssp_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schloss_W_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schlosskombinationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schlosskombination_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schluesselEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schluessel_Allg_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schluessel_Bartform_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schluessel_Bezeichnung_AttributeGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schluessel_Gruppe_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schluessel_In_Grdst_Eingeschl_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schluesselsperreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sonderanlage_Lage_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass technisch_Berechtigter_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass verschluss_Ort_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass w_Anbaulage_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass w_Lage_TypeClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumBedienungArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumbueLageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumGspLageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumSchlossArtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumSchluesselBartformEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumSchluesselGruppeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumSonderanlageLageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum enumVerschlussOrtEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType beschreibung_Sonderanlage_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_Schloss_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_Schluessel_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bezeichnung_Sk_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumBedienungArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumbueLageObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumGspLageObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumSchlossArtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumSchluesselBartformObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumSchluesselGruppeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumSonderanlageLageObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType enumVerschlussOrtObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType w_Anbaulage_TypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType w_Lage_TypeEDataType = null;

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
	 * @see org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SchluesselabhaengigkeitenPackageImpl() {
		super(eNS_URI, SchluesselabhaengigkeitenFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link SchluesselabhaengigkeitenPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SchluesselabhaengigkeitenPackage init() {
		if (isInited) return (SchluesselabhaengigkeitenPackage)EPackage.Registry.INSTANCE.getEPackage(SchluesselabhaengigkeitenPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSchluesselabhaengigkeitenPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SchluesselabhaengigkeitenPackageImpl theSchluesselabhaengigkeitenPackage = registeredSchluesselabhaengigkeitenPackage instanceof SchluesselabhaengigkeitenPackageImpl ? (SchluesselabhaengigkeitenPackageImpl)registeredSchluesselabhaengigkeitenPackage : new SchluesselabhaengigkeitenPackageImpl();

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
		theSchluesselabhaengigkeitenPackage.createPackageContents();
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
		theSignalePackage.createPackageContents();
		theSignalbegriffe_StrukturPackage.createPackageContents();
		theZuglenkungPackage.createPackageContents();
		theZugnummernmeldeanlagePackage.createPackageContents();
		theLayoutinformationenPackage.createPackageContents();

		// Initialize created meta-data
		theSchluesselabhaengigkeitenPackage.initializePackageContents();
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
			(theSchluesselabhaengigkeitenPackage,
			 new EValidator.Descriptor() {
				 @Override
				 public EValidator getEValidator() {
					 return SchluesselabhaengigkeitenValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theSchluesselabhaengigkeitenPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SchluesselabhaengigkeitenPackage.eNS_URI, theSchluesselabhaengigkeitenPackage);
		return theSchluesselabhaengigkeitenPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBedienung_Art_TypeClass() {
		return bedienung_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBedienung_Art_TypeClass_Wert() {
		return (EAttribute)bedienung_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBeschreibung_Sonderanlage_TypeClass() {
		return beschreibung_Sonderanlage_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBeschreibung_Sonderanlage_TypeClass_Wert() {
		return (EAttribute)beschreibung_Sonderanlage_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_Schloss_TypeClass() {
		return bezeichnung_Schloss_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_Schloss_TypeClass_Wert() {
		return (EAttribute)bezeichnung_Schloss_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_Schluessel_TypeClass() {
		return bezeichnung_Schluessel_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_Schluessel_TypeClass_Wert() {
		return (EAttribute)bezeichnung_Schluessel_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBezeichnung_Sk_TypeClass() {
		return bezeichnung_Sk_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBezeichnung_Sk_TypeClass_Wert() {
		return (EAttribute)bezeichnung_Sk_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBUE_Lage_TypeClass() {
		return buE_Lage_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBUE_Lage_TypeClass_Wert() {
		return (EAttribute)buE_Lage_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGsp_Lage_TypeClass() {
		return gsp_Lage_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGsp_Lage_TypeClass_Wert() {
		return (EAttribute)gsp_Lage_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHauptschloss_TypeClass() {
		return hauptschloss_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHauptschloss_TypeClass_Wert() {
		return (EAttribute)hauptschloss_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchloss() {
		return schlossEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchloss_Bezeichnung() {
		return (EReference)schlossEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchloss_IDSchluessel() {
		return (EReference)schlossEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchloss_SchluesselInGrdstEingeschl() {
		return (EReference)schlossEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchloss_SchlossBUE() {
		return (EReference)schlossEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchloss_SchlossGsp() {
		return (EReference)schlossEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchloss_SchlossSk() {
		return (EReference)schlossEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchloss_SchlossSonderanlage() {
		return (EReference)schlossEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchloss_SchlossSsp() {
		return (EReference)schlossEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchloss_SchlossW() {
		return (EReference)schlossEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchloss_TechnischBerechtigter() {
		return (EReference)schlossEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchloss_Art_TypeClass() {
		return schloss_Art_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchloss_Art_TypeClass_Wert() {
		return (EAttribute)schloss_Art_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchloss_Bezeichnung_AttributeGroup() {
		return schloss_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchloss_Bezeichnung_AttributeGroup_BezeichnungSchloss() {
		return (EReference)schloss_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchloss_BUE_AttributeGroup() {
		return schloss_BUE_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchloss_BUE_AttributeGroup_BUELage() {
		return (EReference)schloss_BUE_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchloss_BUE_AttributeGroup_IDBUEAnlage() {
		return (EReference)schloss_BUE_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchloss_Gsp_AttributeGroup() {
		return schloss_Gsp_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchloss_Gsp_AttributeGroup_GspLage() {
		return (EReference)schloss_Gsp_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchloss_Gsp_AttributeGroup_IDGspElement() {
		return (EReference)schloss_Gsp_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchloss_Sk_AttributeGroup() {
		return schloss_Sk_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchloss_Sk_AttributeGroup_Hauptschloss() {
		return (EReference)schloss_Sk_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchloss_Sk_AttributeGroup_IDSchlosskombination() {
		return (EReference)schloss_Sk_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchloss_Sonderanlage_AttributeGroup() {
		return schloss_Sonderanlage_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchloss_Sonderanlage_AttributeGroup_SonderanlageLage() {
		return (EReference)schloss_Sonderanlage_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchloss_Sonderanlage_AttributeGroup_BeschreibungSonderanlage() {
		return (EReference)schloss_Sonderanlage_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchloss_Sonderanlage_AttributeGroup_IDSonderanlage() {
		return (EReference)schloss_Sonderanlage_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchloss_Ssp_AttributeGroup() {
		return schloss_Ssp_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchloss_Ssp_AttributeGroup_IDSchluesselsperre() {
		return (EReference)schloss_Ssp_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchloss_W_AttributeGroup() {
		return schloss_W_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchloss_W_AttributeGroup_IDWKrElement() {
		return (EReference)schloss_W_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchloss_W_AttributeGroup_SchlossArt() {
		return (EReference)schloss_W_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchloss_W_AttributeGroup_VerschlussOrt() {
		return (EReference)schloss_W_AttributeGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchloss_W_AttributeGroup_WAnbaulage() {
		return (EReference)schloss_W_AttributeGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchloss_W_AttributeGroup_WLage() {
		return (EReference)schloss_W_AttributeGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchlosskombination() {
		return schlosskombinationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchlosskombination_Bezeichnung() {
		return (EReference)schlosskombinationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchlosskombination_IDUnterbringung() {
		return (EReference)schlosskombinationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchlosskombination_Bezeichnung_AttributeGroup() {
		return schlosskombination_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchlosskombination_Bezeichnung_AttributeGroup_BezeichnungSk() {
		return (EReference)schlosskombination_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchluessel() {
		return schluesselEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchluessel_Bezeichnung() {
		return (EReference)schluesselEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchluessel_SchluesselAllg() {
		return (EReference)schluesselEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchluessel_Allg_AttributeGroup() {
		return schluessel_Allg_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchluessel_Allg_AttributeGroup_SchluesselBartform() {
		return (EReference)schluessel_Allg_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchluessel_Allg_AttributeGroup_SchluesselGruppe() {
		return (EReference)schluessel_Allg_AttributeGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchluessel_Bartform_TypeClass() {
		return schluessel_Bartform_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchluessel_Bartform_TypeClass_Wert() {
		return (EAttribute)schluessel_Bartform_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchluessel_Bezeichnung_AttributeGroup() {
		return schluessel_Bezeichnung_AttributeGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchluessel_Bezeichnung_AttributeGroup_BezeichnungSchluessel() {
		return (EReference)schluessel_Bezeichnung_AttributeGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchluessel_Gruppe_TypeClass() {
		return schluessel_Gruppe_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchluessel_Gruppe_TypeClass_Wert() {
		return (EAttribute)schluessel_Gruppe_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchluessel_In_Grdst_Eingeschl_TypeClass() {
		return schluessel_In_Grdst_Eingeschl_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSchluessel_In_Grdst_Eingeschl_TypeClass_Wert() {
		return (EAttribute)schluessel_In_Grdst_Eingeschl_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSchluesselsperre() {
		return schluesselsperreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchluesselsperre_BedienungArt() {
		return (EReference)schluesselsperreEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchluesselsperre_Bezeichnung() {
		return (EReference)schluesselsperreEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchluesselsperre_IDStellelement() {
		return (EReference)schluesselsperreEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSchluesselsperre_IDUnterbringung() {
		return (EReference)schluesselsperreEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSonderanlage_Lage_TypeClass() {
		return sonderanlage_Lage_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSonderanlage_Lage_TypeClass_Wert() {
		return (EAttribute)sonderanlage_Lage_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTechnisch_Berechtigter_TypeClass() {
		return technisch_Berechtigter_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTechnisch_Berechtigter_TypeClass_Wert() {
		return (EAttribute)technisch_Berechtigter_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVerschluss_Ort_TypeClass() {
		return verschluss_Ort_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVerschluss_Ort_TypeClass_Wert() {
		return (EAttribute)verschluss_Ort_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getW_Anbaulage_TypeClass() {
		return w_Anbaulage_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getW_Anbaulage_TypeClass_Wert() {
		return (EAttribute)w_Anbaulage_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getW_Lage_TypeClass() {
		return w_Lage_TypeClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getW_Lage_TypeClass_Wert() {
		return (EAttribute)w_Lage_TypeClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMBedienungArt() {
		return enumBedienungArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMBUELage() {
		return enumbueLageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMGspLage() {
		return enumGspLageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMSchlossArt() {
		return enumSchlossArtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMSchluesselBartform() {
		return enumSchluesselBartformEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMSchluesselGruppe() {
		return enumSchluesselGruppeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMSonderanlageLage() {
		return enumSonderanlageLageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getENUMVerschlussOrt() {
		return enumVerschlussOrtEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBeschreibung_Sonderanlage_Type() {
		return beschreibung_Sonderanlage_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_Schloss_Type() {
		return bezeichnung_Schloss_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_Schluessel_Type() {
		return bezeichnung_Schluessel_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getBezeichnung_Sk_Type() {
		return bezeichnung_Sk_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMBedienungArtObject() {
		return enumBedienungArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMBUELageObject() {
		return enumbueLageObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMGspLageObject() {
		return enumGspLageObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMSchlossArtObject() {
		return enumSchlossArtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMSchluesselBartformObject() {
		return enumSchluesselBartformObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMSchluesselGruppeObject() {
		return enumSchluesselGruppeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMSonderanlageLageObject() {
		return enumSonderanlageLageObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getENUMVerschlussOrtObject() {
		return enumVerschlussOrtObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getW_Anbaulage_Type() {
		return w_Anbaulage_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getW_Lage_Type() {
		return w_Lage_TypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SchluesselabhaengigkeitenFactory getSchluesselabhaengigkeitenFactory() {
		return (SchluesselabhaengigkeitenFactory)getEFactoryInstance();
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
		bedienung_Art_TypeClassEClass = createEClass(BEDIENUNG_ART_TYPE_CLASS);
		createEAttribute(bedienung_Art_TypeClassEClass, BEDIENUNG_ART_TYPE_CLASS__WERT);

		beschreibung_Sonderanlage_TypeClassEClass = createEClass(BESCHREIBUNG_SONDERANLAGE_TYPE_CLASS);
		createEAttribute(beschreibung_Sonderanlage_TypeClassEClass, BESCHREIBUNG_SONDERANLAGE_TYPE_CLASS__WERT);

		bezeichnung_Schloss_TypeClassEClass = createEClass(BEZEICHNUNG_SCHLOSS_TYPE_CLASS);
		createEAttribute(bezeichnung_Schloss_TypeClassEClass, BEZEICHNUNG_SCHLOSS_TYPE_CLASS__WERT);

		bezeichnung_Schluessel_TypeClassEClass = createEClass(BEZEICHNUNG_SCHLUESSEL_TYPE_CLASS);
		createEAttribute(bezeichnung_Schluessel_TypeClassEClass, BEZEICHNUNG_SCHLUESSEL_TYPE_CLASS__WERT);

		bezeichnung_Sk_TypeClassEClass = createEClass(BEZEICHNUNG_SK_TYPE_CLASS);
		createEAttribute(bezeichnung_Sk_TypeClassEClass, BEZEICHNUNG_SK_TYPE_CLASS__WERT);

		buE_Lage_TypeClassEClass = createEClass(BUE_LAGE_TYPE_CLASS);
		createEAttribute(buE_Lage_TypeClassEClass, BUE_LAGE_TYPE_CLASS__WERT);

		gsp_Lage_TypeClassEClass = createEClass(GSP_LAGE_TYPE_CLASS);
		createEAttribute(gsp_Lage_TypeClassEClass, GSP_LAGE_TYPE_CLASS__WERT);

		hauptschloss_TypeClassEClass = createEClass(HAUPTSCHLOSS_TYPE_CLASS);
		createEAttribute(hauptschloss_TypeClassEClass, HAUPTSCHLOSS_TYPE_CLASS__WERT);

		schlossEClass = createEClass(SCHLOSS);
		createEReference(schlossEClass, SCHLOSS__BEZEICHNUNG);
		createEReference(schlossEClass, SCHLOSS__ID_SCHLUESSEL);
		createEReference(schlossEClass, SCHLOSS__SCHLUESSEL_IN_GRDST_EINGESCHL);
		createEReference(schlossEClass, SCHLOSS__SCHLOSS_BUE);
		createEReference(schlossEClass, SCHLOSS__SCHLOSS_GSP);
		createEReference(schlossEClass, SCHLOSS__SCHLOSS_SK);
		createEReference(schlossEClass, SCHLOSS__SCHLOSS_SONDERANLAGE);
		createEReference(schlossEClass, SCHLOSS__SCHLOSS_SSP);
		createEReference(schlossEClass, SCHLOSS__SCHLOSS_W);
		createEReference(schlossEClass, SCHLOSS__TECHNISCH_BERECHTIGTER);

		schloss_Art_TypeClassEClass = createEClass(SCHLOSS_ART_TYPE_CLASS);
		createEAttribute(schloss_Art_TypeClassEClass, SCHLOSS_ART_TYPE_CLASS__WERT);

		schloss_Bezeichnung_AttributeGroupEClass = createEClass(SCHLOSS_BEZEICHNUNG_ATTRIBUTE_GROUP);
		createEReference(schloss_Bezeichnung_AttributeGroupEClass, SCHLOSS_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SCHLOSS);

		schloss_BUE_AttributeGroupEClass = createEClass(SCHLOSS_BUE_ATTRIBUTE_GROUP);
		createEReference(schloss_BUE_AttributeGroupEClass, SCHLOSS_BUE_ATTRIBUTE_GROUP__BUE_LAGE);
		createEReference(schloss_BUE_AttributeGroupEClass, SCHLOSS_BUE_ATTRIBUTE_GROUP__IDBUE_ANLAGE);

		schloss_Gsp_AttributeGroupEClass = createEClass(SCHLOSS_GSP_ATTRIBUTE_GROUP);
		createEReference(schloss_Gsp_AttributeGroupEClass, SCHLOSS_GSP_ATTRIBUTE_GROUP__GSP_LAGE);
		createEReference(schloss_Gsp_AttributeGroupEClass, SCHLOSS_GSP_ATTRIBUTE_GROUP__ID_GSP_ELEMENT);

		schloss_Sk_AttributeGroupEClass = createEClass(SCHLOSS_SK_ATTRIBUTE_GROUP);
		createEReference(schloss_Sk_AttributeGroupEClass, SCHLOSS_SK_ATTRIBUTE_GROUP__HAUPTSCHLOSS);
		createEReference(schloss_Sk_AttributeGroupEClass, SCHLOSS_SK_ATTRIBUTE_GROUP__ID_SCHLOSSKOMBINATION);

		schloss_Sonderanlage_AttributeGroupEClass = createEClass(SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP);
		createEReference(schloss_Sonderanlage_AttributeGroupEClass, SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__SONDERANLAGE_LAGE);
		createEReference(schloss_Sonderanlage_AttributeGroupEClass, SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__BESCHREIBUNG_SONDERANLAGE);
		createEReference(schloss_Sonderanlage_AttributeGroupEClass, SCHLOSS_SONDERANLAGE_ATTRIBUTE_GROUP__ID_SONDERANLAGE);

		schloss_Ssp_AttributeGroupEClass = createEClass(SCHLOSS_SSP_ATTRIBUTE_GROUP);
		createEReference(schloss_Ssp_AttributeGroupEClass, SCHLOSS_SSP_ATTRIBUTE_GROUP__ID_SCHLUESSELSPERRE);

		schloss_W_AttributeGroupEClass = createEClass(SCHLOSS_WATTRIBUTE_GROUP);
		createEReference(schloss_W_AttributeGroupEClass, SCHLOSS_WATTRIBUTE_GROUP__IDW_KR_ELEMENT);
		createEReference(schloss_W_AttributeGroupEClass, SCHLOSS_WATTRIBUTE_GROUP__SCHLOSS_ART);
		createEReference(schloss_W_AttributeGroupEClass, SCHLOSS_WATTRIBUTE_GROUP__VERSCHLUSS_ORT);
		createEReference(schloss_W_AttributeGroupEClass, SCHLOSS_WATTRIBUTE_GROUP__WANBAULAGE);
		createEReference(schloss_W_AttributeGroupEClass, SCHLOSS_WATTRIBUTE_GROUP__WLAGE);

		schlosskombinationEClass = createEClass(SCHLOSSKOMBINATION);
		createEReference(schlosskombinationEClass, SCHLOSSKOMBINATION__BEZEICHNUNG);
		createEReference(schlosskombinationEClass, SCHLOSSKOMBINATION__ID_UNTERBRINGUNG);

		schlosskombination_Bezeichnung_AttributeGroupEClass = createEClass(SCHLOSSKOMBINATION_BEZEICHNUNG_ATTRIBUTE_GROUP);
		createEReference(schlosskombination_Bezeichnung_AttributeGroupEClass, SCHLOSSKOMBINATION_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SK);

		schluesselEClass = createEClass(SCHLUESSEL);
		createEReference(schluesselEClass, SCHLUESSEL__BEZEICHNUNG);
		createEReference(schluesselEClass, SCHLUESSEL__SCHLUESSEL_ALLG);

		schluessel_Allg_AttributeGroupEClass = createEClass(SCHLUESSEL_ALLG_ATTRIBUTE_GROUP);
		createEReference(schluessel_Allg_AttributeGroupEClass, SCHLUESSEL_ALLG_ATTRIBUTE_GROUP__SCHLUESSEL_BARTFORM);
		createEReference(schluessel_Allg_AttributeGroupEClass, SCHLUESSEL_ALLG_ATTRIBUTE_GROUP__SCHLUESSEL_GRUPPE);

		schluessel_Bartform_TypeClassEClass = createEClass(SCHLUESSEL_BARTFORM_TYPE_CLASS);
		createEAttribute(schluessel_Bartform_TypeClassEClass, SCHLUESSEL_BARTFORM_TYPE_CLASS__WERT);

		schluessel_Bezeichnung_AttributeGroupEClass = createEClass(SCHLUESSEL_BEZEICHNUNG_ATTRIBUTE_GROUP);
		createEReference(schluessel_Bezeichnung_AttributeGroupEClass, SCHLUESSEL_BEZEICHNUNG_ATTRIBUTE_GROUP__BEZEICHNUNG_SCHLUESSEL);

		schluessel_Gruppe_TypeClassEClass = createEClass(SCHLUESSEL_GRUPPE_TYPE_CLASS);
		createEAttribute(schluessel_Gruppe_TypeClassEClass, SCHLUESSEL_GRUPPE_TYPE_CLASS__WERT);

		schluessel_In_Grdst_Eingeschl_TypeClassEClass = createEClass(SCHLUESSEL_IN_GRDST_EINGESCHL_TYPE_CLASS);
		createEAttribute(schluessel_In_Grdst_Eingeschl_TypeClassEClass, SCHLUESSEL_IN_GRDST_EINGESCHL_TYPE_CLASS__WERT);

		schluesselsperreEClass = createEClass(SCHLUESSELSPERRE);
		createEReference(schluesselsperreEClass, SCHLUESSELSPERRE__BEDIENUNG_ART);
		createEReference(schluesselsperreEClass, SCHLUESSELSPERRE__BEZEICHNUNG);
		createEReference(schluesselsperreEClass, SCHLUESSELSPERRE__ID_STELLELEMENT);
		createEReference(schluesselsperreEClass, SCHLUESSELSPERRE__ID_UNTERBRINGUNG);

		sonderanlage_Lage_TypeClassEClass = createEClass(SONDERANLAGE_LAGE_TYPE_CLASS);
		createEAttribute(sonderanlage_Lage_TypeClassEClass, SONDERANLAGE_LAGE_TYPE_CLASS__WERT);

		technisch_Berechtigter_TypeClassEClass = createEClass(TECHNISCH_BERECHTIGTER_TYPE_CLASS);
		createEAttribute(technisch_Berechtigter_TypeClassEClass, TECHNISCH_BERECHTIGTER_TYPE_CLASS__WERT);

		verschluss_Ort_TypeClassEClass = createEClass(VERSCHLUSS_ORT_TYPE_CLASS);
		createEAttribute(verschluss_Ort_TypeClassEClass, VERSCHLUSS_ORT_TYPE_CLASS__WERT);

		w_Anbaulage_TypeClassEClass = createEClass(WANBAULAGE_TYPE_CLASS);
		createEAttribute(w_Anbaulage_TypeClassEClass, WANBAULAGE_TYPE_CLASS__WERT);

		w_Lage_TypeClassEClass = createEClass(WLAGE_TYPE_CLASS);
		createEAttribute(w_Lage_TypeClassEClass, WLAGE_TYPE_CLASS__WERT);

		// Create enums
		enumBedienungArtEEnum = createEEnum(ENUM_BEDIENUNG_ART);
		enumbueLageEEnum = createEEnum(ENUMBUE_LAGE);
		enumGspLageEEnum = createEEnum(ENUM_GSP_LAGE);
		enumSchlossArtEEnum = createEEnum(ENUM_SCHLOSS_ART);
		enumSchluesselBartformEEnum = createEEnum(ENUM_SCHLUESSEL_BARTFORM);
		enumSchluesselGruppeEEnum = createEEnum(ENUM_SCHLUESSEL_GRUPPE);
		enumSonderanlageLageEEnum = createEEnum(ENUM_SONDERANLAGE_LAGE);
		enumVerschlussOrtEEnum = createEEnum(ENUM_VERSCHLUSS_ORT);

		// Create data types
		beschreibung_Sonderanlage_TypeEDataType = createEDataType(BESCHREIBUNG_SONDERANLAGE_TYPE);
		bezeichnung_Schloss_TypeEDataType = createEDataType(BEZEICHNUNG_SCHLOSS_TYPE);
		bezeichnung_Schluessel_TypeEDataType = createEDataType(BEZEICHNUNG_SCHLUESSEL_TYPE);
		bezeichnung_Sk_TypeEDataType = createEDataType(BEZEICHNUNG_SK_TYPE);
		enumBedienungArtObjectEDataType = createEDataType(ENUM_BEDIENUNG_ART_OBJECT);
		enumbueLageObjectEDataType = createEDataType(ENUMBUE_LAGE_OBJECT);
		enumGspLageObjectEDataType = createEDataType(ENUM_GSP_LAGE_OBJECT);
		enumSchlossArtObjectEDataType = createEDataType(ENUM_SCHLOSS_ART_OBJECT);
		enumSchluesselBartformObjectEDataType = createEDataType(ENUM_SCHLUESSEL_BARTFORM_OBJECT);
		enumSchluesselGruppeObjectEDataType = createEDataType(ENUM_SCHLUESSEL_GRUPPE_OBJECT);
		enumSonderanlageLageObjectEDataType = createEDataType(ENUM_SONDERANLAGE_LAGE_OBJECT);
		enumVerschlussOrtObjectEDataType = createEDataType(ENUM_VERSCHLUSS_ORT_OBJECT);
		w_Anbaulage_TypeEDataType = createEDataType(WANBAULAGE_TYPE);
		w_Lage_TypeEDataType = createEDataType(WLAGE_TYPE);
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
		bedienung_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		beschreibung_Sonderanlage_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bezeichnung_Schloss_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bezeichnung_Schluessel_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		bezeichnung_Sk_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		buE_Lage_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		gsp_Lage_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		hauptschloss_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		schlossEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		schloss_Art_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		schlosskombinationEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		schluesselEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		schluessel_Bartform_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		schluessel_Gruppe_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		schluessel_In_Grdst_Eingeschl_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		schluesselsperreEClass.getESuperTypes().add(theBasisobjektePackage.getBasis_Objekt());
		sonderanlage_Lage_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		technisch_Berechtigter_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		verschluss_Ort_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		w_Anbaulage_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());
		w_Lage_TypeClassEClass.getESuperTypes().add(theBasisTypenPackage.getBasisAttribut_AttributeGroup());

		// Initialize classes and features; add operations and parameters
		initEClass(bedienung_Art_TypeClassEClass, Bedienung_Art_TypeClass.class, "Bedienung_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBedienung_Art_TypeClass_Wert(), this.getENUMBedienungArtObject(), "wert", null, 1, 1, Bedienung_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(beschreibung_Sonderanlage_TypeClassEClass, Beschreibung_Sonderanlage_TypeClass.class, "Beschreibung_Sonderanlage_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBeschreibung_Sonderanlage_TypeClass_Wert(), this.getBeschreibung_Sonderanlage_Type(), "wert", null, 1, 1, Beschreibung_Sonderanlage_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bezeichnung_Schloss_TypeClassEClass, Bezeichnung_Schloss_TypeClass.class, "Bezeichnung_Schloss_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBezeichnung_Schloss_TypeClass_Wert(), this.getBezeichnung_Schloss_Type(), "wert", null, 1, 1, Bezeichnung_Schloss_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bezeichnung_Schluessel_TypeClassEClass, Bezeichnung_Schluessel_TypeClass.class, "Bezeichnung_Schluessel_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBezeichnung_Schluessel_TypeClass_Wert(), this.getBezeichnung_Schluessel_Type(), "wert", null, 1, 1, Bezeichnung_Schluessel_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bezeichnung_Sk_TypeClassEClass, Bezeichnung_Sk_TypeClass.class, "Bezeichnung_Sk_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBezeichnung_Sk_TypeClass_Wert(), this.getBezeichnung_Sk_Type(), "wert", null, 1, 1, Bezeichnung_Sk_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(buE_Lage_TypeClassEClass, BUE_Lage_TypeClass.class, "BUE_Lage_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBUE_Lage_TypeClass_Wert(), this.getENUMBUELageObject(), "wert", null, 1, 1, BUE_Lage_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(gsp_Lage_TypeClassEClass, Gsp_Lage_TypeClass.class, "Gsp_Lage_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGsp_Lage_TypeClass_Wert(), this.getENUMGspLageObject(), "wert", null, 1, 1, Gsp_Lage_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(hauptschloss_TypeClassEClass, Hauptschloss_TypeClass.class, "Hauptschloss_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHauptschloss_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Hauptschloss_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schlossEClass, Schloss.class, "Schloss", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchloss_Bezeichnung(), this.getSchloss_Bezeichnung_AttributeGroup(), null, "bezeichnung", null, 1, 1, Schloss.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchloss_IDSchluessel(), theVerweisePackage.getID_Schluessel_TypeClass(), null, "iDSchluessel", null, 1, 1, Schloss.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchloss_SchluesselInGrdstEingeschl(), this.getSchluessel_In_Grdst_Eingeschl_TypeClass(), null, "schluesselInGrdstEingeschl", null, 1, 1, Schloss.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchloss_SchlossBUE(), this.getSchloss_BUE_AttributeGroup(), null, "schlossBUE", null, 0, 1, Schloss.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchloss_SchlossGsp(), this.getSchloss_Gsp_AttributeGroup(), null, "schlossGsp", null, 0, 1, Schloss.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchloss_SchlossSk(), this.getSchloss_Sk_AttributeGroup(), null, "schlossSk", null, 0, 1, Schloss.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchloss_SchlossSonderanlage(), this.getSchloss_Sonderanlage_AttributeGroup(), null, "schlossSonderanlage", null, 0, 1, Schloss.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchloss_SchlossSsp(), this.getSchloss_Ssp_AttributeGroup(), null, "schlossSsp", null, 0, 1, Schloss.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchloss_SchlossW(), this.getSchloss_W_AttributeGroup(), null, "schlossW", null, 0, 1, Schloss.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchloss_TechnischBerechtigter(), this.getTechnisch_Berechtigter_TypeClass(), null, "technischBerechtigter", null, 0, 1, Schloss.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schloss_Art_TypeClassEClass, Schloss_Art_TypeClass.class, "Schloss_Art_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchloss_Art_TypeClass_Wert(), this.getENUMSchlossArtObject(), "wert", null, 1, 1, Schloss_Art_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schloss_Bezeichnung_AttributeGroupEClass, Schloss_Bezeichnung_AttributeGroup.class, "Schloss_Bezeichnung_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchloss_Bezeichnung_AttributeGroup_BezeichnungSchloss(), this.getBezeichnung_Schloss_TypeClass(), null, "bezeichnungSchloss", null, 1, 1, Schloss_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schloss_BUE_AttributeGroupEClass, Schloss_BUE_AttributeGroup.class, "Schloss_BUE_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchloss_BUE_AttributeGroup_BUELage(), this.getBUE_Lage_TypeClass(), null, "bUELage", null, 1, 1, Schloss_BUE_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchloss_BUE_AttributeGroup_IDBUEAnlage(), theVerweisePackage.getID_BUE_Anlage_TypeClass(), null, "iDBUEAnlage", null, 1, 1, Schloss_BUE_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schloss_Gsp_AttributeGroupEClass, Schloss_Gsp_AttributeGroup.class, "Schloss_Gsp_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchloss_Gsp_AttributeGroup_GspLage(), this.getGsp_Lage_TypeClass(), null, "gspLage", null, 1, 1, Schloss_Gsp_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchloss_Gsp_AttributeGroup_IDGspElement(), theVerweisePackage.getID_W_Kr_Gsp_Element_TypeClass(), null, "iDGspElement", null, 1, 1, Schloss_Gsp_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schloss_Sk_AttributeGroupEClass, Schloss_Sk_AttributeGroup.class, "Schloss_Sk_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchloss_Sk_AttributeGroup_Hauptschloss(), this.getHauptschloss_TypeClass(), null, "hauptschloss", null, 1, 1, Schloss_Sk_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchloss_Sk_AttributeGroup_IDSchlosskombination(), theVerweisePackage.getID_Schlosskombination_TypeClass(), null, "iDSchlosskombination", null, 1, 1, Schloss_Sk_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schloss_Sonderanlage_AttributeGroupEClass, Schloss_Sonderanlage_AttributeGroup.class, "Schloss_Sonderanlage_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchloss_Sonderanlage_AttributeGroup_SonderanlageLage(), this.getSonderanlage_Lage_TypeClass(), null, "sonderanlageLage", null, 1, 1, Schloss_Sonderanlage_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchloss_Sonderanlage_AttributeGroup_BeschreibungSonderanlage(), this.getBeschreibung_Sonderanlage_TypeClass(), null, "beschreibungSonderanlage", null, 0, 1, Schloss_Sonderanlage_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchloss_Sonderanlage_AttributeGroup_IDSonderanlage(), theVerweisePackage.getID_Sonderanlage_TypeClass(), null, "iDSonderanlage", null, 0, 1, Schloss_Sonderanlage_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schloss_Ssp_AttributeGroupEClass, Schloss_Ssp_AttributeGroup.class, "Schloss_Ssp_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchloss_Ssp_AttributeGroup_IDSchluesselsperre(), theVerweisePackage.getID_Schluesselsperre_TypeClass(), null, "iDSchluesselsperre", null, 1, 1, Schloss_Ssp_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schloss_W_AttributeGroupEClass, Schloss_W_AttributeGroup.class, "Schloss_W_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchloss_W_AttributeGroup_IDWKrElement(), theVerweisePackage.getID_W_Kr_Gsp_Element_TypeClass(), null, "iDWKrElement", null, 1, 1, Schloss_W_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchloss_W_AttributeGroup_SchlossArt(), this.getSchloss_Art_TypeClass(), null, "schlossArt", null, 1, 1, Schloss_W_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchloss_W_AttributeGroup_VerschlussOrt(), this.getVerschluss_Ort_TypeClass(), null, "verschlussOrt", null, 1, 1, Schloss_W_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchloss_W_AttributeGroup_WAnbaulage(), this.getW_Anbaulage_TypeClass(), null, "wAnbaulage", null, 1, 1, Schloss_W_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchloss_W_AttributeGroup_WLage(), this.getW_Lage_TypeClass(), null, "wLage", null, 1, 1, Schloss_W_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schlosskombinationEClass, Schlosskombination.class, "Schlosskombination", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchlosskombination_Bezeichnung(), this.getSchlosskombination_Bezeichnung_AttributeGroup(), null, "bezeichnung", null, 1, 1, Schlosskombination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchlosskombination_IDUnterbringung(), theVerweisePackage.getID_Unterbringung_TypeClass(), null, "iDUnterbringung", null, 1, 1, Schlosskombination.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schlosskombination_Bezeichnung_AttributeGroupEClass, Schlosskombination_Bezeichnung_AttributeGroup.class, "Schlosskombination_Bezeichnung_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchlosskombination_Bezeichnung_AttributeGroup_BezeichnungSk(), this.getBezeichnung_Sk_TypeClass(), null, "bezeichnungSk", null, 1, 1, Schlosskombination_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schluesselEClass, Schluessel.class, "Schluessel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchluessel_Bezeichnung(), this.getSchluessel_Bezeichnung_AttributeGroup(), null, "bezeichnung", null, 0, 1, Schluessel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchluessel_SchluesselAllg(), this.getSchluessel_Allg_AttributeGroup(), null, "schluesselAllg", null, 0, 1, Schluessel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schluessel_Allg_AttributeGroupEClass, Schluessel_Allg_AttributeGroup.class, "Schluessel_Allg_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchluessel_Allg_AttributeGroup_SchluesselBartform(), this.getSchluessel_Bartform_TypeClass(), null, "schluesselBartform", null, 0, 1, Schluessel_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchluessel_Allg_AttributeGroup_SchluesselGruppe(), this.getSchluessel_Gruppe_TypeClass(), null, "schluesselGruppe", null, 1, 1, Schluessel_Allg_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schluessel_Bartform_TypeClassEClass, Schluessel_Bartform_TypeClass.class, "Schluessel_Bartform_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchluessel_Bartform_TypeClass_Wert(), this.getENUMSchluesselBartformObject(), "wert", null, 1, 1, Schluessel_Bartform_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schluessel_Bezeichnung_AttributeGroupEClass, Schluessel_Bezeichnung_AttributeGroup.class, "Schluessel_Bezeichnung_AttributeGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchluessel_Bezeichnung_AttributeGroup_BezeichnungSchluessel(), this.getBezeichnung_Schluessel_TypeClass(), null, "bezeichnungSchluessel", null, 1, 1, Schluessel_Bezeichnung_AttributeGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schluessel_Gruppe_TypeClassEClass, Schluessel_Gruppe_TypeClass.class, "Schluessel_Gruppe_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchluessel_Gruppe_TypeClass_Wert(), this.getENUMSchluesselGruppeObject(), "wert", null, 1, 1, Schluessel_Gruppe_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schluessel_In_Grdst_Eingeschl_TypeClassEClass, Schluessel_In_Grdst_Eingeschl_TypeClass.class, "Schluessel_In_Grdst_Eingeschl_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchluessel_In_Grdst_Eingeschl_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Schluessel_In_Grdst_Eingeschl_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schluesselsperreEClass, Schluesselsperre.class, "Schluesselsperre", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSchluesselsperre_BedienungArt(), this.getBedienung_Art_TypeClass(), null, "bedienungArt", null, 1, 1, Schluesselsperre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchluesselsperre_Bezeichnung(), theBasisTypenPackage.getBezeichnung_Element_AttributeGroup(), null, "bezeichnung", null, 1, 1, Schluesselsperre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchluesselsperre_IDStellelement(), theVerweisePackage.getID_Stellelement_TypeClass(), null, "iDStellelement", null, 1, 1, Schluesselsperre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSchluesselsperre_IDUnterbringung(), theVerweisePackage.getID_Unterbringung_TypeClass(), null, "iDUnterbringung", null, 1, 1, Schluesselsperre.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sonderanlage_Lage_TypeClassEClass, Sonderanlage_Lage_TypeClass.class, "Sonderanlage_Lage_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSonderanlage_Lage_TypeClass_Wert(), this.getENUMSonderanlageLageObject(), "wert", null, 1, 1, Sonderanlage_Lage_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(technisch_Berechtigter_TypeClassEClass, Technisch_Berechtigter_TypeClass.class, "Technisch_Berechtigter_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTechnisch_Berechtigter_TypeClass_Wert(), theXMLTypePackage.getBooleanObject(), "wert", null, 1, 1, Technisch_Berechtigter_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(verschluss_Ort_TypeClassEClass, Verschluss_Ort_TypeClass.class, "Verschluss_Ort_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVerschluss_Ort_TypeClass_Wert(), this.getENUMVerschlussOrtObject(), "wert", null, 1, 1, Verschluss_Ort_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(w_Anbaulage_TypeClassEClass, W_Anbaulage_TypeClass.class, "W_Anbaulage_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getW_Anbaulage_TypeClass_Wert(), this.getW_Anbaulage_Type(), "wert", null, 1, 1, W_Anbaulage_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(w_Lage_TypeClassEClass, W_Lage_TypeClass.class, "W_Lage_TypeClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getW_Lage_TypeClass_Wert(), this.getW_Lage_Type(), "wert", null, 1, 1, W_Lage_TypeClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(enumBedienungArtEEnum, ENUMBedienungArt.class, "ENUMBedienungArt");
		addEEnumLiteral(enumBedienungArtEEnum, ENUMBedienungArt.ENUM_BEDIENUNG_ART_AUSSEN);
		addEEnumLiteral(enumBedienungArtEEnum, ENUMBedienungArt.ENUM_BEDIENUNG_ART_AUSSEN_AWANST);
		addEEnumLiteral(enumBedienungArtEEnum, ENUMBedienungArt.ENUM_BEDIENUNG_ART_INNEN);

		initEEnum(enumbueLageEEnum, ENUMBUELage.class, "ENUMBUELage");
		addEEnumLiteral(enumbueLageEEnum, ENUMBUELage.ENUMBUE_LAGE_GEOEFFNET);
		addEEnumLiteral(enumbueLageEEnum, ENUMBUELage.ENUMBUE_LAGE_GESCHLOSSEN);

		initEEnum(enumGspLageEEnum, ENUMGspLage.class, "ENUMGspLage");
		addEEnumLiteral(enumGspLageEEnum, ENUMGspLage.ENUM_GSP_LAGE_ABGELEGT);
		addEEnumLiteral(enumGspLageEEnum, ENUMGspLage.ENUM_GSP_LAGE_AUFGELEGT);

		initEEnum(enumSchlossArtEEnum, ENUMSchlossArt.class, "ENUMSchlossArt");
		addEEnumLiteral(enumSchlossArtEEnum, ENUMSchlossArt.ENUM_SCHLOSS_ART_HV_73);
		addEEnumLiteral(enumSchlossArtEEnum, ENUMSchlossArt.ENUM_SCHLOSS_ART_PRUEFERSCHIEBER_ABSCHLIESSBAR);
		addEEnumLiteral(enumSchlossArtEEnum, ENUMSchlossArt.ENUM_SCHLOSS_ART_RIEGELHANDSCHLOSS);
		addEEnumLiteral(enumSchlossArtEEnum, ENUMSchlossArt.ENUM_SCHLOSS_ART_SONSTIGE);
		addEEnumLiteral(enumSchlossArtEEnum, ENUMSchlossArt.ENUM_SCHLOSS_ART_WEICHENSCHLOSS);
		addEEnumLiteral(enumSchlossArtEEnum, ENUMSchlossArt.ENUM_SCHLOSS_ART_ZUNGENSPERRE);

		initEEnum(enumSchluesselBartformEEnum, ENUMSchluesselBartform.class, "ENUMSchluesselBartform");
		addEEnumLiteral(enumSchluesselBartformEEnum, ENUMSchluesselBartform.ENUM_SCHLUESSEL_BARTFORM_A);
		addEEnumLiteral(enumSchluesselBartformEEnum, ENUMSchluesselBartform.ENUM_SCHLUESSEL_BARTFORM_B);
		addEEnumLiteral(enumSchluesselBartformEEnum, ENUMSchluesselBartform.ENUM_SCHLUESSEL_BARTFORM_C);
		addEEnumLiteral(enumSchluesselBartformEEnum, ENUMSchluesselBartform.ENUM_SCHLUESSEL_BARTFORM_D);
		addEEnumLiteral(enumSchluesselBartformEEnum, ENUMSchluesselBartform.ENUM_SCHLUESSEL_BARTFORM_E);
		addEEnumLiteral(enumSchluesselBartformEEnum, ENUMSchluesselBartform.ENUM_SCHLUESSEL_BARTFORM_F);
		addEEnumLiteral(enumSchluesselBartformEEnum, ENUMSchluesselBartform.ENUM_SCHLUESSEL_BARTFORM_G);
		addEEnumLiteral(enumSchluesselBartformEEnum, ENUMSchluesselBartform.ENUM_SCHLUESSEL_BARTFORM_H);
		addEEnumLiteral(enumSchluesselBartformEEnum, ENUMSchluesselBartform.ENUM_SCHLUESSEL_BARTFORM_I);
		addEEnumLiteral(enumSchluesselBartformEEnum, ENUMSchluesselBartform.ENUM_SCHLUESSEL_BARTFORM_K);
		addEEnumLiteral(enumSchluesselBartformEEnum, ENUMSchluesselBartform.ENUM_SCHLUESSEL_BARTFORM_L);
		addEEnumLiteral(enumSchluesselBartformEEnum, ENUMSchluesselBartform.ENUM_SCHLUESSEL_BARTFORM_M);
		addEEnumLiteral(enumSchluesselBartformEEnum, ENUMSchluesselBartform.ENUM_SCHLUESSEL_BARTFORM_N);
		addEEnumLiteral(enumSchluesselBartformEEnum, ENUMSchluesselBartform.ENUM_SCHLUESSEL_BARTFORM_O);
		addEEnumLiteral(enumSchluesselBartformEEnum, ENUMSchluesselBartform.ENUM_SCHLUESSEL_BARTFORM_P);
		addEEnumLiteral(enumSchluesselBartformEEnum, ENUMSchluesselBartform.ENUM_SCHLUESSEL_BARTFORM_Q);
		addEEnumLiteral(enumSchluesselBartformEEnum, ENUMSchluesselBartform.ENUM_SCHLUESSEL_BARTFORM_R);
		addEEnumLiteral(enumSchluesselBartformEEnum, ENUMSchluesselBartform.ENUM_SCHLUESSEL_BARTFORM_S);
		addEEnumLiteral(enumSchluesselBartformEEnum, ENUMSchluesselBartform.ENUM_SCHLUESSEL_BARTFORM_T);
		addEEnumLiteral(enumSchluesselBartformEEnum, ENUMSchluesselBartform.ENUM_SCHLUESSEL_BARTFORM_U);
		addEEnumLiteral(enumSchluesselBartformEEnum, ENUMSchluesselBartform.ENUM_SCHLUESSEL_BARTFORM_V);
		addEEnumLiteral(enumSchluesselBartformEEnum, ENUMSchluesselBartform.ENUM_SCHLUESSEL_BARTFORM_W);
		addEEnumLiteral(enumSchluesselBartformEEnum, ENUMSchluesselBartform.ENUM_SCHLUESSEL_BARTFORM_X);
		addEEnumLiteral(enumSchluesselBartformEEnum, ENUMSchluesselBartform.ENUM_SCHLUESSEL_BARTFORM_Z);

		initEEnum(enumSchluesselGruppeEEnum, ENUMSchluesselGruppe.class, "ENUMSchluesselGruppe");
		addEEnumLiteral(enumSchluesselGruppeEEnum, ENUMSchluesselGruppe.ENUM_SCHLUESSEL_GRUPPE_0);
		addEEnumLiteral(enumSchluesselGruppeEEnum, ENUMSchluesselGruppe.ENUM_SCHLUESSEL_GRUPPE_1);
		addEEnumLiteral(enumSchluesselGruppeEEnum, ENUMSchluesselGruppe.ENUM_SCHLUESSEL_GRUPPE_2);
		addEEnumLiteral(enumSchluesselGruppeEEnum, ENUMSchluesselGruppe.ENUM_SCHLUESSEL_GRUPPE_3);
		addEEnumLiteral(enumSchluesselGruppeEEnum, ENUMSchluesselGruppe.ENUM_SCHLUESSEL_GRUPPE_4);
		addEEnumLiteral(enumSchluesselGruppeEEnum, ENUMSchluesselGruppe.ENUM_SCHLUESSEL_GRUPPE_5);

		initEEnum(enumSonderanlageLageEEnum, ENUMSonderanlageLage.class, "ENUMSonderanlageLage");
		addEEnumLiteral(enumSonderanlageLageEEnum, ENUMSonderanlageLage.ENUM_SONDERANLAGE_LAGE_BEFAHRBAR);
		addEEnumLiteral(enumSonderanlageLageEEnum, ENUMSonderanlageLage.ENUM_SONDERANLAGE_LAGE_NICHT_BEFAHRBAR);
		addEEnumLiteral(enumSonderanlageLageEEnum, ENUMSonderanlageLage.ENUM_SONDERANLAGE_LAGE_SONSTIGE);

		initEEnum(enumVerschlussOrtEEnum, ENUMVerschlussOrt.class, "ENUMVerschlussOrt");
		addEEnumLiteral(enumVerschlussOrtEEnum, ENUMVerschlussOrt.ENUM_VERSCHLUSS_ORT_HERZSTÜCK);
		addEEnumLiteral(enumVerschlussOrtEEnum, ENUMVerschlussOrt.ENUM_VERSCHLUSS_ORT_MITTE);
		addEEnumLiteral(enumVerschlussOrtEEnum, ENUMVerschlussOrt.ENUM_VERSCHLUSS_ORT_SONSTIGE);
		addEEnumLiteral(enumVerschlussOrtEEnum, ENUMVerschlussOrt.ENUM_VERSCHLUSS_ORT_SPITZE);

		// Initialize data types
		initEDataType(beschreibung_Sonderanlage_TypeEDataType, String.class, "Beschreibung_Sonderanlage_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bezeichnung_Schloss_TypeEDataType, String.class, "Bezeichnung_Schloss_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bezeichnung_Schluessel_TypeEDataType, String.class, "Bezeichnung_Schluessel_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bezeichnung_Sk_TypeEDataType, String.class, "Bezeichnung_Sk_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumBedienungArtObjectEDataType, ENUMBedienungArt.class, "ENUMBedienungArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumbueLageObjectEDataType, ENUMBUELage.class, "ENUMBUELageObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumGspLageObjectEDataType, ENUMGspLage.class, "ENUMGspLageObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumSchlossArtObjectEDataType, ENUMSchlossArt.class, "ENUMSchlossArtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumSchluesselBartformObjectEDataType, ENUMSchluesselBartform.class, "ENUMSchluesselBartformObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumSchluesselGruppeObjectEDataType, ENUMSchluesselGruppe.class, "ENUMSchluesselGruppeObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumSonderanlageLageObjectEDataType, ENUMSonderanlageLage.class, "ENUMSonderanlageLageObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(enumVerschlussOrtObjectEDataType, ENUMVerschlussOrt.class, "ENUMVerschlussOrtObject", IS_SERIALIZABLE, IS_GENERATED_INSTANCE_CLASS);
		initEDataType(w_Anbaulage_TypeEDataType, ENUMLinksRechts.class, "W_Anbaulage_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(w_Lage_TypeEDataType, ENUMLinksRechts.class, "W_Lage_Type", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

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
			   "documentation", "Dieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.1.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbinfrago.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.1.\n\nMore information about the license can be found on\nhttp://www.dbinfrago.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\r\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.1.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbinfrago.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.1.\n\nMore information about the license can be found on\nhttp://www.dbinfrago.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\r\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.1.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbinfrago.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.1.\n\nMore information about the license can be found on\nhttp://www.dbinfrago.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface.\r\nDieses Werk ist lizenziert unter der Open Source Lizenz RailPL V1.1.\n\nWeitere Informationen zur Lizenz finden Sie auf\nhttp://www.dbinfrago.com/planpro\n\nInhalt der Datei:\nXML Schema f\u00fcr PlanPro Schnittstelle.\n\nBei Fragen zum Schema wenden Sie sich bitte an planpro@deutschebahn.com\n\n--------------------------------------------------------------------------------\n\nThis Document is licensed under the open source license RailPL V1.1.\n\nMore information about the license can be found on\nhttp://www.dbinfrago.com/planpro\n\nContents of the file:\nXML Schema for PlanPro interface."
		   });
		addAnnotation
		  (schlossEClass,
		   source,
		   new String[] {
			   "documentation", "Mechanisches Bauelement, das durch das Ein- oder Ausschlie\u00dfen eines Schl\u00fcssels einen Riegel aus- oder einfahren l\u00e4sst bzw. einen elektrischen Kontakt schlie\u00dft oder \u00f6ffnet. Je nach verschlossenem Element wird die entsprechende Attributgruppe ausgew\u00e4hlt: Bahn\u00fcbergang, Gleissperre, Schlosskombination, Sonderanlage (z. B. bewegliche Br\u00fccke), Schl\u00fcsselsperre, Weiche. DB-Regelwerk Auf dem Lageplan werden nach 819.9002 3 dargestellt: Schl\u00f6sser durch ein Symbol (z. B. Schl\u00fcsselsperre) oder zus\u00e4tzliche Angaben zu anderen Symbolen (z. B. Weiche); Abh\u00e4ngigkeiten durch eine Zeichnung mit wiederholter Darstellung der Schlossstellungen als gef\u00fclltes oder leeres Schl\u00fcsselloch. "
		   });
		addAnnotation
		  (getSchloss_IDSchluessel(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf den zum Schloss geh\u00f6rigen Schl\u00fcssel. DB-Regelwerk Lageplan, Logische Darstellung der Schl\u00fcsselabh\u00e4ngigkeit"
		   });
		addAnnotation
		  (getSchloss_SchluesselInGrdstEingeschl(),
		   source,
		   new String[] {
			   "documentation", "Schl\u00fcssel ist in Grundstellung eingeschlossen."
		   });
		addAnnotation
		  (getSchloss_TechnischBerechtigter(),
		   source,
		   new String[] {
			   "documentation", "Aufbewahrung des Schl\u00fcssels beim Technisch Berechtigten (true). Der Wert \\\"false\\\" wird nicht verwendet."
		   });
		addAnnotation
		  (getSchloss_Bezeichnung_AttributeGroup_BezeichnungSchloss(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnung des Schlosses, die sich im Regelfall aus dem zu verschlie\u00dfenden Element ergibt, ggf. zuz\u00fcglich dessen Lage. Bei einer Schl\u00fcsselsperre/Schlosskombination entspricht die Bezeichnung der Bezeichnung der Schl\u00fcsselsperre/ Schlosskombination."
		   });
		addAnnotation
		  (getSchloss_BUE_AttributeGroup_BUELage(),
		   source,
		   new String[] {
			   "documentation", "Lage, in der die BUE Anlage verschlossen wird. DB-Regelwerk Die Abh\u00e4ngigkeiten werden heute durch eine Zeichnung im Lageplan nach 819.9002 3 dargestellt."
		   });
		addAnnotation
		  (getSchloss_BUE_AttributeGroup_IDBUEAnlage(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die BUE Anlage, die mit dem Schloss verschlossen wird. "
		   });
		addAnnotation
		  (getSchloss_Gsp_AttributeGroup_GspLage(),
		   source,
		   new String[] {
			   "documentation", "Lage, in der die Gleissperre verschlossen wird. DB-Regelwerk Die Abh\u00e4ngigkeiten werden heute durch eine Zeichnung im Lageplan nach 819.9002 3 dargestellt. "
		   });
		addAnnotation
		  (getSchloss_Gsp_AttributeGroup_IDGspElement(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die Gleissperre, die mit dem Schloss verschlossen wird. DB-Regelwerk Lageplan, Logische Darstellung der Schl\u00fcsselabh\u00e4ngigkeit "
		   });
		addAnnotation
		  (getSchloss_Sk_AttributeGroup_Hauptschloss(),
		   source,
		   new String[] {
			   "documentation", "Schloss ist das Hauptschloss der Schlosskombination."
		   });
		addAnnotation
		  (getSchloss_Sk_AttributeGroup_IDSchlosskombination(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die Schlosskombination, zu der das Schloss geh\u00f6rt."
		   });
		addAnnotation
		  (getSchloss_Sonderanlage_AttributeGroup_SonderanlageLage(),
		   source,
		   new String[] {
			   "documentation", "Lage, in der die Sonderanlage verschlossen wird. DB-Regelwerk Die Abh\u00e4ngigkeiten werden heute durch eine Zeichnung im Lageplan nach 819.9002 3 dargestellt."
		   });
		addAnnotation
		  (getSchloss_Sonderanlage_AttributeGroup_BeschreibungSonderanlage(),
		   source,
		   new String[] {
			   "documentation", "Beschreibung der Sonderanlage, sofern es sich nicht um ein besonderes Fahrwegelement handelt, das \u00fcber ID_Sonderanlage angegeben werden kann."
		   });
		addAnnotation
		  (getSchloss_Sonderanlage_AttributeGroup_IDSonderanlage(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die Sonderanlage im Sinne eines besonderen Fahrwegelements (z. B. bewegliche Br\u00fccke)."
		   });
		addAnnotation
		  (getSchloss_Ssp_AttributeGroup_IDSchluesselsperre(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf die Schl\u00fcsselsperre, in der sich das Schloss befindet."
		   });
		addAnnotation
		  (getSchloss_W_AttributeGroup_IDWKrElement(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf das Weichen- oder Kreuzungselement, das mit dem Schloss verschlossen wird. DB-Regelwerk Lageplan, Logische Darstellung der Schl\u00fcsselabh\u00e4ngigkeit"
		   });
		addAnnotation
		  (getSchloss_W_AttributeGroup_SchlossArt(),
		   source,
		   new String[] {
			   "documentation", "Bauart des an der Weiche vorgesehenen Schlosses. Bei Auswahl von \\\"sonstige\\\" ist ein Bearbeitungsvermerk mit entsprechenden Erl\u00e4uterungen anzuf\u00fcgen."
		   });
		addAnnotation
		  (getSchloss_W_AttributeGroup_VerschlussOrt(),
		   source,
		   new String[] {
			   "documentation", "Verschlussort f\u00fcr das unter ID_W_Kr_Element angegebene Weichen- bzw. Kreuzungselement. Die Angabe \\\"Herzst\u00fcck\\\" ist nur bei Weichen mit beweglichen Herzst\u00fcckspitzen sinnvoll."
		   });
		addAnnotation
		  (getSchloss_W_AttributeGroup_WAnbaulage(),
		   source,
		   new String[] {
			   "documentation", "Angabe, ob das Schloss an der linken oder rechten Seite der Weiche angebaut ist."
		   });
		addAnnotation
		  (getSchloss_W_AttributeGroup_WLage(),
		   source,
		   new String[] {
			   "documentation", "Lage, in der die Weiche durch das Schloss gesichert wird. DB-Regelwerk Die Abh\u00e4ngigkeiten werden heute durch eine Zeichnung im Lageplan nach 819.9002 3 dargestellt. "
		   });
		addAnnotation
		  (schlosskombinationEClass,
		   source,
		   new String[] {
			   "documentation", "Mechanische Einrichtung zur Freigabe mehrerer (abh\u00e4ngiger) Schl\u00fcssel durch einen (Haupt-) Schl\u00fcssel. Der Hauptschl\u00fcssel wird so lange festgehalten, wie mindestens ein Riegel der abh\u00e4ngigen Schl\u00f6sser ausgefahren ist. In der Regel besteht die Grundstellung darin, dass der Hauptschl\u00fcssel entfernt und die abh\u00e4ngigen Schl\u00fcssel eingeschlossen sind. DB-Regelwerk Darstellung durch Zeichnung im Lageplan. Eine aktuelle Ril dazu existiert nicht, es werden alte Zeichnungsstandards verwendet."
		   });
		addAnnotation
		  (getSchlosskombination_Bezeichnung(),
		   source,
		   new String[] {
			   "documentation", "Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle \u00fcber Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht m\u00f6glich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es m\u00f6glich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und \u00dcbersichtsplan, B\u00dc-Lageplan Planungstabellen "
		   });
		addAnnotation
		  (getSchlosskombination_IDUnterbringung(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf den physischen Ort der Unterbringung von Aussenelementansteuerung, Bedien Einrichtung Oertlich, Bedien Platz, ESTW Zentraleinheit, PZB Element, Schlosskombination, Schluesselsperre und ZN. F\u00fcr das PZB Element wird der Verweis nur f\u00fcr eine G\u00dc gef\u00fcllt - mit der Bedeutung: G\u00dc-Schaltkasten. F\u00fcr die ZN ist der Verweis optional, da im Planungswerkzeug ZN/ZL keine Bef\u00fcllung aller der f\u00fcr die Unterbringung notwendigen Attribute m\u00f6glich ist. DB-Regelwerk Darstellung des Geb\u00e4udes, der Bediens\u00e4ule bzw. des Schaltkastens im sicherungstechnischen Lageplan nach Ril 819.9002 oder Beschreibung im Erl\u00e4uterungsbericht."
		   });
		addAnnotation
		  (getSchlosskombination_Bezeichnung_AttributeGroup_BezeichnungSk(),
		   source,
		   new String[] {
			   "documentation", "Bezeichnung der Schlosskombination. Zuk\u00fcnftige Regel zur Bezeichnung einer Schlosskombination: \\\"Sk\\\" + Kurz- oder Langbezeichnung des zum Hauptschl\u00fcssel geh\u00f6renden, korrespondierenden Schlosses. Bei mehreren Hauptschl\u00fcsseln ist das Schloss mit der niedrigeren Bezeichnung ma\u00dfgebend."
		   });
		addAnnotation
		  (schluesselEClass,
		   source,
		   new String[] {
			   "documentation", "Sicherungstechnisches Element zur Herstellung von Schl\u00fcsselabh\u00e4ngigkeiten \u00fcber Schl\u00f6sser an Elementen. Der Schl\u00fcssel im sicherungstechnischen Sinn ist ein repr\u00e4sentativer und innerhalb einer \u00d6rtlichkeit einmaliger Gegenstand. Durch den Besitz des Schl\u00fcssels kann sicher und eindeutig auf einen bestimmten Anlagenzustand geschlossen werden. Somit k\u00f6nnen durch Verkn\u00fcpfung mit weiteren Fahrwegelementen oder einer informationsverarbeitenden Einheit sichere Abh\u00e4ngigkeiten geschaffen werden. In der Regel gibt es \u00f6rtlich immer zwei gleich schlie\u00dfende Schl\u00f6sser, selten mehr. Wird eine Schl\u00fcsselsperre nur als Schalter benutzt (z. B. um Fahrstra\u00dfen zu sperren), gibt es zu einem Schl\u00fcssel nur ein Schloss. Um die \u00f6rtliche Einmaligkeit herzustellen, darf eine Schl\u00fcsselform nur einmal innerhalb einer Betriebsstelle oder besser noch eines Streckenabschnitts verwendet werden. Dazu sind 24 verschiedene Schl\u00fcsselbartformen vorhanden, die mit sechs Schl\u00fcsselgruppen kombiniert werden k\u00f6nnen. Nicht jede Bartform wird mit jeder Gruppe kombiniert. So stehen insgesamt 92 verschiedene Schl\u00fcsselformen zur Verf\u00fcgung. DB-Regelwerk Die Planung der Schl\u00fcsselformen ist bisher nicht Bestandteil des PT1. F\u00fcr die Formen existieren Regelzeichnungen."
		   });
		addAnnotation
		  (getSchluessel_Bezeichnung(),
		   source,
		   new String[] {
			   "documentation", "Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle \u00fcber Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht m\u00f6glich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es m\u00f6glich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und \u00dcbersichtsplan, B\u00dc-Lageplan Planungstabellen "
		   });
		addAnnotation
		  (getSchluessel_Allg_AttributeGroup_SchluesselBartform(),
		   source,
		   new String[] {
			   "documentation", "Bartform des Schl\u00fcssels. DB-Regelwerk Bisher keine Darstellung"
		   });
		addAnnotation
		  (getSchluessel_Allg_AttributeGroup_SchluesselGruppe(),
		   source,
		   new String[] {
			   "documentation", "Gruppe des Schl\u00fcssels. DB-Regelwerk Bisher keine Darstellung"
		   });
		addAnnotation
		  (getSchluessel_Bezeichnung_AttributeGroup_BezeichnungSchluessel(),
		   source,
		   new String[] {
			   "documentation", "Auf dem Schluessel angebrachte Bezeichnung."
		   });
		addAnnotation
		  (schluesselsperreEClass,
		   source,
		   new String[] {
			   "documentation", "Elektromechanisches Bauelement, das die Anwesenheit eines Schl\u00fcssels pr\u00fcft, ihn festh\u00e4lt und eine Abh\u00e4ngigkeit zur Stellwerkslogik besitzt. Schl\u00fcsselsperren dienen der Festhaltung bzw. Freigabe von Schl\u00fcsseln, mit denen in der Regel weitere Elemente bedienbar gemacht werden. In Einzelf\u00e4llen dienen Schl\u00fcsselsperren nur als Schl\u00fcsselschalter. Die Darstellung im Lageplan erfolgt am Ort der Bedienung (z. B. Stellwerk, sonstiges Geb\u00e4ude), der durch die Unterbringung beschrieben wird. Eine Darstellung am oder auf dem Gleis erfolgt nicht! DB-Regelwerk Darstellung durch Zeichnung im Lageplan nach 819.9002 2."
		   });
		addAnnotation
		  (getSchluesselsperre_BedienungArt(),
		   source,
		   new String[] {
			   "documentation", "Unterscheidung nach Innen- und Au\u00dfenschl\u00fcsselsperre. Alt: Traditionell wird unterschieden zwischen einer Schl\u00fcsselsperre als Teil der Bedieneinrichtung im Stellwerk (Innenschl\u00fcsselsperre) und einer solchen in der N\u00e4he des zu bedienenden Elements in den Au\u00dfenanlagen (Au\u00dfenschl\u00fcsselsperre). Mit zunehmender Zentralisierung und Entfall \u00f6rtlich besetzter Stellwerke verliert diese Unterscheidung ihre Bedeutung. Neu (ESTW-Technik): Als Innenschl\u00fcsselsperre werden die nur f\u00fcr das LST-Personal zug\u00e4nglichen Schl\u00fcsselsperren in der Au\u00dfenelementansteuerung bezeichnet, die z. B. zum Sperren von Fahrstra\u00dfen genutzt werden. Alle f\u00fcr das Betriebspersonal (insbesondere Rangierpersonal) zug\u00e4nglichen Schl\u00fcsselsperren sind Au\u00dfenschl\u00fcsselsperren, unabh\u00e4ngig von der Art der Unterbringung. DB-Regelwerk Darstellung durch Zeichnung im Lageplan nach 819.9002 2."
		   });
		addAnnotation
		  (getSchluesselsperre_Bezeichnung(),
		   source,
		   new String[] {
			   "documentation", "Attributgruppe zur Bezeichnung von Stell- und sonstigen Elementen. Sofern ausreichend, wird an dieser Stelle \u00fcber Vererbung die Basisattributgruppe Bezeichnung Element eingebunden. Ist die Abbildung mit den Attributen der Basisattributgruppe nicht m\u00f6glich (z. B. wegen spezieller Patternvorgabe) oder nicht sinnvoll (z. B. weil eine Unterscheidung nach Bezeichnung_Lageplan_..., Bezeichnung_Tabelle und Bezeichnung_Aussenanlage (Pflichtattribute!) nicht notwendig ist), werden in der Attributgruppe Bezeichnung entsprechende objektspezifische Bezeichnungsattribute modelliert. Diese sind nach dem Schema Bezeichnung_[Objektname] zu benennen. Zudem ist es m\u00f6glich, gleichzeitig die Basisattributgruppe Bezeichnung Element und objektspezifische Attribute einzubinden. Siehe auch Bildung der Bezeichnungen. DB-Regelwerk Sicherungstechnischer Lage- und \u00dcbersichtsplan, B\u00dc-Lageplan Planungstabellen "
		   });
		addAnnotation
		  (getSchluesselsperre_IDStellelement(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf das Objekt Stellelement zur Zusammenfassung von Eigenschaften der Objekte BUE Schnittstelle, PZB Element, Schluesselsperre, Signal, W Kr Gsp Element. Das Stellelement enth\u00e4lt Informationen \u00fcber den energetischen und logischen Anschluss der Objekte. F\u00fcr das PZB Element ist der Verweis nur zu f\u00fcllen, wenn das PZB_Element eine G\u00dc ist. DB-Regelwerk Bisher ohne eindeutige Darstellung "
		   });
		addAnnotation
		  (getSchluesselsperre_IDUnterbringung(),
		   source,
		   new String[] {
			   "documentation", "Verweis auf den physischen Ort der Unterbringung von Aussenelementansteuerung, Bedien Einrichtung Oertlich, Bedien Platz, ESTW Zentraleinheit, PZB Element, Schlosskombination, Schluesselsperre und ZN. F\u00fcr das PZB Element wird der Verweis nur f\u00fcr eine G\u00dc gef\u00fcllt - mit der Bedeutung: G\u00dc-Schaltkasten. F\u00fcr die ZN ist der Verweis optional, da im Planungswerkzeug ZN/ZL keine Bef\u00fcllung aller der f\u00fcr die Unterbringung notwendigen Attribute m\u00f6glich ist. DB-Regelwerk Darstellung des Geb\u00e4udes, der Bediens\u00e4ule bzw. des Schaltkastens im sicherungstechnischen Lageplan nach Ril 819.9002 oder Beschreibung im Erl\u00e4uterungsbericht."
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
		  (bedienung_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBedienung_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBedienung_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (beschreibung_Sonderanlage_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBeschreibung_Sonderanlage",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TText",
			   "pattern", ".{1,50}"
		   });
		addAnnotation
		  (beschreibung_Sonderanlage_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBeschreibung_Sonderanlage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBeschreibung_Sonderanlage_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bezeichnung_Schloss_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBezeichnung_Schloss",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TText",
			   "pattern", ".{1,20}"
		   });
		addAnnotation
		  (bezeichnung_Schloss_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBezeichnung_Schloss",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBezeichnung_Schloss_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bezeichnung_Schluessel_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBezeichnung_Schluessel",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TText",
			   "pattern", ".{1,20}"
		   });
		addAnnotation
		  (bezeichnung_Schluessel_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBezeichnung_Schluessel",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBezeichnung_Schluessel_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (bezeichnung_Sk_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TBezeichnung_Sk",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TZeichenkette"
		   });
		addAnnotation
		  (bezeichnung_Sk_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBezeichnung_Sk",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBezeichnung_Sk_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (buE_Lage_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCBUE_Lage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getBUE_Lage_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (enumBedienungArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMBedienung_Art"
		   });
		addAnnotation
		  (enumBedienungArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMBedienung_Art:Object",
			   "baseType", "ENUMBedienung_Art"
		   });
		addAnnotation
		  (enumbueLageEEnum,
		   source,
		   new String[] {
			   "name", "ENUMBUE_Lage"
		   });
		addAnnotation
		  (enumbueLageObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMBUE_Lage:Object",
			   "baseType", "ENUMBUE_Lage"
		   });
		addAnnotation
		  (enumGspLageEEnum,
		   source,
		   new String[] {
			   "name", "ENUMGsp_Lage"
		   });
		addAnnotation
		  (enumGspLageObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMGsp_Lage:Object",
			   "baseType", "ENUMGsp_Lage"
		   });
		addAnnotation
		  (enumSchlossArtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMSchloss_Art"
		   });
		addAnnotation
		  (enumSchlossArtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMSchloss_Art:Object",
			   "baseType", "ENUMSchloss_Art"
		   });
		addAnnotation
		  (enumSchluesselBartformEEnum,
		   source,
		   new String[] {
			   "name", "ENUMSchluessel_Bartform"
		   });
		addAnnotation
		  (enumSchluesselBartformObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMSchluessel_Bartform:Object",
			   "baseType", "ENUMSchluessel_Bartform"
		   });
		addAnnotation
		  (enumSchluesselGruppeEEnum,
		   source,
		   new String[] {
			   "name", "ENUMSchluessel_Gruppe"
		   });
		addAnnotation
		  (enumSchluesselGruppeObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMSchluessel_Gruppe:Object",
			   "baseType", "ENUMSchluessel_Gruppe"
		   });
		addAnnotation
		  (enumSonderanlageLageEEnum,
		   source,
		   new String[] {
			   "name", "ENUMSonderanlage_Lage"
		   });
		addAnnotation
		  (enumSonderanlageLageObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMSonderanlage_Lage:Object",
			   "baseType", "ENUMSonderanlage_Lage"
		   });
		addAnnotation
		  (enumVerschlussOrtEEnum,
		   source,
		   new String[] {
			   "name", "ENUMVerschluss_Ort"
		   });
		addAnnotation
		  (enumVerschlussOrtObjectEDataType,
		   source,
		   new String[] {
			   "name", "ENUMVerschluss_Ort:Object",
			   "baseType", "ENUMVerschluss_Ort"
		   });
		addAnnotation
		  (gsp_Lage_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCGsp_Lage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getGsp_Lage_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (hauptschloss_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCHauptschloss",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getHauptschloss_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (schlossEClass,
		   source,
		   new String[] {
			   "name", "CSchloss",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSchloss_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getSchloss_IDSchluessel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Schluessel"
		   });
		addAnnotation
		  (getSchloss_SchluesselInGrdstEingeschl(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Schluessel_In_Grdst_Eingeschl"
		   });
		addAnnotation
		  (getSchloss_SchlossBUE(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Schloss_BUE"
		   });
		addAnnotation
		  (getSchloss_SchlossGsp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Schloss_Gsp"
		   });
		addAnnotation
		  (getSchloss_SchlossSk(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Schloss_Sk"
		   });
		addAnnotation
		  (getSchloss_SchlossSonderanlage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Schloss_Sonderanlage"
		   });
		addAnnotation
		  (getSchloss_SchlossSsp(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Schloss_Ssp"
		   });
		addAnnotation
		  (getSchloss_SchlossW(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Schloss_W"
		   });
		addAnnotation
		  (getSchloss_TechnischBerechtigter(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Technisch_Berechtigter"
		   });
		addAnnotation
		  (schloss_Art_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCSchloss_Art",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSchloss_Art_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (schloss_Bezeichnung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CSchloss_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSchloss_Bezeichnung_AttributeGroup_BezeichnungSchloss(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung_Schloss"
		   });
		addAnnotation
		  (schloss_BUE_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CSchloss_BUE",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSchloss_BUE_AttributeGroup_BUELage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "BUE_Lage"
		   });
		addAnnotation
		  (getSchloss_BUE_AttributeGroup_IDBUEAnlage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_BUE_Anlage"
		   });
		addAnnotation
		  (schloss_Gsp_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CSchloss_Gsp",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSchloss_Gsp_AttributeGroup_GspLage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Gsp_Lage"
		   });
		addAnnotation
		  (getSchloss_Gsp_AttributeGroup_IDGspElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Gsp_Element"
		   });
		addAnnotation
		  (schloss_Sk_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CSchloss_Sk",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSchloss_Sk_AttributeGroup_Hauptschloss(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Hauptschloss"
		   });
		addAnnotation
		  (getSchloss_Sk_AttributeGroup_IDSchlosskombination(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Schlosskombination"
		   });
		addAnnotation
		  (schloss_Sonderanlage_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CSchloss_Sonderanlage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSchloss_Sonderanlage_AttributeGroup_SonderanlageLage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Sonderanlage_Lage"
		   });
		addAnnotation
		  (getSchloss_Sonderanlage_AttributeGroup_BeschreibungSonderanlage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Beschreibung_Sonderanlage"
		   });
		addAnnotation
		  (getSchloss_Sonderanlage_AttributeGroup_IDSonderanlage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Sonderanlage"
		   });
		addAnnotation
		  (schloss_Ssp_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CSchloss_Ssp",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSchloss_Ssp_AttributeGroup_IDSchluesselsperre(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Schluesselsperre"
		   });
		addAnnotation
		  (schloss_W_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CSchloss_W",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSchloss_W_AttributeGroup_IDWKrElement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_W_Kr_Element"
		   });
		addAnnotation
		  (getSchloss_W_AttributeGroup_SchlossArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Schloss_Art"
		   });
		addAnnotation
		  (getSchloss_W_AttributeGroup_VerschlussOrt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Verschluss_Ort"
		   });
		addAnnotation
		  (getSchloss_W_AttributeGroup_WAnbaulage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "W_Anbaulage"
		   });
		addAnnotation
		  (getSchloss_W_AttributeGroup_WLage(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "W_Lage"
		   });
		addAnnotation
		  (schlosskombinationEClass,
		   source,
		   new String[] {
			   "name", "CSchlosskombination",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSchlosskombination_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getSchlosskombination_IDUnterbringung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Unterbringung"
		   });
		addAnnotation
		  (schlosskombination_Bezeichnung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CSchlosskombination_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSchlosskombination_Bezeichnung_AttributeGroup_BezeichnungSk(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung_Sk"
		   });
		addAnnotation
		  (schluesselEClass,
		   source,
		   new String[] {
			   "name", "CSchluessel",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSchluessel_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getSchluessel_SchluesselAllg(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Schluessel_Allg"
		   });
		addAnnotation
		  (schluessel_Allg_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CSchluessel_Allg",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSchluessel_Allg_AttributeGroup_SchluesselBartform(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Schluessel_Bartform"
		   });
		addAnnotation
		  (getSchluessel_Allg_AttributeGroup_SchluesselGruppe(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Schluessel_Gruppe"
		   });
		addAnnotation
		  (schluessel_Bartform_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCSchluessel_Bartform",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSchluessel_Bartform_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (schluessel_Bezeichnung_AttributeGroupEClass,
		   source,
		   new String[] {
			   "name", "CSchluessel_Bezeichnung",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSchluessel_Bezeichnung_AttributeGroup_BezeichnungSchluessel(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung_Schluessel"
		   });
		addAnnotation
		  (schluessel_Gruppe_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCSchluessel_Gruppe",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSchluessel_Gruppe_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (schluessel_In_Grdst_Eingeschl_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCSchluessel_In_Grdst_Eingeschl",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSchluessel_In_Grdst_Eingeschl_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (schluesselsperreEClass,
		   source,
		   new String[] {
			   "name", "CSchluesselsperre",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSchluesselsperre_BedienungArt(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bedienung_Art"
		   });
		addAnnotation
		  (getSchluesselsperre_Bezeichnung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Bezeichnung"
		   });
		addAnnotation
		  (getSchluesselsperre_IDStellelement(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Stellelement"
		   });
		addAnnotation
		  (getSchluesselsperre_IDUnterbringung(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "ID_Unterbringung"
		   });
		addAnnotation
		  (sonderanlage_Lage_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCSonderanlage_Lage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getSonderanlage_Lage_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (technisch_Berechtigter_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCTechnisch_Berechtigter",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getTechnisch_Berechtigter_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (verschluss_Ort_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCVerschluss_Ort",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getVerschluss_Ort_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (w_Anbaulage_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TW_Anbaulage",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TLinksRechts"
		   });
		addAnnotation
		  (w_Anbaulage_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCW_Anbaulage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getW_Anbaulage_TypeClass_Wert(),
		   source,
		   new String[] {
			   "kind", "element",
			   "name", "Wert"
		   });
		addAnnotation
		  (w_Lage_TypeEDataType,
		   source,
		   new String[] {
			   "name", "TW_Lage",
			   "baseType", "http://www.plan-pro.org/modell/BasisTypen/1.10.0.3#TLinksRechts"
		   });
		addAnnotation
		  (w_Lage_TypeClassEClass,
		   source,
		   new String[] {
			   "name", "TCW_Lage",
			   "kind", "elementOnly"
		   });
		addAnnotation
		  (getW_Lage_TypeClass_Wert(),
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
		  (schlossEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n              \r\n  <ppi:WorkflowInformation>\r\n                   \r\n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n                   \r\n    <ppi:Untergewerke>B\u00dc|ESTW</ppi:Untergewerke>\r\n                \r\n  </ppi:WorkflowInformation>\r\n           \r\n"
		   });
		addAnnotation
		  (getSchloss_TechnischBerechtigter(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                             \r\n  <ppi:WorkflowInformation>\r\n                                  \r\n    <ppi:ProposedValue>true</ppi:ProposedValue>\r\n                               \r\n  </ppi:WorkflowInformation>\r\n                          \r\n"
		   });
		addAnnotation
		  (getSchloss_Bezeichnung_AttributeGroup_BezeichnungSchloss(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                    \r\n  <ppi:WorkflowInformation>\r\n                         \r\n    <ppi:Patternbeschreibung>[1..20]</ppi:Patternbeschreibung>\r\n                      \r\n  </ppi:WorkflowInformation>\r\n                 \r\n"
		   });
		addAnnotation
		  (getSchloss_Sonderanlage_AttributeGroup_SonderanlageLage(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                    \r\n  <ppi:WorkflowInformation>\r\n                         \r\n    <ppi:ProposedValue>befahrbar</ppi:ProposedValue>\r\n                      \r\n  </ppi:WorkflowInformation>\r\n                 \r\n"
		   });
		addAnnotation
		  (getSchloss_Sonderanlage_AttributeGroup_BeschreibungSonderanlage(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                       \r\n  <ppi:WorkflowInformation>\r\n                            \r\n    <ppi:Patternbeschreibung>[1..50]</ppi:Patternbeschreibung>\r\n                         \r\n  </ppi:WorkflowInformation>\r\n                    \r\n"
		   });
		addAnnotation
		  (getSchloss_W_AttributeGroup_SchlossArt(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                    \r\n  <ppi:WorkflowInformation>\r\n                         \r\n    <ppi:ProposedValue>Riegelhandschloss</ppi:ProposedValue>\r\n                      \r\n  </ppi:WorkflowInformation>\r\n                 \r\n"
		   });
		addAnnotation
		  (schlosskombinationEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n              \r\n  <ppi:WorkflowInformation>\r\n                   \r\n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n                   \r\n    <ppi:Untergewerke>B\u00dc|ESTW</ppi:Untergewerke>\r\n                \r\n  </ppi:WorkflowInformation>\r\n           \r\n"
		   });
		addAnnotation
		  (schluesselEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n              \r\n  <ppi:WorkflowInformation>\r\n                   \r\n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n                   \r\n    <ppi:Untergewerke>B\u00dc|ESTW</ppi:Untergewerke>\r\n                \r\n  </ppi:WorkflowInformation>\r\n           \r\n"
		   });
		addAnnotation
		  (getSchluessel_Bezeichnung_AttributeGroup_BezeichnungSchluessel(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                    \r\n  <ppi:WorkflowInformation>\r\n                         \r\n    <ppi:Patternbeschreibung>[1..20]</ppi:Patternbeschreibung>\r\n                      \r\n  </ppi:WorkflowInformation>\r\n                 \r\n"
		   });
		addAnnotation
		  (schluesselsperreEClass,
		   source,
		   new String[] {
			   "appinfo", "\r\n              \r\n  <ppi:WorkflowInformation>\r\n                   \r\n    <ppi:ObjectType>LST_OBJECT</ppi:ObjectType>\r\n                   \r\n    <ppi:Untergewerke>B\u00dc|ESTW</ppi:Untergewerke>\r\n                \r\n  </ppi:WorkflowInformation>\r\n           \r\n"
		   });
		addAnnotation
		  (getSchluesselsperre_BedienungArt(),
		   source,
		   new String[] {
			   "appinfo", "\r\n                          \r\n  <ppi:WorkflowInformation>\r\n                               \r\n    <ppi:PlanningStage>PT1</ppi:PlanningStage>\r\n                            \r\n  </ppi:WorkflowInformation>\r\n                       \r\n"
		   });
	}

} //SchluesselabhaengigkeitenPackageImpl
