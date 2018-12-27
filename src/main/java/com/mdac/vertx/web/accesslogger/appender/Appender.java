/*
 * Copyright (c) 2016-2019 Roman Pierson
 * ------------------------------------------------------
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License v2.0 
 * which accompanies this distribution.
 *
 *     The Apache License v2.0 is available at
 *     http://www.opensource.org/licenses/apache2.0.php
 *
 * You may elect to redistribute this code under either of these licenses.
 */
package com.mdac.vertx.web.accesslogger.appender;

import java.util.Collection;

import io.vertx.core.json.JsonObject;

/**
 * 
 * An IF defining an appender that can handle Access Events
 * 
 * @author Roman Pierson
 *
 */
public interface Appender {

	/**
	 * 
	 * Push the access events to the appender.
	 * 
	 * Its the appenders responsibility to implement local storage 
	 * 
	 * @param accessEvents	List of access events the appender should handle - those are no copies
	 */
	void push(Collection<JsonObject> accessEvents);
	
	/**
	 * @return	Does the appender requires a resolved pattern
	 */
	default boolean requiresResolvedPattern(){
		
		// Not forcing the implementations to implement if not required
		
		return false;
		
	}
	
	/**
	 * @param resolvedPattern	The resolved pattern
	 */
	default void setResolvedPattern(String resolvedPattern){
		
		// Not forcing the implementations to implement if not required
		
		return;
	}
	
}
