/**
 * Copyright (c) 2010-2013, openHAB.org and others.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.ui.habmin.internal.services.chart;

import javax.xml.bind.annotation.XmlRootElement;


/**
 * This is a java bean that is used with JAXB to serialize items
 * to XML or JSON.
 *  
 * @author Chris Jackson
 * @since 1.4.0
 *
 */
@XmlRootElement(name="items")
public class ChartItemConfigBean {

	public String item;
	public String axis;
	public String label;
	public String chart;
	public Boolean legend;
	public Boolean fill;
	public String lineColor;
	public String lineWidth;
	public String lineStyle;
	public String markerColor;
	public String markerSymbol;
	public Integer repeatTime;
}
