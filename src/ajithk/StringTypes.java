package ajithk;

public class StringTypes {
    public static void main(String[] args) {

        String ajay ="kabil gokuk";
        String kabil ="gokul arun";
        String gokul ="gobi";
        System.out.println(ajay.length());//count letters

        String aajay ="     kabil  gokul     ";
        String kaabil ="gokul arun";
        String gokull ="gobi";
        System.out.println(aajay.trim());//letters space

        String akjay =" gobi bro ";
        String kaabill ="gokularun";
        String gokulll ="kabil";
        System.out.println(akjay.concat(gokulll));//concat = two value connect panrathu

        String a ="arasu";
        String b ="arun";
        String c ="ajay";
        System.out.println(a.charAt(2));//name ohda number print pannum


        String d ="kabilgokuk";
        String e ="gokul arun";
        String f ="gobi";
        System.out.println(e.contains("go"));//true or falls

        String g ="kabilgokuk";
        String h="gokul arun";
        String i ="gobi";
        System.out.println(i.equals(i));//equal iruntha true ilana falls


        String j ="kabil gokuk";
        String k ="gokul arun";
        String l ="gobi";
        System.out.println(j.replace("kabil", "ajay"));//kabil name ajay name change panarthu


        String m ="kabilgokuk";
        String n ="gokul arun";
        String o ="gobi";
        System.out.println(n.toUpperCase());//capalattr print aagum

        String  p="kabilgokuk";
        String  q="gokul arun";
        String  r="GOBI";
        System.out.println(r.toLowerCase());//capitel lettar smal print aagum

        int [] ak ={


        };
    }
}
