package com.days.day20;

public class BranchingStatements {
    //Branching and Labeling statements dersi!!!

    public static void main(String[] args) {

 // The break and continue keywords provide additional controls in a loop.
        //break; This keyword causes the termination of the loop and tells the interpreter to go
        //onto the next statement of code 'outside' of the loop.

        //while{//loop startes
        //statement a();
        //statement a();
        //break;
        //statement c();
        //}
        //System.out.println ("out of the loop");


        //you can use break; in any loop!

        //the main purpose of the break, when you create a loops maybe there will more than one condition, also
        //sometimes you have to think about some subconditions.We dont want to change loop chain too much , thanks to break
        // we can do that.

        //when  compiler comes to break , it wouldn't check the rest.It stops immediately
        // if there is nested loops, and if we are using the break statement in the nested loop,
        // it will only stop the closest loop.!!


        int givenNumber = 3;
        int j =1;

        while(j<=10){
            if(j*givenNumber==18){
                break;// break noktasindan sonrasini tamamen iptal ediyor!!!
            }         // break; yerine j=10; yaparsan 27 yi yazmaz ve 30 u gene de yazar!!!! 2 farkli yoldan cozduk!
            System.out.println ("Current number"+ j);
            System.out.println (givenNumber+ " *"+ j +" = "+(j*givenNumber));
            j++; //what if we dont want to print 18?
        }


        int sum = 0;
        int number = 0;


        while (number < 20) {
            number++;
            sum += number;
            if ( sum >= 100 )
                break;

        }
        System.out.println("The number is " + number); //the number is 14.Instead of 20 times , code did run 14 times!
        System.out.println ("The sum is " + sum);// the sum is 105

        int b =10;
            while(true){
            System.out.println ("b= "+b);
            b--;// this is a infinite loop, how we can turn it to no infinite??
            if(b<-100){
                break;
            }

        }

            // You can use also the continue keyword in a loop.When it is encountered ,it ends the
        //current iteration and program control goes to the end of the loop body.

        //......... in other words, "continue" breaks out of an iteration while the "break" keyword
        //breaks out of a loop

        //do{
        //statement(1);
        //statement(2)
        //continue;
        //statement(3);//will be skipped
        //statement(4);//will be skipped
        //}while(booleanCondition)
        //


        //for(condition){
        //statement(1);
        //statement(2);
        //continue;
        //statement(3);
        //statement(4);
        //}


        int numbers=1; //sayilarin karelerini yapiyoruz ama 49 u gormek istemiyoruz mesela ne yapabiliriz ??
                        //

        while(numbers<9){

            numbers++;
            if(numbers==7){
                continue;
            }
            System.out.println (numbers*numbers); //all the other lines after 49 is skipped!


        }

          int ssum=0;
        int numberr=0;

        while(numberr<20) {
            numberr++;
            if ( numberr == 10 || numberr == 11 ) //because this if statement doesn't have{} so it only effects next line after if!

                continue;
            ssum += numberr;
        }
        System.out.println ("The sum is "+ ssum);

        //slayt 8.sayfa

        int balance=10;
        while(true){
            if (balance<9)
                break;// if statement ile beraber bu break .!
            balance=balance-9;
        }
        System.out.println ("Balance is " + balance); //balance is 1


       // int balance2 = 10;
       // while (true) {
         //   if ( balance2 < 9 )
           //     continue;
           // balance2 = balance2 - 9;
       // }
        //System.out.println("Balance is " + balance2);   //will cause infinite loop
        //practice of bad using of while loop.!

        //will the following programs terminate?

        int start =1 ;
        int sonuc=0;

        do{
            if(start %2==0){ //when the if condition is true , code would jump 146 to150!
                continue;
            }
            sonuc +=start;
        }while(++start<=10);
        System.out.println (sonuc);   //0 to 10 , 11 iteration!. //cevap 25.

        // converting loops for to while
        //ilk loop
        int snum=0;
        for (int i =0; i <4; i++){
            if(i %3==0) continue;
            snum +=i;
        }
        System.out.println ("snum = "+ snum );

        int a=0, sun=0;
        while(a<4){
            if(a %3==0) continue;
            sun +=a;
            a++;
        }
        System.out.println (sun);
    }


}

