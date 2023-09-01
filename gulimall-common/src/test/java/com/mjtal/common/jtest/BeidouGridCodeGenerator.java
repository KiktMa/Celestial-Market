package com.mjtal.common.jtest;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.geotools.coverage.grid.GridCoverage2D;
import org.geotools.coverage.grid.io.AbstractGridFormat;
import org.geotools.coverage.grid.io.GridCoverage2DReader;
import org.geotools.coverage.grid.io.GridFormatFinder;
import org.geotools.geometry.DirectPosition2D;
import org.geotools.referencing.CRS;
import org.opengis.referencing.FactoryException;
import org.opengis.referencing.crs.CoordinateReferenceSystem;
import org.opengis.referencing.operation.MathTransform;
import org.opengis.referencing.operation.TransformException;

public class BeidouGridCodeGenerator {
    public static void main(String[] args) {
        String tiffFilePath = "path_to_your_tiff_file";
        try {
            GridCoverage2DReader reader = getReader(tiffFilePath);
            GridCoverage2D coverage = reader.read(null);
            DirectPosition2D pos = coverage.getGridGeometry().worldToGrid(new DirectPosition2D(121.48, 31.22));
            double[] coord = pos.getCoordinate();
            double x = coord[0];
            double y = coord[1];
            String gridCode = convertToBeid;
        }
    }
}