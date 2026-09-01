public class Cats extends Animal {
    String catName;

    Cats(String catName){
        this.catName = catName;
    }

    void callCat(){
        System.out.println("Hey " + catName);
    }

    @Override
    public void fazerSom(){
        super.fazerSom();
        System.out.println("miau");
    }
}
