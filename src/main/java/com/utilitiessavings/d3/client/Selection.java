package com.utilitiessavings.d3.client;

import com.utilitiessavings.nvd3.client.model.Chart;
import jsinterop.annotations.JsType;

@JsType(namespace = "d3", name = "selection", isNative = true)
public class Selection {
    public native Selection datum(Object data);
    
    public native Selection data(Object[] data);

    public native Selection call(Chart chart);
}
