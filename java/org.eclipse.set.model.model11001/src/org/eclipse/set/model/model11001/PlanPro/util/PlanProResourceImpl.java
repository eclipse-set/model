/**
 * Copyright (c) 2022 DB Netz AG and others.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.model11001.PlanPro.util;

import java.util.function.Function;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

/**
 * <!-- begin-user-doc --> The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * 
 * @see org.eclipse.set.model.model1902.PlanPro.util.PlanProResourceFactoryImpl
 * @generated NOT
 */
public class PlanProResourceImpl extends XMLResourceImpl {

	private Function<XMLHelper, XMLSave> xmlSaveCreator;

	/**
	 * Creates an instance of the resource. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param uri
	 *            the URI of the new resource.
	 * @generated
	 */
	public PlanProResourceImpl(final URI uri) {
		super(uri);
	}

	/**
	 * @return the xmlSave creator
	 */
	public Function<XMLHelper, XMLSave> getXmlSaveCreator() {
		return xmlSaveCreator;
	}

	/**
	 * @param xmlSaveCreator
	 *            the xmlSave supplier to set
	 */
	public void setXmlSaveCreator(
			final Function<XMLHelper, XMLSave> xmlSaveCreator) {
		this.xmlSaveCreator = xmlSaveCreator;
	}

	@Override
	protected XMLSave createXMLSave() {
		if (xmlSaveCreator != null) {
			return xmlSaveCreator.apply(createXMLHelper());
		}
		return super.createXMLSave();
	}

} // PlanProResourceImpl
