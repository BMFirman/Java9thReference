// use an istance method reference with different objects

// a functional interface that take two reference arguments
// and returns a boolean result
interface MyFunc<T> {
    boolean func(T v1, T v2);
}

// a class that stores the temoerature high for the day
class HighTemp {
    private int hTemp;

    HighTemp(int ht) {
        hTemp = ht;
    }

    // return true is the invoking HighTemp object has the
    // same temp as ht2
    boolean sameTemp(HighTemp ht2) {
        return hTemp == ht2.hTemp;
    }

    // return true if the invoking HighTemp object has a
    // temperature that is less that ht2
    boolean lessThanTemp(HighTemp ht2) {
        return hTemp < ht2.hTemp;
    }
}

class InstanceMethodObjectRefDemo {
    // method returning the number of occurences
    // of an object for with some criteria, specified by
    // the MyFunc parameter, is true

    static <T> int counter(T[] vals, MyFunc<T> f, T v) {
        int count = 0;

        for(int i=0; i<vals.length; i++) {
            if(f.func(vals[i], v)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int count;

        // create an array of HighTemp objects
        HighTemp[] weekDayHighs = {
                        new HighTemp(89), new HighTemp(82),
                        new HighTemp(90), new HighTemp(89),
                        new HighTemp(89), new HighTemp(91),
                        new HighTemp(84), new HighTemp(83)  };

        // use counter() with the arrays of class HighTemp
        // notice that a reference to the instace method
        // sameTemp() is passed as the second argument
        count = counter(weekDayHighs, HighTemp::sameTemp,
                        new HighTemp(89));
        System.out.println(count + " days that had a high of 89");
        
        count = counter(weekDayHighs, HighTemp::lessThanTemp,
                        new HighTemp(89));
        System.out.println(count + 
                    " days that had a high of less than 89");

        HighTemp[] weekDayHighs2 = {
                        new HighTemp(32), new HighTemp(12),
                        new HighTemp(24), new HighTemp(19),
                        new HighTemp(18), new HighTemp(12),
                        new HighTemp(-1), new HighTemp(13)  };

        count = counter(weekDayHighs2, HighTemp::sameTemp,
                        new HighTemp(12));
        System.out.println(count + " days that had a high of 12");

        count = counter(weekDayHighs2, HighTemp::lessThanTemp,
                        new HighTemp(19));
        System.out.println(count + 
                    " days that had a high of less than 19");
    }
}