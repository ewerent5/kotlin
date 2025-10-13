package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class b10 implements c20 {
    private static final Logger a = Logger.getLogger(b10.class.getName());

    /* renamed from: b, reason: collision with root package name */
    final ThreadLocal<ByteBuffer> f5042b = new a00(this);

    @Override // com.google.android.gms.internal.ads.c20
    public final f50 a(xn2 xn2Var, g60 g60Var) throws EOFException {
        int iJ0;
        long jZzb;
        long jZzc = xn2Var.zzc();
        this.f5042b.get().rewind().limit(8);
        do {
            iJ0 = xn2Var.J0(this.f5042b.get());
            if (iJ0 == 8) {
                this.f5042b.get().rewind();
                long jA = e40.a(this.f5042b.get());
                byte[] bArr = null;
                if (jA < 8 && jA > 1) {
                    Logger logger = a;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(jA);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                this.f5042b.get().get(bArr2);
                try {
                    String str = new String(bArr2, "ISO-8859-1");
                    if (jA == 1) {
                        this.f5042b.get().limit(16);
                        xn2Var.J0(this.f5042b.get());
                        this.f5042b.get().position(8);
                        jZzb = e40.d(this.f5042b.get()) - 16;
                    } else {
                        jZzb = jA == 0 ? xn2Var.zzb() - xn2Var.zzc() : jA - 8;
                    }
                    if ("uuid".equals(str)) {
                        this.f5042b.get().limit(this.f5042b.get().limit() + 16);
                        xn2Var.J0(this.f5042b.get());
                        bArr = new byte[16];
                        for (int iPosition = this.f5042b.get().position() - 16; iPosition < this.f5042b.get().position(); iPosition++) {
                            bArr[iPosition - (this.f5042b.get().position() - 16)] = this.f5042b.get().get(iPosition);
                        }
                        jZzb -= 16;
                    }
                    long j2 = jZzb;
                    f50 f50VarB = b(str, bArr, g60Var instanceof f50 ? ((f50) g60Var).zzb() : "");
                    f50VarB.c(g60Var);
                    this.f5042b.get().rewind();
                    f50VarB.b(xn2Var, this.f5042b.get(), j2, this);
                    return f50VarB;
                } catch (UnsupportedEncodingException e2) {
                    throw new RuntimeException(e2);
                }
            }
        } while (iJ0 >= 0);
        xn2Var.a(jZzc);
        throw new EOFException();
    }

    public abstract f50 b(String str, byte[] bArr, String str2);
}