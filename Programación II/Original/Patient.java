import java.util.ArrayList;
import java.util.Arrays;


public class Patient {
    private String name;
    private String lastName;

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

    private String[] disorders = null;


    private boolean isHealthy = true;

    public boolean getIsHealthy(){
        return isHealthy;
    }

    public boolean addDisorder(int code){
        if(hasDisorder(code)){
            return false;
        }
        ArrayList<String> disorders_list;

        if(disorders == null){
            disorders_list = new ArrayList<String>();
        }
        else{
            disorders_list = new ArrayList<String>(Arrays.asList(disorders));
        }

        short[] conditions = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, -32768};
            short length = (short) (conditions.length);
            for(short i = 0; i < length; i++){
            switch(conditions[i] & code){
                case 1: disorders_list.add("Alcoholism"); break;
                case 2: disorders_list.add("Anorexia"); break;
                case 4: disorders_list.add("Antisocial"); break;
                case 8: disorders_list.add("Anxiety"); break;
                case 16: disorders_list.add("Bipolar"); break;
                case 32: disorders_list.add("Bulimia"); break;
                case 64: disorders_list.add("Dependent"); break;
                case 128: disorders_list.add("Depression"); break;
                case 256: disorders_list.add("Kleptomaniac"); break;
                case 512: disorders_list.add("Nicotine addiction"); break;
                case 1024: disorders_list.add("Obssesive-Compulsive"); break;
                case 2048: disorders_list.add("Panic"); break;
                case 4096: disorders_list.add("Paranoid"); break;
                case 8192: disorders_list.add("Post-traumatic stress"); break;
                case 16384: disorders_list.add("Programmer"); break;
                case -32768: disorders_list.add("Tester"); break; 
            }
        }

        disorders = disorders_list.toArray(new String[disorders_list.size()]);
        isHealthy = false;
        return true;
    }

    public boolean hasDisorder(int code){

        if(disorders == null)
            return false;
    
        String[] comparison = new String[disorders.length];
        short[] conditions = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, -32768};
        short length = (short) (conditions.length);
        int k = 0;
        for(short i = 0; i < length; i++){
            
            switch(conditions[i] & code){
                case 1: comparison[k] = "Alcoholism"; k++; break;
                case 2: comparison[k] = "Anorexia"; k++; break;
                case 4: comparison[k] = "Antisocial"; k++; break;
                case 8: comparison[k] = "Anxiety"; k++; break;
                case 16: comparison[k] = "Bipolar"; k++; break;
                case 32: comparison[k] = "Bulimia"; k++; break;
                case 64: comparison[k] = "Dependent"; k++; break;
                case 128: comparison[k] = "Depression"; k++; break;
                case 256: comparison[k] = "Kleptomaniac"; k++; break;
                case 512: comparison[k] = "Nicotine addiction"; k++; break;
                case 1024: comparison[k] = "Obssesive-Compulsive"; k++; break;
                case 2048: comparison[k] = "Panic"; k++; break;
                case 4096: comparison[k] = "Paranoid"; k++; break;
                case 8192: comparison[k] = "Post-traumatic stress"; k++; break;
                case 16384: comparison[k] = "Programmer"; k++; break;
                case -32768: comparison[k] = "Tester"; k++; break; 
            }
        
        }

        for(int i = 0; i < comparison.length; i++){
            for(int j = 0; j < disorders.length; j++){
                if(comparison[i]==disorders[j]){
                    return true;
                }
            }
        }
        return false;

    }

    public String toString(){

        String str = String.format("%s %s has ",name, lastName);

        if(disorders == null){
            return str+"no disorders.";
        }

        for(int i = 0; i < disorders.length; i++){
            if(i == disorders.length - 1){
                str+=String.format("%s.", disorders[i]);
            }else{
                str+=String.format("%s, ", disorders[i]);
            }
        }
        return str;
    }

}