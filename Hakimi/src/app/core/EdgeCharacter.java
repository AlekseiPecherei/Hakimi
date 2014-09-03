package app.core;

import java.util.Comparator;

import org.jgrapht.graph.DefaultWeightedEdge;

import com.vividsolutions.jts.geom.Coordinate;

public class EdgeCharacter {
	
	public final static Comparator<EdgeCharacter> COMPARE = new Comparator<EdgeCharacter>() {
		
		@Override
		public int compare(final EdgeCharacter left, final EdgeCharacter right) {
			return Double.compare(left.getZeroY(), right.getZeroY());
		}
	};

	public DefaultWeightedEdge edge;
	public Coordinate[] center;
		public EdgeCharacter(final DefaultWeightedEdge edge, final Coordinate[] center) {
		this.edge = edge;
		this.center = center;
	}
	
	public double getZeroY() {
		return center[0].y;
	}
}
