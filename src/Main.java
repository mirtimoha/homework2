

public class Main {
    public static void main(String[] args) {
        task123();
        task45();
        task678();
    }

    public static void task123() {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task45() {
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

    }
    public static void task678() {
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        System.out.println(boxer1 + boxer2);
        System.out.println(boxer2 - boxer1);

        System.out.println(boxer2 - boxer1);
        System.out.println(boxer2 % boxer1);

        System.out.println("Всего работников в компании — " + (640 / 8) + " человек");
        System.out.println("Если в компании работает " + (640 / 8) + " человек, то всего " + (734/(640 / 8)) + " часов работы может быть поделено между сотрудниками");
    }
}