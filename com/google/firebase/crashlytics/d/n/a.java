package com.google.firebase.crashlytics.d.n;

import com.google.firebase.crashlytics.d.n.b;
import com.google.firebase.crashlytics.d.n.c.c;
import com.google.firebase.crashlytics.d.n.c.d;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: ReportManager.java */
/* loaded from: classes.dex */
public class a {
    private final b.c a;

    public a(b.c cVar) {
        this.a = cVar;
    }

    public boolean a() {
        File[] fileArrB = this.a.b();
        File[] fileArrA = this.a.a();
        if (fileArrB == null || fileArrB.length <= 0) {
            return fileArrA != null && fileArrA.length > 0;
        }
        return true;
    }

    public void b(c cVar) {
        cVar.remove();
    }

    public void c(List<c> list) {
        Iterator<c> it = list.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    public List<c> d() {
        com.google.firebase.crashlytics.d.b.f().b("Checking for crash reports...");
        File[] fileArrB = this.a.b();
        File[] fileArrA = this.a.a();
        LinkedList linkedList = new LinkedList();
        if (fileArrB != null) {
            for (File file : fileArrB) {
                com.google.firebase.crashlytics.d.b.f().b("Found crash report " + file.getPath());
                linkedList.add(new d(file));
            }
        }
        if (fileArrA != null) {
            for (File file2 : fileArrA) {
                linkedList.add(new com.google.firebase.crashlytics.d.n.c.b(file2));
            }
        }
        if (linkedList.isEmpty()) {
            com.google.firebase.crashlytics.d.b.f().b("No reports found.");
        }
        return linkedList;
    }
}