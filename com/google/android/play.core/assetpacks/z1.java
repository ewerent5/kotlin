package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class z1 {
    private static final Pattern a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    static List<File> a(File file, File file2) throws IOException, NumberFormatException {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = file2.listFiles(y1.a);
        if (fileArrListFiles == null) {
            fileArr = new File[0];
        } else {
            File[] fileArr2 = new File[fileArrListFiles.length];
            for (File file3 : fileArrListFiles) {
                int i2 = Integer.parseInt(file3.getName().split("-")[0]);
                if (i2 > fileArrListFiles.length || fileArr2[i2] != null) {
                    throw new k0("Metadata folder ordering corrupt.");
                }
                fileArr2[i2] = file3;
            }
            fileArr = fileArr2;
        }
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    c2 c2VarB = new d0(fileInputStream).b();
                    if (c2VarB.d() == null) {
                        throw new k0("Metadata files corrupt. Could not read local file header.");
                    }
                    File file5 = new File(file, c2VarB.d());
                    if (!file5.exists()) {
                        throw new k0(String.format("Missing asset file %s during slice reconstruction.", file5.getCanonicalPath()));
                    }
                    arrayList.add(file5);
                    fileInputStream.close();
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        e.c.b.d.a.b.d0.a(th, th2);
                    }
                    throw th;
                }
            }
        }
        return arrayList;
    }
}