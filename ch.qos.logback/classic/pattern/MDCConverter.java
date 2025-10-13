package ch.qos.logback.classic.pattern;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.util.OptionHelper;
import java.util.Map;

/* loaded from: classes.dex */
public class MDCConverter extends ClassicConverter {
    private String defaultValue = "";
    private String key;

    private String outputMDCForAllKeys(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
        }
        return sb.toString();
    }

    @Override // ch.qos.logback.core.pattern.Converter
    public String convert(ILoggingEvent iLoggingEvent) {
        Map<String, String> mDCPropertyMap = iLoggingEvent.getMDCPropertyMap();
        if (mDCPropertyMap == null) {
            return this.defaultValue;
        }
        if (this.key == null) {
            return outputMDCForAllKeys(mDCPropertyMap);
        }
        String str = iLoggingEvent.getMDCPropertyMap().get(this.key);
        return str != null ? str : this.defaultValue;
    }

    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        String[] strArrExtractDefaultReplacement = OptionHelper.extractDefaultReplacement(getFirstOption());
        this.key = strArrExtractDefaultReplacement[0];
        if (strArrExtractDefaultReplacement[1] != null) {
            this.defaultValue = strArrExtractDefaultReplacement[1];
        }
        super.start();
    }

    @Override // ch.qos.logback.core.pattern.DynamicConverter, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        this.key = null;
        super.stop();
    }
}