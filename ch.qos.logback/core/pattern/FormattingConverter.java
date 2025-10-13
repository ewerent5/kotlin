package ch.qos.logback.core.pattern;

/* loaded from: classes.dex */
public abstract class FormattingConverter<E> extends Converter<E> {
    static final int INITIAL_BUF_SIZE = 256;
    static final int MAX_CAPACITY = 1024;
    FormatInfo formattingInfo;

    public final FormatInfo getFormattingInfo() {
        return this.formattingInfo;
    }

    public final void setFormattingInfo(FormatInfo formatInfo) {
        if (this.formattingInfo != null) {
            throw new IllegalStateException("FormattingInfo has been already set");
        }
        this.formattingInfo = formatInfo;
    }

    @Override // ch.qos.logback.core.pattern.Converter
    public final void write(StringBuilder sb, E e2) {
        String strConvert = convert(e2);
        FormatInfo formatInfo = this.formattingInfo;
        if (formatInfo == null) {
            sb.append(strConvert);
            return;
        }
        int min = formatInfo.getMin();
        int max = this.formattingInfo.getMax();
        if (strConvert == null) {
            if (min > 0) {
                SpacePadder.spacePad(sb, min);
                return;
            }
            return;
        }
        int length = strConvert.length();
        if (length > max) {
            strConvert = this.formattingInfo.isLeftTruncate() ? strConvert.substring(length - max) : strConvert.substring(0, max);
        } else if (length < min) {
            if (this.formattingInfo.isLeftPad()) {
                SpacePadder.leftPad(sb, strConvert, min);
                return;
            } else {
                SpacePadder.rightPad(sb, strConvert, min);
                return;
            }
        }
        sb.append(strConvert);
    }
}