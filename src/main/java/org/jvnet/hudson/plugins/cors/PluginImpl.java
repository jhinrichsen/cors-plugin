/*
 * Copyright 2008-2011 by Emeric Vernat
 *
 *     This file is part of the Monitoring plugin.
 *
 * The Monitoring plugin is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * The Monitoring plugin is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with the Monitoring plugin.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.jvnet.hudson.plugins.cors;

import hudson.Plugin;
import hudson.util.PluginServletFilter;

import javax.servlet.ServletContext;

/**
 * Entry point of the plugin.
 * 
 * <p>
 * There must be one {@link Plugin} class in each plugin. See javadoc of
 * {@link Plugin} for more about what can be done on this class.
 * 
 * @author Jochen Hinrichsen
 */
public class PluginImpl extends Plugin {
	private ServletContext context;
	private org.jvnet.hudson.plugins.cors.JenkinsCorsFilter filter;

	/** {@inheritDoc} */
	@Override
	public void setServletContext(ServletContext context) {
		super.setServletContext(context);
		this.context = context;
	}

	/** {@inheritDoc} */
	@Override
	public void start() throws Exception {
		super.start();
		this.filter = new org.jvnet.hudson.plugins.cors.JenkinsCorsFilter();
		PluginServletFilter.addFilter(filter);
	}

	private boolean isParameterUndefined(String key) {
		return System.getProperty(key) == null && context.getInitParameter(key) == null;
	}
}
