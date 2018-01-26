package com.utilitiessavings.nvd3example.client;

import com.google.gwt.core.client.EntryPoint;
import com.utilitiessavings.d3.client.D3;
import com.utilitiessavings.d3.client.SvgHelper;
import com.utilitiessavings.nvd3.client.NV;
import com.utilitiessavings.nvd3.client.model.Chart;
import elemental2.dom.DomGlobal;
import elemental2.dom.Element;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

public class SampleEntryPoint implements EntryPoint {
    public void onModuleLoad() {
        Element elt = SvgHelper.createSvgElement();
        DomGlobal.document.body.appendChild(elt);

        NV.addGraph(() -> {
            Chart<MyData> myChart = NV.models.multiBarChart();
            myChart.duration(800)
                    .tooltip(true);
            myChart.showControls(true)
                    .stacked(true)
                    .groupSpacing(0.1)
                    .rotateLabels(30)
                    .x(MyData::getLabel)
                    .y(MyData::getValue);

            D3.select("svg")
                    .datum(new Object[] {
                            NvWrapper.create("bugs filed", generateData()),
                            NvWrapper.create("bugs fixed", generateData()),
                            NvWrapper.create("bugs ignored", generateData()),
                            NvWrapper.create("bugs something", generateData())
                    })
                    .call(myChart);

            NV.utils.windowResize(myChart::update);
        });
    }

    private MyData[] generateData() {
        return new MyData[] {
                new MyData("Jan", 10.0),
                new MyData("Feb", 20.0),
                new MyData("Mar", 20.0),
                new MyData("Apr", 15.0),
                new MyData("May", 25.0),
                new MyData("Jun", 8.0),
                new MyData("Jul", 18.0),
                new MyData("Aug", 20.0),
                new MyData("Sep", 22.0),
                new MyData("Oct", 27.0),
                new MyData("Nov", 17.0),
                new MyData("Dec", 23.0)
        };
    }

    @JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
    public static class NvWrapper {
        String key;
        Object[] values;

        @JsOverlay
        public static NvWrapper create(String key, Object[] values) {
            NvWrapper wrapper = new NvWrapper();
            wrapper.key = key;
            wrapper.values = values;

            return wrapper;
        }
    }

    public static class MyData {
        private String label;
        private Double value;

        public MyData(String label, Double value) {
            this.label = label;
            this.value = value;
        }

        public String getLabel() {
            return label;
        }

        public Double getValue() {
            return value;
        }
    }
}
