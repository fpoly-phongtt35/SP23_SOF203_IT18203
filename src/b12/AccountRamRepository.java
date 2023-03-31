/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b12;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phongtt
 * Dữ liệu lưu ở trên RAM
 */
public class AccountRamRepository implements IAccountRepository {
    
    private static final List<Account> accounts = new ArrayList<Account>();
    static {
        accounts.add(new Account("phongtt35", "123456", RoleConst.QUAN_LY));
        accounts.add(new Account("phongtt12", "123456", RoleConst.THU_KHO));
    }
    
    @Override
    public List<Account> findAll() {
        return accounts;
    }

    @Override
    public Account findByUsername(String username) {
        // Cách 1
//        for(Account account : accounts) {
//            if (account.getUsername().equalsIgnoreCase(username)) {
//                return account;
//            }
//        }
//        return null;
           
        // Cách 2
        return accounts.stream() // Chuyển sang dùng stream
                .filter(account -> // phần tử đại diện khi duyệt mảng
                        account.getUsername() // lấy tên đăng nhập của tài khoản
                                // so sánh với tên đăng nhập truyền vào
                                .equalsIgnoreCase(username)) 
                .findFirst() // lấy kết quả đầu tiên tìm được
                .orElse(null); // nếu không tìm thấy trả về NULL
    }
}
