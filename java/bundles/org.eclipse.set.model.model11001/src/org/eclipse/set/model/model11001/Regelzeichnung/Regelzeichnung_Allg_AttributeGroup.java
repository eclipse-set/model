/**
 * Copyright (c) 2023 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 * 
 */
package org.eclipse.set.model.model11001.Regelzeichnung;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regelzeichnung Allg Attribute Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.set.model.model11001.Regelzeichnung.Regelzeichnung_Allg_AttributeGroup#getBild <em>Bild</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Regelzeichnung.Regelzeichnung_Allg_AttributeGroup#getRZNummer <em>RZ Nummer</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Regelzeichnung.Regelzeichnung_Allg_AttributeGroup#getTitel <em>Titel</em>}</li>
 *   <li>{@link org.eclipse.set.model.model11001.Regelzeichnung.Regelzeichnung_Allg_AttributeGroup#getUntertitel <em>Untertitel</em>}</li>
 * </ul>
 *
 * @see org.eclipse.set.model.model11001.Regelzeichnung.RegelzeichnungPackage#getRegelzeichnung_Allg_AttributeGroup()
 * @model extendedMetaData="name='CRegelzeichnung_Allg' kind='elementOnly'"
 * @generated
 */
public interface Regelzeichnung_Allg_AttributeGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Bild</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Parameter zur Angabe eines bestimmten Anwendungsfalls einer Regelzeichnung. Auf einer Regelzeichnung sind im Allgemeinen mehrere Anwendungen in unterschiedlichen Bildern dargestellt. Der Parameter Bild verweist auf eine derartige konkrete Anwendung. Die Bezeichnung der Bilder ist nicht vorgegeben und wird von den Erstellern der Regelzeichnung unterschiedlich angegeben. Es sind neben den alphanumerischen Zeichen auch Sonderzeichen möglich.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bild</em>' containment reference.
	 * @see #setBild(Bild_TypeClass)
	 * @see org.eclipse.set.model.model11001.Regelzeichnung.RegelzeichnungPackage#getRegelzeichnung_Allg_AttributeGroup_Bild()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Bild'"
	 * @generated
	 */
	Bild_TypeClass getBild();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Regelzeichnung.Regelzeichnung_Allg_AttributeGroup#getBild <em>Bild</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bild</em>' containment reference.
	 * @see #getBild()
	 * @generated
	 */
	void setBild(Bild_TypeClass value);

	/**
	 * Returns the value of the '<em><b>RZ Nummer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ordnungsmerkmal, was die Regelzeichnung identifiziert. Die Regelzeichnungen sind im System von IZ-Plan unter diesem Ordnungsmerkmal abgelegt. Die Regelzeichnungen der Sicherungstechnik beginnen in der Regel mit dem Kennbuchstaben S und werden von mehrteilig durch Dezimalpunkt getrennte Zahlen ergänzt. Die letzte Zahl stellt dabei den Ausgabestand dar.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RZ Nummer</em>' containment reference.
	 * @see #setRZNummer(RZ_Nummer_TypeClass)
	 * @see org.eclipse.set.model.model11001.Regelzeichnung.RegelzeichnungPackage#getRegelzeichnung_Allg_AttributeGroup_RZNummer()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='RZ_Nummer'"
	 * @generated
	 */
	RZ_Nummer_TypeClass getRZNummer();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Regelzeichnung.Regelzeichnung_Allg_AttributeGroup#getRZNummer <em>RZ Nummer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RZ Nummer</em>' containment reference.
	 * @see #getRZNummer()
	 * @generated
	 */
	void setRZNummer(RZ_Nummer_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Titel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Titel der Regelzeichnung. Der Titel ist im Schriftfeld dargestellt und erläutert grob den Inhalt und die Anwendung der Regelzeichnung.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Titel</em>' containment reference.
	 * @see #setTitel(Titel_TypeClass)
	 * @see org.eclipse.set.model.model11001.Regelzeichnung.RegelzeichnungPackage#getRegelzeichnung_Allg_AttributeGroup_Titel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Titel'"
	 * @generated
	 */
	Titel_TypeClass getTitel();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Regelzeichnung.Regelzeichnung_Allg_AttributeGroup#getTitel <em>Titel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titel</em>' containment reference.
	 * @see #getTitel()
	 * @generated
	 */
	void setTitel(Titel_TypeClass value);

	/**
	 * Returns the value of the '<em><b>Untertitel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Zusätzliche Erläuterungen und Abgrenzungen der Regelzeichnung, die nicht aus dem Titel hervorgehen. Der Untertitel wird vom Bearbeiter der Regelzeichnung vergeben.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Untertitel</em>' containment reference.
	 * @see #setUntertitel(Untertitel_TypeClass)
	 * @see org.eclipse.set.model.model11001.Regelzeichnung.RegelzeichnungPackage#getRegelzeichnung_Allg_AttributeGroup_Untertitel()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Untertitel'"
	 * @generated
	 */
	Untertitel_TypeClass getUntertitel();

	/**
	 * Sets the value of the '{@link org.eclipse.set.model.model11001.Regelzeichnung.Regelzeichnung_Allg_AttributeGroup#getUntertitel <em>Untertitel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Untertitel</em>' containment reference.
	 * @see #getUntertitel()
	 * @generated
	 */
	void setUntertitel(Untertitel_TypeClass value);

} // Regelzeichnung_Allg_AttributeGroup
