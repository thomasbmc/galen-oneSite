package com.galenframework.java.sample.components;
import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.io.IOException;
/**
 * Created by tmphillips on 13-10-2015.
 */
public class FontUtil {

    public Font createFont(String fontName, int style, int fontSize){
        java.awt.Font f = new java.awt.Font(fontName, style, fontSize);
        return f;
    }

    public double createWordsTypeFont(String label, Font f, boolean verifyUpCase) {
        if(verifyUpCase==true)
            label = label.toUpperCase();
        Rectangle2D r = f.getStringBounds(label, new FontRenderContext(null, RenderingHints.VALUE_TEXT_ANTIALIAS_DEFAULT, RenderingHints.VALUE_FRACTIONALMETRICS_DEFAULT));
        double Width= r.getWidth();
        double Height= r.getHeight();
        return Width;
    }


}
