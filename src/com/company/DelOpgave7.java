package com.company;

public class DelOpgave7 {


    public static boolean isBetween(int x, int lower, int upper) {
        return lower <= x && x <= upper;
    }

    public String calculateGradeFromInt(int GradeInInt ) {

        if (GradeInInt > 100 || GradeInInt < 0 ) {
            return null;
        }

        if( isBetween( GradeInInt, 90 , 100 )  ) {
            return  "A";
        } else if (isBetween(GradeInInt , 80 , 89)) {
            return "B";
        } else if (isBetween(GradeInInt , 70 , 79)) {
            return "C";
        }else if (isBetween(GradeInInt , 60 , 69)) {
            return "D";
        }else  {
            return "F";
        }
    }


    public String switchCalculateGradeFromInt(int gradeAsInt) {

        if (gradeAsInt > 100 || gradeAsInt < 0 ) {
            return null;
        }

        gradeAsInt -= ( gradeAsInt % 10);

        return switch (gradeAsInt) {
            case 100, 90 -> "A";
            case 80 -> "B";
            case 70 -> "C";
            case 60 -> "D";
            default -> "F";
        };
    }

}
