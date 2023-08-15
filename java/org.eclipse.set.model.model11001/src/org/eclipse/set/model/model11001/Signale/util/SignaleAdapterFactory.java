/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Signale.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model11001.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt;
import org.eclipse.set.model.model11001.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.model11001.Signale.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model11001.Signale.SignalePackage
 * @generated
 */
public class SignaleAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SignalePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignaleAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SignalePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignaleSwitch<Adapter> modelSwitch =
		new SignaleSwitch<Adapter>() {
			@Override
			public Adapter caseAnschaltdauer_TypeClass(Anschaltdauer_TypeClass object) {
				return createAnschaltdauer_TypeClassAdapter();
			}
			@Override
			public Adapter caseAuto_Einstellung_TypeClass(Auto_Einstellung_TypeClass object) {
				return createAuto_Einstellung_TypeClassAdapter();
			}
			@Override
			public Adapter caseBefestigung_Art_TypeClass(Befestigung_Art_TypeClass object) {
				return createBefestigung_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseBeleuchtet_TypeClass(Beleuchtet_TypeClass object) {
				return createBeleuchtet_TypeClassAdapter();
			}
			@Override
			public Adapter caseBesetzte_Ausfahrt_TypeClass(Besetzte_Ausfahrt_TypeClass object) {
				return createBesetzte_Ausfahrt_TypeClassAdapter();
			}
			@Override
			public Adapter caseDA_Manuell_TypeClass(DA_Manuell_TypeClass object) {
				return createDA_Manuell_TypeClassAdapter();
			}
			@Override
			public Adapter caseDunkelschaltung_TypeClass(Dunkelschaltung_TypeClass object) {
				return createDunkelschaltung_TypeClassAdapter();
			}
			@Override
			public Adapter caseDurchfahrt_TypeClass(Durchfahrt_TypeClass object) {
				return createDurchfahrt_TypeClassAdapter();
			}
			@Override
			public Adapter caseFiktives_Signal_Funktion_TypeClass(Fiktives_Signal_Funktion_TypeClass object) {
				return createFiktives_Signal_Funktion_TypeClassAdapter();
			}
			@Override
			public Adapter caseFundament_Art_TypeClass(Fundament_Art_TypeClass object) {
				return createFundament_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseFunktion_Ohne_Signal_TypeClass(Funktion_Ohne_Signal_TypeClass object) {
				return createFunktion_Ohne_Signal_TypeClassAdapter();
			}
			@Override
			public Adapter caseGegengleis_TypeClass(Gegengleis_TypeClass object) {
				return createGegengleis_TypeClassAdapter();
			}
			@Override
			public Adapter caseGeltungsbereich_TypeClass(Geltungsbereich_TypeClass object) {
				return createGeltungsbereich_TypeClassAdapter();
			}
			@Override
			public Adapter caseGeschaltet_TypeClass(Geschaltet_TypeClass object) {
				return createGeschaltet_TypeClassAdapter();
			}
			@Override
			public Adapter caseHoehe_Fundamentoberkante_TypeClass(Hoehe_Fundamentoberkante_TypeClass object) {
				return createHoehe_Fundamentoberkante_TypeClassAdapter();
			}
			@Override
			public Adapter caseObere_Lichtpunkthoehe_TypeClass(Obere_Lichtpunkthoehe_TypeClass object) {
				return createObere_Lichtpunkthoehe_TypeClassAdapter();
			}
			@Override
			public Adapter casePZB_Schutzstrecke_Soll_TypeClass(PZB_Schutzstrecke_Soll_TypeClass object) {
				return createPZB_Schutzstrecke_Soll_TypeClassAdapter();
			}
			@Override
			public Adapter caseRahmen_Art_TypeClass(Rahmen_Art_TypeClass object) {
				return createRahmen_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseRahmen_Hoehe_TypeClass(Rahmen_Hoehe_TypeClass object) {
				return createRahmen_Hoehe_TypeClassAdapter();
			}
			@Override
			public Adapter caseRangierstrasse_Restaufloesung_TypeClass(Rangierstrasse_Restaufloesung_TypeClass object) {
				return createRangierstrasse_Restaufloesung_TypeClassAdapter();
			}
			@Override
			public Adapter caseRichtpunkt_TypeClass(Richtpunkt_TypeClass object) {
				return createRichtpunkt_TypeClassAdapter();
			}
			@Override
			public Adapter caseRichtpunktentfernung_TypeClass(Richtpunktentfernung_TypeClass object) {
				return createRichtpunktentfernung_TypeClassAdapter();
			}
			@Override
			public Adapter caseSignal(Signal object) {
				return createSignalAdapter();
			}
			@Override
			public Adapter caseSignal_Art_TypeClass(Signal_Art_TypeClass object) {
				return createSignal_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseSignal_Befestigung(Signal_Befestigung object) {
				return createSignal_BefestigungAdapter();
			}
			@Override
			public Adapter caseSignal_Befestigung_Allg_AttributeGroup(Signal_Befestigung_Allg_AttributeGroup object) {
				return createSignal_Befestigung_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseSignal_Befestigungsart_TypeClass(Signal_Befestigungsart_TypeClass object) {
				return createSignal_Befestigungsart_TypeClassAdapter();
			}
			@Override
			public Adapter caseSignal_Fank_Zuordnung(Signal_Fank_Zuordnung object) {
				return createSignal_Fank_ZuordnungAdapter();
			}
			@Override
			public Adapter caseSignal_Fiktiv_AttributeGroup(Signal_Fiktiv_AttributeGroup object) {
				return createSignal_Fiktiv_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseSignal_Fstr_AttributeGroup(Signal_Fstr_AttributeGroup object) {
				return createSignal_Fstr_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseSignal_Fstr_Aus_Inselgleis_AttributeGroup(Signal_Fstr_Aus_Inselgleis_AttributeGroup object) {
				return createSignal_Fstr_Aus_Inselgleis_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseSignal_Fstr_S_AttributeGroup(Signal_Fstr_S_AttributeGroup object) {
				return createSignal_Fstr_S_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseSignal_Funktion_TypeClass(Signal_Funktion_TypeClass object) {
				return createSignal_Funktion_TypeClassAdapter();
			}
			@Override
			public Adapter caseSignal_Rahmen(Signal_Rahmen object) {
				return createSignal_RahmenAdapter();
			}
			@Override
			public Adapter caseSignal_Real_Aktiv_AttributeGroup(Signal_Real_Aktiv_AttributeGroup object) {
				return createSignal_Real_Aktiv_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseSignal_Real_Aktiv_Schirm_AttributeGroup(Signal_Real_Aktiv_Schirm_AttributeGroup object) {
				return createSignal_Real_Aktiv_Schirm_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseSignal_Real_AttributeGroup(Signal_Real_AttributeGroup object) {
				return createSignal_Real_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseSignal_Signalbegriff(Signal_Signalbegriff object) {
				return createSignal_SignalbegriffAdapter();
			}
			@Override
			public Adapter caseSignal_Signalbegriff_Allg_AttributeGroup(Signal_Signalbegriff_Allg_AttributeGroup object) {
				return createSignal_Signalbegriff_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseSignalsicht_Erreichbar_TypeClass(Signalsicht_Erreichbar_TypeClass object) {
				return createSignalsicht_Erreichbar_TypeClassAdapter();
			}
			@Override
			public Adapter caseSignalsicht_Mindest_TypeClass(Signalsicht_Mindest_TypeClass object) {
				return createSignalsicht_Mindest_TypeClassAdapter();
			}
			@Override
			public Adapter caseSignalsicht_Soll_TypeClass(Signalsicht_Soll_TypeClass object) {
				return createSignalsicht_Soll_TypeClassAdapter();
			}
			@Override
			public Adapter caseSignalsystem_TypeClass(Signalsystem_TypeClass object) {
				return createSignalsystem_TypeClassAdapter();
			}
			@Override
			public Adapter caseSonstige_Zulaessige_Anordnung_TypeClass(Sonstige_Zulaessige_Anordnung_TypeClass object) {
				return createSonstige_Zulaessige_Anordnung_TypeClassAdapter();
			}
			@Override
			public Adapter caseStreuscheibe_Art_TypeClass(Streuscheibe_Art_TypeClass object) {
				return createStreuscheibe_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseStreuscheibe_Betriebsstellung_TypeClass(Streuscheibe_Betriebsstellung_TypeClass object) {
				return createStreuscheibe_Betriebsstellung_TypeClassAdapter();
			}
			@Override
			public Adapter caseTunnelsignal_TypeClass(Tunnelsignal_TypeClass object) {
				return createTunnelsignal_TypeClassAdapter();
			}
			@Override
			public Adapter caseZs2_Ueberwacht_TypeClass(Zs2_Ueberwacht_TypeClass object) {
				return createZs2_Ueberwacht_TypeClassAdapter();
			}
			@Override
			public Adapter caseBasisAttribut_AttributeGroup(BasisAttribut_AttributeGroup object) {
				return createBasisAttribut_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseUr_Objekt(Ur_Objekt object) {
				return createUr_ObjektAdapter();
			}
			@Override
			public Adapter caseBasis_Objekt(Basis_Objekt object) {
				return createBasis_ObjektAdapter();
			}
			@Override
			public Adapter casePunkt_Objekt(Punkt_Objekt object) {
				return createPunkt_ObjektAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Anschaltdauer_TypeClass <em>Anschaltdauer Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Anschaltdauer_TypeClass
	 * @generated
	 */
	public Adapter createAnschaltdauer_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Auto_Einstellung_TypeClass <em>Auto Einstellung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Auto_Einstellung_TypeClass
	 * @generated
	 */
	public Adapter createAuto_Einstellung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Befestigung_Art_TypeClass <em>Befestigung Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Befestigung_Art_TypeClass
	 * @generated
	 */
	public Adapter createBefestigung_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Beleuchtet_TypeClass <em>Beleuchtet Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Beleuchtet_TypeClass
	 * @generated
	 */
	public Adapter createBeleuchtet_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Besetzte_Ausfahrt_TypeClass <em>Besetzte Ausfahrt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Besetzte_Ausfahrt_TypeClass
	 * @generated
	 */
	public Adapter createBesetzte_Ausfahrt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.DA_Manuell_TypeClass <em>DA Manuell Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.DA_Manuell_TypeClass
	 * @generated
	 */
	public Adapter createDA_Manuell_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Dunkelschaltung_TypeClass <em>Dunkelschaltung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Dunkelschaltung_TypeClass
	 * @generated
	 */
	public Adapter createDunkelschaltung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Durchfahrt_TypeClass <em>Durchfahrt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Durchfahrt_TypeClass
	 * @generated
	 */
	public Adapter createDurchfahrt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Fiktives_Signal_Funktion_TypeClass <em>Fiktives Signal Funktion Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Fiktives_Signal_Funktion_TypeClass
	 * @generated
	 */
	public Adapter createFiktives_Signal_Funktion_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Fundament_Art_TypeClass <em>Fundament Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Fundament_Art_TypeClass
	 * @generated
	 */
	public Adapter createFundament_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Funktion_Ohne_Signal_TypeClass <em>Funktion Ohne Signal Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Funktion_Ohne_Signal_TypeClass
	 * @generated
	 */
	public Adapter createFunktion_Ohne_Signal_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Gegengleis_TypeClass <em>Gegengleis Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Gegengleis_TypeClass
	 * @generated
	 */
	public Adapter createGegengleis_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Geltungsbereich_TypeClass <em>Geltungsbereich Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Geltungsbereich_TypeClass
	 * @generated
	 */
	public Adapter createGeltungsbereich_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Geschaltet_TypeClass <em>Geschaltet Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Geschaltet_TypeClass
	 * @generated
	 */
	public Adapter createGeschaltet_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Hoehe_Fundamentoberkante_TypeClass <em>Hoehe Fundamentoberkante Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Hoehe_Fundamentoberkante_TypeClass
	 * @generated
	 */
	public Adapter createHoehe_Fundamentoberkante_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Obere_Lichtpunkthoehe_TypeClass <em>Obere Lichtpunkthoehe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Obere_Lichtpunkthoehe_TypeClass
	 * @generated
	 */
	public Adapter createObere_Lichtpunkthoehe_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.PZB_Schutzstrecke_Soll_TypeClass <em>PZB Schutzstrecke Soll Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.PZB_Schutzstrecke_Soll_TypeClass
	 * @generated
	 */
	public Adapter createPZB_Schutzstrecke_Soll_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Rahmen_Art_TypeClass <em>Rahmen Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Rahmen_Art_TypeClass
	 * @generated
	 */
	public Adapter createRahmen_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Rahmen_Hoehe_TypeClass <em>Rahmen Hoehe Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Rahmen_Hoehe_TypeClass
	 * @generated
	 */
	public Adapter createRahmen_Hoehe_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Rangierstrasse_Restaufloesung_TypeClass <em>Rangierstrasse Restaufloesung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Rangierstrasse_Restaufloesung_TypeClass
	 * @generated
	 */
	public Adapter createRangierstrasse_Restaufloesung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Richtpunkt_TypeClass <em>Richtpunkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Richtpunkt_TypeClass
	 * @generated
	 */
	public Adapter createRichtpunkt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Richtpunktentfernung_TypeClass <em>Richtpunktentfernung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Richtpunktentfernung_TypeClass
	 * @generated
	 */
	public Adapter createRichtpunktentfernung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Signal <em>Signal</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Signal
	 * @generated
	 */
	public Adapter createSignalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Signal_Art_TypeClass <em>Signal Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Signal_Art_TypeClass
	 * @generated
	 */
	public Adapter createSignal_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Signal_Befestigung <em>Signal Befestigung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Signal_Befestigung
	 * @generated
	 */
	public Adapter createSignal_BefestigungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Signal_Befestigung_Allg_AttributeGroup <em>Signal Befestigung Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Signal_Befestigung_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createSignal_Befestigung_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Signal_Befestigungsart_TypeClass <em>Signal Befestigungsart Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Signal_Befestigungsart_TypeClass
	 * @generated
	 */
	public Adapter createSignal_Befestigungsart_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Signal_Fank_Zuordnung <em>Signal Fank Zuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Signal_Fank_Zuordnung
	 * @generated
	 */
	public Adapter createSignal_Fank_ZuordnungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Signal_Fiktiv_AttributeGroup <em>Signal Fiktiv Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Signal_Fiktiv_AttributeGroup
	 * @generated
	 */
	public Adapter createSignal_Fiktiv_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Signal_Fstr_AttributeGroup <em>Signal Fstr Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Signal_Fstr_AttributeGroup
	 * @generated
	 */
	public Adapter createSignal_Fstr_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Signal_Fstr_Aus_Inselgleis_AttributeGroup <em>Signal Fstr Aus Inselgleis Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Signal_Fstr_Aus_Inselgleis_AttributeGroup
	 * @generated
	 */
	public Adapter createSignal_Fstr_Aus_Inselgleis_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Signal_Fstr_S_AttributeGroup <em>Signal Fstr SAttribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Signal_Fstr_S_AttributeGroup
	 * @generated
	 */
	public Adapter createSignal_Fstr_S_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Signal_Funktion_TypeClass <em>Signal Funktion Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Signal_Funktion_TypeClass
	 * @generated
	 */
	public Adapter createSignal_Funktion_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Signal_Rahmen <em>Signal Rahmen</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Signal_Rahmen
	 * @generated
	 */
	public Adapter createSignal_RahmenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Signal_Real_Aktiv_AttributeGroup <em>Signal Real Aktiv Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Signal_Real_Aktiv_AttributeGroup
	 * @generated
	 */
	public Adapter createSignal_Real_Aktiv_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup <em>Signal Real Aktiv Schirm Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Signal_Real_Aktiv_Schirm_AttributeGroup
	 * @generated
	 */
	public Adapter createSignal_Real_Aktiv_Schirm_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Signal_Real_AttributeGroup <em>Signal Real Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Signal_Real_AttributeGroup
	 * @generated
	 */
	public Adapter createSignal_Real_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Signal_Signalbegriff <em>Signal Signalbegriff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Signal_Signalbegriff
	 * @generated
	 */
	public Adapter createSignal_SignalbegriffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Signal_Signalbegriff_Allg_AttributeGroup <em>Signal Signalbegriff Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Signal_Signalbegriff_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createSignal_Signalbegriff_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Signalsicht_Erreichbar_TypeClass <em>Signalsicht Erreichbar Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Signalsicht_Erreichbar_TypeClass
	 * @generated
	 */
	public Adapter createSignalsicht_Erreichbar_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Signalsicht_Mindest_TypeClass <em>Signalsicht Mindest Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Signalsicht_Mindest_TypeClass
	 * @generated
	 */
	public Adapter createSignalsicht_Mindest_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Signalsicht_Soll_TypeClass <em>Signalsicht Soll Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Signalsicht_Soll_TypeClass
	 * @generated
	 */
	public Adapter createSignalsicht_Soll_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Signalsystem_TypeClass <em>Signalsystem Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Signalsystem_TypeClass
	 * @generated
	 */
	public Adapter createSignalsystem_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Sonstige_Zulaessige_Anordnung_TypeClass <em>Sonstige Zulaessige Anordnung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Sonstige_Zulaessige_Anordnung_TypeClass
	 * @generated
	 */
	public Adapter createSonstige_Zulaessige_Anordnung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Streuscheibe_Art_TypeClass <em>Streuscheibe Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Streuscheibe_Art_TypeClass
	 * @generated
	 */
	public Adapter createStreuscheibe_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Streuscheibe_Betriebsstellung_TypeClass <em>Streuscheibe Betriebsstellung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Streuscheibe_Betriebsstellung_TypeClass
	 * @generated
	 */
	public Adapter createStreuscheibe_Betriebsstellung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Tunnelsignal_TypeClass <em>Tunnelsignal Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Tunnelsignal_TypeClass
	 * @generated
	 */
	public Adapter createTunnelsignal_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Signale.Zs2_Ueberwacht_TypeClass <em>Zs2 Ueberwacht Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Signale.Zs2_Ueberwacht_TypeClass
	 * @generated
	 */
	public Adapter createZs2_Ueberwacht_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.BasisTypen.BasisAttribut_AttributeGroup <em>Basis Attribut Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.BasisTypen.BasisAttribut_AttributeGroup
	 * @generated
	 */
	public Adapter createBasisAttribut_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Basisobjekte.Ur_Objekt <em>Ur Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Basisobjekte.Ur_Objekt
	 * @generated
	 */
	public Adapter createUr_ObjektAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt <em>Basis Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Basisobjekte.Basis_Objekt
	 * @generated
	 */
	public Adapter createBasis_ObjektAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt <em>Punkt Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model11001.Basisobjekte.Punkt_Objekt
	 * @generated
	 */
	public Adapter createPunkt_ObjektAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SignaleAdapterFactory
