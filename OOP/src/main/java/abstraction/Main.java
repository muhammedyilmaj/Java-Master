package abstraction;

public class Main {


    public static void main(String[] args) {
        VizjaUniversity vizjaUniversity= new VizjaUniversity();

        LazarskiUniveristy lazarskiUniveristy=new LazarskiUniveristy();

        Student bahri= new MasterStudent(121,"Bahri", "50744903455");
        Student musab= new MasterStudent(343,"Musab","5152525252");
        Student muhammed= new MasterStudent(654,"muhammed","62565243");
        Student serdar= new BachelorStudent(454,"serdar","5152000002");
        Student hasan= new BachelorStudent(867,"Hasan","51523453452");
        Student gok= new BachelorStudent(867,"Gok","45645645645");

        vizjaUniversity.registerStudent(bahri);
        vizjaUniversity.registerStudent(musab);
        vizjaUniversity.registerStudent(muhammed);

        lazarskiUniveristy.registerStudent(serdar);
        lazarskiUniveristy.registerStudent(hasan);
        lazarskiUniveristy.registerStudent(gok);

        vizjaUniversity.cancelAgreement(121);
        vizjaUniversity.cancelAgreement(343);
        vizjaUniversity.cancelAgreement(654);
        vizjaUniversity.cancelAgreement(454);

        lazarskiUniveristy.cancelAgreement(867);
        lazarskiUniveristy.cancelAgreement(343);
        lazarskiUniveristy.cancelAgreement(454);

        vizjaUniversity.freezeStudentMemberShip(121);

        gok.applyForUniversity(vizjaUniversity);






    }
}
