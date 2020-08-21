package Structural.Bridge3.before;
/* Ở ví dụ này khi hệ thống cung cấp thêm một loại tòi khoản khác sẽ phải tạo class mới cho tất cả ngân
hàng...Khi chúng ta sử dụng Bridge, khi thêm một loại tài khoản mới, chúng ta chỉ cần thêm vào một implement cho Accout
các thành phần khác của Bank không bị ảnh hưởng. Hoặc cần thêm một ngân hàng mới ta chỉ cần thêm một implement mới cho bank
các thành phần khác không bị ảnh hưởng và số lượng class chỉ thêm lên 1
 */
public class client {
    public static void main(String[] args) {
        VietcomBankCheckingAccount exp = new VietcomBankCheckingAccount();
        exp.openAccount();
        exp.checkingAccout.status();
    }
}
