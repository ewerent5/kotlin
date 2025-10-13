package com.google.firebase.crashlytics.d.h;

import android.os.Looper;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: Utils.java */
/* loaded from: classes.dex */
public final class k0 {
    private static final FilenameFilter a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final ExecutorService f12432b = v.c("awaitEvenIfOnMainThread task continuation executor");

    /* compiled from: Utils.java */
    class a implements FilenameFilter {
        a() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return true;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: Utils.java */
    class b<T> implements e.c.b.b.e.a<T, Void> {
        final /* synthetic */ e.c.b.b.e.i a;

        b(e.c.b.b.e.i iVar) {
            this.a = iVar;
        }

        @Override // e.c.b.b.e.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(e.c.b.b.e.h<T> hVar) {
            if (hVar.n()) {
                this.a.e(hVar.k());
                return null;
            }
            this.a.d(hVar.j());
            return null;
        }
    }

    /* compiled from: Utils.java */
    class c implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Callable f12433e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e.c.b.b.e.i f12434f;

        /* JADX INFO: Add missing generic type declarations: [T] */
        /* compiled from: Utils.java */
        class a<T> implements e.c.b.b.e.a<T, Void> {
            a() {
            }

            @Override // e.c.b.b.e.a
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Void a(e.c.b.b.e.h<T> hVar) {
                if (hVar.n()) {
                    c.this.f12434f.c(hVar.k());
                    return null;
                }
                c.this.f12434f.b(hVar.j());
                return null;
            }
        }

        c(Callable callable, e.c.b.b.e.i iVar) {
            this.f12433e = callable;
            this.f12434f = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ((e.c.b.b.e.h) this.f12433e.call()).f(new a());
            } catch (Exception e2) {
                this.f12434f.b(e2);
            }
        }
    }

    public static <T> T a(e.c.b.b.e.h<T> hVar) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        hVar.g(f12432b, j0.b(countDownLatch));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        } else {
            countDownLatch.await();
        }
        if (hVar.n()) {
            return hVar.k();
        }
        if (hVar.l()) {
            throw new CancellationException("Task is already canceled");
        }
        if (hVar.m()) {
            throw new IllegalStateException(hVar.j());
        }
        throw new TimeoutException();
    }

    public static <T> e.c.b.b.e.h<T> b(Executor executor, Callable<e.c.b.b.e.h<T>> callable) {
        e.c.b.b.e.i iVar = new e.c.b.b.e.i();
        executor.execute(new c(callable, iVar));
        return iVar.a();
    }

    static int c(File file, int i2, Comparator<File> comparator) {
        return d(file, a, i2, comparator);
    }

    static int d(File file, FilenameFilter filenameFilter, int i2, Comparator<File> comparator) {
        File[] fileArrListFiles = file.listFiles(filenameFilter);
        if (fileArrListFiles == null) {
            return 0;
        }
        return e(Arrays.asList(fileArrListFiles), i2, comparator);
    }

    static int e(List<File> list, int i2, Comparator<File> comparator) {
        int size = list.size();
        Collections.sort(list, comparator);
        for (File file : list) {
            if (size <= i2) {
                return size;
            }
            i(file);
            size--;
        }
        return size;
    }

    static int f(File file, File file2, int i2, Comparator<File> comparator) {
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = file.listFiles();
        File[] fileArrListFiles2 = file2.listFiles(a);
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        if (fileArrListFiles2 == null) {
            fileArrListFiles2 = new File[0];
        }
        arrayList.addAll(Arrays.asList(fileArrListFiles));
        arrayList.addAll(Arrays.asList(fileArrListFiles2));
        return e(arrayList, i2, comparator);
    }

    static /* synthetic */ Object g(CountDownLatch countDownLatch, e.c.b.b.e.h hVar) {
        countDownLatch.countDown();
        return null;
    }

    public static <T> e.c.b.b.e.h<T> h(e.c.b.b.e.h<T> hVar, e.c.b.b.e.h<T> hVar2) {
        e.c.b.b.e.i iVar = new e.c.b.b.e.i();
        b bVar = new b(iVar);
        hVar.f(bVar);
        hVar2.f(bVar);
        return iVar.a();
    }

    private static void i(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                i(file2);
            }
        }
        file.delete();
    }
}