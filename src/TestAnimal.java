public class TestAnimal {
    public static void main(String[] args) {
        Animal[] animal=new Animal[2];
        Animal perro = new Perro();
        animal[0]=perro;
        Animal gato=new Gato();
        animal[1]=gato;

        for (Animal i:animal){
            i.HacerSonido();
        }
    }
}