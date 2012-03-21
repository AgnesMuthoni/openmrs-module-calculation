/**
 * The contents of this file are subject to the OpenMRS Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. You may obtain a copy of the License at
 * http://license.openmrs.org
 *
 * Software distributed under the License is distributed on an "AS IS"
 * basis, WITHOUT WARRANTY OF ANY KIND, either express or implied. See the
 * License for the specific language governing rights and limitations
 * under the License.
 *
 * Copyright (C) OpenMRS, LLC.  All Rights Reserved.
 */
package org.openmrs.calculation;

import org.apache.commons.lang.StringUtils;
import org.openmrs.api.APIException;
import org.openmrs.calculation.definition.ParameterDefinition;

/**
 * Represents an error that is thrown when an invalid value is found for a Parameter when evaluating
 * a calculation, e.g. if a value can't be cast to a specified datatype
 */
public class InvalidParameterValueException extends APIException {
	
	private static final long serialVersionUID = 1L;
	
	/**
	 * Default Constructor
	 */
	public InvalidParameterValueException(String message) {
		super(message);
	}
	
	/**
	 * Convenience constructor
	 * 
	 * @param parameter
	 * @param value
	 */
	public InvalidParameterValueException(ParameterDefinition parameter, Object value) {
		this("The value '" + value + "' is not of the type allowed by the parameter definition '"
		        + (StringUtils.isNotBlank(parameter.getName()) ? parameter.getName() : parameter.getKey()) + "'");
	}
}
