package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import android.view.View;
import com.bumptech.glide.c;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.data.k;
import com.bumptech.glide.load.o.a;
import com.bumptech.glide.load.o.b;
import com.bumptech.glide.load.o.d;
import com.bumptech.glide.load.o.e;
import com.bumptech.glide.load.o.f;
import com.bumptech.glide.load.o.k;
import com.bumptech.glide.load.o.s;
import com.bumptech.glide.load.o.u;
import com.bumptech.glide.load.o.v;
import com.bumptech.glide.load.o.w;
import com.bumptech.glide.load.o.x;
import com.bumptech.glide.load.o.y.a;
import com.bumptech.glide.load.o.y.b;
import com.bumptech.glide.load.o.y.c;
import com.bumptech.glide.load.o.y.d;
import com.bumptech.glide.load.o.y.e;
import com.bumptech.glide.load.p.d.a0;
import com.bumptech.glide.load.p.d.b0;
import com.bumptech.glide.load.p.d.m;
import com.bumptech.glide.load.p.d.t;
import com.bumptech.glide.load.p.d.v;
import com.bumptech.glide.load.p.d.x;
import com.bumptech.glide.load.p.d.y;
import com.bumptech.glide.load.p.e.a;
import com.bumptech.glide.o.p;
import java.io.File;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Glide.java */
/* loaded from: classes.dex */
public class b implements ComponentCallbacks2 {

    /* renamed from: e */
    private static volatile b f3513e;

    /* renamed from: f */
    private static volatile boolean f3514f;

    /* renamed from: g */
    private final com.bumptech.glide.load.n.k f3515g;

    /* renamed from: h */
    private final com.bumptech.glide.load.n.a0.e f3516h;

    /* renamed from: i */
    private final com.bumptech.glide.load.n.b0.h f3517i;

    /* renamed from: j */
    private final d f3518j;

    /* renamed from: k */
    private final i f3519k;

    /* renamed from: l */
    private final com.bumptech.glide.load.n.a0.b f3520l;

    /* renamed from: m */
    private final p f3521m;
    private final com.bumptech.glide.o.d n;
    private final a p;
    private final List<k> o = new ArrayList();
    private f q = f.NORMAL;

