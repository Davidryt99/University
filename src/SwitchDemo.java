public class SwitchDemo {
    public static void main(String[] args) {
    	int operation = 3;
    	int dencomun = 9;
    	int finalresult;
    	String finalresultstr = "";
    	for(int i = dencomun;i>1;i--) {
			int value = operation%i;
			if(value==0) {
			System.out.println("este si"+i);
			dencomun=dencomun/i;
			operation = operation/i;
			i= dencomun;
				if (dencomun == 1) {
				finalresult = operation;
				}else {
				}
			}else {
				System.out.println("error");
			}
    }
    	System.out.println(finalresultstr);
    }
}



