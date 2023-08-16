package javaPracPack;

public class Variables {
    public static void main(String[] args) {
        String name = "Akhil Alleni";
        System.out.println(name +" - Quality Assurance Specalist");

        String myName = "Nain";
        String myJob = "QA";
        String myName1 = myName;
        myName="Bain";
        System.out.println(myName);
        System.out.println(myName1);
        System.out.println(myJob);
        String o=args[1];
        System.out.println(o);

        final String NAME="QA Engineer";
        System.out.println(NAME);
    }
}
