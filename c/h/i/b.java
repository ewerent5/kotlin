package c.h.i;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.c.f;
import c.h.d.k;
import c.h.i.c;
import c.h.k.h;
import ch.qos.logback.core.joran.action.Action;
import j$.util.Comparator;
import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: FontsContractCompat.java */
/* loaded from: classes.dex */
public class b {
    static final c.e.e<String, Typeface> a = new c.e.e<>(16);

    /* renamed from: b, reason: collision with root package name */
    private static final c.h.i.c f3035b = new c.h.i.c("fonts", 10, 10000);

    /* renamed from: c, reason: collision with root package name */
    static final Object f3036c = new Object();

    /* renamed from: d, reason: collision with root package name */
    static final c.e.g<String, ArrayList<c.d<g>>> f3037d = new c.e.g<>();

    /* renamed from: e, reason: collision with root package name */
    private static final Comparator<byte[]> f3038e = new d();

    /* compiled from: FontsContractCompat.java */
    class a implements Callable<g> {
        final /* synthetic */ Context a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c.h.i.a f3039b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f3040c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f3041d;

        a(Context context, c.h.i.a aVar, int i2, String str) {
            this.a = context;
            this.f3039b = aVar;
            this.f3040c = i2;
            this.f3041d = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g call() {
            g gVarF = b.f(this.a, this.f3039b, this.f3040c);
            Typeface typeface = gVarF.a;
            if (typeface != null) {
                b.a.d(this.f3041d, typeface);
            }
            return gVarF;
        }
    }

    /* compiled from: FontsContractCompat.java */
    /* renamed from: c.h.i.b$b, reason: collision with other inner class name */
    class C0051b implements c.d<g> {
        final /* synthetic */ f.a a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Handler f3042b;

        C0051b(f.a aVar, Handler handler) {
            this.a = aVar;
            this.f3042b = handler;
        }

        @Override // c.h.i.c.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(g gVar) {
            if (gVar == null) {
                this.a.a(1, this.f3042b);
                return;
            }
            int i2 = gVar.f3048b;
            if (i2 == 0) {
                this.a.b(gVar.a, this.f3042b);
            } else {
                this.a.a(i2, this.f3042b);
            }
        }
    }

    /* compiled from: FontsContractCompat.java */
    class c implements c.d<g> {
        final /* synthetic */ String a;

        c(String str) {
            this.a = str;
        }

