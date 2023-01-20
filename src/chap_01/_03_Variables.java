package chap_01;

public class _03_Variables {
    public static void main(String[] args) {

        String name = "전홍규";
        //name = "전홍규"; 다른 초기화 방법
        int hour = 15;

        System.out.println(name + "님, 배송이 시작됩니다. " + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 돤료되었습니다.");

        double score = 90.5;
        char grade = 'A';
        name = "홍구구";
        System.out.println(name + "님의 평균 점수는 " + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격 했을까요? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789F;
        System.out.println(d);
        System.out.println(f);

        long i; //= 1000000000000L;
        i = 1_000_000_000_000L;
        System.out.println(i);
    }
}
