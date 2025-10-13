package com.parizene.netmonitor.m0.d0;

import android.os.Build;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityNr;
import android.telephony.CellIdentityTdscdma;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoNr;
import android.telephony.CellInfoTdscdma;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrength;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthNr;
import android.telephony.CellSignalStrengthTdscdma;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.NeighboringCellInfo;
import android.telephony.ServiceState;
import android.telephony.SignalStrength;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import com.parizene.netmonitor.m0.a0.f;
import com.parizene.netmonitor.m0.a0.g;
import com.parizene.netmonitor.m0.a0.h;
import com.parizene.netmonitor.m0.a0.i;
import com.parizene.netmonitor.m0.a0.k;
import com.parizene.netmonitor.m0.a0.l;
import com.parizene.netmonitor.m0.d0.f.a0;
import com.parizene.netmonitor.m0.d0.f.j;
import com.parizene.netmonitor.m0.d0.f.m;
import com.parizene.netmonitor.m0.d0.f.n;
import com.parizene.netmonitor.m0.d0.f.o;
import com.parizene.netmonitor.m0.d0.f.p;
import com.parizene.netmonitor.m0.d0.f.q;
import com.parizene.netmonitor.m0.d0.f.r;
import com.parizene.netmonitor.m0.d0.f.s;
import com.parizene.netmonitor.m0.d0.f.t;
import com.parizene.netmonitor.m0.d0.f.u;
import com.parizene.netmonitor.m0.d0.f.v;
import com.parizene.netmonitor.m0.d0.f.x;
import com.parizene.netmonitor.m0.d0.f.y;
import com.parizene.netmonitor.m0.d0.f.z;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CellMapper.java */
/* loaded from: classes.dex */
public class a {
    private final l a;

    /* renamed from: b, reason: collision with root package name */
    private final f f13358b;

    /* renamed from: c, reason: collision with root package name */
    private final com.parizene.netmonitor.m0.a0.a f13359c;

    /* renamed from: d, reason: collision with root package name */
    private final com.parizene.netmonitor.m0.a0.b f13360d;

    /* renamed from: e, reason: collision with root package name */
    private final com.parizene.netmonitor.m0.a0.c f13361e;

    /* renamed from: f, reason: collision with root package name */
    private final com.parizene.netmonitor.m0.a0.d f13362f;

    /* renamed from: g, reason: collision with root package name */
    private final com.parizene.netmonitor.m0.a0.e f13363g;

    /* renamed from: h, reason: collision with root package name */
    private final g f13364h;

    /* renamed from: i, reason: collision with root package name */
    private final h f13365i;

    /* renamed from: j, reason: collision with root package name */
    private final i f13366j;

    /* renamed from: k, reason: collision with root package name */
    private final k f13367k;

    public a(f fVar, com.parizene.netmonitor.m0.a0.a aVar, com.parizene.netmonitor.m0.a0.b bVar, com.parizene.netmonitor.m0.a0.c cVar, com.parizene.netmonitor.m0.a0.d dVar, com.parizene.netmonitor.m0.a0.e eVar, g gVar, h hVar, i iVar, k kVar, l lVar) {
        this.a = lVar;
        this.f13358b = fVar;
        this.f13359c = aVar;
        this.f13360d = bVar;
        this.f13361e = cVar;
        this.f13362f = dVar;
        this.f13363g = eVar;
        this.f13364h = gVar;
        this.f13365i = hVar;
        this.f13366j = iVar;
        this.f13367k = kVar;
    }

    private <T extends CellSignalStrength> T a(SignalStrength signalStrength, Class<T> cls) {
        List<T> listB = this.a.b(signalStrength, cls);
        if (listB.isEmpty()) {
            return null;
        }
        return listB.get(0);
    }

    private com.parizene.netmonitor.m0.d0.f.a b(CdmaCellLocation cdmaCellLocation) {
        return new com.parizene.netmonitor.m0.d0.f.a(cdmaCellLocation.getBaseStationId(), cdmaCellLocation.getBaseStationLatitude(), cdmaCellLocation.getBaseStationLongitude(), cdmaCellLocation.getSystemId(), cdmaCellLocation.getNetworkId());
    }

    private com.parizene.netmonitor.m0.d0.f.b c(CellIdentityCdma cellIdentityCdma) {
        return new com.parizene.netmonitor.m0.d0.f.b(null, null, cellIdentityCdma.getNetworkId(), cellIdentityCdma.getSystemId(), cellIdentityCdma.getBasestationId(), cellIdentityCdma.getLatitude(), cellIdentityCdma.getLongitude());
    }

