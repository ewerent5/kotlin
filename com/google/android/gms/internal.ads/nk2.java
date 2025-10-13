package com.google.android.gms.internal.ads;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class nk2 {
    static String a(lk2 lk2Var, String str) throws SecurityException {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        c(lk2Var, sb, 0);
        return sb.toString();
    }

    static final void b(StringBuilder sb, int i2, String str, Object obj) throws SecurityException {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb, i2, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                b(sb, i2, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(pl2.a(ci2.J((String) obj)));
            sb.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            return;
        }
        if (obj instanceof ci2) {
            sb.append(": \"");
            sb.append(pl2.a((ci2) obj));
            sb.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            return;
        }
        if (obj instanceof ej2) {
            sb.append(" {");
            c((ej2) obj, sb, i2 + 2);
            sb.append("\n");
            while (i3 < i2) {
                sb.append(' ');
                i3++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i5 = i2 + 2;
        b(sb, i5, Action.KEY_ATTRIBUTE, entry.getKey());
        b(sb, i5, "value", entry.getValue());
        sb.append("\n");
        while (i3 < i2) {
            sb.append(' ');
            i3++;
        }
        sb.append("}");
    }

    private static void c(lk2 lk2Var, StringBuilder sb, int i2) throws SecurityException {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : lk2Var.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strSubstring = str.startsWith("get") ? str.substring(3) : str;
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List")) {
                String strValueOf = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf2 = String.valueOf(strSubstring.substring(1, strSubstring.length() - 4));
                String strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    b(sb, i2, d(strConcat), ej2.l(method2, lk2Var, new Object[0]));
                }
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map")) {
                String strValueOf3 = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf4 = String.valueOf(strSubstring.substring(1, strSubstring.length() - 3));
                String strConcat2 = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    b(sb, i2, d(strConcat2), ej2.l(method3, lk2Var, new Object[0]));
                }
            }
            if (((Method) map2.get(strSubstring.length() != 0 ? "set".concat(strSubstring) : new String("set"))) != null) {
                if (strSubstring.endsWith("Bytes")) {
                    String strValueOf5 = String.valueOf(strSubstring.substring(0, strSubstring.length() - 5));
                    if (!map.containsKey(strValueOf5.length() != 0 ? "get".concat(strValueOf5) : new String("get"))) {
                    }
                }
                String strValueOf6 = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf7 = String.valueOf(strSubstring.substring(1));
                String strConcat3 = strValueOf7.length() != 0 ? strValueOf6.concat(strValueOf7) : new String(strValueOf6);
                Method method4 = (Method) map.get(strSubstring.length() != 0 ? "get".concat(strSubstring) : new String("get"));
                Method method5 = (Method) map.get(strSubstring.length() != 0 ? "has".concat(strSubstring) : new String("has"));
                if (method4 != null) {
                    Object objL = ej2.l(method4, lk2Var, new Object[0]);
                    if (method5 == null) {
                        if (objL instanceof Boolean) {
                            if (((Boolean) objL).booleanValue()) {
                                b(sb, i2, d(strConcat3), objL);
                            }
                        } else if (objL instanceof Integer) {
                            if (((Integer) objL).intValue() != 0) {
                                b(sb, i2, d(strConcat3), objL);
                            }
                        } else if (objL instanceof Float) {
                            if (((Float) objL).floatValue() != 0.0f) {
                                b(sb, i2, d(strConcat3), objL);
                            }
                        } else if (!(objL instanceof Double)) {
                            if (objL instanceof String) {
                                zEquals = objL.equals("");
                            } else if (objL instanceof ci2) {
                                zEquals = objL.equals(ci2.f5319e);
                            } else if (objL instanceof lk2) {
                                if (objL != ((lk2) objL).g()) {
                                    b(sb, i2, d(strConcat3), objL);
                                }
                            } else if (!(objL instanceof Enum) || ((Enum) objL).ordinal() != 0) {
                                b(sb, i2, d(strConcat3), objL);
                            }
                            if (!zEquals) {
                                b(sb, i2, d(strConcat3), objL);
                            }
                        } else if (((Double) objL).doubleValue() != 0.0d) {
                            b(sb, i2, d(strConcat3), objL);
                        }
                    } else if (((Boolean) ej2.l(method5, lk2Var, new Object[0])).booleanValue()) {
                        b(sb, i2, d(strConcat3), objL);
                    }
                }
            }
        }
        if (lk2Var instanceof cj2) {
            throw null;
        }
        sl2 sl2Var = ((ej2) lk2Var).zzc;
        if (sl2Var != null) {
            sl2Var.g(sb, i2);
        }
    }

    private static final String d(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }
}