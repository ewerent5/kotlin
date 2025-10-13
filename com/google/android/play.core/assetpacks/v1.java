package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* loaded from: classes.dex */
final class v1 {
    private static final e.c.b.d.a.b.f a = new e.c.b.d.a.b.f("PatchSliceTaskHandler");

    /* renamed from: b, reason: collision with root package name */
    private final v f12170b;

    /* renamed from: c, reason: collision with root package name */
    private final e.c.b.d.a.b.e0<s2> f12171c;

    v1(v vVar, e.c.b.d.a.b.e0<s2> e0Var) {
        this.f12170b = vVar;
        this.f12171c = e0Var;
    }

    public final void a(u1 u1Var) throws IOException {
        File fileT = this.f12170b.t(u1Var.f11951b, u1Var.f12155c, u1Var.f12156d);
        File file = new File(this.f12170b.u(u1Var.f11951b, u1Var.f12155c, u1Var.f12156d), u1Var.f12160h);
        try {
            InputStream gZIPInputStream = u1Var.f12162j;
            if (u1Var.f12159g == 2) {
                gZIPInputStream = new GZIPInputStream(gZIPInputStream, 8192);
            }
            try {
                x xVar = new x(fileT, file);
                File fileV = this.f12170b.v(u1Var.f11951b, u1Var.f12157e, u1Var.f12158f, u1Var.f12160h);
                if (!fileV.exists()) {
                    fileV.mkdirs();
                }
                x1 x1Var = new x1(this.f12170b, u1Var.f11951b, u1Var.f12157e, u1Var.f12158f, u1Var.f12160h);
                e.c.b.d.a.b.s.e(xVar, gZIPInputStream, new n0(fileV, x1Var), u1Var.f12161i);
                x1Var.d(0);
                gZIPInputStream.close();
                a.d("Patching and extraction finished for slice %s of pack %s.", u1Var.f12160h, u1Var.f11951b);
                this.f12171c.a().c(u1Var.a, u1Var.f11951b, u1Var.f12160h, 0);
                try {
                    u1Var.f12162j.close();
                } catch (IOException unused) {
                    a.e("Could not close file for slice %s of pack %s.", u1Var.f12160h, u1Var.f11951b);
                }
            } finally {
            }
        } catch (IOException e2) {
            a.b("IOException during patching %s.", e2.getMessage());
            throw new k0(String.format("Error patching slice %s of pack %s.", u1Var.f12160h, u1Var.f11951b), e2, u1Var.a);
        }
    }
}