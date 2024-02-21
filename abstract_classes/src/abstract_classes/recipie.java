package abstract_classes;
public class recipie extends AbstractRecipie{
	
	void getready() {
		System.out.println("incredients are ready");
		
	}
	void prepare() {
		System.out.println("preparing dish");
		
	}
    void cleanup() {
    	System.out.println("cleaning is also done");
    }
}
