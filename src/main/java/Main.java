public class Main {
    public static void main(String[] args) {
        VendingMachine vm = new VendingMachine();
        vm.addProduct(new Product("Apple", 30));
        vm.addProduct(new Product("Pine", 43));
        vm.addProduct(new Drink("Nesty", 65, 0.5, TypesOfDrinks.COLDTEA));
        vm.addProduct(new Chocolate("AlpineGold", 59, 50));

        System.out.println(vm);

    }
}