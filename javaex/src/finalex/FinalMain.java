package finalex;

public class FinalMain {

    public static void main(String[] args) {
        FinalMemberClass fmc = new FinalMemberClass("내일배우는캠프", 128);
        fmc.setName("새로운 이름");
        System.out.println(fmc.getName());
    }
}
