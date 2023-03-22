package luyenTapBuoi3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author DELL
 */
public class DongVatService implements DongVatServiceInterface {

    private ArrayList<DongVat> ds;

    public DongVatService() {
        this.ds = new ArrayList<>();
    }

    @Override
    public void add(DongVat dv) {
        this.ds.add(dv);
    }

    @Override
    public void setDS(ArrayList<DongVat> ds) {
        this.ds = ds;
    }

    @Override
    public ArrayList<DongVat> getDs() {
        return ds;
    }

    public ArrayList<DongVat> SBName(String TenDV) {
        ArrayList<DongVat> list = new ArrayList<>();
        for (DongVat d : ds) {
            if (d.getTenDongVat().equalsIgnoreCase(TenDV)) {
                list.add(d);
            }
        }
        return list;

    }

    public ArrayList<DongVat> SBCan(int min, int max) {
        ArrayList<DongVat> list = new ArrayList<>();
        for (DongVat d : ds) {
            if (d.getCanNang() >= min && d.getCanNang() <= max) {
                list.add(d);
            }
        }
        return list;
    }

    public ArrayList<DongVat> sort() {

        Comparator<DongVat> com = new Comparator<DongVat>() {
            @Override
            public int compare(DongVat o1, DongVat o2) {
                String name1 = o1.getTenDongVat();
                String name2 = o2.getTenDongVat();
                if (name1.equalsIgnoreCase(name2)) {

                    return o1.getCanNang() >= o2.getCanNang() ? -1 : 1;
                }
                return name1.compareToIgnoreCase(name2);
            }

        };
        Collections.sort(ds, com);
        return ds;
    }

    public ArrayList<DongVat> top5() {
        ArrayList<DongVat> list = new ArrayList<>();
        Comparator<DongVat> com = new Comparator<DongVat>() {
            @Override
            public int compare(DongVat o1, DongVat o2) {
                return o1.getCanNang() <= o2.getCanNang() ? -1 : 1;
            }
        };
        Collections.sort(ds, com);
        for (int i = 0; i < 5; i++) {
            list.add(ds.get(i));
        }
        return list;
    }
    
}
