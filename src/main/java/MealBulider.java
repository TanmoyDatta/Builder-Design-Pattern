public class MealBulider {
   public Meal prepareVegMeal(){
      Meal meal = new Meal();
      meal.addItem(new VegBurger());
      meal.addItem(new Pepsi());
      return meal;
   }
   public Meal prepareNonVegMeal(){
      Meal meal = new Meal();
      meal.addItem(new ChickenBuger());
      meal.addItem(new Coke());
      return meal;
   }
}
