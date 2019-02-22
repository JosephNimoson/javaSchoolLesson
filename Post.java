public class Post implements PFeatures {

    private String username;
    private int likes;

    public Post(){

    }

    public Post(String username){
        this.likes = 0;
        this.username = username;

    }

    @Override
    public void share() {
        System.out.println("The post has been shared!");
    }


    public void like(){
        if(likes==0) {
            System.out.println("Du har fått din første like! ");
            likes++;
        } else {
            System.out.println("\nEn person til har likt posten din* \n");
            likes++;
        }
    }

    public void disLike(){

        System.out.println("\nEn person har fjernet sin like fra posten din*");
        likes--;
    }

    public void getLikes(){
        if(likes == 1) System.out.println("Du har én like på posten din \n");
        else {
            System.out.println("Du har totalt " + likes + " likes på posten din \n");
        }
    }

    public String getUsername(){
        System.out.println(username);
        return username;
    }

    public void doSomeThing(){
        System.out.println("Gjør noe ");
    }





}