    /* compiled from: Glide.java */
    public interface a {
        com.bumptech.glide.r.f a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v1, types: [com.bumptech.glide.load.p.d.h] */
    b(Context context, com.bumptech.glide.load.n.k kVar, com.bumptech.glide.load.n.b0.h hVar, com.bumptech.glide.load.n.a0.e eVar, com.bumptech.glide.load.n.a0.b bVar, p pVar, com.bumptech.glide.o.d dVar, int i2, a aVar, Map<Class<?>, l<?, ?>> map, List<com.bumptech.glide.r.e<Object>> list, e eVar2) {
        com.bumptech.glide.load.k yVar;
        com.bumptech.glide.load.p.d.g hVar2;
        this.f3515g = kVar;
        this.f3516h = eVar;
        this.f3520l = bVar;
        this.f3517i = hVar;
        this.f3521m = pVar;
        this.n = dVar;
        this.p = aVar;
        Resources resources = context.getResources();
        i iVar = new i();
        this.f3519k = iVar;
        iVar.o(new com.bumptech.glide.load.p.d.k());
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 27) {
            iVar.o(new com.bumptech.glide.load.p.d.p());
        }
        List<ImageHeaderParser> listG = iVar.g();
        com.bumptech.glide.load.p.h.a aVar2 = new com.bumptech.glide.load.p.h.a(context, listG, eVar, bVar);
        com.bumptech.glide.load.k<ParcelFileDescriptor, Bitmap> kVarH = b0.h(eVar);
        m mVar = new m(iVar.g(), resources.getDisplayMetrics(), eVar, bVar);
        if (!eVar2.a(c.b.class) || i3 < 28) {
            com.bumptech.glide.load.p.d.g gVar = new com.bumptech.glide.load.p.d.g(mVar);
            yVar = new y(mVar, bVar);
            hVar2 = gVar;
        } else {
            yVar = new t();
            hVar2 = new com.bumptech.glide.load.p.d.h();
        }
        com.bumptech.glide.load.p.f.d dVar2 = new com.bumptech.glide.load.p.f.d(context);
        s.c cVar = new s.c(resources);
        s.d dVar3 = new s.d(resources);
        s.b bVar2 = new s.b(resources);
        s.a aVar3 = new s.a(resources);
        com.bumptech.glide.load.p.d.c cVar2 = new com.bumptech.glide.load.p.d.c(bVar);
        com.bumptech.glide.load.p.i.a aVar4 = new com.bumptech.glide.load.p.i.a();
        com.bumptech.glide.load.p.i.d dVar4 = new com.bumptech.glide.load.p.i.d();
        ContentResolver contentResolver = context.getContentResolver();
        iVar.a(ByteBuffer.class, new com.bumptech.glide.load.o.c()).a(InputStream.class, new com.bumptech.glide.load.o.t(bVar)).e("Bitmap", ByteBuffer.class, Bitmap.class, hVar2).e("Bitmap", InputStream.class, Bitmap.class, yVar);
        if (ParcelFileDescriptorRewinder.c()) {
            iVar.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, new v(mVar));
        }
        iVar.e("Bitmap", ParcelFileDescriptor.class, Bitmap.class, kVarH).e("Bitmap", AssetFileDescriptor.class, Bitmap.class, b0.c(eVar)).d(Bitmap.class, Bitmap.class, v.a.a()).e("Bitmap", Bitmap.class, Bitmap.class, new a0()).b(Bitmap.class, cVar2).e("BitmapDrawable", ByteBuffer.class, BitmapDrawable.class, new com.bumptech.glide.load.p.d.a(resources, hVar2)).e("BitmapDrawable", InputStream.class, BitmapDrawable.class, new com.bumptech.glide.load.p.d.a(resources, yVar)).e("BitmapDrawable", ParcelFileDescriptor.class, BitmapDrawable.class, new com.bumptech.glide.load.p.d.a(resources, kVarH)).b(BitmapDrawable.class, new com.bumptech.glide.load.p.d.b(eVar, cVar2)).e("Gif", InputStream.class, com.bumptech.glide.load.p.h.c.class, new com.bumptech.glide.load.p.h.j(listG, aVar2, bVar)).e("Gif", ByteBuffer.class, com.bumptech.glide.load.p.h.c.class, aVar2).b(com.bumptech.glide.load.p.h.c.class, new com.bumptech.glide.load.p.h.d()).d(com.bumptech.glide.n.a.class, com.bumptech.glide.n.a.class, v.a.a()).e("Bitmap", com.bumptech.glide.n.a.class, Bitmap.class, new com.bumptech.glide.load.p.h.h(eVar)).c(Uri.class, Drawable.class, dVar2).c(Uri.class, Bitmap.class, new x(dVar2, eVar)).p(new a.C0096a()).d(File.class, ByteBuffer.class, new d.b()).d(File.class, InputStream.class, new f.e()).c(File.class, File.class, new com.bumptech.glide.load.p.g.a()).d(File.class, ParcelFileDescriptor.class, new f.b()).d(File.class, File.class, v.a.a()).p(new k.a(bVar));
        if (ParcelFileDescriptorRewinder.c()) {
            iVar.p(new ParcelFileDescriptorRewinder.a());
        }
        Class cls = Integer.TYPE;
        iVar.d(cls, InputStream.class, cVar).d(cls, ParcelFileDescriptor.class, bVar2).d(Integer.class, InputStream.class, cVar).d(Integer.class, ParcelFileDescriptor.class, bVar2).d(Integer.class, Uri.class, dVar3).d(cls, AssetFileDescriptor.class, aVar3).d(Integer.class, AssetFileDescriptor.class, aVar3).d(cls, Uri.class, dVar3).d(String.class, InputStream.class, new e.c()).d(Uri.class, InputStream.class, new e.c()).d(String.class, InputStream.class, new u.c()).d(String.class, ParcelFileDescriptor.class, new u.b()).d(String.class, AssetFileDescriptor.class, new u.a()).d(Uri.class, InputStream.class, new a.c(context.getAssets())).d(Uri.class, ParcelFileDescriptor.class, new a.b(context.getAssets())).d(Uri.class, InputStream.class, new b.a(context)).d(Uri.class, InputStream.class, new c.a(context));
        if (i3 >= 29) {
            iVar.d(Uri.class, InputStream.class, new d.c(context));
            iVar.d(Uri.class, ParcelFileDescriptor.class, new d.b(context));
        }
        iVar.d(Uri.class, InputStream.class, new w.d(contentResolver)).d(Uri.class, ParcelFileDescriptor.class, new w.b(contentResolver)).d(Uri.class, AssetFileDescriptor.class, new w.a(contentResolver)).d(Uri.class, InputStream.class, new x.a()).d(URL.class, InputStream.class, new e.a()).d(Uri.class, File.class, new k.a(context)).d(com.bumptech.glide.load.o.g.class, InputStream.class, new a.C0092a()).d(byte[].class, ByteBuffer.class, new b.a()).d(byte[].class, InputStream.class, new b.d()).d(Uri.class, Uri.class, v.a.a()).d(Drawable.class, Drawable.class, v.a.a()).c(Drawable.class, Drawable.class, new com.bumptech.glide.load.p.f.e()).q(Bitmap.class, BitmapDrawable.class, new com.bumptech.glide.load.p.i.b(resources)).q(Bitmap.class, byte[].class, aVar4).q(Drawable.class, byte[].class, new com.bumptech.glide.load.p.i.c(eVar, aVar4, dVar4)).q(com.bumptech.glide.load.p.h.c.class, byte[].class, dVar4);
        if (i3 >= 23) {
            com.bumptech.glide.load.k<ByteBuffer, Bitmap> kVarD = b0.d(eVar);
            iVar.c(ByteBuffer.class, Bitmap.class, kVarD);
            iVar.c(ByteBuffer.class, BitmapDrawable.class, new com.bumptech.glide.load.p.d.a(resources, kVarD));
        }
        this.f3518j = new d(context, bVar, iVar, new com.bumptech.glide.r.j.f(), aVar, map, list, kVar, eVar2, i2);
    }

    private static void a(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        if (f3514f) {
            throw new IllegalStateException("You cannot call Glide.get() in registerComponents(), use the provided Glide instance instead");
        }
        f3514f = true;
        m(context, generatedAppGlideModule);
        f3514f = false;
    }

    public static b c(Context context) {
        if (f3513e == null) {
            GeneratedAppGlideModule generatedAppGlideModuleD = d(context.getApplicationContext());
            synchronized (b.class) {
                if (f3513e == null) {
                    a(context, generatedAppGlideModuleD);
                }
            }
        }
        return f3513e;
    }

    private static GeneratedAppGlideModule d(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (IllegalAccessException e2) {
            q(e2);
            return null;
        } catch (InstantiationException e3) {
            q(e3);
            return null;
        } catch (NoSuchMethodException e4) {
            q(e4);
            return null;
        } catch (InvocationTargetException e5) {
            q(e5);
            return null;
        }
    }

    private static p l(Context context) {
        com.bumptech.glide.t.j.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return c(context).k();
    }

    private static void m(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        n(context, new c(), generatedAppGlideModule);
    }

    private static void n(Context context, c cVar, GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        List<com.bumptech.glide.p.b> listEmptyList = Collections.emptyList();
        if (generatedAppGlideModule == null || generatedAppGlideModule.c()) {
            listEmptyList = new com.bumptech.glide.p.d(applicationContext).a();
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.d().isEmpty()) {
            Set<Class<?>> setD = generatedAppGlideModule.d();
            Iterator<com.bumptech.glide.p.b> it = listEmptyList.iterator();
            while (it.hasNext()) {
                com.bumptech.glide.p.b next = it.next();
                if (setD.contains(next.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + next);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator<com.bumptech.glide.p.b> it2 = listEmptyList.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + it2.next().getClass());
            }
        }
        cVar.b(generatedAppGlideModule != null ? generatedAppGlideModule.e() : null);
        Iterator<com.bumptech.glide.p.b> it3 = listEmptyList.iterator();
        while (it3.hasNext()) {
            it3.next().a(applicationContext, cVar);
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.b(applicationContext, cVar);
        }
        b bVarA = cVar.a(applicationContext);
        for (com.bumptech.glide.p.b bVar : listEmptyList) {
            try {
                bVar.b(applicationContext, bVarA, bVarA.f3519k);
            } catch (AbstractMethodError e2) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: " + bVar.getClass().getName(), e2);
            }
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.a(applicationContext, bVarA, bVarA.f3519k);
        }
        applicationContext.registerComponentCallbacks(bVarA);
        f3513e = bVarA;
    }

    private static void q(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public static k t(Context context) {
        return l(context).l(context);
    }

    public static k u(View view) {
        return l(view.getContext()).m(view);
    }

    public void b() {
        com.bumptech.glide.t.k.a();
        this.f3517i.b();
        this.f3516h.b();
        this.f3520l.b();
    }

    public com.bumptech.glide.load.n.a0.b e() {
        return this.f3520l;
    }

    public com.bumptech.glide.load.n.a0.e f() {
        return this.f3516h;
    }

    com.bumptech.glide.o.d g() {
        return this.n;
    }

    public Context h() {
        return this.f3518j.getBaseContext();
    }

    d i() {
        return this.f3518j;
    }

    public i j() {
        return this.f3519k;
    }

    public p k() {
        return this.f3521m;
    }

    void o(k kVar) {
        synchronized (this.o) {
            if (this.o.contains(kVar)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            this.o.add(kVar);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        b();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        r(i2);
    }

    boolean p(com.bumptech.glide.r.j.h<?> hVar) {
        synchronized (this.o) {
            Iterator<k> it = this.o.iterator();
            while (it.hasNext()) {
                if (it.next().y(hVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    public void r(int i2) {
        com.bumptech.glide.t.k.a();
        synchronized (this.o) {
            Iterator<k> it = this.o.iterator();
            while (it.hasNext()) {
                it.next().onTrimMemory(i2);
            }
        }
        this.f3517i.a(i2);
        this.f3516h.a(i2);
        this.f3520l.a(i2);
    }

    void s(k kVar) {
        synchronized (this.o) {
            if (!this.o.contains(kVar)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            this.o.remove(kVar);
        }
    }
}