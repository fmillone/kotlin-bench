package bench;

/**
 * Created by francisco.millone on 26/6/2017.
 */
public class Main {

    public static void main(String[] args) {

        javaTest();
        System.out.println("======java 1 ^=============");
        javaTest2();
        System.out.println("======java 2 ^=============");
        kotlinTest();
        System.out.println("======kotlin 1 ^=============");
        kotlinTest2();
        System.out.println("======kotlin 2 ^=============");
        groovyTest();
        System.out.println("======groovy 1 ^ =============");
        groovyTest2();
        System.out.println("=======groovy 2 ^ ==========");
        System.out.println("========= END END ==========");

    }

    public static void javaTest() {
        long startTime = System.currentTimeMillis();
        System.out.println(new JavaExample().processInputFile("C:\\Users\\francisco.millone\\Downloads\\Crimes_-_2001_to_present.csv"));
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime) + "ms");
    }

    public static void javaTest2() {
        long startTime = System.currentTimeMillis();
        System.out.println(new JavaExample().processInputFile2("C:\\Users\\francisco.millone\\Downloads\\Crimes_-_2001_to_present.csv"));
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime) + "ms");
    }



    public static void kotlinTest() {
        long startTime = System.currentTimeMillis();
        System.out.println(KotlinExampleKt.countDamage("C:\\Users\\francisco.millone\\Downloads\\Crimes_-_2001_to_present.csv"));
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime) + "ms");
    }

    public static void kotlinTest2() {
        long startTime = System.currentTimeMillis();
        System.out.println(KotlinExampleKt.countDamage2("C:\\Users\\francisco.millone\\Downloads\\Crimes_-_2001_to_present.csv"));
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime) + "ms");
    }

    public static void groovyTest() {
        long startTime = System.currentTimeMillis();
        System.out.println(new GroovyExample().countDamage("C:\\Users\\francisco.millone\\Downloads\\Crimes_-_2001_to_present.csv"));
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime) + "ms");
    }

    public static void groovyTest2() {
        long startTime = System.currentTimeMillis();
        System.out.println(new GroovyExample().countDamage2("C:\\Users\\francisco.millone\\Downloads\\Crimes_-_2001_to_present.csv"));
        long endTime = System.currentTimeMillis();
        System.out.println("Total execution time: " + (endTime - startTime) + "ms");
    }
}