        @Override // c.h.i.c.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(g gVar) {
            synchronized (b.f3036c) {
                c.e.g<String, ArrayList<c.d<g>>> gVar2 = b.f3037d;
                ArrayList<c.d<g>> arrayList = gVar2.get(this.a);
                if (arrayList == null) {
                    return;
                }
                gVar2.remove(this.a);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    arrayList.get(i2).a(gVar);
                }
            }
        }
    }

    /* compiled from: FontsContractCompat.java */
    class d implements Comparator<byte[]>, j$.util.Comparator {
        d() {
        }

        @Override // java.util.Comparator, j$.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(byte[] bArr, byte[] bArr2) {
            int length;
            int length2;
            if (bArr.length == bArr2.length) {
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    if (bArr[i2] != bArr2[i2]) {
                        length = bArr[i2];
                        length2 = bArr2[i2];
                    }
                }
                return 0;
            }
            length = bArr.length;
            length2 = bArr2.length;
            return length - length2;
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public /* synthetic */ Comparator reversed() {
            return Collections.reverseOrder(this);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ Comparator thenComparing(Function function) {
            return Comparator.CC.$default$thenComparing(this, function);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
            return Comparator.CC.$default$thenComparing(this, function, comparator);
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
            return Comparator.CC.$default$thenComparing(this, comparator);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
            return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
            return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
            return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
        }
    }

    /* compiled from: FontsContractCompat.java */
    public static class e {
        private final int a;

        /* renamed from: b, reason: collision with root package name */
        private final f[] f3043b;

        public e(int i2, f[] fVarArr) {
            this.a = i2;
            this.f3043b = fVarArr;
        }

        public f[] a() {
            return this.f3043b;
        }

        public int b() {
            return this.a;
        }
    }

    /* compiled from: FontsContractCompat.java */
    public static class f {
        private final Uri a;

        /* renamed from: b, reason: collision with root package name */
        private final int f3044b;

        /* renamed from: c, reason: collision with root package name */
        private final int f3045c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f3046d;

        /* renamed from: e, reason: collision with root package name */
        private final int f3047e;

        public f(Uri uri, int i2, int i3, boolean z, int i4) {
            this.a = (Uri) h.c(uri);
            this.f3044b = i2;
            this.f3045c = i3;
            this.f3046d = z;
            this.f3047e = i4;
        }

        public int a() {
            return this.f3047e;
        }

        public int b() {
            return this.f3044b;
        }

        public Uri c() {
            return this.a;
        }

        public int d() {
            return this.f3045c;
        }

        public boolean e() {
            return this.f3046d;
        }
    }

    /* compiled from: FontsContractCompat.java */
    private static final class g {
        final Typeface a;

        /* renamed from: b, reason: collision with root package name */
        final int f3048b;

        g(Typeface typeface, int i2) {
            this.a = typeface;
            this.f3048b = i2;
        }
    }

    private static List<byte[]> a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean b(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!Arrays.equals(list.get(i2), list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public static e c(Context context, CancellationSignal cancellationSignal, c.h.i.a aVar) throws PackageManager.NameNotFoundException {
        ProviderInfo providerInfoH = h(context.getPackageManager(), aVar, context.getResources());
        return providerInfoH == null ? new e(1, null) : new e(0, e(context, aVar, providerInfoH.authority, cancellationSignal));
    }

    private static List<List<byte[]>> d(c.h.i.a aVar, Resources resources) {
        return aVar.a() != null ? aVar.a() : androidx.core.content.c.c.c(resources, aVar.b());
    }

    static f[] e(Context context, c.h.i.a aVar, String str, CancellationSignal cancellationSignal) {
        ArrayList arrayList = new ArrayList();
        Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
        Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath(Action.FILE_ATTRIBUTE).build();
        Cursor cursorQuery = null;
        try {
            cursorQuery = Build.VERSION.SDK_INT > 16 ? context.getContentResolver().query(uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.f()}, null, cancellationSignal) : context.getContentResolver().query(uriBuild, new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"}, "query = ?", new String[]{aVar.f()}, null);
            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                int columnIndex = cursorQuery.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursorQuery.getColumnIndex("_id");
                int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                while (cursorQuery.moveToNext()) {
                    int i2 = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                    arrayList2.add(new f(columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3)), columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0, columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400, columnIndex6 != -1 && cursorQuery.getInt(columnIndex6) == 1, i2));
                }
                arrayList = arrayList2;
            }
            return (f[]) arrayList.toArray(new f[0]);
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    static g f(Context context, c.h.i.a aVar, int i2) {
        try {
            e eVarC = c(context, null, aVar);
            if (eVarC.b() != 0) {
                return new g(null, eVarC.b() == 1 ? -2 : -3);
            }
            Typeface typefaceB = c.h.d.d.b(context, null, eVarC.a(), i2);
            return new g(typefaceB, typefaceB != null ? 0 : -3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new g(null, -1);
        }
    }

    public static Typeface g(Context context, c.h.i.a aVar, f.a aVar2, Handler handler, boolean z, int i2, int i3) {
        String str = aVar.c() + "-" + i3;
        Typeface typefaceC = a.c(str);
        if (typefaceC != null) {
            if (aVar2 != null) {
                aVar2.d(typefaceC);
            }
            return typefaceC;
        }
        if (z && i2 == -1) {
            g gVarF = f(context, aVar, i3);
            if (aVar2 != null) {
                int i4 = gVarF.f3048b;
                if (i4 == 0) {
                    aVar2.b(gVarF.a, handler);
                } else {
                    aVar2.a(i4, handler);
                }
            }
            return gVarF.a;
        }
        a aVar3 = new a(context, aVar, i3, str);
        if (z) {
            try {
                return ((g) f3035b.e(aVar3, i2)).a;
            } catch (InterruptedException unused) {
                return null;
            }
        }
        C0051b c0051b = aVar2 == null ? null : new C0051b(aVar2, handler);
        synchronized (f3036c) {
            c.e.g<String, ArrayList<c.d<g>>> gVar = f3037d;
            ArrayList<c.d<g>> arrayList = gVar.get(str);
            if (arrayList != null) {
                if (c0051b != null) {
                    arrayList.add(c0051b);
                }
                return null;
            }
            if (c0051b != null) {
                ArrayList<c.d<g>> arrayList2 = new ArrayList<>();
                arrayList2.add(c0051b);
                gVar.put(str, arrayList2);
            }
            f3035b.d(aVar3, new c(str));
            return null;
        }
    }

    public static ProviderInfo h(PackageManager packageManager, c.h.i.a aVar, Resources resources) throws PackageManager.NameNotFoundException {
        String strD = aVar.d();
        ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(strD, 0);
        if (providerInfoResolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + strD);
        }
        if (!providerInfoResolveContentProvider.packageName.equals(aVar.e())) {
            throw new PackageManager.NameNotFoundException("Found content provider " + strD + ", but package was not " + aVar.e());
        }
        List<byte[]> listA = a(packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures);
        Collections.sort(listA, f3038e);
        List<List<byte[]>> listD = d(aVar, resources);
        for (int i2 = 0; i2 < listD.size(); i2++) {
            ArrayList arrayList = new ArrayList(listD.get(i2));
            Collections.sort(arrayList, f3038e);
            if (b(listA, arrayList)) {
                return providerInfoResolveContentProvider;
            }
        }
        return null;
    }

    public static Map<Uri, ByteBuffer> i(Context context, f[] fVarArr, CancellationSignal cancellationSignal) {
        HashMap map = new HashMap();
        for (f fVar : fVarArr) {
            if (fVar.a() == 0) {
                Uri uriC = fVar.c();
                if (!map.containsKey(uriC)) {
                    map.put(uriC, k.f(context, cancellationSignal, uriC));
                }
            }
        }
        return Collections.unmodifiableMap(map);
    }
}