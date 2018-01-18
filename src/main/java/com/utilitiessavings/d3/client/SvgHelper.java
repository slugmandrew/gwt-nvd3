package com.utilitiessavings.d3.client;

import elemental2.dom.Document;
import elemental2.dom.DomGlobal;
import elemental2.dom.Element;

public class SvgHelper {
    public static Element createSvgElement() {
        return DomGlobal.document.createElementNS("http://www.w3.org/2000/svg", "svg");
    }
}
