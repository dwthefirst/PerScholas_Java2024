package GL_303_11_1;

public class MyRunner {
    public static void main(String[] args) {
//        DemoClass d = new DemoClass();
//        d.genericsMethod(25);
//        d.genericsMethod("String");
//        d.genericsMethod(123.123);
//        d.genericsMethod('H');

        // initialize generic class
        // with String and Integer data

        GMultipleDataType<String, Integer> mobj = new GMultipleDataType<>("PerScholas", 11025);

        System.out.println(mobj.getValueOne() + " type: " + mobj.getValueOne().getClass().getSimpleName());
        System.out.println(mobj.getValueTwo() + " type: " + mobj.getValueTwo().getClass().getSimpleName());

        GMultipleDataType<String, String> mobj2 = new GMultipleDataType<>("PerScholas", "Non-Profit");
        System.out.println(mobj2.getValueOne() + " type: " + mobj2.getValueOne().getClass().getSimpleName());
        System.out.println(mobj2.getValueTwo() + " type: " + mobj2.getValueTwo().getClass().getSimpleName());
    }

}
