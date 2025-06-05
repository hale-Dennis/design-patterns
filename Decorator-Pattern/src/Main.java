public class Main {
    public static void main(String[] args) {
        Coffee basic = new SimpleCoffee();
        System.out.println(basic.getDescription() + " $" + basic.getCost());

        Coffee milkCoffee = new MilkDecorator(basic);
        System.out.println(milkCoffee.getDescription() + " $" + milkCoffee.getCost());

        Coffee milkSugarCoffee = new SugarDecorator(milkCoffee);
        System.out.println(milkSugarCoffee.getDescription() + " $" + milkSugarCoffee.getCost());

        // Coffee coffeeWithMilkAndSugar = new WithSugar(new WithMilk(basic));
        // System.out.println(coffeeWithMilkAndSugar.getDescription() + " $" + coffeeWithMilkAndSugar.getCost());
    }
}
