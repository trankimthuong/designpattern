package Structural.Proxy4.virtual_proxy;


/*
Ví dụ một website hiển thị ảnh, có thể có rất nhều ảnh trên một trang hay một ảnh được hiển thị nhiều lần.
Trường hợp này chúng ta chỉ cần load ảnh khi nó cần hiển thị (khi ta scroll tới nơi đặt image) hoặc là nó chưa được load (không như các website
truyền thống là load hình ngay khi load website, nó rất tốn tài nguyên và đôi khi không cần thiết do người dùng không scroll tới nơi đặt image,
 có thể load 1 ảnh nhiều lần).
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("Init proxy image: ");
        ProxyImage proxyImage = new ProxyImage("thuongdeptrai");

        System.out.println("---");
        System.out.println("Call real service 1st: ");
        proxyImage.showImage();

        System.out.println("---");
        System.out.println("Call real service 2nd: ");
        proxyImage.showImage();
    }
}
