import java.util.
public class ex2 {

    public static void main(String[] args){
        HashSet<ArrayList> set = new HashSet<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        set.add(list1);
        System.out.println(set.size());
    }
}
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Numar studenti=");
        int nr = myobj.nextInt();
        ArrayList<student> sir = new ArrayList<>();
        for(int i=0; i< nr; i++){
            student elev = new student();
            System.out.println("Student " + (i+1)+":");
            String nume = myobj.next();
            elev.setNumel(nume);
            sir.add(elev);
        }
        System.out.println("Studentii sunt:");
        for (int i=0;i<sir.size();i++){
            student elev = sir.get(i);
            System.out.println(elev.nume);
        }

