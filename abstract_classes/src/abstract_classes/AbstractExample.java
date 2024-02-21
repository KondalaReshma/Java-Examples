package abstract_classes;
abstract class   AbstractRecipie {
	
	public void  execute() {
		getready();
		prepare();
		cleanup();
		
	}
	abstract void  getready();
	abstract void prepare();
	abstract void cleanup();
	

}
