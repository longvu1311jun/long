/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3_4_BaiMauCRUD_Inteface.service.impl;

import B3_4_BaiMauCRUD_Inteface.model.Sach;
import B3_4_BaiMauCRUD_Inteface.service.QuanLySachService;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class QuanLySachServiceImpl implements QuanLySachService {

    @Override
    public void xoa(List<Sach> lists, int index) {
        lists.remove(index);
    }

    @Override
    public List<Sach> searchTheoTen(List<Sach> lists, String ten) {
        List<Sach> listSearch = new ArrayList<>();
        // code
        for (Sach sach : lists) {
            if (sach.getTenSach().contains(ten)) {
                //add vao list search
                listSearch.add(sach);
            }
        }
        return listSearch;
    }

//    https://github.com/AnhDT11/Course-JavaCore/blob/master/So%20s%C3%A1nh%20m%E1%BA%A1nh%20m%E1%BA%BD%20v%E1%BB%9Bi%20Lambda.md
    @Override
    public void sortByName(List<Sach> lists) {
        // sort theo lamda 
        lists.sort((o1, o2) -> {
            return o1.getTacGia().compareTo(o2.getTenSach());
        });
    }

}
