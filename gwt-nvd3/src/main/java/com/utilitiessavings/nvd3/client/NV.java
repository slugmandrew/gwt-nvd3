package com.utilitiessavings.nvd3.client;

import com.utilitiessavings.d3.client.Utils;
import jsinterop.annotations.JsFunction;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "nv")
public class NV {


    public static Utils utils;
    public static NvModel models;
    
    @JsFunction
    public interface NVGenerateFunction {
        void generate();
    }
    @JsFunction
    public interface NVCallbackFunction {
        void onComplete();
    }

    public native static void addGraph(NVGenerateFunction generateGraphFunction);

    public native static void addGraph(NVGenerateFunction generateGraphFunction, NVCallbackFunction callbackFunction);
    
    public native void render();

    public native void render(int steps);
}
