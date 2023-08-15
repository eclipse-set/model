/**
 * Copyright (c) 2022 DB Netz AG and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v2.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v20.html
 */
package org.eclipse.set.model.modelservice;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EValidator.PatternMatcher;

/**
 * Change the way a data value pattern violation is reported.
 * 
 * @author Schaefer
 */
public interface ReportDataValuePatternViolation {

	/**
	 * @param diagnostics
	 *            the diagnostics
	 * 
	 * @return whether the service can provide a custom report
	 */
	boolean canReport(DiagnosticChain diagnostics);

	/**
	 * Report a data value pattern violation.
	 * 
	 * @param eDataType
	 *            the data type
	 * @param value
	 *            the value
	 * @param patterns
	 *            the patterns
	 * @param diagnostics
	 *            the diagnostics
	 * @param context
	 *            the context
	 */
	void reportDataValuePatternViolation(EDataType eDataType, Object value,
			PatternMatcher[] patterns, DiagnosticChain diagnostics,
			Map<Object, Object> context);
}
