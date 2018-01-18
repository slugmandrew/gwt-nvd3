package com.utilitiessavings.d3.client;

import com.utilitiessavings.nvd3.client.NvModel;
import elemental2.dom.Element;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
 * Quick example usage:
 *
 * Chart<MyData> myChart = NV.models.multiBarChart()
 *     .transitionDuration(800)
 *     .tooltip(true)
 *     .showControls(true)
 *     .stacked(true)
 *     .groupSpacing(0.1)
 *     .rotateLabels(30)
 *     .x(MyData::getLabel)
 *     .y(MyData::getValue);
 *
 * MyData[] myData = getMyDataToDraw.toArray(new MyData[0]);
 *
 * D3.select(svgElementToDrawIn).datum(myData).call(myChart);
 */
@JsType(name = "d3", namespace = JsPackage.GLOBAL)
public class D3 {


    public static native Selection select(String selector);
    public static native Selection select(Element element);
}
