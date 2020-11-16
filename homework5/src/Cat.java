public class Cat extends Animal{
@Override
    void run(int length) {
    if ( length < 200) {
        System.out.println("Кот пробежал" + length "м");
    }

}
@Override
void swim (int length) {
        System.out.println("Кот не умеет плавать");
}
@Override
    void jump (int high) {
    if (high < 2) {
        System.out.println("Кот прыгнул на" + high + "м");
    }
}
}
