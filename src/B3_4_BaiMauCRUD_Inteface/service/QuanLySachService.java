/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package B3_4_BaiMauCRUD_Inteface.service;

import B3_4_BaiMauCRUD_Inteface.model.Sach;
import java.util.List;

/**
 *
 * @author hangnt
 */
public interface QuanLySachService {

    void xoa(List<Sach> lists, int index);

    List<Sach> searchTheoTen(List<Sach> lists, String ten);

    void sortByName(List<Sach> lists);

}