    private com.parizene.netmonitor.m0.d0.f.c d(CellIdentityGsm cellIdentityGsm) {
        return new com.parizene.netmonitor.m0.d0.f.c(this.f13359c.c(cellIdentityGsm), this.f13359c.d(cellIdentityGsm), cellIdentityGsm.getMcc(), cellIdentityGsm.getMnc(), cellIdentityGsm.getLac(), cellIdentityGsm.getCid(), cellIdentityGsm.getPsc(), this.f13359c.a(cellIdentityGsm), this.f13359c.b(cellIdentityGsm));
    }

    private com.parizene.netmonitor.m0.d0.f.d e(CellIdentityLte cellIdentityLte) {
        return new com.parizene.netmonitor.m0.d0.f.d(this.f13360d.d(cellIdentityLte), this.f13360d.e(cellIdentityLte), cellIdentityLte.getMcc(), cellIdentityLte.getMnc(), cellIdentityLte.getCi(), cellIdentityLte.getPci(), cellIdentityLte.getTac(), this.f13360d.c(cellIdentityLte), this.f13360d.b(cellIdentityLte), this.f13360d.a(cellIdentityLte));
    }

    private com.parizene.netmonitor.m0.d0.f.e f(CellIdentityNr cellIdentityNr) {
        return new com.parizene.netmonitor.m0.d0.f.e(cellIdentityNr.getMccString(), cellIdentityNr.getMncString(), cellIdentityNr.getTac(), cellIdentityNr.getNci(), cellIdentityNr.getPci(), cellIdentityNr.getNrarfcn(), this.f13361e.a(cellIdentityNr));
    }

    private com.parizene.netmonitor.m0.d0.f.f g(CellIdentityTdscdma cellIdentityTdscdma) {
        return new com.parizene.netmonitor.m0.d0.f.f(cellIdentityTdscdma.getMccString(), cellIdentityTdscdma.getMncString(), cellIdentityTdscdma.getLac(), cellIdentityTdscdma.getCid(), cellIdentityTdscdma.getCpid(), cellIdentityTdscdma.getUarfcn());
    }

    private com.parizene.netmonitor.m0.d0.f.g h(CellIdentityWcdma cellIdentityWcdma) {
        return new com.parizene.netmonitor.m0.d0.f.g(this.f13363g.a(cellIdentityWcdma), this.f13363g.b(cellIdentityWcdma), cellIdentityWcdma.getMcc(), cellIdentityWcdma.getMnc(), cellIdentityWcdma.getLac(), cellIdentityWcdma.getCid(), cellIdentityWcdma.getPsc(), this.f13363g.c(cellIdentityWcdma));
    }

    private com.parizene.netmonitor.m0.d0.f.i i(CellInfoCdma cellInfoCdma) {
        return new com.parizene.netmonitor.m0.d0.f.i(cellInfoCdma.isRegistered(), this.f13358b.a(cellInfoCdma), this.f13358b.b(cellInfoCdma), c(cellInfoCdma.getCellIdentity()), q(cellInfoCdma.getCellSignalStrength()));
    }

    private j j(CellInfoGsm cellInfoGsm) {
        return new j(cellInfoGsm.isRegistered(), this.f13358b.a(cellInfoGsm), this.f13358b.b(cellInfoGsm), d(cellInfoGsm.getCellIdentity()), r(cellInfoGsm.getCellSignalStrength()));
    }

    private com.parizene.netmonitor.m0.d0.f.k k(CellInfoLte cellInfoLte) {
        return new com.parizene.netmonitor.m0.d0.f.k(cellInfoLte.isRegistered(), this.f13358b.a(cellInfoLte), this.f13358b.b(cellInfoLte), e(cellInfoLte.getCellIdentity()), s(cellInfoLte.getCellSignalStrength()));
    }

    private com.parizene.netmonitor.m0.d0.f.l l(CellInfoNr cellInfoNr) {
        return new com.parizene.netmonitor.m0.d0.f.l(cellInfoNr.isRegistered(), cellInfoNr.getCellConnectionStatus(), this.f13358b.b(cellInfoNr), f((CellIdentityNr) cellInfoNr.getCellIdentity()), t((CellSignalStrengthNr) cellInfoNr.getCellSignalStrength()));
    }

