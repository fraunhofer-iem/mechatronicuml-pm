package de.uni_paderborn.fujaba.muml.hardware.platform.diagram.custom.parts;

import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;

import de.uni_paderborn.fujaba.muml.hardware.hwresource.Bus;
import de.uni_paderborn.fujaba.muml.hardware.platform.diagram.edit.parts.BusPartEditPart;

/**
 * A customized EditPart for a {@link Bus}. This customized EditPart sets the
 * correct edge anchors.
 * 
 * @author adann
 * 
 */
public class CustomBusEditPart extends BusPartEditPart {

	public CustomBusEditPart(View view) {
		super(view);
	}

	@Override
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(130, 50) {
			public PointList getPolygonPoints() {
				PointList points = new PointList(11);
				Rectangle anchRect = getHandleBounds();
				points.addPoint(anchRect.x, anchRect.y + (anchRect.height / 2));
				points.addPoint(anchRect.x + (anchRect.width / 6), anchRect.y);
				points.addPoint(anchRect.x + (anchRect.width / 6), anchRect.y
						+ (anchRect.height / 3));
				points.addPoint(anchRect.x + (anchRect.width * (5 / 6)),
						anchRect.y + (anchRect.height / 3));
				points.addPoint(anchRect.x + (anchRect.width * (5 / 6)),
						anchRect.y);
				points.addPoint(anchRect.x + anchRect.width, anchRect.y
						+ (anchRect.height / 2));
				points.addPoint(anchRect.x + (anchRect.width * (5 / 6)),
						anchRect.y + anchRect.height);
				points.addPoint(anchRect.x + (anchRect.width * (5 / 6)),
						anchRect.y + (anchRect.height * (2 / 3)));
				points.addPoint(anchRect.x + (anchRect.width / 6), anchRect.y
						+ (anchRect.height * (2 / 3)));
				points.addPoint(anchRect.x + (anchRect.width / 6), anchRect.y
						+ anchRect.height);
				points.addPoint(anchRect.x, anchRect.y + (anchRect.height / 2));

				return points;
			}
		};

		return result;
	}

}
