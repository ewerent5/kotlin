package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
final class b2 {
    private static final e.c.b.d.a.b.f a = new e.c.b.d.a.b.f("VerifySliceTaskHandler");

    /* renamed from: b, reason: collision with root package name */
    private final v f11950b;

    b2(v vVar) {
        this.f11950b = vVar;
    }

    private final void b(a2 a2Var, File file) {
        try {
            File fileC = this.f11950b.C(a2Var.f11951b, a2Var.f11941c, a2Var.f11942d, a2Var.f11943e);
            if (!fileC.exists()) {
                throw new k0(String.format("Cannot find metadata files for slice %s.", a2Var.f11943e), a2Var.a);
            }
            try {
                if (!i1.a(z1.a(file, fileC)).equals(a2Var.f11944f)) {
                    throw new k0(String.format("Verification failed for slice %s.", a2Var.f11943e), a2Var.a);
                }
                a.d("Verification of slice %s of pack %s successful.", a2Var.f11943e, a2Var.f11951b);
            } catch (IOException e2) {
                throw new k0(String.format("Could not digest file during verification for slice %s.", a2Var.f11943e), e2, a2Var.a);
            } catch (NoSuchAlgorithmException e3) {
                throw new k0("SHA256 algorithm not supported.", e3, a2Var.a);
            }
        } catch (IOException e4) {
            throw new k0(String.format("Could not reconstruct slice archive during verification for slice %s.", a2Var.f11943e), e4, a2Var.a);
        }
    }

    public final void a(a2 a2Var) {
        File fileV = this.f11950b.v(a2Var.f11951b, a2Var.f11941c, a2Var.f11942d, a2Var.f11943e);
        if (!fileV.exists()) {
            throw new k0(String.format("Cannot find unverified files for slice %s.", a2Var.f11943e), a2Var.a);
        }
        b(a2Var, fileV);
        File fileW = this.f11950b.w(a2Var.f11951b, a2Var.f11941c, a2Var.f11942d, a2Var.f11943e);
        if (!fileW.exists()) {
            fileW.mkdirs();
        }
        if (!fileV.renameTo(fileW)) {
            throw new k0(String.format("Failed to move slice %s after verification.", a2Var.f11943e), a2Var.a);
        }
    }
}