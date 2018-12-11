// this program uses reflection from the class to return the
// values stored in myMeths annotation

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno { 
    String str();
    int val();
}

class Meta {
    // Annotate a method
    @MyAnno(str = "Annotation Example", val = 100)
    public static void myMeth() {
        Meta ob = new Meta();

        // get the @anno for this method
        // display the values of the members

        try {
            // get the class object that represents this class
            Class<?> c = ob.getClass();

            // get a method object the represents this method
            Method m = c.getMethod("myMeth");

            // get the annotation for this class
            MyAnno anno = m.getAnnotation(MyAnno.class);

            // finally display the values
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException exc) {
            System.out.println("Method Not Found");
        }
    }

    public static void main(String[] args) { 
        myMeth();
    }
}