package ajithk;

public class Constructor {

    String hottelname;
    int price;
    int roomno;

    Constructor(int roomn,String hottelnam,int pric){
        hottelname=hottelnam;
        price =pric;
        roomno =roomn;
        System.out.println(hottelnam+" "+pric+"  "+roomn);

    }

    public static void main(String[] args)
      {
        Constructor a = new Constructor(  21 ,   "akhottel  ", 1000);
    }

    }

