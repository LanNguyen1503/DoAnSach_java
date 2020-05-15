/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysach;

import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Huong_Nho_UIT
 */
public class QuanLySachDAO {
    List<QuanLySach> list = new ArrayList<>();
    public int add(QuanLySach q){
        list.add(q);
        return 1;
    }
    public QuanLySach findbyID(String MaSach){
        for(QuanLySach q :list ){
            if(q.getMaSach().equalsIgnoreCase(MaSach)){
                return q;
            }
        }return null;
    }
   // public List<QuanLySach> getList();
        
    public int edit(QuanLySach q){
        for (QuanLySach qq : list){
            if( qq.getMaSach().equalsIgnoreCase(q.getMaSach())){
                qq.setTenSach(q.getTenSach());
                qq.setTheLoai(q.getTheLoai());
                qq.setTacGia(q.getTacGia());
                qq.setTomTat(q.getTomTat());
                qq.setTinhTrang(q.isTinhTrang());
                return 1;
            }
        }return -1;
    }
    public int del(String MaSach){
        QuanLySach q = findbyID(MaSach);
        if(q != null){
            list.remove(q);
            return 1;
        
    }return -1;
    }
    public QuanLySach getOneSach(int pos){
        return list.get(pos);
    }
    
}
