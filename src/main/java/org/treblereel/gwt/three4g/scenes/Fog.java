package org.treblereel.gwt.three4g.scenes;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsType;
import org.treblereel.gwt.three4g.core.Color;

/**
 * @author Dmitrii Tikhomirov <chani@me.com>
 * Created by treblereel on 2/27/18.
 */
@JsType(isNative=true, namespace="THREE")
public class Fog {

    /**
     * Optional name of the object (doesn't need to be unique). Default is an empty string.
     */
    public String name;

    /**
     * Fog color. Example: If set to black, far away objects will be rendered black.
     */
    public Color color;

    /**
     * The minimum distance to start applying fog. Objects that are less than 'near' units from the active camera won't be affected by fog.
     * Default is 1.
     */
    public float near;

    /**
     * The maximum distance at which fog stops being calculated and applied. Objects that are more than 'far' units away from the active camera won't be affected by fog.
     * Default is 1000.
     */
    public float far;

    @JsConstructor
    public Fog(){

    }

    /**
     * The color parameter is passed to the Color constructor to set the color property. Color can be a hexadecimal integer or a CSS-style string.
     * @param color
     * @param near
     * @param far
     */
    @JsConstructor
    public Fog(int color, float near,float far){

    }

    /**
     * Returns a new fog instance with the same parameters as this one.
     * @return
     */
    public native Fog clone();

    /**
     * Convert the fog to three.js JSON format.
     * @param meta
     * @return
     */
    public native Object toJSON( Object meta );
}
