package okhttp3.internal.ws;

import i.x.a;
import i.y.d.l;
import j.b0;
import j.f;
import j.i;
import j.j;
import java.io.Closeable;
import java.util.zip.Deflater;

/* compiled from: MessageDeflater.kt */
/* loaded from: classes3.dex */
public final class MessageDeflater implements Closeable {
    private final f deflatedBytes;
    private final Deflater deflater;
    private final j deflaterSink;
    private final boolean noContextTakeover;

    public MessageDeflater(boolean z) {
        this.noContextTakeover = z;
        f fVar = new f();
        this.deflatedBytes = fVar;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new j((b0) fVar, deflater);
    }

    private final boolean endsWith(f fVar, i iVar) {
        return fVar.e0(fVar.y0() - iVar.u(), iVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.deflaterSink.close();
    }

    public final void deflate(f fVar) {
        l.d(fVar, "buffer");
        if (!(this.deflatedBytes.y0() == 0)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (this.noContextTakeover) {
            this.deflater.reset();
        }
        this.deflaterSink.write(fVar, fVar.y0());
        this.deflaterSink.flush();
        if (endsWith(this.deflatedBytes, MessageDeflaterKt.EMPTY_DEFLATE_BLOCK)) {
            long jY0 = this.deflatedBytes.y0() - 4;
            f.a aVarA0 = f.a0(this.deflatedBytes, null, 1, null);
            try {
                aVarA0.c(jY0);
                a.a(aVarA0, null);
            } finally {
            }
        } else {
            this.deflatedBytes.I(0);
        }
        f fVar2 = this.deflatedBytes;
        fVar.write(fVar2, fVar2.y0());
    }
}