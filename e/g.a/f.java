package e.g.a;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import e.b.a.a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

/* compiled from: IabHelper.java */
/* loaded from: classes.dex */
public class f {
    boolean a = false;

    /* renamed from: b, reason: collision with root package name */
    String f15659b = "IabHelper";

    /* renamed from: c, reason: collision with root package name */
    boolean f15660c = false;

    /* renamed from: d, reason: collision with root package name */
    boolean f15661d = false;

    /* renamed from: e, reason: collision with root package name */
    boolean f15662e = false;

    /* renamed from: f, reason: collision with root package name */
    boolean f15663f = false;

    /* renamed from: g, reason: collision with root package name */
    boolean f15664g = false;

    /* renamed from: h, reason: collision with root package name */
    boolean f15665h = false;

    /* renamed from: i, reason: collision with root package name */
    private final Object f15666i = new Object();

    /* renamed from: j, reason: collision with root package name */
    String f15667j = "";

    /* renamed from: k, reason: collision with root package name */
    Context f15668k;

    /* renamed from: l, reason: collision with root package name */
    e.b.a.a.a f15669l;

    /* renamed from: m, reason: collision with root package name */
    ServiceConnection f15670m;
    int n;
    String o;
    String p;
    d q;

    /* compiled from: IabHelper.java */
    class a implements ServiceConnection {
        final /* synthetic */ e a;

        a(e eVar) {
            this.a = eVar;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            f fVar = f.this;
            if (fVar.f15661d) {
                return;
            }
            fVar.m("Billing service connected.");
            f.this.f15669l = a.AbstractBinderC0171a.R(iBinder);
            String packageName = f.this.f15668k.getPackageName();
            try {
                f.this.m("Checking for in-app billing 3 support.");
                int iY3 = f.this.f15669l.Y3(3, packageName, "inapp");
                if (iY3 != 0) {
                    e eVar = this.a;
                    if (eVar != null) {
                        eVar.a(new g(iY3, "Error checking for billing v3 support."));
                    }
                    f fVar2 = f.this;
                    fVar2.f15663f = false;
                    fVar2.f15664g = false;
                    return;
                }
                f.this.m("In-app billing version 3 supported for " + packageName);
                if (f.this.f15669l.Y3(5, packageName, "subs") == 0) {
                    f.this.m("Subscription re-signup AVAILABLE.");
                    f.this.f15664g = true;
                } else {
                    f.this.m("Subscription re-signup not available.");
                    f.this.f15664g = false;
                }
                f fVar3 = f.this;
                if (fVar3.f15664g) {
                    fVar3.f15663f = true;
                } else {
                    int iY32 = fVar3.f15669l.Y3(3, packageName, "subs");
                    if (iY32 == 0) {
                        f.this.m("Subscriptions AVAILABLE.");
                        f.this.f15663f = true;
                    } else {
                        f.this.m("Subscriptions NOT AVAILABLE. Response: " + iY32);
                        f fVar4 = f.this;
                        fVar4.f15663f = false;
                        fVar4.f15664g = false;
                    }
                }
                f.this.f15660c = true;
                e eVar2 = this.a;
                if (eVar2 != null) {
                    eVar2.a(new g(0, "Setup successful."));
                }
            } catch (RemoteException e2) {
                e eVar3 = this.a;
                if (eVar3 != null) {
                    eVar3.a(new g(-1001, "RemoteException while setting up in-app billing."));
                }
                e2.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            f.this.m("Billing service disconnected.");
            f.this.f15669l = null;
        }
    }

    /* compiled from: IabHelper.java */
    class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f15672e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ List f15673f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f15674g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ InterfaceC0193f f15675h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Handler f15676i;

        /* compiled from: IabHelper.java */
        class a implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ g f15678e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ h f15679f;

            a(g gVar, h hVar) {
                this.f15678e = gVar;
                this.f15679f = hVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f15675h.a(this.f15678e, this.f15679f);
            }
        }

