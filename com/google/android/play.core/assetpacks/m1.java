package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
final class m1 {
    private static final e.c.b.d.a.b.f a = new e.c.b.d.a.b.f("MergeSliceTaskHandler");

    /* renamed from: b, reason: collision with root package name */
    private final v f12085b;

    m1(v vVar) {
        this.f12085b = vVar;
    }

    private static void b(File file, File file2) {
        if (!file.isDirectory()) {
            if (file2.exists()) {
                String strValueOf = String.valueOf(file2);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 51);
                sb.append("File clashing with existing file from other slice: ");
                sb.append(strValueOf);
                throw new k0(sb.toString());
            }
            if (file.renameTo(file2)) {
                return;
            }
            String strValueOf2 = String.valueOf(file);
            StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 21);
            sb2.append("Unable to move file: ");
            sb2.append(strValueOf2);
            throw new k0(sb2.toString());
        }
        file2.mkdirs();
        for (File file3 : file.listFiles()) {
            b(file3, new File(file2, file3.getName()));
        }
        if (file.delete()) {
            return;
        }
        String strValueOf3 = String.valueOf(file);
        StringBuilder sb3 = new StringBuilder(strValueOf3.length() + 28);
        sb3.append("Unable to delete directory: ");
        sb3.append(strValueOf3);
        throw new k0(sb3.toString());
    }

    public final void a(l1 l1Var) {
        File fileW = this.f12085b.w(l1Var.f11951b, l1Var.f12072c, l1Var.f12073d, l1Var.f12074e);
        if (!fileW.exists()) {
            throw new k0(String.format("Cannot find verified files for slice %s.", l1Var.f12074e), l1Var.a);
        }
        File fileX = this.f12085b.x(l1Var.f11951b, l1Var.f12072c, l1Var.f12073d);
        if (!fileX.exists()) {
            fileX.mkdirs();
        }
        b(fileW, fileX);
        try {
            this.f12085b.z(l1Var.f11951b, l1Var.f12072c, l1Var.f12073d, this.f12085b.y(l1Var.f11951b, l1Var.f12072c, l1Var.f12073d) + 1);
        } catch (IOException e2) {
            a.b("Writing merge checkpoint failed with %s.", e2.getMessage());
            throw new k0("Writing merge checkpoint failed.", e2, l1Var.a);
        }
    }
}