    private m m(CellInfoTdscdma cellInfoTdscdma) {
        return new m(cellInfoTdscdma.isRegistered(), cellInfoTdscdma.getCellConnectionStatus(), this.f13358b.b(cellInfoTdscdma), g(cellInfoTdscdma.getCellIdentity()), u(cellInfoTdscdma.getCellSignalStrength()));
    }

    private n n(CellInfoWcdma cellInfoWcdma) {
        return new n(cellInfoWcdma.isRegistered(), this.f13358b.a(cellInfoWcdma), this.f13358b.b(cellInfoWcdma), h(cellInfoWcdma.getCellIdentity()), v(cellInfoWcdma.getCellSignalStrength()));
    }

    private o o(CellInfo cellInfo) {
        if (cellInfo instanceof CellInfoCdma) {
            return i((CellInfoCdma) cellInfo);
        }
        if (cellInfo instanceof CellInfoGsm) {
            return j((CellInfoGsm) cellInfo);
        }
        if (cellInfo instanceof CellInfoWcdma) {
            return n((CellInfoWcdma) cellInfo);
        }
        if (cellInfo instanceof CellInfoLte) {
            return k((CellInfoLte) cellInfo);
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && (cellInfo instanceof CellInfoTdscdma)) {
            return m((CellInfoTdscdma) cellInfo);
        }
        if (i2 < 29 || !(cellInfo instanceof CellInfoNr)) {
            return null;
        }
        return l((CellInfoNr) cellInfo);
    }

    private q q(CellSignalStrengthCdma cellSignalStrengthCdma) {
        return new q(cellSignalStrengthCdma.getLevel(), cellSignalStrengthCdma.getAsuLevel(), cellSignalStrengthCdma.getDbm(), cellSignalStrengthCdma.getCdmaLevel(), cellSignalStrengthCdma.getCdmaDbm(), cellSignalStrengthCdma.getCdmaEcio(), cellSignalStrengthCdma.getEvdoLevel(), cellSignalStrengthCdma.getEvdoDbm(), cellSignalStrengthCdma.getEvdoEcio(), cellSignalStrengthCdma.getEvdoSnr());
    }

    private r r(CellSignalStrengthGsm cellSignalStrengthGsm) {
        return new r(cellSignalStrengthGsm.getLevel(), cellSignalStrengthGsm.getAsuLevel(), cellSignalStrengthGsm.getDbm(), this.f13364h.c(cellSignalStrengthGsm), this.f13364h.b(cellSignalStrengthGsm), this.f13364h.a(cellSignalStrengthGsm), this.f13364h.d(cellSignalStrengthGsm));
    }

    private s s(CellSignalStrengthLte cellSignalStrengthLte) {
        return new s(cellSignalStrengthLte.getLevel(), cellSignalStrengthLte.getAsuLevel(), cellSignalStrengthLte.getDbm(), this.f13365i.f(cellSignalStrengthLte), this.f13365i.d(cellSignalStrengthLte), this.f13365i.b(cellSignalStrengthLte), this.f13365i.c(cellSignalStrengthLte), this.f13365i.e(cellSignalStrengthLte), this.f13365i.a(cellSignalStrengthLte), cellSignalStrengthLte.getTimingAdvance());
    }

    private t t(CellSignalStrengthNr cellSignalStrengthNr) {
        return new t(cellSignalStrengthNr.getLevel(), cellSignalStrengthNr.getAsuLevel(), cellSignalStrengthNr.getDbm(), cellSignalStrengthNr.getCsiRsrp(), cellSignalStrengthNr.getCsiRsrq(), cellSignalStrengthNr.getCsiSinr(), cellSignalStrengthNr.getSsRsrp(), cellSignalStrengthNr.getSsRsrq(), cellSignalStrengthNr.getSsSinr());
    }

    private u u(CellSignalStrengthTdscdma cellSignalStrengthTdscdma) {
        return new u(cellSignalStrengthTdscdma.getLevel(), cellSignalStrengthTdscdma.getAsuLevel(), cellSignalStrengthTdscdma.getDbm(), cellSignalStrengthTdscdma.getRscp());
    }

    private v v(CellSignalStrengthWcdma cellSignalStrengthWcdma) {
        return new v(cellSignalStrengthWcdma.getLevel(), cellSignalStrengthWcdma.getAsuLevel(), cellSignalStrengthWcdma.getDbm(), this.f13366j.e(cellSignalStrengthWcdma), this.f13366j.d(cellSignalStrengthWcdma), this.f13366j.a(cellSignalStrengthWcdma), this.f13366j.c(cellSignalStrengthWcdma), this.f13366j.b(cellSignalStrengthWcdma));
    }

