package com.days.day18;

public class NestedLoops2class {


    public static void main(String[] args) {

        for(int i =0; i<3 ; i ++){ // outer loop
            //System.out.print (i); //0 1 2   //instead of printing i 3 times, we will run the inner loop 3 times!

            for(int k =0; k<2;k++){
                System.out.println ("hello java"); // 2 times inner loop
                //inner loop would work till the its own condition is false ,and goes to up for loop, yani her seferinde
                // bu kod 2 kez calisicak print yapicak ta ki yukaridaki loop sarti false olana kadar
                // 2x3=6 kez inner loop calisicak mantigi var!
            }
        }
        for (int a=0 ; a<2 ; a++){

            System.out.println ("Nested");

            for (int k=3 ; k>0 ; k--){
                System.out.println ("inner loop");
            }
        }
        System.out.println ("out of loop beybi");

        for(int i =0; i<2 ; i++) { //0 1 // outer loop
            System.out.println ( "outer2" );

            for (int r = 0; r <= i; r++) {  //3 times inner loop r0 i0
                System.out.println ( "Inner2" );
            }

        }
        System.out.println ("Out of all loops");

        //END OF THIS CLASS1!
        //NESTEDSTAR ADLI DERSE GECIYORUM!!!!

        for (int u=0; u<4 ; u++){ //outer loop

            System.out.println ();
            for (int w=0 ; w<4 ; w++){// inner loop
                System.out.print (" * ");  // *  *  *  *
                                          // *  *  *  *
                                         // *  *  *  *
            }



        }















        for (int u=0; u<4 ; u++){ //outer loop

            System.out.println ();
            for (int w=0 ; w<=u ; w++){// inner loop.We need define inner loop for triangle. inner condition u <= yaparak cozduk!
                System.out.print (" * ");  // *    each line is row
                                          //  *  *
                                         //   *  *  *
                                        //    *  *  *  *


            }
        }
        System.out.println ("");
        int rows=5;
        for(int i=0; i <=rows; i ++){ // outer loop condition part (2.part ) always affect to row!
            for(int k =0; k <=3; k++){

                System.out.print (i); //0000
                // 1111
                // 2222
                // 3333
                // 4444
                //5555
            }
            System.out.println ();//result will be same but in different lines after 0000.

        }



         rows=5;
        for(int i=1; i <=rows; i ++) { // outer loop condition part (2.part ) always affect to row!
            for (int k = 0; k < i; k++) {

                System.out.print ( i ); // 1
                                        // 22
                                        // 333
                                        // 4444
                                        // 55555
            }
            System.out.println ();//result will be same but in different lines after 0000.
        }


        for(int n=1; n<=4; n++){ //outer loop will run 4 times ,rows are 4 so it is ok!.
            for(int p=1; p<=n; p++){// how many times will inner loop run ? 3  times.
                System.out.print (p);  // 1                123123123123 will see ama  outer looptaki n=1 yaptik, we inner looptaki conditionu degistirdik!
                                      //  1 2
                                     //   1 2 3
                                    //    1 2 3 4
           }
            System.out.println (); //cevap yukaridaki gibi cikiyor!
        }



        for(int n=1; n<=4; n++){ //outer loop will run 4 times ,rows are 4 so it is ok!.
            for(int p=1; p<=n; p++){// how many times will inner loop run ? 3  times.
                System.out.print (n);  // 1                123123123123 will see ama  outer looptaki n=1 yaptik, we inner looptaki conditionu degistirdik!
                                      //  22
                                     //   333
                                    //    4444
            }
            System.out.println (); //cevap yukaridaki gibi cikiyor!
        }


    // multiplation table
    //      1
    //     12
    //    123
    //   1234 //also look at the diamond patterns or java patterns! bakman faydali olabilir!.

        int allie=100;
        for(allie=101; allie>0 ; allie--){
            System.out.println (allie);

        }
        System.out.println (allie);  // value will be 0












    }
}
