package Practice;

@FunctionalInterface
interface LambdaA{
//    void show();
    void show2(int i, int j);
}
public class Lambda{
    public static void main(String[] args) {
        LambdaA obj = new LambdaA() {
//           public void show() {
//                System.out.println("in old show");
//            }

            @Override
            public void show2(int i, int j) {
                System.out.println(i + " : " + j);
            }

        };
//        obj.show();
        obj.show2(2,3);

        LambdaA obj1 = (i,j) -> System.out.println("in new show " + i + " : " + j);
        obj1.show2(3,4);
        // This is Practice.Lambda expression

        // Practice.Lambda expression work with only functional interface -- which has only one method
    }
}
