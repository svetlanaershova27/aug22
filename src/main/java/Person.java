public class Person {
    public static String isWho(String gender, int age)  {
        String result;

        if (age <= 18 && age >= 0 ) {
            if (gender == "male") {
                result = "boy";
            } else {
                result = "girl";
            }}
        else if (age > 18) {
            if (gender == "male") {
                result = "man";
            } else {
                result = "woman";
            }} else {
            try {
                if (age < 0) {
                    throw new IllegalArgumentException("Only Positive Numbers!");
                }
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());

            } result = null;

        }


        return result;
    }

    public static boolean isTeenager(int age)  {
        boolean result;
        if (age <= 19 && age >= 13) {
            result = true;
            System.out.println(age + " is Teenager");
        } else {
            try {
                if (age < 0) {
                    throw new IllegalArgumentException("Only Positive Numbers & no Letters Please!");
                }
            } catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());

            } result = false;
            System.out.println( age +" is not teenager");
        }


        return result;
    }
}

