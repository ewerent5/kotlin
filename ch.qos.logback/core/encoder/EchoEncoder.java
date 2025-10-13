package ch.qos.logback.core.encoder;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public class EchoEncoder<E> extends EncoderBase<E> {
    @Override // ch.qos.logback.core.encoder.Encoder
    public void close() {
    }

    @Override // ch.qos.logback.core.encoder.Encoder
    public void doEncode(E e2) throws IOException {
        this.outputStream.write((e2 + CoreConstants.LINE_SEPARATOR).getBytes());
        this.outputStream.flush();
    }

    @Override // ch.qos.logback.core.encoder.EncoderBase, ch.qos.logback.core.encoder.Encoder
    public void init(OutputStream outputStream) {
        super.init(outputStream);
    }
}