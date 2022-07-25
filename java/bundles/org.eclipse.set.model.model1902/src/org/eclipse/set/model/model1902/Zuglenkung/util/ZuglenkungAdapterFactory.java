/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model1902.Zuglenkung.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.set.model.model1902.BasisTypen.BasisAttribut_AttributeGroup;

import org.eclipse.set.model.model1902.Basisobjekte.Basis_Objekt;
import org.eclipse.set.model.model1902.Basisobjekte.Ur_Objekt;

import org.eclipse.set.model.model1902.Zuglenkung.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.set.model.model1902.Zuglenkung.ZuglenkungPackage
 * @generated
 */
public class ZuglenkungAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ZuglenkungPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ZuglenkungAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ZuglenkungPackage.eINSTANCE;
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
	protected ZuglenkungSwitch<Adapter> modelSwitch =
		new ZuglenkungSwitch<Adapter>() {
			@Override
			public Adapter caseAnnaeherungsgeschwindigkeit_TypeClass(Annaeherungsgeschwindigkeit_TypeClass object) {
				return createAnnaeherungsgeschwindigkeit_TypeClassAdapter();
			}
			@Override
			public Adapter caseAnzahl_Wiederhol_ZL_Anstoesse_TypeClass(Anzahl_Wiederhol_ZL_Anstoesse_TypeClass object) {
				return createAnzahl_Wiederhol_ZL_Anstoesse_TypeClassAdapter();
			}
			@Override
			public Adapter caseDeadlockpruefung_TypeClass(Deadlockpruefung_TypeClass object) {
				return createDeadlockpruefung_TypeClassAdapter();
			}
			@Override
			public Adapter caseDWeg_Prio_TypeClass(DWeg_Prio_TypeClass object) {
				return createDWeg_Prio_TypeClassAdapter();
			}
			@Override
			public Adapter caseEinstellkontrollzeit_TypeClass(Einstellkontrollzeit_TypeClass object) {
				return createEinstellkontrollzeit_TypeClassAdapter();
			}
			@Override
			public Adapter caseFUEM_Auswertung_TypeClass(FUEM_Auswertung_TypeClass object) {
				return createFUEM_Auswertung_TypeClassAdapter();
			}
			@Override
			public Adapter caseGK_TypeClass(GK_TypeClass object) {
				return createGK_TypeClassAdapter();
			}
			@Override
			public Adapter caseGKZSS_TypeClass(GKZSS_TypeClass object) {
				return createGKZSS_TypeClassAdapter();
			}
			@Override
			public Adapter caseLenkabbruchzeit_TypeClass(Lenkabbruchzeit_TypeClass object) {
				return createLenkabbruchzeit_TypeClassAdapter();
			}
			@Override
			public Adapter caseLenkziffernstellen_TypeClass(Lenkziffernstellen_TypeClass object) {
				return createLenkziffernstellen_TypeClassAdapter();
			}
			@Override
			public Adapter casePersonal_Reaktionszeit_TypeClass(Personal_Reaktionszeit_TypeClass object) {
				return createPersonal_Reaktionszeit_TypeClassAdapter();
			}
			@Override
			public Adapter caseSichtzeit_Vorsignal_TypeClass(Sichtzeit_Vorsignal_TypeClass object) {
				return createSichtzeit_Vorsignal_TypeClassAdapter();
			}
			@Override
			public Adapter caseSignalgruppe_Bezeichner_TypeClass(Signalgruppe_Bezeichner_TypeClass object) {
				return createSignalgruppe_Bezeichner_TypeClassAdapter();
			}
			@Override
			public Adapter caseTv_GK_TypeClass(Tv_GK_TypeClass object) {
				return createTv_GK_TypeClassAdapter();
			}
			@Override
			public Adapter caseVmax_Annaeherung_TypeClass(Vmax_Annaeherung_TypeClass object) {
				return createVmax_Annaeherung_TypeClassAdapter();
			}
			@Override
			public Adapter caseZL(ZL object) {
				return createZLAdapter();
			}
			@Override
			public Adapter caseZL_Allg_AttributeGroup(ZL_Allg_AttributeGroup object) {
				return createZL_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZL_DLP_Abschnitt(ZL_DLP_Abschnitt object) {
				return createZL_DLP_AbschnittAdapter();
			}
			@Override
			public Adapter caseZL_DLP_Fstr(ZL_DLP_Fstr object) {
				return createZL_DLP_FstrAdapter();
			}
			@Override
			public Adapter caseZL_Fstr(ZL_Fstr object) {
				return createZL_FstrAdapter();
			}
			@Override
			public Adapter caseZL_Fstr_Allg_AttributeGroup(ZL_Fstr_Allg_AttributeGroup object) {
				return createZL_Fstr_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZL_Fstr_Anstoss(ZL_Fstr_Anstoss object) {
				return createZL_Fstr_AnstossAdapter();
			}
			@Override
			public Adapter caseZL_Fstr_Anstoss_Allg_AttributeGroup(ZL_Fstr_Anstoss_Allg_AttributeGroup object) {
				return createZL_Fstr_Anstoss_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZL_Fstr_Anstoss_GK_AttributeGroup(ZL_Fstr_Anstoss_GK_AttributeGroup object) {
				return createZL_Fstr_Anstoss_GK_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZL_Fstr_Zuschlag_TypeClass(ZL_Fstr_Zuschlag_TypeClass object) {
				return createZL_Fstr_Zuschlag_TypeClassAdapter();
			}
			@Override
			public Adapter caseZL_Signalgruppe(ZL_Signalgruppe object) {
				return createZL_SignalgruppeAdapter();
			}
			@Override
			public Adapter caseZL_Signalgruppe_Allg_AttributeGroup(ZL_Signalgruppe_Allg_AttributeGroup object) {
				return createZL_Signalgruppe_Allg_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZL_Signalgruppe_Zuordnung(ZL_Signalgruppe_Zuordnung object) {
				return createZL_Signalgruppe_ZuordnungAdapter();
			}
			@Override
			public Adapter caseZL_ZN_AttributeGroup(ZL_ZN_AttributeGroup object) {
				return createZL_ZN_AttributeGroupAdapter();
			}
			@Override
			public Adapter caseZN_Stellen_TypeClass(ZN_Stellen_TypeClass object) {
				return createZN_Stellen_TypeClassAdapter();
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
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Zuglenkung.Annaeherungsgeschwindigkeit_TypeClass <em>Annaeherungsgeschwindigkeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Zuglenkung.Annaeherungsgeschwindigkeit_TypeClass
	 * @generated
	 */
	public Adapter createAnnaeherungsgeschwindigkeit_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Zuglenkung.Anzahl_Wiederhol_ZL_Anstoesse_TypeClass <em>Anzahl Wiederhol ZL Anstoesse Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Zuglenkung.Anzahl_Wiederhol_ZL_Anstoesse_TypeClass
	 * @generated
	 */
	public Adapter createAnzahl_Wiederhol_ZL_Anstoesse_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Zuglenkung.Deadlockpruefung_TypeClass <em>Deadlockpruefung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Zuglenkung.Deadlockpruefung_TypeClass
	 * @generated
	 */
	public Adapter createDeadlockpruefung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Zuglenkung.DWeg_Prio_TypeClass <em>DWeg Prio Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Zuglenkung.DWeg_Prio_TypeClass
	 * @generated
	 */
	public Adapter createDWeg_Prio_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Zuglenkung.Einstellkontrollzeit_TypeClass <em>Einstellkontrollzeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Zuglenkung.Einstellkontrollzeit_TypeClass
	 * @generated
	 */
	public Adapter createEinstellkontrollzeit_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Zuglenkung.FUEM_Auswertung_TypeClass <em>FUEM Auswertung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Zuglenkung.FUEM_Auswertung_TypeClass
	 * @generated
	 */
	public Adapter createFUEM_Auswertung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Zuglenkung.GK_TypeClass <em>GK Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Zuglenkung.GK_TypeClass
	 * @generated
	 */
	public Adapter createGK_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Zuglenkung.GKZSS_TypeClass <em>GKZSS Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Zuglenkung.GKZSS_TypeClass
	 * @generated
	 */
	public Adapter createGKZSS_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Zuglenkung.Lenkabbruchzeit_TypeClass <em>Lenkabbruchzeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Zuglenkung.Lenkabbruchzeit_TypeClass
	 * @generated
	 */
	public Adapter createLenkabbruchzeit_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Zuglenkung.Lenkziffernstellen_TypeClass <em>Lenkziffernstellen Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Zuglenkung.Lenkziffernstellen_TypeClass
	 * @generated
	 */
	public Adapter createLenkziffernstellen_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Zuglenkung.Personal_Reaktionszeit_TypeClass <em>Personal Reaktionszeit Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Zuglenkung.Personal_Reaktionszeit_TypeClass
	 * @generated
	 */
	public Adapter createPersonal_Reaktionszeit_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Zuglenkung.Sichtzeit_Vorsignal_TypeClass <em>Sichtzeit Vorsignal Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Zuglenkung.Sichtzeit_Vorsignal_TypeClass
	 * @generated
	 */
	public Adapter createSichtzeit_Vorsignal_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Zuglenkung.Signalgruppe_Bezeichner_TypeClass <em>Signalgruppe Bezeichner Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Zuglenkung.Signalgruppe_Bezeichner_TypeClass
	 * @generated
	 */
	public Adapter createSignalgruppe_Bezeichner_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Zuglenkung.Tv_GK_TypeClass <em>Tv GK Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Zuglenkung.Tv_GK_TypeClass
	 * @generated
	 */
	public Adapter createTv_GK_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Zuglenkung.Vmax_Annaeherung_TypeClass <em>Vmax Annaeherung Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Zuglenkung.Vmax_Annaeherung_TypeClass
	 * @generated
	 */
	public Adapter createVmax_Annaeherung_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Zuglenkung.ZL <em>ZL</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Zuglenkung.ZL
	 * @generated
	 */
	public Adapter createZLAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Zuglenkung.ZL_Allg_AttributeGroup <em>ZL Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Zuglenkung.ZL_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createZL_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Zuglenkung.ZL_DLP_Abschnitt <em>ZL DLP Abschnitt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Zuglenkung.ZL_DLP_Abschnitt
	 * @generated
	 */
	public Adapter createZL_DLP_AbschnittAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Zuglenkung.ZL_DLP_Fstr <em>ZL DLP Fstr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Zuglenkung.ZL_DLP_Fstr
	 * @generated
	 */
	public Adapter createZL_DLP_FstrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr <em>ZL Fstr</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr
	 * @generated
	 */
	public Adapter createZL_FstrAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr_Allg_AttributeGroup <em>ZL Fstr Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createZL_Fstr_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr_Anstoss <em>ZL Fstr Anstoss</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr_Anstoss
	 * @generated
	 */
	public Adapter createZL_Fstr_AnstossAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr_Anstoss_Allg_AttributeGroup <em>ZL Fstr Anstoss Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr_Anstoss_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createZL_Fstr_Anstoss_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr_Anstoss_GK_AttributeGroup <em>ZL Fstr Anstoss GK Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr_Anstoss_GK_AttributeGroup
	 * @generated
	 */
	public Adapter createZL_Fstr_Anstoss_GK_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr_Zuschlag_TypeClass <em>ZL Fstr Zuschlag Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Zuglenkung.ZL_Fstr_Zuschlag_TypeClass
	 * @generated
	 */
	public Adapter createZL_Fstr_Zuschlag_TypeClassAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Zuglenkung.ZL_Signalgruppe <em>ZL Signalgruppe</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Zuglenkung.ZL_Signalgruppe
	 * @generated
	 */
	public Adapter createZL_SignalgruppeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Zuglenkung.ZL_Signalgruppe_Allg_AttributeGroup <em>ZL Signalgruppe Allg Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Zuglenkung.ZL_Signalgruppe_Allg_AttributeGroup
	 * @generated
	 */
	public Adapter createZL_Signalgruppe_Allg_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Zuglenkung.ZL_Signalgruppe_Zuordnung <em>ZL Signalgruppe Zuordnung</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Zuglenkung.ZL_Signalgruppe_Zuordnung
	 * @generated
	 */
	public Adapter createZL_Signalgruppe_ZuordnungAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Zuglenkung.ZL_ZN_AttributeGroup <em>ZL ZN Attribute Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Zuglenkung.ZL_ZN_AttributeGroup
	 * @generated
	 */
	public Adapter createZL_ZN_AttributeGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.set.model.model1902.Zuglenkung.ZN_Stellen_TypeClass <em>ZN Stellen Type Class</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.set.model.model1902.Zuglenkung.ZN_Stellen_TypeClass
	 * @generated
	 */
	public Adapter createZN_Stellen_TypeClassAdapter() {
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

} //ZuglenkungAdapterFactory
