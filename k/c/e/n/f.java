package k.c.e.n;

import java.util.ArrayList;
import java.util.List;
import k.c.f.m;

/* compiled from: TileSourceFactory.java */
/* loaded from: classes3.dex */
public class f {
    public static final e a;

    /* renamed from: b, reason: collision with root package name */
    public static final e f16691b;

    /* renamed from: c, reason: collision with root package name */
    public static final e f16692c;

    /* renamed from: d, reason: collision with root package name */
    public static final e f16693d;

    /* renamed from: e, reason: collision with root package name */
    public static final e f16694e;

    /* renamed from: f, reason: collision with root package name */
    public static final e f16695f;

    /* renamed from: g, reason: collision with root package name */
    public static final e f16696g;

    /* renamed from: h, reason: collision with root package name */
    public static final e f16697h;

    /* renamed from: i, reason: collision with root package name */
    public static final e f16698i;

    /* renamed from: j, reason: collision with root package name */
    public static final e f16699j;

    /* renamed from: k, reason: collision with root package name */
    public static final e f16700k;

    /* renamed from: l, reason: collision with root package name */
    public static final e f16701l;

    /* renamed from: m, reason: collision with root package name */
    public static final e f16702m;
    public static final e n;
    public static final e o;
    public static final e p;
    public static final e q;
    private static List<d> r;

    /* compiled from: TileSourceFactory.java */
    static class a extends e {
        a(String str, int i2, int i3, int i4, String str2, String[] strArr, String str3) {
            super(str, i2, i3, i4, str2, strArr, str3);
        }

        @Override // k.c.e.n.e
        public String m(long j2) {
            return k() + m.e(j2) + "/" + m.d(j2) + "/" + m.c(j2);
        }
    }

    /* compiled from: TileSourceFactory.java */
    static class b extends e {
        b(String str, int i2, int i3, int i4, String str2, String[] strArr, String str3) {
            super(str, i2, i3, i4, str2, strArr, str3);
        }

        @Override // k.c.e.n.e
        public String m(long j2) {
            return k() + m.e(j2) + "/" + m.d(j2) + "/" + m.c(j2);
        }
    }

    static {
        h hVar = new h("Mapnik", 0, 19, 256, ".png", new String[]{"https://a.tile.openstreetmap.org/", "https://b.tile.openstreetmap.org/", "https://c.tile.openstreetmap.org/"}, "© OpenStreetMap contributors", new g(2, 15));
        a = hVar;
        h hVar2 = new h("Wikimedia", 1, 19, 256, ".png", new String[]{"https://maps.wikimedia.org/osm-intl/"}, "Wikimedia maps | Map data © OpenStreetMap contributors", new g(1, 15));
        f16691b = hVar2;
        h hVar3 = new h("OSMPublicTransport", 0, 17, 256, ".png", new String[]{"http://openptmap.org/tiles/"}, "© OpenStreetMap contributors");
        f16692c = hVar3;
        f16693d = hVar;
        f16694e = new k.c.e.n.b("CloudMadeStandardTiles", 0, 18, 256, ".png", new String[]{"http://a.tile.cloudmade.com/%s/%d/%d/%d/%d/%d%s?token=%s", "http://b.tile.cloudmade.com/%s/%d/%d/%d/%d/%d%s?token=%s", "http://c.tile.cloudmade.com/%s/%d/%d/%d/%d/%d%s?token=%s"});
        f16695f = new k.c.e.n.b("CloudMadeSmallTiles", 0, 21, 64, ".png", new String[]{"http://a.tile.cloudmade.com/%s/%d/%d/%d/%d/%d%s?token=%s", "http://b.tile.cloudmade.com/%s/%d/%d/%d/%d/%d%s?token=%s", "http://c.tile.cloudmade.com/%s/%d/%d/%d/%d/%d%s?token=%s"});
        f16696g = new h("Fiets", 3, 18, 256, ".png", new String[]{"https://overlay.openstreetmap.nl/openfietskaart-overlay/"}, "© OpenStreetMap contributors");
        f16697h = new h("BaseNL", 0, 18, 256, ".png", new String[]{"https://overlay.openstreetmap.nl/basemap/"});
        f16698i = new h("RoadsNL", 0, 18, 256, ".png", new String[]{"https://overlay.openstreetmap.nl/roads/"}, "© OpenStreetMap contributors");
        h hVar4 = new h("HikeBikeMap", 0, 18, 256, ".png", new String[]{"https://tiles.wmflabs.org/hikebike/"});
        f16699j = hVar4;
        f16700k = new h("OpenSeaMap", 3, 18, 256, ".png", new String[]{"https://tiles.openseamap.org/seamark/"}, "OpenSeaMap");
        a aVar = new a("USGS National Map Topo", 0, 15, 256, "", new String[]{"https://basemap.nationalmap.gov/arcgis/rest/services/USGSTopo/MapServer/tile/"}, "USGS");
        f16701l = aVar;
        b bVar = new b("USGS National Map Sat", 0, 15, 256, "", new String[]{"https://basemap.nationalmap.gov/arcgis/rest/services/USGSImageryTopo/MapServer/tile/"}, "USGS");
        f16702m = bVar;
        h hVar5 = new h("ChartbundleWAC", 4, 12, 256, ".png?type=google", new String[]{"https://wms.chartbundle.com/tms/v1.0/wac/"}, "chartbundle.com");
        n = hVar5;
        h hVar6 = new h("ChartbundleENRH", 4, 12, 256, ".png?type=google", new String[]{"https://wms.chartbundle.com/tms/v1.0/enrh/", "chartbundle.com"});
        o = hVar6;
        h hVar7 = new h("ChartbundleENRL", 4, 12, 256, ".png?type=google", new String[]{"https://wms.chartbundle.com/tms/v1.0/enrl/", "chartbundle.com"});
        p = hVar7;
        h hVar8 = new h("OpenTopoMap", 0, 17, 256, ".png", new String[]{"https://a.tile.opentopomap.org/", "https://b.tile.opentopomap.org/", "https://c.tile.opentopomap.org/"}, "Kartendaten: © OpenStreetMap-Mitwirkende, SRTM | Kartendarstellung: © OpenTopoMap (CC-BY-SA)");
        q = hVar8;
        ArrayList arrayList = new ArrayList();
        r = arrayList;
        arrayList.add(hVar);
        r.add(hVar2);
        r.add(hVar3);
        r.add(hVar4);
        r.add(aVar);
        r.add(bVar);
        r.add(hVar5);
        r.add(hVar6);
        r.add(hVar7);
        r.add(hVar8);
    }

    public static d a(String str) {
        for (d dVar : r) {
            if (dVar.name().equals(str)) {
                return dVar;
            }
        }
        throw new IllegalArgumentException("No such tile source: " + str);
    }

    public static List<d> b() {
        return r;
    }
}