import java.util.ArrayList;


public class Patient {
    private String name;
    private String lastName;


    public Patient(){
        super();
    }
    
    public Patient(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    public String getFullName(){
        return name + " " + lastName;
    }

    public String getName(){
        return name;
    }
    public String getLastName(){
        return lastName;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String[] All(){

        ArrayList <String> allElements = new ArrayList<String>();
        int[] conditions = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768};
        int length = conditions.length;
        for(int i = 0; i < length; i++){
            
            switch(conditions[i] & disordersID){
                case 1: allElements.add("Alcoholism"); break;
                case 2: allElements.add("Anorexia");  break;
                case 4: allElements.add("Antisocial"); break;
                case 8: allElements.add("Anxiety"); break;
                case 16: allElements.add("Bipolar"); break;
                case 32: allElements.add("Bulimia"); break;
                case 64: allElements.add("Dependent"); break;
                case 128: allElements.add("Depression"); break;
                case 256: allElements.add("Kleptomaniac"); break;
                case 512: allElements.add("Nicotine addiction"); break;
                case 1024: allElements.add("Obssesive-Compulsive"); break;
                case 2048: allElements.add("Panic"); break;
                case 4096: allElements.add("Paranoid"); break;
                case 8192: allElements.add("Post-traumatic stress"); break;
                case 16384: allElements.add("Programmer"); break;
                case 32768: allElements.add("Tester"); break; 
            }
        
        }

        String[] disorders = allElements.toArray(new String[allElements.size()]);

        return disorders;
    };

    private int disordersID = 0;


    private boolean isHealthy = true;

    public boolean getIsHealthy(){
        return isHealthy;
    }

    public boolean addDisorder(int code){

        int[] conditions = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768};
        int length = conditions.length;
        for(int i = 0; i < length; i++){
            switch(conditions[i] & code){
                case 1: disordersID+=!hasDisorder(code)?1:0;break;
                case 2: disordersID+=!hasDisorder(code)?2:0;break;
                case 4: disordersID+=!hasDisorder(code)?4:0;break;
                case 8: disordersID+=!hasDisorder(code)?8:0;break;
                case 16: disordersID+=!hasDisorder(code)?16:0;break;
                case 32: disordersID+=!hasDisorder(code)?32:0;break;
                case 64: disordersID+=!hasDisorder(code)?64:0;break;
                case 128: disordersID+=!hasDisorder(code)?128:0;break;
                case 256: disordersID+=!hasDisorder(code)?256:0;break;
                case 512: disordersID+=!hasDisorder(code)?512:0;break;
                case 1024: disordersID+=!hasDisorder(code)?1024:0;break;
                case 2048: disordersID+=!hasDisorder(code)?2048:0;break;
                case 4096: disordersID+=!hasDisorder(code)?4096:0;break;
                case 8192: disordersID+=!hasDisorder(code)?8192:0;break;
                case 16384: disordersID+=!hasDisorder(code)?16384:0;break;
                case 32768: disordersID+=!hasDisorder(code)?32768:0;break;
            }
        }

        if(disordersID == 0)
            return false;

        isHealthy = false;
        return true;
    }

    public boolean hasDisorder(int code){

        if(disordersID == 0)
            return false;
    
        if((disordersID & code) == code){
            return true;
        }
            
        
        return false;

    }



    public String toString(){

        String str = String.format("%s %s has ",name, lastName);



        if(disordersID == 0){
            return str+"no disorders.";
        }

        String[] arr = All();

        for(int i = 0; i < arr.length; i++){
            if(arr[i]==null){
                continue;
            }
            if(i == arr.length - 1){
                str+=String.format("%s.", arr[i]);
            }else{
                str+=String.format("%s, ", arr[i]);
            }
        }
        return str;
    }

}