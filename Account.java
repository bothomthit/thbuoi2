
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */

public class Account {

    private double sotien = 50;

        private long sotk = 999999;
Scanner sc = new Scanner(System.in);

    Account() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
    public long getSotk() {
        return sotk;
    }

    public void setSotk(long sotk) {
        this.sotk = sotk;
    }


    private String tentk = "chua xac dinh";

    private String trangthai=null;

    
    public String getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(String trangthai) {
        this.trangthai = trangthai;
    }

    public String getTentk() {
        return tentk;
    }

    public void setTentk(String tentk) {
        this.tentk = tentk;
    }

    public void setSotk(int sotk) {
        this.sotk = sotk;
 
    }

    public double getSotien() {
        return sotien;
    }

    public void setSotien(double sotien) {
        this.sotien = sotien;
    }

    public Account(double sotien, long sotk, String tentk) {
        this.sotien = sotien;
        this.sotk = sotk;
        this.tentk = tentk;
     if(sotk<=0 && sotk==9999999){
         System.out.println("so tai khoan khong hop le. Vui long nhap lai so tai khoan lon hon 0 va khac 9999999");
}
     else {
            System.out.println("so tai khoan la"+ this.sotk);
     }
     if(sotien>=50){
         System.out.println("so tien trong tai khoan cua quy khach la"+ sotien);
     }
     else{
         System.out.println("so du toi thieu phai la 50");
     }
     if(tentk==null){
         System.out.println("ten tai khoan khong duoc de trong");
     }
     else{
         System.out.println("tai khoan" + tentk);
     }
        System.out.println("trang thai tai khoan la"+ trangthai);
    }
    
    
    
    


    @Override
    public String toString() {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(localeVN);
        String st = numberFormat.format(sotien);
        return "Account{"
      +"__________________________________________________________________________________"          
                + "/n"    + " sotk=" + " tentk="    + "sotien="      + " trangthai=" 
      +"----------------------------------------------------------------------------------"          
                + "/n"     + sotk      + tentk       + st           + trangthai + '}';
    }
    public double napTien() {
        double nap;
        System.out.print("Nhập số tiền bạn cần nạp: ");
        nap = sc.nextDouble();
        if (nap >= 0) {
            sotien = nap + sotien;
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str1 = currencyEN.format(nap);
            System.out.println("bạn vừa nạp " + str1 + " vào tài khoản.");
        } else {
            System.out.println("Số tiền nạp vào không hợp lệ!");
        }
        return nap;
    }
 
    //khởi tạo phương thức rút tiền
    public double rutTien() {
        double phi = 5;
        double rut;
        System.out.print("Nhập số tiền bạn cần rút: ");
        rut = sc.nextDouble();
        //nếu số tiền rút bé hơn hoặc bằng số tiền còn trong tài khoản + phí thì hợp lệ
        if (rut <= (sotien - phi)) {
            sotien = sotien - (rut + phi);
            NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
            String str = currencyEN.format(rut);
            System.out.println("Bạn vừa rút " + str + "Đ từ tài khoản. Phí là $5.");
        } else {//ngược lại nếu số tiền rút lớn hơn số tiền có trong tài khoản thì không hợp lệ
            System.out.println("Số tiền muốn rút không hợp lệ!");
            return rutTien();
        }
        return rut;
    }
 
    //khởi tạo phương thức đáo hạn
    public double daoHan() {
        double laiSuat = 0.035;
        sotien = sotien + sotien * laiSuat;
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str1 = currencyEN.format(sotien);
        System.out.println("Bạn vừa được " + str1 + " từ đáo hạn 1 tháng");
        return sotien;
    }
 
    //khởi tạo phương thức in kết quả ra màn hình
    void inTK() {
        NumberFormat currencyEN = NumberFormat.getCurrencyInstance();
        String str = currencyEN.format(sotien);
        System.out.printf("%-10d %-20s %-20s \n", sotk, tentk, str);
    }
    };
            



