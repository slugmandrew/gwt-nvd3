package com.utilitiessavings.nvd3.client;

import com.utilitiessavings.nvd3.client.model.Chart;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(name = "Object", namespace = JsPackage.GLOBAL)
public class NvModel {
    public native <T> Chart<T> discreteBarChart();
    public native <T> Chart<T> multiBarChart();
    public native <T> Chart<T> pieChart();
    public native <T> Chart<T> lineChart();
}
