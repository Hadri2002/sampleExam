public class UpdateRecipes extends Recipes {

    public void update (String name, String description) {
        for(int i = 0; i < recipes.size(); i++) {
            if(recipes.get(i)[0].equals(name)) {
                String[] temp = new String[2];
                temp[0] = name;
                temp[1] = description;
                recipes.set(i, temp);
            }
        }

    }
}
