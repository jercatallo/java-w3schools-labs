package org.example.s03_classes.t14_innerclasses;

/**
 * W3Schools - Java Inner Classes: Inner Classes
 * https://www.w3schools.com/java/java_inner_classes.asp
 */
//class OuterClass {
//    int x = 10;
//
//    class InnerClass {
//        int y = 5;
//    }
//}
//
//public class InnerClasses {
//    public static void main(String[] args) {
//        OuterClass myOuter = new OuterClass();
//        OuterClass.InnerClass myInner = myOuter.new InnerClass();
//        System.out.println(myInner.y + myOuter.x);
//    }
//}

//class OuterClass {
//    int x = 10;
//
//    private class InnerClass {
//        int y = 5;
//    }
//}
//
//public class InnerClasses {
//    public static void main(String[] args) {
//        OuterClass myOuter = new OuterClass();
////        OuterClass.InnerClass myInner = myOuter.new InnerClass();
//        System.out.println(myInner.y + myOuter.x);
//    }
//}

//class OuterClass {
//    int x = 10;
//
//    static class InnerClass {
//        int y = 5;
//    }
//}
//
//public class InnerClasses {
//    public static void main(String[] args) {
//        OuterClass.InnerClass myInner = new OuterClass.InnerClass();
//        System.out.println(myInner.y);
//    }
//}

class OuterClass {
    int x = 10;

    class InnerClass {
        public int myInnerMethod() {
            return x;
        }
    }
}

public class InnerClasses {
    public static void main(String[] args) {
        OuterClass myOuter = new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.myInnerMethod());
    }
}