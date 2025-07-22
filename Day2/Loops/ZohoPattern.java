public class ZohoPattern {
	
	public static void pattern(String str){
		str = str.replace(" ", "");
		int i = 0, j;
        	do {
            	j = 0;
            		do {
                	int index = i * 4 + j;
                		if (index < str.length())
                    		System.out.print(str.charAt(index));
                		j++;
            		} while (j < 4);
            		System.out.println();
            	i++;
        	} while (i < (str.length() + 3) / 4);
    	}
	 	

	public static void main(String[] args) {
        String str = "ZOHO CORPORATIONS";
		pattern(str);

	}

}
