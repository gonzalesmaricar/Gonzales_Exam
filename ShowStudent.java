public class ShowStudent {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Id");
        String Id = sc.next();
        System.out.println("Enter number of credits:");
        int cs = sc.nextlnt();
        System.out.println("Enter number of points:");
        int p = sc.nextlnt();
        Student s = new Student(Id, cs, p);
        System.out.println(s);    
    }
}