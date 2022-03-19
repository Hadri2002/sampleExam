import java.util.ArrayList;

public class Recipes {

    public ArrayList<String[]> recipes = new ArrayList<>();

    public void add (String name, String description) {
        String[] recipe = new String[2];
        recipe[0] = name;
        recipe[1] = description;

        recipes.add(recipe);
    }

    public void delete (String name) {
        for(int i = 0; i < recipes.size(); i++) {
            if(recipes.get(i)[0].equals(name)) recipes.remove(i);
        }
    }

    public ArrayList<String[]> getItems () {
        ArrayList<String[]> result = new ArrayList<>();

        for(int i = 0; i < recipes.size(); i++) {
            String[] temp = new String[2];
            temp[0] = recipes.get(i)[0];
            temp[1] = recipes.get(i)[1];
            result.add(temp);
        }

        return result;
    }


}
