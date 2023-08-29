
public class Animal {
	private String name;

	
		
		public Animal(String name) {
			
			setName(name);
			
		}
			
			public void setName(String name) {
				this.name = name;
				
			
			}
			public String getName() {
				return name;
			}
			
			
			
			public String toString() {
				String str = String.format("%s", getName());
				return str;
			}
		}



	

	

