/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Block.util;

import java.math.BigInteger;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

import org.eclipse.set.model.model11001.BasisTypen.util.BasisTypenValidator;

import org.eclipse.set.model.model11001.Block.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Block.BlockPackage
 * @generated
 */
public class BlockValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final BlockValidator INSTANCE = new BlockValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.eclipse.set.model.model11001.Block";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BasisTypenValidator basisTypenValidator;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockValidator() {
		super();
		basisTypenValidator = BasisTypenValidator.INSTANCE;
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return BlockPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case BlockPackage.AUTO_ERLAUBNISHOLEN_TYPE_CLASS:
				return validateAuto_Erlaubnisholen_TypeClass((Auto_Erlaubnisholen_TypeClass)value, diagnostics, context);
			case BlockPackage.AUTO_ERLAUBNISRUECKLAUF_TYPE_CLASS:
				return validateAuto_Erlaubnisruecklauf_TypeClass((Auto_Erlaubnisruecklauf_TypeClass)value, diagnostics, context);
			case BlockPackage.BETRIEBSFUEHRUNG_TYPE_CLASS:
				return validateBetriebsfuehrung_TypeClass((Betriebsfuehrung_TypeClass)value, diagnostics, context);
			case BlockPackage.BLOCK_ANLAGE:
				return validateBlock_Anlage((Block_Anlage)value, diagnostics, context);
			case BlockPackage.BLOCK_ANLAGE_ALLG_ATTRIBUTE_GROUP:
				return validateBlock_Anlage_Allg_AttributeGroup((Block_Anlage_Allg_AttributeGroup)value, diagnostics, context);
			case BlockPackage.BLOCK_BAUFORM_TYPE_CLASS:
				return validateBlock_Bauform_TypeClass((Block_Bauform_TypeClass)value, diagnostics, context);
			case BlockPackage.BLOCK_ELEMENT:
				return validateBlock_Element((Block_Element)value, diagnostics, context);
			case BlockPackage.BLOCK_ELEMENT_ALLG_ATTRIBUTE_GROUP:
				return validateBlock_Element_Allg_AttributeGroup((Block_Element_Allg_AttributeGroup)value, diagnostics, context);
			case BlockPackage.BLOCK_ELEMENT_ERLAUBNIS_ATTRIBUTE_GROUP:
				return validateBlock_Element_Erlaubnis_AttributeGroup((Block_Element_Erlaubnis_AttributeGroup)value, diagnostics, context);
			case BlockPackage.BLOCK_STRECKE:
				return validateBlock_Strecke((Block_Strecke)value, diagnostics, context);
			case BlockPackage.BLOCK_STRECKE_ALLG_ATTRIBUTE_GROUP:
				return validateBlock_Strecke_Allg_AttributeGroup((Block_Strecke_Allg_AttributeGroup)value, diagnostics, context);
			case BlockPackage.BREMSWEG_TYPE_CLASS:
				return validateBremsweg_TypeClass((Bremsweg_TypeClass)value, diagnostics, context);
			case BlockPackage.ERLAUBNIS_STAENDIG_VORHANDEN_TYPE_CLASS:
				return validateErlaubnis_Staendig_Vorhanden_TypeClass((Erlaubnis_Staendig_Vorhanden_TypeClass)value, diagnostics, context);
			case BlockPackage.ERLAUBNISABGABESPEICHERUNG_TYPE_CLASS:
				return validateErlaubnisabgabespeicherung_TypeClass((Erlaubnisabgabespeicherung_TypeClass)value, diagnostics, context);
			case BlockPackage.ERLAUBNISHOLEN_TYPE_CLASS:
				return validateErlaubnisholen_TypeClass((Erlaubnisholen_TypeClass)value, diagnostics, context);
			case BlockPackage.RUECKBLOCKWECKER_TYPE_CLASS:
				return validateRueckblockwecker_TypeClass((Rueckblockwecker_TypeClass)value, diagnostics, context);
			case BlockPackage.SCHALTUNG_TYPE_CLASS:
				return validateSchaltung_TypeClass((Schaltung_TypeClass)value, diagnostics, context);
			case BlockPackage.SCHUTZUEBERTRAGER_TYPE_CLASS:
				return validateSchutzuebertrager_TypeClass((Schutzuebertrager_TypeClass)value, diagnostics, context);
			case BlockPackage.STRECKE_ART_TYPE_CLASS:
				return validateStrecke_Art_TypeClass((Strecke_Art_TypeClass)value, diagnostics, context);
			case BlockPackage.STRECKENGESCHWINDIGKEIT_TYPE_CLASS:
				return validateStreckengeschwindigkeit_TypeClass((Streckengeschwindigkeit_TypeClass)value, diagnostics, context);
			case BlockPackage.TRAKTION_ART_ELEKTRISCH_TYPE_CLASS:
				return validateTraktion_Art_Elektrisch_TypeClass((Traktion_Art_Elektrisch_TypeClass)value, diagnostics, context);
			case BlockPackage.VORBLOCKWECKER_TYPE_CLASS:
				return validateVorblockwecker_TypeClass((Vorblockwecker_TypeClass)value, diagnostics, context);
			case BlockPackage.ZUGBEEINFLUSSUNG_ART_TYPE_CLASS:
				return validateZugbeeinflussung_Art_TypeClass((Zugbeeinflussung_Art_TypeClass)value, diagnostics, context);
			case BlockPackage.ZUSATZINFORMATION_TYPE_CLASS:
				return validateZusatzinformation_TypeClass((Zusatzinformation_TypeClass)value, diagnostics, context);
			case BlockPackage.ENUM_BETRIEBSFUEHRUNG:
				return validateENUMBetriebsfuehrung((ENUMBetriebsfuehrung)value, diagnostics, context);
			case BlockPackage.ENUM_BLOCK_BAUFORM:
				return validateENUMBlockBauform((ENUMBlockBauform)value, diagnostics, context);
			case BlockPackage.ENUM_SCHALTUNG:
				return validateENUMSchaltung((ENUMSchaltung)value, diagnostics, context);
			case BlockPackage.ENUM_STRECKE_ART:
				return validateENUMStreckeArt((ENUMStreckeArt)value, diagnostics, context);
			case BlockPackage.ENUM_BETRIEBSFUEHRUNG_OBJECT:
				return validateENUMBetriebsfuehrungObject((ENUMBetriebsfuehrung)value, diagnostics, context);
			case BlockPackage.ENUM_BLOCK_BAUFORM_OBJECT:
				return validateENUMBlockBauformObject((ENUMBlockBauform)value, diagnostics, context);
			case BlockPackage.ENUM_SCHALTUNG_OBJECT:
				return validateENUMSchaltungObject((ENUMSchaltung)value, diagnostics, context);
			case BlockPackage.ENUM_STRECKE_ART_OBJECT:
				return validateENUMStreckeArtObject((ENUMStreckeArt)value, diagnostics, context);
			case BlockPackage.STRECKENGESCHWINDIGKEIT_TYPE:
				return validateStreckengeschwindigkeit_Type((BigInteger)value, diagnostics, context);
			case BlockPackage.ZUSATZINFORMATION_TYPE:
				return validateZusatzinformation_Type((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuto_Erlaubnisholen_TypeClass(Auto_Erlaubnisholen_TypeClass auto_Erlaubnisholen_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auto_Erlaubnisholen_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAuto_Erlaubnisruecklauf_TypeClass(Auto_Erlaubnisruecklauf_TypeClass auto_Erlaubnisruecklauf_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(auto_Erlaubnisruecklauf_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBetriebsfuehrung_TypeClass(Betriebsfuehrung_TypeClass betriebsfuehrung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(betriebsfuehrung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlock_Anlage(Block_Anlage block_Anlage, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(block_Anlage, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlock_Anlage_Allg_AttributeGroup(Block_Anlage_Allg_AttributeGroup block_Anlage_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(block_Anlage_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlock_Bauform_TypeClass(Block_Bauform_TypeClass block_Bauform_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(block_Bauform_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlock_Element(Block_Element block_Element, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(block_Element, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlock_Element_Allg_AttributeGroup(Block_Element_Allg_AttributeGroup block_Element_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(block_Element_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlock_Element_Erlaubnis_AttributeGroup(Block_Element_Erlaubnis_AttributeGroup block_Element_Erlaubnis_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(block_Element_Erlaubnis_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlock_Strecke(Block_Strecke block_Strecke, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(block_Strecke, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlock_Strecke_Allg_AttributeGroup(Block_Strecke_Allg_AttributeGroup block_Strecke_Allg_AttributeGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(block_Strecke_Allg_AttributeGroup, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBremsweg_TypeClass(Bremsweg_TypeClass bremsweg_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bremsweg_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErlaubnis_Staendig_Vorhanden_TypeClass(Erlaubnis_Staendig_Vorhanden_TypeClass erlaubnis_Staendig_Vorhanden_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(erlaubnis_Staendig_Vorhanden_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErlaubnisabgabespeicherung_TypeClass(Erlaubnisabgabespeicherung_TypeClass erlaubnisabgabespeicherung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(erlaubnisabgabespeicherung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateErlaubnisholen_TypeClass(Erlaubnisholen_TypeClass erlaubnisholen_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(erlaubnisholen_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRueckblockwecker_TypeClass(Rueckblockwecker_TypeClass rueckblockwecker_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(rueckblockwecker_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchaltung_TypeClass(Schaltung_TypeClass schaltung_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schaltung_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchutzuebertrager_TypeClass(Schutzuebertrager_TypeClass schutzuebertrager_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schutzuebertrager_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStrecke_Art_TypeClass(Strecke_Art_TypeClass strecke_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(strecke_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStreckengeschwindigkeit_TypeClass(Streckengeschwindigkeit_TypeClass streckengeschwindigkeit_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(streckengeschwindigkeit_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTraktion_Art_Elektrisch_TypeClass(Traktion_Art_Elektrisch_TypeClass traktion_Art_Elektrisch_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(traktion_Art_Elektrisch_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVorblockwecker_TypeClass(Vorblockwecker_TypeClass vorblockwecker_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vorblockwecker_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZugbeeinflussung_Art_TypeClass(Zugbeeinflussung_Art_TypeClass zugbeeinflussung_Art_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zugbeeinflussung_Art_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZusatzinformation_TypeClass(Zusatzinformation_TypeClass zusatzinformation_TypeClass, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(zusatzinformation_TypeClass, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBetriebsfuehrung(ENUMBetriebsfuehrung enumBetriebsfuehrung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBlockBauform(ENUMBlockBauform enumBlockBauform, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSchaltung(ENUMSchaltung enumSchaltung, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMStreckeArt(ENUMStreckeArt enumStreckeArt, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBetriebsfuehrungObject(ENUMBetriebsfuehrung enumBetriebsfuehrungObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMBlockBauformObject(ENUMBlockBauform enumBlockBauformObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMSchaltungObject(ENUMSchaltung enumSchaltungObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateENUMStreckeArtObject(ENUMStreckeArt enumStreckeArtObject, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStreckengeschwindigkeit_Type(BigInteger streckengeschwindigkeit_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = basisTypenValidator.validateGeschwindigkeit_Type_Pattern(streckengeschwindigkeit_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZusatzinformation_Type(String zusatzinformation_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateZusatzinformation_Type_Pattern(zusatzinformation_Type, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateZusatzinformation_Type_Pattern
	 */
	public static final  PatternMatcher [][] ZUSATZINFORMATION_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,50}")
			},
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher(".{1,250}")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Zusatzinformation Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateZusatzinformation_Type_Pattern(String zusatzinformation_Type, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(BlockPackage.Literals.ZUSATZINFORMATION_TYPE, zusatzinformation_Type, ZUSATZINFORMATION_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //BlockValidator
