public class BoomShakalaka {
    public static void main(String[] args) {
        PlzGodsNo rlyPlzGodsNo0 = new PlzGodsNo("Meow",1488);
        PlzGodsNo rlyPlzGodsNo1 = new PlzGodsNo("Lol",1488);
        PlzGodsNo rlyPlzGodsNo2 = new PlzGodsNo("Hell yeah", 666);
        PlzGodsNo rlyPlzGodsNo3 = new PlzGodsNo("Lol",1488);
        PlzGodsNo rlyPlzGodsNo4 = rlyPlzGodsNo3;

        System.out.println(rlyPlzGodsNo0.hashCode());
        System.out.println(rlyPlzGodsNo1.hashCode());
        System.out.println(rlyPlzGodsNo2.hashCode());
        System.out.println(rlyPlzGodsNo3.hashCode());
        System.out.println(rlyPlzGodsNo4.hashCode());
        System.out.println(rlyPlzGodsNo4.equals(rlyPlzGodsNo1));
        System.out.println(rlyPlzGodsNo4.equals(rlyPlzGodsNo0));
    }
}
