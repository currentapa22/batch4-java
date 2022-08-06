package com.days.day40;

public class uc_Find_exam_results {
    public static void main(String[] args) {

        //slaytta 12.sayfadaki soruyu cozuyoruz.

        //we need to create more than one loops.
        //first loop is checks student answer one by one.(start from 0,ends at last student)
        //and then checks the student answer with the key answers one by one (second loop)
        //

        String[] key = {"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"};
        String [][] answers = {
                {"A", "B", "A", "C", "C", "D", "E","","",""},
                {"D", "B", "A", "B", "C", "A", "E", "E", "A", "D"},
                {"E", "D", "D", "A", "C", "B", "E", "E", "A", "D"},
                {"C", "B", "A", "E", "D", "C", "E", "E", "A", "D"},
                {"A", "B", "D", "C", "C", "D", "E", "E", "A", "D"},
                {"B", "B", "E", "C", "C", "D", "E", "E", "A", "D"},
                {"B", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
                {"E", "B", "E", "C", "C", "D", "E", "E", "A", "D"}
        };

  findExamResults ( answers,key );

    }

public static void findExamResults(String[][] studentAnswers, String[] key){
        for(int r=0;r< studentAnswers.length;r++){//outer loop- check each student Array one by one
            int count=0;

            for(int c=0;c< key.length;c++){// inner loop- check each question one by one.
                if ( studentAnswers[r][c].equalsIgnoreCase ( key[c] )) {
                    count++;
                }
            }
            System.out.println ("Student "+ r+ "correct count is "+ count);
        }
}


}
