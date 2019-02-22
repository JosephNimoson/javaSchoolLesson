public class MessagePost extends Post {

    private Post post;
    private String message;



    public MessagePost( String message){
        this.message = message;
        }

        public String getMessage(){
        return message;
        }

    @Override
    public void doSomeThing() {
        super.doSomeThing();
        System.out.println("Do something i message klassen");
    }
}
