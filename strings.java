class HelloWorld {
    public static void main(String[] args) {
        
        String s1 = "JAVA";
        System.out.println(s1);
        
        
        int a = s1.length();
        System.out.println(a);
        
        
        System.out.println(s1.charAt(0));
        char[] destArray = new char[2];
        s1.getChars(2, 4, destArray, 0);
        System.out.println(destArray);
        
        
        String s2 = "eooooe";
        int c = s1.compareTo(s2);
        System.out.println(c);
        
        
        String myStr = "Hello planet earth, you are a great planet";
        System.out.println(myStr.indexOf("planet"));
        System.out.println(myStr.lastIndexOf("planet"));
        
        
        String s="SachinTendulkar";    
        System.out.println("Original String: " + s);  
        System.out.println("Substring starting from index 6: " +s.substring(6));//Tendulkar    
        System.out.println("Substring starting from index 0 to 6: "+s.substring(0,6)); //Sachin 
        
        
        s1 = "JAVA";
        s2 = "Programming";
        System.out.println(s1);
        System.out.println(s2);
        String s3 = s1.concat( s2 );
        System.out.println();
        System.out.println(s3);
        
        myStr = "Hello Java       ";
        System.out.println(myStr.replace('l', 'p'));
        
        System.out.println(myStr.toUpperCase());
        System.out.println(myStr.toLowerCase());
        System.out.println(myStr.trim());
        System.out.println(myStr.toCharArray());
        
        
        int value=30;  
        s1=String.valueOf(value);  
        System.out.println(s1+10);//concatenating string with 10  
        
        
        
        StringBuffer sb = new StringBuffer("Hello ");
        sb.append("Java"); // now original string is changed
        System.out.println(sb);


        sb = new StringBuffer("Hello ");
        sb.insert(1, "Java");
        // Now original string is changed
        System.out.println(sb);
        
        
        sb=new StringBuffer("Hello"); 
        sb.replace(1,3,"Java"); 
        System.out.println(sb);
        
        sb=new StringBuffer("Hello"); 
        sb.delete(1,3); 
        System.out.println(sb);
        
        
        sb = new StringBuffer("Hello");
        sb.reverse();
        System.out.println(sb);
        
        
        sb = new StringBuffer("");
        System.out.println(sb.capacity()); // default 16
        sb.append("Hello");
        System.out.println(sb.capacity()); // now 16
        sb.append("java is my favourite language");
        System.out.println(sb.capacity());
        
        
        sb=new StringBuffer("Hello");
        System.out.println(sb.length());
        
        System.out.println(sb.charAt(0));
        
        StringBuilder str = new StringBuilder("Java");
        System.out.println("String = " + str.toString());
        str.setCharAt(1, 'T');
        System.out.println("After setCharAt() String = "
                           + str.toString());
        
        
        
        
        sb = new StringBuffer("AAAA program");  
        System.out.println("string: "+sb);  
        char[] dst = new char[] {'s','t','r','i','n','g','b','u','f','f','e','r'};  
        System.out.println("initial char array:");  
        System.out.println(dst);  
        //try to coping starts from 5 to 13 and past it from 2  
        sb.getChars(2,5,dst, 2);  
        System.out.println("resultant char array:");  
        System.out.println(dst);  
        
        
        
        
        
        
        
    }
}
