package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.i;
import androidx.core.graphics.drawable.IconCompat;
import com.google.android.gms.ads.AdRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: NotificationCompatBuilder.java */
/* loaded from: classes.dex */
class j implements h {
    private final Notification.Builder a;

    /* renamed from: b, reason: collision with root package name */
    private final i.d f869b;

    /* renamed from: c, reason: collision with root package name */
    private RemoteViews f870c;

    /* renamed from: d, reason: collision with root package name */
    private RemoteViews f871d;

    /* renamed from: e, reason: collision with root package name */
    private final List<Bundle> f872e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private final Bundle f873f = new Bundle();

    /* renamed from: g, reason: collision with root package name */
    private int f874g;

    /* renamed from: h, reason: collision with root package name */
    private RemoteViews f875h;

    j(i.d dVar) {
        ArrayList<String> arrayList;
        this.f869b = dVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            this.a = new Notification.Builder(dVar.a, dVar.I);
        } else {
            this.a = new Notification.Builder(dVar.a);
        }
        Notification notification = dVar.P;
        this.a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.f860h).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.f856d).setContentText(dVar.f857e).setContentInfo(dVar.f862j).setContentIntent(dVar.f858f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(dVar.f859g, (notification.flags & 128) != 0).setLargeIcon(dVar.f861i).setNumber(dVar.f863k).setProgress(dVar.r, dVar.s, dVar.t);
        if (i2 < 21) {
            this.a.setSound(notification.sound, notification.audioStreamType);
        }
        if (i2 >= 16) {
            this.a.setSubText(dVar.p).setUsesChronometer(dVar.n).setPriority(dVar.f864l);
            Iterator<i.a> it = dVar.f854b.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
            Bundle bundle = dVar.B;
            if (bundle != null) {
                this.f873f.putAll(bundle);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (dVar.x) {
                    this.f873f.putBoolean("android.support.localOnly", true);
                }
                String str = dVar.u;
                if (str != null) {
                    this.f873f.putString("android.support.groupKey", str);
                    if (dVar.v) {
                        this.f873f.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.f873f.putBoolean("android.support.useSideChannel", true);
                    }
                }
                String str2 = dVar.w;
                if (str2 != null) {
                    this.f873f.putString("android.support.sortKey", str2);
                }
            }
            this.f870c = dVar.F;
            this.f871d = dVar.G;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 19) {
            this.a.setShowWhen(dVar.f865m);
            if (i3 < 21 && (arrayList = dVar.R) != null && !arrayList.isEmpty()) {
                Bundle bundle2 = this.f873f;
                ArrayList<String> arrayList2 = dVar.R;
                bundle2.putStringArray("android.people", (String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }
        if (i3 >= 20) {
            this.a.setLocalOnly(dVar.x).setGroup(dVar.u).setGroupSummary(dVar.v).setSortKey(dVar.w);
            this.f874g = dVar.M;
        }
        if (i3 >= 21) {
            this.a.setCategory(dVar.A).setColor(dVar.C).setVisibility(dVar.D).setPublicVersion(dVar.E).setSound(notification.sound, notification.audioAttributes);
            Iterator<String> it2 = dVar.R.iterator();
            while (it2.hasNext()) {
                this.a.addPerson(it2.next());
            }
            this.f875h = dVar.H;
            if (dVar.f855c.size() > 0) {
                Bundle bundle3 = dVar.c().getBundle("android.car.EXTENSIONS");
                bundle3 = bundle3 == null ? new Bundle() : bundle3;
                Bundle bundle4 = new Bundle();
                for (int i4 = 0; i4 < dVar.f855c.size(); i4++) {
                    bundle4.putBundle(Integer.toString(i4), k.b(dVar.f855c.get(i4)));
                }
                bundle3.putBundle("invisible_actions", bundle4);
                dVar.c().putBundle("android.car.EXTENSIONS", bundle3);
                this.f873f.putBundle("android.car.EXTENSIONS", bundle3);
            }
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 24) {
            this.a.setExtras(dVar.B).setRemoteInputHistory(dVar.q);
            RemoteViews remoteViews = dVar.F;
            if (remoteViews != null) {
                this.a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = dVar.G;
            if (remoteViews2 != null) {
                this.a.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = dVar.H;
            if (remoteViews3 != null) {
                this.a.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i5 >= 26) {
            this.a.setBadgeIconType(dVar.J).setShortcutId(dVar.K).setTimeoutAfter(dVar.L).setGroupAlertBehavior(dVar.M);
            if (dVar.z) {
                this.a.setColorized(dVar.y);
            }
            if (!TextUtils.isEmpty(dVar.I)) {
                this.a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i5 >= 29) {
            this.a.setAllowSystemGeneratedContextualActions(dVar.N);
            this.a.setBubbleMetadata(i.c.a(dVar.O));
        }
        if (dVar.Q) {
            if (this.f869b.v) {
                this.f874g = 2;
            } else {
                this.f874g = 1;
            }
            this.a.setVibrate(null);
            this.a.setSound(null);
            int i6 = notification.defaults & (-2);
            notification.defaults = i6;
            int i7 = i6 & (-3);
            notification.defaults = i7;
            this.a.setDefaults(i7);
            if (i5 >= 26) {
                if (TextUtils.isEmpty(this.f869b.u)) {
                    this.a.setGroup("silent");
                }
                this.a.setGroupAlertBehavior(this.f874g);
            }
        }
    }

    private void b(i.a aVar) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 20) {
            if (i2 >= 16) {
                this.f872e.add(k.f(this.a, aVar));
                return;
            }
            return;
        }
        IconCompat iconCompatE = aVar.e();
        Notification.Action.Builder builder = i2 >= 23 ? new Notification.Action.Builder(iconCompatE != null ? iconCompatE.n() : null, aVar.i(), aVar.a()) : new Notification.Action.Builder(iconCompatE != null ? iconCompatE.c() : 0, aVar.i(), aVar.a());
        if (aVar.f() != null) {
            for (RemoteInput remoteInput : m.b(aVar.f())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = aVar.d() != null ? new Bundle(aVar.d()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 24) {
            builder.setAllowGeneratedReplies(aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.g());
        if (i3 >= 28) {
            builder.setSemanticAction(aVar.g());
        }
        if (i3 >= 29) {
            builder.setContextual(aVar.j());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.h());
        builder.addExtras(bundle);
        this.a.addAction(builder.build());
    }

    private void e(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i2 = notification.defaults & (-2);
        notification.defaults = i2;
        notification.defaults = i2 & (-3);
    }

    @Override // androidx.core.app.h
    public Notification.Builder a() {
        return this.a;
    }

    public Notification c() {
        Bundle bundleA;
        RemoteViews remoteViewsE;
        RemoteViews remoteViewsC;
        i.e eVar = this.f869b.o;
        if (eVar != null) {
            eVar.b(this);
        }
        RemoteViews remoteViewsD = eVar != null ? eVar.d(this) : null;
        Notification notificationD = d();
        if (remoteViewsD != null) {
            notificationD.contentView = remoteViewsD;
        } else {
            RemoteViews remoteViews = this.f869b.F;
            if (remoteViews != null) {
                notificationD.contentView = remoteViews;
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 16 && eVar != null && (remoteViewsC = eVar.c(this)) != null) {
            notificationD.bigContentView = remoteViewsC;
        }
        if (i2 >= 21 && eVar != null && (remoteViewsE = this.f869b.o.e(this)) != null) {
            notificationD.headsUpContentView = remoteViewsE;
        }
        if (i2 >= 16 && eVar != null && (bundleA = i.a(notificationD)) != null) {
            eVar.a(bundleA);
        }
        return notificationD;
    }

    protected Notification d() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            return this.a.build();
        }
        if (i2 >= 24) {
            Notification notificationBuild = this.a.build();
            if (this.f874g != 0) {
                if (notificationBuild.getGroup() != null && (notificationBuild.flags & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 && this.f874g == 2) {
                    e(notificationBuild);
                }
                if (notificationBuild.getGroup() != null && (notificationBuild.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 && this.f874g == 1) {
                    e(notificationBuild);
                }
            }
            return notificationBuild;
        }
        if (i2 >= 21) {
            this.a.setExtras(this.f873f);
            Notification notificationBuild2 = this.a.build();
            RemoteViews remoteViews = this.f870c;
            if (remoteViews != null) {
                notificationBuild2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f871d;
            if (remoteViews2 != null) {
                notificationBuild2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f875h;
            if (remoteViews3 != null) {
                notificationBuild2.headsUpContentView = remoteViews3;
            }
            if (this.f874g != 0) {
                if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 && this.f874g == 2) {
                    e(notificationBuild2);
                }
                if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 && this.f874g == 1) {
                    e(notificationBuild2);
                }
            }
            return notificationBuild2;
        }
        if (i2 >= 20) {
            this.a.setExtras(this.f873f);
            Notification notificationBuild3 = this.a.build();
            RemoteViews remoteViews4 = this.f870c;
            if (remoteViews4 != null) {
                notificationBuild3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f871d;
            if (remoteViews5 != null) {
                notificationBuild3.bigContentView = remoteViews5;
            }
            if (this.f874g != 0) {
                if (notificationBuild3.getGroup() != null && (notificationBuild3.flags & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 && this.f874g == 2) {
                    e(notificationBuild3);
                }
                if (notificationBuild3.getGroup() != null && (notificationBuild3.flags & AdRequest.MAX_CONTENT_URL_LENGTH) == 0 && this.f874g == 1) {
                    e(notificationBuild3);
                }
            }
            return notificationBuild3;
        }
        if (i2 >= 19) {
            SparseArray<Bundle> sparseArrayA = k.a(this.f872e);
            if (sparseArrayA != null) {
                this.f873f.putSparseParcelableArray("android.support.actionExtras", sparseArrayA);
            }
            this.a.setExtras(this.f873f);
            Notification notificationBuild4 = this.a.build();
            RemoteViews remoteViews6 = this.f870c;
            if (remoteViews6 != null) {
                notificationBuild4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f871d;
            if (remoteViews7 != null) {
                notificationBuild4.bigContentView = remoteViews7;
            }
            return notificationBuild4;
        }
        if (i2 < 16) {
            return this.a.getNotification();
        }
        Notification notificationBuild5 = this.a.build();
        Bundle bundleA = i.a(notificationBuild5);
        Bundle bundle = new Bundle(this.f873f);
        for (String str : this.f873f.keySet()) {
            if (bundleA.containsKey(str)) {
                bundle.remove(str);
            }
        }
        bundleA.putAll(bundle);
        SparseArray<Bundle> sparseArrayA2 = k.a(this.f872e);
        if (sparseArrayA2 != null) {
            i.a(notificationBuild5).putSparseParcelableArray("android.support.actionExtras", sparseArrayA2);
        }
        RemoteViews remoteViews8 = this.f870c;
        if (remoteViews8 != null) {
            notificationBuild5.contentView = remoteViews8;
        }
        RemoteViews remoteViews9 = this.f871d;
        if (remoteViews9 != null) {
            notificationBuild5.bigContentView = remoteViews9;
        }
        return notificationBuild5;
    }
}