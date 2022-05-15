public class Main {
    public static void main(String[] args) {
//        Animal shark = new Shark();
//        Animal turtle = new Turtle();
//        Animal eagle = new Eagle();

        Animal[] animal = {new Shark(),new Turtle(),new Eagle()};

        for(Animal animals : animal){
            if(animals instanceof Shark){
                ((Shark) animals).attack();
                System.out.println(animals.getClass().getName());
            }
        }

    }
}