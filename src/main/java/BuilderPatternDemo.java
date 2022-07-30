public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBulider mealBulider = new MealBulider();
        Meal vegMeal = mealBulider.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total cost :"+vegMeal.getCost());

        Meal NonVegMeal = mealBulider.prepareNonVegMeal();
        System.out.println("Non veg Meal");
        NonVegMeal.showItems();
        System.out.println("Total cost :"+NonVegMeal.getCost());
    }
}
