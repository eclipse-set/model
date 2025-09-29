/**
 * Copyright (c) 2024 DB InfraGO AG and others
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * https://www.eclipse.org/legal/epl-2.0.
 *  
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.set.model.planpro.PlanPro.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eclipse.set.model.planpro.ATO.ATOFactory;

import org.eclipse.set.model.planpro.Ansteuerung_Element.Ansteuerung_ElementFactory;

import org.eclipse.set.model.planpro.Bahnsteig.BahnsteigFactory;

import org.eclipse.set.model.planpro.Bahnuebergang.BahnuebergangFactory;

import org.eclipse.set.model.planpro.Balisentechnik_ETCS.Balisentechnik_ETCSFactory;

import org.eclipse.set.model.planpro.Basisobjekte.BasisobjekteFactory;

import org.eclipse.set.model.planpro.Bedienung.BedienungFactory;

import org.eclipse.set.model.planpro.Block.BlockFactory;

import org.eclipse.set.model.planpro.Fahrstrasse.FahrstrasseFactory;

import org.eclipse.set.model.planpro.Flankenschutz.FlankenschutzFactory;

import org.eclipse.set.model.planpro.Geodaten.GeodatenFactory;

import org.eclipse.set.model.planpro.Gleis.GleisFactory;

import org.eclipse.set.model.planpro.Medien_und_Trassen.Medien_und_TrassenFactory;

import org.eclipse.set.model.planpro.Nahbedienung.NahbedienungFactory;

import org.eclipse.set.model.planpro.Ortung.OrtungFactory;

import org.eclipse.set.model.planpro.PZB.PZBFactory;

import org.eclipse.set.model.planpro.PlanPro.Container_AttributeGroup;
import org.eclipse.set.model.planpro.PlanPro.PlanProPackage;

import org.eclipse.set.model.planpro.Regelzeichnung.RegelzeichnungFactory;

import org.eclipse.set.model.planpro.Schluesselabhaengigkeiten.SchluesselabhaengigkeitenFactory;

import org.eclipse.set.model.planpro.Signale.SignaleFactory;

import org.eclipse.set.model.planpro.Weichen_und_Gleissperren.Weichen_und_GleissperrenFactory;

import org.eclipse.set.model.planpro.Zuglenkung.ZuglenkungFactory;

import org.eclipse.set.model.planpro.Zugnummernmeldeanlage.ZugnummernmeldeanlageFactory;

/**
 * This is the item provider adapter for a {@link org.eclipse.set.model.planpro.PlanPro.Container_AttributeGroup} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Container_AttributeGroupItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Container_AttributeGroupItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Anhang());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ATOSegmentProfile());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ATOTimingPoint());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ATOTSInstanz());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Aussenelementansteuerung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BahnsteigAnlage());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BahnsteigDach());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BahnsteigKante());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BahnsteigZugang());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Balise());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Bearbeitungsvermerk());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BedienAnrueckabschnitt());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BedienAnzeigeElement());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BedienBezirk());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BedienEinrichtungOertlich());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BedienGBT());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BedienOberflaeche());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BedienOberflaecheBild());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BedienOertlichkeit());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BedienPlatz());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BedienStandort());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BedienZentrale());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Binaerdaten());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BlockAnlage());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BlockElement());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BlockStrecke());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BUEAnlage());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BUEAnlageStrasse());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BUEAnlageV());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BUEAusschaltung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BUEBedienAnzeigeElement());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BUEDeckendesSignalZuordnung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BUEEinschaltung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BUEEinschaltungZuordnung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BUEGefahrraumEckpunkt());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BUEGleisbezogenerGefahrraum());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BUEKante());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BUEKreuzungsplan());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BUESchnittstelle());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BUESpezifischesSignal());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BUEWSFstrZuordnung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Datenpunkt());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_DatenpunktLink());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ESTWZentraleinheit());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ETCSKante());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ETCSKnoten());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ETCSRichtungsanzeige());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ETCSSignal());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ETCSWKr());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_EVModul());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Fachtelegramm());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FlaFreimeldeZuordnung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FlaSchutz());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FlaZwieschutz());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FMAAnlage());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FMAElement());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FMAKomponente());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FstrAbhaengigkeit());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FstrAneinander());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FstrAneinanderZuordnung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FstrDWeg());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FstrDWegWKr());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FstrFahrweg());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FstrNichthaltfall());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FstrRangierFlaZuordnung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FstrSignalisierung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FstrUmfahrpunkt());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FstrZugRangier());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FTAnschaltbedingung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FTFahrwegTeil());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_GEOKante());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_GEOKnoten());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_GEOPunkt());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Geschwindigkeitsprofil());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_GFRAnlage());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_GFRElement());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_GFRTripelspiegel());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_GleisAbschluss());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_GleisAbschnitt());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_GleisArt());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_GleisBaubereich());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_GleisBezeichnung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_GleisFahrbahn());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_GleisLichtraum());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_GleisSchaltgruppe());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Hoehenlinie());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Hoehenpunkt());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Kabel());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_KabelVerteilpunkt());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_LEUAnlage());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_LEUModul());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_LEUSchaltkasten());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Lieferobjekt());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_LuftTelegramm());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_MarkanterPunkt());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_NB());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_NBBedienAnzeigeElement());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_NBZone());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_NBZoneElement());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_NBZoneGrenze());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Oertlichkeit());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ProgDateiGruppe());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ProxyObjekt());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_PZBElement());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_PZBElementZuordnung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_PZBZuordnungSignal());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_RBC());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Regelzeichnung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_RegelzeichnungParameter());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_SchaltmittelFstrZuordnung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_SchaltmittelZuordnung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Schloss());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Schlosskombination());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Schluessel());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Schluesselsperre());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Schrankenantrieb());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Signal());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_SignalBefestigung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_SignalFankZuordnung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_SignalRahmen());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_SignalSignalbegriff());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_SonstigerPunkt());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_StellBereich());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Stellelement());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Strecke());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_StreckeBremsweg());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_StreckePunkt());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_TechnikStandort());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_TechnischerBereich());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_TechnischerPunkt());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_TOPKante());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_TOPKnoten());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_TrasseKante());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_TrasseKnoten());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Ueberhoehung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Ueberhoehungslinie());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Uebertragungsweg());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Unterbringung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Verkehrszeichen());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_WKrAnlage());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_WKrGspElement());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_WKrGspKomponente());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Weichenlaufkette());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_WeichenlaufketteZuordnung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZBSSchutzstrecke());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZBSSignal());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZL());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZLDLPAbschnitt());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZLDLPFstr());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZLFstr());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZLFstrAnstoss());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZLSignalgruppe());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZLSignalgruppeZuordnung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZLVBus());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZLVBusBesondereAnlage());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZLVBusUSZuordnung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZN());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZNAkustik());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZNAnzeigefeld());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZNFortschaltKriterium());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZNTelegramm84Zuordnung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZNTelegramm85Zuordnung());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZNUnterstation());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZNZBS());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZUBBereichsgrenze());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZUBStreckeneigenschaft());
			childrenFeatures.add(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Zugeinwirkung());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Container_AttributeGroup.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Container_AttributeGroup"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Container_AttributeGroup_type");
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Container_AttributeGroup.class)) {
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ANHANG:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ATO_SEGMENT_PROFILE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ATO_TIMING_POINT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ATOTS_INSTANZ:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__AUSSENELEMENTANSTEUERUNG:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BAHNSTEIG_ANLAGE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BAHNSTEIG_DACH:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BAHNSTEIG_KANTE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BAHNSTEIG_ZUGANG:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BALISE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEARBEITUNGSVERMERK:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_ANRUECKABSCHNITT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_ANZEIGE_ELEMENT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_BEZIRK:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_EINRICHTUNG_OERTLICH:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_GBT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_OBERFLAECHE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_OBERFLAECHE_BILD:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_OERTLICHKEIT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_PLATZ:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_STANDORT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BEDIEN_ZENTRALE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BINAERDATEN:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BLOCK_ANLAGE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BLOCK_ELEMENT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BLOCK_STRECKE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_ANLAGE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_ANLAGE_STRASSE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_ANLAGE_V:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_AUSSCHALTUNG:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_BEDIEN_ANZEIGE_ELEMENT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_DECKENDES_SIGNAL_ZUORDNUNG:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_EINSCHALTUNG:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_EINSCHALTUNG_ZUORDNUNG:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_GEFAHRRAUM_ECKPUNKT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_GLEISBEZOGENER_GEFAHRRAUM:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_KANTE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_KREUZUNGSPLAN:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_SCHNITTSTELLE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUE_SPEZIFISCHES_SIGNAL:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__BUEWS_FSTR_ZUORDNUNG:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__DATENPUNKT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__DATENPUNKT_LINK:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ESTW_ZENTRALEINHEIT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCS_KANTE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCS_KNOTEN:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCS_RICHTUNGSANZEIGE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCS_SIGNAL:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ETCSW_KR:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__EV_MODUL:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FACHTELEGRAMM:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FLA_FREIMELDE_ZUORDNUNG:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FLA_SCHUTZ:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FLA_ZWIESCHUTZ:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FMA_ANLAGE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FMA_ELEMENT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FMA_KOMPONENTE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_ABHAENGIGKEIT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_ANEINANDER:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_ANEINANDER_ZUORDNUNG:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_DWEG:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_DWEG_WKR:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_FAHRWEG:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_NICHTHALTFALL:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_RANGIER_FLA_ZUORDNUNG:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_SIGNALISIERUNG:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_UMFAHRPUNKT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FSTR_ZUG_RANGIER:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FT_ANSCHALTBEDINGUNG:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__FT_FAHRWEG_TEIL:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GEO_KANTE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GEO_KNOTEN:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GEO_PUNKT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GESCHWINDIGKEITSPROFIL:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GFR_ANLAGE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GFR_ELEMENT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GFR_TRIPELSPIEGEL:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_ABSCHLUSS:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_ABSCHNITT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_ART:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_BAUBEREICH:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_BEZEICHNUNG:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_FAHRBAHN:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_LICHTRAUM:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__GLEIS_SCHALTGRUPPE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__HOEHENLINIE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__HOEHENPUNKT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__KABEL:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__KABEL_VERTEILPUNKT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LEU_ANLAGE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LEU_MODUL:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LEU_SCHALTKASTEN:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LIEFEROBJEKT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__LUFT_TELEGRAMM:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__MARKANTER_PUNKT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB_BEDIEN_ANZEIGE_ELEMENT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB_ZONE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB_ZONE_ELEMENT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__NB_ZONE_GRENZE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__OERTLICHKEIT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PROG_DATEI_GRUPPE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PROXY_OBJEKT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PZB_ELEMENT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PZB_ELEMENT_ZUORDNUNG:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__PZB_ZUORDNUNG_SIGNAL:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__RBC:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__REGELZEICHNUNG:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__REGELZEICHNUNG_PARAMETER:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHALTMITTEL_FSTR_ZUORDNUNG:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHALTMITTEL_ZUORDNUNG:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHLOSS:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHLOSSKOMBINATION:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHLUESSEL:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHLUESSELSPERRE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SCHRANKENANTRIEB:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL_BEFESTIGUNG:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL_FANK_ZUORDNUNG:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL_RAHMEN:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SIGNAL_SIGNALBEGRIFF:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__SONSTIGER_PUNKT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STELL_BEREICH:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STELLELEMENT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STRECKE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STRECKE_BREMSWEG:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__STRECKE_PUNKT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TECHNIK_STANDORT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TECHNISCHER_BEREICH:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TECHNISCHER_PUNKT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TOP_KANTE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TOP_KNOTEN:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TRASSE_KANTE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__TRASSE_KNOTEN:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__UEBERHOEHUNG:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__UEBERHOEHUNGSLINIE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__UEBERTRAGUNGSWEG:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__UNTERBRINGUNG:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__VERKEHRSZEICHEN:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WKR_ANLAGE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WKR_GSP_ELEMENT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WKR_GSP_KOMPONENTE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WEICHENLAUFKETTE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__WEICHENLAUFKETTE_ZUORDNUNG:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZBS_SCHUTZSTRECKE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZBS_SIGNAL:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLDLP_ABSCHNITT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLDLP_FSTR:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL_FSTR:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL_FSTR_ANSTOSS:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL_SIGNALGRUPPE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZL_SIGNALGRUPPE_ZUORDNUNG:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLV_BUS:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLV_BUS_BESONDERE_ANLAGE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZLV_BUS_US_ZUORDNUNG:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_AKUSTIK:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_ANZEIGEFELD:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_FORTSCHALT_KRITERIUM:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_TELEGRAMM84_ZUORDNUNG:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_TELEGRAMM85_ZUORDNUNG:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZN_UNTERSTATION:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZNZBS:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZUB_BEREICHSGRENZE:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZUB_STRECKENEIGENSCHAFT:
			case PlanProPackage.CONTAINER_ATTRIBUTE_GROUP__ZUGEINWIRKUNG:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Anhang(),
				 BasisobjekteFactory.eINSTANCE.createAnhang()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ATOSegmentProfile(),
				 ATOFactory.eINSTANCE.createATO_Segment_Profile()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ATOTimingPoint(),
				 ATOFactory.eINSTANCE.createATO_Timing_Point()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ATOTSInstanz(),
				 ATOFactory.eINSTANCE.createATO_TS_Instanz()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Aussenelementansteuerung(),
				 Ansteuerung_ElementFactory.eINSTANCE.createAussenelementansteuerung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BahnsteigAnlage(),
				 BahnsteigFactory.eINSTANCE.createBahnsteig_Anlage()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BahnsteigDach(),
				 BahnsteigFactory.eINSTANCE.createBahnsteig_Dach()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BahnsteigKante(),
				 BahnsteigFactory.eINSTANCE.createBahnsteig_Kante()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BahnsteigZugang(),
				 BahnsteigFactory.eINSTANCE.createBahnsteig_Zugang()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Balise(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createBalise()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Bearbeitungsvermerk(),
				 BasisobjekteFactory.eINSTANCE.createBearbeitungsvermerk()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BedienAnrueckabschnitt(),
				 BedienungFactory.eINSTANCE.createBedien_Anrueckabschnitt()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BedienAnzeigeElement(),
				 BedienungFactory.eINSTANCE.createBedien_Anzeige_Element()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BedienBezirk(),
				 BedienungFactory.eINSTANCE.createBedien_Bezirk()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BedienEinrichtungOertlich(),
				 BedienungFactory.eINSTANCE.createBedien_Einrichtung_Oertlich()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BedienGBT(),
				 BedienungFactory.eINSTANCE.createBedien_GBT()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BedienOberflaeche(),
				 BedienungFactory.eINSTANCE.createBedien_Oberflaeche()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BedienOberflaecheBild(),
				 BedienungFactory.eINSTANCE.createBedien_Oberflaeche_Bild()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BedienOertlichkeit(),
				 BedienungFactory.eINSTANCE.createBedien_Oertlichkeit()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BedienPlatz(),
				 BedienungFactory.eINSTANCE.createBedien_Platz()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BedienStandort(),
				 BedienungFactory.eINSTANCE.createBedien_Standort()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BedienZentrale(),
				 BedienungFactory.eINSTANCE.createBedien_Zentrale()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Binaerdaten(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createBinaerdaten()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BlockAnlage(),
				 BlockFactory.eINSTANCE.createBlock_Anlage()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BlockElement(),
				 BlockFactory.eINSTANCE.createBlock_Element()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BlockStrecke(),
				 BlockFactory.eINSTANCE.createBlock_Strecke()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BUEAnlage(),
				 BahnuebergangFactory.eINSTANCE.createBUE_Anlage()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BUEAnlageStrasse(),
				 BahnuebergangFactory.eINSTANCE.createBUE_Anlage_Strasse()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BUEAnlageV(),
				 BahnuebergangFactory.eINSTANCE.createBUE_Anlage_V()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BUEAusschaltung(),
				 BahnuebergangFactory.eINSTANCE.createBUE_Ausschaltung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BUEBedienAnzeigeElement(),
				 BahnuebergangFactory.eINSTANCE.createBUE_Bedien_Anzeige_Element()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BUEDeckendesSignalZuordnung(),
				 BahnuebergangFactory.eINSTANCE.createBUE_Deckendes_Signal_Zuordnung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BUEEinschaltung(),
				 BahnuebergangFactory.eINSTANCE.createBUE_Einschaltung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BUEEinschaltungZuordnung(),
				 BahnuebergangFactory.eINSTANCE.createBUE_Einschaltung_Zuordnung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BUEGefahrraumEckpunkt(),
				 BahnuebergangFactory.eINSTANCE.createBUE_Gefahrraum_Eckpunkt()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BUEGleisbezogenerGefahrraum(),
				 BahnuebergangFactory.eINSTANCE.createBUE_Gleisbezogener_Gefahrraum()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BUEKante(),
				 BahnuebergangFactory.eINSTANCE.createBUE_Kante()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BUEKreuzungsplan(),
				 BahnuebergangFactory.eINSTANCE.createBUE_Kreuzungsplan()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BUESchnittstelle(),
				 BahnuebergangFactory.eINSTANCE.createBUE_Schnittstelle()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BUESpezifischesSignal(),
				 BahnuebergangFactory.eINSTANCE.createBUE_Spezifisches_Signal()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_BUEWSFstrZuordnung(),
				 BahnuebergangFactory.eINSTANCE.createBUE_WS_Fstr_Zuordnung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Datenpunkt(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createDatenpunkt()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_DatenpunktLink(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createDatenpunkt_Link()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ESTWZentraleinheit(),
				 Ansteuerung_ElementFactory.eINSTANCE.createESTW_Zentraleinheit()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ETCSKante(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createETCS_Kante()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ETCSKnoten(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createETCS_Knoten()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ETCSRichtungsanzeige(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createETCS_Richtungsanzeige()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ETCSSignal(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createETCS_Signal()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ETCSWKr(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createETCS_W_Kr()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_EVModul(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createEV_Modul()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Fachtelegramm(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createFachtelegramm()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FlaFreimeldeZuordnung(),
				 FlankenschutzFactory.eINSTANCE.createFla_Freimelde_Zuordnung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FlaSchutz(),
				 FlankenschutzFactory.eINSTANCE.createFla_Schutz()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FlaZwieschutz(),
				 FlankenschutzFactory.eINSTANCE.createFla_Zwieschutz()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FMAAnlage(),
				 OrtungFactory.eINSTANCE.createFMA_Anlage()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FMAElement(),
				 OrtungFactory.eINSTANCE.createFMA_Element()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FMAKomponente(),
				 OrtungFactory.eINSTANCE.createFMA_Komponente()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FstrAbhaengigkeit(),
				 FahrstrasseFactory.eINSTANCE.createFstr_Abhaengigkeit()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FstrAneinander(),
				 FahrstrasseFactory.eINSTANCE.createFstr_Aneinander()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FstrAneinanderZuordnung(),
				 FahrstrasseFactory.eINSTANCE.createFstr_Aneinander_Zuordnung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FstrDWeg(),
				 FahrstrasseFactory.eINSTANCE.createFstr_DWeg()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FstrDWegWKr(),
				 FahrstrasseFactory.eINSTANCE.createFstr_DWeg_W_Kr()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FstrFahrweg(),
				 FahrstrasseFactory.eINSTANCE.createFstr_Fahrweg()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FstrNichthaltfall(),
				 FahrstrasseFactory.eINSTANCE.createFstr_Nichthaltfall()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FstrRangierFlaZuordnung(),
				 FahrstrasseFactory.eINSTANCE.createFstr_Rangier_Fla_Zuordnung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FstrSignalisierung(),
				 FahrstrasseFactory.eINSTANCE.createFstr_Signalisierung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FstrUmfahrpunkt(),
				 FahrstrasseFactory.eINSTANCE.createFstr_Umfahrpunkt()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FstrZugRangier(),
				 FahrstrasseFactory.eINSTANCE.createFstr_Zug_Rangier()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FTAnschaltbedingung(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createFT_Anschaltbedingung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_FTFahrwegTeil(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createFT_Fahrweg_Teil()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_GEOKante(),
				 GeodatenFactory.eINSTANCE.createGEO_Kante()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_GEOKnoten(),
				 GeodatenFactory.eINSTANCE.createGEO_Knoten()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_GEOPunkt(),
				 GeodatenFactory.eINSTANCE.createGEO_Punkt()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Geschwindigkeitsprofil(),
				 GeodatenFactory.eINSTANCE.createGeschwindigkeitsprofil()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_GFRAnlage(),
				 BahnuebergangFactory.eINSTANCE.createGFR_Anlage()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_GFRElement(),
				 BahnuebergangFactory.eINSTANCE.createGFR_Element()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_GFRTripelspiegel(),
				 BahnuebergangFactory.eINSTANCE.createGFR_Tripelspiegel()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_GleisAbschluss(),
				 Weichen_und_GleissperrenFactory.eINSTANCE.createGleis_Abschluss()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_GleisAbschnitt(),
				 GleisFactory.eINSTANCE.createGleis_Abschnitt()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_GleisArt(),
				 GleisFactory.eINSTANCE.createGleis_Art()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_GleisBaubereich(),
				 GleisFactory.eINSTANCE.createGleis_Baubereich()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_GleisBezeichnung(),
				 GleisFactory.eINSTANCE.createGleis_Bezeichnung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_GleisFahrbahn(),
				 GleisFactory.eINSTANCE.createGleis_Fahrbahn()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_GleisLichtraum(),
				 GleisFactory.eINSTANCE.createGleis_Lichtraum()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_GleisSchaltgruppe(),
				 GleisFactory.eINSTANCE.createGleis_Schaltgruppe()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Hoehenlinie(),
				 GeodatenFactory.eINSTANCE.createHoehenlinie()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Hoehenpunkt(),
				 GeodatenFactory.eINSTANCE.createHoehenpunkt()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Kabel(),
				 Medien_und_TrassenFactory.eINSTANCE.createKabel()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_KabelVerteilpunkt(),
				 Medien_und_TrassenFactory.eINSTANCE.createKabel_Verteilpunkt()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_LEUAnlage(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createLEU_Anlage()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_LEUModul(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createLEU_Modul()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_LEUSchaltkasten(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createLEU_Schaltkasten()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Lieferobjekt(),
				 BasisobjekteFactory.eINSTANCE.createLieferobjekt()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_LuftTelegramm(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createLuft_Telegramm()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_MarkanterPunkt(),
				 FahrstrasseFactory.eINSTANCE.createMarkanter_Punkt()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_NB(),
				 NahbedienungFactory.eINSTANCE.createNB()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_NBBedienAnzeigeElement(),
				 NahbedienungFactory.eINSTANCE.createNB_Bedien_Anzeige_Element()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_NBZone(),
				 NahbedienungFactory.eINSTANCE.createNB_Zone()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_NBZoneElement(),
				 NahbedienungFactory.eINSTANCE.createNB_Zone_Element()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_NBZoneGrenze(),
				 NahbedienungFactory.eINSTANCE.createNB_Zone_Grenze()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Oertlichkeit(),
				 GeodatenFactory.eINSTANCE.createOertlichkeit()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ProgDateiGruppe(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createProg_Datei_Gruppe()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ProxyObjekt(),
				 BasisobjekteFactory.eINSTANCE.createProxy_Objekt()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_PZBElement(),
				 PZBFactory.eINSTANCE.createPZB_Element()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_PZBElementZuordnung(),
				 PZBFactory.eINSTANCE.createPZB_Element_Zuordnung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_PZBZuordnungSignal(),
				 PZBFactory.eINSTANCE.createPZB_Zuordnung_Signal()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_RBC(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createRBC()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Regelzeichnung(),
				 RegelzeichnungFactory.eINSTANCE.createRegelzeichnung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_RegelzeichnungParameter(),
				 RegelzeichnungFactory.eINSTANCE.createRegelzeichnung_Parameter()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_SchaltmittelFstrZuordnung(),
				 BahnuebergangFactory.eINSTANCE.createSchaltmittel_Fstr_Zuordnung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_SchaltmittelZuordnung(),
				 OrtungFactory.eINSTANCE.createSchaltmittel_Zuordnung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Schloss(),
				 SchluesselabhaengigkeitenFactory.eINSTANCE.createSchloss()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Schlosskombination(),
				 SchluesselabhaengigkeitenFactory.eINSTANCE.createSchlosskombination()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Schluessel(),
				 SchluesselabhaengigkeitenFactory.eINSTANCE.createSchluessel()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Schluesselsperre(),
				 SchluesselabhaengigkeitenFactory.eINSTANCE.createSchluesselsperre()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Schrankenantrieb(),
				 BahnuebergangFactory.eINSTANCE.createSchrankenantrieb()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Signal(),
				 SignaleFactory.eINSTANCE.createSignal()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_SignalBefestigung(),
				 SignaleFactory.eINSTANCE.createSignal_Befestigung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_SignalFankZuordnung(),
				 SignaleFactory.eINSTANCE.createSignal_Fank_Zuordnung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_SignalRahmen(),
				 SignaleFactory.eINSTANCE.createSignal_Rahmen()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_SignalSignalbegriff(),
				 SignaleFactory.eINSTANCE.createSignal_Signalbegriff()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_SonstigerPunkt(),
				 FahrstrasseFactory.eINSTANCE.createSonstiger_Punkt()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_StellBereich(),
				 Ansteuerung_ElementFactory.eINSTANCE.createStell_Bereich()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Stellelement(),
				 Ansteuerung_ElementFactory.eINSTANCE.createStellelement()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Strecke(),
				 GeodatenFactory.eINSTANCE.createStrecke()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_StreckeBremsweg(),
				 GeodatenFactory.eINSTANCE.createStrecke_Bremsweg()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_StreckePunkt(),
				 GeodatenFactory.eINSTANCE.createStrecke_Punkt()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_TechnikStandort(),
				 Ansteuerung_ElementFactory.eINSTANCE.createTechnik_Standort()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_TechnischerBereich(),
				 GeodatenFactory.eINSTANCE.createTechnischer_Bereich()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_TechnischerPunkt(),
				 GeodatenFactory.eINSTANCE.createTechnischer_Punkt()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_TOPKante(),
				 GeodatenFactory.eINSTANCE.createTOP_Kante()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_TOPKnoten(),
				 GeodatenFactory.eINSTANCE.createTOP_Knoten()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_TrasseKante(),
				 GeodatenFactory.eINSTANCE.createTrasse_Kante_child_AttributeGroup()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_TrasseKante(),
				 Medien_und_TrassenFactory.eINSTANCE.createTrasse_Kante()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_TrasseKnoten(),
				 Medien_und_TrassenFactory.eINSTANCE.createTrasse_Knoten()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Ueberhoehung(),
				 GeodatenFactory.eINSTANCE.createUeberhoehung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Ueberhoehungslinie(),
				 GeodatenFactory.eINSTANCE.createUeberhoehungslinie()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Uebertragungsweg(),
				 Ansteuerung_ElementFactory.eINSTANCE.createUebertragungsweg()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Unterbringung(),
				 Ansteuerung_ElementFactory.eINSTANCE.createUnterbringung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Verkehrszeichen(),
				 BahnuebergangFactory.eINSTANCE.createVerkehrszeichen()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_WKrAnlage(),
				 Weichen_und_GleissperrenFactory.eINSTANCE.createW_Kr_Anlage()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_WKrGspElement(),
				 Weichen_und_GleissperrenFactory.eINSTANCE.createW_Kr_Gsp_Element()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_WKrGspKomponente(),
				 Weichen_und_GleissperrenFactory.eINSTANCE.createW_Kr_Gsp_Komponente()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Weichenlaufkette(),
				 Weichen_und_GleissperrenFactory.eINSTANCE.createWeichenlaufkette()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_WeichenlaufketteZuordnung(),
				 Weichen_und_GleissperrenFactory.eINSTANCE.createWeichenlaufkette_Zuordnung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZBSSchutzstrecke(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createZBS_Schutzstrecke()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZBSSignal(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createZBS_Signal()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZL(),
				 ZuglenkungFactory.eINSTANCE.createZL()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZLDLPAbschnitt(),
				 ZuglenkungFactory.eINSTANCE.createZL_DLP_Abschnitt()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZLDLPFstr(),
				 ZuglenkungFactory.eINSTANCE.createZL_DLP_Fstr()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZLFstr(),
				 ZuglenkungFactory.eINSTANCE.createZL_Fstr()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZLFstrAnstoss(),
				 ZuglenkungFactory.eINSTANCE.createZL_Fstr_Anstoss()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZLSignalgruppe(),
				 ZuglenkungFactory.eINSTANCE.createZL_Signalgruppe()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZLSignalgruppeZuordnung(),
				 ZuglenkungFactory.eINSTANCE.createZL_Signalgruppe_Zuordnung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZLVBus(),
				 ZugnummernmeldeanlageFactory.eINSTANCE.createZLV_Bus()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZLVBusBesondereAnlage(),
				 ZugnummernmeldeanlageFactory.eINSTANCE.createZLV_Bus_Besondere_Anlage()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZLVBusUSZuordnung(),
				 ZugnummernmeldeanlageFactory.eINSTANCE.createZLV_Bus_US_Zuordnung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZN(),
				 ZugnummernmeldeanlageFactory.eINSTANCE.createZN()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZNAkustik(),
				 ZugnummernmeldeanlageFactory.eINSTANCE.createZN_Akustik()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZNAnzeigefeld(),
				 ZugnummernmeldeanlageFactory.eINSTANCE.createZN_Anzeigefeld()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZNFortschaltKriterium(),
				 ZugnummernmeldeanlageFactory.eINSTANCE.createZN_Fortschalt_Kriterium()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZNTelegramm84Zuordnung(),
				 ZugnummernmeldeanlageFactory.eINSTANCE.createZN_Telegramm_84_Zuordnung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZNTelegramm85Zuordnung(),
				 ZugnummernmeldeanlageFactory.eINSTANCE.createZN_Telegramm_85_Zuordnung()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZNUnterstation(),
				 ZugnummernmeldeanlageFactory.eINSTANCE.createZN_Unterstation()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZNZBS(),
				 ZugnummernmeldeanlageFactory.eINSTANCE.createZN_ZBS()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZUBBereichsgrenze(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createZUB_Bereichsgrenze()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_ZUBStreckeneigenschaft(),
				 Balisentechnik_ETCSFactory.eINSTANCE.createZUB_Streckeneigenschaft()));

		newChildDescriptors.add
			(createChildParameter
				(PlanProPackage.eINSTANCE.getContainer_AttributeGroup_Zugeinwirkung(),
				 OrtungFactory.eINSTANCE.createZugeinwirkung()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return PlanProEditPlugin.INSTANCE;
	}

}
