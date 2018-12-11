class Colour {
    public static void main(String[] args) {
        double tff = 255.0;
        double red = 0.0;
        //red = red / tff;
        System.out.println(red); 
        double green = 50.0;
        //green = green / tff;
        System.out.println(green); 
        double blue = 150.0;
        //blue = blue / tff;
        System.out.println(blue); 
        //double X = red * 0.649926 + green * 0.103455 + blue * 0.197109;
        //double Y = red * 0.234327 + green * 0.743075 + blue * 0.022598;
        //double Z = red * 0.0000000 + green * 0.053077 + blue * 1.035763;
        double X = red + green + blue;
        double Y = red + green + blue;
        double Z = red + green + blue;
        double x = X / (X + Y + Z);
        double y = Y / (X + Y + Z);

        System.out.println(x + " " + y); 
    }
}
