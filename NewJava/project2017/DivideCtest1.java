public void function(int n){
	if(n > 1){
		System.out.println("*");
		function(n/2);
		function(n/2);
	}
}
