package app.core;

import org.jgrapht.graph.DefaultWeightedEdge;

import app.core.math.EnvelopeUtils;

import com.vividsolutions.jts.geom.Coordinate;

public class HakimiWeightedEdge extends DefaultWeightedEdge {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3961885875717932495L;

	public Coordinate[] getCenterPoint(final double[] positive, final double[] negative) {
		return new EnvelopeUtils(getWeight()).calcCenterPoint(positive, negative);
	}
}
