public class PhotoPost extends Post {

    private String photoName;
    private String caption;
    private Post post;

    public PhotoPost(String photoName, String caption, Post post){
        this.post = post;
        this.photoName = photoName;
        this.caption = caption;
    }

    public String getPhotoname(){
        return photoName;
    }

    public String getCaption(){
        return caption;
    }

    public Post getPost(){
        return post;
    }

    @Override
    public String getUsername() {
        return super.getUsername();
    }

    @Override
    public void doSomeThing() {
        System.out.println("Heihei");
    }
}
