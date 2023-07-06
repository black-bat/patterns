package org.example.structural.adapter;

/**
 * реализация через наследование классов
 */
public class VectorAdapterFromRaster extends RasterGraphic implements VectorGraphicInterface {
    @Override
    public void drawVectorLine() {
        drawRasterLine();
    }

    @Override
    public void drawVectorCircle() {
        drawRasterCircle();
    }
}
