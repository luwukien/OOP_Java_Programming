public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello Kien");
//        sb.append("Hello");
//        sb.append(" ");
//        sb.append("world");

//        String message = sb.toString();
        System.out.println(sb.toString());
//
//        sb.insert(5, 123);
//        System.out.println(sb.toString());

        sb.replace(6, 10, "Vu");
        System.out.println(sb.toString());
    }
}