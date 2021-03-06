/* FeatureIDE - An IDE to support feature-oriented software development
 * Copyright (C) 2005-2010  FeatureIDE Team, University of Magdeburg
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see http://www.gnu.org/licenses/.
 *
 * See http://www.fosd.de/featureide/ for further information.
 */
package de.ovgu.featureide.fm.ui.editors.featuremodel.figures;

import org.eclipse.draw2d.geometry.Point;

/**
 * Adjusted RelationDecoration that can be used with Coordinates instead of
 * Features
 * 
 * @author Fabian Benduhn
 */
public class LegendRelationDecoration extends RelationDecoration {
	private Point point;
	
	public LegendRelationDecoration(boolean fill, Point point) {
		super(fill, null, null);
		this.point = point;
	}

	@Override
	protected Point getFeatureLocation() {
		return point;

	}

	@Override
	protected int getTargetAnchorDiameter() {
		return 27;
	}
}
