package com.androidplot.xy;

import com.androidplot.util.SeriesUtils;
import com.androidplot.xy.OrderedXYSeries;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class SampledXYSeries implements FastXYSeries, OrderedXYSeries {
    private XYSeries activeSeries;
    private Sampler algorithm;
    private RectRegion bounds;
    private Exception lastResamplingException;
    private float ratio;
    private XYSeries rawData;
    private int threshold;
    private final OrderedXYSeries.XOrder xOrder;
    private List<EditableXYSeries> zoomLevels;

    public SampledXYSeries(XYSeries xYSeries, OrderedXYSeries.XOrder xOrder, float f2, int i2) throws InterruptedException {
        this.algorithm = new LTTBSampler();
        this.rawData = xYSeries;
        this.xOrder = xOrder;
        setRatio(f2);
        setThreshold(i2);
        resample();
    }

    protected static int getZoomIndex(double d2, double d3) {
        int iRound = (int) Math.round(Math.log(d2) / Math.log(d3));
        if (iRound > 0) {
            return iRound - 1;
        }
        return 0;
    }

    public Sampler getAlgorithm() {
        return this.algorithm;
    }

    public RectRegion getBounds() {
        return this.bounds;
    }

    public double getMaxZoomFactor() {
        return Math.pow(getRatio(), this.zoomLevels.size());
    }

    public float getRatio() {
        return this.ratio;
    }

    public int getThreshold() {
        return this.threshold;
    }

    @Override // com.androidplot.Series
    public String getTitle() {
        return this.rawData.getTitle();
    }

    @Override // com.androidplot.xy.XYSeries
    public Number getX(int i2) {
        return this.activeSeries.getX(i2);
    }

    @Override // com.androidplot.xy.OrderedXYSeries
    public OrderedXYSeries.XOrder getXOrder() {
        return this.xOrder;
    }

    @Override // com.androidplot.xy.XYSeries
    public Number getY(int i2) {
        return this.activeSeries.getY(i2);
    }

    protected List<EditableXYSeries> getZoomLevels() {
        return this.zoomLevels;
    }

    @Override // com.androidplot.xy.FastXYSeries
    public RectRegion minMax() {
        return this.bounds;
    }

    public void resample() throws InterruptedException {
        this.bounds = null;
        this.zoomLevels = new ArrayList();
        int iCeil = (int) Math.ceil(this.rawData.size() / getRatio());
        ArrayList arrayList = new ArrayList(this.zoomLevels.size());
        while (iCeil > this.threshold) {
            final FixedSizeEditableXYSeries fixedSizeEditableXYSeries = new FixedSizeEditableXYSeries(getTitle(), iCeil);
            Thread thread = new Thread(new Runnable() { // from class: com.androidplot.xy.SampledXYSeries.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        RectRegion rectRegionRun = SampledXYSeries.this.getAlgorithm().run(SampledXYSeries.this.rawData, fixedSizeEditableXYSeries);
                        if (SampledXYSeries.this.bounds == null) {
                            SampledXYSeries.this.bounds = rectRegionRun;
                        }
                    } catch (Exception e2) {
                        SampledXYSeries.this.lastResamplingException = e2;
                    }
                }
            }, "Androidplot XY Series Sampler");
            getZoomLevels().add(fixedSizeEditableXYSeries);
            arrayList.add(thread);
            thread.start();
            iCeil = (int) Math.ceil(iCeil / getRatio());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Thread) it.next()).join();
            } catch (InterruptedException e2) {
                throw new RuntimeException(e2);
            }
        }
        if (this.lastResamplingException != null) {
            throw new RuntimeException("Exception encountered during resampling", this.lastResamplingException);
        }
    }

    public void setAlgorithm(Sampler sampler) throws InterruptedException {
        this.algorithm = sampler;
        resample();
    }

    public void setBounds(RectRegion rectRegion) {
        this.bounds = rectRegion;
    }

    public void setRatio(float f2) {
        if (f2 <= 1.0f) {
            throw new IllegalArgumentException("Ratio must be greater than 1");
        }
        this.ratio = f2;
    }

    public void setThreshold(int i2) {
        if (i2 >= this.rawData.size()) {
            throw new IllegalArgumentException("Threshold must be < original series size.");
        }
        this.threshold = i2;
    }

    public void setZoomFactor(double d2) {
        if (d2 <= 1.0d) {
            this.activeSeries = this.rawData;
            return;
        }
        int zoomIndex = getZoomIndex(d2, getRatio());
        if (zoomIndex < this.zoomLevels.size()) {
            this.activeSeries = this.zoomLevels.get(zoomIndex);
        } else {
            this.activeSeries = this.zoomLevels.get(r4.size() - 1);
        }
    }

    @Override // com.androidplot.xy.XYSeries
    public int size() {
        return this.activeSeries.size();
    }

    public SampledXYSeries(XYSeries xYSeries, float f2, int i2) {
        this(xYSeries, SeriesUtils.getXYOrder(xYSeries), f2, i2);
    }
}