        b(boolean z, List list, List list2, InterfaceC0193f interfaceC0193f, Handler handler) {
            this.f15672e = z;
            this.f15673f = list;
            this.f15674g = list2;
            this.f15675h = interfaceC0193f;
            this.f15676i = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVarP;
            g gVar = new g(0, "Inventory refresh successful.");
            try {
                hVarP = f.this.p(this.f15672e, this.f15673f, this.f15674g);
            } catch (e.g.a.e e2) {
                gVar = e2.a();
                hVarP = null;
            }
            f.this.f();
            if (f.this.f15661d || this.f15675h == null) {
                return;
            }
            this.f15676i.post(new a(gVar, hVarP));
        }
    }

    /* compiled from: IabHelper.java */
    public static class c extends Exception {
        public c(String str) {
            super(str);
        }
    }

    /* compiled from: IabHelper.java */
    public interface d {
        void b(g gVar, i iVar);
    }

    /* compiled from: IabHelper.java */
    public interface e {
        void a(g gVar);
    }

    /* compiled from: IabHelper.java */
    /* renamed from: e.g.a.f$f, reason: collision with other inner class name */
    public interface InterfaceC0193f {
        void a(g gVar, h hVar);
    }

    public f(Context context, String str) {
        this.p = null;
        this.f15668k = context.getApplicationContext();
        this.p = str;
        m("IAB helper created.");
    }

    private void a() {
        if (this.f15661d) {
            throw new IllegalStateException("IabHelper was disposed of, so it cannot be used.");
        }
    }

    public static String j(int i2) {
        String[] strArrSplit = "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned".split("/");
        String[] strArrSplit2 = "0:OK/-1001:Remote exception during initialization/-1002:Bad response received/-1003:Purchase signature verification failed/-1004:Send intent failed/-1005:User cancelled/-1006:Unknown purchase response/-1007:Missing token/-1008:Unknown error/-1009:Subscriptions not available/-1010:Invalid consumption attempt".split("/");
        if (i2 > -1000) {
            if (i2 >= 0 && i2 < strArrSplit.length) {
                return strArrSplit[i2];
            }
            return String.valueOf(i2) + ":Unknown";
        }
        int i3 = (-1000) - i2;
        if (i3 >= 0 && i3 < strArrSplit2.length) {
            return strArrSplit2[i3];
        }
        return String.valueOf(i2) + ":Unknown IAB Helper Error";
    }

    void b(String str) {
        if (this.f15660c) {
            return;
        }
        n("Illegal state for operation (" + str + "): IAB helper is not set up.");
        throw new IllegalStateException("IAB helper is not set up. Can't perform operation: " + str);
    }

    public void c() {
        synchronized (this.f15666i) {
            if (this.f15665h) {
                throw new c("Can't dispose because an async operation (" + this.f15667j + ") is in progress.");
            }
        }
        m("Disposing.");
        this.f15660c = false;
        if (this.f15670m != null && this.f15669l != null) {
            m("Unbinding from service.");
            Context context = this.f15668k;
            if (context != null) {
                context.unbindService(this.f15670m);
            }
        }
        this.f15661d = true;
        this.f15668k = null;
        this.f15670m = null;
        this.f15669l = null;
        this.q = null;
    }

    public void d() {
        synchronized (this.f15666i) {
            if (this.f15665h) {
                m("Will dispose after async operation finishes.");
                this.f15662e = true;
            } else {
                try {
                    c();
                } catch (c unused) {
                }
            }
        }
    }

    public void e(boolean z) {
        a();
        this.a = z;
    }

    void f() {
        synchronized (this.f15666i) {
            m("Ending async operation: " + this.f15667j);
            this.f15667j = "";
            this.f15665h = false;
            if (this.f15662e) {
                try {
                    c();
                } catch (c unused) {
                }
            }
        }
    }

    void g(String str) {
        synchronized (this.f15666i) {
            if (this.f15665h) {
                throw new c("Can't start async operation (" + str + ") because another async operation (" + this.f15667j + ") is in progress.");
            }
            this.f15667j = str;
            this.f15665h = true;
            m("Starting async operation: " + str);
        }
    }

    int h(Bundle bundle) {
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            m("Bundle with null response code, assuming OK (known issue)");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Long) {
            return (int) ((Long) obj).longValue();
        }
        n("Unexpected type for bundle response code.");
        n(obj.getClass().getName());
        throw new RuntimeException("Unexpected type for bundle response code: " + obj.getClass().getName());
    }

    int i(Intent intent) {
        Object obj = intent.getExtras().get("RESPONSE_CODE");
        if (obj == null) {
            n("Intent with no response code, assuming OK (known issue)");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (obj instanceof Long) {
            return (int) ((Long) obj).longValue();
        }
        n("Unexpected type for intent response code.");
        n(obj.getClass().getName());
        throw new RuntimeException("Unexpected type for intent response code: " + obj.getClass().getName());
    }

    public boolean k(int i2, int i3, Intent intent) {
        if (i2 != this.n) {
            return false;
        }
        a();
        b("handleActivityResult");
        f();
        if (intent == null) {
            n("Null data in IAB activity result.");
            g gVar = new g(-1002, "Null data in IAB result");
            d dVar = this.q;
            if (dVar != null) {
                dVar.b(gVar, null);
            }
            return true;
        }
        int i4 = i(intent);
        String stringExtra = intent.getStringExtra("INAPP_PURCHASE_DATA");
        String stringExtra2 = intent.getStringExtra("INAPP_DATA_SIGNATURE");
        if (i3 == -1 && i4 == 0) {
            m("Successful resultcode from purchase activity.");
            m("Purchase data: " + stringExtra);
            m("Data signature: " + stringExtra2);
            m("Extras: " + intent.getExtras());
            m("Expected item type: " + this.o);
            if (stringExtra == null || stringExtra2 == null) {
                n("BUG: either purchaseData or dataSignature is null.");
                m("Extras: " + intent.getExtras().toString());
                g gVar2 = new g(-1008, "IAB returned null purchaseData or dataSignature");
                d dVar2 = this.q;
                if (dVar2 != null) {
                    dVar2.b(gVar2, null);
                }
                return true;
            }
            try {
                i iVar = new i(this.o, stringExtra, stringExtra2);
                String strC = iVar.c();
                if (!j.c(this.p, stringExtra, stringExtra2)) {
                    n("Purchase signature verification FAILED for sku " + strC);
                    g gVar3 = new g(-1003, "Signature verification failed for sku " + strC);
                    d dVar3 = this.q;
                    if (dVar3 != null) {
                        dVar3.b(gVar3, iVar);
                    }
                    return true;
                }
                m("Purchase signature successfully verified.");
                d dVar4 = this.q;
                if (dVar4 != null) {
                    dVar4.b(new g(0, "Success"), iVar);
                }
            } catch (JSONException e2) {
                n("Failed to parse purchase data.");
                e2.printStackTrace();
                g gVar4 = new g(-1002, "Failed to parse purchase data.");
                d dVar5 = this.q;
                if (dVar5 != null) {
                    dVar5.b(gVar4, null);
                }
                return true;
            }
        } else if (i3 == -1) {
            m("Result code was OK but in-app billing response was not OK: " + j(i4));
            if (this.q != null) {
                this.q.b(new g(i4, "Problem purchashing item."), null);
            }
        } else if (i3 == 0) {
            m("Purchase canceled - Response: " + j(i4));
            g gVar5 = new g(-1005, "User canceled.");
            d dVar6 = this.q;
            if (dVar6 != null) {
                dVar6.b(gVar5, null);
            }
        } else {
            n("Purchase failed. Result code: " + Integer.toString(i3) + ". Response: " + j(i4));
            g gVar6 = new g(-1006, "Unknown purchase response.");
            d dVar7 = this.q;
            if (dVar7 != null) {
                dVar7.b(gVar6, null);
            }
        }
        return true;
    }

    public void l(Activity activity, String str, String str2, List<String> list, int i2, d dVar, String str3) throws IntentSender.SendIntentException {
        Bundle bundleU1;
        a();
        b("launchPurchaseFlow");
        g("launchPurchaseFlow");
        if (str2.equals("subs") && !this.f15663f) {
            g gVar = new g(-1009, "Subscriptions are not available.");
            f();
            if (dVar != null) {
                dVar.b(gVar, null);
                return;
            }
            return;
        }
        try {
            m("Constructing buy intent for " + str + ", item type: " + str2);
            if (list == null || list.isEmpty()) {
                e.b.a.a.a aVar = this.f15669l;
                if (aVar == null) {
                    g gVar2 = new g(-1008, "Service is null");
                    f();
                    if (dVar != null) {
                        dVar.b(gVar2, null);
                        return;
                    }
                    return;
                }
                bundleU1 = aVar.u1(3, this.f15668k.getPackageName(), str, str2, str3);
            } else {
                if (!this.f15664g) {
                    g gVar3 = new g(-1011, "Subscription updates are not available.");
                    f();
                    if (dVar != null) {
                        dVar.b(gVar3, null);
                        return;
                    }
                    return;
                }
                bundleU1 = this.f15669l.x3(5, this.f15668k.getPackageName(), list, str, str2, str3);
            }
            int iH = h(bundleU1);
            if (iH != 0) {
                n("Unable to buy item, Error response: " + j(iH));
                f();
                g gVar4 = new g(iH, "Unable to buy item");
                if (dVar != null) {
                    dVar.b(gVar4, null);
                    return;
                }
                return;
            }
            PendingIntent pendingIntent = (PendingIntent) bundleU1.getParcelable("BUY_INTENT");
            m("Launching buy intent for " + str + ". Request code: " + i2);
            this.n = i2;
            this.q = dVar;
            this.o = str2;
            IntentSender intentSender = pendingIntent.getIntentSender();
            Intent intent = new Intent();
            Integer num = 0;
            int iIntValue = num.intValue();
            Integer num2 = 0;
            Integer num3 = 0;
            activity.startIntentSenderForResult(intentSender, i2, intent, iIntValue, num2.intValue(), num3.intValue());
        } catch (IntentSender.SendIntentException e2) {
            n("SendIntentException while launching purchase flow for sku " + str);
            e2.printStackTrace();
            f();
            g gVar5 = new g(-1004, "Failed to send intent.");
            if (dVar != null) {
                dVar.b(gVar5, null);
            }
        } catch (RemoteException e3) {
            n("RemoteException while launching purchase flow for sku " + str);
            e3.printStackTrace();
            f();
            g gVar6 = new g(-1001, "Remote exception while starting purchase flow");
            if (dVar != null) {
                dVar.b(gVar6, null);
            }
        }
    }

    void m(String str) {
        if (this.a) {
            Log.d(this.f15659b, str);
        }
    }

    void n(String str) {
        Log.e(this.f15659b, "In-app billing error: " + str);
    }

    void o(String str) {
        Log.w(this.f15659b, "In-app billing warning: " + str);
    }

    public h p(boolean z, List<String> list, List<String> list2) throws e.g.a.e {
        int iS;
        int iS2;
        a();
        b("queryInventory");
        try {
            h hVar = new h();
            int iR = r(hVar, "inapp");
            if (iR != 0) {
                throw new e.g.a.e(iR, "Error refreshing inventory (querying owned items).");
            }
            if (z && (iS2 = s("inapp", hVar, list)) != 0) {
                throw new e.g.a.e(iS2, "Error refreshing inventory (querying prices of items).");
            }
            if (this.f15663f) {
                int iR2 = r(hVar, "subs");
                if (iR2 != 0) {
                    throw new e.g.a.e(iR2, "Error refreshing inventory (querying owned subscriptions).");
                }
                if (z && (iS = s("subs", hVar, list2)) != 0) {
                    throw new e.g.a.e(iS, "Error refreshing inventory (querying prices of subscriptions).");
                }
            }
            return hVar;
        } catch (RemoteException e2) {
            throw new e.g.a.e(-1001, "Remote exception while refreshing inventory.", e2);
        } catch (JSONException e3) {
            throw new e.g.a.e(-1002, "Error parsing JSON response while refreshing inventory.", e3);
        }
    }

    public void q(boolean z, List<String> list, List<String> list2, InterfaceC0193f interfaceC0193f) {
        Handler handler = new Handler();
        a();
        b("queryInventory");
        g("refresh inventory");
        new Thread(new b(z, list, list2, interfaceC0193f, handler)).start();
    }

    int r(h hVar, String str) {
        m("Querying owned items, item type: " + str);
        m("Package name: " + this.f15668k.getPackageName());
        String string = null;
        boolean z = false;
        while (this.f15669l != null) {
            m("Calling getPurchases with continuation token: " + string);
            Bundle bundleF2 = this.f15669l.f2(3, this.f15668k.getPackageName(), str, string);
            int iH = h(bundleF2);
            m("Owned items response: " + String.valueOf(iH));
            if (iH != 0) {
                m("getPurchases() failed: " + j(iH));
                return iH;
            }
            if (!bundleF2.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundleF2.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundleF2.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                n("Bundle returned from getPurchases() doesn't contain required fields.");
                return -1002;
            }
            ArrayList<String> stringArrayList = bundleF2.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
            ArrayList<String> stringArrayList2 = bundleF2.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
            ArrayList<String> stringArrayList3 = bundleF2.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
            for (int i2 = 0; i2 < stringArrayList2.size(); i2++) {
                String str2 = stringArrayList2.get(i2);
                String str3 = stringArrayList3.get(i2);
                String str4 = stringArrayList.get(i2);
                if (j.c(this.p, str2, str3)) {
                    m("Sku is owned: " + str4);
                    i iVar = new i(str, str2, str3);
                    if (TextUtils.isEmpty(iVar.d())) {
                        o("BUG: empty/null token!");
                        m("Purchase data: " + str2);
                    }
                    hVar.a(iVar);
                } else {
                    o("Purchase signature verification **FAILED**. Not adding item.");
                    m("   Purchase data: " + str2);
                    m("   Signature: " + str3);
                    z = true;
                }
            }
            string = bundleF2.getString("INAPP_CONTINUATION_TOKEN");
            m("Continuation token: " + string);
            if (TextUtils.isEmpty(string)) {
                return z ? -1003 : 0;
            }
        }
        n("Service is null");
        return -1008;
    }

    int s(String str, h hVar, List<String> list) {
        m("Querying SKU details.");
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(hVar.c(str));
        if (list != null) {
            for (String str2 : list) {
                if (!arrayList.contains(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        if (arrayList.size() == 0) {
            m("queryPrices: nothing to do because there are no SKUs.");
            return 0;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size() / 20;
        int size2 = arrayList.size() % 20;
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList arrayList3 = new ArrayList();
            int i3 = i2 * 20;
            Iterator it = arrayList.subList(i3, i3 + 20).iterator();
            while (it.hasNext()) {
                arrayList3.add((String) it.next());
            }
            arrayList2.add(arrayList3);
        }
        if (size2 != 0) {
            ArrayList arrayList4 = new ArrayList();
            int i4 = size * 20;
            Iterator it2 = arrayList.subList(i4, size2 + i4).iterator();
            while (it2.hasNext()) {
                arrayList4.add((String) it2.next());
            }
            arrayList2.add(arrayList4);
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            ArrayList<String> arrayList5 = (ArrayList) it3.next();
            if (this.f15669l == null) {
                n("Service is null");
                return -1008;
            }
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("ITEM_ID_LIST", arrayList5);
            Bundle bundleZ1 = this.f15669l.Z1(3, this.f15668k.getPackageName(), str, bundle);
            if (!bundleZ1.containsKey("DETAILS_LIST")) {
                int iH = h(bundleZ1);
                if (iH == 0) {
                    n("getSkuDetails() returned a bundle with neither an error nor a detail list.");
                    return -1002;
                }
                m("getSkuDetails() failed: " + j(iH));
                return iH;
            }
            Iterator<String> it4 = bundleZ1.getStringArrayList("DETAILS_LIST").iterator();
            while (it4.hasNext()) {
                k kVar = new k(str, it4.next());
                m("Got sku details: " + kVar);
                hVar.b(kVar);
            }
        }
        return 0;
    }

    public void t(e eVar) {
        a();
        if (this.f15660c) {
            throw new IllegalStateException("IAB helper is already set up.");
        }
        m("Starting in-app billing setup.");
        this.f15670m = new a(eVar);
        Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        List<ResolveInfo> listQueryIntentServices = this.f15668k.getPackageManager().queryIntentServices(intent, 0);
        if (listQueryIntentServices != null && !listQueryIntentServices.isEmpty()) {
            this.f15668k.bindService(intent, this.f15670m, 1);
        } else if (eVar != null) {
            eVar.a(new g(3, "Billing service unavailable on device."));
        }
    }

    public boolean u() {
        a();
        return this.f15663f;
    }
}