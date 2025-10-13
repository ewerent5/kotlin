package com.parizene.netmonitor.db.i;

import ch.qos.logback.core.CoreConstants;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: OpencsvBackupLibrary.java */
/* loaded from: classes.dex */
public class i extends d {
    @Override // com.parizene.netmonitor.db.i.d
    public <T> int a(a<T> aVar, File file) {
        File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        try {
            e.f.h hVar = new e.f.h(new FileWriter(file), CoreConstants.COMMA_CHAR, CoreConstants.DOUBLE_QUOTE_CHAR, CoreConstants.DOUBLE_QUOTE_CHAR, "\n");
            hVar.b(aVar.e(), false);
            int i2 = 0;
            int i3 = 0;
            while (true) {
                List<T> listH = aVar.h(i2, 500L);
                if (listH.isEmpty()) {
                    hVar.flush();
                    hVar.close();
                    return i3;
                }
                Iterator<T> it = listH.iterator();
                while (it.hasNext()) {
                    hVar.b(aVar.d(it.next()), false);
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
    public <T> int b(a<T> aVar, File file) {
        if (!file.exists()) {
            m.a.a.f("File not exists %s", file.getName());
            return 0;
        }
        try {
            e.f.f fVarA = new e.f.g(new FileReader(file)).a();
            aVar.c();
            String[] strArrI0 = fVarA.I0();
            if (strArrI0 != null) {
                m.a.a.a("headerRow=%s", Arrays.toString(strArrI0));
            }
            List<T> arrayList = new ArrayList<>(500);
            int size = 0;
            while (true) {
                String[] strArrI02 = fVarA.I0();
                if (strArrI02 == null) {
                    break;
                }
                if (!aVar.g(strArrI02.length)) {
                    m.a.a.f("Wrong field count in %s", file.getName());
                    break;
                }
                try {
                    arrayList.add(aVar.b(strArrI02));
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
            fVarA.close();
            return size;
        } catch (e.f.l.e | IOException e3) {
            m.a.a.g(e3);
            return 0;
        }
    }
}