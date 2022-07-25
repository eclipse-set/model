/**
 * Copyright (c) 2022 DB Netz AG and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.modelservice;

import java.util.Optional;

import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

/**
 * Customization of the PlanPro Model.
 * 
 * @author Schaefer
 */
public class PlanProModelServices {

	/**
	 * Retrieve a service.
	 * 
	 * @param <T>
	 *            the type of the service
	 * @param serviceClass
	 *            the class of the service
	 * 
	 * @return the service (if available)
	 */
	public static <T> Optional<T> get(final Class<T> serviceClass) {
		final Bundle bundle  = FrameworkUtil
				.getBundle(PlanProModelServices.class);
		if(bundle == null) {
			return Optional.empty();
		}
		final BundleContext context = bundle.getBundleContext();
		final ServiceReference<?> serviceReference = context
				.getServiceReference(serviceClass.getName());
		if (serviceReference == null) {
			return Optional.empty();
		}
		return Optional
				.of(serviceClass.cast(context.getService(serviceReference)));
	}
}
