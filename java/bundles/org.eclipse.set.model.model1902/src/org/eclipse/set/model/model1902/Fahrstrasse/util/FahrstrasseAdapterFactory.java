/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Fahrstrasse.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model1902.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.model1902.Basisobjekte.Bereich_Objekt;
import org.eclipse.set.model.model1902.Basisobjekte.Punkt_Objekt;
import org.eclipse.set.model.model1902.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.model1902.Fahrstrasse.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Fahrstrasse.FahrstrassePackage
 * @generated
 */
public class FahrstrasseAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FahrstrassePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FahrstrasseAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FahrstrassePackage.eINSTANCE;
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
	protected FahrstrasseSwitch<Adapter> modelSwitch =
		new FahrstrasseSwitch<Adapter>() {
			@Override
			public Adapter caseAufloesung_Ssp_Zielgeis_TypeClass(Aufloesung_Ssp_Zielgeis_TypeClass object) {
				return createAufloesung_Ssp_Zielgeis_TypeClassAdapter();
			}
			@Override
			public Adapter caseAufloesung_Verzoegerung_TypeClass(Aufloesung_Verzoegerung_TypeClass object) {
				return createAufloesung_Verzoegerung_TypeClassAdapter();
			}
			@Override
			public Adapter caseAutomatische_Einstellung_TypeClass(Automatische_Einstellung_TypeClass object) {
				return createAutomatische_Einstellung_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_Fstr_DWeg_TypeClass(Bezeichnung_Fstr_DWeg_TypeClass object) {
				return createBezeichnung_Fstr_DWeg_TypeClassAdapter();
			}
			@Override
			public Adapter caseBezeichnung_Markanter_Punkt_TypeClass(Bezeichnung_Markanter_Punkt_TypeClass object) {
				return createBezeichnung_Markanter_Punkt_TypeClassAdapter();
			}
			@Override
			public Adapter caseDWeg_Reihenfolge_TypeClass(DWeg_Reihenfolge_TypeClass object) {
				return createDWeg_Reihenfolge_TypeClassAdapter();
			}
			@Override
			public Adapter caseDWeg_V_Aufwertung_Verzicht_TypeClass(DWeg_V_Aufwertung_Verzicht_TypeClass object) {
				return createDWeg_V_Aufwertung_Verzicht_TypeClassAdapter();
			}
			@Override
			public Adapter caseDWeg_V_TypeClass(DWeg_V_TypeClass object) {
				return createDWeg_V_TypeClassAdapter();
			}
			@Override
			public Adapter caseDWeg_Vorzug_TypeClass(DWeg_Vorzug_TypeClass object) {
				return createDWeg_Vorzug_TypeClassAdapter();
			}
			@Override
			public Adapter caseElement_Verschluss_TypeClass(Element_Verschluss_TypeClass object) {
				return createElement_Verschluss_TypeClassAdapter();
			}
			@Override
			public Adapter caseF_Bedienung_TypeClass(F_Bedienung_TypeClass object) {
				return createF_Bedienung_TypeClassAdapter();
			}
			@Override
			public Adapter caseFstr_Abhaengigkeit(Fstr_Abhaengigkeit object) {
				return createFstr_AbhaengigkeitAdapter();
			}
			@Override
			public Adapter caseFstr_Abhaengigkeit_Ssp_AttributeGroup(Fstr_Abhaengigkeit_Ssp_AttributeGroup object) {
				return createFstr_Abhaengigkeit_Ssp_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFstr_Aneinander(Fstr_Aneinander object) {
				return createFstr_AneinanderAdapter();
			}
			@Override
			public Adapter caseFstr_Aneinander_Bedienstring_TypeClass(Fstr_Aneinander_Bedienstring_TypeClass object) {
				return createFstr_Aneinander_Bedienstring_TypeClassAdapter();
			}
			@Override
			public Adapter caseFstr_Aneinander_Zuordnung(Fstr_Aneinander_Zuordnung object) {
				return createFstr_Aneinander_ZuordnungAdapter();
			}
			@Override
			public Adapter caseFstr_Art_TypeClass(Fstr_Art_TypeClass object) {
				return createFstr_Art_TypeClassAdapter();
			}
			@Override
			public Adapter caseFstr_Bedienstring_TypeClass(Fstr_Bedienstring_TypeClass object) {
				return createFstr_Bedienstring_TypeClassAdapter();
			}
			@Override
			public Adapter caseFstr_Bildezeit_TypeClass(Fstr_Bildezeit_TypeClass object) {
				return createFstr_Bildezeit_TypeClassAdapter();
			}
			@Override
			public Adapter caseFstr_DWeg(Fstr_DWeg object) {
				return createFstr_DWegAdapter();
			}
			@Override
			public Adapter caseFstr_DWeg_Allg_AttributeGroup(Fstr_DWeg_Allg_AttributeGroup object) {
				return createFstr_DWeg_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFstr_DWeg_Bezeichnung_AttributeGroup(Fstr_DWeg_Bezeichnung_AttributeGroup object) {
				return createFstr_DWeg_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFstr_DWeg_Spezifisch_AttributeGroup(Fstr_DWeg_Spezifisch_AttributeGroup object) {
				return createFstr_DWeg_Spezifisch_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFstr_DWeg_W_Kr(Fstr_DWeg_W_Kr object) {
				return createFstr_DWeg_W_KrAdapter();
			}
			@Override
			public Adapter caseFstr_DWeg_W_Kr_Allg_AttributeGroup(Fstr_DWeg_W_Kr_Allg_AttributeGroup object) {
				return createFstr_DWeg_W_Kr_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFstr_DWeg_W_Kr_Allg_child_AttributeGroup(Fstr_DWeg_W_Kr_Allg_child_AttributeGroup object) {
				return createFstr_DWeg_W_Kr_Allg_child_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFstr_DWeg_W_Kr_TypeClass(Fstr_DWeg_W_Kr_TypeClass object) {
				return createFstr_DWeg_W_Kr_TypeClassAdapter();
			}
			@Override
			public Adapter caseFstr_Fahrweg(Fstr_Fahrweg object) {
				return createFstr_FahrwegAdapter();
			}
			@Override
			public Adapter caseFstr_Mittel_AttributeGroup(Fstr_Mittel_AttributeGroup object) {
				return createFstr_Mittel_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFstr_Mittel_V_Aufwertung_TypeClass(Fstr_Mittel_V_Aufwertung_TypeClass object) {
				return createFstr_Mittel_V_Aufwertung_TypeClassAdapter();
			}
			@Override
			public Adapter caseFstr_Nichthaltfall(Fstr_Nichthaltfall object) {
				return createFstr_NichthaltfallAdapter();
			}
			@Override
			public Adapter caseFstr_Rangier_AttributeGroup(Fstr_Rangier_AttributeGroup object) {
				return createFstr_Rangier_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFstr_Rangier_Fla_Zuordnung(Fstr_Rangier_Fla_Zuordnung object) {
				return createFstr_Rangier_Fla_ZuordnungAdapter();
			}
			@Override
			public Adapter caseFstr_Reihenfolge_TypeClass(Fstr_Reihenfolge_TypeClass object) {
				return createFstr_Reihenfolge_TypeClassAdapter();
			}
			@Override
			public Adapter caseFstr_Signalisierung(Fstr_Signalisierung object) {
				return createFstr_SignalisierungAdapter();
			}
			@Override
			public Adapter caseFstr_Umfahrpunkt(Fstr_Umfahrpunkt object) {
				return createFstr_UmfahrpunktAdapter();
			}
			@Override
			public Adapter caseFstr_V_Hg_TypeClass(Fstr_V_Hg_TypeClass object) {
				return createFstr_V_Hg_TypeClassAdapter();
			}
			@Override
			public Adapter caseFstr_V_TypeClass(Fstr_V_TypeClass object) {
				return createFstr_V_TypeClassAdapter();
			}
			@Override
			public Adapter caseFstr_Vsigabstand_Verkuerzt_TypeClass(Fstr_Vsigabstand_Verkuerzt_TypeClass object) {
				return createFstr_Vsigabstand_Verkuerzt_TypeClassAdapter();
			}
			@Override
			public Adapter caseFstr_Zug_AttributeGroup(Fstr_Zug_AttributeGroup object) {
				return createFstr_Zug_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFstr_Zug_DWeg_AttributeGroup(Fstr_Zug_DWeg_AttributeGroup object) {
				return createFstr_Zug_DWeg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseFstr_Zug_Rangier(Fstr_Zug_Rangier object) {
				return createFstr_Zug_RangierAdapter();
			}
			@Override
			public Adapter caseFstr_Zug_Rangier_Allg_AttributeGroup(Fstr_Zug_Rangier_Allg_AttributeGroup object) {
				return createFstr_Zug_Rangier_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseLaenge_Soll_TypeClass(Laenge_Soll_TypeClass object) {
				return createLaenge_Soll_TypeClassAdapter();
			}
			@Override
			public Adapter caseMarkanter_Punkt(Markanter_Punkt object) {
				return createMarkanter_PunktAdapter();
			}
			@Override
			public Adapter caseMarkanter_Punkt_Bezeichnung_AttributeGroup(Markanter_Punkt_Bezeichnung_AttributeGroup object) {
				return createMarkanter_Punkt_Bezeichnung_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseMassgebende_Neigung_TypeClass(Massgebende_Neigung_TypeClass object) {
				return createMassgebende_Neigung_TypeClassAdapter();
			}
			@Override
			public Adapter caseRangier_Gegenfahrtausschluss_TypeClass(Rangier_Gegenfahrtausschluss_TypeClass object) {
				return createRangier_Gegenfahrtausschluss_TypeClassAdapter();
			}
			@Override
			public Adapter caseSonstiger_Punkt(Sonstiger_Punkt object) {
				return createSonstiger_PunktAdapter();
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
			public Adapter caseBereich_Objekt(Bereich_Objekt object) {
				return createBereich_ObjektAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Aufloesung_Ssp_Zielgeis_TypeClass <em>Aufloesung Ssp Zielgeis Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Aufloesung_Ssp_Zielgeis_TypeClass
	 * @generated
	 */
	public Adapter createAufloesung_Ssp_Zielgeis_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Aufloesung_Verzoegerung_TypeClass <em>Aufloesung Verzoegerung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Aufloesung_Verzoegerung_TypeClass
	 * @generated
	 */
	public Adapter createAufloesung_Verzoegerung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Automatische_Einstellung_TypeClass <em>Automatische Einstellung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Automatische_Einstellung_TypeClass
	 * @generated
	 */
	public Adapter createAutomatische_Einstellung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Bezeichnung_Fstr_DWeg_TypeClass <em>Bezeichnung Fstr DWeg Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Bezeichnung_Fstr_DWeg_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_Fstr_DWeg_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Bezeichnung_Markanter_Punkt_TypeClass <em>Bezeichnung Markanter Punkt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Bezeichnung_Markanter_Punkt_TypeClass
	 * @generated
	 */
	public Adapter createBezeichnung_Markanter_Punkt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.DWeg_Reihenfolge_TypeClass <em>DWeg Reihenfolge Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.DWeg_Reihenfolge_TypeClass
	 * @generated
	 */
	public Adapter createDWeg_Reihenfolge_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.DWeg_V_Aufwertung_Verzicht_TypeClass <em>DWeg VAufwertung Verzicht Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.DWeg_V_Aufwertung_Verzicht_TypeClass
	 * @generated
	 */
	public Adapter createDWeg_V_Aufwertung_Verzicht_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.DWeg_V_TypeClass <em>DWeg VType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.DWeg_V_TypeClass
	 * @generated
	 */
	public Adapter createDWeg_V_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.DWeg_Vorzug_TypeClass <em>DWeg Vorzug Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.DWeg_Vorzug_TypeClass
	 * @generated
	 */
	public Adapter createDWeg_Vorzug_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Element_Verschluss_TypeClass <em>Element Verschluss Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Element_Verschluss_TypeClass
	 * @generated
	 */
	public Adapter createElement_Verschluss_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.F_Bedienung_TypeClass <em>FBedienung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.F_Bedienung_TypeClass
	 * @generated
	 */
	public Adapter createF_Bedienung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Abhaengigkeit <em>Fstr Abhaengigkeit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Abhaengigkeit
	 * @generated
	 */
	public Adapter createFstr_AbhaengigkeitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Abhaengigkeit_Ssp_AttributeGroup <em>Fstr Abhaengigkeit Ssp Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Abhaengigkeit_Ssp_AttributeGroup
	 * @generated
	 */
	public Adapter createFstr_Abhaengigkeit_Ssp_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Aneinander <em>Fstr Aneinander</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Aneinander
	 * @generated
	 */
	public Adapter createFstr_AneinanderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Aneinander_Bedienstring_TypeClass <em>Fstr Aneinander Bedienstring Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Aneinander_Bedienstring_TypeClass
	 * @generated
	 */
	public Adapter createFstr_Aneinander_Bedienstring_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Aneinander_Zuordnung <em>Fstr Aneinander Zuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Aneinander_Zuordnung
	 * @generated
	 */
	public Adapter createFstr_Aneinander_ZuordnungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Art_TypeClass <em>Fstr Art Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Art_TypeClass
	 * @generated
	 */
	public Adapter createFstr_Art_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Bedienstring_TypeClass <em>Fstr Bedienstring Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Bedienstring_TypeClass
	 * @generated
	 */
	public Adapter createFstr_Bedienstring_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Bildezeit_TypeClass <em>Fstr Bildezeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Bildezeit_TypeClass
	 * @generated
	 */
	public Adapter createFstr_Bildezeit_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg <em>Fstr DWeg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg
	 * @generated
	 */
	public Adapter createFstr_DWegAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_Allg_AttributeGroup <em>Fstr DWeg Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createFstr_DWeg_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_Bezeichnung_AttributeGroup <em>Fstr DWeg Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createFstr_DWeg_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_Spezifisch_AttributeGroup <em>Fstr DWeg Spezifisch Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_Spezifisch_AttributeGroup
	 * @generated
	 */
	public Adapter createFstr_DWeg_Spezifisch_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_W_Kr <em>Fstr DWeg WKr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_W_Kr
	 * @generated
	 */
	public Adapter createFstr_DWeg_W_KrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_W_Kr_Allg_AttributeGroup <em>Fstr DWeg WKr Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_W_Kr_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createFstr_DWeg_W_Kr_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_W_Kr_Allg_child_AttributeGroup <em>Fstr DWeg WKr Allg child Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_W_Kr_Allg_child_AttributeGroup
	 * @generated
	 */
	public Adapter createFstr_DWeg_W_Kr_Allg_child_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_W_Kr_TypeClass <em>Fstr DWeg WKr Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Fstr_DWeg_W_Kr_TypeClass
	 * @generated
	 */
	public Adapter createFstr_DWeg_W_Kr_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Fahrweg <em>Fstr Fahrweg</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Fahrweg
	 * @generated
	 */
	public Adapter createFstr_FahrwegAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Mittel_AttributeGroup <em>Fstr Mittel Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Mittel_AttributeGroup
	 * @generated
	 */
	public Adapter createFstr_Mittel_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Mittel_V_Aufwertung_TypeClass <em>Fstr Mittel VAufwertung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Mittel_V_Aufwertung_TypeClass
	 * @generated
	 */
	public Adapter createFstr_Mittel_V_Aufwertung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Nichthaltfall <em>Fstr Nichthaltfall</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Nichthaltfall
	 * @generated
	 */
	public Adapter createFstr_NichthaltfallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Rangier_AttributeGroup <em>Fstr Rangier Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Rangier_AttributeGroup
	 * @generated
	 */
	public Adapter createFstr_Rangier_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Rangier_Fla_Zuordnung <em>Fstr Rangier Fla Zuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Rangier_Fla_Zuordnung
	 * @generated
	 */
	public Adapter createFstr_Rangier_Fla_ZuordnungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Reihenfolge_TypeClass <em>Fstr Reihenfolge Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Reihenfolge_TypeClass
	 * @generated
	 */
	public Adapter createFstr_Reihenfolge_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Signalisierung <em>Fstr Signalisierung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Signalisierung
	 * @generated
	 */
	public Adapter createFstr_SignalisierungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Umfahrpunkt <em>Fstr Umfahrpunkt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Umfahrpunkt
	 * @generated
	 */
	public Adapter createFstr_UmfahrpunktAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_V_Hg_TypeClass <em>Fstr VHg Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Fstr_V_Hg_TypeClass
	 * @generated
	 */
	public Adapter createFstr_V_Hg_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_V_TypeClass <em>Fstr VType Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Fstr_V_TypeClass
	 * @generated
	 */
	public Adapter createFstr_V_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Vsigabstand_Verkuerzt_TypeClass <em>Fstr Vsigabstand Verkuerzt Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Vsigabstand_Verkuerzt_TypeClass
	 * @generated
	 */
	public Adapter createFstr_Vsigabstand_Verkuerzt_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Zug_AttributeGroup <em>Fstr Zug Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Zug_AttributeGroup
	 * @generated
	 */
	public Adapter createFstr_Zug_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Zug_DWeg_AttributeGroup <em>Fstr Zug DWeg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Zug_DWeg_AttributeGroup
	 * @generated
	 */
	public Adapter createFstr_Zug_DWeg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Zug_Rangier <em>Fstr Zug Rangier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Zug_Rangier
	 * @generated
	 */
	public Adapter createFstr_Zug_RangierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Zug_Rangier_Allg_AttributeGroup <em>Fstr Zug Rangier Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Fstr_Zug_Rangier_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createFstr_Zug_Rangier_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Laenge_Soll_TypeClass <em>Laenge Soll Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Laenge_Soll_TypeClass
	 * @generated
	 */
	public Adapter createLaenge_Soll_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Markanter_Punkt <em>Markanter Punkt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Markanter_Punkt
	 * @generated
	 */
	public Adapter createMarkanter_PunktAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Markanter_Punkt_Bezeichnung_AttributeGroup <em>Markanter Punkt Bezeichnung Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Markanter_Punkt_Bezeichnung_AttributeGroup
	 * @generated
	 */
	public Adapter createMarkanter_Punkt_Bezeichnung_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Massgebende_Neigung_TypeClass <em>Massgebende Neigung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Massgebende_Neigung_TypeClass
	 * @generated
	 */
	public Adapter createMassgebende_Neigung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Rangier_Gegenfahrtausschluss_TypeClass <em>Rangier Gegenfahrtausschluss Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Rangier_Gegenfahrtausschluss_TypeClass
	 * @generated
	 */
	public Adapter createRangier_Gegenfahrtausschluss_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Fahrstrasse.Sonstiger_Punkt <em>Sonstiger Punkt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Fahrstrasse.Sonstiger_Punkt
	 * @generated
	 */
	public Adapter createSonstiger_PunktAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.BasisTypen.BasisAttribut_AttributeGroup <em>Basis Attribut Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.BasisTypen.BasisAttribut_AttributeGroup
	 * @generated
	 */
	public Adapter createBasisAttribut_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Basisobjekte.Ur_Objekt <em>Ur Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Basisobjekte.Ur_Objekt
	 * @generated
	 */
	public Adapter createUr_ObjektAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt <em>Basis Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt
	 * @generated
	 */
	public Adapter createBasis_ObjektAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Basisobjekte.Bereich_Objekt <em>Bereich Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Basisobjekte.Bereich_Objekt
	 * @generated
	 */
	public Adapter createBereich_ObjektAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Basisobjekte.Punkt_Objekt <em>Punkt Objekt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Basisobjekte.Punkt_Objekt
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

} //FahrstrasseAdapterFactory
