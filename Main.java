public class Main {
    public static void main(String[] args) {

        //Test
        
        Post post1 = new Post("JosephNimoson");
        PhotoPost karl = new PhotoPost("Oslo","Fint vær", new Post("Karl95"));

        System.out.println("Navn: " + post1.getUsername());
        System.out.println("Navn: " +karl.getPost().getUsername());
        karl.like();
        karl.like();
        karl.like();
        karl.getLikes();
        karl.getPost().getUsername();
        System.out.println("");
        MessagePost mg = new MessagePost("Melding....");
        mg.doSomeThing();















    }
}
