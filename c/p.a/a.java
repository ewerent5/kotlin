package c.p.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* compiled from: LocalBroadcastManager.java */
/* loaded from: classes.dex */
public final class a {
    private static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private static a f3277b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f3278c;

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<BroadcastReceiver, ArrayList<c>> f3279d = new HashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<String, ArrayList<c>> f3280e = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList<b> f3281f = new ArrayList<>();

    /* renamed from: g, reason: collision with root package name */
    private final Handler f3282g;

    /* compiled from: LocalBroadcastManager.java */
    /* renamed from: c.p.a.a$a, reason: collision with other inner class name */
    class HandlerC0067a extends Handler {
        HandlerC0067a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                super.handleMessage(message);
            } else {
                a.this.a();
            }
        }
    }

    /* compiled from: LocalBroadcastManager.java */
    private static final class b {
        final Intent a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<c> f3283b;

        b(Intent intent, ArrayList<c> arrayList) {
            this.a = intent;
            this.f3283b = arrayList;
        }
    }

    /* compiled from: LocalBroadcastManager.java */
    private static final class c {
        final IntentFilter a;

        /* renamed from: b, reason: collision with root package name */
        final BroadcastReceiver f3284b;

        /* renamed from: c, reason: collision with root package name */
        boolean f3285c;

        /* renamed from: d, reason: collision with root package name */
        boolean f3286d;

        c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.a = intentFilter;
            this.f3284b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f3284b);
            sb.append(" filter=");
            sb.append(this.a);
            if (this.f3286d) {
                sb.append(" DEAD");
            }
            sb.append("}");
            return sb.toString();
        }
    }

    private a(Context context) {
        this.f3278c = context;
        this.f3282g = new HandlerC0067a(context.getMainLooper());
    }

    public static a b(Context context) {
        a aVar;
        synchronized (a) {
            if (f3277b == null) {
                f3277b = new a(context.getApplicationContext());
            }
            aVar = f3277b;
        }
        return aVar;
    }

    void a() {
        int size;
        b[] bVarArr;
        while (true) {
            synchronized (this.f3279d) {
                size = this.f3281f.size();
                if (size <= 0) {
                    return;
                }
                bVarArr = new b[size];
                this.f3281f.toArray(bVarArr);
                this.f3281f.clear();
            }
            for (int i2 = 0; i2 < size; i2++) {
                b bVar = bVarArr[i2];
                int size2 = bVar.f3283b.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    c cVar = bVar.f3283b.get(i3);
                    if (!cVar.f3286d) {
                        cVar.f3284b.onReceive(this.f3278c, bVar.a);
                    }
                }
            }
        }
    }

    public void c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f3279d) {
            c cVar = new c(intentFilter, broadcastReceiver);
            ArrayList<c> arrayList = this.f3279d.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList<>(1);
                this.f3279d.put(broadcastReceiver, arrayList);
            }
            arrayList.add(cVar);
            for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                String action = intentFilter.getAction(i2);
                ArrayList<c> arrayList2 = this.f3280e.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList<>(1);
                    this.f3280e.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    public boolean d(Intent intent) {
        int i2;
        String str;
        ArrayList arrayList;
        ArrayList<c> arrayList2;
        String str2;
        synchronized (this.f3279d) {
            String action = intent.getAction();
            String strResolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f3278c.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            boolean z = (intent.getFlags() & 8) != 0;
            if (z) {
                Log.v("LocalBroadcastManager", "Resolving type " + strResolveTypeIfNeeded + " scheme " + scheme + " of intent " + intent);
            }
            ArrayList<c> arrayList3 = this.f3280e.get(intent.getAction());
            if (arrayList3 != null) {
                if (z) {
                    Log.v("LocalBroadcastManager", "Action list: " + arrayList3);
                }
                ArrayList arrayList4 = null;
                int i3 = 0;
                while (i3 < arrayList3.size()) {
                    c cVar = arrayList3.get(i3);
                    if (z) {
                        Log.v("LocalBroadcastManager", "Matching against filter " + cVar.a);
                    }
                    if (cVar.f3285c) {
                        if (z) {
                            Log.v("LocalBroadcastManager", "  Filter's target already added");
                        }
                        i2 = i3;
                        arrayList2 = arrayList3;
                        str = action;
                        str2 = strResolveTypeIfNeeded;
                        arrayList = arrayList4;
                    } else {
                        i2 = i3;
                        str = action;
                        arrayList = arrayList4;
                        arrayList2 = arrayList3;
                        str2 = strResolveTypeIfNeeded;
                        int iMatch = cVar.a.match(action, strResolveTypeIfNeeded, scheme, data, categories, "LocalBroadcastManager");
                        if (iMatch >= 0) {
                            if (z) {
                                Log.v("LocalBroadcastManager", "  Filter matched!  match=0x" + Integer.toHexString(iMatch));
                            }
                            arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                            arrayList4.add(cVar);
                            cVar.f3285c = true;
                            i3 = i2 + 1;
                            action = str;
                            arrayList3 = arrayList2;
                            strResolveTypeIfNeeded = str2;
                        } else if (z) {
                            Log.v("LocalBroadcastManager", "  Filter did not match: " + (iMatch != -4 ? iMatch != -3 ? iMatch != -2 ? iMatch != -1 ? "unknown reason" : "type" : "data" : "action" : "category"));
                        }
                    }
                    arrayList4 = arrayList;
                    i3 = i2 + 1;
                    action = str;
                    arrayList3 = arrayList2;
                    strResolveTypeIfNeeded = str2;
                }
                ArrayList arrayList5 = arrayList4;
                if (arrayList5 != null) {
                    for (int i4 = 0; i4 < arrayList5.size(); i4++) {
                        ((c) arrayList5.get(i4)).f3285c = false;
                    }
                    this.f3281f.add(new b(intent, arrayList5));
                    if (!this.f3282g.hasMessages(1)) {
                        this.f3282g.sendEmptyMessage(1);
                    }
                    return true;
                }
            }
            return false;
        }
    }

    public void e(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f3279d) {
            ArrayList<c> arrayListRemove = this.f3279d.remove(broadcastReceiver);
            if (arrayListRemove == null) {
                return;
            }
            for (int size = arrayListRemove.size() - 1; size >= 0; size--) {
                c cVar = arrayListRemove.get(size);
                cVar.f3286d = true;
                for (int i2 = 0; i2 < cVar.a.countActions(); i2++) {
                    String action = cVar.a.getAction(i2);
                    ArrayList<c> arrayList = this.f3280e.get(action);
                    if (arrayList != null) {
                        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                            c cVar2 = arrayList.get(size2);
                            if (cVar2.f3284b == broadcastReceiver) {
                                cVar2.f3286d = true;
                                arrayList.remove(size2);
                            }
                        }
                        if (arrayList.size() <= 0) {
                            this.f3280e.remove(action);
                        }
                    }
                }
            }
        }
    }
}