package Week2_Excercise;

import java.util.Date;

public class CountNames {
    public static void main( String args[] ) {

        String[] names = {"Tommy Lee Jones", "William Hurt", "Nicole Kidman",
                "Catherine Zeta-Jones", "JAMES EARL JONES", "Tom Hardy",
                "Judi Dench", "Sean Bean", "Carey Mulligan", "Toby Jones" };
        for(String name : names){
            if(name.toLowerCase().endsWith("jones")){
                System.out.println(name);
            }

        }
    }



    public static void foobar( Date a, float b ){

    }

    public static void foobar( Float a, String b ){

    }


    public void foobar( float x, Date y ){

    }
}

