//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Factory fabrika1=
                new ServerFactory("16GB","13. Nesil");
        Computer sunucu = fabrika1.createComputer();
        System.out.println(sunucu.getRam()+" "+sunucu.getCpu());
    }


}