    private x w(GsmCellLocation gsmCellLocation) {
        return new x(gsmCellLocation.getLac(), gsmCellLocation.getCid(), gsmCellLocation.getPsc());
    }

    private y x(NeighboringCellInfo neighboringCellInfo) {
        return new y(neighboringCellInfo.getRssi(), neighboringCellInfo.getCid(), neighboringCellInfo.getLac(), neighboringCellInfo.getPsc(), neighboringCellInfo.getNetworkType());
    }

    public List<o> A(List<CellInfo> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(o(list.get(i2)));
        }
        return arrayList;
    }

    public List<y> B(List<NeighboringCellInfo> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(x(list.get(i2)));
        }
        return arrayList;
    }

    public p p(CellLocation cellLocation) {
        if (cellLocation instanceof GsmCellLocation) {
            return w((GsmCellLocation) cellLocation);
        }
        if (cellLocation instanceof CdmaCellLocation) {
            return b((CdmaCellLocation) cellLocation);
        }
        return null;
    }

    public z y(ServiceState serviceState) {
        if (serviceState == null) {
            return null;
        }
        return new z(serviceState.getOperatorAlphaLong(), serviceState.getOperatorAlphaShort(), serviceState.getOperatorNumeric(), serviceState.getRoaming(), serviceState.getState(), this.f13367k.d(serviceState), this.f13367k.c(serviceState), this.f13367k.b(serviceState), this.f13367k.a(serviceState));
    }

    public a0 z(SignalStrength signalStrength) {
        int iG;
        int i2;
        int iJ;
        int iE;
        int iC;
        int iD;
        int iF;
        int iL;
        if (signalStrength == null) {
            return null;
        }
        int iK = 99;
        if (Build.VERSION.SDK_INT >= 29) {
            List<CellSignalStrength> listA = this.a.a(signalStrength);
            iL = Integer.MAX_VALUE;
            iC = !listA.isEmpty() ? listA.get(0).getDbm() : Integer.MAX_VALUE;
            CellSignalStrengthGsm cellSignalStrengthGsm = (CellSignalStrengthGsm) a(signalStrength, CellSignalStrengthGsm.class);
            iD = cellSignalStrengthGsm != null ? cellSignalStrengthGsm.getDbm() : Integer.MAX_VALUE;
            CellSignalStrengthLte cellSignalStrengthLte = (CellSignalStrengthLte) a(signalStrength, CellSignalStrengthLte.class);
            if (cellSignalStrengthLte != null) {
                iK = cellSignalStrengthLte.getRssi();
                iG = cellSignalStrengthLte.getRsrp();
                i2 = cellSignalStrengthLte.getRsrq();
                iJ = cellSignalStrengthLte.getRssnr();
                iE = cellSignalStrengthLte.getCqi();
                iF = cellSignalStrengthLte.getDbm();
            } else {
                iF = Integer.MAX_VALUE;
                iG = Integer.MAX_VALUE;
                i2 = Integer.MAX_VALUE;
                iJ = Integer.MAX_VALUE;
                iE = Integer.MAX_VALUE;
            }
            CellSignalStrengthTdscdma cellSignalStrengthTdscdma = (CellSignalStrengthTdscdma) a(signalStrength, CellSignalStrengthTdscdma.class);
            if (cellSignalStrengthTdscdma != null) {
                iL = cellSignalStrengthTdscdma.getRscp();
            }
        } else {
            iK = this.a.k(signalStrength);
            iG = this.a.g(signalStrength);
            i2 = this.a.i(signalStrength);
            iJ = this.a.j(signalStrength);
            iE = this.a.e(signalStrength);
            iC = this.a.c(signalStrength);
            iD = this.a.d(signalStrength);
            iF = this.a.f(signalStrength);
            iL = this.a.l(signalStrength);
        }
        return new a0(signalStrength.getGsmSignalStrength(), signalStrength.getGsmBitErrorRate(), signalStrength.getCdmaDbm(), signalStrength.getCdmaEcio(), signalStrength.getEvdoDbm(), signalStrength.getEvdoEcio(), signalStrength.getEvdoSnr(), iK, iG, i2, iJ, iE, this.a.h(signalStrength), this.a.m(signalStrength), this.a.o(signalStrength), signalStrength.isGsm(), iC, iD, iF, iL, this.a.n(signalStrength));
    }
}