class TwoD {
    int x, y;

    TwoD(int a, int b) {
        x = a;
        y = b;
    }
}

class ThreeD extends TwoD {
    int z; 

    ThreeD(int a, int b, int c) {
        super(a, b);
        z = c;
    }
}

class FourD extends ThreeD {
    int t; 

    FourD(int a, int b, int c, int d) {
        super(a, b, c);
        t = d;
    }
}


class Coords<T extends TwoD> {
    T[] coords;

    Coords(T[] o) {
        coords = o;
    }
}

class BoundedWildcard {

    static void showXY(Coords<?> c) {
        System.out.println("X Y Coords:");
        for(int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " +
                               c.coords[i].y);
        }
        System.out.println();
    }

    static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("X Y Z Coords:");
        for(int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " +
                               c.coords[i].y + " " +
                               c.coords[i].z);
        }
        System.out.println();
    }

    static void showAll(Coords<? extends FourD> c) {
        System.out.println("X Y Z T Coords:");
        for(int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " +
                               c.coords[i].y + " " +
                               c.coords[i].z + " " +
                               c.coords[i].t);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TwoD[] td = {
            new TwoD(0, 0),
            new TwoD(7, 9),
            new TwoD(18, 4),
            new TwoD(-1, -23)
        };

        Coords<TwoD> tdlocs = new Coords<TwoD>(td);
        showXY(tdlocs);

        ThreeD[] thd = {
            new ThreeD(0, 0, 0),
            new ThreeD(7, 9, 11),
            new ThreeD(18, 4, 0),
            new ThreeD(-1, -23, -57)
        };

        Coords<ThreeD> thdlocs = new Coords<ThreeD>(thd);
        showXYZ(thdlocs);

        FourD[] fd = {
            new FourD(0, 0, 0, 0),
            new FourD(7, 9, 11, 13),
            new FourD(18, 4, 0, -4),
            new FourD(-1, -23, -57, -97)
        };

        Coords<FourD> fdlocs = new Coords<FourD>(fd);
        showAll(fdlocs);
    }
}