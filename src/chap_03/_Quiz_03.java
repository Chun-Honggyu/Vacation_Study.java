package chap_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String No = "031220-3194113";
        System.out.println(No.substring(0, No.indexOf("-") + 2)); // 0 위치부터 하이픈 위치 + 2 직전까지
    }
}
