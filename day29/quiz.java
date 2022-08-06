package com.days.day29;

public class quiz {
    public static void main(String[] args) {
        int z = 3459;
        System.out.println ( z % 1000 );

        int a = 0;
        int b = 1;
        int c = a + b;
        for (int i = 0; i < 3; i++) {
            a = b;
            b = c;
            c = a + b;

        }
        System.out.println ( "c = " + c );


        int w = 0;
        while (w < 5) {
            w++;
            System.out.print ( w );
            w++;
        }


        for (int i = 5; i < 10; i++) {
            if ( i == 7 ) {
                break;
            }
            System.out.print ( "*" );
            System.out.print ( i );
        }

        int t = 11;
        int y = 6;
        int x;
        t %= y;
        System.out.println ( t );
        y -= a;
        System.out.println ( y );
        x = t + y;
        System.out.println ( x );

        for (int i = 0; i < 2; i++) {
            for (int j = 2; j >= 0; j--) {
                if ( i == j )
                    continue;
                System.out.print ( i + " " + j );



            }


             b=2;

            boolean bol= - ++b == - 2 || b++ == --b ^ b++ == 3 ;

            System.out.print(b);
            System.out.print(bol);
        }
    }
}

