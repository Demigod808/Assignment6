import java.util.ArrayList;

public class WildCardTester {
	
	public static  void addCat(ArrayList <? super RedCat> list, String name) {
		
		list.add(new RedCat (name));
		System.out.printf("Cat Added named %s was added \n" , name);
	}
	public static void deleteCat(ArrayList <? extends Cat> list, String name) {
	for (int a =0; a< list.size(); a++) {
		if (name.equals(list.get(a).getName()))
{
	list.remove(list.get(a));
	{
		System.out.printf("\nRemoved cat named %s.\n",name);
	}
}
	}
	
	
	}
	public static void printAll(ArrayList <?> list) {
	
	for (int a=0; a<list.size(); a++)
	{
		System.out.printf("%s\n", list.get(a));
	}
	
	}

	public static void main (String []args) {
		
		ArrayList<RedCat> redcatlist = new ArrayList<>();

		ArrayList<Animal> animallist = new ArrayList<>();
		
		
		addCat(animallist, "Tiger");
		
		addCat(redcatlist, "Tom");
		addCat(redcatlist, "Siamese");
		addCat(redcatlist, "Tiger");
		
		
		
		System.out.printf("\n The list of animals \n", animallist);
		printAll(animallist);
		
		
		System.out.printf("\n The list of red cats \n", redcatlist);
		printAll(redcatlist);
		
		
		deleteCat(redcatlist, redcatlist.get(0).getName() );
		
		System.out.printf("The list of red cats after deletion is \n");
		
		printAll(redcatlist);
		
		
		
		
		
		
		
		
		
		
		
	}
}
