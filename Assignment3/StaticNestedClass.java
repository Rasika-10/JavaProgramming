//static nested class 

class StaticNestedClass
{
       public static void main(String[] args) 
        {
               Map.Entry e = new Map.Entry("Language", "Java"); 
               e.display();
               System.out.println("Key = " + e.getKey()); 
               System.out.println("Value = " + e.getValue());
        }
}

class Map {
                   // we can access only the static context inside the static class
                   //if we use String key="1" to access inside the static class it shows an error
        
           static String key="1"; 

           static class Entry 
           {
                  // private String key; 
                     private String value;
                  public Entry(String key, String value)
                  {
                     //this.key = key;
                       this.value = value;
                  }
                  public String getKey()
                  { 
                       return key;
                  }
                  public String getValue() 
                  { 
                      return value;
                  }
 
                  public void display() {
                        System.out.println("Key: " + key + ", Value: " + value);
                  }
           }
}
