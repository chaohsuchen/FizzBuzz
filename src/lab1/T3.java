package lab1;

public class T3 {
    public static void main(String[] args) {
        T2.doFizzBuzz(5);
//        if (args.length > 0) {
//            IO.println(args[0]);
//        }

//      Because:  public static void main(String[] args)
//      So: FizzBuzz.main(new String[]{});

//      We cannot call FizzBuzz.main() without an argument because the main method
//      expects a String[] parameter. We can pass the args from Main.main instead,
//      since args is already a String[].

        FizzBuzz.main(new String[]{});
    }
}
