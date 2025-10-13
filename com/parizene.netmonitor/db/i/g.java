package com.parizene.netmonitor.db.i;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.OpenOption;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: FastcsvBackupLibrary.java */
/* loaded from: classes.dex */
public class g extends d {
    @Override // com.parizene.netmonitor.db.i.d
    <T> int a(a<T> aVar, File file) {
        File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            g.a.a.b.a aVarA = g.a.a.b.a.b().a(file.toPath(), StandardCharsets.UTF_8, new OpenOption[0]);
            aVarA.i(aVar.e());
            int i2 = 0;
            int i3 = 0;
            while (true) {
                List<T> listH = aVar.h(i2, 500L);
                if (listH.isEmpty()) {
                    aVarA.close();
                    return i3;
                }
                Iterator<T> it = listH.iterator();
                while (it.hasNext()) {
                    aVarA.i(aVar.d(it.next()));
                    i3++;
                }
                i2 += 500;
            }
        } catch (IOException e2) {
            m.a.a.g(e2);
            return 0;
        }
    }

    @Override // com.parizene.netmonitor.db.i.d
    <T> int b(a<T> aVar, File file) {
        if (!file.exists()) {
            m.a.a.f("File not exists %s", file.getName());
            return 0;
        }
        try {
            g.a.a.a.c cVarA = g.a.a.a.c.b0().a(file.toPath(), StandardCharsets.UTF_8);
            aVar.c();
            g.a.a.a.a<g.a.a.a.d> it = cVarA.iterator();
            if (it.hasNext()) {
                m.a.a.a("headerRow=%s", it.next());
            }
            List<T> arrayList = new ArrayList<>(500);
            g.a.a.a.a<g.a.a.a.d> it2 = cVarA.iterator();
            int size = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                g.a.a.a.d next = it2.next();
                if (!aVar.g(next.c().size())) {
                    m.a.a.f("Wrong field count in %s", file.getName());
                    break;
                }
                try {
                    arrayList.add(aVar.a(next));
                    if (arrayList.size() == 500) {
                        aVar.f(arrayList);
                        size += arrayList.size();
                        arrayList.clear();
                    }
                } catch (NumberFormatException e2) {
                    m.a.a.g(e2);
                }
            }
            if (!arrayList.isEmpty()) {
                aVar.f(arrayList);
                size += arrayList.size();
                arrayList.clear();
            }
            cVarA.close();
            return size;
        } catch (IOException e3) {
            m.a.a.g(e3);
            return 0;
        }
    }
}