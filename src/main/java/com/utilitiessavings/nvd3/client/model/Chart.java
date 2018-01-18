package com.utilitiessavings.nvd3.client.model;

import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Technically, this is a Function, which takes a Selection as a parameter, assuming it is already configured with data,
 * etc. But for the purposes of being useful in Java, we'll treat it like an Object and make it generic on the Data
 * that it will later interact with. It is up to the developer to actually pass in the right data.
 * @param <Data>
 */
@JsType(namespace = JsPackage.GLOBAL, name = "Object")
public class Chart<Data> {
    @JsFunction
    public interface ValueAccess<Data> {
        Object getValue(Data data);
    }

    /**
     * Proxy function to return the X value so adjustments can be made if needed. For pie/donut chart this returns the key for the slice.
     * Default is function(d){ return d.x; }
     */
    public native Chart<Data> x(ValueAccess<Data> function);
    /**
     * Proxy function to return the Y value so adjustments can be made if needed. For pie/donut chart this returns the value for the slice.
     * Default is function(d){ return d.y; }
     */
    public native Chart<Data> y(ValueAccess<Data> function);

    public native Chart<Data> duration(int duration);

    public native void tooltip(boolean tooltips);

    /**
     * Whether to show extra controls or not. Extra controls include things like making mulitBar charts stacked or side by side.
     */
    public native Chart<Data> showControls(boolean showControls);

    public native Chart<Data> stacked(boolean stacked);

    public native Chart<Data> groupSpacing(double groupSpacing);

    public native Chart<Data> rotateLabels(int degrees);

    /**
     * This method may result in an error due to the weird way that NVD3 is set up - this error indicates that the
     * chart hasn't been drawn yet (passed to selection.call(chart)), so can't be updated.
     */
    public native void update();
}
