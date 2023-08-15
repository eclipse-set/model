/**
 * Copyright (c) 2022 DB Netz AG and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.modelservice;

/**
 * Select defined Planung Projekt and Planung Gruppe.
 * 
 * @author Schaefer
 */
public interface ProjectGroupProviderService {

	/**
	 * @param parent
	 *            the group's parent
	 * 
	 * @return the Planung Gruppe
	 */
	Object getGroup(Object parent);

	/**
	 * @param parent
	 *            the project's parent
	 * 
	 * @return the Planung Projekt
	 */
	Object getProject(Object parent);
}
