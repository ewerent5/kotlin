package ch.qos.logback.core.pattern.parser;

import ch.qos.logback.core.pattern.FormatInfo;

/* loaded from: classes.dex */
public class FormattingNode extends Node {
    FormatInfo formatInfo;

    FormattingNode(int i2) {
        super(i2);
    }

    FormattingNode(int i2, Object obj) {
        super(i2, obj);
    }

    @Override // ch.qos.logback.core.pattern.parser.Node
    public boolean equals(Object obj) {
        if (!super.equals(obj) || !(obj instanceof FormattingNode)) {
            return false;
        }
        FormatInfo formatInfo = this.formatInfo;
        FormatInfo formatInfo2 = ((FormattingNode) obj).formatInfo;
        return formatInfo != null ? formatInfo.equals(formatInfo2) : formatInfo2 == null;
    }

    public FormatInfo getFormatInfo() {
        return this.formatInfo;
    }

    @Override // ch.qos.logback.core.pattern.parser.Node
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        FormatInfo formatInfo = this.formatInfo;
        return iHashCode + (formatInfo != null ? formatInfo.hashCode() : 0);
    }

    public void setFormatInfo(FormatInfo formatInfo) {
        this.formatInfo = formatInfo;
    }
}