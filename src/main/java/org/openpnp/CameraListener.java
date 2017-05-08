/*
 * Copyright (C) 2011 Jason von Nieda <jason@vonnieda.org>
 * 
 * This file is part of OpenPnP.
 * 
 * OpenPnP is free software: you can redistribute it and/or modify it under the terms of the GNU
 * General Public License as published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * OpenPnP is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General
 * Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along with OpenPnP. If not, see
 * <http://www.gnu.org/licenses/>.
 * 
 * For more information about OpenPnP visit http://openpnp.org
 */

package org.openpnp;

import java.awt.image.BufferedImage;

// TODO: Auto-generated Javadoc
/**
 * The listener interface for receiving camera events. The class that is
 * interested in processing a camera event implements this interface, and the
 * object created with that class is registered with a component using the
 * component's <code>addCameraListener<code> method. When the camera event
 * occurs, that object's appropriate method is invoked.
 *
 * @see CameraEvent
 */
public interface CameraListener {

	/**
	 * Frame received.
	 *
	 * @param img
	 *            the img
	 */
	public void frameReceived(BufferedImage img);
}
