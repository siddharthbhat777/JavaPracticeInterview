import java.util.HashMap;

public class RomanNumbers {
    public static void main(String[] args) {
        /*HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "I");
        hm.put(2, hm.get(1)+hm.get(1));
        hm.put(3, hm.get(2)+hm.get(1));
        hm.put(5, "V");
        hm.put(4, hm.get(1)+hm.get(5));
        hm.put(6, hm.get(5)+hm.get(1));
        hm.put(7, hm.get(5)+hm.get(2));
        hm.put(8, hm.get(5)+hm.get(3));
        hm.put(10, "X");
        hm.put(9, hm.get(1)+hm.get(10));
        int key;
        int unitPlace;
        String concat="";
        for (int i=1; i<=100; i++)
        {
            for (int j=0;j<=9; j++)
            {
                key = Integer.parseInt(String.valueOf(i)+String.valueOf(j));
                if (key/10==0)
                {
                    unitPlace = key/10;
                    for (int k=1; k<=unitPlace; k++)
                    {
                        hm.put(key, concat+hm.get(10));
                    }
                }
                hm.put(key, hm.get(i)+hm.get(j));
            }
        }
        System.out.println(hm.get(58));*/

        String s = "LXXXIX";// demo num "UUTSSROQDCCCXXIII" = 2759823; //MAX num 39,99,999
        //          012345
        HashMap<Character , Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        //CUSTOM
        map.put('O',1000);// _I
        map.put('P',5000); // _V
        map.put('Q',10000);// _X
        map.put('R',50000);// _L
        map.put('S',100000);// _C
        map.put('T',500000);// _D
        map.put('U',1000000);// _M
        int sum = 0; //50 60 70 80 79 89
        //0 to 5
        for(int i = 0 ; i < s.length() ; i++){ //0 1 2 3 4 5
            int s1 = map.get(s.charAt(i)); //50 10 10 10 1 10
            if(i + 1 < s.length()){ // 1<6 2<6 3<6 4<6 5<6   x6<6
                int s2 = map.get(s.charAt(i+1)); //10 10 10 1 10
                if(s1 >= s2){ //50>10 10=10 10=10 10>1
                    sum += s1;
                }
                else{//1<10
                    sum -= s1;
                }
            }
            else{
                sum += s1;
            }
        }
        System.out.println(sum);
    }
}
