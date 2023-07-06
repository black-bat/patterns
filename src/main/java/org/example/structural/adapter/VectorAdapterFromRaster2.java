package org.example.structural.adapter;

/**
 * реализация через композицию
 */
public class VectorAdapterFromRaster2 implements VectorGraphicInterface {
    RasterGraphic rasterGraphic = new RasterGraphic();

    @Override
    public void drawVectorLine() {
        rasterGraphic.drawRasterLine();
    }

    @Override
    public void drawVectorCircle() {
        rasterGraphic.drawRasterCircle();
    }
}
