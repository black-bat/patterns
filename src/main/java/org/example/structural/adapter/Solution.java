package org.example.structural.adapter;

public class Solution {
    public static void main(String[] args) {
        VectorGraphicInterface vectorGraphicInterface = new VectorAdapterFromRaster();
        vectorGraphicInterface.drawVectorLine();
        vectorGraphicInterface.drawVectorCircle();
        VectorGraphicInterface vectorGraphicInterface1 = new VectorAdapterFromRaster2();
        vectorGraphicInterface1.drawVectorLine();
        vectorGraphicInterface1.drawVectorCircle();
    }
}
