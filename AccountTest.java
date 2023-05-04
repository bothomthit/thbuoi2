/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Admin
 */import java.util.Scanner;
public class AccountTest {
static Scanner sc = new Scanner(System.in);
    static void nhapTK(Account tk) {
        System.out.println("Nhập số tài khoản: ");
        tk.setSotk(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhập tên tài khoản: ");
        tk.setTentk(sc.nextLine());
        tk.setSotien(50);
    }
    public static void main(String[] args) {
        Account a[] = null;
        int b, n = 0;
        long s, d, c, f;
        boolean flag = true;
        do {
            System.out.println("Chon chuc nang ");
            System.out.println("1.Nhap thong tin khach hang\n"
                    + "2.Xuat danh sach\n" + "3.Nap tien\n" + "4.Rut tien\n"
                    + "5.Dao han\n" + "6.Chuyen khoan\n" + "So khac de thoat");
            b = sc.nextInt();
            switch (b) {
                case 1:
                    System.out.println("Nhập số lượng khách hàng bạn muốn nhập: ");
                    n = sc.nextInt();
                    a = new Account[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Khách hàng số: " + (i+1));
                        a[i] = new Account();
                        nhapTK(a[i]);
                    }
                    break;
                case 2:
                    System.out.printf("%-10s %-20s %-20s\n", "Số TK", "Tên TK", "Số tiền trong TK");
                    for (int i = 0; i < n; i++) {
                        a[i].inTK();
                    }
                    break;
                case 3:
                    System.out.println("Nhập số tài khoản khách hàng cần nạp tiền: ");
                    s = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getSotk();
                        if (s == d) {
                            System.out.println("Bạn chọn tài khoản: " + d);
                            a[i].napTien();
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
                case 4:
                    System.out.println("Nhập số tài khoản khách hàng cần rút tiền: ");
                    s = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getSotk();
                        if (s == d) {
                            System.out.println("Bạn chọn tài khoản: " + d);
                            a[i].rutTien();
                        }
                    }
                    break;
                case 5:
                    System.out.println("Nhập số tài khoản khách hàng cần đáo hạn: ");
                    s = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getSotk();
                        if (s == d) {
                            System.out.println("Bạn chọn tài khoản: " + d);
                            a[i].daoHan();
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
                case 6:
                    double chuyen,
                            nhan,
                            tienChuyen;
                    System.out.print("Nhập số tài khoản khách hàng chuyển tiền: ");
                    s = sc.nextLong();
                    System.out.print("Nhập số tài khoản khách hàng nhận tiền: ");
                    c = sc.nextLong();
                    for (int i = 0; i < n; i++) {
                        d = a[i].getSotk();
                        if (s == d) {
                            chuyen = a[i].getSotien();
                            for (int j = 0; j < n; j++) {
                                f = a[j].getSotk();
                                if (c == f) {
                                    nhan = a[j].getSotien();
                                    System.out.println("Nhập số tiền cần chuyển");
                                    tienChuyen = sc.nextDouble();
                                    if (tienChuyen <= chuyen) {
                                        chuyen = chuyen - tienChuyen;
                                        nhan = nhan + tienChuyen;
                                        a[i].setSotien(chuyen);
                                        a[j].setSotien(nhan);
                                        System.out.println("Tài khoản số " + d + " vừa chuyển: $" + tienChuyen);
                                        System.out.println("Tài khoản số " + f + " vừa nhận: $" + tienChuyen);
                                    } else {
                                        System.out.println("Số tiền nhập không hợp lệ!");
                                    }
                                } else {
                                    System.out.println("");
                                }
                            }
                        } else {
                            System.out.println("");
                        }
                    }
                    break;
                default:
                    System.out.println("Bye!!");
                    flag = false;
                    break;
            }
        } while (flag);
    }
    /**
     * @param args the command line arguments
     */
   
    
}
