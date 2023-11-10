public class Geometry {

    public String classify(int sideA, int sideB, int sideC){

        boolean triangle = (((sideA+sideB) > sideC) && ((sideB + sideC) > sideA) && ((sideA+sideC) > sideB));
        if(!triangle)
            return "Not a triangle";
        else {
            int match = 0;
            if(sideA == sideB)
                match = match +1;
            if(sideB == sideC)
                match = match+1;
            if(sideA == sideC)
                match = match +1;
            if(match == 0)
                return "Scalane";
            if(match ==1)
                return "Isosceles";
            else
                return "Equilateral";
        }
    }
}
