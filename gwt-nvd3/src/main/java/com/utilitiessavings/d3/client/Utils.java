package com.utilitiessavings.d3.client;

import jsinterop.annotations.JsFunction;

public class Utils {
    @JsFunction
    public interface UpdateFunc {
        void update();
    }
    public native void windowResize(UpdateFunc function);
}
